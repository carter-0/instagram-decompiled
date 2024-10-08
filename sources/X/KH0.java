package X;

import android.content.Context;
import com.instagram.api.schemas.ACRType;
import java.util.List;

public final class KH0 extends 2Cn {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass07i A02;
    public final /* synthetic */ 28D A03;
    public final /* synthetic */ ACRType A04;
    public final /* synthetic */ AnonymousClass8ZP A05;
    public final /* synthetic */ C255773uh A06;
    public final /* synthetic */ AnonymousClass6ST A07;
    public final /* synthetic */ AnonymousClass6Z5 A08;
    public final /* synthetic */ List A09;

    public KH0(Context context, AnonymousClass07i r2, 28D r3, ACRType aCRType, AnonymousClass8ZP r5, C255773uh r6, AnonymousClass6ST r7, AnonymousClass6Z5 r8, List list, int i) {
        this.A07 = r7;
        this.A09 = list;
        this.A05 = r5;
        this.A03 = r3;
        this.A04 = aCRType;
        this.A08 = r8;
        this.A06 = r6;
        this.A00 = i;
        this.A01 = context;
        this.A02 = r2;
    }

    public final void onFail(Exception exc) {
        AnonymousClass6Z5.A01(this.A01, this.A05, this.A08, "NavigateToFeedCreationWithReelItem_RemoteMediaConversionTaskFailed");
    }

    public final void onFinish() {
        this.A07.dismiss();
    }

