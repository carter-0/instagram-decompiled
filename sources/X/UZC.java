package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.instagram.android.R;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;

public final class UZC extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "SetReminderBottomSheetFragment";
    public int A00;
    public long A01;
    public VVK A02;
    public boolean A03 = true;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final String getModuleName() {
        return "limited_interactions_set_reminder_bottom_sheet";
    }

    public static final String[] A01(UZC uzc) {
        Context requireContext;
        int i;
        int i2 = uzc.A00;
        String[] strArr = new String[2];
        Context requireContext2 = uzc.requireContext();
        if (i2 == 1) {
            strArr[0] = requireContext2.getString(2131964976);
            requireContext = uzc.requireContext();
            i = 2131964981;
        } else {
            strArr[0] = requireContext2.getString(2131964977);
            requireContext = uzc.requireContext();
            i = 2131964982;
        }
        strArr[1] = requireContext.getString(i);
        return strArr;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public static final void A00(UZC uzc) {
        long j;
        long A0P = AnonymousClass7TE.A0P(JTU.A04());
        boolean z = uzc.A03;
        long j2 = (long) uzc.A00;
        if (z) {
            j = SandboxRepository.CACHE_TTL;
        } else {
            j = 604800;
        }
        uzc.A01 = A0P + (j2 * j);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1833335897);
        UZC.super.onCreate(bundle);
        this.A01 = requireArguments().getLong("LimitedSettingsFragment.REMINDER_DATE");
        AnonymousClass0fD.A09(1705304956, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        int A022 = AnonymousClass0fD.A02(-189145044);
        0qQ.A0B(layoutInflater, 0);
        View A0A = DbU.A0A(layoutInflater, viewGroup, R.layout.set_reminder_bottom_sheet, false);
        View A0G = AnonymousClass7TF.A0G(A0A, R.id.reminder_action_button);
        2eS.A01(A0G);
        WB0.A00(A0G, 48, this);
        A0G.setEnabled(true);
        NumberPicker numberPicker = (NumberPicker) AnonymousClass7TF.A0F(A0A, R.id.units_picker);
        NumberPicker numberPicker2 = (NumberPicker) AnonymousClass7TF.A0F(A0A, R.id.duration_picker);
        long A0P = this.A01 - AnonymousClass7TE.A0P(JTU.A04());
        long j = A0P / 604800;
        if (((float) j) > 0.0f) {
            this.A03 = false;
            i = (int) Math.ceil((double) j);
        } else {
            i = (int) (A0P / SandboxRepository.CACHE_TTL);
        }
        this.A00 = i;
        boolean z = this.A03;
        numberPicker.setDisplayedValues((String[]) null);
        int i3 = 4;
        if (z) {
            i3 = 6;
        }
        int i4 = 0;
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(i3 - 1);
        String[] strArr = new String[i3];
        do {
            i2 = i4 + 1;
            strArr[i4] = String.valueOf(i2);
            i4 = i2;
        } while (i2 < i3);
        numberPicker.setDisplayedValues(strArr);
        numberPicker.setValue(Math.max(this.A00 - 1, 0));
        numberPicker.setOnValueChangedListener(new WD5(3, (Object) numberPicker2, (Object) this));
        numberPicker.setWrapSelectorWheel(false);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(1);
        numberPicker2.setDisplayedValues(A01(this));
        numberPicker2.setWrapSelectorWheel(false);
        numberPicker2.setValue(this.A03 ^ true ? 1 : 0);
        numberPicker2.setOnValueChangedListener(new WD3(2, numberPicker, numberPicker2, this));
        AnonymousClass0fD.A09(-1642741927, A022);
        return A0A;
    }
}
