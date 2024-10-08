package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Mon  reason: case insensitive filesystem */
public final class C67493Mon extends 0ng {
    public final /* synthetic */ C66777McN A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67493Mon(C66777McN mcN) {
        super(112, 3, false, false);
        this.A00 = mcN;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [X.OBV, java.lang.Object] */
    public final void run() {
        OBV obv;
        C66777McN mcN = this.A00;
        11Z.A05("This operation can't be run on UI thread.");
        String string = mcN.A06.getString("quickRepliesCollection", (String) null);
        if (string != null) {
            try {
                OBV parseFromJson = C67551Mpl.parseFromJson(16P.A00(string));
                obv = parseFromJson;
                if (parseFromJson == null) {
                }
            } catch (IOException e) {
                0wb.A05("quick_replies_deserialization", "failed to deserialize", 1, e);
            }
            List list = obv.A01;
            list.getClass();
            11Z.A02(new C67494Moo(mcN, obv.A00, C51966G9m.A1J(list)));
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        ? obj = new Object();
        obj.A01 = AnonymousClass7TE.A1D(A1C);
        obj.A00 = "";
        obv = obj;
        List list2 = obv.A01;
        list2.getClass();
        11Z.A02(new C67494Moo(mcN, obv.A00, C51966G9m.A1J(list2)));
    }
}
