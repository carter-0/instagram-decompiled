package com.instagram.video.live.mvvm.model.repository;

import X.0sn;
import X.C16669Uz5;
import X.C391379sn;
import X.LGC;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveQuestionsApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class IgLiveQuestionsRepository {
    public int A00;
    public int A01;
    public Long A02;
    public List A03;
    public List A04;
    public int A05;
    public final UserSession A06;
    public final IgLiveQuestionsApi A07;
    public final HashMap A08 = new HashMap();

    /* JADX WARNING: type inference failed for: r4v1, types: [X.Il4, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(java.lang.String r7, X.AnonymousClass4D7 r8, long r9) {
        /*
            r6 = this;
            r3 = 0
            boolean r0 = r8 instanceof X.C58072Il4
            if (r0 == 0) goto L_0x007a
            r4 = r8
            X.Il4 r4 = (X.C58072Il4) r4
            int r0 = r4.A05
            if (r0 != r3) goto L_0x007a
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007a
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0017:
            java.lang.Object r2 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0067
            if (r0 != r1) goto L_0x0092
            long r9 = r4.A01
            java.lang.Object r5 = r4.A02
            com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository r5 = (com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository) r5
            X.0eS.A00(r2)
        L_0x002b:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0080
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r3 = r2.A00
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L_0x0066
            java.lang.Long r4 = r5.A02
            if (r4 == 0) goto L_0x005a
            long r1 = r4.longValue()
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0066
            long r1 = r4.longValue()
            java.util.HashMap r0 = r5.A08
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L_0x005a
            X.9sn r0 = X.C391379sn.ANSWERED
            r5.A09(r0, r1)
        L_0x005a:
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r9)
            r5.A02 = r0
            X.9sn r0 = X.C391379sn.CURRENT
            r5.A09(r0, r9)
        L_0x0066:
            return r3
        L_0x0067:
            X.0eS.A00(r2)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveQuestionsApi r0 = r6.A07
            r4.A02 = r6
            r4.A01 = r9
            r4.A00 = r1
            java.lang.Object r2 = r0.A05(r7, r4, r9)
            if (r2 == r3) goto L_0x0066
            r5 = r6
            goto L_0x002b
        L_0x007a:
            X.Il4 r4 = new X.Il4
            r4.<init>(r6, r8, r3)
            goto L_0x0017
        L_0x0080:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = "IG Live question network request failed"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L_0x008c:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0092:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository.A05(java.lang.String, X.4D7, long):java.lang.Object");
    }

    public /* synthetic */ IgLiveQuestionsRepository(UserSession userSession) {
        IgLiveQuestionsApi igLiveQuestionsApi = new IgLiveQuestionsApi(userSession);
        this.A06 = userSession;
        this.A07 = igLiveQuestionsApi;
        0sn r0 = 0sn.A00;
        this.A04 = r0;
        this.A03 = r0;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME5, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r6, java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r5 = this;
            r3 = 15
            boolean r0 = X.ME5.A03(r3, r8)
            if (r0 == 0) goto L_0x003d
            r4 = r8
            X.ME5 r4 = (X.ME5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r1) goto L_0x0057
            X.0eS.A00(r3)
        L_0x0024:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0045
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r2 = r3.A00
            return r2
        L_0x002f:
            X.0eS.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveQuestionsApi r0 = r5.A07
            r4.A00 = r1
            java.lang.Object r3 = r0.A00(r6, r7, r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x003d:
            r0 = 42
            X.ME5 r4 = new X.ME5
            r4.<init>(r5, r8, r3, r0)
            goto L_0x0016
        L_0x0045:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "IG Live question network request failed"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L_0x0051:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0057:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository.A00(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r29, X.AnonymousClass4D7 r30) {
        /*
            r28 = this;
            r3 = 20
            r5 = r30
            boolean r0 = X.C66139MDr.A01(r3, r5)
            r6 = r28
            if (r0 == 0) goto L_0x00de
            r4 = r5
            X.MDr r4 = (X.C66139MDr) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00de
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r3 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x00c4
            if (r0 != r1) goto L_0x024a
            java.lang.Object r5 = r4.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository r5 = (com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository) r5
            X.0eS.A00(r3)
        L_0x002c:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0238
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            X.UXP r0 = (X.UXP) r0
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x00e5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r15 = r0.iterator()
        L_0x0045:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00e7
            java.lang.Object r10 = r15.next()
            X.VcA r10 = (X.C17679VcA) r10
            long r1 = r10.A01
            com.instagram.user.model.User r9 = r10.A03
            if (r9 == 0) goto L_0x00c1
            com.instagram.common.typedurl.ImageUrl r18 = r9.Bh3()
        L_0x005b:
            java.lang.String r8 = r10.A07
            X.0qQ.A06(r8)
            java.lang.String r3 = r10.A06
            java.util.Map r0 = X.C16669Uz5.A01
            java.lang.Object r6 = r0.get(r3)
            X.Uz5 r6 = (X.C16669Uz5) r6
            if (r6 != 0) goto L_0x006e
            X.Uz5 r6 = X.C16669Uz5.UNKNOWN
        L_0x006e:
            long r3 = r10.A01
            java.lang.Long r0 = r5.A02
            if (r0 == 0) goto L_0x00be
            long r11 = r0.longValue()
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x00be
            X.9sn r12 = X.C391379sn.CURRENT
        L_0x007e:
            X.0qQ.A0A(r12)
            int r11 = r10.A00
            int r0 = r5.A05
            int r0 = r0 + r11
            r5.A05 = r0
            boolean r0 = r10.A08
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.Long r3 = r10.A05
            if (r3 != 0) goto L_0x00af
            r22 = 0
        L_0x0092:
            X.Jvq r4 = r10.A02
            X.LGC r3 = new X.LGC
            r23 = r8
            r24 = r11
            r25 = r1
            r27 = r0
            r19 = r9
            r20 = r6
            r21 = r12
            r16 = r3
            r17 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r27)
            r7.add(r3)
            goto L_0x0045
        L_0x00af:
            long r3 = r3.longValue()
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            long r3 = r14.convert(r3, r13)
            java.lang.Long r22 = java.lang.Long.valueOf(r3)
            goto L_0x0092
        L_0x00be:
            X.9sn r12 = r10.A04
            goto L_0x007e
        L_0x00c1:
            r18 = 0
            goto L_0x005b
        L_0x00c4:
            X.0eS.A00(r3)
            java.util.HashMap r0 = r6.A08
            r0.clear()
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveQuestionsApi r0 = r6.A07
            r4.A01 = r6
            r4.A00 = r1
            r1 = r29
            java.lang.Object r3 = r0.A01(r1, r4)
            if (r3 != r2) goto L_0x00db
            return r2
        L_0x00db:
            r5 = r6
            goto L_0x002c
        L_0x00de:
            X.MDr r4 = new X.MDr
            r4.<init>(r6, r5, r3)
            goto L_0x001a
        L_0x00e5:
            X.0sn r7 = X.0sn.A00
        L_0x00e7:
            java.util.Iterator r8 = r7.iterator()
        L_0x00eb:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0119
            java.lang.Object r6 = r8.next()
            X.LGC r6 = (X.LGC) r6
            X.7jz r1 = X.C339667jy.A03
            com.instagram.common.session.UserSession r0 = r5.A06
            X.7jy r0 = r1.A00(r0)
            long r2 = r6.A01
            java.lang.String r4 = java.lang.String.valueOf(r2)
            X.0xa r1 = r0.A01
            r0 = 0
            boolean r0 = r1.getBoolean(r4, r0)
            if (r0 != 0) goto L_0x00eb
            java.util.HashMap r1 = r5.A08
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r2)
            r1.put(r0, r6)
            goto L_0x00eb
        L_0x0119:
            boolean r4 = r7 instanceof java.util.Collection
            r6 = 0
            if (r4 == 0) goto L_0x0152
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0152
            r3 = 0
        L_0x0125:
            r5.A00 = r3
            if (r4 == 0) goto L_0x016e
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x016e
            r3 = 0
        L_0x0130:
            r5.A01 = r3
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r3 = r7.iterator()
        L_0x013b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0191
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.LGC r0 = (X.LGC) r0
            X.9sn r1 = r0.A06
            X.9sn r0 = X.C391379sn.UNANSWERED
            if (r1 != r0) goto L_0x013b
            r9.add(r2)
            goto L_0x013b
        L_0x0152:
            java.util.Iterator r2 = r7.iterator()
            r3 = 0
        L_0x0157:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0125
            java.lang.Object r0 = r2.next()
            X.LGC r0 = (X.LGC) r0
            X.Uz5 r1 = X.C16669Uz5.LIVE
            X.Uz5 r0 = r0.A05
            if (r1 != r0) goto L_0x0157
            int r3 = r3 + 1
            if (r3 >= 0) goto L_0x0157
            goto L_0x0189
        L_0x016e:
            java.util.Iterator r2 = r7.iterator()
            r3 = 0
        L_0x0173:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0130
            java.lang.Object r0 = r2.next()
            X.LGC r0 = (X.LGC) r0
            X.Uz5 r1 = X.C16669Uz5.STORY
            X.Uz5 r0 = r0.A05
            if (r1 != r0) goto L_0x0173
            int r3 = r3 + 1
            if (r3 >= 0) goto L_0x0173
        L_0x0189:
            X.0sr.A1S()
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0191:
            r4 = 10
            int r0 = X.0Yv.A1E(r9, r4)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.Iterator r3 = r9.iterator()
        L_0x01a0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01b7
            java.lang.Object r0 = r3.next()
            X.LGC r0 = (X.LGC) r0
            long r1 = r0.A01
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            r8.add(r0)
            goto L_0x01a0
        L_0x01b7:
            r5.A04 = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r3 = r7.iterator()
        L_0x01c2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01d9
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.LGC r0 = (X.LGC) r0
            X.9sn r1 = r0.A06
            X.9sn r0 = X.C391379sn.ANSWERED
            if (r1 != r0) goto L_0x01c2
            r8.add(r2)
            goto L_0x01c2
        L_0x01d9:
            int r0 = X.0Yv.A1E(r8, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r3 = r8.iterator()
        L_0x01e6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01fd
            java.lang.Object r0 = r3.next()
            X.LGC r0 = (X.LGC) r0
            long r1 = r0.A01
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            r4.add(r0)
            goto L_0x01e6
        L_0x01fd:
            r5.A03 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r7.iterator()
        L_0x0208:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x021f
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.LGC r0 = (X.LGC) r0
            X.9sn r1 = r0.A06
            X.9sn r0 = X.C391379sn.UNANSWERED
            if (r1 != r0) goto L_0x0208
            r4.add(r2)
            goto L_0x0208
        L_0x021f:
            java.util.Iterator r1 = r4.iterator()
        L_0x0223:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0233
            java.lang.Object r0 = r1.next()
            X.LGC r0 = (X.LGC) r0
            int r0 = r0.A00
            int r6 = r6 + r0
            goto L_0x0223
        L_0x0233:
            r5.A05 = r6
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0238:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0244
            java.lang.String r0 = "IG Live question network request failed"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L_0x0244:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x024a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository.A01(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME5, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r6, X.AnonymousClass4D7 r7, long r8) {
        /*
            r5 = this;
            r3 = 13
            boolean r0 = X.ME5.A03(r3, r7)
            if (r0 == 0) goto L_0x003d
            r4 = r7
            X.ME5 r4 = (X.ME5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r1) goto L_0x0057
            X.0eS.A00(r3)
        L_0x0024:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0045
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r2 = r3.A00
            return r2
        L_0x002f:
            X.0eS.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveQuestionsApi r0 = r5.A07
            r4.A00 = r1
            java.lang.Object r3 = r0.A02(r6, r4, r8)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x003d:
            r0 = 42
            X.ME5 r4 = new X.ME5
            r4.<init>(r5, r7, r3, r0)
            goto L_0x0016
        L_0x0045:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "IG Live question network request failed"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L_0x0051:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0057:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository.A02(java.lang.String, X.4D7, long):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.String r7, X.AnonymousClass4D7 r8, long r9) {
        /*
            r6 = this;
            r4 = 19
            boolean r0 = X.C66139MDr.A01(r4, r8)
            if (r0 == 0) goto L_0x0064
            r3 = r8
            X.MDr r3 = (X.C66139MDr) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0064
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r3.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L_0x0053
            if (r0 != r1) goto L_0x007c
            java.lang.Object r5 = r3.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository r5 = (com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository) r5
            X.0eS.A00(r2)
        L_0x0028:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x006a
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r4 = r2.A00
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L_0x0052
            java.lang.Long r3 = r5.A02
            if (r3 == 0) goto L_0x004f
            long r1 = r3.longValue()
            java.util.HashMap r0 = r5.A08
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L_0x004f
            X.9sn r0 = X.C391379sn.ANSWERED
            r5.A09(r0, r1)
        L_0x004f:
            r0 = 0
            r5.A02 = r0
        L_0x0052:
            return r4
        L_0x0053:
            X.0eS.A00(r2)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveQuestionsApi r0 = r6.A07
            r3.A01 = r6
            r3.A00 = r1
            java.lang.Object r2 = r0.A03(r7, r3, r9)
            if (r2 == r4) goto L_0x0052
            r5 = r6
            goto L_0x0028
        L_0x0064:
            X.MDr r3 = new X.MDr
            r3.<init>(r6, r8, r4)
            goto L_0x0016
        L_0x006a:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "IG Live question network request failed"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L_0x0076:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x007c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository.A03(java.lang.String, X.4D7, long):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME5, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.lang.String r6, X.AnonymousClass4D7 r7, long r8) {
        /*
            r5 = this;
            r3 = 14
            boolean r0 = X.ME5.A03(r3, r7)
            if (r0 == 0) goto L_0x003d
            r4 = r7
            X.ME5 r4 = (X.ME5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r1) goto L_0x0057
            X.0eS.A00(r3)
        L_0x0024:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0045
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r2 = r3.A00
            return r2
        L_0x002f:
            X.0eS.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveQuestionsApi r0 = r5.A07
            r4.A00 = r1
            java.lang.Object r3 = r0.A04(r6, r4, r8)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x003d:
            r0 = 42
            X.ME5 r4 = new X.ME5
            r4.<init>(r5, r7, r3, r0)
            goto L_0x0016
        L_0x0045:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "IG Live question network request failed"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L_0x0051:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0057:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository.A04(java.lang.String, X.4D7, long):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME5, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(java.lang.String r6, X.AnonymousClass4D7 r7, long r8) {
        /*
            r5 = this;
            r3 = 16
            boolean r0 = X.ME5.A03(r3, r7)
            if (r0 == 0) goto L_0x003d
            r4 = r7
            X.ME5 r4 = (X.ME5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r1) goto L_0x0057
            X.0eS.A00(r3)
        L_0x0024:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0045
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r2 = r3.A00
            return r2
        L_0x002f:
            X.0eS.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveQuestionsApi r0 = r5.A07
            r4.A00 = r1
            java.lang.Object r3 = r0.A06(r6, r4, r8)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x003d:
            r0 = 42
            X.ME5 r4 = new X.ME5
            r4.<init>(r5, r7, r3, r0)
            goto L_0x0016
        L_0x0045:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "IG Live question network request failed"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L_0x0051:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0057:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository.A06(java.lang.String, X.4D7, long):java.lang.Object");
    }

    public final List A07() {
        List<Number> list = this.A03;
        ArrayList arrayList = new ArrayList();
        for (Number longValue : list) {
            Object obj = this.A08.get(Long.valueOf(longValue.longValue()));
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List A08() {
        List<Number> list = this.A04;
        ArrayList arrayList = new ArrayList();
        for (Number longValue : list) {
            Object obj = this.A08.get(Long.valueOf(longValue.longValue()));
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void A09(C391379sn r16, long j) {
        HashMap hashMap = this.A08;
        Long valueOf = Long.valueOf(j);
        LGC lgc = (LGC) hashMap.get(valueOf);
        if (lgc != null) {
            C391379sn r8 = r16;
            if (r8 != lgc.A06) {
                long j2 = lgc.A01;
                User user = lgc.A04;
                ImageUrl imageUrl = lgc.A03;
                String str = lgc.A08;
                C16669Uz5 uz5 = lgc.A05;
                int i = lgc.A00;
                boolean z = lgc.A09;
                lgc = new LGC(lgc.A02, imageUrl, user, uz5, r8, lgc.A07, str, i, j2, z);
            }
            hashMap.put(valueOf, lgc);
        }
    }
}
