package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.Iterator;
import java.util.List;

public final class K63 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, C66499MUd {
    public static final String __redex_internal_original_name = "AiCreationEditingFragment";
    public 2da A00;
    public final AnonymousClass0eM A01 = C66301MMk.A00(this, 48);
    public final AnonymousClass0eM A02 = C66301MMk.A00(this, 49);
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04 = DbS.A0I(new MMM(this, 0), new MMM(this, 1), MMV.A00((Object) null, this, 18), JTT.A0w());

    public final String getModuleName() {
        return "ai_creation_editing_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String str3 = null;
        AnonymousClass7TE.A1Z(new C59676JTh((Object) this, (AnonymousClass4D7) null, 40), DbV.A0J(this));
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("AiStudioArgumentKeys.creation_ai_description");
        } else {
            str = null;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str2 = bundle3.getString("AiStudioArgumentKeys.creation_ai_campaign_id");
        } else {
            str2 = null;
        }
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str3 = bundle4.getString("AiStudioArgumentKeys.creation_ai_condition");
        }
        AnonymousClass0eM r4 = this.A02;
        LTH A0T = JTO.A0T(r4);
        String A012 = C60316JjJ.A01(this.A04);
        AnonymousClass0eM r6 = this.A03;
        boolean A06 = 182.A06(0Tu.A05, AnonymousClass7TF.A0L(r6, 0), 36324076023721742L);
        1Ln A002 = LTH.A00(A0T);
        if (DbT.A1Y(A002)) {
            A002.A0l("edit_ai_details_screen_shown");
            A002.A0v(A012);
            A002.A0x(0Yt.A06(AnonymousClass7TH.A0h("condition", str3, AnonymousClass7TE.A1L("skip_pre_publish_screen", String.valueOf(A06)), AnonymousClass7TE.A1L(DevServerEntity.COLUMN_DESCRIPTION, str), AnonymousClass7TE.A1L("campaign_id", str2))));
            A002.Cgf();
        }
        if (LST.A03(AnonymousClass7TE.A0l(r6))) {
            1Ln A022 = LTH.A02(r4);
            if (DbT.A1Y(A022)) {
                A022.A0l("edit_ai_details_screen_field_regeneration_icon_rendered");
                A022.Cgf();
            }
        }
    }

    public final void CwS(String str) {
        JTO.A0R(this.A04).A0A(str);
    }

    public final void D4E() {
        KX0 kx0 = JTO.A0R(this.A04).A00;
        JTP.A1W(kx0.A0K, C63112Krf.A00(kx0.A03));
    }

    public final void DkV(boolean z) {
        JTO.A0R(this.A04).A0E(z);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final boolean onBackPressed() {
        AnonymousClass0eM r4 = this.A04;
        KX0 kx0 = JTO.A0R(r4).A00;
        kx0.A0Q.Epw(false);
        kx0.A0R.Epw(false);
        List list = kx0.A06;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JTU.A1O(it);
        }
        list.clear();
        AnonymousClass7I6 A0U = JTO.A0U(kx0.A09);
        Integer num = AnonymousClass05K.A0C;
        A0U.A02(num);
        LTH A0T = JTO.A0T(this.A02);
        String str = (String) JTO.A0R(r4).A0R.getValue();
        boolean A0H = JTO.A0R(r4).A0H();
        boolean A0J = JTO.A0R(r4).A0J();
        boolean A0I = JTO.A0R(r4).A0I();
        String A012 = C60316JjJ.A01(r4);
        1Ln A002 = LTH.A00(A0T);
        if (DbT.A1Y(A002)) {
            A002.A0j(JTU.A0W(A002, "edit_ai_details_back_clicked", str));
            JTT.A1I(A002, A012, DbY.A0q("is_name_changed", String.valueOf(A0I), AnonymousClass7TE.A1L("is_description_changed", String.valueOf(A0H)), AnonymousClass7TE.A1L("is_tagline_changed", String.valueOf(A0J))));
        }
        AnonymousClass0eM r2 = this.A01;
        JTO.A0U(r2).A05("quick_create_dismissed");
        JTO.A0U(r2).A03(num);
        if (LST.A04(AnonymousClass7TE.A0l(this.A03))) {
            KX0 kx02 = JTO.A0R(r4).A00;
            JTT.A1X(kx02.A0W, kx02.A0C);
        }
        return false;
    }

    public final void configureActionBar(2da r6) {
        boolean z;
        boolean A1T = JTU.A1T(r6);
        r6.Eom(2131952696);
        AnonymousClass0eM r1 = this.A03;
        if (LST.A04(AnonymousClass7TE.A0l(r1))) {
            LYC.A01(r6, this, 4, 2131960992);
            z = ((C53366Gmq) JTO.A0R(this.A04).A0J.getValue()).A0C;
        } else {
            if (!182.A06(0Tu.A05, AnonymousClass7TF.A0L(r1, A1T ? 1 : 0), 36324076023721742L)) {
                LYC.A01(r6, this, 5, 2131968361);
                z = ((C53366Gmq) JTO.A0R(this.A04).A0J.getValue()).A0D;
            } else {
                return;
            }
        }
        r6.ARb(A1T, z);
        this.A00 = r6;
    }

    public final void onCreate(Bundle bundle) {
        String string;
        int A022 = AnonymousClass0fD.A02(-1990977974);
        K63.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str = null;
        if (!(bundle2 == null || (string = bundle2.getString("AiStudioArgumentKeys.creation_ai_description")) == null)) {
            AnonymousClass0eM r4 = this.A04;
            C60316JjJ A0R = JTO.A0R(r4);
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                str = bundle3.getString(AnonymousClass000.A00(868));
            }
            A0R.A00.A06((ImageUrl) null, string, str, A0R.A02, (String) null, (String) null, (String) null, false);
            JTO.A0R(r4).A00.A0B.Epw(string);
        }
        AnonymousClass0fD.A09(-1667082070, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2031078516);
        ComposeView A0H = DbV.A0H(this, new MPO(this, 37), -1236881664);
        AnonymousClass0fD.A09(1498329586, A022);
        return A0H;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1584986340);
        super.onDestroyView();
        JTO.A0R(this.A04).A00.A05();
        AnonymousClass0fD.A09(-667744503, A022);
    }
}
