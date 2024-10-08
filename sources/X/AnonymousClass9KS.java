package X;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import java.util.List;

/* renamed from: X.9KS  reason: invalid class name */
public final class AnonymousClass9KS extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KS(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A07 = i;
        this.A06 = obj;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.9KS, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.9KS, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.9KS, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        Object obj2;
        int i;
        AnonymousClass4D7 r7 = r11;
        switch (this.A07) {
            case 0:
                Recomposer recomposer = (Recomposer) this.A01;
                AnonymousClass07Z r6 = (AnonymousClass07Z) this.A03;
                C285075Po r5 = (C285075Po) this.A02;
                ? r2 = new AnonymousClass9KS((View) this.A05, recomposer, r5, r6, r7, (0rm) this.A04);
                r2.A06 = obj;
                return r2;
            case 1:
                ? r22 = new AnonymousClass9KS((List) this.A02, (List) this.A01, r11);
                r22.A03 = obj;
                return r22;
            case 2:
                obj2 = this.A06;
                i = 2;
                break;
            case 3:
                obj2 = this.A06;
                i = 3;
                break;
            default:
                obj2 = this.A06;
                i = 4;
                break;
        }
        return new AnonymousClass9KS(obj2, r11, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9KS) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.9KS, java.lang.Object, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v11, types: [X.3Eu, X.3ju] */
    /* JADX WARNING: type inference failed for: r8v12, types: [X.109, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03a3, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03a4, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03a9, code lost:
        r7.AG7((java.util.concurrent.CancellationException) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0460, code lost:
        if (X.136.A00(r2, r7) == r3) goto L_0x0462;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0462, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:?, code lost:
        r0 = r9.A07;
        r5 = r0.A00();
        r11 = r0.A01();
        r1 = r9.A0A;
        r2.A01 = r7;
        r2.A02 = r9;
        r2.A03 = r5;
        r2.A04 = r11;
        r2.A00 = 2;
        r10 = r11.A01(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x047e, code lost:
        if (r10 != r3) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0482, code lost:
        r10 = (java.util.List) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0488, code lost:
        if (r10.size() <= 0) goto L_0x059f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x048a, code lost:
        r6 = (X.C297125rE) r10.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0492, code lost:
        if (r9.A0F == false) goto L_0x049e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x049c, code lost:
        if (X.0qQ.A0K(r6.A05, r6.A06) != false) goto L_0x0531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x049e, code lost:
        r14 = r9.A08;
        r10 = r9.A05;
        r4 = r9.A0A;
        r1 = r9.A01;
        r2.A01 = r7;
        r2.A02 = r9;
        r2.A03 = r5;
        r2.A04 = r11;
        r2.A05 = r6;
        r2.A00 = 3;
        r10 = r14.A01(r10, r4, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04b7, code lost:
        if (r10 != r3) goto L_0x04bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x04bb, code lost:
        r1 = (X.C239803Ii) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04c0, code lost:
        if ((r1 instanceof X.C239793Ih) == false) goto L_0x0520;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04c4, code lost:
        if (r9.A0F == false) goto L_0x04d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04d5, code lost:
        if (X.0qQ.A0K(((X.C381739cF) ((X.C239793Ih) r1).A00).A01, r6.A06) != false) goto L_0x0531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04d7, code lost:
        r2.A01 = r7;
        r2.A02 = r9;
        r2.A03 = r11;
        r2.A04 = null;
        r2.A05 = null;
        r2.A00 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04f5, code lost:
        if (X.AnonymousClass1t4.A00(r5.A05, r2, new X.TPN(1, r5, r11, (X.C381739cF) ((X.C239793Ih) r1).A00)) != r3) goto L_0x04f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04f8, code lost:
        r1 = r9.A0A;
        r2.A01 = r7;
        r2.A02 = r9;
        r2.A03 = r11;
        r2.A00 = 5;
        r10 = r11.A01(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0507, code lost:
        if (r10 != r3) goto L_0x050a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x050a, code lost:
        r10 = (java.util.List) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0510, code lost:
        if (r10.size() <= 0) goto L_0x0564;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0512, code lost:
        r0 = ((X.C297125rE) r10.get(0)).A06;
        X.0qQ.A0B(r0, 0);
        r9.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0522, code lost:
        if ((r1 instanceof X.C297815sO) == false) goto L_0x0576;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0526, code lost:
        if (r9.A0F == false) goto L_0x0531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x052e, code lost:
        if (r6.A06.length() != 0) goto L_0x0531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        r4 = r9.A0A;
        r2.A01 = r7;
        r2.A02 = r9;
        r2.A03 = r9;
        r2.A04 = null;
        r2.A05 = null;
        r2.A00 = 6;
        r0 = X.1WY.A08;
        r6 = X.1Wa.A00("\n        SELECT pattern\n        FROM content_filter_dictionary_entries\n        INNER JOIN content_filter_dictionary_metadata\n              ON id = dictionary_id\n        WHERE dictionary_key = ?\n      ", 1);
        r6.ADh(1, r4);
        r10 = X.1wR.A00(new android.os.CancellationSignal(), r11.A00, new X.MB7(12, r11, r6), r2, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x055d, code lost:
        if (r10 == r3) goto L_0x0462;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0560, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0561, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0562, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0563, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        r3 = new X.C297815sO(new java.lang.Object());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x056e, code lost:
        r7.A05((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0571, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0572, code lost:
        r7.A05((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0575, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x057b, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x057c, code lost:
        r0 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x059d, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:?, code lost:
        r3 = new X.C297815sO(new java.lang.Object());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x05a9, code lost:
        r7.A05((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x05ac, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05ad, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05b0, code lost:
        r7.A05((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05b3, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0724, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03f9  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0427  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x05f8  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0650  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0667  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0670  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0695  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x06b6  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0711  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x071b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cb A[Catch:{ Exception -> 0x01f4, all -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012a A[Catch:{ Exception -> 0x01f4, all -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0141 A[Catch:{ Exception -> 0x01f4, all -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x014a A[Catch:{ Exception -> 0x01f4, all -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x014e A[Catch:{ Exception -> 0x01f4, all -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x019b A[Catch:{ Exception -> 0x01f4, all -> 0x0210 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r2 = r19
            r10 = r20
            int r0 = r2.A07
            switch(r0) {
                case 0: goto L_0x029a;
                case 1: goto L_0x03bc;
                case 2: goto L_0x05bd;
                case 3: goto L_0x0225;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r9 = 2
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 == r5) goto L_0x0046
            if (r0 != r9) goto L_0x002a
            java.lang.Object r4 = r2.A05
            java.lang.Object r12 = r2.A04
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r11 = r2.A03
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Object r7 = r2.A02
            X.2ah r7 = (X.2ah) r7
            java.lang.Object r8 = r2.A01
            java.util.Map r8 = (java.util.Map) r8
            goto L_0x00ba
        L_0x002a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r0)
            throw r3
        L_0x0032:
            X.0eS.A00(r10)
            java.lang.Object r0 = r2.A06     // Catch:{ Exception -> 0x01f4 }
            X.2ah r0 = (X.2ah) r0     // Catch:{ Exception -> 0x01f4 }
            r0.A00 = r5     // Catch:{ Exception -> 0x01f4 }
            com.instagram.notifications.badging.impl.BadgingApiImpl r0 = r0.A05     // Catch:{ Exception -> 0x01f4 }
            r2.A00 = r5     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object r10 = r0.A00(r2)     // Catch:{ Exception -> 0x01f4 }
            if (r10 != r1) goto L_0x0049
            return r1
        L_0x0046:
            X.0eS.A00(r10)     // Catch:{ Exception -> 0x01f4 }
        L_0x0049:
            java.util.Map r10 = (java.util.Map) r10     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object r7 = r2.A06     // Catch:{ Exception -> 0x01f4 }
            X.2ah r7 = (X.2ah) r7     // Catch:{ Exception -> 0x01f4 }
            com.instagram.common.session.UserSession r8 = r7.A02     // Catch:{ Exception -> 0x01f4 }
            X.0Tu r0 = X.0Tu.A05     // Catch:{ Exception -> 0x01f4 }
            r3 = 36321481861244339(0x810a32000e25b3, double:3.033189611694587E-306)
            boolean r0 = X.182.A06(r0, r8, r3)     // Catch:{ Exception -> 0x01f4 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x01f4 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x01f4 }
            if (r0 != 0) goto L_0x0073
            X.0Tu r0 = X.0Tu.A06     // Catch:{ Exception -> 0x01f4 }
            r3 = 36322684451236191(0x810b4a0001295f, double:3.0339501344478756E-306)
            boolean r0 = X.182.A06(r0, r8, r3)     // Catch:{ Exception -> 0x01f4 }
            if (r0 == 0) goto L_0x007e
        L_0x0073:
            X.2ag r0 = r7.A06     // Catch:{ Exception -> 0x01f4 }
            com.instagram.common.session.UserSession r0 = r0.A00     // Catch:{ Exception -> 0x01f4 }
            X.5GM r0 = X.AnonymousClass5GL.A00(r0)     // Catch:{ Exception -> 0x01f4 }
            r0.A02()     // Catch:{ Exception -> 0x01f4 }
        L_0x007e:
            boolean r0 = r10.isEmpty()     // Catch:{ Exception -> 0x01f4 }
            if (r0 == 0) goto L_0x009b
            java.lang.String r4 = "InMemoryBadgingRepository"
            java.lang.String r0 = "BadgingAPI fetchBadgeInfo: No user PKs in badge request"
        L_0x0088:
            X.0KC.A0D(r4, r0)     // Catch:{ Exception -> 0x01f4 }
        L_0x008b:
            java.util.Map r0 = r7.A07     // Catch:{ Exception -> 0x01f4 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x01f4 }
            r11.<init>()     // Catch:{ Exception -> 0x01f4 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ Exception -> 0x01f4 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ Exception -> 0x01f4 }
            goto L_0x00b8
        L_0x009b:
            java.util.Set r0 = r10.keySet()     // Catch:{ Exception -> 0x01f4 }
            int r3 = r0.size()     // Catch:{ Exception -> 0x01f4 }
            r0 = 25
            if (r3 <= r0) goto L_0x008b
            java.lang.String r4 = "InMemoryBadgingRepository"
            java.lang.String r3 = "BadgingAPI fetchBadgeInfo: Expected less or equal to 25 user PKs but got "
            java.util.Set r0 = r10.keySet()     // Catch:{ Exception -> 0x01f4 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r0 = X.002.A0O(r3, r0)     // Catch:{ Exception -> 0x01f4 }
            goto L_0x0088
        L_0x00b8:
            r8 = r10
            goto L_0x00c5
        L_0x00ba:
            X.0eS.A00(r10)     // Catch:{ Exception -> 0x01f4 }
        L_0x00bd:
            X.0eP r0 = new X.0eP     // Catch:{ Exception -> 0x01f4 }
            r0.<init>(r4, r10)     // Catch:{ Exception -> 0x01f4 }
            r11.add(r0)     // Catch:{ Exception -> 0x01f4 }
        L_0x00c5:
            boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x01f4 }
            if (r0 == 0) goto L_0x012a
            java.lang.Object r0 = r12.next()     // Catch:{ Exception -> 0x01f4 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object r4 = r0.getKey()     // Catch:{ Exception -> 0x01f4 }
            X.2aE r4 = (X.C71062aE) r4     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object r13 = r0.getValue()     // Catch:{ Exception -> 0x01f4 }
            X.2ak r13 = (X.AnonymousClass2ak) r13     // Catch:{ Exception -> 0x01f4 }
            com.instagram.common.session.UserSession r0 = r7.A02     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r0 = r0.A06     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object r0 = r8.get(r0)     // Catch:{ Exception -> 0x01f4 }
            X.3ON r0 = (X.AnonymousClass3ON) r0     // Catch:{ Exception -> 0x01f4 }
            if (r0 == 0) goto L_0x0127
            java.util.HashMap r3 = r0.A01     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r0 = r4.getIdentifier()     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ Exception -> 0x01f4 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x01f4 }
            if (r0 == 0) goto L_0x0127
            int r3 = r0.intValue()     // Catch:{ Exception -> 0x01f4 }
            r0 = 0
            X.2aX r10 = new X.2aX     // Catch:{ Exception -> 0x01f4 }
            r10.<init>(r4, r0, r3, r3)     // Catch:{ Exception -> 0x01f4 }
        L_0x0101:
            r2.A01 = r8     // Catch:{ Exception -> 0x01f4 }
            r2.A02 = r7     // Catch:{ Exception -> 0x01f4 }
            r2.A03 = r11     // Catch:{ Exception -> 0x01f4 }
            r2.A04 = r12     // Catch:{ Exception -> 0x01f4 }
            r2.A05 = r4     // Catch:{ Exception -> 0x01f4 }
            r2.A00 = r9     // Catch:{ Exception -> 0x01f4 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C241503Pl.A01     // Catch:{ Exception -> 0x01f4 }
            X.4D7 r0 = X.1Ey.A02(r2)     // Catch:{ Exception -> 0x01f4 }
            X.3Pl r3 = new X.3Pl     // Catch:{ Exception -> 0x01f4 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x01f4 }
            X.3Pm r0 = new X.3Pm     // Catch:{ Exception -> 0x01f4 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x01f4 }
            r13.Af1(r4, r0, r10)     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object r10 = r3.A00()     // Catch:{ Exception -> 0x01f4 }
            if (r10 != r1) goto L_0x00bd
            goto L_0x0129
        L_0x0127:
            r10 = 0
            goto L_0x0101
        L_0x0129:
            return r1
        L_0x012a:
            java.util.List r11 = (java.util.List) r11     // Catch:{ Exception -> 0x01f4 }
            java.util.Map r11 = X.0Yt.A08(r11)     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object r10 = r2.A06     // Catch:{ Exception -> 0x01f4 }
            X.2ah r10 = (X.2ah) r10     // Catch:{ Exception -> 0x01f4 }
            com.instagram.common.session.UserSession r4 = r10.A02     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r13 = r4.A06     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object r0 = r8.get(r13)     // Catch:{ Exception -> 0x01f4 }
            X.3ON r0 = (X.AnonymousClass3ON) r0     // Catch:{ Exception -> 0x01f4 }
            r9 = 0
            if (r0 == 0) goto L_0x014a
            java.util.HashMap r14 = r0.A01     // Catch:{ Exception -> 0x01f4 }
        L_0x0143:
            X.2aD[] r12 = X.2aD.values()     // Catch:{ Exception -> 0x01f4 }
            r7 = 0
            int r3 = r12.length     // Catch:{ Exception -> 0x01f4 }
            goto L_0x014c
        L_0x014a:
            r14 = r9
            goto L_0x0143
        L_0x014c:
            if (r7 >= r3) goto L_0x017e
            r15 = r12[r7]     // Catch:{ Exception -> 0x01f4 }
            if (r14 == 0) goto L_0x016d
            java.lang.String r0 = r15.toString()     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object r0 = r14.get(r0)     // Catch:{ Exception -> 0x01f4 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x01f4 }
            if (r0 == 0) goto L_0x016d
            int r1 = r0.intValue()     // Catch:{ Exception -> 0x01f4 }
            X.2aX r0 = new X.2aX     // Catch:{ Exception -> 0x01f4 }
            r0.<init>(r15, r9, r1, r1)     // Catch:{ Exception -> 0x01f4 }
        L_0x0167:
            X.2aa r1 = r10.A03     // Catch:{ Exception -> 0x01f4 }
            r1.A02(r0)     // Catch:{ Exception -> 0x01f4 }
            goto L_0x017b
        L_0x016d:
            java.lang.Object r0 = r11.get(r15)     // Catch:{ Exception -> 0x01f4 }
            X.2aX r0 = (X.2aX) r0     // Catch:{ Exception -> 0x01f4 }
            if (r0 != 0) goto L_0x0167
            X.2aX r0 = new X.2aX     // Catch:{ Exception -> 0x01f4 }
            r0.<init>(r15, r9, r6, r6)     // Catch:{ Exception -> 0x01f4 }
            goto L_0x0167
        L_0x017b:
            int r7 = r7 + 1
            goto L_0x014c
        L_0x017e:
            X.0BQ r0 = X.AnonymousClass0BO.A00(r4)     // Catch:{ Exception -> 0x01f4 }
            java.util.List r3 = r0.BNy(r13)     // Catch:{ Exception -> 0x01f4 }
            X.3Pn r1 = new X.3Pn     // Catch:{ Exception -> 0x01f4 }
            r1.<init>()     // Catch:{ Exception -> 0x01f4 }
            android.content.Context r0 = r10.A01     // Catch:{ Exception -> 0x01f4 }
            java.util.List r14 = r1.A00(r0, r4)     // Catch:{ Exception -> 0x01f4 }
            java.util.Iterator r13 = r3.iterator()     // Catch:{ Exception -> 0x01f4 }
        L_0x0195:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x01f4 }
            if (r0 == 0) goto L_0x01ed
            java.lang.Object r7 = r13.next()     // Catch:{ Exception -> 0x01f4 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object r0 = r8.get(r7)     // Catch:{ Exception -> 0x01f4 }
            X.3ON r0 = (X.AnonymousClass3ON) r0     // Catch:{ Exception -> 0x01f4 }
            if (r0 == 0) goto L_0x01eb
            java.util.HashMap r4 = r0.A01     // Catch:{ Exception -> 0x01f4 }
        L_0x01ab:
            java.util.Iterator r12 = r14.iterator()     // Catch:{ Exception -> 0x01f4 }
        L_0x01af:
            boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x01f4 }
            if (r0 == 0) goto L_0x0195
            java.lang.Object r0 = r12.next()     // Catch:{ Exception -> 0x01f4 }
            X.2aD r0 = (X.2aD) r0     // Catch:{ Exception -> 0x01f4 }
            X.4DE r3 = new X.4DE     // Catch:{ Exception -> 0x01f4 }
            r3.<init>(r0, r7)     // Catch:{ Exception -> 0x01f4 }
            if (r4 == 0) goto L_0x01d8
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01f4 }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ Exception -> 0x01f4 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x01f4 }
            if (r0 == 0) goto L_0x01d8
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x01f4 }
            X.2aX r1 = new X.2aX     // Catch:{ Exception -> 0x01f4 }
            r1.<init>(r3, r9, r0, r0)     // Catch:{ Exception -> 0x01f4 }
            goto L_0x01e5
        L_0x01d8:
            java.lang.Object r1 = r11.get(r3)     // Catch:{ Exception -> 0x01f4 }
            X.2aX r1 = (X.2aX) r1     // Catch:{ Exception -> 0x01f4 }
            if (r1 != 0) goto L_0x01e5
            X.2aX r1 = new X.2aX     // Catch:{ Exception -> 0x01f4 }
            r1.<init>(r3, r9, r6, r6)     // Catch:{ Exception -> 0x01f4 }
        L_0x01e5:
            X.2aa r0 = r10.A03     // Catch:{ Exception -> 0x01f4 }
            r0.A02(r1)     // Catch:{ Exception -> 0x01f4 }
            goto L_0x01af
        L_0x01eb:
            r4 = r9
            goto L_0x01ab
        L_0x01ed:
            X.2an r3 = r10.A04     // Catch:{ Exception -> 0x01f4 }
            r0 = -9223372036854775808
            r3.A00 = r0     // Catch:{ Exception -> 0x01f4 }
            goto L_0x01fa
        L_0x01f4:
            r1 = move-exception
            java.lang.String r0 = "Badging"
            X.0wb.A07(r0, r1)     // Catch:{ all -> 0x0210 }
        L_0x01fa:
            java.lang.Object r0 = r2.A06
            X.2ah r0 = (X.2ah) r0
            r0.A00 = r6
            X.05G r2 = r0.A09
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.AIY(r1, r0)
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0210:
            r3 = move-exception
            java.lang.Object r0 = r2.A06
            X.2ah r0 = (X.2ah) r0
            r0.A00 = r6
            X.05G r2 = r0.A09
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.AIY(r1, r0)
            throw r3
        L_0x0225:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r13 = 0
            r12 = 1
            r8 = 0
            switch(r0) {
                case 0: goto L_0x044d;
                case 1: goto L_0x023d;
                case 2: goto L_0x024a;
                case 3: goto L_0x025f;
                case 4: goto L_0x0278;
                case 5: goto L_0x0289;
                default: goto L_0x022f;
            }
        L_0x022f:
            java.lang.Object r0 = r2.A03
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r0 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r0
            java.lang.Object r9 = r2.A02
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r9 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r9
            java.lang.Object r7 = r2.A01
            X.136 r7 = (X.136) r7
            goto L_0x057e
        L_0x023d:
            java.lang.Object r9 = r2.A02
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r9 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r9
            java.lang.Object r7 = r2.A01
            X.136 r7 = (X.136) r7
            X.0eS.A00(r10)
            goto L_0x0463
        L_0x024a:
            java.lang.Object r11 = r2.A04
            X.92T r11 = (X.AnonymousClass92T) r11
            java.lang.Object r5 = r2.A03
            X.92U r5 = (X.AnonymousClass92U) r5
            java.lang.Object r9 = r2.A02
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r9 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r9
            java.lang.Object r7 = r2.A01
            X.136 r7 = (X.136) r7
            X.0eS.A00(r10)     // Catch:{ all -> 0x05af }
            goto L_0x0482
        L_0x025f:
            java.lang.Object r6 = r2.A05
            X.5rE r6 = (X.C297125rE) r6
            java.lang.Object r11 = r2.A04
            X.92T r11 = (X.AnonymousClass92T) r11
            java.lang.Object r5 = r2.A03
            X.92U r5 = (X.AnonymousClass92U) r5
            java.lang.Object r9 = r2.A02
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r9 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r9
            java.lang.Object r7 = r2.A01
            X.136 r7 = (X.136) r7
            X.0eS.A00(r10)     // Catch:{ all -> 0x05af }
            goto L_0x04bb
        L_0x0278:
            java.lang.Object r11 = r2.A03
            X.92T r11 = (X.AnonymousClass92T) r11
            java.lang.Object r9 = r2.A02
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r9 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r9
            java.lang.Object r7 = r2.A01
            X.136 r7 = (X.136) r7
            X.0eS.A00(r10)     // Catch:{ all -> 0x05af }
            goto L_0x04f8
        L_0x0289:
            java.lang.Object r11 = r2.A03
            X.92T r11 = (X.AnonymousClass92T) r11
            java.lang.Object r9 = r2.A02
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r9 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r9
            java.lang.Object r7 = r2.A01
            X.136 r7 = (X.136) r7
            X.0eS.A00(r10)     // Catch:{ all -> 0x05af }
            goto L_0x050a
        L_0x029a:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L_0x02b8
            if (r0 != r6) goto L_0x02b0
            java.lang.Object r7 = r2.A06
            X.4Co r7 = (X.C262204Co) r7
            X.0eS.A00(r10)     // Catch:{ all -> 0x02ad }
            goto L_0x0381
        L_0x02ad:
            r3 = move-exception
            goto L_0x03a7
        L_0x02b0:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r0)
            throw r3
        L_0x02b8:
            X.0eS.A00(r10)
            java.lang.Object r7 = r2.A06
            X.4Cq r7 = (X.C262224Cq) r7
            java.lang.Object r0 = r2.A04     // Catch:{ all -> 0x03a3 }
            X.0rm r0 = (X.0rm) r0     // Catch:{ all -> 0x03a3 }
            java.lang.Object r9 = r0.A00     // Catch:{ all -> 0x03a3 }
            X.5PX r9 = (X.AnonymousClass5PX) r9     // Catch:{ all -> 0x03a3 }
            if (r9 == 0) goto L_0x034f
            java.lang.Object r0 = r2.A05     // Catch:{ all -> 0x03a3 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x03a3 }
            android.content.Context r0 = r0.getContext()     // Catch:{ all -> 0x03a3 }
            android.content.Context r14 = r0.getApplicationContext()     // Catch:{ all -> 0x03a3 }
            java.util.Map r1 = X.AnonymousClass5PK.A00     // Catch:{ all -> 0x03a3 }
            monitor-enter(r1)     // Catch:{ all -> 0x03a3 }
            java.lang.Object r8 = r1.get(r14)     // Catch:{ all -> 0x034c }
            if (r8 != 0) goto L_0x032a
            android.content.ContentResolver r13 = r14.getContentResolver()     // Catch:{ all -> 0x034c }
            java.lang.String r11 = "animator_duration_scale"
            android.net.Uri r15 = android.provider.Settings.Global.getUriFor(r11)     // Catch:{ all -> 0x034c }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x034c }
            X.3Eu r8 = new X.3Eu     // Catch:{ all -> 0x034c }
            r8.<init>(r6, r0)     // Catch:{ all -> 0x034c }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x034c }
            android.os.Handler r4 = android.os.Handler.createAsync(r0)     // Catch:{ all -> 0x034c }
            X.5Pp r0 = new X.5Pp     // Catch:{ all -> 0x034c }
            r0.<init>(r4, r8)     // Catch:{ all -> 0x034c }
            X.9KT r12 = new X.9KT     // Catch:{ all -> 0x034c }
            r18 = r8
            r17 = r5
            r16 = r0
            r12.<init>((android.content.ContentResolver) r13, (android.content.Context) r14, (android.net.Uri) r15, (X.C285085Pp) r16, (X.AnonymousClass4D7) r17, (X.C249513ju) r18)     // Catch:{ all -> 0x034c }
            X.05E r10 = new X.05E     // Catch:{ all -> 0x034c }
            r10.<init>(r12)     // Catch:{ all -> 0x034c }
            X.19S r12 = X.19E.A01()     // Catch:{ all -> 0x034c }
            X.0pQ r8 = new X.0pQ     // Catch:{ all -> 0x034c }
            r8.<init>()     // Catch:{ all -> 0x034c }
            android.content.ContentResolver r4 = r14.getContentResolver()     // Catch:{ all -> 0x034c }
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = android.provider.Settings.Global.getFloat(r4, r11, r0)     // Catch:{ all -> 0x034c }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x034c }
            X.05F r8 = X.10b.A02(r0, r12, r10, r8)     // Catch:{ all -> 0x034c }
            r1.put(r14, r8)     // Catch:{ all -> 0x034c }
        L_0x032a:
            X.0Ud r8 = (X.AnonymousClass0Ud) r8     // Catch:{ all -> 0x034c }
            monitor-exit(r1)     // Catch:{ all -> 0x03a3 }
            java.lang.Object r0 = r8.getValue()     // Catch:{ all -> 0x03a3 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x03a3 }
            float r1 = r0.floatValue()     // Catch:{ all -> 0x03a3 }
            X.5PZ r0 = r9.A00     // Catch:{ all -> 0x03a3 }
            r0.EWt(r1)     // Catch:{ all -> 0x03a3 }
            r0 = 21
            X.MH2 r4 = new X.MH2     // Catch:{ all -> 0x03a3 }
            r4.<init>((java.lang.Object) r9, (java.lang.Object) r8, (X.AnonymousClass4D7) r5, (int) r0)     // Catch:{ all -> 0x03a3 }
            X.19B r1 = X.19B.A00     // Catch:{ all -> 0x03a3 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x03a3 }
            X.1Er r7 = X.1Eo.A03(r0, r1, r4, r7)     // Catch:{ all -> 0x03a3 }
            goto L_0x0350
        L_0x034c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03a3 }
            throw r0     // Catch:{ all -> 0x03a3 }
        L_0x034f:
            r7 = r5
        L_0x0350:
            java.lang.Object r8 = r2.A01     // Catch:{ all -> 0x03a6 }
            androidx.compose.runtime.Recomposer r8 = (androidx.compose.runtime.Recomposer) r8     // Catch:{ all -> 0x03a6 }
            r2.A06 = r7     // Catch:{ all -> 0x03a6 }
            r2.A00 = r6     // Catch:{ all -> 0x03a6 }
            androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2 r6 = new androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2     // Catch:{ all -> 0x03a6 }
            r6.<init>(r8, r5)     // Catch:{ all -> 0x03a6 }
            X.4Cc r1 = r2.getContext()     // Catch:{ all -> 0x03a6 }
            X.5PS r0 = X.AnonymousClass5PR.A00     // Catch:{ all -> 0x03a6 }
            X.4Cb r4 = r1.get(r0)     // Catch:{ all -> 0x03a6 }
            X.5PR r4 = (X.AnonymousClass5PR) r4     // Catch:{ all -> 0x03a6 }
            if (r4 == 0) goto L_0x0397
            X.5Pi r1 = r8.A0A     // Catch:{ all -> 0x03a6 }
            X.9KP r0 = new X.9KP     // Catch:{ all -> 0x03a6 }
            r0.<init>((X.AnonymousClass5PR) r4, (androidx.compose.runtime.Recomposer) r8, (X.AnonymousClass4D7) r5, (X.0sK) r6)     // Catch:{ all -> 0x03a6 }
            java.lang.Object r0 = X.1Eo.A00(r2, r1, r0)     // Catch:{ all -> 0x03a6 }
            if (r0 == r3) goto L_0x037a
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x03a6 }
        L_0x037a:
            if (r0 == r3) goto L_0x037e
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x03a6 }
        L_0x037e:
            if (r0 != r3) goto L_0x0381
            return r3
        L_0x0381:
            if (r7 == 0) goto L_0x0386
            r7.AG7(r5)
        L_0x0386:
            java.lang.Object r0 = r2.A03
            X.07Z r0 = (X.AnonymousClass07Z) r0
            X.07V r1 = r0.getLifecycle()
            java.lang.Object r0 = r2.A02
            X.5Po r0 = (X.C285075Po) r0
            r1.A0A(r0)
            goto L_0x0722
        L_0x0397:
            r0 = 1176(0x498, float:1.648E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x03a6 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03a6 }
            r1.<init>(r0)     // Catch:{ all -> 0x03a6 }
            throw r1     // Catch:{ all -> 0x03a6 }
        L_0x03a3:
            r3 = move-exception
            r7 = r5
            goto L_0x03a7
        L_0x03a6:
            r3 = move-exception
        L_0x03a7:
            if (r7 == 0) goto L_0x03ac
            r7.AG7(r5)
        L_0x03ac:
            java.lang.Object r0 = r2.A03
            X.07Z r0 = (X.AnonymousClass07Z) r0
            X.07V r1 = r0.getLifecycle()
            java.lang.Object r0 = r2.A02
            X.5Po r0 = (X.C285075Po) r0
            r1.A0A(r0)
            throw r3
        L_0x03bc:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r9 = 2
            r8 = 1
            if (r0 == 0) goto L_0x043b
            if (r0 == r8) goto L_0x0429
            if (r0 != r9) goto L_0x05b5
            java.lang.Object r11 = r2.A04
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r6 = r2.A03
            java.util.List r6 = (java.util.List) r6
            X.0eS.A00(r10)
        L_0x03d3:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x05b4
            java.lang.Object r12 = r11.next()
            X.5KO r12 = (X.AnonymousClass5KO) r12
            r2.A03 = r6
            r2.A04 = r11
            r2.A05 = r12
            r2.A06 = r10
            r2.A00 = r8
            java.lang.Object r0 = r12.Esb(r10, r2)
            if (r0 == r3) goto L_0x0462
            r7 = r10
            r10 = r0
        L_0x03f1:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r0 = r10.booleanValue()
            if (r0 == 0) goto L_0x0427
            r4 = 0
            r1 = 0
            X.JTg r0 = new X.JTg
            r0.<init>(r12, r4, r1)
            r6.add(r0)
            r2.A03 = r6
            r2.A04 = r11
            r2.A05 = r4
            r2.A06 = r4
            r2.A00 = r9
            androidx.datastore.migrations.SharedPreferencesMigration r12 = (androidx.datastore.migrations.SharedPreferencesMigration) r12
            X.0sK r5 = r12.A05
            X.0eM r0 = r12.A03
            java.lang.Object r4 = r0.getValue()
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            java.util.Set r1 = r12.A02
            X.A4c r0 = new X.A4c
            r0.<init>(r4, r1)
            java.lang.Object r10 = r5.invoke(r0, r7, r2)
            if (r10 != r3) goto L_0x03d3
            return r3
        L_0x0427:
            r10 = r7
            goto L_0x03d3
        L_0x0429:
            java.lang.Object r7 = r2.A06
            java.lang.Object r12 = r2.A05
            X.5KO r12 = (X.AnonymousClass5KO) r12
            java.lang.Object r11 = r2.A04
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r6 = r2.A03
            java.util.List r6 = (java.util.List) r6
            X.0eS.A00(r10)
            goto L_0x03f1
        L_0x043b:
            X.0eS.A00(r10)
            java.lang.Object r10 = r2.A03
            java.lang.Object r0 = r2.A02
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r6 = r2.A01
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r11 = r0.iterator()
            goto L_0x03d3
        L_0x044d:
            X.0eS.A00(r10)
            java.lang.Object r9 = r2.A06
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl r9 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl) r9
            X.136 r7 = r9.A0D
            r2.A01 = r7
            r2.A02 = r9
            r2.A00 = r12
            java.lang.Object r0 = X.136.A00(r2, r7)
            if (r0 != r3) goto L_0x0463
        L_0x0462:
            return r3
        L_0x0463:
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.database.ContentFilterDictionaryDatabase r0 = r9.A07     // Catch:{ all -> 0x05ad }
            X.92U r5 = r0.A00()     // Catch:{ all -> 0x05ad }
            X.92T r11 = r0.A01()     // Catch:{ all -> 0x05ad }
            java.lang.String r1 = r9.A0A     // Catch:{ all -> 0x05ad }
            r2.A01 = r7     // Catch:{ all -> 0x05ad }
            r2.A02 = r9     // Catch:{ all -> 0x05ad }
            r2.A03 = r5     // Catch:{ all -> 0x05ad }
            r2.A04 = r11     // Catch:{ all -> 0x05ad }
            r0 = 2
            r2.A00 = r0     // Catch:{ all -> 0x05ad }
            java.lang.Object r10 = r11.A01(r1, r2)     // Catch:{ all -> 0x05ad }
            if (r10 != r3) goto L_0x0482
            goto L_0x0560
        L_0x0482:
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x05ad }
            int r0 = r10.size()     // Catch:{ all -> 0x05ad }
            if (r0 <= 0) goto L_0x059f
            java.lang.Object r6 = r10.get(r13)     // Catch:{ all -> 0x05ad }
            X.5rE r6 = (X.C297125rE) r6     // Catch:{ all -> 0x05ad }
            boolean r0 = r9.A0F     // Catch:{ all -> 0x05ad }
            if (r0 == 0) goto L_0x049e
            java.lang.String r1 = r6.A05     // Catch:{ all -> 0x05ad }
            java.lang.String r0 = r6.A06     // Catch:{ all -> 0x05ad }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x05ad }
            if (r0 != 0) goto L_0x0531
        L_0x049e:
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager r14 = r9.A08     // Catch:{ all -> 0x05ad }
            com.instagram.common.session.UserSession r10 = r9.A05     // Catch:{ all -> 0x05ad }
            java.lang.String r4 = r9.A0A     // Catch:{ all -> 0x05ad }
            java.lang.String r1 = r9.A01     // Catch:{ all -> 0x05ad }
            r2.A01 = r7     // Catch:{ all -> 0x05ad }
            r2.A02 = r9     // Catch:{ all -> 0x05ad }
            r2.A03 = r5     // Catch:{ all -> 0x05ad }
            r2.A04 = r11     // Catch:{ all -> 0x05ad }
            r2.A05 = r6     // Catch:{ all -> 0x05ad }
            r0 = 3
            r2.A00 = r0     // Catch:{ all -> 0x05ad }
            java.lang.Object r10 = r14.A01(r10, r4, r1, r2)     // Catch:{ all -> 0x05ad }
            if (r10 != r3) goto L_0x04bb
            goto L_0x0561
        L_0x04bb:
            r1 = r10
            X.3Ii r1 = (X.C239803Ii) r1     // Catch:{ all -> 0x05ad }
            boolean r0 = r1 instanceof X.C239793Ih     // Catch:{ all -> 0x05ad }
            if (r0 == 0) goto L_0x0520
            boolean r0 = r9.A0F     // Catch:{ all -> 0x05ad }
            if (r0 == 0) goto L_0x04d7
            r0 = r1
            X.3Ih r0 = (X.C239793Ih) r0     // Catch:{ all -> 0x05ad }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x05ad }
            X.9cF r0 = (X.C381739cF) r0     // Catch:{ all -> 0x05ad }
            java.lang.String r4 = r0.A01     // Catch:{ all -> 0x05ad }
            java.lang.String r0 = r6.A06     // Catch:{ all -> 0x05ad }
            boolean r0 = X.0qQ.A0K(r4, r0)     // Catch:{ all -> 0x05ad }
            if (r0 != 0) goto L_0x0531
        L_0x04d7:
            X.3Ih r1 = (X.C239793Ih) r1     // Catch:{ all -> 0x05ad }
            java.lang.Object r4 = r1.A00     // Catch:{ all -> 0x05ad }
            X.9cF r4 = (X.C381739cF) r4     // Catch:{ all -> 0x05ad }
            r2.A01 = r7     // Catch:{ all -> 0x05ad }
            r2.A02 = r9     // Catch:{ all -> 0x05ad }
            r2.A03 = r11     // Catch:{ all -> 0x05ad }
            r2.A04 = r8     // Catch:{ all -> 0x05ad }
            r2.A05 = r8     // Catch:{ all -> 0x05ad }
            r0 = 4
            r2.A00 = r0     // Catch:{ all -> 0x05ad }
            X.3oI r1 = r5.A05     // Catch:{ all -> 0x05ad }
            X.TPN r0 = new X.TPN     // Catch:{ all -> 0x05ad }
            r0.<init>(r12, r5, r11, r4)     // Catch:{ all -> 0x05ad }
            java.lang.Object r0 = X.AnonymousClass1t4.A00(r1, r2, r0)     // Catch:{ all -> 0x05ad }
            if (r0 != r3) goto L_0x04f8
            goto L_0x0562
        L_0x04f8:
            java.lang.String r1 = r9.A0A     // Catch:{ all -> 0x05ad }
            r2.A01 = r7     // Catch:{ all -> 0x05ad }
            r2.A02 = r9     // Catch:{ all -> 0x05ad }
            r2.A03 = r11     // Catch:{ all -> 0x05ad }
            r0 = 5
            r2.A00 = r0     // Catch:{ all -> 0x05ad }
            java.lang.Object r10 = r11.A01(r1, r2)     // Catch:{ all -> 0x05ad }
            if (r10 != r3) goto L_0x050a
            goto L_0x0563
        L_0x050a:
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x05ad }
            int r0 = r10.size()     // Catch:{ all -> 0x05ad }
            if (r0 <= 0) goto L_0x0564
            java.lang.Object r0 = r10.get(r13)     // Catch:{ all -> 0x05ad }
            X.5rE r0 = (X.C297125rE) r0     // Catch:{ all -> 0x05ad }
            java.lang.String r0 = r0.A06     // Catch:{ all -> 0x05ad }
            X.0qQ.A0B(r0, r13)     // Catch:{ all -> 0x05ad }
            r9.A01 = r0     // Catch:{ all -> 0x05ad }
            goto L_0x0531
        L_0x0520:
            boolean r0 = r1 instanceof X.C297815sO     // Catch:{ all -> 0x05ad }
            if (r0 == 0) goto L_0x0576
            boolean r0 = r9.A0F     // Catch:{ all -> 0x05ad }
            if (r0 == 0) goto L_0x0531
            java.lang.String r0 = r6.A06     // Catch:{ all -> 0x05ad }
            int r0 = r0.length()     // Catch:{ all -> 0x05ad }
            if (r0 != 0) goto L_0x0531
            goto L_0x0572
        L_0x0531:
            java.lang.String r4 = r9.A0A     // Catch:{ all -> 0x059d }
            r2.A01 = r7     // Catch:{ all -> 0x059d }
            r2.A02 = r9     // Catch:{ all -> 0x059d }
            r2.A03 = r9     // Catch:{ all -> 0x059d }
            r2.A04 = r8     // Catch:{ all -> 0x059d }
            r2.A05 = r8     // Catch:{ all -> 0x059d }
            r0 = 6
            r2.A00 = r0     // Catch:{ all -> 0x059d }
            java.lang.String r1 = "\n        SELECT pattern\n        FROM content_filter_dictionary_entries\n        INNER JOIN content_filter_dictionary_metadata\n              ON id = dictionary_id\n        WHERE dictionary_key = ?\n      "
            java.util.TreeMap r0 = X.1WY.A08     // Catch:{ all -> 0x059d }
            X.1WY r6 = X.1Wa.A00(r1, r12)     // Catch:{ all -> 0x059d }
            r6.ADh(r12, r4)     // Catch:{ all -> 0x059d }
            android.os.CancellationSignal r5 = new android.os.CancellationSignal     // Catch:{ all -> 0x059d }
            r5.<init>()     // Catch:{ all -> 0x059d }
            X.3oI r4 = r11.A00     // Catch:{ all -> 0x059d }
            r1 = 12
            X.MB7 r0 = new X.MB7     // Catch:{ all -> 0x059d }
            r0.<init>(r1, r11, r6)     // Catch:{ all -> 0x059d }
            java.lang.Object r10 = X.1wR.A00(r5, r4, r0, r2, r13)     // Catch:{ all -> 0x059d }
            if (r10 == r3) goto L_0x0462
            goto L_0x057c
        L_0x0560:
            return r3
        L_0x0561:
            return r3
        L_0x0562:
            return r3
        L_0x0563:
            return r3
        L_0x0564:
            X.A05 r0 = new X.A05     // Catch:{ all -> 0x05ad }
            r0.<init>()     // Catch:{ all -> 0x05ad }
            X.5sO r3 = new X.5sO     // Catch:{ all -> 0x05ad }
            r3.<init>(r0)     // Catch:{ all -> 0x05ad }
            r7.A05(r8)
            return r3
        L_0x0572:
            r7.A05(r8)
            return r1
        L_0x0576:
            X.Wub r0 = new X.Wub     // Catch:{ all -> 0x05ad }
            r0.<init>()     // Catch:{ all -> 0x05ad }
            throw r0     // Catch:{ all -> 0x05ad }
        L_0x057c:
            r0 = r9
            goto L_0x0581
        L_0x057e:
            X.0eS.A00(r10)     // Catch:{ all -> 0x059d }
        L_0x0581:
            java.util.Collection r10 = (java.util.Collection) r10     // Catch:{ all -> 0x059d }
            java.util.Set r1 = r0.A0B     // Catch:{ all -> 0x059d }
            monitor-enter(r1)     // Catch:{ all -> 0x059d }
            r1.clear()     // Catch:{ all -> 0x059a }
            r1.addAll(r10)     // Catch:{ all -> 0x059a }
            monitor-exit(r1)     // Catch:{ all -> 0x059d }
            r9.A0H = r12     // Catch:{ all -> 0x059d }
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x059d }
            X.3Ih r3 = new X.3Ih     // Catch:{ all -> 0x059d }
            r3.<init>(r0)     // Catch:{ all -> 0x059d }
            r7.A05(r8)
            return r3
        L_0x059a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x059d }
            throw r0     // Catch:{ all -> 0x059d }
        L_0x059d:
            r3 = move-exception
            goto L_0x05b0
        L_0x059f:
            X.A05 r0 = new X.A05     // Catch:{ all -> 0x05ad }
            r0.<init>()     // Catch:{ all -> 0x05ad }
            X.5sO r3 = new X.5sO     // Catch:{ all -> 0x05ad }
            r3.<init>(r0)     // Catch:{ all -> 0x05ad }
            r7.A05(r8)
            return r3
        L_0x05ad:
            r3 = move-exception
            goto L_0x05b0
        L_0x05af:
            r3 = move-exception
        L_0x05b0:
            r7.A05(r8)
            throw r3
        L_0x05b4:
            return r10
        L_0x05b5:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x05bd:
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r6 = 4
            r5 = 3
            r9 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0676
            if (r0 == r1) goto L_0x0688
            if (r0 == r9) goto L_0x06d4
            if (r0 == r5) goto L_0x061f
            if (r0 != r6) goto L_0x0709
            java.lang.Object r7 = r2.A04
            X.0sa r7 = (X.C62320sa) r7
            java.lang.Object r1 = r2.A03
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r2.A02
            java.lang.Object r11 = r2.A01
            com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository r11 = (com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository) r11
            X.0eS.A00(r10)
        L_0x05e0:
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r10 = new X.3Ih
            r10.<init>(r0)
        L_0x05e7:
            boolean r0 = r10 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x05f2
            boolean r0 = r10 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0703
            r7.invoke()
        L_0x05f2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x071b
            java.lang.Object r13 = r1.next()
            java.lang.String r13 = (java.lang.String) r13
            r0 = 20
            X.Phi r7 = new X.Phi
            r7.<init>(r13, r11, r0)
            java.util.HashSet r0 = r11.A07
            r0.add(r13)
            com.instagram.clips.drafts.model.datasource.ClipsImportDraftDataSource r0 = r11.A02
            r2.A01 = r11
            r2.A02 = r4
            r2.A03 = r1
            r2.A04 = r13
            r2.A05 = r7
            r2.A00 = r5
            java.lang.Object r10 = r0.A01(r13, r2)
            if (r10 != r3) goto L_0x0634
            return r3
        L_0x061f:
            java.lang.Object r7 = r2.A05
            X.0sa r7 = (X.C62320sa) r7
            java.lang.Object r13 = r2.A04
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r1 = r2.A03
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r2.A02
            java.lang.Object r11 = r2.A01
            com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository r11 = (com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository) r11
            X.0eS.A00(r10)
        L_0x0634:
            X.3Ii r10 = (X.C239803Ii) r10
            boolean r0 = r10 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x066c
            X.3Ih r10 = (X.C239793Ih) r10
            java.lang.Object r0 = r10.A00
            X.JVf r0 = (X.C59721JVf) r0
            java.lang.Object r14 = r0.A00
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r12 = r0.A01
            X.55Q r12 = (X.AnonymousClass55Q) r12
            boolean r0 = r14.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0667
            r2.A01 = r11
            r2.A02 = r4
            r2.A03 = r1
            r2.A04 = r7
            r0 = 0
            r2.A05 = r0
            r2.A00 = r6
            r15 = r2
            r16 = r7
            java.lang.Object r0 = com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository.A01(r11, r12, r13, r14, r15, r16)
            if (r0 != r3) goto L_0x05e0
            return r3
        L_0x0667:
            r7.invoke()
            goto L_0x05e0
        L_0x066c:
            boolean r0 = r10 instanceof X.C297815sO
            if (r0 != 0) goto L_0x05e7
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0676:
            X.0eS.A00(r10)
            java.lang.Object r0 = r2.A06
            com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository r0 = (com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository) r0
            com.instagram.clips.drafts.model.datasource.ClipsImportDraftDataSource r0 = r0.A02
            r2.A00 = r1
            java.lang.Object r10 = r0.A02(r2)
            if (r10 != r3) goto L_0x068b
            return r3
        L_0x0688:
            X.0eS.A00(r10)
        L_0x068b:
            X.3Ii r10 = (X.C239803Ii) r10
            java.lang.Object r11 = r2.A06
            com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository r11 = (com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository) r11
            boolean r0 = r10 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0711
            X.3Ih r10 = (X.C239793Ih) r10
            java.lang.Object r1 = r10.A00
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.HashSet r0 = r11.A08
            r0.clear()
            r0.addAll(r1)
            java.util.List r0 = X.00k.A0Y(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r8 = r0.iterator()
        L_0x06b0:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x06fb
            java.lang.Object r7 = r8.next()
            r1 = r7
            java.lang.String r1 = (java.lang.String) r1
            r2.A01 = r11
            r2.A02 = r4
            r2.A03 = r8
            r2.A04 = r7
            r2.A05 = r1
            r2.A00 = r9
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r0 = r11.A01
            X.2NP r0 = r0.A01
            java.lang.Object r10 = r0.A0B(r1, r2)
            if (r10 != r3) goto L_0x06e7
            return r3
        L_0x06d4:
            java.lang.Object r1 = r2.A05
            java.lang.Object r7 = r2.A04
            java.lang.Object r8 = r2.A03
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r4 = r2.A02
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r11 = r2.A01
            com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository r11 = (com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository) r11
            X.0eS.A00(r10)
        L_0x06e7:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r0 = r10.booleanValue()
            if (r0 != 0) goto L_0x06b0
            java.util.HashSet r0 = r11.A06
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x06b0
            r4.add(r7)
            goto L_0x06b0
        L_0x06fb:
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r1 = r4.iterator()
            goto L_0x05f2
        L_0x0703:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0709:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0711:
            boolean r0 = r10 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0722
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x071b:
            java.util.HashSet r1 = r11.A07
            java.lang.String r0 = "-1"
            r1.remove(r0)
        L_0x0722:
            X.0gF r3 = X.C60340gF.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9KS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KS(List list, List list2, AnonymousClass4D7 r4) {
        super(2, r4);
        this.A07 = 1;
        this.A02 = list;
        this.A01 = list2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KS(View view, Recomposer recomposer, C285075Po r4, AnonymousClass07Z r5, AnonymousClass4D7 r6, 0rm r7) {
        super(2, r6);
        this.A07 = 0;
        this.A04 = r7;
        this.A01 = recomposer;
        this.A03 = r5;
        this.A02 = r4;
        this.A05 = view;
    }
}
