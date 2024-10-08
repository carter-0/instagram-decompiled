package X;

import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

public final class DGR implements AnonymousClass2hV {
    public static final DGR A00 = new DGR();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        ImmutableList build;
        C250663lr optionalTreeField;
        C250663lr r8 = (C250663lr) obj;
        AddressFormFieldsConfig addressFormFieldsConfig = null;
        ImmutableList.of();
        ImmutableList.Builder builder = ImmutableList.builder();
        if (r8 == null) {
            build = ImmutableList.of();
        } else {
            C250663lr optionalTreeField2 = r8.getOptionalTreeField(0, "fbpay_account_extended", C42153BTa.class, 210136575);
            if (!(optionalTreeField2 == null || (optionalTreeField = optionalTreeField2.getOptionalTreeField(0, "fbpay_account", BTZ.class, -749555483)) == null)) {
                Iterator it = C41845B3m.A0X(optionalTreeField, BTY.class, "shipping_addresses", 0, 141846900).iterator();
                while (it.hasNext()) {
                    builder.add(C41845B3m.A0V(it).reinterpretRequired(0, QTK.class, 332146597));
                }
            }
            C250663lr A02 = r8.A02(C42154BTb.class, "payments_address_form_fields_config(query_params:{\"payment_type\":$payment_type})", -930340835);
            if (A02 != null) {
                QSO qso = (QSO) A02.reinterpretRequired(0, QSO.class, -1659328637);
                0qQ.A07(qso);
                addressFormFieldsConfig = C11393SRk.A00(qso);
            }
            build = builder.build();
        }
        C11367SPk.A03(build, "addresses");
        return new S4M(addressFormFieldsConfig, build);
    }
}
