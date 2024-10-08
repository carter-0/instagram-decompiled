package X;

import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.2iL  reason: invalid class name */
public final class AnonymousClass2iL {
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public int A03 = 0;
    public int A04;
    public C376649Iu A05;
    public AnonymousClass1T9 A06;
    public AnonymousClass2l8 A07;
    public AnonymousClass2l8 A08;
    public AnonymousClass2l8 A09;
    public C227052iZ A0A;
    public String A0B = "undefined";
    public String A0C;
    public String A0D;
    public String A0E;
    public boolean A0F = false;
    public int[] A0G = null;
    public final long A0H;
    public final AnonymousClass1QT A0I;
    public final C227002iM A0J;
    public final 0lg A0K;
    public final ImageUrl A0L;
    public final Integer A0M;
    public final String A0N;
    public final Collection A0O = new ArrayList();
    public final Collection A0P = new ArrayList();
    public final boolean A0Q;
    public final AnonymousClass578 A0R;
    public volatile int A0S;
    public volatile int A0T;
    public volatile int A0U = 0;
    public volatile int A0V;
    public volatile int A0W = 0;
    public volatile int A0X;
    public volatile Integer A0Y;
    public volatile String A0Z;
    public volatile List A0a;
    public volatile int A0b;
    public final /* synthetic */ 1NK A0c;

    public static void A04(C226952iF r4, AnonymousClass2iL r5) {
        Collection collection;
        boolean remove;
        C226952iF A002;
        synchronized (r5) {
            collection = r5.A0O;
            remove = collection.remove(r4);
        }
        if (remove) {
            if (!r4.CZh()) {
                int i = r5.A03 - 1;
                r5.A03 = i;
                if (i == 0) {
                    A02(1Fe.A02, r5);
                }
            }
            if (!r4.Ce1()) {
                r5.A02--;
            }
            1NK r2 = r5.A0c;
            1NW r1 = r2.A0M;
            r1.sendMessage(r1.obtainMessage(2, r4));
            if (collection.isEmpty()) {
                if (r2.A01.ED5(r5)) {
                    0jG r12 = r2.A0E;
                    if (r12 != null) {
                        r12.Cie(r5.A0L);
                    }
                    r2.A0O.remove(((ImageCacheKey) r5.A0L.AjH()).A03);
                    return;
                }
                boolean z = r2.A0U;
                if (z && r2.A0P.contains(r5)) {
                    r5.A0Y = AnonymousClass05K.A0C;
                } else if (z && r2.A0R.contains(r5)) {
                    r5.A0Y = AnonymousClass05K.A0C;
                    AnonymousClass1T9 r0 = r5.A06;
                    if (r0 != null) {
                        r0.cancel();
                    }
                }
            } else if (r5.A0Y.equals(AnonymousClass05K.A00)) {
                synchronized (r5) {
                    A002 = A00(collection);
                }
                if (A002 != null) {
                    r5.A0X = A002.Bpa();
                }
            }
        } else {
            r5.A0P.remove(r4);
        }
    }

    public static synchronized void A07(AnonymousClass2iL r3) {
        synchronized (r3) {
            A08(r3, r3.A07, r3.A0X, r3.A0b);
        }
    }

