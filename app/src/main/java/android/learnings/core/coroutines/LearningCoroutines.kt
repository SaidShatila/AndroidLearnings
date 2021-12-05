package android.learnings.core.coroutines

import androidx.annotation.MainThread
import kotlinx.coroutines.*

object LearningCoroutines {
    val myScope = CoroutineScope(Dispatchers.Main)
     suspend fun longDelay(){
         withContext(Dispatchers.IO){
             delay(3000)
         }
         myScope.launch {

         }
    }
    suspend fun myOwnFun() = withContext(Dispatchers.IO){

    }
}