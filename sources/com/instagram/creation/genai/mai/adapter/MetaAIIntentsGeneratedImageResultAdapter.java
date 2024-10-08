package com.instagram.creation.genai.mai.adapter;

public final class MetaAIIntentsGeneratedImageResultAdapter {
    public static final MetaAIIntentsGeneratedImageResultAdapter A00 = new Object();

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.common.session.UserSession r18, X.C62498Kgo r19, X.C356888Vp r20, X.AnonymousClass4D7 r21) {
        /*
            r17 = this;
            r3 = r20
            r1 = r19
            r6 = 49
            r7 = r21
            boolean r0 = X.C66146MDy.A02(r6, r7)
            if (r0 == 0) goto L_0x006e
            r5 = r7
            X.MDy r5 = (X.C66146MDy) r5
            int r4 = r5.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r2
            if (r0 == 0) goto L_0x006e
            int r4 = r4 - r2
            r5.A00 = r4
        L_0x001c:
            java.lang.Object r4 = r5.A03
            X.1Hj r2 = X.1Hj.A02
            int r0 = r5.A00
            r7 = 1
            if (r0 == 0) goto L_0x0059
            if (r0 != r7) goto L_0x00e9
            java.lang.Object r1 = r5.A02
            X.Kgo r1 = (X.C62498Kgo) r1
            java.lang.Object r3 = r5.A01
            X.8Vp r3 = (X.C356888Vp) r3
            X.0eS.A00(r4)
        L_0x0032:
            X.Kmv r4 = (X.C62819Kmv) r4
            boolean r0 = r4 instanceof X.C61925KRv
            if (r0 == 0) goto L_0x00d6
            X.KRv r4 = (X.C61925KRv) r4
            X.3LX r0 = r4.A00
            android.graphics.Bitmap r2 = r0.A01
            if (r2 == 0) goto L_0x00dd
            java.lang.Integer r4 = r3.A02
            r6 = 0
            int r5 = r4.intValue()
            if (r5 == r6) goto L_0x0079
            if (r5 == r7) goto L_0x0079
            r0 = 3
            if (r5 == r0) goto L_0x0076
            r0 = 4
            if (r5 == r0) goto L_0x0076
            r0 = 2
            if (r5 == r0) goto L_0x0076
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0059:
            X.0eS.A00(r4)
            java.lang.String r0 = r3.A06
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.DbS.A0V(r0)
            X.C66146MDy.A00(r3, r1, r5, r7)
            r4 = r18
            java.lang.Object r4 = com.instagram.genai.imageservice.download.GenAIImageDownloadUtil.A01(r4, r0, r5)
            if (r4 != r2) goto L_0x0032
            return r2
        L_0x006e:
            X.MDy r5 = new X.MDy
            r0 = r17
            r5.<init>(r0, r7, r6)
            goto L_0x001c
        L_0x0076:
            X.JZd r5 = X.C59809JZd.IMAGINE_ME
            goto L_0x007b
        L_0x0079:
            X.JZd r5 = X.C59809JZd.IMAGINE
        L_0x007b:
            X.Kgo r0 = X.C62498Kgo.LAUNCHED_FROM_MEMU_IN_FEED
            if (r1 == r0) goto L_0x00d3
            X.Kgo r0 = X.C62498Kgo.LAUNCHED_FROM_STORY_VIEWER
            if (r1 != r0) goto L_0x008d
            java.lang.String r0 = r3.A08
            if (r0 == 0) goto L_0x008d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00d3
        L_0x008d:
            int r0 = r5.ordinal()
            if (r0 == r6) goto L_0x00d0
            com.instagram.api.schemas.CameraTool r5 = com.instagram.api.schemas.CameraTool.IMAGINE_ME_WITH_META_AI_INTENT
        L_0x0095:
            java.lang.String r9 = r3.A07
            X.LFv r6 = r3.A00
            java.lang.String r10 = r3.A08
            java.lang.Integer r0 = r3.A03
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            if (r0 != r8) goto L_0x00cd
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x00a3:
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x00ca
            java.lang.String r11 = "EMU_FLASH"
        L_0x00ab:
            java.lang.String r12 = X.LKT.A00(r4)
            java.lang.String r14 = r3.A09
            java.lang.String r15 = r3.A0A
            java.lang.String r0 = r3.A0B
            X.LG4 r7 = r3.A01
            java.lang.String r13 = ""
            X.JuX r4 = new X.JuX
            r16 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.JwM r0 = new X.JwM
            r0.<init>((android.graphics.Bitmap) r2, (X.C60975JuX) r4, (X.C62498Kgo) r1)
            X.3Ih r2 = X.C41845B3m.A0d(r0)
            return r2
        L_0x00ca:
            java.lang.String r11 = "BASIC"
            goto L_0x00ab
        L_0x00cd:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x00a3
        L_0x00d0:
            com.instagram.api.schemas.CameraTool r5 = com.instagram.api.schemas.CameraTool.IMAGINE_WITH_META_AI_INTENT
            goto L_0x0095
        L_0x00d3:
            com.instagram.api.schemas.CameraTool r5 = com.instagram.api.schemas.CameraTool.MEMU_IN_FEED_WITH_MIMICRY
            goto L_0x0095
        L_0x00d6:
            boolean r0 = r4 instanceof X.C61924KRu
            if (r0 == 0) goto L_0x00e4
            X.Kg9 r0 = X.C62459Kg9.BITMAP_DOWNLOAD_ERROR
            goto L_0x00df
        L_0x00dd:
            X.Kg9 r0 = X.C62459Kg9.BITMAP_MISSING_INFO
        L_0x00df:
            X.5sO r2 = X.C41845B3m.A0c(r0)
            return r2
        L_0x00e4:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00e9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.genai.mai.adapter.MetaAIIntentsGeneratedImageResultAdapter.A00(com.instagram.common.session.UserSession, X.Kgo, X.8Vp, X.4D7):java.lang.Object");
    }
}
