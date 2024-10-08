package X;

import java.io.ByteArrayOutputStream;
import java.util.Iterator;

public final class XIC extends 1uo {
    public final /* bridge */ /* synthetic */ 1yQ A06(1yQ r5, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        1vB A02 = 1uZ.A01().A02(byteArrayOutputStream);
        if (A02.A0B(this)) {
            Iterator it = this.A07.iterator();
            if (!it.hasNext()) {
                return new XIB(A02, this, byteArrayOutputStream);
            }
            it.next();
            throw AnonymousClass7TE.A11("onBatchCreated");
        }
        throw AnonymousClass7TE.A0z("Couldn't lock newly created batch");
    }

    public final /* bridge */ /* synthetic */ Object A07() {
        XIB xib = this.A02;
        if (xib == null) {
            return null;
        }
        return xib.A00;
    }
}
