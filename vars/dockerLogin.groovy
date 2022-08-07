#!/usr/bin/env groovy
import Docker

def call() {
    return new Docker(this).dockerLogin()
}