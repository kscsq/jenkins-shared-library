#!/usr/bin/env groovy
import main.com.example.Docker

def call(String imageName) {
    return new Docker(this).buildDockerImage(imageName)
}