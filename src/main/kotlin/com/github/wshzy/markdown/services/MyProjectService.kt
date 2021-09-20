package com.github.wshzy.markdown.services

import com.intellij.openapi.project.Project
import com.github.wshzy.markdown.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
