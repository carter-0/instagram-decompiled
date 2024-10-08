package X;

import android.widget.CompoundButton;
import com.instagram.common.ui.base.IgTextView;

public final class APJ implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ IgTextView A00;
    public final /* synthetic */ IgTextView A01;
    public final /* synthetic */ AnonymousClass8QZ A02;

    public APJ(IgTextView igTextView, IgTextView igTextView2, AnonymousClass8QZ r3) {
        this.A00 = igTextView;
        this.A01 = igTextView2;
        this.A02 = r3;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AnonymousClass8QZ r0;
        Integer num;
        if (z) {
            this.A00.setActivated(true);
            this.A01.setActivated(false);
            r0 = this.A02;
            num = AnonymousClass05K.A01;
        } else {
            this.A01.setActivated(true);
            this.A00.setActivated(false);
            r0 = this.A02;
            num = AnonymousClass05K.A00;
        }
        r0.A0A = num;
        r0.A0T.D3h(num);
    }
}
