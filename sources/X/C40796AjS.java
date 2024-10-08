package X;

import com.instagram.android.R;

/* renamed from: X.AjS  reason: case insensitive filesystem */
public final class C40796AjS implements Runnable {
    public final /* synthetic */ A68 A00;

    public C40796AjS(A68 a68) {
        this.A00 = a68;
    }

    public final void run() {
        A68 a68 = this.A00;
        a68.A00 = false;
        a68.A01.setColorFilter(a68.A02.getContext().getColor(R.color.design_dark_default_color_on_background));
    }
}
