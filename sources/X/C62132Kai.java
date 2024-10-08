package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.Kai  reason: case insensitive filesystem */
public final class C62132Kai extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ReelSettingsFragment";
    public C64986LlP A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        C64986LlP llP = this.A00;
        if (llP == null) {
            0qQ.A0F("settingsController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            DbW.A1B(r2, llP.C7q());
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C64986LlP llP = this.A00;
        if (llP == null) {
            0qQ.A0F("settingsController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            setItems(llP.A0G);
        }
    }

    public final String getModuleName() {
        C64986LlP llP = this.A00;
        if (llP != null) {
            return llP.getModuleName();
        }
        return __redex_internal_original_name;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(563604963);
        super.onCreate(bundle);
        C62488Kgd kgd = (C62488Kgd) requireArguments().getSerializable(AnonymousClass000.A00(1019));
        if (kgd == null) {
            kgd = C62488Kgd.ALL_SETTINGS;
        }
        C64986LlP llP = new C64986LlP(requireContext(), DbV.A05(this), requireActivity(), AnonymousClass7TE.A0l(this.A01), kgd, this);
        this.A00 = llP;
        llP.A02 = new C64983LlM(this);
        AnonymousClass0fD.A09(-1192483472, A02);
    }

    public final void onDestroy() {
        int A02 = AnonymousClass0fD.A02(327641509);
        super.onDestroy();
        C64986LlP llP = this.A00;
        if (llP == null) {
            0qQ.A0F("settingsController");
            throw AnonymousClass00P.createAndThrow();
        }
        llP.onDestroy();
        AnonymousClass0fD.A09(-2067328011, A02);
    }
}
