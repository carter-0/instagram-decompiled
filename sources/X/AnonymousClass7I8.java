package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;

/* renamed from: X.7I8  reason: invalid class name */
public final class AnonymousClass7I8 {
    public int A00;
    public final int A01;
    public final Resources A02;

    public AnonymousClass7I8(Context context) {
        0qQ.A0B(context, 1);
        Resources resources = context.getResources();
        0qQ.A07(resources);
        this.A02 = resources;
        this.A01 = 2Yu.A0G(context, R.attr.actionBarButtonWidth);
    }

    public final int A00() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int i2 = this.A02.getDisplayMetrics().heightPixels - this.A01;
        this.A00 = i2;
        return i2;
    }
}
