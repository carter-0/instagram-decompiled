package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.UgY  reason: case insensitive filesystem */
public abstract class C15667UgY extends C14097Tpp {
    public View A00;
    public C18065Vkr A01;
    public final AnonymousClass4UR A02 = new AnonymousClass4UR();
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new C20611Wvs(this, 19));
    public final C307786Rm A04;
    public final C276544tV A05;
    public final UserSession A06;
    public final AnonymousClass4DU A07;
    public final C18001Vjd A08;

    public final C307786Rm A0P() {
        if (this instanceof C15449Ucz) {
            return ((C15449Ucz) this).A00;
        }
        if (this instanceof C15448Ucy) {
            return ((C15448Ucy) this).A00;
        }
        if (this instanceof C15447Ucx) {
            return ((C15447Ucx) this).A00;
        }
        return ((C15446Ucw) this).A00;
    }

    public final UserSession A0Q() {
        if (this instanceof C15449Ucz) {
            return ((C15449Ucz) this).A01;
        }
        if (this instanceof C15448Ucy) {
            return ((C15448Ucy) this).A01;
        }
        if (this instanceof C15447Ucx) {
            return ((C15447Ucx) this).A01;
        }
        return ((C15446Ucw) this).A01;
    }

    public final 1Xj A0R() {
        C16274Urb urb;
        if (this instanceof C15449Ucz) {
            urb = ((C15449Ucz) this).A03;
        } else if (this instanceof C15448Ucy) {
            return ((C15448Ucy) this).A03.A00;
        } else {
            if (!(this instanceof C15447Ucx)) {
                return ((C15446Ucw) this).A03.A00;
            }
            urb = ((C15447Ucx) this).A03;
        }
        return urb.A00;
    }

    public final AnonymousClass4DU A0S() {
        if (this instanceof C15449Ucz) {
            return ((C15449Ucz) this).A02;
        }
        if (this instanceof C15448Ucy) {
            return ((C15448Ucy) this).A02;
        }
        if (this instanceof C15447Ucx) {
            return ((C15447Ucx) this).A02;
        }
        return ((C15446Ucw) this).A02;
    }

    public final C18065Vkr A0T() {
        C18065Vkr vkr = this.A01;
        if (vkr != null) {
            return vkr;
        }
        Context context = A0P().A00;
        UserSession A0Q = A0Q();
        AnonymousClass4DU A0S = A0S();
        C19617Wcg wcg = C19617Wcg.A00;
        AnonymousClass7TG.A1U(A0Q, A0S, wcg);
        C18065Vkr vkr2 = new C18065Vkr(context, A0Q, A0S, wcg);
        this.A01 = vkr2;
        return vkr2;
    }

    public final void A0U(boolean z) {
        if (this instanceof C15449Ucz) {
            C15449Ucz ucz = (C15449Ucz) this;
            View view = ucz.A00;
            if (view != null) {
                Object tag = view.getTag();
                0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.lightbox.LightboxStoryVideoViewBinder.Holder");
                UserSession userSession = ucz.A01;
                C16274Urb urb = ucz.A03;
                Uw7 uw7 = Uw7.PLAYING;
                AnonymousClass4UR r9 = ucz.A02;
                C18065Vkr A0T = ucz.A0T();
                VGV.A00(ucz.A02, userSession, ucz.A0O(z), (C19516Wb2) tag, A0T, uw7, urb, r9);
                return;
            }
        } else if (this instanceof C15448Ucy) {
            C15448Ucy ucy = (C15448Ucy) this;
            UserSession userSession2 = ucy.A01;
            View view2 = ucy.A00;
            if (view2 != null) {
                Object tag2 = view2.getTag();
                0qQ.A0C(tag2, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.lightbox.LightboxFeedVideoViewBinder.Holder");
                VWT vwt = (VWT) tag2;
                C16272UrZ urZ = ucy.A03;
                Uw7 uw72 = Uw7.PLAYING;
                AnonymousClass4UR r10 = ucy.A02;
                C18065Vkr A0T2 = ucy.A0T();
                AnonymousClass4DU r4 = ucy.A02;
                C19569Wbt A0O = ucy.A0O(z);
                AnonymousClass7TG.A1N(userSession2, vwt);
                C51974G9v.A1S(urZ, uw72, r10, A0T2, r4);
                0qQ.A0B(A0O, 7);
                VGQ.A00(userSession2, A0O, vwt.A00, urZ);
                VGP.A00(userSession2, A0O, vwt.A01, urZ);
                VGW.A00(r4, A0O, vwt.A02, A0T2, uw72, urZ, r10, urZ.A00);
                return;
            }
        } else if (this instanceof C15447Ucx) {
            C15447Ucx ucx = (C15447Ucx) this;
            AnonymousClass4DU r42 = ucx.A02;
            UserSession userSession3 = ucx.A01;
            View view3 = ucx.A00;
            if (view3 != null) {
                Object tag3 = view3.getTag();
                0qQ.A0C(tag3, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.lightbox.LightboxStoryPhotoViewBinder.Holder");
                C16274Urb urb2 = ucx.A03;
                VGU.A00(r42, userSession3, ucx.A0O(z), (C19515Wb1) tag3, urb2);
                return;
            }
        } else {
            C15446Ucw ucw = (C15446Ucw) this;
            View view4 = ucw.A00;
            if (view4 != null) {
                Object tag4 = view4.getTag();
                0qQ.A0C(tag4, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.lightbox.LightboxProductVideoViewBinder.Holder");
                C16271UrY urY = ucw.A03;
                Uw7 uw73 = Uw7.PLAYING;
                C18065Vkr A0T3 = ucw.A0T();
                VGS.A00(ucw.A02, ucw.A01, ucw.A0O(z), (VYX) tag4, A0T3, uw73, urY);
                return;
            }
        }
        0qQ.A0F("viewContent");
        throw AnonymousClass00P.createAndThrow();
    }

    public C15667UgY(C307786Rm r3, C276544tV r4, UserSession userSession, AnonymousClass4DU r6, C18001Vjd vjd) {
        super(r3, r4);
        this.A05 = r4;
        this.A04 = r3;
        this.A06 = userSession;
        this.A07 = r6;
        this.A08 = vjd;
    }

    public final C19569Wbt A0O(boolean z) {
        C234372xl r7;
        UserSession A0Q = A0Q();
        C307786Rm A0P = A0P();
        AnonymousClass4DU A0S = A0S();
        if (z) {
            r7 = (C234372xl) this.A03.getValue();
        } else {
            r7 = null;
        }
        AnonymousClass4UR r6 = this.A02;
        C18065Vkr vkr = this.A01;
        if (vkr == null) {
            vkr = null;
        }
        GA1 ga1 = new GA1(18, this, z);
        AnonymousClass7TG.A1T(A0Q, A0P, A0S);
        0qQ.A0B(r6, 4);
        return new C19569Wbt(A0P, A0Q, A0S, vkr, r6, r7, ga1);
    }
}
