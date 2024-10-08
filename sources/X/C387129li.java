package X;

import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;

/* renamed from: X.9li  reason: invalid class name and case insensitive filesystem */
public final class C387129li extends C235042zB {
    public final /* synthetic */ C335027cG A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C387129li(C335027cG r3) {
        super(250);
        this.A00 = r3;
    }

    public final /* bridge */ /* synthetic */ void A00(Object obj, long j, Object obj2) {
        C335027cG r4 = this.A00;
        if (!r4.A00) {
            r4.A00 = true;
            0Aj A0e = AnonymousClass7TE.A0e(r4.A01, AnonymousClass000.A00(3313));
            if (A0e.isSampled()) {
                A0e.Cgf();
            }
            if (182.A06(0Tu.A05, r4.A02, 36315859749178985L)) {
                2CE r42 = r4.A04;
                2DQ r3 = 2DQ.A0a;
                if (r42.A03.get(r3) != null) {
                    2D6 r1 = r42.A02;
                    int A002 = r1.A00() + 1;
                    0xY AR4 = r1.A04.AR4();
                    AR4.E5Z("PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_CONSUMPTION_DISCLOSURE_IMPRESSION_COUNT", A002);
                    AR4.apply();
                    AnonymousClass9I7 A003 = 2CE.A00(r42, r3);
                    if (A003.A01 < 1) {
                        A003 = new AnonymousClass9I7(1, 0, 12);
                        r42.A01.A03(A003, r3);
                    }
                    CXPNoticeStateRepository cXPNoticeStateRepository = r42.A01;
                    int i = A003.A01;
                    cXPNoticeStateRepository.A03(new AnonymousClass9I7(A003.A04, A003.A00 + 1, i, A003.A03, 0), r3);
                    return;
                }
                return;
            }
            2D6 r12 = r4.A05;
            int A004 = r12.A00() + 1;
            0xY AR42 = r12.A04.AR4();
            AR42.E5Z("PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_CONSUMPTION_DISCLOSURE_IMPRESSION_COUNT", A004);
            AR42.apply();
        }
    }
}
