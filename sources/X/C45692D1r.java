package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.D1r  reason: case insensitive filesystem */
public abstract class C45692D1r {
    public static C42133BIn parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            User user = null;
            ArrayList arrayList = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (r12.A1J() != 16L.A09) {
                String A0q = r12.A0q();
                if (C41846B3n.A1Y(r12, A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if (C41845B3m.A1J(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if ("merchant".equals(A0q)) {
                    user = C41845B3m.A0a(r12, false);
                } else if ("stickers".equals(A0q)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            BHN parseFromJson = C44445Cf3.parseFromJson(r12);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C41845B3m.A1A(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if ("text_format".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r12.A1P();
                    }
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r12.A1P();
                    }
                } else if ("vibrant_text_color".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r12.A1P();
                    }
                }
                r12.A0z();
            }
            return new C42133BIn(user, str, str2, str3, str4, str5, str6, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C42133BIn bIn) {
        r2.A0c();
        C41846B3n.A0y(r2, bIn.A01);
        C41846B3n.A11(r2, bIn.A02);
        User user = bIn.A00;
        if (user != null) {
            C41845B3m.A0w(r2, user, "merchant");
        }
        List list = bIn.A07;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r2, "stickers", list);
            while (A0s.hasNext()) {
                BHN bhn = (BHN) A0s.next();
                if (bhn != null) {
                    r2.A0c();
                    C41846B3n.A0y(r2, bhn.A00);
                    r2.A0Z();
                }
            }
            r2.A0Y();
        }
        C41846B3n.A0z(r2, bIn.A03);
        String str = bIn.A04;
        if (str != null) {
            r2.A0R("text_format", str);
        }
        String str2 = bIn.A05;
        if (str2 != null) {
            r2.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2);
        }
        String str3 = bIn.A06;
        if (str3 != null) {
            r2.A0R("vibrant_text_color", str3);
        }
        r2.A0Z();
    }
}
