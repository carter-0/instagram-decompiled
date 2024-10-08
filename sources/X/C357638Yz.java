package X;

import android.content.Context;
import android.util.Pair;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.8Yz  reason: invalid class name and case insensitive filesystem */
public final class C357638Yz extends 2YL {
    public 28D A00;
    public AnonymousClass80H A01;
    public C279284yO A02;
    public boolean A03;
    public C3494680m A04;
    public boolean A05 = true;
    public boolean A06;
    public final C3494680m A07;
    public final C3494680m A08;
    public final C3494680m A09;
    public final UserSession A0A;
    public final C3493780d A0B;
    public final EnumMap A0C;
    public final EnumMap A0D;
    public final HashMap A0E;
    public final Map A0F;
    public final Set A0G = new CopyOnWriteArraySet();
    public final Set A0H = new LinkedHashSet();
    public final Set A0I = new CopyOnWriteArraySet();
    public final Set A0J = new CopyOnWriteArraySet();
    public final C3495480u A0K;
    public final EnumMap A0L;

    public final C3494580l A07(C279284yO r5) {
        String str;
        0qQ.A0B(r5, 0);
        C3493780d r3 = this.A0B;
        AnonymousClass80H r2 = this.A01;
        if (r2 == null) {
            str = "cameraConfigurationSetup";
        } else {
            Map map = this.A0F;
            28D r0 = this.A00;
            if (r0 != null) {
                return r3.A00(r0, r2, r5, map);
            }
            str = "entryPoint";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0B(28D r5, CameraConfiguration cameraConfiguration) {
        0qQ.A0B(r5, 1);
        C3494680m r2 = this.A09;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(cameraConfiguration.A04);
        r2.A03(linkedHashSet);
        this.A00 = r5;
        AnonymousClass80H r1 = this.A01;
        if (r1 == null) {
            0qQ.A0F("cameraConfigurationSetup");
            throw AnonymousClass00P.createAndThrow();
        }
        LinkedHashSet A012 = this.A0B.A01(r5, r1);
        C3494680m r12 = this.A07;
        if (!0qQ.A0K(A012, r12.A00)) {
            r12.A04(A012);
        }
        Object obj = cameraConfiguration.A03;
        if (!((Set) r12.A00).contains(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("destination is not an available destination: ");
            sb.append(obj);
            0kD.A07("CameraConfigurationRepositoryImpl", sb.toString(), (Throwable) null);
            obj = AnonymousClass9QA.A00;
        }
        this.A08.A04(obj);
        this.A04.A04(Boolean.valueOf(cameraConfiguration.A00));
    }

    public final void A0C(28D r6, AnonymousClass80H r7, C279284yO r8, C347087wF r9, Set set, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(r6, 3);
        this.A01 = r7;
        this.A00 = r6;
        this.A09.A04(00k.A0k(set));
        LinkedHashSet A012 = this.A0B.A01(r6, r7);
        C3494680m r1 = this.A07;
        if (!0qQ.A0K(A012, r1.A00)) {
            r1.A04(A012);
        }
        if (!((Set) r1.A00).contains(r8)) {
            StringBuilder sb = new StringBuilder();
            sb.append("init destination is not an available destination: ");
            sb.append(r8);
            0kD.A07("CameraConfigurationRepositoryImpl", sb.toString(), (Throwable) null);
            r8 = AnonymousClass9QA.A00;
        }
        this.A08.A04(r8);
        this.A04.A04(Boolean.valueOf(z));
        this.A06 = z2;
        this.A05 = z3;
        if (r9 != null) {
            C358088aL r4 = C358088aL.A0U;
            C347087wF[] r0 = C347077wE.A00;
            ArrayList arrayList = new ArrayList();
            018.A18(arrayList, r0);
            Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (it.next() == r9) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            int intValue = Integer.valueOf(i).intValue();
            if (intValue != -1) {
                A0N(r4, intValue);
            }
        }
    }

    public final void A0D(28D r11, C279284yO r12) {
        0qQ.A0B(r11, 1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(r12);
        AnonymousClass80H A022 = AnonymousClass80H.A02.A02(linkedHashSet);
        A0C(r11, A022, r12, (C347087wF) null, 0sl.A00, true, false, true);
    }

    public final void A0F(C3495480u r2) {
        0qQ.A0B(r2, 0);
        this.A0I.add(r2);
        this.A08.A01(r2);
    }

    public final void A0H(C3495480u r2) {
        0qQ.A0B(r2, 0);
        this.A08.A02(r2);
        this.A0I.remove(r2);
    }

    public final void A0J(C279284yO r3, C358088aL r4, boolean z) {
        0qQ.A0B(r3, 0);
        HashMap hashMap = this.A0E;
        AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(r3);
        if (abstractCollection == null) {
            abstractCollection = new HashSet();
            hashMap.put(r3, abstractCollection);
        }
        if (!abstractCollection.contains(r4)) {
            A02(r3, r4, this, z);
        }
    }

    public final void A0K(C358088aL r2) {
        0qQ.A0B(r2, 0);
        if (!A0V(r2)) {
            A0L(r2);
        }
    }

    public final void A0M(C358088aL r2) {
        0qQ.A0B(r2, 0);
        if (A0V(r2)) {
            A0L(r2);
        }
    }

    public final boolean A0S(C279284yO r5, C358088aL r6) {
        String str;
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        C3493780d r3 = this.A0B;
        AnonymousClass80H r2 = this.A01;
        if (r2 == null) {
            str = "cameraConfigurationSetup";
        } else {
            Map map = this.A0F;
            28D r0 = this.A00;
            if (r0 != null) {
                return new LinkedHashSet(r3.A00(r0, r2, r5, map).A01).contains(r6);
            }
            str = "entryPoint";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A0T(C279284yO r11, C358088aL... r12) {
        String str;
        0qQ.A0B(r11, 0);
        0qQ.A0B(r12, 1);
        int length = r12.length;
        int i = 0;
        while (i < length) {
            C358088aL r4 = r12[i];
            C3493780d r3 = this.A0B;
            AnonymousClass80H r2 = this.A01;
            if (r2 == null) {
                str = "cameraConfigurationSetup";
            } else {
                Map map = this.A0F;
                28D r0 = this.A00;
                if (r0 == null) {
                    str = "entryPoint";
                } else {
                    C3494580l A002 = r3.A00(r0, r2, r11, map);
                    Iterator it = A002.A00().iterator();
                    0qQ.A07(it);
                    boolean z = false;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            0qQ.A07(next);
                            C358088aL r02 = (C358088aL) next;
                            if (r02 == r4) {
                                break;
                            }
                            Iterator it2 = A002.A01(r02).iterator();
                            0qQ.A07(it2);
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                Object next2 = it2.next();
                                0qQ.A07(next2);
                                if (next2 == r4) {
                                    z = true;
                                    break;
                                }
                            }
                        } else if (!z) {
                            return false;
                        }
                    }
                    i++;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        return true;
    }

    public final boolean A0V(C358088aL... r6) {
        for (C358088aL contains : r6) {
            if (((Set) this.A09.A00).contains(contains)) {
                return true;
            }
        }
        return false;
    }

    public C357638Yz(UserSession userSession, C3493780d r33) {
        C3494480k r0;
        this.A0A = userSession;
        C3493780d r10 = r33;
        this.A0B = r10;
        HashMap hashMap = new HashMap();
        AnonymousClass80K r18 = AnonymousClass80K.A00;
        AnonymousClass80L r11 = AnonymousClass80L.A00;
        AnonymousClass9QA r5 = AnonymousClass9QA.A00;
        AnonymousClass80N r23 = AnonymousClass80N.A00;
        C3493880e r24 = C3493880e.A00;
        C363138jC r17 = C363138jC.A00;
        C3493980f r9 = C3493980f.A00;
        AnonymousClass80M r8 = AnonymousClass80M.A00;
        C3494080g r7 = C3494080g.A00;
        C3494180h r6 = C3494180h.A00;
        AnonymousClass80J r1 = AnonymousClass80J.A00;
        AnonymousClass80K r20 = r18;
        C279284yO[] r02 = {r20, r11, r5, r23, r24, r17, r9, r8, r7, r6, r1};
        0qQ.A0B(r02, 0);
        for (C279284yO r4 : 03t.A0K(r02)) {
            if (0qQ.A0K(r4, r11)) {
                r0 = new C3494480k(r10.A02, r10.A03, r11, false);
            } else if (0qQ.A0K(r4, r5) || 0qQ.A0K(r4, r8)) {
                Context context = r10.A02;
                UserSession userSession2 = r10.A03;
                boolean z = r10.A01;
                0qQ.A0B(r4, 3);
                r0 = new C3494480k(context, userSession2, r4, z);
            } else if (r4 instanceof AnonymousClass80O) {
                Context context2 = r10.A02;
                UserSession userSession3 = r10.A03;
                0qQ.A0B(r4, 3);
                r0 = new C3494480k(context2, userSession3, r4, false);
            } else if (0qQ.A0K(r4, C3494280i.A00) || 0qQ.A0K(r4, r6) || 0qQ.A0K(r4, r1) || 0qQ.A0K(r4, r17) || 0qQ.A0K(r4, r9) || 0qQ.A0K(r4, r7) || 0qQ.A0K(r4, r18)) {
                Context context3 = r10.A02;
                UserSession userSession4 = r10.A03;
                0qQ.A0B(r4, 3);
                r0 = new C3494480k(context3, userSession4, r4, false);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("unknown destination, please create a pairings manager: ");
                sb.append(r4);
                throw new IllegalArgumentException(sb.toString());
            }
            hashMap.put(r4, r0);
        }
        this.A0F = hashMap;
        this.A0E = new HashMap();
        this.A0K = new C3495380t(this);
        0sl r12 = 0sl.A00;
        this.A09 = new C3494680m(r12);
        this.A07 = new C3494680m(r12);
        this.A08 = new C3494680m(r5);
        this.A04 = new C3494680m(true);
        Class<C358088aL> cls = C358088aL.class;
        this.A0C = new EnumMap(cls);
        this.A0L = new EnumMap(cls);
        this.A0D = new EnumMap(cls);
        A0F(new C3495580v(this));
        for (C3494480k r03 : hashMap.values()) {
            r03.A01.A01(this.A0K);
        }
    }

    public static final void A02(C279284yO r2, C358088aL r3, C357638Yz r4, boolean z) {
        C3494480k r42 = (C3494480k) r4.A0F.get(r2);
        if (r42 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("no pairings manager for destination: ");
            sb.append(r2);
            0kD.A07("CameraConfigurationRepositoryImpl", sb.toString(), (Throwable) null);
            return;
        }
        0qQ.A0B(r3, 0);
        r42.A04.put(r3, Boolean.valueOf(z));
        C3494680m r32 = r42.A01;
        Pair pair = (Pair) r32.A00;
        HashSet A002 = C3494480k.A00(r42);
        Set set = ((C3494580l) pair.second).A01;
        set.clear();
        set.addAll(A002);
        r32.A03(pair);
    }

    public final CameraConfiguration A06() {
        return new CameraConfiguration((C279284yO) this.A08.A00, (Set) this.A09.A00, ((Boolean) this.A04.A00).booleanValue(), this.A06, this.A05);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b0, code lost:
        if (r7 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c1, code lost:
        if (r7 != null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c7, code lost:
        if (r5.isEmpty() == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
        r7 = X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cb, code lost:
        if (r7 != null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d4, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d5, code lost:
        r7 = X.C352618Eb.A04((X.C358088aL) r5.iterator().next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e4, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A08() {
        /*
            r8 = this;
            X.80m r0 = r8.A08
            java.lang.Object r4 = r0.A00
            X.4yO r4 = (X.C279284yO) r4
            X.80m r0 = r8.A09
            java.lang.Object r3 = r0.A00
            java.util.Set r3 = (java.util.Set) r3
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r1 = 1
            X.0qQ.A0B(r3, r1)
            X.9QA r6 = X.AnonymousClass9QA.A00
            r2 = 0
            if (r4 == r6) goto L_0x00a0
            X.80M r5 = X.AnonymousClass80M.A00
            if (r4 == r5) goto L_0x00a0
            X.80L r0 = X.AnonymousClass80L.A00
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x004c
            java.lang.Integer r7 = X.AnonymousClass05K.A00
        L_0x0027:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r3)
            java.util.Iterator r6 = r5.iterator()
            X.0qQ.A07(r6)
        L_0x0033:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r0 = r6.next()
            X.8aL r0 = (X.C358088aL) r0
            X.0qQ.A0A(r0)
            java.lang.Integer r0 = X.C352618Eb.A04(r0)
            if (r0 != 0) goto L_0x0033
            r6.remove()
            goto L_0x0033
        L_0x004c:
            X.80h r0 = X.C3494180h.A00
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x009d
            X.80i r0 = X.C3494280i.A00
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x009d
            boolean r0 = r4.equals(r6)
            if (r0 != 0) goto L_0x009d
            boolean r0 = r4.equals(r5)
            if (r0 != 0) goto L_0x009d
            X.80J r0 = X.AnonymousClass80J.A00
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x009d
            X.80K r0 = X.AnonymousClass80K.A00
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x009d
            boolean r0 = r4 instanceof X.AnonymousClass80O
            if (r0 != 0) goto L_0x009d
            X.80f r0 = X.C3493980f.A00
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0087
            java.lang.Integer r7 = X.AnonymousClass05K.A0j
            goto L_0x0027
        L_0x0087:
            X.8jC r0 = X.C363138jC.A00
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0092
            java.lang.Integer r7 = X.AnonymousClass05K.A02
            goto L_0x0027
        L_0x0092:
            X.80g r0 = X.C3494080g.A00
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00e5
            java.lang.Integer r7 = X.AnonymousClass05K.A04
            goto L_0x0027
        L_0x009d:
            java.lang.Integer r7 = X.AnonymousClass05K.A1I
            goto L_0x0027
        L_0x00a0:
            r7 = r2
            goto L_0x0027
        L_0x00a2:
            int r0 = r5.size()
            if (r0 > r1) goto L_0x00b2
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00c1
            if (r7 == 0) goto L_0x00c3
        L_0x00b2:
            java.lang.String r1 = "reach out to @HaydenChristensen: current set of camera tools and camera destination are not compatible: "
            java.lang.String r0 = X.C393999xN.A00(r4, r3)
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "CaptureFormatUtil"
            X.0kD.A07(r0, r1, r2)
        L_0x00c1:
            if (r7 != 0) goto L_0x00e4
        L_0x00c3:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x00d5
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
        L_0x00cb:
            if (r7 != 0) goto L_0x00e4
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x00d5:
            java.util.Iterator r0 = r5.iterator()
            java.lang.Object r0 = r0.next()
            X.8aL r0 = (X.C358088aL) r0
            java.lang.Integer r7 = X.C352618Eb.A04(r0)
            goto L_0x00cb
        L_0x00e4:
            return r7
        L_0x00e5:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357638Yz.A08():java.lang.Integer");
    }

    public final void A09() {
        C3494680m r1 = this.A09;
        if (!((Set) r1.A00).isEmpty()) {
            r1.A04(0sl.A00);
        }
    }

    public final void A0A() {
        C3494680m r2 = this.A09;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(A06().A04);
        r2.A03(linkedHashSet);
        C3494680m r1 = this.A08;
        r1.A03(r1.A00);
        C3494680m r12 = this.A04;
        r12.A03(r12.A00);
        Collection<C3494680m> values = this.A0C.values();
        0qQ.A07(values);
        for (C3494680m r13 : values) {
            r13.A03(r13.A00);
        }
        Collection<C3494680m> values2 = this.A0L.values();
        0qQ.A07(values2);
        for (C3494680m r14 : values2) {
            r14.A03(r14.A00);
        }
        C3494680m r15 = this.A07;
        r15.A03(r15.A00);
    }

    public final void A0E(C3495480u r2) {
        A0G(new AnonymousClass81R(r2, this));
        A0F(new AnonymousClass81S(r2, this));
    }

    public final void A0G(C3495480u r2) {
        this.A0J.add(r2);
        this.A09.A01(r2);
    }

    public final void A0I(C279284yO r5) {
        C3494680m r3 = this.A08;
        if (r3.A00 != r5) {
            A09();
        }
        Set set = (Set) this.A07.A00;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getClass() == r5.getClass()) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("destination is not an available destination: ");
        sb.append(r5);
        0kD.A07("CameraConfigurationRepositoryImpl", sb.toString(), (Throwable) null);
        r5 = AnonymousClass9QA.A00;
        if (r3.A00 != r5) {
            r3.A04(r5);
        }
    }

    public final void A0O(C358088aL r5, long j) {
        C358088aL r3 = C358088aL.A0y;
        if (r5 == r3) {
            EnumMap enumMap = this.A0D;
            C3494680m r1 = (C3494680m) enumMap.get(r3);
            if (r1 == null) {
                r1 = new C3494680m(Long.valueOf(C352618Eb.A02(r3)));
                enumMap.put(r3, r1);
            }
            r1.A03(Long.valueOf(j));
        } else if (A0U(r5)) {
            this.A0D.put(r5, new C3494680m(Long.valueOf(j)));
        }
    }

    public final boolean A0P() {
        if (!(this.A08.A00 instanceof AnonymousClass80O) || !A0V(C358088aL.A0z)) {
            return false;
        }
        return true;
    }

    public final boolean A0Q() {
        Object obj = this.A08.A00;
        if (!(obj instanceof AnonymousClass80O)) {
            if (!0qQ.A0K(obj, AnonymousClass80L.A00)) {
                if (!0qQ.A0K(obj, AnonymousClass9QA.A00) && !0qQ.A0K(obj, AnonymousClass80M.A00)) {
                    return false;
                }
                if (!((Set) this.A09.A00).isEmpty()) {
                    if (!A0V(C358088aL.A0M, C358088aL.A0B, C358088aL.A0T)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (!A0V(C358088aL.A0D)) {
            return true;
        }
        return false;
    }

    public final boolean A0R() {
        Object obj = this.A08.A00;
        if ((obj == AnonymousClass9QA.A00 || obj == AnonymousClass80M.A00) && ((Set) this.A09.A00).isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean A0U(C358088aL... r5) {
        Set<C279284yO> set = (Set) this.A07.A00;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            for (C279284yO A0T : set) {
                if (A0T(A0T, (C358088aL[]) Arrays.copyOf(r5, 1))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void onCleared() {
        for (C3494480k r2 : this.A0F.values()) {
            C3495480u r1 = this.A0K;
            0qQ.A0B(r1, 0);
            r2.A01.A02(r1);
        }
    }

    public static final C3494680m A00(C358088aL r3, C357638Yz r4) {
        if (C352618Eb.A01(r3) == 1) {
            EnumMap enumMap = r4.A0C;
            C3494680m r1 = (C3494680m) enumMap.get(r3);
            if (r1 != null) {
                return r1;
            }
            C3494680m r12 = new C3494680m(Integer.valueOf(C352618Eb.A00(r3)));
            enumMap.put(r3, r12);
            return r12;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("camera tool is not a secondary picker tool: ");
        sb.append(r3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final C3494680m A01(C358088aL r3, C357638Yz r4) {
        if (C352618Eb.A01(r3) == 2) {
            EnumMap enumMap = r4.A0L;
            C3494680m r1 = (C3494680m) enumMap.get(r3);
            if (r1 != null) {
                return r1;
            }
            if (r3.ordinal() == 11) {
                C3494680m r12 = new C3494680m(new C39637A3b());
                enumMap.put(r3, r12);
                return r12;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("camera tool is not secondary slider menu tool: ");
            sb.append(r3);
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("camera tool is not a secondary slider tool: ");
        sb2.append(r3);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static boolean A03(C358088aL r0, C357638Yz r1) {
        return r1.A0V(r0);
    }

    public final int A04(C358088aL r2) {
        return ((Number) A00(r2, this).A00).intValue();
    }

    public final long A05(C358088aL r4) {
        if (A0U(r4)) {
            C3494680m r0 = (C3494680m) this.A0D.get(r4);
            if (r0 != null) {
                return ((Number) r0.A00).longValue();
            }
            return C352618Eb.A02(r4);
        }
        0kD.A07("CameraConfigurationRepositoryImpl", 002.A0g("Camera tool ", r4.name(), " not available"), (Throwable) null);
        return Long.MIN_VALUE;
    }

    public final void A0L(C358088aL r7) {
        LinkedHashSet linkedHashSet;
        StringBuilder sb;
        Object obj;
        if (!C352618Eb.A05(r7)) {
            sb = new StringBuilder();
            sb.append("cannot select tool: ");
            obj = r7;
        } else {
            C3494680m r1 = this.A08;
            C3494580l A072 = A07((C279284yO) r1.A00);
            if (A072.A00.containsKey(r7) || A072.A03(r7)) {
                C3494680m r4 = this.A09;
                if (((Set) r4.A00).contains(r7)) {
                    linkedHashSet = new LinkedHashSet();
                    for (Object next : (Set) r4.A00) {
                        if (next != r7) {
                            linkedHashSet.add(next);
                        }
                    }
                } else {
                    linkedHashSet = new LinkedHashSet();
                    for (C358088aL r12 : (Set) r4.A00) {
                        if (!A072.A04(r7, r12)) {
                            linkedHashSet.add(r12);
                        }
                    }
                    linkedHashSet.add(r7);
                }
                r4.A04(linkedHashSet);
                return;
            }
            sb = new StringBuilder();
            sb.append("tool(");
            sb.append(r7);
            sb.append(") is not available for current destination: ");
            obj = r1.A00;
        }
        sb.append(obj);
        0kD.A07("CameraConfigurationRepositoryImpl", sb.toString(), (Throwable) null);
    }

    public final void A0N(C358088aL r3, int i) {
        if (C352618Eb.A06(r3) && C352618Eb.A00(r3) != i) {
            A0K(r3);
        } else if (A0V(r3)) {
            A0L(r3);
        }
        if (((Number) A00(r3, this).A00).intValue() != i) {
            A00(r3, this).A04(Integer.valueOf(i));
        }
    }
}
