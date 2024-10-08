package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload;
import com.instagram.direct.armadilloexpress.transportpayload.ContentView;
import com.instagram.direct.armadilloexpress.transportpayload.EphemeralityParams;
import com.instagram.direct.armadilloexpress.transportpayload.Media;
import com.instagram.direct.armadilloexpress.transportpayload.MediaInterventions;
import com.instagram.direct.armadilloexpress.transportpayload.MediaReaction;
import com.instagram.direct.armadilloexpress.transportpayload.OriginalTransportPayload;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload;
import com.instagram.user.model.User;

/* renamed from: X.OdD  reason: case insensitive filesystem */
public final class C71119OdD {
    public static final C71119OdD A00 = new Object();

    public static final boolean A03(UserSession userSession, AddMessagePayload addMessagePayload, Long l, int i) {
        if (!(i == 1 || i == 2 || l != null)) {
            if (!182.A06(0Tu.A05, userSession, 2342165577700813047L)) {
                return false;
            }
            AddMessageContent addMessageContent = addMessagePayload.content_;
            if (addMessageContent == null) {
                addMessageContent = AddMessageContent.DEFAULT_INSTANCE;
            }
            Media A0L = addMessageContent.A0L();
            if (A0L.mediaCase_ != 4 || A0L.A0M().A0L() == C69515Nmx.RAVEN_VIEW_MODEL_PERMANENT) {
                return false;
            }
        }
        return true;
    }

    public static final Long A01(AddMessageMetadata addMessageMetadata) {
        EphemeralityParams ephemeralityParams = addMessageMetadata.ephemeralityParams_;
        if (ephemeralityParams == null) {
            ephemeralityParams = EphemeralityParams.DEFAULT_INSTANCE;
        }
        long j = ephemeralityParams.ephemeralDurationSec_;
        Long valueOf = Long.valueOf(j);
        if (j <= 0) {
            return null;
        }
        return valueOf;
    }

    public static final String A02(SupplementMessagePayload supplementMessagePayload, String str, String str2, String str3) {
        String str4;
        if (!((supplementMessagePayload.bitField0_ & 2) == 0 || (str4 = supplementMessagePayload.uniquingKeyForSupplementalData_) == null)) {
            str2 = str4;
        }
        if (str3 != null && !DbU.A1a(str2, ":")) {
            str2 = 002.A0T(str2, str3, ':');
        }
        return 002.A0T(str, str2, ':');
    }

