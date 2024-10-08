package X;

import com.facebook.litho.LithoView;

/* renamed from: X.7i9  reason: invalid class name and case insensitive filesystem */
public abstract class C338557i9 extends C249703kE {
    public LithoView A00() {
        C337457gN r1 = (C337457gN) this;
        if (r1.A01) {
            return r1.itemView;
        }
        return null;
    }

    public void A01(LithoView lithoView, int i, int i2, int i3, int i4, boolean z) {
        lithoView.setLayoutParams(new C337467gO(i, i2, i3, i4));
    }
}
