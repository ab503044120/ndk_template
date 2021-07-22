package com.github.ab503044120.ndktemplate.services

import com.github.ab503044120.ndktemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
