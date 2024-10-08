package X;

import android.content.res.TypedArray;

/* renamed from: X.7du  reason: invalid class name and case insensitive filesystem */
public final class C336007du extends AnonymousClass3O4 {
    public final void A05(int i) {
        AnonymousClass3O5 r2 = this.A00;
        r2.A05 = (i & 16777215) | (r2.A05 & -16777216);
    }

    public C336007du() {
        this.A00.A0G = false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass3O4 A00(TypedArray typedArray) {
        super.A00(typedArray);
        if (typedArray.hasValue(2)) {
            A05(typedArray.getColor(2, this.A00.A05));
        }
        if (typedArray.hasValue(12)) {
            AnonymousClass3O5 r1 = this.A00;
            r1.A09 = typedArray.getColor(12, r1.A09);
        }
        return this;
    }
}
