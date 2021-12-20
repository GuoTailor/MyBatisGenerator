package com.github.guotailor.mybatisgenerator.services

import com.intellij.openapi.project.Project
import com.github.guotailor.mybatisgenerator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
