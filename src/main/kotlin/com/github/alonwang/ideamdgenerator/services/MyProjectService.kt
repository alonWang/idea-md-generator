package com.github.alonwang.ideamdgenerator.services

import com.intellij.openapi.project.Project
import com.github.alonwang.ideamdgenerator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
