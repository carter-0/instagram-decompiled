package com.instagram.trust.noncemanager;

import X.002;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.C255463uA;
import X.C279704z8;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class VettedDeviceNonces extends AnonymousClass0T0 {
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;

    public final class Companion {
        public final C255463uA serializer() {
            return C279704z8.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VettedDeviceNonces) {
                VettedDeviceNonces vettedDeviceNonces = (VettedDeviceNonces) obj;
                if (!0qQ.A0K(this.A00, vettedDeviceNonces.A00) || !0qQ.A0K(this.A01, vettedDeviceNonces.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return 002.A0v("VettedDeviceNonces(vetted_device_first_factor_nonce=", this.A00, ", vetted_device_second_factor_nonce=", this.A01, ')');
    }

    public VettedDeviceNonces(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public /* synthetic */ VettedDeviceNonces(String str, String str2, int i) {
        if (3 != (i & 3)) {
            VJ6.A00(C279704z8.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = str;
        this.A01 = str2;
    }
}
