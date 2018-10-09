package controllers

import play.api.mvc.Action
import play.api.mvc.Controller

object upload extends Controller {
  def upload = Action(parse.multipartFormData) { request =>
    request.body.file("receptorFile").map { receptorFile =>
      import java.io.File
      val filename = receptorFile.filename.toString()
      val contentType = receptorFile.contentType
      var extension = ""

      val i = filename.lastIndexOf('.')
      if (i >= 0) {
        extension = filename.substring(i + 1)
      }
      if (extension == "pdbqt") {
        receptorFile.ref.moveTo(new File(s"/home/laeeq/Desktop/Backup/Project5/uploadFile/temp/$filename"))
        Ok("File " + filename + " successfully uploaded."  + " Please go back and continue with target profiles or close the window.")
      } else {
        BadRequest("Wrong Format. PTPAAS only supports .pdbqt")
      }
    }.getOrElse {
      BadRequest("No File Selected.")
    }
  }

}

