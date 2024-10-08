package com.instagram.feed.media.flashmedia;

import X.00k;
import X.0qQ;
import X.0sL;
import X.0yU;
import X.14i;
import X.15Y;
import X.19B;
import X.19E;
import X.1Eo;
import X.1HR;
import X.1Xj;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0lh;
import X.AnonymousClass0vF;
import X.AnonymousClass0yP;
import X.AnonymousClass12U;
import X.AnonymousClass12V;
import X.AnonymousClass19S;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass93C;
import X.AnonymousClass93F;
import X.AnonymousClass9FV;
import X.AnonymousClass9FX;
import X.C249513ju;
import X.C249523jv;
import X.C262224Cq;
import X.C61110lV;
import X.C61610nw;
import X.G9w;
import X.JTP;
import X.LD9;
import X.MG8;
import X.MH0;
import X.MHE;
import X.MHF;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

public final class FlashMediaCacheImpl implements C61110lV, AnonymousClass93F, AnonymousClass0lh {
    public long A00 = 100;
    public final AnonymousClass12V A01;
    public final 14i A02;
    public final UserSession A03;
    public final AnonymousClass0vF A04;
    public final FlashMediaLocalDataSource A05;
    public final Map A06 = AnonymousClass7TE.A1H();
    public final Map A07 = AnonymousClass7TE.A1H();
    public final Map A08 = AnonymousClass7TE.A1H();
    public final C262224Cq A09;
    public final C249513ju A0A;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.LD9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.LD9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: X.LD9} */
    /* JADX WARNING: type inference failed for: r9v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r13, X.AnonymousClass9FX r14, X.AnonymousClass93C r15, X.AnonymousClass4D7 r16) {
        /*
            r10 = r13
            r13 = r14
            r2 = r15
            r4 = 20
            r5 = r16
            boolean r0 = X.ME0.A02(r4, r5)
            if (r0 == 0) goto L_0x00e8
            r9 = r5
            X.ME0 r9 = (X.ME0) r9
            int r3 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00e8
            int r3 = r3 - r1
            r9.A00 = r3
        L_0x001b:
            java.lang.Object r3 = r9.A05
            X.1Hj r12 = X.1Hj.A02
            int r0 = r9.A00
            r8 = 5
            r14 = 4
            r11 = 3
            r7 = 2
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0048
            if (r0 == r6) goto L_0x00ab
            if (r0 == r7) goto L_0x0039
            if (r0 == r11) goto L_0x0088
            if (r0 == r14) goto L_0x0039
            if (r0 != r8) goto L_0x00ef
            X.0eS.A00(r3)
        L_0x0036:
            X.0gF r12 = X.C60340gF.A00
            return r12
        L_0x0039:
            java.lang.Object r1 = r9.A03
            java.lang.Object r2 = r9.A02
            X.93C r2 = (X.AnonymousClass93C) r2
            java.lang.Object r10 = r9.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r10 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r10
            X.0eS.A00(r3)
            goto L_0x00cd
        L_0x0048:
            X.0eS.A00(r3)
            java.util.Map r0 = r10.A06
            boolean r0 = r0.containsKey(r15)
            if (r0 != 0) goto L_0x0036
            com.instagram.common.session.UserSession r0 = r10.A03
            X.LD9 r1 = new X.LD9
            r1.<init>(r0)
            long r3 = r10.A00
            r15 = 0
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0075
            if (r13 == 0) goto L_0x0067
            r13.DOP()
        L_0x0067:
            com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource r0 = r10.A05
            X.ME0.A00(r10, r2, r13, r1, r9)
            r9.A00 = r6
            java.lang.Object r3 = r0.A03(r2, r9, r3)
            if (r3 != r12) goto L_0x00be
            return r12
        L_0x0075:
            if (r13 == 0) goto L_0x007a
            r13.DOP()
        L_0x007a:
            com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource r0 = r10.A05
            X.ME0.A00(r10, r2, r13, r1, r9)
            r9.A00 = r11
            java.lang.Object r3 = r0.A02(r2, r9)
            if (r3 != r12) goto L_0x009b
            return r12
        L_0x0088:
            java.lang.Object r1 = r9.A04
            X.LD9 r1 = (X.LD9) r1
            java.lang.Object r13 = r9.A03
            X.9FX r13 = (X.AnonymousClass9FX) r13
            java.lang.Object r2 = r9.A02
            X.93C r2 = (X.AnonymousClass93C) r2
            java.lang.Object r10 = r9.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r10 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r10
            X.0eS.A00(r3)
        L_0x009b:
            java.util.Collection r3 = (java.util.Collection) r3
            if (r13 == 0) goto L_0x00a2
            r13.DOO()
        L_0x00a2:
            X.ME0.A00(r10, r2, r1, r5, r9)
            r9.A00 = r14
            r1.A00(r3)
            goto L_0x00cd
        L_0x00ab:
            java.lang.Object r1 = r9.A04
            X.LD9 r1 = (X.LD9) r1
            java.lang.Object r13 = r9.A03
            X.9FX r13 = (X.AnonymousClass9FX) r13
            java.lang.Object r2 = r9.A02
            X.93C r2 = (X.AnonymousClass93C) r2
            java.lang.Object r10 = r9.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r10 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r10
            X.0eS.A00(r3)
        L_0x00be:
            java.util.Collection r3 = (java.util.Collection) r3
            if (r13 == 0) goto L_0x00c5
            r13.DOO()
        L_0x00c5:
            X.ME0.A00(r10, r2, r1, r5, r9)
            r9.A00 = r7
            r1.A00(r3)
        L_0x00cd:
            java.util.Map r0 = r10.A06
            r0.put(r2, r1)
            java.util.Map r1 = r10.A07
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            r1.put(r2, r0)
            r9.A01 = r5
            r9.A02 = r5
            r9.A03 = r5
            r9.A00 = r8
            A06(r10, r2, r9)
            goto L_0x0036
        L_0x00e8:
            X.ME0 r9 = new X.ME0
            r9.<init>(r10, r5, r4)
            goto L_0x001b
        L_0x00ef:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaCacheImpl.A02(com.instagram.feed.media.flashmedia.FlashMediaCacheImpl, X.9FX, X.93C, X.4D7):java.lang.Object");
    }

    public final void A9J(AnonymousClass93C r10, List list, boolean z) {
        0qQ.A0B(r10, 0);
        C249513ju r2 = this.A0A;
        A07(AnonymousClass05K.A01, new MHE(r10, list, this, (AnonymousClass4D7) null, 24), this.A09, r2);
    }

    public final void B5y(AnonymousClass9FX r11, AnonymousClass9FV r12, AnonymousClass93C r13) {
        0qQ.A0B(r13, 0);
        C249513ju r2 = this.A0A;
        A07(AnonymousClass05K.A01, new MHF(r13, r11, r12, this, (AnonymousClass4D7) null, 46), this.A09, r2);
    }

    public final 1Xj E2E(AnonymousClass93C r3) {
        0qQ.A0B(r3, 0);
        LD9 ld9 = (LD9) this.A06.get(r3);
        if (ld9 != null) {
            return (1Xj) 00k.A0O(00k.A0a(ld9.A01), 0);
        }
        return null;
    }

    public final void EBM(AnonymousClass93C r10, List list) {
        0qQ.A0B(r10, 0);
        C249513ju r2 = this.A0A;
        A07(AnonymousClass05K.A01, new MHE(r10, list, this, (AnonymousClass4D7) null, 26), this.A09, r2);
    }

    public final void EDG(AnonymousClass93C r7) {
        0qQ.A0B(r7, 0);
        C249513ju r5 = this.A0A;
        A07(AnonymousClass05K.A01, new MH0((Object) r7, (Object) this, (AnonymousClass4D7) null, 14), this.A09, r5);
    }

    public final void EE4(1Xj r10, AnonymousClass93C r11) {
        AnonymousClass7TG.A1N(r11, r10);
        C249513ju r2 = this.A0A;
        C262224Cq r1 = this.A09;
        A07(AnonymousClass05K.A01, new MHE(r11, r10, this, (AnonymousClass4D7) null, 27), r1, r2);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.1Xj r7, com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r8, X.AnonymousClass93C r9, X.AnonymousClass4D7 r10) {
        /*
            r3 = 46
            boolean r0 = X.MED.A04(r3, r10)
            if (r0 == 0) goto L_0x006d
            r6 = r10
            X.MED r6 = (X.MED) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006d
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r6.A04
            X.1Hj r1 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 == r3) goto L_0x0043
            if (r0 != r4) goto L_0x0073
            java.lang.Object r9 = r6.A02
            java.lang.Object r2 = r6.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r2 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r2
            X.0eS.A00(r5)
        L_0x002d:
            java.util.Map r0 = r2.A07
            X.JTP.A1R(r9, r0, r3)
        L_0x0032:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0035:
            X.0eS.A00(r5)
            r0 = 0
            X.MED.A00(r8, r9, r7, r6, r3)
            java.lang.Object r0 = A02(r8, r0, r9, r6)
            if (r0 != r1) goto L_0x004e
            return r1
        L_0x0043:
            java.lang.Object r7 = r6.A03
            java.lang.Object r9 = r6.A02
            java.lang.Object r8 = r6.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r8 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r8
            X.0eS.A00(r5)
        L_0x004e:
            r2 = r8
            java.util.Map r0 = r8.A06
            java.lang.Object r1 = r0.get(r9)
            X.LD9 r1 = (X.LD9) r1
            if (r1 == 0) goto L_0x0032
            r6.A01 = r8
            r6.A02 = r9
            r0 = 0
            r6.A03 = r0
            r6.A00 = r4
            java.util.Set r0 = r1.A02
            r0.remove(r7)
            java.util.LinkedList r0 = r1.A01
            r0.remove(r7)
            goto L_0x002d
        L_0x006d:
            X.MED r6 = new X.MED
            r6.<init>(r8, r10, r3)
            goto L_0x0016
        L_0x0073:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaCacheImpl.A00(X.1Xj, com.instagram.feed.media.flashmedia.FlashMediaCacheImpl, X.93C, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r8, X.AnonymousClass9FX r9, X.AnonymousClass9FV r10, X.AnonymousClass93C r11, X.AnonymousClass4D7 r12) {
        /*
            r3 = 21
            boolean r0 = X.ME0.A02(r3, r12)
            if (r0 == 0) goto L_0x009c
            r6 = r12
            X.ME0 r6 = (X.ME0) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009c
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r6.A05
            X.1Hj r5 = X.1Hj.A02
            int r1 = r6.A00
            r7 = 3
            r4 = 2
            r0 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 == r0) goto L_0x003f
            if (r1 == r4) goto L_0x0059
            if (r1 != r7) goto L_0x00a3
            X.0eS.A00(r2)
        L_0x002a:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x002d:
            X.0eS.A00(r2)
            r9.DHz()
            X.ME0.A00(r8, r11, r9, r10, r6)
            r6.A00 = r0
            java.lang.Object r0 = A02(r8, r9, r11, r6)
            if (r0 != r5) goto L_0x0050
            return r5
        L_0x003f:
            java.lang.Object r10 = r6.A04
            java.lang.Object r9 = r6.A03
            X.9FX r9 = (X.AnonymousClass9FX) r9
            java.lang.Object r11 = r6.A02
            X.93C r11 = (X.AnonymousClass93C) r11
            java.lang.Object r8 = r6.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r8 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r8
            X.0eS.A00(r2)
        L_0x0050:
            X.ME0.A00(r8, r11, r9, r10, r6)
            r6.A00 = r4
            A06(r8, r11, r6)
            goto L_0x0068
        L_0x0059:
            java.lang.Object r10 = r6.A04
            java.lang.Object r9 = r6.A03
            X.9FX r9 = (X.AnonymousClass9FX) r9
            java.lang.Object r11 = r6.A02
            java.lang.Object r8 = r6.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r8 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r8
            X.0eS.A00(r2)
        L_0x0068:
            java.util.Map r0 = r8.A06
            java.lang.Object r0 = r0.get(r11)
            X.LD9 r0 = (X.LD9) r0
            if (r0 == 0) goto L_0x0098
            java.util.LinkedList r0 = r0.A01
            java.util.List r3 = X.00k.A0a(r0)
            r9.DHy()
            X.12V r0 = r8.A01
            X.12U r0 = (X.AnonymousClass12U) r0
            X.4CZ r2 = r0.A04
            r1 = 0
            X.Pfo r0 = new X.Pfo
            r0.<init>(r10, r3, r1, r4)
            r6.A01 = r9
            r6.A02 = r1
            r6.A03 = r1
            r6.A04 = r1
            r6.A00 = r7
            java.lang.Object r0 = X.1Eo.A00(r6, r2, r0)
            if (r0 != r5) goto L_0x002a
            return r5
        L_0x0098:
            r9.DHy()
            goto L_0x002a
        L_0x009c:
            X.ME0 r6 = new X.ME0
            r6.<init>(r8, r12, r3)
            goto L_0x0016
        L_0x00a3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaCacheImpl.A01(com.instagram.feed.media.flashmedia.FlashMediaCacheImpl, X.9FX, X.9FV, X.93C, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r7, X.AnonymousClass93C r8, java.util.List r9, X.AnonymousClass4D7 r10) {
        /*
            r3 = 44
            boolean r0 = X.MED.A04(r3, r10)
            if (r0 == 0) goto L_0x0068
            r6 = r10
            X.MED r6 = (X.MED) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0068
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r6.A04
            X.1Hj r1 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 == r3) goto L_0x0043
            if (r0 != r4) goto L_0x006e
            java.lang.Object r8 = r6.A02
            java.lang.Object r2 = r6.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r2 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r2
            X.0eS.A00(r5)
        L_0x002d:
            java.util.Map r0 = r2.A07
            X.JTP.A1R(r8, r0, r3)
        L_0x0032:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0035:
            X.0eS.A00(r5)
            r0 = 0
            X.MED.A00(r7, r8, r9, r6, r3)
            java.lang.Object r0 = A02(r7, r0, r8, r6)
            if (r0 != r1) goto L_0x0050
            return r1
        L_0x0043:
            java.lang.Object r9 = r6.A03
            java.util.Collection r9 = (java.util.Collection) r9
            java.lang.Object r8 = r6.A02
            java.lang.Object r7 = r6.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r7 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r7
            X.0eS.A00(r5)
        L_0x0050:
            r2 = r7
            java.util.Map r0 = r7.A06
            java.lang.Object r1 = r0.get(r8)
            X.LD9 r1 = (X.LD9) r1
            if (r1 == 0) goto L_0x0032
            r6.A01 = r7
            r6.A02 = r8
            r0 = 0
            r6.A03 = r0
            r6.A00 = r4
            r1.A00(r9)
            goto L_0x002d
        L_0x0068:
            X.MED r6 = new X.MED
            r6.<init>(r7, r10, r3)
            goto L_0x0016
        L_0x006e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaCacheImpl.A03(com.instagram.feed.media.flashmedia.FlashMediaCacheImpl, X.93C, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r6, X.AnonymousClass93C r7, X.AnonymousClass4D7 r8) {
        /*
            r3 = 32
            boolean r0 = X.C66145MDx.A02(r3, r8)
            if (r0 == 0) goto L_0x0064
            r5 = r8
            X.MDx r5 = (X.C66145MDx) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0064
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A03
            X.1Hj r1 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 == r2) goto L_0x0043
            if (r0 != r3) goto L_0x006a
            java.lang.Object r7 = r5.A02
            java.lang.Object r6 = r5.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r6 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r6
            X.0eS.A00(r4)
        L_0x002d:
            java.util.Map r0 = r6.A07
            X.JTP.A1R(r7, r0, r2)
        L_0x0032:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0035:
            X.0eS.A00(r4)
            r0 = 0
            X.C66145MDx.A00(r6, r7, r5, r2)
            java.lang.Object r0 = A02(r6, r0, r7, r5)
            if (r0 != r1) goto L_0x004c
            return r1
        L_0x0043:
            java.lang.Object r7 = r5.A02
            java.lang.Object r6 = r5.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r6 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r6
            X.0eS.A00(r4)
        L_0x004c:
            java.util.Map r0 = r6.A06
            java.lang.Object r1 = r0.get(r7)
            X.LD9 r1 = (X.LD9) r1
            if (r1 == 0) goto L_0x0032
            X.C66145MDx.A00(r6, r7, r5, r3)
            java.util.Set r0 = r1.A02
            r0.clear()
            java.util.LinkedList r0 = r1.A01
            r0.clear()
            goto L_0x002d
        L_0x0064:
            X.MDx r5 = new X.MDx
            r5.<init>(r6, r8, r3)
            goto L_0x0016
        L_0x006a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaCacheImpl.A04(com.instagram.feed.media.flashmedia.FlashMediaCacheImpl, X.93C, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f A[LOOP:0: B:18:0x0079->B:20:0x007f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r11, X.AnonymousClass4D7 r12) {
        /*
            r3 = 45
            boolean r0 = X.MED.A04(r3, r12)
            if (r0 == 0) goto L_0x009a
            r8 = r12
            X.MED r8 = (X.MED) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009a
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r8.A04
            X.1Hj r3 = X.1Hj.A02
            int r0 = r8.A00
            r2 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0064
            if (r0 == r4) goto L_0x006e
            if (r0 != r2) goto L_0x00a4
            java.lang.Object r6 = r8.A03
            java.lang.Object r1 = r8.A02
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r11 = r8.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r11 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r11
            X.0eS.A00(r5)
        L_0x0031:
            java.util.Map r4 = r11.A07
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            r4.put(r6, r0)
        L_0x003a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a1
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r1)
            java.lang.Object r6 = r0.getKey()
            X.93C r6 = (X.AnonymousClass93C) r6
            java.lang.Object r0 = r0.getValue()
            X.LD9 r0 = (X.LD9) r0
            com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource r5 = r11.A05
            java.util.LinkedList r0 = r0.A01
            java.util.List r7 = X.00k.A0a(r0)
            long r9 = r11.A00
            X.MED.A00(r11, r1, r6, r8, r2)
            java.lang.Object r0 = r5.A00(r6, r7, r8, r9)
            if (r0 != r3) goto L_0x0031
            return r3
        L_0x0064:
            X.0eS.A00(r5)
            java.util.Map r0 = r11.A06
            java.util.Iterator r1 = X.AnonymousClass7TF.A0u(r0)
            goto L_0x0079
        L_0x006e:
            java.lang.Object r1 = r8.A02
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r11 = r8.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r11 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r11
            X.0eS.A00(r5)
        L_0x0079:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0093
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r1)
            java.lang.Object r0 = r0.getKey()
            X.93C r0 = (X.AnonymousClass93C) r0
            r8.A01 = r11
            r8.A02 = r1
            r8.A00 = r4
            A06(r11, r0, r8)
            goto L_0x0079
        L_0x0093:
            java.util.Map r0 = r11.A06
            java.util.Iterator r1 = X.AnonymousClass7TF.A0u(r0)
            goto L_0x003a
        L_0x009a:
            X.MED r8 = new X.MED
            r8.<init>(r11, r12, r3)
            goto L_0x0016
        L_0x00a1:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x00a4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaCacheImpl.A05(com.instagram.feed.media.flashmedia.FlashMediaCacheImpl, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C60340gF A06(com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r9, X.AnonymousClass93C r10, X.AnonymousClass4D7 r11) {
        /*
            r4 = 31
            boolean r0 = X.C66145MDx.A02(r4, r11)
            if (r0 == 0) goto L_0x0096
            r3 = r11
            X.MDx r3 = (X.C66145MDx) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0096
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r3.A03
            int r1 = r3.A00
            r6 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r6) goto L_0x009d
            java.lang.Object r10 = r3.A02
            java.lang.Object r9 = r3.A01
            com.instagram.feed.media.flashmedia.FlashMediaCacheImpl r9 = (com.instagram.feed.media.flashmedia.FlashMediaCacheImpl) r9
            X.0eS.A00(r0)
        L_0x0028:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x0033
            java.util.Map r0 = r9.A07
            X.JTP.A1R(r10, r0, r6)
        L_0x0033:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0036:
            X.0eS.A00(r0)
            java.util.Map r0 = r9.A06
            java.lang.Object r8 = r0.get(r10)
            java.util.Map r0 = r9.A08
            java.lang.Object r7 = r0.get(r10)
            if (r8 == 0) goto L_0x0033
            if (r7 == 0) goto L_0x0033
            java.util.List r7 = (java.util.List) r7
            X.LD9 r8 = (X.LD9) r8
            X.C66145MDx.A00(r9, r10, r3, r6)
            java.util.LinkedList r5 = r8.A01
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r5.iterator()
        L_0x005a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0089
            java.lang.Object r2 = r3.next()
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L_0x006f
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x006f
            goto L_0x005a
        L_0x006f:
            java.util.Iterator r1 = r7.iterator()
        L_0x0073:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r1.next()
            X.1UV r0 = (X.1UV) r0
            boolean r0 = r0.apply(r2)
            if (r0 == 0) goto L_0x0073
            r4.add(r2)
            goto L_0x005a
        L_0x0089:
            java.util.Set r0 = r8.A02
            r0.removeAll(r4)
            r5.removeAll(r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            goto L_0x0028
        L_0x0096:
            X.MDx r3 = new X.MDx
            r3.<init>(r9, r11, r4)
            goto L_0x0016
        L_0x009d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaCacheImpl.A06(com.instagram.feed.media.flashmedia.FlashMediaCacheImpl, X.93C, X.4D7):X.0gF");
    }

    public static void A07(Integer num, 0sL r2, C262224Cq r3, C249523jv r4) {
        r4.FIG(1Eo.A03(num, 19B.A00, r2, r3));
    }

    public /* synthetic */ FlashMediaCacheImpl(UserSession userSession) {
        AnonymousClass0vF A0W = JTP.A0W(C61610nw.A00(), "FlashMediaCache");
        AnonymousClass12U r5 = new AnonymousClass12U(A0W);
        FlashMediaLocalDataSource flashMediaLocalDataSource = new FlashMediaLocalDataSource(userSession);
        14i r2 = 14i.A08;
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r2, 5);
        this.A03 = userSession;
        this.A04 = A0W;
        this.A01 = r5;
        this.A05 = flashMediaLocalDataSource;
        this.A02 = r2;
        AnonymousClass19S A022 = 19E.A02(r5.AOJ(622567384, 3));
        this.A09 = A022;
        1HR A0w = G9w.A0w();
        AnonymousClass7TE.A1Z(new MHE(A0w, (AnonymousClass4D7) null, 25), A022);
        this.A0A = A0w;
        14i.A04(15Y.A02, this, false, false);
        this.A00 = 0yU.A01(AnonymousClass0yP.A00(36598326862351542L));
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(-1396754146);
        C249513ju r5 = this.A0A;
        A07(AnonymousClass05K.A01, new MG8(this, (AnonymousClass4D7) null, 9), this.A09, r5);
        AnonymousClass0fD.A0A(454507660, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(1679664985, AnonymousClass0fD.A03(2147399967));
    }

    public final void onSessionWillEnd() {
        14i.A07(this);
    }
}
