package X;

import android.net.Uri;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.MdS  reason: case insensitive filesystem */
public abstract class C66834MdS {
    public static final Uri A00(C68145N2l n2l, CommonMediaTransport commonMediaTransport, List list) {
        String str;
        String str2;
        long j;
        Integer num;
        String str3;
        String str4;
        Long A10;
        CommonMediaTransport commonMediaTransport2 = commonMediaTransport;
        0qQ.A0B(commonMediaTransport2, 0);
        String str5 = commonMediaTransport2.directPath_;
        0qQ.A07(str5);
        String str6 = commonMediaTransport2.fileSha256_;
        0qQ.A07(str6);
        String str7 = commonMediaTransport2.fileEncSha256_;
        0qQ.A07(str7);
        String str8 = commonMediaTransport2.mediaKey_;
        0qQ.A07(str8);
        long A08 = C66580MXl.A08(commonMediaTransport2.mediaKeyTimestamp_);
        int i = commonMediaTransport2.bitField0_;
        if ((i & 256) != 0) {
            str = commonMediaTransport2.mimetype_;
        } else {
            str = null;
        }
        if ((i & 512) != 0) {
            str2 = commonMediaTransport2.objectId_;
        } else {
            str2 = null;
        }
        if ((i & 1) == 0 || (str4 = commonMediaTransport2.mediaId_) == null || (A10 = AnonymousClass7TE.A10(str4)) == null) {
            j = 0;
        } else {
            j = A10.longValue();
        }
        int i2 = commonMediaTransport2.bitField0_;
        if ((i2 & 128) != 0) {
            num = Integer.valueOf(commonMediaTransport2.fileLength_);
        } else {
            num = null;
        }
        if ((i2 & 64) != 0) {
            str3 = commonMediaTransport2.sidecar_;
        } else {
            str3 = null;
        }
        return A02(n2l, num, str5, str6, str7, str8, str, str2, str3, list, A08, j);
    }

