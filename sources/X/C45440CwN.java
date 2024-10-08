package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MediaNoticeIcon;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.CwN  reason: case insensitive filesystem */
public final class C45440CwN {
    public final UserSession A00;

    public final C61045Jvj A00(1Xj r13) {
        String id;
        String str;
        String str2;
        String str3;
        String str4;
        MediaNoticeIcon mediaNoticeIcon;
        MediaNoticeIcon mediaNoticeIcon2;
        String str5;
        String str6;
        String str7;
        String str8;
        TreeUpdaterJNI A0T;
        String str9;
        UyW uyW;
        String name;
        0qQ.A0B(r13, 0);
        if (182.A06(0Tu.A05, this.A00, 36331081112306565L)) {
            1Xy r4 = r13.A0C;
            C254573sh r0 = C250663lr.Companion;
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("__typename", "XDTMediaDict");
            A1E.put("strong_id__", r4.getId());
            A1E.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r4.getId());
            if (r4.BQb() == null) {
                A0T = null;
            } else {
                DUN BQb = r4.BQb();
                HashMap A1E2 = AnonymousClass7TE.A1E();
                A1E2.put("__typename", "XDTMediaNoticeDict");
                A1E2.put("notice_text", BQb.getNoticeText());
                A1E2.put("notice_sub_text", BQb.getNoticeSubText());
                A1E2.put("notice_url", BQb.getNoticeUrl());
                A1E2.put("notice_icon", BQb.BWb());
                A1E2.put("media_id", BQb.getMediaId());
                A1E2.put("ridge_match_id", BQb.BoS());
                A0T = C41845B3m.A0T("XDTMediaNoticeDict", A1E2);
            }
            A1E.put("media_notice", A0T);
            C43743C7n c7n = (C43743C7n) C41845B3m.A0T("XDTMediaDict", A1E).treeFromUpdater(C43743C7n.class);
            0qQ.A07(c7n);
            BlP A0E = c7n.A0E();
            str7 = null;
            if (A0E != null) {
                str2 = A0E.getOptionalStringField(0, "notice_text");
            } else {
                str2 = null;
            }
            BlP A0E2 = c7n.A0E();
            if (A0E2 != null) {
                str4 = A0E2.A08("notice_sub_text");
            } else {
                str4 = null;
            }
            BlP A0E3 = c7n.A0E();
            if (A0E3 == null || (uyW = (UyW) A0E3.getOptionalEnumField(3, "notice_icon", UyW.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) == null || (name = uyW.name()) == null) {
                str9 = null;
            } else {
                str9 = name.toLowerCase(Locale.ROOT);
                0qQ.A07(str9);
            }
            mediaNoticeIcon2 = (MediaNoticeIcon) MediaNoticeIcon.A01.get(str9);
            if (mediaNoticeIcon2 == null) {
                mediaNoticeIcon2 = MediaNoticeIcon.UNRECOGNIZED;
            }
            BlP A0E4 = c7n.A0E();
            if (A0E4 != null) {
                str8 = A0E4.A09("notice_url");
            } else {
                str8 = null;
            }
            BlP A0E5 = c7n.A0E();
            if (A0E5 != null) {
                str6 = A0E5.A0B("media_id");
            } else {
                str6 = null;
            }
            id = c7n.getRequiredStringField(0, "strong_id__");
            BlP A0E6 = c7n.A0E();
            if (A0E6 != null) {
                str7 = A0E6.A0C("ridge_match_id");
            }
        } else {
            id = r13.getId();
            DUN BQb2 = r13.A0C.BQb();
            if (BQb2 != null) {
                str = BQb2.getNoticeText();
            } else {
                str = null;
            }
            DUN BQb3 = r13.A0C.BQb();
            if (BQb3 != null) {
                str3 = BQb3.getNoticeSubText();
            } else {
                str3 = null;
            }
            DUN BQb4 = r13.A0C.BQb();
            if (BQb4 != null) {
                mediaNoticeIcon = BQb4.BWb();
            } else {
                mediaNoticeIcon = null;
            }
            DUN BQb5 = r13.A0C.BQb();
            if (BQb5 != null) {
                str5 = BQb5.getMediaId();
            } else {
                str5 = null;
            }
            DUN BQb6 = r13.A0C.BQb();
            if (BQb6 != null) {
                str7 = BQb6.BoS();
            } else {
                str7 = null;
            }
            DUN BQb7 = r13.A0C.BQb();
            if (BQb7 != null) {
                str8 = BQb7.getNoticeUrl();
            } else {
                str8 = null;
            }
        }
        return new C61045Jvj(mediaNoticeIcon2, id, str2, str4, str6, str7, str8);
    }

    public C45440CwN(UserSession userSession) {
        this.A00 = userSession;
    }
}
