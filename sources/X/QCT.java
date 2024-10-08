package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.logging.FBPayLoggerData;
import com.instagram.android.R;
import java.util.LinkedHashMap;

public final class QCT extends Fragment implements C13610Tdc, C13616Tdi {
    public View A00;
    public FBPayLoggerData A01;
    public QD5 A02;
    public Context A03;
    public View A04;
    public View A05;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0.getVisibility() != 0) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C11005S4z C7o() {
        /*
            r10 = this;
            r3 = 0
            android.view.View r0 = r10.A04
            if (r0 == 0) goto L_0x000c
            int r0 = r0.getVisibility()
            r9 = 0
            if (r0 == 0) goto L_0x000d
        L_0x000c:
            r9 = 1
        L_0x000d:
            r0 = 2131962187(0x7f13294b, float:1.9561092E38)
            java.lang.String r4 = r10.getString(r0)
            android.content.Context r2 = r10.A03
            r1 = 2130969486(0x7f04038e, float:1.7547655E38)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            android.util.TypedValue r0 = X.Pxj.A0J(r2, r1)
            int r0 = r0.resourceId
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r0)
            r0 = 51
            X.SbJ r2 = X.C11496SbJ.A00(r10, r0)
            r7 = 1
            r5 = 2131962192(0x7f132950, float:1.9561102E38)
            r6 = 2
            X.S4z r0 = new X.S4z
            r8 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QCT.C7o():X.S4z");
    }

    public static void A00(QCT qct) {
        LinkedHashMap A06 = C2818159r.A06(qct.A01);
        SRV.A02("target_name", "fbpay_education_info", A06).Cgl("user_click_target_atomic", A06);
        if (qct.A04 == null) {
            View A0F = DbY.A0F(qct.requireView(), R.id.branding_view_stub);
            qct.A04 = A0F;
            C11496SbJ.A01(A0F.requireViewById(R.id.close), 52, qct);
        }
        A01(qct, true);
    }

    public static void A01(QCT qct, boolean z) {
        int i = 8;
        qct.A05.setVisibility(DbW.A00(z ? 1 : 0));
        View view = qct.A04;
        view.getClass();
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
        C8810RAm rAm = qct.mParentFragment;
        if (rAm instanceof C8810RAm) {
            rAm.A00();
        }
    }

    public final boolean onBackPressed() {
        View view = this.A04;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        A01(this, false);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        FBPayLoggerData A002;
        int A022 = AnonymousClass0fD.A02(1263525828);
        QCT.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || bundle2.getParcelable("logger_data") == null) {
            A002 = C11249SHj.A00();
        } else {
            A002 = Pxi.A0J(this.mArguments);
        }
        this.A01 = A002;
        if (bundle == null) {
            AnonymousClass2E0.A0E().A05().Cgl("fbpay_home_page_init", C2818159r.A06(this.A01));
            AnonymousClass2E0.A0E().A05().Cgl("client_load_fbpayhubhome_init", C2818159r.A06(this.A01));
            SRV.A01().markerStart(110176278);
        }
        AnonymousClass0fD.A09(240295570, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-517618943);
        FragmentActivity activity = getActivity();
        AnonymousClass2E0.A0E();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(activity, 2132017777);
        this.A03 = contextThemeWrapper;
        View A0C = DbT.A0C(layoutInflater.cloneInContext(contextThemeWrapper), viewGroup, R.layout.fragment_hub_home);
        AnonymousClass0fD.A09(-1850086790, A022);
        return A0C;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, X.QCT, X.07g, androidx.fragment.app.Fragment] */
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        this.A05 = view.requireViewById(R.id.content_view);
        this.A00 = view.requireViewById(R.id.progress_bar);
        this.A04 = null;
        this.A02 = SRV.A00(this).A00(QD5.class);
        QD7 A002 = SRV.A00(this).A00(C8264Qn6.class);
        C8267Qn9 A003 = SRV.A00(this).A00(C8267Qn9.class);
        QD5 qd5 = this.A02;
        FBPayLoggerData fBPayLoggerData = this.A01;
        qd5.A00 = fBPayLoggerData;
        qd5.A08.Cgl("fbpay_home_page_display", C2818159r.A06(fBPayLoggerData));
        qd5.A03 = A003;
        qd5.A02 = A002;
        qd5.A01 = A002;
        AnonymousClass2gB r2 = qd5.A05;
        AnonymousClass2gB r0 = A002.A03;
        AnonymousClass2gO r1 = qd5.A06;
        r2.A0E(r0, r1);
        r2.A0E(SRV.A00(this).A00(C8271QnD.class).A03, r1);
        r2.A0E(A003.A03, r1);
        C11652Sdu.A02(this, this.A02.A05, 55);
        C11652Sdu.A02(this, this.A02.A03.A02, 56);
        if (bundle == null && (bundle2 = this.mArguments) != null && bundle2.getBoolean("show_branding_page")) {
            A00(this);
        }
    }
}
