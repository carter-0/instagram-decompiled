package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.webrtc.EglBase14Impl;

/* renamed from: X.LRw  reason: case insensitive filesystem */
public abstract class C64171LRw {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r12 == null) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01a9, code lost:
        if (r13 != null) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C11224SFy A01(com.instagram.common.session.UserSession r11, X.1iA r12, X.AnonymousClass3Q2 r13, java.lang.String r14) {
        /*
            r5 = 0
            java.util.LinkedHashMap r3 = X.AnonymousClass7TE.A1H()
            r10 = 0
            if (r12 != 0) goto L_0x025a
            if (r13 == 0) goto L_0x0257
            X.1iA r12 = r13.A1G
            if (r12 != 0) goto L_0x025a
        L_0x000e:
            r0 = -1
        L_0x000f:
            r1 = 336(0x150, float:4.71E-43)
            java.lang.String r4 = X.C66579MXk.A00(r1)
            r2 = 1
            if (r0 == r5) goto L_0x024f
            if (r0 == r2) goto L_0x0245
            r1 = 7
            if (r0 == r1) goto L_0x023b
            r1 = 17
            if (r0 == r1) goto L_0x0231
            r1 = 29
            if (r0 != r1) goto L_0x0267
            X.KjI r0 = X.C62637KjI.A0o
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r4)
        L_0x002b:
            java.lang.Object r4 = r0.A00
            X.KjI r4 = (X.C62637KjI) r4
            java.lang.Object r1 = r0.A01
            java.lang.String r0 = "FILE_ATTACHMENT"
            r3.put(r1, r0)
            if (r13 == 0) goto L_0x022e
            com.instagram.pendingmedia.model.constants.ShareType r0 = r13.A0E()
        L_0x003c:
            com.instagram.pendingmedia.model.constants.ShareType r5 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_STORY_SHARE
            if (r0 == r5) goto L_0x01b6
            if (r13 == 0) goto L_0x01b3
            com.instagram.pendingmedia.model.constants.ShareType r1 = r13.A0E()
        L_0x0046:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE
            if (r1 == r0) goto L_0x01b6
            if (r13 != 0) goto L_0x0214
            r1 = r10
        L_0x004d:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            if (r1 == r0) goto L_0x0059
            if (r13 == 0) goto L_0x0081
            com.instagram.pendingmedia.model.constants.ShareType r0 = r13.A0E()
            if (r0 != r5) goto L_0x0081
        L_0x0059:
            X.1iA r0 = X.1iA.A0Q
            if (r12 != r0) goto L_0x0081
            X.LM7 r0 = r13.A1Q
            if (r0 == 0) goto L_0x0065
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x006d
        L_0x0065:
            X.4nE r0 = r13.A1R
            if (r0 == 0) goto L_0x01b0
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x01b0
        L_0x006d:
            r0 = 1
        L_0x006e:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_optimistic_upload"
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r0, r1)
            java.lang.String r1 = X.JTQ.A0c(r0)
            java.lang.String r0 = "X-Instagram-Rupload-Params"
            r3.put(r0, r1)
        L_0x0081:
            X.1iA r0 = X.1iA.A06
            if (r12 != r0) goto L_0x01a9
            if (r13 == 0) goto L_0x01ad
            boolean r0 = r13.A57
            if (r0 != r2) goto L_0x0092
            java.lang.String r1 = "render_as_sticker"
            java.lang.String r0 = "1"
            r3.put(r1, r0)
        L_0x0092:
            X.1iA r1 = r13.A1G
        L_0x0094:
            X.1iA r0 = X.1iA.A08
            if (r1 != r0) goto L_0x00d0
            if (r13 == 0) goto L_0x00d0
            java.lang.String r1 = "desired_upload_handler"
            r0 = 885(0x375, float:1.24E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r3.put(r1, r0)
            java.lang.String r6 = "generic_metadata"
            java.lang.String r0 = X.DbS.A0r(r6, r3)
            if (r0 == 0) goto L_0x01a3
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>(r0)
        L_0x00b2:
            java.lang.String r1 = r13.A34
            java.lang.String r0 = "instruction_key_id"
            r5.put(r0, r1)
            java.util.List r0 = r13.A4q
            if (r0 != 0) goto L_0x00bf
            X.0sn r0 = X.0sn.A00
        L_0x00bf:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>(r0)
            java.lang.String r0 = "user_ids"
            r5.put(r0, r1)
            java.lang.String r0 = r5.toString()
            r3.put(r6, r0)
        L_0x00d0:
            X.0Tu r5 = X.0Tu.A05
            r0 = 36326141899847222(0x810e6f00003636, double:3.03613663887152E-306)
            X.182.A06(r5, r11, r0)
            if (r13 == 0) goto L_0x010a
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r13.A13
            com.instagram.common.gallery.metadata.ImmersiveMediaFields r0 = r1.A00
            if (r0 == 0) goto L_0x010a
            boolean r0 = r0.A01
            if (r0 != r2) goto L_0x010a
            java.lang.String r0 = r1.A08
            if (r0 == 0) goto L_0x010a
            r0 = 36323689473977738(0x810c3400072d8a, double:3.034585714876532E-306)
            boolean r0 = X.182.A06(r5, r11, r0)
            if (r0 == 0) goto L_0x010a
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r13.A13
            java.lang.String r1 = r0.A08
            if (r1 == 0) goto L_0x010a
            java.lang.String r0 = "3d_media_id"
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r0, r1)
            java.lang.String r1 = X.JTQ.A0c(r0)
            java.lang.String r0 = "X-Instagram-Rupload-Params"
            r3.put(r0, r1)
        L_0x010a:
            X.1iA r1 = X.1iA.A0a
            boolean r9 = X.AnonymousClass7TF.A1W(r12, r1)
            X.1iA r0 = X.1iA.A0E
            if (r12 == r0) goto L_0x0163
            r2 = 0
            if (r12 != r1) goto L_0x0163
            X.0xi r8 = X.0tS.A4E
            X.0tS r1 = r8.A00()
            X.0s0 r0 = r1.A1L
            X.0YZ[] r7 = X.0tS.A4G
            r6 = 219(0xdb, float:3.07E-43)
            java.lang.String r0 = X.DbV.A13(r1, r0, r7, r6)
            boolean r0 = X.C51966G9m.A1X(r0)
            if (r0 == 0) goto L_0x0163
            X.0tS r1 = r8.A00()
            X.0s0 r0 = r1.A1L
            java.lang.String r7 = X.DbV.A13(r1, r0, r7, r6)
            r0 = 18871334679347863(0x430b6100000297, double:2.118765264573369E-307)
            java.lang.String r6 = X.1AW.A04(r5, r0)
            r0 = 18871334679413400(0x430b6100010298, double:2.1187652645992725E-307)
            java.lang.String r5 = X.1AW.A04(r5, r0)
            java.lang.String r1 = X.002.A0R(r6, r7)
            r0 = 939(0x3ab, float:1.316E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            r3.put(r0, r1)
            java.lang.String r1 = X.002.A0R(r5, r7)
            r0 = 917(0x395, float:1.285E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            r3.put(r0, r1)
        L_0x0163:
            X.SOh r5 = new X.SOh
            r5.<init>(r4)
            r5.A07 = r3
            if (r2 != 0) goto L_0x016d
            r14 = r10
        L_0x016d:
            r5.A05 = r14
            r1 = 2
            if (r9 == 0) goto L_0x0173
            r1 = 3
        L_0x0173:
            X.SEh r0 = new X.SEh
            r0.<init>(r1)
            r5.A02(r0)
            if (r9 == 0) goto L_0x019a
            r0 = 0
            X.SEg r2 = new X.SEg
            r2.<init>(r0, r0)
        L_0x0183:
            r5.A01(r2)
            r0 = 1775(0x6ef, float:2.487E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.A06 = r0
            boolean r0 = A03(r12)
            r5.A09 = r0
            X.SFy r0 = new X.SFy
            r0.<init>(r5)
            return r0
        L_0x019a:
            r1 = 0
            r0 = 1024(0x400, float:1.435E-42)
            X.SEg r2 = new X.SEg
            r2.<init>(r0, r1)
            goto L_0x0183
        L_0x01a3:
            org.json.JSONObject r5 = X.DbS.A11()
            goto L_0x00b2
        L_0x01a9:
            if (r13 == 0) goto L_0x01ad
            goto L_0x0092
        L_0x01ad:
            r1 = r10
            goto L_0x0094
        L_0x01b0:
            r0 = 0
            goto L_0x006e
        L_0x01b3:
            r1 = r10
            goto L_0x0046
        L_0x01b6:
            java.util.LinkedHashMap r7 = X.AnonymousClass7TE.A1H()
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r13.A1J
            if (r0 == 0) goto L_0x01cb
            java.lang.String r1 = X.C59670JTa.A05(r0)
            java.lang.String r0 = "music_params"
            r6.put(r0, r1)
        L_0x01cb:
            X.C64193LTa.A0N(r13, r7)
            java.io.StringWriter r1 = X.JTO.A0v()
            X.17W r0 = X.JTO.A0Q(r1)
            X.0qQ.A0A(r0)
            X.C64481Lci.A00(r0, r7, r6)
            java.lang.String r1 = X.JTR.A12(r0, r1)
            java.lang.String r0 = "ig_raven_metadata"
            r3.put(r0, r1)
            X.4nE r0 = r13.A1R
            if (r0 == 0) goto L_0x01ed
            java.lang.String r1 = r0.A02
            if (r1 != 0) goto L_0x01ef
        L_0x01ed:
            java.lang.String r1 = "replayable"
        L_0x01ef:
            int r6 = r1.hashCode()
            r0 = -1212837439(0xffffffffb7b591c1, float:-2.1644753E-5)
            if (r6 == r0) goto L_0x0224
            r0 = 3415681(0x341e81, float:4.786389E-39)
            if (r6 == r0) goto L_0x021a
            r0 = 668488878(0x27d854ae, float:6.0043853E-15)
            if (r6 != r0) goto L_0x0260
            java.lang.String r0 = "permanent"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0260
            r0 = 2
        L_0x020b:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "ephemeral_media_view_mode"
            r3.put(r0, r1)
        L_0x0214:
            com.instagram.pendingmedia.model.constants.ShareType r1 = r13.A0E()
            goto L_0x004d
        L_0x021a:
            java.lang.String r0 = "once"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0260
            r0 = 0
            goto L_0x020b
        L_0x0224:
            java.lang.String r0 = "replayable"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0260
            r0 = 1
            goto L_0x020b
        L_0x022e:
            r0 = r10
            goto L_0x003c
        L_0x0231:
            X.KjI r1 = X.C62637KjI.A0q
            java.lang.String r0 = "file_type"
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)
            goto L_0x002b
        L_0x023b:
            X.KjI r1 = X.C62637KjI.A0p
            java.lang.String r0 = "audio_type"
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)
            goto L_0x002b
        L_0x0245:
            X.KjI r1 = X.C62637KjI.A0t
            java.lang.String r0 = "video_type"
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)
            goto L_0x002b
        L_0x024f:
            X.KjI r0 = X.C62637KjI.A0s
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r4)
            goto L_0x002b
        L_0x0257:
            r12 = r10
            goto L_0x000e
        L_0x025a:
            int r0 = r12.ordinal()
            goto L_0x000f
        L_0x0260:
            java.lang.String r0 = "Unknown view mode value: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r1)
            throw r0
        L_0x0267:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unexpected media type: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r12, r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64171LRw.A01(com.instagram.common.session.UserSession, X.1iA, X.3Q2, java.lang.String):X.SFy");
    }

    public static final C63740L4y A02(1iA r9, String str, Map map) {
        String A00;
        C62637KjI kjI;
        0qQ.A0B(str, 1);
        HashMap A1E = AnonymousClass7TE.A1E();
        1iA r3 = 1iA.A0Q;
        if (r9 == r3) {
            A00 = "X_FB_PHOTO_WATERFALL_ID";
        } else {
            A00 = Pxd.A00(613);
        }
        A1E.put(A00, str);
        A1E.put("X-Instagram-Rupload-Params", JTQ.A0c(map));
        switch (r9.ordinal()) {
            case 0:
                break;
            case 17:
                kjI = C62637KjI.A0q;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                A1E.put("selfie_captcha_video", "true");
                Object obj = map.get("challenge_id");
                if (obj != null) {
                    A1E.put("challenge_id", obj);
                }
                Object obj2 = map.get("ig_user_id");
                if (obj2 != null) {
                    A1E.put("ig_user_id", obj2);
                }
                kjI = C62637KjI.A0b;
                break;
            case 19:
                A1E.put("id_captcha_photo", "true");
                kjI = C62637KjI.A0h;
                break;
            case 20:
                A1E.put("id_captcha_photo", "true");
                Object obj3 = map.get("challenge_id");
                if (obj3 != null) {
                    A1E.put("challenge_id", obj3);
                }
                Object obj4 = map.get("ig_user_id");
                if (obj4 != null) {
                    A1E.put("ig_user_id", obj4);
                    break;
                }
                break;
            case 21:
                A1E.put("ig_hangouts_canvas", "true");
                Object obj5 = map.get("canvas_id");
                if (obj5 != null) {
                    A1E.put("canvas_id", obj5);
                }
                kjI = C62637KjI.A0i;
                break;
            case 22:
                A1E.put("mk_header_media", "true");
                kjI = C62637KjI.A0v;
                break;
            case 23:
                A1E.put("mk_header_media", "true");
                kjI = C62637KjI.A0w;
                break;
            default:
                kjI = C62637KjI.A0j;
                break;
        }
        kjI = C62637KjI.A0h;
        if (r9 == r3 || r9 == 1iA.A0a) {
            C63040xi r1 = 0tS.A4E;
            if (C51966G9m.A1X(r1.A00().A07())) {
                A1E.put(Pxd.A00(206), r1.A00().A07());
            }
        }
        C11348SOh sOh = new C11348SOh(kjI);
        sOh.A07 = A1E;
        sOh.A02(new C11181SEh(2));
        sOh.A01(new C11180SEg(1024, false));
        sOh.A06 = "i.instagram.com";
        sOh.A09 = A03(r9);
        return new C63740L4y(new C11224SFy(sOh), r9);
    }

    public static final C11224SFy A00() {
        C11348SOh sOh = new C11348SOh(C62637KjI.A0j);
        sOh.A06 = "i.instagram.com";
        sOh.A01(new C11180SEg(0, false));
        sOh.A02(new C11181SEh(3));
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        C63040xi r1 = 0tS.A4E;
        if (C51966G9m.A1X(r1.A00().A07())) {
            A1H.put(Pxd.A00(206), r1.A00().A07());
        }
        sOh.A07 = A1H;
        return new C11224SFy(sOh);
    }

    public static final boolean A03(1iA r2) {
        if (r2 == 1iA.A0I || r2 == 1iA.A0J || r2 == 1iA.A0H || r2 == 1iA.A0Q) {
            return false;
        }
        return true;
    }
}
