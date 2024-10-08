package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.Gwt  reason: case insensitive filesystem */
public final class C53949Gwt extends C243963aQ {
    public final int A00;
    public final Drawable A01;
    public final ImageView.ScaleType A02;
    public final boolean A03;
    public final 2WX A04;

    public C53949Gwt(Drawable drawable, ImageView.ScaleType scaleType, 2WX r4, int i, boolean z) {
        0qQ.A0B(scaleType, 2);
        this.A01 = drawable;
        this.A02 = scaleType;
        this.A03 = z;
        this.A00 = i;
        this.A04 = r4;
    }

    public final C244523bK A0X(C244463bE r14) {
        0qQ.A0B(r14, 0);
        Drawable drawable = this.A01;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        return C51965G9l.A0W(this.A04, new 2WQ(((float) intrinsicWidth) / ((float) intrinsicHeight), ((long) intrinsicWidth) | 9221401712017801216L, ((long) intrinsicHeight) | 9221401712017801216L), new AnonymousClass2WG(C51971G9r.A0d(C56964IJi.A00, 15), (C62320sa) null, C59098J6g.A01(this, 37), r14.A01()));
    }
}
