package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: X.2u9  reason: invalid class name */
public final class AnonymousClass2u9 implements C232652uA {
    public int A00;
    public int A01;
    public C232642u8 A02;
    public boolean A03 = true;
    public final C232662uB A04 = new C232662uB(this);
    public final List A05 = new ArrayList();
    public final Map A06 = new HashMap();
    public final Map A07 = new HashMap();
    public final NavigableMap A08 = new TreeMap();

    public final int A00(int i) {
        int i2 = this.A01;
        int i3 = i;
        if (i >= i2) {
            0wb.A03("BinderGroupCombinator", 002.A0p("position: ", ", mViewModelSize: ", ", mRowSpecs: ", i3, i2, this.A05.size()));
        }
        List list = this.A05;
        return ((Number) this.A06.get(((AnonymousClass3BZ) list.get(i)).A01)).intValue() + ((AnonymousClass3BZ) list.get(i)).A00;
    }

    public final View A01(int i, View view, ViewGroup viewGroup) {
        List list = this.A05;
        AnonymousClass3BZ r4 = (AnonymousClass3BZ) list.get(i);
        View view2 = r4.A01.getView(r4.A00, view, viewGroup, r4.A02, r4.A03);
        if (view2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("View is null for BinderGroup: ");
            sb.append(r4.A01.getClass().getSimpleName());
            sb.append(", with ViewType: ");
            sb.append(r4.A00);
            sb.append(", position: ");
            sb.append(i);
            sb.append(", mViewModelSize: ");
            sb.append(this.A01);
            sb.append(", mRowSpecs: ");
            sb.append(list.size());
            0wb.A04("BinderGroupCombinator null view", sb.toString(), 1);
        }
        return view2;
    }

    public final String A02(int i) {
        C231642s0 r1 = (C231642s0) this.A08.floorEntry(Integer.valueOf(i)).getValue();
        return r1.getViewTypeName(i - ((Number) this.A06.get(r1)).intValue());
    }

    public final void A03(C231642s0 r3, Object obj, Object obj2) {
        if (this.A06.get(r3) != null) {
            C232662uB r0 = this.A04;
            r0.A01 = obj;
            r0.A02 = obj2;
            r0.A00 = r3;
            r3.buildRowViewTypes(r0, obj, obj2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Binder group not registered: ");
        sb.append(r3.getClass());
        throw new RuntimeException(sb.toString());
    }

    public AnonymousClass2u9(C232642u8 r6, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C231642s0 r2 = (C231642s0) it.next();
            Map map = this.A06;
            Integer valueOf = Integer.valueOf(i);
            map.put(r2, valueOf);
            this.A08.put(valueOf, r2);
            i += r2.getViewTypeCount();
        }
        this.A02 = r6;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ C232652uA A9P(C231642s0 r1, Object obj, Object obj2) {
        A03(r1, obj, obj2);
        return this;
    }
}
