package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class GZ0 {
    public final C226492gu A00;
    public final C61080JwI A01;
    public final String A02;
    public final List A03;
    public final Map A04;

    public GZ0(C226492gu r5, C61080JwI jwI, String str, List list, List list2) {
        this.A02 = str;
        this.A00 = r5;
        this.A03 = list2;
        this.A01 = jwI;
        TreeMap treeMap = new TreeMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C55930Hps hps = (C55930Hps) it.next();
            treeMap.put(hps.A00, hps);
        }
        this.A04 = treeMap;
    }
}
