package com.instagram.stickersearch;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C317846nw;
import X.C317866ny;
import X.C60340gF;
import X.C61082JwK;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.stickersearch.AvatarStickerInteractor$fetchFromNetworkRespository$1", f = "AvatarStickerInteractor.kt", i = {4, 5}, l = {126, 125, 135, 135, 142, 140, 160, 158, 176, 174}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
public final class AvatarStickerInteractor$fetchFromNetworkRespository$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ C61082JwK A03;
    public final /* synthetic */ C317846nw A04;
    public final /* synthetic */ C317866ny A05;
    public final /* synthetic */ AvatarStickerInteractor A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerInteractor$fetchFromNetworkRespository$1(C61082JwK jwK, C317846nw r3, C317866ny r4, AvatarStickerInteractor avatarStickerInteractor, Integer num, Integer num2, String str, String str2, AnonymousClass4D7 r10, boolean z, boolean z2) {
        super(2, r10);
        this.A06 = avatarStickerInteractor;
        this.A0A = str;
        this.A0B = z;
        this.A05 = r4;
        this.A04 = r3;
        this.A07 = num;
        this.A08 = num2;
        this.A03 = jwK;
        this.A09 = str2;
        this.A0C = z2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.stickersearch.AvatarStickerInteractor$fetchFromNetworkRespository$1] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        AvatarStickerInteractor avatarStickerInteractor = this.A06;
        String str = this.A0A;
        boolean z = this.A0B;
        C317866ny r3 = this.A05;
        ? avatarStickerInteractor$fetchFromNetworkRespository$1 = new AvatarStickerInteractor$fetchFromNetworkRespository$1(this.A03, this.A04, r3, avatarStickerInteractor, this.A07, this.A08, str, this.A09, r14, z, this.A0C);
        avatarStickerInteractor$fetchFromNetworkRespository$1.A02 = obj;
        return avatarStickerInteractor$fetchFromNetworkRespository$1;
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.4D7, com.instagram.stickersearch.AvatarStickerInteractor$fetchFromNetworkRespository$1] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        r5 = (X.C239803Ii) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
        if ((r5 instanceof X.C239793Ih) == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        r4 = (X.C61294K1h) ((X.C239793Ih) r5).A00;
        r4.A09 = false;
        r5 = X.C41845B3m.A0d(new X.C62093KZx(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009e, code lost:
        if ((r5 instanceof X.C239793Ih) == false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a0, code lost:
        r5 = ((X.C239793Ih) r5).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a4, code lost:
        r14.A02 = null;
        r2 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        if ((r5 instanceof X.C297815sO) == false) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ae, code lost:
        r5 = new X.C62092KZw(X.JTP.A0N(r5).A01());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00be, code lost:
        if ((r5 instanceof X.C297815sO) != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c4, code lost:
        throw X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0110, code lost:
        r14.A02 = null;
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011f, code lost:
        r5 = (X.C239803Ii) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0123, code lost:
        if ((r5 instanceof X.C239793Ih) == false) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0125, code lost:
        r5 = (X.C61294K1h) ((X.C239793Ih) r5).A00;
        r5.A09 = true;
        r5 = X.C41845B3m.A0d(new X.C62093KZx(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0138, code lost:
        if ((r5 instanceof X.C239793Ih) == false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013a, code lost:
        r4 = ((X.C239793Ih) r5).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013e, code lost:
        r14.A02 = r6;
        r14.A01 = null;
        r14.A00 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0149, code lost:
        if (r0.emit(r4, r14) == r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014b, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014f, code lost:
        if ((r5 instanceof X.C297815sO) == false) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0151, code lost:
        r2 = new X.1XQ();
        r2.A09 = true;
        r4 = new X.C62093KZx(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0160, code lost:
        if ((r5 instanceof X.C297815sO) != false) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0166, code lost:
        throw X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016d, code lost:
        r4 = r14.A06.A03;
        r9 = X.AnonymousClass05K.A01;
        r8 = r14.A05;
        r7 = r14.A04;
        r10 = r14.A07;
        r11 = r14.A08;
        r6 = r14.A03;
        r12 = r14.A09;
        r14.A02 = r0;
        r14.A00 = 7;
        r5 = r4.A02.A00(r6, r7, r8, r9, r10, r11, r12, (java.lang.String) null, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018a, code lost:
        if (r5 != r1) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x018c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0193, code lost:
        r5 = (X.C239803Ii) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0197, code lost:
        if ((r5 instanceof X.C239793Ih) == false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0199, code lost:
        r4 = (X.C61294K1h) ((X.C239793Ih) r5).A00;
        r4.A09 = false;
        r5 = X.C41845B3m.A0d(new X.C62093KZx(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ac, code lost:
        if ((r5 instanceof X.C239793Ih) == false) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ae, code lost:
        r5 = ((X.C239793Ih) r5).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b2, code lost:
        r14.A02 = null;
        r2 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b9, code lost:
        if ((r5 instanceof X.C297815sO) == false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01bb, code lost:
        r5 = new X.C62092KZw(X.JTP.A0N(r5).A01());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01cb, code lost:
        if ((r5 instanceof X.C297815sO) != false) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d1, code lost:
        throw X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d8, code lost:
        r14.A02 = null;
        r2 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01db, code lost:
        r14.A00 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e1, code lost:
        if (r0.emit(r5, r14) != r1) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e3, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e8, code lost:
        throw X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ed, code lost:
        throw X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01f2, code lost:
        throw X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r5 = r24
            X.1Hj r1 = X.1Hj.A02
            r14 = r23
            int r0 = r14.A00
            r4 = 1
            r3 = 0
            r13 = 0
            switch(r0) {
                case 0: goto L_0x0014;
                case 1: goto L_0x010a;
                case 2: goto L_0x000e;
                case 3: goto L_0x01d2;
                case 4: goto L_0x000e;
                case 5: goto L_0x0115;
                case 6: goto L_0x0167;
                case 7: goto L_0x018d;
                case 8: goto L_0x000e;
                case 9: goto L_0x007f;
                default: goto L_0x000e;
            }
        L_0x000e:
            X.0eS.A00(r5)
        L_0x0011:
            X.0gF r1 = X.C60340gF.A00
        L_0x0013:
            return r1
        L_0x0014:
            X.0eS.A00(r5)
            java.lang.Object r0 = r14.A02
            X.02o r0 = (X.02o) r0
            com.instagram.stickersearch.AvatarStickerInteractor r15 = r14.A06
            X.6oJ r2 = r15.A03
            java.lang.String r7 = r14.A0A
            X.0qQ.A0B(r7, r3)
            X.26t r5 = r2.A01
            X.0xa r6 = r5.A00
            java.lang.String r5 = "KEY_FORCE_CACHE_REQUEST"
            java.lang.String r5 = X.002.A0R(r5, r7)
            boolean r5 = r6.getBoolean(r5, r3)
            if (r5 != 0) goto L_0x00e2
            boolean r5 = r14.A0B
            if (r5 != 0) goto L_0x00e2
            boolean r5 = r14.A0C
            if (r5 == 0) goto L_0x005a
            X.6ny r6 = r14.A05
            X.6nw r5 = r14.A04
            X.JwK r4 = r14.A03
            java.lang.Integer r3 = r14.A08
            r14.A02 = r0
            r2 = 3
            r14.A00 = r2
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r3
            r20 = r14
            java.lang.Object r5 = r15.A02(r16, r17, r18, r19, r20)
            if (r5 != r1) goto L_0x01d8
            return r1
        L_0x005a:
            java.lang.Integer r10 = r14.A07
            if (r10 == 0) goto L_0x00c5
            int r5 = r10.intValue()
            if (r5 == 0) goto L_0x00c5
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            X.6ny r8 = r14.A05
            X.6nw r7 = r14.A04
            java.lang.Integer r11 = r14.A08
            X.JwK r6 = r14.A03
            java.lang.String r12 = r14.A09
            r14.A02 = r0
            r4 = 9
            r14.A00 = r4
            X.6oK r5 = r2.A02
            java.lang.Object r5 = r5.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r5 != r1) goto L_0x0085
            return r1
        L_0x007f:
            java.lang.Object r0 = r14.A02
            X.02o r0 = X.JTO.A1H(r0, r5)
        L_0x0085:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r2 = r5 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x00bc
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r4 = r5.A00
            X.K1h r4 = (X.C61294K1h) r4
            r4.A09 = r3
            X.KZx r2 = new X.KZx
            r2.<init>(r4)
            X.3Ih r5 = X.C41845B3m.A0d(r2)
        L_0x009c:
            boolean r2 = r5 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x00aa
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r5 = r5.A00
        L_0x00a4:
            r14.A02 = r13
            r2 = 10
            goto L_0x01db
        L_0x00aa:
            boolean r2 = r5 instanceof X.C297815sO
            if (r2 == 0) goto L_0x01e4
            X.4dm r2 = X.JTP.A0N(r5)
            java.lang.Throwable r2 = r2.A01()
            X.KZw r5 = new X.KZw
            r5.<init>(r2)
            goto L_0x00a4
        L_0x00bc:
            boolean r2 = r5 instanceof X.C297815sO
            if (r2 != 0) goto L_0x009c
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00c5:
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
            X.6ny r8 = r14.A05
            X.6nw r7 = r14.A04
            java.lang.Integer r11 = r14.A08
            X.JwK r6 = r14.A03
            java.lang.String r12 = r14.A09
            r14.A02 = r0
            r14.A01 = r0
            r5 = 5
            r14.A00 = r5
            X.6oK r5 = r2.A02
            java.lang.Object r5 = r5.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r5 == r1) goto L_0x0013
            r6 = r0
            goto L_0x011f
        L_0x00e2:
            r2.A00(r3, r7)
            X.6ny r8 = r14.A05
            X.6nw r7 = r14.A04
            java.lang.Integer r6 = r14.A07
            java.lang.Integer r5 = r14.A08
            X.JwK r3 = r14.A03
            java.lang.String r2 = r14.A09
            r14.A02 = r0
            r14.A00 = r4
            r16 = r3
            r17 = r7
            r18 = r8
            r19 = r6
            r20 = r5
            r21 = r2
            r22 = r14
            java.lang.Object r5 = r15.A01(r16, r17, r18, r19, r20, r21, r22)
            if (r5 != r1) goto L_0x0110
            return r1
        L_0x010a:
            java.lang.Object r0 = r14.A02
            X.02o r0 = X.JTO.A1H(r0, r5)
        L_0x0110:
            r14.A02 = r13
            r2 = 2
            goto L_0x01db
        L_0x0115:
            java.lang.Object r0 = r14.A01
            X.02o r0 = (X.02o) r0
            java.lang.Object r2 = r14.A02
            X.02o r6 = X.JTO.A1H(r2, r5)
        L_0x011f:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r2 = r5 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x015e
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r5 = r5.A00
            X.K1h r5 = (X.C61294K1h) r5
            r5.A09 = r4
            X.KZx r2 = new X.KZx
            r2.<init>(r5)
            X.3Ih r5 = X.C41845B3m.A0d(r2)
        L_0x0136:
            boolean r2 = r5 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x014d
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r4 = r5.A00
        L_0x013e:
            r14.A02 = r6
            r14.A01 = r13
            r2 = 6
            r14.A00 = r2
            java.lang.Object r0 = r0.emit(r4, r14)
            if (r0 == r1) goto L_0x0013
            r0 = r6
            goto L_0x016d
        L_0x014d:
            boolean r2 = r5 instanceof X.C297815sO
            if (r2 == 0) goto L_0x01e9
            X.K1h r2 = new X.K1h
            r2.<init>()
            r2.A09 = r4
            X.KZx r4 = new X.KZx
            r4.<init>(r2)
            goto L_0x013e
        L_0x015e:
            boolean r2 = r5 instanceof X.C297815sO
            if (r2 != 0) goto L_0x0136
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0167:
            java.lang.Object r0 = r14.A02
            X.02o r0 = X.JTO.A1H(r0, r5)
        L_0x016d:
            com.instagram.stickersearch.AvatarStickerInteractor r2 = r14.A06
            X.6oJ r4 = r2.A03
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            X.6ny r8 = r14.A05
            X.6nw r7 = r14.A04
            java.lang.Integer r10 = r14.A07
            java.lang.Integer r11 = r14.A08
            X.JwK r6 = r14.A03
            java.lang.String r12 = r14.A09
            r14.A02 = r0
            r2 = 7
            r14.A00 = r2
            X.6oK r5 = r4.A02
            java.lang.Object r5 = r5.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r5 != r1) goto L_0x0193
            return r1
        L_0x018d:
            java.lang.Object r0 = r14.A02
            X.02o r0 = X.JTO.A1H(r0, r5)
        L_0x0193:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r2 = r5 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x01c9
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r4 = r5.A00
            X.K1h r4 = (X.C61294K1h) r4
            r4.A09 = r3
            X.KZx r2 = new X.KZx
            r2.<init>(r4)
            X.3Ih r5 = X.C41845B3m.A0d(r2)
        L_0x01aa:
            boolean r2 = r5 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x01b7
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r5 = r5.A00
        L_0x01b2:
            r14.A02 = r13
            r2 = 8
            goto L_0x01db
        L_0x01b7:
            boolean r2 = r5 instanceof X.C297815sO
            if (r2 == 0) goto L_0x01ee
            X.4dm r2 = X.JTP.A0N(r5)
            java.lang.Throwable r2 = r2.A01()
            X.KZw r5 = new X.KZw
            r5.<init>(r2)
            goto L_0x01b2
        L_0x01c9:
            boolean r2 = r5 instanceof X.C297815sO
            if (r2 != 0) goto L_0x01aa
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01d2:
            java.lang.Object r0 = r14.A02
            X.02o r0 = X.JTO.A1H(r0, r5)
        L_0x01d8:
            r14.A02 = r13
            r2 = 4
        L_0x01db:
            r14.A00 = r2
            java.lang.Object r0 = r0.emit(r5, r14)
            if (r0 != r1) goto L_0x0011
            return r1
        L_0x01e4:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01e9:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01ee:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.AvatarStickerInteractor$fetchFromNetworkRespository$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerInteractor$fetchFromNetworkRespository$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
