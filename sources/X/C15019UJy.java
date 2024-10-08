package X;

import android.graphics.BitmapFactory;
import java.nio.ByteBuffer;

/* renamed from: X.UJy  reason: case insensitive filesystem */
public final class C15019UJy extends AnonymousClass6BC implements X2P {
    public final void ANd(ByteBuffer byteBuffer, int i) {
        C71542dx r0 = (C71542dx) C18807W3e.A04(UKB.class, byteBuffer, i, 0);
        if (r0 != null) {
            this.A01 = r0;
            byte[] A07 = C18807W3e.A07(byteBuffer, i, 1);
            if (A07 != null) {
                this.A00 = BitmapFactory.decodeByteArray(A07, 0, A07.length);
                C18807W3e.A06(byteBuffer, i, 2);
                return;
            }
            throw new IllegalArgumentException(C273654mx.A00(1535));
        }
        throw new IllegalArgumentException(C273654mx.A00(1536));
    }
}
