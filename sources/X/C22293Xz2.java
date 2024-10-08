package X;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.Xz2  reason: case insensitive filesystem */
public final class C22293Xz2 implements C257113ws, C257133wu {
    public static final XU3 A0B;
    public C250813m6 A00;
    public C21189XIj A01;
    public final int A02;
    public final 28X A03;
    public final 28N A04;
    public final C257063wn A05;
    public final C257093wq A06;
    public final String A07;
    public final boolean A08;
    public volatile int A09 = -1;
    public volatile C257113ws A0A;

    public final void changeHttpPriority(byte b, boolean z) {
    }

    public final synchronized void close() {
        byte[] bArr;
        int i;
        if (this.A0A != null) {
            this.A0A.close();
            if (this.A0A instanceof C22292Xz1) {
                C22292Xz1 xz1 = (C22292Xz1) this.A0A;
                if (this.A01 != null && xz1.A03() && (bArr = xz1.A03) != null && bArr.length >= (i = xz1.A01)) {
                    if (i <= 0) {
                        i = xz1.A00;
                    }
                    XU3 xu3 = A0B;
                    synchronized (xu3) {
                        xu3.A02(this.A01, new C22291Xz0(this.A00, xz1.A03, i, true));
                    }
                    28X r3 = this.A03;
                    C21189XIj xIj = this.A01;
                    r3.A00(xIj.A01, xIj.A00, xz1.A03, i);
                }
            }
        }
        this.A0A = null;
    }

    public final synchronized long open(C257263x7 r15) {
        C257063wn r8;
        boolean z;
        int i;
        r8 = this.A05;
        String str = r8.A07;
        Uri uri = r15.A06;
        C257253x6 r3 = r15.A07;
        this.A01 = new C21189XIj(str, uri);
        XU3 xu3 = A0B;
        synchronized (xu3) {
            C257113ws A002 = xu3.A00(this.A01);
            z = true;
            if (A002 == null) {
                byte[] A012 = this.A03.A01(uri, str);
                if (A012 == null) {
                    28N r6 = this.A04;
                    String str2 = this.A07;
                    int i2 = 8500;
                    if (!r3.A0U) {
                        i2 = CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD;
                        i = CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD;
                    } else {
                        i = this.A02;
                    }
                    this.A0A = new C21190XIk(r6, this.A00, r8, this.A06, str2, i2, i, this.A08);
                } else {
                    this.A0A = new C22291Xz0(this.A00, A012, A012.length, false);
                    xu3.A02(this.A01, this.A0A);
                }
                z = false;
            } else if (A002 instanceof C22291Xz0) {
                C22291Xz0 xz0 = (C22291Xz0) A002;
                z = xz0.A04;
                this.A0A = new C22291Xz0(this.A00, xz0.A05, xz0.A03, z);
            } else {
                XIl xIl = (XIl) A002;
                if (xIl.A03()) {
                    this.A0A = new C22291Xz0(this.A00, xIl.A03, xIl.A01, true);
                    xu3.A02(this.A01, this.A0A);
                } else {
                    xu3.A01(this.A01);
                    xIl.A02 = this.A00;
                    this.A0A = xIl;
                }
            }
        }
        return this.A0A.open(A00(this, r15, r8.A03, r8.A04, z));
    }

    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        if (this.A0A != null) {
            i3 = this.A0A.read(bArr, i, i2);
        } else {
            i3 = -1;
        }
        return i3;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.XU3] */
    static {
        ? obj = new Object();
        obj.A01 = 120;
        obj.A00 = 12;
        obj.A02 = new XG0(obj, 120);
        obj.A03 = AnonymousClass7TE.A1E();
        A0B = obj;
    }

    public static C257263x7 A00(C22293Xz2 xz2, C257263x7 r26, String str, String str2, boolean z) {
        int i;
        C257223x3 r10 = new C257223x3(str, z, str2);
        String str3 = null;
        Map emptyMap = Collections.emptyMap();
        C257263x7 r11 = r26;
        Uri uri = r11.A06;
        if (uri == null) {
            uri = Uri.EMPTY;
        }
        byte[] bArr = r11.A0A;
        long j = r11.A02;
        long j2 = r11.A04;
        long j3 = j - j2;
        long j4 = r11.A03;
        if (j4 <= 0) {
            j4 = -1;
        }
        int i2 = r11.A00;
        C257253x6 r8 = r11.A07;
        C22293Xz2 xz22 = xz2;
        if (xz22.A09 >= 0) {
            i = xz22.A09;
        } else {
            i = r8.A05;
        }
        C257253x6 r21 = new C257253x6(C257243x5.A02, r10, r8, r8.A0O, i, r8.A03, r8.A0R);
        String str4 = r11.A08;
        if (str4 != null) {
            str3 = str4;
        }
        C256703wD.A02(uri);
        return new C257263x7(uri, r21, str3, emptyMap, bArr, 1, i2, j3, j2, j4);
    }

    public final void cancel() {
        if (this.A0A != null) {
            this.A0A.cancel();
        }
    }

    public final Uri getUri() {
        if (this.A0A != null) {
            return this.A0A.getUri();
        }
        return null;
    }

    public C22293Xz2(28X r2, 28N r3, C250813m6 r4, C257063wn r5, C257093wq r6, String str, int i, boolean z) {
        this.A05 = r5;
        this.A07 = str;
        this.A03 = r2;
        this.A00 = r4;
        this.A06 = r6;
        this.A04 = r3;
        this.A0A = null;
        this.A02 = i;
        this.A08 = z;
    }

    public final void addTransferListener(C250823m7 r2) {
        C250813m6 xx0;
        r2.getClass();
        if (r2 instanceof C250813m6) {
            xx0 = (C250813m6) r2;
        } else {
            xx0 = new C22189Xx0(r2);
        }
        this.A00 = xx0;
    }

    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.emptyMap();
    }
}
