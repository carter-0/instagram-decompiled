package com.facebook.ohai.ohaiconfigprovider.base;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.C20504Wsk;
import X.C255463uA;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class OHAIConfig extends AnonymousClass0T0 {
    public static final Companion Companion = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final String A06;

    public final class Companion {
        public final C255463uA serializer() {
            return C20504Wsk.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OHAIConfig) {
                OHAIConfig oHAIConfig = (OHAIConfig) obj;
                if (!(this.A03 == oHAIConfig.A03 && 0qQ.A0K(this.A06, oHAIConfig.A06) && this.A02 == oHAIConfig.A02 && this.A01 == oHAIConfig.A01 && this.A00 == oHAIConfig.A00 && this.A04 == oHAIConfig.A04 && this.A05 == oHAIConfig.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A012 = AnonymousClass7TF.A01(this.A04, (((((AnonymousClass7TF.A08(this.A06, this.A03 * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31);
        long j = this.A05;
        return A012 + ((int) (j ^ (j >>> 32)));
    }

    public OHAIConfig(String str, int i, int i2, int i3, int i4, long j, long j2) {
        this.A03 = i;
        this.A06 = str;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
        this.A04 = j;
        this.A05 = j2;
    }

    public /* synthetic */ OHAIConfig(String str, int i, int i2, int i3, int i4, int i5, long j, long j2) {
        if (127 != (i & 127)) {
            VJ6.A00(C20504Wsk.A01, i, 127);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A03 = i2;
        this.A06 = str;
        this.A02 = i3;
        this.A01 = i4;
        this.A00 = i5;
        this.A04 = j;
        this.A05 = j2;
    }
}
