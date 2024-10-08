package X;

import android.content.IntentFilter;
import java.util.ArrayList;

/* renamed from: X.Oqg  reason: case insensitive filesystem */
public final class C71780Oqg implements C59900bo {
    public final 0sP A00;

    /* JADX WARNING: type inference failed for: r3v0, types: [int, boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        throw r0;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dbc(android.content.Context r9, android.content.Intent r10, X.C59880bj r11) {
        /*
            r8 = this;
            r4 = 0
            boolean r3 = X.AnonymousClass7TF.A1U(r4, r9, r10)
            java.lang.String r1 = "download_success"
            boolean r0 = r10.hasExtra(r1)
            if (r0 == 0) goto L_0x0017
            boolean r1 = r10.getBooleanExtra(r1, r4)
            X.0sP r0 = r8.A00
            X.C51968G9o.A1O(r0, r1)
        L_0x0016:
            return
        L_0x0017:
            r0 = 208(0xd0, float:2.91E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.Object r7 = r9.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.app.DownloadManager"
            X.0qQ.A0C(r7, r0)
            android.app.DownloadManager r7 = (android.app.DownloadManager) r7
            r0 = 0
            java.lang.String r2 = "extra_download_id"
            long r5 = r10.getLongExtra(r2, r0)
            android.app.DownloadManager$Query r1 = new android.app.DownloadManager$Query
            r1.<init>()
            long[] r0 = new long[r3]
            r0[r4] = r5
            android.app.DownloadManager$Query r0 = r1.setFilterById(r0)
            android.database.Cursor r2 = r7.query(r0)
            if (r2 == 0) goto L_0x0016
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = "status"
            int r0 = r2.getColumnIndex(r0)     // Catch:{ all -> 0x006a }
            int r1 = r2.getInt(r0)     // Catch:{ all -> 0x006a }
            r0 = 8
            if (r1 == r0) goto L_0x0061
            r0 = 16
            if (r1 != r0) goto L_0x0066
            X.0sP r0 = r8.A00     // Catch:{ all -> 0x006a }
            X.C51968G9o.A1O(r0, r4)     // Catch:{ all -> 0x006a }
            goto L_0x0066
        L_0x0061:
            X.0sP r0 = r8.A00     // Catch:{ all -> 0x006a }
            X.C51968G9o.A1O(r0, r3)     // Catch:{ all -> 0x006a }
        L_0x0066:
            r2.close()
            return
        L_0x006a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71780Oqg.Dbc(android.content.Context, android.content.Intent, X.0bj):void");
    }

    public final ArrayList BIF() {
        return 0sr.A1L(new IntentFilter[]{new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), new IntentFilter("com.meta.ai.notify.ACTION_DOWNLOAD_COMPLETE")});
    }

    public C71780Oqg(0sP r1) {
        this.A00 = r1;
    }
}
