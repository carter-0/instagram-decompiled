package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.HashMap;

/* renamed from: X.Lod  reason: case insensitive filesystem */
public final class C65174Lod implements MVR {
    public C231002qi A00;
    public final UserSession A01;
    public final C230882qT A02;
    public final AnonymousClass4DH A03;
    public final AnonymousClass0iw A04;

    public final void EBQ(View view, QPTooltipAnchor qPTooltipAnchor) {
        0qQ.A0B(qPTooltipAnchor, 0);
        C230882qT r1 = this.A02;
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
        this.A02.A07.remove(qPTooltipAnchor);
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
        this.A03.registerLifecycleListener(this.A02);
    }

    public final void FIx() {
        this.A03.unregisterLifecycleListener(this.A02);
    }

    public C65174Lod(AnonymousClass4DH r10, AnonymousClass0iw r11, UserSession userSession) {
        this.A03 = r10;
        this.A01 = userSession;
        this.A04 = r11;
        1YN A002 = AnonymousClass2bO.A00();
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(QPTooltipAnchor.TAG_PRODUCTS_ROW, new C65553Lvd());
        A1E.put(QPTooltipAnchor.SWITCH_ACCOUNT, new C65554Lve());
        A1E.put(QPTooltipAnchor.ADVANCED_SETTINGS_ROW, new C65551Lvb());
        A1E.put(QPTooltipAnchor.ADVANCED_SETTINGS_VIDEO_ROW, new C65551Lvb());
        A1E.put(QPTooltipAnchor.CAPTION_BOX, new C65552Lvc());
        C230882qT A042 = A002.A04(userSession, A1E);
        this.A02 = A042;
        1YN A003 = AnonymousClass2bO.A00();
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0v;
        AnonymousClass2bO.A00();
        this.A00 = A003.A01(r10, r11, userSession, 2bV.A06(new LvU(this, 0), A042), quickPromotionSlot);
    }
}
