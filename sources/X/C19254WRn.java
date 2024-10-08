package X;

import android.app.Activity;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.WRn  reason: case insensitive filesystem */
public final class C19254WRn implements 1DN {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C19254WRn(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void DWm(Map map) {
        C277014uI r4;
        AnonymousClass6Tm r1;
        C307896Rx r0;
        Activity activity;
        int i;
        AnonymousClass4OB r02;
        AnonymousClass4OB r03;
        switch (this.A00) {
            case 0:
                0qQ.A0B(map, 0);
                Iterator A16 = DbV.A16(map);
                while (A16.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(A16);
                    if (map.get(A18) == C346927vz.GRANTED) {
                        ((AbstractCollection) this.A03).add(A18);
                    }
                    if (map.get(A18) != C346927vz.DENIED_DONT_ASK_AGAIN || AnonymousClass0xl.A00(C61170le.A00).A05(A18)) {
                        AnonymousClass0xl.A00(C61170le.A00).A02(A18);
                    }
                }
                C307896Rx r10 = (C307896Rx) this.A01;
                C277014uI r8 = (C277014uI) this.A02;
                C308276Tl r7 = new C308276Tl();
                ArrayList arrayList = new ArrayList();
                String A002 = AnonymousClass000.A00(3);
                Iterator it = ((AbstractCollection) this.A03).iterator();
                while (it.hasNext()) {
                    String A182 = AnonymousClass7TE.A18(it);
                    Map map2 = C18404Vr6.A00;
                    Iterator A162 = DbV.A16(map2);
                    while (A162.hasNext()) {
                        Object next = A162.next();
                        if (00p.A0j((String) C51968G9o.A10(map2, AnonymousClass7TE.A0M(next)), A182, false)) {
                            arrayList.add(next);
                        }
                    }
                    throw new NoSuchElementException(A002);
                }
                DbX.A1P(r10, r7, r8, arrayList, 0);
                return;
            case 1:
                C346927vz A012 = 1DL.A01(map, (String[]) this.A03);
                0qQ.A07(A012);
                if (A012 == C346927vz.GRANTED) {
                    DbS.A1U(this.A02);
                    return;
                }
                0qQ.A0A(map);
                Iterator A0u = AnonymousClass7TF.A0u(map);
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    Object key = A1J.getKey();
                    if (C346927vz.DENIED_DONT_ASK_AGAIN == A1J.getValue()) {
                        if (0qQ.A0K(key, "android.permission.CAMERA")) {
                            activity = (Activity) this.A01;
                            i = 2131954557;
                        } else if (0qQ.A0K(key, "android.permission.RECORD_AUDIO")) {
                            activity = (Activity) this.A01;
                            i = 2131966510;
                        } else {
                            return;
                        }
                        AnonymousClass0fN.A00(W38.A00(activity, (X8Y) null, i, false));
                        return;
                    }
                }
                return;
            case 2:
                0qQ.A0A(map);
                ArrayList A0f = JTQ.A0f(map);
                Iterator A0u2 = AnonymousClass7TF.A0u(map);
                while (A0u2.hasNext()) {
                    Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u2);
                    Object key2 = A1J2.getKey();
                    C346927vz r04 = (C346927vz) A1J2.getValue();
                    0qQ.A0A(r04);
                    int ordinal = r04.ordinal();
                    if (ordinal == 1) {
                        r02 = AnonymousClass4OB.DENIED;
                    } else if (ordinal == 0) {
                        r02 = AnonymousClass4OB.GRANTED;
                    } else if (ordinal == 2) {
                        r02 = AnonymousClass4OB.NEVER_ASK_AGAIN;
                    } else {
                        throw new RuntimeException();
                    }
                    AnonymousClass7TF.A1I(key2, r02, A0f);
                }
                Map A08 = 0Yt.A08(A0f);
                VVH vvh = (VVH) this.A02;
                AnonymousClass4OB A003 = ((C17965Viz) this.A01).A00(A08);
                if (vvh.A02 && A003 == AnonymousClass4OB.NEVER_ASK_AGAIN) {
                    A003 = AnonymousClass4OB.DENIED;
                }
                r4 = vvh.A01;
                C308276Tl r12 = new C308276Tl();
                r12.A01(A003.A00);
                r1 = r12.A00();
                r0 = vvh.A00;
                break;
            default:
                0qQ.A0A(map);
                ArrayList A0f2 = JTQ.A0f(map);
                Iterator A0u3 = AnonymousClass7TF.A0u(map);
                while (A0u3.hasNext()) {
                    Map.Entry A1J3 = AnonymousClass7TE.A1J(A0u3);
                    Object key3 = A1J3.getKey();
                    C346927vz r05 = (C346927vz) A1J3.getValue();
                    0qQ.A0A(r05);
                    int ordinal2 = r05.ordinal();
                    if (ordinal2 == 1) {
                        r03 = AnonymousClass4OB.DENIED;
                    } else if (ordinal2 == 0) {
                        r03 = AnonymousClass4OB.GRANTED;
                    } else if (ordinal2 == 2) {
                        r03 = AnonymousClass4OB.NEVER_ASK_AGAIN;
                    } else {
                        throw new RuntimeException();
                    }
                    AnonymousClass7TF.A1I(key3, r03, A0f2);
                }
                Map A082 = 0Yt.A08(A0f2);
                VVI vvi = (VVI) this.A02;
                AnonymousClass4OB A004 = ((C17965Viz) this.A01).A00(A082);
                if (vvi.A02 && A004 == AnonymousClass4OB.NEVER_ASK_AGAIN) {
                    A004 = AnonymousClass4OB.DENIED;
                }
                r4 = vvi.A01;
                C308276Tl r13 = new C308276Tl();
                r13.A01(A004.A00);
                r1 = r13.A00();
                r0 = vvi.A00;
                break;
        }
        C299275ur.A00(r0, r1, r4);
    }
}
