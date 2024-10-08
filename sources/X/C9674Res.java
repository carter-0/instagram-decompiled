package X;

import android.util.Patterns;
import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.form.params.FormParams;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Res  reason: case insensitive filesystem */
public abstract class C9674Res {
    /* JADX WARNING: type inference failed for: r1v4, types: [X.Rwb, java.lang.Object] */
    public static final FormParams A00(FBPayLoggerData fBPayLoggerData, FormLogEvents formLogEvents, String str, String str2, boolean z) {
        int i = 2131961574;
        if (str == null) {
            i = 2131961573;
        }
        int i2 = 2131962657;
        if (str2 == null) {
            i2 = 0;
        }
        SOR sor = new SOR(1, i, str2, i2);
        sor.A00 = fBPayLoggerData;
        sor.A02 = formLogEvents;
        C8029QfJ qfJ = new C8029QfJ(1);
        qfJ.A0B = str;
        Integer num = AnonymousClass05K.A0u;
        0qQ.A0B(num, 0);
        qfJ.A08 = num;
        qfJ.A03 = 2131954859;
        Integer num2 = AnonymousClass05K.A0N;
        String pattern = Patterns.EMAIL_ADDRESS.pattern();
        0qQ.A07(pattern);
        qfJ.A0G.add(new TextValidatorParams(num2, pattern, 2131954857, 0));
        TextCellParams A01 = qfJ.A01();
        ImmutableList.Builder builder = sor.A09;
        builder.add(A01);
        C8028QfI qfI = new C8028QfI(16);
        int i3 = 2131954858;
        if (C11431STx.A03()) {
            i3 = 2131966445;
        }
        SR9.A01(qfI, builder, i3, z);
        ? obj = new Object();
        obj.A03 = 2131962656;
        obj.A00 = 2131962654;
        return SOR.A00(obj, sor, 2131962655);
    }
}
