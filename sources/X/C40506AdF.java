package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.AdF  reason: case insensitive filesystem */
public final class C40506AdF implements C41841B2w {
    public float A00;
    public Map A01;
    public Map A02;
    public final float A03;
    public final int A04;
    public final Object A05;
    public final C295715om A06;

    public final List AVM(String str, boolean z, boolean z2) {
        float f;
        String str2;
        String str3 = str;
        0qQ.A0B(str3, 0);
        float f2 = this.A03;
        boolean z3 = false;
        if (f2 < 1.0f) {
            synchronized (this.A05) {
                String A002 = C39628A2s.A00.A00(C39628A2s.A05.A00(00l.A0B(C39628A2s.A03.A00(AnonymousClass7TF.A0j(str3), " ")).toString(), " "), "0");
                Map map = this.A01;
                ArrayList A0q = AnonymousClass7TF.A0q(map, 2);
                List A012 = I3s.A01(A002);
                int i = 1;
                while (true) {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    int size = (A012.size() - i) + 1;
                    for (int i2 = 0; i2 < size; i2++) {
                        int i3 = i2 + i;
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        for (int i4 = i2; i4 < i3; i4++) {
                            if (i4 > i2) {
                                str2 = " ";
                            } else {
                                str2 = "";
                            }
                            A1A.append(002.A0R(str2, AnonymousClass7TE.A19(A012, i4)));
                        }
                        String obj = A1A.toString();
                        0qQ.A07(obj);
                        A1C.add(obj);
                    }
                    A0q.addAll(A1C);
                    if (i == 3) {
                        break;
                    }
                    i++;
                }
                LinkedHashMap A1H = AnonymousClass7TE.A1H();
                Iterator it = A0q.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (map.containsKey(next)) {
                        Object obj2 = A1H.get(next);
                        if (obj2 == null) {
                            obj2 = Float.valueOf(0.0f);
                            A1H.put(next, obj2);
                        }
                        A1H.put(next, Float.valueOf(AnonymousClass7TE.A04(obj2) + 1.0f));
                    }
                }
                LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
                Iterator A0s = AnonymousClass7TF.A0s(A1H);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    Object key = A1J.getKey();
                    float A042 = AnonymousClass7TE.A04(A1J.getValue());
                    Object obj3 = map.get(key);
                    if (obj3 == null) {
                        obj3 = Float.valueOf(0.0f);
                    }
                    A1H2.put(key, Float.valueOf(A042 * AnonymousClass7TE.A04(obj3)));
                }
                if (A1H2.size() >= this.A04) {
                    Iterator A0s2 = AnonymousClass7TF.A0s(A1H2);
                    float f3 = 0.0f;
                    float f4 = 0.0f;
                    while (A0s2.hasNext()) {
                        Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s2);
                        Object key2 = A1J2.getKey();
                        float A043 = AnonymousClass7TE.A04(A1J2.getValue());
                        Float f5 = (Float) this.A02.get(key2);
                        if (f5 != null) {
                            f4 += f5.floatValue() * A043;
                            f3 += (float) Math.pow((double) A043, 2.0d);
                        }
                    }
                    if (f3 != 0.0f) {
                        f4 /= (float) Math.sqrt((double) f3);
                    }
                    float f6 = f4 + this.A00;
                    if (f6 >= 0.0f) {
                        f = 1.0f / (((float) Math.exp((double) (-f6))) + 1.0f);
                    } else {
                        float exp = (float) Math.exp((double) f6);
                        f = exp / (exp + 1.0f);
                    }
                    if (f > f2) {
                        z3 = true;
                    }
                }
            }
        }
        if (z3) {
            return AnonymousClass7TE.A1I(new AnonymousClass9J7());
        }
        return 0sn.A00;
    }

    private final void A00(List list) {
        synchronized (this.A05) {
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            ImmutableMap.Builder builder2 = new ImmutableMap.Builder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List A0R = 00l.A0R(AnonymousClass7TE.A19(list, i), new String[]{","}, 0);
                if (A0R.size() == 3) {
                    String A19 = AnonymousClass7TE.A19(A0R, 0);
                    builder.put(A19, Float.valueOf(Float.parseFloat(AnonymousClass7TE.A19(A0R, 1))));
                    builder2.put(A19, Float.valueOf(Float.parseFloat(AnonymousClass7TE.A19(A0R, 2))));
                } else if (A0R.size() == 1) {
                    this.A00 = Float.parseFloat(AnonymousClass7TE.A19(A0R, 0));
                }
            }
            this.A02 = builder.build();
            this.A01 = builder2.build();
        }
    }

    public final int BXR() {
        return 0;
    }

    public final int BXV() {
        return 0;
    }

    public final C295715om C1X() {
        return this.A06;
    }

    public final void Ezd() {
        A00(0sn.A00);
    }

    public C40506AdF(float f, int i) {
        this.A03 = f;
        this.A04 = i;
        this.A06 = C295715om.A08;
        this.A05 = new Object();
        ImmutableMap immutableMap = RegularImmutableMap.A02;
        0qQ.A07(immutableMap);
        this.A02 = immutableMap;
        this.A01 = immutableMap;
    }

    public final void EpX(List list) {
        A00(list);
    }

    public final void FL6(List list, List list2, List list3) {
        A00(list3);
    }

    public C40506AdF() {
        this(1.0f, 0);
    }
}
