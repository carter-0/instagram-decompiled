package X;

import android.widget.CompoundButton;
import com.google.android.material.chip.ChipGroup;

/* renamed from: X.WCo  reason: case insensitive filesystem */
public final class C18919WCo implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ ChipGroup A00;

    public C18919WCo(ChipGroup chipGroup) {
        this.A00 = chipGroup;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i;
        ChipGroup chipGroup = this.A00;
        if (!chipGroup.A01) {
            if (!chipGroup.getCheckedChipIds().isEmpty() || !chipGroup.A02) {
                int id = compoundButton.getId();
                i = -1;
                int i2 = chipGroup.A00;
                if (z) {
                    if (!(i2 == -1 || i2 == id || !chipGroup.A03)) {
                        ChipGroup.A00(chipGroup, i2, false);
                    }
                    chipGroup.A00 = id;
                    return;
                } else if (i2 != id) {
                    return;
                }
            } else {
                ChipGroup.A00(chipGroup, compoundButton.getId(), true);
                i = compoundButton.getId();
            }
            chipGroup.A00 = i;
        }
    }
}