    public static void A08(AnonymousClass2iL r17, AnonymousClass2l8 r18, int i, int i2) {
        Bitmap bitmap;
        int Bpa;
        1NK r2;
        Runnable r1;
        String str = null;
        AnonymousClass2l8 r0 = r18;
        if (r18 != null) {
            bitmap = r0.A00;
            str = r0.A01;
        } else {
            bitmap = null;
        }
        AnonymousClass2iL r9 = r17;
        AnonymousClass578 r4 = r9.A0R;
        int i3 = i;
        if (r4 != null) {
            r4.A01 = i3;
            r4.A00 = i3;
            1NK r02 = r9.A0c;
            ImageUrl imageUrl = r9.A0L;
            Looper.myLooper();
            Looper.getMainLooper();
            imageUrl.AjH();
            r4.A03 = r02.A0F.A00().B22(r02.A0L(imageUrl));
            r4.A05 = ((ImageCacheKey) imageUrl.AjH()).A03;
            if (!(bitmap == null || bitmap.getConfig() == null)) {
                r4.A06 = bitmap.getConfig().name();
            }
        }
        Iterator it = r9.A0O.iterator();
        while (it.hasNext()) {
            C226952iF r8 = (C226952iF) it.next();
            C226572hI AvU = r8.AvU();
            if (AvU != null) {
                AvU.Dvd(r4);
            }
            if (r9.A0S != 0) {
                Bpa = r9.A0S;
            } else {
                Bpa = r8.Bpa();
            }
            int i4 = i2;
            if (1NK.A0E(Bpa, i3)) {
                AnonymousClass2hE BhZ = r8.BhZ();
                if (!(BhZ == null || bitmap == null)) {
                    1NK.A0B(r9.A0c, new AnonymousClass5HQ(bitmap, r8, r9, BhZ, str, i3, i4), r8.ARK());
                }
            } else {
                AnonymousClass1MK AjZ = r8.AjZ();
                if (AjZ != null) {
                    if (r9.A0F) {
                        String str2 = r9.A0E;
                        if (str2 == null) {
                            str2 = "UNKNOWN";
                        }
                        AnonymousClass3LX r14 = new AnonymousClass3LX(bitmap, r9.A05, str2, str, i4);
                        r2 = r9.A0c;
                        r1 = new AnonymousClass3LY(r8, AjZ, r14);
                    } else {
                        r2 = r9.A0c;
                        r1 = new C254653sp(r8, AjZ, r9);
                    }
                    1NK.A0B(r2, r1, r8.ARK());
                }
                it.remove();
            }
        }
    }

    public final void A0D(C227052iZ r14, String str, String str2, int i, int i2, boolean z, boolean z2) {
        String str3;
        boolean z3;
        String str4;
        this.A0A = r14;
        this.A0D = str2;
        this.A01 = i2;
        int i3 = i;
        this.A04 = i3;
        String str5 = str;
        this.A0C = str;
        if (z2) {
            str3 = "disk";
        } else {
            str3 = "network";
        }
        if (r14 != null) {
            1NK r4 = this.A0c;
            this.A05 = C227792jv.A00(r4.A0C, r14.A02);
            1NK.A04((Bitmap) null, r4, this.A0A, this.A0L.getUrl());
        }
        if (i3 == -1 || (i3 != this.A0X ? i3 >= 6 : i > 0)) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean A0E2 = A0E();
        C227052iZ r0 = this.A0A;
        boolean z4 = z;
        if (!(r0 == null || i == 0)) {
            byte[] bArr = r0.A02;
            int i4 = r0.A00;
            1NK r02 = this.A0c;
            ImageUrl imageUrl = this.A0L;
            A0A(this, str5, r02.A0L(imageUrl), bArr, i4, i3, z4);
            0jG r1 = r02.A0E;
            if (r1 != null) {
                r1.CiV(imageUrl, this.A0A.A00);
            }
        }
        if (!z3 || !A0E2) {
            this.A0F = z3;
            Set set = this.A0c.A0R;
            if (z) {
                str4 = "SUCCESS";
            } else {
                str4 = "FAIL";
            }
            A09(this, str3, str4, set);
            return;
        }
        A0B(this, str3, this.A0c.A0R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x000d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0E() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Collection r0 = r3.A0O     // Catch:{ all -> 0x0025 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0025 }
        L_0x0007:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0025 }
            X.2iF r1 = (X.C226952iF) r1     // Catch:{ all -> 0x0025 }
            boolean r0 = r1.Es0()     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x001f
            boolean r0 = r1.CZh()     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x0007
        L_0x001f:
            r0 = 1
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return r0
        L_0x0022:
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            r0 = 0
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2iL.A0E():boolean");
    }

    public AnonymousClass2iL(AwakeTimeSinceBootClock awakeTimeSinceBootClock, 1NK r6, 0lg r7, ImageUrl imageUrl, String str, List list, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        1CE r0;
        this.A0c = r6;
        this.A0K = r7;
        this.A0J = new C227002iM();
        this.A0L = imageUrl;
        this.A0X = i;
        this.A0S = i3;
        this.A0a = list;
        this.A0W = i2;
        AnonymousClass1QT r3 = new AnonymousClass1QT();
        if (!z4 || r7 == null || !182.A06(0Tu.A05, r7, 36327705267944067L)) {
            r0 = 1CE.A06;
        } else {
            r0 = 1CE.A0C;
        }
        r3.A04 = r0;
        r3.A03 = 1Fe.A02;
        r3.A0C = str;
        r3.A02 = new AnonymousClass2iN(imageUrl, z2, z3);
        r3.A06 = imageUrl.BIy();
        this.A0I = r3;
        this.A0M = 1NK.A02(imageUrl);
        this.A0Y = AnonymousClass05K.A00;
        this.A0N = str;
        this.A0Q = z;
        this.A0H = TimeUnit.NANOSECONDS.toMillis(awakeTimeSinceBootClock.nowNanos());
        if (1NK.A0m) {
            AnonymousClass578 r1 = new AnonymousClass578();
            this.A0R = r1;
            r1.A02 = this.A0X;
            r1.A04 = imageUrl;
        }
    }

