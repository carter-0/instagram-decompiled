package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4Bv  reason: invalid class name and case insensitive filesystem */
public final class C262024Bv extends Handler {
    public final /* synthetic */ 1bO A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C262024Bv(Looper looper, 1bO r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        boolean z;
        AnonymousClass655 r3;
        Message message2 = message;
        int i = message2.what;
        if (i == 1) {
            1bO r5 = this.A00;
            Object obj = message2.obj;
            obj.getClass();
            String str = (String) obj;
            Charset charset = 1bO.A0w;
            try {
                ArrayList A002 = C3027164z.A00(str);
                AnonymousClass4UY r7 = r5.A0Q;
                Iterator it = A002.iterator();
                while (it.hasNext()) {
                    AnonymousClass651 r6 = (AnonymousClass651) it.next();
                    02m r13 = r7.A00;
                    long j = r6.A00;
                    r13.markerStart(724184457, (int) (j ^ (j >>> 32)), false);
                    int size = r6.A05.size();
                    long j2 = r6.A00;
                    r13.markerAnnotate(724184457, (int) (j2 ^ (j2 >>> 32)), "data_size", size);
                    long j3 = r6.A00;
                    r13.markerAnnotate(724184457, (int) (j3 ^ (j3 >>> 32)), "seq_id", j3);
                    boolean z2 = r6.A06;
                    long j4 = r6.A00;
                    r13.markerAnnotate(724184457, (int) (j4 ^ (j4 >>> 32)), "realtime", z2);
                    Long l = r6.A01;
                    if (l != null) {
                        long longValue = l.longValue();
                        long j5 = r6.A00;
                        r13.markerAnnotate(724184457, (int) (j5 ^ (j5 >>> 32)), "mi_trace_id", longValue);
                    }
                }
                if (!r5.A0B || !r5.A0D) {
                    Iterator it2 = A002.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass654.A00(r7.A00, (AnonymousClass651) it2.next(), "bootstrap_start");
                    }
                    r5.A0V.add(A002);
                    return;
                }
                if (((Boolean) r5.A0f.getValue()).booleanValue()) {
                    r3 = AnonymousClass655.A04;
                } else {
                    r3 = AnonymousClass655.A03;
                }
                if (!((Boolean) r5.A0e.getValue()).booleanValue() || r5.A0P.A00(r3, A002, r5.A00)) {
                    r7.A00(A002);
                    1bO.A07(r5, A002);
                    return;
                }
                z = ((Boolean) r5.A0d.getValue()).booleanValue();
                if (z) {
                    r5.A0B();
                }
            } catch (IOException e) {
                1Zp A003 = ((1Zn) r5.A0Z.getValue()).A00(AnonymousClass05K.A02, 817891655, 0, false);
                A003.A05(new RuntimeException("Could not deserialize RealtimeSyncMessages", e));
                A003.A00();
                z = r5.A0B;
            }
        } else if (i == 2) {
            1bO r1 = this.A00;
            Charset charset2 = 1bO.A0w;
            2L2.A00(r1.A0M).EK3();
        } else {
            throw new IllegalStateException(002.A0O("Invalid message.what: ", i));
        }
    }
}
