package com.instagram.wellbeing.upsells.constants;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C20517Wsx;
import X.C255463uA;
import X.C273654mx;
import X.C51968G9o;
import X.C51975G9x;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class UnlikeData extends AnonymousClass0T0 {
    public static final Companion Companion = new Object();
    public final long A00;
    public final String A01;
    public final String A02;

    public final class Companion {
        public final C255463uA serializer() {
            return C20517Wsx.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UnlikeData) {
                UnlikeData unlikeData = (UnlikeData) obj;
                if (this.A00 != unlikeData.A00 || !0qQ.A0K(this.A02, unlikeData.A02) || !0qQ.A0K(this.A01, unlikeData.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A02, C51968G9o.A03(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnlikeData(timestamp=");
        sb.append(this.A00);
        sb.append(", mediaId=");
        sb.append(this.A02);
        sb.append(C273654mx.A00(438));
        return C51975G9x.A0i(this.A01, sb);
    }

    public UnlikeData(long j, String str, String str2) {
        this.A00 = j;
        this.A02 = str;
        this.A01 = str2;
    }

    public /* synthetic */ UnlikeData(int i, String str, String str2, long j) {
        if (7 != (i & 7)) {
            VJ6.A00(C20517Wsx.A01, i, 7);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = j;
        this.A02 = str;
        this.A01 = str2;
    }
}
