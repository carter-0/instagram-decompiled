package X;

import android.content.Context;
import android.util.Size;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6sV  reason: invalid class name and case insensitive filesystem */
public final class C320516sV implements C231292rN, C320526sW, C320536sX {
    public int A00;
    public int A01;
    public Size A02;
    public C49455Evw A03;
    public C378189Ov A04;
    public C320586sc A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public Integer A09;
    public List A0A = 0sn.A00;
    public final Context A0B;
    public final C321686ua A0C;
    public final C320486sS A0D;
    public final C320316sB A0E;
    public final C320556sZ A0F;
    public final C320496sT A0G;
    public final AnonymousClass0iw A0H;
    public final AnonymousClass2t9 A0I;
    public final UserSession A0J;
    public final C294875nB A0K;
    public final String A0L;
    public final String A0M;
    public final AnonymousClass0eM A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final List A0Q = new ArrayList();
    public final Map A0R;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.6sa, X.6sZ] */
    /* JADX WARNING: type inference failed for: r0v21, types: [X.2tF, java.lang.Object] */
    public C320516sV(Context context, C321686ua r19, C320486sS r20, C320316sB r21, C320496sT r22, AnonymousClass0iw r23, UserSession userSession, C294875nB r25, String str, String str2, boolean z, boolean z2) {
        C232232tF r3;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        C320486sS r32 = r20;
        0qQ.A0B(r32, 9);
        Context context2 = context;
        this.A0B = context2;
        this.A0J = userSession2;
        this.A0H = r23;
        this.A0E = r21;
        this.A0C = r19;
        this.A0G = r22;
        this.A0P = z;
        this.A0D = r32;
        this.A0K = r25;
        this.A0O = z2;
        this.A0M = str;
        this.A0L = str2;
        Size A012 = C320546sY.A01(context2, r32.A00);
        this.A02 = A012;
        this.A00 = A012.getHeight();
        int width = this.A02.getWidth();
        this.A01 = width;
        this.A0R = new LinkedHashMap();
        ? r6 = new C320566sa(false, false);
        r6.A00 = this;
        this.A0F = r6;
        UserSession userSession3 = this.A0J;
        AnonymousClass0iw r8 = this.A0H;
        C320316sB r5 = this.A0E;
        C321686ua r33 = this.A0C;
        C320486sS r4 = this.A0D;
        int i = this.A00;
        C320496sT r7 = this.A0G;
        boolean z3 = this.A0P;
        this.A05 = new C320586sc(r33, r4, r5, r6, r7, r8, userSession3, this.A0K, this.A0M, this.A0L, i, width, z3, this.A0O);
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(this.A0B);
        A002.A01(new Object());
        A002.A01(new C320626sg(this.A01, this.A00));
        A002.A01(new C320636sh(r5));
        A002.A01(new C320646si(r5, this.A01, this.A00));
        if (182.A06(0Tu.A05, userSession3, 36324174804823900L)) {
            r3 = new EGB(r5, r8);
        } else {
            r3 = new C320656sj(r5, r8, this.A01, this.A00);
        }
        A002.A01(r3);
        C320586sc r0 = this.A05;
        if (r0 == null) {
            0qQ.A0F("clipsGridItemDefinition");
            throw AnonymousClass00P.createAndThrow();
        }
        A002.A01(r0);
        this.A0I = A002.A00();
        this.A0N = AnonymousClass0eN.A01(new AnonymousClass9LH(this, 12));
    }

    public final void A05(List list, boolean z) {
        this.A0Q.addAll(list);
        this.A07 = z;
        this.A06 = false;
        update();
    }

    public final void A06(List list, boolean z) {
        0qQ.A0B(list, 0);
        List list2 = this.A0Q;
        list2.clear();
        list2.addAll(list);
        this.A07 = z;
        this.A06 = false;
        update();
    }

    public final AnonymousClass3W1 BQr(1Xj r5) {
        0qQ.A0B(r5, 0);
        Map map = this.A0R;
        Object obj = map.get(r5);
        if (obj == null) {
            obj = new AnonymousClass3W1(r5.A0o(), r5.A4o());
            map.put(r5, obj);
        }
        return (AnonymousClass3W1) obj;
    }

    public final void A02() {
        if (this.A09 != null) {
            this.A06 = false;
        }
        this.A09 = null;
        update();
    }

    public final void A03() {
        this.A0Q.clear();
        this.A09 = null;
        this.A07 = false;
        this.A06 = false;
        update();
    }

    public final void A04(int i) {
        Integer num = this.A09;
        if (num == null || num.intValue() != i) {
            this.A06 = false;
        }
        this.A09 = Integer.valueOf(i);
        update();
    }

    public final void Cf9(String str, boolean z) {
        AnonymousClass2t9 r4 = this.A0I;
        Iterator it = A00(this).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            C232262tL r1 = (C232262tL) it.next();
            if ((r1 instanceof C320716sp) && 0qQ.A0K(((C320716sp) r1).A03.getId(), str)) {
                break;
            }
            i++;
        }
        r4.notifyItemChanged(i);
    }

    public final void Ejd(boolean z) {
        List list = this.A0Q;
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            C320716sp r0 = (C320716sp) next;
            C320716sp r1 = new C320716sp(r0.A02, r0.A03, r0.A04);
            r1.A01 = r1.A01;
            r1.A00 = z;
            list.set(i, r1);
            i = i2;
        }
        this.A06 = false;
        update();
    }

    public final void update() {
        AnonymousClass2t9 r2 = this.A0I;
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        viewModelListUpdate.A01(A00(this));
        r2.A05(viewModelListUpdate);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(X.C320516sV r8) {
        /*
            X.01N r5 = X.0jo.A1H()
            boolean r0 = r8.A06
            if (r0 == 0) goto L_0x000b
            java.util.List r0 = r8.A0A
            return r0
        L_0x000b:
            java.lang.Integer r0 = r8.A09
            r4 = 1
            if (r0 == 0) goto L_0x0025
            int r7 = r0.intValue()
            r6 = 0
        L_0x0015:
            if (r6 >= r7) goto L_0x0081
            r1 = 0
            r3 = 0
            X.6sl r0 = new X.6sl
            r0.<init>(r3, r4, r1)
            r5.add(r0)
            int r6 = r6 + 1
            goto L_0x0015
        L_0x0025:
            boolean r0 = r8.A08
            if (r0 == 0) goto L_0x002e
            X.6sm r0 = X.C320686sm.A00
            r5.add(r0)
        L_0x002e:
            com.instagram.common.session.UserSession r3 = r8.A0J
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324174804823900(0x810ca500002f5c, double:3.034892640057915E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x006e
            X.Evw r0 = r8.A03
            if (r0 == 0) goto L_0x0049
            X.EGV r1 = new X.EGV
            r1.<init>(r0)
        L_0x0046:
            r5.add(r1)
        L_0x0049:
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.List r0 = r8.A0Q
            java.util.Iterator r2 = r0.iterator()
        L_0x0054:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0078
            java.lang.Object r1 = r2.next()
            X.6sp r1 = (X.C320716sp) r1
            java.lang.String r0 = r1.A05
            if (r0 == 0) goto L_0x0054
            boolean r0 = r3.add(r0)
            if (r0 == 0) goto L_0x0054
            r5.add(r1)
            goto L_0x0054
        L_0x006e:
            X.9Ov r0 = r8.A04
            if (r0 == 0) goto L_0x0049
            X.6so r1 = new X.6so
            r1.<init>(r0)
            goto L_0x0046
        L_0x0078:
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x0081
            X.6sk r0 = X.C320666sk.A00
            r5.add(r0)
        L_0x0081:
            X.01N r0 = X.0jo.A1I(r5)
            r8.A06 = r4
            r8.A0A = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320516sV.A00(X.6sV):java.util.List");
    }

    public final List A01() {
        List A0a = 00k.A0a(A00(this));
        ArrayList arrayList = new ArrayList();
        for (Object next : A0a) {
            if (next instanceof C320716sp) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final C296915qr B9q(int i) {
        return new C19294WTc(C320846t3.A00(A00(this), i));
    }

    public final void Cs9(1Xj r1) {
        update();
    }
}
