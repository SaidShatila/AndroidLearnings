package android.learnings.core.coroutines

import kotlinx.coroutines.delay

object LearningCoroutines {
     suspend fun longDelay(){
        delay(3000)
    }
}