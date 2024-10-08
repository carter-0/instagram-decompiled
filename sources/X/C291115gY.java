package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import java.io.IOException;

/* renamed from: X.5gY  reason: invalid class name and case insensitive filesystem */
public abstract class C291115gY {
    /* JADX WARNING: type inference failed for: r9v2, types: [java.lang.Object, com.instagram.direct.model.thread.CreatorBroadcastThreadInfo] */
    public static CreatorBroadcastThreadInfo parseFromJson(16F r16) {
        16F r2 = r16;
        0qQ.A0B(r2, 0);
        try {
            Boolean bool = null;
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            Integer num = null;
            Boolean bool2 = null;
            Integer num2 = null;
            String str = null;
            SimpleImageUrl simpleImageUrl = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (r2.A1J() != 16L.A09) {
                String A0q = r2.A0q();
                r2.A1J();
                if ("ig_creator_igid".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                } else if ("ig_creator_profile_picture_url".equals(A0q)) {
                    simpleImageUrl = 16h.A00(r2);
                } else if ("is_added_to_inbox".equals(A0q)) {
                    bool = Boolean.valueOf(r2.A0d());
                } else if ("audience_type".equals(A0q)) {
                    num = Integer.valueOf(r2.A1D());
                } else if ("join_link".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if ("is_creator_verified".equals(A0q)) {
                    bool2 = Boolean.valueOf(r2.A0d());
                } else if ("number_of_members".equals(A0q)) {
                    num2 = Integer.valueOf(r2.A1D());
                } else if ("creator_username".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if ("social_context_username".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                }
                r2.A0z();
            }
            if (bool == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("is_added_to_inbox", "CreatorBroadcastThreadInfo");
            } else if (num == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("audience_type", "CreatorBroadcastThreadInfo");
            } else if (bool2 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("is_creator_verified", "CreatorBroadcastThreadInfo");
            } else if (num2 != null || !(r2 instanceof 0c9)) {
                boolean booleanValue = bool.booleanValue();
                int intValue = num.intValue();
                boolean booleanValue2 = bool2.booleanValue();
                int intValue2 = num2.intValue();
                ? obj = new Object();
                obj.A03 = str;
                obj.A02 = simpleImageUrl;
                obj.A07 = booleanValue;
                obj.A00 = intValue;
                obj.A05 = str2;
                obj.A08 = booleanValue2;
                obj.A01 = intValue2;
                obj.A04 = str3;
                obj.A06 = str4;
                return obj;
            } else {
                ((0c9) r2).A03.A00("number_of_members", "CreatorBroadcastThreadInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, CreatorBroadcastThreadInfo creatorBroadcastThreadInfo) {
        r2.A0c();
        String str = creatorBroadcastThreadInfo.A03;
        if (str != null) {
            r2.A0R("ig_creator_igid", str);
        }
        if (creatorBroadcastThreadInfo.A02 != null) {
            r2.A0q("ig_creator_profile_picture_url");
            16h.A01(r2, creatorBroadcastThreadInfo.A02);
        }
        r2.A0S("is_added_to_inbox", creatorBroadcastThreadInfo.A07);
        r2.A0P("audience_type", creatorBroadcastThreadInfo.A00);
        String str2 = creatorBroadcastThreadInfo.A05;
        if (str2 != null) {
            r2.A0R("join_link", str2);
        }
        r2.A0S("is_creator_verified", creatorBroadcastThreadInfo.A08);
        r2.A0P("number_of_members", creatorBroadcastThreadInfo.A01);
        String str3 = creatorBroadcastThreadInfo.A04;
        if (str3 != null) {
            r2.A0R("creator_username", str3);
        }
        String str4 = creatorBroadcastThreadInfo.A06;
        if (str4 != null) {
            r2.A0R("social_context_username", str4);
        }
        r2.A0Z();
    }
}
