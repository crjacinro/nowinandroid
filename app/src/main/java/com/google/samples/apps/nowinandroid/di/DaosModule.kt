/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.nowinandroid.di

import com.google.samples.apps.nowinandroid.data.local.NiADatabase
import com.google.samples.apps.nowinandroid.data.local.dao.AuthorDao
import com.google.samples.apps.nowinandroid.data.local.dao.EpisodeDao
import com.google.samples.apps.nowinandroid.data.local.dao.NewsResourceDao
import com.google.samples.apps.nowinandroid.data.local.dao.TopicDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DaosModule {
    companion object {
        @Provides
        fun providesAuthorDao(
            database: NiADatabase,
        ): AuthorDao = database.authorDao()

        @Provides
        fun providesTopicsDao(
            database: NiADatabase,
        ): TopicDao = database.topicDao()

        @Provides
        fun providesEpisodeDao(
            database: NiADatabase,
        ): EpisodeDao = database.episodeDao()

        @Provides
        fun providesNewsResourceDao(
            database: NiADatabase,
        ): NewsResourceDao = database.newsResourceDao()
    }
}