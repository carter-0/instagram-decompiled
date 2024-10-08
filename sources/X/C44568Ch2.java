package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.Ch2  reason: case insensitive filesystem */
public abstract class C44568Ch2 {
    public static C60968JuQ parseFromJson(16F r21) {
        String A00;
        16F r7 = r21;
        0qQ.A0B(r7, 0);
        try {
            Boolean bool = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                16L A1J = r7.A1J();
                16L r6 = 16L.A09;
                A00 = AnonymousClass000.A00(3153);
                if (A1J == r6) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r7);
                if ("creation_time".equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r7);
                } else if (TraceFieldType.Duration.equals(A17)) {
                    num4 = AnonymousClass7TF.A0X(r7);
                } else if ("formatted_incentive_match".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("formatted_milestone_bonus".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if (A00.equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r7.A1P();
                    }
                } else if (AnonymousClass000.A00(659).equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r7.A1P();
                    }
                } else if ("maxed_out_match_limit".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r7);
                } else if ("num_badges".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r7);
                } else if ("num_supporters".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r7);
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r7.A1P();
                    }
                }
                r7.A0z();
            }
            if (str3 == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r7, "UserPayMediaInsights");
            } else if (bool == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("maxed_out_match_limit", r7, "UserPayMediaInsights");
            } else if (num == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("num_badges", r7, "UserPayMediaInsights");
            } else if (num2 == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("num_supporters", r7, "UserPayMediaInsights");
            } else if (str5 != null || !(r7 instanceof 0c9)) {
                return new C60968JuQ(num3, num4, str, str2, str3, str4, str5, num.intValue(), num2.intValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r7, "UserPayMediaInsights");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
