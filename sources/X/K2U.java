package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.Collection;

public final class K2U extends K80 {
    public static final C63049Kqe A03 = new Object();
    public static final String __redex_internal_original_name = "GreenscreenCameraRollTabFragment";
    public Folder A00 = new Folder("Gallery", (String) null, -1, false);
    public final AnonymousClass0eM A01 = MMI.A00(this, 22);
    public final AnonymousClass0eM A02;

    public final String getModuleName() {
        return "GREEN_SCREEN_CAMERA_ROLL_TAB_FRAGMENT";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((C60117Jfy) this.A02.getValue()).A00.A07();
        07U r2 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHH(r2, this, viewLifecycleOwner, (AnonymousClass4D7) null, 15), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final Collection getDefinitions() {
        int A07 = DbX.A07(this.A01);
        return AnonymousClass7TE.A1I(new C61633KFj(new C63587Kza(this), (C355608Qq) this.A01.getValue(), A07));
    }

    public K2U() {
        MMI mmi = new MMI(this, 23);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMI(new MMI(this, 19), 20));
        this.A02 = DbS.A0I(new MMI(A002, 21), mmi, new MMZ(32, (Object) null, (Object) A002), DbS.A0z(C60117Jfy.class));
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1544615319);
        K2U.super.onPause();
        ((C60117Jfy) this.A02.getValue()).A00.A08();
        AnonymousClass0fD.A09(1927366979, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-528725387);
        super.onResume();
        ((C60117Jfy) this.A02.getValue()).A00.A09();
        AnonymousClass0fD.A09(-156829926, A022);
    }
}
