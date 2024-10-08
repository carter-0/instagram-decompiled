package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.UbB  reason: case insensitive filesystem */
public final class C15359UbB extends AnonymousClass4DH implements G9c {
    public static final String __redex_internal_original_name = "FacebookCrosspostingToInstagramFragment";
    public String A00;
    public String A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.facebook_crossposting_to_instagram_subtitle);
        String str = this.A01;
        if (str == null) {
            0qQ.A0F("userName");
            throw AnonymousClass00P.createAndThrow();
        } else if (str.length() > 0) {
            DbX.A1F(A0R, this, str, 2131961900);
        }
    }

    public final Integer BkZ() {
        return AnonymousClass05K.A1F;
    }

    public final String getModuleName() {
        String str = this.A00;
        if (str != null) {
            return C49092EpH.A00(this, str);
        }
        0qQ.A0F("previousModuleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1524227108);
        C15359UbB.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = requireArguments.getString("args_previous_module_name", "");
        this.A01 = requireArguments.getString(C273654mx.A00(1494), "");
        AnonymousClass0fD.A09(189552821, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1930213114);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.facebook_crossposting_to_instagram_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-532104807, A022);
        return inflate;
    }
}
