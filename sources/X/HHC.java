package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import java.util.Map;

public final class HHC extends H08 implements JSq {
    public static final String __redex_internal_original_name = "WallGalleryPickerFragment";
    public final AnonymousClass0eM A00;

    public final void DWm(Map map) {
        0qQ.A0B(map, 0);
        A00(map);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A01().A05(view, false);
        Object value = this.A05.getValue();
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MGL(viewLifecycleOwner, r3, value, this, (AnonymousClass4D7) null, 3), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public HHC() {
        C58704IwD A01 = C58704IwD.A01(this, 26);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, C58704IwD.A01(C58704IwD.A01(this, 27), 28));
        this.A00 = DbS.A0I(C58704IwD.A01(A002, 29), A01, C58687Ivw.A00((Object) null, A002, 0), DbS.A0z(HHD.class));
    }

    private final void A00(Map map) {
        C346927vz A002 = C2604245p.A00(map);
        boolean z = true;
        if (A002 == null || A002 == C346927vz.GRANTED) {
            C14227TsA tsA = this.A00;
            if (tsA != null) {
                tsA.A00 = null;
                C14227TsA.A00(tsA);
                A04(false);
                return;
            }
        } else {
            if (A002 != C346927vz.DENIED_DONT_ASK_AGAIN) {
                z = false;
            }
            C14227TsA tsA2 = this.A00;
            if (tsA2 != null) {
                tsA2.A00 = new HAQ(z);
                C14227TsA.A00(tsA2);
                C2604245p.A01(requireActivity(), this);
                return;
            }
        }
        0qQ.A0F("gridAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStart() {
        int A02 = AnonymousClass0fD.A02(-1752931317);
        HHC.super.onStart();
        FragmentActivity requireActivity = requireActivity();
        A00(1DL.A02(requireActivity, C2604245p.A05(requireActivity)));
        AnonymousClass0fD.A09(174026961, A02);
    }
}
