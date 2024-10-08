package X;

import android.content.Context;
import android.net.Uri;

public final class Si5 implements C13691Tf9 {
    public static final SJ8 A01 = new SJ8(SJ8.A04, (Object) null, "com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");
    public final Context A00;

    public final /* bridge */ /* synthetic */ C13796ThF ANe(C11856Shi shi, Object obj, int i, int i2) {
        return A00((Uri) obj, shi);
    }

    public final /* bridge */ /* synthetic */ boolean CJU(C11856Shi shi, Object obj) {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    public Si5(Context context) {
        this.A00 = context.getApplicationContext();
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.Sij, X.QHK] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        if (r2 == null) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.QHK A00(android.net.Uri r9, X.C11856Shi r10) {
        /*
            r8 = this;
            java.lang.String r5 = r9.getAuthority()
            android.content.Context r4 = r8.A00
            r3 = r4
            java.lang.String r0 = r4.getPackageName()
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0031
            r0 = 0
            android.content.Context r3 = r4.createPackageContext(r5, r0)     // Catch:{ NameNotFoundException -> 0x0017 }
            goto L_0x0031
        L_0x0017:
            r2 = move-exception
            java.lang.String r0 = r4.getPackageName()
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L_0x0031
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed to obtain context or unrecognized Uri format for: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r9, r0, r1)
            java.lang.IllegalArgumentException r0 = X.Pxe.A0h(r0, r2)
            throw r0
        L_0x0031:
            java.util.List r2 = r9.getPathSegments()
            int r1 = r2.size()
            r0 = 2
            if (r1 != r0) goto L_0x0070
            java.util.List r2 = r9.getPathSegments()
            java.lang.String r1 = r9.getAuthority()
            java.lang.Object r7 = X.AnonymousClass7TE.A13(r2)
            java.lang.String r7 = (java.lang.String) r7
            r0 = 1
            java.lang.String r2 = X.AnonymousClass7TE.A19(r2, r0)
            android.content.res.Resources r0 = r3.getResources()
            int r6 = r0.getIdentifier(r2, r7, r1)
            if (r6 != 0) goto L_0x0084
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()
            java.lang.String r0 = "android"
            int r6 = r1.getIdentifier(r2, r7, r0)
            if (r6 != 0) goto L_0x0084
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed to find resource id for: "
            java.lang.IllegalArgumentException r0 = X.C51973G9u.A0g(r9, r0, r1)
            throw r0
        L_0x0070:
            int r1 = r2.size()
            r0 = 1
            if (r1 != r0) goto L_0x00c9
            java.util.List r1 = r9.getPathSegments()
            r0 = 0
            java.lang.String r0 = X.AnonymousClass7TE.A19(r1, r0)     // Catch:{ NumberFormatException -> 0x00b9 }
            int r6 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00b9 }
        L_0x0084:
            X.SJ8 r0 = A01
            java.lang.Object r2 = r10.A00(r0)
            android.content.res.Resources$Theme r2 = (android.content.res.Resources.Theme) r2
            java.lang.String r0 = r3.getPackageName()
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0099
            r1 = 0
            if (r2 != 0) goto L_0x009a
        L_0x0099:
            r1 = 1
        L_0x009a:
            java.lang.String r0 = "Can't get a theme from another package"
            if (r1 == 0) goto L_0x00b4
            if (r2 != 0) goto L_0x00ad
            r0 = 0
            android.graphics.drawable.Drawable r1 = X.C9910RjP.A00(r4, r3, r0, r6)
        L_0x00a5:
            if (r1 == 0) goto L_0x00b2
            X.QHK r0 = new X.QHK
            r0.<init>(r1)
            return r0
        L_0x00ad:
            android.graphics.drawable.Drawable r1 = X.C9910RjP.A00(r4, r4, r2, r6)
            goto L_0x00a5
        L_0x00b2:
            r0 = 0
            return r0
        L_0x00b4:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x00b9:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unrecognized Uri format: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r9, r0, r1)
            java.lang.IllegalArgumentException r0 = X.Pxe.A0h(r0, r2)
            throw r0
        L_0x00c9:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unrecognized Uri format: "
            java.lang.IllegalArgumentException r0 = X.C51973G9u.A0g(r9, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Si5.A00(android.net.Uri, X.Shi):X.QHK");
    }
}
