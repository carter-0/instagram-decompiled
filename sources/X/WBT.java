package X;

import android.text.Layout;
import android.view.View;
import com.instagram.igds.components.button.IgdsButton;

public final class WBT implements View.OnLayoutChangeListener {
    public final /* synthetic */ IgdsButton A00;
    public final /* synthetic */ AnonymousClass719 A01;

    public WBT(IgdsButton igdsButton, AnonymousClass719 r2) {
        this.A00 = igdsButton;
        this.A01 = r2;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Layout textViewLayout = ((IgdsButton) view).getTextViewLayout();
        if (textViewLayout.getLineCount() > 0 && textViewLayout.getEllipsisCount(0) > 0) {
            this.A00.setText(AnonymousClass719.A00(this.A01, true));
        }
    }
}
