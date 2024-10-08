package X;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.webrtc.CameraEnumerationAndroid;

public final class Q0W implements C257113ws {
    public C257113ws A00;
    public C257113ws A01;
    public C257113ws A02;
    public C257113ws A03;
    public C257113ws A04;
    public C257113ws A05;
    public C257113ws A06;
    public C257113ws A07;
    public final Context A08;
    public final C257113ws A09;
    public final List A0A = AnonymousClass7TE.A1C();

    private void A00(C257113ws r4) {
        int i = 0;
        while (true) {
            List list = this.A0A;
            if (i < list.size()) {
                r4.addTransferListener((C250823m7) list.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    public final /* synthetic */ void cancel() {
    }

    public Q0W(Context context, String str) {
        C257303xB r1 = new C257303xB(new C257313xC(), str, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD);
        this.A08 = context.getApplicationContext();
        this.A09 = r1;
    }

    public final void close() {
        C257113ws r0 = this.A07;
        if (r0 != null) {
            try {
                r0.close();
            } finally {
                this.A07 = null;
            }
        }
    }

    public final Map getResponseHeaders() {
        C257113ws r0 = this.A07;
        if (r0 == null) {
            return Collections.emptyMap();
        }
        return r0.getResponseHeaders();
    }

    public final Uri getUri() {
        C257113ws r0 = this.A07;
        if (r0 == null) {
            return null;
        }
        return r0.getUri();
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long open(X.C257263x7 r5) {
        /*
            r4 = this;
            X.3ws r0 = r4.A07
            boolean r0 = X.DbW.A1a(r0)
            X.C256703wD.A04(r0)
            android.net.Uri r3 = r5.A06
            java.lang.String r1 = r3.getScheme()
            java.lang.String r2 = r3.getScheme()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00d5
            java.lang.String r0 = "file"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00d5
            java.lang.String r0 = "asset"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00e3
            java.lang.String r0 = "content"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004a
            X.3ws r0 = r4.A01
            if (r0 != 0) goto L_0x0041
            android.content.Context r1 = r4.A08
            X.QoS r0 = new X.QoS
            r0.<init>(r1)
            r4.A01 = r0
            r4.A00(r0)
        L_0x0041:
            X.3ws r0 = r4.A01
        L_0x0043:
            r4.A07 = r0
            long r0 = r0.open(r5)
            return r0
        L_0x004a:
            java.lang.String r0 = "rtmp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0079
            X.3ws r0 = r4.A05
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "com.google.android.exoplayer2.ext.rtmp.RtmpDataSource"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x010a }
            java.lang.Object r0 = X.Pxh.A0e(r0)     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x010a }
            X.3ws r0 = (X.C257113ws) r0     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x010a }
            r4.A05 = r0     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x010a }
            r4.A00(r0)     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x010a }
            goto L_0x0070
        L_0x0069:
            java.lang.String r1 = "DefaultDataSource"
            java.lang.String r0 = "Attempting to play RTMP stream without depending on the RTMP extension"
            X.2AG.A04(r1, r0)
        L_0x0070:
            X.3ws r0 = r4.A05
            if (r0 != 0) goto L_0x0043
            X.3ws r0 = r4.A09
            r4.A05 = r0
            goto L_0x0043
        L_0x0079:
            java.lang.String r0 = "udp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0093
            X.3ws r0 = r4.A06
            if (r0 != 0) goto L_0x0090
            X.QoU r0 = new X.QoU
            r0.<init>()
            r4.A06 = r0
            r4.A00(r0)
        L_0x0090:
            X.3ws r0 = r4.A06
            goto L_0x0043
        L_0x0093:
            java.lang.String r0 = "data"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ad
            X.3ws r0 = r4.A02
            if (r0 != 0) goto L_0x00aa
            r1 = 0
            X.QoQ r0 = new X.QoQ
            r0.<init>(r1)
            r4.A02 = r0
            r4.A00(r0)
        L_0x00aa:
            X.3ws r0 = r4.A02
            goto L_0x0043
        L_0x00ad:
            java.lang.String r0 = "rawresource"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00c1
            java.lang.String r0 = "android.resource"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00c1
            X.3ws r0 = r4.A09
            goto L_0x0043
        L_0x00c1:
            X.3ws r0 = r4.A04
            if (r0 != 0) goto L_0x00d1
            android.content.Context r1 = r4.A08
            X.QoT r0 = new X.QoT
            r0.<init>(r1)
            r4.A04 = r0
            r4.A00(r0)
        L_0x00d1:
            X.3ws r0 = r4.A04
            goto L_0x0043
        L_0x00d5:
            java.lang.String r1 = r3.getPath()
            if (r1 == 0) goto L_0x00f7
            java.lang.String r0 = "/android_asset/"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00f7
        L_0x00e3:
            X.3ws r0 = r4.A00
            if (r0 != 0) goto L_0x00f3
            android.content.Context r1 = r4.A08
            X.QoR r0 = new X.QoR
            r0.<init>(r1)
            r4.A00 = r0
            r4.A00(r0)
        L_0x00f3:
            X.3ws r0 = r4.A00
            goto L_0x0043
        L_0x00f7:
            X.3ws r0 = r4.A03
            if (r0 != 0) goto L_0x0106
            r1 = 0
            X.3x1 r0 = new X.3x1
            r0.<init>(r1)
            r4.A03 = r0
            r4.A00(r0)
        L_0x0106:
            X.3ws r0 = r4.A03
            goto L_0x0043
        L_0x010a:
            r1 = move-exception
            java.lang.String r0 = "Error instantiating RTMP extension"
            java.lang.RuntimeException r0 = X.Pxe.A0u(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q0W.open(X.3x7):long");
    }

    public final int read(byte[] bArr, int i, int i2) {
        C257113ws r0 = this.A07;
        r0.getClass();
        return r0.read(bArr, i, i2);
    }

    public final void addTransferListener(C250823m7 r2) {
        r2.getClass();
        this.A09.addTransferListener(r2);
        this.A0A.add(r2);
        C257113ws r0 = this.A03;
        if (r0 != null) {
            r0.addTransferListener(r2);
        }
        C257113ws r02 = this.A00;
        if (r02 != null) {
            r02.addTransferListener(r2);
        }
        C257113ws r03 = this.A01;
        if (r03 != null) {
            r03.addTransferListener(r2);
        }
        C257113ws r04 = this.A05;
        if (r04 != null) {
            r04.addTransferListener(r2);
        }
        C257113ws r05 = this.A06;
        if (r05 != null) {
            r05.addTransferListener(r2);
        }
        C257113ws r06 = this.A02;
        if (r06 != null) {
            r06.addTransferListener(r2);
        }
        C257113ws r07 = this.A04;
        if (r07 != null) {
            r07.addTransferListener(r2);
        }
    }
}
