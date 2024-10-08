package X;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;

/* renamed from: X.6Az  reason: invalid class name and case insensitive filesystem */
public abstract class C303836Az extends AnonymousClass6B0 implements C303796Au {
    public C303796Au A00;

    public final void ANd(ByteBuffer byteBuffer, int i) {
        Class cls;
        if (this instanceof AnonymousClass6Ay) {
            cls = AnonymousClass6B2.class;
        } else if (this instanceof AnonymousClass6B5) {
            cls = AnonymousClass6BD.class;
        } else if (this instanceof AnonymousClass6B6) {
            cls = AnonymousClass6BA.class;
        } else if (this instanceof AnonymousClass6AB) {
            cls = AnonymousClass6AE.class;
        } else {
            cls = AnonymousClass6AC.class;
        }
        this.A00 = C303816Aw.A01(cls, byteBuffer, i, 0);
        float[] A05 = C303816Aw.A05(byteBuffer, i, 2);
        if (A05 != null) {
            this.A00 = A05;
            Object[] A06 = C303816Aw.A06(cls, byteBuffer, i, 1);
            if (A06 == null) {
                if (this.A00 != null) {
                    A06 = (Object[]) Array.newInstance(cls, 1);
                    A06[0] = this.A00;
                } else {
                    return;
                }
            }
            this.A00 = A06;
            AnonymousClass6BG[] r0 = (AnonymousClass6BG[]) C303816Aw.A06(AnonymousClass6BF.class, byteBuffer, i, 3);
            if (r0 != null) {
                this.A01 = r0;
            }
        }
    }
}