    public static final CommonMediaTransport A03(String str) {
        Integer A0l;
        0qQ.A0B(str, 0);
        if (!C66580MXl.A1a("msys://ae-media", 1, str)) {
            return null;
        }
        Uri A09 = DbT.A09(str);
        List<String> pathSegments = A09.getPathSegments();
        if (pathSegments.size() != 1) {
            0KC.A0C("ArmadilloExpressMediaUtil", "Invalid uri path without directPath");
            return null;
        }
        String decode = Uri.decode(AnonymousClass7TE.A19(pathSegments, 0));
        String queryParameter = A09.getQueryParameter("sha256");
        if (queryParameter != null) {
            String queryParameter2 = A09.getQueryParameter("encsha256");
            if (queryParameter2 != null) {
                String queryParameter3 = A09.getQueryParameter("mediakey");
                if (queryParameter3 != null) {
                    String queryParameter4 = A09.getQueryParameter("mediakey_timestamp");
                    if (queryParameter4 != null) {
                        String queryParameter5 = A09.getQueryParameter("mimetype");
                        if (queryParameter5 != null) {
                            String queryParameter6 = A09.getQueryParameter("object_id");
                            String queryParameter7 = A09.getQueryParameter("media_id");
                            String queryParameter8 = A09.getQueryParameter("file_length");
                            String queryParameter9 = A09.getQueryParameter("sidecar");
                            C68405NFm nFm = (C68405NFm) CommonMediaTransport.DEFAULT_INSTANCE.A0I();
                            CommonMediaTransport A0O = C66583MXo.A0O(nFm);
                            decode.getClass();
                            A0O.bitField0_ |= 16;
                            A0O.directPath_ = decode;
                            CommonMediaTransport A0O2 = C66583MXo.A0O(nFm);
                            A0O2.bitField0_ |= 2;
                            A0O2.fileSha256_ = queryParameter;
                            CommonMediaTransport A0O3 = C66583MXo.A0O(nFm);
                            A0O3.bitField0_ |= 8;
                            A0O3.fileEncSha256_ = queryParameter2;
                            CommonMediaTransport A0O4 = C66583MXo.A0O(nFm);
                            A0O4.bitField0_ |= 4;
                            A0O4.mediaKey_ = queryParameter3;
                            CommonMediaTransport A0O5 = C66583MXo.A0O(nFm);
                            A0O5.bitField0_ |= 32;
                            A0O5.mediaKeyTimestamp_ = queryParameter4;
                            nFm.A06(queryParameter5);
                            if (queryParameter6 != null) {
                                CommonMediaTransport A0O6 = C66583MXo.A0O(nFm);
                                A0O6.bitField0_ |= 512;
                                A0O6.objectId_ = queryParameter6;
                            }
                            if (queryParameter7 != null) {
                                CommonMediaTransport A0O7 = C66583MXo.A0O(nFm);
                                A0O7.bitField0_ |= 1;
                                A0O7.mediaId_ = queryParameter7;
                            }
                            if (!(queryParameter8 == null || (A0l = 00y.A0l(queryParameter8)) == null)) {
                                int intValue = A0l.intValue();
                                CommonMediaTransport A0O8 = C66583MXo.A0O(nFm);
                                A0O8.bitField0_ |= 128;
                                A0O8.fileLength_ = intValue;
                            }
                            if (queryParameter9 != null) {
                                CommonMediaTransport A0O9 = C66583MXo.A0O(nFm);
                                A0O9.bitField0_ |= 64;
                                A0O9.sidecar_ = queryParameter9;
                            }
                            return (CommonMediaTransport) nFm.A02();
                        }
                        throw AnonymousClass7TE.A0w("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0w("Required value was null.");
                }
                throw AnonymousClass7TE.A0w("Required value was null.");
            }
            throw AnonymousClass7TE.A0w("Required value was null.");
        }
        throw AnonymousClass7TE.A0w("Required value was null.");
    }

    public static final String A06(String str) {
        0qQ.A0B(str, 0);
        return DbT.A09(str).getQueryParameter("media_id");
    }

    public static final String A07(String str) {
        String queryParameter;
        0qQ.A0B(str, 0);
        Uri A09 = DbT.A09(str);
        Uri.Builder buildUpon = A09.buildUpon();
        if (A09.getQueryParameterNames().contains("force_eb_restore")) {
            buildUpon.clearQuery();
            Set<String> queryParameterNames = A09.getQueryParameterNames();
            0qQ.A07(queryParameterNames);
            Iterator<String> it = queryParameterNames.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                if (0qQ.A0K(A18, "force_eb_restore")) {
                    queryParameter = "true";
                } else {
                    queryParameter = A09.getQueryParameter(A18);
                }
                buildUpon.appendQueryParameter(A18, queryParameter);
            }
        } else {
            buildUpon.appendQueryParameter("force_eb_restore", "true");
        }
        return DbT.A10(buildUpon);
    }

    public static final boolean A08(String str) {
        if (str != null) {
            return C66580MXl.A1a("msys://ae-media", 1, str);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        if (r3 != 6) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.net.Uri A01(X.C68145N2l r5, com.instagram.direct.armadilloexpress.transportpayload.Media r6) {
        /*
            int r1 = r6.mediaCase_
            boolean r0 = X.C66581MXm.A1V(r1)
            r2 = 0
            if (r0 == 0) goto L_0x0060
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r0 = r6.A0N()
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0060
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r0 = r6.A0N()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = r0.mediaTransport_
        L_0x0019:
            if (r1 != 0) goto L_0x001f
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.DEFAULT_INSTANCE
            if (r1 == 0) goto L_0x0050
        L_0x001f:
            int r0 = r1.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0046
            X.NFm r4 = com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport.A00(r1)
            X.0qQ.A07(r4)
            int r3 = r6.mediaCase_
            boolean r0 = X.C66581MXm.A1V(r3)
            java.lang.String r2 = "image/gif"
            java.lang.String r1 = "image/jpg"
            if (r0 != 0) goto L_0x005e
            r0 = 3
            if (r3 != r0) goto L_0x0051
            java.lang.String r2 = "video"
        L_0x003d:
            r4.A06(r2)
            X.R5b r1 = X.C66580MXl.A0M(r4)
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = (com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport) r1
        L_0x0046:
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r0 = r6.A0N()
            X.TmS r0 = r0.scanLengths_
            android.net.Uri r2 = A00(r5, r1, r0)
        L_0x0050:
            return r2
        L_0x0051:
            r0 = 2
            if (r3 != r0) goto L_0x0057
            java.lang.String r2 = "audio"
            goto L_0x003d
        L_0x0057:
            r0 = 5
            if (r3 == r0) goto L_0x003d
            r0 = 6
            if (r3 != r0) goto L_0x005e
            goto L_0x003d
        L_0x005e:
            r2 = r1
            goto L_0x003d
        L_0x0060:
            r0 = 3
            if (r1 != r0) goto L_0x0070
            com.instagram.direct.armadilloexpress.transportpayload.Video r1 = r6.A0O()
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0050
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = r1.mediaTransport_
            goto L_0x0019
        L_0x0070:
            r0 = 2
            if (r1 != r0) goto L_0x0080
            java.lang.Object r1 = r6.media_
            com.instagram.direct.armadilloexpress.transportpayload.Voice r1 = (com.instagram.direct.armadilloexpress.transportpayload.Voice) r1
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0050
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = r1.mediaTransport_
            goto L_0x0019
        L_0x0080:
            r0 = 5
            if (r1 != r0) goto L_0x0090
            java.lang.Object r1 = r6.media_
            com.instagram.direct.armadilloexpress.transportpayload.Gif r1 = (com.instagram.direct.armadilloexpress.transportpayload.Gif) r1
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0050
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = r1.mediaTransport_
            goto L_0x0019
        L_0x0090:
            r0 = 6
            if (r1 != r0) goto L_0x0050
            com.instagram.direct.armadilloexpress.transportpayload.AvatarSticker r1 = r6.A0L()
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0050
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r1 = r1.mediaTransport_
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66834MdS.A01(X.N2l, com.instagram.direct.armadilloexpress.transportpayload.Media):android.net.Uri");
    }

    public static final Integer A04(String str) {
        if (0qQ.A0K(str, "image/gif")) {
            return AnonymousClass05K.A0Y;
        }
        if (0qQ.A0K(str, "image/webp")) {
            return AnonymousClass05K.A0j;
        }
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        if (C66580MXl.A1a(MediaStreamTrack.VIDEO_TRACK_KIND, 1, str2)) {
            return AnonymousClass05K.A0N;
        }
        if (str == null) {
            str = "";
        }
        return C51967G9n.A0l(C66580MXl.A1a(MediaStreamTrack.AUDIO_TRACK_KIND, 1, str) ? 1 : 0);
    }

    public static final String A05(String str) {
        if (0qQ.A0K(str, "image/gif")) {
            return ".gif";
        }
        if (0qQ.A0K(str, "image/webp")) {
            return ".webp";
        }
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        if (C66580MXl.A1a(MediaStreamTrack.VIDEO_TRACK_KIND, 1, str2)) {
            return ".mp4";
        }
        if (str == null) {
            str = "";
        }
        if (!C66580MXl.A1a(MediaStreamTrack.AUDIO_TRACK_KIND, 1, str)) {
            return ".jpg";
        }
        return ".mp4";
    }

    public static final Uri A02(C68145N2l n2l, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, long j, long j2) {
        AnonymousClass7TG.A1T(str, str2, str3);
        Uri.Builder A07 = DbW.A07("msys://ae-media");
        A07.appendPath(str);
        A07.appendQueryParameter("sha256", str2);
        A07.appendQueryParameter("encsha256", str3);
        A07.appendQueryParameter("mediakey", str4);
        A07.appendQueryParameter("mediakey_timestamp", String.valueOf(j));
        if (str5 == null) {
            str5 = "image/jpg";
        }
        A07.appendQueryParameter("mimetype", str5);
        if (str6 != null) {
            A07.appendQueryParameter("object_id", str6);
        }
        A07.appendQueryParameter("media_id", String.valueOf(j2));
        if (!(num == null || num.intValue() == 0)) {
            A07.appendQueryParameter("file_length", num.toString());
        }
        if (str7 != null) {
            A07.appendQueryParameter("sidecar", str7);
        }
        if (list != null) {
            A07.appendQueryParameter("scan_lengths", DbT.A0z(",", list, (0sP) null));
        }
        if (n2l != null) {
            A07.appendQueryParameter("thead_id", n2l.A03);
            Long l = n2l.A01;
            if (l != null) {
                A07.appendQueryParameter("thead_jid", C66581MXm.A0x(l));
            }
            A07.appendQueryParameter("otid", n2l.A02);
            A07.appendQueryParameter("timestamp_us", String.valueOf(n2l.A00));
            A07.appendQueryParameter("force_eb_restore", String.valueOf(n2l.A04));
        }
        Uri build = A07.build();
        0qQ.A07(build);
        return build;
    }
}
