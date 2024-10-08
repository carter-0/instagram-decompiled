package X;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.videolite.transcoder.base.SphericalMetadata;
import java.net.URL;
import java.util.HashMap;

/* renamed from: X.Q1i  reason: case insensitive filesystem */
public final class C7259Q1i implements C13725Tfv {
    public final Context A00;
    public final boolean A01;
    public final HashMap A02 = AnonymousClass7TE.A1E();

    public static C7232Q0d A01(MediaMetadataRetriever mediaMetadataRetriever, long j) {
        int i;
        MediaMetadataRetriever mediaMetadataRetriever2 = mediaMetadataRetriever;
        int A002 = A00(mediaMetadataRetriever2, 18, -1);
        int A003 = A00(mediaMetadataRetriever2, 19, -1);
        int A004 = A00(mediaMetadataRetriever2, 24, 0);
        int i2 = 3;
        if (Build.VERSION.SDK_INT >= 30) {
            int A005 = A00(mediaMetadataRetriever2, 36, 3);
            if (A005 == 6) {
                i2 = 6;
            } else if (A005 == 7) {
                i2 = 7;
            }
            i = A00(mediaMetadataRetriever2, 35, 1);
        } else {
            i = 1;
        }
        long j2 = 0;
        String extractMetadata = mediaMetadataRetriever2.extractMetadata(9);
        if (!TextUtils.isEmpty(extractMetadata)) {
            try {
                j2 = Long.parseLong(extractMetadata);
            } catch (NumberFormatException unused) {
            }
        }
        long j3 = -1;
        String extractMetadata2 = mediaMetadataRetriever2.extractMetadata(20);
        if (!TextUtils.isEmpty(extractMetadata2)) {
            try {
                j3 = Long.parseLong(extractMetadata2);
            } catch (NumberFormatException unused2) {
            }
        }
        long j4 = j;
        int i3 = i2;
        C7232Q0d q0d = new C7232Q0d((SphericalMetadata) null, (String) null, (String) null, (String) null, mediaMetadataRetriever2.extractMetadata(23), mediaMetadataRetriever2.extractMetadata(5), (String) null, (String) null, mediaMetadataRetriever2.extractMetadata(4), "VIDEO", (HashMap) null, A002, A003, A004, i3, i, -1, j2, j3, j4, AnonymousClass7TF.A1V(mediaMetadataRetriever2.extractMetadata(16)));
        C349257zq.A01();
        return q0d;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:29|(2:31|32)|33|34) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006e, code lost:
        if (r7 == null) goto L_0x0079;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C7232Q0d AU7(android.net.Uri r15) {
        /*
            r14 = this;
            java.util.HashMap r2 = r14.A02
            boolean r0 = r2.containsKey(r15)
            if (r0 == 0) goto L_0x000f
            java.lang.Object r0 = r2.get(r15)
            X.Q0d r0 = (X.C7232Q0d) r0
            return r0
        L_0x000f:
            java.lang.String r0 = "SystemVideoMetadataExtractor.extract"
            X.C349257zq.A03(r0)
            android.media.MediaMetadataRetriever r8 = new android.media.MediaMetadataRetriever
            r8.<init>()
            boolean r0 = r14.A01     // Catch:{ Exception -> 0x0092 }
            if (r0 == 0) goto L_0x0074
            r7 = 0
            android.content.Context r0 = r14.A00     // Catch:{ SecurityException -> 0x006e, all -> 0x0067 }
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch:{ SecurityException -> 0x006e, all -> 0x0067 }
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r7 = r1.openAssetFileDescriptor(r15, r0)     // Catch:{ FileNotFoundException -> 0x0058 }
            if (r7 == 0) goto L_0x0060
            java.io.FileDescriptor r9 = r7.getFileDescriptor()     // Catch:{ SecurityException -> 0x006e, all -> 0x0067 }
            boolean r0 = r9.valid()     // Catch:{ SecurityException -> 0x006e, all -> 0x0067 }
            if (r0 == 0) goto L_0x0051
            long r5 = r7.getDeclaredLength()     // Catch:{ SecurityException -> 0x006e, all -> 0x0067 }
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0045
            r8.setDataSource(r9)     // Catch:{ SecurityException -> 0x006e, all -> 0x0067 }
            goto L_0x0070
        L_0x0045:
            long r10 = r7.getStartOffset()     // Catch:{ SecurityException -> 0x006e, all -> 0x0067 }
            long r12 = r7.getDeclaredLength()     // Catch:{ SecurityException -> 0x006e, all -> 0x0067 }
            r8.setDataSource(r9, r10, r12)     // Catch:{ SecurityException -> 0x006e, all -> 0x0067 }
            goto L_0x0070
        L_0x0051:
            java.lang.String r0 = "file description invalid"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ SecurityException -> 0x006e, all -> 0x0067 }
            goto L_0x0066
        L_0x0058:
            r1 = move-exception
            java.lang.String r0 = "file not found"
            java.lang.IllegalArgumentException r0 = X.Pxe.A0h(r0, r1)     // Catch:{ SecurityException -> 0x006e, all -> 0x0067 }
            goto L_0x0066
        L_0x0060:
            java.lang.String r0 = "file descriptor null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ SecurityException -> 0x006e, all -> 0x0067 }
        L_0x0066:
            throw r0     // Catch:{ SecurityException -> 0x006e, all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            if (r7 == 0) goto L_0x006d
            r7.close()     // Catch:{ IOException -> 0x006d }
        L_0x006d:
            throw r0     // Catch:{ Exception -> 0x0092 }
        L_0x006e:
            if (r7 == 0) goto L_0x0079
        L_0x0070:
            r7.close()     // Catch:{ IOException -> 0x0079 }
            goto L_0x0079
        L_0x0074:
            android.content.Context r0 = r14.A00     // Catch:{ Exception -> 0x0092 }
            r8.setDataSource(r0, r15)     // Catch:{ Exception -> 0x0092 }
        L_0x0079:
            java.lang.String r0 = r15.getPath()     // Catch:{ Exception -> 0x0092 }
            long r0 = X.Pxf.A0F(r0)     // Catch:{ Exception -> 0x0092 }
            X.Q0d r0 = A01(r8, r0)     // Catch:{ Exception -> 0x0092 }
            r2.put(r15, r0)     // Catch:{ Exception -> 0x0092 }
            X.C349257zq.A01()     // Catch:{ Exception -> 0x0092 }
            X.C349257zq.A01()
            r8.release()     // Catch:{ all -> 0x0091 }
        L_0x0091:
            return r0
        L_0x0092:
            r2 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = "Exception in extractMediaMetadata isFileExists: "
            r3.append(r0)     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = r15.getPath()     // Catch:{ all -> 0x00f4 }
            boolean r0 = X.JTQ.A1Z(r0)     // Catch:{ all -> 0x00f4 }
            r3.append(r0)     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = " path is: "
            r3.append(r0)     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = r15.getPath()     // Catch:{ all -> 0x00f4 }
            r3.append(r0)     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = " is readable: "
            r3.append(r0)     // Catch:{ all -> 0x00f4 }
            java.io.File r0 = X.Pxg.A0Y(r15)     // Catch:{ all -> 0x00f4 }
            boolean r0 = r0.canRead()     // Catch:{ all -> 0x00f4 }
            r3.append(r0)     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = " is writable: "
            r3.append(r0)     // Catch:{ all -> 0x00f4 }
            java.io.File r0 = X.Pxg.A0Y(r15)     // Catch:{ all -> 0x00f4 }
            boolean r0 = r0.canWrite()     // Catch:{ all -> 0x00f4 }
            r3.append(r0)     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = " file size in bytes: "
            r3.append(r0)     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = r15.getPath()     // Catch:{ all -> 0x00f4 }
            long r0 = X.Pxf.A0F(r0)     // Catch:{ all -> 0x00f4 }
            r3.append(r0)     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = " file uri is: "
            r3.append(r0)     // Catch:{ all -> 0x00f4 }
            X.Pxf.A1O(r3, r15)     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00f4 }
            java.lang.RuntimeException r0 = X.Pxe.A0u(r0, r2)     // Catch:{ all -> 0x00f4 }
            throw r0     // Catch:{ all -> 0x00f4 }
        L_0x00f4:
            r0 = move-exception
            X.C349257zq.A01()
            r8.release()     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7259Q1i.AU7(android.net.Uri):X.Q0d");
    }

    public final C7232Q0d AU8(URL url) {
        HashMap hashMap = this.A02;
        if (hashMap.containsKey(url.toString())) {
            return (C7232Q0d) hashMap.get(url.toString());
        }
        C349257zq.A03("SystemVideoMetadataExtractor.extract");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(url.toString(), AnonymousClass7TE.A1E());
            C7232Q0d A012 = A01(mediaMetadataRetriever, -1);
            hashMap.put(0cp.A03(url.toString()), A012);
            C349257zq.A01();
            C349257zq.A01();
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable unused) {
            }
            return A012;
        } catch (Exception e) {
            throw Pxe.A0u(Pxf.A0l("Exception in extractMediaMetadata:  file url is: ", url), e);
        } catch (Throwable th) {
            C349257zq.A01();
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable unused2) {
            }
            throw th;
        }
    }

    public C7259Q1i(Context context, boolean z) {
        this.A00 = context;
        this.A01 = z;
    }

    public static int A00(MediaMetadataRetriever mediaMetadataRetriever, int i, int i2) {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(i);
        if (TextUtils.isEmpty(extractMetadata)) {
            return i2;
        }
        try {
            return Integer.parseInt(extractMetadata);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }
}
