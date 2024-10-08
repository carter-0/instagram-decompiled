package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3Yp  reason: invalid class name and case insensitive filesystem */
public final class C243393Yp implements C230202p9, C243403Yq, C230182p7, AnonymousClass2pA {
    public 1Xj A00 = null;
    public C18561VuD A01;
    public C2361132m A02;
    public final int A03 = 2;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final C231332rR A06;

    public C243393Yp(AnonymousClass0iw r3, UserSession userSession, C2361132m r5, C231332rR r6) {
        this.A06 = r6;
        this.A02 = r5;
        this.A05 = userSession;
        this.A04 = r3;
    }

    public static void A01(1Xj r1, int i) {
        if (i == 1) {
            r1.A3r();
        } else {
            r1.A3q();
        }
    }

    public final boolean CVu(Object obj, Object obj2) {
        if (obj2 != null && (obj instanceof 1Xj)) {
            ((1Xj) obj).A3q();
        }
        return false;
    }

    public final boolean CVz(Object obj, Object obj2) {
        if (obj2 != null && (obj instanceof 1Xj)) {
            ((1Xj) obj).A3q();
        }
        return false;
    }

    public final void Db7(C17983VjL vjL, C17997VjZ vjZ) {
    }

    public final void Db8(String str, int i) {
    }

    public static int A00(AnonymousClass0iw r1, String str) {
        if ((str == null || (!str.equals("contextual_feed") && !str.equals("main_feed"))) && !r1.getModuleName().equals("feed_short_url")) {
            return 2;
        }
        return 1;
    }

    public final void AGj() {
        this.A06.AV9();
    }

    public final void CvD() {
    }

    public final void Dkm() {
    }

    public final void Dkn(C57250IUl iUl, C270054g7 r3) {
        iUl.A00 = AnonymousClass05K.A00;
    }

    public final void Dko() {
    }

    public final void A02(1Xj r1) {
        r1.getClass();
        this.A00 = r1;
        r1.A3q();
        r1.A3q();
    }

    public final void D9b(C17997VjZ vjZ) {
    }

    public final void DFm(Object obj, Object obj2) {
    }

    public final void DFo(Object obj, Object obj2) {
    }
}
