package X;

import android.graphics.Typeface;

/* renamed from: X.Wld  reason: case insensitive filesystem */
public final /* synthetic */ class C20117Wld implements Runnable {
    public final /* synthetic */ Typeface A00;
    public final /* synthetic */ AnonymousClass3U1 A01;

    public /* synthetic */ C20117Wld(Typeface typeface, AnonymousClass3U1 r2) {
        this.A01 = r2;
        this.A00 = typeface;
    }

    public final void run() {
        this.A01.A02(this.A00);
    }
}
