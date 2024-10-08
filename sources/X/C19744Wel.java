package X;

import android.view.View;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.Wel  reason: case insensitive filesystem */
public final class C19744Wel implements MT5 {
    public final /* synthetic */ IgRadioGroup A00;

    public C19744Wel(IgRadioGroup igRadioGroup) {
        this.A00 = igRadioGroup;
    }

    public final void D1Y(View view, boolean z) {
        IgRadioGroup igRadioGroup = this.A00;
        if (!igRadioGroup.A04) {
            igRadioGroup.A04 = true;
            int i = igRadioGroup.A00;
            if (i != -1) {
                IgRadioGroup.A01(igRadioGroup, i, false);
            }
            igRadioGroup.A04 = false;
            igRadioGroup.setCheckedId(view.getId());
        }
    }
}
