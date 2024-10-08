package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.9Mj  reason: invalid class name and case insensitive filesystem */
public final class C377579Mj extends 0Yg implements C62320sa {
    public final int A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377579Mj(String str, int i) {
        super(0);
        this.A00 = i;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 2:
                List<String> A0R = 00l.A0R(this.A01, new String[]{","}, 0);
                ArrayList<List> arrayList = new ArrayList<>(0Yv.A1E(A0R, 10));
                for (String A0B : A0R) {
                    arrayList.add(00l.A0R(00l.A0B(A0B).toString(), new String[]{"=>"}, 0));
                }
                int A0L = 0se.A0L(0Yv.A1E(arrayList, 10));
                if (A0L < 16) {
                    A0L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
                for (List list : arrayList) {
                    linkedHashMap.put(00l.A0B((String) list.get(0)).toString(), Long.valueOf(Long.parseLong((String) list.get(1))));
                }
                return linkedHashMap;
            case 3:
                List<String> A0R2 = 00l.A0R(this.A01, new String[]{","}, 0);
                ArrayList<List> arrayList2 = new ArrayList<>(0Yv.A1E(A0R2, 10));
                for (String A0B2 : A0R2) {
                    arrayList2.add(00l.A0R(00l.A0B(A0B2).toString(), new String[]{"=>"}, 0));
                }
                int A0L2 = 0se.A0L(0Yv.A1E(arrayList2, 10));
                if (A0L2 < 16) {
                    A0L2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(A0L2);
                for (List list2 : arrayList2) {
                    linkedHashMap2.put(Integer.valueOf(Integer.parseInt(00l.A0B((String) list2.get(0)).toString())), Long.valueOf(Long.parseLong(00l.A0B((String) list2.get(1)).toString())));
                }
                return linkedHashMap2;
            default:
                return this.A01;
        }
    }
}