    public final void onStart() {
        AnonymousClass0fN.A00(this.A07);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.util.List} */
    /* JADX WARNING: type inference failed for: r5v6, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v8, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r24) {
        /*
            r23 = this;
            r6 = r24
            java.util.List r6 = (java.util.List) r6
            r7 = 0
            X.0qQ.A0B(r6, r7)
            boolean r0 = r6.isEmpty()
            r2 = 1
            r1 = r0 ^ 1
            r0 = r23
            if (r1 == 0) goto L_0x0156
            int r1 = r6.size()
            r5 = 0
            if (r1 != r2) goto L_0x00fa
            java.lang.Object r6 = r6.get(r7)
            com.instagram.common.gallery.Medium r6 = (com.instagram.common.gallery.Medium) r6
            java.util.List r1 = r0.A09
            X.1Xj r1 = X.DbZ.A0T(r1, r7)
            java.lang.String r13 = r1.getId()
            boolean r1 = r6.CeS()
            if (r1 == 0) goto L_0x00b1
            X.8ZP r11 = r0.A05
            X.28D r12 = r0.A03
            com.instagram.api.schemas.ACRType r10 = r0.A04
            long r1 = r11.A00
            r3 = 0
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 == 0) goto L_0x004f
            X.1QP r9 = r11.A02
            java.lang.String r8 = "FEED_SINGLE_VIDEO_NAVIGATION_START"
            r9.flowMarkPoint(r1, r8)
            long r1 = r11.A00
            r9.flowEndNewStartFound(r1)
            r11.A00 = r3
            r11.A00(r12, r10)
        L_0x004f:
            X.6Z5 r9 = r0.A08
            com.instagram.common.session.UserSession r8 = r9.A09
            java.lang.String r4 = "userSession"
            if (r8 == 0) goto L_0x0135
            X.0Tu r3 = X.0Tu.A05
            r1 = 36324007301099173(0x810c7e00002ea5, double:3.034786710027914E-306)
            boolean r1 = X.DbY.A1Y(r3, r8, r1)
            if (r1 == 0) goto L_0x0093
            java.lang.ref.WeakReference r1 = r9.A1A
            java.lang.Object r1 = r1.get()
            X.4DH r1 = (X.AnonymousClass4DH) r1
            if (r1 == 0) goto L_0x0092
            android.app.Activity r11 = r1.getRootActivity()
            if (r11 == 0) goto L_0x0092
            com.instagram.common.session.UserSession r2 = r9.A09
            if (r2 == 0) goto L_0x0135
            java.util.List r18 = X.AnonymousClass7TE.A1I(r6)
            r14 = 0
            X.3uh r1 = r0.A06
            boolean r0 = r1.A1J()
            if (r0 == 0) goto L_0x0087
            java.lang.String r5 = r1.A0k
        L_0x0087:
            r15 = r14
            r16 = r5
            r17 = r13
            r19 = r7
            r13 = r2
            X.C250563lf.A0L(r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x0092:
            return
        L_0x0093:
            X.36V r3 = r9.A0D
            if (r3 == 0) goto L_0x0092
            android.net.Uri r9 = r6.A02()
            int r2 = r0.A00
            X.3uh r1 = r0.A06
            boolean r0 = r1.A1J()
            if (r0 == 0) goto L_0x00a7
            java.lang.String r5 = r1.A0k
        L_0x00a7:
            r8 = r3
            r10 = r12
            r11 = r13
            r12 = r5
            r13 = r2
            r14 = r7
            r8.Exl(r9, r10, r11, r12, r13, r14)
            return
        L_0x00b1:
            boolean r1 = r6.A05()
            if (r1 == 0) goto L_0x015f
            X.8ZP r4 = r0.A05
            long r1 = r4.A00
            r8 = 0
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x00c8
            X.1QP r4 = r4.A02
            java.lang.String r3 = "FEED_SINGLE_PHOTO_NAVIGATION_START"
            r4.flowMarkPoint(r1, r3)
        L_0x00c8:
            X.6Z5 r1 = r0.A08
            X.36V r8 = r1.A0D
            if (r8 == 0) goto L_0x0092
            android.net.Uri r9 = r6.A02()
            int r2 = r0.A00
            X.28D r10 = r0.A03
            r21 = 10004(0x2714, float:1.4019E-41)
            r11 = 0
            X.3uh r1 = r0.A06
            boolean r0 = r1.A0Q
            if (r0 == 0) goto L_0x00f8
            java.lang.String r0 = r1.A0k
            java.util.List r5 = X.AnonymousClass7TE.A1I(r13)
        L_0x00e5:
            r12 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r18 = r11
            r19 = r5
            r20 = r2
            r22 = r7
            r17 = r0
            r8.Ewq(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        L_0x00f8:
            r0 = r5
            goto L_0x00e5
        L_0x00fa:
            X.8ZP r4 = r0.A05
            long r2 = r4.A00
            r7 = 0
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x010b
            X.1QP r4 = r4.A02
            java.lang.String r1 = "FEED_CAROUSEL_NAVIGATION_START"
            r4.flowMarkPoint(r2, r1)
        L_0x010b:
            X.6Z5 r1 = r0.A08
            X.36V r9 = r1.A0D
            if (r9 == 0) goto L_0x0092
            java.util.List r7 = r0.A09
            int r4 = r0.A00
            X.28D r11 = r0.A03
            X.3uh r8 = r0.A06
            boolean r1 = r8.A0Q
            if (r1 == 0) goto L_0x013d
            java.lang.String r12 = r8.A0k
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r7)
            java.util.Iterator r2 = r7.iterator()
        L_0x0127:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x013f
            java.lang.String r1 = X.C51971G9r.A0v(r2)
            r3.add(r1)
            goto L_0x0127
        L_0x0135:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x013d:
            r12 = r5
            goto L_0x0143
        L_0x013f:
            java.util.List r5 = X.00k.A0X(r3)
        L_0x0143:
            X.07i r10 = r0.A02
            boolean r0 = r8.A0Q
            r17 = 10001(0x2711, float:1.4014E-41)
            if (r0 == 0) goto L_0x014d
            r17 = 10005(0x2715, float:1.402E-41)
        L_0x014d:
            r16 = r4
            r13 = r7
            r14 = r6
            r15 = r5
            r9.E0k(r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0156:
            X.6Z5 r3 = r0.A08
            android.content.Context r2 = r0.A01
            X.8ZP r1 = r0.A05
            java.lang.String r0 = "NavigateToFeedCreationWithReelItem_EmptyMediumList"
            goto L_0x0167
        L_0x015f:
            X.6Z5 r3 = r0.A08
            android.content.Context r2 = r0.A01
            X.8ZP r1 = r0.A05
            java.lang.String r0 = "NavigateToFeedCreationWithReelItem_NotPhotoOrVideo"
        L_0x0167:
            X.AnonymousClass6Z5.A01(r2, r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KH0.onSuccess(java.lang.Object):void");
    }
}
