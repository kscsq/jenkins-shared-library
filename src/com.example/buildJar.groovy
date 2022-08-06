#!/usr/bin/env groovy
package com.example

def call() {
    echo "building the application for branch $BRANCH_NAME"
    sh 'mvn package'
}