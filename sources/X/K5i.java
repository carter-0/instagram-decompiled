package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class K5i extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AiEditProfilePictureFragment";
    public 2da A00;
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new MMM(this, 39));
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03 = DbS.A0I(new MMM(this, 41), new MMM(this, 42), MMV.A00((Object) null, this, 34), JTT.A0v());
    public final String A04 = "ai_edit_profile_picture_fragment";

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LTH A0T = JTO.A0T(this.A01);
        String A022 = C60315JjI.A02(this.A03);
        1Ln A002 = LTH.A00(A0T);
        if (DbT.A1Y(A002)) {
            A002.A0j(JTU.A0W(A002, "settings_main_screen_edit_profile_picture_screen_shown", A022));
            A002.Cgf();
        }
    }

    public final String getModuleName() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (X.0qQ.A0K(r2, r0) == false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r6 = this;
            X.0eM r0 = r6.A01
            X.LTH r0 = X.JTO.A0T(r0)
            X.0eM r5 = r6.A03
            java.lang.String r2 = X.C60315JjI.A02(r5)
            X.1Ln r1 = X.LTH.A00(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = "settings_main_screen_edit_profile_picture_screen_back_clicked"
            java.lang.Long r0 = X.JTU.A0W(r1, r0, r2)
            r1.A0j(r0)
            r1.Cgf()
        L_0x0022:
            X.JjI r0 = X.JTO.A0S(r5)
            com.instagram.aistudio.editor.AiSettingsRepository r4 = r0.A00
            X.0Ud r0 = r4.A0t
            java.lang.Object r0 = r0.getValue()
            X.Jv2 r0 = (X.C61005Jv2) r0
            if (r0 == 0) goto L_0x0077
            X.MPk r3 = r0.A01
            java.lang.String r2 = r0.A02
            X.Jvz r1 = com.instagram.aistudio.editor.AiSettingsRepository.A00(r4)
            r0 = 0
            if (r1 == 0) goto L_0x0075
            java.lang.String r1 = r1.A05
        L_0x003f:
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x005d
            boolean r1 = r3 instanceof X.C61090Jx1
            if (r1 == 0) goto L_0x0077
            X.Jx1 r3 = (X.C61090Jx1) r3
            com.instagram.common.typedurl.ImageUrl r2 = r3.A00
            X.05G r1 = r4.A08
            X.Jvz r1 = X.JTP.A0M(r1)
            if (r1 == 0) goto L_0x0057
            com.instagram.common.typedurl.ImageUrl r0 = r1.A01
        L_0x0057:
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x0077
        L_0x005d:
            android.content.Context r4 = r6.requireContext()
            r3 = 2131952805(0x7f1304a5, float:1.9542063E38)
            r2 = 2131952804(0x7f1304a4, float:1.9542061E38)
            r0 = 40
            X.MMM r1 = new X.MMM
            r1.<init>(r6, r0)
            X.MJk r0 = X.C66229MJk.A00
            X.C63005Kpv.A00(r4, r1, r0, r3, r2)
        L_0x0073:
            r0 = 1
            return r0
        L_0x0075:
            r1 = r0
            goto L_0x003f
        L_0x0077:
            X.JjI r0 = X.JTO.A0S(r5)
            com.instagram.aistudio.editor.AiSettingsRepository r2 = r0.A00
            X.4Co r0 = r2.A01
            r1 = 0
            if (r0 == 0) goto L_0x0085
            r0.AG7(r1)
        L_0x0085:
            X.05G r0 = r2.A0V
            r0.Epw(r1)
            X.DbT.A1I(r6)
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K5i.onBackPressed():boolean");
    }

    public final void configureActionBar(2da r4) {
        boolean A1T = JTU.A1T(r4);
        r4.Eom(2131952760);
        LYC.A01(r4, this, 7, 2131960992);
        r4.ARb(A1T ? 1 : 0, ((C61005Jv2) JTO.A0S(this.A03).A0G.getValue()).A01 instanceof C61090Jx1);
        this.A00 = r4;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1526066702);
        ComposeView A0H = DbV.A0H(this, new MPO(this, 44), 747818278);
        AnonymousClass0fD.A09(-708814513, A022);
        return A0H;
    }
}
