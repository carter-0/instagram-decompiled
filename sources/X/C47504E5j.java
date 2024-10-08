package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.E5j  reason: case insensitive filesystem */
public final class C47504E5j extends AnonymousClass4DH implements G8C, G69 {
    public static final String __redex_internal_original_name = "SACWelcomeFragment";
    public AnonymousClass0aP A00;
    public RegFlowExtras A01;
    public EEK A02;
    public ProgressButton A03;

    public final boolean Ca3() {
        return true;
    }

    public final void DUM() {
        String str = this.A01.A0Z;
        if (str == null) {
            str = "";
        }
        AnonymousClass0aP r4 = this.A00;
        str.getClass();
        C50144FRb.A02(new Handler(), this, this, r4, (G67) null, this, this.A01, this.A02, C48156EZy.A0F.A00, str, (String) null, false);
    }

    public final void DaH(boolean z) {
    }

    public final String getModuleName() {
        return "sac_welcome_page";
    }

    public final void APF() {
        this.A03.setEnabled(false);
    }

    public final void ARL() {
        this.A03.setEnabled(true);
    }

    public final EXD B6Y() {
        return EXD.SAC;
    }

    public final C46634DiE BzS() {
        return C48156EZy.A0F.A00;
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void EuV(String str, Integer num) {
        C358248ab A0H = Dba.A0H(this);
        A0H.A0q(str);
        A0H.A0H(C50021FJg.A00(this, 31), 2131968772);
        A0H.A04();
        DbT.A1V(A0H);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1918730900);
        C47504E5j.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = 09i.A0A.A02(requireArguments);
        Parcelable parcelable = requireArguments.getParcelable("RegFlowExtras.EXTRA_KEY");
        17k.A07(parcelable, "Registration extras cannot be null in SAC flow!");
        this.A01 = (RegFlowExtras) parcelable;
        if (getContext() != null) {
            AnonymousClass35B.A00();
            Context context = getContext();
            AnonymousClass0aP r5 = this.A00;
            EXD exd = EXD.SAC;
            Integer A023 = this.A01.A02();
            AnonymousClass7TF.A1H(context, r5);
            1WS.A00(context, r5, exd, A023, AnonymousClass05K.A00, false, false, false, false, false);
        }
        0Tu r52 = 0Tu.A05;
        if (!Dba.A0Z(r52).contains(__redex_internal_original_name)) {
            if (1AW.A06(r52, 2324147266476448102L)) {
                C49130Ept.A00().A00(requireContext(), this.A00, (B2F) null);
            }
            if (1AW.A06(r52, 2324147266476513639L)) {
                C49130Ept.A00().A01(requireContext(), this.A00, (B2F) null);
            }
        }
        AnonymousClass0fD.A09(1675386570, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008b, code lost:
        if (r3 == false) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r19, android.view.ViewGroup r20, android.os.Bundle r21) {
        /*
            r18 = this;
            r0 = 1552809224(0x5c8dfd08, float:3.1972946E17)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r0 = 2131628937(0x7f0e1389, float:1.888518E38)
            r4 = r19
            r1 = r20
            android.view.View r0 = X.DbT.A0C(r4, r1, r0)
            android.view.ViewGroup r3 = X.Dba.A04(r0)
            r1 = 2131628948(0x7f0e1394, float:1.8885203E38)
            r11 = 1
            r4.inflate(r1, r3, r11)
            r1 = r18
            androidx.fragment.app.FragmentActivity r3 = r1.getActivity()
            if (r3 == 0) goto L_0x003c
            r3 = 2131430540(0x7f0b0c8c, float:1.8482784E38)
            android.widget.ImageView r4 = X.DbU.A0F(r0, r3)
            com.instagram.registration.model.RegFlowExtras r3 = r1.A01
            boolean r3 = r3.A0t
            if (r3 == 0) goto L_0x013c
            r3 = 2131237558(0x7f081ab6, float:1.809137E38)
            r4.setImageResource(r3)
            r3 = 0
        L_0x0039:
            r4.setVisibility(r3)
        L_0x003c:
            androidx.fragment.app.FragmentActivity r3 = r1.getActivity()
            if (r3 == 0) goto L_0x005f
            r3 = 2131443999(0x7f0b411f, float:1.8510082E38)
            android.widget.TextView r6 = X.DbU.A0G(r0, r3)
            com.instagram.registration.model.RegFlowExtras r3 = r1.A01
            java.lang.String r5 = r3.A0Z
            if (r5 != 0) goto L_0x0051
            java.lang.String r5 = ""
        L_0x0051:
            androidx.fragment.app.FragmentActivity r3 = r1.getActivity()
            android.content.res.Resources r4 = r3.getResources()
            r3 = 2131976839(0x7f136287, float:1.959081E38)
            X.Dbb.A0m(r4, r6, r5, r3)
        L_0x005f:
            r3 = 2131443998(0x7f0b411e, float:1.851008E38)
            android.widget.TextView r6 = X.DbU.A0G(r0, r3)
            androidx.fragment.app.FragmentActivity r3 = r1.getActivity()
            if (r3 == 0) goto L_0x009b
            com.instagram.registration.model.RegFlowExtras r4 = r1.A01
            boolean r3 = X.C50144FRb.A07(r4)
            if (r3 == 0) goto L_0x0129
            java.lang.String r8 = r4.A0M
            java.lang.String r7 = r4.A0Z
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            android.content.res.Resources r5 = r3.getResources()
            com.instagram.registration.model.RegFlowExtras r4 = r1.A01
            boolean r3 = r4.A0t
            if (r3 == 0) goto L_0x008d
            boolean r3 = r4.A0y
            r4 = 2131976836(0x7f136284, float:1.9590804E38)
            if (r3 != 0) goto L_0x0090
        L_0x008d:
            r4 = 2131976837(0x7f136285, float:1.9590806E38)
        L_0x0090:
            java.lang.String[] r3 = new java.lang.String[]{r8, r7}
            android.text.Spanned r3 = X.0bC.A01(r5, r3, r4)
            r6.setText(r3)
        L_0x009b:
            com.instagram.ui.widget.progressbutton.ProgressButton r5 = X.Dba.A0O(r0)
            r1.A03 = r5
            X.0aP r4 = r1.A00
            r17 = 2131956467(0x7f1312f3, float:1.954949E38)
            r9 = 0
            X.EEK r3 = new X.EEK
            r12 = r3
            r14 = r4
            r15 = r1
            r16 = r5
            r13 = r9
            r12.<init>(r13, r14, r15, r16, r17)
            r1.A02 = r3
            r1.registerLifecycleListener(r3)
            r3 = 2131438228(0x7f0b2a94, float:1.8498377E38)
            android.widget.TextView r5 = X.DbU.A0G(r0, r3)
            com.instagram.registration.model.RegFlowExtras r4 = r1.A01
            boolean r3 = X.C50144FRb.A07(r4)
            if (r3 != 0) goto L_0x0117
            boolean r3 = r4.A0t
            if (r3 != 0) goto L_0x0117
            android.content.Context r4 = r1.requireContext()
            X.0aP r6 = r1.A00
            com.instagram.registration.model.RegFlowExtras r3 = r1.A01
            java.lang.String r3 = r3.A0X
            X.EXD r7 = X.EXD.SAC
            r12 = 0
            r8 = r3
            r10 = r9
            r11 = r12
        L_0x00da:
            X.C49958FGq.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            com.instagram.registration.model.RegFlowExtras r4 = r1.A01
            boolean r3 = X.C50144FRb.A07(r4)
            if (r3 == 0) goto L_0x0110
            boolean r3 = r4.A0t
            if (r3 != 0) goto L_0x0110
            r3 = 2131441408(0x7f0b3700, float:1.8504827E38)
            android.widget.TextView r6 = X.DbU.A0G(r0, r3)
            androidx.fragment.app.FragmentActivity r3 = r1.getActivity()
            if (r3 == 0) goto L_0x0110
            r6.setVisibility(r12)
            com.instagram.registration.model.RegFlowExtras r3 = r1.A01
            java.lang.String r5 = r3.A0Z
            androidx.fragment.app.FragmentActivity r3 = r1.getActivity()
            android.content.res.Resources r4 = r3.getResources()
            r3 = 2131973900(0x7f13570c, float:1.9584849E38)
            X.Dbb.A0m(r4, r6, r5, r3)
            r3 = 49
            X.FP2.A00(r6, r3, r1)
        L_0x0110:
            r1 = 714819083(0x2a9b460b, float:2.7582133E-13)
            X.AnonymousClass0fD.A09(r1, r2)
            return r0
        L_0x0117:
            android.content.Context r4 = r1.requireContext()
            X.0aP r6 = r1.A00
            com.instagram.registration.model.RegFlowExtras r3 = r1.A01
            java.lang.String r8 = r3.A0X
            X.EXD r7 = X.EXD.SAC
            java.lang.String r9 = r3.A0M
            java.lang.String r10 = r3.A0Z
            r12 = 0
            goto L_0x00da
        L_0x0129:
            boolean r3 = r4.A0t
            if (r3 != 0) goto L_0x0135
            r3 = 2131976835(0x7f136283, float:1.9590802E38)
            r6.setText(r3)
            goto L_0x009b
        L_0x0135:
            r3 = 8
            r6.setVisibility(r3)
            goto L_0x009b
        L_0x013c:
            r3 = 8
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47504E5j.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1484398714);
        super.onDestroyView();
        this.A03 = null;
        unregisterLifecycleListener(this.A02);
        AnonymousClass0fD.A09(442922813, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C49938FFr.A00.A02(this.A00, EXD.SAC, C48156EZy.A0F.A00.A01);
    }
}
