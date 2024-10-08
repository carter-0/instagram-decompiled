package X;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.instagram.direct.store.impl.sqlite.DirectThreadsParser;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;
import java.util.List;

/* renamed from: X.9KT  reason: invalid class name */
public final class AnonymousClass9KT extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07 = 0;
    public final Object A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KT(AnonymousClass5b6 r2, Integer num, AnonymousClass4D7 r4, 0sP r5) {
        super(2, r4);
        this.A01 = num;
        this.A06 = r2;
        this.A08 = r5;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9KT, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v2, types: [X.9KT, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v3, types: [X.9KT, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        AnonymousClass4D7 r9 = r14;
        switch (this.A07) {
            case 0:
                ? r4 = new AnonymousClass9KT((AnonymousClass5b6) this.A06, (Integer) this.A01, r14, (0sP) this.A08);
                r4.A02 = obj;
                return r4;
            case 1:
                ? r42 = new AnonymousClass9KT((ContentResolver) this.A04, (Context) this.A01, (Uri) this.A08, (C285085Pp) this.A03, r9, (C249513ju) this.A02);
                r42.A05 = obj;
                return r42;
            case 2:
                AnonymousClass9KT r5 = new AnonymousClass9KT((DirectThreadsParser) this.A06, (List) this.A02, (List) this.A01, r9, (0rm) this.A03, (0rm) this.A08);
                r5.A04 = obj;
                return r5;
            default:
                return new AnonymousClass9KT((ContentFilterDictionaryRegistrar) this.A06, (AnonymousClass92L) this.A08, r14);
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9KT) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.9KT, java.lang.Object, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        if (r2 != true) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c7, code lost:
        if (r2 != true) goto L_0x00c9;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x022a A[Catch:{ all -> 0x025e }] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02d9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a A[Catch:{ all -> 0x00f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085 A[Catch:{ all -> 0x00f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008f A[Catch:{ all -> 0x00f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:78:0x01b5=Splitter:B:78:0x01b5, B:83:0x01bf=Splitter:B:83:0x01bf} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.A07
            switch(r0) {
                case 0: goto L_0x00fe;
                case 1: goto L_0x01ca;
                case 2: goto L_0x026b;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.1Hj r5 = X.1Hj.A02
            int r0 = r12.A00
            r8 = 3
            r7 = 2
            r6 = 0
            r4 = 1
            if (r0 == 0) goto L_0x00df
            if (r0 == r4) goto L_0x005b
            if (r0 == r7) goto L_0x0048
            java.lang.Object r10 = r12.A04
            java.lang.Object r9 = r12.A03
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r3 = r12.A02
            java.lang.Object r1 = r12.A01
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r1 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r1
            X.0eS.A00(r13)
        L_0x0022:
            java.util.concurrent.ConcurrentHashMap r0 = r1.A0E
            r0.remove(r10)
        L_0x0027:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x02da
            java.lang.Object r10 = r9.next()
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r10 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r10
            X.136 r11 = r1.A0G
            r12.A01 = r1
            r12.A02 = r3
            r12.A03 = r9
            r12.A04 = r10
            r12.A05 = r11
            r12.A00 = r4
            java.lang.Object r0 = X.136.A00(r12, r11)
            if (r0 != r5) goto L_0x0070
            return r5
        L_0x0048:
            java.lang.Object r11 = r12.A05
            X.136 r11 = (X.136) r11
            java.lang.Object r10 = r12.A04
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r10 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r10
            java.lang.Object r9 = r12.A03
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r3 = r12.A02
            java.lang.Object r1 = r12.A01
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r1 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r1
            goto L_0x00a2
        L_0x005b:
            java.lang.Object r11 = r12.A05
            X.136 r11 = (X.136) r11
            java.lang.Object r10 = r12.A04
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r10 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r10
            java.lang.Object r9 = r12.A03
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r3 = r12.A02
            java.lang.Object r1 = r12.A01
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r1 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r1
            X.0eS.A00(r13)
        L_0x0070:
            java.util.concurrent.ConcurrentHashMap r2 = r1.A0D     // Catch:{ all -> 0x00f9 }
            java.lang.Object r0 = r2.get(r10)     // Catch:{ all -> 0x00f9 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x007d
            r0.remove(r3)     // Catch:{ all -> 0x00f9 }
        L_0x007d:
            java.lang.Object r0 = r2.get(r10)     // Catch:{ all -> 0x00f9 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x008c
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x00f9 }
            r0 = 1
            if (r2 == r4) goto L_0x008d
        L_0x008c:
            r0 = 0
        L_0x008d:
            if (r0 == 0) goto L_0x00aa
            r12.A01 = r1     // Catch:{ all -> 0x00f9 }
            r12.A02 = r3     // Catch:{ all -> 0x00f9 }
            r12.A03 = r9     // Catch:{ all -> 0x00f9 }
            r12.A04 = r10     // Catch:{ all -> 0x00f9 }
            r12.A05 = r11     // Catch:{ all -> 0x00f9 }
            r12.A00 = r7     // Catch:{ all -> 0x00f9 }
            java.lang.Object r0 = r10.A01(r12)     // Catch:{ all -> 0x00f9 }
            if (r0 != r5) goto L_0x00a5
            goto L_0x00f8
        L_0x00a2:
            X.0eS.A00(r13)     // Catch:{ all -> 0x00f9 }
        L_0x00a5:
            java.util.concurrent.ConcurrentHashMap r0 = r1.A0D     // Catch:{ all -> 0x00f9 }
            r0.remove(r10)     // Catch:{ all -> 0x00f9 }
        L_0x00aa:
            r11.A05(r6)
            java.util.concurrent.ConcurrentHashMap r2 = r1.A0E
            java.lang.Object r0 = r2.get(r10)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x00ba
            r0.remove(r3)
        L_0x00ba:
            java.lang.Object r0 = r2.get(r10)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x00c9
            boolean r2 = r0.isEmpty()
            r0 = 1
            if (r2 == r4) goto L_0x00ca
        L_0x00c9:
            r0 = 0
        L_0x00ca:
            if (r0 == 0) goto L_0x0027
            r12.A01 = r1
            r12.A02 = r3
            r12.A03 = r9
            r12.A04 = r10
            r12.A05 = r6
            r12.A00 = r8
            java.lang.Object r0 = r10.A03(r12)
            if (r0 != r5) goto L_0x0022
            return r5
        L_0x00df:
            X.0eS.A00(r13)
            java.lang.Object r1 = r12.A06
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r1 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r1
            java.util.concurrent.ConcurrentHashMap r0 = r1.A0C
            java.lang.Object r3 = r12.A08
            java.lang.Object r0 = r0.get(r3)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x02da
            java.util.Iterator r9 = r0.iterator()
            goto L_0x0027
        L_0x00f8:
            return r5
        L_0x00f9:
            r2 = move-exception
            r11.A05(r6)
            throw r2
        L_0x00fe:
            r9 = r13
            X.1Hj r5 = X.1Hj.A02
            int r0 = r12.A00
            r7 = 2
            r8 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0138
            if (r0 == r8) goto L_0x0126
            if (r0 != r7) goto L_0x011e
            java.lang.Object r6 = r12.A04
            X.5b6 r6 = (X.AnonymousClass5b6) r6
            java.lang.Object r4 = r12.A03
            X.136 r4 = (X.136) r4
            java.lang.Object r2 = r12.A02
            X.0eS.A00(r13)     // Catch:{ all -> 0x011b }
            goto L_0x01b5
        L_0x011b:
            r1 = move-exception
            goto L_0x01bf
        L_0x011e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0126:
            java.lang.Object r6 = r12.A05
            X.5b6 r6 = (X.AnonymousClass5b6) r6
            java.lang.Object r1 = r12.A04
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r4 = r12.A03
            X.136 r4 = (X.136) r4
            java.lang.Object r2 = r12.A02
            X.0eS.A00(r13)
            goto L_0x01a4
        L_0x0138:
            X.0eS.A00(r13)
            java.lang.Object r0 = r12.A02
            X.4Cq r0 = (X.C262224Cq) r0
            java.lang.Object r4 = r12.A01
            java.lang.Integer r4 = (java.lang.Integer) r4
            X.4Cc r1 = r0.ArX()
            X.19F r0 = X.C262204Co.A00
            X.4Cb r0 = r1.get(r0)
            X.0qQ.A0A(r0)
            X.4Co r0 = (X.C262204Co) r0
            X.64e r2 = new X.64e
            r2.<init>(r4, r0)
            java.lang.Object r6 = r12.A06
            X.5b6 r6 = (X.AnonymousClass5b6) r6
        L_0x015b:
            java.util.concurrent.atomic.AtomicReference r9 = r6.A00
            java.lang.Object r4 = r9.get()
            X.64e r4 = (X.C3025764e) r4
            if (r4 == 0) goto L_0x017b
            java.lang.Integer r1 = r2.A00
            java.lang.Integer r0 = r4.A00
            int r0 = r1.compareTo(r0)
            if (r0 >= 0) goto L_0x017b
            r0 = 473(0x1d9, float:6.63E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            throw r0
        L_0x017b:
            boolean r0 = X.1FH.A00(r4, r2, r9)
            if (r0 == 0) goto L_0x015b
            if (r4 == 0) goto L_0x018d
            X.4Co r1 = r4.A01
            X.Avh r0 = new X.Avh
            r0.<init>()
            r1.AG7(r0)
        L_0x018d:
            X.136 r4 = r6.A01
            java.lang.Object r1 = r12.A08
            X.0sP r1 = (X.0sP) r1
            r12.A02 = r2
            r12.A03 = r4
            r12.A04 = r1
            r12.A05 = r6
            r12.A00 = r8
            java.lang.Object r0 = X.136.A00(r12, r4)
            if (r0 != r5) goto L_0x01a4
            return r5
        L_0x01a4:
            r12.A02 = r2     // Catch:{ all -> 0x01be }
            r12.A03 = r4     // Catch:{ all -> 0x01be }
            r12.A04 = r6     // Catch:{ all -> 0x01be }
            r12.A05 = r3     // Catch:{ all -> 0x01be }
            r12.A00 = r7     // Catch:{ all -> 0x01be }
            java.lang.Object r9 = r1.invoke(r12)     // Catch:{ all -> 0x01be }
            if (r9 != r5) goto L_0x01b5
            return r5
        L_0x01b5:
            java.util.concurrent.atomic.AtomicReference r0 = r6.A00     // Catch:{ all -> 0x01c5 }
            X.1FH.A00(r2, r3, r0)     // Catch:{ all -> 0x01c5 }
            r4.A05(r3)
            return r9
        L_0x01be:
            r1 = move-exception
        L_0x01bf:
            java.util.concurrent.atomic.AtomicReference r0 = r6.A00     // Catch:{ all -> 0x01c5 }
            X.1FH.A00(r2, r3, r0)     // Catch:{ all -> 0x01c5 }
            throw r1     // Catch:{ all -> 0x01c5 }
        L_0x01c5:
            r2 = move-exception
            r4.A05(r3)
            throw r2
        L_0x01ca:
            X.1Hj r5 = X.1Hj.A02
            int r0 = r12.A00
            r6 = 2
            r4 = 1
            if (r0 == 0) goto L_0x01f3
            if (r0 == r4) goto L_0x01ea
            if (r0 != r6) goto L_0x01e2
            java.lang.Object r7 = r12.A06
            X.1IT r7 = (X.AnonymousClass1IT) r7
            java.lang.Object r3 = r12.A05
            X.02o r3 = (X.02o) r3
            X.0eS.A00(r13)     // Catch:{ all -> 0x025e }
            goto L_0x0212
        L_0x01e2:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        L_0x01ea:
            java.lang.Object r7 = r12.A06
            X.1IT r7 = (X.AnonymousClass1IT) r7
            java.lang.Object r3 = r12.A05
            X.02o r3 = (X.02o) r3
            goto L_0x021f
        L_0x01f3:
            X.0eS.A00(r13)
            java.lang.Object r3 = r12.A05
            X.02o r3 = (X.02o) r3
            java.lang.Object r7 = r12.A04
            android.content.ContentResolver r7 = (android.content.ContentResolver) r7
            java.lang.Object r2 = r12.A08
            android.net.Uri r2 = (android.net.Uri) r2
            r1 = 0
            java.lang.Object r0 = r12.A03
            android.database.ContentObserver r0 = (android.database.ContentObserver) r0
            r7.registerContentObserver(r2, r1, r0)
            java.lang.Object r0 = r12.A02     // Catch:{ all -> 0x025e }
            X.3ju r0 = (X.C249513ju) r0     // Catch:{ all -> 0x025e }
            X.1IT r7 = r0.CfF()     // Catch:{ all -> 0x025e }
        L_0x0212:
            r12.A05 = r3     // Catch:{ all -> 0x025e }
            r12.A06 = r7     // Catch:{ all -> 0x025e }
            r12.A00 = r4     // Catch:{ all -> 0x025e }
            java.lang.Object r13 = r7.A01(r12)     // Catch:{ all -> 0x025e }
            if (r13 != r5) goto L_0x0222
            goto L_0x024f
        L_0x021f:
            X.0eS.A00(r13)     // Catch:{ all -> 0x025e }
        L_0x0222:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ all -> 0x025e }
            boolean r0 = r13.booleanValue()     // Catch:{ all -> 0x025e }
            if (r0 == 0) goto L_0x0251
            r7.A00()     // Catch:{ all -> 0x025e }
            java.lang.Object r0 = r12.A01     // Catch:{ all -> 0x025e }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x025e }
            android.content.ContentResolver r2 = r0.getContentResolver()     // Catch:{ all -> 0x025e }
            java.lang.String r1 = "animator_duration_scale"
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = android.provider.Settings.Global.getFloat(r2, r1, r0)     // Catch:{ all -> 0x025e }
            java.lang.Float r0 = new java.lang.Float     // Catch:{ all -> 0x025e }
            r0.<init>(r1)     // Catch:{ all -> 0x025e }
            r12.A05 = r3     // Catch:{ all -> 0x025e }
            r12.A06 = r7     // Catch:{ all -> 0x025e }
            r12.A00 = r6     // Catch:{ all -> 0x025e }
            java.lang.Object r0 = r3.emit(r0, r12)     // Catch:{ all -> 0x025e }
            if (r0 != r5) goto L_0x0212
            goto L_0x0250
        L_0x024f:
            return r5
        L_0x0250:
            return r5
        L_0x0251:
            java.lang.Object r1 = r12.A04
            android.content.ContentResolver r1 = (android.content.ContentResolver) r1
            java.lang.Object r0 = r12.A03
            android.database.ContentObserver r0 = (android.database.ContentObserver) r0
            r1.unregisterContentObserver(r0)
            goto L_0x02f5
        L_0x025e:
            r2 = move-exception
            java.lang.Object r1 = r12.A04
            android.content.ContentResolver r1 = (android.content.ContentResolver) r1
            java.lang.Object r0 = r12.A03
            android.database.ContentObserver r0 = (android.database.ContentObserver) r0
            r1.unregisterContentObserver(r0)
            throw r2
        L_0x026b:
            X.1Hj r9 = X.1Hj.A02
            int r0 = r12.A00
            r8 = 2
            r10 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0282
            if (r0 == r10) goto L_0x02ba
            if (r0 != r8) goto L_0x02f8
            java.lang.Object r0 = r12.A04
            X.0rm r0 = (X.0rm) r0
            X.0eS.A00(r13)
        L_0x027f:
            r0.A00 = r13
            goto L_0x02f5
        L_0x0282:
            X.0eS.A00(r13)
            java.lang.Object r11 = r12.A04
            X.4Cq r11 = (X.C262224Cq) r11
            java.lang.Object r6 = r12.A06
            java.lang.Object r2 = r12.A02
            r1 = 26
            X.MGe r0 = new X.MGe
            r0.<init>((java.lang.Object) r6, (java.lang.Object) r2, (X.AnonymousClass4D7) r7, (int) r1)
            X.19B r5 = X.19B.A00
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            X.2Q8 r3 = X.1Eo.A01(r4, r5, r0, r11)
            java.lang.Object r2 = r12.A01
            r1 = 25
            X.MGe r0 = new X.MGe
            r0.<init>((java.lang.Object) r6, (java.lang.Object) r2, (X.AnonymousClass4D7) r7, (int) r1)
            X.2Q8 r1 = X.1Eo.A01(r4, r5, r0, r11)
            java.lang.Object r0 = r12.A03
            X.0rm r0 = (X.0rm) r0
            r12.A04 = r1
            r12.A05 = r0
            r12.A00 = r10
            java.lang.Object r13 = r3.A0E(r12)
            if (r13 != r9) goto L_0x02c5
            return r9
        L_0x02ba:
            java.lang.Object r0 = r12.A05
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r1 = r12.A04
            X.2Q9 r1 = (X.AnonymousClass2Q9) r1
            X.0eS.A00(r13)
        L_0x02c5:
            r0.A00 = r13
            java.lang.Object r0 = r12.A08
            X.0rm r0 = (X.0rm) r0
            r12.A04 = r0
            r12.A05 = r7
            r12.A00 = r8
            X.4Cp r1 = (X.C262214Cp) r1
            java.lang.Object r13 = r1.A0E(r12)
            if (r13 != r9) goto L_0x027f
            return r9
        L_0x02da:
            java.lang.Object r1 = r12.A06
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar r1 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar) r1
            java.util.concurrent.ConcurrentHashMap r0 = r1.A0B
            java.lang.Object r2 = r12.A08
            X.92L r2 = (X.AnonymousClass92L) r2
            r0.remove(r2)
            java.util.concurrent.ConcurrentHashMap r0 = r1.A0C
            r0.remove(r2)
            java.util.Map r1 = r1.A07
            X.92I r0 = r2.And()
            r1.remove(r0)
        L_0x02f5:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x02f8:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9KT.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KT(ContentFilterDictionaryRegistrar contentFilterDictionaryRegistrar, AnonymousClass92L r3, AnonymousClass4D7 r4) {
        super(2, r4);
        this.A06 = contentFilterDictionaryRegistrar;
        this.A08 = r3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KT(ContentResolver contentResolver, Context context, Uri uri, C285085Pp r5, AnonymousClass4D7 r6, C249513ju r7) {
        super(2, r6);
        this.A04 = contentResolver;
        this.A08 = uri;
        this.A03 = r5;
        this.A02 = r7;
        this.A01 = context;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KT(DirectThreadsParser directThreadsParser, List list, List list2, AnonymousClass4D7 r5, 0rm r6, 0rm r7) {
        super(2, r5);
        this.A03 = r6;
        this.A08 = r7;
        this.A06 = directThreadsParser;
        this.A02 = list;
        this.A01 = list2;
    }
}
