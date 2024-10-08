package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.VaM  reason: case insensitive filesystem */
public final class C17568VaM {
    public final FragmentActivity A00;
    public final WYX A01;
    public final PromoteData A02;
    public final IgRadioGroup A03;
    public final Long A04;
    public final PromoteState A05;

    public C17568VaM(FragmentActivity fragmentActivity, WYX wyx, PromoteData promoteData, PromoteState promoteState, IgRadioGroup igRadioGroup, Long l) {
        this.A03 = igRadioGroup;
        this.A02 = promoteData;
        this.A05 = promoteState;
        this.A00 = fragmentActivity;
        this.A01 = wyx;
        this.A04 = l;
    }
}
