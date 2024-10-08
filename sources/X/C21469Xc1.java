package X;

import java.util.List;

/* renamed from: X.Xc1  reason: case insensitive filesystem */
public final class C21469Xc1 {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C21464Xbw A04;
    public final C21485Xcc A05;
    public final C21988Xp1 A06;
    public final int A07;
    public final List A08;
    public final Y1T A09;

    public final Y1H A00(C21464Xbw xbw, C21485Xcc xcc, C21988Xp1 xp1) {
        int i = this.A07;
        List list = this.A08;
        if (i < list.size()) {
            this.A00++;
            C21485Xcc xcc2 = this.A05;
            C21464Xbw xbw2 = xbw;
            if (xcc2 != null && !xcc2.A04.AJK().A02(xbw2.A03)) {
                StringBuilder A0n = AnonymousClass7TF.A0n("network interceptor ");
                A0n.append(list.get(i - 1));
                throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0l(" must retain the same host and port", A0n));
            } else if (xcc2 == null || this.A00 <= 1) {
                int i2 = i + 1;
                C21469Xc1 xc1 = new C21469Xc1(list, this.A09, xbw2, xcc, xp1, i2, this.A01, this.A02, this.A03);
                C22552Y9f y9f = (C22552Y9f) list.get(i);
                Y1H CNe = y9f.CNe(xc1);
                if (xcc != null && i2 < list.size() && xc1.A00 != 1) {
                    StringBuilder A0n2 = AnonymousClass7TF.A0n("network interceptor ");
                    A0n2.append(y9f);
                    throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0l(" must call proceed() exactly once", A0n2));
                } else if (CNe.A0B != null) {
                    return CNe;
                } else {
                    StringBuilder A0n3 = AnonymousClass7TF.A0n("interceptor ");
                    A0n3.append(y9f);
                    throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0l(" returned a response with no body", A0n3));
                }
            } else {
                StringBuilder A0n4 = AnonymousClass7TF.A0n("network interceptor ");
                A0n4.append(list.get(i - 1));
                throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0l(" must call proceed() exactly once", A0n4));
            }
        } else {
            throw new AssertionError();
        }
    }

    public C21469Xc1(List list, Y1T y1t, C21464Xbw xbw, C21485Xcc xcc, C21988Xp1 xp1, int i, int i2, int i3, int i4) {
        this.A08 = list;
        this.A06 = xp1;
        this.A05 = xcc;
        this.A07 = i;
        this.A04 = xbw;
        this.A09 = y1t;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }
}
