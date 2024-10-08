package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class K0X extends QAN {
    public 0wc A00;
    public OWT A01;
    public OTD A02;
    public Integer A03;
    public UserSession A04;
    public 2Dm A05;
    public final 1a8 A06 = new 1a8((C269794fh) null);

    /* JADX WARNING: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            r14 = this;
            r13 = 0
            X.0qQ.A0B(r15, r13)
            r0 = 2131432554(0x7f0b146a, float:1.8486869E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r15, r0)
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.A01(r0)
            X.0qQ.A07(r2)
            r1 = 1
            r2.A0N = r1
            r2.A0b(r1)
            r0 = 3
            r2.A0W(r0)
            r10 = r14
            android.app.Dialog r3 = r14.A01
            if (r3 == 0) goto L_0x002b
            r2 = 12
            X.LV8 r0 = new X.LV8
            r0.<init>(r14, r2)
            r3.setOnDismissListener(r0)
        L_0x002b:
            android.os.Bundle r2 = r14.requireArguments()
            java.lang.String r3 = "thread_id"
            java.lang.String r12 = r2.getString(r3)
            java.lang.String r0 = "external_shared_text"
            java.lang.String r11 = r2.getString(r0)
            if (r12 == 0) goto L_0x021b
            X.2Dm r0 = r14.A05
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "threadStore"
        L_0x0043:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x004b:
            X.2Dr r0 = (X.2Dr) r0
            X.3U9 r9 = r0.A0N(r12)
            if (r9 == 0) goto L_0x021b
            java.lang.String r0 = "external_uri"
            android.os.Parcelable r7 = r2.getParcelable(r0)
            android.net.Uri r7 = (android.net.Uri) r7
            android.os.Bundle r0 = r14.requireArguments()
            java.lang.String r2 = "share_type"
            java.lang.String r4 = r0.getString(r2)
            if (r4 == 0) goto L_0x00af
            if (r11 == 0) goto L_0x00a2
            java.lang.String r0 = "text/plain"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00a2
            X.OWT r0 = r14.A01
            if (r0 == 0) goto L_0x020d
            boolean r0 = r0.A02(r11)
            java.lang.Integer r0 = X.C51967G9n.A0l(r0)
        L_0x007d:
            r14.A03 = r0
            r0 = 2131442728(0x7f0b3c28, float:1.8507504E38)
            android.widget.TextView r4 = X.DbU.A0G(r15, r0)
            java.lang.String r0 = r9.C6f()
            r4.setText(r0)
            r0 = 2131435702(0x7f0b20b6, float:1.8493254E38)
            android.widget.TextView r6 = X.DbU.A0G(r15, r0)
            android.content.res.Resources r5 = X.DbV.A05(r14)
            r4 = 2131959669(0x7f131f75, float:1.9555985E38)
            com.instagram.common.session.UserSession r0 = r14.A04
            if (r0 != 0) goto L_0x00b2
            java.lang.String r0 = "userSession"
            goto L_0x0043
        L_0x00a2:
            java.lang.String r0 = "image/"
            boolean r0 = X.00p.A0k(r4, r0, r13)
            if (r0 == 0) goto L_0x00af
            if (r7 == 0) goto L_0x00af
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x007d
        L_0x00af:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x007d
        L_0x00b2:
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r0)
            java.lang.String r0 = r0.getUsername()
            X.Dbb.A0m(r5, r6, r0, r4)
            r0 = 2131444057(0x7f0b4159, float:1.85102E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r15, r0)
            r0 = 2131441113(0x7f0b35d9, float:1.8504228E38)
            android.view.View r0 = r15.requireViewById(r0)
            X.LXi r6 = new X.LXi
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.AnonymousClass0fU.A00(r6, r0)
            r0 = 2131441214(0x7f0b363e, float:1.8504433E38)
            android.widget.TextView r5 = X.AnonymousClass7TG.A0R(r15, r0)
            java.lang.Integer r0 = r14.A03
            if (r0 == 0) goto L_0x0209
            int r4 = r0.intValue()
            java.lang.String r0 = "Required value was null."
            if (r4 == r13) goto L_0x01cc
            if (r4 == r1) goto L_0x0131
            r0 = 2
            if (r4 == r0) goto L_0x00f6
            X.DbT.A1K(r14)
        L_0x00ee:
            X.0wc r1 = r14.A00
            if (r1 != 0) goto L_0x01eb
            java.lang.String r0 = "logger"
            goto L_0x0043
        L_0x00f6:
            if (r7 == 0) goto L_0x00ee
            r0 = 2131441216(0x7f0b3640, float:1.8504437E38)
            android.view.View r6 = X.JTS.A0C(r15, r0)
            r0 = 3671(0xe57, float:5.144E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r6, r0)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r6 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout) r6
            r0 = 30
            r6.setRadius(r0)
            r0 = 2131429928(0x7f0b0a28, float:1.8481543E38)
            android.view.View r4 = r6.findViewById(r0)
            r4.setVisibility(r13)
            r1 = 17
            X.PqU r0 = new X.PqU
            r0.<init>((int) r1, (java.lang.Object) r6, (java.lang.Object) r4, (java.lang.Object) r14)
            X.H8E r1 = new X.H8E
            r1.<init>(r7, r14, r0)
            X.0nO r0 = X.0nY.A00()
            r0.ATE(r1)
            r0 = 2131963781(0x7f132f85, float:1.9564325E38)
            goto L_0x01e6
        L_0x0131:
            if (r11 == 0) goto L_0x0211
            r0 = 2131963782(0x7f132f86, float:1.9564327E38)
            r5.setText(r0)
            androidx.fragment.app.FragmentActivity r1 = r14.requireActivity()
            r0 = 2131441219(0x7f0b3643, float:1.8504443E38)
            android.view.ViewStub r0 = X.JTR.A0X(r15, r0)
            X.7Kq r6 = new X.7Kq
            r6.<init>(r1, r0)
            r1 = 2131239124(0x7f0820d4, float:1.8094546E38)
            X.0eM r0 = r6.A06
            android.view.View r0 = X.AnonymousClass7TH.A06(r0)
            r0.setBackgroundResource(r1)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            X.0eM r0 = r6.A0B
            android.widget.ImageView r0 = X.JTR.A0Z(r0)
            r0.setScaleType(r1)
            android.content.Context r0 = r14.requireContext()
            int r1 = X.2Yu.A02(r0)
            X.0eM r0 = r6.A07
            android.view.View r0 = X.AnonymousClass7TE.A0c(r0)
            r0.setBackgroundResource(r1)
            X.OTD r0 = r14.A02
            if (r0 != 0) goto L_0x0179
            java.lang.String r0 = "externalShareBottomSheetController"
            goto L_0x0043
        L_0x0179:
            X.1a8 r5 = r14.A06
            X.OWT r7 = r14.A01
            if (r7 == 0) goto L_0x020d
            r0 = 2
            X.0qQ.A0B(r5, r0)
            r7.A01(r11)
            X.N2L r0 = r7.A00(r11)
            if (r0 == 0) goto L_0x0197
            byte[] r4 = r0.A09
            java.lang.String r1 = r0.A07
            java.lang.String r0 = r0.A06
            r6.A02(r1, r0, r4)
            goto L_0x00ee
        L_0x0197:
            X.2FF r1 = r7.A01
            X.0gF r0 = X.C60340gF.A00
            X.1aU r4 = r1.A0T(r0)
            r1 = 8
            X.Ov3 r0 = new X.Ov3
            r0.<init>(r11, r7, r1)
            X.1aU r7 = r4.A0L(r0)
            X.MOB r4 = X.MOB.A00
            r1 = 15
            X.Mca r0 = new X.Mca
            r0.<init>((int) r1, (X.0sP) r4)
            X.1aU r0 = r7.A0N(r0)
            X.1aU r1 = r0.A0H()
            X.4fh r0 = X.C318146oT.A01
            X.1aU r4 = r1.A0P(r0)
            r1 = 7
            X.M1T r0 = new X.M1T
            r0.<init>((X.C329897Kq) r6, (int) r1)
            r5.A02(r4, r0)
            goto L_0x00ee
        L_0x01cc:
            if (r11 == 0) goto L_0x0216
            r0 = 2131441243(0x7f0b365b, float:1.8504492E38)
            android.view.View r1 = X.JTS.A0C(r15, r0)
            r0 = 9
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r11)
            r0 = 2131963784(0x7f132f88, float:1.9564331E38)
        L_0x01e6:
            r5.setText(r0)
            goto L_0x00ee
        L_0x01eb:
            java.lang.String r0 = "direct_external_share_sheet_rendered"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x021b
            r1.AAJ(r3, r12)
            java.lang.Integer r0 = r14.A03
            if (r0 == 0) goto L_0x0209
            java.lang.String r0 = X.C63257Ku2.A00(r0)
            r1.AAJ(r2, r0)
            r1.Cgf()
            return
        L_0x0209:
            java.lang.String r0 = "shareType"
            goto L_0x0043
        L_0x020d:
            java.lang.String r0 = "xmaLinkPreviewHelper"
            goto L_0x0043
        L_0x0211:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0216:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x021b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0X.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final int A0E() {
        return R.style.ExternalShareSheetDialogTheme;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(96840137);
        K0X.super.onCreate(bundle);
        UserSession A0U = DbX.A0U(this);
        this.A04 = A0U;
        if (A0U != null) {
            this.A05 = 2L2.A00(A0U);
            Context A052 = DbT.A05(requireContext());
            UserSession userSession = this.A04;
            if (userSession != null) {
                this.A01 = C70174NyS.A00(A052, userSession);
                UserSession userSession2 = this.A04;
                if (userSession2 != null) {
                    this.A02 = new OTD(userSession2);
                    UserSession userSession3 = this.A04;
                    if (userSession3 != null) {
                        this.A00 = AnonymousClass0kN.A02(userSession3);
                        AnonymousClass0fD.A09(1390128649, A022);
                        return;
                    }
                }
            }
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1489578824);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.external_share_bottom_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(259944102, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1846238642);
        K0X.super.onDestroyView();
        this.A06.A01();
        AnonymousClass0fD.A09(1029053688, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(490949319);
        K0X.super.onStop();
        Dialog dialog = this.A01;
        if (dialog != null) {
            dialog.dismiss();
        }
        AnonymousClass0fD.A09(1525830226, A022);
    }
}
