package X;

/* renamed from: X.JvV  reason: case insensitive filesystem */
public final class C61031JvV extends AnonymousClass0T0 {
    public final C61025JvP A00;
    public final C61026JvQ A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public static final C61031JvV A00(C61025JvP jvP, C61026JvQ jvQ, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        0qQ.A0B(str, 3);
        AnonymousClass7TG.A1S(jvQ, jvP);
        return new C61031JvV(jvP, jvQ, str, z, z2, z3, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61031JvV) {
                C61031JvV jvV = (C61031JvV) obj;
                if (!(this.A06 == jvV.A06 && this.A04 == jvV.A04 && this.A05 == jvV.A05 && 0qQ.A0K(this.A02, jvV.A02) && this.A03 == jvV.A03 && 0qQ.A0K(this.A01, jvV.A01) && 0qQ.A0K(this.A00, jvV.A00) && this.A07 == jvV.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A07, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A04, C51965G9l.A05(this.A06))))))));
    }

    public C61031JvV(C61025JvP jvP, C61026JvQ jvQ, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A06 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A02 = str;
        this.A03 = z4;
        this.A01 = jvQ;
        this.A00 = jvP;
        this.A07 = z5;
    }

    public C61031JvV() {
        this(new C61025JvP(false, true, false), C61026JvQ.A03, "", false, false, false, false, true);
    }
}
