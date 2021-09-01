package com.example.hilt_simple.data

import com.example.hilt_simple.data.models.Commit
import com.example.hilt_simple.network.GithubService
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject
import javax.inject.Singleton

//@ViewModelScoped - will give every VM a different instance
//@Singleton - will provide the same instance everywhere
class MainRepository @Inject constructor(
    private val githubService: GithubService
) {

    suspend fun listCommits(username: String, repoName: String): List<Commit> {
        return githubService.listCommits(username, repoName)
    }

}