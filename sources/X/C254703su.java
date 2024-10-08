package X;

import android.text.TextUtils;
import com.facebook.systrace.Systrace;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import com.instagram.direct.model.DirectAREffectShare;
import com.instagram.direct.model.comments.DirectMessageComments;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3su  reason: invalid class name and case insensitive filesystem */
public class C254703su implements C254713sv {
    public int A00 = 0;
    public int A01 = 0;
    @Deprecated
    public int A02 = 0;
    @Deprecated
    public long A03;
    public AnonymousClass9I4 A04;
    public C376459Ib A05;
    public C376649Iu A06;
    public C376649Iu A07;
    public AnonymousClass9J6 A08;
    public AnonymousClass9JH A09;
    public AnonymousClass9JI A0A;
    @Deprecated
    public C61078JwG A0B;
    public C61072JwA A0C;
    public N4L A0D;
    public C61081JwJ A0E;
    public N4Q A0F;
    public N4D A0G;
    public ImmutableList A0H;
    public C317876nz A0I;
    public C39798A9t A0J;
    public O7Y A0K;
    public C328337Ek A0L;
    public BB8 A0M;
    public C2606546n A0N;
    public C10488Rt3 A0O;
    public DirectAREffectShare A0P;
    public AnonymousClass7AG A0Q;
    public C45279Cti A0R;
    public AnonymousClass77X A0S;
    public OG7 A0T;
    public C45425Cw5 A0U;
    public AnonymousClass5FY A0V;
    public C300625xW A0W;
    public C2607046s A0X;
    public OW8 A0Y;
    public AnonymousClass7FN A0Z;
    public C254933tI A0a;
    public AnonymousClass7FJ A0b;
    public AnonymousClass55L A0c;
    public C271374ik A0d;
    public C271374ik A0e;
    @Deprecated
    public C282485Dg A0f;
    public C2609947v A0g;
    public C44681Ciz A0h;
    public C254873tC A0i;
    public C254873tC A0j;
    public C282225Cg A0k;
    public UVA A0l;
    public C254723sw A0m = new C254723sw();
    public C2814857z A0n;
    public N3J A0o;
    public C70820OMp A0p;
    public DirectMessageComments A0q;
    public C270214gN A0r;
    public 1Xj A0s;
    public 1Xj A0t;
    @Deprecated
    public 1Xj A0u;
    public C300925yB A0v;
    public C331377Qt A0w;
    public C254763t0 A0x;
    public DirectThreadKey A0y;
    public 2FW A0z;
    public 2FW A10;
    public DirectAnimatedMedia A11;
    public AnonymousClass53G A12;
    public DirectMessageIdentifier A13 = null;
    public DirectStoreSticker A14;
    public DirectStoreStickerResponseItem A15;
    public ExtendedImageUrl A16;
    @Deprecated
    public User A17;
    public Boolean A18;
    public Boolean A19;
    public Boolean A1A;
    public Boolean A1B;
    public Boolean A1C = false;
    public Integer A1D;
    public Integer A1E;
    public Integer A1F = AnonymousClass05K.A00;
    public Integer A1G;
    public Integer A1H = null;
    @Deprecated
    public Integer A1I;
    public Long A1J;
    public Long A1K;
    public Long A1L;
    public Long A1M;
    public Long A1N;
    public Long A1O;
    public Long A1P;
    public Long A1Q;
    public Long A1R;
    public Long A1S;
    public Object A1T;
    public Object A1U;
    public String A1V;
    public String A1W;
    public String A1X;
    public String A1Y;
    public String A1Z;
    public String A1a;
    public String A1b;
    public String A1c;
    public String A1d;
    public String A1e;
    public String A1f;
    public String A1g;
    public String A1h;
    public String A1i;
    public String A1j = null;
    public String A1k;
    public String A1l;
    public String A1m;
    public String A1n;
    public String A1o;
    public String A1p;
    public String A1q;
    public String A1r = "";
    public String A1s;
    public String A1t;
    public String A1u;
    public String A1v;
    public String A1w;
    @Deprecated
    public String A1x;
    public LinkedHashMap A1y;
    public LinkedHashMap A1z;
    public List A20;
    public List A21;
    public List A22;
    @Deprecated
    public List A23;
    public List A24;
    public List A25 = new ArrayList();
    public List A26;
    public List A27 = new ArrayList();
    public List A28;
    public List A29;
    public List A2A;
    @Deprecated
    public List A2B;
    public boolean A2C = true;
    public boolean A2D;
    public boolean A2E = false;
    public boolean A2F;
    public boolean A2G = false;
    public boolean A2H;
    public boolean A2I;
    public boolean A2J;
    @Deprecated
    public boolean A2K;
    public boolean A2L = false;
    public boolean A2M = false;
    public boolean A2N;
    public boolean A2O;
    public boolean A2P;
    public boolean A2Q = false;
    public boolean A2R;
    public boolean A2S;
    public C254933tI A2T;
    public final LinkedHashMap A2U = new LinkedHashMap();
    public final List A2V = new ArrayList();
    public final List A2W = new ArrayList();

