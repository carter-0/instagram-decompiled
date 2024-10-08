package com.instagram.common.cache.base;

import X.0dV;
import X.0qQ;
import X.C20611Wvs;
import X.C69819Nsg;
import com.facebook.jni.HybridData;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CacheKeyGenerator {
    public static final C69819Nsg Companion = new Object();
    public final HybridData mHybridData;
    public final UserSession userSession;

    public /* synthetic */ CacheKeyGenerator(UserSession userSession2, DefaultConstructorMarker defaultConstructorMarker) {
        this(userSession2);
    }

    public static final CacheKeyGenerator getInstance(UserSession userSession2) {
        0qQ.A0B(userSession2, 0);
        return (CacheKeyGenerator) userSession2.A01(CacheKeyGenerator.class, new C20611Wvs(userSession2, 24));
    }

    private final native HybridData initHybrid();

    public final native void enableLogging();

    public final native String generateKey(String str, String str2);

    public final native void initializeKeyGenerator(String str);

    public final native boolean isInitialized();

    public final UserSession getUserSession() {
        return this.userSession;
    }

    public CacheKeyGenerator(UserSession userSession2) {
        this.userSession = userSession2;
        0dV.A0C("cache_key_generator_jni");
        this.mHybridData = initHybrid();
    }
}
