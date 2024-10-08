package X;

import java.io.IOException;
import java.nio.ByteBuffer;

public final class TTM extends 0Yg implements C62320sa {
    public final /* synthetic */ C249923ka A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTM(C249923ka r2) {
        super(0);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4096);
            0qQ.A07(allocate);
            C249923ka r2 = this.A00;
            C8845RCl rCl = r2.A00;
            if (rCl != null) {
                int read = rCl.read(allocate.array());
                while (read > 0) {
                    allocate.limit(read);
                    allocate.rewind();
                    r2.A0F(allocate);
                    allocate.clear();
                    C8845RCl rCl2 = r2.A00;
                    if (rCl2 == null) {
                        break;
                    }
                    read = rCl2.read(allocate.array());
                }
            }
        } catch (IOException unused) {
        }
        return C60340gF.A00;
    }
}
