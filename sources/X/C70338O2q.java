package X;

import com.facebook.quicklog.PointEditor;

/* renamed from: X.O2q  reason: case insensitive filesystem */
public abstract class C70338O2q {
    public static final void A00(PointEditor pointEditor, C70707OHc oHc, String str) {
        String str2;
        DbY.A1S(pointEditor, str);
        if (C51966G9m.A1X(str) && 00R.A00(str) != '_') {
            str = 002.A0C(str, '_');
        }
        pointEditor.addPointData(002.A0R(str, "previous_value"), oHc.A01);
        pointEditor.addPointData(002.A0R(str, "was_activated"), oHc.A06);
        String A0R = 002.A0R(str, "new_value");
        Integer num = oHc.A03;
        if (num == null || (str2 = num.toString()) == null) {
            str2 = "null";
        }
        pointEditor.addPointData(A0R, str2);
        pointEditor.addPointData(002.A0R(str, "is_activated_with_new_value"), oHc.A04);
        pointEditor.addPointData(002.A0R(str, "new_value_source"), oHc.A02.toString());
        pointEditor.addPointData(002.A0R(str, AnonymousClass000.A00(1315)), oHc.A00);
        pointEditor.addPointData(002.A0R(str, "timestamp"), System.currentTimeMillis());
    }
}
