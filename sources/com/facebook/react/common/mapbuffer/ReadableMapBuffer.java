package com.facebook.react.common.mapbuffer;

import X.00k;
import X.0qQ;
import X.AnonymousClass15Q;
import X.AnonymousClass7TF;
import X.C13990Tnq;
import X.C16515UwK;
import X.C20386WqS;
import X.C20719Wxs;
import X.C66581MXm;
import X.DbW;
import X.JTQ;
import X.Pxg;
import X.SBP;
import X.V6D;
import X.XCN;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

public final class ReadableMapBuffer implements XCN {
    public static final V6D Companion = new Object();
    public final ByteBuffer buffer;
    public int count;
    public final HybridData mHybridData;
    public final int offsetToMapBuffer;

    private final native ByteBuffer importByteBuffer();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.V6D, java.lang.Object] */
    static {
        SBP.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r1 > r9) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int getBucketIndexForKey(int r9) {
        /*
            r8 = this;
            X.2HY r0 = X.C18400Vr2.A00
            int r1 = r0.A00
            int r0 = r0.A01
            r7 = 0
            r6 = 1
            if (r9 > r0) goto L_0x000d
            r0 = 1
            if (r1 <= r9) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            r5 = -1
            if (r0 == 0) goto L_0x003b
            short r4 = (short) r9
            int r3 = r8.count
            int r3 = r3 - r6
        L_0x0015:
            if (r7 > r3) goto L_0x003b
            int r2 = r7 + r3
            int r2 = r2 >>> r6
            int r0 = r8.offsetToMapBuffer
            int r1 = r0 + 8
            int r0 = r2 * 12
            int r1 = r1 + r0
            java.nio.ByteBuffer r0 = r8.buffer
            short r1 = r0.getShort(r1)
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            r0 = r0 & r4
            int r0 = X.0qQ.A00(r1, r0)
            if (r0 >= 0) goto L_0x0035
            int r7 = r2 + 1
            goto L_0x0015
        L_0x0035:
            if (r0 <= 0) goto L_0x003a
            int r3 = r2 + -1
            goto L_0x0015
        L_0x003a:
            return r2
        L_0x003b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.common.mapbuffer.ReadableMapBuffer.getBucketIndexForKey(int):int");
    }

    private final void readHeader() {
        if (this.buffer.getShort() != 254) {
            this.buffer.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.count = this.buffer.getShort(this.buffer.position()) & 65535;
    }

    /* access modifiers changed from: private */
    public final String readStringValue(int i) {
        int i2 = this.offsetToMapBuffer + 8 + (this.count * 12) + this.buffer.getInt(i);
        int i3 = this.buffer.getInt(i2);
        byte[] bArr = new byte[i3];
        this.buffer.position(i2 + 4);
        this.buffer.get(bArr, 0, i3);
        return new String(bArr, AnonymousClass15Q.A05);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReadableMapBuffer)) {
            return false;
        }
        ByteBuffer byteBuffer = this.buffer;
        ByteBuffer byteBuffer2 = ((ReadableMapBuffer) obj).buffer;
        if (byteBuffer == byteBuffer2) {
            return true;
        }
        byteBuffer.rewind();
        byteBuffer2.rewind();
        return byteBuffer.equals(byteBuffer2);
    }

    public boolean getBoolean(int i) {
        return C66581MXm.A1V(this.buffer.getInt(getTypedValueOffsetForKey(i, C16515UwK.BOOL)));
    }

    public int getCount() {
        return this.count;
    }

    public double getDouble(int i) {
        return this.buffer.getDouble(getTypedValueOffsetForKey(i, C16515UwK.DOUBLE));
    }

    public int getInt(int i) {
        return this.buffer.getInt(getTypedValueOffsetForKey(i, C16515UwK.INT));
    }

    public /* bridge */ /* synthetic */ XCN getMapBuffer(int i) {
        int typedValueOffsetForKey = getTypedValueOffsetForKey(i, C16515UwK.MAP);
        return new ReadableMapBuffer(this.buffer, this.offsetToMapBuffer + 8 + (this.count * 12) + this.buffer.getInt(typedValueOffsetForKey) + 4);
    }

    public String getString(int i) {
        return readStringValue(getTypedValueOffsetForKey(i, C16515UwK.STRING));
    }

    public int hashCode() {
        this.buffer.rewind();
        return this.buffer.hashCode();
    }

    public Iterator iterator() {
        return new C20386WqS(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        CharSequence charSequence = "";
        00k.A0q(sb, ", ", "", charSequence, this, C20719Wxs.A00);
        String A0x = Pxg.A0x(sb);
        0qQ.A07(A0x);
        return A0x;
    }

    public ReadableMapBuffer(HybridData hybridData) {
        this.mHybridData = hybridData;
        this.buffer = importByteBuffer();
        this.offsetToMapBuffer = 0;
        readHeader();
    }

    private final int getTypedValueOffsetForKey(int i, C16515UwK uwK) {
        int bucketIndexForKey = getBucketIndexForKey(i);
        if (bucketIndexForKey != -1) {
            int i2 = bucketIndexForKey * 12;
            int i3 = this.offsetToMapBuffer + 8 + i2 + 2;
            C16515UwK uwK2 = C16515UwK.values()[this.buffer.getShort(i3) & 65535];
            if (uwK2 == uwK) {
                return this.offsetToMapBuffer + 8 + i2 + 4;
            }
            StringBuilder A0d = C13990Tnq.A0d();
            A0d.append(uwK);
            A0d.append(" for key: ");
            A0d.append(i);
            A0d.append(", found ");
            A0d.append(uwK2);
            throw new IllegalStateException(AnonymousClass7TF.A0l(" instead.", A0d));
        }
        throw DbW.A0a("Key not found: ", i);
    }

    public boolean contains(int i) {
        return JTQ.A1O(getBucketIndexForKey(i), -1);
    }

    public ReadableMapBuffer(ByteBuffer byteBuffer, int i) {
        this.mHybridData = null;
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i);
        this.buffer = duplicate;
        this.offsetToMapBuffer = i;
        readHeader();
    }
}
