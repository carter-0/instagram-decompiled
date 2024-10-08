package X;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.4Dl  reason: invalid class name and case insensitive filesystem */
public final class C262374Dl extends Drawable.ConstantState {
    public final Paint A00;
    public final C262384Dm A01;

    public final int getChangingConfigurations() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4Dk, android.graphics.drawable.Drawable] */
    public final Drawable newDrawable() {
        ? drawable = new Drawable();
        drawable.A00 = this;
        return drawable;
    }

    public C262374Dl(Paint paint) {
        this.A01 = new C262384Dm(paint);
        this.A00 = new Paint(6);
    }

    public C262374Dl(C262374Dl r3) {
        this.A01 = r3.A01;
        this.A00 = new Paint(r3.A00);
    }
}
