package org.mibe.tribute.trickster.problem

interface ProblemService {
    fun get(): ProblemTask
    fun randomProblem(): ProblemTask
}