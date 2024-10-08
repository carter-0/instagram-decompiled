package X;

import java.util.List;

/* renamed from: X.Jze  reason: case insensitive filesystem */
public final class C61246Jze extends AnonymousClass0T0 implements MR2 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C61246Jze(C61083JwL jwL, C61083JwL jwL2, C61083JwL jwL3, C61083JwL jwL4, C61083JwL jwL5) {
        0qQ.A0B(jwL, 1);
        this.A05 = jwL;
        this.A01 = jwL2;
        this.A03 = jwL3;
        this.A04 = jwL4;
        this.A02 = jwL5;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof C61246Jze)) {
            return false;
        }
        C61246Jze jze = (C61246Jze) obj;
        if (jze.A00 != i || !0qQ.A0K(this.A05, jze.A05) || !0qQ.A0K(this.A01, jze.A01) || !0qQ.A0K(this.A03, jze.A03) || !0qQ.A0K(this.A04, jze.A04) || !0qQ.A0K(this.A02, jze.A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07;
        Object obj;
        int i = this.A00;
        Object obj2 = this.A05;
        if (i != 0) {
            A07 = (((((AnonymousClass7TE.A0K(obj2) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31;
            obj = this.A02;
        } else {
            A07 = (((AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(obj2)) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31;
            obj = this.A02;
        }
        return AnonymousClass7TE.A0N(obj, A07);
    }

    public C61246Jze(C61083JwL jwL, C61083JwL jwL2, C61083JwL jwL3, L2R l2r, List list) {
        0qQ.A0B(jwL, 1);
        this.A05 = jwL;
        this.A01 = list;
        this.A03 = jwL2;
        this.A04 = jwL3;
        this.A02 = l2r;
    }
}
