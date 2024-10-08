package X;

/* renamed from: X.NsH  reason: case insensitive filesystem */
public abstract class C69794NsH {
    public static final Object A00(AnonymousClass6Tm r7) {
        C276544tV r4;
        AnonymousClass1qK ndf;
        String str = (String) r7.A03(0);
        if (!(str == null || (r4 = (C276544tV) r7.A02()) == null)) {
            Object A00 = r7.A00();
            0qQ.A0C(A00, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
            0lg A0A = C308206Td.A0A((C307786Rm) A00);
            0qQ.A0C(A0A, AnonymousClass000.A00(2));
            boolean A0R = r4.A0R(40, false);
            1Ng A002 = AnonymousClass1Nd.A00(A0A);
            if (str.equals("discover.screenshare")) {
                ndf = C69048Ndk.A00;
            } else if (str.equals("discover.photobooth")) {
                ndf = C69049Ndl.A00;
            } else if (str.equals("discover.reels_together")) {
                ndf = C69047Ndj.A00;
            } else if (A0R) {
                ndf = new C69044Ndg(str);
            } else {
                ndf = new C69043Ndf(DbT.A09(str));
            }
            A002.A00(ndf);
        }
        return null;
    }
}
