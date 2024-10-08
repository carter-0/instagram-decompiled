package X;

import android.util.SparseArray;
import java.util.List;
import java.util.Map;

/* renamed from: X.8pN  reason: invalid class name and case insensitive filesystem */
public final class C366608pN {
    public int A00;
    public boolean A01 = true;
    public final SparseArray A02;
    public final C366618pO A03;
    public final List A04;
    public final Map A05;

    public static void A01(SparseArray sparseArray, SparseArray sparseArray2) {
        for (int i = 0; i < sparseArray2.size(); i++) {
            sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.Af1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.Af1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.Af1} */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007b, code lost:
        if ((r12 instanceof X.C369948va) == false) goto L_0x007d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r19, com.instagram.common.session.UserSession r20, X.C279284yO r21, X.C3499482o r22, X.C366608pN r23, X.C349327zy r24, com.instagram.music.common.model.MusicOverlayStickerModel r25, java.lang.String r26, int r27, int r28) {
        /*
            r0 = r24
            X.50v r9 = r0.A02
            boolean r0 = r9 instanceof X.C349337zz
            if (r0 == 0) goto L_0x002a
            r5 = r25
            if (r25 == 0) goto L_0x002a
            X.7zz r9 = (X.C349337zz) r9
            r0 = 0
            X.0qQ.A0B(r9, r0)
            boolean r0 = r9 instanceof X.Af0
            if (r0 == 0) goto L_0x00a0
            X.Af0 r9 = (X.Af0) r9
            X.6KJ r2 = r9.A03
            int r1 = r9.A00
            X.Aen r0 = r9.A02
            X.Af0 r3 = new X.Af0
            r3.<init>(r5, r0, r2, r1)
            boolean r0 = r9.A04
            r3.A04 = r0
        L_0x0027:
            X.50v r3 = (X.C2802350v) r3
            r9 = r3
        L_0x002a:
            if (r9 == 0) goto L_0x009f
            r13 = 0
            r5 = r19
            X.0qQ.A0B(r5, r13)
            r0 = 3
            r6 = r20
            X.0qQ.A0B(r6, r0)
            r8 = 0
            r7 = r21
            r12 = r26
            r10 = r8
            r11 = r8
            android.graphics.drawable.Drawable r12 = X.C39900AIi.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r20 = 1
            java.lang.String r19 = "TextOverlayController"
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r9
            r18 = r8
            r21 = r20
            X.6b1 r2 = X.C39900AIi.A03(r14, r15, r16, r17, r18, r19, r20, r21)
            X.8BH r1 = r2.A06
            r1.getClass()
            java.util.List r0 = java.util.Collections.emptyList()
            r4 = r27
            r3 = r28
            r1.A02(r12, r0, r4, r3)
            r1 = r23
            int r0 = r1.A00
            int r14 = r0 + 1
            r1.A00 = r14
            boolean r15 = X.C306406Ma.A0A(r12)
            boolean r0 = r22.A0A()
            if (r0 == 0) goto L_0x007d
            boolean r0 = r12 instanceof X.C369948va
            r16 = 1
            if (r0 != 0) goto L_0x007f
        L_0x007d:
            r16 = 0
        L_0x007f:
            X.0qQ.A0B(r12, r13)
            X.9Qs r10 = new X.9Qs
            r11 = r5
            r13 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.AEV.A00(r2, r10)
            java.util.List r0 = r1.A04
            r0.getClass()
            r0.add(r10)
            android.util.SparseArray r2 = r1.A02
            int r1 = r10.A0g
            X.4nO r0 = r9.BkW()
            r2.put(r1, r0)
        L_0x009f:
            return
        L_0x00a0:
            boolean r0 = r9 instanceof X.Af1
            if (r0 == 0) goto L_0x00c4
            X.Af1 r9 = (X.Af1) r9
            X.6KJ r7 = r9.BV4()
            X.9SE r4 = r9.A01
            if (r4 == 0) goto L_0x00ba
            int r0 = r9.A00
            X.Aen r6 = r9.A03
            X.Af1 r3 = new X.Af1
            r8 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x0027
        L_0x00ba:
            java.lang.String r0 = "musicAssetLyrics"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x00c4:
            java.lang.String r0 = "Not a music sticker model"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C366608pN.A00(android.content.Context, com.instagram.common.session.UserSession, X.4yO, X.82o, X.8pN, X.7zy, com.instagram.music.common.model.MusicOverlayStickerModel, java.lang.String, int, int):void");
    }

    public static void A02(C366608pN r2, C366608pN r3) {
        List list = r3.A04;
        if (!AnonymousClass3S1.A04(list)) {
            List list2 = r2.A04;
            list2.getClass();
            list2.addAll(list);
        }
        A01(r2.A02, r3.A02);
        Map map = r3.A05;
        if (map != null) {
            Map map2 = r2.A05;
            map2.getClass();
            map2.putAll(map);
        }
        r2.A00 = r3.A00;
    }

    public C366608pN(SparseArray sparseArray, C366618pO r3, List list, Map map, int i) {
        this.A04 = list;
        this.A02 = sparseArray;
        this.A05 = map;
        this.A00 = i;
        this.A03 = r3;
    }
}
