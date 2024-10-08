package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6VS  reason: invalid class name */
public final class AnonymousClass6VS implements C270424gi, C233602vz, C308816Vs {
    public final C233632w4 A00;
    public final UserSession A01;
    public final C270414gh A02;
    public final C233402vf A03;
    public final C249863kU A04;
    public final C233432vi A05;
    public final AtomicReference A06 = new AtomicReference(new HashMap());
    public final AtomicReference A07 = new AtomicReference(new ArrayList());
    public final AtomicReference A08 = new AtomicReference(new ArrayList());
    public final AtomicReference A09 = new AtomicReference(new HashMap());

    public AnonymousClass6VS(UserSession userSession, C270414gh r4, C233632w4 r5, C233402vf r6, C249863kU r7, C233432vi r8) {
        0qQ.A0B(r7, 4);
        this.A01 = userSession;
        this.A00 = r5;
        this.A02 = r4;
        this.A04 = r7;
        this.A03 = r6;
        this.A05 = r8;
    }

    public final C250973mM Bkz(String str) {
        0qQ.A0B(str, 0);
        Map map = (Map) this.A06.get();
        if (map != null) {
            return (C250973mM) map.get(str);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final int CMI(C250973mM r3) {
        0qQ.A0B(r3, 0);
        List list = (List) this.A08.get();
        if (list != null) {
            return list.indexOf(r3);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void DJI(1PW r1) {
    }

    public final void DKh(Integer num) {
    }

    public final boolean DKi(1PW r2) {
        return true;
    }

    public final void DfI() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x012c A[LOOP:1: B:8:0x0054->B:26:0x012c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0053 A[LOOP:0: B:7:0x0053->B:68:0x0053, LOOP_END, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r22 = this;
            r13 = r22
            X.4gh r0 = r13.A02
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            java.util.List r0 = r0.A02
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r0)
            java.util.HashMap r21 = new java.util.HashMap
            r21.<init>()
            java.util.HashMap r20 = new java.util.HashMap
            r20.<init>()
            X.2vi r2 = r13.A05
            X.2vf r1 = r13.A03
            java.util.List r0 = r1.BYj()
            java.util.ArrayList r0 = X.00k.A0U(r0)
            X.1PW r3 = r2.AGd(r0)
            X.3kU r0 = r13.A04
            java.util.Collection r2 = r0.A03()
            int r11 = r3.A02
            int r15 = r1.Bdq()
            int r10 = r1.Bdr()
            int r0 = r3.A01
            boolean r1 = r3.A0G
            if (r1 == 0) goto L_0x0045
            int r0 = r11 - r0
            int r15 = java.lang.Math.min(r15, r0)
        L_0x0045:
            int r0 = r3.A04
            if (r1 == 0) goto L_0x004f
            int r0 = r11 - r0
            int r10 = java.lang.Math.min(r10, r0)
        L_0x004f:
            java.util.Iterator r19 = r2.iterator()
        L_0x0053:
            r9 = r15
        L_0x0054:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0182
            java.lang.Object r0 = r19.next()
            X.3n0 r0 = (X.C251373n0) r0
            java.lang.Object r8 = r0.BTb()
            X.3mM r8 = (X.C250973mM) r8
            com.instagram.model.reels.Reel r7 = r8.A0H
            X.2vm r2 = r7.A0b
            if (r2 == 0) goto L_0x017a
            if (r9 >= 0) goto L_0x012f
            if (r10 >= 0) goto L_0x012f
            X.2w4 r0 = r13.A00
            int r1 = r0.A01
            int r0 = r2.A03()
            int r1 = r1 + r0
            int r0 = r0 + r11
        L_0x007a:
            int r1 = java.lang.Math.max(r1, r0)
        L_0x007e:
            int r0 = r12.size()
            int r15 = java.lang.Math.min(r0, r1)
            java.lang.String r18 = ", gap rules: "
            java.lang.String r14 = ", lastNetegoPosition: "
            java.lang.String r6 = ", lastAdPosition: "
            java.lang.String r5 = ", position: "
            java.lang.String r4 = "Stories_Ads_Media_Prefetch"
            if (r15 >= 0) goto L_0x00c9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Evaluated predictedPosition as < 0 : "
            r1.append(r0)
            r1.append(r15)
            r1.append(r5)
            r1.append(r11)
            r1.append(r6)
            r1.append(r9)
            r1.append(r14)
            r1.append(r10)
            r0 = r18
            r1.append(r0)
            X.2vm r0 = r7.A0b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.0wb.A03(r4, r0)
            int r1 = r11 + 1
            r0 = 0
            int r15 = java.lang.Math.max(r1, r0)
        L_0x00c9:
            com.instagram.common.session.UserSession r0 = r13.A01
            r1 = r0
            X.0Tu r0 = X.0Tu.A05
            r16 = 36318342239230039(0x81075700001857, double:3.031204102090501E-306)
            r3 = r1
            r2 = r0
            r0 = r16
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0123
            int r0 = r12.size()
            if (r15 <= r0) goto L_0x0123
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Evaluated predictedPosition is out of bounds : "
            r1.append(r0)
            r1.append(r15)
            r1.append(r5)
            r1.append(r11)
            r1.append(r6)
            r1.append(r9)
            r1.append(r14)
            r1.append(r10)
            r0 = r18
            r1.append(r0)
            X.2vm r0 = r7.A0b
            r1.append(r0)
            java.lang.String r0 = ", predictedList size: "
            r1.append(r0)
            int r0 = r12.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.0wb.A03(r4, r0)
            int r15 = r12.size()
        L_0x0123:
            r12.add(r15, r8)
            boolean r0 = r7.A0m()
            if (r0 == 0) goto L_0x0053
            r10 = r15
            goto L_0x0054
        L_0x012f:
            int r0 = r2.A07()
            int r0 = r0 + 1
            int r6 = r9 + r0
            if (r9 >= 0) goto L_0x013a
            r6 = 0
        L_0x013a:
            int r0 = r2.A01()
            int r0 = r0 + 1
            int r5 = r9 + r0
            if (r9 >= 0) goto L_0x0145
            r5 = 0
        L_0x0145:
            int r0 = r2.A08()
            int r0 = r0 + 1
            int r1 = r10 + r0
            if (r10 >= 0) goto L_0x0150
            r1 = 0
        L_0x0150:
            int r0 = r2.A02()
            int r0 = r0 + 1
            int r0 = r0 + r10
            if (r10 >= 0) goto L_0x015a
            r0 = 0
        L_0x015a:
            int r4 = r11 + 1
            r3 = 0
            int[] r2 = new int[]{r0, r4}
            int r0 = java.lang.Math.max(r6, r5)
            int r1 = java.lang.Math.max(r0, r1)
            r0 = r2[r3]
            if (r0 >= r4) goto L_0x016e
            r0 = r4
        L_0x016e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x007e
            int r0 = r0.intValue()
            goto L_0x007a
        L_0x017a:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0182:
            java.util.Iterator r5 = r12.iterator()
        L_0x0186:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01d1
            java.lang.Object r4 = r5.next()
            X.3mM r4 = (X.C250973mM) r4
            com.instagram.model.reels.Reel r0 = r4.A0H
            java.lang.String r1 = r0.getId()
            X.0qQ.A07(r1)
            r0 = r21
            r0.put(r1, r4)
            com.instagram.common.session.UserSession r3 = r13.A01
            X.0Tu r2 = X.0Tu.A06
            r0 = 2342160827467175484(0x208106dd0004163c, double:4.063735944262084E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0186
            java.util.List r0 = X.C250973mM.A00(r3, r4)
            java.util.Iterator r2 = r0.iterator()
        L_0x01b7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0186
            java.lang.Object r0 = r2.next()
            X.3uh r0 = (X.C255773uh) r0
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x01b7
            java.lang.String r1 = r0.getId()
            r0 = r20
            r0.put(r1, r4)
            goto L_0x01b7
        L_0x01d1:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r4 = r12.size()
            r3 = 0
        L_0x01db:
            if (r3 >= r4) goto L_0x01fa
            java.lang.Object r0 = r12.get(r3)
            X.3mM r0 = (X.C250973mM) r0
            boolean r0 = r0.A0N
            if (r0 == 0) goto L_0x01f7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r12.get(r3)
            X.0eP r0 = new X.0eP
            r0.<init>(r2, r1)
            r5.add(r0)
        L_0x01f7:
            int r3 = r3 + 1
            goto L_0x01db
        L_0x01fa:
            java.util.concurrent.atomic.AtomicReference r1 = r13.A07
            java.util.List r0 = java.util.Collections.unmodifiableList(r5)
            r1.set(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r13.A08
            java.util.List r0 = java.util.Collections.unmodifiableList(r12)
            r1.set(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r13.A09
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r21)
            r1.set(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r13.A06
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r20)
            r1.set(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VS.A00():void");
    }

    public final List AZQ() {
        List list = (List) this.A08.get();
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final List Aa7() {
        List list = (List) this.A07.get();
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final C250973mM BfF(C250973mM r4) {
        List list = (List) this.A08.get();
        if (list != null) {
            int indexOf = list.indexOf(r4) - 1;
            if (indexOf >= list.size() || indexOf < 0) {
                return null;
            }
            return (C250973mM) list.get(indexOf);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final C250973mM Bky(int i) {
        List list = (List) this.A08.get();
        if (list == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (i >= list.size() || i < 0) {
            return null;
        } else {
            return (C250973mM) list.get(i);
        }
    }

    public final C250973mM Bl0(String str) {
        Map map = (Map) this.A09.get();
        if (map != null) {
            return (C250973mM) map.get(str);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final int CMG(Reel reel) {
        Object obj;
        List list = (List) this.A08.get();
        if (list != null) {
            Iterator it = 0sr.A1R(list).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (0qQ.A0K(((C250973mM) list.get(((Number) obj).intValue())).A0H.getId(), reel.getId())) {
                    break;
                }
            }
            Number number = (Number) obj;
            if (number != null) {
                return number.intValue();
            }
            return -1;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean CW8(C250973mM r5) {
        Object obj;
        List list = (List) this.A08.get();
        if (list != null) {
            int size = list.size();
            if (size <= 0) {
                return false;
            }
            int i = size - 1;
            if (i >= list.size() || i < 0) {
                obj = null;
            } else {
                obj = list.get(i);
            }
            if (r5.equals(obj)) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void DY6(int i, int i2) {
        if (i2 > i) {
            A00();
        }
    }

    public final /* bridge */ /* synthetic */ void D6E(Object obj) {
        A00();
    }
}
