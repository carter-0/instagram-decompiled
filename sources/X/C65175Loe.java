package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.HashMap;

/* renamed from: X.Loe  reason: case insensitive filesystem */
public final class C65175Loe implements MVR {
    public C231002qi A00;
    public final C230882qT A01;
    public final AnonymousClass4DH A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;

    public C65175Loe(AnonymousClass4DH r10, AnonymousClass0iw r11, UserSession userSession) {
        AnonymousClass7TG.A1U(r10, userSession, r11);
        this.A02 = r10;
        this.A04 = userSession;
        this.A03 = r11;
        1YN A002 = AnonymousClass2bO.A00();
        HashMap A1E = AnonymousClass7TE.A1E();
        C230872qQ r1 = new C230872qQ();
        A1E.put(QPTooltipAnchor.TAG_PRODUCTS_ROW, r1);
        A1E.put(QPTooltipAnchor.CONTENT_FUNDING_REELS_ROW, r1);
        A1E.put(QPTooltipAnchor.REELS_SHARE_SHEET_RECOMMEND_ON_FACEBOOK_ROW, r1);
        C230882qT A042 = A002.A04(userSession, A1E);
        this.A01 = A042;
        1YN A003 = AnonymousClass2bO.A00();
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0E;
        AnonymousClass2bO.A00();
        this.A00 = A003.A01(r10, r11, userSession, 2bV.A06(new LvU(this, 1), A042), quickPromotionSlot);
    }

    public final void EBQ(View view, QPTooltipAnchor qPTooltipAnchor) {
        0qQ.A0B(qPTooltipAnchor, 0);
        C230882qT r1 = this.A01;
        C231002qi r0 = this.A00;
        if (r0 == null) {
            0qQ.A0F("qpFragmentPresenter");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r1.A00(view, qPTooltipAnchor, r0);
        }
    }

    public final void FIr(QPTooltipAnchor qPTooltipAnchor) {
        0qQ.A0B(qPTooltipAnchor, 0);
        this.A01.A07.remove(qPTooltipAnchor);
    }

    public final void Dh3() {
        C231002qi r0 = this.A00;
        if (r0 == null) {
            0qQ.A0F("qpFragmentPresenter");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.Dh3();
        }
    }

    public final void EBi() {
        this.A02.registerLifecycleListener(this.A01);
    }

    public final void FIx() {
        this.A02.unregisterLifecycleListener(this.A01);
    }
}
