package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.86D  reason: invalid class name */
public final class AnonymousClass86D extends 2YL implements AnonymousClass86E {
    public AnonymousClass904 A00;
    public AnonymousClass90F A01;
    public AnonymousClass86U A02;
    public AnonymousClass849 A03;
    public AnonymousClass848 A04;
    public AnonymousClass80W A05;
    public String A06;
    public List A07;
    public C262204Co A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final AnonymousClass86B A0C;
    public final MiniGalleryService A0D;
    public final UserSession A0E;
    public final AnonymousClass85G A0F = new AnonymousClass85G();
    public final String A0G;
    public final HashSet A0H = new HashSet();
    public final List A0I;
    public final AtomicBoolean A0J = new AtomicBoolean(false);
    public final AtomicBoolean A0K = new AtomicBoolean(true);
    public final AtomicBoolean A0L = new AtomicBoolean(true);
    public final AtomicBoolean A0M = new AtomicBoolean(false);
    public final 05G A0N = new 02z(0);
    public final 05G A0O = new 02z(AnonymousClass86R.CLOSED);
    public final 05G A0P = new 02z(AnonymousClass86S.CLOSED);
    public final AnonymousClass86T A0Q = new AnonymousClass86T();
    public final AnonymousClass85B A0R = AnonymousClass85B.A00;
    public final AnonymousClass85C A0S;
    public final C311756dC A0T;

