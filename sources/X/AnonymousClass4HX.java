package X;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.4HX  reason: invalid class name */
public final class AnonymousClass4HX {
    public float A00;
    public int A01;
    public int A02;
    public Object A03;
    public final WeakReference A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final String toString() {
        return 002.A0F("FeedItemViewInfo{mVisiblePercentage=", '}', this.A00);
    }

    public AnonymousClass4HX(View view, Object obj, float f, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A03 = obj;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = f;
        this.A07 = z;
        this.A05 = z2;
        this.A06 = z3;
        this.A04 = new WeakReference(view);
    }
}
