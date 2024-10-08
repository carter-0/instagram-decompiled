package X;

import android.view.ViewGroup;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Map;

/* renamed from: X.FTq  reason: case insensitive filesystem */
public final class C50210FTq implements G7X {
    public final /* synthetic */ E50 A00;

    public C50210FTq(E50 e50) {
        this.A00 = e50;
    }

    public final void DFH() {
        E50 e50 = this.A00;
        Dba.A0C(e50.A05).A07 = true;
        ViewGroup viewGroup = e50.A03;
        viewGroup.getClass();
        viewGroup.setVisibility(0);
        SpinnerImageView spinnerImageView = e50.A0D;
        spinnerImageView.getClass();
        spinnerImageView.setVisibility(8);
        EEJ eej = e50.A06;
        eej.getClass();
        eej.A00();
        E50.A01(e50);
    }

    public final void DFI(F16 f16) {
        E50 e50 = this.A00;
        C46772Dkz dkz = e50.A07;
        dkz.A05.Ci5(new C22030Xtl("intro", dkz.A08, "quick_conversion_settings", (String) null, (String) null, (Map) null, (Map) null, C49893FBw.A01(f16)));
        if (f16 != null) {
            Dba.A0C(e50.A05).A03 = C49893FBw.A00(e50.requireContext(), f16);
            ((BusinessConversionActivity) e50.A05).A09.getValue();
        }
    }

    public final void DFG(C268654dm r11) {
        String A02 = C319126q5.A02(r11);
        String A01 = C319126q5.A01(r11);
        C46772Dkz dkz = this.A00.A07;
        dkz.A05.Ci6(new C22030Xtl("intro", dkz.A08, "quick_conversion_settings", A02, A01, (Map) null, (Map) null, (Map) null));
    }
}
