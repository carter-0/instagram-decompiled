package X;

import android.content.Context;
import android.net.Uri;
import java.util.List;

/* renamed from: X.SeX  reason: case insensitive filesystem */
public final class C11674SeX implements C13909Tl9 {
    public C13909Tl9 A00;
    public C13909Tl9 A01;
    public C13909Tl9 A02;
    public C13909Tl9 A03;
    public C13909Tl9 A04;
    public C13909Tl9 A05;
    public C13909Tl9 A06;
    public C13909Tl9 A07;
    public final Context A08;
    public final C13909Tl9 A09;
    public final List A0A = AnonymousClass7TE.A1C();

    private void A00(C13909Tl9 tl9) {
        int i = 0;
        while (true) {
            List list = this.A0A;
            if (i < list.size()) {
                tl9.AAa((C22521Y7s) list.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long E0f(X.SH8 r5) {
        /*
            r4 = this;
            X.Tl9 r0 = r4.A07
            boolean r0 = X.DbW.A1a(r0)
            X.C11366SPh.A02(r0)
            android.net.Uri r3 = r5.A01
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
            X.Tl9 r0 = r4.A01
            if (r0 != 0) goto L_0x0041
            android.content.Context r1 = r4.A08
            X.QDi r0 = new X.QDi
            r0.<init>(r1)
            r4.A01 = r0
            r4.A00(r0)
        L_0x0041:
            X.Tl9 r0 = r4.A01
        L_0x0043:
            r4.A07 = r0
            long r0 = r0.E0f(r5)
            return r0
        L_0x004a:
            java.lang.String r0 = "rtmp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0079
            X.Tl9 r0 = r4.A05
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "androidx.media3.datasource.rtmp.RtmpDataSource"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x010a }
            java.lang.Object r0 = X.Pxh.A0e(r0)     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x010a }
            X.Tl9 r0 = (X.C13909Tl9) r0     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x010a }
            r4.A05 = r0     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x010a }
            r4.A00(r0)     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x010a }
            goto L_0x0070
        L_0x0069:
            java.lang.String r1 = "DefaultDataSource"
            java.lang.String r0 = "Attempting to play RTMP stream without depending on the RTMP extension"
            X.STH.A03(r1, r0)
        L_0x0070:
            X.Tl9 r0 = r4.A05
            if (r0 != 0) goto L_0x0043
            X.Tl9 r0 = r4.A09
            r4.A05 = r0
            goto L_0x0043
        L_0x0079:
            java.lang.String r0 = "udp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0093
            X.Tl9 r0 = r4.A06
            if (r0 != 0) goto L_0x0090
            X.QDj r0 = new X.QDj
            r0.<init>()
            r4.A06 = r0
            r4.A00(r0)
        L_0x0090:
            X.Tl9 r0 = r4.A06
            goto L_0x0043
        L_0x0093:
            java.lang.String r0 = "data"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ad
            X.Tl9 r0 = r4.A02
            if (r0 != 0) goto L_0x00aa
            r1 = 0
            X.QDf r0 = new X.QDf
            r0.<init>(r1)
            r4.A02 = r0
            r4.A00(r0)
        L_0x00aa:
            X.Tl9 r0 = r4.A02
            goto L_0x0043
        L_0x00ad:
            java.lang.String r0 = "rawresource"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00c1
            java.lang.String r0 = "android.resource"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00c1
            X.Tl9 r0 = r4.A09
            goto L_0x0043
        L_0x00c1:
            X.Tl9 r0 = r4.A04
            if (r0 != 0) goto L_0x00d1
            android.content.Context r1 = r4.A08
            X.QDk r0 = new X.QDk
            r0.<init>(r1)
            r4.A04 = r0
            r4.A00(r0)
        L_0x00d1:
            X.Tl9 r0 = r4.A04
            goto L_0x0043
        L_0x00d5:
            java.lang.String r1 = r3.getPath()
            if (r1 == 0) goto L_0x00f7
            java.lang.String r0 = "/android_asset/"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00f7
        L_0x00e3:
            X.Tl9 r0 = r4.A00
            if (r0 != 0) goto L_0x00f3
            android.content.Context r1 = r4.A08
            X.QDh r0 = new X.QDh
            r0.<init>(r1)
            r4.A00 = r0
            r4.A00(r0)
        L_0x00f3:
            X.Tl9 r0 = r4.A00
            goto L_0x0043
        L_0x00f7:
            X.Tl9 r0 = r4.A03
            if (r0 != 0) goto L_0x0106
            r1 = 0
            X.QDg r0 = new X.QDg
            r0.<init>(r1)
            r4.A03 = r0
            r4.A00(r0)
        L_0x0106:
            X.Tl9 r0 = r4.A03
            goto L_0x0043
        L_0x010a:
            r1 = move-exception
            java.lang.String r0 = "Error instantiating RTMP extension"
            java.lang.RuntimeException r0 = X.Pxe.A0u(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11674SeX.E0f(X.SH8):long");
    }

    public final void close() {
        C13909Tl9 tl9 = this.A07;
        if (tl9 != null) {
            try {
                tl9.close();
            } finally {
                this.A07 = null;
            }
        }
    }

    public final Uri getUri() {
        C13909Tl9 tl9 = this.A07;
        if (tl9 == null) {
            return null;
        }
        return tl9.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        C13909Tl9 tl9 = this.A07;
        tl9.getClass();
        return tl9.read(bArr, i, i2);
    }

    public C11674SeX(Context context, C13909Tl9 tl9) {
        this.A08 = context.getApplicationContext();
        this.A09 = tl9;
    }

    public final void AAa(C22521Y7s y7s) {
        y7s.getClass();
        this.A09.AAa(y7s);
        this.A0A.add(y7s);
        C13909Tl9 tl9 = this.A03;
        if (tl9 != null) {
            tl9.AAa(y7s);
        }
        C13909Tl9 tl92 = this.A00;
        if (tl92 != null) {
            tl92.AAa(y7s);
        }
        C13909Tl9 tl93 = this.A01;
        if (tl93 != null) {
            tl93.AAa(y7s);
        }
        C13909Tl9 tl94 = this.A05;
        if (tl94 != null) {
            tl94.AAa(y7s);
        }
        C13909Tl9 tl95 = this.A06;
        if (tl95 != null) {
            tl95.AAa(y7s);
        }
        C13909Tl9 tl96 = this.A02;
        if (tl96 != null) {
            tl96.AAa(y7s);
        }
        C13909Tl9 tl97 = this.A04;
        if (tl97 != null) {
            tl97.AAa(y7s);
        }
    }
}
