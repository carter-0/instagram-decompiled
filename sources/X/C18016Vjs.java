package X;

import android.content.Context;
import java.lang.ref.Reference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Vjs  reason: case insensitive filesystem */
public final class C18016Vjs {
    public int A00 = 0;
    public Set A01;
    public final Context A02;
    public final WFU A03;
    public final C14956UGu A04;
    public final VZ8 A05;
    public final WFX A06;
    public final X8W A07;
    public final WFA A08;

    public final HashSet A00(Set set) {
        Object obj;
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((C20944X5n) it.next()).getId());
        }
        WFA wfa = this.A08;
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        Map map = wfa.A01;
        Iterator A16 = DbV.A16(map);
        while (A16.hasNext()) {
            Object next = A16.next();
            Reference reference = (Reference) map.get(next);
            if (!(reference == null || (obj = reference.get()) == null)) {
                if (hashSet.contains(next)) {
                    hashSet3.add(obj);
                } else {
                    hashSet2.add(obj);
                }
            }
        }
        hashSet2.removeAll(hashSet3);
        return hashSet2;
    }

    public final void A01(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            JTT.A1U(hashSet, it);
        }
        Set set2 = this.A04.A01;
        set2.clear();
        set2.addAll(hashSet);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.V31, java.lang.Object] */
    public C18016Vjs(Context context, VZ8 vz8, WFX wfx, X8W x8w, X8X x8x) {
        this.A02 = context;
        this.A07 = x8w;
        this.A05 = vz8;
        WFU wfu = vz8.A01;
        this.A03 = wfu;
        wfu.A0N.add(new WFE(this, 1));
        this.A06 = wfx;
        WFA wfa = new WFA(wfu, wfx, x8x);
        this.A08 = wfa;
        ? obj = new Object();
        obj.A00 = wfa;
        C14956UGu uGu = new C14956UGu(obj, wfu, new C17370VSx(this, x8x));
        wfu.A0A(uGu);
        this.A04 = uGu;
        C17369VSw vSw = new C17369VSw();
        C17552Va5 va5 = uGu.A07;
        va5.A02 = vSw;
        va5.A04.A00 = vSw.A01;
        uGu.A03 = new VOW(this);
    }
}
