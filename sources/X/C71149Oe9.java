package X;

import android.content.Context;
import com.facebook.rsys.mediasync.gen.ActionMetadata;
import com.facebook.rsys.mediasync.gen.AudioAttribution;
import com.facebook.rsys.mediasync.gen.FacebookVideoContent;
import com.facebook.rsys.mediasync.gen.Fallback;
import com.facebook.rsys.mediasync.gen.InstagramContent;
import com.facebook.rsys.mediasync.gen.InstagramContentOwner;
import com.facebook.rsys.mediasync.gen.MediaSyncContent;
import com.facebook.rsys.mediasync.gen.MediaSyncState;
import com.facebook.rsys.mediasync.gen.Placeholder;
import com.facebook.rsys.mediasync.gen.SizedUrl;
import com.facebook.rsys.mediasync.gen.Video;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Oe9  reason: case insensitive filesystem */
public final class C71149Oe9 {
    public final Context A00;
    public final UserSession A01;

    public static long A00(MediaSyncState mediaSyncState) {
        int i = mediaSyncState.action;
        if (i == 0) {
            ActionMetadata actionMetadata = mediaSyncState.actionMetadata;
            return ((System.currentTimeMillis() + mediaSyncState.localClockOffsetMs) - actionMetadata.actionTimeMs) + actionMetadata.mediaPositionMs;
        } else if (i != 1) {
            return 0;
        } else {
            return mediaSyncState.actionMetadata.mediaPositionMs;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long A01(X.C74438Put r6, long r7) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.N54
            if (r0 == 0) goto L_0x001e
            X.N54 r6 = (X.N54) r6
            X.N2c r0 = r6.A02
        L_0x0008:
            if (r0 == 0) goto L_0x001d
        L_0x000a:
            long r3 = r0.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            if (r0 == 0) goto L_0x001d
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x001d
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x001d
            long r7 = r7 % r3
        L_0x001d:
            return r7
        L_0x001e:
            boolean r0 = r6 instanceof X.N53
            if (r0 == 0) goto L_0x0027
            X.N53 r6 = (X.N53) r6
            X.N2c r0 = r6.A01
            goto L_0x000a
        L_0x0027:
            boolean r0 = r6 instanceof X.N52
            if (r0 == 0) goto L_0x001d
            X.N52 r6 = (X.N52) r6
            X.N2c r0 = r6.A00
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71149Oe9.A01(X.Put, long):long");
    }

    public static final C66720MbR A02(SizedUrl sizedUrl) {
        Integer num;
        String str = sizedUrl.url;
        0qQ.A06(str);
        int i = sizedUrl.height;
        int i2 = sizedUrl.width;
        String str2 = sizedUrl.type;
        if (str2 != null) {
            num = 00y.A0l(str2);
        } else {
            num = null;
        }
        return new C66720MbR(num, str, i, i2);
    }

    public static final MediaSyncContent A04(C74438Put put, C71149Oe9 oe9) {
        FacebookVideoContent facebookVideoContent;
        InstagramContent instagramContent;
        Placeholder placeholder;
        N52 n52;
        Video video;
        N51 n51;
        N54 n54;
        N53 n53;
        SizedUrl sizedUrl;
        C74438Put put2 = put;
        Fallback fallback = null;
        C71149Oe9 oe92 = oe9;
        if (!(put2 instanceof N53) || (n53 = (N53) put2) == null) {
            facebookVideoContent = null;
        } else {
            String str = n53.A02;
            Video A05 = oe92.A05(n53.A01);
            C66720MbR mbR = n53.A00;
            if (mbR != null) {
                sizedUrl = new SizedUrl(mbR.A03, mbR.A00, mbR.A01, DbX.A0t(mbR.A02));
            } else {
                sizedUrl = null;
            }
            facebookVideoContent = new FacebookVideoContent(str, A05, sizedUrl, n53.A04, n53.A03, n53.A06, n53.A07, AnonymousClass7TE.A1C());
        }
        if (!(put2 instanceof N54) || (n54 = (N54) put2) == null) {
            instagramContent = null;
        } else {
            instagramContent = oe92.A03(n54);
        }
        if (!(put2 instanceof N51) || (n51 = (N51) put2) == null) {
            placeholder = null;
        } else {
            placeholder = new Placeholder(n51.A01, n51.A03, n51.A02);
        }
        if ((put2 instanceof N52) && (n52 = (N52) put2) != null) {
            String str2 = n52.A04;
            String str3 = n52.A05;
            String str4 = n52.A06;
            N2c n2c = n52.A00;
            if (n2c != null) {
                video = oe92.A05(n2c);
            } else {
                video = null;
            }
            fallback = new Fallback(str2, str3, str4, video, n52.A03, n52.A02);
        }
        return new MediaSyncContent(instagramContent, facebookVideoContent, placeholder, fallback);
    }

    private final Video A05(N2c n2c) {
        SizedUrl sizedUrl;
        C66720MbR mbR = n2c.A02;
        if (mbR != null) {
            sizedUrl = new SizedUrl(mbR.A03, mbR.A00, mbR.A01, DbX.A0t(mbR.A02));
        } else {
            sizedUrl = null;
        }
        return new Video(sizedUrl, n2c.A03, n2c.A01, n2c.A00);
    }

    private final N54 A06(InstagramContent instagramContent) {
        ArrayList arrayList;
        ArrayList arrayList2;
        N2c n2c;
        Integer num;
        Integer num2;
        ArrayList arrayList3 = instagramContent.images;
        if (arrayList3 != null) {
            arrayList = AnonymousClass7TF.A0p(arrayList3);
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                SizedUrl sizedUrl = (SizedUrl) it.next();
                0qQ.A0A(sizedUrl);
                arrayList.add(A02(sizedUrl));
            }
        } else {
            arrayList = 0sn.A00;
        }
        ArrayList arrayList4 = instagramContent.carousel;
        N49 n49 = null;
        if (arrayList4 != null) {
            arrayList2 = AnonymousClass7TF.A0p(arrayList4);
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                InstagramContent instagramContent2 = (InstagramContent) it2.next();
                0qQ.A0A(instagramContent2);
                arrayList2.add(A06(instagramContent2));
            }
        } else {
            arrayList2 = null;
        }
        String str = instagramContent.contentId;
        0qQ.A06(str);
        String str2 = instagramContent.thumbnailUrl;
        0qQ.A06(str2);
        Video video = instagramContent.video;
        if (video != null) {
            n2c = A07(video);
        } else {
            n2c = null;
        }
        InstagramContentOwner instagramContentOwner = instagramContent.owner;
        0qQ.A06(instagramContentOwner);
        String str3 = instagramContentOwner.userId;
        0qQ.A06(str3);
        String str4 = instagramContentOwner.username;
        0qQ.A06(str4);
        String str5 = instagramContentOwner.avatarUrl;
        0qQ.A06(str5);
        C61037Jvb jvb = new C61037Jvb(str3, str4, str5, 0);
        int i = instagramContent.mediaType;
        if (i == 1) {
            num = AnonymousClass05K.A00;
        } else if (i == 2) {
            num = AnonymousClass05K.A01;
        } else if (i == 3) {
            num = AnonymousClass05K.A0N;
        } else if (i != 4) {
            num = AnonymousClass05K.A0Y;
        } else {
            num = AnonymousClass05K.A0C;
        }
        AudioAttribution audioAttribution = instagramContent.audioAttribution;
        if (audioAttribution != null) {
            n49 = new N49(audioAttribution.artistName, audioAttribution.songTitle, 2);
        }
        String str6 = instagramContent.trackingToken;
        if (str6 == null) {
            str6 = "";
        }
        int i2 = instagramContent.productType;
        if (i2 == 1) {
            num2 = AnonymousClass05K.A00;
        } else if (i2 != 2) {
            num2 = AnonymousClass05K.A0C;
        } else {
            num2 = AnonymousClass05K.A01;
        }
        return new N54(n49, jvb, n2c, num, num2, str, str2, str6, arrayList, arrayList2);
    }

    private final N2c A07(Video video) {
        C66720MbR mbR;
        SizedUrl sizedUrl = video.url;
        if (sizedUrl != null) {
            mbR = A02(sizedUrl);
        } else {
            mbR = null;
        }
        return new N2c(mbR, video.dashManifest, video.aspectRatio, video.durationMs);
    }

    public static final Integer A08(MediaSyncState mediaSyncState) {
        int i = mediaSyncState.contentSource;
        if (i == 1) {
            return AnonymousClass05K.A01;
        }
        if (i == 2) {
            return AnonymousClass05K.A0C;
        }
        if (i != 4) {
            return AnonymousClass05K.A00;
        }
        return AnonymousClass05K.A0N;
    }

    public static final Integer A09(MediaSyncState mediaSyncState) {
        int i = mediaSyncState.action;
        if (i == 0) {
            return AnonymousClass05K.A00;
        }
        if (i == 1) {
            return AnonymousClass05K.A01;
        }
        if (i == 2) {
            return AnonymousClass05K.A0C;
        }
        throw AnonymousClass7TE.A0z("Unsupported action");
    }

    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r9v4, types: [X.N52] */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r9v5, types: [X.N53] */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.N36 A0A(com.facebook.rsys.mediasync.gen.MediaSyncContent r19, com.facebook.rsys.mediasync.gen.MediaSyncState r20) {
        /*
            r18 = this;
            r0 = r20
            java.lang.Integer r8 = A09(r0)
            java.lang.Integer r11 = A08(r0)
            r3 = r19
            com.facebook.rsys.mediasync.gen.InstagramContent r2 = r3.instagramContent
            r1 = r18
            if (r2 == 0) goto L_0x0037
            X.N54 r7 = r1.A06(r2)
        L_0x0016:
            X.Put r7 = (X.C74438Put) r7
            long r2 = A00(r0)
            long r2 = r1.A01(r7, r2)
            java.lang.String r11 = r0.tabSource
            java.lang.String r12 = r0.adminMessage
            com.facebook.rsys.mediasync.gen.ActionMetadata r1 = r0.actionMetadata
            java.lang.Integer r9 = r1.carouselItemIndex
            java.lang.String r13 = r0.actorId
            java.lang.String r14 = r0.seedContentId
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            r15 = 0
            X.N36 r6 = new X.N36
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r6
        L_0x0037:
            com.facebook.rsys.mediasync.gen.FacebookVideoContent r2 = r3.facebookVideoContent
            if (r2 == 0) goto L_0x00a0
            java.util.ArrayList r4 = r2.availableCaptionLocales
            X.0qQ.A06(r4)
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r4)
            java.util.Iterator r5 = r4.iterator()
        L_0x0048:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x0071
            java.lang.Object r4 = r5.next()
            com.facebook.rsys.mediasync.gen.CaptionLocales r4 = (com.facebook.rsys.mediasync.gen.CaptionLocales) r4
            X.0qQ.A0A(r4)
            java.lang.String r10 = r4.locale
            X.0qQ.A06(r10)
            java.lang.String r11 = r4.localizedLanguage
            X.0qQ.A06(r11)
            java.lang.String r12 = r4.localizedCountry
            java.lang.String r13 = r4.localizedCreationMethod
            java.lang.String r14 = r4.captionsUrl
            r15 = 1
            X.QOp r9 = new X.QOp
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r3.add(r9)
            goto L_0x0048
        L_0x0071:
            java.lang.String r12 = r2.contentId
            X.0qQ.A06(r12)
            com.facebook.rsys.mediasync.gen.Video r4 = r2.video
            X.0qQ.A06(r4)
            X.N2c r11 = r1.A07(r4)
            com.facebook.rsys.mediasync.gen.SizedUrl r4 = r2.thumbnail
            if (r4 == 0) goto L_0x009e
            X.MbR r10 = A02(r4)
        L_0x0087:
            java.lang.String r6 = r2.title
            java.lang.String r5 = r2.subtitle
            boolean r4 = r2.isLiveStreaming
            boolean r2 = r2.isReportable
            X.N53 r7 = new X.N53
            r9 = r7
            r13 = r6
            r14 = r5
            r15 = r3
            r16 = r4
            r17 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0016
        L_0x009e:
            r10 = 0
            goto L_0x0087
        L_0x00a0:
            com.facebook.rsys.mediasync.gen.Placeholder r2 = r3.placeholder
            if (r2 == 0) goto L_0x00ba
            java.lang.String r4 = r2.contentId
            X.0qQ.A06(r4)
            java.lang.String r3 = r2.title
            X.0qQ.A06(r3)
            java.lang.String r2 = r2.message
            X.0qQ.A06(r2)
            X.N51 r7 = new X.N51
            r7.<init>(r11, r4, r3, r2)
            goto L_0x0016
        L_0x00ba:
            com.facebook.rsys.mediasync.gen.Fallback r6 = r3.fallback
            if (r6 == 0) goto L_0x00e5
            java.lang.String r12 = r6.contentId
            X.0qQ.A06(r12)
            java.lang.String r5 = r6.coverImageUrl
            X.0qQ.A06(r5)
            java.lang.String r4 = r6.message
            com.facebook.rsys.mediasync.gen.Video r2 = r6.video
            if (r2 == 0) goto L_0x00e3
            X.N2c r10 = r1.A07(r2)
        L_0x00d2:
            java.lang.String r3 = r6.attributionImageUrl
            java.lang.String r2 = r6.attribution
            X.N52 r7 = new X.N52
            r9 = r7
            r13 = r5
            r14 = r4
            r15 = r3
            r16 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0016
        L_0x00e3:
            r10 = 0
            goto L_0x00d2
        L_0x00e5:
            java.lang.String r0 = "No content type found"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71149Oe9.A0A(com.facebook.rsys.mediasync.gen.MediaSyncContent, com.facebook.rsys.mediasync.gen.MediaSyncState):X.N36");
    }

    public final N36 A0C(MediaSyncState mediaSyncState, C74438Put put) {
        if (mediaSyncState == null) {
            return null;
        }
        C74438Put put2 = put;
        if (put == null) {
            return null;
        }
        long A012 = A01(put, A00(mediaSyncState));
        Integer A09 = A09(mediaSyncState);
        String str = mediaSyncState.tabSource;
        String str2 = mediaSyncState.adminMessage;
        return new N36(put2, A09, mediaSyncState.actionMetadata.carouselItemIndex, Long.valueOf(A012), str, str2, mediaSyncState.actorId, mediaSyncState.seedContentId, false);
    }

    public C71149Oe9(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005e, code lost:
        if (r0 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        if (r1 == null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r0 == null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        r0 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        if (r0 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        r9 = new com.facebook.rsys.mediasync.gen.InstagramContentOwner(r3, r1, r0);
        r7 = r5.A03.intValue();
        r10 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        if (r7 == 0) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        if (r7 == 1) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        if (r7 == 2) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
        r10 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        if (r7 == 3) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0086, code lost:
        r0 = r5.A04.intValue();
        r11 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
        if (r0 == 1) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
        if (r0 == 0) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (r0 != 2) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0094, code lost:
        r12 = r5.A06;
        r0 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0098, code lost:
        if (r0 == null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009a, code lost:
        r14 = A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009e, code lost:
        r0 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a0, code lost:
        if (r0 == null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a2, code lost:
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a4, code lost:
        if (r1 != null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a6, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
        if (r0 == null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a9, code lost:
        r0 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ab, code lost:
        if (r0 == null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ad, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ba, code lost:
        return new com.facebook.rsys.mediasync.gen.InstagramContent(r8, r9, r10, r11, r12, r13, r14, r15, new com.facebook.rsys.mediasync.gen.AudioAttribution(r1, r2), r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bb, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bd, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bf, code lost:
        r10 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c1, code lost:
        r10 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c7, code lost:
        throw X.AnonymousClass7TE.A1K();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.facebook.rsys.mediasync.gen.InstagramContent A03(X.N54 r19) {
        /*
            r18 = this;
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            r5 = r19
            java.util.List r0 = r5.A09
            java.util.Iterator r6 = r0.iterator()
        L_0x000c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r6.next()
            X.MbR r0 = (X.C66720MbR) r0
            java.lang.String r4 = r0.A03
            int r3 = r0.A00
            int r2 = r0.A01
            java.lang.Object r0 = r0.A02
            java.lang.String r1 = X.DbX.A0t(r0)
            com.facebook.rsys.mediasync.gen.SizedUrl r0 = new com.facebook.rsys.mediasync.gen.SizedUrl
            r0.<init>(r4, r3, r2, r1)
            r13.add(r0)
            goto L_0x000c
        L_0x002d:
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r5.A08
            r6 = r18
            if (r0 == 0) goto L_0x004f
            java.util.Iterator r1 = r0.iterator()
        L_0x003b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004f
            java.lang.Object r0 = r1.next()
            X.N54 r0 = (X.N54) r0
            com.facebook.rsys.mediasync.gen.InstagramContent r0 = r6.A03(r0)
            r15.add(r0)
            goto L_0x003b
        L_0x004f:
            java.lang.String r8 = r5.A05
            X.Jvb r0 = r5.A01
            java.lang.String r2 = ""
            r17 = r2
            if (r0 == 0) goto L_0x005d
            java.lang.String r3 = r0.A01
            if (r3 != 0) goto L_0x0060
        L_0x005d:
            r3 = r2
            if (r0 == 0) goto L_0x0064
        L_0x0060:
            java.lang.String r1 = r0.A02
            if (r1 != 0) goto L_0x0067
        L_0x0064:
            r1 = r2
            if (r0 == 0) goto L_0x006b
        L_0x0067:
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto L_0x006c
        L_0x006b:
            r0 = r2
        L_0x006c:
            com.facebook.rsys.mediasync.gen.InstagramContentOwner r9 = new com.facebook.rsys.mediasync.gen.InstagramContentOwner
            r9.<init>(r3, r1, r0)
            java.lang.Integer r0 = r5.A03
            int r7 = r0.intValue()
            r10 = 4
            r0 = 3
            r4 = 2
            r3 = 1
            r1 = 0
            if (r7 == r1) goto L_0x00c1
            if (r7 == r3) goto L_0x00bf
            if (r7 == r4) goto L_0x0086
            r10 = 3
            if (r7 == r0) goto L_0x0086
            r10 = 0
        L_0x0086:
            java.lang.Integer r0 = r5.A04
            int r0 = r0.intValue()
            r11 = 2
            if (r0 == r3) goto L_0x0094
            if (r0 == r1) goto L_0x00bd
            if (r0 != r4) goto L_0x00c3
            r11 = 0
        L_0x0094:
            java.lang.String r12 = r5.A06
            X.N2c r0 = r5.A02
            if (r0 == 0) goto L_0x00bb
            com.facebook.rsys.mediasync.gen.Video r14 = r6.A05(r0)
        L_0x009e:
            X.N49 r0 = r5.A00
            if (r0 == 0) goto L_0x00a6
            java.lang.String r1 = r0.A00
            if (r1 != 0) goto L_0x00a9
        L_0x00a6:
            r1 = r2
            if (r0 == 0) goto L_0x00ae
        L_0x00a9:
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x00ae
            r2 = r0
        L_0x00ae:
            com.facebook.rsys.mediasync.gen.AudioAttribution r0 = new com.facebook.rsys.mediasync.gen.AudioAttribution
            r0.<init>(r1, r2)
            com.facebook.rsys.mediasync.gen.InstagramContent r7 = new com.facebook.rsys.mediasync.gen.InstagramContent
            r16 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r7
        L_0x00bb:
            r14 = 0
            goto L_0x009e
        L_0x00bd:
            r11 = 1
            goto L_0x0094
        L_0x00bf:
            r10 = 2
            goto L_0x0086
        L_0x00c1:
            r10 = 1
            goto L_0x0086
        L_0x00c3:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71149Oe9.A03(X.N54):com.facebook.rsys.mediasync.gen.InstagramContent");
    }

    public final N36 A0B(MediaSyncState mediaSyncState) {
        Integer A09 = A09(mediaSyncState);
        String str = mediaSyncState.contentId;
        0qQ.A06(str);
        return new N36(new N4z(A08(mediaSyncState), str), A09, mediaSyncState.actionMetadata.carouselItemIndex, C51971G9r.A0m(), mediaSyncState.tabSource, mediaSyncState.adminMessage, mediaSyncState.actorId, (String) null, true);
    }
}
