package X;

import com.facebookpay.offsite.models.message.PaymentContainerType;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.S9d  reason: case insensitive filesystem */
public abstract class C11083S9d {
    public static final C8914RFh A00(String str) {
        0qQ.A0B(str, 0);
        C8914RFh rFh = (C8914RFh) C8914RFh.A02.get(str);
        if (rFh != null) {
            return rFh;
        }
        throw AnonymousClass7TF.A0W("ContainerType Type is not found for identifier => ", str);
    }

    public static void A01(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(A00(((PaymentContainerType) it.next()).getType()));
    }
}
