package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.XFx  reason: case insensitive filesystem */
public final class C21130XFx extends Handler {
    public final /* synthetic */ C22140Xw4 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21130XFx(Looper looper, C22140Xw4 xw4) {
        super(looper);
        this.A00 = xw4;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, X.3nc] */
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C22140Xw4 xw4 = this.A00;
            XIA xia = new XIA(xw4.A03, (ByteArrayOutputStream) message.obj);
            C66841qe r4 = xw4.A05;
            Integer num = xw4.A04.A04;
            Iterator it = Collections.singletonList(xia).iterator();
            C251763nd r2 = new C251763nd(new Object(), r4, xw4.A06, xw4.A07, num, it);
            while (r2.A00.hasNext()) {
                r2.A00();
            }
            return;
        }
        throw DbW.A0a("Unknown what=", i);
    }
}
