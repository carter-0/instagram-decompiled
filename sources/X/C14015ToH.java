package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.ToH  reason: case insensitive filesystem */
public final class C14015ToH extends AnonymousClass0T0 implements C21042XAv {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public final C14015ToH F0k() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C14015ToH) {
                C14015ToH toH = (C14015ToH) obj;
                if (!0qQ.A0K(this.A01, toH.A01) || !0qQ.A0K(this.A02, toH.A02) || !0qQ.A0K(this.A03, toH.A03) || !0qQ.A0K(this.A04, toH.A04) || !0qQ.A0K(this.A05, toH.A05) || !0qQ.A0K(this.A06, toH.A06) || !0qQ.A0K(this.A07, toH.A07) || !0qQ.A0K(this.A00, toH.A00) || !0qQ.A0K(this.A08, toH.A08) || !0qQ.A0K(this.A09, toH.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AXo() {
        return this.A01;
    }

    public final String AeI() {
        return this.A02;
    }

    public final String AeK() {
        return this.A03;
    }

    public final String AeR() {
        return this.A04;
    }

    public final String AeW() {
        return this.A05;
    }

    public final String Aup() {
        return this.A06;
    }

    public final String B2z() {
        return this.A07;
    }

    public final Boolean BAa() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAvatarStickerDict", V75.A00(this));
    }

    public final String getMediaType() {
        return this.A08;
    }

    public final String getUserId() {
        return this.A09;
    }

    public final int hashCode() {
        return (((((((((((((((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + C41845B3m.A00(this.A09);
    }

    public C14015ToH(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = str7;
        this.A00 = bool;
        this.A08 = str8;
        this.A09 = str9;
    }
}
