package X;

import android.os.Bundle;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;

public final class R8Z extends AnonymousClass32G implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "EventInfoFragment";
    public C15452Ud3 A00;
    public AnalyticsEventDebugInfo A01;
    public AnonymousClass0wW A02;

    public final void configureActionBar(2da r6) {
        r6.Eu4(true);
        r6.setTitle(this.A01.A00);
        C46498Dg1 dg1 = new C46498Dg1(requireContext(), this.A02);
        dg1.A08("OPTIONS");
        dg1.A0C("STRING", C11496SbJ.A00(this, 70));
        if (this.A01.A02 == 1) {
            dg1.A0C("RELOG", new C11495SbI(this, 0));
        }
        r6.AA8("OPTIONS", C11499SbM.A00(this, dg1, 53));
    }

    public final String getModuleName() {
        return "event_info";
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-217904689);
        R8Z.super.onCreate(bundle);
        this.A02 = DbX.A0T(this);
        AnalyticsEventDebugInfo parcelable = requireArguments().getParcelable("EventInfoFragment.EventInfo");
        parcelable.getClass();
        this.A01 = parcelable;
        C15452Ud3 ud3 = new C15452Ud3(requireContext(), this, this.A01);
        this.A00 = ud3;
        A0V(ud3);
        AnonymousClass0fD.A09(-962207084, A022);
    }
}
