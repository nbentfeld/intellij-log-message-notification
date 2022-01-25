package com.github.nbentfeld.intellijlogmessagenotification.services

import com.intellij.openapi.project.Project
import com.github.nbentfeld.intellijlogmessagenotification.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
