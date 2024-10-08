package X;

import com.instagram.common.gallery.Medium;
import java.util.HashMap;

/* renamed from: X.Aou  reason: case insensitive filesystem */
public final /* synthetic */ class C41134Aou implements Runnable {
    public final /* synthetic */ Medium A00;
    public final /* synthetic */ AnonymousClass8BA A01;
    public final /* synthetic */ HashMap A02;

    public /* synthetic */ C41134Aou(Medium medium, AnonymousClass8BA r2, HashMap hashMap) {
        this.A01 = r2;
        this.A02 = hashMap;
        this.A00 = medium;
    }

    /* JADX WARNING: type inference failed for: r11v9, types: [java.lang.Object, X.9lz] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x014b, code lost:
        if (r1 == false) goto L_0x014e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r1 = r23
            X.8BA r0 = r1.A01
            java.util.HashMap r3 = r1.A02
            com.instagram.common.gallery.Medium r6 = r1.A00
            if (r3 == 0) goto L_0x011c
            android.content.Context r4 = X.AnonymousClass7TE.A0T(r0)
            java.lang.String r7 = r6.A0X
            int r8 = r6.A0B
            int r9 = r6.A04
            int r5 = r6.A07
            r2 = 1061158912(0x3f400000, float:0.75)
            r1 = 90
            if (r5 == r1) goto L_0x0107
            r1 = 270(0x10e, float:3.78E-43)
            if (r5 == r1) goto L_0x0107
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r1 = r0.A0z
            int r1 = X.AnonymousClass81W.A00(r1)
            float r1 = (float) r1
            int r10 = X.AnonymousClass7TE.A05(r1, r2)
            float r5 = (float) r10
            float r1 = (float) r8
            float r5 = r5 / r1
            float r1 = (float) r9
            int r11 = X.AnonymousClass7TE.A05(r5, r1)
        L_0x0033:
            int r12 = r6.A07
            r1 = 0
            r13 = r1
            android.graphics.Bitmap r5 = X.1MF.A0G(r7, r8, r9, r10, r11, r12, r13)
            r6 = 3108(0xc24, float:4.355E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            java.lang.Object r12 = r3.get(r6)
            java.lang.String r12 = (java.lang.String) r12
            r6 = 726(0x2d6, float:1.017E-42)
            java.lang.String r6 = X.Pxd.A00(r6)
            java.lang.Object r10 = r3.get(r6)
            java.lang.String r10 = (java.lang.String) r10
            if (r5 == 0) goto L_0x0103
            boolean r6 = android.text.TextUtils.isEmpty(r12)
            if (r6 != 0) goto L_0x0103
            boolean r6 = android.text.TextUtils.isEmpty(r10)
            if (r6 != 0) goto L_0x0103
            r6 = 729(0x2d9, float:1.022E-42)
            java.lang.String r6 = X.Pxd.A00(r6)
            java.lang.Object r11 = r3.get(r6)
            java.lang.String r11 = (java.lang.String) r11
            r6 = 725(0x2d5, float:1.016E-42)
            java.lang.String r6 = X.Pxd.A00(r6)
            java.lang.Object r9 = r3.get(r6)
            java.lang.String r9 = (java.lang.String) r9
            r6 = 730(0x2da, float:1.023E-42)
            java.lang.String r6 = X.Pxd.A00(r6)
            java.lang.Object r13 = r3.get(r6)
            java.lang.String r13 = (java.lang.String) r13
            r6 = 727(0x2d7, float:1.019E-42)
            java.lang.String r6 = X.Pxd.A00(r6)
            java.lang.Object r15 = r3.get(r6)
            java.lang.String r15 = (java.lang.String) r15
            r6 = 728(0x2d8, float:1.02E-42)
            java.lang.String r6 = X.Pxd.A00(r6)
            java.lang.Object r14 = r3.get(r6)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r3 = "posts"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x0104
            boolean r3 = android.text.TextUtils.isEmpty(r15)
            if (r3 != 0) goto L_0x0104
            java.lang.String r6 = "%s_%s"
            java.lang.String r3 = "fb_post_reshare_sticker_id"
            java.lang.String r8 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r6, r3, r15)
        L_0x00b3:
            X.6oG r7 = X.C318046oG.FB_COMMUNITY
            r3 = 2351(0x92f, float:3.294E-42)
            java.lang.String r6 = X.C273654mx.A00(r3)
            X.6nz r3 = X.C317876nz.A0a
            X.6nz r3 = X.C317886o0.A04(r5, r7, r6, r8, r2)
            r16 = 0
            X.BGm r8 = new X.BGm
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            X.9lz r11 = new X.9lz
            r11.<init>()
            r11.A00 = r8
            com.instagram.common.session.UserSession r10 = r0.A0v
            boolean r9 = X.AnonymousClass7TF.A1U(r1, r10, r4)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            int r7 = r5.getWidth()
            int r6 = r5.getHeight()
            X.8v5 r2 = new X.8v5
            r2.<init>(r5, r11, r7, r6)
            r8.add(r2)
            X.7w8 r5 = new X.7w8
            r5.<init>(r4, r10, r8)
            X.ADo r2 = X.C39890ADo.A00()
            r2.A0F = r1
            r2.A0Q = r1
            r2.A0O = r9
            r1 = 1056964608(0x3f000000, float:0.5)
            r2.A01 = r1
            X.8ME r0 = X.AnonymousClass7TF.A0M(r0)
            r0.A1H(r5, r3, r2)
        L_0x0103:
            return
        L_0x0104:
            java.lang.String r8 = "fb_community_tap_state_id_key"
            goto L_0x00b3
        L_0x0107:
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r1 = r0.A0z
            int r1 = X.AnonymousClass81W.A00(r1)
            float r1 = (float) r1
            int r11 = X.AnonymousClass7TE.A05(r1, r2)
            float r5 = (float) r11
            float r1 = (float) r9
            float r5 = r5 / r1
            float r1 = (float) r8
            int r10 = X.AnonymousClass7TE.A05(r5, r1)
            goto L_0x0033
        L_0x011c:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r6.A0G
            java.lang.String r4 = r1.A03
            r4.getClass()
            com.instagram.common.session.UserSession r3 = r0.A0v
            boolean r1 = X.AET.A01(r3)
            r10 = 0
            if (r1 != 0) goto L_0x014d
            java.util.List r1 = X.C379209Sy.A00
            if (r3 == 0) goto L_0x01eb
            X.0Tu r5 = X.0Tu.A05
            r1 = 36317423116227702(0x81068100001476, double:3.0306228450028116E-306)
            boolean r1 = X.182.A06(r5, r3, r1)
            if (r1 == 0) goto L_0x01eb
            r1 = 36880373069709632(0x83068100010140, double:3.386634662402299E-306)
            java.lang.String r1 = X.182.A04(r5, r3, r1)
            boolean r1 = X.00l.A0d(r1, r4, r10)
        L_0x014a:
            r9 = 0
            if (r1 == 0) goto L_0x014e
        L_0x014d:
            r9 = 1
        L_0x014e:
            X.28D r1 = r0.A0q
            boolean r1 = X.C348017xk.A02(r1)
            if (r1 == 0) goto L_0x015d
            boolean r1 = X.C379209Sy.A00(r3, r4)
            if (r1 == 0) goto L_0x015d
            r10 = 1
        L_0x015d:
            X.ADo r5 = X.C39890ADo.A00()
            r2 = 0
            r5.A0Q = r2
            r5.A0O = r9
            r1 = 1056964608(0x3f000000, float:0.5)
            r5.A01 = r1
            r5.A0F = r2
            boolean r1 = r6.A05()
            if (r1 == 0) goto L_0x0103
            int r8 = r6.A0B
            int r4 = r6.A04
            int r3 = r6.A07
            r7 = 1061158912(0x3f400000, float:0.75)
            r1 = 90
            if (r3 == r1) goto L_0x01d7
            r1 = 270(0x10e, float:3.78E-43)
            if (r3 == r1) goto L_0x01d7
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r1 = r0.A0z
            int r1 = X.AnonymousClass81W.A00(r1)
            float r1 = (float) r1
            int r2 = X.AnonymousClass7TE.A05(r1, r7)
            float r11 = (float) r2
            float r1 = (float) r8
            float r11 = r11 / r1
            float r1 = (float) r4
            int r1 = X.AnonymousClass7TE.A05(r11, r1)
        L_0x0195:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r11 = r6.A0G
            java.lang.String r13 = r6.A0N
            java.lang.String r14 = r6.A0X
            if (r10 == 0) goto L_0x01d4
            X.9sG r12 = X.C391049sG.MUSIC_PARTNER
        L_0x019f:
            r6 = 3
            X.0qQ.A0B(r14, r6)
            r15 = 0
            com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel r10 = new com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel
            r16 = r15
            r22 = r9
            r20 = r2
            r21 = r1
            r19 = r3
            r17 = r8
            r18 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.9XD r8 = new X.9XD
            r8.<init>(r10)
            android.graphics.Bitmap r6 = r8.A02
            if (r6 == 0) goto L_0x0103
            X.6oG r4 = X.C318046oG.SHARE_PLATFORM
            java.lang.String r3 = "share_platform_sticker_id"
            java.lang.String r2 = "third_party_sticker"
            X.6nz r1 = X.C317876nz.A0a
            X.6nz r1 = X.C317886o0.A04(r6, r4, r3, r2, r7)
            X.8ME r0 = X.AnonymousClass7TF.A0M(r0)
            r0.A1H(r8, r1, r5)
            return
        L_0x01d4:
            X.9sG r12 = X.C391049sG.UNKNOWN
            goto L_0x019f
        L_0x01d7:
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r1 = r0.A0z
            int r1 = X.AnonymousClass81W.A00(r1)
            float r1 = (float) r1
            int r1 = X.AnonymousClass7TE.A05(r1, r7)
            float r11 = (float) r1
            float r2 = (float) r4
            float r11 = r11 / r2
            float r2 = (float) r8
            int r2 = X.AnonymousClass7TE.A05(r11, r2)
            goto L_0x0195
        L_0x01eb:
            java.util.List r1 = X.C379209Sy.A02
            boolean r1 = r1.contains(r4)
            goto L_0x014a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41134Aou.run():void");
    }
}