    public final String A04(UserSession userSession, SupplementMessagePayload supplementMessagePayload, long j) {
        String str;
        String str2;
        MediaInterventions mediaInterventions;
        Long l;
        OriginalTransportPayload originalTransportPayload;
        MediaReaction mediaReaction;
        SupplementMessageContent supplementMessageContent = supplementMessagePayload.content_;
        if (supplementMessageContent == null) {
            supplementMessageContent = SupplementMessageContent.DEFAULT_INSTANCE;
        }
        0qQ.A07(supplementMessageContent);
        long currentTimeMillis = System.currentTimeMillis();
        String str3 = null;
        switch (supplementMessageContent.A0M().intValue()) {
            case 0:
                str = String.valueOf(j);
                str2 = "reaction";
                break;
            case 1:
            case 4:
                ContentView A0L = supplementMessageContent.A0L();
                0qQ.A07(A0L);
                User A0j = DbV.A0j(userSession, userSession.A06);
                if (A0j != null) {
                    l = A0j.BST();
                } else {
                    l = null;
                }
                if (supplementMessageContent.supplementMessageContentCase_ == 5) {
                    originalTransportPayload = (OriginalTransportPayload) supplementMessageContent.supplementMessageContent_;
                } else {
                    originalTransportPayload = OriginalTransportPayload.DEFAULT_INSTANCE;
                }
                if ((originalTransportPayload.bitField0_ & 1) != 0 && (l == null || j != l.longValue())) {
                    return AnonymousClass7TG.A0m(l, "content_view_seen:", AnonymousClass7TE.A1A());
                }
                if (A0L.seen_) {
                    return A02(supplementMessagePayload, "content_view_seen", String.valueOf(j), (String) null);
                }
                if (A0L.screenshotted_) {
                    return A02(supplementMessagePayload, "content_view_screenshotted", String.valueOf(j), (String) null);
                }
                if (A0L.replayed_) {
                    return A02(supplementMessagePayload, "content_view_replayed", String.valueOf(j), (String) null);
                }
                return null;
            case 2:
                return A02(supplementMessagePayload, "edit", String.valueOf(j), String.valueOf(currentTimeMillis));
            case 3:
                if (supplementMessageContent.supplementMessageContentCase_ == 4) {
                    mediaReaction = (MediaReaction) supplementMessageContent.supplementMessageContent_;
                } else {
                    mediaReaction = MediaReaction.DEFAULT_INSTANCE;
                }
                str3 = mediaReaction.mediaId_;
                0qQ.A07(str3);
                str = String.valueOf(j);
                str2 = "media_reaction";
                break;
            case 5:
                if (supplementMessageContent.supplementMessageContentCase_ == 6) {
                    mediaInterventions = (MediaInterventions) supplementMessageContent.supplementMessageContent_;
                } else {
                    mediaInterventions = MediaInterventions.DEFAULT_INSTANCE;
                }
                str = mediaInterventions.mediaId_;
                0qQ.A07(str);
                str2 = C273654mx.A00(813);
                break;
            default:
                0KC.A0C("ArmadilloExpressBackupGeneratorForProtoBufferTransport", "Supplemental message of this type is not supported yet.");
                return null;
        }
        return A02(supplementMessagePayload, str2, str, str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007c, code lost:
        if (r2 != null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007e, code lost:
        r2 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0080, code lost:
        X.0qQ.A07(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0083, code lost:
        r1 = r7.A0P().intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008b, code lost:
        if (r1 == 0) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008e, code lost:
        if (r1 == 2) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0091, code lost:
        if (r1 != 3) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0093, code lost:
        r3 = r7.A0M().content_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0099, code lost:
        if (r3 != null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009b, code lost:
        r3 = com.instagram.direct.armadilloexpress.transportpayload.RavenContent.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009d, code lost:
        r1 = r3.ravenContentCase_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a0, code lost:
        if (r1 != 1) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a2, code lost:
        r0 = r3.A0L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a6, code lost:
        r0 = r0.thumbnail_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a8, code lost:
        if (r0 != null) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00aa, code lost:
        r0 = com.instagram.direct.armadilloexpress.transportpayload.Thumbnail.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ac, code lost:
        r1 = r0.mediaTransport_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ae, code lost:
        if (r1 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b0, code lost:
        r1 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00b6, code lost:
        if ((r1.bitField0_ & 512) == 0) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00b8, code lost:
        r3 = r1.objectId_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ba, code lost:
        if (r8 == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00bc, code lost:
        r4 = r2.mediaKey_;
        r5 = r2.fileSha256_;
        r6 = r2.fileEncSha256_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00cb, code lost:
        return new com.facebook.wamsys.wce.EncryptedBackupsAttachment(r2.objectId_, r2.mimetype_, r3, r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00cc, code lost:
        r4 = null;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00cf, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00d2, code lost:
        if (r1 != 2) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00d4, code lost:
        r0 = r3.A0M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d9, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00db, code lost:
        r0 = r7.A0O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00df, code lost:
        r0 = r0.thumbnail_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00e2, code lost:
        r0 = r7.A0N();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebook.wamsys.wce.EncryptedBackupsAttachment A00(com.instagram.direct.armadilloexpress.transportpayload.Media r7, boolean r8) {
        /*
            java.lang.Integer r0 = r7.A0P()
            int r0 = r0.intValue()
            r3 = 0
            r6 = 0
            switch(r0) {
                case 0: goto L_0x0076;
                case 1: goto L_0x0059;
                case 2: goto L_0x006f;
                case 3: goto L_0x000e;
                case 4: goto L_0x004a;
                case 5: goto L_0x0068;
                default: goto L_0x000d;
            }
        L_0x000d:
            return r6
        L_0x000e:
            com.instagram.direct.armadilloexpress.transportpayload.Raven r0 = r7.A0M()
            com.instagram.direct.armadilloexpress.transportpayload.RavenContent r2 = r0.content_
            if (r2 != 0) goto L_0x0018
            com.instagram.direct.armadilloexpress.transportpayload.RavenContent r2 = com.instagram.direct.armadilloexpress.transportpayload.RavenContent.DEFAULT_INSTANCE
        L_0x0018:
            int r1 = r2.ravenContentCase_
            if (r1 == 0) goto L_0x0047
            r0 = 1
            if (r1 == r0) goto L_0x0044
            r0 = 2
            if (r1 == r0) goto L_0x0041
            r0 = 0
        L_0x0023:
            int r1 = r0.intValue()
            if (r1 == r3) goto L_0x003a
            r0 = 1
            if (r1 != r0) goto L_0x000d
            com.instagram.direct.armadilloexpress.transportpayload.Video r0 = r2.A0M()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r2 = r0.mediaTransport_
        L_0x0032:
            if (r2 != 0) goto L_0x0036
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r2 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE
        L_0x0036:
            X.0qQ.A0A(r2)
            goto L_0x0083
        L_0x003a:
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r0 = r2.A0L()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r2 = r0.mediaTransport_
            goto L_0x0032
        L_0x0041:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0023
        L_0x0044:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0023
        L_0x0047:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0023
        L_0x004a:
            int r1 = r7.mediaCase_
            r0 = 5
            if (r1 != r0) goto L_0x0056
            java.lang.Object r0 = r7.media_
            com.instagram.direct.armadilloexpress.transportpayload.Gif r0 = (com.instagram.direct.armadilloexpress.transportpayload.Gif) r0
        L_0x0053:
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r2 = r0.mediaTransport_
            goto L_0x007c
        L_0x0056:
            com.instagram.direct.armadilloexpress.transportpayload.Gif r0 = com.instagram.direct.armadilloexpress.transportpayload.Gif.DEFAULT_INSTANCE
            goto L_0x0053
        L_0x0059:
            int r1 = r7.mediaCase_
            r0 = 2
            if (r1 != r0) goto L_0x0065
            java.lang.Object r0 = r7.media_
            com.instagram.direct.armadilloexpress.transportpayload.Voice r0 = (com.instagram.direct.armadilloexpress.transportpayload.Voice) r0
        L_0x0062:
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r2 = r0.mediaTransport_
            goto L_0x007c
        L_0x0065:
            com.instagram.direct.armadilloexpress.transportpayload.Voice r0 = com.instagram.direct.armadilloexpress.transportpayload.Voice.DEFAULT_INSTANCE
            goto L_0x0062
        L_0x0068:
            com.instagram.direct.armadilloexpress.transportpayload.AvatarSticker r0 = r7.A0L()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r2 = r0.mediaTransport_
            goto L_0x007c
        L_0x006f:
            com.instagram.direct.armadilloexpress.transportpayload.Video r0 = r7.A0O()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r2 = r0.mediaTransport_
            goto L_0x007c
        L_0x0076:
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r0 = r7.A0N()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r2 = r0.mediaTransport_
        L_0x007c:
            if (r2 != 0) goto L_0x0080
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r2 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE
        L_0x0080:
            X.0qQ.A07(r2)
        L_0x0083:
            java.lang.Integer r0 = r7.A0P()
            int r1 = r0.intValue()
            if (r1 == r3) goto L_0x00e2
            r0 = 2
            if (r1 == r0) goto L_0x00db
            r0 = 3
            if (r1 != r0) goto L_0x00d9
            com.instagram.direct.armadilloexpress.transportpayload.Raven r0 = r7.A0M()
            com.instagram.direct.armadilloexpress.transportpayload.RavenContent r3 = r0.content_
            if (r3 != 0) goto L_0x009d
            com.instagram.direct.armadilloexpress.transportpayload.RavenContent r3 = com.instagram.direct.armadilloexpress.transportpayload.RavenContent.DEFAULT_INSTANCE
        L_0x009d:
            int r1 = r3.ravenContentCase_
            r0 = 1
            if (r1 != r0) goto L_0x00d1
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r0 = r3.A0L()
        L_0x00a6:
            com.instagram.direct.armadilloexpress.transportpayload.Thumbnail r0 = r0.thumbnail_
        L_0x00a8:
            if (r0 != 0) goto L_0x00ac
            com.instagram.direct.armadilloexpress.transportpayload.Thumbnail r0 = com.instagram.direct.armadilloexpress.transportpayload.Thumbnail.DEFAULT_INSTANCE
        L_0x00ac:
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = r0.mediaTransport_
            if (r1 != 0) goto L_0x00b2
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE
        L_0x00b2:
            int r0 = r1.bitField0_
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x00cf
            java.lang.String r3 = r1.objectId_
        L_0x00ba:
            if (r8 == 0) goto L_0x00cc
            java.lang.String r4 = r2.mediaKey_
            java.lang.String r5 = r2.fileSha256_
            java.lang.String r6 = r2.fileEncSha256_
        L_0x00c2:
            java.lang.String r1 = r2.objectId_
            java.lang.String r2 = r2.mimetype_
            com.facebook.wamsys.wce.EncryptedBackupsAttachment r0 = new com.facebook.wamsys.wce.EncryptedBackupsAttachment
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x00cc:
            r4 = r6
            r5 = r6
            goto L_0x00c2
        L_0x00cf:
            r3 = 0
            goto L_0x00ba
        L_0x00d1:
            r0 = 2
            if (r1 != r0) goto L_0x00d9
            com.instagram.direct.armadilloexpress.transportpayload.Video r0 = r3.A0M()
            goto L_0x00df
        L_0x00d9:
            r3 = r6
            goto L_0x00ba
        L_0x00db:
            com.instagram.direct.armadilloexpress.transportpayload.Video r0 = r7.A0O()
        L_0x00df:
            com.instagram.direct.armadilloexpress.transportpayload.Thumbnail r0 = r0.thumbnail_
            goto L_0x00a8
        L_0x00e2:
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r0 = r7.A0N()
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71119OdD.A00(com.instagram.direct.armadilloexpress.transportpayload.Media, boolean):com.facebook.wamsys.wce.EncryptedBackupsAttachment");
    }
}
