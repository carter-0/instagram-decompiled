package com.shopify.checkout.models;

import X.0eO;
import X.0oU;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.C20674Wx6;
import X.C255463uA;
import kotlinx.serialization.Serializable;

@Serializable(with = AuthenticationVersionSerializer.class)
public enum AuthenticationVersion {
    V1("v1"),
    V2("v2");
    
    public static final AnonymousClass0eM A01 = null;
    public static final Companion Companion = null;
    public final String A00;

    public final class Companion {
        public final C255463uA serializer() {
            return (C255463uA) AuthenticationVersion.A01.getValue();
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.shopify.checkout.models.AuthenticationVersion$Companion] */
    /* access modifiers changed from: public */
    static {
        AuthenticationVersion[] authenticationVersionArr;
        A02 = 0oU.A00(authenticationVersionArr);
        Companion = new Object();
        A01 = AnonymousClass0eN.A00(0eO.A03, C20674Wx6.A00);
    }

    /* access modifiers changed from: public */
    AuthenticationVersion(String str) {
        this.A00 = str;
    }
}
