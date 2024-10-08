package X;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7LO  reason: invalid class name */
public final class AnonymousClass7LO implements C232312tT {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass9HS A02;
    public final HashMap A03 = new HashMap();
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(new C377139Kr(this, 41));
    public final 0sP A05;
    public final C61480nO A06;
    public final AnonymousClass7LF A07;
    public final Set A08;
    public volatile String A09;

    public AnonymousClass7LO(Context context, UserSession userSession, AnonymousClass9HS r5, String str, 0sP r7) {
        0qQ.A0B(str, 5);
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = r5;
        this.A05 = r7;
        this.A09 = str;
        C61480nO A002 = 0nY.A00();
        0qQ.A07(A002);
        this.A06 = A002;
        this.A07 = new AnonymousClass7LF(userSession);
        Set singleton = Collections.singleton(163);
        0qQ.A07(singleton);
        this.A08 = singleton;
    }

    public final void CJN(String str) {
        0qQ.A0B(str, 0);
        if (182.A06(0Tu.A05, this.A01, 36319128218246062L)) {
            this.A09 = str;
            HashMap hashMap = this.A03;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                int size = ((C330767Oc) entry.getValue()).A01.size();
                ArrayList arrayList2 = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList2.add(Integer.valueOf(intValue));
                }
                018.A16(arrayList2, arrayList);
            }
            hashMap.clear();
            A02(arrayList);
        }
    }

    private final List A00() {
        List<String> A0R = 00l.A0R(182.A04(0Tu.A05, this.A01, 36882078172053936L), new String[]{","}, 0);
        ArrayList arrayList = new ArrayList(0Yv.A1E(A0R, 10));
        for (String parseInt : A0R) {
            arrayList.add(Integer.valueOf(Integer.parseInt(parseInt)));
        }
        return arrayList;
    }

    public final void A02(List list) {
        UserSession userSession = this.A01;
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 36319128218246062L)) {
            ArrayList arrayList = new ArrayList();
            if (182.A06(r3, userSession, 36319128218508207L)) {
                if (182.A06(r3, userSession, 36319128218704817L)) {
                    arrayList.addAll(A00());
                } else {
                    arrayList.addAll(list);
                    list = A00();
                }
            }
            arrayList.addAll(list);
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (!this.A07.A00(intValue)) {
                    Set set = this.A08;
                    Integer valueOf = Integer.valueOf(intValue);
                    if (!set.contains(valueOf)) {
                        HashMap hashMap = this.A03;
                        Object obj = hashMap.get(valueOf);
                        if (obj == null) {
                            obj = new C330767Oc();
                            hashMap.put(valueOf, obj);
                        }
                        C330767Oc r2 = (C330767Oc) obj;
                        int i = r2.A00;
                        int i2 = ((Map) this.A04.getValue()).get(valueOf);
                        if (i2 == null) {
                            i2 = 5;
                        }
                        if (i < ((Number) i2).intValue()) {
                            r2.A00++;
                            arrayList2.add(valueOf);
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                A01(this, arrayList2);
            }
        }
    }

    public final /* bridge */ /* synthetic */ C249703kE AX2(int i) {
        C249703kE r1;
        ViewParent viewParent;
        View view;
        HashMap hashMap = this.A03;
        Integer valueOf = Integer.valueOf(i);
        C330767Oc r0 = (C330767Oc) hashMap.get(valueOf);
        if (r0 != null) {
            r1 = (C249703kE) r0.A01.poll();
            if (!(r1 == null || (view = r1.itemView) == null)) {
                viewParent = view.getParent();
            }
            viewParent = null;
        } else {
            r1 = null;
            viewParent = null;
        }
        if (viewParent == null) {
            return r1;
        }
        0KC.A0Q("LegacyRecyclerViewMessageThreadViewHolderPreloader", "Found view holder with non-null parent for view type: %d", new Object[]{valueOf});
        return null;
    }

    public static final void A01(AnonymousClass7LO r2, List list) {
        if (!list.isEmpty()) {
            r2.A06.ATE(new C330777Od(r2, r2.A09, list));
        }
    }
}
