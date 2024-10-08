package X;

import android.graphics.drawable.Drawable;
import android.view.Choreographer;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.56g  reason: invalid class name and case insensitive filesystem */
public abstract class C2811856g {
    public Choreographer.FrameCallback A00;
    public Runnable A01;
    public final AtomicReference A02 = new AtomicReference();

    public static void A00(C2811856g r2, long j) {
        r2.A02.getAndSet((Object) null);
        r2.A01(j);
    }

    public void A01(long j) {
        Throwable th;
        Collection values;
        float f;
        boolean z;
        Object obj;
        boolean z2;
        Collection values2;
        int size;
        AnonymousClass56d r0 = ((C2811756f) this).A00;
        AnonymousClass56d r45 = r0;
        r0.A02 = false;
        if (r0.A03) {
            long j2 = j;
            if (r45.A00 != j) {
                C2811556c r11 = r45.A01;
                synchronized (r11) {
                    if (r11.A00) {
                        ArrayList arrayList = r11.A02;
                        arrayList.clear();
                        Set set = r11.A06;
                        if (set.size() != 0) {
                            04u r4 = new 04u(0);
                            01r r6 = new 01r(0);
                            ArrayDeque arrayDeque = new ArrayDeque();
                            Iterator it = set.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList2 = ((C2811956h) it.next()).A05;
                                int size2 = arrayList2.size();
                                for (int i = 0; i < size2; i++) {
                                    C2812356l r1 = (C2812356l) arrayList2.get(i);
                                    ArrayList arrayList3 = r1.A02;
                                    if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                                        r6.put(r1, Integer.valueOf(size));
                                    } else if (!r4.contains(r1)) {
                                        arrayDeque.add(r1);
                                        r4.add(r1);
                                    }
                                }
                            }
                            if (r6.isEmpty() || !r4.isEmpty()) {
                                loop2:
                                while (true) {
                                    if (!arrayDeque.isEmpty()) {
                                        C2812356l r02 = (C2812356l) arrayDeque.pollFirst();
                                        arrayList.add(r02);
                                        Map map = r02.A03;
                                        if (map == null) {
                                            values2 = Collections.emptySet();
                                        } else {
                                            values2 = map.values();
                                        }
                                        Iterator it2 = values2.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                Object next = it2.next();
                                                int intValue = ((Integer) r6.get(next)).intValue() - 1;
                                                r6.put(next, Integer.valueOf(intValue));
                                                if (intValue == 0) {
                                                    arrayDeque.addLast(next);
                                                } else if (intValue < 0) {
                                                    th = new RuntimeException("Detected cycle.");
                                                    break loop2;
                                                }
                                            }
                                        }
                                    } else {
                                        if (arrayList.size() == r6.size() + r4.size()) {
                                            Collections.reverse(arrayList);
                                            r11.A00 = false;
                                        } else {
                                            th = new RuntimeException("Had unreachable nodes in graph -- this likely means there was a cycle");
                                        }
                                    }
                                }
                                throw th;
                            }
                            th = new RuntimeException("Graph has nodes, but they represent a cycle with no leaf nodes!");
                            throw th;
                        }
                    }
                    ArrayList arrayList4 = r11.A02;
                    int size3 = arrayList4.size();
                    int i2 = 0;
                    while (i2 < size3) {
                        C2812356l r03 = (C2812356l) arrayList4.get(i2);
                        C2812356l r17 = r03;
                        C2812356l r10 = r03;
                        if (r03 instanceof C2812756q) {
                            f = ((C2812756q) r10).A00;
                        } else if (r10 instanceof AnonymousClass5BS) {
                            AnonymousClass5BS r102 = (AnonymousClass5BS) r10;
                            if (r102.A00 == Long.MIN_VALUE) {
                                r102.A00 = j2;
                                f = r102.A02("initial").A00;
                                float f2 = r102.A02("end").A00;
                                C293365kb r3 = r102.A01;
                                C293375kc r5 = r3.A04;
                                r5.A00 = (double) f;
                                Iterator it3 = r3.A07.iterator();
                                if (it3.hasNext()) {
                                    it3.next();
                                    th = new NullPointerException("onSpringUpdate");
                                    throw th;
                                }
                                double d = r5.A00;
                                r3.A00 = d;
                                r3.A06.A00 = d;
                                r5.A01 = 0.0d;
                                r3.A00((double) f2);
                            } else {
                                f = r102.A02("end").A00;
                                C293365kb r12 = r102.A01;
                                r12.A00((double) f);
                                if (!r12.A01()) {
                                    double d2 = ((double) (j - r102.A00)) / 1.0E9d;
                                    boolean z3 = false;
                                    double d3 = 0.064d;
                                    if (d2 <= 0.064d) {
                                        d3 = d2;
                                    }
                                    double d4 = r12.A01 + d3;
                                    r12.A01 = d4;
                                    C262554Eu r2 = r12.A02;
                                    double d5 = r2.A01;
                                    double d6 = r2.A00;
                                    C293375kc r04 = r12.A04;
                                    C293375kc r43 = r04;
                                    double d7 = r04.A00;
                                    double d8 = r04.A01;
                                    C293375kc r05 = r12.A06;
                                    C293375kc r42 = r05;
                                    double d9 = r05.A00;
                                    double d10 = r42.A01;
                                    while (d4 >= 0.001d) {
                                        d4 -= 0.001d;
                                        r12.A01 = d4;
                                        if (d4 < 0.001d) {
                                            C293375kc r06 = r12.A05;
                                            r06.A00 = d7;
                                            r06.A01 = d8;
                                        }
                                        double d11 = r12.A00;
                                        double d12 = ((d11 - d9) * d5) - (d6 * d8);
                                        double d13 = d8 + (d12 * 0.001d * 0.5d);
                                        double d14 = ((d11 - (((d8 * 0.001d) * 0.5d) + d7)) * d5) - (d6 * d13);
                                        double d15 = d8 + (d14 * 0.001d * 0.5d);
                                        double d16 = ((d11 - (d7 + ((d13 * 0.001d) * 0.5d))) * d5) - (d6 * d15);
                                        d9 = d7 + (d15 * 0.001d);
                                        d10 = d8 + (d16 * 0.001d);
                                        d7 += (d8 + ((d13 + d15) * 2.0d) + d10) * 0.16666666666666666d * 0.001d;
                                        d8 += (d12 + ((d14 + d16) * 2.0d) + (((d11 - d9) * d5) - (d6 * d10))) * 0.16666666666666666d * 0.001d;
                                    }
                                    C293375kc r13 = r42;
                                    r13.A00 = d9;
                                    r13.A01 = d10;
                                    C293375kc r07 = r43;
                                    r07.A00 = d7;
                                    r07.A01 = d8;
                                    if (d4 > 0.0d) {
                                        double d17 = d4 / 0.001d;
                                        C293375kc r15 = r12.A05;
                                        double d18 = 1.0d - d17;
                                        d7 = (d7 * d17) + (r15.A00 * d18);
                                        C293375kc r132 = r43;
                                        r132.A00 = d7;
                                        d8 = (d8 * d17) + (r15.A01 * d18);
                                        r132.A01 = d8;
                                    }
                                    if (r12.A01()) {
                                        if (d5 > 0.0d) {
                                            r43.A00 = r12.A00;
                                        } else {
                                            r12.A00 = d7;
                                        }
                                        if (0.0d != d8) {
                                            r43.A01 = 0.0d;
                                        }
                                        z3 = true;
                                    }
                                    if (r12.A03) {
                                        r12.A03 = false;
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z3) {
                                        r12.A03 = true;
                                    }
                                    Iterator it4 = r12.A07.iterator();
                                    if (it4.hasNext()) {
                                        it4.next();
                                        if (z2) {
                                            th = new NullPointerException("onSpringActivate");
                                        } else {
                                            th = new NullPointerException("onSpringUpdate");
                                        }
                                        throw th;
                                    }
                                    r102.A00 = j2;
                                    f = (float) r43.A00;
                                }
                            }
                        } else if (r10 instanceof C2812256k) {
                            C2812256k r103 = (C2812256k) r10;
                            Map map2 = r103.A03;
                            if (map2 == null || map2.size() <= 1) {
                                Map map3 = r103.A03;
                                if (map3 == null) {
                                    z = false;
                                } else {
                                    z = map3.containsKey("default_input");
                                }
                                Reference reference = (Reference) r103.A00.A02();
                                if (!(reference == null || (obj = reference.get()) == null)) {
                                    if ((obj instanceof Drawable) && ((Drawable) obj).getCallback() == null) {
                                        reference.clear();
                                    } else if (!z) {
                                        f = r103.A01.AWw(obj);
                                    } else {
                                        Map map4 = r103.A03;
                                        if (map4 == null || map4.size() <= 1) {
                                            f = r103.A02("default_input").A00;
                                            C2812256k.A01(r103, f);
                                        } else {
                                            th = new RuntimeException("Trying to get single input of node with multiple inputs!");
                                            throw th;
                                        }
                                    }
                                }
                                if (z) {
                                    Map map5 = r103.A03;
                                    if (map5 == null || map5.size() <= 1) {
                                        f = r103.A02("default_input").A00;
                                    } else {
                                        th = new RuntimeException("Trying to get single input of node with multiple inputs!");
                                        throw th;
                                    }
                                } else {
                                    f = r103.A00;
                                }
                            } else {
                                th = new RuntimeException("Trying to check for single input of node with multiple inputs!");
                                throw th;
                            }
                        } else if (r10 instanceof C2812556o) {
                            C2812556o r104 = (C2812556o) r10;
                            if (r104.A01 == Long.MIN_VALUE) {
                                r104.A02 = j2;
                                r104.A01 = j2;
                                r104.A00 = j + (r104.A03 * 1000000);
                                f = 0.0f;
                            } else {
                                long j3 = r104.A00;
                                int i3 = (j > j3 ? 1 : (j == j3 ? 0 : -1));
                                r104.A01 = j2;
                                if (i3 >= 0) {
                                    f = 1.0f;
                                } else {
                                    long j4 = r104.A02;
                                    f = ((float) (j - j4)) / ((float) (j3 - j4));
                                }
                            }
                        } else if (r10 instanceof C2812856r) {
                            float f3 = r10.A02("initial").A00;
                            f = f3 + (r10.A02("default_input").A00 * (r10.A02("end").A00 - f3));
                        } else {
                            C2812956s r105 = (C2812956s) r10;
                            f = r105.A00.getInterpolation(r105.A02("default_input").A00);
                        }
                        if (j != r17.A01) {
                            C2812356l r08 = r17;
                            r08.A01 = j2;
                            r08.A00 = f;
                            i2++;
                        } else {
                            th = new RuntimeException("Got a calculate value call multiple times in the same frame. This isn't expected.");
                            throw th;
                        }
                    }
                    int size4 = arrayList4.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        C2812356l r52 = (C2812356l) arrayList4.get(i4);
                        Map map6 = r11.A05;
                        C2813056t r44 = (C2813056t) map6.get(r52);
                        if (r44 != null && !r44.A01) {
                            Map map7 = r52.A03;
                            if (map7 == null) {
                                values = Collections.emptySet();
                            } else {
                                values = map7.values();
                            }
                            Iterator it5 = values.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    if (!((C2813056t) map6.get(it5.next())).A01) {
                                        break;
                                    }
                                } else if (!(r52 instanceof C2812656p) || ((C2812656p) r52).isFinished()) {
                                    r44.A01 = true;
                                }
                            }
                        }
                    }
                    r11.A01 = true;
                    for (C2811956h r53 : r11.A06) {
                        ArrayList arrayList5 = r53.A05;
                        int size5 = arrayList5.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 < size5) {
                                if (!((C2813056t) r11.A05.get(arrayList5.get(i5))).A01) {
                                    break;
                                }
                                i5++;
                            } else {
                                C2812156j r09 = r53.A00;
                                if (r09 != null) {
                                    AnonymousClass56a r010 = r09.A00;
                                    r010.A03();
                                    r010.A08();
                                }
                                r53.A00();
                            }
                        }
                    }
                    r11.A01 = false;
                    List<C2811956h> list = r11.A03;
                    for (C2811956h A002 : list) {
                        r11.A00(A002);
                    }
                    List<C2811956h> list2 = r11.A04;
                    for (C2811956h A012 : list2) {
                        r11.A01(A012);
                    }
                    list.clear();
                    list2.clear();
                }
                r45.A00 = j2;
            }
            if (r45.A03 && !r45.A02) {
                AnonymousClass56d r011 = r45;
                r011.A05.A01(r011.A04);
                r45.A02 = true;
            }
        }
    }
}
