package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class E1Z extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AccountPrivacySwitchBottomSheetFragment";
    public C49394Euw A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass0iw A04 = DbS.A0O("privacy_switch_bottom_sheet");
    public final String A05 = "999+";
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(new C13998To0(this, 28));

    public final String getModuleName() {
        return "privacy_switch_bottom_sheet";
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            r9 = this;
            r3 = 0
            X.0qQ.A0B(r10, r3)
            super.onViewCreated(r10, r11)
            r0 = 2131427452(0x7f0b007c, float:1.847652E38)
            X.3oV r0 = X.DbV.A0T(r10, r0, r3)
            android.view.View r2 = r0.getView()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            boolean r1 = r9.A02
            boolean r0 = r9.A03
            if (r1 != 0) goto L_0x007a
            if (r0 == 0) goto L_0x0182
            android.content.Context r1 = r9.requireContext()
            r5 = 0
            r0 = 6
            X.FGX r4 = new X.FGX
            r4.<init>((android.content.Context) r1, (java.lang.Boolean) r5, (int) r0)
            android.content.res.Resources r1 = X.DbV.A05(r9)
            r0 = 2131972382(0x7f13511e, float:1.958177E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 2131238690(0x7f081f22, float:1.8093666E38)
            android.content.res.Resources r1 = X.FGX.A00(r9, r4, r5, r1, r0)
            r0 = 2131973398(0x7f135516, float:1.958383E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 2131238858(0x7f081fca, float:1.8094007E38)
            android.content.res.Resources r1 = X.FGX.A00(r9, r4, r5, r1, r0)
            r0 = 2131972383(0x7f13511f, float:1.9581772E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 2131238703(0x7f081f2f, float:1.8093692E38)
            android.content.res.Resources r1 = X.FGX.A00(r9, r4, r5, r1, r0)
            r0 = 2131972384(0x7f135120, float:1.9581774E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 2131238771(0x7f081f73, float:1.809383E38)
            r4.A05(r5, r1, r0)
            java.util.List r0 = r4.A04()
            java.util.Iterator r1 = r0.iterator()
        L_0x006a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0249
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            r2.addView(r0)
            goto L_0x006a
        L_0x007a:
            if (r0 == 0) goto L_0x00f4
            android.content.Context r1 = r9.requireContext()
            r7 = 0
            r0 = 6
            X.FGX r6 = new X.FGX
            r6.<init>((android.content.Context) r1, (java.lang.Boolean) r7, (int) r0)
            android.content.res.Resources r1 = X.DbV.A05(r9)
            r0 = 2131973408(0x7f135520, float:1.958385E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 2131238690(0x7f081f22, float:1.8093666E38)
            android.content.res.Resources r1 = X.FGX.A00(r9, r6, r7, r1, r0)
            r0 = 2131973406(0x7f13551e, float:1.9583847E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 2131238858(0x7f081fca, float:1.8094007E38)
            android.content.res.Resources r1 = X.FGX.A00(r9, r6, r7, r1, r0)
            r0 = 2131973407(0x7f13551f, float:1.9583849E38)
            java.lang.String r8 = r1.getString(r0)
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x00cb
            X.0eM r0 = r9.A06
            X.0lg r5 = X.AnonymousClass7TF.A0L(r0, r3)
            X.0Tu r4 = X.0Tu.A05
            r0 = 36318956419619596(0x8107e600011b0c, double:3.0315925122419626E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x00cb
            r0 = 2131238210(0x7f081d42, float:1.8092692E38)
            r6.A05(r7, r8, r0)
        L_0x00cb:
            android.content.res.Resources r1 = X.DbV.A05(r9)
            r0 = 2131972385(0x7f135121, float:1.9581776E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 2131238703(0x7f081f2f, float:1.8093692E38)
            r6.A05(r7, r1, r0)
            java.util.List r0 = r6.A04()
            java.util.Iterator r1 = r0.iterator()
        L_0x00e4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02a4
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            r2.addView(r0)
            goto L_0x00e4
        L_0x00f4:
            r4 = 2131428960(0x7f0b0660, float:1.847958E38)
            X.Dbb.A0t(r10, r4, r3)
            android.view.View r0 = r10.requireViewById(r4)
            r6 = 2131430696(0x7f0b0d28, float:1.84831E38)
            android.widget.ImageView r2 = X.DbX.A0J(r0, r6)
            android.content.Context r1 = r9.requireContext()
            r0 = 2131238638(0x7f081eee, float:1.809356E38)
            X.DbU.A13(r1, r2, r0)
            android.view.View r0 = r10.requireViewById(r4)
            r5 = 2131430690(0x7f0b0d22, float:1.8483088E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r0, r5)
            boolean r1 = r9.A02
            r0 = 2131973411(0x7f135523, float:1.9583857E38)
            if (r1 == 0) goto L_0x0124
            r0 = 2131973408(0x7f135520, float:1.958385E38)
        L_0x0124:
            X.DbU.A1G(r2, r9, r0)
            r4 = 2131428959(0x7f0b065f, float:1.8479577E38)
            X.Dbb.A0t(r10, r4, r3)
            android.view.View r0 = r10.requireViewById(r4)
            android.widget.ImageView r2 = X.DbX.A0J(r0, r6)
            android.content.Context r1 = r9.requireContext()
            r0 = 2131238148(0x7f081d04, float:1.8092567E38)
            X.DbU.A13(r1, r2, r0)
            android.view.View r0 = r10.requireViewById(r4)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r0, r5)
            r0 = 2131973406(0x7f13551e, float:1.9583847E38)
            r1.setText(r0)
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x02a4
            X.0eM r0 = r9.A06
            X.0lg r4 = X.AnonymousClass7TF.A0L(r0, r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318956419619596(0x8107e600011b0c, double:3.0315925122419626E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x02a4
            r0 = 2131428958(0x7f0b065e, float:1.8479575E38)
            android.view.View r4 = r10.requireViewById(r0)
            android.widget.ImageView r2 = X.DbU.A0F(r4, r6)
            android.content.Context r1 = r9.requireContext()
            r0 = 2131238210(0x7f081d42, float:1.8092692E38)
            X.DbU.A13(r1, r2, r0)
            android.widget.TextView r1 = X.DbU.A0G(r4, r5)
            r0 = 2131973407(0x7f13551f, float:1.9583849E38)
            goto L_0x023d
        L_0x0182:
            r0 = 2131428960(0x7f0b0660, float:1.847958E38)
            android.view.View r4 = r10.requireViewById(r0)
            r6 = 2131430696(0x7f0b0d28, float:1.84831E38)
            android.widget.ImageView r2 = X.DbU.A0F(r4, r6)
            android.content.Context r1 = r9.requireContext()
            r0 = 2131238690(0x7f081f22, float:1.8093666E38)
            X.DbU.A13(r1, r2, r0)
            r5 = 2131430690(0x7f0b0d22, float:1.8483088E38)
            android.widget.TextView r1 = X.DbU.A0G(r4, r5)
            r0 = 2131973399(0x7f135517, float:1.9583833E38)
            r1.setText(r0)
            r4.setVisibility(r3)
            r0 = 2131428959(0x7f0b065f, float:1.8479577E38)
            android.view.View r4 = r10.requireViewById(r0)
            android.widget.ImageView r2 = X.DbU.A0F(r4, r6)
            android.content.Context r1 = r9.requireContext()
            r0 = 2131238858(0x7f081fca, float:1.8094007E38)
            X.DbU.A13(r1, r2, r0)
            android.widget.TextView r1 = X.DbU.A0G(r4, r5)
            r0 = 2131973398(0x7f135516, float:1.958383E38)
            r1.setText(r0)
            r4.setVisibility(r3)
            r0 = 2131428956(0x7f0b065c, float:1.8479571E38)
            android.view.View r4 = r10.requireViewById(r0)
            android.widget.ImageView r2 = X.DbU.A0F(r4, r6)
            android.content.Context r1 = r9.requireContext()
            r0 = 2131238947(0x7f082023, float:1.8094187E38)
            X.DbU.A13(r1, r2, r0)
            android.widget.TextView r1 = X.DbU.A0G(r4, r5)
            r0 = 2131973396(0x7f135514, float:1.9583827E38)
            r1.setText(r0)
            r4.setVisibility(r3)
            r0 = 2131433027(0x7f0b1643, float:1.8487828E38)
            android.widget.TextView r2 = X.DbU.A0G(r4, r0)
            X.0eM r0 = r9.A06
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.EuM r0 = X.C49017Ent.A00(r0)
            int r1 = r0.A00
            r0 = 999(0x3e7, float:1.4E-42)
            if (r1 <= r0) goto L_0x0244
            java.lang.String r0 = r9.A05
        L_0x0207:
            r2.setText(r0)
            r2.setVisibility(r3)
            r0 = 2131433025(0x7f0b1641, float:1.8487824E38)
            android.widget.ImageView r1 = X.DbU.A0F(r4, r0)
            r0 = 102(0x66, float:1.43E-43)
            r1.setImageAlpha(r0)
            r1.setVisibility(r3)
            r0 = 54
            X.FP2.A00(r4, r0, r9)
            r0 = 2131428961(0x7f0b0661, float:1.8479581E38)
            android.view.View r4 = r10.requireViewById(r0)
            android.widget.ImageView r2 = X.DbU.A0F(r4, r6)
            android.content.Context r1 = r9.requireContext()
            r0 = 2131238703(0x7f081f2f, float:1.8093692E38)
            X.DbU.A13(r1, r2, r0)
            android.widget.TextView r1 = X.DbU.A0G(r4, r5)
            r0 = 2131973400(0x7f135518, float:1.9583835E38)
        L_0x023d:
            r1.setText(r0)
            r4.setVisibility(r3)
            goto L_0x02a4
        L_0x0244:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            goto L_0x0207
        L_0x0249:
            X.0eM r4 = r9.A06
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.EuM r0 = X.C49017Ent.A00(r0)
            int r5 = r0.A00
            if (r5 <= 0) goto L_0x029d
            X.0eM r0 = r9.A07
            java.lang.Object r1 = r0.getValue()
            X.0wc r1 = (X.0wc) r1
            java.lang.String r0 = "follow_request_entrypoint_impression"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "privacy_switch_bottom_sheet"
            X.DbS.A1O(r1, r0)
            r1.Cgf()
            r0 = 2131428957(0x7f0b065d, float:1.8479573E38)
            android.view.View r2 = r10.requireViewById(r0)
            r2.setVisibility(r3)
            r0 = 2131433027(0x7f0b1643, float:1.8487828E38)
            android.widget.TextView r1 = X.DbU.A0G(r2, r0)
            r0 = 999(0x3e7, float:1.4E-42)
            if (r5 <= r0) goto L_0x02bb
            java.lang.String r0 = r9.A05
        L_0x0284:
            r1.setText(r0)
            r0 = 53
            X.FP2.A00(r2, r0, r9)
            X.2eS.A01(r2)
            android.content.res.Resources r1 = X.DbV.A05(r9)
            r0 = 2131820961(0x7f1101a1, float:1.9274652E38)
            java.lang.String r0 = X.DbY.A0d(r1, r5, r0)
            r2.setContentDescription(r0)
        L_0x029d:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.C52345GOp.A06(r0)
        L_0x02a4:
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x02ba
            r0 = 2131428990(0x7f0b067e, float:1.847964E38)
            X.Dbb.A0t(r10, r0, r3)
            r0 = 2131428989(0x7f0b067d, float:1.8479638E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r10, r0)
            r0 = 8
            r1.setVisibility(r0)
        L_0x02ba:
            return
        L_0x02bb:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            goto L_0x0284
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1Z.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(372024924);
        E1Z.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = requireArguments.getBoolean("ARG_PRIVACY_SWITCH_TO_PRIVATE");
        this.A03 = DbT.A1X(requireArguments, "ARG_IS_REDESIGN");
        AnonymousClass0fD.A09(-1757357923, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(439125371);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.privacy_switch_bottom_sheet_redesigned_layout, viewGroup, false);
        AnonymousClass0fD.A09(1420095908, A022);
        return inflate;
    }
}
