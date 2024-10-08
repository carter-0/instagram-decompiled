package X;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreferenceCompat;

/* renamed from: X.WCn  reason: case insensitive filesystem */
public final class C18918WCn implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ SwitchPreferenceCompat A00;

    public C18918WCn(SwitchPreferenceCompat switchPreferenceCompat) {
        this.A00 = switchPreferenceCompat;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.A00.A0O(z);
    }
}
