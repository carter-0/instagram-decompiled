package X;

import android.os.Bundle;

/* renamed from: X.Ejh  reason: case insensitive filesystem */
public abstract class C48758Ejh {
    public static final Bundle A00(C61073JwB jwB, Integer num, String str) {
        Bundle A0A = DbY.A0A(num);
        A0A.putInt("ux_flow_linking_code", num.intValue());
        A0A.putString("ux_flow_entrypoint", str);
        if (jwB != null) {
            Number number = (Number) jwB.A00;
            if (number != null) {
                A0A.putInt("ux_flow_flow", number.intValue());
            }
            String str2 = jwB.A03;
            if (str2 != null) {
                A0A.putString("ux_flow_page_id", str2);
            }
            String str3 = jwB.A01;
            if (str3 != null) {
                A0A.putString("back_stack_tag", str3);
            }
        }
        return A0A;
    }
}
