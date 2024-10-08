package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public final class E4K extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "TwoFacFinishFragment";
    public Integer A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass0eM A09 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        r2.Eom(2131975687);
    }

    public final String getModuleName() {
        return Dbq.A02();
    }

    public static final void A00(E4K e4k) {
        Fragment A022;
        AnonymousClass0eM r5 = e4k.A09;
        FCE.A00(AnonymousClass7TE.A0l(r5), AnonymousClass05K.A0u);
        AnonymousClass1WZ A012 = FFR.A01();
        if (e4k.A07) {
            A012.A00();
            Bundle requireArguments = e4k.requireArguments();
            A022 = new C47470E3u();
            A022.setArguments(requireArguments);
        } else {
            boolean z = e4k.A04;
            F3Y A002 = A012.A00();
            if (z) {
                A022 = A002.A00((ArrayList) null, false);
            } else {
                A022 = A002.A02(AnonymousClass05K.A0j, true, !e4k.requireArguments().getBoolean("has_two_fac_already_on"));
            }
        }
        C309516Yo A0P = DbZ.A0P(e4k, r5);
        A0P.A0B((Bundle) null, A022);
        A0P.A04();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public final boolean onBackPressed() {
        A00(this);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0076, code lost:
        if (r2 == false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = 717269313(0x2ac0a941, float:3.4223495E-13)
            int r3 = X.AnonymousClass0fD.A02(r0)
            X.E4K.super.onCreate(r10)
            android.os.Bundle r7 = r9.requireArguments()
            r4 = 0
            r1 = 33
            r0 = 94
            java.lang.String r0 = X.Dbq.A05(r4, r1, r0)
            boolean r0 = r7.getBoolean(r0)
            r9.A04 = r0
            java.lang.String r0 = "has_phone_number_confirmed"
            boolean r0 = r7.getBoolean(r0)
            r9.A02 = r0
            java.lang.String r0 = X.Dbq.A00()
            java.lang.String r1 = ""
            java.lang.String r0 = r7.getString(r0, r1)
            r9.A01 = r0
            java.lang.String r0 = "has_two_fac_already_on"
            boolean r0 = r7.getBoolean(r0)
            r9.A03 = r0
            java.lang.String r0 = "two_fac_enable_method"
            java.lang.String r8 = X.DbT.A0w(r7, r0, r1)
            r0 = 4
            java.lang.Integer[] r6 = X.AnonymousClass05K.A00(r0)
            int r5 = r6.length
            r2 = 0
        L_0x0046:
            if (r2 >= r5) goto L_0x0057
            r1 = r6[r2]
            java.lang.String r0 = X.C48977EnF.A00(r1)
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 != 0) goto L_0x0059
            int r2 = r2 + 1
            goto L_0x0046
        L_0x0057:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
        L_0x0059:
            r9.A00 = r1
            java.lang.String r0 = "is_eligible_for_whatsapp_two_factor"
            boolean r2 = r7.getBoolean(r0)
            r9.A05 = r2
            java.lang.Integer r1 = r9.A00
            if (r1 != 0) goto L_0x0071
            java.lang.String r0 = "twoFacEnableMethod"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0071:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0078
            r0 = 1
            if (r2 != 0) goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            r9.A06 = r0
            java.lang.String r0 = "is_eligible_for_multiple_totp"
            boolean r0 = r7.getBoolean(r0)
            r9.A08 = r0
            X.0eM r2 = r9.A09
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r0 = "confirm"
            X.FCE.A02(r1, r0)
            X.0lg r1 = X.AnonymousClass7TF.A0L(r2, r4)
            X.0iw r0 = X.C49852F9r.A01
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r1)
            java.lang.String r0 = "instagram_two_fac_setup_complete"
            X.0Aj r0 = X.AnonymousClass7TE.A0e(r1, r0)
            X.Dbc.A0W(r0)
            r0.Cgf()
            r0 = 733057867(0x2bb1934b, float:1.2617488E-12)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E4K.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0094, code lost:
        if (r11.A07 == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0125, code lost:
        if (r1 != X.AnonymousClass05K.A01) goto L_0x0127;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r12, android.view.ViewGroup r13, android.os.Bundle r14) {
        /*
            r11 = this;
            r0 = -1713004003(0xffffffff99e5a21d, float:-2.3743522E-23)
            int r4 = X.AnonymousClass0fD.A02(r0)
            r3 = 0
            X.0qQ.A0B(r12, r3)
            r0 = 2131629734(0x7f0e16a6, float:1.8886797E38)
            r2 = 0
            android.view.View r5 = r12.inflate(r0, r13, r3)
            r0 = 2131430744(0x7f0b0d58, float:1.8483198E38)
            android.widget.TextView r8 = X.AnonymousClass7TG.A0R(r5, r0)
            r0 = 2131430688(0x7f0b0d20, float:1.8483084E38)
            android.widget.TextView r6 = X.AnonymousClass7TG.A0R(r5, r0)
            boolean r0 = r11.A04
            java.lang.String r10 = "twoFacEnableMethod"
            if (r0 == 0) goto L_0x0103
            r7 = 2131975693(0x7f135e0d, float:1.9588485E38)
        L_0x002a:
            X.DbU.A1G(r8, r11, r7)
            java.lang.Integer r1 = r11.A00
            if (r1 == 0) goto L_0x0042
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x004e
            boolean r0 = r11.A02
            if (r0 != 0) goto L_0x004a
            r1 = 2131975688(0x7f135e08, float:1.9588475E38)
            java.lang.String r0 = r11.A01
            if (r0 != 0) goto L_0x0056
            java.lang.String r10 = "phoneNumber"
        L_0x0042:
            X.0qQ.A0F(r10)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x004a:
            r0 = 2131975689(0x7f135e09, float:1.9588477E38)
            goto L_0x0051
        L_0x004e:
            r0 = 2131975690(0x7f135e0a, float:1.958848E38)
        L_0x0051:
            java.lang.String r0 = r11.getString(r0)
            goto L_0x005e
        L_0x0056:
            java.lang.String r0 = X.FGN.A00(r0)
            java.lang.String r0 = X.DbV.A0z(r11, r0, r1)
        L_0x005e:
            r6.setText(r0)
            r0 = 2131435356(0x7f0b1f5c, float:1.8492552E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r5, r0)
            r0 = 43
            X.FP3.A00(r1, r0, r11)
            r0 = 2131432000(0x7f0b1240, float:1.8485745E38)
            android.view.View r9 = X.AnonymousClass7TF.A0F(r5, r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r9 = (com.instagram.ui.widget.progressbutton.ProgressButton) r9
            r0 = 44
            X.FP3.A00(r9, r0, r11)
            r0 = 2131444017(0x7f0b4131, float:1.8510118E38)
            android.view.View r6 = X.AnonymousClass7TF.A0G(r5, r0)
            boolean r0 = r11.A06
            int r0 = X.DbW.A01(r0)
            r6.setVisibility(r0)
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x0096
            boolean r1 = r11.A07
            r0 = 2131968361(0x7f134169, float:1.9573614E38)
            if (r1 != 0) goto L_0x0099
        L_0x0096:
            r0 = 2131960992(0x7f1324a0, float:1.9558668E38)
        L_0x0099:
            r9.setText((int) r0)
            X.Mz1 r8 = new X.Mz1
            r8.<init>(r6)
            r7 = 2131975805(0x7f135e7d, float:1.9588713E38)
            X.FQM r6 = X.FQM.A00
            r1 = 1
            X.FdT r0 = new X.FdT
            r0.<init>(r1, r9, r11)
            X.PR9 r1 = new X.PR9
            r1.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r6, (X.C358618bC) r0, (int) r7, (boolean) r3)
            r0 = 2131975804(0x7f135e7c, float:1.958871E38)
            r1.A02 = r0
            r0 = 0
            X.O31.A00(r0, r8, r0, r1)
            r0 = 2131432904(0x7f0b15c8, float:1.8487579E38)
            android.widget.TextView r6 = X.AnonymousClass7TG.A0R(r5, r0)
            java.lang.Integer r1 = r11.A00
            if (r1 == 0) goto L_0x0042
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0100
            boolean r0 = r11.A08
            if (r0 == 0) goto L_0x0100
        L_0x00cd:
            r6.setVisibility(r2)
            r0 = 2131975692(0x7f135e0c, float:1.9588483E38)
            java.lang.String r3 = X.DbU.A0m(r11, r0)
            r0 = 2131975691(0x7f135e0b, float:1.9588481E38)
            java.lang.String r2 = r11.getString(r0)
            androidx.fragment.app.FragmentActivity r1 = r11.requireActivity()
            android.content.Context r0 = r11.getContext()
            int r0 = X.2Yu.A0D(r0)
            int r1 = r1.getColor(r0)
            X.ESx r0 = new X.ESx
            r0.<init>((X.E4K) r11, (int) r1)
            X.AnonymousClass7AV.A07(r0, r6, r3, r2)
            X.Dbb.A1N(r11)
            r0 = -946771680(0xffffffffc7916920, float:-74450.25)
            X.AnonymousClass0fD.A09(r0, r4)
            return r5
        L_0x0100:
            r2 = 8
            goto L_0x00cd
        L_0x0103:
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x0118
            boolean r0 = r11.A03
            if (r0 == 0) goto L_0x0118
            java.lang.Integer r1 = r11.A00
            if (r1 == 0) goto L_0x0042
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0118
            r7 = 2131975695(0x7f135e0f, float:1.958849E38)
            goto L_0x002a
        L_0x0118:
            boolean r0 = r11.A03
            if (r0 == 0) goto L_0x0127
            java.lang.Integer r1 = r11.A00
            if (r1 == 0) goto L_0x0042
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r7 = 2131975696(0x7f135e10, float:1.9588492E38)
            if (r1 == r0) goto L_0x002a
        L_0x0127:
            r7 = 2131975694(0x7f135e0e, float:1.9588488E38)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E4K.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
