package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.8Bz  reason: invalid class name and case insensitive filesystem */
public final class C352168Bz extends 2YL {
    public Set A00 = 0sl.A00;
    public final 2Fk A01;
    public final UserSession A02;
    public final AnonymousClass8C0 A03;
    public final 0V2 A04;
    public final 05G A05;
    public final 05G A06;
    public final C61770pa A07;
    public final AnonymousClass0Ud A08;
    public final AnonymousClass0Ud A09;

    public final void A06(Set set) {
        0qQ.A0B(set, 0);
        Set A0k = 00k.A0k(this.A00);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<Number> A022 = 094.A02(A0k, set);
        ArrayList arrayList = new ArrayList(0Yv.A1E(A022, 10));
        for (Number intValue : A022) {
            arrayList.add(new 0eP(Integer.valueOf(intValue.intValue()), true));
        }
        0Yt.A0F(arrayList, linkedHashMap);
        Set<Number> A023 = 094.A02(set, A0k);
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(A023, 10));
        for (Number intValue2 : A023) {
            arrayList2.add(new 0eP(Integer.valueOf(intValue2.intValue()), false));
        }
        0Yt.A0F(arrayList2, linkedHashMap);
        this.A00 = 00k.A0k(set);
        this.A06.Epw(0Yt.A0B(linkedHashMap));
    }

    public /* synthetic */ C352168Bz(UserSession userSession) {
        AnonymousClass8C0 r1 = new AnonymousClass8C0();
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = r1;
        02z A012 = 106.A01(0Yt.A0E());
        this.A06 = A012;
        this.A09 = 10b.A03(A012);
        02z r0 = new 02z(false);
        this.A05 = r0;
        this.A08 = 10b.A03(r0);
        05D A013 = 10D.A01(AnonymousClass05K.A00, 0, 0);
        this.A04 = A013;
        this.A07 = new 0V1((C262204Co) null, A013);
        this.A01 = C226292g8.A00(19B.A00, new AnonymousClass8C1(A013));
    }

    public static final void A00(Drawable drawable, C352168Bz r5, int i) {
        Drawable drawable2;
        C347017w8 r4;
        C347017w8 r0;
        Set A0j = 00k.A0j(00k.A0k(r5.A00));
        Integer valueOf = Integer.valueOf(i);
        A0j.add(valueOf);
        r5.A00 = A0j;
        r5.A06.Epw(0se.A0M(new 0eP(valueOf, true)));
        boolean z = drawable instanceof C347017w8;
        Drawable drawable3 = null;
        if (!z || (r0 = (C347017w8) drawable) == null) {
            drawable2 = null;
        } else {
            drawable2 = r0.A04();
        }
        if (!(drawable2 instanceof C369908vW)) {
            if (z && (r4 = (C347017w8) drawable) != null) {
                drawable3 = r4.A04();
            }
            if (!(drawable3 instanceof C369768vI)) {
                return;
            }
        }
        A02(new C388209nS(i), r5);
    }

    public static final void A01(Drawable drawable, C352168Bz r6, int i, boolean z) {
        C347017w8 r0;
        Set A0j = 00k.A0j(00k.A0k(r6.A00));
        Integer valueOf = Integer.valueOf(i);
        A0j.remove(valueOf);
        r6.A00 = A0j;
        r6.A06.Epw(0se.A0M(new 0eP(valueOf, false)));
        Drawable drawable2 = null;
        if ((drawable instanceof C347017w8) && (r0 = (C347017w8) drawable) != null) {
            drawable2 = r0.A04();
        }
        if (drawable2 instanceof C369908vW) {
            A02(new C388219nT(i), r6);
        }
        if (drawable instanceof C359018bq) {
            AnonymousClass8C0 r02 = r6.A03;
            0qQ.A0B(drawable, 0);
            r02.A00.remove(drawable);
        }
        if (z) {
            A02(new C388229nU(00k.A0k(00k.A0k(r6.A00)), r6.A07()), r6);
        }
    }

    public final void A03() {
        C391909ts r0;
        05G r1 = this.A05;
        r1.Epw(Boolean.valueOf(!((Boolean) r1.getValue()).booleanValue()));
        if (((Boolean) r1.getValue()).booleanValue()) {
            r0 = C388259nX.A00;
        } else {
            r0 = C388269nY.A00;
        }
        A02(r0, this);
    }

    public final void A04() {
        05G r3 = this.A05;
        boolean z = true;
        if (!((Boolean) r3.getValue()).booleanValue() && !(!00k.A0k(this.A00).isEmpty())) {
            z = false;
        }
        r3.Epw(false);
        this.A00 = 0sl.A00;
        A02(AnonymousClass9RW.A00, this);
        if (z) {
            A02(new C388229nU(00k.A0k(00k.A0k(this.A00)), A07()), this);
        }
    }

    public final void A05(Integer num, Integer num2) {
        if (num != null && 00k.A0k(this.A00).contains(num)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(num, false);
            Set A0j = 00k.A0j(00k.A0k(this.A00));
            A0j.remove(num);
            if (num2 != null) {
                Integer valueOf = Integer.valueOf(num2.intValue());
                A0j.add(valueOf);
                linkedHashMap.put(valueOf, true);
            }
            this.A00 = A0j;
            this.A06.Epw(0Yt.A0B(linkedHashMap));
        }
    }

    public final boolean A07() {
        return ((Boolean) this.A05.getValue()).booleanValue();
    }

    public final boolean A08() {
        if (!00k.A0k(this.A00).isEmpty()) {
            Set set = this.A03.A00;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C359008bp r2 = (C359008bp) ((C359018bq) it.next());
                    if (r2.A0I == AnonymousClass05K.A00) {
                        if (r2.A02 == null) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            return true;
        }
        if (!A07()) {
            return false;
        }
        return true;
    }

    public static final void A02(C391909ts r4, C352168Bz r5) {
        C318136oS A002 = C318116oQ.A00(r5);
        AnonymousClass9K3 r2 = new AnonymousClass9K3((Object) r5, (Object) r4, (AnonymousClass4D7) null, 40);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A002);
    }
}
