package com.baibei.btrace;

import static com.sun.btrace.BTraceUtils.println;

import com.sun.btrace.BTraceUtils.Sys;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnTimer;
@BTrace
public class Memory {
    @OnTimer(4000)
    public static void printMem() {
        println("Heap:");
        println(Sys.Memory.heapUsage());
        println("Non-Heap:");
        println(Sys.Memory.nonHeapUsage());
    }
}
