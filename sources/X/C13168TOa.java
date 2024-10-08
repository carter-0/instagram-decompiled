package X;

import java.util.Map;
import java.util.function.Consumer;

/* renamed from: X.TOa  reason: case insensitive filesystem */
public final /* synthetic */ class C13168TOa implements Consumer {
    public final /* synthetic */ STY A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public /* synthetic */ C13168TOa(STY sty, Map map, Map map2) {
        this.A00 = sty;
        this.A01 = map;
        this.A02 = map2;
    }

    public final void accept(Object obj) {
        String str;
        STY sty = this.A00;
        Map map = this.A01;
        Map map2 = this.A02;
        if (SDK.A0B.contains(obj)) {
            String A11 = DbT.A11(obj, sty.A0G);
            String A112 = DbT.A11(obj, map);
            if (sty.A0S) {
                if (A11 == null || !A11.equals(A112)) {
                    str = "has_changes";
                } else {
                    str = "no_changes";
                }
            } else if (A112 == null || A112.isEmpty()) {
                str = "empty";
            } else {
                str = "non_empty";
            }
            map2.put(obj, str);
        }
    }
}
