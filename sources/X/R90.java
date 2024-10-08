package X;

import com.facebook.proxygen.ReadBuffer;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class R90 extends C8804RAf {
    public final /* synthetic */ C12199Soo A00;

    public R90(C12199Soo soo) {
        this.A00 = soo;
    }

    public final void run() {
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4096);
            C12199Soo soo = this.A00;
            ReadBuffer readBuffer = soo.A06;
            int size = readBuffer.size();
            soo.A00 += size;
            while (size > 0) {
                int read = readBuffer.read(allocate.array(), 0, 4096);
                allocate.limit(read);
                size -= read;
                soo.A00 += read;
                allocate.rewind();
                soo.A02.onBody(allocate);
                allocate.clear();
            }
        } catch (IOException | IllegalStateException e) {
            0wb.A07("LigerAsyncInterface_body", e);
        }
    }

    public final String toString() {
        return Pxf.A0l("LigerAsyncResponseHandler.onBody: ", this.A00.A08.A09);
    }
}
