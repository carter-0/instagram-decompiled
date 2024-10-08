package com.instagram.business.onelink.cache;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C14251TsY;
import X.C255463uA;
import X.C41845B3m;
import X.C51975G9x;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class FBPageCacheInfo extends AnonymousClass0T0 {
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final class Companion {
        public final C255463uA serializer() {
            return C14251TsY.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBPageCacheInfo) {
                FBPageCacheInfo fBPageCacheInfo = (FBPageCacheInfo) obj;
                if (!0qQ.A0K(this.A03, fBPageCacheInfo.A03) || !0qQ.A0K(this.A02, fBPageCacheInfo.A02) || !0qQ.A0K(this.A01, fBPageCacheInfo.A01) || !0qQ.A0K(this.A00, fBPageCacheInfo.A00) || this.A05 != fBPageCacheInfo.A05 || !0qQ.A0K(this.A04, fBPageCacheInfo.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A05, ((((((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + C41845B3m.A00(this.A04);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FBPageCacheInfo(pageName=");
        sb.append(this.A03);
        sb.append(AnonymousClass000.A00(2037));
        sb.append(this.A02);
        sb.append(", adsPageName=");
        sb.append(this.A01);
        sb.append(", adsPageId=");
        sb.append(this.A00);
        sb.append(", isBPLAndAdsPageConsistent=");
        sb.append(this.A05);
        sb.append(", pageProfilePicUri=");
        return C51975G9x.A0i(this.A04, sb);
    }

    public FBPageCacheInfo(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = str4;
        this.A05 = z;
        this.A04 = str5;
    }

    public /* synthetic */ FBPageCacheInfo(String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        if (15 != (i & 15)) {
            VJ6.A00(C14251TsY.A01, i, 15);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = str4;
        this.A05 = (i & 16) == 0 ? true : z;
        if ((i & 32) == 0) {
            this.A04 = null;
        } else {
            this.A04 = str5;
        }
    }
}
