package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.VBo  reason: case insensitive filesystem */
public abstract class C16936VBo {
    public static final void A00(AnonymousClass0iw r4, 0xF r5, UserSession userSession, Integer num, String str, String str2) {
        String str3;
        String str4;
        0qQ.A0B(r5, 2);
        AnonymousClass0xN A00 = C60510iO.A00(userSession);
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
                str3 = "related_hashtag_item_impression";
                break;
            case 1:
                str3 = "related_hashtag_item_tapped";
                break;
            case 2:
                str3 = "related_location_item_impression";
                break;
            default:
                str3 = "related_location_item_tapped";
                break;
        }
        0xI A002 = 0xI.A00(r4, str3);
        switch (intValue) {
            case 0:
            case 1:
                str4 = "hashtag";
                break;
            default:
                str4 = "location";
                break;
        }
        A002.A0C("entity_type", str4);
        A002.A0C("entity_name", str);
        A002.A0C("entity_id", str2);
        A002.A04(r5);
        A00.EFq(A002);
    }
}
