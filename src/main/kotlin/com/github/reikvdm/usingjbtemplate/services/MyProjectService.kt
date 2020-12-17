package com.github.reikvdm.usingjbtemplate.services

import com.intellij.openapi.project.Project
import com.github.reikvdm.usingjbtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
