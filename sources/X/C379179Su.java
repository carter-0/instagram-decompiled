package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.9Su  reason: invalid class name and case insensitive filesystem */
public final class C379179Su implements View.OnLayoutChangeListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ Drawable A01;
    public final /* synthetic */ C339807kC A02;
    public final /* synthetic */ C62320sa A03;

    public C379179Su(Drawable drawable, C339807kC r2, C62320sa r3, float f) {
        this.A01 = drawable;
        this.A02 = r2;
        this.A00 = f;
        this.A03 = r3;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        AnonymousClass9SA.A00(this.A01, this.A02.A07, 1.0f, this.A00, false);
        this.A03.invoke();
    }
}
