package X;

import com.instagram.api.schemas.AchievementButtonInfoImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cyd  reason: case insensitive filesystem */
public final class C45565Cyd {
    public static C43812CEe parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                ArrayList arrayList = null;
                if ("about_achievements_components".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            C53427GoJ parseFromJson = CUK.parseFromJson(r9);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r1.A07 = arrayList;
                } else if ("achievements_image_url".equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r9);
                } else if ("footer_text".equals(A17)) {
                    r1.A04 = AnonymousClass7TG.A0l(r9);
                } else if ("primary_button".equals(A17)) {
                    r1.A00 = CUL.parseFromJson(r9);
                } else if ("secondary_button".equals(A17)) {
                    r1.A01 = CUL.parseFromJson(r9);
                } else if (C41845B3m.A1L(A17)) {
                    r1.A05 = AnonymousClass7TG.A0l(r9);
                } else if (C41845B3m.A1E(A17)) {
                    r1.A06 = AnonymousClass7TG.A0l(r9);
                } else {
                    1XY.A01(r9, r1, A17);
                }
                r9.A0z();
            }
            List list = r1.A07;
            0qQ.A0A(list);
            String str = r1.A03;
            0qQ.A0A(str);
            String str2 = r1.A04;
            AchievementButtonInfoImpl achievementButtonInfoImpl = r1.A00;
            AchievementButtonInfoImpl achievementButtonInfoImpl2 = r1.A01;
            String str3 = r1.A05;
            0qQ.A0A(str3);
            String str4 = r1.A06;
            0qQ.A0A(str4);
            r1.A02 = new C42041BEt(achievementButtonInfoImpl, achievementButtonInfoImpl2, str, str2, str3, str4, list);
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
