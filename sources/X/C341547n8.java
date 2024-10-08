package X;

import android.media.MediaCodec;
import com.facebook.common.dextricks.Constants;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7n8  reason: invalid class name and case insensitive filesystem */
public final class C341547n8 extends C345287tF {
    public AUL A00;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r7 != null) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AD9 AMQ(X.C341687nM r6, X.ADm r7, java.io.File r8) {
        /*
            r5 = this;
            r0 = 0
            X.AD9 r4 = super.AMQ(r0, r7, r8)
            r1 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r2 = 0
            if (r7 == 0) goto L_0x002f
            java.lang.Boolean r0 = r7.A03
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x002f
            X.AUL r0 = r5.A00
            if (r0 == 0) goto L_0x002f
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A04
            boolean r0 = r0.get()
            if (r0 != r1) goto L_0x002f
            java.lang.Integer r1 = X.AnonymousClass05K.A01
        L_0x0023:
            java.lang.Boolean r0 = r7.A03
            boolean r2 = X.0qQ.A0K(r0, r3)
        L_0x0029:
            X.AD9 r0 = new X.AD9
            r0.<init>(r4, r1, r2)
            return r0
        L_0x002f:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r7 == 0) goto L_0x0029
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C341547n8.AMQ(X.7nM, X.ADm, java.io.File):X.AD9");
    }

    public final void A0C(boolean z) {
        Integer num;
        int i;
        AUL aul = this.A00;
        if (aul != null) {
            AtomicBoolean atomicBoolean = aul.A04;
            if (atomicBoolean.getAndSet(z) != z) {
                boolean z2 = atomicBoolean.get();
                C341667nK r2 = aul.A01;
                if (z2) {
                    num = AnonymousClass05K.A01;
                } else {
                    num = AnonymousClass05K.A00;
                }
                if (r2 != null) {
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    if (num.intValue() != 0) {
                        i = 2097152;
                    } else {
                        i = Constants.LOAD_RESULT_NEED_REOPTIMIZATION;
                    }
                    bufferInfo.set(0, 0, 0, i);
                    r2.A03(bufferInfo, C341767nU.SUPERNOVA_AUDIO, AUL.A06);
                }
            }
        }
    }
}
