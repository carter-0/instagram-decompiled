package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.BoostedActionStatus;
import java.io.IOException;

public abstract class V76 {
    public static N57 parseFromJson(16F r18) {
        String str;
        16F r2 = r18;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            BoostedActionStatus boostedActionStatus = null;
            String str2 = null;
            Integer num = null;
            Integer num2 = null;
            String str3 = null;
            Integer num3 = null;
            Integer num4 = null;
            Integer num5 = null;
            String str4 = null;
            Integer num6 = null;
            Integer num7 = null;
            String str5 = null;
            Integer num8 = null;
            Integer num9 = null;
            Integer num10 = null;
            while (r2.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r2);
                if ("boosting_status".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                    boostedActionStatus = (BoostedActionStatus) BoostedActionStatus.A01.get(str);
                    if (boostedActionStatus == null) {
                        boostedActionStatus = BoostedActionStatus.UNRECOGNIZED;
                    }
                } else if ("budget".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if ("daily_spend_offset_amount".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r2);
                } else if ("elapsed_duration_in_days".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r2);
                } else if ("instagram_media_id".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if ("number_of_ctd_threads".equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r2);
                } else if ("remaining_budget_offset_amount".equals(A17)) {
                    num4 = AnonymousClass7TF.A0X(r2);
                } else if ("remaining_duration_in_days".equals(A17)) {
                    num5 = AnonymousClass7TF.A0X(r2);
                } else if ("spent".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                } else if ("spent_budget_offset_amount".equals(A17)) {
                    num6 = AnonymousClass7TF.A0X(r2);
                } else if (TraceFieldType.StartTime.equals(A17)) {
                    num7 = AnonymousClass7TF.A0X(r2);
                } else if ("thumbnail_url".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r2.A1P();
                    }
                } else if ("time_remaining_in_hours".equals(A17)) {
                    num8 = AnonymousClass7TF.A0X(r2);
                } else if ("total_budget_offset_amount".equals(A17)) {
                    num9 = AnonymousClass7TF.A0X(r2);
                } else {
                    num10 = C41847B3o.A13(r2, num10, A17, "total_duration_in_days");
                }
                r2.A0z();
            }
            return new N57(boostedActionStatus, num, num2, num3, num4, num5, num6, num7, num8, num9, num10, str2, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
