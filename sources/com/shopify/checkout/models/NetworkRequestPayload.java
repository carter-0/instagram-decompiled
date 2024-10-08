package com.shopify.checkout.models;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass7TG;
import X.C20534WtF;
import X.C255453u9;
import X.C255463uA;
import X.C258613zM;
import X.C41845B3m;
import X.C51975G9x;
import X.C66579MXk;
import X.VJ6;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
public final class NetworkRequestPayload {
    public static final C255463uA[] A06;
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Map A05;

    public final class Companion {
        public final C255463uA serializer() {
            return C20534WtF.A00;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.shopify.checkout.models.NetworkRequestPayload$Companion] */
    static {
        C255453u9 r0 = C255453u9.A01;
        A06 = new C255463uA[]{null, null, null, new C258613zM(r0, r0), null, null};
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NetworkRequestPayload) {
                NetworkRequestPayload networkRequestPayload = (NetworkRequestPayload) obj;
                if (!0qQ.A0K(this.A04, networkRequestPayload.A04) || !0qQ.A0K(this.A02, networkRequestPayload.A02) || !0qQ.A0K(this.A00, networkRequestPayload.A00) || !0qQ.A0K(this.A05, networkRequestPayload.A05) || !0qQ.A0K(this.A01, networkRequestPayload.A01) || !0qQ.A0K(this.A03, networkRequestPayload.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ NetworkRequestPayload(String str, String str2, String str3, String str4, String str5, Map map, int i) {
        if (63 != (i & 63)) {
            VJ6.A00(C20534WtF.A01, i, 63);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A04 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A05 = map;
        this.A01 = str4;
        this.A03 = str5;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A03);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NetworkRequestPayload(url=");
        sb.append(this.A04);
        sb.append(", method=");
        sb.append(this.A02);
        sb.append(", body=");
        sb.append(this.A00);
        sb.append(AnonymousClass000.A00(2019));
        sb.append(this.A05);
        sb.append(", initiatorType=");
        sb.append(this.A01);
        sb.append(C66579MXk.A00(191));
        return C51975G9x.A0i(this.A03, sb);
    }
}
