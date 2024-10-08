package X;

import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.MhM  reason: case insensitive filesystem */
public final class C67049MhM implements Runnable {
    public final /* synthetic */ C66633Ma2 A00;
    public final /* synthetic */ N3U A01;

    public C67049MhM(C66633Ma2 ma2, N3U n3u) {
        this.A00 = ma2;
        this.A01 = n3u;
    }

    public final void run() {
        C66633Ma2 ma2 = this.A00;
        N3U n3u = this.A01;
        if (n3u != null && n3u.A00 > 0) {
            AnonymousClass4DH r5 = ma2.A1J;
            if (r5.isResumed()) {
                if (182.A06(0Tu.A05, ma2.A0p(), 36319690859093564L)) {
                    String str = n3u.A03;
                    UserSession A0p = ma2.A0p();
                    AnonymousClass7TF.A1H(str, A0p);
                    String A0R = 002.A0R("education_notice_interstitial_shown_", str);
                    1Av A002 = 1Au.A00(A0p);
                    A002.A0z(A0R, A002.A01.getInt(A0R, 0) + 1);
                    AnonymousClass6W8 A03 = AnonymousClass6W8.A03(r5.requireActivity(), AnonymousClass7TE.A0a(), ma2.A0p(), ModalActivity.class, C273654mx.A00(832));
                    A03.A0J = ModalActivity.A08;
                    DbU.A1K(r5, A03);
                }
            }
        }
    }
}
