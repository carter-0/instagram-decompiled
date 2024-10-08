package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.android.R;

public final class KUF extends K77 {
    public static final String __redex_internal_original_name = "MediaKitTextIntroFragment";
    public final AnonymousClass0eM A00 = DbS.A0I(new MMD(this, 49), new C51793G2c(this, 0), MMW.A00((Object) null, this, 20), DbS.A0z(C60327JjW.class));
    public final AnonymousClass4DS A01 = new C64464LcR(this, 5);

    public final String getModuleName() {
        return "MediaKitTextInfoFragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((C3021461u) view.requireViewById(R.id.mk_text_into_bottom_layout)).setPrimaryAction(getString(2131966604), LY6.A00(this, 65));
        2dY.A01(LY6.A00(this, 66), DbX.A0I(view, R.id.mk_action_bar)).A0X(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1109803240);
        super.onCreate(bundle);
        Window A0G = DbV.A0G(this);
        0qQ.A07(A0G);
        2db.A08(A0G, false);
        2db.A02(requireActivity(), 0);
        C64127LPb.A01(this, AnonymousClass05K.A0Y);
        AnonymousClass0fD.A09(1007286427, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-392838220);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.media_kit_intro_text_fragment, viewGroup, false);
        AnonymousClass0fD.A09(663438338, A02);
        return inflate;
    }
}
