package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.LpE  reason: case insensitive filesystem */
public final class C65208LpE implements MVS {
    public KHT A00;
    public final AnonymousClass80P A01 = AnonymousClass80P.LINK_TO_HIGHLIGHT;
    public final AnonymousClass4DH A02;
    public final UserSession A03;
    public final C66576MXh A04;
    public final KOE A05;
    public final C60130JgB A06;
    public final AnonymousClass0iw A07;

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
    }

    public final View ANH() {
        L4K l4k = new L4K(new L13(this), this);
        AnonymousClass4DH r6 = this.A02;
        Context requireContext = r6.requireContext();
        UserSession userSession = this.A03;
        AnonymousClass0iw r7 = this.A07;
        C60130JgB jgB = this.A06;
        KOE koe = this.A05;
        KHT kht = new KHT(requireContext, jgB, r6, r7, userSession, l4k, koe.A01);
        DbY.A0z(kht);
        kht.setOrientation(1);
        this.A00 = kht;
        String str = koe.A03;
        String str2 = koe.A02;
        if (!(str == null || str2 == null)) {
            kht.A01(str, 0sr.A1L(new String[]{str2}));
        }
        KHT kht2 = this.A00;
        if (kht2 != null) {
            return kht2;
        }
        0qQ.A0F("row");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A01;
    }

    public C65208LpE(C60130JgB jgB, AnonymousClass4DH r3, AnonymousClass0iw r4, UserSession userSession, C66576MXh mXh, KOE koe) {
        AnonymousClass7TG.A1U(r3, userSession, jgB);
        AnonymousClass7TG.A1S(mXh, r4);
        this.A02 = r3;
        this.A03 = userSession;
        this.A06 = jgB;
        this.A05 = koe;
        this.A04 = mXh;
        this.A07 = r4;
    }
}
