package X;

import android.net.Uri;
import com.instagram.api.schemas.DirectMediaFallbackUrl;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.direct.armadilloexpress.transportpayload.Media;
import com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto;
import com.instagram.direct.armadilloexpress.transportpayload.Thumbnail;
import com.instagram.direct.armadilloexpress.transportpayload.Video;
import com.instagram.direct.armadilloexpress.transportpayload.VideoExtraMetadata;
import com.instagram.model.mediasize.AdditionalCandidates;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.SpriteSheetInfoCandidates;
import com.instagram.model.mediasize.VideoVersion;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Od4  reason: case insensitive filesystem */
public abstract class C71113Od4 {
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.4n7] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (X.182.A06(X.0Tu.A05, r6, 36322869134764675L) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C2609947v A00(com.instagram.common.session.UserSession r6, X.C68145N2l r7, com.instagram.direct.armadilloexpress.transportpayload.Media r8, X.C69405Nkj r9, boolean r10) {
        /*
            r2 = 0
            boolean r1 = X.DbW.A1Z(r9)
            int r0 = r8.mediaCase_
            r3 = 2
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r3)
            r5 = 0
            if (r0 == 0) goto L_0x0024
            int r0 = r9.ordinal()
            if (r0 == r2) goto L_0x0035
            if (r0 == r1) goto L_0x0025
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322869134764675(0x810b7500002a83, double:3.03406692905495E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0035
        L_0x0024:
            return r5
        L_0x0025:
            if (r10 == 0) goto L_0x0035
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342163529002328601(0x20810952000f2219, double:4.0660266169071315E-152)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 != 0) goto L_0x0035
            return r5
        L_0x0035:
            int r0 = r8.mediaCase_
            if (r0 != r3) goto L_0x006f
            java.lang.Object r4 = r8.media_
            com.instagram.direct.armadilloexpress.transportpayload.Voice r4 = (com.instagram.direct.armadilloexpress.transportpayload.Voice) r4
        L_0x003d:
            X.0qQ.A07(r4)
            android.net.Uri r1 = X.C66834MdS.A01(r7, r8)
            if (r1 == 0) goto L_0x0024
            java.lang.String r0 = X.DbV.A0s()
            X.3Q2 r3 = new X.3Q2
            r3.<init>(r0)
            X.1iA r0 = X.1iA.A07
            r3.A0V(r0)
            java.lang.String r1 = r1.toString()
            int r2 = r4.duration_
            X.4n7 r0 = new X.4n7
            r0.<init>()
            r0.A01 = r1
            r0.A00 = r2
            r3.A1L = r0
            X.TmR r1 = r4.waveforms_
            int r0 = r4.waveformSamplingFrequencyHz_
            X.47v r5 = new X.47v
            r5.<init>(r3, r1, r2, r0)
            return r5
        L_0x006f:
            com.instagram.direct.armadilloexpress.transportpayload.Voice r4 = com.instagram.direct.armadilloexpress.transportpayload.Voice.DEFAULT_INSTANCE
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71113Od4.A00(com.instagram.common.session.UserSession, X.N2l, com.instagram.direct.armadilloexpress.transportpayload.Media, X.Nkj, boolean):X.47v");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (X.182.A06(X.0Tu.A05, r6, 36322869134895749L) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.1Xj A03(com.instagram.common.session.UserSession r6, X.C68145N2l r7, com.instagram.direct.armadilloexpress.transportpayload.Media r8, X.C69405Nkj r9, boolean r10) {
        /*
            r2 = 0
            r4 = 1
            r3 = 3
            X.0qQ.A0B(r9, r3)
            int r1 = r8.mediaCase_
            r0 = 1
            if (r1 == r4) goto L_0x000c
            r0 = 0
        L_0x000c:
            r5 = 0
            if (r0 != 0) goto L_0x0011
            if (r1 != r3) goto L_0x0037
        L_0x0011:
            int r0 = r9.ordinal()
            if (r0 == r2) goto L_0x0037
            if (r0 == r4) goto L_0x0027
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322869134895749(0x810b7500022a85, double:3.0340669291378415E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0037
        L_0x0026:
            return r5
        L_0x0027:
            if (r10 == 0) goto L_0x0037
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342163529002263064(0x20810952000e2218, double:4.066026616851562E-152)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 != 0) goto L_0x0037
            return r5
        L_0x0037:
            android.net.Uri r1 = X.C66834MdS.A01(r7, r8)
            if (r1 == 0) goto L_0x0026
            int r0 = r8.mediaCase_
            if (r0 != r4) goto L_0x004d
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r0 = r8.A0N()
            X.0qQ.A07(r0)
            X.1Xj r5 = A02(r1, r0)
            return r5
        L_0x004d:
            if (r0 != r3) goto L_0x0026
            com.instagram.direct.armadilloexpress.transportpayload.Video r0 = r8.A0O()
            X.0qQ.A07(r0)
            X.1Xj r5 = A01(r1, r7, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71113Od4.A03(com.instagram.common.session.UserSession, X.N2l, com.instagram.direct.armadilloexpress.transportpayload.Media, X.Nkj, boolean):X.1Xj");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.1Xx, java.lang.Object] */
    public static final 1Xj A01(Uri uri, C68145N2l n2l, Video video) {
        String str;
        ? obj = new Object();
        CommonMediaTransport commonMediaTransport = video.mediaTransport_;
        if (commonMediaTransport == null) {
            commonMediaTransport = CommonMediaTransport.DEFAULT_INSTANCE;
        }
        0qQ.A07(commonMediaTransport);
        if ((commonMediaTransport.bitField0_ & 1) == 0 || (str = commonMediaTransport.mediaId_) == null) {
            str = DbV.A0s();
        }
        obj.A5j = str;
        if ((video.bitField0_ & 8) != 0) {
            Thumbnail thumbnail = video.thumbnail_;
            if (thumbnail == null) {
                thumbnail = Thumbnail.DEFAULT_INSTANCE;
            }
            0qQ.A07(thumbnail);
            CommonMediaTransport commonMediaTransport2 = thumbnail.mediaTransport_;
            if (commonMediaTransport2 == null) {
                commonMediaTransport2 = CommonMediaTransport.DEFAULT_INSTANCE;
            }
            0qQ.A07(commonMediaTransport2);
            obj.EZf(new ImageInfoImpl((AdditionalCandidates) null, (SpriteSheetInfoCandidates) null, (SpriteSheetInfoCandidates) null, AnonymousClass7TE.A1I(new ExtendedImageUrl(DbT.A10(C66834MdS.A00(n2l, commonMediaTransport2, (List) null)), thumbnail.width_, thumbnail.height_)), (List) null));
        }
        obj.A4n = Integer.valueOf(video.height_);
        obj.A4o = Integer.valueOf(video.width_);
        String obj2 = uri.toString();
        obj.EqT(AnonymousClass7TE.A1I(new VideoVersion((DirectMediaFallbackUrl) null, Integer.valueOf(video.height_), -2, Integer.valueOf(video.width_), (Long) null, (String) null, obj2)));
        obj.A4m = Integer.valueOf(1iA.A0a.A00);
        if ((video.bitField0_ & 16) != 0) {
            VideoExtraMetadata videoExtraMetadata = video.videoExtraMetadata_;
            if (videoExtraMetadata == null) {
                videoExtraMetadata = VideoExtraMetadata.DEFAULT_INSTANCE;
            }
            if ((videoExtraMetadata.bitField0_ & 1) != 0) {
                obj.A4J = Float.valueOf(videoExtraMetadata.uploadMosClientScore_);
            }
        }
        AtomicBoolean atomicBoolean = 1Xj.A0i;
        return 1Xv.A02(obj);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.1Xx, java.lang.Object] */
    public static final 1Xj A02(Uri uri, StaticPhoto staticPhoto) {
        String str;
        ? obj = new Object();
        CommonMediaTransport commonMediaTransport = staticPhoto.mediaTransport_;
        if (commonMediaTransport == null) {
            commonMediaTransport = CommonMediaTransport.DEFAULT_INSTANCE;
        }
        0qQ.A07(commonMediaTransport);
        if ((commonMediaTransport.bitField0_ & 1) == 0 || (str = commonMediaTransport.mediaId_) == null) {
            str = DbV.A0s();
        }
        obj.A5j = str;
        obj.EZf(new ImageInfoImpl((AdditionalCandidates) null, (SpriteSheetInfoCandidates) null, (SpriteSheetInfoCandidates) null, AnonymousClass7TE.A1I(new ExtendedImageUrl(DbT.A10(uri), staticPhoto.width_, staticPhoto.height_)), (List) null));
        obj.A4n = Integer.valueOf(staticPhoto.height_);
        obj.A4o = Integer.valueOf(staticPhoto.width_);
        obj.A4m = Integer.valueOf(1iA.A0Q.A00);
        AtomicBoolean atomicBoolean = 1Xj.A0i;
        return 1Xv.A02(obj);
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [X.OBp, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v4, types: [X.OBp, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v13, types: [java.lang.Object, X.5Dg] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r6.A1S() == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(com.instagram.common.session.UserSession r33, X.C68145N2l r34, com.instagram.direct.armadilloexpress.transportpayload.Media r35, X.C254703su r36, boolean r37) {
        /*
            r6 = r36
            boolean r0 = r6.A1T()
            if (r0 == 0) goto L_0x000f
            boolean r0 = r6.A1S()
            r3 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r3 = 0
        L_0x0010:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320519788503575(0x810952000d2217, double:3.032581193019372E-306)
            r4 = r33
            boolean r0 = X.182.A06(r2, r4, r0)
            java.lang.String r7 = "need_update"
            if (r37 == 0) goto L_0x0030
            if (r3 == 0) goto L_0x0030
            if (r0 != 0) goto L_0x0030
        L_0x0025:
            X.2FW r1 = X.2FW.A1M
            X.57z r0 = new X.57z
            r0.<init>(r7)
            r6.A17(r1, r0)
            return
        L_0x0030:
            X.ODs r0 = r6.A0M()
            X.Nkj r1 = r0.A00
            boolean r0 = r6.A1S()
            r5 = r34
            r3 = r35
            X.1Xj r10 = A03(r4, r5, r3, r1, r0)
            if (r10 == 0) goto L_0x004a
            X.2FW r0 = X.2FW.A1A
        L_0x0046:
            r6.A17(r0, r10)
            return
        L_0x004a:
            X.ODs r0 = r6.A0M()
            X.Nkj r1 = r0.A00
            boolean r0 = r6.A1S()
            X.47v r10 = A00(r4, r5, r3, r1, r0)
            if (r10 == 0) goto L_0x005d
            X.2FW r0 = X.2FW.A1k
            goto L_0x0046
        L_0x005d:
            java.lang.String r0 = r4.A06
            boolean r12 = X.AnonymousClass7F3.A01(r6, r0)
            X.ODs r0 = r6.A0M()
            X.Nkj r8 = r0.A00
            boolean r11 = r6.A1S()
            int r1 = r3.mediaCase_
            r0 = 4
            if (r1 != r0) goto L_0x0089
            r10 = 1
            r9 = 0
            int r1 = r8.ordinal()
            r8 = 1
            r0 = 0
            if (r1 == r0) goto L_0x0196
            if (r1 == r10) goto L_0x0187
            r0 = 36322869134961286(0x810b7500032a86, double:3.0340669291792874E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0196
        L_0x0089:
            X.ODs r0 = r6.A0M()
            X.Nkj r8 = r0.A00
            boolean r10 = r6.A1S()
            int r0 = r3.mediaCase_
            r9 = 5
            if (r0 != r9) goto L_0x00ae
            r1 = 1
            r12 = 0
            int r0 = r8.ordinal()
            r8 = 0
            if (r0 == r8) goto L_0x013e
            if (r0 == r1) goto L_0x012f
            r0 = 36322869134830212(0x810b7500012a84, double:3.0340669290963957E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x013e
        L_0x00ae:
            int r1 = r3.mediaCase_
            r0 = 6
            if (r1 != r0) goto L_0x0025
            r19 = 0
            r0 = 36320906335101895(0x8109ac000623c7, double:3.032825646644648E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x0025
            com.instagram.direct.armadilloexpress.transportpayload.AvatarSticker r1 = r3.A0L()
            X.0qQ.A07(r1)
            android.net.Uri r3 = X.C66834MdS.A01(r5, r3)
            if (r3 == 0) goto L_0x0025
            boolean r0 = r1.isAnimated_
            if (r0 == 0) goto L_0x012c
            X.2FW r2 = X.2FW.A0J
        L_0x00d3:
            int r0 = r1.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x00df
            int r0 = r1.nuxType_
            java.lang.Integer r19 = java.lang.Integer.valueOf(r0)
        L_0x00df:
            r1 = 120(0x78, float:1.68E-43)
            r8 = 0
            java.lang.String r0 = X.DbT.A10(r3)
            com.instagram.model.mediasize.ExtendedImageUrl r9 = new com.instagram.model.mediasize.ExtendedImageUrl
            r9.<init>(r0, r1, r1)
            java.lang.Boolean r11 = X.AnonymousClass7TE.A0v()
            java.lang.String r29 = "instagram://avatar_sticker_upsell_bloks_action"
            r34 = 0
            X.3tD r7 = X.C254883tD.SINGLE
            r10 = r8
            r12 = r11
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r20 = r8
            r21 = r8
            r22 = r8
            r23 = r8
            r24 = r8
            r25 = r8
            r26 = r8
            r27 = r8
            r28 = r8
            r30 = r8
            r31 = r8
            r32 = r8
            r33 = r8
            r35 = r34
            r36 = r34
            r37 = r34
            X.3tC r0 = X.C71152OeO.A02(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            r6.A17(r2, r0)
            return
        L_0x012c:
            X.2FW r2 = X.2FW.A0O
            goto L_0x00d3
        L_0x012f:
            if (r10 == 0) goto L_0x013e
            r0 = 2342163529002394138(0x208109520010221a, double:4.066026616962701E-152)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x013e
            goto L_0x00ae
        L_0x013e:
            int r0 = r3.mediaCase_
            if (r0 != r9) goto L_0x0184
            java.lang.Object r10 = r3.media_
            com.instagram.direct.armadilloexpress.transportpayload.Gif r10 = (com.instagram.direct.armadilloexpress.transportpayload.Gif) r10
        L_0x0146:
            X.0qQ.A07(r10)
            android.net.Uri r0 = X.C66834MdS.A01(r5, r3)
            if (r0 == 0) goto L_0x00ae
            java.lang.String r15 = X.DbV.A0s()
            java.lang.String r11 = r0.toString()
            int r0 = r10.width_
            float r9 = (float) r0
            int r0 = r10.height_
            float r0 = (float) r0
            com.instagram.model.mediasize.GifUrlImpl r1 = new com.instagram.model.mediasize.GifUrlImpl
            r1.<init>(r11, r9, r0)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r8)
            boolean r0 = r10.isSticker_
            X.9IE r11 = new X.9IE
            r11.<init>((com.instagram.model.mediasize.GifUrlImpl) r1)
            X.53G r10 = new X.53G
            r14 = r13
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            com.instagram.model.direct.gifs.DirectAnimatedMedia r1 = X.AnonymousClass53I.A01(r10)
            if (r1 == 0) goto L_0x00ae
            X.2FW r0 = X.2FW.A0K
            r6.A17(r0, r1)
            r6.A18(r0, r10)
            return
        L_0x0184:
            com.instagram.direct.armadilloexpress.transportpayload.Gif r10 = com.instagram.direct.armadilloexpress.transportpayload.Gif.DEFAULT_INSTANCE
            goto L_0x0146
        L_0x0187:
            if (r11 == 0) goto L_0x0196
            r0 = 2342163529002066453(0x20810952000b2215, double:4.066026616684852E-152)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x0196
            goto L_0x0089
        L_0x0196:
            if (r34 == 0) goto L_0x02c7
            long r0 = r5.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L_0x019e:
            com.instagram.direct.armadilloexpress.transportpayload.Raven r3 = r3.A0M()
            X.0qQ.A07(r3)
            X.4ik r10 = new X.4ik
            r10.<init>()
            int r0 = r3.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x02c4
            X.Nmx r0 = r3.A0L()
            X.0qQ.A07(r0)
            int r1 = r0.ordinal()
            if (r1 == r8) goto L_0x02c0
            r0 = 2
            if (r1 == r0) goto L_0x02bc
            r0 = 3
            if (r1 == r0) goto L_0x02b8
            r0 = 0
        L_0x01c4:
            r10.A09 = r0
            if (r12 == 0) goto L_0x01df
            X.4k3 r7 = X.C272074k3.RAVEN_SENT
            long r0 = X.DbY.A04(r2)
            r2 = 3
            X.0qQ.A0B(r7, r2)
            X.5Dg r2 = new X.5Dg
            r2.<init>()
            r2.A01 = r0
            r2.A00 = r8
            r2.A02 = r7
            r10.A03 = r2
        L_0x01df:
            int r0 = r3.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x02b4
            com.instagram.direct.armadilloexpress.transportpayload.RavenContent r7 = r3.content_
            r2 = r7
            if (r7 != 0) goto L_0x01ec
            com.instagram.direct.armadilloexpress.transportpayload.RavenContent r7 = com.instagram.direct.armadilloexpress.transportpayload.RavenContent.DEFAULT_INSTANCE
        L_0x01ec:
            int r1 = r7.ravenContentCase_
            r0 = 2
            boolean r0 = X.AnonymousClass7TF.A1S(r1, r0)
            java.lang.String r11 = "Required value was null."
            if (r0 == 0) goto L_0x024b
            com.instagram.direct.armadilloexpress.transportpayload.Video r1 = r7.A0M()
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x024b
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = r1.mediaTransport_
            if (r0 != 0) goto L_0x0207
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE
        L_0x0207:
            X.0qQ.A07(r0)
            android.net.Uri r1 = X.C66834MdS.A00(r5, r0, r9)
            com.instagram.direct.armadilloexpress.transportpayload.RavenContent r0 = r3.content_
            if (r0 != 0) goto L_0x0214
            com.instagram.direct.armadilloexpress.transportpayload.RavenContent r0 = com.instagram.direct.armadilloexpress.transportpayload.RavenContent.DEFAULT_INSTANCE
        L_0x0214:
            com.instagram.direct.armadilloexpress.transportpayload.Video r0 = r0.A0M()
            X.0qQ.A07(r0)
            X.1Xj r0 = A01(r1, r5, r0)
            if (r0 == 0) goto L_0x02d9
            r10.A05 = r0
            X.4iq r0 = X.C271384il.A00(r4, r0)
            if (r0 == 0) goto L_0x02d4
            r10.A04 = r0
            X.OBp r7 = new X.OBp
            r7.<init>()
            r10.A02 = r7
            com.instagram.direct.armadilloexpress.transportpayload.RavenContent r0 = r3.content_
            r2 = r0
            if (r0 != 0) goto L_0x0239
            com.instagram.direct.armadilloexpress.transportpayload.RavenContent r0 = com.instagram.direct.armadilloexpress.transportpayload.RavenContent.DEFAULT_INSTANCE
        L_0x0239:
            com.instagram.direct.armadilloexpress.transportpayload.Video r0 = r0.A0M()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = r0.mediaTransport_
            if (r1 != 0) goto L_0x0243
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE
        L_0x0243:
            java.lang.String r0 = r1.objectId_
            r7.A01 = r0
            java.lang.String r0 = r1.mimetype_
            r7.A00 = r0
        L_0x024b:
            if (r2 != 0) goto L_0x024f
            com.instagram.direct.armadilloexpress.transportpayload.RavenContent r2 = com.instagram.direct.armadilloexpress.transportpayload.RavenContent.DEFAULT_INSTANCE
        L_0x024f:
            int r0 = r2.ravenContentCase_
            if (r0 != r8) goto L_0x02b4
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r0 = r2.A0L()
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x02b4
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r0 = r2.A0L()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = r0.mediaTransport_
            if (r0 != 0) goto L_0x0267
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE
        L_0x0267:
            X.0qQ.A07(r0)
            android.net.Uri r1 = X.C66834MdS.A00(r5, r0, r9)
            com.instagram.direct.armadilloexpress.transportpayload.RavenContent r0 = r3.content_
            if (r0 != 0) goto L_0x0274
            com.instagram.direct.armadilloexpress.transportpayload.RavenContent r0 = com.instagram.direct.armadilloexpress.transportpayload.RavenContent.DEFAULT_INSTANCE
        L_0x0274:
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r0 = r0.A0L()
            X.0qQ.A07(r0)
            X.1Xj r0 = A02(r1, r0)
            if (r0 == 0) goto L_0x02cf
            r10.A05 = r0
            X.4iq r0 = X.C271384il.A00(r4, r0)
            if (r0 == 0) goto L_0x02ca
            r10.A04 = r0
            X.OBp r2 = new X.OBp
            r2.<init>()
            r10.A02 = r2
            com.instagram.direct.armadilloexpress.transportpayload.RavenContent r1 = r3.content_
            if (r1 != 0) goto L_0x0298
            com.instagram.direct.armadilloexpress.transportpayload.RavenContent r1 = com.instagram.direct.armadilloexpress.transportpayload.RavenContent.DEFAULT_INSTANCE
        L_0x0298:
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r0 = r1.A0L()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = r0.mediaTransport_
            if (r0 != 0) goto L_0x02a2
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE
        L_0x02a2:
            java.lang.String r0 = r0.objectId_
            r2.A01 = r0
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r0 = r1.A0L()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = r0.mediaTransport_
            if (r0 != 0) goto L_0x02b0
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r0 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE
        L_0x02b0:
            java.lang.String r0 = r0.mimetype_
            r2.A00 = r0
        L_0x02b4:
            X.2FW r0 = X.2FW.A0q
            goto L_0x0046
        L_0x02b8:
            java.lang.String r0 = "permanent"
            goto L_0x01c4
        L_0x02bc:
            java.lang.String r0 = "replayable"
            goto L_0x01c4
        L_0x02c0:
            java.lang.String r0 = "once"
            goto L_0x01c4
        L_0x02c4:
            r0 = r9
            goto L_0x01c4
        L_0x02c7:
            r2 = r9
            goto L_0x019e
        L_0x02ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        L_0x02cf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        L_0x02d4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        L_0x02d9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71113Od4.A04(com.instagram.common.session.UserSession, X.N2l, com.instagram.direct.armadilloexpress.transportpayload.Media, X.3su, boolean):void");
    }

    public static final void A05(UserSession userSession, Media media, C254703su r9, Long l, String str, boolean z) {
        C68145N2l n2l;
        AnonymousClass7TG.A1O(userSession, media);
        String A0f = r9.A0f();
        if (A0f != null) {
            String str2 = str;
            if (str != null) {
                n2l = new C68145N2l(l, str2, A0f, r9.C7c(), r9.A1d());
                A04(userSession, n2l, media, r9, z);
            }
        }
        n2l = null;
        A04(userSession, n2l, media, r9, z);
    }
}
