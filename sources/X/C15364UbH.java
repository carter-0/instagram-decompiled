package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.form.IgFormField;
import java.text.NumberFormat;

/* renamed from: X.UbH  reason: case insensitive filesystem */
public final class C15364UbH extends AnonymousClass4DH implements C268594df {
    public static final String __redex_internal_original_name = "CreateOrderFragment";
    public UserSession A00;
    public VN4 A01;
    public String A02;
    public String A03;
    public C17422VVb A04;
    public String A05;

    public final int AhP(Context context) {
        return 0;
    }

    public final int AqL() {
        return -1;
    }

    public final int C8P() {
        return 0;
    }

    public final float CMx() {
        return 1.0f;
    }

    public final boolean CPc() {
        return false;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    public final boolean Erf() {
        return false;
    }

    public final String getModuleName() {
        return "direct_create_order_fragment";
    }

    public final boolean isScrolledToTop() {
        return true;
    }

    public final void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final View C4U() {
        return this.mView;
    }

    public final /* synthetic */ float CoU() {
        return 1.0f;
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1471926848);
        C15364UbH.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = DbX.A0U(this);
        this.A05 = requireArguments.getString("consumer_id");
        this.A04 = new C17422VVb(this.A00, "direct_create_order_fragment");
        AnonymousClass0fD.A09(705145339, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1616452257);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.create_order_view);
        AnonymousClass0fD.A09(368108460, A022);
        return A0C;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        IgFormField A0d = DbT.A0d(view, R.id.total_price);
        A0d.setInputType(2);
        UserSession userSession = this.A00;
        if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36315885517999766L)) {
            A0d.getMEditText().requestFocus();
            C13991Tnr.A07(A0d.getMEditText().getContext()).showSoftInput(A0d.getMEditText(), 1);
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(AnonymousClass1Q2.A02());
        A0d.setMaxLength(DbX.A05(currencyInstance.format(Double.parseDouble("2147483647") / Math.pow(10.0d, (double) currencyInstance.getCurrency().getDefaultFractionDigits()))) - 1);
        A0d.A0G(new W7Z(3, this, A0d));
        DbT.A0d(view, R.id.notes).A0G(new C71273OhE(this, 20));
        String str = this.A05;
        if (str != null) {
            C17422VVb vVb = this.A04;
            String str2 = this.A00.A06;
            0Aj A0e = AnonymousClass7TE.A0e(vVb.A01, "biig_order_management_create_order_form_impression");
            if (A0e.isSampled()) {
                C13992Tns.A0i(A0e, str2, str);
            }
        }
    }
}
