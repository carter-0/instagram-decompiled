package X;

import android.graphics.BitmapFactory;
import java.nio.ByteBuffer;

/* renamed from: X.6BB  reason: invalid class name */
public final class AnonymousClass6BB extends AnonymousClass6BC implements C303796Au {
    public final void ANd(ByteBuffer byteBuffer, int i) {
        C303796Au r0;
        Class<C303806Av> cls = C303806Av.class;
        int A00 = C303816Aw.A00(byteBuffer, i, 0);
        if (A00 != 0) {
            r0 = cls.newInstance();
            r0.ANd(byteBuffer, A00);
        } else {
            r0 = null;
        }
        C71542dx r02 = (C71542dx) r0;
        if (r02 != null) {
            this.A01 = r02;
            byte[] A04 = C303816Aw.A04(byteBuffer, i, 1);
            if (A04 != null) {
                this.A00 = BitmapFactory.decodeByteArray(A04, 0, A04.length);
                C303816Aw.A03(byteBuffer, i, 2);
                return;
            }
            throw new IllegalArgumentException("bitmap content cannot be null");
        }
        throw new IllegalArgumentException("bitmap size cannot be null");
    }
}
