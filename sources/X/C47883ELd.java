package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.ELd  reason: case insensitive filesystem */
public final class C47883ELd extends E5k implements C51874G5l {
    public static final String __redex_internal_original_name = "SeeOtherOptionSheetFragment";
    public final int A00 = -2;
    public final View.OnClickListener A01 = FP1.A00(this, 21);
    public final View.OnClickListener A02 = FP1.A00(this, 22);
    public final String A03 = "instagram_terms_flow";
    public final AnonymousClass0eM A04 = C227642jf.A01(this);

    public final float Cmb() {
        return 1.0f;
    }

    public final Integer B8m() {
        return AnonymousClass05K.A09;
    }

    public final String getModuleName() {
        return this.A03;
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1629088621);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.see_other_options_layout, viewGroup, false);
        View A0G = AnonymousClass7TF.A0G(inflate, R.id.help_center_button);
        View A0G2 = AnonymousClass7TF.A0G(inflate, R.id.cancel_button);
        AnonymousClass0fU.A00(this.A02, A0G);
        AnonymousClass0fU.A00(this.A01, A0G2);
        AnonymousClass0fD.A09(-215215352, A022);
        return inflate;
    }
}
