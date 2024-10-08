package X;

import java.util.HashMap;

/* renamed from: X.Dtv  reason: case insensitive filesystem */
public final class C47267Dtv extends AnonymousClass0T0 implements G5E {
    public final C61083JwL A00;
    public final C21241XQm A01;
    public final String A02;
    public final HashMap A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47267Dtv) {
                C47267Dtv dtv = (C47267Dtv) obj;
                if (!0qQ.A0K(this.A02, dtv.A02) || !0qQ.A0K(this.A00, dtv.A00) || this.A01 != dtv.A01 || !0qQ.A0K(this.A03, dtv.A03) || this.A04 != dtv.A04 || this.A05 != dtv.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A02);
        return DbS.A06(this.A05, AnonymousClass7TF.A09(this.A04, (((AnonymousClass7TF.A07(this.A00, A0O) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A03)) * 31));
    }

    public C47267Dtv(C61083JwL jwL, C21241XQm xQm, String str, HashMap hashMap, boolean z, boolean z2) {
        AnonymousClass7TG.A1O(str, jwL);
        this.A02 = str;
        this.A00 = jwL;
        this.A01 = xQm;
        this.A03 = hashMap;
        this.A04 = z;
        this.A05 = z2;
    }
}
