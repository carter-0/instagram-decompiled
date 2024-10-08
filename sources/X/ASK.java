package X;

import java.nio.ByteBuffer;

public final class ASK implements C344977sj {
    public final /* synthetic */ AA3 A00;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.ADH, java.lang.Object] */
    public final /* bridge */ /* synthetic */ ADH AKx() {
        ? obj = new Object();
        obj.A01 = -1;
        obj.A0A = null;
        obj.A0C = new C344957sh[1];
        return obj;
    }

    public ASK(AA3 aa3) {
        this.A00 = aa3;
    }

    public final /* bridge */ /* synthetic */ void Dd7(Object obj) {
        C344957sh[] r4 = ((ADH) obj).A0C;
        boolean z = true;
        if (r4 == null || r4.length != 1) {
            z = false;
        }
        0JA.A07(z);
        C39775A8u a8u = this.A00.A05;
        ByteBuffer byteBuffer = r4[0].A02;
        synchronized (a8u) {
            if (byteBuffer != null) {
                if (byteBuffer.capacity() == a8u.A00) {
                    a8u.A02.add(byteBuffer);
                }
            }
        }
    }
}
