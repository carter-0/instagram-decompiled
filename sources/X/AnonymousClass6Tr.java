package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.6Tr  reason: invalid class name */
public final class AnonymousClass6Tr {
    public static final Charset A06 = Charset.forName(ReactWebViewManager.HTML_ENCODING);
    public final String A00;
    public final ByteBuffer A01;
    public final Map A02;
    public final C308286Tq[] A03;
    public final AtomicReferenceArray A04;
    public final AtomicReferenceArray A05;

    public final C308296Ts A00(int i) {
        AtomicReferenceArray atomicReferenceArray = this.A04;
        C308296Ts r4 = (C308296Ts) atomicReferenceArray.get(i);
        if (r4 != null) {
            return r4;
        }
        int i2 = this.A03[0].A02 + (i * 16);
        ByteBuffer byteBuffer = this.A01;
        int i3 = byteBuffer.getInt(i2);
        int i4 = byteBuffer.getInt(i2 + 4);
        short s = byteBuffer.getShort(i2 + 8);
        byteBuffer.getShort(i2 + 10);
        C308296Ts r42 = new C308296Ts(this, i3, i4, s);
        if (!1Af.A00((Object) null, r42, atomicReferenceArray, i)) {
            return (C308296Ts) atomicReferenceArray.get(i);
        }
        return r42;
    }

    public final Object A01(int i) {
        AtomicReferenceArray atomicReferenceArray = this.A05;
        Object obj = atomicReferenceArray.get(i);
        if (obj != null) {
            return obj;
        }
        int i2 = this.A03[1].A02 + (i * 16);
        ByteBuffer byteBuffer = this.A01;
        int i3 = byteBuffer.getInt(i2);
        int i4 = byteBuffer.getInt(i2 + 4);
        byteBuffer.getInt(i2 + 8);
        byteBuffer.getInt();
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i3);
        duplicate.limit(i3 + i4);
        byte[] bArr = new byte[duplicate.remaining()];
        duplicate.get(bArr);
        String str = new String(bArr, A06);
        if (!1Af.A00((Object) null, str, atomicReferenceArray, i)) {
            return atomicReferenceArray.get(i);
        }
        return str;
    }

    public AnonymousClass6Tr(String str, ByteBuffer byteBuffer, Map map, AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2, C308286Tq[] r6) {
        this.A01 = byteBuffer;
        this.A03 = r6;
        this.A00 = str;
        this.A04 = atomicReferenceArray;
        this.A05 = atomicReferenceArray2;
        this.A02 = map;
    }
}
