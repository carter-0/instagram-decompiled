package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* renamed from: X.9b6  reason: invalid class name and case insensitive filesystem */
public final class C381059b6 extends AnonymousClass2i8 {
    public final Animatable A00;
    public final boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C381059b6(Animatable animatable, Drawable drawable, boolean z) {
        super(drawable);
        0qQ.A0B(animatable, 2);
        this.A00 = animatable;
        this.A01 = z;
    }

    public final void A03() {
        if (this.A01) {
            this.A00.start();
        }
    }

    public final void A04() {
        if (this.A01) {
            this.A00.stop();
        }
    }
}
