package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: X.39b  reason: invalid class name and case insensitive filesystem */
public final class C2377539b implements AnonymousClass39P, AnonymousClass39S, C2377639c {
    public Boolean A00;
    public boolean A01;
    public C2377739e A02;
    public final Context A03;
    public final AnonymousClass38C A04;
    public final AnonymousClass39K A05;
    public final Object A06 = new Object();
    public final Map A07 = new HashMap();
    public final Map A08 = new HashMap();
    public final AnonymousClass39d A09 = new AnonymousClass39d();
    public final AnonymousClass39Z A0A;
    public final C2377839f A0B;
    public final C2377939g A0C;
    public final AnonymousClass38N A0D;

    public final boolean CK1() {
        return false;
    }

    static {
        AnonymousClass389.A01("GreedyScheduler");
    }

    public final void AG6(String str) {
        Runnable runnable;
        Boolean bool = this.A00;
        if (bool == null) {
            bool = Boolean.valueOf(C2379739z.A00(this.A03, this.A04));
            this.A00 = bool;
        }
        if (!bool.booleanValue()) {
            AnonymousClass389.A00();
            return;
        }
        if (!this.A01) {
            this.A05.A02(this);
            this.A01 = true;
        }
        AnonymousClass389.A00();
        C2377739e r2 = this.A02;
        if (!(r2 == null || (runnable = (Runnable) r2.A02.remove(str)) == null)) {
            ((AnonymousClass38K) r2.A00).A00.removeCallbacks(runnable);
        }
        for (C2805352f r22 : this.A09.A02(str)) {
            this.A0B.A00(r22);
            AnonymousClass39Z r1 = this.A0A;
            0qQ.A0B(r22, 1);
            r1.EyV(r22, -512);
        }
    }

    public final void DDI(C255373u1 r4, boolean z) {
        C262204Co r1;
        C2805352f A002 = this.A09.A00(r4);
        if (A002 != null) {
            this.A0B.A00(A002);
        }
        Object obj = this.A06;
        synchronized (obj) {
            r1 = (C262204Co) this.A07.remove(r4);
        }
        if (r1 != null) {
            AnonymousClass389.A00();
            r1.AG7((CancellationException) null);
        }
        if (!z) {
            synchronized (obj) {
                this.A08.remove(r4);
            }
        }
    }

    public final void EKN(AnonymousClass3DG... r14) {
        long max;
        Boolean bool = this.A00;
        if (bool == null) {
            bool = Boolean.valueOf(C2379739z.A00(this.A03, this.A04));
            this.A00 = bool;
        }
        if (!bool.booleanValue()) {
            AnonymousClass389.A00();
            return;
        }
        if (!this.A01) {
            this.A05.A02(this);
            this.A01 = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (AnonymousClass3DG r5 : r14) {
            C255373u1 A002 = C255363u0.A00(r5);
            AnonymousClass39d r4 = this.A09;
            if (!r4.A03(A002)) {
                synchronized (this.A06) {
                    C255373u1 A003 = C255363u0.A00(r5);
                    Map map = this.A08;
                    C255403u4 r11 = (C255403u4) map.get(A003);
                    if (r11 == null) {
                        r11 = new C255403u4(r5.A02, System.currentTimeMillis());
                        map.put(A003, r11);
                    }
                    max = r11.A01 + (((long) Math.max((r5.A02 - r11.A00) - 5, 0)) * 30000);
                }
                long max2 = Math.max(r5.A00(), max);
                long currentTimeMillis = System.currentTimeMillis();
                if (r5.A0E == C2379139t.ENQUEUED) {
                    if (currentTimeMillis < max2) {
                        C2377739e r10 = this.A02;
                        if (r10 != null) {
                            Map map2 = r10.A02;
                            String str = r5.A0M;
                            Runnable runnable = (Runnable) map2.remove(str);
                            if (runnable != null) {
                                ((AnonymousClass38K) r10.A00).A00.removeCallbacks(runnable);
                            }
                            C255413u5 r42 = new C255413u5(r10, r5);
                            map2.put(str, r42);
                            ((AnonymousClass38K) r10.A00).A00.postDelayed(r42, max2 - System.currentTimeMillis());
                        }
                    } else if (!0qQ.A0K(C255343ty.A08, r5.A0B)) {
                        C255343ty r1 = r5.A0B;
                        if (r1.A06 || (!r1.A03.isEmpty())) {
                            AnonymousClass389.A00();
                        } else {
                            hashSet.add(r5);
                            hashSet2.add(r5.A0M);
                        }
                    } else if (!r4.A03(C255363u0.A00(r5))) {
                        AnonymousClass389.A00();
                        C2805352f A012 = r4.A01(C255363u0.A00(r5));
                        this.A0B.A01(A012);
                        AnonymousClass39Z r3 = this.A0A;
                        0qQ.A0B(A012, 1);
                        AnonymousClass39Y r32 = (AnonymousClass39Y) r3;
                        r32.A01.ATP(new C282855Fa((C282915Fg) null, r32.A00, A012));
                    }
                }
            }
        }
        synchronized (this.A06) {
            if (!hashSet.isEmpty()) {
                TextUtils.join(",", hashSet2);
                AnonymousClass389.A00();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    AnonymousClass3DG r43 = (AnonymousClass3DG) it.next();
                    C255373u1 A004 = C255363u0.A00(r43);
                    Map map3 = this.A07;
                    if (!map3.containsKey(A004)) {
                        map3.put(A004, AnonymousClass52Y.A00(this, this.A0C, r43, ((AnonymousClass38M) this.A0D).A03));
                    }
                }
            }
        }
    }

    public C2377539b(Context context, AnonymousClass38C r5, AnonymousClass39K r6, AnonymousClass39Z r7, AnonymousClass397 r8, AnonymousClass38N r9) {
        this.A03 = context;
        AnonymousClass38L r2 = r5.A02;
        this.A02 = new C2377739e(r5.A00, r2, this);
        this.A0B = new C2377839f(r2, r7);
        this.A0D = r9;
        this.A0C = new C2377939g(r8);
        this.A04 = r5;
        this.A05 = r6;
        this.A0A = r7;
    }

    public final void D5t(C2805152d r6, AnonymousClass3DG r7) {
        C255373u1 A002 = C255363u0.A00(r7);
        if (r6 instanceof C2805252e) {
            AnonymousClass39d r1 = this.A09;
            if (!r1.A03(A002)) {
                AnonymousClass389.A00();
                C2805352f A012 = r1.A01(A002);
                this.A0B.A01(A012);
                AnonymousClass39Z r3 = this.A0A;
                0qQ.A0B(A012, 1);
                AnonymousClass39Y r32 = (AnonymousClass39Y) r3;
                r32.A01.ATP(new C282855Fa((C282915Fg) null, r32.A00, A012));
                return;
            }
            return;
        }
        AnonymousClass389.A00();
        C2805352f A003 = this.A09.A00(A002);
        if (A003 != null) {
            this.A0B.A00(A003);
            this.A0A.EyV(A003, ((QG4) r6).A00);
        }
    }
}
