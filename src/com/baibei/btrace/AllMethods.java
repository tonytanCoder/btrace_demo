package com.baibei.btrace;
import static com.sun.btrace.BTraceUtils.print;
import static com.sun.btrace.BTraceUtils.println;

import com.sun.btrace.BTraceUtils.Strings;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.ProbeClassName;
import com.sun.btrace.annotations.ProbeMethodName;

@BTrace  public class AllMethods {
    @OnMethod(
            clazz="/javax\\.swing\\..*/",
            method="/.*/"
        )
        public static void m(@ProbeClassName String probeClass, @ProbeMethodName String probeMethod) {
            print(Strings.strcat("entered ", probeClass));
            println(Strings.strcat(".", probeMethod));
        }
}
