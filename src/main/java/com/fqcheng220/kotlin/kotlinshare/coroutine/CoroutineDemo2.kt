package com.fqcheng220.kotlin.kotlinshare.coroutine

import com.fqcheng220.kotlin.kotlinshare.utils.Logger
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CoroutineDemo2 {
    companion object {
        val TAG: String = "CoroutineDemo"

        fun testMainScope() {
            Logger.d(TAG, "test before")
            /*
            使用MainScope会报错，提示需要加kotlinx-coroutines-android依赖
            Exception in thread "main" java.lang.IllegalStateException: Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android'
	at kotlinx.coroutines.internal.MissingMainCoroutineDispatcher.missing(MainDispatchers.kt:90)
	at kotlinx.coroutines.internal.MissingMainCoroutineDispatcher.isDispatchNeeded(MainDispatchers.kt:71)
	at kotlinx.coroutines.DispatchedKt.resumeCancellable(Dispatched.kt:420)
	at kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable(Cancellable.kt:26)
	at kotlinx.coroutines.CoroutineStart.invoke(CoroutineStart.kt:109)
	at kotlinx.coroutines.AbstractCoroutine.start(AbstractCoroutine.kt:154)
	at kotlinx.coroutines.BuildersKt__Builders_commonKt.launch(Builders.common.kt:54)
	at kotlinx.coroutines.BuildersKt.launch(Unknown Source)
	at kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(Builders.common.kt:47)
	at kotlinx.coroutines.BuildersKt.launch$default(Unknown Source)
	at com.fqcheng220.kotlin.kotlinshare.coroutine.CoroutineDemo$Companion.test(CoroutineDemo.kt:13)
	at com.fqcheng220.kotlin.kotlinshare.MainKt.main(Main.kt:4)
             */
            MainScope().launch {
                Logger.d(TAG, "test delay before")
                delay(1000 * 10)
                Logger.d(TAG, "test delay after")
            }
            Logger.d(TAG, "test after")
        }
    }
}