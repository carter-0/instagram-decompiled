package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.avatars.convergence2.AvatarConvergenceUpsellBottomSheetFragment;

/* renamed from: X.DxN  reason: case insensitive filesystem */
public final class C47391DxN extends AvatarConvergenceUpsellBottomSheetFragment {
    public static final String __redex_internal_original_name = "AvatarConvergenceIdentitySheetUpsellFragment";
    public EtE A00;
    public String A01;
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(C51799G2i.A00(this, 21));

    public final String getModuleName() {
        return "avatar_convergence_private_access_upsell";
    }

    public final void A02() {
        super.A02();
        C314336i2 A0O = DbZ.A0O(this.A0B);
        String A012 = A01();
        Integer num = AnonymousClass05K.A00;
        A0O.A02.A00(num, num, A012, "mux_identity_sheet", true);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-589314459);
        C47391DxN.super.onCreate(bundle);
        String string = requireArguments().getString("args_editor_logging_surface");
        if (string != null) {
            this.A01 = string;
            AnonymousClass0fD.A09(2014579186, A022);
            return;
        }
        IllegalStateException A0z = AnonymousClass7TE.A0z("editor logging surface required");
        AnonymousClass0fD.A09(327674695, A022);
        throw A0z;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1679809318);
        super.onResume();
        View view = this.mView;
        if (view != null) {
            view.requestLayout();
        }
        C314336i2 A0O = DbZ.A0O(this.A0B);
        String A012 = A01();
        0xY AR4 = A0O.A00.A00.A00.AR4();
        AR4.E5T(C273654mx.A00(2959), true);
        AR4.apply();
        A0O.A01();
        A0O.A00();
        A0O.A02.A01(AnonymousClass05K.A00, A012, "mux_identity_sheet", true);
        AnonymousClass0fD.A09(287268929, A022);
    }
}
