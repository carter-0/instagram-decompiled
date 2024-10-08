package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.DayOfTheWeek;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Ed5  reason: case insensitive filesystem */
public abstract class C48348Ed5 {
    public static C47214Dt1 parseFromJson(16F r7) {
        String str;
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            ArrayList arrayList = null;
            Integer num = null;
            String str2 = null;
            Integer num2 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("days".equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r7.A1J() != 16L.A08) {
                            if (r7.A11() == 16L.A0G) {
                                str = null;
                            } else {
                                str = r7.A1P();
                            }
                            DayOfTheWeek dayOfTheWeek = (DayOfTheWeek) DayOfTheWeek.A01.get(str);
                            if (dayOfTheWeek == null) {
                                dayOfTheWeek = DayOfTheWeek.UNRECOGNIZED;
                            }
                            arrayList.add(dayOfTheWeek);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("end_time".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r7);
                } else if ("label".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if (TraceFieldType.StartTime.equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r7);
                }
                r7.A0z();
            }
            return new C47214Dt1(num, num2, str2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
