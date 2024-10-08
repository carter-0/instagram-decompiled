package X;

import android.content.res.Resources;

/* renamed from: X.3uN  reason: invalid class name and case insensitive filesystem */
public abstract class C255583uN {
    public static final int A00 = Resources.getSystem().getDisplayMetrics().widthPixels;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        if (r4 == null) goto L_0x0045;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.model.mediasize.VideoUrlImpl A01(java.lang.String r7, java.util.List r8) {
        /*
            r6 = 0
            if (r8 != 0) goto L_0x0004
            return r6
        L_0x0004:
            java.util.Iterator r5 = r8.iterator()
            r2 = r6
            r4 = r6
        L_0x000a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r3 = r5.next()
            com.instagram.model.mediasize.VideoUrlImpl r3 = (com.instagram.model.mediasize.VideoUrlImpl) r3
            int r1 = r3.A01
            r0 = -2
            if (r1 == r0) goto L_0x0023
            switch(r1) {
                case 100: goto L_0x0023;
                case 101: goto L_0x001f;
                case 102: goto L_0x0021;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x000a
        L_0x001f:
            r4 = r3
            goto L_0x000a
        L_0x0021:
            r2 = r3
            goto L_0x000a
        L_0x0023:
            return r3
        L_0x0024:
            if (r2 != 0) goto L_0x004f
            if (r4 != 0) goto L_0x004d
            java.lang.Object r2 = X.00k.A0J(r8)
            com.instagram.model.mediasize.VideoUrlImpl r2 = (com.instagram.model.mediasize.VideoUrlImpl) r2
            if (r2 == 0) goto L_0x0036
            int r0 = r2.A01
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L_0x0036:
            java.lang.Object[] r1 = new java.lang.Object[]{r7, r6}
            java.lang.String r0 = "media id: %s invalid type: %d"
            java.lang.String r1 = X.0mp.A06(r0, r1)
            java.lang.String r0 = "no_valid_video_url"
            X.0wb.A03(r0, r1)
        L_0x0045:
            r4 = r2
        L_0x0046:
            int r1 = A00
            r0 = 480(0x1e0, float:6.73E-43)
            if (r1 > r0) goto L_0x0052
            return r2
        L_0x004d:
            r2 = r4
            goto L_0x0046
        L_0x004f:
            if (r4 != 0) goto L_0x0046
            goto L_0x0045
        L_0x0052:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C255583uN.A01(java.lang.String, java.util.List):com.instagram.model.mediasize.VideoUrlImpl");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.instagram.model.mediasize.VideoUrlImpl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.instagram.model.mediasize.VideoUrlImpl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.instagram.model.mediasize.VideoUrlImpl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.instagram.model.mediasize.VideoUrlImpl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: com.instagram.model.mediasize.VideoUrlImpl} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.model.mediasize.VideoUrlImpl A00(X.AnonymousClass3WR r6) {
        /*
            java.util.List r6 = r6.A0M
            r5 = 0
            if (r6 == 0) goto L_0x001f
            java.util.Iterator r3 = r6.iterator()
        L_0x0009:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001d
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.instagram.model.mediasize.VideoUrlImpl r0 = (com.instagram.model.mediasize.VideoUrlImpl) r0
            int r1 = r0.A01
            r0 = 100
            if (r1 != r0) goto L_0x0009
            r5 = r2
        L_0x001d:
            com.instagram.model.mediasize.VideoUrlImpl r5 = (com.instagram.model.mediasize.VideoUrlImpl) r5
        L_0x001f:
            r4 = 0
            if (r5 != 0) goto L_0x0053
            if (r6 == 0) goto L_0x0054
            java.util.Iterator r3 = r6.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0050
            java.lang.Object r4 = r3.next()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0050
            r0 = r4
            com.instagram.model.mediasize.VideoUrlImpl r0 = (com.instagram.model.mediasize.VideoUrlImpl) r0
            int r2 = r0.A02
        L_0x003d:
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.instagram.model.mediasize.VideoUrlImpl r0 = (com.instagram.model.mediasize.VideoUrlImpl) r0
            int r0 = r0.A02
            if (r2 >= r0) goto L_0x004a
            r4 = r1
            r2 = r0
        L_0x004a:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x003d
        L_0x0050:
            r5 = r4
            com.instagram.model.mediasize.VideoUrlImpl r5 = (com.instagram.model.mediasize.VideoUrlImpl) r5
        L_0x0053:
            return r5
        L_0x0054:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C255583uN.A00(X.3WR):com.instagram.model.mediasize.VideoUrlImpl");
    }
}
