package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.tagging.model.Tag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4H4  reason: invalid class name */
public final class AnonymousClass4H4 {
    public static final AnonymousClass4H4 A00 = new Object();

    public final void A05(UserSession userSession, Tag tag, String str, String str2, String str3, List list) {
        HOH hoh;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        ArrayList A02 = A02(list);
        if (A04(A02)) {
            String str4 = str;
            ArrayList A01 = A01(str, A02);
            C53175Gjl A002 = A00(tag, str);
            if (str3.equals(AnonymousClass000.A00(262))) {
                hoh = HOH.PROFILE_ICON;
            } else {
                hoh = null;
            }
            A03(hoh, C62669KkV.BOTTOM_SHEET_CLICK, A002, userSession2, userSession.A06, str4, str2, A01, (Map) null);
        }
    }

    public final void A07(UserSession userSession, String str, String str2, int i) {
        0qQ.A0B(userSession, 0);
        LinkedHashMap A06 = 0Yt.A06(new 0eP[]{new 0eP("num_mentions", String.valueOf(i)), new 0eP("source", str2)});
        A03((HOH) null, C62669KkV.CROSSPOST_WITH_FB_MENTIONS_IMPRESSION, (C53175Gjl) null, userSession, userSession.A06, str, (String) null, (List) null, A06);
    }

    public final void A0A(UserSession userSession, String str, List list) {
        0qQ.A0B(list, 2);
        if (A04(list)) {
            ArrayList A01 = A01(str, list);
            A03((HOH) null, C62669KkV.CROSSPOST_WITH_FB_TAGS_IMPRESSION, (C53175Gjl) null, userSession, userSession.A06, str, (String) null, A01, (Map) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r2 = java.lang.Boolean.valueOf(r0);
        r1 = new X.0bb();
        r1.A06("tag_source", r3);
        r1.A06("tag_type", r4);
        r1.A06("media_id", r6);
        r1.A03("is_tag_cropped", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        r3 = "fb_post";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r3 != false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (((com.instagram.model.fbusertag.FBUserTag) r5).A01 != com.instagram.api.schemas.FBTagType.A04) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r3 != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r3 = "ig_post";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C53175Gjl A00(com.instagram.tagging.model.Tag r5, java.lang.String r6) {
        /*
            boolean r3 = r5 instanceof com.instagram.model.fbusertag.FBUserTag
            if (r3 == 0) goto L_0x003e
            r0 = r5
            com.instagram.model.fbusertag.FBUserTag r0 = (com.instagram.model.fbusertag.FBUserTag) r0
            com.instagram.api.schemas.FBTagType r1 = r0.A01
            com.instagram.api.schemas.FBTagType r0 = com.instagram.api.schemas.FBTagType.WITH_TAG
            if (r1 != r0) goto L_0x003e
            java.lang.String r4 = "with_tag"
        L_0x000f:
            com.instagram.model.fbusertag.FBUserTag r5 = (com.instagram.model.fbusertag.FBUserTag) r5
            com.instagram.api.schemas.FBTagType r2 = r5.A01
            com.instagram.api.schemas.FBTagType r1 = com.instagram.api.schemas.FBTagType.HIDDEN_PHOTO_TAG
            r0 = 1
            if (r2 == r1) goto L_0x003b
        L_0x0018:
            r0 = 0
            if (r3 != 0) goto L_0x003b
            java.lang.String r3 = "ig_post"
        L_0x001d:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            X.Gjl r1 = new X.Gjl
            r1.<init>()
            java.lang.String r0 = "tag_source"
            r1.A06(r0, r3)
            java.lang.String r0 = "tag_type"
            r1.A06(r0, r4)
            java.lang.String r0 = "media_id"
            r1.A06(r0, r6)
            java.lang.String r0 = "is_tag_cropped"
            r1.A03(r0, r2)
            return r1
        L_0x003b:
            java.lang.String r3 = "fb_post"
            goto L_0x001d
        L_0x003e:
            r0 = 3745(0xea1, float:5.248E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            if (r3 == 0) goto L_0x0018
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4H4.A00(com.instagram.tagging.model.Tag, java.lang.String):X.Gjl");
    }

    public static final ArrayList A01(String str, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(A00((Tag) it.next(), str));
        }
        return arrayList;
    }

    public static final ArrayList A02(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof Tag) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final void A03(HOH hoh, C62669KkV kkV, C53175Gjl gjl, UserSession userSession, String str, String str2, String str3, List list, Map map) {
        long j;
        0wc A01 = AnonymousClass0kN.A01(new 0xG("fb_tag_carryover_to_ig_crosspost"), userSession);
        0Aj A002 = A01.A00(A01.A00, "fb_tag_carryover_to_ig_crosspost");
        if (A002.isSampled()) {
            Long A0n = 00y.A0n(10, str);
            if (A0n != null) {
                j = A0n.longValue();
            } else {
                j = 0;
            }
            A002.A9F("ig_userid", Long.valueOf(j));
            A002.A8M(kkV, "event");
            A002.AAJ("media_id", str2);
            A002.AAe("tags_rendered_information", list);
            A002.AAK(gjl, "tag_interacted_information");
            A002.AAJ(C66579MXk.A00(11), str3);
            A002.A8M(hoh, "bottom_sheet_entry_point");
            A002.A9H("extra", map);
            A002.Cgf();
        }
    }

    public final void A06(UserSession userSession, String str) {
        A03((HOH) null, C62669KkV.FB_MENTION_TAP, (C53175Gjl) null, userSession, userSession.A06, (String) null, (String) null, (List) null, 0se.A0M(new 0eP("source", str)));
    }

    public static final boolean A04(List list) {
        for (Object obj : list) {
            if (obj instanceof FBUserTag) {
                return true;
            }
        }
        return false;
    }

    public final void A08(UserSession userSession, String str, String str2, String str3, List list) {
        HOH hoh;
        ArrayList A02 = A02(list);
        if (A04(A02)) {
            String str4 = str;
            ArrayList A01 = A01(str, A02);
            if (str3.equals(AnonymousClass000.A00(262))) {
                hoh = HOH.PROFILE_ICON;
            } else if (str3.equals("bottom_sheet_entry_tag_clip_tag_pill")) {
                hoh = HOH.CLIP_TAG_PILL;
            } else {
                hoh = null;
            }
            A03(hoh, C62669KkV.BOTTOM_SHEET_IMPRESSION, (C53175Gjl) null, userSession, userSession.A06, str4, str2, A01, (Map) null);
        }
    }

    public final void A09(UserSession userSession, String str, List list) {
        if (A04(list)) {
            ArrayList A01 = A01(str, list);
            A03((HOH) null, C62669KkV.CROSSPOST_CLIP_WITH_FB_TAGS_IMPRESSION, (C53175Gjl) null, userSession, userSession.A06, str, (String) null, A01, (Map) null);
        }
    }
}
