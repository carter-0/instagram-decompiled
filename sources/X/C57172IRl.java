package X;

import android.view.ViewParent;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.IRl  reason: case insensitive filesystem */
public final class C57172IRl implements JQG {
    public final UserSession A00;
    public final AnonymousClass311 A01;
    public final C253843rV A02;
    public final AnonymousClass4DU A03;
    public final C234342xi A04;

    public C57172IRl(UserSession userSession, AnonymousClass311 r3, C253843rV r4, AnonymousClass4DU r5, C234342xi r6) {
        0qQ.A0B(r4, 4);
        this.A01 = r3;
        this.A00 = userSession;
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = r6;
    }

    public final void Dkx(AnonymousClass3V2 r13, 1Xj r14, GQ0 gq0, AnonymousClass3W1 r16, int i) {
        long j;
        Long A10;
        1Xj r6 = r14;
        0qQ.A0B(r14, 0);
        AnonymousClass3V2 r8 = r13;
        AnonymousClass3W1 r9 = r16;
        C51972G9s.A1B(r9, r13);
        UserSession userSession = this.A00;
        AnonymousClass4DU r2 = this.A03;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), "instagram_ad_tap_collection_main_product");
        String A07 = C231122qu.A07(userSession, r14);
        if (A07 == null || (A10 = AnonymousClass7TE.A10(A07)) == null) {
            j = 0;
        } else {
            j = A10.longValue();
        }
        C51970G9q.A17(A0e, j);
        A0e.A7p("is_checkout_enabled", false);
        C51974G9v.A0p(A0e, r14, "m_pk", r14.getId());
        C51965G9l.A1L(A0e, r14.A2v());
        A0e.Cgf();
        C254523sc A0c = C51967G9n.A0c(userSession, r14, r2, "collection_main_media_tap");
        A0c.A6x = 2EG.A1B.toString();
        C233822wX.A0E(userSession, A0c, r14, r2, r9.A03);
        if (r13.A0A.getIgImageView().A0G()) {
            this.A02.A00(r13.A0F, r6, gq0, r8, r9, r13.A0C, i);
        }
    }

    public final void D4T(AnonymousClass3V2 r9, 1Xj r10, AnonymousClass3W1 r11, C253913rc r12, int i) {
        C234342xi r1 = this.A04;
        if (!r1.A02()) {
            MediaFrameLayout mediaFrameLayout = r9.A0F;
            if (mediaFrameLayout.getParent() instanceof C253723rH) {
                ViewParent parent = mediaFrameLayout.getParent();
                0qQ.A0C(parent, "null cannot be cast to non-null type com.instagram.common.ui.widget.zoomcontainer.ZoomableViewContainer");
                r1.A01(mediaFrameLayout, (C253723rH) parent, r10, r12, r11.A03, i);
            }
        }
    }

    public final void D9v(AnonymousClass3V2 r7, 1Xj r8, GQ0 gq0, AnonymousClass3W1 r10, int i) {
        if (r7.A0A.getIgImageView().A0G()) {
            this.A02.A01(r7.A01, r8, gq0, r10, i);
        }
    }
}
