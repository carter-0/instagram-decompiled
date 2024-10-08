package com.facebook.realtime.clientsync;

import X.0dV;
import X.AnonymousClass00P;
import X.C9551Rco;

public abstract class DelegatingEventHandler {
    public static final C9551Rco Companion = new Object();

    private final void onEntityUpdatePayloadReceived(String str, String str2, int i) {
        throw AnonymousClass00P.createAndThrow();
    }

    private final void onError(int i) {
        throw AnonymousClass00P.createAndThrow();
    }

    private final void onPresenceUpdatePayloadReceived(String str, int i) {
        throw AnonymousClass00P.createAndThrow();
    }

    private final void onPresenceUpdatePayloadReceived(String str, int i, String str2) {
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Rco, java.lang.Object] */
    static {
        0dV.A0C("realtime-client-sync-jni");
    }

    private final void onConnectionStatusChange(int i) {
        throw AnonymousClass00P.createAndThrow();
    }

    private final void onEntityUpdatePayloadReceived(String str, String str2, int i, String str3) {
        throw AnonymousClass00P.createAndThrow();
    }

    private final void onError(int i, String str) {
        throw AnonymousClass00P.createAndThrow();
    }

    private final void onSave(Object obj, String str) {
        throw AnonymousClass00P.createAndThrow();
    }
}
