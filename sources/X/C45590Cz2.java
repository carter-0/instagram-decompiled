package X;

import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.api.schemas.NoteEmojiReactionInfo;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cz2  reason: case insensitive filesystem */
public final class C45590Cz2 {
    public static C43817CEj parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("audience".equals(A17)) {
                    r0.A05 = AnonymousClass7TF.A0X(r14);
                } else if ("created_at".equals(A17)) {
                    r0.A06 = AnonymousClass7TF.A0Z(r14);
                } else if ("custom_theme".equals(A17)) {
                    r0.A01 = C2809154s.parseFromJson(r14);
                } else {
                    ArrayList arrayList = null;
                    if ("e2ee_mentioned_user_list".equals(A17)) {
                        if (r14.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r14.A1J() != 16L.A08) {
                                C41846B3n.A1E(r14, arrayList);
                            }
                        }
                        r0.A0C = arrayList;
                    } else if ("expires_at".equals(A17)) {
                        r0.A07 = AnonymousClass7TF.A0Z(r14);
                    } else if ("has_translation".equals(A17)) {
                        r0.A03 = AnonymousClass7TF.A0S(r14);
                    } else if (C41845B3m.A17(A17)) {
                        r0.A08 = AnonymousClass7TG.A0l(r14);
                    } else if (C41845B3m.A1J(A17)) {
                        r0.A09 = AnonymousClass7TG.A0l(r14);
                    } else if ("reactions".equals(A17)) {
                        if (r14.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r14.A1J() != 16L.A08) {
                                NoteEmojiReactionInfo parseFromJson = C45601CzD.parseFromJson(r14);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        r0.A0D = arrayList;
                    } else if (C41845B3m.A1A(A17)) {
                        r0.A0A = AnonymousClass7TG.A0l(r14);
                    } else if (C41845B3m.A1B(A17)) {
                        r0.A02 = C41845B3m.A0a(r14, false);
                    } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A17)) {
                        r0.A0B = AnonymousClass7TG.A0l(r14);
                    } else if ("viewer_has_liked".equals(A17)) {
                        r0.A04 = AnonymousClass7TF.A0S(r14);
                    } else {
                        1XY.A01(r14, r0, A17);
                    }
                }
                r14.A0z();
            }
            Integer num = r0.A05;
            Long l = r0.A06;
            NoteCustomThemeImpl noteCustomThemeImpl = r0.A01;
            List list = r0.A0C;
            Long l2 = r0.A07;
            Boolean bool = r0.A03;
            String str = r0.A08;
            String str2 = r0.A09;
            List list2 = r0.A0D;
            String str3 = r0.A0A;
            r0.A00 = new C2809254t(noteCustomThemeImpl, r0.A02, bool, r0.A04, num, l, l2, str, str2, str3, r0.A0B, list, list2);
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
