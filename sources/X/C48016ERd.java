package X;

import java.util.ArrayList;

/* renamed from: X.ERd  reason: case insensitive filesystem */
public final class C48016ERd extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BreakScreenBottomSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final void configureActionBar(2da r1) {
    }

    public final String getModuleName() {
        return "break_screen_menu_bottom_sheet";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(-1537343550);
        super.onResume();
        ArrayList A1C = AnonymousClass7TE.A1C();
        C50989Fmc.A01(requireContext(), new C50109FOz(this, 13), DbV.A05(this).getString(2131974996), A1C);
        C50989Fmc.A01(requireContext(), new C50109FOz(this, 14), DbV.A05(this).getString(2131954722), A1C);
        setItems(A1C);
        AnonymousClass0fD.A09(-127138111, A02);
    }
}
