package com.instagram.creation.capture.quickcapture.inspirationhub.network;

import X.05D;
import X.0V2;
import X.0qQ;
import X.10D;
import X.1Av;
import X.AnonymousClass05K;
import X.C359348cg;
import X.C359358ch;
import X.C61770pa;
import android.util.LruCache;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.HashMap;

public final class InspirationHubRepository {
    public final LruCache A00;
    public final InspirationHubNetworkDataSource A01;
    public final HashMap A02;
    public final HashMap A03;
    public final 0V2 A04;
    public final C61770pa A05;
    public final C61770pa A06;
    public final C61770pa A07;
    public final UserSession A08;
    public final 1Av A09;
    public final 0V2 A0A;
    public final 0V2 A0B;

    public InspirationHubRepository(UserSession userSession, InspirationHubNetworkDataSource inspirationHubNetworkDataSource, 1Av r7) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r7, 2);
        this.A08 = userSession;
        this.A09 = r7;
        this.A01 = inspirationHubNetworkDataSource;
        Integer num = AnonymousClass05K.A00;
        05D A012 = 10D.A01(num, 0, 0);
        this.A04 = A012;
        05D A013 = 10D.A01(num, 0, 0);
        this.A0B = A013;
        05D A014 = 10D.A01(num, 0, 0);
        this.A0A = A014;
        C359358ch A0B2 = r7.A0B();
        this.A00 = A0B2 == null ? C359348cg.A00() : A0B2;
        this.A05 = A014;
        this.A07 = A012;
        this.A06 = A013;
        this.A03 = new HashMap();
        this.A02 = new HashMap();
    }

    public static final boolean A02(Medium medium) {
        return medium != null && medium.A06() && new File(medium.A0X).exists();
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.9Jd, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository r13, java.lang.String r14, java.util.List r15, X.AnonymousClass4D7 r16) {
        /*
            r3 = 12
            r4 = r16
            boolean r0 = X.C376739Jd.A00(r3, r4)
            if (r0 == 0) goto L_0x0129
            r5 = r4
            X.9Jd r5 = (X.C376739Jd) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0129
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0018:
            java.lang.Object r1 = r5.A04
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 3
            r7 = 2
            r10 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0030
            if (r0 == r10) goto L_0x008f
            if (r0 == r7) goto L_0x00b7
            if (r0 != r3) goto L_0x0130
            X.0eS.A00(r1)
        L_0x002d:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0030:
            X.0eS.A00(r1)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r12 = r15.iterator()
        L_0x0041:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x007e
            java.lang.Object r11 = r12.next()
            X.1Xj r11 = (X.1Xj) r11
            java.lang.String r0 = r11.A2n()
            java.lang.String r8 = "Required value was null."
            if (r0 == 0) goto L_0x0144
            r6.put(r0, r2)
            android.util.LruCache r1 = r13.A00
            if (r1 == 0) goto L_0x007c
            java.lang.String r0 = r11.A2n()
            if (r0 == 0) goto L_0x013e
            java.lang.Object r1 = r1.get(r0)
            com.instagram.common.gallery.Medium r1 = (com.instagram.common.gallery.Medium) r1
        L_0x0068:
            boolean r0 = A02(r1)
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = r11.A2n()
            if (r0 == 0) goto L_0x0138
            r6.put(r0, r1)
            goto L_0x0041
        L_0x0078:
            r9.add(r11)
            goto L_0x0041
        L_0x007c:
            r1 = r2
            goto L_0x0068
        L_0x007e:
            com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubNetworkDataSource r0 = r13.A01
            r5.A01 = r13
            r5.A02 = r14
            r5.A03 = r6
            r5.A00 = r10
            java.lang.Object r1 = r0.A01(r9, r5)
            if (r1 != r4) goto L_0x009c
            return r4
        L_0x008f:
            java.lang.Object r6 = r5.A03
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r14 = r5.A02
            java.lang.Object r13 = r5.A01
            com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository r13 = (com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository) r13
            X.0eS.A00(r1)
        L_0x009c:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00cb
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x014a
            X.0V2 r0 = r13.A0A
            r5.A01 = r13
            r5.A02 = r14
            r5.A03 = r6
            r5.A00 = r7
            java.lang.Object r0 = r0.emit(r14, r5)
            if (r0 != r4) goto L_0x00c4
            return r4
        L_0x00b7:
            java.lang.Object r6 = r5.A03
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r14 = r5.A02
            java.lang.Object r13 = r5.A01
            com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository r13 = (com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository) r13
            X.0eS.A00(r1)
        L_0x00c4:
            X.0gF r0 = X.C60340gF.A00
            X.5sO r1 = new X.5sO
            r1.<init>(r0)
        L_0x00cb:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x011f
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r8 = r0.iterator()
        L_0x00d9:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r7 = r8.next()
            com.instagram.common.gallery.Medium r7 = (com.instagram.common.gallery.Medium) r7
            android.util.LruCache r1 = r13.A00
            if (r1 == 0) goto L_0x00ee
            java.lang.String r0 = r7.A0Y
            r1.put(r0, r7)
        L_0x00ee:
            java.lang.String r0 = r7.A0Y
            r6.put(r0, r7)
            goto L_0x00d9
        L_0x00f4:
            android.util.LruCache r1 = r13.A00
            if (r1 == 0) goto L_0x00fd
            X.1Av r0 = r13.A09
            r0.A0n(r1)
        L_0x00fd:
            java.util.HashMap r1 = r13.A03
            java.util.Collection r0 = r6.values()
            java.util.List r0 = X.00k.A0a(r0)
            java.util.List r0 = X.00k.A0X(r0)
            r1.put(r14, r0)
            X.0V2 r0 = r13.A04
            r5.A01 = r2
            r5.A02 = r2
            r5.A03 = r2
            r5.A00 = r3
            java.lang.Object r0 = r0.emit(r1, r5)
            if (r0 != r4) goto L_0x002d
            return r4
        L_0x011f:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x002d
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0129:
            X.9Jd r5 = new X.9Jd
            r5.<init>(r13, r4, r3)
            goto L_0x0018
        L_0x0130:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0138:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x013e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x0144:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x014a:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository.A00(com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository, java.lang.String, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9Jd, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository r13, java.util.List r14, X.AnonymousClass4D7 r15) {
        /*
            r3 = 13
            boolean r0 = X.C376739Jd.A00(r3, r15)
            if (r0 == 0) goto L_0x012f
            r4 = r15
            X.9Jd r4 = (X.C376739Jd) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x012f
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A04
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 3
            r8 = 2
            r10 = 1
            java.lang.String r7 = "Required value was null."
            r2 = 0
            if (r0 == 0) goto L_0x0030
            if (r0 == r10) goto L_0x008d
            if (r0 == r8) goto L_0x00c4
            if (r0 != r5) goto L_0x0136
            X.0eS.A00(r1)
        L_0x002d:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0030:
            X.0eS.A00(r1)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r12 = r14.iterator()
        L_0x0041:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.Object r11 = r12.next()
            X.1Xj r11 = (X.1Xj) r11
            java.lang.String r0 = r11.A2n()
            if (r0 == 0) goto L_0x014a
            r6.put(r0, r2)
            android.util.LruCache r1 = r13.A00
            if (r1 == 0) goto L_0x007a
            java.lang.String r0 = r11.A2n()
            if (r0 == 0) goto L_0x0144
            java.lang.Object r1 = r1.get(r0)
            com.instagram.common.gallery.Medium r1 = (com.instagram.common.gallery.Medium) r1
        L_0x0066:
            boolean r0 = A02(r1)
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = r11.A2n()
            if (r0 == 0) goto L_0x013e
            r6.put(r0, r1)
            goto L_0x0041
        L_0x0076:
            r9.add(r11)
            goto L_0x0041
        L_0x007a:
            r1 = r2
            goto L_0x0066
        L_0x007c:
            com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubNetworkDataSource r0 = r13.A01
            r4.A01 = r13
            r4.A02 = r14
            r4.A03 = r6
            r4.A00 = r10
            java.lang.Object r1 = r0.A01(r9, r4)
            if (r1 != r3) goto L_0x009c
            return r3
        L_0x008d:
            java.lang.Object r6 = r4.A03
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r14 = r4.A02
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r13 = r4.A01
            com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository r13 = (com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository) r13
            X.0eS.A00(r1)
        L_0x009c:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00d6
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0156
            X.0V2 r1 = r13.A0A
            r0 = 0
            java.lang.Object r0 = r14.get(r0)
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r0 = r0.A2n()
            if (r0 == 0) goto L_0x0150
            r4.A01 = r13
            r4.A02 = r6
            r4.A03 = r2
            r4.A00 = r8
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L_0x00cf
            return r3
        L_0x00c4:
            java.lang.Object r6 = r4.A02
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r13 = r4.A01
            com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository r13 = (com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository) r13
            X.0eS.A00(r1)
        L_0x00cf:
            X.0gF r0 = X.C60340gF.A00
            X.5sO r1 = new X.5sO
            r1.<init>(r0)
        L_0x00d6:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0125
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r8 = r0.iterator()
        L_0x00e4:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r7 = r8.next()
            com.instagram.common.gallery.Medium r7 = (com.instagram.common.gallery.Medium) r7
            android.util.LruCache r1 = r13.A00
            if (r1 == 0) goto L_0x00f9
            java.lang.String r0 = r7.A0Y
            r1.put(r0, r7)
        L_0x00f9:
            java.lang.String r0 = r7.A0Y
            r6.put(r0, r7)
            goto L_0x00e4
        L_0x00ff:
            android.util.LruCache r1 = r13.A00
            if (r1 == 0) goto L_0x0108
            X.1Av r0 = r13.A09
            r0.A0n(r1)
        L_0x0108:
            X.0V2 r1 = r13.A0B
            java.util.Collection r0 = r6.values()
            java.util.List r0 = X.00k.A0a(r0)
            java.util.List r0 = X.00k.A0X(r0)
            r4.A01 = r2
            r4.A02 = r2
            r4.A03 = r2
            r4.A00 = r5
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L_0x002d
            return r3
        L_0x0125:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x002d
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x012f:
            X.9Jd r4 = new X.9Jd
            r4.<init>(r13, r15, r3)
            goto L_0x0016
        L_0x0136:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x013e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0144:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x014a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0150:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0156:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository.A01(com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.String r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 15
            boolean r0 = X.C376709Ja.A00(r3, r7)
            if (r0 == 0) goto L_0x0056
            r4 = r7
            X.9Ja r4 = (X.C376709Ja) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0056
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r2 = r4.A00
            r1 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r1) goto L_0x005c
            java.lang.Object r6 = r4.A02
            java.lang.Object r2 = r4.A01
            com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository r2 = (com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository) r2
            X.0eS.A00(r0)
        L_0x002a:
            if (r0 == 0) goto L_0x0031
            java.util.HashMap r1 = r2.A02
            r1.put(r6, r0)
        L_0x0031:
            java.util.HashMap r0 = r2.A02
            java.lang.Object r0 = r0.get(r6)
            return r0
        L_0x0038:
            X.0eS.A00(r0)
            java.util.HashMap r0 = r5.A02
            java.lang.Object r0 = r0.get(r6)
            if (r0 != 0) goto L_0x0054
            r4.A01 = r5
            r4.A02 = r6
            r4.A00 = r1
            com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubNetworkDataSource r0 = r5.A01
            java.lang.Object r0 = r0.A00(r6, r4)
            if (r0 != r3) goto L_0x0052
            return r3
        L_0x0052:
            r2 = r5
            goto L_0x002a
        L_0x0054:
            r2 = r5
            goto L_0x0031
        L_0x0056:
            X.9Ja r4 = new X.9Ja
            r4.<init>(r5, r7, r3)
            goto L_0x0016
        L_0x005c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository.A03(java.lang.String, X.4D7):java.lang.Object");
    }
}
