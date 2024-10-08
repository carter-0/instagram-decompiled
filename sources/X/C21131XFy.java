package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.XFy  reason: case insensitive filesystem */
public final class C21131XFy extends Handler {
    public final /* synthetic */ C22139Xw3 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21131XFy(Looper looper, C22139Xw3 xw3) {
        super(looper);
        this.A00 = xw3;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, X.3nc] */
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C22139Xw3 xw3 = this.A00;
            XIA xia = new XIA(xw3.A03, (ByteArrayOutputStream) message.obj);
            C66841qe r4 = xw3.A05;
            Integer num = xw3.A04.A04;
            Iterator it = Collections.singletonList(xia).iterator();
            C251763nd r2 = new C251763nd(new Object(), r4, xw3.A06, xw3.A07, num, it);
            while (r2.A00.hasNext()) {
                r2.A00();
            }
            return;
        }
        throw DbW.A0a("Unknown what=", i);
    }
}
