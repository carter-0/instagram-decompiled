package X;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.RAh  reason: case insensitive filesystem */
public final class C8806RAh extends 0v9 {
    public long A00;
    public final /* synthetic */ AnonymousClass1Cx A01;
    public final /* synthetic */ AnonymousClass1QX A02;
    public final /* synthetic */ 1Qe A03;
    public final /* synthetic */ 1QS A04;
    public final /* synthetic */ 1QU A05;
    public final /* synthetic */ AtomicBoolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8806RAh(AnonymousClass1Cx r4, AnonymousClass1QX r5, 1Qe r6, 1QS r7, 1QU r8, AtomicBoolean atomicBoolean) {
        super(11, 3, true, true);
        this.A01 = r4;
        this.A04 = r7;
        this.A03 = r6;
        this.A02 = r5;
        this.A06 = atomicBoolean;
        this.A05 = r8;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.2ZD] */
    public final void run() {
        1QS r3 = this.A04;
        URI uri = r3.A09;
        uri.getPath();
        this.A00 = SystemClock.elapsedRealtime();
        1Qb r9 = null;
        try {
            AnonymousClass1Cx r0 = this.A01;
            1Qe r8 = this.A03;
            r8.A02(r3);
            2ZL A002 = r0.A00.A00(this.A02);
            int i = A002.A02;
            String str = A002.A03;
            int i2 = r3.A04;
            ArrayList A1D = AnonymousClass7TE.A1D(A002.A04);
            ? obj = new Object();
            obj.A01 = i;
            obj.A02 = str;
            obj.A00 = i2;
            obj.A03 = A1D;
            r8.A00(obj, r3);
            1Qb A003 = A002.A00();
            if (A003 != null) {
                ByteBuffer allocate = ByteBuffer.allocate(4096);
                InputStream AjD = A003.AjD();
                while (true) {
                    int read = AjD.read(allocate.array());
                    if (read <= 0) {
                        break;
                    }
                    allocate.limit(read);
                    allocate.rewind();
                    r8.A05(r3, allocate);
                    allocate.clear();
                }
                A003.AI7();
            }
            r8.A03(r3);
        } catch (IOException e) {
            e = e;
            if (this.A06.get()) {
                e = new IOException(e.getMessage());
            }
            uri.getPath();
            if (r9 != null) {
                r9.AI7();
            }
            this.A03.A04(r3, e);
        }
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("HttpEngineBasedServiceLayer ");
        1QU r5 = this.A05;
        A16.append(r5.A09);
        A16.append(" ");
        A16.append(r5.A00());
        A16.append("@");
        A16.append("age ");
        A16.append(SystemClock.elapsedRealtime() - this.A00);
        A16.append(" ");
        A16.append(r5.A0E);
        A16.append(" ");
        return AnonymousClass7TF.A0i(this.A04.A09, A16);
    }
}
