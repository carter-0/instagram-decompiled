package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.VjO  reason: case insensitive filesystem */
public final class C17986VjO {
    public final Map A00 = new LinkedHashMap();
    public final Map A01 = new LinkedHashMap();
    public final /* synthetic */ C17987VjP A02;

    public C17986VjO(C17987VjP vjP) {
        this.A02 = vjP;
    }

    public final ArrayList A00() {
        ArrayList arrayList = new ArrayList();
        for (Object next : this.A02.A00.A05) {
            Map map = this.A00;
            if (map.containsKey(next)) {
                arrayList.add(map.get(next));
            }
        }
        return arrayList;
    }

    public final ArrayList A01() {
        ArrayList arrayList = new ArrayList();
        for (Object next : this.A02.A00.A05) {
            if (this.A00.containsKey(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
