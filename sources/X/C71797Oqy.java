package X;

import android.net.Uri;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.Oqy  reason: case insensitive filesystem */
public final class C71797Oqy implements C257113ws {
    public int A00;
    public C257263x7 A01;
    public C250823m7 A02;
    public N2E A03;
    public InputStream A04;
    public final UserSession A05;

    public final /* synthetic */ void cancel() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e6, code lost:
        if ((r15 + r5) > r1) goto L_0x00e8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long open(X.C257263x7 r18) {
        /*
            r17 = this;
            r0 = 0
            r3 = r18
            X.0qQ.A0B(r3, r0)
            android.net.Uri r4 = r3.A06
            X.0qQ.A06(r4)
            java.lang.String r0 = r4.toString()
            boolean r0 = X.C66834MdS.A08(r0)
            r9 = 1004(0x3ec, float:1.407E-42)
            r2 = 1
            if (r0 == 0) goto L_0x010a
            r6 = r17
            X.3x7 r11 = r6.A01
            if (r11 == 0) goto L_0x003e
            long r7 = r3.A04
            long r0 = r3.A03
            android.net.Uri r5 = r11.A06
            java.lang.String r5 = r5.toString()
            boolean r4 = X.Dba.A1X(r4, r5)
            if (r4 == 0) goto L_0x00f8
            long r4 = r11.A04
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x00f8
            long r4 = r11.A03
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x00f8
        L_0x003a:
            int r0 = r6.A00
            long r0 = (long) r0
            return r0
        L_0x003e:
            r6.A01 = r3
            long r0 = r3.A04
            int r15 = (int) r0
            long r0 = r3.A03
            int r5 = (int) r0
            X.0eM r0 = X.C71105Ocj.A05
            com.instagram.common.session.UserSession r0 = r6.A05
            X.Ocj r10 = X.C69851NtF.A00(r0)
            java.lang.String r4 = X.DbT.A10(r4)
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r12 = X.C66834MdS.A03(r4)
            r11 = 0
            java.lang.String r1 = "ArmadilloExpressMediaStore"
            if (r12 != 0) goto L_0x0093
            java.lang.String r0 = "Invalid uri to stream: "
            java.lang.String r0 = X.002.A0R(r0, r4)
        L_0x0061:
            X.0KC.A0C(r1, r0)
        L_0x0064:
            r6.A03 = r11
            if (r11 == 0) goto L_0x0100
            r7 = 0
            int r4 = r11.A05
            X.RCq r0 = r11.A06
            r6.A04 = r0
            if (r15 != 0) goto L_0x0072
            r15 = 0
        L_0x0072:
            r1 = -1
            if (r4 == r1) goto L_0x008f
            if (r4 == 0) goto L_0x008f
            if (r5 == r1) goto L_0x008c
            int r0 = r4 - r15
            if (r0 <= r5) goto L_0x007e
            r0 = r5
        L_0x007e:
            r5 = r0
        L_0x007f:
            r6.A00 = r5
            X.3m7 r0 = r6.A02
            if (r0 == 0) goto L_0x003a
            if (r4 != r1) goto L_0x0088
            r7 = 1
        L_0x0088:
            r0.Dtf(r6, r3, r2, r7)
            goto L_0x003a
        L_0x008c:
            int r5 = r4 - r15
            goto L_0x007f
        L_0x008f:
            if (r5 != r1) goto L_0x007f
            r5 = -1
            goto L_0x007f
        L_0x0093:
            int r0 = r12.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x00ae
            java.lang.String r0 = r12.mimetype_
        L_0x009b:
            java.lang.Integer r13 = X.C66834MdS.A04(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r13 == r0) goto L_0x00b0
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r13 == r0) goto L_0x00b0
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r13 == r0) goto L_0x00b0
            java.lang.String r0 = "Trying to stream non-streamable media"
            goto L_0x0061
        L_0x00ae:
            r0 = 0
            goto L_0x009b
        L_0x00b0:
            int r0 = r12.bitField0_
            r0 = r0 & 64
            if (r0 == 0) goto L_0x00f4
            java.lang.String r14 = r12.sidecar_
            if (r14 == 0) goto L_0x00f4
            X.OyP r1 = r10.A02
            java.lang.String r0 = "dummy.tmp"
            X.Ni4 r0 = X.OyP.A00(r1, r0)
            android.net.Uri r9 = android.net.Uri.fromFile(r0)
            int r7 = r12.fileLength_
            X.0eM r0 = X.C71105Ocj.A05
            java.lang.Object r0 = r0.getValue()
            X.1Nw r0 = (X.AnonymousClass1Nw) r0
            X.N2E r11 = new X.N2E
            r11.<init>(r0, r7)
            r16 = r5
            r0 = -1
            if (r5 == r0) goto L_0x00e8
            r8 = 65536(0x10000, float:9.18355E-41)
            int r0 = r7 % r8
            int r1 = r7 - r0
            if (r0 != 0) goto L_0x00e4
            int r1 = r7 - r8
        L_0x00e4:
            int r0 = r15 + r5
            if (r0 <= r1) goto L_0x00ea
        L_0x00e8:
            r16 = 0
        L_0x00ea:
            X.Pmq r8 = new X.Pmq
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            X.C71105Ocj.A01(r10, r12, r4, r8)
            goto L_0x0064
        L_0x00f4:
            java.lang.String r0 = "No sidecar for streaming"
            goto L_0x0061
        L_0x00f8:
            java.lang.String r1 = "DataSource is already opened"
            X.47r r0 = new X.47r
            r0.<init>((X.C257263x7) r3, (java.lang.String) r1, (int) r9, (int) r2)
            throw r0
        L_0x0100:
            r4 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r1 = "Failed to download media"
            X.47r r0 = new X.47r
            r0.<init>((X.C257263x7) r3, (java.lang.String) r1, (int) r4, (int) r2)
            throw r0
        L_0x010a:
            java.lang.String r1 = "Invalid uri"
            X.47r r0 = new X.47r
            r0.<init>((X.C257263x7) r3, (java.lang.String) r1, (int) r9, (int) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71797Oqy.open(X.3x7):long");
    }

    public static C257263x7 A00() {
        Map emptyMap = Collections.emptyMap();
        Uri parse = Uri.parse("");
        C256703wD.A02(parse);
        C257263x7 r0 = C257263x7.A0B;
        return new C257263x7(parse, new C257253x6(), (String) null, emptyMap, (byte[]) null, 1, 0, 0, 0, -1);
    }

    public final void close() {
        InputStream inputStream = this.A04;
        if (inputStream != null) {
            inputStream.close();
        }
        C250823m7 r2 = this.A02;
        if (r2 != null) {
            C257263x7 r1 = this.A01;
            C257263x7 r0 = C257263x7.A0B;
            if (r1 == null) {
                r1 = C257263x7.A0B;
            }
            r2.DtX(this, r1, true);
        }
        N2E n2e = this.A03;
        if (n2e != null) {
            UserSession userSession = this.A05;
            synchronized (n2e) {
                if (!n2e.A04) {
                    String str = n2e.A01;
                    if (str == null) {
                        n2e.A03 = true;
                        n2e.A00 = userSession;
                    } else {
                        AnonymousClass0eM r02 = C71105Ocj.A05;
                        NAY A002 = OXH.A00(C69851NtF.A00(userSession).A01);
                        C71709OpT opT = C71709OpT.A00;
                        AnonymousClass68L A0I = C66581MXm.A0I(A002);
                        MailboxFutureImpl A0J = C66581MXm.A0J(A0I, opT);
                        C66582MXn.A1E(A0I, new C71652OoX(A002, A0J, str, 5), A0J);
                    }
                }
            }
            N2E.A00(n2e);
        }
        this.A03 = null;
        this.A01 = null;
        this.A00 = 0;
        this.A02 = null;
    }

    public final Uri getUri() {
        Uri uri;
        C257263x7 r0 = this.A01;
        if (r0 == null || (uri = r0.A06) == null) {
            return Uri.EMPTY;
        }
        return uri;
    }

    public final int read(byte[] bArr, int i, int i2) {
        boolean z;
        int i3 = i2;
        byte[] bArr2 = bArr;
        0qQ.A0B(bArr2, 0);
        InputStream inputStream = this.A04;
        if (inputStream != null) {
            N2E n2e = this.A03;
            if (n2e != null) {
                synchronized (n2e) {
                    z = n2e.A02;
                }
                if (z) {
                    throw new C2609547r(A00(), "DataSource is already closed", (int) CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 2);
                }
            }
            int i4 = this.A00;
            if (i4 != -1) {
                if (i4 > i3) {
                    i4 = i3;
                }
                i3 = i4;
            }
            try {
                int read = inputStream.read(bArr2, i, i3);
                int i5 = this.A00;
                if (i5 != -1) {
                    this.A00 = i5 - read;
                }
                C250823m7 r4 = this.A02;
                if (r4 != null) {
                    C257263x7 r3 = this.A01;
                    C257263x7 r0 = C257263x7.A0B;
                    if (r3 == null) {
                        r3 = C257263x7.A0B;
                    }
                    r4.Czk(this, r3, read, true);
                }
                if (this.A00 <= 0 || read != -1) {
                    return read;
                }
                throw new IOException("InputSteam unexpectedly closed");
            } catch (IOException unused) {
                close();
                throw new C2609547r(A00(), "Failed to read bytes", (int) CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 2);
            }
        } else {
            Map emptyMap = Collections.emptyMap();
            Uri parse = Uri.parse("");
            C256703wD.A02(parse);
            C257263x7 r02 = C257263x7.A0B;
            throw new C2609547r(new C257263x7(parse, new C257253x6(), (String) null, emptyMap, (byte[]) null, 1, 0, 0, 0, -1), "DataSource is not opened", (int) CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 2);
        }
    }

    public C71797Oqy(UserSession userSession) {
        this.A05 = userSession;
    }

    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.emptyMap();
    }

    public final void addTransferListener(C250823m7 r1) {
        this.A02 = r1;
    }
}
