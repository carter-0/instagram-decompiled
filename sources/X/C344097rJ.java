package X;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.7rJ  reason: invalid class name and case insensitive filesystem */
public final class C344097rJ implements C344107rK {
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public String A04;
    public List A05;
    public List A06;
    public List A07;
    public List A08;
    public Map A09;

    public final List AbX(List list, List list2, List list3) {
        if (list != null) {
            this.A06 = list2;
            this.A07 = list3;
            List list4 = this.A05;
            this.A05 = list;
            return list4;
        }
        throw new NullPointerException("enabledEffectIds cannot be null");
    }

    public final List AbY(List list) {
        List list2 = this.A08;
        this.A08 = list;
        return list2;
    }

    public final List B1M() {
        return this.A07;
    }

    public C344097rJ() {
        this.A00 = -1;
        this.A01 = -1;
        this.A05 = new LinkedList();
        this.A08 = new LinkedList();
        this.A06 = new LinkedList();
        this.A07 = new LinkedList();
        this.A02 = null;
        this.A03 = null;
        this.A09 = new HashMap();
        this.A00 = -1;
        this.A04 = null;
        this.A01 = -1;
    }

    public final void EQO(int i) {
        this.A00 = i;
    }

    public final void ETW(String str) {
        this.A02 = str;
    }

    public final void ETX(String str) {
        this.A03 = str;
    }

    public final void ETZ(Map map) {
        this.A09 = map;
    }

    public final void Eel(int i) {
        this.A01 = i;
    }

    public final void EqL(String str) {
        this.A04 = str;
    }
}
