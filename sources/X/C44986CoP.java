package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CoP  reason: case insensitive filesystem */
public abstract class C44986CoP {
    public static C42138BIt parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            ArrayList arrayList = null;
            String str2 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if (C41845B3m.A1H(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("more_available".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r11);
                } else if ("poll_id".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("voters".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            C42137BIs parseFromJson = C44984CoN.parseFromJson(r11);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r11.A0z();
            }
            if (bool == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("more_available", r11, "PollVotersInfo");
            } else if (str == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("poll_id", r11, "PollVotersInfo");
            } else if (arrayList != null || !(r11 instanceof 0c9)) {
                return new C42138BIt(arrayList, bool.booleanValue(), str2, str);
            } else {
                AnonymousClass7TF.A1L("voters", r11, "PollVotersInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
