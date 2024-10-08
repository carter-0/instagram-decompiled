package X;

import com.facebook.common.locale.Country;
import com.facebookpay.form.cell.address.AddressCellParams;
import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.form.params.FormParams;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Req  reason: case insensitive filesystem */
public abstract class C9672Req {
    /* JADX WARNING: type inference failed for: r2v5, types: [X.Rwb, java.lang.Object] */
    public static FormParams A00(AddressFormFieldsConfig addressFormFieldsConfig, FBPayLoggerData fBPayLoggerData, FormLogEvents formLogEvents, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        int i = 2131973724;
        if (str == null) {
            i = 2131973723;
        }
        int i2 = 2131962648;
        if (str == null) {
            i2 = 0;
        }
        SOR sor = new SOR(2, i, str, i2);
        sor.A00 = fBPayLoggerData;
        sor.A02 = formLogEvents;
        C8029QfJ qfJ = new C8029QfJ(4);
        qfJ.A03 = 2131954825;
        qfJ.A0B = str2;
        TextCellParams A01 = qfJ.A01();
        ImmutableList.Builder builder = sor.A09;
        builder.add(A01);
        C8027QfH qfH = new C8027QfH(addressFormFieldsConfig, 11);
        qfH.A0G = str3;
        qfH.A0N = str4;
        qfH.A0I = str5;
        qfH.A0J = str6;
        qfH.A0L = str7;
        qfH.A0M = str8;
        String str10 = str9;
        Country country = null;
        if (str9 != null) {
            country = Country.A00((Country) null, str10);
        }
        qfH.A0B = country;
        builder.add(new AddressCellParams(qfH));
        C8028QfI qfI = new C8028QfI(16);
        int i3 = 2131954823;
        if (C11431STx.A03()) {
            i3 = 2131966443;
        }
        SR9.A01(qfI, builder, i3, z);
        ? obj = new Object();
        obj.A03 = 2131962647;
        obj.A00 = 2131962645;
        return SOR.A00(obj, sor, 2131962646);
    }
}
