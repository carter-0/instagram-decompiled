package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.ERx  reason: case insensitive filesystem */
public final class C48033ERx extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "HelpOptionsFragment";
    public UserSession A00;

    public final String getModuleName() {
        return "settings_help_options";
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void configureActionBar(2da r4) {
        r4.Eom(2131964367);
        0hq r0 = this.mFragmentManager;
        r0.getClass();
        r4.Eu4(AnonymousClass7TF.A1R(r0.A0M()));
        F3V f3v = new F3V(AnonymousClass05K.A00);
        f3v.A06 = DbV.A06(requireContext(), 2Yu.A0B(requireContext()));
        r4.ErJ(f3v.A00());
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1914170046);
        super.onCreate(bundle);
        this.A00 = DbX.A0U(this);
        AnonymousClass0fD.A09(-1251962069, A02);
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(1054470077);
        super.onResume();
        AnonymousClass0fD.A09(-1398256309, A02);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EyH eyH = new EyH(this.A00, this);
        ArrayList A1C = AnonymousClass7TE.A1C();
        C47518E6c e6c = eyH.A02;
        C47518E6c.A02(e6c.requireContext(), eyH, A1C, 14, 2131972206);
        UserSession userSession = eyH.A00;
        0Tu r7 = 0Tu.A05;
        if (182.A06(r7, userSession, 36312943465334320L)) {
            C47518E6c.A02(e6c.requireContext(), eyH, A1C, 17, 2131957139);
        }
        C47518E6c.A02(e6c.requireContext(), eyH, A1C, 16, 2131964368);
        boolean A002 = C324536zU.A00(userSession);
        C50989Fmc A003 = C50989Fmc.A00(e6c.requireContext(), new C50100FOq(13, (Object) eyH, A002), 2131974799);
        A003.A09 = A002;
        A1C.add(A003);
        C47518E6c.A02(e6c.requireContext(), eyH, A1C, 15, 2131969740);
        if (182.A06(r7, userSession, 36312900515661345L) && 2Ek.A01(DbT.A0j(userSession))) {
            0qQ.A0B(userSession, 0);
            F20 f20 = (F20) userSession.A01(F20.class, new C51793G2c(userSession, 35));
            f20.A00("monetization_help", "impression", "entrypoint");
            C50989Fmc.A02(e6c.requireContext(), new FPG(61, (Object) eyH, (Object) f20), A1C, 2131966702);
        }
        setItems(A1C);
    }
}
