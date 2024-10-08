package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.reels.profilecard.model.ProfileCardStickerModel;
import java.util.Map;

/* renamed from: X.9nH  reason: invalid class name and case insensitive filesystem */
public final class C388099nH extends AnonymousClass8D8 {
    public ProfileCardStickerModel A00;
    public final Integer A01 = AnonymousClass05K.A0P;
    public final Map A02;
    public final Context A03;
    public final UserSession A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C388099nH(android.content.Context r40, com.instagram.common.session.UserSession r41, X.AnonymousClass8BA r42, com.instagram.reels.profilecard.model.ProfileCardStickerModel r43, java.lang.String r44) {
        /*
            r39 = this;
            r1 = 1
            r11 = 0
            r0 = 0
            r13 = 111(0x6f, float:1.56E-43)
            r3 = r39
            r8 = r42
            r12 = r11
            r14 = r0
            r15 = r0
            r9 = r3
            r10 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r6 = r40
            r3.A03 = r6
            r4 = r41
            r3.A04 = r4
            r2 = r43
            r3.A00 = r2
            java.lang.Integer r2 = X.AnonymousClass05K.A0P
            r3.A01 = r2
            java.util.LinkedHashMap r9 = X.AnonymousClass7TE.A1H()
            r3.A02 = r9
            X.G2J r5 = X.G2J.A00
            java.lang.Class<X.FYZ> r2 = X.FYZ.class
            java.lang.Object r7 = r4.A01(r2, r5)
            X.FYZ r7 = (X.FYZ) r7
            com.instagram.reels.profilecard.model.ProfileCardStickerModel r2 = r3.A00
            java.lang.String r5 = r2.A01
            X.0qQ.A0B(r5, r0)
            java.util.Map r2 = r7.A00
            java.lang.Object r7 = r2.get(r5)
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            if (r7 == 0) goto L_0x00a9
            com.instagram.reels.profilecard.model.ProfileCardStickerModel r2 = r3.A00
            java.lang.String r2 = r2.A01
            X.Aek r5 = new X.Aek
            r5.<init>(r7, r2)
            X.6if r2 = r8.A1g
            if (r2 == 0) goto L_0x0052
            r2.get()
        L_0x0052:
            r2 = r44
            android.graphics.drawable.Drawable r8 = X.C39900AIi.A01(r6, r4, r5, r2)
            com.instagram.reels.profilecard.model.ProfileCardStickerModel r2 = r3.A00
            java.lang.String r2 = r2.A01
            java.util.List r2 = X.AnonymousClass7TE.A1I(r2)
            r9.put(r8, r2)
            java.util.Map r7 = r3.A04
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            r5 = 1056964608(0x3f000000, float:0.5)
            r2 = 1051260355(0x3ea8f5c3, float:0.33)
            X.8BG r10 = new X.8BG
            r10.<init>(r5, r2)
            r19 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.6b1 r9 = new X.6b1
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r20 = r19
            r21 = r19
            r22 = r19
            r23 = r19
            r24 = r0
            r25 = r1
            r26 = r0
            r27 = r1
            r28 = r0
            r29 = r0
            r30 = r0
            r31 = r0
            r32 = r1
            r33 = r1
            r34 = r1
            r35 = r1
            r36 = r1
            r37 = r0
            r38 = r0
            r9.<init>((X.AnonymousClass8BH) r10, (X.AnonymousClass8DA) r11, (X.C3510487j) r12, (java.lang.Integer) r13, (java.lang.Integer) r14, (java.lang.Integer) r15, (java.lang.Object) r16, (java.lang.String) r17, (java.util.List) r18, (float) r19, (float) r20, (float) r21, (float) r22, (float) r23, (int) r24, (boolean) r25, (boolean) r26, (boolean) r27, (boolean) r28, (boolean) r29, (boolean) r30, (boolean) r31, (boolean) r32, (boolean) r33, (boolean) r34, (boolean) r35, (boolean) r36, (boolean) r37, (boolean) r38)
            r7.put(r8, r9)
        L_0x00a9:
            com.instagram.reels.profilecard.model.ProfileCardStickerModel r2 = r3.A00
            java.lang.String r5 = r2.A02
            if (r5 == 0) goto L_0x015e
            r2 = 2131974494(0x7f13595e, float:1.9586054E38)
            java.lang.String r15 = r6.getString(r2)
            int r16 = X.AnonymousClass0nB.A01(r6)
            r12 = r6
            r13 = r4
            r14 = r5
            r17 = r1
            r18 = r1
            X.7w8 r6 = X.AAU.A01(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Iterable r2 = r6.A05()
            java.util.Iterator r8 = r2.iterator()
            r7 = 0
        L_0x00ce:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x00fb
            java.lang.Object r4 = r8.next()
            if (r7 >= 0) goto L_0x00e2
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00e2:
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
            boolean r2 = r4 instanceof X.C300635xX
            if (r2 == 0) goto L_0x00f9
            X.5xX r4 = (X.C300635xX) r4
            if (r4 == 0) goto L_0x00f9
            java.lang.String r4 = r4.A0Y
        L_0x00ee:
            java.lang.String r2 = "link_sticker_redesign_subtle"
            boolean r2 = X.0qQ.A0K(r4, r2)
            if (r2 != 0) goto L_0x00fc
            int r7 = r7 + 1
            goto L_0x00ce
        L_0x00f9:
            r4 = r11
            goto L_0x00ee
        L_0x00fb:
            r7 = -1
        L_0x00fc:
            java.util.List r2 = r6.A08
            int r4 = r2.size()
            X.2HY r2 = new X.2HY
            r2.<init>(r0, r4)
            int r2 = X.C229632nm.A05(r2, r7)
            r6.A0B(r2)
            java.util.Map r4 = r3.A02
            java.util.List r2 = X.AnonymousClass7TE.A1I(r5)
            r4.put(r6, r2)
            java.util.Map r5 = r3.A04
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            r4 = 1056964608(0x3f000000, float:0.5)
            r2 = 1062836634(0x3f59999a, float:0.85)
            X.8BG r10 = new X.8BG
            r10.<init>(r4, r2)
            r19 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.6b1 r9 = new X.6b1
            r12 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r20 = r19
            r21 = r19
            r22 = r19
            r23 = r19
            r24 = r0
            r25 = r0
            r26 = r0
            r27 = r1
            r28 = r1
            r29 = r0
            r30 = r0
            r31 = r0
            r32 = r1
            r33 = r1
            r34 = r1
            r35 = r1
            r36 = r1
            r37 = r0
            r38 = r0
            r9.<init>((X.AnonymousClass8BH) r10, (X.AnonymousClass8DA) r11, (X.C3510487j) r12, (java.lang.Integer) r13, (java.lang.Integer) r14, (java.lang.Integer) r15, (java.lang.Object) r16, (java.lang.String) r17, (java.util.List) r18, (float) r19, (float) r20, (float) r21, (float) r22, (float) r23, (int) r24, (boolean) r25, (boolean) r26, (boolean) r27, (boolean) r28, (boolean) r29, (boolean) r30, (boolean) r31, (boolean) r32, (boolean) r33, (boolean) r34, (boolean) r35, (boolean) r36, (boolean) r37, (boolean) r38)
            r5.put(r6, r9)
        L_0x015e:
            com.instagram.reels.profilecard.model.ProfileCardStickerModel r2 = r3.A00
            com.instagram.music.common.model.MusicOverlayStickerModel r6 = r2.A00
            if (r6 == 0) goto L_0x01b8
            android.content.Context r5 = r3.A03
            X.6KJ r2 = X.AnonymousClass6KJ.MUSIC_ONLY
            X.Af0 r4 = new X.Af0
            r4.<init>(r6, r11, r2, r0)
            com.instagram.common.session.UserSession r2 = r3.A04
            android.graphics.drawable.Drawable r5 = X.AIN.A00(r5, r2, r4, r1)
            java.util.Map r4 = r3.A02
            java.lang.String r2 = r6.A0b
            java.util.List r2 = X.AnonymousClass7TE.A1I(r2)
            r4.put(r5, r2)
            java.util.Map r2 = r3.A04
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            r16 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.6b1 r6 = new X.6b1
            r7 = r11
            r8 = r11
            r9 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r17 = r16
            r18 = r16
            r19 = r16
            r20 = r16
            r21 = r0
            r22 = r0
            r23 = r0
            r24 = r1
            r25 = r1
            r26 = r0
            r27 = r0
            r28 = r0
            r29 = r1
            r30 = r1
            r31 = r1
            r32 = r1
            r33 = r1
            r34 = r0
            r35 = r0
            r6.<init>((X.AnonymousClass8BH) r7, (X.AnonymousClass8DA) r8, (X.C3510487j) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (java.lang.Integer) r12, (java.lang.Object) r13, (java.lang.String) r14, (java.util.List) r15, (float) r16, (float) r17, (float) r18, (float) r19, (float) r20, (int) r21, (boolean) r22, (boolean) r23, (boolean) r24, (boolean) r25, (boolean) r26, (boolean) r27, (boolean) r28, (boolean) r29, (boolean) r30, (boolean) r31, (boolean) r32, (boolean) r33, (boolean) r34, (boolean) r35)
            r2.put(r5, r6)
        L_0x01b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C388099nH.<init>(android.content.Context, com.instagram.common.session.UserSession, X.8BA, com.instagram.reels.profilecard.model.ProfileCardStickerModel, java.lang.String):void");
    }
}
