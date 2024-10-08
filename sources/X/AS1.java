package X;

import android.os.Bundle;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class AS1 implements C41793B0y, C41801B1g {
    public final C312446eR A00;
    public final A8o A01;
    public final List A02 = AnonymousClass7TE.A1C();

    public final List EzQ(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        if (bundle.containsKey("commandType")) {
            int i = bundle.getInt("commandType");
            if (i == 0) {
                if (bundle.containsKey("messageType") && bundle.containsKey("buffer")) {
                    int i2 = bundle.getInt("messageType");
                    byte[] byteArray = bundle.getByteArray("buffer");
                    if (byteArray != null) {
                        this.A01.A00(C39874ACv.A00(byteArray, i2));
                    }
                }
            } else if (i == 1 && bundle.containsKey("messageType") && bundle.containsKey("buffer")) {
                int i3 = bundle.getInt("messageType");
                byte[] byteArray2 = bundle.getByteArray("buffer");
                if (byteArray2 != null) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArray2.length);
                    allocateDirect.put(byteArray2);
                    allocateDirect.position(0);
                    C41811B1q b1q = this.A01.A01;
                    if (b1q != null) {
                        b1q.didReceiveMessageFromPlatform(i3, allocateDirect, allocateDirect.position());
                    }
                }
            }
        }
        List list = this.A02;
        if (!AnonymousClass7TE.A1b(list)) {
            return null;
        }
        ArrayList A1D = AnonymousClass7TE.A1D(list);
        list.clear();
        return A1D;
    }

    public final void AP7(C39874ACv aCv) {
        Bundle A002 = Q21.A00(AnonymousClass7TH.A0h("offset", Integer.valueOf(aCv.A01.position()), AnonymousClass7TF.A0x("serviceType", this.A00.ordinal()), AnonymousClass7TH.A0J(AnonymousClass05K.A0C), AnonymousClass7TE.A1L("messageType", Integer.valueOf(aCv.A00))));
        ByteBuffer byteBuffer = aCv.A01;
        if (byteBuffer.capacity() > 256000) {
            0KC.A0C("ServiceMessageChannelHost", "Service message exceeding buffer max size, skipping!");
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        A002.putByteArray("buffer", bArr);
        this.A02.add(A002);
    }

    public AS1(C312446eR r2, A8o a8o) {
        this.A00 = r2;
        this.A01 = a8o;
        a8o.A02 = this;
    }
}
