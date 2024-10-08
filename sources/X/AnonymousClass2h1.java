package X;

import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2h1  reason: invalid class name */
public final class AnonymousClass2h1 extends AnonymousClass2h2 {
    public C71532dv A00;

    public final C71532dv A00() {
        C71532dv r1 = this.A00;
        if (r1 == null) {
            C226502gv r12 = (C226502gv) this.A02;
            ByteBuffer byteBuffer = (ByteBuffer) r12.A03.get();
            if (byteBuffer == null) {
                r1 = null;
            } else {
                AtomicReference atomicReference = r12.A04;
                r1 = (C71532dv) atomicReference.get();
                if (r1 == null || !1FH.A00(r1, (Object) null, atomicReference)) {
                    r1 = C226502gv.A00(byteBuffer);
                }
            }
            this.A00 = r1;
        }
        return r1;
    }

    public final Drawable newDrawable() {
        return new C226462gr(this);
    }
}
