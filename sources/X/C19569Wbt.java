package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.List;

/* renamed from: X.Wbt  reason: case insensitive filesystem */
public final class C19569Wbt implements C20966X6t, C20967X6u, C20923X4o, XC5, XC6, XC7 {
    public final C307786Rm A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final C18065Vkr A03;
    public final AnonymousClass4UR A04;
    public final C234372xl A05;
    public final C62320sa A06;

    public final void Dnj(XC0 xc0, C16274Urb urb) {
        Reel reel = urb.A01;
        List A1I = AnonymousClass7TE.A1I(reel);
        UserSession userSession = this.A01;
        C307786Rm r3 = this.A00;
        Fragment fragment = ((C229382nI) r3.A02).A02;
        0qQ.A0C(fragment, "null cannot be cast to non-null type com.instagram.bloks.hosting.IgBloksScreenFragment");
        AnonymousClass32A r5 = new AnonymousClass32A(this.A02, userSession, new AnonymousClass328(fragment));
        r5.A0C = AnonymousClass7TF.A0b();
        Context context = r3.A00;
        DbS.A1X(context);
        r5.A05 = new C16165Upq((Activity) context, xc0.Beu(), (C230222pE) new FkY(3), AnonymousClass05K.A01);
        r5.A06(reel, AnonymousClass3BQ.INSTAGRAM_SHOPPING_PDP_LIGHTBOX, xc0, A1I, A1I, 0);
    }

    public final void E0Z(View view, C253723rH r4, C18001Vjd vjd, C253913rc r6) {
        0qQ.A0B(r4, 1);
        C234372xl r1 = this.A05;
        if (r1 != null && r1.isIdle()) {
            r1.Exy(view, r4, r6);
        }
    }

    public final void FHJ(View view, C253723rH r2, C18001Vjd vjd, C253913rc r4) {
    }

    private final void A00(String str) {
        FragmentActivity fragmentActivity = this.A00.A00;
        DbS.A1X(fragmentActivity);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        UserSession userSession = this.A01;
        AnonymousClass4DU r5 = this.A02;
        0qQ.A0B(fragmentActivity2, 0);
        C309516Yo A0Q = DbU.A0Q(fragmentActivity2, userSession);
        1a1 A022 = C46447Df9.A02();
        C46474Dfc A012 = C46548Dgp.A01(userSession, str, "shopping_lightbox", r5.getModuleName());
        A012.A0L = null;
        A0Q.A0B((Bundle) null, A022.A02(userSession, A012.A04()));
        A0Q.A04();
    }

    public final void DPl(C16272UrZ urZ) {
        User A2A = urZ.A00.A2A(this.A01);
        if (A2A != null) {
            A00(A2A.getId());
        }
    }

    public final void DPm(C16272UrZ urZ) {
        C309516Yo r7;
        1Xj r3 = urZ.A01;
        boolean A09 = C254423sS.A09(r3);
        String A002 = AnonymousClass000.A00(22);
        if (!A09) {
            FragmentActivity fragmentActivity = this.A00.A00;
            0qQ.A0C(fragmentActivity, A002);
            UserSession userSession = this.A01;
            r7 = DbU.A0Q(fragmentActivity, userSession);
            IgFragmentFactoryImpl.A00();
            String id = r3.getId();
            if (id != null) {
                F3W f3w = new F3W();
                f3w.A0B = id;
                f3w.A00 = urZ.A00.A15(userSession);
                r7.A0D(f3w.A01());
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            C249713kF r6 = C249713kF.A00;
            FragmentActivity fragmentActivity2 = this.A00.A00;
            0qQ.A0C(fragmentActivity2, A002);
            FragmentActivity fragmentActivity3 = fragmentActivity2;
            UserSession userSession2 = this.A01;
            String id2 = r3.getId();
            if (id2 != null) {
                int A15 = urZ.A00.A15(userSession2);
                r7 = new C309516Yo(fragmentActivity3, userSession2);
                ((C249723kG) r6).A00.A0T();
                Bundle A092 = DbY.A09(userSession2);
                A092.putString("shopping_session_id", (String) null);
                A092.putString("media_id", id2);
                A092.putInt("media_carousel_index", A15);
                A092.putString("permission_id", (String) null);
                C15345Uav uav = new C15345Uav();
                uav.setArguments(A092);
                r7.A0E(uav);
                r7.A08();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        r7.A04();
    }

    public final void Dni(C16274Urb urb) {
        User A2A = urb.A00.A2A(this.A01);
        if (A2A != null) {
            A00(A2A.getId());
        }
    }

    public final void Dx8() {
        C14044Tol tol;
        this.A04.A02(C232822uV.A0B);
        C18065Vkr vkr = this.A03;
        if (!(vkr == null || (tol = vkr.A01) == null)) {
            tol.A04(-1);
        }
        this.A06.invoke();
    }

    public C19569Wbt(C307786Rm r1, UserSession userSession, AnonymousClass4DU r3, C18065Vkr vkr, AnonymousClass4UR r5, C234372xl r6, C62320sa r7) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = r3;
        this.A05 = r6;
        this.A04 = r5;
        this.A03 = vkr;
        this.A06 = r7;
    }
}
