package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fbpay.w3c.Address;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

public final class TXU extends 0Yg implements 0sP {
    public static final TXU A00 = new TXU();

    public TXU() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ArrayList arrayList;
        S4M s4m = (S4M) obj;
        0qQ.A0B(s4m, 0);
        ImmutableList immutableList = s4m.A01;
        if (immutableList != null) {
            arrayList = AnonymousClass7TG.A0r(immutableList);
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                C250663lr A0V = C41845B3m.A0V(it);
                arrayList.add(new Address(A0V.A09("care_of"), A0V.A0A("city_name"), (String) null, A0V.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID), A0V.A0C("state_name"), A0V.getOptionalStringField(7, "street1"), A0V.A0D("street2"), A0V.A0B("postal_code")));
            }
        } else {
            arrayList = null;
        }
        0qQ.A0A(arrayList);
        return arrayList;
    }
}
