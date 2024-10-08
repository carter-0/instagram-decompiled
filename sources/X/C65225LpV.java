package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LpV  reason: case insensitive filesystem */
public final class C65225LpV implements MVS {
    public C60076JfA A00;
    public final C62674Kka A01 = C62674Kka.A08;
    public final AnonymousClass80P A02 = AnonymousClass80P.CHOOSE_LOCATIONS;
    public final AnonymousClass4DH A03;
    public final 1wn A04 = C64698LgT.A00(this, 54);
    public final UserSession A05;
    public final C66576MXh A06;
    public final C62462KgC A07;
    public final String A08;
    public final boolean A09;

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
    }

    public static final String A00(C65225LpV lpV, List list, boolean z) {
        String string;
        if (z) {
            string = DbV.A05(lpV.A03).getQuantityString(R.plurals.on_x_countries, list.size(), AnonymousClass7TF.A1b(list.size()));
        } else {
            string = lpV.A03.getString(2131973425);
        }
        0qQ.A07(string);
        return string;
    }

    public final View ANH() {
        AnonymousClass4DH r4 = this.A03;
        Context requireContext = r4.requireContext();
        UserSession userSession = this.A05;
        1Av A002 = 1Au.A00(userSession);
        String str = this.A08;
        ArrayList A1D = AnonymousClass7TE.A1D(00k.A0X(A002.A0I(str)));
        boolean A24 = A002.A24(str);
        LXU lxu = new LXU(0, A1D, this, A24);
        Integer num = null;
        if (this.A09) {
            num = Integer.valueOf(R.drawable.instagram_location_pano_outline_24);
        }
        String A003 = A00(this, A1D, A24);
        C60076JfA jfA = new C60076JfA(requireContext);
        jfA.setTitle(requireContext.getResources().getString(2131973426));
        jfA.setInlineSubtitle(A003);
        AnonymousClass0fU.A00(lxu, jfA);
        if (num != null) {
            jfA.setIcon(JTP.A0E(requireContext, num));
        }
        JTS.A0x(jfA);
        this.A00 = jfA;
        jfA.setDescription(r4.getString(2131973424));
        if (this.A07 == C62462KgC.FEED) {
            AnonymousClass1Nd.A00(userSession).A01(this.A04, C64639LfR.class);
            r4.mLifecycleRegistry.A09(new C64302LZc(this, 1));
        }
        C60076JfA jfA2 = this.A00;
        if (jfA2 != null) {
            return jfA2;
        }
        0qQ.A0F("geoGatingRow");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return this.A01;
    }

    public final AnonymousClass80P BHl() {
        return this.A02;
    }

    public C65225LpV(AnonymousClass4DH r2, UserSession userSession, C66576MXh mXh, C62462KgC kgC, String str, boolean z) {
        C51974G9v.A1L(r2, userSession, mXh);
        this.A03 = r2;
        this.A05 = userSession;
        this.A09 = z;
        this.A06 = mXh;
        this.A08 = str;
        this.A07 = kgC;
    }
}
