package com.github.reimia.myideaplugin.services

import com.intellij.openapi.project.Project
import com.github.reimia.myideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
