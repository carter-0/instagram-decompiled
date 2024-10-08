package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.Achievement;
import com.instagram.api.schemas.Challenge;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Huc  reason: case insensitive filesystem */
public final class C56209Huc {
    public static C54052Gyb parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                ArrayList arrayList = null;
                if ("challenges_title".equals(A17)) {
                    r1.A01 = AnonymousClass7TG.A0l(r10);
                } else if ("earned_achievements".equals(A17)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r10.A1J() != 16L.A08) {
                            Achievement parseFromJson = CUN.parseFromJson(r10);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r1.A05 = arrayList;
                } else if ("earned_challenges".equals(A17)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r10.A1J() != 16L.A08) {
                            Challenge parseFromJson2 = HTV.parseFromJson(r10);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    r1.A06 = arrayList;
                } else if ("earned_title".equals(A17)) {
                    r1.A02 = AnonymousClass7TG.A0l(r10);
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r10);
                } else if ("unearned_achievements".equals(A17)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r10.A1J() != 16L.A08) {
                            Achievement parseFromJson3 = CUN.parseFromJson(r10);
                            if (parseFromJson3 != null) {
                                arrayList.add(parseFromJson3);
                            }
                        }
                    }
                    r1.A07 = arrayList;
                } else if ("unearned_challenges".equals(A17)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r10.A1J() != 16L.A08) {
                            Challenge parseFromJson4 = HTV.parseFromJson(r10);
                            if (parseFromJson4 != null) {
                                arrayList.add(parseFromJson4);
                            }
                        }
                    }
                    r1.A08 = arrayList;
                } else if ("unearned_title".equals(A17)) {
                    r1.A04 = AnonymousClass7TG.A0l(r10);
                } else {
                    1XY.A01(r10, r1, A17);
                }
                r10.A0z();
            }
            String str = r1.A01;
            0qQ.A0A(str);
            List list = r1.A05;
            0qQ.A0A(list);
            List list2 = r1.A06;
            0qQ.A0A(list2);
            String str2 = r1.A02;
            0qQ.A0A(str2);
            String str3 = r1.A03;
            0qQ.A0A(str3);
            List list3 = r1.A07;
            0qQ.A0A(list3);
            List list4 = r1.A08;
            0qQ.A0A(list4);
            String str4 = r1.A04;
            0qQ.A0A(str4);
            r1.A00 = new C53443Gob(str, str2, str3, str4, list, list2, list3, list4);
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
