package com.github.zy19880309.zytemplate.services

import com.github.zy19880309.zytemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
