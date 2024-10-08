package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.BitSet;

/* renamed from: X.3gG  reason: invalid class name and case insensitive filesystem */
public final class C247393gG extends C244113af {
    public 2V1 A00;
    public C247373gE A01;
    public final BitSet A02;
    public final String[] A03 = {"drawable"};

    public C247393gG(2V1 r3, C247373gE r4) {
        super(r4, r3, 0);
        BitSet bitSet = new BitSet(1);
        this.A02 = bitSet;
        this.A01 = r4;
        this.A00 = r3;
        bitSet.clear();
    }

    public final void A0C() {
        this.A01.A02 = true;
    }

    public final C247373gE A0A() {
        C244113af.A00(this.A02, this.A03, 1);
        A02();
        return this.A01;
    }

    public final void A0B() {
        A0E(ImageView.ScaleType.FIT_CENTER);
    }

    public final void A0D(Drawable drawable) {
        this.A01.A00 = drawable;
        this.A02.set(0);
    }

    public final void A0E(ImageView.ScaleType scaleType) {
        this.A01.A01 = scaleType;
    }
}
