package X;

import android.util.SparseArray;
import com.google.common.base.Strings;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2tJ  reason: invalid class name and case insensitive filesystem */
public final class C232252tJ {
    public SparseArray A00;
    public Map A01;
    public Map A02;

    private void A00(int i) {
        this.A01 = new HashMap((int) Math.ceil((((double) i) * 4.0d) / 3.0d), 0.75f);
        this.A00 = new SparseArray(i);
        this.A02 = new HashMap(i);
    }

    public final C232232tF A01(int i) {
        C232232tF r0 = (C232232tF) this.A00.get(i);
        if (r0 != null) {
            return r0;
        }
        throw new NullPointerException(Strings.A00("No definition corresponding to rawViewType %s was found", Integer.valueOf(i)));
    }

    public C232252tJ(Map map) {
        A00(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Number number = (Number) entry.getKey();
            C232232tF r4 = (C232232tF) entry.getValue();
            Class modelClass = r4.modelClass();
            StringBuilder sb = new StringBuilder();
            sb.append("Duplicate ModelClass ");
            sb.append(modelClass);
            sb.append(" in definition not allowed");
            17k.A0H(!this.A01.containsKey(modelClass), sb.toString());
            this.A01.put(modelClass, r4);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Duplicate ModelClass ");
            sb2.append(modelClass);
            sb2.append(" in model-to-view-type map not allowed");
            17k.A0H(!this.A02.containsKey(modelClass), sb2.toString());
            this.A02.put(modelClass, number);
            this.A00.put(number.intValue(), r4);
        }
    }

    public C232252tJ(List list) {
        A00(list.size());
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C232232tF r4 = (C232232tF) it.next();
            Class modelClass = r4.modelClass();
            StringBuilder sb = new StringBuilder();
            sb.append("Duplicate ModelClass ");
            sb.append(modelClass);
            sb.append(" in definition not allowed");
            17k.A0H(!this.A01.containsKey(modelClass), sb.toString());
            this.A01.put(modelClass, r4);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Duplicate ModelClass ");
            sb2.append(modelClass);
            sb2.append(" in model-to-view-type map not allowed");
            17k.A0H(!this.A02.containsKey(modelClass), sb2.toString());
            this.A02.put(modelClass, Integer.valueOf(i));
            this.A00.put(i, r4);
            i++;
        }
    }
}
