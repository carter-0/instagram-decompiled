package X;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.logging.FBPayLoggerData;
import com.instagram.android.R;

public final class QCX extends Fragment implements C13613Tdf, C13616Tdi {
    public View A00;
    public FBPayLoggerData A01;
    public Qn3 A02;
    public QDB A03;

    public final C11005S4z C7o() {
        return new C11005S4z((Drawable) null, (View.OnClickListener) null, (String) null, getString(2131969230), 0, 0, false, false, true);
    }

    public static Bundle A00(QCX qcx) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("has_container_fragment", true);
        bundle.putParcelable("logger_data", qcx.A01);
        return bundle;
    }

    public final boolean DGj(Bundle bundle, int i, boolean z) {
        return this.A02.DGj(bundle, i, z);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        QCX.super.onActivityResult(i, i2, intent);
        Qn3 qn3 = this.A02;
        boolean A1S = AnonymousClass7TF.A1S(i2, -1);
        if (intent == null) {
            extras = null;
        } else {
            extras = intent.getExtras();
        }
        qn3.DGj(extras, i, A1S);
    }

    public final void onCreate(Bundle bundle) {
        FBPayLoggerData A002;
        int A022 = AnonymousClass0fD.A02(-2083136841);
        QCX.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || bundle2.getParcelable("logger_data") == null) {
            A002 = C11249SHj.A00();
        } else {
            A002 = Pxi.A0J(this.mArguments);
        }
        this.A01 = A002;
        if (bundle == null) {
            AnonymousClass2E0.A0E().A05().Cgl("client_load_paymentsettings_init", C2818159r.A06(this.A01));
            SRV.A01().markerStart(110177837);
        }
        AnonymousClass0fD.A09(-1375032198, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(937647495);
        FragmentActivity activity = getActivity();
        AnonymousClass2E0.A0E();
        View A0C = DbT.A0C(layoutInflater.cloneInContext(new ContextThemeWrapper(activity, R.style.Ig4aFbPay)), viewGroup, R.layout.fragment_hub_settings);
        AnonymousClass0fD.A09(-150750660, A022);
        return A0C;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, X.07g, androidx.fragment.app.Fragment, X.QCX] */
    public final void onViewCreated(View view, Bundle bundle) {
        this.A00 = view.requireViewById(R.id.progress_bar);
        if (this.A02 == null) {
            this.A02 = AnonymousClass2E0.A0E().A04(A00(this), "payment_methods");
            0s1 A0C = DbW.A0C(this);
            A0C.A0A(this.A02, R.id.payment_methods_fragment_container);
            A0C.A00();
        }
        if (getChildFragmentManager().A0P(R.id.order_info_section_fragment_container) == null) {
            Bundle A002 = A00(this);
            0s1 A0C2 = DbW.A0C(this);
            A0C2.A0A(AnonymousClass2E0.A0E().A04(A002, "order_info"), R.id.order_info_section_fragment_container);
            A0C2.A00();
        }
        AnonymousClass2E0.A0E().A06();
        if (getChildFragmentManager().A0P(R.id.merchant_loyalty_list_section_fragment_container) == null) {
            Bundle A003 = A00(this);
            0s1 A0C3 = DbW.A0C(this);
            A0C3.A0A(AnonymousClass2E0.A0E().A04(A003, "merchant_loyalty_list"), R.id.merchant_loyalty_list_section_fragment_container);
            A0C3.A00();
        }
        this.A03 = SRV.A00(this).A00(QDB.class);
        C8269QnB A004 = SRV.A00(this).A00(C8269QnB.class);
        QDB qdb = this.A03;
        FBPayLoggerData A0Y = Pxj.A0Y(this.mArguments);
        qdb.A00 = A0Y;
        qdb.A07.Cgl("fbpay_payment_settings_page_display", C2818159r.A06(A0Y));
        qdb.A03 = A004;
        qdb.A01 = SRV.A00(this).A00(C8272QnE.class);
        qdb.A02 = SRV.A00(this).A00(QD1.class);
        AnonymousClass2gB r2 = qdb.A05;
        AnonymousClass2gB r0 = A004.A03;
        AnonymousClass2gO r1 = qdb.A06;
        r2.A0E(r0, r1);
        r2.A0E(qdb.A01.A03, r1);
        QD1 qd1 = qdb.A02;
        if (qd1 != null) {
            r2.A0E(qd1.A01, r1);
        }
        C11651Sdt.A00(this, this.A03.A05, 10);
    }
}
