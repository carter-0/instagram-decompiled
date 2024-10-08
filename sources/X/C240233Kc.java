package X;

import com.instagram.model.fbusertag.FBUserTag;

/* renamed from: X.3Kc  reason: invalid class name and case insensitive filesystem */
public final class C240233Kc extends AnonymousClass0T0 implements AnonymousClass1qK {
    public final 1Xj A00;
    public final FBUserTag A01;
    public final 1P0 A02;
    public final String A03;
    public final String A04;

    public C240233Kc(1P0 r2, 1Xj r3, FBUserTag fBUserTag, String str, String str2) {
        0qQ.A0B(fBUserTag, 4);
        this.A00 = r3;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = fBUserTag;
        this.A02 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C240233Kc) {
                C240233Kc r5 = (C240233Kc) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((this.A00.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode();
    }
}
