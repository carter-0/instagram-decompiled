package X;

import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import java.util.Iterator;

/* renamed from: X.WqS  reason: case insensitive filesystem */
public final class C20386WqS implements Iterator, C62650uo {
    public int A00;
    public final int A01;
    public final /* synthetic */ ReadableMapBuffer A02;

    public C20386WqS(ReadableMapBuffer readableMapBuffer) {
        this.A02 = readableMapBuffer;
        this.A01 = readableMapBuffer.count - 1;
    }

    public final boolean hasNext() {
        return Pxg.A1T(this.A00, this.A01);
    }

    public final /* bridge */ /* synthetic */ Object next() {
        ReadableMapBuffer readableMapBuffer = this.A02;
        int i = this.A00;
        this.A00 = i + 1;
        V6D v6d = ReadableMapBuffer.Companion;
        return new C19059WIl(readableMapBuffer, readableMapBuffer.offsetToMapBuffer + 8 + (i * 12));
    }

    public final void remove() {
        throw Pxh.A0s();
    }
}
