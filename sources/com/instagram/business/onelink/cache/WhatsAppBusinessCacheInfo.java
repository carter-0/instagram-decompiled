package com.instagram.business.onelink.cache;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.C255463uA;
import X.C376019Gf;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class WhatsAppBusinessCacheInfo extends AnonymousClass0T0 {
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final class Companion {
        public final C255463uA serializer() {
            return C376019Gf.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WhatsAppBusinessCacheInfo) {
                WhatsAppBusinessCacheInfo whatsAppBusinessCacheInfo = (WhatsAppBusinessCacheInfo) obj;
                if (!(0qQ.A0K(this.A01, whatsAppBusinessCacheInfo.A01) && 0qQ.A0K(this.A00, whatsAppBusinessCacheInfo.A00) && this.A03 == whatsAppBusinessCacheInfo.A03 && this.A04 == whatsAppBusinessCacheInfo.A04 && this.A02 == whatsAppBusinessCacheInfo.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WhatsAppBusinessCacheInfo(linkedPhoneNumber=");
        sb.append(this.A01);
        sb.append(", linkedAccountType=");
        sb.append(this.A00);
        sb.append(", isRiskyTierAccountForCtwa=");
        sb.append(this.A03);
        sb.append(", isWhatsAppNumberBanned=");
        sb.append(this.A04);
        sb.append(", isBusinessVerificationEligible=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A01;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.A00;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i3 = (i2 + i) * 31;
        int i4 = 1237;
        if (this.A03) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A04) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A02) {
            i8 = 1231;
        }
        return i7 + i8;
    }

    public WhatsAppBusinessCacheInfo(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A01 = str;
        this.A00 = str2;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = z3;
    }

    public /* synthetic */ WhatsAppBusinessCacheInfo(String str, String str2, int i, boolean z, boolean z2, boolean z3) {
        if (31 != (i & 31)) {
            VJ6.A00(C376019Gf.A01, i, 31);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = str;
        this.A00 = str2;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = z3;
    }
}
