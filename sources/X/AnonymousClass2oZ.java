package X;

import java.text.BreakIterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2oZ  reason: invalid class name */
public final class AnonymousClass2oZ {
    public AnonymousClass2oY A00;
    public C229862oS A01;
    public C229872oT A02;
    public final HashMap A03 = new HashMap();
    public final Map A04 = new HashMap();
    public final Map A05 = new HashMap();
    public final Map A06 = new HashMap();
    public final Map A07 = new HashMap();
    public final Map A08 = new HashMap();
    public final AnonymousClass2oV A09;
    public final AnonymousClass2oU A0A;

    public final synchronized C254303sG A03(String str) {
        C254303sG r2;
        0qQ.A0B(str, 0);
        r2 = (C254303sG) this.A08.get(str);
        if (r2 == null) {
            r2 = new C254303sG(C254313sH.A00(str), C254313sH.A00(str));
        }
        return r2;
    }

    private final boolean A01(C254273sD r7, C254303sG r8) {
        List list = r8.A01.A07;
        if ((!list.isEmpty()) && ((C254333sJ) list.get(list.size() - 1)).A00 != -1) {
            return true;
        }
        if (r7.BVl() || r7.BzO() != AnonymousClass05K.A01 || r8.A00.A00()) {
            return false;
        }
        return true;
    }

    public final synchronized C254353sL A02(C254273sD r18, C254293sF r19) {
        C254353sL r9;
        synchronized (this) {
            C254273sD r6 = r18;
            String BJR = r6.BJR();
            C254303sG A042 = C254313sH.A00.A04(r6, A03(BJR));
            Map map = this.A06;
            C254233s9 DRS = this.A00.DRS((C254233s9) map.get(BJR), new C377179Kv(r6, 25));
            0qQ.A0B(BJR, 0);
            Map map2 = this.A07;
            C254343sK r11 = (C254343sK) map2.get(BJR);
            if (r11 == null) {
                r11 = new C254343sK();
            }
            List<C254253sB> AvC = r6.AvC();
            0qQ.A0B(AvC, 1);
            for (C254253sB r8 : AvC) {
                0qQ.A0B(r8, 0);
                r11.A00.put(r8.EzS(), r8);
            }
            map2.put(BJR, r11);
            String str = "";
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            if (characterInstance.last() <= 0) {
                str = "Sessionless";
            }
            String BYw = r6.BYw();
            String str2 = BYw;
            if (BYw == null) {
                BYw = null;
            }
            List singletonList = Collections.singletonList(A042);
            0qQ.A07(singletonList);
            A01(r6, A042);
            r9 = new C254353sL(DRS, r11, (C254253sB) null, str, BJR, BYw, singletonList);
            if (str2 != null) {
                HashMap hashMap = this.A03;
                if (!hashMap.containsKey(BJR)) {
                    hashMap.put(BJR, str2);
                }
            }
            boolean A012 = A01(r6, A042);
            C254293sF r62 = r19;
            if (A012) {
                String str3 = (String) this.A03.get(BJR);
                if (str3 == null) {
                    str3 = null;
                }
                r62.DzO(r9, (Boolean) null, str3);
                this.A08.put(BJR, new C254303sG(C254313sH.A00(BJR), C254313sH.A00(BJR)));
                map.remove(BJR);
                map2.remove(BJR);
                this.A04.remove(BJR);
            } else {
                this.A08.put(BJR, A042);
                if (DRS != null) {
                    map.put(BJR, DRS);
                }
            }
            String str4 = (String) this.A03.get(BJR);
            if (str4 == null) {
                str4 = null;
            }
            r62.DzO(r9, false, str4);
        }
        return r9;
    }

    public AnonymousClass2oZ(AnonymousClass2oV r2, AnonymousClass2oY r3, C229862oS r4, AnonymousClass2oU r5, C229872oT r6) {
        this.A01 = r4;
        this.A02 = r6;
        this.A0A = r5;
        this.A00 = r3;
        this.A09 = r2;
    }

    public static final void A00(List list, int i, int i2, long j) {
        C254333sJ r5 = (C254333sJ) 00k.A0L(list);
        if (i2 >= i) {
            if (r5 == null || r5.A00 != -1) {
                list.add(new C254333sJ(j, -1));
            }
        } else if (r5 != null && r5.A00 == -1) {
            r5.A00 = j;
        }
    }
}
