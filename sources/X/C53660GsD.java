package X;

/* renamed from: X.GsD  reason: case insensitive filesystem */
public final class C53660GsD extends C251343mx {
    public final C251263mp A00;
    public final C251263mp A01;

    public final C251263mp A0X(AnonymousClass3Y5 r11) {
        0qQ.A0B(r11, 0);
        C60340gF r7 = C60340gF.A00;
        Object A002 = AnonymousClass3Zw.A00(r11, C58677Ivm.A00(r11, 4), new Object[]{r7});
        Object A003 = AnonymousClass3Zw.A00(r11, C58687Ivw.A00(r11, this, 19), new Object[]{r7});
        2V1 r4 = r11.A05;
        Object A06 = r4.A06(C49726F3q.class);
        if (A06 != null) {
            Object A062 = r4.A06(Vk7.class);
            if (A062 != null) {
                C243773a4.A00(r11, C58699Iw8.A00(A06, A002, A062, A003, 33), new Object[]{r7});
                C251263mp r3 = this.A00;
                C243773a4.A00(r11, C58687Ivw.A00(A003, this, 18), new Object[]{r3});
                2Wb A0S = AnonymousClass7TG.A0S(r4);
                C51967G9n.A1F(G9t.A0v(r3, A0S.A00), A0S, C52112GFg.A01(2WX.A02, 0.0f));
                A0S.A00(this.A01);
                return new 2Tl((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, A0S.A01, false);
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public C53660GsD(C251263mp r1, C251263mp r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