    public AnonymousClass86D(AnonymousClass86B r4, MiniGalleryService miniGalleryService, AnonymousClass848 r6, C311756dC r7, UserSession userSession, String str, List list, boolean z) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r6, 3);
        0qQ.A0B(r7, 4);
        0qQ.A0B(r4, 7);
        this.A0E = userSession;
        this.A0D = miniGalleryService;
        this.A04 = r6;
        this.A0T = r7;
        this.A0I = list;
        this.A0G = str;
        this.A0C = r4;
        this.A0S = new AnonymousClass85C(z);
        this.A03 = AnonymousClass849.A08;
        this.A02 = new AnonymousClass86U();
        this.A07 = 0sn.A00;
    }

    public final void A09(String str) {
        0qQ.A0B(str, 0);
        String obj = UUID.randomUUID().toString();
        0qQ.A0B(obj, 0);
        this.A06 = obj;
        AnonymousClass86B r3 = this.A0C;
        String A052 = A05();
        r3.A02.set(false);
        AtomicLong atomicLong = r3.A03;
        29E r4 = r3.A01;
        atomicLong.set(r4.A04(Integer.valueOf(A052.hashCode()), (String) null, 17638221, r3.A00));
        29E r6 = r4;
        r6.A0B(atomicLong.get(), "product_id", str, true);
    }

    public final void A0B(String str) {
        0qQ.A0B(str, 0);
        this.A04.A01.Epw(new AnonymousClass9J8(this.A03, str));
    }

    public static final String A00(AnonymousClass86D r0) {
        return ((AnonymousClass9J8) r0.A04.A01.getValue()).A02;
    }

    public static final void A01(AnonymousClass86D r5) {
        if (!(!r5.A07.isEmpty())) {
            return;
        }
        if (r5.A0B) {
            r5.A02.A00.A0B(r5.A07);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : r5.A07) {
            if (!0qQ.A0K(((AnonymousClass9JA) next).A03, "MULTIPEER")) {
                arrayList.add(next);
            }
        }
        r5.A02.A00.A0B(arrayList);
    }

    public static final void A02(AnonymousClass86D r10, String str) {
        AnonymousClass848 r0 = r10.A04;
        r0.A00.Epw(new AnonymousClass8YD(AnonymousClass84B.MINI_GALLERY, str, "mini_gallery", (String) null, (String) null, (String) null, (String) null, -1, false));
    }

    public final C348347yI A04() {
        C358348al r4;
        AnonymousClass86T r1 = this.A0Q;
        AnonymousClass85B r2 = this.A0R;
        AnonymousClass85C r3 = this.A0S;
        if (this.A0L.get()) {
            r4 = C358348al.PRECAPTURE_PHOTO;
        } else {
            r4 = C358348al.POSTCAPTURE_PHOTO;
        }
        return new C348347yI(r1, r2, r3, r4, this.A0E);
    }

    public final String A05() {
        String str = this.A06;
        if (str != null) {
            return str;
        }
        0qQ.A0F("discoverySessionId");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A06() {
        AnonymousClass86B r3 = this.A0C;
        if (!r3.A02.getAndSet(true)) {
            AtomicLong atomicLong = r3.A03;
            atomicLong.set(r3.A01.A07("category_content_fetch_failed", "", 17638221, atomicLong.get()));
        }
    }

    public final void A07() {
        05G r2 = this.A0O;
        if (r2.getValue() == AnonymousClass86R.OPEN) {
            if (this.A06 != null) {
                C264044Oj.A00(this.A0E).Chu(A05());
            }
            r2.Epw(AnonymousClass86R.CLOSED);
            C262204Co r1 = this.A08;
            if (r1 != null) {
                r1.AG7((CancellationException) null);
            }
            this.A0H.clear();
            AnonymousClass86B r3 = this.A0C;
            if (!r3.A02.getAndSet(true)) {
                29E r4 = r3.A01;
                AtomicLong atomicLong = r3.A03;
                if (r4.A0E(17638221, atomicLong.get())) {
                    atomicLong.set(r4.A06(CancelReason.USER_CANCELLED, "Mini Gallery Closed", 17638221, atomicLong.get()));
                    return;
                }
                int hashCode = UUID.randomUUID().hashCode();
                29E r8 = r4;
                r4.A06(CancelReason.USER_CANCELLED, 002.A0R("Mini Gallery Closed", AnonymousClass000.A00(4289)), 17638221, r8.A04(Integer.valueOf(hashCode), (String) null, 17638221, r3.A00));
            }
        }
    }

    public final void A08(String str) {
        if (this.A04.A02(str)) {
            this.A04.A01(AnonymousClass84B.MINI_GALLERY);
            return;
        }
        A02(this, str);
        String str2 = this.A02.A03;
        if (str2.length() > 0) {
            AnonymousClass90F r0 = this.A01;
            if (r0 == null) {
                0qQ.A0F("searchCacheRepository");
                throw AnonymousClass00P.createAndThrow();
            }
            C14400TvT A002 = C59820JZt.A00(r0.A00);
            synchronized (A002) {
                A002.A00.A04(str2);
            }
        }
    }

    public final void A0A(String str) {
        AnonymousClass86V r1;
        AnonymousClass86U r2 = this.A02;
        r2.A03 = str;
        if (str.length() > 0) {
            r1 = AnonymousClass86V.LOADING;
        } else {
            r1 = AnonymousClass86V.NULL_CONTENT;
        }
        r2.A01.A0B(r1);
    }

    public final void A0C(String str, List list) {
        String str2;
        C59725JVj jVj;
        AnonymousClass86U r4 = this.A02;
        Integer num = r4.A02;
        AnonymousClass9JA r0 = null;
        if (num != null) {
            int intValue = num.intValue();
            List list2 = (List) r4.A00.A02();
            if (list2 != null) {
                r0 = (AnonymousClass9JA) list2.get(intValue);
            }
        }
        if (r0 != null) {
            str2 = r0.A03;
        } else {
            str2 = null;
        }
        String str3 = str;
        if (str3.equals(str2)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C62947Koz koz = (C62947Koz) it.next();
                if (koz.A09) {
                    AnonymousClass904 r3 = this.A00;
                    if (r3 == null) {
                        0qQ.A0F("miniGalleryImpressionLogger");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    String str4 = koz.A05;
                    0qQ.A07(str4);
                    int i = koz.A00;
                    String A012 = koz.A01();
                    boolean z = this.A0L.get();
                    HashSet hashSet = r3.A02.A00;
                    if (!hashSet.contains(str4)) {
                        hashSet.add(str4);
                        if (z) {
                            jVj = C59725JVj.PRE_CAPTURE;
                        } else {
                            jVj = C59725JVj.POST_CAPTURE;
                        }
                        27p.A01(r3.A01).A13(r3.A00, jVj, str4, str3, A012, 0se.A0M(new 0eP(str4, String.valueOf(i))), (Map) null, -1, 1, false, false);
                    }
                }
            }
        }
    }

    public final void D9L(int i) {
        AnonymousClass72J r0;
        String str;
        AnonymousClass90F r02 = this.A01;
        if (r02 == null) {
            0qQ.A0F("searchCacheRepository");
            throw AnonymousClass00P.createAndThrow();
        }
        C14400TvT A002 = C59820JZt.A00(r02.A00);
        0qQ.A0B(A002, 1);
        if (i < A002.A00().size() && (r0 = (AnonymousClass72J) A002.A00().get(i)) != null && (str = r0.A00) != null) {
            synchronized (A002) {
                A002.A00.A05(str);
            }
        }
    }

    public final void Dbh(int i) {
        AnonymousClass72J r0;
        String str;
        AnonymousClass90F r02 = this.A01;
        if (r02 == null) {
            0qQ.A0F("searchCacheRepository");
            throw AnonymousClass00P.createAndThrow();
        }
        C14400TvT A002 = C59820JZt.A00(r02.A00);
        0qQ.A0B(A002, 1);
        if (i < A002.A00().size() && (r0 = (AnonymousClass72J) A002.A00().get(i)) != null && (str = r0.A00) != null) {
            A0A(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A03() {
        /*
            r5 = this;
            java.lang.String r1 = A00(r5)
            java.lang.String r0 = "search"
            boolean r1 = X.0qQ.A0K(r1, r0)
            r0 = 0
            if (r1 != 0) goto L_0x0047
            X.86U r0 = r5.A02
            X.2Fj r0 = r0.A00
            java.lang.Object r0 = r0.A02()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0046
            java.lang.String r4 = A00(r5)
            java.util.Iterator r3 = r0.iterator()
            r2 = 0
        L_0x0022:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0046
            int r2 = r2 + 1
            java.lang.Object r1 = r3.next()
            X.9JA r1 = (X.AnonymousClass9JA) r1
            java.lang.String r0 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE"
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 == 0) goto L_0x003d
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x003d
            return r2
        L_0x003d:
            java.lang.String r0 = r1.A03
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x0022
            return r2
        L_0x0046:
            r0 = 2
        L_0x0047:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass86D.A03():int");
    }
}
