package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.GoO  reason: case insensitive filesystem */
public final class C53431GoO extends AnonymousClass0T0 implements JSM {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final C53431GoO F0N() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53431GoO) {
                C53431GoO goO = (C53431GoO) obj;
                if (!0qQ.A0K(this.A00, goO.A00) || !0qQ.A0K(this.A01, goO.A01) || !0qQ.A0K(this.A02, goO.A02) || !0qQ.A0K(this.A03, goO.A03) || !0qQ.A0K(this.A04, goO.A04) || !0qQ.A0K(this.A05, goO.A05) || !0qQ.A0K(this.A06, goO.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BEA() {
        return this.A02;
    }

    public final String BEB() {
        return this.A03;
    }

    public final String Bxi() {
        return this.A05;
    }

    public final String CDk() {
        return this.A06;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAfiInterestData", HTH.A00(this));
    }

    public final String getDisplayName() {
        return this.A00;
    }

    public final String getEmoji() {
        return this.A01;
    }

    public final String getName() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((((((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + C41845B3m.A00(this.A06);
    }

    public C53431GoO(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = str7;
    }
}
