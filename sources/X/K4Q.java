package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import java.util.Currency;
import java.util.List;

public final class K4Q extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "UserPayViewerBottomSheetFragment";
    public C313616gj A00;
    public String A01;
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(C66288MLx.A00);
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04 = MMF.A00(this, 34);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass2Fj r3 = ((LCT) this.A02.getValue()).A00;
        FragmentActivity activity = getActivity();
        0qQ.A0C(activity, C66579MXk.A00(146));
        r3.A06(activity, new C64315LZp(5, view, this));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public static final String A00(String str, String str2) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt) || charAt == '.' || charAt == ',') {
                A1A.append(charAt);
            }
        }
        return 002.A0T(DbT.A10(A1A), Currency.getInstance(str2).getDisplayName(), ' ');
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1116795751);
        K4Q.super.onCreate(bundle);
        this.A01 = C320236s2.A01(requireArguments(), AnonymousClass000.A00(2622));
        C64102LMw lMw = (C64102LMw) this.A04.getValue();
        AnonymousClass0eM r1 = this.A02;
        List A002 = ((LCT) r1.getValue()).A00();
        LCT lct = (LCT) r1.getValue();
        AnonymousClass2Fj r2 = lct.A00;
        Object A023 = r2.A02();
        if (A023 != null) {
            C60980Juc juc = (C60980Juc) A023;
            juc.A0D = true;
            r2.A0A(juc);
            ((T7R) lMw.A04.getValue()).A04(new C64429Lbk(lct, juc), A002, (List) null);
            AnonymousClass0fD.A09(-168856498, A022);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1140037850);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.iglive_user_pay_viewer_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(-868018789, A022);
        return inflate;
    }
}