    public static synchronized void A04(UserSession userSession, C254703su r7, List list) {
        int i;
        synchronized (r7) {
            if (Systrace.A0E(32)) {
                0fh.A01("DirectMessage.updateCountBasedReactions", -786069796);
            }
            try {
                if (AnonymousClass4KJ.A00(list)) {
                    r7.A22 = list;
                    r7.A2U.clear();
                    if (Systrace.A0E(32)) {
                        i = 790082210;
                    }
                } else if (!list.equals(r7.A22) || r7.A2U.isEmpty()) {
                    r7.A22 = list;
                    LinkedHashMap linkedHashMap = r7.A2U;
                    linkedHashMap.clear();
                    if (182.A06(0Tu.A06, userSession, 36320266384580745L)) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            DirectCountBasedReaction directCountBasedReaction = (DirectCountBasedReaction) it.next();
                            linkedHashMap.put(directCountBasedReaction.A01, directCountBasedReaction);
                        }
                    }
                    if (Systrace.A0E(32)) {
                        i = 430582170;
                    }
                } else if (Systrace.A0E(32)) {
                    i = -773379773;
                }
                0fh.A00(i);
            } catch (Throwable th) {
                if (Systrace.A0E(32)) {
                    0fh.A00(1227363379);
                }
                throw th;
            }
        }
    }

    private void A07(ExtendedImageUrl extendedImageUrl) {
        String str;
        if (extendedImageUrl != null) {
            String str2 = extendedImageUrl.A0A;
            ExtendedImageUrl extendedImageUrl2 = this.A16;
            if (extendedImageUrl2 == null) {
                str = null;
            } else {
                str = extendedImageUrl2.A0A;
            }
            if (str2.equals(str)) {
                return;
            }
        } else if (this.A16 == null) {
            return;
        }
        this.A2C = true;
        this.A16 = extendedImageUrl;
    }

    private synchronized void A08(Long l) {
        if (l != null) {
            long longValue = l.longValue();
            if (longValue > 0) {
                Long valueOf = Long.valueOf(TimeUnit.SECONDS.toMillis(longValue));
                this.A1K = valueOf;
                this.A1L = Long.valueOf(valueOf.longValue() + TimeUnit.MICROSECONDS.toMillis(C7c()));
            }
        }
    }

    public static synchronized boolean A0C(C254703su r8, Long l, Long l2) {
        boolean z;
        Long l3;
        synchronized (r8) {
            z = false;
            boolean z2 = false;
            if (!2PP.A00(l, r8.A1O)) {
                z2 = true;
            }
            boolean z3 = !2PP.A00(l2, r8.A1M);
            if (z2) {
                r8.A1O = l;
            }
            if (z3) {
                r8.A1M = l2;
            }
            if (z2 || z3) {
                Long l4 = r8.A1O;
                if (!(l4 == null || (l3 = r8.A1M) == null)) {
                    r8.A1N = Long.valueOf(l4.longValue() + TimeUnit.SECONDS.toMillis(l3.longValue()));
                }
                if (z2 || z3) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final synchronized C376649Iu A0E() {
        return this.A07;
    }

    public final synchronized AnonymousClass9JH A0F() {
        return this.A09;
    }

    public final synchronized ImmutableList A0I() {
        ImmutableList immutableList;
        List list = this.A20;
        immutableList = null;
        if (!(list == null || list.size() == 0)) {
            immutableList = ImmutableList.copyOf((Collection) this.A20);
        }
        return immutableList;
    }

    public final synchronized ImmutableList A0J() {
        ImmutableList immutableList;
        List list = this.A22;
        if (list != null) {
            immutableList = ImmutableList.copyOf((Collection) list);
        } else {
            immutableList = null;
        }
        return immutableList;
    }

    public final synchronized ImmutableMap A0K() {
        ImmutableMap immutableMap;
        LinkedHashMap linkedHashMap = this.A1z;
        if (linkedHashMap != null) {
            immutableMap = ImmutableMap.copyOf(linkedHashMap);
        } else {
            immutableMap = null;
        }
        return immutableMap;
    }

    public final synchronized BB8 A0L() {
        return this.A0M;
    }

    public final synchronized AnonymousClass7Q3 A0O() {
        AnonymousClass7Q3 r0;
        AnonymousClass7FN r02 = this.A0Z;
        if (r02 != null) {
            r0 = r02.A01;
            r0.getClass();
        } else {
            r0 = null;
        }
        return r0;
    }

    public final synchronized C271374ik A0Q() {
        return this.A0d;
    }

    public final synchronized C254763t0 A0U() {
        return this.A0x;
    }

    public final synchronized Boolean A0X() {
        Boolean bool;
        Integer num = this.A1H;
        if (num == null) {
            bool = null;
        } else {
            int intValue = num.intValue();
            boolean z = true;
            if (intValue != 1) {
                z = false;
            }
            bool = Boolean.valueOf(z);
        }
        return bool;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r3.A10 != X.2FW.A1A) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Boolean A0Y() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Object r0 = r3.A1T     // Catch:{ all -> 0x0015 }
            boolean r0 = r0 instanceof X.1Xj     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x000e
            X.2FW r2 = r3.A10     // Catch:{ all -> 0x0015 }
            X.2FW r1 = X.2FW.A1A     // Catch:{ all -> 0x0015 }
            r0 = 1
            if (r2 == r1) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0015 }
            monitor-exit(r3)
            return r0
        L_0x0015:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254703su.A0Y():java.lang.Boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r4.A10 != X.2FW.A1k) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        if (java.lang.Boolean.valueOf(r0).booleanValue() != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Boolean A0a(java.lang.Integer r5) {
        /*
            r4 = this;
            r3 = r4
            monitor-enter(r3)
            boolean r0 = r4.A1c()     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x003b
            java.lang.Boolean r0 = r4.A0Y()     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x002d
            java.lang.Object r0 = r4.A1T     // Catch:{ all -> 0x0025 }
            boolean r0 = r0 instanceof X.C2609947v     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x001f
            X.2FW r2 = r4.A10     // Catch:{ all -> 0x0025 }
            X.2FW r1 = X.2FW.A1k     // Catch:{ all -> 0x0025 }
            r0 = 1
            if (r2 == r1) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0025 }
            goto L_0x0027
        L_0x0025:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0027:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x003b
        L_0x002d:
            int r1 = r5.intValue()     // Catch:{ all -> 0x0042 }
            r0 = 1003(0x3eb, float:1.406E-42)
            if (r1 == r0) goto L_0x0039
            r0 = 47
            if (r1 != r0) goto L_0x003b
        L_0x0039:
            r0 = 1
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return r0
        L_0x0042:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254703su.A0a(java.lang.Integer):java.lang.Boolean");
    }

    public final synchronized Integer A0c() {
        Integer num;
        List list = this.A26;
        if (list == null || list.isEmpty()) {
            num = this.A1G;
        } else {
            num = ((C254873tC) this.A26.get(0)).A0i;
        }
        return num;
    }

    public final synchronized Integer A0d(String str) {
        int i;
        LinkedHashMap linkedHashMap = this.A1z;
        if (linkedHashMap == null || linkedHashMap.isEmpty() || !linkedHashMap.containsKey(str)) {
            i = -1;
        } else {
            i = (Integer) this.A1z.get(str);
        }
        return i;
    }

    public final synchronized String A0k() {
        return this.A1X;
    }

    public final synchronized String A0l() {
        return this.A1l;
    }

    public final synchronized String A0m() {
        return this.A1m;
    }

    public final synchronized String A0n() {
        return this.A1n;
    }

    public final synchronized String A0o() {
        return this.A1t;
    }

    public final synchronized List A0t() {
        return this.A21;
    }

    public final synchronized List A0u() {
        return this.A24;
    }

    public final synchronized List A0v() {
        if (this.A25.isEmpty() && !this.A27.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (User id : this.A27) {
                String id2 = id.getId();
                ImmutableList immutableList = C254853tA.A07;
                arrayList.add(new C2607246u((ExtendedImageUrl) null, (Long) null, id2, "❤", (String) null));
            }
            this.A25 = arrayList;
        }
        return this.A25;
    }

    public final synchronized void A0x(UserSession userSession) {
        1Xj r7;
        2FW r4 = this.A10;
        Object obj = this.A1T;
        boolean z = this.A2P;
        Boolean bool = this.A18;
        Long l = this.A1L;
        UserSession userSession2 = userSession;
        C254843t9.A00(userSession2, A0U(), r4, bool, l, obj, this.A1n, this.A1l, A0f(), this.A26, z);
        C254933tI A0P2 = A0P();
        if (A0P2 != null) {
            C254763t0 A0U2 = A0U();
            synchronized (A0P2) {
                C254943tJ r0 = C254943tJ.$redex_init_class;
                2FW r42 = A0P2.A0F;
                switch (r42.ordinal()) {
                    case 3:
                        r7 = A0P2.A0C;
                        break;
                    case 14:
                        r7 = A0P2.A08;
                        break;
                    case 20:
                        r7 = A0P2.A01;
                        break;
                    case 22:
                        r7 = A0P2.A03;
                        break;
                    case 28:
                        r7 = A0P2.A04;
                        break;
                    case 46:
                        r7 = A0P2.A02;
                        break;
                    case 54:
                        r7 = A0P2.A07;
                        break;
                    default:
                        r7 = null;
                        break;
                }
                C254843t9.A00(userSession2, A0U2, r42, A0P2.A0J, A0P2.A0L, r7, (String) null, (String) null, A0P2.A0R, A0P2.A0Y, false);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [X.46s, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v7, types: [X.46s, java.lang.Object] */
    public final synchronized void A0y(UserSession userSession, C2607246u r14, String str, String str2) {
        Long l;
        ExtendedImageUrl extendedImageUrl;
        List arrayList;
        LinkedHashMap linkedHashMap;
        C277304ur r0;
        C2607046s r2;
        List list;
        ImmutableList immutableList = C254853tA.A07;
        String str3 = "❤";
        String str4 = str3;
        String str5 = null;
        if (r14 != null) {
            str5 = r14.A04;
            l = r14.A01;
            String str6 = r14.A02;
            if (str6 != null) {
                str3 = str6;
            }
            extendedImageUrl = r14.A00;
        } else {
            l = null;
            extendedImageUrl = null;
        }
        boolean equals = str3.equals(str4);
        C2607246u r6 = new C2607246u(extendedImageUrl, l, str, str3, str5);
        LinkedHashMap linkedHashMap2 = this.A1y;
        if (linkedHashMap2 == null) {
            linkedHashMap = new LinkedHashMap();
            this.A1y = linkedHashMap;
            r0 = new C277304ur(new ArrayList(Collections.singletonList(r6)));
        } else {
            if (linkedHashMap2.get(str3) != null) {
                arrayList = ((C277304ur) this.A1y.get(str3)).A00;
            } else {
                arrayList = new ArrayList();
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object next : arrayList) {
                if (A0A((C2607246u) next, str, str3)) {
                    arrayList2.add(next);
                }
            }
            arrayList2.add(r6);
            linkedHashMap = this.A1y;
            r0 = new C277304ur(arrayList2);
        }
        linkedHashMap.put(str3, r0);
        C2607046s r02 = this.A0X;
        if (r02 == null) {
            if (equals) {
                list = Collections.singletonList(r6);
            } else {
                list = Collections.emptyList();
            }
            List singletonList = Collections.singletonList(r6);
            ? obj = new Object();
            obj.A01 = Collections.unmodifiableList(list);
            obj.A00 = Collections.unmodifiableList(singletonList);
            r2 = obj;
        } else {
            List list2 = r02.A00;
            0qQ.A0B(list2, 0);
            ArrayList arrayList3 = new ArrayList();
            for (Object next2 : list2) {
                if (A0A((C2607246u) next2, str, str3)) {
                    arrayList3.add(next2);
                }
            }
            arrayList3.add(r6);
            ArrayList arrayList4 = new ArrayList(this.A0X.A01);
            if (equals) {
                List list3 = this.A0X.A01;
                0qQ.A0B(list3, 0);
                arrayList4 = new ArrayList();
                for (Object next3 : list3) {
                    if (A0A((C2607246u) next3, str, str3)) {
                        arrayList4.add(next3);
                    }
                }
                arrayList4.add(r6);
            }
            ? obj2 = new Object();
            obj2.A01 = Collections.unmodifiableList(arrayList4);
            obj2.A00 = Collections.unmodifiableList(arrayList3);
            r2 = obj2;
        }
        this.A0X = r2;
        String str7 = str2;
        if (str2 != null) {
            A12(userSession, str7);
        }
        A05(userSession, this, false);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.46s, java.lang.Object] */
    public final synchronized void A0z(UserSession userSession, C2607246u r8, String str, String str2) {
        C2607046s r1;
        List arrayList;
        ImmutableList immutableList = C254853tA.A07;
        String str3 = "❤";
        if (r8 != null) {
            String str4 = r8.A02;
            if (str4 != null) {
                str3 = str4;
            }
            LinkedHashMap linkedHashMap = this.A1y;
            if (linkedHashMap != null) {
                if (linkedHashMap.get(str3) != null) {
                    arrayList = ((C277304ur) this.A1y.get(str3)).A00;
                } else {
                    arrayList = new ArrayList();
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (str.equals(((C2607246u) it.next()).A03)) {
                            it.remove();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    this.A1y.remove(str3);
                }
            }
        }
        C2607046s r0 = this.A0X;
        if (r0 != null) {
            List list = r0.A01;
            0qQ.A0B(list, 0);
            ArrayList arrayList2 = new ArrayList();
            for (Object next : list) {
                if (A0A((C2607246u) next, str, str3)) {
                    arrayList2.add(next);
                }
            }
            List list2 = this.A0X.A00;
            0qQ.A0B(list2, 0);
            ArrayList arrayList3 = new ArrayList();
            for (Object next2 : list2) {
                if (A0A((C2607246u) next2, str, str3)) {
                    arrayList3.add(next2);
                }
            }
            if (!arrayList2.isEmpty() || !arrayList3.isEmpty()) {
                ? obj = new Object();
                obj.A01 = Collections.unmodifiableList(arrayList2);
                obj.A00 = Collections.unmodifiableList(arrayList3);
                r1 = obj;
            } else {
                r1 = null;
            }
            this.A0X = r1;
        }
        if (str2 != null) {
            A12(userSession, str2);
        }
        A05(userSession, this, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01e1, code lost:
        if (r1.equals(r0) != false) goto L_0x01e3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A10(com.instagram.common.session.UserSession r8, X.C254703su r9, X.C254763t0 r10) {
        /*
            r7 = this;
            r6 = r7
            monitor-enter(r6)
            java.lang.String r0 = r9.A1c     // Catch:{ all -> 0x0770 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0770 }
            r2 = 1
            if (r0 != 0) goto L_0x0019
            java.lang.String r1 = r9.A1c     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = r7.A1c     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0019
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A1c = r1     // Catch:{ all -> 0x0770 }
        L_0x0019:
            java.lang.Long r0 = r9.A1P     // Catch:{ all -> 0x0770 }
            r7.A19(r0)     // Catch:{ all -> 0x0770 }
            X.3t0 r0 = r7.A0x     // Catch:{ all -> 0x076c }
            if (r0 != 0) goto L_0x0025
            r7.A15(r10)     // Catch:{ all -> 0x076c }
        L_0x0025:
            java.lang.Object r0 = r9.A1T     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x00d9
            java.lang.Object r4 = r7.A1T     // Catch:{ all -> 0x0770 }
            if (r0 == r4) goto L_0x00d9
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A1T = r0     // Catch:{ all -> 0x0770 }
            boolean r0 = r9.A1S()     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0044
            X.0Tu r3 = X.0Tu.A05     // Catch:{ all -> 0x0770 }
            r0 = 36320687291376404(0x81097900002314, double:3.032687122510629E-306)
            boolean r0 = X.182.A06(r3, r8, r0)     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x0063
        L_0x0044:
            boolean r0 = r4 instanceof X.C300925yB     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = r7.A1T     // Catch:{ all -> 0x0770 }
            boolean r0 = r0 instanceof X.1Xj     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x0063
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.28K.A00(r8)     // Catch:{ all -> 0x0770 }
            r3 = r4
            X.5yB r3 = (X.C300925yB) r3     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = r3.A06     // Catch:{ all -> 0x0770 }
            X.3Q2 r0 = r1.A03(r0)     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x006e
            boolean r0 = X.C379909Vu.A01(r0)     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x006e
        L_0x0063:
            boolean r3 = r9.A1S()     // Catch:{ all -> 0x0770 }
            java.lang.String r1 = r9.A1o     // Catch:{ all -> 0x0770 }
            boolean r0 = r9.A2F     // Catch:{ all -> 0x0770 }
            if (r3 == 0) goto L_0x00d9
            goto L_0x009c
        L_0x006e:
            X.1iA r1 = r3.A01     // Catch:{ all -> 0x0770 }
            X.1iA r0 = X.1iA.A0Q     // Catch:{ all -> 0x0770 }
            if (r1 != r0) goto L_0x0077
            java.lang.String r3 = r3.A07     // Catch:{ all -> 0x0770 }
            goto L_0x007d
        L_0x0077:
            X.1iA r0 = X.1iA.A0a     // Catch:{ all -> 0x0770 }
            if (r1 != r0) goto L_0x0063
            java.lang.String r3 = r3.A08     // Catch:{ all -> 0x0770 }
        L_0x007d:
            if (r3 == 0) goto L_0x0063
            java.lang.String r0 = "content:"
            boolean r0 = r3.startsWith(r0)     // Catch:{ all -> 0x0770 }
            java.lang.Object r1 = r7.A1T     // Catch:{ all -> 0x0770 }
            X.1Xj r1 = (X.1Xj) r1     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x0092
            android.net.Uri r0 = X.0cp.A03(r3)     // Catch:{ all -> 0x0770 }
        L_0x008f:
            r1.A05 = r0     // Catch:{ all -> 0x0770 }
            goto L_0x0063
        L_0x0092:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0770 }
            r0.<init>(r3)     // Catch:{ all -> 0x0770 }
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ all -> 0x0770 }
            goto L_0x008f
        L_0x009c:
            if (r0 == 0) goto L_0x00d9
            if (r4 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d9
            java.lang.Object r3 = r7.A1T     // Catch:{ all -> 0x0770 }
            boolean r0 = r3 instanceof java.util.List     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x00d9
            boolean r0 = r4 instanceof java.util.List     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x00d9
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0770 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x0770 }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x00d9
            int r1 = r4.size()     // Catch:{ all -> 0x0770 }
            int r0 = r3.size()     // Catch:{ all -> 0x0770 }
            if (r1 != r0) goto L_0x00d9
            r0 = 0
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0770 }
            java.lang.Object r1 = r4.get(r0)     // Catch:{ all -> 0x0770 }
            boolean r0 = r1 instanceof X.C254873tC     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x00d9
            boolean r0 = r3 instanceof X.C254873tC     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x00d9
            X.3tC r3 = (X.C254873tC) r3     // Catch:{ all -> 0x0770 }
            X.3tC r1 = (X.C254873tC) r1     // Catch:{ all -> 0x0770 }
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r1.A0X     // Catch:{ all -> 0x0770 }
            r3.A0X = r0     // Catch:{ all -> 0x0770 }
        L_0x00d9:
            X.2FW r1 = r9.A10     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x00e8
            X.2FW r0 = r7.A10     // Catch:{ all -> 0x0770 }
            if (r0 == r1) goto L_0x00e8
            r7.A10 = r1     // Catch:{ all -> 0x0770 }
            r0 = 0
            r7.A1A = r0     // Catch:{ all -> 0x0770 }
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
        L_0x00e8:
            X.2FW r1 = r9.A0z     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x00fc
            X.2FW r0 = r7.A0z     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x00fc
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A0z = r1     // Catch:{ all -> 0x0770 }
            java.lang.Object r0 = r9.A1U     // Catch:{ all -> 0x0770 }
            r7.A1U = r0     // Catch:{ all -> 0x0770 }
        L_0x00fc:
            java.lang.String r0 = r9.A1u     // Catch:{ all -> 0x0770 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0112
            java.lang.String r1 = r9.A1u     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = r7.A1u     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0112
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A1u = r1     // Catch:{ all -> 0x0770 }
        L_0x0112:
            java.lang.Integer r1 = r9.A1F     // Catch:{ all -> 0x0770 }
            java.lang.Integer r0 = r7.A1F     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0120
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A1F = r1     // Catch:{ all -> 0x0770 }
        L_0x0120:
            java.lang.String r0 = r9.A1W     // Catch:{ all -> 0x0770 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0136
            java.lang.String r1 = r9.A1W     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = r7.A1W     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0136
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A1W = r1     // Catch:{ all -> 0x0770 }
        L_0x0136:
            java.lang.String r0 = r9.A1r     // Catch:{ all -> 0x0770 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x014c
            java.lang.String r1 = r9.A1r     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = r7.A1r     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x014c
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A1r = r1     // Catch:{ all -> 0x0770 }
        L_0x014c:
            java.lang.Long r0 = r9.A1S     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x0153
            r7.A1A(r0)     // Catch:{ all -> 0x0770 }
        L_0x0153:
            java.lang.Long r1 = r9.A1Q     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x0165
            java.lang.Long r0 = r7.A1Q     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0165
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A1Q = r1     // Catch:{ all -> 0x0770 }
            r7.A2D = r2     // Catch:{ all -> 0x0770 }
        L_0x0165:
            X.57z r1 = r9.A0n     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x0177
            X.57z r0 = r7.A0n     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0177
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            X.57z r0 = r9.A0n     // Catch:{ all -> 0x0770 }
            r7.A0n = r0     // Catch:{ all -> 0x0770 }
        L_0x0177:
            X.9J6 r1 = r9.A08     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x0189
            X.9J6 r0 = r7.A08     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0189
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            X.9J6 r0 = r9.A08     // Catch:{ all -> 0x0770 }
            r7.A08 = r0     // Catch:{ all -> 0x0770 }
        L_0x0189:
            java.lang.String r0 = r9.A1q     // Catch:{ all -> 0x0770 }
            r7.A09(r0)     // Catch:{ all -> 0x0770 }
            X.53G r1 = r9.A12     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x019a
            X.53G r0 = r7.A12     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x019a
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A12 = r1     // Catch:{ all -> 0x0770 }
        L_0x019a:
            com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem r1 = r9.A15     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x01a6
            com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem r0 = r7.A15     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x01a6
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A15 = r1     // Catch:{ all -> 0x0770 }
        L_0x01a6:
            java.lang.String r0 = r9.A1g     // Catch:{ all -> 0x0770 }
            r7.A1g = r0     // Catch:{ all -> 0x0770 }
            java.lang.String r1 = r9.A1t     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x01b9
            java.lang.String r0 = r7.A1t     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x01b9
            r7.A1H(r1)     // Catch:{ all -> 0x0770 }
        L_0x01b9:
            java.lang.String r1 = r9.A1s     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x01c8
            java.lang.String r0 = r7.A1s     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x01c8
            r7.A1G(r1)     // Catch:{ all -> 0x0770 }
        L_0x01c8:
            X.N4D r1 = r9.A0G     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x01e3
            X.N4D r0 = r7.A0G     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x01e3
            X.N4D r1 = r9.A0G     // Catch:{ all -> 0x0770 }
            X.N4D r0 = r7.A0G     // Catch:{ all -> 0x0770 }
            if (r1 != 0) goto L_0x01dd
            if (r0 != 0) goto L_0x0321
            goto L_0x01e3
        L_0x01dd:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x0321
        L_0x01e3:
            com.instagram.user.model.User r1 = r9.A17     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x01ef
            com.instagram.user.model.User r0 = r7.A17     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x01ef
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A17 = r1     // Catch:{ all -> 0x0770 }
        L_0x01ef:
            X.1Xj r1 = r9.A0s     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x01fb
            X.1Xj r0 = r7.A0s     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x01fb
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A0s = r1     // Catch:{ all -> 0x0770 }
        L_0x01fb:
            X.1Xj r1 = r9.A0t     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x0207
            X.1Xj r0 = r7.A0t     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x0207
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A0t = r1     // Catch:{ all -> 0x0770 }
        L_0x0207:
            X.9JI r1 = r9.A0A     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x0213
            X.9JI r0 = r7.A0A     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x0213
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A0A = r1     // Catch:{ all -> 0x0770 }
        L_0x0213:
            X.47v r1 = r9.A0g     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x021f
            X.47v r0 = r7.A0g     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x021f
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A0g = r1     // Catch:{ all -> 0x0770 }
        L_0x021f:
            X.7FN r1 = r9.A0Z     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x022b
            X.7FN r0 = r7.A0Z     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x022b
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A0Z = r1     // Catch:{ all -> 0x0770 }
        L_0x022b:
            X.7FJ r1 = r9.A0b     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x0237
            X.7FJ r0 = r7.A0b     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x0237
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A0b = r1     // Catch:{ all -> 0x0770 }
        L_0x0237:
            X.N4Q r1 = r9.A0F     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x0243
            X.N4Q r0 = r7.A0F     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x0243
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A0F = r1     // Catch:{ all -> 0x0770 }
        L_0x0243:
            X.Cw5 r1 = r9.A0U     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x024f
            X.Cw5 r0 = r7.A0U     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x024f
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A0U = r1     // Catch:{ all -> 0x0770 }
        L_0x024f:
            java.lang.String r1 = r9.A1d     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x025b
            java.lang.String r0 = r7.A1d     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x025b
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A1d = r1     // Catch:{ all -> 0x0770 }
        L_0x025b:
            X.46n r1 = r9.A0N     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x0267
            X.46n r0 = r7.A0N     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x0267
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A0N = r1     // Catch:{ all -> 0x0770 }
        L_0x0267:
            X.55L r1 = r9.A0c     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x0273
            X.55L r0 = r7.A0c     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x0273
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A0c = r1     // Catch:{ all -> 0x0770 }
        L_0x0273:
            boolean r1 = r9.A2D     // Catch:{ all -> 0x0770 }
            boolean r0 = r7.A2D     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x027d
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A2D = r1     // Catch:{ all -> 0x0770 }
        L_0x027d:
            java.util.List r1 = r9.A2A     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x0289
            java.util.List r0 = r7.A2A     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x0289
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A2A = r1     // Catch:{ all -> 0x0770 }
        L_0x0289:
            java.util.List r1 = r9.A28     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x0295
            java.util.List r0 = r7.A28     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x0295
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A28 = r1     // Catch:{ all -> 0x0770 }
        L_0x0295:
            java.util.List r1 = r9.A21     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x02a1
            java.util.List r0 = r7.A21     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x02a1
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A21 = r1     // Catch:{ all -> 0x0770 }
        L_0x02a1:
            java.util.List r1 = r9.A24     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x02ae
            java.util.List r0 = r7.A24     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x02ae
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A1J(r1)     // Catch:{ all -> 0x0770 }
        L_0x02ae:
            X.4ik r1 = r9.A0d     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x02ba
            X.4ik r0 = r7.A0d     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x02ba
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A0d = r1     // Catch:{ all -> 0x0770 }
        L_0x02ba:
            boolean r1 = r9.A2M     // Catch:{ all -> 0x0770 }
            boolean r0 = r7.A2M     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x02c4
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A2M = r1     // Catch:{ all -> 0x0770 }
        L_0x02c4:
            boolean r1 = r9.A2E     // Catch:{ all -> 0x0770 }
            boolean r0 = r7.A2E     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x02ce
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A2E = r1     // Catch:{ all -> 0x0770 }
        L_0x02ce:
            java.lang.Long r1 = r9.A1J     // Catch:{ all -> 0x0770 }
            java.lang.Long r0 = r7.A1J     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x02f0
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            java.lang.Long r0 = r9.A1J     // Catch:{ all -> 0x0770 }
            r7.A1J = r0     // Catch:{ all -> 0x0770 }
            r7.A08(r0)     // Catch:{ all -> 0x0770 }
        L_0x02e1:
            java.lang.Long r1 = r9.A1O     // Catch:{ all -> 0x0770 }
            java.lang.Long r0 = r9.A1M     // Catch:{ all -> 0x0770 }
            boolean r0 = A0C(r7, r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x02ed
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
        L_0x02ed:
            java.util.LinkedHashMap r3 = r9.A1z     // Catch:{ all -> 0x0770 }
            goto L_0x0327
        L_0x02f0:
            java.lang.Long r1 = r9.A1L     // Catch:{ all -> 0x0770 }
            java.lang.Long r0 = r7.A1L     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0300
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            java.lang.Long r0 = r9.A1L     // Catch:{ all -> 0x0770 }
            r7.A1L = r0     // Catch:{ all -> 0x0770 }
        L_0x0300:
            java.lang.Long r1 = r9.A1K     // Catch:{ all -> 0x0770 }
            java.lang.Long r0 = r7.A1K     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0310
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            java.lang.Long r0 = r9.A1K     // Catch:{ all -> 0x0770 }
            r7.A1K = r0     // Catch:{ all -> 0x0770 }
        L_0x0310:
            java.util.List r1 = r9.A29     // Catch:{ all -> 0x0770 }
            java.util.List r0 = r7.A29     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x02e1
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            java.util.List r0 = r9.A29     // Catch:{ all -> 0x0770 }
            r7.A29 = r0     // Catch:{ all -> 0x0770 }
            goto L_0x02e1
        L_0x0321:
            r7.A0G = r1     // Catch:{ all -> 0x0770 }
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            goto L_0x01e3
        L_0x0327:
            if (r3 != 0) goto L_0x032a
            goto L_0x038a
        L_0x032a:
            java.util.LinkedHashMap r0 = r7.A1z     // Catch:{ all -> 0x0770 }
            if (r3 == 0) goto L_0x0331
            if (r0 == 0) goto L_0x0362
            goto L_0x0334
        L_0x0331:
            if (r0 == 0) goto L_0x038e
            goto L_0x0362
        L_0x0334:
            int r1 = r3.size()     // Catch:{ all -> 0x0770 }
            int r0 = r0.size()     // Catch:{ all -> 0x0770 }
            if (r1 != r0) goto L_0x0362
            java.util.Set r0 = r3.entrySet()     // Catch:{ all -> 0x0770 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0770 }
        L_0x0346:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x038e
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x0770 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0770 }
            java.util.LinkedHashMap r1 = r7.A1z     // Catch:{ all -> 0x0770 }
            java.lang.Object r0 = r3.getKey()     // Catch:{ all -> 0x0770 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0770 }
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x0346
        L_0x0362:
            java.util.LinkedHashMap r0 = r9.A1z     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x038e
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0770 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0770 }
        L_0x036e:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x038e
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0770 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0770 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0770 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0770 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0770 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0770 }
            r7.A1I(r1, r0)     // Catch:{ all -> 0x0770 }
            goto L_0x036e
        L_0x038a:
            java.util.LinkedHashMap r0 = r7.A1z     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x032a
        L_0x038e:
            X.OW8 r3 = r9.A0Y     // Catch:{ all -> 0x0770 }
            r0 = 0
            if (r3 == 0) goto L_0x03b3
            X.OW8 r1 = r7.A0Y     // Catch:{ all -> 0x0770 }
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x0770 }
            if (r1 != 0) goto L_0x03b3
            java.lang.String r3 = r9.A1e     // Catch:{ all -> 0x0770 }
            if (r3 == 0) goto L_0x03b3
            java.lang.String r1 = r7.A1e     // Catch:{ all -> 0x0770 }
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x0770 }
            if (r1 != 0) goto L_0x03b3
            r5 = 1
            r7.A1e = r3     // Catch:{ all -> 0x0770 }
            X.OW8 r1 = r9.A0Y     // Catch:{ all -> 0x0770 }
            r7.A0Y = r1     // Catch:{ all -> 0x0770 }
            java.lang.String r1 = r9.A1k     // Catch:{ all -> 0x0770 }
            r7.A1k = r1     // Catch:{ all -> 0x0770 }
            goto L_0x03b4
        L_0x03b3:
            r5 = 0
        L_0x03b4:
            X.46s r3 = r9.A0X     // Catch:{ all -> 0x076e }
            X.46s r1 = r7.A0X     // Catch:{ all -> 0x076e }
            boolean r1 = X.2PP.A00(r3, r1)     // Catch:{ all -> 0x076e }
            r4 = r1 ^ 1
            if (r4 == 0) goto L_0x03c4
            X.46s r1 = r9.A0X     // Catch:{ all -> 0x076e }
            r7.A0X = r1     // Catch:{ all -> 0x076e }
        L_0x03c4:
            java.util.LinkedHashMap r3 = r9.A1y     // Catch:{ all -> 0x076e }
            java.util.LinkedHashMap r1 = r7.A1y     // Catch:{ all -> 0x076e }
            boolean r1 = X.2PP.A00(r3, r1)     // Catch:{ all -> 0x076e }
            r3 = r1 ^ 1
            if (r3 == 0) goto L_0x03d4
            java.util.LinkedHashMap r1 = r9.A1y     // Catch:{ all -> 0x076e }
            r7.A1y = r1     // Catch:{ all -> 0x076e }
        L_0x03d4:
            if (r5 != 0) goto L_0x03da
            if (r4 != 0) goto L_0x03da
            if (r3 == 0) goto L_0x03dd
        L_0x03da:
            A05(r8, r7, r0)     // Catch:{ all -> 0x076e }
        L_0x03dd:
            X.9Iu r3 = r9.A07     // Catch:{ all -> 0x0770 }
            if (r3 == 0) goto L_0x03e9
            X.9Iu r1 = r7.A07     // Catch:{ all -> 0x0770 }
            if (r3 == r1) goto L_0x03e9
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A07 = r3     // Catch:{ all -> 0x0770 }
        L_0x03e9:
            X.JwG r3 = r9.A0B     // Catch:{ all -> 0x0770 }
            if (r3 == 0) goto L_0x03f5
            X.JwG r1 = r7.A0B     // Catch:{ all -> 0x0770 }
            if (r3 == r1) goto L_0x03f5
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A0B = r3     // Catch:{ all -> 0x0770 }
        L_0x03f5:
            X.2FW r3 = r7.A10     // Catch:{ all -> 0x0770 }
            X.2FW r1 = X.2FW.A0q     // Catch:{ all -> 0x0770 }
            if (r3 != r1) goto L_0x0471
            X.4ik r5 = r9.A0e     // Catch:{ all -> 0x0770 }
            if (r5 == 0) goto L_0x0471
            X.4ik r4 = r7.A0e     // Catch:{ all -> 0x0770 }
            if (r4 == r5) goto L_0x0471
            if (r4 == 0) goto L_0x0407
            int r0 = r4.A00     // Catch:{ all -> 0x0770 }
        L_0x0407:
            int r1 = r5.A00     // Catch:{ all -> 0x0770 }
            int r0 = java.lang.Math.max(r0, r1)     // Catch:{ all -> 0x0770 }
            int r0 = java.lang.Math.max(r0, r1)     // Catch:{ all -> 0x0770 }
            r5.A00 = r0     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = r7.A1w     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x046d
            if (r4 == 0) goto L_0x046d
            java.lang.Long r0 = r5.A06     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x041f
            r4.A06 = r0     // Catch:{ all -> 0x0770 }
        L_0x041f:
            java.lang.Long r0 = r5.A08     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x0425
            r4.A08 = r0     // Catch:{ all -> 0x0770 }
        L_0x0425:
            java.lang.Long r0 = r5.A07     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x042b
            r4.A07 = r0     // Catch:{ all -> 0x0770 }
        L_0x042b:
            int r1 = r5.A00     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x0437
            int r0 = r4.A00     // Catch:{ all -> 0x0770 }
            int r0 = java.lang.Math.max(r1, r0)     // Catch:{ all -> 0x0770 }
            r4.A00 = r0     // Catch:{ all -> 0x0770 }
        L_0x0437:
            java.util.List r0 = r5.A0B     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x0455
            X.3WT r3 = X.AnonymousClass3WT.POLLING     // Catch:{ all -> 0x0770 }
            X.3ui r1 = X.C289745e8.A00(r3, r0)     // Catch:{ all -> 0x0770 }
            java.util.List r0 = r4.A0B     // Catch:{ all -> 0x0770 }
            X.3ui r0 = X.C289745e8.A00(r3, r0)     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x0451
            if (r1 == 0) goto L_0x0451
            java.lang.Integer r0 = r0.A1L     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x0451
            r1.A1L = r0     // Catch:{ all -> 0x0770 }
        L_0x0451:
            java.util.List r0 = r5.A0B     // Catch:{ all -> 0x0770 }
            r4.A0B = r0     // Catch:{ all -> 0x0770 }
        L_0x0455:
            X.OGw r3 = r5.A01     // Catch:{ all -> 0x0770 }
            X.OGw r1 = r4.A01     // Catch:{ all -> 0x0770 }
            if (r1 != 0) goto L_0x045e
            r4.A01 = r3     // Catch:{ all -> 0x0770 }
            goto L_0x046f
        L_0x045e:
            if (r3 == 0) goto L_0x046f
            java.lang.String r0 = r3.A03     // Catch:{ all -> 0x0770 }
            r1.A03 = r0     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = r3.A04     // Catch:{ all -> 0x0770 }
            r1.A04 = r0     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = r3.A05     // Catch:{ all -> 0x0770 }
            r1.A05 = r0     // Catch:{ all -> 0x0770 }
            goto L_0x046f
        L_0x046d:
            r7.A0e = r5     // Catch:{ all -> 0x0770 }
        L_0x046f:
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
        L_0x0471:
            X.9Iu r1 = r9.A06     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x0483
            X.9Iu r0 = r7.A06     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0483
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            X.9Iu r0 = r9.A06     // Catch:{ all -> 0x0770 }
            r7.A06 = r0     // Catch:{ all -> 0x0770 }
        L_0x0483:
            com.instagram.direct.model.DirectAREffectShare r1 = r9.A0P     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x0495
            com.instagram.direct.model.DirectAREffectShare r0 = r7.A0P     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0495
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            com.instagram.direct.model.DirectAREffectShare r0 = r9.A0P     // Catch:{ all -> 0x0770 }
            r7.A0P = r0     // Catch:{ all -> 0x0770 }
        L_0x0495:
            X.3tI r1 = r9.A0a     // Catch:{ all -> 0x0770 }
            X.3tI r0 = r7.A0a     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x04a1
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x04a7
        L_0x04a1:
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            X.3tI r0 = r9.A0a     // Catch:{ all -> 0x0770 }
            r7.A0a = r0     // Catch:{ all -> 0x0770 }
        L_0x04a7:
            X.3tI r1 = r9.A2T     // Catch:{ all -> 0x0770 }
            X.3tI r0 = r7.A2T     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x04b3
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x04b9
        L_0x04b3:
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            X.3tI r0 = r9.A2T     // Catch:{ all -> 0x0770 }
            r7.A2T = r0     // Catch:{ all -> 0x0770 }
        L_0x04b9:
            r7.A02()     // Catch:{ all -> 0x0770 }
            X.3tC r1 = r9.A0j     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x04ce
            X.3tC r0 = r7.A0j     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x04ce
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            X.3tC r0 = r9.A0j     // Catch:{ all -> 0x0770 }
            r7.A0j = r0     // Catch:{ all -> 0x0770 }
        L_0x04ce:
            boolean r1 = r9.A2F     // Catch:{ all -> 0x0770 }
            boolean r0 = r7.A2F     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x04d8
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A2F = r1     // Catch:{ all -> 0x0770 }
        L_0x04d8:
            java.lang.Integer r1 = r9.A1E     // Catch:{ all -> 0x0770 }
            java.lang.Integer r0 = r7.A1E     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x04e5
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A1E = r1     // Catch:{ all -> 0x0770 }
            r7.A03(r8)     // Catch:{ all -> 0x0770 }
        L_0x04e5:
            java.lang.String r1 = r9.A1Z     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = r7.A1Z     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x04ef
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A1Z = r1     // Catch:{ all -> 0x0770 }
        L_0x04ef:
            java.lang.String r1 = r9.A1a     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = r7.A1a     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x04f9
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A1a = r1     // Catch:{ all -> 0x0770 }
        L_0x04f9:
            java.lang.String r1 = r9.A1b     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = r7.A1b     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x0503
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A1b = r1     // Catch:{ all -> 0x0770 }
        L_0x0503:
            boolean r1 = r9.A2O     // Catch:{ all -> 0x0770 }
            boolean r0 = r7.A2O     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x050d
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A2O = r1     // Catch:{ all -> 0x0770 }
        L_0x050d:
            X.3sw r1 = r9.A0m     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x051f
            X.3sw r0 = r7.A0m     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x051f
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            X.3sw r0 = r9.A0m     // Catch:{ all -> 0x0770 }
            r7.A0m = r0     // Catch:{ all -> 0x0770 }
        L_0x051f:
            java.util.List r1 = r9.A26     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x0531
            java.util.List r0 = r7.A26     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0531
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            java.util.List r0 = r9.A26     // Catch:{ all -> 0x0770 }
            r7.A26 = r0     // Catch:{ all -> 0x0770 }
        L_0x0531:
            X.O7Y r1 = r9.A0K     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x0543
            X.O7Y r0 = r7.A0K     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0543
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            X.O7Y r0 = r9.A0K     // Catch:{ all -> 0x0770 }
            r7.A0K = r0     // Catch:{ all -> 0x0770 }
        L_0x0543:
            X.5xW r1 = r7.A0W     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x054f
            X.5xW r0 = r9.A0W     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0555
        L_0x054f:
            X.5xW r0 = r9.A0W     // Catch:{ all -> 0x0770 }
            r7.A0W = r0     // Catch:{ all -> 0x0770 }
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
        L_0x0555:
            X.5FY r1 = r9.A0V     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x0567
            X.5FY r0 = r7.A0V     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0567
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            X.5FY r0 = r9.A0V     // Catch:{ all -> 0x0770 }
            r7.A0V = r0     // Catch:{ all -> 0x0770 }
        L_0x0567:
            boolean r1 = r9.A2P     // Catch:{ all -> 0x0770 }
            boolean r0 = r7.A2P     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x0571
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A2P = r1     // Catch:{ all -> 0x0770 }
        L_0x0571:
            com.google.common.collect.ImmutableList r1 = r9.A0H     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x0583
            com.google.common.collect.ImmutableList r0 = r7.A0H     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0583
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            com.google.common.collect.ImmutableList r0 = r9.A0H     // Catch:{ all -> 0x0770 }
            r7.A0H = r0     // Catch:{ all -> 0x0770 }
        L_0x0583:
            java.util.List r1 = r9.A20     // Catch:{ all -> 0x0770 }
            java.util.List r0 = r7.A20     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x058d
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A20 = r1     // Catch:{ all -> 0x0770 }
        L_0x058d:
            java.lang.String r1 = r9.A1V     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x059d
            java.lang.String r0 = r7.A1V     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x059d
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A1V = r1     // Catch:{ all -> 0x0770 }
        L_0x059d:
            int r1 = r9.A00     // Catch:{ all -> 0x0770 }
            int r0 = r7.A00     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x05a7
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A00 = r1     // Catch:{ all -> 0x0770 }
        L_0x05a7:
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r9.A16     // Catch:{ all -> 0x0770 }
            r7.A07(r0)     // Catch:{ all -> 0x0770 }
            java.lang.Integer r1 = r9.A1G     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x05bc
            java.lang.Integer r0 = r7.A1G     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x05bc
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A1G = r1     // Catch:{ all -> 0x0770 }
        L_0x05bc:
            boolean r1 = r9.A2I     // Catch:{ all -> 0x0770 }
            boolean r0 = r7.A2I     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x05c6
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A2I = r1     // Catch:{ all -> 0x0770 }
        L_0x05c6:
            java.util.List r0 = r9.A22     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x05cd
            r7.A1h(r8, r0)     // Catch:{ all -> 0x0770 }
        L_0x05cd:
            java.lang.Boolean r1 = r9.A18     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x05d9
            java.lang.Boolean r0 = r7.A18     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x05d9
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A18 = r1     // Catch:{ all -> 0x0770 }
        L_0x05d9:
            X.N4L r1 = r7.A0D     // Catch:{ all -> 0x0770 }
            X.N4L r0 = r9.A0D     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x05e9
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            X.N4L r0 = r9.A0D     // Catch:{ all -> 0x0770 }
            r7.A0D = r0     // Catch:{ all -> 0x0770 }
        L_0x05e9:
            java.lang.String r1 = r7.A1i     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = r9.A1i     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x05f9
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = r9.A1i     // Catch:{ all -> 0x0770 }
            r7.A1i = r0     // Catch:{ all -> 0x0770 }
        L_0x05f9:
            java.lang.String r1 = r9.A1o     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x060b
            java.lang.String r0 = r7.A1o     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x060b
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = r9.A1o     // Catch:{ all -> 0x0770 }
            r7.A1o = r0     // Catch:{ all -> 0x0770 }
        L_0x060b:
            boolean r0 = r9.A2N     // Catch:{ all -> 0x0770 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0770 }
            boolean r0 = r7.A2N     // Catch:{ all -> 0x0770 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0623
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            boolean r0 = r9.A2N     // Catch:{ all -> 0x0770 }
            r7.A2N = r0     // Catch:{ all -> 0x0770 }
        L_0x0623:
            X.7AG r1 = r9.A0Q     // Catch:{ all -> 0x0770 }
            X.7AG r0 = r7.A0Q     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0633
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            X.7AG r0 = r9.A0Q     // Catch:{ all -> 0x0770 }
            r7.A0Q = r0     // Catch:{ all -> 0x0770 }
        L_0x0633:
            com.instagram.direct.model.comments.DirectMessageComments r1 = r9.A0q     // Catch:{ all -> 0x0770 }
            com.instagram.direct.model.comments.DirectMessageComments r0 = r7.A0q     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0643
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            com.instagram.direct.model.comments.DirectMessageComments r0 = r9.A0q     // Catch:{ all -> 0x0770 }
            r7.A0q = r0     // Catch:{ all -> 0x0770 }
        L_0x0643:
            X.9I4 r1 = r9.A04     // Catch:{ all -> 0x0770 }
            X.9I4 r0 = r7.A04     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0653
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            X.9I4 r0 = r9.A04     // Catch:{ all -> 0x0770 }
            r7.A04 = r0     // Catch:{ all -> 0x0770 }
        L_0x0653:
            X.9JH r1 = r9.A09     // Catch:{ all -> 0x0770 }
            X.9JH r0 = r7.A09     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0663
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            X.9JH r0 = r9.A09     // Catch:{ all -> 0x0770 }
            r7.A09 = r0     // Catch:{ all -> 0x0770 }
        L_0x0663:
            X.BB8 r1 = r9.A0M     // Catch:{ all -> 0x0770 }
            X.BB8 r0 = r7.A0M     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0673
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            X.BB8 r0 = r9.A0M     // Catch:{ all -> 0x0770 }
            r7.A0M = r0     // Catch:{ all -> 0x0770 }
        L_0x0673:
            X.5Cg r1 = r9.A0k     // Catch:{ all -> 0x0770 }
            X.5Cg r0 = r7.A0k     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0683
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            X.5Cg r0 = r9.A0k     // Catch:{ all -> 0x0770 }
            r7.A0k = r0     // Catch:{ all -> 0x0770 }
        L_0x0683:
            java.lang.String r1 = r9.A1Y     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = r7.A1Y     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0693
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = r9.A1Y     // Catch:{ all -> 0x0770 }
            r7.A1Y = r0     // Catch:{ all -> 0x0770 }
        L_0x0693:
            java.lang.String r1 = r9.A1X     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = r7.A1X     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x06a3
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = r9.A1X     // Catch:{ all -> 0x0770 }
            r7.A1X = r0     // Catch:{ all -> 0x0770 }
        L_0x06a3:
            java.util.List r1 = r9.A29     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x06b5
            java.util.List r0 = r7.A29     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x06b5
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            java.util.List r0 = r9.A29     // Catch:{ all -> 0x0770 }
            r7.A29 = r0     // Catch:{ all -> 0x0770 }
        L_0x06b5:
            int r1 = r9.A01     // Catch:{ all -> 0x0770 }
            int r0 = r7.A01     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x06bf
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A01 = r1     // Catch:{ all -> 0x0770 }
        L_0x06bf:
            boolean r0 = r9.A2J     // Catch:{ all -> 0x0770 }
            if (r0 == 0) goto L_0x06d7
            boolean r1 = r9.A2K     // Catch:{ all -> 0x0770 }
            boolean r0 = r7.A2K     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x06cd
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A2K = r1     // Catch:{ all -> 0x0770 }
        L_0x06cd:
            java.util.List r1 = r9.A2B     // Catch:{ all -> 0x0770 }
            java.util.List r0 = r7.A2B     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x06d7
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A2B = r1     // Catch:{ all -> 0x0770 }
        L_0x06d7:
            java.lang.String r1 = r9.A1l     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x06e9
            java.lang.String r0 = r7.A1l     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x06e9
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = r9.A1l     // Catch:{ all -> 0x0770 }
            r7.A1l = r0     // Catch:{ all -> 0x0770 }
        L_0x06e9:
            java.lang.String r1 = r9.A1n     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x06fb
            java.lang.String r0 = r7.A1n     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x06fb
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            java.lang.String r0 = r9.A1n     // Catch:{ all -> 0x0770 }
            r7.A1n = r0     // Catch:{ all -> 0x0770 }
        L_0x06fb:
            java.lang.String r1 = r9.A1m     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x070d
            java.lang.String r0 = r7.A1m     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x070d
            java.lang.String r0 = r9.A1m     // Catch:{ all -> 0x0770 }
            r7.A1m = r0     // Catch:{ all -> 0x0770 }
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
        L_0x070d:
            X.Rt3 r1 = r9.A0O     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x071f
            X.Rt3 r0 = r7.A0O     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x071f
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            X.Rt3 r0 = r9.A0O     // Catch:{ all -> 0x0770 }
            r7.A0O = r0     // Catch:{ all -> 0x0770 }
        L_0x071f:
            X.JwJ r1 = r9.A0E     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x0731
            X.JwJ r0 = r7.A0E     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0731
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            X.JwJ r0 = r9.A0E     // Catch:{ all -> 0x0770 }
            r7.A0E = r0     // Catch:{ all -> 0x0770 }
        L_0x0731:
            boolean r1 = r7.A2Q     // Catch:{ all -> 0x0770 }
            boolean r0 = r9.A2Q     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x073b
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A2Q = r0     // Catch:{ all -> 0x0770 }
        L_0x073b:
            java.lang.String r1 = r9.A1j     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x074b
            java.lang.String r0 = r7.A1j     // Catch:{ all -> 0x0770 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x074b
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A1j = r1     // Catch:{ all -> 0x0770 }
        L_0x074b:
            boolean r1 = r9.A2H     // Catch:{ all -> 0x0770 }
            boolean r0 = r7.A2H     // Catch:{ all -> 0x0770 }
            if (r1 == r0) goto L_0x0755
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            r7.A2H = r1     // Catch:{ all -> 0x0770 }
        L_0x0755:
            X.9Ib r1 = r9.A05     // Catch:{ all -> 0x0770 }
            if (r1 == 0) goto L_0x0767
            X.9Ib r0 = r7.A05     // Catch:{ all -> 0x0770 }
            boolean r0 = X.2PP.A00(r1, r0)     // Catch:{ all -> 0x0770 }
            if (r0 != 0) goto L_0x0767
            r7.A2C = r2     // Catch:{ all -> 0x0770 }
            X.9Ib r0 = r9.A05     // Catch:{ all -> 0x0770 }
            r7.A05 = r0     // Catch:{ all -> 0x0770 }
        L_0x0767:
            r7.A0x(r8)     // Catch:{ all -> 0x0770 }
            monitor-exit(r6)
            return
        L_0x076c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x076e }
        L_0x076e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0770 }
        L_0x0770:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254703su.A10(com.instagram.common.session.UserSession, X.3su, X.3t0):void");
    }

    public final void A11(UserSession userSession, C254763t0 r3) {
        synchronized (this) {
            A15(r3);
        }
        A0x(userSession);
    }

    public final synchronized void A12(UserSession userSession, String str) {
        OW8 ow8;
        if (str.equals(this.A1e) && (ow8 = this.A0Y) != null) {
            String str2 = ow8.A07;
            boolean equals = "created".equals(str2);
            if ("deleted".equals(str2)) {
                this.A1k = null;
            }
            this.A1e = null;
            this.A0Y = null;
            A05(userSession, this, equals);
        }
    }

    public synchronized void A13(C254933tI r2) {
        if (this.A0a != r2) {
            this.A0a = r2;
            this.A2C = true;
        }
    }

    public final synchronized void A14(1Xj r2) {
        this.A0s = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        if (r3.equals(r2.A0x) == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A15(X.C254763t0 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r1 = 1
            if (r3 != 0) goto L_0x0009
            X.3t0 r0 = r2.A0x     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0011
            goto L_0x0019
        L_0x0009:
            X.3t0 r0 = r2.A0x     // Catch:{ all -> 0x001b }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
        L_0x0011:
            X.3t0 r0 = r2.A0x     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r2.A2C = r1     // Catch:{ all -> 0x001b }
            r2.A0x = r3     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r2)
            return
        L_0x001b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254703su.A15(X.3t0):void");
    }

    @Deprecated
    public final void A16(DirectThreadKey directThreadKey) {
        DirectThreadKey directThreadKey2 = this.A0y;
        if (directThreadKey == null) {
            if (directThreadKey2 == null) {
                return;
            }
        } else if (directThreadKey.equals(directThreadKey2)) {
            return;
        }
        this.A2C = true;
        this.A0y = directThreadKey;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A17(X.2FW r4, java.lang.Object r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            X.3t8 r0 = X.C254833t8.$redex_init_class     // Catch:{ ClassCastException -> 0x0135 }
            int r0 = r4.ordinal()     // Catch:{ ClassCastException -> 0x0135 }
            switch(r0) {
                case 0: goto L_0x003b;
                case 1: goto L_0x0042;
                case 2: goto L_0x0049;
                case 3: goto L_0x0051;
                case 4: goto L_0x006f;
                case 5: goto L_0x0125;
                case 6: goto L_0x008a;
                case 11: goto L_0x0091;
                case 12: goto L_0x0098;
                case 13: goto L_0x009f;
                case 14: goto L_0x0067;
                case 15: goto L_0x00a6;
                case 20: goto L_0x00ac;
                case 22: goto L_0x00b2;
                case 24: goto L_0x00b8;
                case 26: goto L_0x00be;
                case 28: goto L_0x00b8;
                case 30: goto L_0x00c4;
                case 32: goto L_0x00ca;
                case 34: goto L_0x00d0;
                case 36: goto L_0x00d6;
                case 37: goto L_0x00dc;
                case 39: goto L_0x00e2;
                case 40: goto L_0x00e8;
                case 42: goto L_0x00ee;
                case 45: goto L_0x00f4;
                case 46: goto L_0x00fa;
                case 51: goto L_0x0100;
                case 52: goto L_0x0106;
                case 61: goto L_0x0110;
                case 92: goto L_0x0116;
                case 105: goto L_0x0120;
                default: goto L_0x000a;
            }     // Catch:{ ClassCastException -> 0x0135 }
        L_0x000a:
            boolean r0 = X.C254903tF.A00(r4)     // Catch:{ ClassCastException -> 0x0135 }
            if (r0 == 0) goto L_0x0024
            boolean r0 = r5 instanceof X.C300925yB     // Catch:{ ClassCastException -> 0x0135 }
            if (r0 == 0) goto L_0x001d
            r0 = r5
            X.5yB r0 = (X.C300925yB) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0v = r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A1U = r5     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x001d:
            r0 = r5
            java.util.List r0 = (java.util.List) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A26 = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x0024:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ClassCastException -> 0x0135 }
            r1.<init>()     // Catch:{ ClassCastException -> 0x0135 }
            java.lang.String r0 = "unsupported message type: "
            r1.append(r0)     // Catch:{ ClassCastException -> 0x0135 }
            r1.append(r4)     // Catch:{ ClassCastException -> 0x0135 }
            java.lang.String r1 = r1.toString()     // Catch:{ ClassCastException -> 0x0135 }
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ ClassCastException -> 0x0135 }
            r0.<init>(r1)     // Catch:{ ClassCastException -> 0x0135 }
            throw r0     // Catch:{ ClassCastException -> 0x0135 }
        L_0x003b:
            r0 = r5
            X.57z r0 = (X.C2814857z) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0n = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x0042:
            r0 = r5
            X.9J6 r0 = (X.AnonymousClass9J6) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A08 = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x0049:
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A09(r0)     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x0051:
            boolean r0 = r5 instanceof X.C300925yB     // Catch:{ ClassCastException -> 0x0135 }
            if (r0 == 0) goto L_0x005c
            r0 = r5
            X.5yB r0 = (X.C300925yB) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0v = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x005c:
            boolean r0 = r5 instanceof X.1Xj     // Catch:{ ClassCastException -> 0x0135 }
            if (r0 == 0) goto L_0x0125
            r0 = r5
            X.1Xj r0 = (X.1Xj) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0s = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x0067:
            r0 = r5
            X.47v r0 = (X.C2609947v) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0g = r0     // Catch:{ ClassCastException -> 0x0135 }
            java.lang.String r0 = "replayable"
            goto L_0x007f
        L_0x006f:
            boolean r0 = r5 instanceof X.C331377Qt     // Catch:{ ClassCastException -> 0x0135 }
            if (r0 == 0) goto L_0x0083
            r0 = r5
            X.7Qt r0 = (X.C331377Qt) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0w = r0     // Catch:{ ClassCastException -> 0x0135 }
            if (r0 == 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r0 = 0
            goto L_0x007f
        L_0x007d:
            java.lang.String r0 = r0.A06     // Catch:{ ClassCastException -> 0x0135 }
        L_0x007f:
            r3.A1v = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x0083:
            r0 = r5
            X.4ik r0 = (X.C271374ik) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0e = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x008a:
            r0 = r5
            X.46n r0 = (X.C2606546n) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0N = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x0091:
            r0 = r5
            X.9Iu r0 = (X.C376649Iu) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A07 = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x0098:
            r0 = r5
            com.instagram.model.direct.gifs.DirectAnimatedMedia r0 = (com.instagram.model.direct.gifs.DirectAnimatedMedia) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A11 = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x009f:
            r0 = r5
            com.instagram.model.direct.stickerstore.DirectStoreSticker r0 = (com.instagram.model.direct.stickerstore.DirectStoreSticker) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A14 = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x00a6:
            r0 = r5
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A17 = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x00ac:
            r0 = r5
            X.9JI r0 = (X.AnonymousClass9JI) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0A = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x00b2:
            r0 = r5
            X.7FN r0 = (X.AnonymousClass7FN) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0Z = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x00b8:
            r0 = r5
            X.7FJ r0 = (X.AnonymousClass7FJ) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0b = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x00be:
            r0 = r5
            X.OG7 r0 = (X.OG7) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0T = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x00c4:
            r0 = r5
            X.N4Q r0 = (X.N4Q) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0F = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x00ca:
            r0 = r5
            X.Cw5 r0 = (X.C45425Cw5) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0U = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x00d0:
            r0 = r5
            X.JwG r0 = (X.C61078JwG) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0B = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x00d6:
            r0 = r5
            X.55L r0 = (X.AnonymousClass55L) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0c = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x00dc:
            r0 = r5
            X.9Iu r0 = (X.C376649Iu) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A06 = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x00e2:
            r0 = r5
            X.Cti r0 = (X.C45279Cti) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0R = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x00e8:
            r0 = r5
            com.instagram.direct.model.DirectAREffectShare r0 = (com.instagram.direct.model.DirectAREffectShare) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0P = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x00ee:
            r0 = r5
            X.6nz r0 = (X.C317876nz) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0I = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x00f4:
            r0 = r5
            X.OMp r0 = (X.C70820OMp) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0p = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x00fa:
            r0 = r5
            X.77X r0 = (X.AnonymousClass77X) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0S = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x0100:
            r0 = r5
            X.A9t r0 = (X.C39798A9t) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0J = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x0106:
            boolean r0 = r5 instanceof X.1Xj     // Catch:{ ClassCastException -> 0x0135 }
            if (r0 == 0) goto L_0x0125
            r0 = r5
            X.1Xj r0 = (X.1Xj) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0s = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x0110:
            r0 = r5
            X.Ciz r0 = (X.C44681Ciz) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0h = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x0116:
            X.2FW r0 = X.2FW.A0j     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0z = r0     // Catch:{ ClassCastException -> 0x0135 }
            r0 = r5
            java.util.List r0 = (java.util.List) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A26 = r0     // Catch:{ ClassCastException -> 0x0135 }
            goto L_0x0125
        L_0x0120:
            r0 = r5
            X.Rt3 r0 = (X.C10488Rt3) r0     // Catch:{ ClassCastException -> 0x0135 }
            r3.A0O = r0     // Catch:{ ClassCastException -> 0x0135 }
        L_0x0125:
            X.2FW r0 = r3.A10     // Catch:{ all -> 0x0144 }
            if (r0 == r4) goto L_0x0131
            r3.A10 = r4     // Catch:{ all -> 0x0144 }
            r0 = 0
            r3.A1A = r0     // Catch:{ all -> 0x0144 }
            r0 = 1
            r3.A2C = r0     // Catch:{ all -> 0x0144 }
        L_0x0131:
            r3.A1T = r5     // Catch:{ all -> 0x0144 }
            monitor-exit(r3)
            return
        L_0x0135:
            r2 = move-exception
            java.lang.String r1 = "unsupported object type for message type: "
            java.lang.String r0 = r4.A00     // Catch:{ all -> 0x0144 }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x0144 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0144 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0144 }
            throw r0     // Catch:{ all -> 0x0144 }
        L_0x0144:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254703su.A17(X.2FW, java.lang.Object):void");
    }

    public final synchronized void A18(2FW r3, Object obj) {
        C254833t8 r0 = C254833t8.$redex_init_class;
        int ordinal = r3.ordinal();
        if (ordinal != 2) {
            if (ordinal == 3) {
                this.A1U = obj;
                if (obj instanceof C300925yB) {
                    this.A0v = (C300925yB) obj;
                } else if (obj instanceof 1Xj) {
                    this.A0s = (1Xj) obj;
                }
                this.A1v = "permanent";
            } else if (ordinal == 14) {
                this.A0g = (C2609947v) obj;
                this.A1v = "replayable";
            } else if (ordinal == 12) {
                this.A12 = (AnonymousClass53G) obj;
            } else if (ordinal != 13) {
                switch (ordinal) {
                    case 9:
                        break;
                    case 10:
                        A07((ExtendedImageUrl) obj);
                        break;
                    case 81:
                        if (obj != null) {
                            this.A0i = C71152OeO.A0B(new ExtendedImageUrl(((C317966o8) obj).A0H), C66579MXk.A00(912));
                            break;
                        }
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unsupported message type: ");
                        sb.append(r3);
                        throw new UnsupportedOperationException(sb.toString());
                }
            } else {
                this.A15 = (DirectStoreStickerResponseItem) obj;
            }
            this.A0z = r3;
        }
        A09((String) obj);
        this.A0z = r3;
    }

    public final void A19(Long l) {
        Long l2 = this.A1P;
        if (l == null) {
            if (l2 == null) {
                return;
            }
        } else if (l.equals(l2)) {
            return;
        }
        this.A1P = l;
        this.A2C = true;
    }

    public synchronized void A1B(Long l) {
        this.A1L = l;
    }

    public final void A1E(String str) {
        String str2 = this.A1c;
        if (str == null) {
            if (str2 == null) {
                return;
            }
        } else if (str.equals(str2)) {
            return;
        }
        this.A1c = str;
        this.A2C = true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.57z] */
    public final synchronized void A1F(String str) {
        if (!2PP.A00(str, this.A1X)) {
            this.A1X = str;
            this.A2C = true;
            ? obj = new Object();
            obj.A01 = "";
            obj.A02 = "undecrypted_encrypted_message";
            obj.A00 = str;
            this.A1T = obj;
        }
    }

    public final synchronized void A1G(String str) {
        if (str == null) {
            if (this.A1s == null) {
            }
        } else if (str.equals(this.A1s)) {
        }
        this.A1s = str;
        this.A2C = true;
    }

    public final synchronized void A1H(String str) {
        if (str == null) {
            if (this.A1t == null) {
            }
        } else if (str.equals(this.A1t)) {
        }
        this.A1t = str;
        this.A2C = true;
    }

    public final synchronized void A1I(String str, Integer num) {
        LinkedHashMap linkedHashMap = this.A1z;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.A1z = linkedHashMap;
        }
        if (!linkedHashMap.containsKey(str) || this.A1z.get(str) != num) {
            this.A1z.put(str, num);
            this.A2C = true;
        }
    }

    public final synchronized void A1J(List list) {
        ArrayList arrayList = new ArrayList(list);
        if (this.A24 != arrayList) {
            this.A24 = arrayList;
            this.A2C = true;
        }
    }

    public final synchronized void A1K(List list) {
        if (!2PP.A00(this.A29, list)) {
            this.A2C = true;
            this.A29 = list;
        }
    }

    public final synchronized boolean A1b() {
        boolean z;
        LinkedHashMap linkedHashMap = this.A1z;
        if (linkedHashMap != null) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                z = true;
                if (((Integer) ((Map.Entry) it.next()).getValue()).intValue() == 1) {
                    break;
                }
            }
        }
        z = false;
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r1 != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A1c() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A1S()     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0010
            X.N4L r0 = r2.A0D     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.A06     // Catch:{ all -> 0x0013 }
            r0 = 1
            if (r1 == 0) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            monitor-exit(r2)
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254703su.A1c():boolean");
    }

    public final synchronized boolean A1d() {
        return this.A2Q;
    }

    public final synchronized boolean A1h(UserSession userSession, Collection collection) {
        HashSet hashSet;
        boolean z;
        List list = this.A22;
        if (list == null) {
            hashSet = new HashSet();
        } else {
            hashSet = new HashSet(list);
        }
        if (hashSet.equals(new HashSet(collection))) {
            z = false;
        } else {
            A04(userSession, this, ImmutableList.copyOf(collection));
            z = true;
            this.A2C = true;
            A06(this);
        }
        return z;
    }

    public final boolean A1k(User user) {
        List list;
        synchronized (this) {
            list = this.A27;
        }
        if (list.contains(user)) {
            return true;
        }
        ImmutableList A0J2 = A0J();
        if (A0J2 == null) {
            return false;
        }
        Iterator it = A0J2.iterator();
        while (it.hasNext()) {
            if (((DirectCountBasedReaction) it.next()).A02) {
                return true;
            }
        }
        return false;
    }

    public final boolean A1n(Long l) {
        Long l2;
        if (l == null || !A1T() || (l2 = this.A1L) == null) {
            return false;
        }
        Long l3 = this.A1N;
        long longValue = l2.longValue();
        if (l3 != null) {
            longValue = Math.min(longValue, l3.longValue());
        }
        return longValue < l.longValue();
    }

    public static C254703su A01(C2606546n r3, AnonymousClass5FY r4, C254933tI r5, C254763t0 r6, 2FW r7, 2FW r8, User user, Boolean bool, Long l, Long l2, Long l3, Long l4, Object obj, Object obj2, String str, String str2, List list, List list2, long j, boolean z, boolean z2, boolean z3) {
        C254703su r1 = new C254703su();
        r1.A17(r7, obj);
        r1.A02();
        String str3 = str2;
        if (str2 != null) {
            r1.A1V = str3;
        }
        if (user != null) {
            r1.A1u = user.getId();
        }
        if (r1.A1u == null) {
            0wb.A03("Direct Message user id is null", "DirectMessage.createPendingMessage");
        }
        r1.A1W = str;
        r1.A1A(Long.valueOf(j));
        r1.A19(l);
        r1.A1m(AnonymousClass05K.A01);
        r1.A2T = r5;
        if (l4 != null && !l4.equals(r1.A1Q)) {
            r1.A2C = true;
            r1.A1Q = l4;
            r1.A2D = true;
        }
        if (r8 != null) {
            Object obj3 = obj2;
            if (obj2 != null) {
                r1.A18(r8, obj3);
            }
        }
        r1.A0N = r3;
        r1.A2P = z;
        r1.A1K = l2;
        r1.A1M = l3;
        r1.A0V = r4;
        r1.A2F = z2;
        r1.A28 = list;
        r1.A2O = z3;
        r1.A21 = list2;
        r1.A0x = r6;
        if (bool != null) {
            r1.A1C = bool;
        }
        return r1;
    }

    private void A02() {
        String str;
        if (Systrace.A0E(32)) {
            0fh.A01("DirectMessage.updateIsMessageEmoji", 1365118592);
        }
        try {
            2FW r2 = this.A10;
            boolean z = true;
            if (r2 == 2FW.A1g) {
                String str2 = this.A1q;
                if (str2 == null || !0mp.A0E(str2)) {
                    z = false;
                }
                this.A1A = Boolean.valueOf(z);
            } else if (r2 == 2FW.A1c) {
                this.A0p.getClass();
                C70820OMp oMp = this.A0p;
                String str3 = oMp.A05;
                if (oMp.A03 != AnonymousClass05K.A01 && ((str = oMp.A04) == null || str.isEmpty() || !str.equals("❤"))) {
                    if (str3 == null || !0mp.A0E(str3)) {
                        z = false;
                    }
                }
                this.A1A = Boolean.valueOf(z);
            } else {
                this.A1A = false;
            }
        } finally {
            if (Systrace.A0E(32)) {
                0fh.A00(1884815889);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (X.182.A06(r3, r9, 36314644272646895L) != false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03(com.instagram.common.session.UserSession r9) {
        /*
            r8 = this;
            r6 = 32
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)
            if (r0 == 0) goto L_0x0010
            r1 = -1131320761(0xffffffffbc916a47, float:-0.017750872)
            java.lang.String r0 = "DirectMessage.updateShouldShowHFI"
            X.0fh.A01(r0, r1)
        L_0x0010:
            java.lang.Integer r0 = r8.A1E     // Catch:{ all -> 0x0048 }
            r5 = 1
            if (r0 == 0) goto L_0x0039
            int r4 = r0.intValue()     // Catch:{ all -> 0x0048 }
            r0 = 0
            X.0qQ.A0B(r9, r0)     // Catch:{ all -> 0x0048 }
            X.0Tu r3 = X.0Tu.A05     // Catch:{ all -> 0x0048 }
            r0 = 36596119249226056(0x8203fa00020948, double:3.2068714017302224E-306)
            long r1 = X.182.A01(r3, r9, r0)     // Catch:{ all -> 0x0048 }
            int r0 = (int) r1     // Catch:{ all -> 0x0048 }
            if (r4 < r0) goto L_0x0039
            r0 = 36314644272646895(0x8103fa00040aef, double:3.028865493132804E-306)
            boolean r0 = X.182.A06(r3, r9, r0)     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0039
        L_0x0036:
            r8.A2S = r5     // Catch:{ all -> 0x0048 }
            goto L_0x003b
        L_0x0039:
            r5 = 0
            goto L_0x0036
        L_0x003b:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)
            if (r0 == 0) goto L_0x0047
            r0 = 1906293029(0x719fb925, float:1.5818222E30)
            X.0fh.A00(r0)
        L_0x0047:
            return
        L_0x0048:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)
            if (r0 == 0) goto L_0x0055
            r0 = 1092083021(0x4117dd4d, float:9.4915285)
            X.0fh.A00(r0)
        L_0x0055:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254703su.A03(com.instagram.common.session.UserSession):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        if (r1.equals("❤") != false) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A05(com.instagram.common.session.UserSession r21, X.C254703su r22, boolean r23) {
        /*
            r11 = r22
            monitor-enter(r11)
            r15 = 32
            boolean r0 = com.facebook.systrace.Systrace.A0E(r15)     // Catch:{ all -> 0x0215 }
            if (r0 == 0) goto L_0x0013
            java.lang.String r1 = "DirectMessage.updateReactorsList"
            r0 = 1033996641(0x3da18961, float:0.07887531)
            X.0fh.A01(r1, r0)     // Catch:{ all -> 0x0215 }
        L_0x0013:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0207 }
            r10.<init>()     // Catch:{ all -> 0x0207 }
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0207 }
            r9.<init>()     // Catch:{ all -> 0x0207 }
            java.util.LinkedHashMap r8 = r11.A1y     // Catch:{ all -> 0x0207 }
            if (r8 != 0) goto L_0x0026
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0207 }
            r8.<init>()     // Catch:{ all -> 0x0207 }
        L_0x0026:
            r12 = r21
            X.17i r7 = X.17h.A00(r12)     // Catch:{ all -> 0x0207 }
            java.lang.String r6 = r12.A06     // Catch:{ all -> 0x0207 }
            com.instagram.user.model.User r5 = r7.A02(r6)     // Catch:{ all -> 0x0207 }
            X.OW8 r0 = r11.A0Y     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x01ad
            java.lang.String r4 = r0.A01     // Catch:{ all -> 0x0207 }
            if (r4 == 0) goto L_0x01ad
        L_0x003a:
            java.util.LinkedHashMap r0 = r11.A1y     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x01a6
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x01a6
            java.util.LinkedHashMap r0 = r11.A1y     // Catch:{ all -> 0x0207 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0207 }
            X.4ur r0 = (X.C277304ur) r0     // Catch:{ all -> 0x0207 }
            java.util.List r3 = r0.A00     // Catch:{ all -> 0x0207 }
        L_0x004e:
            X.OW8 r2 = r11.A0Y     // Catch:{ all -> 0x0207 }
            if (r2 == 0) goto L_0x00d1
            java.lang.String r0 = "created"
            java.lang.String r1 = r2.A07     // Catch:{ all -> 0x0207 }
            boolean r13 = r0.equals(r1)     // Catch:{ all -> 0x0207 }
            if (r13 != 0) goto L_0x006c
            java.lang.String r0 = "deleted"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0207 }
            if (r0 != 0) goto L_0x006c
            java.lang.String r0 = "Local reaction has unknown reaction status."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0207 }
            r1.<init>(r0)     // Catch:{ all -> 0x0207 }
        L_0x006b:
            throw r1     // Catch:{ all -> 0x0207 }
        L_0x006c:
            if (r5 == 0) goto L_0x00d1
            if (r13 == 0) goto L_0x00d1
            java.lang.String r1 = r2.A01     // Catch:{ all -> 0x0207 }
            if (r1 == 0) goto L_0x007e
            com.google.common.collect.ImmutableList r0 = X.C254853tA.A07     // Catch:{ all -> 0x0207 }
            java.lang.String r0 = "❤"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x0081
        L_0x007e:
            r10.add(r5)     // Catch:{ all -> 0x0207 }
        L_0x0081:
            X.OKl r0 = r2.A00     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x00fb
            java.lang.String r13 = r0.A02     // Catch:{ all -> 0x0207 }
            if (r13 == 0) goto L_0x00fb
            r0 = -1
            com.instagram.model.mediasize.ExtendedImageUrl r1 = new com.instagram.model.mediasize.ExtendedImageUrl     // Catch:{ all -> 0x0207 }
            r1.<init>(r13, r0, r0)     // Catch:{ all -> 0x0207 }
        L_0x008f:
            java.lang.String r20 = r5.getId()     // Catch:{ all -> 0x0207 }
            java.lang.String r13 = r2.A08     // Catch:{ all -> 0x0207 }
            r19 = 0
            X.46u r0 = new X.46u     // Catch:{ all -> 0x0207 }
            r21 = r4
            r22 = r13
            r17 = r0
            r18 = r1
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0207 }
            r9.put(r5, r0)     // Catch:{ all -> 0x0207 }
            java.util.Iterator r14 = r3.iterator()     // Catch:{ all -> 0x0207 }
        L_0x00ab:
            boolean r1 = r14.hasNext()     // Catch:{ all -> 0x0207 }
            if (r1 == 0) goto L_0x00c6
            java.lang.String r13 = r5.getId()     // Catch:{ all -> 0x0207 }
            java.lang.Object r1 = r14.next()     // Catch:{ all -> 0x0207 }
            X.46u r1 = (X.C2607246u) r1     // Catch:{ all -> 0x0207 }
            java.lang.String r1 = r1.A03     // Catch:{ all -> 0x0207 }
            boolean r1 = r13.equals(r1)     // Catch:{ all -> 0x0207 }
            if (r1 == 0) goto L_0x00ab
            r14.remove()     // Catch:{ all -> 0x0207 }
        L_0x00c6:
            r3.add(r0)     // Catch:{ all -> 0x0207 }
            X.4ur r0 = new X.4ur     // Catch:{ all -> 0x0207 }
            r0.<init>(r3)     // Catch:{ all -> 0x0207 }
            r8.put(r4, r0)     // Catch:{ all -> 0x0207 }
        L_0x00d1:
            X.46s r0 = r11.A0X     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x011f
            java.util.List r0 = r0.A01     // Catch:{ all -> 0x0207 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x0207 }
        L_0x00db:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x00fd
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x0207 }
            X.46u r0 = (X.C2607246u) r0     // Catch:{ all -> 0x0207 }
            java.lang.String r0 = r0.A00()     // Catch:{ all -> 0x0207 }
            com.instagram.user.model.User r1 = r7.A02(r0)     // Catch:{ all -> 0x0207 }
            if (r1 == 0) goto L_0x00db
            boolean r0 = r10.contains(r1)     // Catch:{ all -> 0x0207 }
            if (r0 != 0) goto L_0x00db
            r10.add(r1)     // Catch:{ all -> 0x0207 }
            goto L_0x00db
        L_0x00fb:
            r1 = 0
            goto L_0x008f
        L_0x00fd:
            X.46s r0 = r11.A0X     // Catch:{ all -> 0x0207 }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x0207 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x0207 }
        L_0x0105:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x011f
            java.lang.Object r1 = r13.next()     // Catch:{ all -> 0x0207 }
            X.46u r1 = (X.C2607246u) r1     // Catch:{ all -> 0x0207 }
            java.lang.String r0 = r1.A00()     // Catch:{ all -> 0x0207 }
            com.instagram.user.model.User r0 = r7.A02(r0)     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x0105
            r9.put(r0, r1)     // Catch:{ all -> 0x0207 }
            goto L_0x0105
        L_0x011f:
            if (r2 == 0) goto L_0x015b
            if (r5 == 0) goto L_0x015b
            java.lang.String r1 = "deleted"
            java.lang.String r0 = r2.A07     // Catch:{ all -> 0x0207 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x015b
            r10.remove(r5)     // Catch:{ all -> 0x0207 }
            r9.remove(r5)     // Catch:{ all -> 0x0207 }
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x0207 }
        L_0x0137:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x0152
            java.lang.String r1 = r5.getId()     // Catch:{ all -> 0x0207 }
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0207 }
            X.46u r0 = (X.C2607246u) r0     // Catch:{ all -> 0x0207 }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x0207 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x0137
            r2.remove()     // Catch:{ all -> 0x0207 }
        L_0x0152:
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x015b
            r8.remove(r4)     // Catch:{ all -> 0x0207 }
        L_0x015b:
            java.util.List r1 = r11.A27     // Catch:{ all -> 0x0207 }
            r11.A27 = r10     // Catch:{ all -> 0x0207 }
            boolean r0 = r10.equals(r1)     // Catch:{ all -> 0x0207 }
            r3 = 1
            if (r0 != 0) goto L_0x01b3
            r11.A2C = r3     // Catch:{ all -> 0x0207 }
            if (r23 == 0) goto L_0x0185
            java.util.List r0 = r11.A2V     // Catch:{ all -> 0x0207 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0207 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x01b3
            r1.next()     // Catch:{ all -> 0x0207 }
            r11.A0h()     // Catch:{ all -> 0x0207 }
            java.lang.String r0 = "onLikedByMe"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x0207 }
            r1.<init>(r0)     // Catch:{ all -> 0x0207 }
            goto L_0x006b
        L_0x0185:
            X.AnonymousClass50m.A01(r12, r6, r1)     // Catch:{ all -> 0x0207 }
            X.AnonymousClass50m.A01(r12, r6, r10)     // Catch:{ all -> 0x0207 }
            java.util.List r0 = r11.A2V     // Catch:{ all -> 0x0207 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0207 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x01b3
            r1.next()     // Catch:{ all -> 0x0207 }
            r11.A0h()     // Catch:{ all -> 0x0207 }
            java.lang.String r0 = "onLikersStateChange"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x0207 }
            r1.<init>(r0)     // Catch:{ all -> 0x0207 }
            goto L_0x006b
        L_0x01a6:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0207 }
            r3.<init>()     // Catch:{ all -> 0x0207 }
            goto L_0x004e
        L_0x01ad:
            com.google.common.collect.ImmutableList r0 = X.C254853tA.A07     // Catch:{ all -> 0x0207 }
            java.lang.String r4 = "❤"
            goto L_0x003a
        L_0x01b3:
            java.util.List r5 = r11.A25     // Catch:{ all -> 0x0207 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0207 }
            r4.<init>()     // Catch:{ all -> 0x0207 }
            r11.A1y = r8     // Catch:{ all -> 0x0207 }
            java.util.Collection r0 = r8.values()     // Catch:{ all -> 0x0207 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0207 }
        L_0x01c4:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0207 }
            if (r0 == 0) goto L_0x01d6
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0207 }
            X.4ur r0 = (X.C277304ur) r0     // Catch:{ all -> 0x0207 }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x0207 }
            r4.addAll(r0)     // Catch:{ all -> 0x0207 }
            goto L_0x01c4
        L_0x01d6:
            X.0Tu r2 = X.0Tu.A06     // Catch:{ all -> 0x0207 }
            r0 = 36320266384842892(0x8109170004208c, double:3.0324209395239815E-306)
            boolean r0 = X.182.A06(r2, r12, r0)     // Catch:{ all -> 0x0207 }
            if (r0 != 0) goto L_0x01ec
            java.util.Collection r0 = r9.values()     // Catch:{ all -> 0x0207 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0207 }
            r4.<init>(r0)     // Catch:{ all -> 0x0207 }
        L_0x01ec:
            r11.A25 = r4     // Catch:{ all -> 0x0207 }
            boolean r0 = r4.equals(r5)     // Catch:{ all -> 0x0207 }
            if (r0 != 0) goto L_0x01f9
            r11.A2C = r3     // Catch:{ all -> 0x0207 }
            A06(r11)     // Catch:{ all -> 0x0207 }
        L_0x01f9:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r15)     // Catch:{ all -> 0x0215 }
            if (r0 == 0) goto L_0x0205
            r0 = -2119416792(0xffffffff81ac4428, float:-6.328062E-38)
            X.0fh.A00(r0)     // Catch:{ all -> 0x0215 }
        L_0x0205:
            monitor-exit(r11)
            return
        L_0x0207:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r15)     // Catch:{ all -> 0x0215 }
            if (r0 == 0) goto L_0x0214
            r0 = 913102628(0x366cd724, float:3.5291969E-6)
            X.0fh.A00(r0)     // Catch:{ all -> 0x0215 }
        L_0x0214:
            throw r1     // Catch:{ all -> 0x0215 }
        L_0x0215:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254703su.A05(com.instagram.common.session.UserSession, X.3su, boolean):void");
    }

    public static void A06(C254703su r2) {
        Iterator it = r2.A2W.iterator();
        if (it.hasNext()) {
            it.next();
            r2.A0h();
            throw new NullPointerException("onReactionsStateChange");
        }
    }

    private void A09(String str) {
        if (!2PP.A00(str, this.A1q)) {
            this.A1q = str;
            this.A1A = null;
            this.A2C = true;
        }
    }

    public final long A0D() {
        Long l = this.A1P;
        if (l != null) {
            return l.longValue();
        }
        return C7c();
    }

    public final AnonymousClass5FV A0G() {
        AnonymousClass5FV r0;
        AnonymousClass5FY r02 = this.A0V;
        if (r02 == null || (r0 = r02.A00) == null) {
            return AnonymousClass5FV.None;
        }
        return r0;
    }

    public final ImmutableList A0H() {
        List list = this.A26;
        if (list == null) {
            return null;
        }
        return ImmutableList.copyOf((Collection) list);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object, X.57z] */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.Object, X.57z] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:17|49|25|26|(3:28|29|(6:35|(1:37)(1:38)|39|(4:41|(1:43)|44|(5:50|(1:52)(1:53)|54|(1:59)(1:58)|(1:62)))|63|(2:65|(4:67|(1:69)|70|(1:72)(2:73|(1:75)(2:76|(1:78)(1:(1:80)(2:81|(1:83)(2:84|(1:86))))))))))|87|88|89) */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02f8, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0330, code lost:
        if (r6 != null) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0332, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0334, code lost:
        if (r3.A1Y != null) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0336, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("Encountered DirectMessage with null content: type=");
        r4.append(r3.A10);
        X.0wb.A04("DirectMessage_postprocess_nullContent", r4.toString(), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0356, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x04a0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x04a1, code lost:
        if (r15 != false) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x04a3, code lost:
        X.0fh.A00(-371447704);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x04a9, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x016b */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01ba A[SYNTHETIC, Splitter:B:111:0x01ba] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0212 A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0216 A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0224 A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0244 A[SYNTHETIC, Splitter:B:140:0x0244] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0248 A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x026b A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0284 A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x028c A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0294 A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0298 A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x029c A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02a0 A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02fa A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0304 A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0307 A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x030a A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x030d A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0310 A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0313 A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0316 A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0319 A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x031c A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x031f A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0322 A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0325 A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0328 A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x032b A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x032e A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x037a A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03ca A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0453 A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0465 A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x046b A[Catch:{ all -> 0x04a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0477 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0176 A[Catch:{ all -> 0x04a0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C254703su A0N(com.instagram.common.session.UserSession r45, X.C254763t0 r46) {
        /*
            r44 = this;
            r3 = r44
            r13 = 32
            boolean r0 = com.facebook.systrace.Systrace.A0E(r13)
            r11 = 0
            r1 = 1
            if (r0 == 0) goto L_0x001a
            X.2FW r4 = r3.A10
            if (r4 == 0) goto L_0x001a
            r15 = 1
            java.lang.String r2 = "DirectMessage.postprocess.%s"
            r0 = 808487049(0x30308889, float:6.4222455E-10)
            X.0fh.A03(r2, r4, r0)
            goto L_0x001b
        L_0x001a:
            r15 = 0
        L_0x001b:
            java.lang.String r10 = "DirectMessage"
            r3.A2C = r1     // Catch:{ all -> 0x04a0 }
            java.lang.String r0 = r3.A1r     // Catch:{ all -> 0x04a0 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x04a0 }
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = r3.A1r     // Catch:{ all -> 0x04a0 }
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x04a0 }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x04a0 }
            r3.A1A(r0)     // Catch:{ all -> 0x04a0 }
        L_0x0034:
            X.2FW r2 = r3.A10     // Catch:{ all -> 0x04a0 }
            r0 = 0
            if (r2 != 0) goto L_0x0049
            java.lang.String r3 = "DirectMessage_postprocess_nullContent"
            java.lang.String r2 = "Encountered DirectMessage with null type"
            X.0wb.A04(r3, r2, r1)     // Catch:{ all -> 0x04a0 }
            if (r15 == 0) goto L_0x0048
            r1 = 1120136663(0x42c3edd7, float:97.96453)
            X.0fh.A00(r1)
        L_0x0048:
            return r0
        L_0x0049:
            monitor-enter(r3)     // Catch:{ all -> 0x04a0 }
            X.3t0 r2 = r3.A0x     // Catch:{ all -> 0x0498 }
            r6 = r46
            if (r2 != 0) goto L_0x0053
            r3.A15(r6)     // Catch:{ all -> 0x0498 }
        L_0x0053:
            monitor-exit(r3)     // Catch:{ all -> 0x049a }
            X.2FW r5 = r3.A10     // Catch:{ all -> 0x04a0 }
            X.2FW r4 = X.2FW.A1H     // Catch:{ all -> 0x04a0 }
            r2 = r45
            if (r5 != r4) goto L_0x016b
            java.lang.String r4 = r3.A1i     // Catch:{ IOException -> 0x016b }
            if (r4 == 0) goto L_0x016b
            X.16F r4 = X.16P.A00(r4)     // Catch:{ IOException -> 0x016b }
            X.JwJ r4 = X.C44668Cim.parseFromJson(r4)     // Catch:{ IOException -> 0x016b }
            if (r4 == 0) goto L_0x016b
            java.lang.Object r4 = r4.A00     // Catch:{ IOException -> 0x016b }
            X.BBV r4 = (X.BBV) r4     // Catch:{ IOException -> 0x016b }
            if (r4 == 0) goto L_0x016b
            java.lang.String r4 = r4.A00     // Catch:{ IOException -> 0x016b }
            r9 = 2
            byte[] r5 = android.util.Base64.decode(r4, r9)     // Catch:{ IOException -> 0x016b }
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r4 = com.instagram.direct.armadilloexpress.transportpayload.TransportPayload.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x016b }
            X.R5b r8 = X.R5b.A04(r4, r5)     // Catch:{ IOException -> 0x016b }
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r8 = (com.instagram.direct.armadilloexpress.transportpayload.TransportPayload) r8     // Catch:{ IOException -> 0x016b }
            r8.toString()     // Catch:{ IOException -> 0x016b }
            if (r46 != 0) goto L_0x0086
            r7 = r0
            goto L_0x0088
        L_0x0086:
            java.lang.String r7 = r6.A00     // Catch:{ IOException -> 0x016b }
        L_0x0088:
            com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload r5 = r8.A0L()     // Catch:{ IOException -> 0x016b }
            int r4 = r5.bitField0_     // Catch:{ IOException -> 0x016b }
            r4 = r4 & 2
            if (r4 == 0) goto L_0x010a
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r5 = r5.metadata_     // Catch:{ IOException -> 0x016b }
            if (r5 != 0) goto L_0x0098
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata r5 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageMetadata.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x016b }
        L_0x0098:
            int r4 = r5.bitField0_     // Catch:{ IOException -> 0x016b }
            r4 = r4 & 4
            if (r4 == 0) goto L_0x010a
            com.instagram.direct.armadilloexpress.transportpayload.RepliedToMessage r12 = r5.repliedToMessage_     // Catch:{ IOException -> 0x016b }
            if (r12 != 0) goto L_0x00a6
            com.instagram.direct.armadilloexpress.transportpayload.RepliedToMessage r12 = com.instagram.direct.armadilloexpress.transportpayload.RepliedToMessage.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x016b }
            if (r12 == 0) goto L_0x010a
        L_0x00a6:
            int r5 = r12.bitField0_     // Catch:{ IOException -> 0x016b }
            r4 = r5 & 1
            if (r4 == 0) goto L_0x00af
            java.lang.String r6 = r12.repliedToMessageOtid_     // Catch:{ IOException -> 0x016b }
            goto L_0x00b0
        L_0x00af:
            r6 = 0
        L_0x00b0:
            r4 = r5 & 2
            if (r4 == 0) goto L_0x00bf
            java.lang.String r5 = r12.repliedToMessageWaServerTimeSec_     // Catch:{ IOException -> 0x016b }
            if (r5 == 0) goto L_0x00bf
            r4 = 10
            java.lang.Long r4 = X.00y.A0n(r4, r5)     // Catch:{ IOException -> 0x016b }
            goto L_0x00c0
        L_0x00bf:
            r4 = 0
        L_0x00c0:
            if (r6 == 0) goto L_0x010a
            if (r4 == 0) goto L_0x010a
            long r4 = r4.longValue()     // Catch:{ IOException -> 0x016b }
            java.lang.String r36 = X.C2611348j.A04(r6, r4)     // Catch:{ IOException -> 0x016b }
            X.2FW r29 = X.2FW.A1M     // Catch:{ IOException -> 0x016b }
            java.lang.String r38 = "0"
            java.lang.String r37 = ""
            java.lang.Boolean r33 = java.lang.Boolean.valueOf(r11)     // Catch:{ IOException -> 0x016b }
            r42 = 0
            X.3tI r4 = new X.3tI     // Catch:{ IOException -> 0x016b }
            r18 = r0
            r19 = r0
            r20 = r0
            r21 = r0
            r22 = r0
            r23 = r0
            r24 = r0
            r25 = r0
            r26 = r0
            r27 = r0
            r28 = r0
            r30 = r0
            r31 = r0
            r32 = r0
            r34 = r6
            r35 = r0
            r39 = r0
            r40 = r0
            r41 = r0
            r16 = r4
            r17 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ IOException -> 0x016b }
            r3.A13(r4)     // Catch:{ IOException -> 0x016b }
        L_0x010a:
            int r4 = r8.transportPayloadCase_     // Catch:{ IOException -> 0x016b }
            if (r4 != r1) goto L_0x016b
            com.instagram.direct.armadilloexpress.transportpayload.AddMessagePayload r5 = r8.A0L()     // Catch:{ IOException -> 0x016b }
            int r4 = r5.bitField0_     // Catch:{ IOException -> 0x016b }
            r4 = r4 & 1
            if (r4 == 0) goto L_0x016b
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r6 = r5.content_     // Catch:{ IOException -> 0x016b }
            if (r6 != 0) goto L_0x011e
            com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r6 = com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x016b }
        L_0x011e:
            int r5 = r6.addMessageContentCase_     // Catch:{ IOException -> 0x016b }
            if (r5 != r1) goto L_0x012a
            com.instagram.direct.armadilloexpress.transportpayload.Text r4 = r6.A0N()     // Catch:{ IOException -> 0x016b }
            X.C70060Nwc.A00(r2, r4, r3)     // Catch:{ IOException -> 0x016b }
            goto L_0x016b
        L_0x012a:
            r4 = 5
            if (r5 != r4) goto L_0x0141
            com.instagram.direct.armadilloexpress.transportpayload.Media r17 = r6.A0L()     // Catch:{ IOException -> 0x016b }
            boolean r4 = r3.A2F     // Catch:{ IOException -> 0x016b }
            r16 = r2
            r18 = r3
            r19 = r0
            r20 = r7
            r21 = r4
            X.C71113Od4.A05(r16, r17, r18, r19, r20, r21)     // Catch:{ IOException -> 0x016b }
            goto L_0x016b
        L_0x0141:
            r4 = 4
            if (r5 != r4) goto L_0x014c
            com.instagram.direct.armadilloexpress.transportpayload.ReceiverFetchXma r4 = r6.A0M()     // Catch:{ IOException -> 0x016b }
            X.C70061Nwd.A00(r2, r4, r3, r0, r7)     // Catch:{ IOException -> 0x016b }
            goto L_0x016b
        L_0x014c:
            if (r5 != r9) goto L_0x0156
            X.2FW r5 = X.2FW.A16     // Catch:{ IOException -> 0x016b }
            java.lang.String r4 = "❤"
            r3.A17(r5, r4)     // Catch:{ IOException -> 0x016b }
            goto L_0x016b
        L_0x0156:
            r4 = 3
            if (r5 != r4) goto L_0x0161
            java.lang.Object r4 = r6.addMessageContent_     // Catch:{ IOException -> 0x016b }
            com.instagram.direct.armadilloexpress.transportpayload.Link r4 = (com.instagram.direct.armadilloexpress.transportpayload.Link) r4     // Catch:{ IOException -> 0x016b }
            X.C70059Nwb.A00(r2, r4, r3, r0, r7)     // Catch:{ IOException -> 0x016b }
            goto L_0x016b
        L_0x0161:
            r4 = 7
            if (r5 != r4) goto L_0x016b
            java.lang.Object r4 = r6.addMessageContent_     // Catch:{ IOException -> 0x016b }
            com.instagram.direct.armadilloexpress.transportpayload.Collection r4 = (com.instagram.direct.armadilloexpress.transportpayload.Collection) r4     // Catch:{ IOException -> 0x016b }
            X.C71051OaT.A00(r2, r4, r3, r0, r7)     // Catch:{ IOException -> 0x016b }
        L_0x016b:
            X.3t8 r4 = X.C254833t8.$redex_init_class     // Catch:{ all -> 0x04a0 }
            X.2FW r5 = r3.A10     // Catch:{ all -> 0x04a0 }
            int r4 = r5.ordinal()     // Catch:{ all -> 0x04a0 }
            switch(r4) {
                case 0: goto L_0x0212;
                case 1: goto L_0x0216;
                case 2: goto L_0x0224;
                case 3: goto L_0x0248;
                case 4: goto L_0x02a0;
                case 5: goto L_0x02fa;
                case 6: goto L_0x0304;
                case 7: goto L_0x0307;
                case 11: goto L_0x030d;
                case 12: goto L_0x0284;
                case 13: goto L_0x028c;
                case 14: goto L_0x031c;
                case 15: goto L_0x0244;
                case 20: goto L_0x01ba;
                case 22: goto L_0x026b;
                case 28: goto L_0x0294;
                case 30: goto L_0x0298;
                case 32: goto L_0x029c;
                case 34: goto L_0x0310;
                case 36: goto L_0x030a;
                case 37: goto L_0x0313;
                case 39: goto L_0x031f;
                case 40: goto L_0x0322;
                case 42: goto L_0x0325;
                case 45: goto L_0x0328;
                case 46: goto L_0x0316;
                case 53: goto L_0x032b;
                case 61: goto L_0x0319;
                case 100: goto L_0x0357;
                case 105: goto L_0x032e;
                case 108: goto L_0x037a;
                default: goto L_0x0176;
            }     // Catch:{ all -> 0x04a0 }
        L_0x0176:
            boolean r4 = X.C254903tF.A00(r5)     // Catch:{ all -> 0x04a0 }
            if (r4 == 0) goto L_0x02f8
            monitor-enter(r3)     // Catch:{ all -> 0x04a0 }
            java.util.List r4 = r3.A26     // Catch:{ all -> 0x01b6 }
            if (r4 == 0) goto L_0x0192
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r4)     // Catch:{ all -> 0x01b6 }
            X.2FW r5 = r3.A0z     // Catch:{ all -> 0x01b6 }
            X.2FW r4 = X.2FW.A1A     // Catch:{ all -> 0x01b6 }
            if (r5 != r4) goto L_0x018f
            X.1Xj r4 = r3.A0s     // Catch:{ all -> 0x01b6 }
            r3.A1U = r4     // Catch:{ all -> 0x01b6 }
        L_0x018f:
            monitor-exit(r3)     // Catch:{ all -> 0x01b6 }
            goto L_0x0330
        L_0x0192:
            X.1Xj r4 = r3.A0s     // Catch:{ all -> 0x01b6 }
            if (r4 == 0) goto L_0x01b4
            X.1iA r5 = r4.BR7()     // Catch:{ all -> 0x01b6 }
            X.1iA r4 = X.1iA.A0a     // Catch:{ all -> 0x01b6 }
            if (r5 != r4) goto L_0x01a9
            X.1Xj r4 = r3.A0s     // Catch:{ all -> 0x01b6 }
            X.1Xy r5 = r4.A0C     // Catch:{ all -> 0x01b6 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x01b6 }
            r5.EUG(r4)     // Catch:{ all -> 0x01b6 }
        L_0x01a9:
            java.lang.String r5 = r3.A1u     // Catch:{ all -> 0x01b6 }
            X.1Xj r4 = r3.A0s     // Catch:{ all -> 0x01b6 }
            X.1Xj r6 = X.C2606746p.A01(r2, r4, r5)     // Catch:{ all -> 0x01b6 }
            r3.A0s = r6     // Catch:{ all -> 0x01b6 }
            goto L_0x018f
        L_0x01b4:
            r6 = r0
            goto L_0x018f
        L_0x01b6:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01b6 }
            goto L_0x049f
        L_0x01ba:
            X.9JI r4 = r3.A0A     // Catch:{ all -> 0x04a0 }
            if (r4 == 0) goto L_0x01e7
            java.lang.String r8 = r4.A03     // Catch:{ all -> 0x04a0 }
        L_0x01c0:
            X.1Xj r5 = r3.A0t     // Catch:{ all -> 0x04a0 }
            if (r5 == 0) goto L_0x01e9
            java.lang.String r4 = r3.A1u     // Catch:{ all -> 0x04a0 }
            X.1Xj r5 = X.C2606746p.A02(r2, r5, r4)     // Catch:{ all -> 0x04a0 }
            java.lang.Integer r18 = r5.A2Q()     // Catch:{ all -> 0x04a0 }
            X.1Xy r4 = r5.A0C     // Catch:{ all -> 0x04a0 }
            java.lang.String r20 = r4.Am5()     // Catch:{ all -> 0x04a0 }
            X.9JI r6 = new X.9JI     // Catch:{ all -> 0x04a0 }
            r16 = r6
            r17 = r5
            r19 = r0
            r21 = r8
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x04a0 }
            r3.A0A = r6     // Catch:{ all -> 0x04a0 }
            r3.A0t = r0     // Catch:{ all -> 0x04a0 }
            goto L_0x0391
        L_0x01e7:
            r8 = r0
            goto L_0x01c0
        L_0x01e9:
            if (r4 == 0) goto L_0x02f8
            java.lang.String r5 = r3.A1u     // Catch:{ all -> 0x04a0 }
            java.lang.Object r4 = r4.A00     // Catch:{ all -> 0x04a0 }
            X.1Xj r4 = (X.1Xj) r4     // Catch:{ all -> 0x04a0 }
            X.1Xj r17 = X.C2606746p.A02(r2, r4, r5)     // Catch:{ all -> 0x04a0 }
            X.9JI r4 = r3.A0A     // Catch:{ all -> 0x04a0 }
            java.lang.String r7 = r4.A04     // Catch:{ all -> 0x04a0 }
            java.lang.Object r5 = r4.A01     // Catch:{ all -> 0x04a0 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x04a0 }
            java.lang.String r4 = r4.A02     // Catch:{ all -> 0x04a0 }
            X.9JI r6 = new X.9JI     // Catch:{ all -> 0x04a0 }
            r16 = r6
            r18 = r5
            r19 = r7
            r20 = r4
            r21 = r8
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x04a0 }
            r3.A0A = r6     // Catch:{ all -> 0x04a0 }
            goto L_0x0391
        L_0x0212:
            X.57z r6 = r3.A0n     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x0216:
            X.9J6 r6 = r3.A08     // Catch:{ all -> 0x04a0 }
            X.2FW r5 = r3.A0z     // Catch:{ all -> 0x04a0 }
            X.2FW r4 = X.2FW.A1A     // Catch:{ all -> 0x04a0 }
            if (r5 != r4) goto L_0x0330
            X.1Xj r4 = r3.A0s     // Catch:{ all -> 0x04a0 }
            r3.A1U = r4     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x0224:
            java.lang.String r6 = r3.A1q     // Catch:{ all -> 0x04a0 }
            monitor-enter(r3)     // Catch:{ all -> 0x04a0 }
            X.53G r5 = r3.A12     // Catch:{ all -> 0x0240 }
            if (r5 == 0) goto L_0x023d
            X.5FY r4 = r3.A0V     // Catch:{ all -> 0x0240 }
            if (r4 == 0) goto L_0x023d
            com.instagram.model.direct.gifs.DirectAnimatedMedia r4 = X.AnonymousClass53I.A01(r5)     // Catch:{ all -> 0x0240 }
            if (r4 == 0) goto L_0x023d
            X.5FY r5 = r3.A0V     // Catch:{ all -> 0x0240 }
            com.instagram.model.mediasize.GifUrlImpl r4 = r4.A02     // Catch:{ all -> 0x0240 }
            java.lang.String r4 = r4.A09     // Catch:{ all -> 0x0240 }
            r5.A01 = r4     // Catch:{ all -> 0x0240 }
        L_0x023d:
            monitor-exit(r3)     // Catch:{ all -> 0x0240 }
            goto L_0x0330
        L_0x0240:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0240 }
            goto L_0x049f
        L_0x0244:
            com.instagram.user.model.User r6 = r3.A17     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x0248:
            X.1Xj r4 = r3.A0s     // Catch:{ all -> 0x04a0 }
            if (r4 == 0) goto L_0x02f8
            X.1iA r5 = r4.BR7()     // Catch:{ all -> 0x04a0 }
            X.1iA r4 = X.1iA.A0a     // Catch:{ all -> 0x04a0 }
            if (r5 != r4) goto L_0x025f
            X.1Xj r4 = r3.A0s     // Catch:{ all -> 0x04a0 }
            X.1Xy r5 = r4.A0C     // Catch:{ all -> 0x04a0 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x04a0 }
            r5.EUG(r4)     // Catch:{ all -> 0x04a0 }
        L_0x025f:
            java.lang.String r5 = r3.A1u     // Catch:{ all -> 0x04a0 }
            X.1Xj r4 = r3.A0s     // Catch:{ all -> 0x04a0 }
            X.1Xj r6 = X.C2606746p.A01(r2, r4, r5)     // Catch:{ all -> 0x04a0 }
            r3.A0s = r6     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x026b:
            X.7FN r6 = r3.A0Z     // Catch:{ all -> 0x04a0 }
            if (r6 == 0) goto L_0x0332
            X.1Xj r8 = r6.A02     // Catch:{ all -> 0x04a0 }
            X.7Q3 r7 = r6.A01     // Catch:{ all -> 0x04a0 }
            X.7Q3 r5 = X.AnonymousClass7Q3.EMOJI_REACTION     // Catch:{ all -> 0x04a0 }
            r4 = 0
            if (r7 != r5) goto L_0x0279
            r4 = 1
        L_0x0279:
            X.1Xy r5 = r8.A0C     // Catch:{ all -> 0x04a0 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x04a0 }
            r5.Enc(r4)     // Catch:{ all -> 0x04a0 }
            goto L_0x0391
        L_0x0284:
            X.53G r4 = r3.A12     // Catch:{ all -> 0x04a0 }
            com.instagram.model.direct.gifs.DirectAnimatedMedia r6 = X.AnonymousClass53I.A01(r4)     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x028c:
            com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem r4 = r3.A15     // Catch:{ all -> 0x04a0 }
            com.instagram.model.direct.stickerstore.DirectStoreSticker r6 = X.C45892D9v.A01(r4)     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x0294:
            X.7FJ r6 = r3.A0b     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x0298:
            X.N4Q r6 = r3.A0F     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x029c:
            X.Cw5 r6 = r3.A0U     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x02a0:
            X.4ik r5 = r3.A0e     // Catch:{ all -> 0x04a0 }
            if (r5 != 0) goto L_0x02ce
            X.1Xj r9 = r3.A0u     // Catch:{ all -> 0x04a0 }
            if (r9 == 0) goto L_0x02ce
            X.4iq r17 = X.C271384il.A00(r2, r9)     // Catch:{ all -> 0x04a0 }
            X.5Dg r8 = r3.A0f     // Catch:{ all -> 0x04a0 }
            java.lang.String r7 = r3.A1x     // Catch:{ all -> 0x04a0 }
            int r6 = r3.A02     // Catch:{ all -> 0x04a0 }
            java.lang.Integer r5 = r3.A1I     // Catch:{ all -> 0x04a0 }
            java.lang.String r4 = r3.A1v     // Catch:{ all -> 0x04a0 }
            r18 = r9
            r19 = r5
            r20 = r7
            r21 = r4
            r22 = r6
            r16 = r8
            X.4ik r5 = X.C2606746p.A00(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x04a0 }
            r3.A0e = r5     // Catch:{ all -> 0x04a0 }
            java.lang.Integer r4 = r3.A1I     // Catch:{ all -> 0x04a0 }
            if (r4 == 0) goto L_0x02ce
            r3.A1I = r0     // Catch:{ all -> 0x04a0 }
        L_0x02ce:
            r3.A0u = r0     // Catch:{ all -> 0x04a0 }
            if (r5 == 0) goto L_0x02f8
            X.1Xj r4 = r5.A05     // Catch:{ all -> 0x04a0 }
            if (r4 == 0) goto L_0x02f8
            X.1Xy r5 = r4.A0C     // Catch:{ all -> 0x04a0 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x04a0 }
            r5.EUG(r4)     // Catch:{ all -> 0x04a0 }
            X.4ik r6 = r3.A0e     // Catch:{ all -> 0x04a0 }
            java.lang.String r5 = r3.A1u     // Catch:{ all -> 0x04a0 }
            X.1Xj r4 = r6.A05     // Catch:{ all -> 0x04a0 }
            X.1Xj r4 = X.C2606746p.A01(r2, r4, r5)     // Catch:{ all -> 0x04a0 }
            r6.A05 = r4     // Catch:{ all -> 0x04a0 }
            X.4ik r5 = r3.A0e     // Catch:{ all -> 0x04a0 }
            X.1Xj r4 = r5.A05     // Catch:{ all -> 0x04a0 }
            X.4iq r4 = X.C271384il.A00(r2, r4)     // Catch:{ all -> 0x04a0 }
            r5.A04 = r4     // Catch:{ all -> 0x04a0 }
            X.4ik r6 = r3.A0e     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x02f8:
            r6 = r0
            goto L_0x0332
        L_0x02fa:
            java.lang.String r6 = r3.A1d     // Catch:{ all -> 0x04a0 }
            if (r6 != 0) goto L_0x0391
            java.lang.String r6 = "❤"
            r3.A1d = r6     // Catch:{ all -> 0x04a0 }
            goto L_0x0391
        L_0x0304:
            X.46n r6 = r3.A0N     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x0307:
            X.JwA r6 = r3.A0C     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x030a:
            X.55L r6 = r3.A0c     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x030d:
            X.9Iu r6 = r3.A07     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x0310:
            X.JwG r6 = r3.A0B     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x0313:
            X.9Iu r6 = r3.A06     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x0316:
            X.77X r6 = r3.A0S     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x0319:
            X.Ciz r6 = r3.A0h     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x031c:
            X.47v r6 = r3.A0g     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x031f:
            X.Cti r6 = r3.A0R     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x0322:
            com.instagram.direct.model.DirectAREffectShare r6 = r3.A0P     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x0325:
            X.6nz r6 = r3.A0I     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x0328:
            X.OMp r6 = r3.A0p     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x032b:
            X.3tC r6 = r3.A0j     // Catch:{ all -> 0x04a0 }
            goto L_0x0330
        L_0x032e:
            X.Rt3 r6 = r3.A0O     // Catch:{ all -> 0x04a0 }
        L_0x0330:
            if (r6 != 0) goto L_0x0391
        L_0x0332:
            java.lang.String r4 = r3.A1Y     // Catch:{ all -> 0x04a0 }
            if (r4 != 0) goto L_0x0391
            java.lang.String r5 = "DirectMessage_postprocess_nullContent"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x04a0 }
            r4.<init>()     // Catch:{ all -> 0x04a0 }
            java.lang.String r2 = "Encountered DirectMessage with null content: type="
            r4.append(r2)     // Catch:{ all -> 0x04a0 }
            X.2FW r2 = r3.A10     // Catch:{ all -> 0x04a0 }
            r4.append(r2)     // Catch:{ all -> 0x04a0 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x04a0 }
            X.0wb.A04(r5, r2, r1)     // Catch:{ all -> 0x04a0 }
            if (r15 == 0) goto L_0x0356
            r1 = 1312096238(0x4e34ffee, float:7.5916787E8)
            X.0fh.A00(r1)
        L_0x0356:
            return r0
        L_0x0357:
            java.lang.String r7 = "undecrypted_encrypted_message"
            java.lang.String r5 = r3.A1X     // Catch:{ all -> 0x04a0 }
            X.57z r6 = new X.57z     // Catch:{ all -> 0x04a0 }
            r6.<init>()     // Catch:{ all -> 0x04a0 }
            java.lang.String r4 = ""
            r6.A01 = r4     // Catch:{ all -> 0x04a0 }
            r6.A02 = r7     // Catch:{ all -> 0x04a0 }
            r6.A00 = r5     // Catch:{ all -> 0x04a0 }
            X.0Tu r7 = X.0Tu.A05     // Catch:{ all -> 0x04a0 }
            r4 = 36318033001584394(0x81070f0000170a, double:3.031008538958195E-306)
            boolean r5 = X.182.A06(r7, r2, r4)     // Catch:{ all -> 0x04a0 }
            r4 = 1
            if (r5 == 0) goto L_0x0377
            r4 = 0
        L_0x0377:
            r3.A2D = r4     // Catch:{ all -> 0x04a0 }
            goto L_0x0391
        L_0x037a:
            r4 = 363(0x16b, float:5.09E-43)
            java.lang.String r4 = X.C66579MXk.A00(r4)     // Catch:{ all -> 0x04a0 }
            X.57z r6 = new X.57z     // Catch:{ all -> 0x04a0 }
            r6.<init>()     // Catch:{ all -> 0x04a0 }
            java.lang.String r5 = ""
            r6.A01 = r5     // Catch:{ all -> 0x04a0 }
            r6.A02 = r4     // Catch:{ all -> 0x04a0 }
            r6.A00 = r0     // Catch:{ all -> 0x04a0 }
            X.2FW r4 = X.2FW.A1M     // Catch:{ all -> 0x04a0 }
            r3.A10 = r4     // Catch:{ all -> 0x04a0 }
        L_0x0391:
            X.46s r4 = r3.A0X     // Catch:{ all -> 0x04a0 }
            if (r4 == 0) goto L_0x03a9
            java.util.List r4 = r4.A00     // Catch:{ all -> 0x04a0 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x04a0 }
            r7 = r4 ^ 1
        L_0x039d:
            java.util.LinkedHashMap r4 = r3.A1y     // Catch:{ all -> 0x04a0 }
            if (r4 == 0) goto L_0x03ab
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x04a0 }
            r4 = 1
            if (r5 == 0) goto L_0x03ac
            goto L_0x03ab
        L_0x03a9:
            r7 = 0
            goto L_0x039d
        L_0x03ab:
            r4 = 0
        L_0x03ac:
            if (r7 == 0) goto L_0x045d
            if (r4 != 0) goto L_0x045d
            X.0Tu r7 = X.0Tu.A06     // Catch:{ all -> 0x04a0 }
            r4 = 36320266384842892(0x8109170004208c, double:3.0324209395239815E-306)
            boolean r4 = X.182.A06(r7, r2, r4)     // Catch:{ all -> 0x04a0 }
            if (r4 == 0) goto L_0x045d
            X.0Tu r7 = X.0Tu.A05     // Catch:{ all -> 0x04a0 }
            r4 = 36320266385105038(0x8109170008208e, double:3.032420939689764E-306)
            boolean r4 = X.182.A06(r7, r2, r4)     // Catch:{ all -> 0x04a0 }
            if (r4 == 0) goto L_0x0433
            X.46s r4 = r3.A0X     // Catch:{ all -> 0x04a0 }
            java.util.List r7 = r4.A00     // Catch:{ all -> 0x04a0 }
            monitor-enter(r3)     // Catch:{ all -> 0x04a0 }
            boolean r4 = com.facebook.systrace.Systrace.A0E(r13)     // Catch:{ all -> 0x049d }
            if (r4 == 0) goto L_0x03dd
            java.lang.String r5 = "DirectMessage.updateMultiReactFromUserBasedReactions"
            r4 = -2061726435(0xffffffff851c8d1d, float:-7.361003E-36)
            X.0fh.A01(r5, r4)     // Catch:{ all -> 0x049d }
        L_0x03dd:
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ all -> 0x0424 }
            r12.<init>()     // Catch:{ all -> 0x0424 }
            java.util.Iterator r9 = r7.iterator()     // Catch:{ all -> 0x0424 }
        L_0x03e6:
            boolean r4 = r9.hasNext()     // Catch:{ all -> 0x0424 }
            if (r4 == 0) goto L_0x0410
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x0424 }
            X.46u r8 = (X.C2607246u) r8     // Catch:{ all -> 0x0424 }
            java.lang.String r7 = r8.A02     // Catch:{ all -> 0x0424 }
            java.lang.Object r4 = r12.get(r7)     // Catch:{ all -> 0x0424 }
            X.4ur r4 = (X.C277304ur) r4     // Catch:{ all -> 0x0424 }
            if (r4 == 0) goto L_0x040a
            java.util.List r5 = r4.A00     // Catch:{ all -> 0x0424 }
        L_0x03fe:
            r5.add(r8)     // Catch:{ all -> 0x0424 }
            X.4ur r4 = new X.4ur     // Catch:{ all -> 0x0424 }
            r4.<init>(r5)     // Catch:{ all -> 0x0424 }
            r12.put(r7, r4)     // Catch:{ all -> 0x0424 }
            goto L_0x03e6
        L_0x040a:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0424 }
            r5.<init>()     // Catch:{ all -> 0x0424 }
            goto L_0x03fe
        L_0x0410:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0424 }
            r4.<init>(r12)     // Catch:{ all -> 0x0424 }
            r3.A1y = r4     // Catch:{ all -> 0x0424 }
            boolean r4 = com.facebook.systrace.Systrace.A0E(r13)     // Catch:{ all -> 0x049d }
            if (r4 == 0) goto L_0x0432
            r4 = -1600942772(0xffffffffa0938d4c, float:-2.499627E-19)
            X.0fh.A00(r4)     // Catch:{ all -> 0x049d }
            goto L_0x0432
        L_0x0424:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r13)     // Catch:{ all -> 0x049d }
            if (r0 == 0) goto L_0x0431
            r0 = -435328484(0xffffffffe60d6a1c, float:-1.6695276E23)
            X.0fh.A00(r0)     // Catch:{ all -> 0x049d }
        L_0x0431:
            throw r1     // Catch:{ all -> 0x049d }
        L_0x0432:
            monitor-exit(r3)     // Catch:{ all -> 0x04a0 }
        L_0x0433:
            X.0wj r7 = X.0wj.A01     // Catch:{ all -> 0x04a0 }
            r5 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r4 = "DirectMessage_postprocess: message contains user reactions but missing multi-react response from server"
            X.0f9 r7 = r7.AEf(r4, r5)     // Catch:{ all -> 0x04a0 }
            java.lang.String r5 = "message_type"
            X.2FW r4 = r3.A10     // Catch:{ all -> 0x04a0 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x04a0 }
            r7.ABQ(r5, r4)     // Catch:{ all -> 0x04a0 }
            r4 = 3955(0xf73, float:5.542E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)     // Catch:{ all -> 0x04a0 }
            X.4gN r5 = r3.A0r     // Catch:{ all -> 0x04a0 }
            if (r5 == 0) goto L_0x046b
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x04a0 }
        L_0x0457:
            r7.ABQ(r4, r5)     // Catch:{ all -> 0x04a0 }
            r7.report()     // Catch:{ all -> 0x04a0 }
        L_0x045d:
            X.46s r4 = r3.A0X     // Catch:{ all -> 0x04a0 }
            if (r4 == 0) goto L_0x0477
            java.util.List r4 = r3.A22     // Catch:{ all -> 0x04a0 }
            if (r4 == 0) goto L_0x0477
            java.lang.String r2 = "Received both mReactionGroup and mCountBasedReactions from server"
            X.0wb.A04(r10, r2, r1)     // Catch:{ all -> 0x04a0 }
            goto L_0x046e
        L_0x046b:
            java.lang.String r5 = "n/a"
            goto L_0x0457
        L_0x046e:
            if (r15 == 0) goto L_0x0476
            r1 = -1028061711(0xffffffffc2b905f1, float:-92.511604)
            X.0fh.A00(r1)
        L_0x0476:
            return r0
        L_0x0477:
            r3.A1T = r6     // Catch:{ all -> 0x04a0 }
            r3.A0x(r2)     // Catch:{ all -> 0x04a0 }
            r3.A03(r2)     // Catch:{ all -> 0x04a0 }
            A05(r2, r3, r11)     // Catch:{ all -> 0x04a0 }
            r3.A02()     // Catch:{ all -> 0x04a0 }
            java.util.List r0 = r3.A22     // Catch:{ all -> 0x04a0 }
            A04(r2, r3, r0)     // Catch:{ all -> 0x04a0 }
            java.lang.Long r0 = r3.A1J     // Catch:{ all -> 0x04a0 }
            r3.A08(r0)     // Catch:{ all -> 0x04a0 }
            if (r15 == 0) goto L_0x0497
            r0 = -1479222336(0xffffffffa7d4dbc0, float:-5.9080074E-15)
            X.0fh.A00(r0)
        L_0x0497:
            return r44
        L_0x0498:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x049a }
        L_0x049a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x049a }
            goto L_0x049f
        L_0x049d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x04a0 }
        L_0x049f:
            throw r0     // Catch:{ all -> 0x04a0 }
        L_0x04a0:
            r1 = move-exception
            if (r15 == 0) goto L_0x04a9
            r0 = -371447704(0xffffffffe9dc2868, float:-3.3269312E25)
            X.0fh.A00(r0)
        L_0x04a9:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254703su.A0N(com.instagram.common.session.UserSession, X.3t0):X.3su");
    }

    public final C254933tI A0P() {
        C254933tI r0 = this.A2T;
        if (r0 == null) {
            return this.A0a;
        }
        return r0;
    }

    public final 1Xj A0R() {
        String str;
        1Xj r0;
        boolean z = false;
        if (this.A10 == 2FW.A1D) {
            z = true;
        }
        17k.A0E(z);
        Object obj = this.A1T;
        obj.getClass();
        AnonymousClass9JI r3 = (AnonymousClass9JI) obj;
        0qQ.A0B(r3, 0);
        1Xj r1 = (1Xj) r3.A00;
        if (!r1.A56() || (((str = r3.A02) == null || (r0 = r1.A1f(str)) == null) && (r0 = r1.A1c(0)) == null)) {
            return r1;
        }
        return r0;
    }

    public final 1Xj A0S() {
        Object obj = this.A1T;
        if (!(obj instanceof 1Xj)) {
            if (!AnonymousClass9JI.A00(2, obj)) {
                return null;
            }
            obj = ((AnonymousClass9JI) obj).A00;
        }
        return (1Xj) obj;
    }

    public final 1Xj A0T() {
        Object obj = this.A1T;
        if (!(obj instanceof 1Xj)) {
            if (!AnonymousClass9JI.A00(2, obj)) {
                return null;
            }
            obj = ((AnonymousClass9JI) obj).A00;
        }
        return (1Xj) obj;
    }

    public final DirectMessageIdentifier A0V() {
        return new DirectMessageIdentifier(this.A10, this.A1c, this.A1W);
    }

    public final 1iA A0W() {
        C271374ik r0;
        C271434iq r02;
        Object obj = this.A1T;
        if (obj instanceof C300925yB) {
            return ((C300925yB) obj).A01;
        }
        if (obj instanceof C331377Qt) {
            return ((C331377Qt) obj).A01;
        }
        if (obj instanceof 1Xj) {
            return ((1Xj) obj).BR7();
        }
        if (!(obj instanceof C271374ik) || (r0 = this.A0e) == null || (r02 = r0.A04) == null) {
            return null;
        }
        return r02.A07;
    }

    public final Integer A0b() {
        Long l;
        Long l2;
        Long l3 = this.A1K;
        if ((l3 == null || l3.longValue() <= 0) && ((l2 = this.A1L) == null || l2.longValue() <= 0)) {
            return AnonymousClass05K.A0C;
        }
        Long l4 = this.A1M;
        if ((l4 == null || l4.longValue() < 0) && ((l = this.A1N) == null || l.longValue() <= 0)) {
            return AnonymousClass05K.A00;
        }
        return AnonymousClass05K.A01;
    }

    public final String A0f() {
        if (this.A1W == null && this.A1c == null) {
            0wb.A03("DirectMessage_getClientContext_null", "both mClientContext and mId are null.");
        }
        return this.A1W;
    }

    public final String A0g() {
        if (this.A1c == null && this.A1W == null) {
            0wb.A03("DirectMessage_getId_null_client_context", "both mId and mClientContext are null.");
        }
        return this.A1c;
    }

    public final String A0h() {
        String str = this.A1c;
        if (str != null || (str = this.A1W) != null) {
            return str;
        }
        throw new IllegalStateException(C273654mx.A00(815));
    }

    public final String A0i() {
        String str = this.A1W;
        if (str != null || (str = this.A1c) != null) {
            return str;
        }
        throw new IllegalStateException(C273654mx.A00(815));
    }

    public final String A0j() {
        C271374ik r0 = this.A0e;
        if (r0 != null) {
            return r0.A09;
        }
        return this.A1v;
    }

    public final ArrayList A0q() {
        List<DirectCountBasedReaction> list = this.A22;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (DirectCountBasedReaction directCountBasedReaction : list) {
            if (directCountBasedReaction.A02) {
                arrayList.add(directCountBasedReaction.A01);
            }
        }
        return arrayList;
    }

    public final List A0s() {
        List<AnonymousClass3I4> list = this.A2A;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (AnonymousClass3I4 r1 : list) {
            0qQ.A0B(r1, 0);
            arrayList.add(new C72695PFz(r1));
        }
        return arrayList;
    }

    public final void A0w(N4L n4l) {
        if (!2PP.A00(this.A0D, n4l)) {
            this.A0D = n4l;
            this.A2C = true;
        }
    }

    public final void A1A(Long l) {
        String obj;
        Long l2 = this.A1S;
        if (l2 == null || !l2.equals(l)) {
            this.A2C = true;
            this.A1S = l;
            if (l == null) {
                obj = "";
            } else {
                obj = l.toString();
            }
            this.A1r = obj;
        }
    }

    public void A1C(String str) {
        if (str != null && !TextUtils.isEmpty(str) && !str.equals(this.A1W)) {
            this.A2C = true;
            this.A1W = str;
        }
    }

    public final void A1L(boolean z) {
        boolean booleanValue;
        Boolean bool = this.A18;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        if (z != booleanValue) {
            this.A18 = Boolean.valueOf(z);
            this.A2C = true;
        }
    }

    public final boolean A1M() {
        ExtendedImageUrl extendedImageUrl = this.A16;
        if (extendedImageUrl == null || extendedImageUrl.A0A == null) {
            return false;
        }
        return true;
    }

    public final boolean A1O() {
        DirectMessageComments directMessageComments = this.A0q;
        if (directMessageComments == null || directMessageComments.A00 <= 0) {
            return false;
        }
        return true;
    }

    public final boolean A1P() {
        Integer num = this.A1F;
        if (num == AnonymousClass05K.A0N || num == AnonymousClass05K.A0Y) {
            return true;
        }
        return false;
    }

    public final boolean A1Q() {
        List list = this.A29;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return ((AnonymousClass9JN) list.get(0)).A05.equals("xma_gen_ai_search_plugin_response_sources");
    }

    public final boolean A1S() {
        Boolean bool = this.A18;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A1V() {
        2FW r0 = 2FW.A0q;
        2FW r2 = this.A10;
        if (r0.equals(r2) && "permanent".equals(A0j())) {
            return true;
        }
        if (!2FW.A0y.equals(r2) || !A1W()) {
            return false;
        }
        return true;
    }

    public final boolean A1W() {
        1Xj r0 = this.A0s;
        if (r0 == null || r0.getId() == null || this.A0s.A1p() == null) {
            return false;
        }
        if (!this.A0s.CeS()) {
            return true;
        }
        this.A0s.CEL();
        return true;
    }

    public final boolean A1X() {
        Object obj;
        2FW r1 = this.A10;
        if (r1 == 2FW.A1D || r1 == 2FW.A0Y || r1 == 2FW.A0X) {
            AnonymousClass9JI r0 = this.A0A;
            if (r0 != null) {
                obj = r0.A01;
            } else {
                obj = null;
            }
            if (obj != AnonymousClass05K.A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A1Y() {
        Object obj;
        if (this.A10 == 2FW.A1D) {
            AnonymousClass9JI r0 = this.A0A;
            if (r0 != null) {
                obj = r0.A01;
            } else {
                obj = null;
            }
            if (obj != AnonymousClass05K.A00) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A1Z() {
        if (this.A1A == null) {
            A02();
        }
        if (this.A1A == null) {
            0wb.A03("Direct Message mIsMessageEmoji is null", "DirectMessage.isMessageEmoji");
        }
        Boolean bool = this.A1A;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A1a() {
        if (this.A10 != 2FW.A0y) {
            return false;
        }
        Object obj = this.A1T;
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            return false;
        }
        Object obj2 = list.get(0);
        if (!(obj2 instanceof C254873tC) || ((C254873tC) obj2).A02 != 9) {
            return false;
        }
        return true;
    }

    public final boolean A1e(UserSession userSession) {
        C271434iq r0;
        Object obj = this.A1T;
        if (this.A10 != 2FW.A0q) {
            return false;
        }
        C271374ik r1 = this.A0e;
        if ((r1 == null || r1.A05 == null) && this.A0w != null) {
            return true;
        }
        if (!(obj instanceof C271374ik) || r1 == null || (r0 = r1.A04) == null || r0.A0H == null || !A1f(userSession)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r3 != null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A1f(com.instagram.common.session.UserSession r6) {
        /*
            r5 = this;
            X.4ik r3 = r5.A0e
            r1 = 0
            if (r3 == 0) goto L_0x0091
            X.4iq r4 = r3.A04
        L_0x0007:
            X.2FW r2 = r5.A10
            X.2FW r0 = X.2FW.A0q
            if (r2 != r0) goto L_0x0094
            if (r3 == 0) goto L_0x0013
            X.1Xj r0 = r3.A05
            if (r0 != 0) goto L_0x0019
        L_0x0013:
            X.7Qt r0 = r5.A0w
            if (r0 != 0) goto L_0x0094
            if (r3 == 0) goto L_0x002b
        L_0x0019:
            if (r4 == 0) goto L_0x002b
            boolean r0 = r4.A0T
            if (r0 == 0) goto L_0x0023
            com.instagram.model.mediasize.ImageInfo r0 = r4.A06
            if (r0 == 0) goto L_0x002b
        L_0x0023:
            boolean r0 = r4.A0V
            if (r0 == 0) goto L_0x0094
            X.3WR r0 = r4.A09
            if (r0 != 0) goto L_0x0094
        L_0x002b:
            java.lang.String r0 = "direct_invalid_visual_media"
            r0.getClass()
            X.0xI r3 = X.0xI.A01(r0, r1)
            com.instagram.model.direct.DirectThreadKey r0 = r5.A0y
            if (r0 == 0) goto L_0x008f
            java.lang.String r2 = r0.A00
        L_0x003a:
            java.lang.String r0 = "threadId"
            r3.A0C(r0, r2)
            java.lang.String r2 = r5.A1c
            java.lang.String r0 = "messageId"
            r3.A0C(r0, r2)
            java.lang.String r2 = r5.A1u
            java.lang.String r0 = "userId"
            r3.A0C(r0, r2)
            if (r4 == 0) goto L_0x008d
            java.lang.String r2 = r4.A0H
        L_0x0051:
            java.lang.String r0 = "mediaId"
            r3.A0C(r0, r2)
            if (r4 == 0) goto L_0x0060
            X.13i r0 = r4.A03
            java.lang.Object r1 = r0.get()
            java.lang.String r1 = (java.lang.String) r1
        L_0x0060:
            java.lang.String r0 = "mediaUserId"
            r3.A0C(r0, r1)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r1 = android.util.Log.getStackTraceString(r0)
            r0 = 4033(0xfc1, float:5.651E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A0C(r0, r1)
            if (r4 == 0) goto L_0x0084
            boolean r0 = r4.A0V
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "isVideo"
            r3.A09(r0, r1)
        L_0x0084:
            X.0xN r0 = X.C60510iO.A00(r6)
            r0.EFq(r3)
            r0 = 0
            return r0
        L_0x008d:
            r2 = r1
            goto L_0x0051
        L_0x008f:
            r2 = r1
            goto L_0x003a
        L_0x0091:
            r4 = r1
            goto L_0x0007
        L_0x0094:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254703su.A1f(com.instagram.common.session.UserSession):boolean");
    }

    public final boolean A1i(User user) {
        if (this.A1c != null && !0qQ.A0K(user.getId(), BsI())) {
            2FW r0 = 2FW.A0G;
            2FW r1 = this.A10;
            if (r0.equals(r1) || 2FW.A13.equals(r1) || 2FW.A0m.equals(r1) || 2FW.A0N.equals(r1) || 2FW.A1i.equals(r1)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A1l(User user) {
        C271374ik r1;
        C271434iq r0;
        if (this.A10 != 2FW.A0q || 0qQ.A0K(user.getId(), BsI()) || (r1 = this.A0e) == null || r1.A00 != 0 || (r0 = r1.A04) == null || r0.A0H == null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (r0 != 5) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (r0 != 2) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r0 != 5) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r0 != 2) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        if (r0 == 3) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r0 == 4) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        throw new java.lang.IllegalArgumentException(X.002.A0u("Illegal transition from ", X.AnonymousClass48R.A00(r6), " to ", X.AnonymousClass48R.A00(r10)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        r9.A1F = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r0 != 2) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A1m(java.lang.Integer r10) {
        /*
            r9 = this;
            java.lang.Integer r6 = r9.A1F
            r8 = 0
            if (r6 == r10) goto L_0x0072
            r7 = 1
            r9.A2C = r7
            X.3t8 r0 = X.C254833t8.$redex_init_class
            int r0 = r6.intValue()
            r5 = 4
            r4 = 3
            java.lang.String r3 = " to "
            r2 = 2
            r1 = 5
            switch(r0) {
                case 0: goto L_0x0034;
                case 1: goto L_0x004f;
                case 2: goto L_0x0048;
                case 3: goto L_0x003d;
                case 4: goto L_0x0072;
                case 5: goto L_0x002b;
                default: goto L_0x0017;
            }
        L_0x0017:
            java.lang.String r2 = "Unhandled status: transition from "
            java.lang.String r1 = X.AnonymousClass48R.A00(r6)
            java.lang.String r0 = X.AnonymousClass48R.A00(r10)
            java.lang.String r1 = X.002.A0u(r2, r1, r3, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x002b:
            int r0 = r10.intValue()
            if (r0 == r1) goto L_0x006f
            if (r0 == r2) goto L_0x0072
            goto L_0x005b
        L_0x0034:
            int r0 = r10.intValue()
            if (r0 == r7) goto L_0x006f
            if (r0 == r1) goto L_0x006f
            goto L_0x005b
        L_0x003d:
            int r0 = r10.intValue()
            if (r0 == r7) goto L_0x006f
            if (r0 == r1) goto L_0x006f
            if (r0 == r2) goto L_0x006f
            goto L_0x005b
        L_0x0048:
            int r0 = r10.intValue()
            if (r0 == r1) goto L_0x006f
            goto L_0x0057
        L_0x004f:
            int r0 = r10.intValue()
            if (r0 == r1) goto L_0x006f
            if (r0 == r2) goto L_0x006f
        L_0x0057:
            if (r0 == r4) goto L_0x006f
            if (r0 == r5) goto L_0x006f
        L_0x005b:
            java.lang.String r2 = "Illegal transition from "
            java.lang.String r1 = X.AnonymousClass48R.A00(r6)
            java.lang.String r0 = X.AnonymousClass48R.A00(r10)
            java.lang.String r1 = X.002.A0u(r2, r1, r3, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x006f:
            r9.A1F = r10
            return r7
        L_0x0072:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254703su.A1m(java.lang.Integer):boolean");
    }

    public final boolean A1o(String str) {
        Comparator comparator = AnonymousClass48V.A01;
        String A0g2 = A0g();
        A0g2.getClass();
        if (comparator.compare(A0g2, str) > 0) {
            return true;
        }
        return false;
    }

    public final String BsI() {
        return this.A1u;
    }

    public final long C7c() {
        Long l = this.A1S;
        if (l != null) {
            return l.longValue();
        }
        return 0;
    }

    public final 2FW CAa() {
        return this.A10;
    }

    public final boolean Cbp() {
        return this.A2P;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r6.equals(r4.A02) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0A(X.C2607246u r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r0 = r4.A00()
            boolean r0 = r0.equals(r5)
            r3 = 1
            r2 = r0 ^ 1
            java.lang.String r0 = r4.A00()
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = r4.A02
            boolean r1 = r6.equals(r0)
            r0 = 1
            if (r1 == 0) goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r2 != 0) goto L_0x0024
            if (r0 != 0) goto L_0x0024
            r3 = 0
        L_0x0024:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254703su.A0A(X.46u, java.lang.String, java.lang.String):boolean");
    }

    public static boolean A0B(C254703su r5, C254703su r6) {
        String A0g2 = r5.A0g();
        String A0f2 = r5.A0f();
        String A0g3 = r6.A0g();
        String A0f3 = r6.A0f();
        if (A0g2 != null && A0g2.equals(A0g3)) {
            return true;
        }
        if (A0f2 == null || !A0f2.equals(A0f3)) {
            return false;
        }
        return true;
    }

    public final C70621ODs A0M() {
        Long valueOf;
        if (A1T()) {
            Long l = this.A1K;
            if (l == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(l.longValue()));
            }
            return C70875OPo.A01(valueOf, this.A1M);
        } else if (this.A2P) {
            return C70875OPo.A00();
        } else {
            return new C70621ODs();
        }
    }

    public final Boolean A0Z(UserSession userSession, Integer num) {
        boolean z;
        if (A0a(num).booleanValue()) {
            z = 182.A06(0Tu.A05, userSession, 36328671635783181L);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final String A0e() {
        ImmutableList A0H2 = A0H();
        if (A0H2 == null || A0H2.isEmpty()) {
            return null;
        }
        return ((C254873tC) A0H2.get(0)).A0s;
    }

    public final String A0p(User user) {
        for (C2607246u r2 : A0v()) {
            if (r2.A00().equals(user.getId())) {
                return r2.A02;
            }
        }
        return null;
    }

    public final ArrayList A0r(User user) {
        ArrayList arrayList = null;
        for (C2607246u r2 : A0v()) {
            if (r2.A00().equals(user.getId())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(r2.A02);
            }
        }
        return arrayList;
    }

    public void A1D(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.A1u)) {
            this.A2C = true;
            this.A1u = str;
        }
    }

    public final boolean A1N() {
        List list;
        if (!A0v().isEmpty()) {
            return true;
        }
        synchronized (this) {
            list = this.A27;
        }
        if (!list.isEmpty()) {
            return true;
        }
        ImmutableList A0J2 = A0J();
        if (A0J2 == null || A0J2.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean A1R() {
        String str;
        ImmutableList A0H2 = A0H();
        if (A0H2 == null || A0H2.isEmpty() || (str = ((C254873tC) A0H2.get(0)).A0u) == null || !str.startsWith("instagram://generated_sticker_action")) {
            return false;
        }
        return true;
    }

    public final boolean A1T() {
        if (A0b() != AnonymousClass05K.A0C) {
            return true;
        }
        return false;
    }

    public final boolean A1U() {
        ImmutableList A0H2 = A0H();
        if (A0H2 == null || A0H2.isEmpty() || ((C254873tC) A0H2.get(0)).A02 != 13) {
            return false;
        }
        return true;
    }

    public final boolean A1g(UserSession userSession, String str) {
        C271374ik r0;
        C271374ik r02;
        if (!A1e(userSession) || (r0 = this.A0e) == null || r0.A00 < 1 || !str.equals(this.A1w) || 0qQ.A0K(userSession.A06, BsI()) || !A1f(userSession) || "once".equals(A0j()) || !A1f(userSession) || (r02 = this.A0e) == null || r02.A00 != 1) {
            return false;
        }
        return true;
    }

    public final boolean A1j(User user) {
        return 0qQ.A0K(user.getId(), BsI());
    }

    public final boolean CRd() {
        ImmutableList A0H2 = A0H();
        if (A0H2 == null || A0H2.size() < 1) {
            return false;
        }
        if (((C254873tC) A0H2.get(0)).A02 == 8 || ((C254873tC) A0H2.get(0)).A02 == 13 || ((C254873tC) A0H2.get(0)).A02 == 12 || ((C254873tC) A0H2.get(0)).A02 == 18 || ((C254873tC) A0H2.get(0)).A02 == 10) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v47, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v49, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v51, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v53, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v55, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v67, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v73, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v75, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v77, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v79, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v81, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v83, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v85, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v87, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v17, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v25, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v43, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v45, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v57, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v59, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v61, types: [java.util.LinkedHashMap] */
    /* JADX WARNING: type inference failed for: r5v62 */
    /* JADX WARNING: type inference failed for: r5v63, types: [java.util.LinkedHashMap] */
    /* JADX WARNING: type inference failed for: r5v64 */
    /* JADX WARNING: type inference failed for: r5v65, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v69, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v71, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v89 */
    /* JADX WARNING: type inference failed for: r5v90 */
    /* JADX WARNING: type inference failed for: r5v91 */
    /* JADX WARNING: type inference failed for: r5v92 */
    /* JADX WARNING: type inference failed for: r5v93 */
    /* JADX WARNING: type inference failed for: r5v94 */
    /* JADX WARNING: type inference failed for: r5v95 */
    /* JADX WARNING: type inference failed for: r5v96 */
    /* JADX WARNING: type inference failed for: r5v97 */
    /* JADX WARNING: type inference failed for: r5v98 */
    /* JADX WARNING: type inference failed for: r5v99 */
    /* JADX WARNING: type inference failed for: r5v100 */
    /* JADX WARNING: type inference failed for: r5v101 */
    /* JADX WARNING: type inference failed for: r5v102 */
    /* JADX WARNING: type inference failed for: r5v103 */
    /* JADX WARNING: type inference failed for: r5v104 */
    /* JADX WARNING: type inference failed for: r5v105 */
    /* JADX WARNING: type inference failed for: r5v106 */
    /* JADX WARNING: type inference failed for: r5v107 */
    /* JADX WARNING: type inference failed for: r5v108 */
    /* JADX WARNING: type inference failed for: r5v109 */
    /* JADX WARNING: type inference failed for: r5v110 */
    /* JADX WARNING: type inference failed for: r5v111 */
    /* JADX WARNING: type inference failed for: r5v112 */
    /* JADX WARNING: type inference failed for: r5v113 */
    /* JADX WARNING: type inference failed for: r5v114 */
    /* JADX WARNING: type inference failed for: r5v115 */
    /* JADX WARNING: type inference failed for: r5v116 */
    /* JADX WARNING: type inference failed for: r5v117 */
    /* JADX WARNING: type inference failed for: r5v118 */
    /* JADX WARNING: type inference failed for: r5v119 */
    /* JADX WARNING: type inference failed for: r5v120 */
    /* JADX WARNING: type inference failed for: r5v121 */
    /* JADX WARNING: type inference failed for: r5v122 */
    /* JADX WARNING: type inference failed for: r5v123 */
    /* JADX WARNING: type inference failed for: r5v124 */
    /* JADX WARNING: type inference failed for: r5v125 */
    /* JADX WARNING: type inference failed for: r5v126 */
    /* JADX WARNING: type inference failed for: r5v127 */
    /* JADX WARNING: type inference failed for: r5v128 */
    /* JADX WARNING: type inference failed for: r5v129 */
    /* JADX WARNING: type inference failed for: r5v130 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C254703su A00(X.16F r10, com.instagram.model.direct.DirectThreadKey r11, boolean r12) {
        /*
            r3 = 0
            X.3su r2 = new X.3su     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.<init>()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == r1) goto L_0x0013
            r10.A0z()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x0cc8
        L_0x0013:
            X.16L r0 = r10.A1J()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r8 = X.16L.A09     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == r8) goto L_0x0ca5
            java.lang.String r4 = r10.A0q()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r10.A1J()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            java.lang.String r0 = "status"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r6 = 1
            if (r0 == 0) goto L_0x0076
            java.lang.String r4 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            java.lang.String r0 = "UNSET"
            boolean r0 = r4.equals(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x003f
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0039:
            r2.A1F = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x003b:
            r10.A0z()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x0013
        L_0x003f:
            java.lang.String r0 = "READY_TO_UPLOAD"
            boolean r0 = r4.equals(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x004a
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x0039
        L_0x004a:
            java.lang.String r0 = "UPLOADING"
            boolean r0 = r4.equals(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0055
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x0039
        L_0x0055:
            java.lang.String r0 = "UPLOAD_FAILED"
            boolean r0 = r4.equals(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0060
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x0039
        L_0x0060:
            java.lang.String r0 = "WILL_NOT_UPLOAD"
            boolean r0 = r4.equals(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x006b
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x0039
        L_0x006b:
            java.lang.String r0 = "UPLOADED"
            boolean r0 = r4.equals(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0c9f
            java.lang.Integer r0 = X.AnonymousClass05K.A0j     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x0039
        L_0x0076:
            java.lang.String r0 = "item_type"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c91
            java.lang.String r0 = "content_type"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c91
            java.lang.String r0 = "item_id"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r5 = 0
            if (r0 == 0) goto L_0x009e
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x009b
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x009b:
            r2.A1c = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x009e:
            java.lang.String r0 = "client_context"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x00b5
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x00b2
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x00b2:
            r2.A1W = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x00b5:
            java.lang.String r0 = "timestamp"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x00cd
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x00c9
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x00c9:
            r2.A1r = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x00cd:
            java.lang.String r0 = "timestamp_in_micro"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x00e2
            long r4 = r10.A0y()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A1A(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x00e2:
            java.lang.String r0 = "user_id"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x00fa
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x00f6
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x00f6:
            r2.A1u = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x00fa:
            java.lang.String r0 = "auxiliary_text"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0112
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x010e
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x010e:
            r2.A1V = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0112:
            java.lang.String r0 = "auxiliary_text_source_type"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0122
            int r0 = r10.A1D()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A00 = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0122:
            java.lang.String r0 = "placeholder"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0132
            X.57z r0 = X.C2814757y.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0n = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0132:
            java.lang.String r0 = "expired_placeholder"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0142
            X.9J6 r0 = X.C278274wa.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A08 = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0142:
            java.lang.String r0 = "text"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c81
            java.lang.String r0 = "reaction"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c81
            java.lang.String r0 = "message_dialect"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x016a
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x0166
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0166:
            r2.A1g = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x016a:
            java.lang.String r0 = "translated_message"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0182
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x017e
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x017e:
            r2.A1t = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0182:
            java.lang.String r0 = "translated_locale"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x019a
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x0196
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0196:
            r2.A1s = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x019a:
            java.lang.String r0 = "link"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x01aa
            X.9Iu r0 = X.C278334wi.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A07 = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x01aa:
            java.lang.String r0 = "action_log"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x01ba
            X.46n r0 = X.C2606446m.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0N = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x01ba:
            java.lang.String r0 = "instamadillo_action_log"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x01ca
            X.JwA r0 = X.Cj3.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0C = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x01ca:
            java.lang.String r0 = "video_call_event"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x01da
            X.55L r0 = X.AnonymousClass55K.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0c = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x01da:
            java.lang.String r0 = "profile"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x01ec
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            com.instagram.user.model.User r0 = X.1aC.A00(r10, r3)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A17 = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x01ec:
            java.lang.String r0 = "product_share"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x01fc
            X.JwG r0 = X.C70067Nwj.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0B = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x01fc:
            java.lang.String r0 = "preview_medias"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0227
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 != r0) goto L_0x0223
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r5.<init>()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0211:
            X.16L r4 = r10.A1J()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x0223
            X.3I3 r0 = X.C45592Cz4.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0211
            r5.add(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x0211
        L_0x0223:
            r2.A2A = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0227:
            java.lang.String r0 = "media"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0237
            X.1Xj r0 = X.1Xj.A00(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0s = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0237:
            java.lang.String r0 = "media_share"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0249
            X.1Xv r0 = X.1Xj.A0h     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.1Xj r0 = r0.A0C(r10, r6, r6)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0t = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0249:
            java.lang.String r0 = "direct_media_share"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0259
            X.9JI r0 = X.C45673D0y.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0A = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0259:
            java.lang.String r0 = "raven_media"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0269
            X.1Xj r0 = X.1Xj.A00(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0u = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0269:
            java.lang.String r0 = "visual_media"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0279
            X.4ik r0 = X.C271364ij.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0e = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0279:
            java.lang.String r0 = "message_item_dict"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0289
            X.4ik r0 = X.C271364ij.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0d = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0289:
            java.lang.String r0 = "voice_media"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0299
            X.47v r0 = X.C2609847u.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0g = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0299:
            java.lang.String r0 = "seen_user_ids"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x02cc
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 != r0) goto L_0x02c8
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r5.<init>()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x02ae:
            X.16L r4 = r10.A1J()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x02c8
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x02ae
            java.lang.String r0 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x02ae
            r5.add(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x02ae
        L_0x02c8:
            r2.A23 = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x02cc:
            java.lang.String r0 = "reel_share"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x02dc
            X.7FN r0 = X.C70879OPt.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0Z = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x02dc:
            java.lang.String r0 = "story_share"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x02ec
            X.7FJ r0 = X.C70880OPu.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0b = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x02ec:
            java.lang.String r0 = "live_video_share"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x02fc
            X.N4Q r0 = X.C70878OPs.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0F = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x02fc:
            java.lang.String r0 = "live_viewer_invite"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x030c
            X.Cw5 r0 = X.C45672D0x.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0U = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x030c:
            java.lang.String r0 = "comment"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x031c
            X.OG7 r0 = X.C70873OPm.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0T = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x031c:
            java.lang.String r0 = "felix_share"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x032c
            X.9Iu r0 = X.OPq.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A06 = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x032c:
            java.lang.String r0 = "clip"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x033c
            X.77X r0 = X.C45671D0w.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0S = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x033c:
            java.lang.String r0 = "voting_info_center"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x034c
            X.Ciz r0 = X.Cj0.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0h = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x034c:
            java.lang.String r0 = "ar_effect"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x035c
            com.instagram.direct.model.DirectAREffectShare r0 = X.C70871OPk.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0P = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x035c:
            java.lang.String r0 = "like"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0374
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x0370
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0370:
            r2.A1d = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0374:
            java.lang.String r0 = "xma"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0384
            X.3tC r0 = X.C254863tB.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0j = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0384:
            java.lang.String r0 = "clip_watched_action_logs"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x03af
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 != r0) goto L_0x03ab
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r5.<init>()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0399:
            X.16L r4 = r10.A1J()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x03ab
            X.Cth r0 = X.C44659Cid.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0399
            r5.add(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x0399
        L_0x03ab:
            r2.A20 = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x03af:
            java.lang.String r0 = "avatar_note_reply"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x03bf
            X.3tC r0 = X.C254863tB.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0i = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x03bf:
            java.lang.String r0 = "hscroll_share"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "xma_profile"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "xma_media_share"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "xma_link"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "xma_reel_share"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "xma_reel_mention"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "xma_story_share"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "xma_story_mention"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "xma_live_viewer_invite"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "xma_product_share"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "xma_felix_share"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "xma_clip"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "xma_ar_effect"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "shops_collection_share"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "shop_share"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "reels_audio_share"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "ig_rooms_xma"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "appointment_booking"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "info_center"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "info_center_fact"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "generic_template"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "generic_xma"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "direct_group_poll_v1"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "direct_group_prompt"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "p2p_payment"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "fbpay_referral"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "music"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "p2b_order"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "book_now_link_share"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "comment_reshare"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "location_share_xma"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "fundraiser"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "ai_sticker"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "avatar_sticker"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "animated_avatar_sticker"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "destination"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "collections_share"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "public_collections_share"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "cutout_sticker"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "ify_content"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != 0) goto L_0x0c5e
            java.lang.String r0 = "message_item_type"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0515
            java.lang.String r4 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.2Fs r0 = X.2FW.A0A     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.2FW r0 = r0.A00(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0z = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0515:
            java.lang.String r0 = "reactions"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0525
            X.46s r0 = X.C2606946r.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0X = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0525:
            java.lang.String r0 = "user_based_emoji_reactions"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x057d
            X.16L r0 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != r1) goto L_0x0579
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r9.<init>()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0538:
            X.16L r0 = r10.A1J()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == r8) goto L_0x0578
            java.lang.String r7 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r10.A1J()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 != r0) goto L_0x0551
            r9.put(r7, r5)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x0538
        L_0x0551:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r6.<init>()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x0566
            r10.A0z()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x055d:
            X.4ur r0 = new X.4ur     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r0.<init>(r6)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r9.put(r7, r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x0538
        L_0x0566:
            X.16L r4 = r10.A1J()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x055d
            X.46u r0 = X.C2607146t.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0566
            r6.add(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x0566
        L_0x0578:
            r5 = r9
        L_0x0579:
            r2.A1y = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x057d:
            java.lang.String r0 = "media_interventions"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x05bc
            X.16L r0 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 != r1) goto L_0x05b8
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r7.<init>()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0590:
            X.16L r0 = r10.A1J()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == r8) goto L_0x05b7
            java.lang.String r6 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r10.A1J()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 != r0) goto L_0x05a9
            r7.put(r6, r5)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x0590
        L_0x05a9:
            int r0 = r10.A1D()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0590
            r7.put(r6, r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x0590
        L_0x05b7:
            r5 = r7
        L_0x05b8:
            r2.A1z = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x05bc:
            java.lang.String r0 = "count_based_emoji_reactions"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x05e7
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 != r0) goto L_0x05e3
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r5.<init>()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x05d1:
            X.16L r4 = r10.A1J()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x05e3
            com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction r0 = X.C272084k4.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x05d1
            r5.add(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x05d1
        L_0x05e3:
            r2.A22 = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x05e7:
            java.lang.String r0 = "edit_history"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0612
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 != r0) goto L_0x060e
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r5.<init>()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x05fc:
            X.16L r4 = r10.A1J()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x060e
            com.instagram.direct.model.DirectMessageEditHistory r0 = X.C277324uu.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x05fc
            r5.add(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x05fc
        L_0x060e:
            r2.A24 = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0612:
            java.lang.String r0 = "hide_in_thread"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0622
            boolean r0 = r10.A0d()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A2D = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0622:
            java.lang.String r0 = "thread_key"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0632
            com.instagram.model.direct.DirectThreadKey r0 = X.C254733sx.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0y = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0632:
            java.lang.String r0 = "direct_thread_id"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0642
            X.3t0 r0 = X.C254753sz.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0x = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0642:
            java.lang.String r0 = "expiring_media_client_seen_count"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0656
            int r0 = r10.A1D()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A1I = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0656:
            java.lang.String r0 = "seen_count"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0666
            int r0 = r10.A1D()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A02 = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0666:
            java.lang.String r0 = "expiring_media_action_summary"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0676
            X.5Dg r0 = X.C272064k2.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0f = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0676:
            java.lang.String r0 = "reply_type"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x068e
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x068a
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x068a:
            r2.A1x = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x068e:
            java.lang.String r0 = "view_mode"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x06a6
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x06a2
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x06a2:
            r2.A1v = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x06a6:
            java.lang.String r0 = "replay_expiring_at_us"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x06b6
            long r4 = r10.A0y()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A03 = r4     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x06b6:
            java.lang.String r0 = "cta_link"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x06c6
            X.Cti r0 = X.C44664Cii.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0R = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x06c6:
            java.lang.String r0 = "animated_media"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x06d6
            X.53G r0 = X.AnonymousClass53A.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A12 = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x06d6:
            java.lang.String r0 = "store_sticker"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x06e6
            com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem r0 = X.D1V.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A15 = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x06e6:
            java.lang.String r0 = "static_sticker"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x06f6
            X.6nz r0 = X.C369248u6.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0I = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x06f6:
            java.lang.String r0 = "status_reply"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0706
            X.OMp r0 = X.C45674D0z.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0p = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0706:
            java.lang.String r0 = "note_text_reply"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0716
            X.A9t r0 = X.C39825AAw.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0J = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0716:
            java.lang.String r0 = "replied_to_message"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0726
            X.3tI r0 = X.C254933tI.A00(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0a = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0726:
            java.lang.String r0 = "show_forward_attribution"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0736
            boolean r0 = r10.A0d()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A2F = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0736:
            java.lang.String r0 = "forward_score"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x074a
            int r0 = r10.A1D()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A1E = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x074a:
            java.lang.String r0 = "forward_source_invite_link"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0762
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x075e
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x075e:
            r2.A1Z = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0762:
            java.lang.String r0 = "forward_source_item_id"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x077a
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x0776
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0776:
            r2.A1a = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x077a:
            java.lang.String r0 = "forward_source_name"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0792
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x078e
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x078e:
            r2.A1b = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0792:
            java.lang.String r0 = "highly_forwarded_message"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x07a2
            boolean r0 = r10.A0d()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A2S = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x07a2:
            java.lang.String r0 = "send_silently"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x07b2
            boolean r0 = r10.A0d()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A2O = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x07b2:
            java.lang.String r0 = "policy_violation"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x07c2
            X.5xW r0 = X.C370628wm.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0W = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x07c2:
            java.lang.String r0 = "is_shh_mode"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x07d2
            boolean r0 = r10.A0d()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A2P = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x07d2:
            java.lang.String r0 = "instant_reply_info"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x07e2
            X.O7Y r0 = X.C69996Nva.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0K = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x07e2:
            java.lang.String r0 = "is_visual_item_seen"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x07f6
            boolean r0 = r10.A0d()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A1B = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x07f6:
            java.lang.String r0 = "message_power_up"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0806
            X.5FY r0 = X.AnonymousClass5FU.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0V = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0806:
            java.lang.String r0 = "mentioned_entities"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0831
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 != r0) goto L_0x082d
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r5.<init>()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x081b:
            X.16L r4 = r10.A1J()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x082d
            com.instagram.direct.model.mentions.MentionedEntity r0 = X.C277314us.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x081b
            r5.add(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x081b
        L_0x082d:
            r2.A28 = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0831:
            java.lang.String r0 = "reaction_image_url_info"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0841
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.16W.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A16 = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0841:
            java.lang.String r0 = "save_icon_state"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0855
            int r0 = r10.A1D()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A1G = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0855:
            java.lang.String r0 = "processed_business_suggestion"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0865
            boolean r0 = r10.A0d()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A2I = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0865:
            java.lang.String r0 = "commands"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0890
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 != r0) goto L_0x088c
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r5.<init>()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x087a:
            X.16L r4 = r10.A1J()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x088c
            X.9IY r0 = X.OPw.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x087a
            r5.add(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x087a
        L_0x088c:
            r2.A21 = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0890:
            java.lang.String r0 = "serialized_receiver_fetch_params"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x08a8
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x08a4
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x08a4:
            r2.A1o = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x08a8:
            java.lang.String r0 = "is_sent_by_viewer"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x08b8
            boolean r0 = r10.A0d()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A2N = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x08b8:
            java.lang.String r0 = "tq_seq_id"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x08cc
            long r4 = r10.A0y()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A1R = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x08cc:
            java.lang.String r0 = "is_ae"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x08e0
            boolean r0 = r10.A0d()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A18 = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x08e0:
            java.lang.String r0 = "armadillo_express_data"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x08f0
            X.N4L r0 = X.C70053NwV.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0D = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x08f0:
            java.lang.String r0 = "is_ae_dual_send"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0904
            boolean r0 = r10.A0d()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A19 = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0904:
            java.lang.String r0 = "comments_info"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0914
            com.instagram.direct.model.comments.DirectMessageComments r0 = X.C278284wc.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0q = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0914:
            java.lang.String r0 = "is_replyable_in_bc"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0924
            boolean r0 = r10.A0d()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A2L = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0924:
            java.lang.String r0 = "channel_message_seen_count"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0938
            int r0 = r10.A1D()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A1D = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0938:
            java.lang.String r0 = "send_attribution"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0950
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x094c
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x094c:
            r2.A1p = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0950:
            java.lang.String r0 = "is_saved_sticker"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0960
            boolean r0 = r10.A0d()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A2M = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0960:
            java.lang.String r0 = "is_from_msys"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0970
            boolean r0 = r10.A0d()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A2G = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0970:
            java.lang.String r0 = "message_expiration_timestamp_ms"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x098c
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0I     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 != r0) goto L_0x0988
            long r4 = r10.A0y()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            java.lang.Long r5 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0988:
            r2.A1L = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x098c:
            java.lang.String r0 = "message_ephemeral_lifetime_ms"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x09a8
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0I     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 != r0) goto L_0x09a4
            long r4 = r10.A0y()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            java.lang.Long r5 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x09a4:
            r2.A1K = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x09a8:
            java.lang.String r0 = "ephemeral_duration_sec"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x09c4
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0I     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 != r0) goto L_0x09c0
            long r4 = r10.A0y()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            java.lang.Long r5 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x09c0:
            r2.A1J = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x09c4:
            java.lang.String r0 = "ephemeral_view_timestamp_ms"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x09e0
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0I     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 != r0) goto L_0x09dc
            long r4 = r10.A0y()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            java.lang.Long r5 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x09dc:
            r2.A1O = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x09e0:
            java.lang.String r0 = "ephemeral_view_duration_sec"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x09fc
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0I     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 != r0) goto L_0x09f8
            long r4 = r10.A0y()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            java.lang.Long r5 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x09f8:
            r2.A1M = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x09fc:
            java.lang.String r0 = "ephemeral_after_view_expiration_timestamp_ms"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0a18
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0I     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 != r0) goto L_0x0a14
            long r4 = r10.A0y()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            java.lang.Long r5 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0a14:
            r2.A1N = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0a18:
            java.lang.String r0 = "is_ephemeral_exception"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0a28
            boolean r0 = r10.A0d()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A2E = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0a28:
            java.lang.String r0 = "receiver_fetch_preview_data"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0a53
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 != r0) goto L_0x0a4f
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r5.<init>()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0a3d:
            X.16L r4 = r10.A1J()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x0a4f
            X.3tC r0 = X.C254863tB.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0a3d
            r5.add(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x0a3d
        L_0x0a4f:
            r2.A2B = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0a53:
            java.lang.String r0 = "is_receiver_fetch_pending"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0a63
            boolean r0 = r10.A0d()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A2K = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0a63:
            java.lang.String r0 = "is_receiver_fetch_copy_message"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0a73
            boolean r0 = r10.A0d()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A2J = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0a73:
            java.lang.String r0 = "receiver_fetch_action_type"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0a8b
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x0a87
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0a87:
            r2.A1l = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0a8b:
            java.lang.String r0 = "receiver_fetch_content_type"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0aa3
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x0a9f
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0a9f:
            r2.A1n = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0aa3:
            java.lang.String r0 = "receiver_fetch_content_owner"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0abb
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x0ab7
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0ab7:
            r2.A1m = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0abb:
            java.lang.String r0 = "bot_metadata"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0acb
            X.7AG r0 = X.C44663Cih.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0Q = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0acb:
            java.lang.String r0 = "paid_partnership_info"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0adb
            X.9I4 r0 = X.C254803t4.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A04 = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0adb:
            java.lang.String r0 = "genai_params"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0aeb
            X.9JH r0 = X.C254813t5.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A09 = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0aeb:
            java.lang.String r0 = "ai_consumption_params"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0afb
            X.BB8 r0 = X.C44657Cib.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0M = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0afb:
            java.lang.String r0 = "image_glyphs"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0b0b
            X.UVA r0 = X.C18193VnB.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0l = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0b0b:
            java.lang.String r0 = "mustache_ctas"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0b36
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 != r0) goto L_0x0b32
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r5.<init>()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0b20:
            X.16L r4 = r10.A1J()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x0b32
            X.9JN r0 = X.C263354Lf.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0b20
            r5.add(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x0b20
        L_0x0b32:
            r2.A29 = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0b36:
            java.lang.String r0 = "message_trace_id"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0b4e
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x0b4a
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0b4a:
            r2.A1h = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0b4e:
            java.lang.String r0 = "edit_count"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0b5e
            int r0 = r10.A1D()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A01 = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0b5e:
            java.lang.String r0 = "ctx_ad_conversation_starter_info"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0b6e
            X.5Cg r0 = X.C282215Cf.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0k = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0b6e:
            java.lang.String r0 = "encrypted"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0b86
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x0b82
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0b82:
            r2.A1Y = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0b86:
            java.lang.String r0 = "opaque_message"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0b9e
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x0b9a
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0b9a:
            r2.A1i = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0b9e:
            java.lang.String r0 = "decryption_merge_error"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0bb6
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x0bb2
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0bb2:
            r2.A1X = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0bb6:
            java.lang.String r0 = "bloks_xma"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0bc6
            X.Rt3 r0 = X.C9825Rhn.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0O = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0bc6:
            java.lang.String r0 = "in_app_notification_info"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0bd6
            X.JwJ r0 = X.C63240Ktl.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0E = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0bd6:
            java.lang.String r0 = "is_taken_down"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0be6
            boolean r0 = r10.A0d()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A2Q = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0be6:
            java.lang.String r0 = "otid"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0bfe
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x0bfa
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0bfa:
            r2.A1j = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0bfe:
            java.lang.String r0 = "thread_locked_status"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0c12
            int r0 = r10.A1D()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A1H = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0c12:
            java.lang.String r0 = "scheduled_timestamp"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0c2e
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0I     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 != r0) goto L_0x0c2a
            long r4 = r10.A0y()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            java.lang.Long r5 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0c2a:
            r2.A1Q = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0c2e:
            java.lang.String r0 = "is_pinned"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0c3e
            boolean r0 = r10.A0d()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A2H = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0c3e:
            java.lang.String r0 = "one_click_upsell"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0c4e
            X.9Ib r0 = X.C300605xU.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A05 = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0c4e:
            java.lang.String r0 = "media_reaction_group"
            boolean r0 = r0.equals(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x003b
            X.3sw r0 = X.C254823t6.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A0m = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0c5e:
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 != r0) goto L_0x0c7d
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r5.<init>()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0c6b:
            X.16L r4 = r10.A1J()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x0c7d
            X.3tC r0 = X.C254863tB.parseFromJson(r10)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r0 == 0) goto L_0x0c6b
            r5.add(r0)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x0c6b
        L_0x0c7d:
            r2.A26 = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0c81:
            X.16L r4 = r10.A11()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            if (r4 == r0) goto L_0x0c8d
            java.lang.String r5 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0c8d:
            r2.A1q = r5     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0c91:
            java.lang.String r4 = r10.A1P()     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.2Fs r0 = X.2FW.A0A     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            X.2FW r0 = r0.A00(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r2.A10 = r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            goto L_0x003b
        L_0x0c9f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
            throw r0     // Catch:{ IOException -> 0x0cd1, Exception -> 0x0cca }
        L_0x0ca5:
            if (r12 != 0) goto L_0x0cc9
            boolean r0 = r10 instanceof X.0c9
            if (r0 == 0) goto L_0x0cc0
            X.0c9 r10 = (X.0c9) r10
            com.instagram.common.session.UserSession r1 = r10.A01
            X.3t0 r0 = X.AnonymousClass3t7.A00(r11)
            if (r0 == 0) goto L_0x0cbe
            X.3t0 r0 = X.C300965yF.A02(r0)
        L_0x0cb9:
            X.3su r2 = r2.A0N(r1, r0)
            return r2
        L_0x0cbe:
            r0 = 0
            goto L_0x0cb9
        L_0x0cc0:
            java.lang.String r1 = "direct_message_missing_session"
            java.lang.String r0 = "DirectMessage JSON needs to be parsed using SessionAwareJsonParser"
            X.0wb.A03(r1, r0)
            return r2
        L_0x0cc8:
            r2 = 0
        L_0x0cc9:
            return r2
        L_0x0cca:
            r0 = move-exception
            X.1Pf r1 = new X.1Pf
            r1.<init>(r0)
            throw r1
        L_0x0cd1:
            r1 = move-exception
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254703su.A00(X.16F, com.instagram.model.direct.DirectThreadKey, boolean):X.3su");
    }
}
