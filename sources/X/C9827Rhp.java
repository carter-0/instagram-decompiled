package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.Rhp  reason: case insensitive filesystem */
public abstract class C9827Rhp {
    public static void A00(0lg r3, Integer num, Integer num2, String str, int i) {
        String str2;
        if (num.intValue() != 1) {
            str2 = "ig_emergency_push_did_set_initial_version";
        } else {
            str2 = "ig_emergency_push_did_error";
        }
        0xI A01 = 0xI.A01(str2, (String) null);
        A01.A08(Integer.valueOf(i), AnonymousClass000.A00(2969));
        if (str != null) {
            A01.A0C(TraceFieldType.Error, str);
        }
        if (num2 != null) {
            A01.A08(num2, "failed_version");
        }
        C60510iO.A00(r3).EHF(A01);
    }
}
