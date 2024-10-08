package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.AeW  reason: case insensitive filesystem */
public final class C40584AeW implements MU6 {
    public final Context A00;
    public final UserSession A01;

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f3, code lost:
        if (r3.A0m() == false) goto L_0x00f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object FIH(X.LP8 r19, X.AnonymousClass4D7 r20) {
        /*
            r18 = this;
            java.lang.String r4 = "ConvertPhotoToVideoStep"
            r5 = r19
            X.3Q2 r3 = r5.A0D
            boolean r0 = r3.A10()
            if (r0 == 0) goto L_0x0173
            r2 = 0
            boolean r0 = X.C379909Vu.A05(r3)
            if (r0 != 0) goto L_0x0173
            boolean r0 = X.C379909Vu.A06(r3)
            if (r0 != 0) goto L_0x0173
            r7 = r18
            com.instagram.common.session.UserSession r11 = r7.A01
            boolean r1 = X.AJ8.A08(r11, r3)
            boolean r0 = X.C379909Vu.A07(r3)
            if (r0 == 0) goto L_0x0038
            java.util.EnumSet r0 = com.instagram.pendingmedia.model.constants.ShareType.A02
            boolean r0 = r3.A15(r0)
            if (r0 == 0) goto L_0x0031
            if (r1 != 0) goto L_0x0167
        L_0x0031:
            r3.A5r = r2
            java.util.Set r0 = r3.A4t
            r0.clear()
        L_0x0038:
            if (r1 != 0) goto L_0x0167
            boolean r0 = X.C379909Vu.A04(r3)
            if (r0 == 0) goto L_0x0049
            boolean r0 = r3.A5q
            if (r0 != 0) goto L_0x0049
            java.util.Set r0 = r3.A4t
            r0.clear()
        L_0x0049:
            X.3QF r0 = r3.A1T
            r10 = 1
            r0.A03 = r10
            java.lang.String r8 = r3.A33     // Catch:{ Exception -> 0x014a }
            java.lang.String r9 = "Required value was null."
            if (r8 == 0) goto L_0x0145
            r1 = 46
            int r0 = r8.length()     // Catch:{ Exception -> 0x014a }
            int r0 = r0 + -1
            int r0 = X.00l.A05(r8, r1, r0)     // Catch:{ Exception -> 0x014a }
            java.lang.String r1 = r8.substring(r2, r0)     // Catch:{ Exception -> 0x014a }
            X.0qQ.A07(r1)     // Catch:{ Exception -> 0x014a }
            java.lang.String r0 = ".mp4"
            java.lang.String r14 = X.002.A0R(r1, r0)     // Catch:{ Exception -> 0x014a }
            boolean r0 = r3.A60     // Catch:{ Exception -> 0x014a }
            if (r0 == 0) goto L_0x00a0
            X.4aT r0 = r3.A1K     // Catch:{ Exception -> 0x014a }
            if (r0 == 0) goto L_0x00a0
            boolean r0 = r3.A5D     // Catch:{ Exception -> 0x014a }
            if (r0 != 0) goto L_0x00a0
            boolean r0 = r3.A0m()     // Catch:{ Exception -> 0x014a }
            if (r0 != 0) goto L_0x00a0
            com.instagram.pendingmedia.model.constants.ShareType r1 = r3.A0E()     // Catch:{ Exception -> 0x014a }
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE     // Catch:{ Exception -> 0x014a }
            if (r1 == r0) goto L_0x008f
            com.instagram.pendingmedia.model.constants.ShareType r1 = r3.A0E()     // Catch:{ Exception -> 0x014a }
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE     // Catch:{ Exception -> 0x014a }
            if (r1 != r0) goto L_0x00a0
        L_0x008f:
            java.io.File r0 = X.AnonymousClass7TE.A0t(r14)     // Catch:{ Exception -> 0x014a }
            r0.createNewFile()     // Catch:{ Exception -> 0x014a }
            int r0 = X.AJ8.A01(r3)     // Catch:{ Exception -> 0x014a }
            r3.A0j(r14, r0, r10)     // Catch:{ Exception -> 0x014a }
            X.KVm r0 = X.C62013KVm.A00     // Catch:{ Exception -> 0x014a }
            return r0
        L_0x00a0:
            boolean r0 = r3.A60     // Catch:{ Exception -> 0x014a }
            if (r0 == 0) goto L_0x00cc
            X.4aT r0 = r3.A1K     // Catch:{ Exception -> 0x014a }
            if (r0 == 0) goto L_0x00cc
            boolean r0 = r3.A0m()     // Catch:{ Exception -> 0x014a }
            if (r0 != 0) goto L_0x00cc
            com.instagram.pendingmedia.model.constants.ShareType r1 = r3.A0E()     // Catch:{ Exception -> 0x014a }
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_STORY_SHARE     // Catch:{ Exception -> 0x014a }
            if (r1 == r0) goto L_0x00be
            com.instagram.pendingmedia.model.constants.ShareType r1 = r3.A0E()     // Catch:{ Exception -> 0x014a }
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE     // Catch:{ Exception -> 0x014a }
            if (r1 != r0) goto L_0x00cc
        L_0x00be:
            X.0Tu r6 = X.0Tu.A05     // Catch:{ Exception -> 0x014a }
            r0 = 36319235592494106(0x81082700011c1a, double:3.0317690622919416E-306)
            boolean r0 = X.182.A06(r6, r11, r0)     // Catch:{ Exception -> 0x014a }
            if (r0 == 0) goto L_0x00cc
            goto L_0x008f
        L_0x00cc:
            android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeFile(r8)     // Catch:{ Exception -> 0x014a }
            if (r13 == 0) goto L_0x0140
            int r9 = r3.A0S     // Catch:{ Exception -> 0x014a }
            int r8 = r3.A0R     // Catch:{ Exception -> 0x014a }
            int r6 = X.AJ8.A01(r3)     // Catch:{ Exception -> 0x014a }
            com.instagram.pendingmedia.model.constants.ShareType r1 = r3.A0E()     // Catch:{ Exception -> 0x014a }
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE     // Catch:{ Exception -> 0x014a }
            if (r1 == r0) goto L_0x00ea
            com.instagram.pendingmedia.model.constants.ShareType r1 = r3.A0E()     // Catch:{ Exception -> 0x014a }
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE     // Catch:{ Exception -> 0x014a }
            if (r1 != r0) goto L_0x00f5
        L_0x00ea:
            boolean r0 = r3.A5D     // Catch:{ Exception -> 0x014a }
            if (r0 != 0) goto L_0x00f5
            boolean r0 = r3.A0m()     // Catch:{ Exception -> 0x014a }
            r12 = 1
            if (r0 != 0) goto L_0x00f6
        L_0x00f5:
            r12 = 0
        L_0x00f6:
            android.content.Context r7 = r7.A00     // Catch:{ Exception -> 0x014a }
            float r1 = (float) r9     // Catch:{ Exception -> 0x014a }
            float r0 = (float) r8     // Catch:{ Exception -> 0x014a }
            float r1 = r1 / r0
            int r0 = X.C63472Kxb.A00(r7, r11, r9, r12, r2)     // Catch:{ Exception -> 0x014a }
            android.graphics.Point r7 = X.AEW.A00(r1, r0)     // Catch:{ Exception -> 0x014a }
            float r15 = (float) r6     // Catch:{ Exception -> 0x014a }
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r15 = r15 / r0
            X.SON r12 = new X.SON     // Catch:{ Exception -> 0x014a }
            r12.<init>()     // Catch:{ Exception -> 0x014a }
            int r1 = r7.x     // Catch:{ Exception -> 0x014a }
            int r0 = r7.y     // Catch:{ Exception -> 0x014a }
            X.0qQ.A0B(r14, r10)     // Catch:{ Exception -> 0x014a }
            r16 = r1
            r17 = r0
            r12.A02(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x014a }
            boolean r0 = r3.A60     // Catch:{ Exception -> 0x014a }
            if (r0 != 0) goto L_0x0130
            com.instagram.camera.effect.models.CameraAREffect r0 = r3.A10     // Catch:{ Exception -> 0x014a }
            if (r0 != 0) goto L_0x0130
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r0 = r3.A16     // Catch:{ Exception -> 0x014a }
            if (r0 == 0) goto L_0x013e
            int r1 = r0.A07     // Catch:{ Exception -> 0x014a }
            int r0 = r0.A06     // Catch:{ Exception -> 0x014a }
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r0 = X.C364738lv.A00(r9, r8, r1, r0, r2)     // Catch:{ Exception -> 0x014a }
        L_0x012e:
            r3.A16 = r0     // Catch:{ Exception -> 0x014a }
        L_0x0130:
            int r0 = r7.x     // Catch:{ Exception -> 0x014a }
            r3.A0H = r0     // Catch:{ Exception -> 0x014a }
            int r0 = r7.y     // Catch:{ Exception -> 0x014a }
            r3.A0G = r0     // Catch:{ Exception -> 0x014a }
            r3.A0j(r14, r6, r2)     // Catch:{ Exception -> 0x014a }
            X.KVm r0 = X.C62013KVm.A00     // Catch:{ Exception -> 0x014a }
            return r0
        L_0x013e:
            r0 = 0
            goto L_0x012e
        L_0x0140:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)     // Catch:{ Exception -> 0x014a }
            goto L_0x0149
        L_0x0145:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)     // Catch:{ Exception -> 0x014a }
        L_0x0149:
            throw r0     // Catch:{ Exception -> 0x014a }
        L_0x014a:
            r2 = move-exception
            java.lang.String r1 = "failed_to_convert_photo_to_video"
            X.0KC.A0F(r4, r1, r2)
            X.37k r4 = r5.A0E
            X.55S r5 = X.AnonymousClass55S.A0D
            java.lang.String r8 = "UnknownException"
            r6 = r3
            r7 = r1
            r9 = r2
            r4.EG1(r5, r6, r7, r8, r9)
            r0 = 0
            X.55U r1 = X.AnonymousClass55V.A01(r5, r1, r0, r2)
            X.KVk r0 = new X.KVk
            r0.<init>(r1)
            return r0
        L_0x0167:
            X.3QF r2 = r3.A1T
            r0 = 2
            r2.A03 = r0
            int r0 = X.AJ8.A01(r3)
            long r0 = (long) r0
            r2.A05 = r0
        L_0x0173:
            X.KVl r0 = X.C62012KVl.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40584AeW.FIH(X.LP8, X.4D7):java.lang.Object");
    }

    public final String getName() {
        return "ConvertPhotoToVideo";
    }

    public C40584AeW(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
