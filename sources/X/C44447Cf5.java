package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cf5  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44447Cf5 {
    public static Map A00(DUT dut) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dut.getId() != null) {
            C41845B3m.A0x(dut.getId(), A1H);
        }
        if (dut.BRk() != null) {
            List BRk = dut.BRk();
            ArrayList A0r = AnonymousClass7TG.A0r(BRk);
            Iterator it = BRk.iterator();
            while (it.hasNext()) {
                C41846B3n.A1T(A0r, it);
            }
            A1H.put("mentioned_users", A0r);
        }
        if (dut.Bzh() != null) {
            A1H.put("sticker_style", dut.Bzh());
        }
        if (dut.getText() != null) {
            C41845B3m.A10(dut.getText(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
