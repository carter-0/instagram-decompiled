package X;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreference;

/* renamed from: X.WCm  reason: case insensitive filesystem */
public final class C18917WCm implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ SwitchPreference A00;

    public C18917WCm(SwitchPreference switchPreference) {
        this.A00 = switchPreference;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.A00.A0O(z);
    }
}
