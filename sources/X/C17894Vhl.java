package X;

import android.graphics.PointF;
import android.graphics.RectF;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Vhl  reason: case insensitive filesystem */
public final class C17894Vhl {
    public int A00;
    public AnonymousClass59P A01;
    public final C376649Iu A02;
    public final PointF A03;
    public final RectF A04;
    public final Integer A05;

    public final void A00() {
        int i = this.A00;
        ImmutableList immutableList = (ImmutableList) this.A02.A00;
        if (i < immutableList.size()) {
            int i2 = this.A00;
            this.A00 = i2 + 1;
            C20841X0q x0q = (C20841X0q) immutableList.get(i2);
            AnonymousClass59P r3 = this.A01;
            0qQ.A0A(x0q);
            r3.DIT(this.A03, this.A04, x0q, this.A05);
            if (!(x0q instanceof XBi)) {
                A00();
            }
        }
    }

    public C17894Vhl(PointF pointF, RectF rectF, C376649Iu r3, AnonymousClass59P r4, Integer num) {
        this.A02 = r3;
        this.A03 = pointF;
        this.A04 = rectF;
        this.A05 = num;
        this.A01 = r4;
    }
}
