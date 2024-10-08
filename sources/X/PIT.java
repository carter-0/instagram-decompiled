package X;

import android.os.Bundle;
import com.instagram.model.direct.messageid.MessageIdentifier;

public final class PIT implements C51911G7f {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public PIT(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static void A00(PIT pit) {
        switch (pit.A00) {
            case 0:
                NV6.A01((Bundle) pit.A01, (NV6) pit.A02);
                return;
            case 1:
                AnonymousClass7SM r2 = ((C72508P8r) pit.A02).A01;
                MessageIdentifier messageIdentifier = new MessageIdentifier(((BBV) pit.A01).A00, "");
                AnonymousClass9H7 r0 = r2.A00;
                AnonymousClass9H7.A06(r0).A1K(r0.A0u.requireActivity(), messageIdentifier, false);
                return;
            default:
                ((C72494P8d) pit.A02).A00.A02((MessageIdentifier) pit.A01);
                return;
        }
    }

    public final /* synthetic */ void Di5() {
    }

    public final void DZM() {
        A00(this);
    }

    public final void Dvq() {
        A00(this);
    }
}
