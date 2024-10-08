package X;

import android.content.Context;
import java.io.InputStream;

public final class OWY {
    public final AnonymousClass4uV A00;
    public final C71787Oqn A01 = new Object();

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Oqn, java.lang.Object] */
    public OWY(Context context) {
        0qQ.A0B(context, 1);
        this.A00 = new AnonymousClass4uV(context.getAssets());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0024, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0027, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C61083JwL A01(java.lang.String r5) {
        /*
            r4 = this;
            r1 = 0
            byte[] r0 = X.C66582MXn.A1a(r5)
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
            r3.<init>(r0)
            android.util.Base64InputStream r2 = new android.util.Base64InputStream     // Catch:{ all -> 0x0021 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0021 }
            X.JwL r0 = A00(r4, r2)     // Catch:{ all -> 0x001a }
            r2.close()     // Catch:{ all -> 0x0021 }
            r3.close()
            return r0
        L_0x001a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001c }
        L_0x001c:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ all -> 0x0021 }
            throw r0     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            X.1zE.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OWY.A01(java.lang.String):X.JwL");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0030, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0034, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0038, code lost:
        X.1zE.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x003b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C61083JwL A02(java.lang.String r6) {
        /*
            r5 = this;
            r1 = 0
            byte[] r0 = X.C66582MXn.A1a(r6)
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
            r4.<init>(r0)
            android.util.Base64InputStream r3 = new android.util.Base64InputStream     // Catch:{ all -> 0x0035 }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x0035 }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ all -> 0x002e }
            r0.<init>(r3)     // Catch:{ all -> 0x002e }
            java.util.zip.InflaterInputStream r2 = new java.util.zip.InflaterInputStream     // Catch:{ all -> 0x002e }
            r2.<init>(r0)     // Catch:{ all -> 0x002e }
            X.JwL r0 = A00(r5, r2)     // Catch:{ all -> 0x0027 }
            r2.close()     // Catch:{ all -> 0x002e }
            r3.close()     // Catch:{ all -> 0x0035 }
            r4.close()
            return r0
        L_0x0027:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ all -> 0x002e }
            throw r0     // Catch:{ all -> 0x002e }
        L_0x002e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r0 = move-exception
            X.1zE.A00(r3, r1)     // Catch:{ all -> 0x0035 }
            throw r0     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            X.1zE.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OWY.A02(java.lang.String):X.JwL");
    }

    public static C61083JwL A00(OWY owy, InputStream inputStream) {
        AnonymousClass46B r3 = new AnonymousClass46B(new C2605145y(inputStream));
        AnonymousClass4uV r1 = owy.A00;
        return new C61083JwL(r1.A00(r3, AnonymousClass000.A00(73)), r1.A00(r3, "com.facebook.fbwebrtc.multiway.RtcMessageHeader"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        X.1zE.A00(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C61083JwL A03(byte[] r4) {
        /*
            r3 = this;
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r4)
            X.JwL r0 = A00(r3, r2)     // Catch:{ all -> 0x000d }
            r2.close()
            return r0
        L_0x000d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x000f }
        L_0x000f:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OWY.A03(byte[]):X.JwL");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        X.1zE.A00(r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A04(X.C61083JwL r6) {
        /*
            r5 = this;
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            X.45y r0 = new X.45y     // Catch:{ all -> 0x0032 }
            r0.<init>((java.io.OutputStream) r4)     // Catch:{ all -> 0x0032 }
            X.46B r3 = new X.46B     // Catch:{ all -> 0x0032 }
            r3.<init>(r0)     // Catch:{ all -> 0x0032 }
            X.4uV r2 = r5.A00     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = "com.facebook.fbwebrtc.multiway.RtcMessageHeader"
            java.lang.Object r0 = r6.A01     // Catch:{ all -> 0x0032 }
            com.facebook.fbwebrtc.multiway.RtcMessageHeader r0 = (com.facebook.fbwebrtc.multiway.RtcMessageHeader) r0     // Catch:{ all -> 0x0032 }
            r2.A01(r0, r3, r1)     // Catch:{ all -> 0x0032 }
            r0 = 73
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0032 }
            java.lang.Object r1 = r6.A00     // Catch:{ all -> 0x0032 }
            com.facebook.fbwebrtc.multiway.RtcMessageBody r1 = (com.facebook.fbwebrtc.multiway.RtcMessageBody) r1     // Catch:{ all -> 0x0032 }
            r2.A01(r1, r3, r0)     // Catch:{ all -> 0x0032 }
            byte[] r0 = r4.toByteArray()     // Catch:{ all -> 0x0032 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x0032 }
            r4.close()
            return r0
        L_0x0032:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            X.1zE.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OWY.A04(X.JwL):byte[]");
    }
}
