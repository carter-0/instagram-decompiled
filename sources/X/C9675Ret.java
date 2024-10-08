package X;

import android.telephony.PhoneNumberFormattingTextWatcher;
import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.form.params.FormParams;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Ret  reason: case insensitive filesystem */
public abstract class C9675Ret {
    /* JADX WARNING: type inference failed for: r0v4, types: [android.telephony.PhoneNumberFormattingTextWatcher, com.facebookpay.form.cell.text.formatter.TextFormatter] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.Rwb, java.lang.Object] */
    public static final FormParams A00(FBPayLoggerData fBPayLoggerData, FormLogEvents formLogEvents, String str, String str2, boolean z) {
        int i = 2131969397;
        if (str == null) {
            i = 2131969390;
        }
        int i2 = 2131962661;
        if (str2 == null) {
            i2 = 0;
        }
        SOR sor = new SOR(0, i, str2, i2);
        sor.A00 = fBPayLoggerData;
        sor.A02 = formLogEvents;
        C8029QfJ qfJ = new C8029QfJ(0);
        qfJ.A0B = str;
        Integer num = AnonymousClass05K.A0j;
        0qQ.A0B(num, 0);
        qfJ.A08 = num;
        qfJ.A03 = 2131954881;
        qfJ.A04 = new PhoneNumberFormattingTextWatcher();
        qfJ.A0G.add(new TextValidatorParams(AnonymousClass05K.A0Y, "", 2131954880, 0));
        TextCellParams A01 = qfJ.A01();
        ImmutableList.Builder builder = sor.A09;
        builder.add(A01);
        C8028QfI qfI = new C8028QfI(16);
        int i3 = 2131954877;
        if (C11431STx.A03()) {
            i3 = 2131966446;
        }
        SR9.A01(qfI, builder, i3, z);
        ? obj = new Object();
        obj.A03 = 2131962660;
        obj.A00 = 2131962658;
        return SOR.A00(obj, sor, 2131962659);
    }
}
