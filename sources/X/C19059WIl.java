package X;

import com.facebook.react.common.mapbuffer.ReadableMapBuffer;

/* renamed from: X.WIl  reason: case insensitive filesystem */
public final class C19059WIl implements X9J {
    public final int A00;
    public final /* synthetic */ ReadableMapBuffer A01;

    public C19059WIl(ReadableMapBuffer readableMapBuffer, int i) {
        this.A01 = readableMapBuffer;
        this.A00 = i;
    }

    public final boolean Agz() {
        A00(C16515UwK.BOOL);
        ReadableMapBuffer readableMapBuffer = this.A01;
        int i = this.A00 + 4;
        V6D v6d = ReadableMapBuffer.Companion;
        return C66581MXm.A1V(readableMapBuffer.buffer.getInt(i));
    }

    public final double Ayk() {
        A00(C16515UwK.DOUBLE);
        ReadableMapBuffer readableMapBuffer = this.A01;
        int i = this.A00 + 4;
        V6D v6d = ReadableMapBuffer.Companion;
        return readableMapBuffer.buffer.getDouble(i);
    }

    public final int BI6() {
        A00(C16515UwK.INT);
        ReadableMapBuffer readableMapBuffer = this.A01;
        int i = this.A00 + 4;
        V6D v6d = ReadableMapBuffer.Companion;
        return readableMapBuffer.buffer.getInt(i);
    }

    public final int BJq() {
        ReadableMapBuffer readableMapBuffer = this.A01;
        int i = this.A00;
        V6D v6d = ReadableMapBuffer.Companion;
        return readableMapBuffer.buffer.getShort(i) & 65535;
    }

    public final long BOX() {
        A00(C16515UwK.A05);
        ReadableMapBuffer readableMapBuffer = this.A01;
        int i = this.A00 + 4;
        V6D v6d = ReadableMapBuffer.Companion;
        return readableMapBuffer.buffer.getLong(i);
    }

    public final XCN BOx() {
        A00(C16515UwK.MAP);
        ReadableMapBuffer readableMapBuffer = this.A01;
        int i = this.A00 + 4;
        V6D v6d = ReadableMapBuffer.Companion;
        return new ReadableMapBuffer(readableMapBuffer.buffer, readableMapBuffer.offsetToMapBuffer + 8 + (readableMapBuffer.count * 12) + readableMapBuffer.buffer.getInt(i) + 4);
    }

    public final String C1u() {
        A00(C16515UwK.STRING);
        return this.A01.readStringValue(this.A00 + 4);
    }

    private final void A00(C16515UwK uwK) {
        C16515UwK CAF = CAF();
        if (uwK != CAF) {
            StringBuilder A0d = C13990Tnq.A0d();
            A0d.append(uwK);
            A0d.append(" for key: ");
            A0d.append(BJq());
            A0d.append(" found ");
            A0d.append(CAF);
            throw new IllegalStateException(AnonymousClass7TF.A0l(" instead.", A0d));
        }
    }

    public final C16515UwK CAF() {
        C16515UwK[] values = C16515UwK.values();
        ReadableMapBuffer readableMapBuffer = this.A01;
        int i = this.A00 + 2;
        V6D v6d = ReadableMapBuffer.Companion;
        return values[readableMapBuffer.buffer.getShort(i) & 65535];
    }
}
