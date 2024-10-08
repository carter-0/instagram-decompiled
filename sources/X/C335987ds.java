package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7ds  reason: invalid class name and case insensitive filesystem */
public final class C335987ds extends 2YL {
    public final C335167cV A00;
    public final LBB A01;
    public final AnonymousClass7IT A02;
    public final UserSession A03;
    public final UserSession A04;
    public final String A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;

    public final void A00(String str) {
        0qQ.A0B(str, 0);
        if (!0qQ.A0K(this.A01.A00, str)) {
            C318136oS A002 = C318116oQ.A00(this);
            1Eo.A05(19B.A00, new MGE(this, str, (AnonymousClass4D7) null, 15), A002);
        }
    }

    public /* synthetic */ C335987ds(UserSession userSession, String str) {
        C317846nw r6;
        0Tu r3 = 0Tu.A05;
        UserSession userSession2 = userSession;
        if (182.A06(r3, userSession, 36323719538290095L)) {
            r6 = C317846nw.STATIC_AVATAR_STICKERS;
        } else {
            r6 = C317846nw.MIXED_AVATAR_STICKERS;
        }
        C317866ny r7 = C317866ny.COMMENTS;
        AnonymousClass7IT r2 = new AnonymousClass7IT(userSession);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 2);
        LBB lbb = new LBB(r6, r7, userSession2, str, (int) 182.A01(r3, userSession, 36604528795128894L), 182.A06(r3, userSession, 36323053818489635L));
        C335167cV r0 = new C335167cV(userSession);
        this.A03 = userSession;
        this.A05 = str;
        this.A01 = lbb;
        this.A00 = r0;
        C318136oS A002 = C318116oQ.A00(this);
        1Eo.A05(19B.A00, new MFS(this, (AnonymousClass4D7) null, 27), A002);
        02z A012 = 106.A01(C384799hu.A00);
        this.A06 = A012;
        this.A07 = A012;
        this.A04 = userSession;
        this.A02 = r2;
    }
}
