package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Ikb  reason: case insensitive filesystem */
public final class C58043Ikb extends HashMap<String, List<String>> {
    public final /* synthetic */ C233742wN A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;

    public C58043Ikb(C233742wN r5, List list, List list2) {
        this.A00 = r5;
        this.A02 = list;
        this.A01 = list2;
        put("seen_ad_ids", list);
        put(AnonymousClass000.A00(4881), list2);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C251373n0 BTb : r5.A07.A03()) {
            A1C.add(r5.A03.BEZ(BTb.BTb()));
        }
        put(AnonymousClass000.A00(4873), A1C);
    }
}
