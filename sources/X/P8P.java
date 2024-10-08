package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class P8P implements AnonymousClass7DU {
    public final /* synthetic */ OIT A00;

    public P8P(OIT oit) {
        this.A00 = oit;
    }

    public final /* bridge */ /* synthetic */ boolean DA8(Object obj, Object obj2) {
        String str;
        P8Z p8z = (P8Z) obj;
        AnonymousClass7X4 r3 = this.A00.A0G;
        MessageIdentifier messageIdentifier = p8z.A03;
        long micros = TimeUnit.MILLISECONDS.toMicros(p8z.A00);
        2FW r4 = p8z.A02;
        boolean z = p8z.A06;
        List list = p8z.A04;
        if (list != null) {
            str = (String) 00k.A0J(list);
        } else {
            str = null;
        }
        r3.DRe(r4, messageIdentifier, "double_tap", str, (String) null, micros, z);
        return true;
    }
}
