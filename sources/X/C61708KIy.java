package X;

import android.content.Context;
import android.net.Uri;
import java.lang.ref.WeakReference;

/* renamed from: X.KIy  reason: case insensitive filesystem */
public final class C61708KIy extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Uri A01;
    public final /* synthetic */ WeakReference A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61708KIy(Context context, Uri uri, WeakReference weakReference) {
        super(108, 4, false, false);
        this.A00 = context;
        this.A01 = uri;
        this.A02 = weakReference;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.0KC.A0H("VideoImportUtil", "Save Video File copy file error", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0072, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r1 != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0075, code lost:
        com.google.common.io.Closeables.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            java.lang.String r6 = "Required value was null."
            java.lang.String r5 = "Save Video File copy file error"
            java.lang.String r4 = "VideoImportUtil"
            r3 = 0
            X.1BJ r1 = X.AnonymousClass1F2.A00()     // Catch:{ FileNotFoundException | NullPointerException -> 0x0051, all -> 0x004f }
            r0 = 1475200931(0x57edc7a3, float:5.22883378E14)
            java.io.File r2 = r1.CGg(r3, r0)     // Catch:{ FileNotFoundException | NullPointerException -> 0x0051, all -> 0x004f }
            boolean r0 = r2.exists()     // Catch:{ FileNotFoundException | NullPointerException -> 0x0051, all -> 0x004f }
            if (r0 != 0) goto L_0x001e
            boolean r0 = r2.mkdir()     // Catch:{ FileNotFoundException | NullPointerException -> 0x0051, all -> 0x004f }
            if (r0 == 0) goto L_0x005b
        L_0x001e:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ FileNotFoundException | NullPointerException -> 0x0051, all -> 0x004f }
            java.lang.String r1 = X.AnonymousClass457.A07(r0)     // Catch:{ FileNotFoundException | NullPointerException -> 0x0051, all -> 0x004f }
            java.lang.String r0 = ".mp4"
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ FileNotFoundException | NullPointerException -> 0x0051, all -> 0x004f }
            java.io.File r2 = X.JTO.A0s(r2, r0)     // Catch:{ FileNotFoundException | NullPointerException -> 0x0051, all -> 0x004f }
            android.content.Context r0 = r7.A00     // Catch:{ FileNotFoundException | NullPointerException -> 0x0051, all -> 0x004f }
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch:{ FileNotFoundException | NullPointerException -> 0x0051, all -> 0x004f }
            android.net.Uri r0 = r7.A01     // Catch:{ FileNotFoundException | NullPointerException -> 0x0051, all -> 0x004f }
            java.io.InputStream r0 = r1.openInputStream(r0)     // Catch:{ FileNotFoundException | NullPointerException -> 0x0051, all -> 0x004f }
            if (r0 == 0) goto L_0x004a
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException | NullPointerException -> 0x0051, all -> 0x004f }
            r1.<init>(r0)     // Catch:{ FileNotFoundException | NullPointerException -> 0x0051, all -> 0x004f }
            boolean r0 = X.0mb.A09(r2, r1)     // Catch:{ FileNotFoundException | NullPointerException -> 0x0048 }
            goto L_0x005e
        L_0x0048:
            r0 = move-exception
            goto L_0x0053
        L_0x004a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)     // Catch:{ FileNotFoundException | NullPointerException -> 0x0051, all -> 0x004f }
            throw r0     // Catch:{ FileNotFoundException | NullPointerException -> 0x0051, all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            throw r0
        L_0x0051:
            r0 = move-exception
            r1 = r3
        L_0x0053:
            X.0KC.A0H(r4, r5, r0)     // Catch:{ all -> 0x0072 }
            if (r1 == 0) goto L_0x005b
            com.google.common.io.Closeables.A01(r1)
        L_0x005b:
            java.lang.String r2 = "video_invalid_url"
            goto L_0x0067
        L_0x005e:
            com.google.common.io.Closeables.A01(r1)
            if (r0 == 0) goto L_0x005b
            java.lang.String r2 = r2.getAbsolutePath()
        L_0x0067:
            java.lang.ref.WeakReference r1 = r7.A02
            X.M7N r0 = new X.M7N
            r0.<init>(r2, r1)
            X.11Z.A02(r0)
            return
        L_0x0072:
            r0 = move-exception
            if (r1 == 0) goto L_0x0078
            com.google.common.io.Closeables.A01(r1)
        L_0x0078:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61708KIy.run():void");
    }
}