    private void A01() {
        if (!TextUtils.isEmpty(this.A0Z)) {
            AnonymousClass498 r2 = new AnonymousClass498(this);
            1NK r1 = this.A0c;
            if (r1.A0X) {
                r1.A05.execute(r2);
            } else {
                r2.run();
            }
        }
    }

    public static void A02(1Fe r2, AnonymousClass2iL r3) {
        int i;
        AnonymousClass1T9 r0 = r3.A06;
        if (r0 == null) {
            r3.A0I.A03 = r2;
        } else {
            r0.FJj(r2);
        }
        if (r2 == 1Fe.A02) {
            i = 0;
        } else {
            i = -1;
            if (r2 == 1Fe.A03) {
                i = 1;
            }
        }
        r3.A00 = i;
    }

    public static void A05(AnonymousClass2iL r7) {
        1NK r6 = r7.A0c;
        synchronized (r6.A0N) {
            if (!(r7.A0Y == AnonymousClass05K.A0C || r7.A02 == 0 || MZ2.A00 == null)) {
                UserSession userSession = r7.A0K;
                if (userSession instanceof UserSession) {
                    r6.A0P.remove(r7);
                    r6.A0R.add(r7);
                    0nY.A00().ATE(new NSB(MZ2.A00, r7, userSession, r6.A0Y));
                    1NK.A08(r6);
                }
            }
            A09(r7, "undefined", "CANCELLED", r6.A0P);
        }
    }

