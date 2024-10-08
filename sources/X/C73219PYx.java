package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.PYx  reason: case insensitive filesystem */
public final class C73219PYx implements Runnable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C72574PBf A01;

    public C73219PYx(Drawable drawable, C72574PBf pBf) {
        this.A01 = pBf;
        this.A00 = drawable;
    }

    public final void run() {
        this.A01.A04.setImageDrawable(this.A00);
    }
}
