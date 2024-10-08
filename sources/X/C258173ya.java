package X;

import android.os.Parcelable;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3ya  reason: invalid class name and case insensitive filesystem */
public abstract class C258173ya {
    public static C258213ye parseFromJson(16F r14) {
        String str;
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            Integer num = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str2 = null;
            ArrayList arrayList3 = null;
            SocialContextType socialContextType = null;
            while (r14.A1J() != 16L.A09) {
                String A0q = r14.A0q();
                r14.A1J();
                if ("social_context_action_metadata".equals(A0q)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r14.A1J() != 16L.A08) {
                            C258193yc parseFromJson = C258183yb.parseFromJson(r14);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("social_context_facepile_users".equals(A0q)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r14.A1J() != 16L.A08) {
                            Parcelable.Creator creator = User.CREATOR;
                            User A00 = 1aC.A00(r14, false);
                            if (A00 != null) {
                                arrayList2.add(A00);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("social_context_info_str".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if ("social_context_subitems".equals(A0q)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r14.A1J() != 16L.A08) {
                            C2608547h parseFromJson2 = C2608447g.parseFromJson(r14);
                            if (parseFromJson2 != null) {
                                arrayList3.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("social_context_type".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                    socialContextType = (SocialContextType) SocialContextType.A01.get(str);
                    if (socialContextType == null) {
                        socialContextType = SocialContextType.UNRECOGNIZED;
                    }
                } else if ("social_context_users_count".equals(A0q)) {
                    num = Integer.valueOf(r14.A1D());
                }
                r14.A0z();
            }
            if (arrayList2 == null && (r14 instanceof 0c9)) {
                ((0c9) r14).A03.A00("social_context_facepile_users", "SocialContextInfo");
            } else if (socialContextType == null && (r14 instanceof 0c9)) {
                ((0c9) r14).A03.A00("social_context_type", "SocialContextInfo");
            } else if (num != null || !(r14 instanceof 0c9)) {
                return new C258213ye(socialContextType, str2, arrayList, arrayList2, arrayList3, num.intValue());
            } else {
                ((0c9) r14).A03.A00("social_context_users_count", "SocialContextInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r4, C258213ye r5) {
        r4.A0c();
        List<C258203yd> list = r5.A03;
        if (list != null) {
            16P.A03(r4, "social_context_action_metadata");
            for (C258203yd r0 : list) {
                if (r0 != null) {
                    C258193yc F98 = r0.F98();
                    r4.A0c();
                    String str = F98.A01;
                    if (str != null) {
                        r4.A0R("action_data", str);
                    }
                    String str2 = F98.A02;
                    if (str2 != null) {
                        r4.A0R("action_id", str2);
                    }
                    Boolean bool = F98.A00;
                    if (bool != null) {
                        r4.A0S("is_high_value", bool.booleanValue());
                    }
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        List<User> list2 = r5.A04;
        if (list2 != null) {
            16P.A03(r4, "social_context_facepile_users");
            for (User user : list2) {
                if (user != null) {
                    Parcelable.Creator creator = User.CREATOR;
                    1aC.A08(r4, user);
                }
            }
            r4.A0Y();
        }
        String str3 = r5.A02;
        if (str3 != null) {
            r4.A0R("social_context_info_str", str3);
        }
        List<C2608647i> list3 = r5.A05;
        if (list3 != null) {
            16P.A03(r4, "social_context_subitems");
            for (C2608647i r02 : list3) {
                if (r02 != null) {
                    C2608547h F9B = r02.F9B();
                    r4.A0c();
                    r4.A0P("subitem_count", F9B.A00);
                    String str4 = F9B.A01;
                    if (str4 != null) {
                        r4.A0R("subitem_str", str4);
                    }
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        SocialContextType socialContextType = r5.A01;
        if (socialContextType != null) {
            r4.A0R("social_context_type", socialContextType.A00);
        }
        r4.A0P("social_context_users_count", r5.A00);
        r4.A0Z();
    }
}
