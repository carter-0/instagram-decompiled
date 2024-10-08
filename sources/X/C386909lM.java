package X;

import java.lang.ref.WeakReference;

/* renamed from: X.9lM  reason: invalid class name and case insensitive filesystem */
public final class C386909lM extends 0ng {
    public final /* synthetic */ AnonymousClass8XI A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ WeakReference A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386909lM(AnonymousClass8XI r4, Object obj, String str, WeakReference weakReference) {
        super(1910247448, 3, false, false);
        this.A00 = r4;
        this.A03 = weakReference;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
        if (r0 == null) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            X.8XI r6 = r14.A00
            java.lang.ref.WeakReference r8 = r14.A03
            java.lang.Object r7 = r14.A01
            java.lang.String r1 = r14.A02
            java.lang.Object r0 = r8.get()
            X.B2Y r0 = (X.B2Y) r0
            if (r0 == 0) goto L_0x00e4
            boolean r0 = r0.CWQ(r7)
            if (r0 == 0) goto L_0x00e4
            boolean r5 = r6 instanceof X.AnonymousClass8XH
            if (r5 == 0) goto L_0x0085
            r0 = r7
            X.8ve r0 = (X.C369988ve) r0
            r4 = 0
            X.0qQ.A0B(r0, r4)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            X.8ka r3 = r0.A00()
            if (r3 == 0) goto L_0x003d
            X.8nd r2 = r3.A02
            X.8nd r0 = X.C365758nd.A07
            if (r2 != r0) goto L_0x007d
            X.7zv r0 = r3.A04
            r0.getClass()
            java.lang.String r0 = r0.A07()
        L_0x003b:
            if (r0 != 0) goto L_0x003f
        L_0x003d:
            java.lang.String r0 = "null"
        L_0x003f:
            r10.append(r0)
            r0 = 63
            r10.append(r0)
            int r0 = r6.A01
            r10.append(r0)
            r0 = 120(0x78, float:1.68E-43)
            r10.append(r0)
            int r0 = r6.A00
        L_0x0053:
            r10.append(r0)
            java.lang.String r13 = r10.toString()
            java.util.concurrent.ConcurrentHashMap r12 = X.AnonymousClass8XI.A05
            java.lang.Object r0 = r12.get(r13)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x00b8
            android.graphics.BitmapFactory$Options r0 = r6.A02
            android.graphics.BitmapFactory.decodeFile(r1, r0)
            int r11 = r0.outWidth
            int r10 = r0.outHeight
            int r9 = r6.A01
            int r3 = r6.A00
            r2 = 1
        L_0x0072:
            int r0 = r11 / r2
            if (r0 <= r9) goto L_0x00b1
            int r0 = r10 / r2
            if (r0 <= r3) goto L_0x00b1
            int r2 = r2 * 2
            goto L_0x0072
        L_0x007d:
            X.8Cl r0 = r3.A03
            r0.getClass()
            java.lang.String r0 = r0.A0h
            goto L_0x003b
        L_0x0085:
            r9 = r6
            X.9mR r9 = (X.C387579mR) r9
            r3 = r7
            X.8vc r3 = (X.C369968vc) r3
            r4 = 0
            X.0qQ.A0B(r3, r4)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            android.content.Context r2 = r9.A00
            com.instagram.common.session.UserSession r0 = r9.A03
            java.lang.String r0 = X.C394639yR.A00(r2, r3, r0)
            r10.append(r0)
            r0 = 63
            r10.append(r0)
            int r0 = r9.A01
            r10.append(r0)
            r0 = 120(0x78, float:1.68E-43)
            r10.append(r0)
            int r0 = r9.A00
            goto L_0x0053
        L_0x00b1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r12.put(r13, r0)
        L_0x00b8:
            int r3 = r0.intValue()
            X.9IV r2 = new X.9IV
            r2.<init>((java.lang.Object) r7, (java.lang.ref.WeakReference) r8)
            boolean r0 = android.webkit.URLUtil.isNetworkUrl(r1)
            if (r0 == 0) goto L_0x00e8
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r1)
        L_0x00cc:
            X.1NK r7 = X.1NK.A00()
            if (r5 == 0) goto L_0x00e5
            java.lang.String r1 = "StoryDraftThumbnailLoader"
        L_0x00d4:
            X.1OO r0 = r7.A0J(r0, r1)
            r0.A0I = r4
            r0.A08 = r2
            r0.A02(r6)
            r0.A01 = r3
            r0.A01()
        L_0x00e4:
            return
        L_0x00e5:
            java.lang.String r1 = "ClipsDraftThumbnailLoader"
            goto L_0x00d4
        L_0x00e8:
            if (r5 == 0) goto L_0x010f
            X.8ve r7 = (X.C369988ve) r7
            X.0qQ.A0B(r7, r4)
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            android.net.Uri$Builder r1 = r0.buildUpon()
            java.lang.String r0 = r7.A08
            android.net.Uri$Builder r0 = r1.fragment(r0)
            android.net.Uri r1 = r0.build()
            X.0qQ.A07(r1)
            r0 = -1
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C253833rU.A00(r1, r0, r0)
            goto L_0x00cc
        L_0x010f:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            r1 = -1
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            X.0qQ.A07(r0)
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C253833rU.A00(r0, r1, r1)
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C386909lM.run():void");
    }
}
