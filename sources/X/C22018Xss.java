package X;

import android.media.AudioRecord;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: X.Xss  reason: case insensitive filesystem */
public final class C22018Xss {
    public int A00;
    public int A01;
    public AudioRecord A02;
    public boolean A03;
    public final int A04;
    public final long A05;
    public final Handler A06;
    public final C341607nE A07;
    public final C343487qI A08;
    public final C341467mw A09;
    public final Runnable A0A = new Y2Q(this);
    public final Runnable A0B = new C22375Y1d(this);
    public final boolean A0C;
    public final boolean A0D;
    public final C22555YAe A0E;
    public volatile Integer A0F;

    public final void A06(C341687nM r3, Handler handler) {
        synchronized (this) {
            this.A09.A01("sARc");
            A01(handler);
            this.A0F = AnonymousClass05K.A00;
            this.A06.post(new Y3B(handler, this, r3));
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.9tX, X.9dT] */
    public static int A00(C22018Xss xss, byte[] bArr) {
        int read;
        Integer num = xss.A0F;
        Integer num2 = AnonymousClass05K.A0C;
        if (num == num2) {
            C341467mw r4 = xss.A09;
            r4.A01("rbAR");
            int i = (xss.A05 > 0 ? 1 : (xss.A05 == 0 ? 0 : -1));
            AudioRecord audioRecord = xss.A02;
            int length = bArr.length;
            if (i > 0) {
                read = audioRecord.read(bArr, 0, length, 1);
            } else {
                read = audioRecord.read(bArr, 0, length);
            }
            r4.A01("rbARs");
            if (xss.A0F == num2) {
                if (read > 0) {
                    C39897ADz AX3 = xss.A07.AX3();
                    if (AX3 != null) {
                        AX3.A05 += (long) read;
                        AX3.A03++;
                    }
                    if (!xss.A03) {
                        xss.A03 = true;
                        r4.A01("ffAR");
                        xss.A0E.DFw();
                        r4.A01("ffARs");
                    }
                    r4.A01("daAR");
                    xss.A0E.D7j(bArr, read);
                    r4.A01("daARs");
                    return 0;
                } else if (read == 0) {
                    r4.A01("oerAR");
                    C39897ADz AX32 = xss.A07.AX3();
                    if (AX32 != null) {
                        AX32.A02++;
                    }
                    return 1;
                } else {
                    r4.A01("oreAR");
                    C39897ADz AX33 = xss.A07.AX3();
                    if (AX33 != null) {
                        AX33.A04++;
                    }
                    int i2 = 22003;
                    if (read == -3) {
                        i2 = 22004;
                    }
                    ? r1 = new C391719tX(i2, String.format((Locale) null, "Failure to read input data, bytesRead=%d", AnonymousClass7TF.A1b(read)));
                    A02(r1, xss);
                    xss.A0E.DCe(r1);
                    return 2;
                }
            }
        }
        return 3;
    }

    private void A01(Handler handler) {
        if (handler == null) {
            throw AnonymousClass7TE.A0w("The handler cannot be null");
        } else if (this.A06.getLooper() == handler.getLooper()) {
            throw AnonymousClass7TE.A0z("The handler must be on a separate thread then the recording one");
        }
    }

    public static void A02(C382299dT r2, C22018Xss xss) {
        String str;
        Integer num = xss.A0F;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "PREPARED";
                    break;
                case 2:
                    str = "STARTED";
                    break;
                default:
                    str = "STOPPED";
                    break;
            }
        } else {
            str = "null";
        }
        r2.A00("mState", str);
        r2.A00("mSystemAudioBufferSizeB", String.valueOf(xss.A01));
        r2.A00("mAudioBufferSizeB", String.valueOf(xss.A00));
        r2.A01(xss.A08.A00());
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.9tX, X.9dT] */
    public final int A03(Y1G y1g) {
        int i;
        ByteBuffer byteBuffer = y1g.A02;
        Integer num = this.A0F;
        Integer num2 = AnonymousClass05K.A0C;
        if (num == num2) {
            i = this.A02.read(byteBuffer, byteBuffer.capacity());
        } else {
            i = 0;
        }
        if (this.A0F == num2) {
            if (i > 0) {
                C39897ADz AX3 = this.A07.AX3();
                if (AX3 != null) {
                    AX3.A05 += (long) i;
                    AX3.A03++;
                }
                if (!this.A03) {
                    this.A03 = true;
                    this.A0E.DFw();
                }
                this.A0E.D7i(y1g, i);
                return 0;
            }
            C341467mw r1 = this.A09;
            if (i == 0) {
                r1.A01("oerAR");
                C39897ADz AX32 = this.A07.AX3();
                if (AX32 != null) {
                    AX32.A02++;
                }
            } else {
                r1.A01("oreAR");
                C39897ADz AX33 = this.A07.AX3();
                if (AX33 != null) {
                    AX33.A04++;
                }
                int i2 = 22003;
                if (i == -3) {
                    i2 = 22004;
                }
                ? r12 = new C391719tX(i2, String.format((Locale) null, "Failure to read input data, bytesRead=%d", AnonymousClass7TF.A1b(i)));
                A02(r12, this);
                this.A0E.DCe(r12);
                return 1;
            }
        }
        return 1;
    }

    public final void A04(C341687nM r3, Handler handler) {
        this.A09.A01("pARc");
        A01(handler);
        this.A06.post(new Y39(handler, this, r3));
    }

    public final void A05(C341687nM r3, Handler handler) {
        this.A09.A01("stARc");
        A01(handler);
        this.A06.post(new Y3A(handler, this, r3));
    }

    public C22018Xss(Handler handler, C341607nE r7, C343487qI r8, C22555YAe yAe, int i, int i2, long j, boolean z) {
        C341467mw r2 = new C341467mw();
        this.A09 = r2;
        this.A08 = r8;
        this.A06 = handler;
        this.A0E = yAe;
        this.A0F = AnonymousClass05K.A00;
        this.A00 = r8.A03;
        boolean z2 = false;
        this.A03 = false;
        this.A07 = r7;
        this.A0D = z;
        this.A04 = i;
        this.A05 = j;
        this.A0C = j > 0 ? true : z2;
        int minBufferSize = AudioRecord.getMinBufferSize(r8.A04, r8.A01, r8.A02);
        this.A01 = minBufferSize;
        this.A01 = minBufferSize > 0 ? Math.min(minBufferSize * i2, 409600) : 409600;
        r2.A01("c");
        r8.toString();
    }
}
