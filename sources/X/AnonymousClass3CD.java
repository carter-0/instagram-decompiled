package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3CD  reason: invalid class name */
public final class AnonymousClass3CD extends C233202vF {
    public int A00;
    public String A01;
    public final UserSession A02;
    public final C233172vA A03;
    public final AnonymousClass4DU A04;
    public final AnonymousClass3BQ A05;
    public final AnonymousClass3C9 A06;
    public final C270414gh A07;
    public final C228812mN A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3CD(com.instagram.common.session.UserSession r10, X.C233172vA r11, X.AnonymousClass4DU r12, X.AnonymousClass3BQ r13, X.AnonymousClass3C9 r14, X.C270414gh r15, X.C228812mN r16, X.C233182vC r17, java.lang.String r18, java.lang.String r19, boolean r20) {
        /*
            r9 = this;
            r5 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r17
            r8 = r18
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.A02 = r10
            r9.A04 = r12
            r9.A09 = r8
            r9.A0A = r7
            r9.A05 = r13
            r9.A03 = r11
            r0 = r16
            r9.A08 = r0
            r9.A07 = r15
            r9.A06 = r14
            r0 = r20
            r9.A0B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CD.<init>(com.instagram.common.session.UserSession, X.2vA, X.4DU, X.3BQ, X.3C9, X.4gh, X.2mN, X.2vC, java.lang.String, java.lang.String, boolean):void");
    }

    public final void Ch2(AnonymousClass4LN r3, List list, int i, long j, boolean z) {
        0qQ.A0B(list, 0);
        0qQ.A0B(r3, 4);
        this.A03.A0R = A00(this, this.A06.Bdf());
        super.Ch2(r3, list, i, j, z);
    }

    public final void Ch3(AnonymousClass4LN r3, Iterable iterable) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(iterable, 1);
        this.A03.A0R = A00(this, iterable);
        super.Ch3(r3, iterable);
    }

    public final void Ckm(AnonymousClass3VZ r3) {
        0qQ.A0B(r3, 0);
        this.A03.A0R = A00(this, this.A06.Bdf());
        super.Ckm(r3);
    }

    public final void Dpj(AnonymousClass3VZ r3) {
        0qQ.A0B(r3, 0);
        this.A03.A0R = A00(this, this.A06.Bdf());
        super.Dpj(r3);
    }

    public static final String A00(AnonymousClass3CD r4, Iterable iterable) {
        Integer num;
        String str;
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append("(id:");
            Object BTb = ((C251373n0) it.next()).BTb();
            String id = ((C250973mM) BTb).A0H.getId();
            0qQ.A07(id);
            sb.append(id);
            sb.append(", type:");
            1Pi BXm = r4.A08.BXm(BTb);
            if (BXm != null) {
                int ordinal = BXm.ordinal();
                if (ordinal == 1) {
                    num = AnonymousClass05K.A01;
                } else if (ordinal == 0 || ordinal == 2) {
                    num = AnonymousClass05K.A0C;
                }
                if (1 - num.intValue() != 0) {
                    str = "AD";
                } else {
                    str = "ORGANIC";
                }
                sb.append(str);
            }
        }
        String obj = sb.toString();
        0qQ.A07(obj);
        return obj;
    }

    public static final void A01(1Nv r9, C250973mM r10, AnonymousClass3CD r11, Integer num, String str, int i) {
        AnonymousClass4DU r1 = r11.A04;
        if (AnonymousClass3WX.A00(r9, r1)) {
            UserSession userSession = r11.A02;
            String str2 = r11.A09;
            String str3 = r11.A0A;
            Reel reel = r10.A0H;
            C296215pf r2 = new C296215pf(userSession, reel, str2, str3, i, r10.A0E);
            r2.A0B = reel.A0X;
            r2.A0E = num;
            C254523sc A012 = C233822wX.A01(r2, r9, r1, "delivery");
            A012.A4M = r11.A00;
            A012.A6l = r10.A0I;
            A012.A6m = r10.A0J;
            A012.A4S = C233832wY.A00(userSession);
            A012.A4Q = str;
            if (C228342lQ.A02(userSession)) {
                A012.A4X = C228342lQ.A01(1Au.A00(userSession)).toString();
                A012.A4Y = C228342lQ.A00(userSession).toString();
            }
            C233822wX.A0I(userSession, A012, r1, AnonymousClass05K.A01);
        }
    }

    public final /* bridge */ /* synthetic */ void Cgv(C251373n0 r20, Object obj) {
        1PW r7 = (1PW) obj;
        C251373n0 r2 = r20;
        0qQ.A0B(r2, 0);
        0qQ.A0B(r7, 1);
        C233172vA r4 = this.A03;
        r4.A00();
        r4.A0S = r4.A0d;
        int i = this.A00;
        int BnH = r2.BnH();
        this.A01 = AnonymousClass3PI.A01(this.A02, r4, this.A04, (C250973mM) r2.BTb(), r7, r2.Bxj(), (Integer) null, (Integer) null, "insertion_success", this.A00, this.A01, (List) null, i, BnH, r2.CUo(), this.A0B);
    }

    public final /* bridge */ /* synthetic */ void Cgw(1PW r30, Long l, Object obj, String str, String str2, String str3, String str4, Collection collection, Collection collection2, Map map, Map map2, boolean z) {
        HashMap hashMap;
        Integer num;
        String str5;
        C250973mM r4 = (C250973mM) obj;
        0qQ.A0B(r4, 0);
        String str6 = str;
        0qQ.A0B(str6, 2);
        Collection collection3 = collection;
        0qQ.A0B(collection3, 3);
        Collection collection4 = collection2;
        0qQ.A0B(collection4, 4);
        0qQ.A0B(r30, 11);
        UserSession userSession = this.A02;
        String str7 = this.A09;
        String str8 = this.A0A;
        Reel reel = r4.A0H;
        C296215pf r12 = new C296215pf(userSession, reel, str7, str8, r4.A01, r4.A0E);
        r12.A0B = reel.A0X;
        List<Reel> A0U = 1OP.A05(userSession).A0U(false);
        ArrayList arrayList = new ArrayList();
        for (Reel A0D : A0U) {
            User A0D2 = A0D.A0D();
            if (A0D2 != null) {
                arrayList.add(A0D2.getId());
            }
        }
        r12.A0H = arrayList;
        r12.A07 = A0U.size();
        C270414gh r0 = this.A07;
        if (r0 != null) {
            r12.A08 = r0.getCount();
        }
        r12.A0F = A00(this, this.A06.Bdf());
        C255773uh A082 = r4.A08(userSession);
        AnonymousClass4DU r14 = this.A04;
        1Nv A092 = A082.A09();
        if (A092 != null) {
            ArrayList arrayList2 = new ArrayList(collection3);
            ArrayList arrayList3 = new ArrayList(collection4);
            String str9 = this.A00;
            Map map3 = map;
            if (map != null) {
                hashMap = new HashMap(map3);
            } else {
                hashMap = null;
            }
            1Xj r1 = A082.A0b;
            if (r1 != null) {
                num = Integer.valueOf(r1.A0m());
                str5 = r1.A2p();
            } else {
                num = null;
                str5 = null;
            }
            C233822wX.A0M(userSession, r12, A092, r14, num, l, str6, str2, str3, str4, str9, (String) null, (String) null, str5, hashMap, arrayList2, arrayList3, z);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void EVW(int i) {
        this.A03.A0R = A00(this, this.A06.Bdf());
        super.EVW(i);
        this.A00 = i;
    }
}
