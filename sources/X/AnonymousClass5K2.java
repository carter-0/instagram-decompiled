package X;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/* renamed from: X.5K2  reason: invalid class name */
public final class AnonymousClass5K2 extends 0ng {
    public final /* synthetic */ C283935Jx A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5K2(C283935Jx r4) {
        super(177, 4, false, false);
        this.A00 = r4;
    }

    public final void run() {
        Object A02;
        IllegalStateException th;
        C283935Jx r1 = this.A00;
        1NH r3 = r1.A00;
        synchronized (r3) {
            A02 = r3.A02("state-v1", false);
        }
        C283955Jz r32 = r1.A01;
        C283955Jz r4 = (C283955Jz) A02;
        synchronized (r32) {
            if (r4 != null) {
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (r4) {
                    List<AnonymousClass4VB> list = r4.A00;
                    0qQ.A0A(list);
                    for (AnonymousClass4VB r7 : list) {
                        String A002 = AnonymousClass5K0.A00(r7);
                        AnonymousClass4VB r9 = (AnonymousClass4VB) r32.A01.get(A002);
                        if (r9 != null) {
                            synchronized (r9) {
                                try {
                                    0qQ.A0B(r7, 0);
                                    synchronized (r7) {
                                        List list2 = r9.A05;
                                        List list3 = r7.A05;
                                        TreeSet treeSet = new TreeSet(list2);
                                        if (list3 != null) {
                                            treeSet.addAll(list3);
                                        }
                                        r9.A05 = new ArrayList(treeSet);
                                        List list4 = r9.A06;
                                        List list5 = r7.A06;
                                        TreeSet treeSet2 = new TreeSet(list4);
                                        if (list5 != null) {
                                            treeSet2.addAll(list5);
                                        }
                                        r9.A06 = new ArrayList(treeSet2);
                                        List list6 = r9.A04;
                                        List list7 = r7.A04;
                                        TreeSet treeSet3 = new TreeSet(list6);
                                        if (list7 != null) {
                                            treeSet3.addAll(list7);
                                        }
                                        r9.A04 = new ArrayList(treeSet3);
                                        Long l = r9.A00;
                                        if (l != null && l.longValue() == 0) {
                                            r9.A00 = r7.A00;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        } else {
                            Long l2 = r7.A00;
                            if (l2 == null) {
                                th = new IllegalStateException("Required value was null.");
                                throw th;
                            } else if (l2.longValue() < currentTimeMillis) {
                                C283955Jz.A00(r7, r32, A002);
                            }
                        }
                    }
                }
            }
        }
    }
}
