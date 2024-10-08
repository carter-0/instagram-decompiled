package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;
import com.instagram.quickpromotion.sdk.InstagramQpSdkModule;
import java.util.Map;

/* renamed from: X.9KU  reason: invalid class name */
public final class AnonymousClass9KU extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KU(Context context, AnonymousClass12T r3, UserSession userSession, 2br r5, 2cX r6, C228012ke r7, InstagramQpSdkModule instagramQpSdkModule, Map map, AnonymousClass4D7 r10, C262224Cq r11) {
        super(2, r10);
        this.A07 = 3;
        this.A03 = r5;
        this.A0A = instagramQpSdkModule;
        this.A06 = userSession;
        this.A09 = context;
        this.A04 = map;
        this.A05 = r6;
        this.A08 = r7;
        this.A01 = r11;
        this.A02 = r3;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.9KU, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.9KU, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.9KU, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.9KU, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r16) {
        AnonymousClass4D7 r12 = r16;
        switch (this.A07) {
            case 0:
                ? r3 = new AnonymousClass9KU(this.A09, this.A0A, this.A08, this.A01, r12, 0);
                r3.A02 = obj;
                return r3;
            case 1:
                Object obj2 = this.A0A;
                return new AnonymousClass9KU(this.A09, obj2, this.A08, this.A01, r12, 1);
            case 2:
                return new AnonymousClass9KU((ContentFilterDictionaryImpl) this.A09, (ContentFilterDictionaryRegistrar) this.A0A, (AnonymousClass92L) this.A08, r12);
            default:
                UserSession userSession = (UserSession) this.A06;
                Context context = (Context) this.A09;
                2cX r8 = (2cX) this.A05;
                C228012ke r9 = (C228012ke) this.A08;
                return new AnonymousClass9KU(context, (AnonymousClass12T) this.A02, userSession, (2br) this.A03, r8, r9, (InstagramQpSdkModule) this.A0A, (Map) this.A04, r12, (C262224Cq) this.A01);
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9KU) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.9KU, java.lang.Object, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f4, code lost:
        r6 = new java.util.LinkedHashSet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x020a, code lost:
        r2 = new java.util.LinkedHashSet();
     */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x023d A[Catch:{ all -> 0x0285 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0252 A[Catch:{ all -> 0x0285 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:36:0x00f4=Splitter:B:36:0x00f4, B:31:0x00ea=Splitter:B:31:0x00ea} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.A07
            X.1Hj r1 = X.1Hj.A02
            switch(r0) {
                case 0: goto L_0x005f;
                case 1: goto L_0x00ff;
                case 2: goto L_0x0179;
                default: goto L_0x0007;
            }
        L_0x0007:
            int r0 = r14.A00
            r4 = 1
            if (r0 == 0) goto L_0x0014
            if (r0 != r4) goto L_0x0057
            X.0eS.A00(r15)
        L_0x0011:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0014:
            X.0eS.A00(r15)
            java.lang.Object r8 = r14.A03
            X.2br r8 = (X.2br) r8
            java.lang.String r0 = "coroutine_start"
            r8.AVz(r0)
            java.lang.Object r12 = r14.A0A
            com.instagram.quickpromotion.sdk.InstagramQpSdkModule r12 = (com.instagram.quickpromotion.sdk.InstagramQpSdkModule) r12
            java.lang.Object r7 = r14.A06
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            java.lang.Object r6 = r14.A09
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r13 = r14.A04
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r9 = r14.A05
            X.2cX r9 = (X.2cX) r9
            java.lang.Object r10 = r14.A08
            X.2ke r10 = (X.C228012ke) r10
            X.41s r11 = X.C2594441s.A00
            java.lang.Object r5 = r14.A01
            X.4Cq r5 = (X.C262224Cq) r5
            java.lang.Object r3 = r14.A02
            X.12U r3 = (X.AnonymousClass12U) r3
            r2 = 773960647(0x2e21b3c7, float:3.6766836E-11)
            r0 = 3
            X.0nV r0 = r3.AOJ(r2, r0)
            X.19S r15 = X.19E.A03(r0, r5)
            r14.A00 = r4
            java.lang.Object r0 = com.instagram.quickpromotion.sdk.InstagramQpSdkModule.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r0 != r1) goto L_0x0011
            return r1
        L_0x0057:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x005f:
            int r0 = r14.A00
            r9 = 2
            r8 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0096
            if (r0 == r8) goto L_0x0082
            if (r0 != r9) goto L_0x007a
            java.lang.Object r3 = r14.A04
            X.6H2 r3 = (X.AnonymousClass6H2) r3
            java.lang.Object r6 = r14.A03
            X.136 r6 = (X.136) r6
            java.lang.Object r4 = r14.A02
            X.0eS.A00(r15)     // Catch:{ all -> 0x0078 }
            goto L_0x00ea
        L_0x0078:
            r1 = move-exception
            goto L_0x00f4
        L_0x007a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0082:
            java.lang.Object r3 = r14.A06
            X.6H2 r3 = (X.AnonymousClass6H2) r3
            java.lang.Object r2 = r14.A05
            java.lang.Object r7 = r14.A04
            X.0sL r7 = (X.0sL) r7
            java.lang.Object r6 = r14.A03
            X.136 r6 = (X.136) r6
            java.lang.Object r4 = r14.A02
            X.0eS.A00(r15)
            goto L_0x00d7
        L_0x0096:
            X.0eS.A00(r15)
            java.lang.Object r0 = r14.A02
            X.4Cq r0 = (X.C262224Cq) r0
            java.lang.Object r3 = r14.A09
            X.HKs r3 = (X.C54609HKs) r3
            X.4Cc r2 = r0.ArX()
            X.19F r0 = X.C262204Co.A00
            X.4Cb r0 = r2.get(r0)
            X.0qQ.A0A(r0)
            X.4Co r0 = (X.C262204Co) r0
            X.JUy r4 = new X.JUy
            r4.<init>(r3, r0)
            java.lang.Object r3 = r14.A0A
            X.6H2 r3 = (X.AnonymousClass6H2) r3
            X.AnonymousClass6H2.A00(r4, r3)
            X.136 r6 = r3.A01
            java.lang.Object r7 = r14.A08
            X.0sL r7 = (X.0sL) r7
            java.lang.Object r2 = r14.A01
            r14.A02 = r4
            r14.A03 = r6
            r14.A04 = r7
            r14.A05 = r2
            r14.A06 = r3
            r14.A00 = r8
            java.lang.Object r0 = X.136.A00(r14, r6)
            if (r0 != r1) goto L_0x00d7
            return r1
        L_0x00d7:
            r14.A02 = r4     // Catch:{ all -> 0x00f3 }
            r14.A03 = r6     // Catch:{ all -> 0x00f3 }
            r14.A04 = r3     // Catch:{ all -> 0x00f3 }
            r14.A05 = r5     // Catch:{ all -> 0x00f3 }
            r14.A06 = r5     // Catch:{ all -> 0x00f3 }
            r14.A00 = r9     // Catch:{ all -> 0x00f3 }
            java.lang.Object r15 = r7.invoke(r2, r14)     // Catch:{ all -> 0x00f3 }
            if (r15 != r1) goto L_0x00ea
            return r1
        L_0x00ea:
            java.util.concurrent.atomic.AtomicReference r0 = r3.A00     // Catch:{ all -> 0x00fa }
            X.1FH.A00(r4, r5, r0)     // Catch:{ all -> 0x00fa }
            r6.A05(r5)
            return r15
        L_0x00f3:
            r1 = move-exception
        L_0x00f4:
            java.util.concurrent.atomic.AtomicReference r0 = r3.A00     // Catch:{ all -> 0x00fa }
            X.1FH.A00(r4, r5, r0)     // Catch:{ all -> 0x00fa }
            throw r1     // Catch:{ all -> 0x00fa }
        L_0x00fa:
            r0 = move-exception
            r6.A05(r5)
            throw r0
        L_0x00ff:
            int r0 = r14.A00
            r7 = 0
            r8 = 1
            if (r0 == 0) goto L_0x0127
            if (r0 != r8) goto L_0x011f
            java.lang.Object r2 = r14.A06
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r6 = r14.A05
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r3 = r14.A04
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r3 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r3
            java.lang.Object r5 = r14.A03
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r5 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r5
            java.lang.Object r4 = r14.A02
            X.136 r4 = (X.136) r4
            X.0eS.A00(r15)
            goto L_0x0150
        L_0x011f:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0127:
            X.0eS.A00(r15)
            java.lang.Object r0 = r14.A0A
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r0 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r0
            X.136 r4 = r0.A0G
            r5 = r0
            java.lang.Object r3 = r14.A09
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r3 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r3
            java.lang.Object r6 = r14.A08
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r2 = r14.A01
            java.util.List r2 = (java.util.List) r2
            r14.A02 = r4
            r14.A03 = r0
            r14.A04 = r3
            r14.A05 = r6
            r14.A06 = r2
            r14.A00 = r8
            java.lang.Object r0 = X.136.A00(r14, r4)
            if (r0 != r1) goto L_0x0150
            return r1
        L_0x0150:
            java.util.concurrent.ConcurrentHashMap r0 = r5.A0D     // Catch:{ all -> 0x0174 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0174 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x0174 }
            if (r0 == 0) goto L_0x016e
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0174 }
        L_0x015e:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0174 }
            if (r0 == 0) goto L_0x016e
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0174 }
            X.92L r0 = (X.AnonymousClass92L) r0     // Catch:{ all -> 0x0174 }
            r0.D8n(r3, r6, r2)     // Catch:{ all -> 0x0174 }
            goto L_0x015e
        L_0x016e:
            X.0gF r1 = X.C60340gF.A00     // Catch:{ all -> 0x0174 }
            r4.A05(r7)
            return r1
        L_0x0174:
            r0 = move-exception
            r4.A05(r7)
            throw r0
        L_0x0179:
            int r2 = r14.A00
            r10 = 3
            r11 = 2
            r0 = 1
            r4 = 0
            if (r2 == 0) goto L_0x01ca
            if (r2 == r0) goto L_0x01b6
            java.lang.Object r6 = r14.A06
            if (r2 == r11) goto L_0x019f
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r2 = r14.A05
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r7 = r14.A04
            X.92L r7 = (X.AnonymousClass92L) r7
            java.lang.Object r8 = r14.A03
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r8 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r8
            java.lang.Object r9 = r14.A02
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r9 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r9
            java.lang.Object r3 = r14.A01
            X.136 r3 = (X.136) r3
            goto L_0x026a
        L_0x019f:
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r2 = r14.A05
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r7 = r14.A04
            X.92L r7 = (X.AnonymousClass92L) r7
            java.lang.Object r8 = r14.A03
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r8 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r8
            java.lang.Object r9 = r14.A02
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r9 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r9
            java.lang.Object r3 = r14.A01
            X.136 r3 = (X.136) r3
            goto L_0x0234
        L_0x01b6:
            java.lang.Object r7 = r14.A04
            X.92L r7 = (X.AnonymousClass92L) r7
            java.lang.Object r8 = r14.A03
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r8 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r8
            java.lang.Object r9 = r14.A02
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r9 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r9
            java.lang.Object r3 = r14.A01
            X.136 r3 = (X.136) r3
            X.0eS.A00(r15)
            goto L_0x01ec
        L_0x01ca:
            X.0eS.A00(r15)
            java.lang.Object r9 = r14.A0A
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r9 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r9
            X.136 r3 = r9.A0G
            java.lang.Object r8 = r14.A09
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r8 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r8
            java.lang.Object r7 = r14.A08
            X.92L r7 = (X.AnonymousClass92L) r7
            r14.A01 = r3
            r14.A02 = r9
            r14.A03 = r8
            r14.A04 = r7
            r14.A00 = r0
            java.lang.Object r0 = X.136.A00(r14, r3)
            if (r0 != r1) goto L_0x01ec
            return r1
        L_0x01ec:
            java.util.concurrent.ConcurrentHashMap r0 = r9.A0D     // Catch:{ all -> 0x0285 }
            java.lang.Object r6 = r0.get(r8)     // Catch:{ all -> 0x0285 }
            if (r6 != 0) goto L_0x0200
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0285 }
            r6.<init>()     // Catch:{ all -> 0x0285 }
            java.lang.Object r0 = r0.putIfAbsent(r8, r6)     // Catch:{ all -> 0x0285 }
            if (r0 == 0) goto L_0x0200
            r6 = r0
        L_0x0200:
            java.util.Set r6 = (java.util.Set) r6     // Catch:{ all -> 0x0285 }
            java.util.concurrent.ConcurrentHashMap r5 = r9.A0B     // Catch:{ all -> 0x0285 }
            java.lang.Object r2 = r5.get(r7)     // Catch:{ all -> 0x0285 }
            if (r2 != 0) goto L_0x0216
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0285 }
            r2.<init>()     // Catch:{ all -> 0x0285 }
            java.lang.Object r0 = r5.putIfAbsent(r7, r2)     // Catch:{ all -> 0x0285 }
            if (r0 == 0) goto L_0x0216
            r2 = r0
        L_0x0216:
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x0285 }
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x0285 }
            if (r0 == 0) goto L_0x025c
            r14.A01 = r3     // Catch:{ all -> 0x0285 }
            r14.A02 = r9     // Catch:{ all -> 0x0285 }
            r14.A03 = r8     // Catch:{ all -> 0x0285 }
            r14.A04 = r7     // Catch:{ all -> 0x0285 }
            r14.A05 = r2     // Catch:{ all -> 0x0285 }
            r14.A06 = r6     // Catch:{ all -> 0x0285 }
            r14.A00 = r11     // Catch:{ all -> 0x0285 }
            r0 = 0
            java.lang.Object r15 = r8.Bat(r14, r0)     // Catch:{ all -> 0x0285 }
            if (r15 != r1) goto L_0x0237
            return r1
        L_0x0234:
            X.0eS.A00(r15)     // Catch:{ all -> 0x0285 }
        L_0x0237:
            X.3Ii r15 = (X.C239803Ii) r15     // Catch:{ all -> 0x0285 }
            boolean r0 = r15 instanceof X.C239793Ih     // Catch:{ all -> 0x0285 }
            if (r0 == 0) goto L_0x0252
            r14.A01 = r3     // Catch:{ all -> 0x0285 }
            r14.A02 = r9     // Catch:{ all -> 0x0285 }
            r14.A03 = r8     // Catch:{ all -> 0x0285 }
            r14.A04 = r7     // Catch:{ all -> 0x0285 }
            r14.A05 = r2     // Catch:{ all -> 0x0285 }
            r14.A06 = r6     // Catch:{ all -> 0x0285 }
            r14.A00 = r10     // Catch:{ all -> 0x0285 }
            java.lang.Object r0 = r8.A02(r14)     // Catch:{ all -> 0x0285 }
            if (r0 != r1) goto L_0x026d
            return r1
        L_0x0252:
            boolean r0 = r15 instanceof X.C297815sO     // Catch:{ all -> 0x0285 }
            if (r0 != 0) goto L_0x0281
            X.Wub r0 = new X.Wub     // Catch:{ all -> 0x0285 }
            r0.<init>()     // Catch:{ all -> 0x0285 }
            throw r0     // Catch:{ all -> 0x0285 }
        L_0x025c:
            r6.add(r7)     // Catch:{ all -> 0x0285 }
            X.0qQ.A0A(r2)     // Catch:{ all -> 0x0285 }
            java.util.LinkedHashSet r0 = X.094.A01(r8, r2)     // Catch:{ all -> 0x0285 }
            r5.put(r7, r0)     // Catch:{ all -> 0x0285 }
            goto L_0x027f
        L_0x026a:
            X.0eS.A00(r15)     // Catch:{ all -> 0x0285 }
        L_0x026d:
            r6.add(r7)     // Catch:{ all -> 0x0285 }
            java.util.concurrent.ConcurrentHashMap r1 = r9.A0B     // Catch:{ all -> 0x0285 }
            X.0qQ.A0A(r2)     // Catch:{ all -> 0x0285 }
            java.util.LinkedHashSet r0 = X.094.A01(r8, r2)     // Catch:{ all -> 0x0285 }
            r1.put(r7, r0)     // Catch:{ all -> 0x0285 }
            r7.D8l(r8)     // Catch:{ all -> 0x0285 }
        L_0x027f:
            X.0gF r15 = X.C60340gF.A00     // Catch:{ all -> 0x0285 }
        L_0x0281:
            r3.A05(r4)
            return r15
        L_0x0285:
            r0 = move-exception
            r3.A05(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9KU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KU(ContentFilterDictionaryImpl contentFilterDictionaryImpl, ContentFilterDictionaryRegistrar contentFilterDictionaryRegistrar, AnonymousClass92L r4, AnonymousClass4D7 r5) {
        super(2, r5);
        this.A07 = 2;
        this.A0A = contentFilterDictionaryRegistrar;
        this.A09 = contentFilterDictionaryImpl;
        this.A08 = r4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KU(Object obj, Object obj2, Object obj3, Object obj4, AnonymousClass4D7 r6, int i) {
        super(2, r6);
        this.A07 = i;
        this.A09 = obj;
        this.A0A = obj2;
        this.A08 = obj3;
        this.A01 = obj4;
    }
}
