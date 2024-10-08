package X;

import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.751  reason: invalid class name */
public abstract class AnonymousClass751 {
    /* JADX WARNING: type inference failed for: r2v0, types: [X.1Xx, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r0 != null) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.1Xj A00(X.C254703su r15) {
        /*
            com.google.common.collect.ImmutableList r0 = r15.A0H()
            r4 = 0
            if (r0 == 0) goto L_0x0024
            java.lang.Object r7 = X.00k.A0J(r0)
            X.3tC r7 = (X.C254873tC) r7
        L_0x000d:
            java.lang.String r5 = A01(r15)
            X.3tC r0 = X.C3266377o.A01(r15)
            if (r0 == 0) goto L_0x0019
            java.lang.String r4 = r0.A11
        L_0x0019:
            java.lang.String r3 = "GenericFBAttachmentHelper.createClipsMediaFromAttachment"
            r9 = 0
            if (r7 != 0) goto L_0x0026
            java.lang.String r0 = "Failed to find non-null item in message.genericShareItems"
            X.0wb.A03(r3, r0)
            return r9
        L_0x0024:
            r7 = r4
            goto L_0x000d
        L_0x0026:
            X.1Xx r2 = new X.1Xx
            r2.<init>()
            com.instagram.model.mediasize.GifUrlImpl r0 = r7.A0Z
            if (r0 == 0) goto L_0x0042
            com.instagram.common.typedurl.GifUrlLoggingExtras r1 = r0.A00
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = r1.A01
            if (r0 != 0) goto L_0x0038
        L_0x0037:
            r0 = r5
        L_0x0038:
            r2.A5j = r0
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "Failed to create media, media.id is null"
            X.0wb.A03(r3, r0)
            return r9
        L_0x0042:
            r1 = r9
            goto L_0x0037
        L_0x0044:
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "mismatch in mediaId"
            X.0wb.A03(r3, r0)
        L_0x004f:
            com.instagram.model.mediasize.GifUrlImpl r5 = r7.A0Z
            if (r5 != 0) goto L_0x0058
            java.lang.String r0 = "xma_clips.playableUrl is null"
            X.0wb.A03(r3, r0)
        L_0x0058:
            com.instagram.model.mediasize.ExtendedImageUrl r6 = r7.A0X
            if (r6 != 0) goto L_0x0061
            java.lang.String r0 = "xma_clips.previewUrl is null"
            X.0wb.A03(r3, r0)
        L_0x0061:
            java.lang.String r0 = r7.A0x
            r2.A6M = r0
            if (r5 == 0) goto L_0x0127
            java.lang.Float r0 = r5.A02
            float r0 = r0.floatValue()
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A4n = r0
            java.lang.Float r0 = r5.A03
            float r0 = r0.floatValue()
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A4o = r0
            X.1iA r0 = X.1iA.A0a
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A4m = r0
            if (r6 != 0) goto L_0x0147
            r6 = r9
        L_0x008e:
            r2.EZf(r6)
            if (r5 == 0) goto L_0x0125
            java.lang.Float r0 = r5.A02
            float r0 = r0.floatValue()
            int r0 = (int) r0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.String r15 = r5.A09
            java.lang.Float r0 = r5.A03
            float r0 = r0.floatValue()
            int r0 = (int) r0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            com.instagram.model.mediasize.VideoVersion r8 = new com.instagram.model.mediasize.VideoVersion
            r11 = r9
            r13 = r9
            r14 = r9
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            java.util.List r0 = java.util.Collections.singletonList(r8)
            X.0qQ.A07(r0)
        L_0x00ba:
            r2.EqT(r0)
            java.lang.String r0 = "clips"
            r2.A68 = r0
            if (r1 == 0) goto L_0x00cb
            java.lang.Long r0 = r1.A00
            if (r0 == 0) goto L_0x00cb
            java.lang.String r9 = r0.toString()
        L_0x00cb:
            boolean r0 = X.0mp.A0B(r9)
            r8 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00d6
            if (r9 != 0) goto L_0x00fb
        L_0x00d6:
            java.lang.String r7 = r2.A5j
            if (r7 == 0) goto L_0x011f
            java.lang.String r6 = "_"
            r5 = 0
            boolean r0 = X.00l.A0d(r7, r6, r5)
            if (r0 == 0) goto L_0x011f
            java.lang.String[] r0 = new java.lang.String[]{r6}
            java.util.List r0 = X.00l.A0R(r7, r0, r5)
            java.lang.Object r9 = r0.get(r8)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x011f
            boolean r0 = X.0mp.A0B(r9)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x011f
        L_0x00fb:
            com.instagram.user.model.User r0 = new com.instagram.user.model.User
            r0.<init>(r9, r4)
            r2.A2Y = r0
        L_0x0102:
            if (r1 == 0) goto L_0x0119
            java.lang.String r1 = r1.A02
            if (r1 == 0) goto L_0x0119
            boolean r0 = X.0mp.A0B(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0119
            r2.A5z = r1
        L_0x0112:
            X.1Xv r0 = X.1Xj.A0h
            X.1Xj r9 = X.1Xv.A02(r2)
            return r9
        L_0x0119:
            java.lang.String r0 = "Organic Tracking Token, a necessary logging extra for video playback, is null."
            X.0wb.A03(r3, r0)
            goto L_0x0112
        L_0x011f:
            java.lang.String r0 = "Author Id, a necessary logging extra for video playback, is null."
            X.0wb.A03(r3, r0)
            goto L_0x0102
        L_0x0125:
            r0 = r9
            goto L_0x00ba
        L_0x0127:
            if (r6 == 0) goto L_0x015d
            int r0 = r6.getHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A4n = r0
            int r0 = r6.getWidth()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A4o = r0
            X.1iA r0 = X.1iA.A0Q
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A4m = r0
        L_0x0147:
            com.instagram.model.mediasize.ExtendedImageUrl r0 = new com.instagram.model.mediasize.ExtendedImageUrl
            r0.<init>(r6)
            java.util.List r10 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r10)
            com.instagram.model.mediasize.ImageInfoImpl r6 = new com.instagram.model.mediasize.ImageInfoImpl
            r7 = r9
            r8 = r9
            r11 = r9
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x008e
        L_0x015d:
            java.lang.String r0 = "Failed to create media, both xma_clips.playableUrl is null and xma_clips.previewUrl is null"
            X.0wb.A03(r3, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass751.A00(X.3su):X.1Xj");
    }

    public static final String A01(C254703su r1) {
        String str;
        Uri A03;
        C254873tC A01 = C3266377o.A01(r1);
        if (A01 == null || (str = A01.A0u) == null || (A03 = 0cp.A03(str)) == null) {
            return null;
        }
        return A03.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }
}
