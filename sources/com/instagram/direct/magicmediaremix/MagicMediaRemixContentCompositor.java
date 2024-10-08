package com.instagram.direct.magicmediaremix;

import X.002;
import X.0qQ;
import X.0sr;
import X.AEV;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TH;
import X.AnonymousClass8BH;
import X.AnonymousClass8DA;
import X.C273654mx;
import X.C273914nO;
import X.C310416b1;
import X.C3510487j;
import X.C369458un;
import X.C378669Qs;
import X.C395099zD;
import X.C39757A7x;
import X.C40237AXb;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

public final class MagicMediaRemixContentCompositor {
    public final int A00;
    public final int A01;
    public final UserSession A02;
    public final C40237AXb A03 = new C40237AXb();
    public final Context A04;
    public final C39757A7x A05;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r12v1, types: [X.JZl, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v1, types: [X.07Z, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cb A[SYNTHETIC] */
    public static final java.lang.Object A00(X.AnonymousClass4DH r21, com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositor r22, java.util.List r23, X.AnonymousClass4D7 r24) {
        /*
            r8 = r22
            r9 = r21
            r3 = 2
            r4 = r24
            boolean r0 = X.C59814JZl.A01(r3, r4)
            if (r0 == 0) goto L_0x00c4
            r12 = r4
            X.JZl r12 = (X.C59814JZl) r12
            int r2 = r12.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c4
            int r2 = r2 - r1
            r12.A00 = r2
        L_0x001b:
            java.lang.Object r2 = r12.A07
            X.1Hj r11 = X.1Hj.A02
            int r0 = r12.A00
            r10 = 1
            if (r0 == 0) goto L_0x00af
            if (r0 != r10) goto L_0x00cc
            java.lang.Object r3 = r12.A06
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            java.lang.Object r14 = r12.A05
            java.util.Iterator r14 = (java.util.Iterator) r14
            java.lang.Object r13 = r12.A04
            android.graphics.Canvas r13 = (android.graphics.Canvas) r13
            java.lang.Object r0 = r12.A03
            java.lang.Object r9 = r12.A02
            androidx.fragment.app.Fragment r9 = (androidx.fragment.app.Fragment) r9
            java.lang.Object r8 = r12.A01
            com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositor r8 = (com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositor) r8
            X.0eS.A00(r2)
        L_0x003f:
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
        L_0x0041:
            if (r2 == 0) goto L_0x0047
            r1 = 0
            r13.drawBitmap(r2, r1, r3, r1)
        L_0x0047:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x00cb
            java.lang.Object r7 = r14.next()
            X.B2p r7 = (X.C41834B2p) r7
            boolean r1 = r7 instanceof android.graphics.drawable.Drawable
            if (r1 == 0) goto L_0x0047
            double r23 = r7.Bsj()
            double r21 = r7.Bsk()
            double r2 = r7.Bsi()
            double r15 = r7.Bsg()
            int r1 = r8.A01
            double r5 = (double) r1
            double r19 = r5 * r2
            int r1 = r8.A00
            double r3 = (double) r1
            double r17 = r3 * r15
            double r5 = r5 * r23
            r15 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r1 = r19 / r15
            double r5 = r5 - r1
            double r3 = r3 * r21
            double r1 = r17 / r15
            double r3 = r3 - r1
            int r15 = (int) r5
            int r2 = (int) r3
            double r5 = r5 + r19
            int r1 = (int) r5
            double r3 = r3 + r17
            int r5 = (int) r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r15, r2, r1, r5)
            boolean r1 = r7 instanceof X.C389549po
            if (r1 == 0) goto L_0x00a8
            X.AnonymousClass07a.A00(r9)
            X.9po r7 = (X.C389549po) r7
            r12.A01 = r8
            r12.A02 = r9
            r12.A03 = r0
            r12.A04 = r13
            r12.A05 = r14
            r12.A06 = r3
            r12.A00 = r10
            java.lang.Object r2 = A01(r7, r8, r12)
            if (r2 != r11) goto L_0x003f
            return r11
        L_0x00a8:
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            android.graphics.Bitmap r2 = X.1MF.A0D(r7)
            goto L_0x0041
        L_0x00af:
            X.0eS.A00(r2)
            int r1 = r8.A01
            int r0 = r8.A00
            android.graphics.Bitmap r0 = X.AnonymousClass7TF.A0B(r1, r0)
            android.graphics.Canvas r13 = new android.graphics.Canvas
            r13.<init>(r0)
            java.util.Iterator r14 = r23.iterator()
            goto L_0x0047
        L_0x00c4:
            X.JZl r12 = new X.JZl
            r12.<init>(r8, r4, r3)
            goto L_0x001b
        L_0x00cb:
            return r0
        L_0x00cc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositor.A00(X.4DH, com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositor, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME7, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C389549po r5, com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositor r6, X.AnonymousClass4D7 r7) {
        /*
            r3 = 21
            boolean r0 = X.ME7.A02(r3, r7)
            if (r0 == 0) goto L_0x0022
            r4 = r7
            X.ME7 r4 = (X.ME7) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r2 = r4.A00
            r1 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r1) goto L_0x002a
            goto L_0x005e
        L_0x0022:
            r0 = 42
            X.ME7 r4 = new X.ME7
            r4.<init>(r6, r7, r3, r0)
            goto L_0x0016
        L_0x002a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002f:
            X.0eS.A00(r0)
            r4.A00 = r1     // Catch:{ all -> 0x0068 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C241503Pl.A01     // Catch:{ all -> 0x0068 }
            X.4D7 r0 = X.1Ey.A02(r4)     // Catch:{ all -> 0x0068 }
            X.3Pl r2 = new X.3Pl     // Catch:{ all -> 0x0068 }
            r2.<init>(r0)     // Catch:{ all -> 0x0068 }
            X.8vW r0 = r5.A00     // Catch:{ all -> 0x0068 }
            android.graphics.Bitmap r1 = r0.A01     // Catch:{ all -> 0x0068 }
            r0 = 0
            if (r1 != 0) goto L_0x0047
            r0 = 1
        L_0x0047:
            if (r0 == 0) goto L_0x004a
            goto L_0x004e
        L_0x004a:
            r2.resumeWith(r5)     // Catch:{ all -> 0x0068 }
            goto L_0x0057
        L_0x004e:
            r1 = 2
            X.AYw r0 = new X.AYw     // Catch:{ all -> 0x0068 }
            r0.<init>(r1, r5, r2)     // Catch:{ all -> 0x0068 }
            r5.A9D(r0)     // Catch:{ all -> 0x0068 }
        L_0x0057:
            java.lang.Object r0 = r2.A00()     // Catch:{ all -> 0x0068 }
            if (r0 != r3) goto L_0x0061
            return r3
        L_0x005e:
            X.0eS.A00(r0)     // Catch:{ all -> 0x0068 }
        L_0x0061:
            X.9po r0 = (X.C389549po) r0     // Catch:{ all -> 0x0068 }
            android.graphics.Bitmap r3 = X.1MF.A0D(r0)     // Catch:{ all -> 0x0068 }
            return r3
        L_0x0068:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositor.A01(X.9po, com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositor, X.4D7):java.lang.Object");
    }

    private final void A02(Drawable drawable, SparseArray sparseArray, String str, String str2, List list, Map map, double d, double d2, int i, boolean z) {
        Drawable drawable2 = drawable;
        double intrinsicWidth = (double) drawable2.getIntrinsicWidth();
        double intrinsicHeight = (double) drawable2.getIntrinsicHeight();
        int i2 = this.A01;
        double d3 = d * ((double) i2);
        Float valueOf = Float.valueOf((float) (d3 - (intrinsicWidth / 2.0d)));
        int i3 = this.A00;
        double d4 = d2 * ((double) i3);
        Float valueOf2 = Float.valueOf((float) (d4 - (intrinsicHeight / 2.0d)));
        UserSession userSession = this.A02;
        Context context = this.A04;
        C310416b1 r12 = new C310416b1((AnonymousClass8BH) null, (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) "magic_media_remix_content_compositor", (String) null, (List) AnonymousClass7TE.A1D(0sr.A1P(new Float[]{valueOf, valueOf2})), -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, z, true, false, false, true, true, true, true, true, true, false, false);
        C378669Qs r40 = new C378669Qs(context, drawable2, userSession, i, false, false);
        AEV.A00(r12, r40);
        list.add(r40);
        int i4 = (int) (d3 - ((double) (i2 / 2)));
        0qQ.A0C(r40, "null cannot be cast to non-null type com.instagram.ui.widget.interactive.intf.InteractiveDrawable");
        C369458un r1 = new C369458un(userSession, r40);
        r1.A01 = (float) i4;
        r1.A02 = (float) ((int) (d4 - ((double) (i3 / 2))));
        map.put(r40.A0B, r1);
        C273914nO A0C = AnonymousClass7TH.A0C();
        A0C.A06 = AnonymousClass7TE.A1I(C273654mx.A00(3396));
        A0C.A03 = null;
        A0C.A04 = null;
        A0C.A05 = null;
        sparseArray.put(r40.A0g, A0C);
        C39757A7x a7x = this.A05;
        String str3 = str;
        String str4 = str2;
        String A0R = 002.A0R(str3, str4);
        String str5 = r40.A0j;
        0qQ.A0B(A0R, 0);
        a7x.A05.put(A0R, str5);
        String A0R2 = 002.A0R(str3, str4);
        String A0h = AnonymousClass7TF.A0h(drawable2);
        0qQ.A0B(A0R2, 0);
        a7x.A04.put(A0R2, A0h);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl$IgdMagicRemixLayout$Response} */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.lang.Object, X.8pP] */
    /* JADX WARNING: type inference failed for: r2v11, types: [java.lang.Object, X.8pQ] */
    /* JADX WARNING: type inference failed for: r0v19, types: [X.MED, X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass4DH r61, com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response r62, X.C381559bx r63, java.util.List r64, X.AnonymousClass4D7 r65) {
        /*
            r60 = this;
            r18 = r62
            r3 = 36
            r4 = r65
            boolean r0 = X.MED.A04(r3, r4)
            r13 = r60
            if (r0 == 0) goto L_0x0646
            r0 = r4
            X.MED r0 = (X.MED) r0
            r20 = r0
            int r2 = r0.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0646
            int r2 = r2 - r1
            r0 = r20
            r0.A00 = r2
        L_0x0020:
            java.lang.Object r2 = r0.A04
            X.1Hj r17 = X.1Hj.A02
            int r0 = r0.A00
            r9 = 1
            if (r0 == 0) goto L_0x005b
            if (r0 != r9) goto L_0x064f
            r0 = r20
            java.lang.Object r3 = r0.A03
            java.lang.Object r0 = r0.A02
            r18 = r0
            r0 = r18
            com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl$IgdMagicRemixLayout$Response r0 = (com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response) r0
            r18 = r0
            r0 = r20
            java.lang.Object r0 = r0.A01
            com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositor r0 = (com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositor) r0
            X.0eS.A00(r2)
        L_0x0042:
            X.A7x r4 = r0.A05
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.util.List r0 = r4.A03
            r0.add(r3)
            X.Nkp r1 = r18.A0E()
            if (r1 != 0) goto L_0x0055
            X.Nkp r1 = X.C69410Nkp.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
        L_0x0055:
            java.util.ArrayList r0 = r4.A01
            r0.add(r1)
            return r2
        L_0x005b:
            X.0eS.A00(r2)
            java.util.ArrayList r46 = X.AnonymousClass7TE.A1C()
            android.util.SparseArray r19 = new android.util.SparseArray
            r19.<init>()
            java.util.LinkedHashMap r47 = X.AnonymousClass7TE.A1H()
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl$IgdMagicRemixLayout$Response$BackgroundImages> r26 = com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response.BackgroundImages.class
            X.3sh r0 = X.C250663lr.Companion
            r3 = -617995249(0xffffffffdb2a240f, float:-4.7890393E16)
            java.lang.String r25 = "background_images"
            r2 = r18
            r1 = r25
            r0 = r26
            com.google.common.collect.ImmutableList r0 = r2.getRequiredCompactedTreeListField(r9, r1, r0, r3)
            java.util.Iterator r15 = r0.iterator()
            r7 = 0
            r5 = 0
        L_0x0088:
            boolean r0 = r15.hasNext()
            java.lang.String r45 = ""
            r42 = r64
            if (r0 == 0) goto L_0x0167
            java.lang.Object r3 = r15.next()
            int r14 = r5 + 1
            if (r5 < 0) goto L_0x0654
            X.3lr r3 = (X.C250663lr) r3
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl$IgdMagicRemixLayout$Response$BackgroundImages$PositionData> r2 = com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response.BackgroundImages.PositionData.class
            r1 = -1996884977(0xffffffff88f9f40f, float:-1.504352E-33)
            java.lang.String r0 = "position_data"
            X.3lr r0 = r3.getOptionalTreeField(r7, r0, r2, r1)
            if (r0 == 0) goto L_0x0164
            java.lang.String r10 = "width"
            double r28 = r0.getCoercedDoubleField(r9, r10)
            int r1 = r13.A01
            double r1 = (double) r1
            double r28 = r28 * r1
            java.lang.String r8 = "height"
            double r30 = r0.getCoercedDoubleField(r7, r8)
            int r3 = r13.A00
            double r3 = (double) r3
            double r30 = r30 * r3
            r3 = r42
            java.lang.Object r6 = r3.get(r5)
            com.instagram.common.gallery.Medium r6 = (com.instagram.common.gallery.Medium) r6
            double r3 = r28 / r30
            android.graphics.Bitmap r27 = X.C64176LSd.A00(r6, r3)
            X.6nz r3 = X.C317876nz.A0a
            double r32 = r28 / r1
            X.6nz r1 = X.C317886o0.A02(r27, r28, r30, r32)
            com.instagram.common.session.UserSession r12 = r13.A02
            android.content.Context r11 = r13.A04
            java.util.List r2 = r1.A0O
            java.lang.Object r3 = r2.get(r7)
            X.6o8 r3 = (X.C317966o8) r3
            r2 = 151(0x97, float:2.12E-43)
            java.lang.String r36 = X.C273654mx.A00(r2)
            X.6oG r34 = r1.A00()
            com.instagram.api.schemas.RingSpecImpl r4 = r1.A00
            X.3ID r2 = r1.A06
            X.8vI r29 = new X.8vI
            r30 = r11
            r31 = r4
            r32 = r12
            r33 = r3
            r35 = r2
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)
            r3 = 2
            java.lang.String r2 = "x"
            double r32 = r0.getCoercedDoubleField(r3, r2)
            r4 = 3
            java.lang.String r3 = "y"
            double r34 = r0.getCoercedDoubleField(r4, r3)
            double r36 = r0.getCoercedDoubleField(r9, r10)
            double r38 = r0.getCoercedDoubleField(r7, r8)
            r6 = 5
            java.lang.String r4 = "rotation"
            double r40 = r0.getCoercedDoubleField(r6, r4)
            X.9lt r4 = new X.9lt
            r27 = r4
            r28 = r11
            r30 = r12
            r31 = r1
            r27.<init>(r28, r29, r30, r31, r32, r34, r36, r38, r40)
            r1 = 2
            double r48 = r0.getCoercedDoubleField(r1, r2)
            r1 = 3
            double r50 = r0.getCoercedDoubleField(r1, r3)
            r0.getCoercedDoubleField(r9, r10)
            r0.getCoercedDoubleField(r7, r8)
            r0 = r42
            java.lang.Object r0 = r0.get(r5)
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            java.lang.String r0 = r0.A0X
            X.Nkp r1 = r18.A0E()
            if (r1 == 0) goto L_0x0150
            java.lang.String r1 = r1.name()
            if (r1 == 0) goto L_0x0150
            r45 = r1
        L_0x0150:
            r41 = r13
            r42 = r4
            r43 = r19
            r44 = r0
            r52 = r9
            r53 = r7
            r41.A02(r42, r43, r44, r45, r46, r47, r48, r50, r52, r53)
            r0 = r16
            r0.add(r4)
        L_0x0164:
            r5 = r14
            goto L_0x0088
        L_0x0167:
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl$IgdMagicRemixLayout$Response$ForegroundImages> r24 = com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response.ForegroundImages.class
            r3 = -1318871329(0xffffffffb1639edf, float:-3.3123155E-9)
            r15 = 2
            java.lang.String r23 = "foreground_images"
            r2 = r24
            r1 = r18
            r0 = r23
            com.google.common.collect.ImmutableList r0 = r1.getRequiredCompactedTreeListField(r15, r0, r2, r3)
            java.util.Iterator r22 = r0.iterator()
        L_0x017d:
            boolean r0 = r22.hasNext()
            if (r0 == 0) goto L_0x023d
            java.lang.Object r3 = r22.next()
            int r21 = r7 + 1
            if (r7 < 0) goto L_0x0654
            X.3lr r3 = (X.C250663lr) r3
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl$IgdMagicRemixLayout$Response$ForegroundImages$PositionData> r2 = com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response.ForegroundImages.PositionData.class
            r1 = -531718080(0xffffffffe04ea040, float:-5.9555883E19)
            r8 = 0
            java.lang.String r0 = "position_data"
            X.3lr r0 = r3.getOptionalTreeField(r8, r0, r2, r1)
            if (r0 == 0) goto L_0x0239
            java.lang.String r14 = "width"
            double r3 = r0.getCoercedDoubleField(r9, r14)
            int r1 = r13.A01
            double r1 = (double) r1
            double r3 = r3 * r1
            java.lang.String r10 = "height"
            double r1 = r0.getCoercedDoubleField(r8, r10)
            int r5 = r13.A00
            double r5 = (double) r5
            double r1 = r1 * r5
            r12 = -617995249(0xffffffffdb2a240f, float:-4.7890393E16)
            r11 = r18
            r6 = r25
            r5 = r26
            com.google.common.collect.ImmutableList r5 = r11.getRequiredCompactedTreeListField(r9, r6, r5, r12)
            int r5 = r5.size()
            int r7 = r7 + r5
            android.content.Context r5 = r13.A04
            r12 = r5
            r5 = r42
            java.lang.Object r5 = r5.get(r7)
            com.instagram.common.gallery.Medium r5 = (com.instagram.common.gallery.Medium) r5
            int r6 = (int) r3
            r11 = r6
            int r6 = (int) r1
            java.lang.String r1 = "x"
            double r30 = r0.getCoercedDoubleField(r15, r1)
            r3 = 3
            java.lang.String r2 = "y"
            double r32 = r0.getCoercedDoubleField(r3, r2)
            double r34 = r0.getCoercedDoubleField(r9, r14)
            double r36 = r0.getCoercedDoubleField(r8, r10)
            r4 = 5
            java.lang.String r3 = "rotation"
            double r38 = r0.getCoercedDoubleField(r4, r3)
            X.9po r3 = new X.9po
            r27 = r3
            r28 = r12
            r29 = r5
            r40 = r11
            r41 = r6
            r27.<init>(r28, r29, r30, r32, r34, r36, r38, r40, r41)
            double r34 = r0.getCoercedDoubleField(r15, r1)
            r1 = 3
            double r36 = r0.getCoercedDoubleField(r1, r2)
            r0.getCoercedDoubleField(r9, r14)
            r0.getCoercedDoubleField(r8, r10)
            r0 = r42
            java.lang.Object r0 = r0.get(r7)
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            java.lang.String r0 = r0.A0X
            X.Nkp r1 = r18.A0E()
            if (r1 == 0) goto L_0x021f
            java.lang.String r31 = r1.name()
            if (r31 != 0) goto L_0x0221
        L_0x021f:
            r31 = r45
        L_0x0221:
            r27 = r13
            r28 = r3
            r29 = r19
            r30 = r0
            r32 = r46
            r33 = r47
            r38 = r15
            r39 = r9
            r27.A02(r28, r29, r30, r31, r32, r33, r34, r36, r38, r39)
            r0 = r16
            r0.add(r3)
        L_0x0239:
            r7 = r21
            goto L_0x017d
        L_0x023d:
            java.util.Calendar r10 = X.C361828gs.A00()
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl$IgdMagicRemixLayout$Response$Stickers> r4 = com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response.Stickers.class
            r3 = -777291604(0xffffffffd1ab78ac, float:-9.2057993E10)
            r2 = 3
            java.lang.String r1 = "stickers"
            r0 = r18
            com.google.common.collect.ImmutableList r0 = r0.getRequiredCompactedTreeListField(r2, r1, r4, r3)
            java.util.Iterator r14 = r0.iterator()
        L_0x0253:
            boolean r0 = r14.hasNext()
            r8 = r63
            if (r0 == 0) goto L_0x037f
            java.lang.Object r5 = r14.next()
            X.3lr r5 = (X.C250663lr) r5
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl$IgdMagicRemixLayout$Response$Stickers$PositionData> r2 = com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response.Stickers.PositionData.class
            r1 = 1524157116(0x5ad8cabc, float:3.05107519E16)
            r4 = 0
            java.lang.String r0 = "position_data"
            X.3lr r0 = r5.getOptionalTreeField(r4, r0, r2, r1)
            if (r0 == 0) goto L_0x0253
            X.9sk r2 = X.C391349sk.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r3 = 1
            java.lang.String r1 = "sticker_type"
            java.lang.Enum r2 = r5.getOptionalEnumField(r3, r1, r2)
            X.9sk r1 = X.C391349sk.DAY_OF_THE_WEEK
            if (r2 != r1) goto L_0x0253
            X.Kh1 r2 = r8.A00
            X.Kh1 r1 = X.C62511Kh1.WEEKDAY
            if (r2 == r1) goto L_0x0293
            java.lang.String r6 = r8.A04
            android.content.Context r2 = r13.A04
            r1 = 2131965733(0x7f133725, float:1.9568284E38)
            java.lang.String r1 = r2.getString(r1)
            boolean r1 = X.0qQ.A0K(r6, r1)
            if (r1 == 0) goto L_0x0253
        L_0x0293:
            X.0eP r1 = r8.A06
            java.lang.Object r1 = r1.A00
            long r1 = X.AnonymousClass7TE.A0R(r1)
            r10.setTimeInMillis(r1)
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl$IgdMagicRemixLayout$Response$Stickers$StickerBundleIds> r7 = com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response.Stickers.StickerBundleIds.class
            r6 = -1750171034(0xffffffff97ae8266, float:-1.1277404E-24)
            java.lang.String r2 = "sticker_bundle_ids"
            com.google.common.collect.ImmutableList r1 = r5.getRequiredCompactedTreeListField(r15, r2, r7, r6)
            int r8 = r1.size()
            r1 = 7
            int r1 = r10.get(r1)
            int r1 = r1 + -2
            int r1 = r1 + r8
            int r1 = r1 % r8
            com.google.common.collect.ImmutableList r2 = r5.getRequiredCompactedTreeListField(r15, r2, r7, r6)
            java.lang.Object r2 = r2.get(r1)
            X.3lr r2 = (X.C250663lr) r2
            java.lang.String r1 = "sticker_name"
            java.lang.String r27 = r2.getOptionalStringField(r4, r1)
            if (r27 == 0) goto L_0x0253
            java.lang.String r1 = "sticker_bundle_id"
            java.lang.String r26 = r2.getOptionalStringField(r3, r1)
            if (r26 == 0) goto L_0x0253
            java.lang.String r1 = "sticker_url"
            java.lang.String r2 = r2.getOptionalStringField(r15, r1)
            if (r2 == 0) goto L_0x0253
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl
            r1.<init>(r2)
            r28 = 1139802112(0x43f00000, float:480.0)
            r30 = 1065353216(0x3f800000, float:1.0)
            r25 = r1
            r29 = r28
            X.6o8 r7 = X.C317966o8.A00(r25, r26, r27, r28, r29, r30)
            X.6nz r1 = X.C317876nz.A0a
            java.util.List r6 = X.AnonymousClass7TE.A1I(r7)
            X.6oG r5 = X.C318046oG.GALLERY
            r1 = 151(0x97, float:2.12E-43)
            java.lang.String r2 = X.C273654mx.A00(r1)
            X.6nz r1 = new X.6nz
            r1.<init>(r5, r2, r6)
            com.instagram.common.session.UserSession r12 = r13.A02
            android.content.Context r11 = r13.A04
            java.lang.String r6 = r7.A0S
            X.6oG r32 = r1.A00()
            com.instagram.api.schemas.RingSpecImpl r5 = r1.A00
            X.3ID r2 = r1.A06
            X.8vI r27 = new X.8vI
            r28 = r11
            r29 = r5
            r30 = r12
            r31 = r7
            r33 = r2
            r34 = r6
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)
            java.lang.String r2 = "x"
            double r30 = r0.getCoercedDoubleField(r15, r2)
            r6 = 3
            java.lang.String r5 = "y"
            double r32 = r0.getCoercedDoubleField(r6, r5)
            java.lang.String r7 = "width"
            double r34 = r0.getCoercedDoubleField(r3, r7)
            java.lang.String r6 = "height"
            double r36 = r0.getCoercedDoubleField(r4, r6)
            r9 = 5
            java.lang.String r8 = "rotation"
            double r38 = r0.getCoercedDoubleField(r9, r8)
            X.9lt r8 = new X.9lt
            r25 = r8
            r26 = r11
            r28 = r12
            r29 = r1
            r25.<init>(r26, r27, r28, r29, r30, r32, r34, r36, r38)
            double r32 = r0.getCoercedDoubleField(r15, r2)
            r1 = 3
            double r34 = r0.getCoercedDoubleField(r1, r5)
            r0.getCoercedDoubleField(r3, r7)
            r0.getCoercedDoubleField(r4, r6)
            X.Nkp r0 = r18.A0E()
            if (r0 == 0) goto L_0x0363
            java.lang.String r29 = r0.name()
            if (r29 != 0) goto L_0x0365
        L_0x0363:
            r29 = r45
        L_0x0365:
            r25 = r13
            r26 = r8
            r27 = r19
            r28 = r45
            r30 = r46
            r31 = r47
            r36 = r15
            r37 = r4
            r25.A02(r26, r27, r28, r29, r30, r31, r32, r34, r36, r37)
            r0 = r16
            r0.add(r8)
            goto L_0x0253
        L_0x037f:
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl$IgdMagicRemixLayout$Response$Text> r3 = com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response.Text.class
            r2 = -809030976(0xffffffffcfc72ac0, float:-6.6829353E9)
            r4 = 4
            java.lang.String r1 = "text"
            r0 = r18
            com.google.common.collect.ImmutableList r0 = r0.getRequiredCompactedTreeListField(r4, r1, r3, r2)
            java.util.Iterator r22 = r0.iterator()
        L_0x0391:
            boolean r0 = r22.hasNext()
            if (r0 == 0) goto L_0x0439
            java.lang.Object r3 = r22.next()
            X.3lr r3 = (X.C250663lr) r3
            java.lang.Class<com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl$IgdMagicRemixLayout$Response$Text$PositionData> r2 = com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl.IgdMagicRemixLayout.Response.Text.PositionData.class
            r1 = -359087256(0xffffffffea98c368, float:-9.233975E25)
            java.lang.String r0 = "position_data"
            X.3lr r0 = r3.A04(r2, r0, r1)
            if (r0 == 0) goto L_0x0391
            android.text.Editable$Factory r1 = android.text.Editable.Factory.getInstance()
            java.lang.String r14 = r8.A04
            android.text.Editable r7 = r1.newEditable(r14)
            java.lang.String r2 = "DEFAULT"
            r1 = 0
            X.8bb r2 = X.C358878bc.A01(r2, r1, r1, r1, r1)
            X.0qQ.A0A(r7)
            X.AnonymousClass91Z.A00(r7, r2)
            android.content.Context r6 = r13.A04
            X.AnonymousClass91U.A02(r6, r7, r2)
            X.8bi r3 = r2.A06
            int r40 = r3.A00(r6)
            android.text.Spannable r3 = X.C306386Ly.A0d
            java.lang.String r5 = "x"
            double r30 = r0.getCoercedDoubleField(r1, r5)
            r3 = 1
            java.lang.String r10 = "y"
            double r32 = r0.getCoercedDoubleField(r3, r10)
            r3 = 5
            java.lang.String r11 = "width"
            double r34 = r0.getCoercedDoubleField(r3, r11)
            java.lang.String r9 = "height"
            double r36 = r0.getCoercedDoubleField(r4, r9)
            r21 = 3
            java.lang.String r12 = "rotation"
            r3 = r21
            double r38 = r0.getCoercedDoubleField(r3, r12)
            X.9qY r3 = new X.9qY
            r25 = r3
            r26 = r6
            r27 = r7
            r28 = r2
            r29 = r14
            r25.<init>(r26, r27, r28, r29, r30, r32, r34, r36, r38, r40)
            double r32 = r0.getCoercedDoubleField(r1, r5)
            r1 = 1
            double r34 = r0.getCoercedDoubleField(r1, r10)
            r1 = 5
            r0.getCoercedDoubleField(r1, r11)
            r0.getCoercedDoubleField(r4, r9)
            X.Nkp r0 = r18.A0E()
            if (r0 == 0) goto L_0x041d
            java.lang.String r29 = r0.name()
            if (r29 != 0) goto L_0x041f
        L_0x041d:
            r29 = r45
        L_0x041f:
            r37 = 1
            r25 = r13
            r26 = r3
            r27 = r19
            r28 = r45
            r30 = r46
            r31 = r47
            r36 = r21
            r25.A02(r26, r27, r28, r29, r30, r31, r32, r34, r36, r37)
            r0 = r16
            r0.add(r3)
            goto L_0x0391
        L_0x0439:
            r1 = 0
            X.8CA r34 = X.AnonymousClass8CA.NONE
            r0 = 0
            r25 = r1
            r26 = r1
            r27 = r1
            r28 = r1
            r29 = r1
            r30 = r1
            r31 = r1
            r32 = r1
            r33 = r1
            r35 = r1
            r36 = r1
            r37 = r1
            r38 = r1
            r39 = r0
            r40 = r0
            r41 = r0
            r42 = r0
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r3 = X.AnonymousClass8CB.A00(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            com.instagram.common.session.UserSession r2 = r13.A02
            r37 = r2
            X.AXb r6 = r13.A03
            X.88Y r5 = new X.88Y
            r59 = r61
            r4 = r59
            r5.<init>(r4, r6, r2)
            com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState r4 = r5.A01
            X.8pL r26 = new X.8pL
            r2 = r26
            r2.<init>(r4)
            r6 = -1318871329(0xffffffffb1639edf, float:-3.3123155E-9)
            r5 = r24
            r4 = r18
            r2 = r23
            com.google.common.collect.ImmutableList r2 = r4.getRequiredCompactedTreeListField(r15, r2, r5, r6)
            int r48 = r2.size()
            X.8pN r32 = new X.8pN
            r43 = r32
            r44 = r19
            r45 = r1
            r43.<init>(r44, r45, r46, r47, r48)
            X.8Od r6 = new X.8Od
            r6.<init>(r1)
            r2 = 6
            X.9IE r5 = new X.9IE
            r5.<init>((java.lang.Object) r3, (int) r2)
            r2 = 15000(0x3a98, float:2.102E-41)
            X.8pP r4 = new X.8pP
            r4.<init>()
            r4.A03 = r1
            r4.A02 = r1
            r4.A01 = r0
            r4.A00 = r2
            X.8pQ r2 = new X.8pQ
            r2.<init>()
            r2.A00 = r0
            X.8pR r25 = new X.8pR
            r27 = r25
            r28 = r5
            r29 = r6
            r30 = r2
            r31 = r4
            r34 = r1
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r54 = X.C364978mK.A00()
            X.0sl r24 = X.0sl.A00
            X.6Ma r2 = X.C306406Ma.A00
            java.util.ArrayList r23 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r22 = X.AnonymousClass7TF.A0s(r47)
        L_0x04d9:
            boolean r2 = r22.hasNext()
            if (r2 == 0) goto L_0x059d
            java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r22)
            java.lang.Object r12 = r2.getKey()
            android.graphics.drawable.Drawable r12 = (android.graphics.drawable.Drawable) r12
            java.lang.Object r11 = r2.getValue()
            X.8un r11 = (X.C369458un) r11
            X.3ui r10 = new X.3ui
            r10.<init>()
            X.6Ma r21 = X.C306406Ma.A00
            boolean r2 = r12 instanceof X.C41795B1a
            if (r2 == 0) goto L_0x0592
            r2 = r12
            X.B1a r2 = (X.C41795B1a) r2
            android.graphics.Rect r5 = r2.BIJ()
            int r2 = r5.width()
            float r9 = (float) r2
            int r2 = r5.height()
            float r8 = (float) r2
            float[] r7 = new float[r15]
            float r2 = r11.A01
            float r4 = r5.exactCenterX()
            float r2 = r2 + r4
            r7[r0] = r2
            float r2 = r11.A02
            float r4 = r5.exactCenterY()
            float r2 = r2 + r4
            r14 = 1
            r7[r14] = r2
            android.graphics.Matrix r6 = X.AnonymousClass7TE.A0U()
            float r5 = r11.A06
            float r4 = r11.A03
            float r2 = r11.A04
            r6.postScale(r5, r5, r4, r2)
            float r5 = r11.A05
            float r4 = r11.A03
            float r2 = r11.A04
            r6.postRotate(r5, r4, r2)
            r6.mapPoints(r7)
            r4 = r7[r0]
            r6 = r7[r14]
        L_0x053d:
            float r2 = r11.A06
            float r9 = r9 * r2
            r5 = 1144258560(0x44340000, float:720.0)
            float r9 = r9 / r5
            float r8 = r8 * r2
            float r8 = r8 / r5
            float r4 = r4 / r5
            float r6 = r6 / r5
            float r5 = r11.A05
            r2 = 1135869952(0x43b40000, float:360.0)
            float r5 = r5 / r2
            r10.A03 = r4
            r10.A04 = r6
            int r4 = r11.A09
            r2 = 1000000(0xf4240, float:1.401298E-39)
            int r4 = r4 * r2
            int r2 = r11.A0B
            int r4 = r4 + r2
            r10.A09 = r4
            r10.A02 = r9
            r10.A00 = r8
            r10.A01 = r5
            r10.A1t = r0
            r2 = r21
            android.graphics.drawable.Drawable r4 = r2.A0B(r12)
            boolean r2 = r4 instanceof X.C369908vW
            if (r2 == 0) goto L_0x04d9
            X.8vW r4 = (X.C369908vW) r4
            java.lang.String r6 = r4.A0G
            java.lang.String r2 = "rollcall_v2_photo_sticker"
            boolean r2 = X.0qQ.A0K(r6, r2)
            if (r2 == 0) goto L_0x058f
            java.lang.String r5 = "rollcall_v2_media_sticker"
        L_0x057b:
            int r2 = r11.A08
            java.lang.Integer.valueOf(r2)
            r10.A1i = r6
            r10.A1h = r5
            r10.A1l = r1
            r10.A1Y = r1
            r2 = r23
            r2.add(r10)
            goto L_0x04d9
        L_0x058f:
            java.lang.String r5 = "local_image_sticker"
            goto L_0x057b
        L_0x0592:
            int r2 = r11.A0A
            float r9 = (float) r2
            int r2 = r11.A07
            float r8 = (float) r2
            float r4 = r11.A03
            float r6 = r11.A04
            goto L_0x053d
        L_0x059d:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            int r6 = r19.size()
            r5 = 0
        L_0x05a6:
            if (r5 >= r6) goto L_0x05b7
            r4 = r19
            java.lang.Object r4 = r4.valueAt(r5)
            X.0qQ.A07(r4)
            r2.add(r4)
            int r5 = r5 + 1
            goto L_0x05a6
        L_0x05b7:
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r28 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r4 = r28
            r6 = r5
            r9 = r8
            r10 = r8
            r11 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            X.8Nz r33 = new X.8Nz
            r33.<init>()
            boolean r3 = r3.A0E
            java.util.ArrayList r40 = X.AnonymousClass7TE.A1C()
            java.util.LinkedHashMap r36 = X.AnonymousClass7TE.A1H()
            X.0sn r43 = X.0sn.A00
            java.lang.String r35 = "replayable"
            X.8PW r27 = new X.8PW
            r29 = r1
            r30 = r1
            r31 = r1
            r32 = r37
            r37 = r1
            r39 = r2
            r41 = r23
            r42 = r1
            r44 = r43
            r45 = r43
            r46 = r43
            r48 = r0
            r49 = r0
            r50 = r3
            r51 = r0
            r52 = r0
            r53 = r0
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            X.8pT r3 = new X.8pT
            r3.<init>(r0, r1)
            java.util.LinkedHashMap r55 = X.AnonymousClass7TE.A1H()
            X.8lx r2 = new X.8lx
            r48 = r2
            r49 = r1
            r50 = r1
            r51 = r1
            r52 = r3
            r53 = r27
            r56 = r1
            r57 = r0
            r58 = r0
            r48.<init>(r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            r1 = r25
            r0 = r26
            X.8pU r3 = X.AnonymousClass9U9.A00(r1, r2, r0)
            r0 = r20
            r0.A01 = r13
            r1 = r18
            r0.A02 = r1
            r0.A03 = r3
            r1 = 1
            r0.A00 = r1
            r2 = r59
            r1 = r16
            java.lang.Object r2 = A00(r2, r13, r1, r0)
            r0 = r17
            if (r2 != r0) goto L_0x0643
            return r17
        L_0x0643:
            r0 = r13
            goto L_0x0042
        L_0x0646:
            X.MED r20 = new X.MED
            r0 = r20
            r0.<init>(r13, r4, r3)
            goto L_0x0020
        L_0x064f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0654:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositor.A03(X.4DH, com.instagram.direct.request.graphql.IGDirectMediaRemixLayoutsResponseImpl$IgdMagicRemixLayout$Response, X.9bx, java.util.List, X.4D7):java.lang.Object");
    }

    public MagicMediaRemixContentCompositor(Context context, UserSession userSession) {
        this.A04 = context;
        this.A02 = userSession;
        int i = AnonymousClass7TF.A0E(context).widthPixels;
        this.A01 = i;
        this.A00 = (i * 16) / 9;
        this.A05 = C395099zD.A00(userSession);
    }
}
