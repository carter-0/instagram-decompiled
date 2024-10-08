package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cyf  reason: case insensitive filesystem */
public final class C45567Cyf {
    public static C43819CEl parseFromJson(16F r31) {
        16F r2 = r31;
        0qQ.A0B(r2, 0);
        try {
            1XQ r13 = new 1XQ();
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            while (r2.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r2);
                if ("challenge_info".equals(A17)) {
                    r13.A00 = C44106CVx.parseFromJson(r2);
                } else if ("collection_creation_time_ms".equals(A17)) {
                    r13.A06 = C41846B3n.A0e(r2);
                } else if ("collection_creator".equals(A17)) {
                    r13.A02 = C41845B3m.A0a(r2, false);
                } else if ("collection_deadline_ms".equals(A17)) {
                    r13.A07 = C41846B3n.A0e(r2);
                } else if ("collection_expiration_ms".equals(A17)) {
                    r13.A08 = C41846B3n.A0e(r2);
                } else {
                    ArrayList arrayList = null;
                    if ("collection_subtitle".equals(A17)) {
                        r13.A0C = AnonymousClass7TG.A0l(r2);
                    } else if ("collection_title".equals(A17)) {
                        r13.A0D = AnonymousClass7TG.A0l(r2);
                    } else if ("collection_type".equals(A17)) {
                        r13.A0E = AnonymousClass7TG.A0l(r2);
                    } else if ("is_collection_complete".equals(A17)) {
                        r13.A03 = AnonymousClass7TF.A0S(r2);
                    } else if ("is_recurring".equals(A17)) {
                        r13.A04 = AnonymousClass7TF.A0S(r2);
                    } else if (DialogModule.KEY_ITEMS.equals(A17)) {
                        if (r2.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r2.A1J() != 16L.A08) {
                                N3B parseFromJson = C44105CVw.parseFromJson(r2);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        r13.A0G = arrayList;
                    } else if ("next_cursor".equals(A17)) {
                        r13.A0F = AnonymousClass7TG.A0l(r2);
                    } else if ("recurrence_day".equals(A17)) {
                        r13.A09 = AnonymousClass7TF.A0X(r2);
                    } else if ("streak_count".equals(A17)) {
                        r13.A0A = AnonymousClass7TF.A0X(r2);
                    } else if ("user_contribution_count".equals(A17)) {
                        r13.A0B = AnonymousClass7TF.A0X(r2);
                    } else if ("user_has_contributed".equals(A17)) {
                        r13.A05 = AnonymousClass7TF.A0S(r2);
                    } else {
                        1XY.A01(r2, r13, A17);
                    }
                }
                r2.A0z();
            }
            C61080JwI jwI = r13.A00;
            User user = r13.A02;
            Double d = r13.A07;
            Double d2 = r13.A08;
            String str = r13.A0C;
            String str2 = r13.A0D;
            String str3 = r13.A0E;
            Boolean bool = r13.A03;
            Boolean bool2 = r13.A04;
            List list = r13.A0G;
            String str4 = r13.A0F;
            Integer num = r13.A09;
            Integer num2 = r13.A0A;
            Integer num3 = r13.A0B;
            String str5 = str;
            Integer num4 = num;
            Integer num5 = num2;
            Double d3 = d;
            Double d4 = d2;
            Boolean bool3 = r13.A05;
            Double d5 = r13.A06;
            Boolean bool4 = bool;
            Boolean bool5 = bool2;
            C61080JwI jwI2 = jwI;
            User user2 = user;
            r13.A01 = new N3N(jwI2, user2, bool4, bool5, bool3, d5, d3, d4, num4, num5, num3, str5, str2, str3, str4, list);
            return r13;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
