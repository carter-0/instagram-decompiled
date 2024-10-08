package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.List;
import kotlin.Deprecated;

/* renamed from: X.AIi  reason: case insensitive filesystem */
public abstract class C39900AIi {
    public static final Drawable A01(Context context, UserSession userSession, C2802350v r11, String str) {
        return A00(context, userSession, (C279284yO) null, (C321086tY) null, r11, (Integer) null, (Integer) null, str, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (X.182.A06(r4, r9, 36323139718425484L) != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0146, code lost:
        if (X.182.A06(r6, r9, 36323139717835651L) == false) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (X.182.A06(X.0Tu.A06, r9, 36323139717835651L) == false) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C306386Ly A02(android.content.Context r8, com.instagram.common.session.UserSession r9, X.C279284yO r10, X.C2802250u r11) {
        /*
            r3 = 0
            X.AnonymousClass7TF.A1B(r8, r3, r11)
            boolean r0 = r10 instanceof X.AnonymousClass80O
            r2 = 1
            if (r0 == 0) goto L_0x0025
            boolean r0 = X.AnonymousClass8IK.A08(r9)
            if (r0 == 0) goto L_0x0025
            boolean r0 = X.AnonymousClass8IK.A09(r9)
            if (r0 == 0) goto L_0x0025
            X.0qQ.A0B(r9, r3)
            X.0Tu r4 = X.0Tu.A06
            r0 = 36323139717835651(0x810bb400022b83, double:3.0342380468785856E-306)
            boolean r0 = X.182.A06(r4, r9, r0)
            if (r0 != 0) goto L_0x004f
        L_0x0025:
            boolean r0 = r10 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x0169
            X.0Tu r4 = X.0Tu.A06
            r0 = 36323139718359947(0x810bb4000a2b8b, double:3.0342380472101525E-306)
            boolean r0 = X.182.A06(r4, r9, r0)
            if (r0 == 0) goto L_0x0169
            X.0qQ.A0B(r9, r3)
            r0 = 36323139718228873(0x810bb400082b89, double:3.034238047127261E-306)
            boolean r0 = X.182.A06(r4, r9, r0)
            if (r0 == 0) goto L_0x0169
            r0 = 36323139718425484(0x810bb4000b2b8c, double:3.0342380472515984E-306)
            boolean r0 = X.182.A06(r4, r9, r0)
            if (r0 == 0) goto L_0x0169
        L_0x004f:
            r4 = 1
        L_0x0050:
            X.50x r1 = r11.A0D
            r5 = 0
            if (r1 == 0) goto L_0x005d
            java.lang.String r0 = r1.A00
            if (r0 == 0) goto L_0x005d
            android.text.SpannableStringBuilder r5 = X.C18790W1s.A00(r8, r1, r4)
        L_0x005d:
            X.1Av r6 = X.1Au.A00(r9)
            X.0s0 r4 = r6.A8E
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 60
            r0 = r1[r0]
            java.lang.Object r1 = r4.CDM(r6, r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0161
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0161
            X.8bb r4 = X.C358878bc.A01(r1, r3, r3, r3, r3)
        L_0x007b:
            int r3 = r11.A06
            boolean r0 = r11.A0H
            if (r0 == 0) goto L_0x0150
            java.util.List r1 = X.C358878bc.A0A()
            java.lang.String r0 = r4.A09
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0150
            X.8f3 r0 = r11.A0B
            if (r0 == 0) goto L_0x012c
            X.0Tu r6 = X.0Tu.A05
            r0 = 36323139718032262(0x810bb400052b86, double:3.034238047002923E-306)
            boolean r0 = X.182.A06(r6, r9, r0)
            if (r0 == 0) goto L_0x012c
        L_0x009e:
            X.8f3 r0 = r11.A0B
            if (r0 == 0) goto L_0x014a
            X.91c r6 = X.C39813AAk.A00(r8, r9, r0, r3)
        L_0x00a6:
            X.6Ly r6 = (X.C306386Ly) r6
        L_0x00a8:
            android.text.Layout$Alignment r0 = r11.A0A
            if (r0 != 0) goto L_0x00ae
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x00ae:
            r6.A0K(r0)
            float r1 = r11.A03
            float r0 = r11.A04
            r6.A0C(r1, r0)
            int r0 = r11.A07
            r6.A0F(r0)
            float r0 = r11.A05
            r6.A0A(r0)
            X.6th r0 = r11.A0E
            if (r0 == 0) goto L_0x00d1
            float r7 = r0.A02
            float r3 = r0.A00
            float r1 = r0.A01
            int r0 = r0.A03
            r6.A0D(r7, r3, r1, r0)
        L_0x00d1:
            float r1 = r11.A01
            float r0 = r11.A02
            r6.A0B(r1, r0)
            X.6Lz r0 = r11.A0C
            if (r0 == 0) goto L_0x0122
            X.8bh r1 = r4.A05
            X.0qq r0 = X.AnonymousClass0qo.A00(r8)
            android.graphics.Typeface r0 = X.AnonymousClass91U.A01(r0, r1)
            r6.A0I(r0)
            X.8bi r0 = r4.A06
            float r0 = r0.A00
            r6.A04 = r0
            float r0 = X.AnonymousClass91U.A00(r1)
            r6.A05 = r0
            int r0 = r11.A08
            r6.A09 = r0
            if (r5 == 0) goto L_0x0120
            boolean r0 = X.C358948bj.A06(r5)
            if (r0 == 0) goto L_0x0120
        L_0x0101:
            r6.A0P = r2
            float r1 = r11.A00
            android.text.TextPaint r0 = r6.A0b
            r0.setLetterSpacing(r1)
            r6.A0R()
        L_0x010d:
            if (r5 != 0) goto L_0x0111
            android.text.Spannable r5 = X.C306386Ly.A0d
        L_0x0111:
            r6.A0L(r5)
            java.lang.Integer r0 = r11.A0F
            r6.A0M = r0
            X.6Lz r0 = r11.A0C
            r6.A0I = r0
            r6.A0R()
            return r6
        L_0x0120:
            r2 = 0
            goto L_0x0101
        L_0x0122:
            X.0qq r1 = X.AnonymousClass0qo.A00(r8)
            X.0qm r0 = X.0qm.A0z
            X.AnonymousClass7TE.A1X(r0, r1, r6)
            goto L_0x010d
        L_0x012c:
            boolean r0 = r11.A0I
            if (r0 != 0) goto L_0x014a
            X.0Tu r6 = X.0Tu.A05
            r0 = 36323139718425484(0x810bb4000b2b8c, double:3.0342380472515984E-306)
            boolean r0 = X.182.A06(r6, r9, r0)
            if (r0 != 0) goto L_0x009e
            r0 = 36323139717835651(0x810bb400022b83, double:3.0342380468785856E-306)
            boolean r0 = X.182.A06(r6, r9, r0)
            if (r0 == 0) goto L_0x014a
            goto L_0x009e
        L_0x014a:
            X.91c r6 = X.C39813AAk.A01(r8, r9, r4, r3)
            goto L_0x00a6
        L_0x0150:
            boolean r0 = r11.A0I
            if (r0 == 0) goto L_0x015b
            X.9UM r6 = new X.9UM
            r6.<init>(r8, r9, r3)
            goto L_0x00a6
        L_0x015b:
            X.6Ly r6 = X.AnonymousClass7TE.A0s(r8, r3)
            goto L_0x00a8
        L_0x0161:
            java.lang.String r0 = "classic"
            X.8bb r4 = X.C358878bc.A01(r0, r3, r3, r3, r3)
            goto L_0x007b
        L_0x0169:
            r4 = 0
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39900AIi.A02(android.content.Context, com.instagram.common.session.UserSession, X.4yO, X.50u):X.6Ly");
    }

    @Deprecated(message = "")
    public static final C310416b1 A04(Context context, UserSession userSession, AnonymousClass8BH r27, Integer num, Integer num2, String str, boolean z, boolean z2, boolean z3) {
        int i;
        Integer num3;
        Context context2 = context;
        0qQ.A0B(context2, 1);
        0Tu r5 = 0Tu.A05;
        UserSession userSession2 = userSession;
        if (182.A06(r5, userSession2, 36323229912017934L) || 182.A06(r5, userSession2, 36320992234251266L)) {
            i = 5;
        } else {
            i = 4;
            if (z3) {
                i = 1;
            }
        }
        AnonymousClass8BH ut8 = new C16338Ut8(17, 0.0f, 0.0f);
        if (r27 != null) {
            ut8 = r27;
        }
        String string = context2.getString(2131967811);
        if (z) {
            num3 = AnonymousClass05K.A01;
        } else {
            num3 = AnonymousClass05K.A00;
        }
        boolean z4 = !z;
        return new C310416b1(ut8, (AnonymousClass8DA) null, (C3510487j) null, num3, num, num2, (Object) str, string, (List) null, 0.3f, -1.0f, -1.0f, -1.0f, -1.0f, i, z4, false, z2, z4, false, false, false, true, true, true, true, true, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01ab, code lost:
        r4.A0D = r13.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01b1, code lost:
        r4.A05 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x022f, code lost:
        r4.A0D = r13.getString(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C310416b1 A03(android.content.Context r13, com.instagram.common.session.UserSession r14, X.C279284yO r15, X.C2802350v r16, X.AnonymousClass8BH r17, java.lang.String r18, boolean r19, boolean r20) {
        /*
            r5 = r16
            r2 = 0
            r10 = r13
            X.0qQ.A0B(r13, r2)
            r3 = 1
            r8 = 21
            r7 = 18
            r6 = 7
            X.0qQ.A0B(r15, r6)
            boolean r0 = r15 instanceof X.AnonymousClass80O
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x002a
            java.lang.Integer r0 = r5.CAk()
            int r1 = r0.intValue()
            r0 = 36
            if (r1 == r0) goto L_0x0079
            r0 = 33
            if (r1 == r0) goto L_0x0079
            r0 = 25
            if (r1 == r0) goto L_0x0079
        L_0x002a:
            X.ADo r4 = new X.ADo
            r4.<init>()
            r4.A0F = r3
            r4.A0H = r3
            r4.A04 = r9
            r0 = 1069547520(0x3fc00000, float:1.5)
            r4.A00 = r0
            r0 = 1048576000(0x3e800000, float:0.25)
            r4.A01 = r0
            r12 = r17
            r4.A06 = r12
            r15 = r18
            r4.A0C = r15
            java.lang.Integer r0 = r5.CAk()
            int r1 = r0.intValue()
            if (r1 == r8) goto L_0x0247
            if (r1 == r7) goto L_0x0247
            r0 = 16
            if (r1 == r0) goto L_0x01fa
            r0 = 9
            if (r1 == r0) goto L_0x01d8
            r0 = 38
            if (r1 == r0) goto L_0x01d4
            r0 = 51
            if (r1 == r0) goto L_0x01b5
            switch(r1) {
                case 8: goto L_0x019c;
                case 10: goto L_0x017e;
                case 13: goto L_0x016a;
                case 20: goto L_0x021a;
                case 31: goto L_0x017a;
                case 32: goto L_0x017a;
                case 33: goto L_0x01a4;
                case 36: goto L_0x01a0;
                default: goto L_0x0064;
            }
        L_0x0064:
            switch(r1) {
                case 2: goto L_0x015d;
                case 3: goto L_0x0161;
                case 25: goto L_0x0159;
                case 26: goto L_0x0159;
                case 40: goto L_0x0165;
                default: goto L_0x0067;
            }
        L_0x0067:
            switch(r1) {
                case 23: goto L_0x01d4;
                case 28: goto L_0x009e;
                case 29: goto L_0x009e;
                case 30: goto L_0x009e;
                case 34: goto L_0x01d4;
                case 44: goto L_0x01d4;
                case 45: goto L_0x0082;
                case 46: goto L_0x01d4;
                case 47: goto L_0x01a8;
                case 48: goto L_0x007d;
                case 52: goto L_0x00f5;
                case 56: goto L_0x0109;
                case 58: goto L_0x0238;
                case 62: goto L_0x01d4;
                case 63: goto L_0x0087;
                case 64: goto L_0x01d4;
                case 65: goto L_0x01d4;
                case 68: goto L_0x009e;
                case 69: goto L_0x009e;
                case 70: goto L_0x00dc;
                case 73: goto L_0x01d4;
                case 74: goto L_0x01d4;
                default: goto L_0x006a;
            }
        L_0x006a:
            java.lang.String r1 = "Unsupported Sticker Model of Type: "
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r1, r0)
            throw r0
        L_0x0079:
            r9 = 1061997773(0x3f4ccccd, float:0.8)
            goto L_0x002a
        L_0x007d:
            r0 = 2131974638(0x7f1359ee, float:1.9586346E38)
            goto L_0x01ab
        L_0x0082:
            r0 = 2131963518(0x7f132e7e, float:1.9563792E38)
            goto L_0x023b
        L_0x0087:
            com.instagram.reels.prompt.model.PromptStickerModel r5 = (com.instagram.reels.prompt.model.PromptStickerModel) r5
            r0 = 2131970899(0x7f134b53, float:1.9578762E38)
            java.lang.String r0 = r13.getString(r0)
            r4.A0D = r0
            r4.A06 = r12
            boolean r0 = r5.A0F()
            r0 = r0 ^ 1
            r4.A0Q = r0
            goto L_0x0241
        L_0x009e:
            r0 = 2131970899(0x7f134b53, float:1.9578762E38)
            java.lang.String r0 = r13.getString(r0)
            r4.A0D = r0
            r4.A05 = r6
            com.instagram.reels.prompt.model.PromptStickerModel r5 = (com.instagram.reels.prompt.model.PromptStickerModel) r5
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x00b4
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            r4.A01 = r0
        L_0x00b4:
            boolean r0 = r5.A0G()
            if (r0 == 0) goto L_0x0241
            java.lang.String r0 = "BeforeAndAfterSticker"
            r4.A0C = r0
            r4.A0G = r3
            r4.A0S = r3
            java.lang.String r0 = r5.A03
            boolean r0 = X.00l.A0W(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00ce
            r4.A0Q = r2
        L_0x00ce:
            r2 = 1056964608(0x3f000000, float:0.5)
            r1 = 1063675494(0x3f666666, float:0.9)
            X.8BG r0 = new X.8BG
            r0.<init>(r2, r1)
            r4.A06 = r0
            goto L_0x0241
        L_0x00dc:
            r0 = 2131964142(0x7f1330ee, float:1.9565057E38)
            java.lang.String r0 = r13.getString(r0)
            r4.A0D = r0
            r2 = 1056964608(0x3f000000, float:0.5)
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            X.8BG r0 = new X.8BG
            r0.<init>(r2, r1)
            r4.A06 = r0
            r4.A0Q = r3
            goto L_0x01b1
        L_0x00f5:
            com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel r5 = (com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel) r5
            boolean r0 = r5.A0B
            X.ADo r4 = X.C39890ADo.A00()
            r4.A0Q = r2
            r4.A0O = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r4.A01 = r0
            r4.A0F = r2
            goto L_0x0241
        L_0x0109:
            X.Aef r5 = (X.C40591Aef) r5
            X.0qQ.A0B(r5, r2)
            X.ADo r4 = new X.ADo
            r4.<init>()
            r4.A0F = r3
            r4.A0H = r3
            r0 = 2131953759(0x7f13085f, float:1.9543998E38)
            java.lang.String r0 = r13.getString(r0)
            r4.A0D = r0
            r4.A0R = r3
            r6 = 1056964608(0x3f000000, float:0.5)
            r4.A04 = r6
            java.lang.String r0 = "BeforeAndAfterSticker"
            r4.A0C = r0
            r4.A0G = r3
            com.instagram.api.schemas.StoryThenAndNowStickerDict r0 = r5.A00
            java.lang.Boolean r0 = r0.A00
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r3)
            r1 = 1061158912(0x3f400000, float:0.75)
            if (r0 == 0) goto L_0x0142
            r1 = 1048576000(0x3e800000, float:0.25)
        L_0x0142:
            X.8BG r0 = new X.8BG
            r0.<init>(r6, r1)
            r4.A06 = r0
            com.instagram.api.schemas.StoryThenAndNowStickerDict r0 = r5.A00
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x0241
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x0241
            r4.A0Q = r2
            goto L_0x0241
        L_0x0159:
            r0 = 2131969571(0x7f134623, float:1.9576069E38)
            goto L_0x01ab
        L_0x015d:
            r0 = 2131964521(0x7f133269, float:1.9565826E38)
            goto L_0x01ab
        L_0x0161:
            r0 = 2131974608(0x7f1359d0, float:1.9586285E38)
            goto L_0x01ab
        L_0x0165:
            r0 = 2131976024(0x7f135f58, float:1.9589157E38)
            goto L_0x023b
        L_0x016a:
            X.ADo r4 = new X.ADo
            r4.<init>()
            r4.A0F = r3
            r0 = 1090519040(0x41000000, float:8.0)
            r4.A00 = r0
            r0 = 2131963297(0x7f132da1, float:1.9563343E38)
            goto L_0x022f
        L_0x017a:
            r0 = 2131971057(0x7f134bf1, float:1.9579083E38)
            goto L_0x01ab
        L_0x017e:
            X.WaN r5 = (X.C19475WaN) r5
            java.lang.String r1 = "I_DONATED"
            X.8YF r0 = r5.A00
            java.lang.String r0 = r0.A06
            if (r0 != 0) goto L_0x018a
            java.lang.String r0 = ""
        L_0x018a:
            boolean r1 = r1.equals(r0)
            r0 = 2131962854(0x7f132be6, float:1.9562445E38)
            java.lang.String r0 = r13.getString(r0)
            r4.A0D = r0
            r0 = r1 ^ 1
            r4.A0Q = r0
            goto L_0x01b1
        L_0x019c:
            r0 = 2131956789(0x7f131435, float:1.9550144E38)
            goto L_0x01ab
        L_0x01a0:
            r0 = 2131974005(0x7f135775, float:1.9585062E38)
            goto L_0x01ab
        L_0x01a4:
            r0 = 2131971251(0x7f134cb3, float:1.9579476E38)
            goto L_0x01ab
        L_0x01a8:
            r0 = 2131971321(0x7f134cf9, float:1.9579618E38)
        L_0x01ab:
            java.lang.String r0 = r13.getString(r0)
            r4.A0D = r0
        L_0x01b1:
            r4.A05 = r6
            goto L_0x0241
        L_0x01b5:
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131165245(0x7f07003d, float:1.7944702E38)
            float r1 = X.AnonymousClass7TE.A01(r1, r0)
            X.Aen r5 = (X.C40599Aen) r5
            android.graphics.drawable.Drawable r0 = r5.A01
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            r4.A04 = r1
            r4.A0F = r2
            r4.A0I = r2
            r0 = 2131953506(0x7f130762, float:1.9543485E38)
            goto L_0x023b
        L_0x01d4:
            r0 = 2131968497(0x7f1341f1, float:1.957389E38)
            goto L_0x023b
        L_0x01d8:
            X.ADo r4 = new X.ADo
            r4.<init>()
            r0 = 2131975391(0x7f135cdf, float:1.9587873E38)
            java.lang.String r0 = r13.getString(r0)
            r4.A0D = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r4.A0A = r0
            r4.A0F = r3
            r2 = 1056964608(0x3f000000, float:0.5)
            r1 = 1061158912(0x3f400000, float:0.75)
            X.8BG r0 = new X.8BG
            r0.<init>(r2, r1)
            r4.A06 = r0
            r4.A0H = r3
            goto L_0x0235
        L_0x01fa:
            X.ADo r4 = new X.ADo
            r4.<init>()
            r0 = 24
            float r0 = X.0nA.A04(r13, r0)
            int r1 = (int) r0
            r0 = 100
            float r0 = X.0nA.A04(r13, r0)
            int r0 = (int) r0
            r3 = 8388659(0x800033, float:1.1755015E-38)
            float r2 = (float) r1
            float r1 = (float) r0
            X.Ut8 r0 = new X.Ut8
            r0.<init>(r3, r2, r1)
            r4.A06 = r0
            goto L_0x0235
        L_0x021a:
            int[] r0 = X.AnonymousClass91M.A02
            X.ADo r4 = new X.ADo
            r4.<init>()
            r4.A0F = r3
            r0 = 1084227584(0x40a00000, float:5.0)
            r4.A00 = r0
            r0 = 1054448026(0x3ed9999a, float:0.425)
            r4.A01 = r0
            r0 = 2131966139(0x7f1338bb, float:1.9569108E38)
        L_0x022f:
            java.lang.String r0 = r13.getString(r0)
            r4.A0D = r0
        L_0x0235:
            r4.A0C = r15
            goto L_0x0241
        L_0x0238:
            r0 = 2131963193(0x7f132d39, float:1.9563132E38)
        L_0x023b:
            java.lang.String r0 = r13.getString(r0)
            r4.A0D = r0
        L_0x0241:
            X.6b1 r0 = new X.6b1
            r0.<init>(r4)
            return r0
        L_0x0247:
            X.7zz r5 = (X.C349337zz) r5
            X.6KJ r1 = r5.BV4()
            X.6KJ r0 = X.AnonymousClass6KJ.MUSIC_ONLY
            r17 = 0
            if (r1 == r0) goto L_0x0255
            r17 = 1
        L_0x0255:
            r13 = 0
            r11 = r14
            r16 = r19
            r18 = r20
            r14 = r13
            X.6b1 r0 = A04(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39900AIi.A03(android.content.Context, com.instagram.common.session.UserSession, X.4yO, X.50v, X.8BH, java.lang.String, boolean, boolean):X.6b1");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: X.JZg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: X.9m4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: X.9m6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v63, resolved type: X.9m5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v74, resolved type: X.9m7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v80, resolved type: X.9m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v81, resolved type: X.9ly} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v122, resolved type: com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v123, resolved type: com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v158, resolved type: X.8Nk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v48, resolved type: X.8Nk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v124, resolved type: X.9m4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v125, resolved type: com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v126, resolved type: com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v127, resolved type: com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v128, resolved type: com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v129, resolved type: X.9m4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v130, resolved type: X.9m4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v131, resolved type: X.9m4} */
    /* JADX WARNING: type inference failed for: r4v0, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r1v47 */
    /* JADX WARNING: type inference failed for: r4v9, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v5, types: [X.6Ly, X.8ur, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x04db, code lost:
        r2 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x04e3, code lost:
        if (r2 >= r1.A08.size()) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x075f, code lost:
        r2 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0767, code lost:
        if (r2 >= r1.A08.size()) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0769, code lost:
        r1.A0B(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x076c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x07f0, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x07f7, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f9, code lost:
        r0 = (X.C40607Aev) r0;
        r11 = r0.A06;
        X.0qQ.A07(r11);
        r10 = r0.A07;
        X.0qQ.A07(r10);
        r9 = r0.A02;
        r8 = r0.A01;
        r7 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010b, code lost:
        if (r7 != null) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010d, code lost:
        r12 = new X.C376429Hy(0.0f, 0.0f, 15, 0.0f, r4, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011d, code lost:
        r12 = r0.A09;
        r5 = r0.A00;
        r4 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0123, code lost:
        if (r4 != null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0125, code lost:
        r4 = X.C391099sL.NOT_CLIPS;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0147, code lost:
        return new X.AnonymousClass9X8(r7, r11, r2, r10, r4, (java.lang.String) null, r5, r9, r8, r0.A04, r0.A03, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02ea, code lost:
        if (r2 == r4) goto L_0x02ec;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.drawable.Drawable A00(android.content.Context r24, com.instagram.common.session.UserSession r25, X.C279284yO r26, X.C321086tY r27, X.C2802350v r28, java.lang.Integer r29, java.lang.Integer r30, java.lang.String r31, boolean r32) {
        /*
            r0 = r28
            r5 = 0
            r3 = r24
            boolean r4 = X.AnonymousClass7TF.A1U(r5, r3, r0)
            r11 = 3
            r7 = 4
            r8 = r31
            X.0qQ.A0B(r8, r7)
            java.lang.Integer r1 = r0.CAk()
            int r1 = r1.intValue()
            r6 = 0
            r2 = r25
            r9 = r26
            r14 = r27
            r10 = r32
            switch(r1) {
                case 0: goto L_0x0230;
                case 1: goto L_0x058e;
                case 2: goto L_0x0575;
                case 3: goto L_0x0575;
                case 4: goto L_0x076d;
                case 5: goto L_0x019f;
                case 6: goto L_0x01b8;
                case 7: goto L_0x01d3;
                case 8: goto L_0x0374;
                case 9: goto L_0x021c;
                case 10: goto L_0x036c;
                case 11: goto L_0x030d;
                case 12: goto L_0x0024;
                case 13: goto L_0x0390;
                case 14: goto L_0x018f;
                case 15: goto L_0x0228;
                case 16: goto L_0x01eb;
                case 17: goto L_0x04c8;
                case 18: goto L_0x0070;
                case 19: goto L_0x0197;
                case 20: goto L_0x049b;
                case 21: goto L_0x0038;
                case 22: goto L_0x0024;
                case 23: goto L_0x0818;
                case 24: goto L_0x07d4;
                case 25: goto L_0x04eb;
                case 26: goto L_0x056d;
                case 27: goto L_0x031f;
                case 28: goto L_0x069d;
                case 29: goto L_0x069d;
                case 30: goto L_0x067b;
                case 31: goto L_0x035c;
                case 32: goto L_0x0364;
                case 33: goto L_0x04bb;
                case 34: goto L_0x07ac;
                case 35: goto L_0x0024;
                case 36: goto L_0x0383;
                case 37: goto L_0x01f2;
                case 38: goto L_0x0249;
                case 39: goto L_0x00e1;
                case 40: goto L_0x057d;
                case 41: goto L_0x00f9;
                case 42: goto L_0x032b;
                case 43: goto L_0x0024;
                case 44: goto L_0x05c5;
                case 45: goto L_0x05da;
                case 46: goto L_0x06c1;
                case 47: goto L_0x078d;
                case 48: goto L_0x05cd;
                case 49: goto L_0x0024;
                case 50: goto L_0x0024;
                case 51: goto L_0x0024;
                case 52: goto L_0x0795;
                case 53: goto L_0x0024;
                case 54: goto L_0x0024;
                case 55: goto L_0x0024;
                case 56: goto L_0x079d;
                case 57: goto L_0x0024;
                case 58: goto L_0x07a5;
                case 59: goto L_0x0024;
                case 60: goto L_0x0024;
                case 61: goto L_0x0250;
                case 62: goto L_0x0811;
                case 63: goto L_0x05e2;
                case 64: goto L_0x07b4;
                case 65: goto L_0x07bc;
                case 66: goto L_0x0024;
                case 67: goto L_0x0024;
                case 68: goto L_0x069d;
                case 69: goto L_0x0695;
                case 70: goto L_0x068d;
                case 71: goto L_0x0024;
                case 72: goto L_0x07f8;
                case 73: goto L_0x07c4;
                case 74: goto L_0x07cc;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.String r1 = "Unsupported Sticker Model of Type: "
            java.lang.Integer r0 = r0.CAk()
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = X.C17036VFk.A00(r0)
        L_0x0030:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r1, r0)
            throw r0
        L_0x0035:
            java.lang.String r0 = "null"
            goto L_0x0030
        L_0x0038:
            X.Af0 r0 = (X.Af0) r0
            boolean r1 = r0.A04
            if (r1 == 0) goto L_0x006b
            com.instagram.music.common.model.MusicOverlayStickerModel r6 = r0.BUu()
            int r0 = X.AnonymousClass7TE.A0A(r3)
            X.9XG r4 = X.AIN.A02(r3, r2, r6, r0, r5)
            r0 = 2131099782(0x7f060086, float:1.7811927E38)
            int r0 = r3.getColor(r0)
            X.9XG r1 = X.AIN.A02(r3, r2, r6, r0, r5)
            int r0 = X.AnonymousClass7TE.A0A(r3)
            X.9XH r0 = X.AIN.A01(r3, r2, r6, r0, r5)
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r4, r1, r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            X.7w8 r1 = new X.7w8
            r1.<init>(r3, r2, r0)
            return r1
        L_0x006b:
            android.graphics.drawable.Drawable r1 = X.AIN.A00(r3, r2, r0, r10)
            return r1
        L_0x0070:
            X.Af1 r0 = (X.Af1) r0
            X.0qQ.A0B(r0, r4)
            X.6KJ r1 = r0.BV4()
            int r2 = r1.ordinal()
            if (r2 == r7) goto L_0x00d1
            r1 = 5
            if (r2 == r1) goto L_0x00c1
            r1 = 2
            if (r2 == r1) goto L_0x00b1
            if (r2 == r11) goto L_0x00a1
            r1 = 6
            if (r2 != r1) goto L_0x009a
            X.Wak r4 = r0.A00()
            com.instagram.music.common.model.MusicOverlayStickerModel r2 = r0.BUu()
            int r0 = r0.A00
            X.Upt r1 = new X.Upt
            r1.<init>(r3, r2, r4, r0)
            return r1
        L_0x009a:
            java.lang.String r0 = "Unsupported lyrics sticker display type"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00a1:
            X.Wak r4 = r0.A00()
            com.instagram.music.common.model.MusicOverlayStickerModel r2 = r0.BUu()
            int r0 = r0.A00
            X.Ups r1 = new X.Ups
            r1.<init>(r3, r2, r4, r0)
            return r1
        L_0x00b1:
            X.Wak r4 = r0.A00()
            com.instagram.music.common.model.MusicOverlayStickerModel r2 = r0.BUu()
            int r0 = r0.A00
            X.Upr r1 = new X.Upr
            r1.<init>(r3, r2, r4, r0)
            return r1
        L_0x00c1:
            X.Wak r4 = r0.A00()
            com.instagram.music.common.model.MusicOverlayStickerModel r2 = r0.BUu()
            int r0 = r0.A00
            X.Upw r1 = new X.Upw
            r1.<init>(r3, r2, r4, r0)
            return r1
        L_0x00d1:
            X.Wak r4 = r0.A00()
            com.instagram.music.common.model.MusicOverlayStickerModel r2 = r0.BUu()
            int r0 = r0.A00
            X.Upv r1 = new X.Upv
            r1.<init>(r3, r2, r4, r0)
            return r1
        L_0x00e1:
            boolean r1 = r0 instanceof X.AnonymousClass5JL
            if (r1 == 0) goto L_0x0148
            r5 = r0
            X.5JL r5 = (X.AnonymousClass5JL) r5
            X.50v r1 = X.AnonymousClass7TF.A0O(r5)
            boolean r1 = r1 instanceof X.C40607Aev
            if (r1 == 0) goto L_0x0148
            X.50v r0 = X.AnonymousClass7TF.A0O(r5)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.model.VideoStickerClientModel"
            X.0qQ.A0C(r0, r1)
        L_0x00f9:
            X.Aev r0 = (X.C40607Aev) r0
            com.instagram.common.gallery.Medium r11 = r0.A06
            X.0qQ.A07(r11)
            X.9sQ r10 = r0.A07
            X.0qQ.A07(r10)
            int r9 = r0.A02
            int r8 = r0.A01
            X.9Hy r7 = r0.A05
            if (r7 != 0) goto L_0x011d
            X.9Hy r7 = new X.9Hy
            r13 = 0
            r15 = 15
            r14 = r13
            r16 = r13
            r18 = r13
            r12 = r7
            r17 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18)
        L_0x011d:
            boolean r12 = r0.A09
            float r5 = r0.A00
            X.9sL r4 = r0.A08
            if (r4 != 0) goto L_0x0127
            X.9sL r4 = X.C391099sL.NOT_CLIPS
        L_0x0127:
            int r3 = r0.A04
            int r0 = r0.A03
            X.9X8 r1 = new X.9X8
            r13 = r1
            r14 = r7
            r15 = r11
            r16 = r2
            r17 = r10
            r18 = r4
            r19 = r6
            r20 = r5
            r21 = r9
            r22 = r8
            r23 = r3
            r24 = r0
            r25 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0148:
            X.5JL r0 = (X.AnonymousClass5JL) r0
            X.50v r15 = X.AnonymousClass7TF.A0O(r0)
            r11 = r3
            r12 = r2
            r13 = r9
            r16 = r6
            r17 = r6
            r18 = r8
            r19 = r10
            android.graphics.drawable.Drawable r4 = A00(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r2 = r0.A04
            if (r2 != 0) goto L_0x0167
            int r1 = X.AnonymousClass5MH.A0D
            java.lang.String r2 = X.AnonymousClass7TF.A0b()
        L_0x0167:
            X.5MH r1 = new X.5MH
            r1.<init>((android.content.Context) r3, (android.graphics.drawable.Drawable) r4, (java.lang.String) r2)
            int r3 = r0.A01
            int r2 = r0.A00
            r1.Eog(r3, r2)
            java.lang.String r5 = r0.A06
            java.lang.String r2 = r0.A07
            java.lang.String r4 = r0.A05
            java.lang.String r0 = r0.A03
            if (r5 == 0) goto L_0x0786
            if (r2 == 0) goto L_0x0786
            if (r4 == 0) goto L_0x0786
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption r2 = X.AnonymousClass7TE.A0o(r2, r5, r0)
            X.9Iz r0 = new X.9Iz
            r0.<init>((com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption) r2, (java.lang.Integer) r3, (java.lang.String) r4)
            r1.A02 = r0
            return r1
        L_0x018f:
            X.82d r0 = (X.C3498682d) r0
            X.8vL r1 = new X.8vL
            r1.<init>(r3, r0, r5)
            return r1
        L_0x0197:
            X.UkT r0 = (X.C15904UkT) r0
            X.9X4 r1 = new X.9X4
            r1.<init>(r3, r6, r0)
            return r1
        L_0x019f:
            X.Aer r0 = (X.C40603Aer) r0
            java.lang.String r7 = r0.A05
            int r6 = r0.A01
            int r2 = r0.A00
            long r4 = r0.A03
            int r0 = r0.A02
            X.9X5 r1 = new X.9X5
            r12 = r2
            r13 = r0
            r14 = r4
            r8 = r1
            r9 = r3
            r10 = r7
            r11 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r1
        L_0x01b8:
            X.Aes r0 = (X.C40604Aes) r0
            java.lang.String r8 = r0.A06
            int r7 = r0.A01
            int r6 = r0.A00
            long r4 = r0.A03
            int r2 = r0.A02
            java.lang.Integer r0 = r0.A04
            X.9XE r1 = new X.9XE
            r9 = r7
            r10 = r6
            r11 = r2
            r12 = r4
            r5 = r1
            r6 = r3
            r7 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r1
        L_0x01d3:
            X.Aeo r0 = (X.C40600Aeo) r0
            java.lang.String r6 = r0.A04
            int r5 = r0.A01
            int r4 = r0.A00
            int r2 = r0.A02
            java.lang.String r0 = r0.A03
            X.9X7 r1 = new X.9X7
            r8 = r5
            r9 = r4
            r10 = r2
            r4 = r1
            r5 = r3
            r7 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r1
        L_0x01eb:
            X.UOC r0 = (X.UOC) r0
            X.5MM r1 = X.C18192Vn6.A01(r3, r0, r6)
            return r1
        L_0x01f2:
            X.9m2 r0 = (X.C387329m2) r0
            X.6nz r1 = r0.A00()
            if (r27 == 0) goto L_0x0217
            r4 = r6
            r5 = r6
            r6 = r2
            r7 = r1
            r8 = r14
            X.7w8 r1 = X.C347017w8.A00(r3, r4, r5, r6, r7, r8)
        L_0x0203:
            X.0qQ.A0A(r1)
            int r2 = r0.A00
            java.util.List r0 = r1.A08
            int r0 = r0.size()
            if (r2 >= r0) goto L_0x0213
            r1.A0B(r2)
        L_0x0213:
            X.0qQ.A0A(r1)
            return r1
        L_0x0217:
            X.7w8 r1 = X.C347017w8.A01(r3, r2, r1)
            goto L_0x0203
        L_0x021c:
            X.9ly r0 = (X.C387289ly) r0
            X.6nz r1 = X.C317876nz.A1b
            long r4 = r0.A00
            X.7w8 r1 = X.C378999Sa.A00(r3, r2, r1, r4)
            goto L_0x04db
        L_0x0228:
            X.9m1 r0 = (X.C387319m1) r0
            X.7w8 r1 = X.AII.A00(r3, r2, r0)
            goto L_0x04db
        L_0x0230:
            X.WaL r0 = (X.C19473WaL) r0
            java.lang.String r7 = r0.A04
            java.lang.String r6 = r0.A05
            int r5 = r0.A01
            int r4 = r0.A03
            int r2 = r0.A02
            int r1 = r0.A00
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r5, r4, r2, r1)
            X.9XC r1 = new X.9XC
            r1.<init>((android.content.Context) r3, (android.graphics.Rect) r0, (java.lang.String) r7, (java.lang.String) r6)
            return r1
        L_0x0249:
            X.50u r0 = (X.C2802250u) r0
            X.6Ly r1 = A02(r3, r2, r9, r0)
            return r1
        L_0x0250:
            X.Aet r0 = (X.C40605Aet) r0
            android.text.Editable$Factory r7 = android.text.Editable.Factory.getInstance()
            java.lang.String r1 = r0.A05
            android.text.Editable r7 = r7.newEditable(r1)
            com.instagram.api.schemas.ClipsTextFormatType r1 = r0.A03
            java.lang.String r1 = r1.A00
            X.8bb r9 = X.C358878bc.A01(r1, r5, r5, r5, r5)
            X.8bi r1 = r9.A06
            int r10 = r1.A00(r3)
            X.0qQ.A0A(r7)
            X.AnonymousClass91Z.A00(r7, r9)
            X.AnonymousClass91U.A02(r3, r7, r9)
            boolean r1 = r0.A06
            if (r1 == 0) goto L_0x0306
            java.util.List r8 = X.C358878bc.A0A()
            java.lang.String r1 = r9.A09
            boolean r1 = r8.contains(r1)
            if (r1 == 0) goto L_0x0306
            X.91c r1 = X.C39813AAk.A01(r3, r2, r9, r10)
        L_0x0287:
            X.6Ly r1 = (X.C306386Ly) r1
            android.text.Layout$Alignment r2 = r0.A02
            r1.A0K(r2)
            r1.A0L(r7)
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r10 = r2.getDisplayMetrics()
            float r8 = r0.A00
            android.graphics.RectF r2 = X.0nA.A01
            float r2 = android.util.TypedValue.applyDimension(r4, r8, r10)
            r1.A0A(r2)
            android.text.TextPaint r10 = r1.A0b
            float r2 = r10.getTextSize()
            float r8 = X.C39815AAm.A00(r3, r7, r9, r1, r2)
            float r2 = r10.getTextSize()
            float r2 = X.C39815AAm.A01(r3, r7, r9, r1, r2)
            r1.A0C(r8, r2)
            X.0qq r8 = X.AnonymousClass0qo.A00(r3)
            X.0qm r2 = X.0qm.A0z
            X.AnonymousClass7TE.A1X(r2, r8, r1)
            r8 = 1
            r1.A09()
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r1.A0M = r2
            X.AnonymousClass91Y.A00(r6, r9, r1)
            X.C358948bj.A03(r7)
            X.6Mr r2 = r0.A04
            X.8f1 r6 = r9.A04
            X.C358948bj.A02(r3, r2, r6, r1)
            boolean r2 = X.C358948bj.A06(r7)
            if (r2 != 0) goto L_0x0304
            boolean r2 = X.C358948bj.A05(r7)
            if (r2 == 0) goto L_0x0304
            if (r6 == 0) goto L_0x0304
            boolean r2 = r6 instanceof X.C360848fF
            if (r2 == 0) goto L_0x0302
            r2 = 1
        L_0x02ea:
            if (r2 != r4) goto L_0x0304
        L_0x02ec:
            X.AnonymousClass91S.A01(r7, r9, r8)
            X.AnonymousClass91W.A01(r3, r10, r7, r9)
            int r0 = r0.A01
            int r8 = X.0nH.A04(r0)
            int r6 = r7.length()
            r4 = r7
            r7 = r0
            X.C358838bY.A03(r3, r4, r5, r6, r7, r8)
            return r1
        L_0x0302:
            r2 = 0
            goto L_0x02ea
        L_0x0304:
            r8 = 0
            goto L_0x02ec
        L_0x0306:
            X.9UM r1 = new X.9UM
            r1.<init>(r3, r2, r10)
            goto L_0x0287
        L_0x030d:
            X.9m7 r0 = (X.C387379m7) r0
            com.instagram.common.gallery.Medium r4 = r0.A00()
            r6 = r29
            r7 = r30
            r5 = r2
            r8 = r10
            X.7w8 r1 = X.C39898AIf.A03(r3, r4, r5, r6, r7, r8)
            goto L_0x04db
        L_0x031f:
            X.Aek r0 = (X.C40596Aek) r0
            java.lang.String r2 = r0.A01
            android.graphics.Bitmap r0 = r0.A00
            X.9XC r1 = new X.9XC
            r1.<init>(r3, r0, r2)
            return r1
        L_0x032b:
            X.Aep r0 = (X.C40601Aep) r0
            java.lang.String r4 = r0.A04
            int r1 = r0.A02
            float r2 = (float) r1
            r9 = 1050253722(0x3e99999a, float:0.3)
            float r2 = r2 * r9
            int r1 = r0.A01
            float r1 = (float) r1
            float r9 = r9 * r1
            int r1 = r0.A03
            float r1 = (float) r1
            r7 = r4
            r8 = r2
            r10 = r1
            r11 = r5
            android.graphics.Bitmap r9 = X.AnonymousClass9y1.A00(r6, r7, r8, r9, r10, r11)
            java.lang.String r6 = r0.A04
            int r5 = r0.A02
            int r4 = r0.A01
            int r2 = r0.A03
            int r0 = r0.A00
            X.9XB r1 = new X.9XB
            r11 = r5
            r12 = r4
            r13 = r2
            r14 = r0
            r7 = r1
            r8 = r3
            r10 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r1
        L_0x035c:
            X.WaP r0 = (X.C19477WaP) r0
            X.Upb r1 = new X.Upb
            r1.<init>(r3, r2, r0)
            return r1
        L_0x0364:
            X.WaP r0 = (X.C19477WaP) r0
            X.Upc r1 = new X.Upc
            r1.<init>(r3, r2, r0)
            return r1
        L_0x036c:
            X.WaN r0 = (X.C19475WaN) r0
            X.8v3 r1 = new X.8v3
            r1.<init>(r3, r2, r0)
            return r1
        L_0x0374:
            X.WaO r0 = (X.C19476WaO) r0
            X.9pw r1 = new X.9pw
            r1.<init>(r3, r2, r0, r8)
            X.UpX r0 = r1.A01
            r0.A02 = r4
            r0.invalidateSelf()
            return r1
        L_0x0383:
            X.WaK r0 = (X.C19472WaK) r0
            X.UpW r1 = new X.UpW
            r1.<init>(r3, r2, r0)
            r1.A02 = r4
            r1.invalidateSelf()
            return r1
        L_0x0390:
            X.9m5 r0 = (X.C387359m5) r0
            boolean r1 = X.C346897vw.A01(r2)
            if (r1 == 0) goto L_0x048f
            java.lang.String r6 = r0.A02
            float r1 = r0.A00
            r27 = r1
            int r1 = r0.A01
            r26 = r1
            r1 = 2
            java.util.ArrayList r15 = X.AnonymousClass7TF.A0q(r6, r1)
            X.6MW r8 = X.AnonymousClass6MW.A06
            java.lang.String r1 = "hashtag_sticker_gradient"
            X.0eP r16 = X.AnonymousClass7TE.A1L(r8, r1)
            X.6MW r4 = X.AnonymousClass6MW.A0B
            java.lang.String r1 = "hashtag_sticker_subtle"
            X.0eP r17 = X.AnonymousClass7TE.A1L(r4, r1)
            X.6MW r1 = X.AnonymousClass6MW.A0A
            java.lang.String r9 = "hashtag_sticker_rainbow_gradient"
            X.0eP r18 = X.AnonymousClass7TE.A1L(r1, r9)
            X.6MW r9 = X.AnonymousClass6MW.A07
            java.lang.String r10 = "hashtag_sticker_hero_gradient"
            X.0eP r19 = X.AnonymousClass7TE.A1L(r9, r10)
            X.6MW r9 = X.AnonymousClass6MW.A0C
            X.0eP r20 = X.AnonymousClass7TE.A1L(r9, r10)
            X.6MW r9 = X.AnonymousClass6MW.A09
            X.0eP r21 = X.AnonymousClass7TE.A1L(r9, r10)
            X.0eP[] r9 = new X.0eP[]{r16, r17, r18, r19, r20, r21}
            java.util.LinkedHashMap r9 = X.0Yt.A07(r9)
            java.util.Iterator r18 = X.AnonymousClass7TF.A0s(r9)
        L_0x03df:
            boolean r9 = r18.hasNext()
            if (r9 == 0) goto L_0x047d
            java.util.Map$Entry r9 = X.AnonymousClass7TE.A1J(r18)
            java.lang.Object r14 = r9.getKey()
            X.6MW r14 = (X.AnonymousClass6MW) r14
            java.lang.Object r10 = r9.getValue()
            java.lang.String r10 = (java.lang.String) r10
            X.8ur r13 = new X.8ur
            r9 = r26
            r13.<init>(r3, r9)
            X.0qQ.A0B(r10, r5)
            r13.A00 = r10
            X.0qQ.A0B(r14, r7)
            android.content.res.Resources r12 = X.AnonymousClass7TF.A0A(r3)
            X.6MW[] r9 = new X.AnonymousClass6MW[]{r8, r4, r1}
            boolean r9 = X.03t.A0O(r14, r9)
            r11 = 2131165486(0x7f07012e, float:1.794519E38)
            if (r9 == 0) goto L_0x0418
            r11 = 2131165317(0x7f070085, float:1.7944848E38)
        L_0x0418:
            X.9xj r9 = X.C394219xj.$redex_init_class
            r9 = 2130970190(0x7f04064e, float:1.7549083E38)
            int r23 = X.AnonymousClass7TF.A03(r3, r9)
            boolean r10 = r14.A02
            r9 = 2131165206(0x7f070016, float:1.7944623E38)
            if (r10 == 0) goto L_0x042b
            r9 = 2131165207(0x7f070017, float:1.7944625E38)
        L_0x042b:
            int r17 = r12.getDimensionPixelSize(r9)
            int r16 = X.AnonymousClass7TE.A0E(r12)
            java.util.Locale r9 = X.AnonymousClass1Q2.A02()
            if (r10 == 0) goto L_0x0478
            java.lang.String r10 = r6.toUpperCase(r9)
        L_0x043d:
            X.0qQ.A07(r10)
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r10)
            r13.A0L(r9)
            int r11 = r12.getDimensionPixelSize(r11)
            X.0qq r10 = X.AnonymousClass0qo.A00(r3)
            X.0qm r9 = r14.A01
            X.AnonymousClass7TE.A1X(r9, r10, r13)
            float r11 = (float) r11
            r9 = r16
            float r10 = (float) r9
            r9 = r17
            float r9 = (float) r9
            X.AJB.A0B(r13, r11, r10, r9)
            android.text.Spannable r9 = r13.A0F
            X.0qQ.A07(r9)
            r19 = r3
            r20 = r12
            r21 = r9
            r22 = r14
            r24 = r16
            r25 = r17
            X.C394229xk.A00(r19, r20, r21, r22, r23, r24, r25)
            r15.add(r13)
            goto L_0x03df
        L_0x0478:
            java.lang.String r10 = r6.toLowerCase(r9)
            goto L_0x043d
        L_0x047d:
            X.7w8 r1 = new X.7w8
            r1.<init>(r3, r2, r15)
            X.9m5 r4 = new X.9m5
            r3 = r27
            r2 = r26
            r4.<init>(r6, r2, r3)
            r1.A03 = r4
            goto L_0x075f
        L_0x048f:
            java.lang.String r5 = r0.A02
            float r4 = r0.A00
            int r1 = r0.A01
            X.7w8 r1 = X.C379039Se.A01(r3, r2, r5, r4, r1)
            goto L_0x075f
        L_0x049b:
            X.9m6 r0 = (X.C387369m6) r0
            X.QP8 r4 = r0.A02
            if (r4 == 0) goto L_0x04a9
            int[] r1 = X.AnonymousClass91M.A02
            X.8ut r1 = new X.8ut
            r1.<init>(r3, r4, r0)
            return r1
        L_0x04a9:
            boolean r1 = X.C346897vw.A01(r2)
            if (r1 == 0) goto L_0x04b5
            X.7w8 r1 = X.AnonymousClass91M.A04(r3, r2, r0)
            goto L_0x075f
        L_0x04b5:
            X.7w8 r1 = X.AnonymousClass91M.A03(r3, r2, r0)
            goto L_0x075f
        L_0x04bb:
            X.WaJ r0 = (X.C19471WaJ) r0
            X.Upa r1 = new X.Upa
            r1.<init>(r3, r2, r0)
            r1.A04 = r4
            r1.invalidateSelf()
            return r1
        L_0x04c8:
            X.9m4 r0 = (X.C387349m4) r0
            com.instagram.model.venue.LocationDict r1 = r0.A00
            if (r1 == 0) goto L_0x04e7
            com.instagram.model.venue.Venue r4 = new com.instagram.model.venue.Venue
            r4.<init>()
            r4.A00 = r1
            java.lang.Integer r1 = r0.A01
            X.7w8 r1 = X.AHM.A01(r3, r2, r4, r1)
        L_0x04db:
            int r2 = r0.A00
            java.util.List r0 = r1.A08
            int r0 = r0.size()
            if (r2 >= r0) goto L_0x0786
            goto L_0x0769
        L_0x04e7:
            java.lang.String r0 = "locationDict"
            goto L_0x07f0
        L_0x04eb:
            X.Aeu r0 = (X.C40606Aeu) r0
            java.lang.String r8 = r0.A06
            if (r8 == 0) goto L_0x0502
            int r1 = r8.length()
            if (r1 == 0) goto L_0x0502
            float r7 = r0.A01
            int r2 = r0.A03
            int r1 = r0.A04
            X.A6c r6 = new X.A6c
            r6.<init>(r8, r7, r2, r1)
        L_0x0502:
            java.lang.String r8 = r0.A05
            java.lang.String r1 = r0.A07
            float r7 = r0.A00
            float r2 = r0.A02
            r12 = 0
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r11 = r8.toUpperCase(r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r13 = r1.toUpperCase(r0)
            int r20 = X.AnonymousClass7TG.A05(r3)
            int r23 = X.AnonymousClass7TG.A04(r3)
            int r22 = X.AnonymousClass7TG.A05(r3)
            int r24 = X.AnonymousClass7TG.A04(r3)
            int r25 = X.AnonymousClass7TG.A07(r3)
            r0 = 2130970169(0x7f040639, float:1.754904E38)
            int[] r14 = X.AnonymousClass7TG.A1b(r3, r0)
            r0 = 2130970194(0x7f040652, float:1.7549091E38)
            int[] r16 = X.AnonymousClass7TG.A1b(r3, r0)
            android.graphics.Typeface r9 = X.AnonymousClass7TG.A0O(r3)
            r0 = 2131100285(0x7f06027d, float:1.7812947E38)
            int r26 = r3.getColor(r0)
            int r21 = X.AnonymousClass7TE.A09(r3)
            r0 = 2131100047(0x7f06018f, float:1.7812464E38)
            int r27 = r3.getColor(r0)
            X.9pm r1 = new X.9pm
            r15 = r14
            r17 = r16
            r18 = r7
            r19 = r2
            r28 = r5
            r29 = r5
            r30 = r5
            r31 = r4
            r32 = r5
            r7 = r1
            r8 = r3
            r10 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r1
        L_0x056d:
            X.WaM r0 = (X.C19474WaM) r0
            X.8v6 r1 = new X.8v6
            r1.<init>(r3, r0)
            return r1
        L_0x0575:
            X.WaH r0 = (X.C19469WaH) r0
            X.8v8 r1 = new X.8v8
            r1.<init>(r3, r2, r0)
            return r1
        L_0x057d:
            X.Aeg r0 = (X.C40592Aeg) r0
            com.instagram.user.model.UpcomingEvent r0 = r0.A00
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            X.5uw r1 = new X.5uw
            r9 = r8
            r4 = r1
            r5 = r3
            r6 = r2
            r7 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return r1
        L_0x058e:
            X.6tZ r0 = (X.C321096tZ) r0
            r1 = 2
            X.0qQ.A0B(r0, r1)
            java.lang.String r11 = r0.A09
            java.lang.String r10 = r0.A08
            java.lang.String r9 = r0.A07
            float r8 = r0.A00
            int r5 = r0.A02
            int r4 = r0.A05
            int r1 = r0.A01
            X.6tX r7 = new X.6tX
            r7.<init>(r5, r4, r1)
            int r6 = r0.A03
            int r5 = r0.A04
            boolean r4 = r0.A0A
            java.lang.Integer r0 = r0.A06
            X.6tR r1 = new X.6tR
            r12 = r0
            r13 = r11
            r14 = r10
            r15 = r9
            r16 = r8
            r17 = r6
            r18 = r5
            r19 = r4
            r8 = r1
            r9 = r3
            r10 = r2
            r11 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        L_0x05c5:
            X.JzL r0 = (X.C61227JzL) r0
            X.UpV r1 = new X.UpV
            r1.<init>(r3, r0)
            return r1
        L_0x05cd:
            X.Aee r0 = (X.C40590Aee) r0
            X.UpU r1 = new X.UpU
            r1.<init>(r3, r0)
            X.6M4 r0 = r1.A00
            r0.A01()
            return r1
        L_0x05da:
            X.Aex r0 = (X.C40609Aex) r0
            X.8vE r1 = new X.8vE
            r1.<init>(r3, r0)
            return r1
        L_0x05e2:
            com.instagram.reels.prompt.model.PromptStickerModel r0 = (com.instagram.reels.prompt.model.PromptStickerModel) r0
            r8 = 6
            r1 = 2
            r7 = 7
            X.0qQ.A0B(r0, r1)
            com.instagram.api.schemas.StoryPromptType r1 = r0.A03()
            int r6 = r1.ordinal()
            if (r6 == r8) goto L_0x0659
            if (r6 == r7) goto L_0x0652
            r1 = 9
            if (r6 != r1) goto L_0x0674
            java.lang.String r7 = "restyle_sticker_default"
            java.lang.String r6 = "restyle_sticker_dominant_color"
            java.lang.String r10 = "restyle_sticker_with_facepile_style"
        L_0x0600:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            com.instagram.reels.prompt.model.PromptStickerModel r1 = r0.A04()
            r1.A0A(r7)
            X.9q0 r9 = new X.9q0
            r9.<init>(r3, r2, r1, r4)
            com.instagram.reels.prompt.model.PromptStickerModel r1 = r0.A04()
            r1.A0A(r6)
            X.9q0 r4 = new X.9q0
            r4.<init>(r3, r2, r1, r5)
            X.0Tu r1 = X.0Tu.A05
            r6 = 36319918495244032(0x8108c6002e1f00, double:3.0322009327408235E-306)
            boolean r1 = X.182.A06(r1, r2, r6)
            if (r1 == 0) goto L_0x063e
            com.instagram.reels.prompt.model.PromptStickerModel r1 = r0.A04()
            r1.A0A(r10)
            X.9q0 r0 = new X.9q0
            r0.<init>(r3, r2, r1, r5)
            r8.add(r0)
        L_0x0638:
            X.7w8 r1 = new X.7w8
            r1.<init>(r3, r2, r8)
            return r1
        L_0x063e:
            boolean r0 = r0.A0J()
            if (r0 != 0) goto L_0x064b
            r8.add(r4)
            r8.add(r9)
            goto L_0x0638
        L_0x064b:
            r8.add(r9)
            r8.add(r4)
            goto L_0x0638
        L_0x0652:
            java.lang.String r7 = "backdrop_sticker_default"
            java.lang.String r6 = "backdrop_sticker_dominant_color"
            java.lang.String r10 = "backdrop_sticker_with_facepile_style"
            goto L_0x0600
        L_0x0659:
            com.instagram.reels.prompt.model.PromptStickerModel r1 = r0.A04()
            r0 = -1
            java.lang.String r0 = X.0nH.A0E(r0)
            r1.A09(r0)
            java.lang.String r0 = "add_yours_backdrop_sticker_default"
            r1.A0A(r0)
            X.9q0 r0 = new X.9q0
            r0.<init>(r3, r2, r1, r4)
            java.util.List r8 = X.AnonymousClass7TE.A1I(r0)
            goto L_0x0638
        L_0x0674:
            java.lang.String r0 = "Unsupported prompt sticker type"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x067b:
            com.instagram.reels.prompt.model.PromptStickerModel r0 = (com.instagram.reels.prompt.model.PromptStickerModel) r0
            r14 = 112(0x70, float:1.57E-43)
            X.8Nk r1 = new X.8Nk
            r9 = r1
            r10 = r3
            r11 = r2
            r12 = r0
            r13 = r8
            r15 = r5
            r16 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return r1
        L_0x068d:
            com.instagram.reels.prompt.model.PromptStickerModel r0 = (com.instagram.reels.prompt.model.PromptStickerModel) r0
            X.KWF r1 = new X.KWF
            r1.<init>(r3, r2, r0, r8)
            return r1
        L_0x0695:
            com.instagram.reels.prompt.model.PromptStickerModel r0 = (com.instagram.reels.prompt.model.PromptStickerModel) r0
            X.KWE r1 = new X.KWE
            r1.<init>(r3, r2, r0)
            return r1
        L_0x069d:
            com.instagram.reels.prompt.model.PromptStickerModel r0 = (com.instagram.reels.prompt.model.PromptStickerModel) r0
            boolean r1 = r0.A0M()
            if (r1 == 0) goto L_0x06bb
            X.80e r1 = X.C3493880e.A00
            boolean r16 = X.0qQ.A0K(r9, r1)
            r14 = 48
            X.8Nk r1 = new X.8Nk
            r9 = r1
            r10 = r3
            r11 = r2
            r12 = r0
            r13 = r8
            r15 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
        L_0x06b8:
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            return r1
        L_0x06bb:
            X.JZg r1 = new X.JZg
            r1.<init>(r3, r2, r0, r8)
            goto L_0x06b8
        L_0x06c1:
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r0 = (com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel) r0
            boolean r6 = r0.A01
            r8 = 2
            java.util.ArrayList r1 = X.C17164VKt.A07
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r10 = r1.iterator()
            if (r6 == 0) goto L_0x070a
        L_0x06d2:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x074c
            java.lang.Object r9 = r10.next()
            X.Tsv r9 = (X.C14272Tsv) r9
            int[] r1 = X.C14276Tsz.A02(r9)
            int r1 = r1.length
            if (r1 != r8) goto L_0x0708
            int[] r1 = X.C14276Tsz.A02(r9)
            r1 = r1[r5]
            java.lang.String r6 = X.0nH.A0E(r1)
            int[] r1 = X.C14276Tsz.A02(r9)
            r1 = r1[r4]
            java.lang.String r1 = X.0nH.A0E(r1)
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r9 = r0.A00(r6, r1)
        L_0x06fd:
            X.UkW r6 = X.C15906UkW.A00
            X.U1S r1 = new X.U1S
            r1.<init>(r3, r2, r9, r6)
            r7.add(r1)
            goto L_0x06d2
        L_0x0708:
            r9 = r0
            goto L_0x06fd
        L_0x070a:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0740
            java.lang.Object r9 = r10.next()
            X.Tsv r9 = (X.C14272Tsv) r9
            int[] r1 = X.C14276Tsz.A02(r9)
            int r1 = r1.length
            if (r1 != r8) goto L_0x073e
            int[] r1 = X.C14276Tsz.A02(r9)
            r1 = r1[r5]
            java.lang.String r6 = X.0nH.A0E(r1)
            int[] r1 = X.C14276Tsz.A02(r9)
            r1 = r1[r4]
            java.lang.String r1 = X.0nH.A0E(r1)
            com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel r6 = r0.A00(r6, r1)
        L_0x0735:
            X.U1R r1 = new X.U1R
            r1.<init>(r3, r2, r6)
            r7.add(r1)
            goto L_0x070a
        L_0x073e:
            r6 = r0
            goto L_0x0735
        L_0x0740:
            java.util.List r4 = X.00k.A0a(r7)
            X.7w8 r1 = new X.7w8
            r1.<init>(r3, r2, r4)
            r1.A03 = r0
            goto L_0x075f
        L_0x074c:
            java.util.List r5 = X.00k.A0a(r7)
            X.7w8 r1 = new X.7w8
            r1.<init>(r3, r2, r5)
            r1.A03 = r0
            X.9lo r5 = new X.9lo
            r5.<init>(r3, r2, r1, r4)
            r1.A0C(r5)
        L_0x075f:
            int r2 = r0.A00
            java.util.List r0 = r1.A08
            int r0 = r0.size()
            if (r2 >= r0) goto L_0x0786
        L_0x0769:
            r1.A0B(r2)
            return r1
        L_0x076d:
            X.0qQ.A0B(r2, r5)
            X.0Tu r1 = X.0Tu.A05
            r4 = 36323225617050631(0x810bc800002c07, double:3.0342923698880273E-306)
            boolean r1 = X.182.A06(r1, r2, r4)
            X.82f r0 = (X.AnonymousClass82f) r0
            if (r1 == 0) goto L_0x0787
            X.9ne r1 = new X.9ne
            r1.<init>(r3, r2, r0)
        L_0x0784:
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
        L_0x0786:
            return r1
        L_0x0787:
            X.9X9 r1 = new X.9X9
            r1.<init>(r3, r0)
            goto L_0x0784
        L_0x078d:
            X.WaI r0 = (X.C19470WaI) r0
            X.UpZ r1 = new X.UpZ
            r1.<init>(r3, r0, r4, r5)
            return r1
        L_0x0795:
            com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel r0 = (com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel) r0
            X.9XD r1 = new X.9XD
            r1.<init>(r0)
            return r1
        L_0x079d:
            X.Aef r0 = (X.C40591Aef) r0
            X.9pn r1 = new X.9pn
            r1.<init>(r3, r0)
            return r1
        L_0x07a5:
            X.9m3 r0 = (X.C387339m3) r0
            X.7w8 r1 = X.C39576A0s.A00(r3, r2, r0, r8)
            return r1
        L_0x07ac:
            X.Aej r0 = (X.C40595Aej) r0
            X.7w5 r1 = new X.7w5
            r1.<init>(r3, r0, r8)
            return r1
        L_0x07b4:
            X.Aeq r0 = (X.C40602Aeq) r0
            X.KWD r1 = new X.KWD
            r1.<init>(r3, r0, r8)
            return r1
        L_0x07bc:
            com.instagram.reels.musicpick.model.MusicPickStickerModel r0 = (com.instagram.reels.musicpick.model.MusicPickStickerModel) r0
            X.7w6 r1 = new X.7w6
            r1.<init>(r3, r2, r0, r8)
            return r1
        L_0x07c4:
            X.LwM r0 = (X.LwM) r0
            X.8v7 r1 = new X.8v7
            r1.<init>(r3, r0)
            return r1
        L_0x07cc:
            X.Aeh r0 = (X.C40593Aeh) r0
            X.9pu r1 = new X.9pu
            r1.<init>(r3, r0)
            return r1
        L_0x07d4:
            X.Ael r0 = (X.C40597Ael) r0
            com.instagram.common.gallery.Medium r4 = r0.A02
            if (r4 == 0) goto L_0x07ee
            int r2 = r0.A01
            int r0 = r0.A00
            r5 = 0
            X.9po r1 = new X.9po
            r7 = r5
            r9 = r5
            r11 = r5
            r13 = r5
            r15 = r2
            r16 = r0
            r2 = r1
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16)
            return r1
        L_0x07ee:
            java.lang.String r0 = "medium"
        L_0x07f0:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x07f8:
            X.Aew r0 = (X.C40608Aew) r0
            int r1 = X.C39898AIf.A01(r3, r6)
            float r4 = (float) r1
            int r1 = X.C39898AIf.A00(r3, r6)
            float r2 = (float) r1
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            X.8bp r1 = new X.8bp
            r5 = r1
            r6 = r3
            r7 = r0
            r9 = r4
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return r1
        L_0x0811:
            java.lang.String r0 = "getQuestionStickerModel"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0818:
            X.Aei r0 = (X.C40594Aei) r0
            com.instagram.common.gallery.Medium r2 = r0.A00
            if (r2 == 0) goto L_0x0826
            java.lang.String r0 = r0.A01
            X.9pp r1 = new X.9pp
            r1.<init>(r3, r2, r0)
            return r1
        L_0x0826:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39900AIi.A00(android.content.Context, com.instagram.common.session.UserSession, X.4yO, X.6tY, X.50v, java.lang.Integer, java.lang.Integer, java.lang.String, boolean):android.graphics.drawable.Drawable");
    }
}
