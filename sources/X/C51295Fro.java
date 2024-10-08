package X;

import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.Fro  reason: case insensitive filesystem */
public final class C51295Fro implements Runnable {
    public final /* synthetic */ C46723DkC A00;

    public C51295Fro(C46723DkC dkC) {
        this.A00 = dkC;
    }

    public final void run() {
        C46723DkC dkC = this.A00;
        Drawable drawable = dkC.getCompoundDrawablesRelative()[2];
        if (dkC.A02 && dkC.isFocused() && drawable == null) {
            dkC.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.token_delete, 0);
        }
        if (!dkC.isFocused()) {
            dkC.A01 = false;
            if (drawable != null) {
                dkC.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
            }
        }
    }
}
