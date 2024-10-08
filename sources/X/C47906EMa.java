package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.nux.fragment.OneTapLoginLandingFragment;
import com.instagram.user.model.User;

/* renamed from: X.EMa  reason: case insensitive filesystem */
public final class C47906EMa extends C47907EMb {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47906EMa(Fragment fragment, AnonymousClass0iw r11, AnonymousClass0aP r12, G8H g8h, C46634DiE diE, Object obj, Object obj2, String str, String str2, int i) {
        super(fragment, r11, r12, g8h, diE, str, str2);
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void A03(UserSession userSession, User user) {
        UserSession userSession2 = userSession;
        if (1 - this.A00 == 0 && ((C49557Exs) this.A02).A02) {
            C319606qt A012 = C319606qt.A01(userSession);
            String id = user.getId();
            E6S e6s = (E6S) this.A01;
            A012.A09(e6s.A00, e6s, userSession2, AnonymousClass05K.A05, id, true);
        }
        super.A03(userSession, user);
    }

    public final void A04(EM4 em4) {
        if (this.A00 != 0) {
            super.A04(em4);
            return;
        }
        int A03 = AnonymousClass0fD.A03(2090869750);
        super.A04(em4);
        F42.A01(((E6S) this.A01).A02, ((C49537ExJ) this.A02).A00.A01.getId(), "okay", true);
        AnonymousClass0fD.A0A(1493190370, A03);
    }

    public final void onFail(C268654dm r6) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(1589620740);
                super.onFail(r6);
                F42.A01(((E6S) this.A01).A02, ((C49537ExJ) this.A02).A00.A01.getId(), "in progress", false);
                i2 = -1054254429;
                break;
            case 2:
                i = AnonymousClass0fD.A03(1786912121);
                super.onFail(r6);
                1XP r1 = (1XP) r6.A00();
                if ((r6 instanceof C268674do) && r1 != null && r1.hasErrorType("invalid_one_tap_nonce")) {
                    OneTapLoginLandingFragment oneTapLoginLandingFragment = (OneTapLoginLandingFragment) this.A01;
                    C319606qt A012 = C319606qt.A01(oneTapLoginLandingFragment.A00);
                    C319646qx r12 = (C319646qx) this.A02;
                    A012.A0G(r12.A06);
                    if (!oneTapLoginLandingFragment.A04 && !oneTapLoginLandingFragment.getActivity().isFinishing() && !oneTapLoginLandingFragment.getActivity().isDestroyed()) {
                        DbT.A15();
                        String str = r12.A07;
                        Bundle A0a = AnonymousClass7TE.A0a();
                        A0a.putString("com.instagram.android.login.fragment.ARGUMENT_OMNISTRING", str);
                        E54 e54 = new E54();
                        Dbb.A14(e54, DbU.A0I(A0a, e54, oneTapLoginLandingFragment), oneTapLoginLandingFragment.A00);
                    }
                }
                i2 = 334898884;
                break;
            default:
                C47906EMa.super.onFail(r6);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (this.A00 != 0) {
            C47906EMa.super.onSuccess(obj);
        } else {
            AnonymousClass0fD.A0A(637099992, C47695EDe.A00(this, obj, 216970723));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47906EMa(Fragment fragment, AnonymousClass0iw r11, AnonymousClass0aP r12, G8H g8h, OneTapLoginLandingFragment oneTapLoginLandingFragment, C319646qx r15, C46634DiE diE, String str, String str2) {
        super(fragment, r11, r12, g8h, diE, str, str2);
        this.A00 = 2;
        this.A01 = oneTapLoginLandingFragment;
        this.A02 = r15;
    }
}
