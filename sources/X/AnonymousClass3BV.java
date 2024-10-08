package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.reels.store.ReelStore;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.3BV  reason: invalid class name */
public final class AnonymousClass3BV implements AnonymousClass0lh {
    public C279314yR A00;
    public boolean A01;
    public final Context A02;
    public final UserSession A03;
    public final Set A04 = new CopyOnWriteArraySet();
    public final Set A05 = new HashSet();
    public final Comparator A06 = new AnonymousClass3BX(this);

    public static boolean A05(String str, String str2, String str3) {
        String str4 = str;
        try {
            16d.A06.E1h(str);
            return true;
        } catch (Exception e) {
            0KC.A0F("ReelMediaPreloader", "invalid uri", e);
            0wb.A06("ReelMediaPreloader#invalidUri", 002.A13("uri: ", str4, " mediaId: ", str2, " reelId: ", str3), e);
            return false;
        }
    }

    public final void A07(AnonymousClass3BU r13, C2813857k r14, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            List list2 = list;
            if (i < list2.size()) {
                arrayList.add(new AnonymousClass3PJ(r13, (String) list2.get(i), 0, -1, -1));
                i++;
            } else {
                A0B(r14, str, str2, arrayList, false);
                return;
            }
        }
    }

    public final void A0B(C2813857k r11, String str, String str2, List list, boolean z) {
        if (!this.A01) {
            List list2 = list;
            C2813857k r4 = r11;
            if (!list.isEmpty()) {
                String str3 = str;
                String str4 = str2;
                boolean z2 = z;
                if (182.A06(0Tu.A05, 1NM.A00(this.A03).A00, 36317517607998696L)) {
                    0nY.A00().ATE(new C15878Uk2(r4, this, str3, str4, list2, z2));
                } else {
                    A03(r4, this, str3, str4, list2, z2);
                }
            } else if (r11 != null) {
                r11.onFinish();
            }
        }
    }

    public final void A0C(String str, String str2, List list) {
        A0B((C2813857k) null, str, str2, list, false);
    }

    public static AnonymousClass3BV A00(UserSession userSession) {
        return (AnonymousClass3BV) userSession.A01(AnonymousClass3BV.class, new AnonymousClass3BW(userSession));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (X.AnonymousClass3PL.A00(r1, r15, false) == false) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00c5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.instagram.model.reels.Reel r30, X.AnonymousClass3PK r31, X.AnonymousClass3PJ r32, X.AnonymousClass3BV r33, java.lang.String r34, boolean r35) {
        /*
            r3 = r33
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0209
            r7 = 1
            r15 = r34
            if (r35 != 0) goto L_0x001b
            com.instagram.common.session.UserSession r1 = r3.A03
            r0 = 0
            X.0qQ.A0B(r15, r0)
            X.0qQ.A0B(r1, r7)
            boolean r0 = X.AnonymousClass3PL.A00(r1, r15, r0)
            r2 = 1
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            com.instagram.common.session.UserSession r6 = r3.A03
            X.0Tu r5 = X.0Tu.A05
            r0 = 36317483246294197(0x81068f000814b5, double:3.0306608714989874E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x0092
            if (r2 == 0) goto L_0x0090
            java.lang.String r0 = "reel_prefetch"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x0090
        L_0x0035:
            r4 = r30
            java.lang.String r28 = r4.getId()
            X.1Ns r0 = r4.A0W
            if (r0 == 0) goto L_0x0042
            r0.getName()
        L_0x0042:
            java.util.LinkedHashMap r21 = new java.util.LinkedHashMap
            r21.<init>()
            java.util.HashSet r20 = new java.util.HashSet
            r20.<init>()
            java.util.LinkedHashMap r19 = new java.util.LinkedHashMap
            r19.<init>()
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.HashSet r18 = new java.util.HashSet
            r18.<init>()
            java.util.LinkedHashMap r17 = new java.util.LinkedHashMap
            r17.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r1 = r32
            int r8 = r1.A02
            r0 = -1
            if (r8 != r0) goto L_0x0075
            int r8 = r4.A03(r6)
        L_0x0075:
            int r1 = r1.A01
            int r1 = r1 + r8
            java.util.List r0 = r4.A0O(r6)
            int r0 = r0.size()
            int r1 = java.lang.Math.min(r1, r0)
        L_0x0084:
            if (r8 >= r1) goto L_0x0094
            X.3uh r0 = r4.A0A(r6, r8)
            r9.add(r0)
            int r8 = r8 + 1
            goto L_0x0084
        L_0x0090:
            r7 = 0
            goto L_0x0035
        L_0x0092:
            r7 = r2
            goto L_0x0035
        L_0x0094:
            java.lang.String r8 = r4.getId()
            X.1NN r0 = X.1NM.A00(r6)
            com.instagram.common.session.UserSession r10 = r0.A00
            r0 = 36317517608916212(0x810697003414f4, double:3.030682602559517E-306)
            boolean r0 = X.182.A06(r5, r10, r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00b1
            boolean r0 = r4.A0i()
            if (r0 == 0) goto L_0x00c1
        L_0x00b1:
            com.instagram.common.typedurl.ImageUrl r1 = r4.A07()
            java.lang.String r0 = "-cover"
            java.lang.String r0 = X.002.A0R(r8, r0)
            r2.put(r0, r1)
            r11.add(r1)
        L_0x00c1:
            java.util.Iterator r16 = r9.iterator()
        L_0x00c5:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01a8
            java.lang.Object r10 = r16.next()
            X.3uh r10 = (X.C255773uh) r10
            java.lang.String r9 = r10.A0j
            boolean r0 = r10.CWu()
            if (r0 != 0) goto L_0x00df
            X.3mL r1 = r10.A0e
            X.3mL r0 = X.C250963mL.NETEGO_BAKEOFF
            if (r1 != r0) goto L_0x00c5
        L_0x00df:
            X.1Xj r1 = r10.A0b
            r1.getClass()
            r0 = r21
            r0.put(r9, r10)
            android.content.Context r0 = r3.A02
            com.instagram.model.mediasize.ExtendedImageUrl r12 = r1.A1n(r0)
            if (r12 == 0) goto L_0x00ff
            java.lang.String r0 = r12.A0A
            boolean r0 = A05(r0, r9, r8)
            if (r0 == 0) goto L_0x00ff
            r11.add(r12)
            r2.put(r9, r12)
        L_0x00ff:
            boolean r0 = r1.CeS()
            if (r0 == 0) goto L_0x0165
            boolean r0 = r1.A4p()
            if (r0 != 0) goto L_0x0165
            X.3WR r1 = r1.A2D()
            java.lang.String r12 = r1.A02()
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x015d
            boolean r0 = A05(r12, r9, r8)
            if (r0 == 0) goto L_0x015d
        L_0x011f:
            r0 = r20
            r0.add(r1)
            r0 = r19
            r0.put(r9, r1)
        L_0x0129:
            java.lang.String r0 = r10.A0Q()
            if (r0 == 0) goto L_0x00c5
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 36323689474174349(0x810c34000a2d8d, double:3.034585715000869E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x00c5
            r0 = 36323689473518983(0x810c3400002d87, double:3.034585714586413E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x00c5
            java.lang.String r1 = r10.A0Q()
            r0 = r18
            r0.add(r1)
            java.lang.String r1 = r10.A0Q()
            r0 = r17
            r0.put(r9, r1)
            goto L_0x00c5
        L_0x015d:
            java.lang.String r1 = "ReelMediaPreloader"
            java.lang.String r0 = "Received invalid video url"
            X.0wb.A03(r1, r0)
            goto L_0x0129
        L_0x0165:
            X.XB5 r0 = X.C271584jF.A00(r6, r10)
            if (r0 == 0) goto L_0x0129
            com.instagram.music.common.model.MusicDataSource r1 = X.C271584jF.A01(r0)
            java.lang.Integer r12 = X.AnonymousClass05K.A15
            java.lang.String r0 = X.C271584jF.A02(r6, r1)
            X.4im r14 = new X.4im
            r14.<init>(r12, r0)
            java.lang.String r13 = r1.A04
            r14.A08 = r13
            java.lang.String r12 = r1.A05
            r14.A0B = r12
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14.A07 = r0
            r0 = -1
            r14.A02 = r0
            if (r13 == 0) goto L_0x0195
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x019d
        L_0x0195:
            if (r12 == 0) goto L_0x01a6
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x01a6
        L_0x019d:
            r0 = 1
        L_0x019e:
            r14.A0I = r0
            X.3WR r1 = r14.A00()
            goto L_0x011f
        L_0x01a6:
            r0 = 0
            goto L_0x019e
        L_0x01a8:
            r24 = r31
            r26 = r24
            r27 = r3
            r29 = r20
            r30 = r11
            r31 = r18
            boolean r0 = A04(r26, r27, r28, r29, r30, r31)
            if (r0 != 0) goto L_0x0209
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r7)
            X.1NN r0 = X.1NM.A00(r6)
            com.instagram.common.session.UserSession r6 = r0.A00
            r0 = 36317517607998696(0x810697002614e8, double:3.030682601979276E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x01f2
            boolean r0 = X.11Z.A07()
            if (r0 != 0) goto L_0x01f2
            X.Wpx r22 = new X.Wpx
            r27 = r15
            r29 = r21
            r30 = r19
            r31 = r2
            r32 = r17
            r33 = r20
            r34 = r11
            r35 = r18
            r23 = r4
            r25 = r3
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.11Z.A02(r22)
            return
        L_0x01f2:
            r27 = r15
            r29 = r21
            r30 = r19
            r31 = r2
            r32 = r17
            r33 = r20
            r34 = r11
            r35 = r18
            r23 = r4
            r25 = r3
            A02(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
        L_0x0209:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3BV.A01(com.instagram.model.reels.Reel, X.3PK, X.3PJ, X.3BV, java.lang.String, boolean):void");
    }

    public static void A03(C2813857k r18, AnonymousClass3BV r19, String str, String str2, List list, boolean z) {
        String str3;
        boolean z2;
        AnonymousClass3PP A002;
        C279314yR r12;
        AnonymousClass3BV r122 = r19;
        List list2 = list;
        Collections.sort(list2, r122.A06);
        AnonymousClass3PK r10 = new AnonymousClass3PK(r18, list2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = new ArrayList(r10.A03.values()).iterator();
        while (true) {
            str3 = str;
            z2 = z;
            if (!it.hasNext()) {
                break;
            }
            AnonymousClass3PJ r11 = (AnonymousClass3PJ) it.next();
            UserSession userSession = r122.A03;
            Reel A0M = ReelStore.A03(userSession).A0M(r11.A04);
            if (A0M == null || !A0M.A0z(userSession)) {
                linkedHashSet.add(r11);
            } else {
                A01(A0M, r10, r11, r122, str3, z2);
            }
        }
        UserSession userSession2 = r122.A03;
        0qQ.A0B(str3, 0);
        0qQ.A0B(userSession2, 1);
        if (AnonymousClass3PL.A00(userSession2, str3, false)) {
            1wY.A00(userSession2).A0B.ExO(AnonymousClass05K.A00);
        }
        if (!linkedHashSet.isEmpty()) {
            LinkedHashSet<AnonymousClass3PJ> linkedHashSet2 = new LinkedHashSet<>(linkedHashSet);
            if (!r122.A01 && !linkedHashSet2.isEmpty()) {
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                AnonymousClass3BU r112 = ((AnonymousClass3PJ) linkedHashSet2.iterator().next()).A03;
                for (AnonymousClass3PJ r0 : linkedHashSet2) {
                    linkedHashSet3.add(r0.A04);
                }
                0mp.A05(",", linkedHashSet3);
                for (AnonymousClass3PJ r7 : linkedHashSet2) {
                    AnonymousClass3PM r15 = new AnonymousClass3PM(r10, r7, r122, str3, z2);
                    Set<Reference> set = r122.A04;
                    for (Reference reference : set) {
                        C311566ct r1 = (C311566ct) reference.get();
                        if (r1 == null) {
                            set.remove(reference);
                        } else {
                            r1.DMi(r7.A04);
                        }
                    }
                    r122.A05.add(r15);
                    AnonymousClass3PO.A00(userSession2).A05(r15, r7.A04, (String) null, false);
                }
                HashMap hashMap = new HashMap();
                String str4 = str2;
                if (str2 != null) {
                    hashMap.put(AnonymousClass000.A00(1767), str4);
                }
                if (AnonymousClass3PL.A00(userSession2, str3, false)) {
                    if (r122.A00 == null) {
                        r122.A00 = new C279304yQ(r122);
                    }
                    A002 = AnonymousClass3PO.A00(userSession2);
                    r12 = r122.A00;
                } else {
                    A002 = AnonymousClass3PO.A00(userSession2);
                    r12 = null;
                }
                A002.A01(r112, r12, str3, hashMap, linkedHashSet3);
            }
            linkedHashSet.clear();
        }
    }

    public static boolean A04(AnonymousClass3PK r2, AnonymousClass3BV r3, String str, Set set, Set set2, Set set3) {
        if (!r3.A01) {
            if (!set.isEmpty() || !set2.isEmpty() || !set3.isEmpty()) {
                return false;
            }
            r2.A00(str);
        }
        return true;
    }

    public final AnonymousClass4FT A06(Reel reel, String str, int i) {
        ImageUrl imageUrl;
        AnonymousClass3WR r12;
        AnonymousClass1MK r14;
        C308836Vu r2;
        C226952iF r0;
        WeakReference weakReference;
        boolean z;
        String str2;
        Reel reel2 = reel;
        Integer num = reel2.A0e;
        UserSession userSession = this.A03;
        int size = reel2.A0O(userSession).size();
        String str3 = str;
        int i2 = i;
        if (num != null && size < num.intValue()) {
            C14186TrQ trQ = new C14186TrQ(reel2, this, str3, size, i2);
            this.A05.add(trQ);
            AnonymousClass3PO.A00(userSession).A05(trQ, reel2.getId(), (String) null, false);
        }
        String id = reel2.getId();
        int A032 = reel2.A03(userSession);
        int size2 = reel2.A0O(userSession).size();
        int i3 = size2 - A032;
        if (i3 < 0) {
            i3 = 0;
        }
        ArrayList arrayList = new ArrayList(i3);
        while (A032 < size2) {
            C255773uh A0A = reel2.A0A(userSession, A032);
            String str4 = A0A.A0j;
            1Xj r22 = A0A.A0b;
            if (r22 != null) {
                imageUrl = r22.A1n(this.A02);
                if (imageUrl == null || !A05(imageUrl.A0A, r22.getId(), id)) {
                    imageUrl = null;
                }
                if (!r22.CeS() || r22.A4p()) {
                    XB5 A002 = C271584jF.A00(userSession, A0A);
                    if (A002 != null) {
                        MusicDataSource A012 = C271584jF.A01(A002);
                        C271394im r23 = new C271394im(AnonymousClass05K.A15, C271584jF.A02(userSession, A012));
                        String str5 = A012.A04;
                        r23.A08 = str5;
                        r23.A0B = A012.A05;
                        r23.A07 = 1;
                        r23.A02 = -1;
                        if ((str5 == null || str5.isEmpty()) && ((str2 = A012.A05) == null || str2.isEmpty())) {
                            z = false;
                        } else {
                            z = true;
                        }
                        r23.A0I = z;
                        r12 = r23.A00();
                    }
                    r12 = null;
                } else {
                    r12 = r22.A2D();
                    String A022 = r12.A02();
                    if (A022.isEmpty() || !A05(A022, r22.getId(), id)) {
                        r12 = null;
                    }
                }
            } else {
                imageUrl = null;
                r12 = null;
            }
            if (!A0A.A1m()) {
                r14 = new C308826Vt(this, id, str4);
            } else {
                r14 = C242663Vj.A00;
            }
            if (r12 != null) {
                r2 = new C308836Vu(this, id, str4);
            } else {
                r2 = null;
            }
            A0A.A02();
            if (imageUrl != null) {
                boolean z2 = false;
                if (r12 != null) {
                    z2 = true;
                }
                1OO A0J = 1NK.A00().A0J(imageUrl, str3);
                A0J.A0I = true;
                A0J.A05 = userSession;
                A0J.A0L = false;
                A0J.A0K = z2;
                1wY.A00(userSession);
                A0J.A02(r14);
                if (!TextUtils.isEmpty((CharSequence) null)) {
                    A0J.A09 = null;
                }
                r0 = A0J.A00();
            } else {
                r0 = null;
            }
            C242693Vo r11 = new C242693Vo(r0, r12, str4);
            A0A.A01 = i2;
            1yX r1 = new 1yX(r11, A0A);
            if (r2 != null) {
                weakReference = new WeakReference(r2);
            } else {
                weakReference = null;
            }
            r1.A00 = weakReference;
            arrayList.add(r1);
            A032++;
        }
        return new AnonymousClass4FT(arrayList, i2, 1);
    }

    public final void A08(AnonymousClass3BU r11, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel reel = (Reel) it.next();
            int i = reel.A02;
            if (i > 0) {
                arrayList.add(new AnonymousClass3PJ(r11, reel.getId(), i, -1, -1));
            }
        }
        A0B((C2813857k) null, "reel_feed_timeline", (String) null, arrayList, true);
    }

    public final void A09(C311566ct r5) {
        Set<Reference> set = this.A04;
        for (Reference reference : set) {
            Object obj = reference.get();
            if (obj == null) {
                set.remove(reference);
            } else if (obj == r5) {
                return;
            }
        }
        set.add(new WeakReference(r5));
    }

    public final void A0A(C311566ct r5) {
        Set<Reference> set = this.A04;
        for (Reference reference : set) {
            Object obj = reference.get();
            if (obj == null) {
                set.remove(reference);
            } else if (obj == r5) {
                set.remove(reference);
                return;
            }
        }
    }

    public final void onSessionWillEnd() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass3PP A002 = AnonymousClass3PO.A00(this.A03);
            Set<AnonymousClass3PN> set = this.A05;
            0qQ.A0B(set, 0);
            for (AnonymousClass3PN A032 : set) {
                A002.A03(A032);
            }
            set.clear();
            this.A04.clear();
        }
    }

    public AnonymousClass3BV(UserSession userSession) {
        this.A03 = userSession;
        this.A02 = userSession.A03.A06();
        userSession.A04(AnonymousClass3BV.class, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0061, code lost:
        if (((X.C255773uh) r6.get(r13)).A1m() == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f9, code lost:
        if (r5.A1m() != false) goto L_0x00fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(com.instagram.model.reels.Reel r17, X.AnonymousClass3PK r18, X.AnonymousClass3BV r19, java.lang.Boolean r20, java.lang.String r21, java.lang.String r22, java.util.Map r23, java.util.Map r24, java.util.Map r25, java.util.Map r26, java.util.Set r27, java.util.Set r28, java.util.Set r29) {
        /*
            boolean r0 = r20.booleanValue()
            r10 = r19
            r2 = r21
            if (r0 == 0) goto L_0x0023
            com.instagram.common.session.UserSession r1 = r10.A03
            r0 = 0
            r3 = r17
            X.3uh r0 = r3.A0B(r1, r0)
            if (r0 == 0) goto L_0x0022
            X.1y3 r1 = X.1y1.A00(r1)
            int r0 = r0.A01
            X.4FT r0 = r10.A06(r3, r2, r0)
            r1.A03(r0, r2)
        L_0x0022:
            return
        L_0x0023:
            java.util.Set r0 = r24.entrySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x002b:
            boolean r0 = r7.hasNext()
            r9 = r18
            r12 = r22
            r6 = r23
            r14 = r27
            r15 = r28
            r3 = r29
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r13 = r0.getKey()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r11 = r0.getValue()
            X.3WR r11 = (X.AnonymousClass3WR) r11
            boolean r0 = r6.containsKey(r13)
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = r6.get(r13)
            X.3uh r0 = (X.C255773uh) r0
            boolean r0 = r0.A1m()
            r17 = 1
            if (r0 != 0) goto L_0x0065
        L_0x0063:
            r17 = 0
        L_0x0065:
            X.3vO r4 = new X.3vO
            r4.<init>(r11, r2)
            X.3vP r8 = new X.3vP
            r16 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.instagram.common.session.UserSession r3 = r10.A03
            X.0Tu r6 = X.0Tu.A05
            r0 = 36594113499366981(0x82022700000645, double:3.205602957442837E-306)
            long r0 = X.182.A01(r6, r3, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r5 = r0.intValue()
            r0 = 36606388516427177(0x820d51000815a9, double:3.213365727659231E-306)
            long r0 = X.182.A01(r6, r3, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r1 = r0.intValue()
            if (r5 <= 0) goto L_0x009d
            int r0 = r5 * 1024
            r4.A02 = r0
        L_0x009d:
            r4.A01(r8, r1)
            X.3uP r0 = X.C255593uO.A00(r3)
            r0.A01(r4)
            if (r17 == 0) goto L_0x002b
            java.util.Set r4 = r10.A04
            java.util.Iterator r3 = r4.iterator()
        L_0x00af:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r3.next()
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            java.lang.Object r0 = r1.get()
            X.6ct r0 = (X.C311566ct) r0
            if (r0 != 0) goto L_0x00c7
            r4.remove(r1)
            goto L_0x00af
        L_0x00c7:
            r0.DQo(r12, r13)
            goto L_0x00af
        L_0x00cb:
            java.util.Set r0 = r25.entrySet()
            java.util.Iterator r8 = r0.iterator()
        L_0x00d3:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x014c
            java.lang.Object r0 = r8.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r7 = r0.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r1 = r0.getValue()
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            java.lang.Object r5 = r6.get(r7)
            X.3uh r5 = (X.C255773uh) r5
            if (r5 == 0) goto L_0x00fb
            boolean r0 = r5.A1m()
            r25 = 1
            if (r0 == 0) goto L_0x00fd
        L_0x00fb:
            r25 = 0
        L_0x00fd:
            X.3vu r4 = new X.3vu
            r16 = r4
            r17 = r1
            r20 = r12
            r21 = r7
            r22 = r15
            r23 = r14
            r24 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            if (r1 == 0) goto L_0x0128
            X.1NK r0 = X.1NK.A00()
            X.1OO r1 = r0.A0J(r1, r2)
            r0 = 1
            r1.A0I = r0
            r1.A02(r4)
            if (r5 == 0) goto L_0x0125
            r5.A02()
        L_0x0125:
            r1.A01()
        L_0x0128:
            if (r25 == 0) goto L_0x00d3
            java.util.Set r5 = r10.A04
            java.util.Iterator r4 = r5.iterator()
        L_0x0130:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r1 = r4.next()
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            java.lang.Object r0 = r1.get()
            X.6ct r0 = (X.C311566ct) r0
            if (r0 != 0) goto L_0x0148
            r5.remove(r1)
            goto L_0x0130
        L_0x0148:
            r0.DQo(r12, r7)
            goto L_0x0130
        L_0x014c:
            java.util.Set r0 = r26.entrySet()
            java.util.Iterator r6 = r0.iterator()
        L_0x0154:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r5 = r6.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            com.instagram.common.session.UserSession r4 = r10.A03
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323689474174349(0x810c34000a2d8d, double:3.034585715000869E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0154
            r0 = 36323689473518983(0x810c3400002d87, double:3.034585714586413E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0154
            java.lang.Object r2 = r5.getValue()
            java.lang.String r2 = (java.lang.String) r2
            X.MM2 r1 = X.MM2.A00
            java.lang.Class<com.instagram.xme.threed.repository.Xme3dMediaRepository> r0 = com.instagram.xme.threed.repository.Xme3dMediaRepository.class
            java.lang.Object r1 = r4.A01(r0, r1)
            com.instagram.xme.threed.repository.Xme3dMediaRepository r1 = (com.instagram.xme.threed.repository.Xme3dMediaRepository) r1
            X.6WO r0 = X.AnonymousClass6WO.STORIES
            r1.A01(r2, r4, r0)
            r3.remove(r2)
            goto L_0x0154
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3BV.A02(com.instagram.model.reels.Reel, X.3PK, X.3BV, java.lang.Boolean, java.lang.String, java.lang.String, java.util.Map, java.util.Map, java.util.Map, java.util.Map, java.util.Set, java.util.Set, java.util.Set):void");
    }
}
