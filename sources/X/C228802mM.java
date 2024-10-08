package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2mM  reason: invalid class name and case insensitive filesystem */
public final class C228802mM implements C228812mN {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ C271744jW AMS(Object obj) {
        AnonymousClass4EB r2 = (AnonymousClass4EB) obj;
        0qQ.A0B(r2, 0);
        return new C271724jU(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r2 == X.1UQ.A0l) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ int AZx(java.lang.Object r5) {
        /*
            r4 = this;
            X.4EB r5 = (X.AnonymousClass4EB) r5
            if (r5 == 0) goto L_0x003c
            X.1Xg r0 = r5.A01
            if (r0 == 0) goto L_0x003c
            X.1UQ r2 = r0.A06
            X.1UQ r0 = X.1UQ.A0T
            if (r2 == r0) goto L_0x0013
            X.1UQ r1 = X.1UQ.A0l
            r0 = 0
            if (r2 != r1) goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            r1 = 1
            r3 = 41
            if (r0 == 0) goto L_0x0051
            if (r5 == 0) goto L_0x005e
            X.1Xg r2 = r5.A01
            if (r2 == 0) goto L_0x005e
            X.1UQ r0 = r2.A06
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x0046
            r0 = 43
            if (r1 != r0) goto L_0x003e
            X.1Xn r0 = r2.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            if (r0 == 0) goto L_0x005e
            com.google.common.collect.ImmutableList r0 = r0.A1D()
            int r1 = r0.size()
            return r1
        L_0x003c:
            r0 = 0
            goto L_0x0014
        L_0x003e:
            java.lang.String r1 = "Unsupported multi ad type"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0046:
            X.Gz1 r0 = r2.A01()
            java.util.List r0 = r0.A0B
            int r1 = r0.size()
            return r1
        L_0x0051:
            if (r5 == 0) goto L_0x005c
            X.1Xg r0 = r5.A01
        L_0x0055:
            boolean r0 = X.AnonymousClass3VP.A00(r0)
            if (r0 == 0) goto L_0x005e
            return r1
        L_0x005c:
            r0 = 0
            goto L_0x0055
        L_0x005e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228802mM.AZx(java.lang.Object):int");
    }

    public final /* bridge */ /* synthetic */ Integer Ahi(Object obj) {
        1Xg r2 = (1Xg) obj;
        0qQ.A0B(r2, 0);
        return r2.A02();
    }

    public final /* bridge */ /* synthetic */ Integer Ahl(Object obj) {
        1Xg r2 = (1Xg) obj;
        0qQ.A0B(r2, 0);
        1Xj A02 = 1Xi.A02(r2.A05);
        if (A02 != null) {
            return A02.A2J();
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ String BEZ(Object obj) {
        AnonymousClass4EB r2 = (AnonymousClass4EB) obj;
        0qQ.A0B(r2, 0);
        return r2.A01.A09;
    }

    public final /* bridge */ /* synthetic */ String BEb(Object obj) {
        1Xg r2 = (1Xg) obj;
        0qQ.A0B(r2, 0);
        return r2.A09;
    }

    public final /* bridge */ /* synthetic */ String BJS(Object obj) {
        1Xg r2 = (1Xg) obj;
        0qQ.A0B(r2, 0);
        return r2.A09;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.Hpk, java.lang.Object] */
    public final /* bridge */ /* synthetic */ List BUO(Object obj) {
        1UQ r4;
        1UQ r6;
        AnonymousClass4EB r10 = (AnonymousClass4EB) obj;
        0qQ.A0B(r10, 0);
        1Xg r7 = r10.A01;
        if (r7 != null && ((r4 = r7.A06) == (r6 = 1UQ.A0T) || r4 == 1UQ.A0l)) {
            if (182.A06(0Tu.A05, this.A00, 36327950081145676L)) {
                int ordinal = r4.ordinal();
                if (ordinal == 41) {
                    List<C55923Hpk> list = r7.A01().A0B;
                    ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
                    for (C55923Hpk hpk : list) {
                        C54077Gz1 gz1 = new C54077Gz1();
                        gz1.A03 = r7.A01().A03;
                        ? obj2 = new Object();
                        obj2.A00 = hpk.A00();
                        List singletonList = Collections.singletonList(obj2);
                        0qQ.A07(singletonList);
                        gz1.A0B = singletonList;
                        gz1.A01 = r7.A01().A00();
                        gz1.A06 = r7.A01().A01();
                        String id = hpk.A00().getId();
                        if (id != null) {
                            arrayList.add(new AnonymousClass4EB(r10.A00, new 1Xg(gz1, r6, id), AnonymousClass3PG.NETWORK, r10.A03));
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    return arrayList;
                } else if (ordinal == 43) {
                    1Xj A02 = 1Xi.A02(r7.A05);
                    if (A02 != null) {
                        ImmutableList A1D = A02.A1D();
                        ArrayList arrayList2 = new ArrayList(0Yv.A1E(A1D, 10));
                        Iterator it = A1D.iterator();
                        while (it.hasNext()) {
                            1Xj r0 = (1Xj) it.next();
                            0qQ.A0A(r0);
                            1Xg A01 = 1Xi.A01(r0);
                            C46298DUb BUS = r0.A0C.BUS();
                            if (BUS != null) {
                                AnonymousClass1Xn r2 = A01.A05;
                                1Xj A022 = 1Xi.A02(r2);
                                if (A022 != null) {
                                    ImmutableList of = ImmutableList.of();
                                    0qQ.A07(of);
                                    A022.A0C.EZK(of);
                                }
                                1Xj A023 = 1Xi.A02(r2);
                                if (A023 != null) {
                                    A023.A0C.Edf(BUS);
                                }
                            }
                            arrayList2.add(new AnonymousClass4EB(r10.A00, A01, AnonymousClass3PG.NETWORK, r10.A03));
                        }
                        return arrayList2;
                    }
                } else {
                    throw new IllegalStateException("Unsupported multi ad type");
                }
            }
        }
        return 0sn.A00;
    }

    public final /* bridge */ /* synthetic */ Integer BUT(Object obj) {
        1Xg r2;
        C54077Gz1 A01;
        AnonymousClass4EB r5 = (AnonymousClass4EB) obj;
        if (r5 == null || (r2 = r5.A01) == null) {
            return null;
        }
        1UQ r1 = r2.A06;
        if ((r1 == 1UQ.A0T || r1 == 1UQ.A0l) && (A01 = r2.A01()) != null) {
            return A01.A02();
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ 1Pi BXm(Object obj) {
        AnonymousClass4EB r4 = (AnonymousClass4EB) obj;
        0qQ.A0B(r4, 0);
        1Xg r2 = r4.A01;
        0qQ.A0B(r2, 0);
        1UQ r1 = r2.A06;
        if (r1 == 1UQ.A0T || r1 == 1UQ.A0l) {
            return 1Pi.A02;
        }
        if (AnonymousClass3VP.A00(r2) || AnonymousClass3VP.A03(r2)) {
            return 1Pi.A04;
        }
        return 1Pi.A03;
    }

    public final /* bridge */ /* synthetic */ boolean CVw(Object obj) {
        1Xg r4 = (1Xg) obj;
        0qQ.A0B(r4, 0);
        1UQ r2 = r4.A06;
        if (r2 == 1UQ.A0T || r2 == 1UQ.A0l) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean CVx(Object obj) {
        1Xg r2 = (1Xg) obj;
        0qQ.A0B(r2, 0);
        return AnonymousClass3VP.A03(r2);
    }

    public final /* bridge */ /* synthetic */ boolean CVy(Object obj) {
        1Xg r2 = (1Xg) obj;
        0qQ.A0B(r2, 0);
        return AnonymousClass3VP.A00(r2);
    }

    public final /* bridge */ /* synthetic */ boolean CXm(Object obj) {
        1Xg r0;
        AnonymousClass4EB r4 = (AnonymousClass4EB) obj;
        if (r4 == null || (r0 = r4.A01) == null) {
            return false;
        }
        1UQ r2 = r0.A06;
        if (r2 == 1UQ.A0T || r2 == 1UQ.A0l) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean CYA(Object obj) {
        1Xg r0;
        AnonymousClass4EB r2 = (AnonymousClass4EB) obj;
        if (r2 != null) {
            r0 = r2.A01;
        } else {
            r0 = null;
        }
        return AnonymousClass3VP.A03(r0);
    }

    public final /* bridge */ /* synthetic */ boolean CcL(Object obj) {
        1Xg r0;
        AnonymousClass4EB r2 = (AnonymousClass4EB) obj;
        if (r2 != null) {
            r0 = r2.A01;
        } else {
            r0 = null;
        }
        return AnonymousClass3VP.A00(r0);
    }

    public C228802mM(UserSession userSession) {
        this.A00 = userSession;
    }

    public final /* synthetic */ int AZD(Object obj) {
        return -1;
    }

    public final /* bridge */ /* synthetic */ boolean CcM(Object obj) {
        return false;
    }

    public final /* synthetic */ boolean ACJ(Object obj, Object obj2) {
        return false;
    }

    public final /* synthetic */ boolean ACN(Object obj, Object obj2) {
        return false;
    }
}
