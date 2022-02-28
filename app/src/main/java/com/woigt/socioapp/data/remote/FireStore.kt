package com.woigt.socioapp.data.remote

import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.google.firebase.firestore.FirebaseFirestore
import com.woigt.socioapp.data.entity.local.Podcast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class FireStore {

    private val firestore: FirebaseFirestore by lazy {
        FirebaseFirestore.getInstance()
    }

    suspend fun createRecyclerOptions(collectionPath: String): Flow<APIState<FirestoreRecyclerOptions<Podcast>>> {
        return flow {
            try {
                val query = firestore.collection(collectionPath)
                val options =
                    FirestoreRecyclerOptions.Builder<Podcast>()
                        .setQuery(query, Podcast::class.java)
                        .build()
                emit(APIState.Success(options))
            } catch (e: Exception) {
                emit(APIState.Error(e))
            }
        }.flowOn(Dispatchers.IO)
    }
}
