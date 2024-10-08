package X;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;

/* renamed from: X.WCl  reason: case insensitive filesystem */
public final class C18916WCl implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ CheckBoxPreference A00;

    public C18916WCl(CheckBoxPreference checkBoxPreference) {
        this.A00 = checkBoxPreference;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.A00.A0O(z);
    }
}
