package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.avatars.convergence2.AvatarConvergenceUpsellBottomSheetFragment;

public final class DxO extends AvatarConvergenceUpsellBottomSheetFragment implements G9c {
    public static final String __redex_internal_original_name = "AvatarConvergenceMimicryUpsellFragment";
    public C331157Pu A00;
    public String A01;
    public String A02;
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(C51799G2i.A00(this, 22));
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(C51799G2i.A00(this, 23));
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(C51799G2i.A00(this, 24));
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(C51799G2i.A00(this, 25));
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(C51799G2i.A00(this, 26));

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r3 = this.A0B;
        boolean A1b = Dba.A1b(r3);
        C314336i2 A0O = DbZ.A0O(r3);
        if (A1b) {
            DbW.A1L(A0O.A00.A00.A00.AR4(), C273654mx.A00(2956));
            A0O.A01();
        } else if (A0O.A06()) {
            C314336i2 A0O2 = DbZ.A0O(r3);
            DbW.A1L(A0O2.A00.A00.A00.AR4(), C273654mx.A00(2958));
            A0O2.A01();
            A0O2.A00();
        }
        C314336i2 A0O3 = DbZ.A0O(r3);
        if (Dba.A1b(r3)) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        A0O3.A02.A01(num, "ig_stories_consumption", "mux_mimicry_bottom_sheet", Dba.A1a(r3));
    }

    public final Integer BkZ() {
        return AnonymousClass05K.A01;
    }

    public final String getModuleName() {
        return "avatar_convergence_mimicry_upsell_fragment";
    }

    public final void A02() {
        super.A02();
        AnonymousClass0eM r1 = this.A0B;
        if (!Dba.A1b(r1)) {
            C314336i2 A0O = DbZ.A0O(r1);
            Integer num = AnonymousClass05K.A00;
            A0O.A02.A00(num, num, "ig_stories_consumption", "mux_mimicry_bottom_sheet", Dba.A1a(r1));
        }
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(1886667303);
        DxO.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("args_editor_logging_surface");
        if (string != null) {
            this.A02 = string;
            String string2 = requireArguments.getString("args_editor_logging_mechanism");
            if (string2 != null) {
                this.A01 = string2;
                AnonymousClass0fD.A09(2036231824, A022);
                return;
            }
            illegalStateException = AnonymousClass7TE.A0z("editor logging mechanism required");
            i = 246557641;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("editor logging surface required");
            i = 1969520560;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(749991831);
        super.onDestroyView();
        this.A00 = null;
        AnonymousClass0fD.A09(-1101891320, A022);
    }
}