    public static void A09(AnonymousClass2iL r5, String str, String str2, Set set) {
        AnonymousClass2l8 r0;
        1NK r4 = r5.A0c;
        synchronized (r4.A0N) {
            0jG r1 = r4.A0E;
            if (r1 != null) {
                r1.Cik(r5.A0L, str, str2);
            }
            C227052iZ r02 = r5.A0A;
            if (r02 != null) {
                r5.A0b = r02.A00;
                r5.A0A.A01();
            }
            if (r5.A0F && ((r0 = r5.A07) == null || r0.A00 == null)) {
                synchronized (r5) {
                    Iterator it = r5.A0O.iterator();
                    while (it.hasNext()) {
                        C226952iF r12 = (C226952iF) it.next();
                        if (!r12.CZh()) {
                            r5.A0P.add(r12);
                            it.remove();
                        }
                    }
                }
            }
            r4.A0O.remove(((ImageCacheKey) r5.A0L.AjH()).A03);
            if (set != null) {
                set.remove(r5);
            }
            Collection<C226952iF> collection = r5.A0P;
            if (!collection.isEmpty()) {
                C226952iF A002 = A00(collection);
                if (A002 != null) {
                    collection.remove(A002);
                    r4.A0N(A002);
                }
                if (!collection.isEmpty()) {
                    for (C226952iF A0N2 : collection) {
                        r4.A0N(A0N2);
                    }
                    collection.clear();
                }
            } else {
                1NK.A08(r4);
            }
            AnonymousClass578 r03 = r5.A0R;
            if (r03 != null) {
                r03.A07 = str;
            }
            r5.A0E = str;
        }
        if (r4.A06) {
            A07(r5);
            return;
        }
        1NW r13 = r4.A0M;
        r13.sendMessage(r13.obtainMessage(3, r5));
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [X.57a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v7, types: [X.57a, java.lang.Object] */
    public static void A0A(AnonymousClass2iL r4, String str, String str2, byte[] bArr, int i, int i2, boolean z) {
        C227082ic r1;
        ImageCacheKey A012;
        try {
            1NK r2 = r4.A0c;
            if (r2.A0Z) {
                if (!z || str != null) {
                    HashMap hashMap = new HashMap();
                    if (!z) {
                        hashMap.put("scan", Integer.valueOf(i2));
                    }
                    if (str != null) {
                        hashMap.put("content_id", str);
                    }
                    ? obj = new Object();
                    obj.A00 = new JSONObject(hashMap);
                    r1 = r2.A0F.A00().AR8(obj, str2, true);
                } else {
                    r1 = r2.A0F.A00().AR2(str2);
                }
            } else if (!z) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("scan", Integer.valueOf(i2));
                ? obj2 = new Object();
                obj2.A00 = new JSONObject(hashMap2);
                r1 = r2.A0F.A00().AR8(obj2, str2, true);
            } else {
                r1 = r2.A0F.A00().AR2(str2);
            }
            if (r1.A00 != null) {
                AnonymousClass3Ey r3 = (AnonymousClass3Ey) r1.A00();
                try {
                    r3.write(bArr, 0, i);
                    if (r3.A03() && r2.A0G.A04 && z) {
                        1O7 r22 = r2.A0H;
                        0qQ.A0B(str2, 0);
                        if (r22.A02 && !r22.A03 && (A012 = 1O7.A01(r22, str2)) != null) {
                            1O7.A02(r22.A00, r22, A012);
                        }
                    }
                    r3.A02();
                } catch (Throwable th) {
                    th = th;
                    if (r3 != null) {
                        r3.A02();
                        throw th;
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public static void A0B(AnonymousClass2iL r4, String str, Set set) {
        1NK r3 = r4.A0c;
        synchronized (r3.A0N) {
            if (r4.A0Y == AnonymousClass05K.A0C) {
                A09(r4, str, "CANCELLED", set);
            } else {
                r4.A0B = str;
                set.remove(r4);
                r3.A0I.A7b(r4);
                0jG r1 = r3.A0E;
                if (r1 != null) {
                    r1.CiX(r4.A0L);
                }
                1NK.A08(r3);
            }
        }
    }

    public final int A0C() {
        1NK r1 = this.A0c;
        int abs = Math.abs(r1.A0T.get()) + r1.A0S.get();
        boolean equals = this.A0N.equals(1Rm.A00().A00);
        int i = this.A0W;
        if (equals) {
            return i + abs + 100;
        }
        return i;
    }

    public static C226952iF A00(Collection collection) {
        Iterator it = collection.iterator();
        C226952iF r3 = null;
        int i = -1;
        while (it.hasNext()) {
            C226952iF r1 = (C226952iF) it.next();
            if (r1.Bpa() == -1) {
                return r1;
            }
            if (r1.Bpa() > i) {
                i = r1.Bpa();
                r3 = r1;
            }
        }
        return r3;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e5  */
    public static void A03(X.C226952iF r8, X.AnonymousClass2iL r9) {
        /*
            int r1 = r8.Bpa()
            int r0 = r9.A0X
            boolean r0 = X.1NK.A0E(r1, r0)
            if (r0 == 0) goto L_0x001c
            java.lang.Integer r1 = r9.A0Y
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0146
            int r0 = r8.Bpa()
            r9.A0X = r0
        L_0x001c:
            java.lang.Integer r1 = r9.A0Y
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0178
            X.2iM r5 = r9.A0J
            boolean r7 = r8.Eru()
            boolean r6 = r8.Ess()
            int r3 = r8.BPJ()
            X.3gz r4 = r8.Bha()
            boolean r2 = r8.CWj()
            r1 = r2
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x0044
            r0 = 0
            if (r7 == 0) goto L_0x0045
        L_0x0044:
            r0 = 1
        L_0x0045:
            r5.A03 = r0
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x004e
            r0 = 0
            if (r6 == 0) goto L_0x004f
        L_0x004e:
            r0 = 1
        L_0x004f:
            r5.A04 = r0
            int r0 = r5.A00
            int r0 = java.lang.Math.min(r3, r0)
            r5.A00 = r0
            java.lang.Boolean r0 = r5.A02
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x006d
            java.lang.Boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0172
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x006c
            r1 = 1
            if (r2 != 0) goto L_0x006d
        L_0x006c:
            r1 = 0
        L_0x006d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.A02 = r0
            if (r4 == 0) goto L_0x007b
            X.3gz r0 = r5.A01
            if (r0 != 0) goto L_0x0114
            r5.A01 = r4
        L_0x007b:
            java.lang.String r1 = r8.BTL()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r4 = 0
            if (r0 != 0) goto L_0x0090
            java.util.Collection r0 = r9.A0O
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00ff
            r9.A0Z = r1
        L_0x0090:
            int r0 = r8.BTJ()
            r9.A0T = r0
            com.instagram.common.typedurl.ImageUrl r0 = r8.BGK()
            java.util.List r0 = r0.B2D()
            if (r0 == 0) goto L_0x00a2
            r9.A0a = r0
        L_0x00a2:
            X.1MK r2 = r8.AjZ()
            if (r2 == 0) goto L_0x00b2
            X.1NK r1 = r9.A0c
            X.2iO r0 = new X.2iO
            r0.<init>(r8, r2, r9)
            X.1NK.A0A(r1, r0)
        L_0x00b2:
            X.2hE r3 = r8.BhZ()
            X.2hC r2 = r8.BTK()
            if (r3 == 0) goto L_0x00ed
            X.2l8 r0 = r9.A09
            if (r0 == 0) goto L_0x00ed
            android.graphics.Bitmap r0 = r0.A00
            if (r0 == 0) goto L_0x00ed
            X.1NK r1 = r9.A0c
            X.Fu7 r0 = new X.Fu7
            r0.<init>(r8, r9, r3)
        L_0x00cb:
            X.1NK.A0A(r1, r0)
        L_0x00ce:
            boolean r0 = r8.CZh()
            if (r0 != 0) goto L_0x00df
            X.1Fe r0 = X.1Fe.A03
            A02(r0, r9)
            int r0 = r9.A03
            int r0 = r0 + 1
            r9.A03 = r0
        L_0x00df:
            boolean r0 = r8.Ce1()
            if (r0 != 0) goto L_0x00eb
            int r0 = r9.A02
            int r0 = r0 + 1
            r9.A02 = r0
        L_0x00eb:
            monitor-enter(r9)
            goto L_0x0157
        L_0x00ed:
            if (r2 == 0) goto L_0x00ce
            X.2l8 r0 = r9.A08
            if (r0 == 0) goto L_0x00ce
            android.graphics.Bitmap r0 = r0.A00
            if (r0 == 0) goto L_0x00ce
            X.1NK r1 = r9.A0c
            X.54q r0 = new X.54q
            r0.<init>(r8, r9, r2)
            goto L_0x00cb
        L_0x00ff:
            java.lang.String r0 = r9.A0Z
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0090
            r9.A0Z = r1
            X.2l8 r0 = r9.A09
            if (r0 == 0) goto L_0x0111
            android.graphics.Bitmap r0 = r0.A00
            if (r0 != 0) goto L_0x0090
        L_0x0111:
            r4 = 1
            goto L_0x0090
        L_0x0114:
            X.3gz r2 = r5.A01
            if (r2 == 0) goto L_0x012c
            X.3gz r0 = r5.A01
            if (r0 == 0) goto L_0x016c
            int r1 = r0.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x016c
            int r0 = r4.A01
            int r0 = java.lang.Math.min(r1, r0)
            r2.A01 = r0
        L_0x012c:
            X.3gz r2 = r5.A01
            if (r2 == 0) goto L_0x007b
            X.3gz r0 = r5.A01
            if (r0 == 0) goto L_0x0166
            int r1 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0166
            int r0 = r4.A00
            int r0 = java.lang.Math.min(r1, r0)
            r2.A00 = r0
            goto L_0x007b
        L_0x0146:
            java.lang.Integer r1 = r9.A0Y
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            java.util.Collection r0 = r9.A0P
            r0.add(r8)
            goto L_0x001c
        L_0x0157:
            java.util.Collection r0 = r9.A0O     // Catch:{ all -> 0x0163 }
            r0.add(r8)     // Catch:{ all -> 0x0163 }
            monitor-exit(r9)     // Catch:{ all -> 0x0163 }
            if (r4 == 0) goto L_0x017d
            r9.A01()
            return
        L_0x0163:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0163 }
            throw r0
        L_0x0166:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L_0x016c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L_0x0172:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L_0x0178:
            java.util.Collection r0 = r9.A0P
            r0.add(r8)
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2iL.A03(X.2iF, X.2iL):void");
    }

    public static void A06(AnonymousClass2iL r5) {
        r5.A01();
        1NK r4 = r5.A0c;
        synchronized (r4.A0N) {
            if (r5.A0Y == AnonymousClass05K.A0C || r5.A02 == 0) {
                A09(r5, "undefined", "CANCELLED", r4.A0P);
            } else {
                r4.A0P.remove(r5);
                r4.A0R.add(r5);
                0nY.A00().ATE(new AnonymousClass3OX(r5, r4.A0Y));
                1NK.A08(r4);
            }
        }
    }
}
