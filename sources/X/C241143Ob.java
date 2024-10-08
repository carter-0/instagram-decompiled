package X;

import com.facebook.stash.core.FileStash;

/* renamed from: X.3Ob  reason: invalid class name and case insensitive filesystem */
public final class C241143Ob extends AnonymousClass3Ey {
    public final FileStash A00;
    public final String A01;
    public final C227392jB A02;
    public final C2813457a A03;
    public final boolean A04;
    public final /* synthetic */ AnonymousClass2jH A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C241143Ob(com.facebook.stash.core.FileStash r2, X.C227392jB r3, X.AnonymousClass2jH r4, X.C2813457a r5, java.lang.String r6, boolean r7) {
        /*
            r1 = this;
            r0 = 3
            X.0qQ.A0B(r3, r0)
            r1.A05 = r4
            java.io.OutputStream r0 = r2.write(r6)
            X.0qQ.A07(r0)
            r1.<init>(r0)
            r1.A01 = r6
            r1.A02 = r3
            r1.A00 = r2
            r1.A03 = r5
            r1.A04 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C241143Ob.<init>(com.facebook.stash.core.FileStash, X.2jB, X.2jH, X.57a, java.lang.String, boolean):void");
    }

    public final void A02() {
        if (!this.A00) {
            try {
                this.A00.remove(this.A01);
            } finally {
                close();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        if (r1.A02(r3, "metadata") == null) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03() {
        /*
            r8 = this;
            boolean r0 = r8.A00
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0089
            boolean r0 = r8.A01     // Catch:{ all -> 0x0084 }
            r5 = 0
            if (r0 == 0) goto L_0x0018
            X.2jB r0 = r8.A02     // Catch:{ all -> 0x0084 }
            java.lang.String r3 = r8.A01     // Catch:{ all -> 0x0084 }
            r0.remove(r3)     // Catch:{ all -> 0x0084 }
            com.facebook.stash.core.FileStash r6 = r8.A00     // Catch:{ all -> 0x0084 }
        L_0x0014:
            r6.remove(r3)     // Catch:{ all -> 0x0084 }
            goto L_0x007c
        L_0x0018:
            X.57a r0 = r8.A03     // Catch:{ all -> 0x0084 }
            r7 = 1
            if (r0 == 0) goto L_0x0033
            X.2jB r4 = r8.A02     // Catch:{ all -> 0x0084 }
            java.lang.String r3 = r8.A01     // Catch:{ all -> 0x0084 }
            org.json.JSONObject r2 = r0.A00     // Catch:{ all -> 0x0084 }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x0084 }
            X.0qQ.A0B(r3, r5)     // Catch:{ all -> 0x0084 }
            X.2ij r0 = r4.A00     // Catch:{ all -> 0x0084 }
            X.1FL r1 = r0.A00     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = "metadata"
            r1.A04(r3, r2, r0)     // Catch:{ all -> 0x0084 }
            goto L_0x004a
        L_0x0033:
            X.2jB r4 = r8.A02     // Catch:{ all -> 0x0084 }
            java.lang.String r3 = r8.A01     // Catch:{ all -> 0x0084 }
            X.0qQ.A0B(r3, r5)     // Catch:{ all -> 0x0084 }
            X.2ij r0 = r4.A00     // Catch:{ all -> 0x0084 }
            X.1FL r1 = r0.A00     // Catch:{ all -> 0x0084 }
            r1.A03(r3)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = "metadata"
            java.lang.Object r0 = r1.A02(r3, r0)     // Catch:{ all -> 0x0084 }
            r2 = 1
            if (r0 != 0) goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            com.facebook.stash.core.FileStash r6 = r8.A00     // Catch:{ all -> 0x0084 }
            java.io.File r1 = r6.getFilePath(r3)     // Catch:{ all -> 0x0084 }
            java.io.File r0 = r4.insertFile(r3)     // Catch:{ all -> 0x0084 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x0084 }
            if (r2 != 0) goto L_0x0071
            boolean r0 = r1.renameTo(r0)     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x0078
            X.2jH r0 = r8.A05     // Catch:{ all -> 0x0084 }
            boolean r1 = r8.A04     // Catch:{ all -> 0x0084 }
            X.2jB r0 = r0.A00     // Catch:{ all -> 0x0084 }
            java.io.File r0 = r0.getFilePath(r3)     // Catch:{ all -> 0x0084 }
            boolean r0 = r0.setExecutable(r1)     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x0078
            goto L_0x0080
        L_0x0071:
            java.lang.String r1 = "IgDiskStash2"
            java.lang.String r0 = "Failed to commit because of metadata error"
            X.0wb.A03(r1, r0)     // Catch:{ all -> 0x0084 }
        L_0x0078:
            r4.remove(r3)     // Catch:{ all -> 0x0084 }
            goto L_0x0014
        L_0x007c:
            r8.close()
            return r5
        L_0x0080:
            r8.close()
            return r7
        L_0x0084:
            r0 = move-exception
            r8.close()
            throw r0
        L_0x0089:
            java.lang.String r1 = "Try to operate on an EditorOutputStream that is already closed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C241143Ob.A03():boolean");
    }

    public final void close() {
        super.close();
        AnonymousClass2jH.A00(this.A05, this.A01);
    }
}
