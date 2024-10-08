package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.E6y  reason: case insensitive filesystem */
public final class C47535E6y extends C273374mT implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "QuickPromotionTestFragment";
    public View A00;

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
    }

    public final String getModuleName() {
        return "qp_test_surface";
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.setTitle(getString(2131958417));
    }

    public final void onCreate(Bundle bundle) {
        Context context;
        int A02 = AnonymousClass0fD.A02(-1857399109);
        C47535E6y.super.onCreate(bundle);
        if (!(this.mArguments == null || (context = getContext()) == null)) {
            1OC A002 = C49842F9h.A00(getSession(), QuickPromotionSlot.A0o, AnonymousClass05K.A01, (int) Math.ceil((double) AnonymousClass7TF.A0E(context).density));
            EDV.A00(A002, context, this, 32);
            schedule(A002);
        }
        AnonymousClass0fD.A09(433648046, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1844801176);
        0qQ.A0B(layoutInflater, 0);
        C47535E6y.super.onCreateView(layoutInflater, viewGroup, bundle);
        View A09 = DbW.A09(layoutInflater, viewGroup, R.layout.quick_promotion_test_fragment, false);
        AnonymousClass0fD.A09(-1925601918, A02);
        return A09;
    }
}
