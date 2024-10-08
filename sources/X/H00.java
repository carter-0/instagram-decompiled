package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

public final class H00 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "BlendContextBottomSheetFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05;

    public final String getModuleName() {
        return "blendcontextbottomsheet_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHK((Object) viewLifecycleOwner, (Object) r3, (Object) this, (AnonymousClass4D7) null, 48), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public H00() {
        0eO r3 = 0eO.A02;
        this.A00 = C51804G2n.A01(this, "BLEND_BOTTOM_SHEET_BLEND_ID", r3, 42);
        this.A03 = C51804G2n.A01(this, "BLEND_BOTTOM_SHEET_THREAD_ID", r3, 43);
        this.A02 = AnonymousClass0eN.A00(r3, new C51686Fym(this));
        this.A01 = AnonymousClass0eN.A00(r3, new C51687Fyn(this));
        C58679Ivo ivo = new C58679Ivo(this, 47);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r3, new C58679Ivo(new C58679Ivo(this, 44), 45));
        this.A05 = DbS.A0I(new C58679Ivo(A002, 46), ivo, C58690Ivz.A00((Object) null, A002, 5), DbS.A0z(C53022GhD.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1085593548);
        H00.super.onCreate(bundle);
        C53022GhD ghD = (C53022GhD) this.A05.getValue();
        ghD.A00.A00(ghD.A02, false);
        AnonymousClass0fD.A09(1074768953, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(325050229);
        ComposeView A0H = DbV.A0H(this, new JGB(this, 11), 1072562391);
        AnonymousClass0fD.A09(-62871644, A022);
        return A0H;
    }
}
