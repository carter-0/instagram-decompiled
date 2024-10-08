package X;

import android.content.Context;
import com.facebook.proxygen.LigerSamplePolicy;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.SrH  reason: case insensitive filesystem */
public final class C12314SrH implements C13827Thy {
    public int A00;
    public long A01;
    public C12376SsQ A02;
    public int A03;

    public final C12315SrI Ble() {
        C266784aL.A06(false, "Not applicable for this consumer");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void release() {
    }

    public final void E4W(ByteBuffer byteBuffer) {
        C12376SsQ ssQ = this.A02;
        Q1A A002 = ssQ.A0B.A00.A00(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        if (A002 != null) {
            A002.AjB().put(byteBuffer);
            A002.EQ8(0, byteBuffer.position(), TimeUnit.NANOSECONDS.toMicros((this.A01 * TimeUnit.SECONDS.toNanos(1)) / ((long) this.A00)), 1);
            ssQ.A0B.A00.A03(A002);
            this.A01 += (long) (byteBuffer.position() / this.A03);
        }
    }

    public final boolean Eve() {
        return this.A02.Evd();
    }

    public final void FNG() {
        this.A02.FNG();
    }

    public final void flush() {
        this.A02.flush();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.S0W] */
    public C12314SrH(Context context, SEV sev, C13725Tfv tfv, SJL sjl, Q1J q1j, C13804ThT thT, C10686RwQ rwQ, C10862RzN rzN, String str, ExecutorService executorService) {
        String str2;
        S0V s0v;
        int i;
        C12376SsQ ssQ = new C12376SsQ(context, tfv, sjl, thT, rwQ, rzN, str, executorService);
        this.A02 = ssQ;
        ssQ.A0B = new Object();
        SFQ sfq = ssQ.A05.A0C;
        if (sfq.A02 == null) {
            Integer[] A002 = AnonymousClass05K.A00(4);
            int length = A002.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Integer num = A002[i2];
                if (num != AnonymousClass05K.A00 || sfq.A03) {
                    switch (num.intValue()) {
                        case 1:
                            str2 = "LC";
                            break;
                        case 2:
                            str2 = "Main";
                            break;
                        case 3:
                            str2 = "SSR";
                            break;
                        default:
                            str2 = "HE";
                            break;
                    }
                    if ("lc".equalsIgnoreCase(str2)) {
                        i = 2;
                    } else if ("main".equalsIgnoreCase(str2)) {
                        i = 1;
                    } else if ("ssr".equalsIgnoreCase(str2)) {
                        i = 3;
                    } else if ("he".equalsIgnoreCase(str2)) {
                        i = 5;
                    } else {
                        s0v = null;
                        sfq.A02 = s0v;
                        ssQ.A0B.A00(sfq);
                    }
                    s0v = new S0V(i);
                    sfq.A02 = s0v;
                    ssQ.A0B.A00(sfq);
                } else {
                    i2++;
                }
            }
        } else {
            ssQ.A0B.A00(sfq);
        }
        SJL sjl2 = ssQ.A03;
        String str3 = null;
        try {
            str3 = ssQ.A0B.A00.A05.getName();
        } catch (IllegalStateException unused) {
        }
        sjl2.A0I = str3;
        this.A02.EwY(q1j, 5);
        SEV sev2 = sev;
        this.A03 = sev2.A00 * 2;
        this.A00 = sev2.A01;
        this.A01 = 0;
    }
}
