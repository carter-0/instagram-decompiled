package X;

import android.graphics.Bitmap;

/* renamed from: X.Lhg  reason: case insensitive filesystem */
public final class C64764Lhg implements C232262tL {
    public final Bitmap A00;

    public C64764Lhg(Bitmap bitmap) {
        0qQ.A0B(bitmap, 1);
        this.A00 = bitmap;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass7TF.A0h(this.A00);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
