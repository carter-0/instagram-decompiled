package com.facebook.simplejni.fataljavaexceptiondescriptionhandler.breakpad;

import X.0dV;
import X.C300405x8;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BreakpadFatalJavaExceptionDescriptionHandler {
    public static final Companion Companion = new Object();

    public final class Companion {
        public final void registerBreakpadFatalJavaExceptionDescriptionHandler() {
            BreakpadFatalJavaExceptionDescriptionHandler.registerBreakpadFatalJavaExceptionDescriptionHandler();
        }

        public final Runnable breakpadHandlerRegistrationRunnable() {
            return C300405x8.A00;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final native void registerBreakpadFatalJavaExceptionDescriptionHandler();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.facebook.simplejni.fataljavaexceptiondescriptionhandler.breakpad.BreakpadFatalJavaExceptionDescriptionHandler$Companion] */
    static {
        0dV.A0C("breakpad-fatal-java-exception-description-handler-jni");
    }

    public static final Runnable breakpadHandlerRegistrationRunnable() {
        return C300405x8.A00;
    }
}
