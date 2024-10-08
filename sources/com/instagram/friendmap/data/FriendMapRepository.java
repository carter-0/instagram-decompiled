package com.instagram.friendmap.data;

import X.02z;
import X.05D;
import X.05G;
import X.0Tu;
import X.0V2;
import X.0Yv;
import X.0qQ;
import X.0sP;
import X.0sn;
import X.0sr;
import X.106;
import X.10D;
import X.10b;
import X.17i;
import X.182;
import X.19B;
import X.1Eo;
import X.1Wr;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass0qC;
import X.AnonymousClass0r6;
import X.AnonymousClass10H;
import X.AnonymousClass3HF;
import X.AnonymousClass43C;
import X.AnonymousClass43D;
import X.AnonymousClass4A4;
import X.AnonymousClass4A5;
import X.AnonymousClass4A6;
import X.AnonymousClass4AB;
import X.AnonymousClass4D7;
import X.AnonymousClass56C;
import X.AnonymousClass9KR;
import X.C252733pa;
import X.C262204Co;
import X.C262224Cq;
import X.C68150N2q;
import X.MG8;
import X.MGF;
import X.MH0;
import X.N3Q;
import android.location.Location;
import com.facebook.android.maps.model.LatLng;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.direct.inbox.notes.NotesApi;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class FriendMapRepository extends C252733pa {
    public Location A00;
    public SimpleImageUrl A01;
    public AnonymousClass4A6 A02;
    public C262204Co A03;
    public boolean A04;
    public long A05;
    public final UserSession A06;
    public final NotesApi A07;
    public final NotesRepository A08;
    public final AnonymousClass4A4 A09;
    public final 1Wr A0A = 1Wr.A00;
    public final 17i A0B;
    public final Integer A0C;
    public final AnonymousClass0r6 A0D;
    public final AnonymousClass0r6 A0E;
    public final AnonymousClass0r6 A0F;
    public final 0V2 A0G;
    public final 05G A0H;
    public final 05G A0I;
    public final 05G A0J;
    public final 05G A0K;
    public final 05G A0L;
    public final AnonymousClass0Ud A0M;
    public final AnonymousClass0Ud A0N;

    public final void A06(long j) {
        this.A08.A0D(j, (String) null);
        A03(this, j, true);
    }

    public final synchronized void A07(long j) {
        synchronized (this) {
            C262224Cq r1 = this.A01;
            1Eo.A05(19B.A00, new MGF((Object) this, j, (AnonymousClass4D7) null, 7), r1);
        }
    }

    public final synchronized void A09(Integer num, double d, double d2) {
        synchronized (this) {
            Integer num2 = num;
            0qQ.A0B(num, 2);
            UserSession userSession = this.A06;
            if (AnonymousClass3HF.A05(userSession, false) || AnonymousClass56C.A00(userSession, num)) {
                C262224Cq r2 = this.A01;
                FriendMapRepository$updateLastActiveLocation$1 friendMapRepository$updateLastActiveLocation$1 = new FriendMapRepository$updateLastActiveLocation$1(this, num2, (AnonymousClass4D7) null, d, d2);
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, friendMapRepository$updateLastActiveLocation$1, r2);
            }
        }
    }

    public final synchronized void A0A(String str) {
        Object value;
        ArrayList arrayList;
        05G r5 = this.A0H;
        do {
            value = r5.getValue();
            arrayList = new ArrayList();
            for (Object next : (List) value) {
                if (!0qQ.A0K(((N3Q) next).A04.getId(), str)) {
                    arrayList.add(next);
                }
            }
        } while (!r5.AIY(value, arrayList));
    }

    public static final int A00(FriendMapRepository friendMapRepository, AnonymousClass4A6 r7, List list) {
        int i = 0;
        if (r7.A03 > 0 && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                N3Q n3q = (N3Q) it.next();
                if (!0qQ.A0K(friendMapRepository.A06.A06, n3q.A04.getId()) && n3q.A0B && (i = i + 1) < 0) {
                    0sr.A1S();
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        return i;
    }

    public static final N3Q A01(N3Q n3q, FriendMapRepository friendMapRepository, Double d, Double d2, List list) {
        Location location;
        Integer num;
        FriendMapRepository friendMapRepository2 = friendMapRepository;
        N3Q n3q2 = n3q;
        1Wr r2 = friendMapRepository2.A0A;
        if (r2 != null) {
            location = r2.getLastLocation(friendMapRepository2.A06, AnonymousClass000.A00(2281));
        } else {
            location = null;
        }
        if (d == null) {
            if (location != null) {
                d = Double.valueOf(location.getLatitude());
            } else {
                d = null;
            }
        }
        if (d2 == null) {
            if (location != null) {
                d2 = Double.valueOf(location.getLongitude());
            } else {
                d2 = null;
            }
        }
        UserSession userSession = friendMapRepository2.A06;
        if (!AnonymousClass3HF.A04(userSession) || d == null || d2 == null || n3q2.A05 != (num = AnonymousClass05K.A00)) {
            return n3q2;
        }
        LatLng latLng = n3q2.A02;
        double A002 = latLng.A00(new LatLng(d.doubleValue(), d2.doubleValue()));
        0Tu r3 = 0Tu.A05;
        if (A002 >= ((double) ((float) 182.A00(r3, userSession, 37166194557583788L)))) {
            return n3q2;
        }
        if (182.A06(r3, userSession, 36321769627330309L)) {
            List list2 = list;
            if (list != null) {
                list2.add(n3q2.A09);
            } else {
                1Eo.A03(num, 19B.A00, new MH0((Object) n3q2, (Object) friendMapRepository2, (AnonymousClass4D7) null, 19), friendMapRepository2.A01);
            }
        }
        Integer num2 = AnonymousClass05K.A01;
        String str = n3q2.A09;
        String str2 = n3q2.A08;
        AnonymousClass4AB r29 = n3q2.A03;
        User user = n3q2.A04;
        long j = n3q2.A01;
        boolean z = n3q2.A0D;
        boolean z2 = n3q2.A0E;
        boolean z3 = n3q2.A0F;
        boolean z4 = n3q2.A0A;
        boolean z5 = n3q2.A0C;
        int i = n3q2.A00;
        String str3 = n3q2.A07;
        boolean z6 = n3q2.A0B;
        boolean z7 = n3q2.A0G;
        String str4 = n3q2.A06;
        0qQ.A0B(str, 0);
        0qQ.A0B(user, 4);
        0qQ.A0B(num2, 16);
        return new N3Q(latLng, r29, user, num2, str, str2, str3, str4, i, j, z, z2, z3, z4, z5, z6, z7);
    }

    public static final String A02(LatLng latLng, FriendMapRepository friendMapRepository) {
        Object obj;
        Iterator it = ((AnonymousClass4A6) friendMapRepository.A0N.getValue()).A05.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C68150N2q n2q = (C68150N2q) obj;
            if (latLng.A00(new LatLng(n2q.A00, n2q.A01)) <= ((double) n2q.A02)) {
                break;
            }
        }
        C68150N2q n2q2 = (C68150N2q) obj;
        if (n2q2 != null) {
            return n2q2.A04;
        }
        return null;
    }

    public static final void A03(FriendMapRepository friendMapRepository, long j, boolean z) {
        Object value;
        ArrayList arrayList;
        05G r9 = friendMapRepository.A0H;
        do {
            value = r9.getValue();
            List<N3Q> list = (List) value;
            arrayList = new ArrayList(0Yv.A1E(list, 10));
            for (N3Q n3q : list) {
                String str = n3q.A08;
                if (0qQ.A0K(str, String.valueOf(j))) {
                    String str2 = n3q.A09;
                    LatLng latLng = n3q.A02;
                    AnonymousClass4AB r21 = n3q.A03;
                    User user = n3q.A04;
                    long j2 = n3q.A01;
                    boolean z2 = n3q.A0D;
                    boolean z3 = n3q.A0E;
                    boolean z4 = n3q.A0F;
                    boolean z5 = n3q.A0A;
                    int i = n3q.A00;
                    String str3 = n3q.A07;
                    boolean z6 = n3q.A0B;
                    boolean z7 = n3q.A0G;
                    String str4 = n3q.A06;
                    Integer num = n3q.A05;
                    0qQ.A0B(str2, 0);
                    0qQ.A0B(latLng, 2);
                    0qQ.A0B(user, 4);
                    0qQ.A0B(num, 16);
                    String str5 = str2;
                    String str6 = str;
                    String str7 = str3;
                    String str8 = str4;
                    int i2 = i;
                    long j3 = j2;
                    LatLng latLng2 = latLng;
                    AnonymousClass4AB r19 = r21;
                    User user2 = user;
                    Integer num2 = num;
                    n3q = new N3Q(latLng2, r19, user2, num2, str5, str6, str7, str8, i2, j3, z2, z3, z4, z5, z, z6, z7);
                }
                arrayList.add(n3q);
            }
        } while (!r9.AIY(value, arrayList));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x04d4, code lost:
        if (((X.C69392NkW) r5.getRequiredEnumField(3, "audience", X.C69392NkW.A03)) != X.C69392NkW.A02) goto L_0x04d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        if (r33 != null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x061c, code lost:
        if (r5.getRequiredTimeField(6, "timestamp") <= ((long) r1.getRequiredIntField(1, X.C66579MXk.A00(321)))) goto L_0x0637;
     */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x054b  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x056e  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x05a4  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x05ac  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x05b2  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x05b6  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x05c1  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x05c4  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0522 A[EDGE_INSN: B:273:0x0522->B:136:0x0522 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x036a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void A04(com.instagram.friendmap.data.FriendMapRepository r81, X.Bm7 r82, java.lang.Double r83, java.lang.Double r84, X.0sP r85, boolean r86) {
        /*
            r12 = r81
            monitor-enter(r12)
            com.instagram.common.session.UserSession r0 = r12.A06     // Catch:{ all -> 0x07a3 }
            r81 = r0
            boolean r16 = X.AnonymousClass3HF.A03(r81)     // Catch:{ all -> 0x07a3 }
            r21 = 0
            r17 = r82
            if (r82 == 0) goto L_0x0777
            java.util.ArrayList r22 = new java.util.ArrayList     // Catch:{ all -> 0x07a3 }
            r22.<init>()     // Catch:{ all -> 0x07a3 }
            r24 = r83
            r23 = r84
            if (r16 == 0) goto L_0x0084
            if (r86 == 0) goto L_0x0084
            if (r83 == 0) goto L_0x0084
            if (r84 == 0) goto L_0x0084
            double r3 = r24.doubleValue()     // Catch:{ all -> 0x07a3 }
            double r1 = r23.doubleValue()     // Catch:{ all -> 0x07a3 }
            com.facebook.android.maps.model.LatLng r0 = new com.facebook.android.maps.model.LatLng     // Catch:{ all -> 0x07a3 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x07a3 }
            java.lang.String r33 = A02(r0, r12)     // Catch:{ all -> 0x07a3 }
            com.facebook.android.maps.model.LatLng r0 = new com.facebook.android.maps.model.LatLng     // Catch:{ all -> 0x07a3 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x07a3 }
            X.0eE r2 = X.AnonymousClass0t1.A01     // Catch:{ all -> 0x07a3 }
            r1 = r81
            com.instagram.user.model.User r28 = r2.A01(r1)     // Catch:{ all -> 0x07a3 }
            long r35 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x07a3 }
            r1 = 1000(0x3e8, double:4.94E-321)
            long r35 = r35 / r1
            X.0Ud r1 = r12.A0N     // Catch:{ all -> 0x07a3 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x07a3 }
            X.4A6 r1 = (X.AnonymousClass4A6) r1     // Catch:{ all -> 0x07a3 }
            X.4A5 r2 = r1.A04     // Catch:{ all -> 0x07a3 }
            X.4A5 r1 = X.AnonymousClass4A5.PRIVATE     // Catch:{ all -> 0x07a3 }
            if (r2 == r1) goto L_0x005a
            r38 = 0
            if (r33 == 0) goto L_0x005c
        L_0x005a:
            r38 = 1
        L_0x005c:
            java.lang.String r30 = ""
            r37 = 0
            r39 = 1
            r34 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r29 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x07a3 }
            X.N3Q r25 = new X.N3Q     // Catch:{ all -> 0x07a3 }
            r26 = r0
            r27 = r21
            r31 = r21
            r32 = r21
            r40 = r37
            r41 = r37
            r42 = r37
            r43 = r37
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x07a3 }
            java.util.List r19 = java.util.Collections.singletonList(r25)     // Catch:{ all -> 0x07a3 }
            X.0qQ.A07(r19)     // Catch:{ all -> 0x07a3 }
            goto L_0x0086
        L_0x0084:
            X.0sn r19 = X.0sn.A00     // Catch:{ all -> 0x07a3 }
        L_0x0086:
            X.05G r0 = r12.A0H     // Catch:{ all -> 0x07a3 }
            r80 = r0
            java.lang.Class<X.Bm6> r4 = X.Bm6.class
            r3 = 1
            r0 = 3771(0xebb, float:5.284E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x07a3 }
            r2 = 383301121(0x16d8b601, float:3.5011543E-25)
            r0 = r17
            com.google.common.collect.ImmutableList r0 = r0.getRequiredCompactedTreeListField(r3, r1, r4, r2)     // Catch:{ all -> 0x07a3 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x07a3 }
            java.util.ArrayList r20 = new java.util.ArrayList     // Catch:{ all -> 0x07a3 }
            r20.<init>()     // Catch:{ all -> 0x07a3 }
            java.util.Iterator r18 = r0.iterator()     // Catch:{ all -> 0x07a3 }
        L_0x00a8:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x06a1
            java.lang.Object r5 = r18.next()     // Catch:{ all -> 0x07a3 }
            X.Bm6 r5 = (X.Bm6) r5     // Catch:{ all -> 0x07a3 }
            X.0qQ.A0A(r5)     // Catch:{ all -> 0x07a3 }
            r2 = 0
            X.0qQ.A0B(r5, r2)     // Catch:{ all -> 0x07a3 }
            r11 = 1
            java.lang.Class<X.Bm5> r26 = X.Bm5.class
            r4 = 5
            java.lang.String r27 = "note"
            r3 = 742467236(0x2c4126a4, float:2.74484E-12)
            r1 = r27
            r0 = r26
            X.3lr r3 = r5.getOptionalTreeField(r4, r1, r0, r3)     // Catch:{ all -> 0x07a3 }
            X.Bm5 r3 = (X.Bm5) r3     // Catch:{ all -> 0x07a3 }
            if (r3 == 0) goto L_0x03ce
            java.lang.Class<X.Blh> r1 = X.C42887Blh.class
            r0 = -1079225041(0xffffffffbfac552f, float:-1.3463496)
            X.3lr r3 = r3.reinterpretRequired(r2, r1, r0)     // Catch:{ all -> 0x07a3 }
            X.Blh r3 = (X.C42887Blh) r3     // Catch:{ all -> 0x07a3 }
            if (r3 == 0) goto L_0x03ce
            java.lang.Class<X.Blg> r6 = X.C42886Blg.class
            r36 = 10
            java.lang.String r35 = "user"
            r4 = 562238008(0x21831238, float:8.881728E-19)
            r1 = r36
            r0 = r35
            X.3lr r4 = r3.getRequiredTreeField(r1, r0, r6, r4)     // Catch:{ all -> 0x07a3 }
            X.Blg r4 = (X.C42886Blg) r4     // Catch:{ all -> 0x07a3 }
            java.lang.Class<X.C7o> r34 = X.C43744C7o.class
            r1 = -508424204(0xffffffffe1b20ff4, float:-4.1058375E20)
            r0 = r34
            X.3lr r1 = r4.reinterpretRequired(r2, r0, r1)     // Catch:{ all -> 0x07a3 }
            X.C7o r1 = (X.C43744C7o) r1     // Catch:{ all -> 0x07a3 }
            X.1E5 r0 = X.1E4.A00(r81)     // Catch:{ all -> 0x07a3 }
            com.instagram.user.model.User r45 = r1.A0E(r0)     // Catch:{ all -> 0x07a3 }
            X.0qQ.A07(r45)     // Catch:{ all -> 0x07a3 }
            java.lang.Class<X.Ble> r7 = X.C42884Ble.class
            r1 = 6
            r0 = 3066(0xbfa, float:4.296E-42)
            java.lang.String r6 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x07a3 }
            r0 = -1464300152(0xffffffffa8b88d88, float:-2.0489483E-14)
            X.3lr r4 = r3.getOptionalTreeField(r1, r6, r7, r0)     // Catch:{ all -> 0x07a3 }
            X.Ble r4 = (X.C42884Ble) r4     // Catch:{ all -> 0x07a3 }
            if (r4 == 0) goto L_0x03cb
            java.lang.Class<X.Blq> r1 = X.C42896Blq.class
            r0 = -1400266707(0xffffffffac89a02d, float:-3.9115573E-12)
            X.3lr r8 = r4.reinterpretRequired(r2, r1, r0)     // Catch:{ all -> 0x07a3 }
            X.Blq r8 = (X.C42896Blq) r8     // Catch:{ all -> 0x07a3 }
            if (r8 == 0) goto L_0x03cb
            java.lang.Class<X.Blo> r4 = X.C42894Blo.class
            r0 = 844(0x34c, float:1.183E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x07a3 }
            r1 = -1766123615(0xffffffff96bb17a1, float:-3.0226391E-25)
            X.3lr r4 = r8.getOptionalTreeField(r2, r0, r4, r1)     // Catch:{ all -> 0x07a3 }
            X.Blo r4 = (X.C42894Blo) r4     // Catch:{ all -> 0x07a3 }
            if (r4 == 0) goto L_0x03cb
            java.lang.Class<X.Bln> r1 = X.C42893Bln.class
            r0 = 1859010550(0x6ece3ff6, float:3.1915618E28)
            X.3lr r8 = r4.reinterpretRequired(r2, r1, r0)     // Catch:{ all -> 0x07a3 }
            X.Bln r8 = (X.C42893Bln) r8     // Catch:{ all -> 0x07a3 }
            if (r8 == 0) goto L_0x03cb
            java.lang.Class<X.Blm> r4 = X.C42892Blm.class
            r0 = 4190(0x105e, float:5.871E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x07a3 }
            r1 = 1862279447(0x6f002117, float:3.9654084E28)
            X.3lr r1 = r8.getOptionalTreeField(r11, r0, r4, r1)     // Catch:{ all -> 0x07a3 }
            X.Blm r1 = (X.C42892Blm) r1     // Catch:{ all -> 0x07a3 }
        L_0x015a:
            r4 = 6
            r0 = -1464300152(0xffffffffa8b88d88, float:-2.0489483E-14)
            X.3lr r8 = r3.getOptionalTreeField(r4, r6, r7, r0)     // Catch:{ all -> 0x07a3 }
            X.Ble r8 = (X.C42884Ble) r8     // Catch:{ all -> 0x07a3 }
            if (r8 == 0) goto L_0x03c8
            java.lang.Class<X.Blq> r4 = X.C42896Blq.class
            r0 = -1400266707(0xffffffffac89a02d, float:-3.9115573E-12)
            X.3lr r9 = r8.reinterpretRequired(r2, r4, r0)     // Catch:{ all -> 0x07a3 }
            X.Blq r9 = (X.C42896Blq) r9     // Catch:{ all -> 0x07a3 }
            if (r9 == 0) goto L_0x03c8
            java.lang.Class<X.Blo> r8 = X.C42894Blo.class
            r0 = 844(0x34c, float:1.183E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x07a3 }
            r4 = -1766123615(0xffffffff96bb17a1, float:-3.0226391E-25)
            X.3lr r8 = r9.getOptionalTreeField(r2, r0, r8, r4)     // Catch:{ all -> 0x07a3 }
            X.Blo r8 = (X.C42894Blo) r8     // Catch:{ all -> 0x07a3 }
            if (r8 == 0) goto L_0x03c8
            java.lang.Class<X.Bln> r4 = X.C42893Bln.class
            r0 = 1859010550(0x6ece3ff6, float:3.1915618E28)
            X.3lr r9 = r8.reinterpretRequired(r2, r4, r0)     // Catch:{ all -> 0x07a3 }
            X.Bln r9 = (X.C42893Bln) r9     // Catch:{ all -> 0x07a3 }
            if (r9 == 0) goto L_0x03c8
            java.lang.Class<X.Bli> r8 = X.C42888Bli.class
            r0 = 3324(0xcfc, float:4.658E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x07a3 }
            r4 = -693271347(0xffffffffd6ad84cd, float:-9.5392943E13)
            X.3lr r4 = r9.getOptionalTreeField(r2, r0, r8, r4)     // Catch:{ all -> 0x07a3 }
            X.Bli r4 = (X.C42888Bli) r4     // Catch:{ all -> 0x07a3 }
        L_0x01a4:
            java.lang.String r0 = "audience"
            int r56 = r3.getRequiredIntField(r2, r0)     // Catch:{ all -> 0x07a3 }
            com.instagram.api.schemas.NoteBackgroundColor r37 = com.instagram.api.schemas.NoteBackgroundColor.WHITE     // Catch:{ all -> 0x07a3 }
            java.lang.String r0 = "can_reply"
            boolean r62 = r3.getRequiredBooleanField(r11, r0)     // Catch:{ all -> 0x07a3 }
            r33 = 2
            java.lang.String r8 = "created_at"
            r0 = r33
            long r58 = r3.getRequiredTimeField(r0, r8)     // Catch:{ all -> 0x07a3 }
            r10 = 3
            java.lang.String r0 = "expires_at"
            long r60 = r3.getRequiredTimeField(r10, r0)     // Catch:{ all -> 0x07a3 }
            com.instagram.api.schemas.NoteFontStyle r40 = com.instagram.api.schemas.NoteFontStyle.STANDARD     // Catch:{ all -> 0x07a3 }
            r8 = 12
            java.lang.String r0 = "has_translation"
            boolean r63 = r3.getRequiredBooleanField(r8, r0)     // Catch:{ all -> 0x07a3 }
            r15 = 4
            java.lang.String r8 = "id"
            java.lang.String r49 = r3.getRequiredStringField(r15, r8)     // Catch:{ all -> 0x07a3 }
            X.0qQ.A07(r49)     // Catch:{ all -> 0x07a3 }
            r14 = 5
            r0 = 2915(0xb63, float:4.085E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x07a3 }
            boolean r64 = r3.getRequiredBooleanField(r14, r0)     // Catch:{ all -> 0x07a3 }
            r9 = 13
            r0 = 792(0x318, float:1.11E-42)
            java.lang.String r25 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x07a3 }
            r0 = r25
            boolean r65 = r3.getRequiredBooleanField(r9, r0)     // Catch:{ all -> 0x07a3 }
            r9 = 6
            r0 = -1464300152(0xffffffffa8b88d88, float:-2.0489483E-14)
            X.3lr r0 = r3.getOptionalTreeField(r9, r6, r7, r0)     // Catch:{ all -> 0x07a3 }
            X.Ble r0 = (X.C42884Ble) r0     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x0225
            java.lang.Class<X.Blq> r7 = X.C42896Blq.class
            r6 = -1400266707(0xffffffffac89a02d, float:-3.9115573E-12)
            X.3lr r0 = r0.reinterpretRequired(r2, r7, r6)     // Catch:{ all -> 0x07a3 }
            X.Blq r0 = (X.C42896Blq) r0     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x0225
            java.lang.Class<X.Blp> r9 = X.C42895Blp.class
            r6 = 3141(0xc45, float:4.401E-42)
            java.lang.String r6 = X.C273654mx.A00(r6)     // Catch:{ all -> 0x07a3 }
            r7 = 740847298(0x2c286ec2, float:2.3935719E-12)
            X.3lr r0 = r0.getOptionalTreeField(r11, r6, r9, r7)     // Catch:{ all -> 0x07a3 }
            X.Blp r0 = (X.C42895Blp) r0     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x0225
            r6 = 1700(0x6a4, float:2.382E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)     // Catch:{ all -> 0x07a3 }
            r0.getRequiredStringField(r2, r6)     // Catch:{ all -> 0x07a3 }
        L_0x0225:
            X.5y2 r6 = X.DA0.A00()     // Catch:{ all -> 0x07a3 }
            com.instagram.api.schemas.GIFNoteResponseInfo r0 = r6.A02     // Catch:{ all -> 0x07a3 }
            r32 = r0
            com.instagram.api.schemas.ListeningNowResponseInfo r13 = r6.A04     // Catch:{ all -> 0x07a3 }
            r6 = 0
            if (r1 == 0) goto L_0x02ce
            java.lang.String r9 = r1.getRequiredStringField(r2, r8)     // Catch:{ all -> 0x07a3 }
            java.lang.String r31 = ""
            if (r9 != 0) goto L_0x023c
            r9 = r31
        L_0x023c:
            java.lang.Class<com.instagram.model.mediasize.ImmutablePandoImageInfo> r4 = com.instagram.model.mediasize.ImmutablePandoImageInfo.class
            java.lang.String r0 = "image_versions2"
            com.facebook.pando.TreeJNI r4 = r1.getTreeValue(r0, r4)     // Catch:{ all -> 0x07a3 }
            com.instagram.model.mediasize.ImageInfo r4 = (com.instagram.model.mediasize.ImageInfo) r4     // Catch:{ all -> 0x07a3 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x07a3 }
            java.lang.String r0 = "pk"
            java.lang.String r0 = r1.getRequiredStringField(r11, r0)     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x0253
            r31 = r0
        L_0x0253:
            java.lang.Class<X.Bll> r7 = X.C42891Bll.class
            r0 = 1927(0x787, float:2.7E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x07a3 }
            r6 = -319651249(0xffffffffecf2824f, float:-2.3454033E27)
            com.google.common.collect.ImmutableList r0 = r1.getRequiredCompactedTreeListField(r10, r0, r7, r6)     // Catch:{ all -> 0x07a3 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x07a3 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x07a3 }
            r6.<init>()     // Catch:{ all -> 0x07a3 }
            java.util.Iterator r30 = r0.iterator()     // Catch:{ all -> 0x07a3 }
        L_0x026e:
            boolean r0 = r30.hasNext()     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x02bf
            java.lang.Object r1 = r30.next()     // Catch:{ all -> 0x07a3 }
            X.Bll r1 = (X.C42891Bll) r1     // Catch:{ all -> 0x07a3 }
            java.lang.String r0 = "height"
            int r0 = r1.getCoercedIntField(r2, r0)     // Catch:{ all -> 0x07a3 }
            java.lang.Integer r68 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x07a3 }
            java.lang.String r72 = r1.getOptionalStringField(r11, r8)     // Catch:{ all -> 0x07a3 }
            java.lang.String r7 = "type"
            r0 = r33
            int r0 = r1.getCoercedIntField(r0, r7)     // Catch:{ all -> 0x07a3 }
            java.lang.Integer r69 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x07a3 }
            java.lang.String r0 = "url"
            java.lang.String r73 = r1.getOptionalStringField(r10, r0)     // Catch:{ all -> 0x07a3 }
            r0 = 390(0x186, float:5.47E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x07a3 }
            long r28 = r1.getCoercedTimeField(r14, r0)     // Catch:{ all -> 0x07a3 }
            java.lang.Long r71 = java.lang.Long.valueOf(r28)     // Catch:{ all -> 0x07a3 }
            java.lang.String r0 = "width"
            int r0 = r1.getCoercedIntField(r15, r0)     // Catch:{ all -> 0x07a3 }
            java.lang.Integer r70 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x07a3 }
            com.instagram.model.mediasize.VideoVersion r0 = new com.instagram.model.mediasize.VideoVersion     // Catch:{ all -> 0x07a3 }
            r66 = r0
            r67 = r21
            r66.<init>(r67, r68, r69, r70, r71, r72, r73)     // Catch:{ all -> 0x07a3 }
            r6.add(r0)     // Catch:{ all -> 0x07a3 }
            goto L_0x026e
        L_0x02bf:
            com.instagram.api.schemas.NotePogVideoDict r1 = new com.instagram.api.schemas.NotePogVideoDict     // Catch:{ all -> 0x07a3 }
            r0 = r31
            r1.<init>(r4, r9, r0, r6)     // Catch:{ all -> 0x07a3 }
            X.60C r6 = new X.60C     // Catch:{ all -> 0x07a3 }
            r0 = r21
            r6.<init>(r0, r1)     // Catch:{ all -> 0x07a3 }
            goto L_0x02f7
        L_0x02ce:
            if (r4 == 0) goto L_0x02f7
            java.lang.String r7 = r4.getRequiredStringField(r2, r8)     // Catch:{ all -> 0x07a3 }
            X.0qQ.A07(r7)     // Catch:{ all -> 0x07a3 }
            java.lang.String r0 = "image_url"
            java.lang.String r6 = r4.getRequiredStringField(r11, r0)     // Catch:{ all -> 0x07a3 }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x07a3 }
            java.lang.String r1 = "pk"
            r0 = r33
            java.lang.String r0 = r4.getRequiredStringField(r0, r1)     // Catch:{ all -> 0x07a3 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x07a3 }
            com.instagram.api.schemas.NotePogImageDict r1 = new com.instagram.api.schemas.NotePogImageDict     // Catch:{ all -> 0x07a3 }
            r1.<init>(r7, r6, r0)     // Catch:{ all -> 0x07a3 }
            X.60C r6 = new X.60C     // Catch:{ all -> 0x07a3 }
            r0 = r21
            r6.<init>(r1, r0)     // Catch:{ all -> 0x07a3 }
        L_0x02f7:
            X.1hu r1 = new X.1hu     // Catch:{ all -> 0x07a3 }
            r0 = r21
            r1.<init>(r0)     // Catch:{ all -> 0x07a3 }
            r4 = 6
            X.1E9 r0 = new X.1E9     // Catch:{ all -> 0x07a3 }
            r0.<init>(r1, r4, r2)     // Catch:{ all -> 0x07a3 }
            r69 = r21
            if (r32 == 0) goto L_0x030c
            com.instagram.api.schemas.GIFNoteResponseInfoImpl r69 = r32.F3I()     // Catch:{ all -> 0x07a3 }
        L_0x030c:
            if (r13 == 0) goto L_0x0313
            com.instagram.api.schemas.ListeningNowResponseInfo r71 = r13.F5U(r0)     // Catch:{ all -> 0x07a3 }
            goto L_0x0315
        L_0x0313:
            r71 = r21
        L_0x0315:
            if (r6 == 0) goto L_0x0318
            goto L_0x031b
        L_0x0318:
            r76 = r21
            goto L_0x031f
        L_0x031b:
            X.60C r76 = r6.F6v()     // Catch:{ all -> 0x07a3 }
        L_0x031f:
            X.5y2 r42 = new X.5y2     // Catch:{ all -> 0x07a3 }
            r66 = r42
            r67 = r21
            r68 = r21
            r70 = r21
            r72 = r21
            r73 = r21
            r74 = r21
            r75 = r21
            r77 = r21
            r78 = r21
            r79 = r21
            r66.<init>(r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79)     // Catch:{ all -> 0x07a3 }
            r1 = 7
            r0 = 845(0x34d, float:1.184E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x07a3 }
            int r57 = r3.getRequiredIntField(r1, r0)     // Catch:{ all -> 0x07a3 }
            java.lang.Class<X.Blf> r6 = X.C42885Blf.class
            r4 = 8
            java.lang.String r1 = "reactions"
            r0 = -1542038008(0xffffffffa4165e08, float:-3.2605713E-17)
            com.google.common.collect.ImmutableList r1 = r3.getRequiredCompactedTreeListField(r4, r1, r6, r0)     // Catch:{ all -> 0x07a3 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x07a3 }
            r0 = r36
            int r0 = X.0Yv.A1E(r1, r0)     // Catch:{ all -> 0x07a3 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x07a3 }
            r8.<init>(r0)     // Catch:{ all -> 0x07a3 }
            java.util.Iterator r13 = r1.iterator()     // Catch:{ all -> 0x07a3 }
        L_0x0364:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x03d0
            java.lang.Object r1 = r13.next()     // Catch:{ all -> 0x07a3 }
            X.Blf r1 = (X.C42885Blf) r1     // Catch:{ all -> 0x07a3 }
            java.lang.Class<X.Bld> r7 = X.C42883Bld.class
            r6 = -2078661035(0xffffffff841a2655, float:-1.8120214E-36)
            X.3lr r0 = r1.reinterpretRequired(r2, r7, r6)     // Catch:{ all -> 0x07a3 }
            X.Bld r0 = (X.C42883Bld) r0     // Catch:{ all -> 0x07a3 }
            java.lang.String r4 = "emoji"
            java.lang.String r10 = r0.getRequiredStringField(r2, r4)     // Catch:{ all -> 0x07a3 }
            X.3lr r4 = r1.reinterpretRequired(r2, r7, r6)     // Catch:{ all -> 0x07a3 }
            X.Bld r4 = (X.C42883Bld) r4     // Catch:{ all -> 0x07a3 }
            r0 = r25
            boolean r0 = r4.getRequiredBooleanField(r11, r0)     // Catch:{ all -> 0x07a3 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x07a3 }
            X.3lr r4 = r1.reinterpretRequired(r2, r7, r6)     // Catch:{ all -> 0x07a3 }
            X.Bld r4 = (X.C42883Bld) r4     // Catch:{ all -> 0x07a3 }
            java.lang.Class<X.Blc> r7 = X.C42882Blc.class
            r6 = -935260601(0xffffffffc8410e47, float:-197689.11)
            r1 = r35
            r0 = r33
            X.3lr r1 = r4.getRequiredTreeField(r0, r1, r7, r6)     // Catch:{ all -> 0x07a3 }
            X.Blc r1 = (X.C42882Blc) r1     // Catch:{ all -> 0x07a3 }
            if (r1 == 0) goto L_0x03c6
            r4 = -508424204(0xffffffffe1b20ff4, float:-4.1058375E20)
            r0 = r34
            X.3lr r0 = r1.reinterpretRequired(r2, r0, r4)     // Catch:{ all -> 0x07a3 }
            X.C7o r0 = (X.C43744C7o) r0     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x03c6
            X.1E5 r1 = X.1E4.A00(r81)     // Catch:{ all -> 0x07a3 }
            com.instagram.user.model.User r1 = r0.A0E(r1)     // Catch:{ all -> 0x07a3 }
        L_0x03bd:
            com.instagram.api.schemas.NoteEmojiReactionInfo r0 = new com.instagram.api.schemas.NoteEmojiReactionInfo     // Catch:{ all -> 0x07a3 }
            r0.<init>(r1, r9, r10)     // Catch:{ all -> 0x07a3 }
            r8.add(r0)     // Catch:{ all -> 0x07a3 }
            goto L_0x0364
        L_0x03c6:
            r1 = 0
            goto L_0x03bd
        L_0x03c8:
            r4 = 0
            goto L_0x01a4
        L_0x03cb:
            r1 = 0
            goto L_0x015a
        L_0x03ce:
            r4 = 0
            goto L_0x0409
        L_0x03d0:
            r1 = 9
            java.lang.String r0 = "text"
            java.lang.String r51 = r3.getRequiredStringField(r1, r0)     // Catch:{ all -> 0x07a3 }
            X.0qQ.A07(r51)     // Catch:{ all -> 0x07a3 }
            r1 = 11
            java.lang.String r0 = "user_id"
            java.lang.String r52 = r3.getRequiredStringField(r1, r0)     // Catch:{ all -> 0x07a3 }
            X.0qQ.A07(r52)     // Catch:{ all -> 0x07a3 }
            java.lang.Boolean r46 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x07a3 }
            X.4zZ r4 = new X.4zZ     // Catch:{ all -> 0x07a3 }
            r35 = r4
            r36 = r21
            r38 = r21
            r39 = r21
            r41 = r21
            r43 = r21
            r44 = r21
            r47 = r21
            r48 = r21
            r50 = r21
            r53 = r21
            r54 = r21
            r55 = r8
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r60, r62, r63, r64, r65)     // Catch:{ all -> 0x07a3 }
        L_0x0409:
            java.lang.Class<X.Bm4> r3 = X.Bm4.class
            r0 = 3619(0xe23, float:5.071E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x07a3 }
            r1 = 728694766(0x2b6effee, float:8.490976E-13)
            r6 = r17
            com.google.common.collect.ImmutableList r0 = r6.getRequiredCompactedTreeListField(r2, r0, r3, r1)     // Catch:{ all -> 0x07a3 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x07a3 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x07a3 }
        L_0x0421:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x0471
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x07a3 }
            r3 = r6
            X.Bm4 r3 = (X.Bm4) r3     // Catch:{ all -> 0x07a3 }
            java.lang.Class<X.C7o> r1 = X.C43744C7o.class
            r0 = -508424204(0xffffffffe1b20ff4, float:-4.1058375E20)
            X.3lr r1 = r3.reinterpretRequired(r2, r1, r0)     // Catch:{ all -> 0x07a3 }
            X.C7o r1 = (X.C43744C7o) r1     // Catch:{ all -> 0x07a3 }
            java.lang.String r0 = "pk"
            java.lang.String r3 = r1.getOptionalStringField(r2, r0)     // Catch:{ all -> 0x07a3 }
            r1 = 4
            java.lang.String r0 = "user_id"
            java.lang.String r0 = r5.getRequiredStringField(r1, r0)     // Catch:{ all -> 0x07a3 }
            boolean r0 = X.0qQ.A0K(r3, r0)     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x0421
        L_0x044c:
            X.Bm4 r6 = (X.Bm4) r6     // Catch:{ all -> 0x07a3 }
            if (r6 == 0) goto L_0x00a8
            java.lang.Class<X.C7o> r1 = X.C43744C7o.class
            r0 = -508424204(0xffffffffe1b20ff4, float:-4.1058375E20)
            X.3lr r1 = r6.reinterpretRequired(r2, r1, r0)     // Catch:{ all -> 0x07a3 }
            X.C7o r1 = (X.C43744C7o) r1     // Catch:{ all -> 0x07a3 }
            if (r1 == 0) goto L_0x00a8
            X.1E5 r0 = X.1E4.A00(r81)     // Catch:{ all -> 0x07a3 }
            com.instagram.user.model.User r29 = r1.A0E(r0)     // Catch:{ all -> 0x07a3 }
            if (r29 == 0) goto L_0x00a8
            java.lang.String r0 = "strong_id__"
            java.lang.String r31 = r5.getRequiredStringField(r2, r0)     // Catch:{ all -> 0x07a3 }
            X.0qQ.A07(r31)     // Catch:{ all -> 0x07a3 }
            goto L_0x0473
        L_0x0471:
            r6 = 0
            goto L_0x044c
        L_0x0473:
            if (r4 == 0) goto L_0x0476
            goto L_0x0479
        L_0x0476:
            r25 = 0
            goto L_0x047d
        L_0x0479:
            java.lang.String r0 = r4.A0H     // Catch:{ all -> 0x07a3 }
            r25 = r0
        L_0x047d:
            java.lang.String r0 = "latitude"
            double r6 = r5.getRequiredDoubleField(r11, r0)     // Catch:{ all -> 0x07a3 }
            r3 = 2
            java.lang.String r0 = "longitude"
            double r0 = r5.getRequiredDoubleField(r3, r0)     // Catch:{ all -> 0x07a3 }
            com.facebook.android.maps.model.LatLng r15 = new com.facebook.android.maps.model.LatLng     // Catch:{ all -> 0x07a3 }
            r15.<init>(r6, r0)     // Catch:{ all -> 0x07a3 }
            if (r4 == 0) goto L_0x0492
            goto L_0x0495
        L_0x0492:
            r28 = 0
            goto L_0x049b
        L_0x0495:
            r0 = r81
            X.4AB r28 = X.C71130OdT.A00(r4, r0)     // Catch:{ all -> 0x07a3 }
        L_0x049b:
            r14 = 6
            java.lang.String r13 = "timestamp"
            long r36 = r5.getRequiredTimeField(r14, r13)     // Catch:{ all -> 0x07a3 }
            r1 = 4
            java.lang.String r7 = "user_id"
            java.lang.String r0 = r5.getRequiredStringField(r1, r7)     // Catch:{ all -> 0x07a3 }
            r6 = r81
            java.lang.String r6 = r6.A06     // Catch:{ all -> 0x07a3 }
            boolean r0 = X.0qQ.A0K(r0, r6)     // Catch:{ all -> 0x07a3 }
            r42 = 1
            if (r0 == 0) goto L_0x04d6
            r10 = 5
            r9 = 742467236(0x2c4126a4, float:2.74484E-12)
            r8 = r27
            r0 = r26
            X.3lr r0 = r5.getOptionalTreeField(r10, r8, r0, r9)     // Catch:{ all -> 0x07a3 }
            X.Bm5 r0 = (X.Bm5) r0     // Catch:{ all -> 0x07a3 }
            if (r0 != 0) goto L_0x04d6
            X.NkW r9 = X.C69392NkW.UNSET_OR_UNRECOGNIZED_ENUM_VALUE     // Catch:{ all -> 0x07a3 }
            r8 = 3
            java.lang.String r0 = "audience"
            java.lang.Enum r0 = r5.getRequiredEnumField(r8, r0, r9)     // Catch:{ all -> 0x07a3 }
            X.NkW r0 = (X.C69392NkW) r0     // Catch:{ all -> 0x07a3 }
            X.NkW r8 = X.C69392NkW.ONLY_OWNER     // Catch:{ all -> 0x07a3 }
            r39 = 1
            if (r0 == r8) goto L_0x04d8
        L_0x04d6:
            r39 = 0
        L_0x04d8:
            java.lang.String r0 = r5.getRequiredStringField(r1, r7)     // Catch:{ all -> 0x07a3 }
            boolean r0 = X.0qQ.A0K(r0, r6)     // Catch:{ all -> 0x07a3 }
            if (r0 != 0) goto L_0x0510
            r9 = 5
            r8 = 742467236(0x2c4126a4, float:2.74484E-12)
            r1 = r27
            r0 = r26
            X.3lr r1 = r5.getOptionalTreeField(r9, r1, r0, r8)     // Catch:{ all -> 0x07a3 }
            X.Bm5 r1 = (X.Bm5) r1     // Catch:{ all -> 0x07a3 }
            if (r1 == 0) goto L_0x050e
            java.lang.Class<X.Blh> r8 = X.C42887Blh.class
            r0 = -1079225041(0xffffffffbfac552f, float:-1.3463496)
            X.3lr r1 = r1.reinterpretRequired(r2, r8, r0)     // Catch:{ all -> 0x07a3 }
            X.Blh r1 = (X.C42887Blh) r1     // Catch:{ all -> 0x07a3 }
            if (r1 == 0) goto L_0x050e
            r0 = 11
            java.lang.String r0 = r1.getRequiredStringField(r0, r7)     // Catch:{ all -> 0x07a3 }
        L_0x0505:
            boolean r0 = X.0qQ.A0K(r0, r6)     // Catch:{ all -> 0x07a3 }
            r40 = 0
            if (r0 == 0) goto L_0x0512
            goto L_0x0510
        L_0x050e:
            r0 = 0
            goto L_0x0505
        L_0x0510:
            r40 = 1
        L_0x0512:
            if (r4 == 0) goto L_0x0522
            java.util.List r1 = r4.A0N     // Catch:{ all -> 0x07a3 }
            if (r1 == 0) goto L_0x0522
            boolean r0 = r1 instanceof java.util.Collection     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x0525
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x0525
        L_0x0522:
            r42 = 0
            goto L_0x0543
        L_0x0525:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x07a3 }
        L_0x0529:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x0522
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x07a3 }
            com.instagram.api.schemas.NoteEmojiReactionInfo r0 = (com.instagram.api.schemas.NoteEmojiReactionInfo) r0     // Catch:{ all -> 0x07a3 }
            com.instagram.user.model.User r0 = r0.A00     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x05ba
            java.lang.String r0 = r0.getId()     // Catch:{ all -> 0x07a3 }
        L_0x053d:
            boolean r0 = X.0qQ.A0K(r0, r6)     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x0529
        L_0x0543:
            java.lang.String r1 = "rank"
            boolean r0 = r5.hasFieldValue(r1)     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x05b6
            r0 = 7
            int r35 = r5.getCoercedIntField(r0, r1)     // Catch:{ all -> 0x07a3 }
        L_0x0550:
            java.lang.Class<X.QWW> r6 = X.QWW.class
            r4 = 8
            r0 = 3523(0xdc3, float:4.937E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x07a3 }
            r1 = 178936253(0xaaa59bd, float:1.640416E-32)
            X.3lr r4 = r5.getRequiredTreeField(r4, r0, r6, r1)     // Catch:{ all -> 0x07a3 }
            X.QWW r4 = (X.QWW) r4     // Catch:{ all -> 0x07a3 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x07a3 }
            java.lang.String r0 = "city"
            java.lang.String r1 = r4.getOptionalStringField(r2, r0)     // Catch:{ all -> 0x07a3 }
            if (r1 == 0) goto L_0x05ac
            java.lang.String r0 = ","
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x07a3 }
            java.util.List r0 = X.00l.A0R(r1, r0, r2)     // Catch:{ all -> 0x07a3 }
            java.lang.Object r1 = X.00k.A0O(r0, r2)     // Catch:{ all -> 0x07a3 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x07a3 }
            if (r1 == 0) goto L_0x05ae
            java.lang.CharSequence r1 = X.00l.A0B(r1)     // Catch:{ all -> 0x07a3 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x07a3 }
        L_0x0588:
            java.lang.Object r0 = X.00k.A0O(r0, r11)     // Catch:{ all -> 0x07a3 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x05b3
            java.lang.CharSequence r0 = X.00l.A0B(r0)     // Catch:{ all -> 0x07a3 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x07a3 }
        L_0x0598:
            r6 = 811(0x32b, float:1.136E-42)
            java.lang.String r6 = X.Pxd.A00(r6)     // Catch:{ all -> 0x07a3 }
            java.lang.String r7 = r4.getOptionalStringField(r3, r6)     // Catch:{ all -> 0x07a3 }
            if (r7 == 0) goto L_0x05bc
            int r7 = r7.length()     // Catch:{ all -> 0x07a3 }
            r8 = 0
            if (r7 != 0) goto L_0x05bd
            goto L_0x05bc
        L_0x05ac:
            r0 = r21
        L_0x05ae:
            r1 = r21
            if (r0 == 0) goto L_0x05b3
            goto L_0x0588
        L_0x05b3:
            r0 = r21
            goto L_0x0598
        L_0x05b6:
            r35 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0550
        L_0x05ba:
            r0 = 0
            goto L_0x053d
        L_0x05bc:
            r8 = 1
        L_0x05bd:
            java.lang.String r7 = "%s, %s"
            if (r8 != 0) goto L_0x05c4
            if (r1 == 0) goto L_0x05c7
            goto L_0x05d3
        L_0x05c4:
            if (r1 == 0) goto L_0x05c7
            goto L_0x063a
        L_0x05c7:
            r1 = 3
            r0 = 747(0x2eb, float:1.047E-42)
            java.lang.String r0 = X.Pxd.A00(r0)     // Catch:{ all -> 0x07a3 }
            java.lang.String r33 = r4.getOptionalStringField(r1, r0)     // Catch:{ all -> 0x07a3 }
            goto L_0x05e7
        L_0x05d3:
            int r8 = r1.length()     // Catch:{ all -> 0x07a3 }
            if (r8 == 0) goto L_0x063a
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x07a3 }
            java.lang.String r4 = r4.getOptionalStringField(r3, r6)     // Catch:{ all -> 0x07a3 }
            r0[r2] = r4     // Catch:{ all -> 0x07a3 }
        L_0x05e1:
            r0[r11] = r1     // Catch:{ all -> 0x07a3 }
        L_0x05e3:
            java.lang.String r33 = X.0mp.A06(r7, r0)     // Catch:{ all -> 0x07a3 }
        L_0x05e7:
            java.lang.Class<X.Bm3> r6 = X.Bm3.class
            r0 = 1568(0x620, float:2.197E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x07a3 }
            r4 = 92853030(0x588d326, float:1.2866942E-35)
            r0 = r17
            X.3lr r1 = r0.getOptionalTreeField(r3, r1, r6, r4)     // Catch:{ all -> 0x07a3 }
            X.Bm3 r1 = (X.Bm3) r1     // Catch:{ all -> 0x07a3 }
            r43 = 1
            if (r1 == 0) goto L_0x0637
            java.lang.Class<X.Blw> r3 = X.C42902Blw.class
            r0 = -1620690398(0xffffffff9f663a22, float:-4.875248E-20)
            X.3lr r1 = r1.reinterpretRequired(r2, r3, r0)     // Catch:{ all -> 0x07a3 }
            X.Blw r1 = (X.C42902Blw) r1     // Catch:{ all -> 0x07a3 }
            if (r1 == 0) goto L_0x0637
            r0 = 321(0x141, float:4.5E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ all -> 0x07a3 }
            int r0 = r1.getRequiredIntField(r11, r0)     // Catch:{ all -> 0x07a3 }
            long r0 = (long) r0     // Catch:{ all -> 0x07a3 }
            long r6 = r5.getRequiredTimeField(r14, r13)     // Catch:{ all -> 0x07a3 }
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0637
        L_0x061e:
            X.EWg r3 = X.C48114EWg.UNSET_OR_UNRECOGNIZED_ENUM_VALUE     // Catch:{ all -> 0x07a3 }
            r1 = 9
            r0 = 3525(0xdc5, float:4.94E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x07a3 }
            java.lang.Enum r0 = r5.getOptionalEnumField(r1, r0, r3)     // Catch:{ all -> 0x07a3 }
            X.EWg r0 = (X.C48114EWg) r0     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x0678
            int r0 = r0.ordinal()     // Catch:{ all -> 0x07a3 }
            if (r0 == r11) goto L_0x0675
            goto L_0x0671
        L_0x0637:
            r43 = 0
            goto L_0x061e
        L_0x063a:
            int r8 = r1.length()     // Catch:{ all -> 0x07a3 }
            if (r8 == 0) goto L_0x064d
            if (r0 == 0) goto L_0x064d
            int r6 = r0.length()     // Catch:{ all -> 0x07a3 }
            if (r6 == 0) goto L_0x064d
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch:{ all -> 0x07a3 }
            goto L_0x05e3
        L_0x064d:
            if (r8 == 0) goto L_0x05c7
            java.lang.String r6 = "country"
            java.lang.String r0 = r4.getOptionalStringField(r11, r6)     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x05c7
            java.lang.CharSequence r0 = X.00l.A0B(r0)     // Catch:{ all -> 0x07a3 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x05c7
            int r0 = r0.length()     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x05c7
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x07a3 }
            r0[r2] = r1     // Catch:{ all -> 0x07a3 }
            java.lang.String r1 = r4.getOptionalStringField(r11, r6)     // Catch:{ all -> 0x07a3 }
            goto L_0x05e1
        L_0x0671:
            r1 = 3
            if (r0 != r1) goto L_0x0678
            goto L_0x067b
        L_0x0675:
            java.lang.Integer r30 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x07a3 }
            goto L_0x067d
        L_0x0678:
            java.lang.Integer r30 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x07a3 }
            goto L_0x067d
        L_0x067b:
            java.lang.Integer r30 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x07a3 }
        L_0x067d:
            X.N3Q r0 = new X.N3Q     // Catch:{ all -> 0x07a3 }
            r26 = r0
            r27 = r15
            r32 = r25
            r34 = r21
            r38 = r2
            r41 = r2
            r44 = r2
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ all -> 0x07a3 }
            r3 = r22
            r2 = r24
            r1 = r23
            X.N3Q r1 = A01(r0, r12, r2, r1, r3)     // Catch:{ all -> 0x07a3 }
            r0 = r20
            r0.add(r1)     // Catch:{ all -> 0x07a3 }
            goto L_0x00a8
        L_0x06a1:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x07a3 }
            r3.<init>()     // Catch:{ all -> 0x07a3 }
            java.util.Iterator r4 = r20.iterator()     // Catch:{ all -> 0x07a3 }
        L_0x06aa:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x06ce
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x07a3 }
            r1 = r2
            X.N3Q r1 = (X.N3Q) r1     // Catch:{ all -> 0x07a3 }
            if (r86 == 0) goto L_0x06c4
            X.4AB r0 = r1.A03     // Catch:{ all -> 0x07a3 }
            if (r0 != 0) goto L_0x06ca
            if (r16 == 0) goto L_0x06aa
            boolean r0 = r1.A0F     // Catch:{ all -> 0x07a3 }
            if (r0 != 0) goto L_0x06aa
            goto L_0x06ca
        L_0x06c4:
            if (r16 != 0) goto L_0x06ca
            X.4AB r0 = r1.A03     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x06aa
        L_0x06ca:
            r3.add(r2)     // Catch:{ all -> 0x07a3 }
            goto L_0x06aa
        L_0x06ce:
            r0 = r19
            java.util.ArrayList r1 = X.00k.A0S(r0, r3)     // Catch:{ all -> 0x07a3 }
            r0 = r80
            r0.Epw(r1)     // Catch:{ all -> 0x07a3 }
            java.lang.Object r0 = r80.getValue()     // Catch:{ all -> 0x07a3 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x07a3 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x07a3 }
            r3.<init>()     // Catch:{ all -> 0x07a3 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x07a3 }
        L_0x06e8:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x06ff
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x07a3 }
            r0 = r1
            X.N3Q r0 = (X.N3Q) r0     // Catch:{ all -> 0x07a3 }
            boolean r0 = r0.A0F     // Catch:{ all -> 0x07a3 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x06e8
            r3.add(r1)     // Catch:{ all -> 0x07a3 }
            goto L_0x06e8
        L_0x06ff:
            X.0Ud r0 = r12.A0N     // Catch:{ all -> 0x07a3 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x07a3 }
            X.4A6 r1 = (X.AnonymousClass4A6) r1     // Catch:{ all -> 0x07a3 }
            X.0Ud r0 = r12.A0M     // Catch:{ all -> 0x07a3 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x07a3 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x07a3 }
            int r2 = A00(r12, r1, r0)     // Catch:{ all -> 0x07a3 }
            X.MpT r1 = new X.MpT     // Catch:{ all -> 0x07a3 }
            r0 = r21
            r1.<init>(r3, r2, r0)     // Catch:{ all -> 0x07a3 }
            r0 = r85
            r0.invoke(r1)     // Catch:{ all -> 0x07a3 }
            java.lang.Class<X.Bm3> r4 = X.Bm3.class
            r3 = 2
            r0 = 1568(0x620, float:2.197E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x07a3 }
            r2 = 92853030(0x588d326, float:1.2866942E-35)
            r0 = r17
            X.3lr r3 = r0.getOptionalTreeField(r3, r1, r4, r2)     // Catch:{ all -> 0x07a3 }
            X.Bm3 r3 = (X.Bm3) r3     // Catch:{ all -> 0x07a3 }
            if (r3 == 0) goto L_0x074e
            java.lang.Class<X.Blw> r2 = X.C42902Blw.class
            r1 = 0
            r0 = -1620690398(0xffffffff9f663a22, float:-4.875248E-20)
            X.3lr r1 = r3.reinterpretRequired(r1, r2, r0)     // Catch:{ all -> 0x07a3 }
            X.Blw r1 = (X.C42902Blw) r1     // Catch:{ all -> 0x07a3 }
            if (r1 == 0) goto L_0x074e
            r0 = r81
            X.4A6 r1 = X.C71130OdT.A05(r0, r1)     // Catch:{ all -> 0x07a3 }
            X.05G r0 = r12.A0I     // Catch:{ all -> 0x07a3 }
            r0.Epw(r1)     // Catch:{ all -> 0x07a3 }
        L_0x074e:
            X.0Tu r3 = X.0Tu.A05     // Catch:{ all -> 0x07a3 }
            r0 = 36321769627330309(0x810a7500402705, double:3.0333715961260957E-306)
            r2 = r81
            boolean r0 = X.182.A06(r3, r2, r0)     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x0777
            boolean r0 = r22.isEmpty()     // Catch:{ all -> 0x07a3 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0777
            X.4Cq r4 = r12.A01     // Catch:{ all -> 0x07a3 }
            r3 = 20
            X.MH0 r2 = new X.MH0     // Catch:{ all -> 0x07a3 }
            r1 = r22
            r0 = r21
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r12, (X.AnonymousClass4D7) r0, (int) r3)     // Catch:{ all -> 0x07a3 }
            X.19B r0 = X.19B.A00     // Catch:{ all -> 0x07a3 }
            X.1Eo.A05(r0, r2, r4)     // Catch:{ all -> 0x07a3 }
        L_0x0777:
            X.0Tu r3 = X.0Tu.A06     // Catch:{ all -> 0x07a3 }
            r1 = 2342164778840172280(0x20810a75003326f8, double:4.067086373377802E-152)
            r0 = r81
            boolean r0 = X.182.A06(r3, r0, r1)     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x07a1
            X.05G r4 = r12.A0L     // Catch:{ all -> 0x07a3 }
        L_0x0788:
            java.lang.Object r3 = r4.getValue()     // Catch:{ all -> 0x07a3 }
            if (r82 == 0) goto L_0x079e
            r2 = 3
            java.lang.String r1 = "location"
            r0 = r17
            java.lang.String r0 = r0.getOptionalStringField(r2, r1)     // Catch:{ all -> 0x07a3 }
        L_0x0797:
            boolean r0 = r4.AIY(r3, r0)     // Catch:{ all -> 0x07a3 }
            if (r0 == 0) goto L_0x0788
            goto L_0x07a1
        L_0x079e:
            r0 = r21
            goto L_0x0797
        L_0x07a1:
            monitor-exit(r12)
            return
        L_0x07a3:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapRepository.A04(com.instagram.friendmap.data.FriendMapRepository, X.Bm7, java.lang.Double, java.lang.Double, X.0sP, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: X.4A6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: X.0rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: X.0rm} */
    /* JADX WARNING: type inference failed for: r8v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c2, code lost:
        if (r25 != null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01bd, code lost:
        if (r5.emit(r4, r8) == r7) goto L_0x01bf;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.AnonymousClass4A5 r38, X.AnonymousClass4D7 r39) {
        /*
            r37 = this;
            r3 = 22
            r4 = r39
            boolean r0 = X.ME0.A02(r3, r4)
            r5 = r37
            if (r0 == 0) goto L_0x01c0
            r8 = r4
            X.ME0 r8 = (X.ME0) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01c0
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x001a:
            java.lang.Object r0 = r8.A05
            X.1Hj r7 = X.1Hj.A02
            int r1 = r8.A00
            r3 = 2
            r9 = 1
            if (r1 == 0) goto L_0x0128
            if (r1 == r9) goto L_0x0193
            if (r1 != r3) goto L_0x01c7
            java.lang.Object r2 = r8.A03
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r6 = r8.A02
            java.lang.Object r1 = r8.A01
            com.instagram.friendmap.data.FriendMapRepository r1 = (com.instagram.friendmap.data.FriendMapRepository) r1
            X.0eS.A00(r0)
        L_0x0035:
            r2.A00 = r6
        L_0x0037:
            java.lang.Object r4 = r2.A00
            X.4A6 r4 = (X.AnonymousClass4A6) r4
            java.util.List r0 = r4.A06
            int r0 = r0.size()
            if (r0 <= r3) goto L_0x0045
            r1.A02 = r4
        L_0x0045:
            X.05G r5 = r1.A0I
        L_0x0047:
            java.lang.Object r6 = r5.getValue()
            java.lang.Object r4 = r2.A00
            X.4A6 r4 = (X.AnonymousClass4A6) r4
            X.4A5 r8 = r4.A04
            long r14 = r4.A03
            r0 = 0
            int r11 = r4.A00
            int r12 = r4.A01
            java.util.List r9 = r4.A06
            int r13 = r4.A02
            java.util.List r10 = r4.A05
            X.0qQ.A0B(r8, r0)
            r4 = 5
            X.0qQ.A0B(r9, r4)
            r4 = 7
            X.0qQ.A0B(r10, r4)
            X.4A6 r7 = new X.4A6
            r16 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r16)
            boolean r4 = r5.AIY(r6, r7)
            if (r4 == 0) goto L_0x0047
            X.05G r13 = r1.A0H
        L_0x0078:
            java.lang.Object r12 = r13.getValue()
            r5 = r12
            java.util.List r5 = (java.util.List) r5
            r4 = 10
            int r4 = X.0Yv.A1E(r5, r4)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r4)
            java.util.Iterator r16 = r5.iterator()
        L_0x008e:
            boolean r4 = r16.hasNext()
            if (r4 == 0) goto L_0x011f
            java.lang.Object r6 = r16.next()
            X.N3Q r6 = (X.N3Q) r6
            com.instagram.user.model.User r4 = r6.A04
            r36 = r4
            java.lang.String r5 = r36.getId()
            com.instagram.common.session.UserSession r4 = r1.A06
            java.lang.String r4 = r4.A06
            boolean r4 = X.0qQ.A0K(r5, r4)
            if (r4 == 0) goto L_0x011a
            X.4AB r10 = r6.A03
            if (r10 != 0) goto L_0x011a
            com.facebook.android.maps.model.LatLng r9 = r6.A02
            java.lang.String r25 = A02(r9, r1)
            java.lang.Object r4 = r2.A00
            X.4A6 r4 = (X.AnonymousClass4A6) r4
            X.4A5 r5 = r4.A04
            X.4A5 r4 = X.AnonymousClass4A5.PRIVATE
            if (r5 == r4) goto L_0x00c4
            r30 = 0
            if (r25 == 0) goto L_0x00c6
        L_0x00c4:
            r30 = 1
        L_0x00c6:
            java.lang.String r8 = r6.A09
            java.lang.String r4 = r6.A08
            r23 = r4
            long r4 = r6.A01
            boolean r7 = r6.A0D
            r22 = r7
            boolean r7 = r6.A0F
            r21 = r7
            boolean r7 = r6.A0A
            r20 = r7
            boolean r7 = r6.A0C
            r19 = r7
            int r7 = r6.A00
            r18 = r7
            java.lang.String r7 = r6.A07
            r17 = r7
            boolean r15 = r6.A0B
            boolean r14 = r6.A0G
            java.lang.Integer r7 = r6.A05
            X.0qQ.A0B(r8, r0)
            X.0qQ.A0B(r9, r3)
            r6 = 16
            X.0qQ.A0B(r7, r6)
            X.N3Q r6 = new X.N3Q
            r24 = r17
            r26 = r18
            r27 = r4
            r29 = r22
            r31 = r21
            r32 = r20
            r33 = r19
            r34 = r15
            r35 = r14
            r17 = r6
            r18 = r9
            r19 = r10
            r20 = r36
            r21 = r7
            r22 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35)
        L_0x011a:
            r11.add(r6)
            goto L_0x008e
        L_0x011f:
            boolean r4 = r13.AIY(r12, r11)
            if (r4 == 0) goto L_0x0078
            X.0gF r7 = X.C60340gF.A00
            return r7
        L_0x0128:
            X.0eS.A00(r0)
            X.05G r10 = r5.A0I
            java.lang.Object r6 = r10.getValue()
            X.4A6 r6 = (X.AnonymousClass4A6) r6
        L_0x0133:
            java.lang.Object r13 = r10.getValue()
            long r1 = r6.A03
            int r0 = r6.A00
            r16 = r0
            int r14 = r6.A01
            java.util.List r12 = r6.A06
            int r11 = r6.A02
            java.util.List r4 = r6.A05
            r15 = 0
            r17 = r38
            r0 = r17
            X.0qQ.A0B(r0, r15)
            r0 = 5
            X.0qQ.A0B(r12, r0)
            r0 = 7
            X.0qQ.A0B(r4, r0)
            X.4A6 r15 = new X.4A6
            r24 = r9
            r22 = r1
            r20 = r14
            r21 = r11
            r18 = r4
            r19 = r16
            r16 = r17
            r17 = r12
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r24)
            boolean r0 = r10.AIY(r13, r15)
            if (r0 == 0) goto L_0x0133
            X.0rm r4 = new X.0rm
            r4.<init>()
            X.4A4 r0 = r5.A09
            java.lang.Object r2 = r10.getValue()
            X.4A6 r2 = (X.AnonymousClass4A6) r2
            r8.A01 = r5
            r8.A02 = r6
            r8.A03 = r4
            r8.A04 = r4
            r8.A00 = r9
            r1 = 0
            com.instagram.friendmap.data.FriendMapGraphQLImpl r0 = r0.A00
            java.lang.Object r0 = r0.A02(r2, r8, r1)
            if (r0 == r7) goto L_0x01bf
            r1 = r5
            r2 = r4
            goto L_0x01a4
        L_0x0193:
            java.lang.Object r4 = r8.A04
            X.0rm r4 = (X.0rm) r4
            java.lang.Object r2 = r8.A03
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r6 = r8.A02
            java.lang.Object r1 = r8.A01
            com.instagram.friendmap.data.FriendMapRepository r1 = (com.instagram.friendmap.data.FriendMapRepository) r1
            X.0eS.A00(r0)
        L_0x01a4:
            r4.A00 = r0
            java.lang.Object r0 = r2.A00
            if (r0 != 0) goto L_0x0037
            X.0V2 r5 = r1.A0G
            X.NjD r4 = X.C69312NjD.UPDATE_AUDIENCE
            r8.A01 = r1
            r8.A02 = r6
            r8.A03 = r2
            r0 = 0
            r8.A04 = r0
            r8.A00 = r3
            java.lang.Object r0 = r5.emit(r4, r8)
            if (r0 != r7) goto L_0x0035
        L_0x01bf:
            return r7
        L_0x01c0:
            X.ME0 r8 = new X.ME0
            r8.<init>(r5, r4, r3)
            goto L_0x001a
        L_0x01c7:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapRepository.A05(X.4A5, X.4D7):java.lang.Object");
    }

    public final boolean A0B(long j) {
        Object obj;
        Iterator it = ((Iterable) this.A0H.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((N3Q) obj).A08, String.valueOf(j))) {
                break;
            }
        }
        N3Q n3q = (N3Q) obj;
        if (n3q == null || !n3q.A0C) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FriendMapRepository(UserSession userSession, NotesApi notesApi, AnonymousClass4A4 r17, 17i r18) {
        super("FriendMap", AnonymousClass43D.A01(846242580, 3));
        NotesRepository A002 = AnonymousClass43C.A00(userSession);
        17i r4 = r18;
        0qQ.A0B(r4, 2);
        0qQ.A0B(userSession, 3);
        0qQ.A0B(A002, 5);
        this.A09 = r17;
        this.A0B = r4;
        this.A06 = userSession;
        this.A07 = notesApi;
        this.A08 = A002;
        AnonymousClass4A5 r5 = AnonymousClass4A5.UNSET;
        List list = 0sn.A00;
        02z r2 = new 02z(new AnonymousClass4A6(r5, list, list, 0, 0, 0, 0, false));
        this.A0I = r2;
        this.A0N = 10b.A03(r2);
        02z A012 = 106.A01(list);
        this.A0H = A012;
        this.A0M = 10b.A03(A012);
        Integer num = AnonymousClass05K.A00;
        05D A013 = 10D.A01(num, 0, 0);
        this.A0G = A013;
        this.A0D = new AnonymousClass0qC(A013);
        02z A014 = 106.A01((Object) null);
        this.A0L = A014;
        this.A0E = AnonymousClass10H.A00(new FriendMapRepository$friendMapNotesEntryPointFlow$1(this, (AnonymousClass4D7) null), A012, r2, A014);
        02z r1 = new 02z(false);
        this.A0J = r1;
        this.A0F = AnonymousClass10H.A00(new FriendMapRepository$friendMapUiReadyFlow$1((AnonymousClass4D7) null), A012, r2, r1);
        int A015 = (int) 182.A01(0Tu.A05, userSession, 36603244604232593L);
        Integer valueOf = Integer.valueOf(A015);
        this.A0C = (!AnonymousClass3HF.A04(userSession) || A015 <= 0) ? null : valueOf;
        this.A0K = 106.A01((Object) null);
        if (AnonymousClass3HF.A04(userSession)) {
            1Eo.A03(num, 19B.A00, new MG8(this, (AnonymousClass4D7) null, 14), this.A01);
        }
    }

    public final void A08(Double d, Double d2, 0sP r14, boolean z, boolean z2) {
        long currentTimeMillis = System.currentTimeMillis() - this.A05;
        if (!AnonymousClass3HF.A05(this.A06, false)) {
            return;
        }
        if (z || currentTimeMillis > 120000) {
            C262224Cq r2 = this.A01;
            AnonymousClass9KR r4 = new AnonymousClass9KR(this, d, d2, (AnonymousClass4D7) null, r14, z2);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r4, r2);
            this.A05 = System.currentTimeMillis();
        }
    }
}
