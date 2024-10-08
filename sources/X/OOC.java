package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public final class OOC {
    public C58840Ae A00;
    public C70829ONb A01;
    public 11T A02;
    public File A03;
    public List A04;
    public boolean A05 = true;

    public final void A01(Context context, Uri uri) {
        this.A01 = new C70829ONb(uri, new NEM(), (MY4) null, (String) null, C51965G9l.A0v(context));
    }

    public final void A02(Context context, Uri uri, MY4 my4, String str) {
        0qQ.A0B(uri, 1);
        this.A01 = new C70829ONb(uri, new NEL(), my4, str, C51965G9l.A0v(context));
    }

    public final void A04(11T r2, File file, boolean z) {
        0qQ.A0B(r2, 1);
        this.A03 = file;
        this.A02 = r2;
        this.A05 = z;
    }

    public final void A07(String... strArr) {
        0qQ.A0B(strArr, 0);
        List asList = Arrays.asList(strArr);
        0qQ.A07(asList);
        this.A04 = asList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d7 A[Catch:{ all -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e7 A[Catch:{ all -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0102 A[Catch:{ all -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0105 A[Catch:{ all -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0149 A[Catch:{ all -> 0x0152, all -> 0x0157 }, LOOP:0: B:74:0x0142->B:76:0x0149, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014e A[EDGE_INSN: B:77:0x014e->B:78:? ?: BREAK  , SYNTHETIC, Splitter:B:77:0x014e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.Ni4 A00() {
        /*
            r12 = this;
            X.ONb r5 = r12.A01     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r5 == 0) goto L_0x01b5
            java.lang.ref.WeakReference r2 = r5.A04     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.Object r0 = r2.get()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 == 0) goto L_0x01a8
            X.NpS r1 = r5.A01     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.Object r6 = r2.get()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            android.content.Context r6 = (android.content.Context) r6     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            android.net.Uri r4 = r5.A00     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            X.MY4 r3 = r5.A02     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r5 = r5.A03     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            boolean r0 = r1 instanceof X.NEM     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 == 0) goto L_0x0053
            X.0cS r2 = new X.0cS     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r2.<init>()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            X.0Pj r0 = X.0cQ.A00()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r2.A01 = r0     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            X.0cT r10 = r2.A00()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r9 = 0
            java.lang.String r8 = r4.getAuthority()     // Catch:{ SecurityException -> 0x0051 }
            java.lang.String r7 = r4.getScheme()     // Catch:{ SecurityException -> 0x0051 }
            r2 = 0
            if (r8 != 0) goto L_0x0040
            r4.getHost()     // Catch:{ SecurityException -> 0x0051 }
        L_0x003c:
            X.AnonymousClass0cT.A01(r6, r9, r2, r10)     // Catch:{ SecurityException -> 0x0051 }
            goto L_0x004f
        L_0x0040:
            if (r7 == 0) goto L_0x003c
            java.lang.String r0 = "content"
            boolean r0 = r7.equals(r0)     // Catch:{ SecurityException -> 0x0051 }
            if (r0 == 0) goto L_0x003c
            X.0RJ r2 = X.0RJ.A01(r6, r8)     // Catch:{ SecurityException -> 0x0051 }
            goto L_0x003c
        L_0x004f:
            r0 = 1
            goto L_0x0058
        L_0x0051:
            r0 = 0
            goto L_0x0058
        L_0x0053:
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            goto L_0x005c
        L_0x0058:
            java.lang.Boolean r0 = X.DbT.A0l(r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
        L_0x005c:
            boolean r0 = r0.booleanValue()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 == 0) goto L_0x0182
            android.content.ContentResolver r1 = r6.getContentResolver()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r11 = r1.openAssetFileDescriptor(r4, r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r11 == 0) goto L_0x016b
            android.os.ParcelFileDescriptor r0 = r11.getParcelFileDescriptor()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            boolean r0 = X.0b9.A02(r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 != 0) goto L_0x0162
            android.os.ParcelFileDescriptor r9 = r11.getParcelFileDescriptor()     // Catch:{ all -> 0x015c }
            if (r9 == 0) goto L_0x00d3
            com.facebook.secure.fileprovider.common.FileStatHelper r0 = com.facebook.secure.fileprovider.common.FileStatHelper.$redex_init_class     // Catch:{ all -> 0x015c }
            int r0 = r9.getFd()     // Catch:{ all -> 0x015c }
            com.facebook.secure.fileprovider.common.StatInfo r0 = com.facebook.secure.fileprovider.common.FileStatHelper.statOpenFile(r0)     // Catch:{ all -> 0x015c }
            long r0 = r0.device     // Catch:{ all -> 0x015c }
            long r7 = X.0b9.A00()     // Catch:{ all -> 0x015c }
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x00d0
            java.lang.String r2 = "/proc/self/fd"
            int r0 = r9.getFd()     // Catch:{ FileNotFoundException -> 0x00d3 }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ FileNotFoundException -> 0x00d3 }
            java.io.File r0 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00d3 }
            r0.<init>(r2, r1)     // Catch:{ FileNotFoundException -> 0x00d3 }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ FileNotFoundException -> 0x00d3 }
            r10 = 0
            if (r0 == 0) goto L_0x00d3
            java.io.File r1 = X.AnonymousClass7TE.A0t(r0)     // Catch:{ FileNotFoundException -> 0x00d3 }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r9 = android.os.ParcelFileDescriptor.open(r1, r0)     // Catch:{ FileNotFoundException -> 0x00d3 }
            int r0 = r9.getFd()     // Catch:{ all -> 0x00cb }
            com.facebook.secure.fileprovider.common.StatInfo r0 = com.facebook.secure.fileprovider.common.FileStatHelper.statOpenFile(r0)     // Catch:{ all -> 0x00cb }
            long r1 = r0.device     // Catch:{ all -> 0x00cb }
            long r7 = X.0b9.A00()     // Catch:{ all -> 0x00cb }
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x00c5
            r10 = 1
        L_0x00c5:
            r9.close()     // Catch:{ FileNotFoundException -> 0x00d3 }
            if (r10 == 0) goto L_0x00d3
            goto L_0x00d0
        L_0x00cb:
            r0 = move-exception
            r9.close()     // Catch:{ FileNotFoundException -> 0x00d3 }
            throw r0     // Catch:{ FileNotFoundException -> 0x00d3 }
        L_0x00d0:
            X.MY4 r1 = X.MY4.EXTERNAL_CACHE_PATH     // Catch:{ all -> 0x015c }
            goto L_0x00d5
        L_0x00d3:
            X.MY4 r1 = X.MY4.CACHE_PATH     // Catch:{ all -> 0x015c }
        L_0x00d5:
            if (r3 == 0) goto L_0x00e7
            boolean r0 = r3.A02     // Catch:{ all -> 0x015c }
            if (r0 != 0) goto L_0x00e8
            boolean r0 = r1.A02     // Catch:{ all -> 0x015c }
            if (r0 == 0) goto L_0x00e8
            java.lang.String r0 = "Attempted to save a file from internal storage onto sd card."
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ all -> 0x015c }
            r1.<init>(r0)     // Catch:{ all -> 0x015c }
            goto L_0x015b
        L_0x00e7:
            r3 = r1
        L_0x00e8:
            android.content.ContentResolver r0 = r6.getContentResolver()     // Catch:{ all -> 0x015c }
            java.lang.String r1 = r0.getType(r4)     // Catch:{ all -> 0x015c }
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()     // Catch:{ all -> 0x015c }
            java.lang.String r4 = r0.getExtensionFromMimeType(r1)     // Catch:{ all -> 0x015c }
            X.MY3 r0 = X.C66582MXn.A0J(r6)     // Catch:{ all -> 0x015c }
            X.OMb r3 = X.MY3.A02(r0, r3)     // Catch:{ all -> 0x015c }
            if (r5 != 0) goto L_0x0105
            java.lang.String r2 = "inbound"
            goto L_0x011f
        L_0x0105:
            java.io.File r2 = X.AnonymousClass7TE.A0t(r5)     // Catch:{ all -> 0x015c }
            java.lang.String r1 = r2.getName()     // Catch:{ all -> 0x015c }
            r0 = 46
            int r1 = r1.lastIndexOf(r0)     // Catch:{ all -> 0x015c }
            r0 = -1
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x015c }
            if (r1 == r0) goto L_0x011f
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r1)     // Catch:{ all -> 0x015c }
        L_0x011f:
            if (r4 == 0) goto L_0x012d
            java.lang.String r1 = "."
            boolean r0 = r4.startsWith(r1)     // Catch:{ all -> 0x015c }
            if (r0 != 0) goto L_0x012d
            java.lang.String r4 = X.002.A0R(r1, r4)     // Catch:{ all -> 0x015c }
        L_0x012d:
            java.io.File r0 = r3.A00()     // Catch:{ all -> 0x015c }
            java.io.File r5 = java.io.File.createTempFile(r2, r4, r0)     // Catch:{ all -> 0x015c }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x015c }
            r4.<init>(r5)     // Catch:{ all -> 0x015c }
            java.io.FileInputStream r3 = r11.createInputStream()     // Catch:{ all -> 0x0152 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0152 }
        L_0x0142:
            int r1 = r3.read(r2)     // Catch:{ all -> 0x0152 }
            r0 = -1
            if (r1 == r0) goto L_0x014e
            r0 = 0
            r4.write(r2, r0, r1)     // Catch:{ all -> 0x0152 }
            goto L_0x0142
        L_0x014e:
            r4.close()     // Catch:{ all -> 0x015c }
            goto L_0x01b0
        L_0x0152:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0157 }
            goto L_0x015b
        L_0x0157:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ all -> 0x015c }
        L_0x015b:
            throw r1     // Catch:{ all -> 0x015c }
        L_0x015c:
            r2 = move-exception
            r11.close()     // Catch:{ all -> 0x03a3 }
            goto L_0x03a7
        L_0x0162:
            java.lang.String r0 = "Attempted to retrieve internal file."
            java.lang.SecurityException r2 = new java.lang.SecurityException     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            goto L_0x03a7
        L_0x016b:
            java.lang.String r3 = "Failed to open descriptor for: "
            java.lang.String r2 = r4.getScheme()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r1 = "://"
            java.lang.String r0 = r4.getHost()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r0 = X.002.A0u(r3, r2, r1, r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            goto L_0x03a7
        L_0x0182:
            java.lang.String r5 = "URI "
            java.lang.String r6 = r4.getScheme()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r7 = "://"
            java.lang.String r8 = r4.getHost()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r9 = " is out of scope for "
            java.lang.Integer r0 = r1.A00     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 == 0) goto L_0x01a5
            java.lang.String r10 = "THIRD_PARTY"
        L_0x019a:
            java.lang.String r0 = X.002.A13(r5, r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.SecurityException r2 = new java.lang.SecurityException     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            goto L_0x03a7
        L_0x01a5:
            java.lang.String r10 = "ANY_APP"
            goto L_0x019a
        L_0x01a8:
            java.lang.String r0 = "Context must be set"
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            goto L_0x03a7
        L_0x01b0:
            r11.close()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r12.A03 = r5     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
        L_0x01b5:
            java.io.File r3 = r12.A03     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r2 = r3
            if (r3 == 0) goto L_0x039c
            X.11T r1 = r12.A02     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r1 == 0) goto L_0x01c5
            boolean r0 = r12.A05     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            X.1W2 r3 = new X.1W2     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r3.<init>(r1, r2, r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
        L_0x01c5:
            java.lang.String r6 = X.JTP.A0t(r3)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r5 = 0
            java.util.List r0 = r12.A04     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 != 0) goto L_0x01d4
            X.0Ae r0 = r12.A00     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 != 0) goto L_0x01d4
            goto L_0x02be
        L_0x01d4:
            java.io.File r0 = r12.A03     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r1 = "file"
            if (r0 == 0) goto L_0x0394
            boolean r0 = r0.exists()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 == 0) goto L_0x02be
            java.io.File r0 = r12.A03     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 == 0) goto L_0x0394
            java.lang.String r2 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            X.0qQ.A07(r2)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.util.List r4 = r12.A04     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            X.NrN r0 = com.facebook.secure.file.format.extended.jni.Magi.Companion     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            long r7 = X.O53.A00     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r9 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x020c
            java.lang.Object r3 = X.O53.A01     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            monitor-enter(r3)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            long r7 = X.O53.A00     // Catch:{ all -> 0x0207 }
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x020b
            long r0 = com.facebook.secure.file.format.extended.jni.Magi.nativeCreate()     // Catch:{ all -> 0x0207 }
            X.O53.A00 = r0     // Catch:{ all -> 0x0207 }
            goto L_0x020b
        L_0x0207:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            goto L_0x03a7
        L_0x020b:
            monitor-exit(r3)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
        L_0x020c:
            long r0 = X.O53.A00     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            com.facebook.secure.file.format.extended.jni.Magi$MatchResult r3 = com.facebook.secure.file.format.extended.jni.Magi.nativeMatch(r0, r2, r5, r4)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r7 = r3.mimeType     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            int r0 = r7.length()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 != 0) goto L_0x0267
            java.lang.String r7 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r2)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            X.0qQ.A07(r7)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r2 = X.RVX.A00(r2)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r8 = 0
            if (r4 == 0) goto L_0x025e
            int r0 = r2.length()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 == 0) goto L_0x025e
            boolean r0 = r4 instanceof java.util.Collection     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 == 0) goto L_0x0239
            boolean r0 = r4.isEmpty()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 == 0) goto L_0x0239
            goto L_0x025e
        L_0x0239:
            java.util.Iterator r3 = r4.iterator()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
        L_0x023d:
            boolean r0 = r3.hasNext()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 == 0) goto L_0x025e
            java.lang.String r1 = X.AnonymousClass7TE.A18(r3)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            boolean r0 = X.0qQ.A0K(r1, r2)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 != 0) goto L_0x025c
            r0 = 1
            boolean r0 = X.C66580MXl.A1a(r1, r0, r2)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 == 0) goto L_0x023d
            java.lang.String r0 = "/"
            boolean r0 = X.00p.A0i(r1, r0, r8)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 == 0) goto L_0x023d
        L_0x025c:
            r1 = 1
            goto L_0x025f
        L_0x025e:
            r1 = 0
        L_0x025f:
            java.lang.String r0 = ""
            X.OEp r3 = new X.OEp     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r3.<init>(r1, r7, r2, r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            goto L_0x0272
        L_0x0267:
            boolean r2 = r3.match     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r1 = r3.extension     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r0 = r3.error     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            X.OEp r3 = new X.OEp     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r3.<init>(r2, r1, r7, r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
        L_0x0272:
            java.lang.String r1 = r3.A00     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r1 == 0) goto L_0x0283
            int r0 = r1.length()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 == 0) goto L_0x0283
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            goto L_0x03a7
        L_0x0283:
            boolean r0 = r3.A03     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 != 0) goto L_0x02bd
            if (r4 == 0) goto L_0x02bd
            boolean r0 = r4.isEmpty()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 != 0) goto L_0x02bd
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r0 = "Invalid file format, expected "
            r2.append(r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r2.append(r5)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r1 = 32
            r2.append(r1)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r2.append(r4)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r0 = " but got "
            r2.append(r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r0 = r3.A01     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r2.append(r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r2.append(r1)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r0 = r3.A02     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r2)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            goto L_0x03a7
        L_0x02bd:
            r5 = r3
        L_0x02be:
            java.lang.String r0 = ""
            r11 = r0
            r9 = r0
            if (r5 == 0) goto L_0x02c6
            java.lang.String r0 = r5.A02     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
        L_0x02c6:
            X.Ni4 r3 = new X.Ni4     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r3.<init>(r6, r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            X.0Ae r1 = r12.A00     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r1 == 0) goto L_0x0393
            java.lang.String r0 = "secure_file_usage"
            X.0Aj r2 = X.C51969G9p.A0d(r1, r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            boolean r0 = r2.isSampled()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 == 0) goto L_0x0393
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.StackTraceElement[] r6 = r0.getStackTrace()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            X.0qQ.A07(r6)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r8 = 2
            int r5 = r6.length     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            int r1 = r5 - r8
            r10 = 0
            if (r1 < r10) goto L_0x030d
            r0 = 1
            if (r1 == 0) goto L_0x030d
            if (r1 < r5) goto L_0x02f3
            goto L_0x0310
        L_0x02f3:
            if (r1 != r0) goto L_0x02fd
            int r5 = r5 - r0
            r0 = r6[r5]     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.util.List r4 = X.AnonymousClass7TE.A1I(r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            goto L_0x0314
        L_0x02fd:
            java.util.ArrayList r4 = X.DbS.A0v(r1)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            int r1 = r5 - r1
        L_0x0303:
            if (r1 >= r5) goto L_0x0314
            r0 = r6[r1]     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r4.add(r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            int r1 = r1 + 1
            goto L_0x0303
        L_0x030d:
            X.0sn r4 = X.0sn.A00     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            goto L_0x0314
        L_0x0310:
            java.util.List r4 = X.03t.A0J(r6)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
        L_0x0314:
            java.util.Iterator r7 = r4.iterator()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
        L_0x0318:
            boolean r0 = r7.hasNext()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r6 = r11
            if (r0 == 0) goto L_0x0356
            java.lang.Object r5 = r7.next()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.StackTraceElement r5 = (java.lang.StackTraceElement) r5     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r4 = r5.getClassName()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            X.0qQ.A07(r4)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.Class<X.OOC> r1 = X.OOC.class
            java.util.Map r0 = X.0Yh.A03     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r0 = X.0q1.A01(r1)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 == 0) goto L_0x0337
            r6 = r0
        L_0x0337:
            boolean r0 = X.00l.A0d(r4, r6, r10)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r0 != 0) goto L_0x0318
            java.lang.String r1 = r5.getClassName()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r0 = r5.getMethodName()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r8)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r0 = "%s.%s"
            java.lang.String r9 = java.lang.String.format(r0, r1)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            X.0qQ.A07(r9)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
        L_0x0356:
            java.lang.String r0 = "callsite"
            r2.AAJ(r0, r9)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r1 = r3.A00     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r0 = "mimetype"
            r2.AAJ(r0, r1)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r1 = r3.getParent()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            if (r1 != 0) goto L_0x0369
            r1 = r11
        L_0x0369:
            java.lang.String r0 = "scope"
            r2.AAJ(r0, r1)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r0 = r3.getPath()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r1 = X.RVX.A00(r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r0 = "extension_mimetype"
            r2.AAJ(r0, r1)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r0 = r3.getPath()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r1 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            X.0qQ.A07(r1)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r0 = 5
            java.lang.String r1 = X.00R.A03(r1, r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            java.lang.String r0 = "extension"
            r2.AAJ(r0, r1)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            r2.Cgf()     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
        L_0x0393:
            return r3
        L_0x0394:
            X.0qQ.A0F(r1)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            goto L_0x03a7
        L_0x039c:
            java.lang.String r0 = "Path must be set"
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
            goto L_0x03a7
        L_0x03a3:
            r0 = move-exception
            X.C9153RRe.A00(r2, r0)     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
        L_0x03a7:
            throw r2     // Catch:{ IOException -> 0x03af, IllegalStateException -> 0x03a8 }
        L_0x03a8:
            r1 = move-exception
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x03af:
            r1 = move-exception
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OOC.A00():X.Ni4");
    }

    public final void A06(String str) {
        String path;
        if (00p.A0k(str, "file:/", false)) {
            Uri uri = null;
            try {
                uri = 0cp.A03(str);
            } catch (SecurityException unused) {
            }
            if (!(uri == null || (path = uri.getPath()) == null)) {
                str = path;
            }
        }
        this.A03 = AnonymousClass7TE.A0t(str);
    }

    public final void A03(11T r3, File file, String str) {
        A04(r3, JTO.A0s(file, str), AnonymousClass7TG.A1Z(file, str));
    }

    public final void A05(11T r3, String str) {
        String path;
        boolean A1X = JTQ.A1X(str);
        if (C66580MXl.A1a("file:/", A1X ? 1 : 0, str)) {
            Uri uri = null;
            try {
                uri = 0cp.A03(str);
            } catch (SecurityException unused) {
            }
            if (!(uri == null || (path = uri.getPath()) == null)) {
                str = path;
            }
        }
        A04(r3, AnonymousClass7TE.A0t(str), A1X);
    }
}
