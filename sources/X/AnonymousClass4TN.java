package X;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: X.4TN  reason: invalid class name */
public abstract class AnonymousClass4TN implements AnonymousClass4TO {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r2.arrayOffset() != 0) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.exoplayer2.metadata.Metadata ANb(X.AnonymousClass4QS r4) {
        /*
            r3 = this;
            java.nio.ByteBuffer r2 = r4.A02
            r2.getClass()
            int r0 = r2.position()
            if (r0 != 0) goto L_0x0018
            boolean r0 = r2.hasArray()
            if (r0 == 0) goto L_0x0018
            int r1 = r2.arrayOffset()
            r0 = 1
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            X.C256703wD.A03(r0)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r4.A00
            r0 = r0 & r1
            if (r0 != r1) goto L_0x0025
            r0 = 0
            return r0
        L_0x0025:
            com.google.android.exoplayer2.metadata.Metadata r0 = r3.A06(r4, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TN.ANb(X.4QS):com.google.android.exoplayer2.metadata.Metadata");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4XV, java.lang.Object] */
    public Metadata A06(AnonymousClass4QS r11, ByteBuffer byteBuffer) {
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        ? obj = new Object();
        obj.A02 = array;
        obj.A00 = limit;
        String A09 = obj.A09();
        A09.getClass();
        String A092 = obj.A09();
        A092.getClass();
        return new Metadata(new EventMessage(A09, A092, Arrays.copyOfRange(obj.A02, obj.A01, obj.A00), obj.A06(), obj.A06()));
    }
}
