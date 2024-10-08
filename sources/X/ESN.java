package X;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class ESN extends C47518E6c implements AnonymousClass4DS, C267674c0 {
    public static final String __redex_internal_original_name = "AccountSecurityFragment";
    public Dialog A00;
    public UserSession A01;
    public PR9 A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08 = new Handler();
    public final 1P0 A09 = new C47699EDi(this, 2);

    public final boolean CIy() {
        return false;
    }

    public final String getModuleName() {
        return "account_security";
    }

    public static void A07(ESN esn, boolean z) {
        esn.A02.A0D = z;
        esn.getScrollingViewProxy().AZK().notifyDataSetChanged();
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r6.A08 == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(X.DwU r6, X.ESN r7) {
        /*
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            if (r6 == 0) goto L_0x0016
            java.lang.String r0 = r6.A03
            r7.A05 = r0
            java.lang.String r0 = r6.A00
            r7.A03 = r0
            java.lang.String r0 = r6.A02
            r7.A04 = r0
            boolean r0 = r6.A0F
            r7.A07 = r0
        L_0x0016:
            r5 = 2131975196(0x7f135c1c, float:1.9587477E38)
            if (r6 == 0) goto L_0x0020
            boolean r0 = r6.A08
            r3 = 1
            if (r0 != 0) goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            r0 = 13
            X.FQO r2 = new X.FQO
            r2.<init>(r7, r0)
            r0 = 10
            X.FdS r1 = new X.FdS
            r1.<init>(r7, r0)
            X.PR9 r0 = new X.PR9
            r0.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r2, (X.C358618bC) r1, (int) r5, (boolean) r3)
            r7.A02 = r0
            r4.add(r0)
            androidx.fragment.app.FragmentActivity r3 = r7.getActivity()
            r2 = 42
            r1 = 52
            r0 = 72
            java.lang.String r0 = X.DcV.A02(r2, r1, r0)
            android.net.Uri r2 = X.DbV.A07(r3, r0)
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r1 = r7.getString(r0)
            r0 = 2131975197(0x7f135c1d, float:1.958748E38)
            X.C47518E6c.A03(r2, r7, r1, r4, r0)
            if (r6 == 0) goto L_0x007b
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x007b
            r0 = 2131953574(0x7f1307a6, float:1.9543623E38)
            X.C46448DfA.A02(r4, r0)
            android.content.Context r3 = r7.requireContext()
            r2 = 2131953572(0x7f1307a4, float:1.9543619E38)
            r1 = 50
            X.FPF r0 = new X.FPF
            r0.<init>((int) r1, (java.lang.Object) r7, (java.lang.Object) r6)
            X.C50989Fmc.A02(r3, r0, r4, r2)
            r0 = 2131953573(0x7f1307a5, float:1.954362E38)
            X.FGF.A00(r7, r4, r0)
        L_0x007b:
            r7.setItems(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ESN.A06(X.DwU, X.ESN):void");
    }

    public final void configureActionBar(2da r3) {
        DbW.A1C(r3, getString(2131965605));
        r3.Ett((View.OnClickListener) null, this.A06);
        r3.setIsLoading(this.A06);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-139107681);
        super.onCreate(bundle);
        this.A01 = DbX.A0U(this);
        AnonymousClass0fD.A09(1662160527, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1019084957);
        ESN.super.onPause();
        DbZ.A1P(this, 0);
        AnonymousClass0fD.A09(9862761, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-30142207);
        super.onResume();
        DbZ.A1P(this, 8);
        AnonymousClass0fD.A09(-1097043455, A022);
    }

    public final void onStart() {
        int i;
        int A022 = AnonymousClass0fD.A02(793775239);
        ESN.super.onStart();
        Dialog dialog = this.A00;
        if (dialog == null || !dialog.isShowing()) {
            1OC A012 = FFP.A01(getContext(), this.A01);
            A012.A00 = new ECk(this);
            schedule(A012);
            i = 1786576759;
        } else {
            i = 719474574;
        }
        AnonymousClass0fD.A09(i, A022);
    }
}
