package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

public final class LSC {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final UserSession A09;
    public final TargetViewSizeProvider A0A;
    public final String A0B;

    public static final int A00(LSC lsc, float f) {
        return AnonymousClass7TE.A06(-1.0f, ((float) (lsc.A01 + (lsc.A02 / 2))) - (f / 2.0f));
    }

    public static final C310416b1 A01(float f, int i, int i2) {
        C39890ADo aDo = new C39890ADo();
        aDo.A04 = f;
        aDo.A06 = new C16338Ut8(17, (float) i, (float) i2);
        return new C310416b1(aDo);
    }

    public LSC(Context context, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, String str) {
        this.A08 = context;
        this.A09 = userSession;
        this.A0A = targetViewSizeProvider;
        this.A0B = str;
        this.A02 = AnonymousClass7TG.A02(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_width);
        this.A05 = dimensionPixelSize;
        this.A07 = context.getResources().getDimensionPixelSize(R.dimen.browser_error_screen_description_width);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.challenge_winners_sticker_1_winner_column_height);
        this.A06 = dimensionPixelSize2;
        this.A03 = JTR.A06(context);
        this.A04 = DbY.A01(context);
        this.A00 = dimensionPixelSize2;
        this.A01 = dimensionPixelSize;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010d, code lost:
        if (r8 != 2) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.LinkedHashMap A02(X.C61037Jvb r15, X.LSC r16, com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel r17, java.lang.Integer r18, int r19) {
        /*
            int r8 = r18.intValue()
            r0 = 2
            r7 = 1
            r9 = r16
            if (r8 == r7) goto L_0x0022
            if (r8 == r0) goto L_0x0022
            r0 = 3
            if (r8 == r0) goto L_0x0025
            r0 = 0
            if (r8 == r0) goto L_0x001a
            r0 = 4
            if (r8 == r0) goto L_0x001a
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x001a:
            int r3 = r9.A00
            int r0 = r9.A02
            int r3 = r3 - r0
            int r3 = r3 - r19
            goto L_0x0027
        L_0x0022:
            int r3 = r9.A07
            goto L_0x0027
        L_0x0025:
            int r3 = r9.A00
        L_0x0027:
            android.content.Context r14 = r9.A08
            r10 = r17
            com.instagram.common.typedurl.ImageUrl r2 = r10.A00
            int r1 = r9.A01
            java.lang.String r0 = r9.A0B
            X.8vA r13 = new X.8vA
            r18 = r1
            r19 = r3
            r16 = r2
            r17 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            int r0 = r13.getIntrinsicWidth()
            int r11 = r13.getIntrinsicHeight()
            r2 = 0
            r6 = 4
            r5 = 3
            r12 = 2
            if (r8 == r7) goto L_0x0100
            if (r8 == r12) goto L_0x0100
            if (r8 == r5) goto L_0x0100
            if (r8 == r2) goto L_0x00f9
            if (r8 != r6) goto L_0x0121
            r3 = 0
        L_0x0055:
            float r1 = (float) r11
            int r0 = r9.A00
            float r0 = (float) r0
            float r1 = X.C51967G9n.A00(r0, r1)
        L_0x005d:
            int r2 = X.AnonymousClass1GB.A01(r1)
        L_0x0061:
            r0 = 1065353216(0x3f800000, float:1.0)
            X.6b1 r0 = A01(r0, r3, r2)
            r1 = 0
            X.0eP[] r0 = X.DbW.A1b(r13, r0)
            java.util.LinkedHashMap r3 = X.0Yt.A07(r0)
            com.instagram.user.model.User r4 = r10.A01
            if (r4 == 0) goto L_0x00c2
            com.instagram.common.session.UserSession r2 = r9.A09
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r9.A0A
            int r0 = X.AnonymousClass81W.A00(r0)
            int r0 = r0 * 2
            X.7w8 r10 = X.C39570A0m.A00(r14, r2, r4, r0, r7)
            int r12 = r10.getIntrinsicWidth()
            int r2 = r10.getIntrinsicHeight()
            int r0 = r9.A03
            float r4 = (float) r0
            float r11 = (float) r2
            float r4 = r4 / r11
            float r11 = r11 * r4
            float r2 = (float) r12
            float r2 = r2 * r4
            r12 = 2
            if (r8 == r7) goto L_0x00c8
            if (r8 == r12) goto L_0x00c8
            if (r8 == r5) goto L_0x00c8
            if (r8 == r1) goto L_0x00c3
            if (r8 != r6) goto L_0x011c
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = r9.A01
            float r0 = (float) r0
            float r0 = r0 - r2
            float r1 = r1 * r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            int r6 = r9.A04
            float r0 = (float) r6
            float r1 = r1 + r0
            int r2 = X.AnonymousClass1GB.A01(r1)
        L_0x00af:
            int r0 = r9.A00
            float r0 = (float) r0
            float r0 = X.C51967G9n.A00(r0, r11)
            int r1 = X.AnonymousClass1GB.A01(r0)
            int r1 = r1 - r6
        L_0x00bb:
            X.6b1 r0 = A01(r4, r2, r1)
            r3.put(r10, r0)
        L_0x00c2:
            return r3
        L_0x00c3:
            int r2 = A00(r9, r2)
            goto L_0x00d2
        L_0x00c8:
            int r0 = r9.A02
            float r0 = (float) r0
            float r2 = r2 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            int r2 = X.JTO.A05(r2, r0)
        L_0x00d2:
            int r6 = r9.A04
            int r2 = r2 + r6
            if (r8 == r7) goto L_0x00e2
            if (r8 == r12) goto L_0x00af
            if (r8 == r5) goto L_0x00af
            if (r8 == r1) goto L_0x00af
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00e2:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = r9.A00
            float r0 = (float) r0
            float r0 = r0 - r11
            float r1 = r1 * r0
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = X.JTO.A05(r1, r0)
            int r0 = r9.A07
            int r1 = r1 + r0
            int r1 = r1 - r6
            int r0 = X.AnonymousClass1GB.A01(r11)
            int r1 = r1 - r0
            goto L_0x00bb
        L_0x00f9:
            float r0 = (float) r0
            int r3 = A00(r9, r0)
            goto L_0x0055
        L_0x0100:
            float r1 = (float) r0
            int r0 = r9.A02
            float r0 = (float) r0
            float r1 = r1 + r0
            r4 = 1073741824(0x40000000, float:2.0)
            int r3 = X.JTO.A05(r1, r4)
            if (r8 == r7) goto L_0x0111
            if (r8 == r12) goto L_0x0055
            goto L_0x0061
        L_0x0111:
            float r2 = (float) r11
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = r9.A00
            float r0 = (float) r0
            float r0 = r0 - r2
            float r1 = r1 * r0
            float r1 = r1 / r4
            goto L_0x005d
        L_0x011c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0121:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LSC.A02(X.Jvb, X.LSC, com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel, java.lang.Integer, int):java.util.LinkedHashMap");
    }
}
