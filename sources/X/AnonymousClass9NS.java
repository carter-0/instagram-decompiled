package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.9NS  reason: invalid class name */
public final class AnonymousClass9NS {
    public Exception A00;
    public final AnonymousClass2K8 A01;
    public final 2K4 A02;
    public final AnonymousClass2K3 A03;
    public final Integer A04;
    public final Collection A05;
    public final Set A06;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cd, code lost:
        r2 = X.AnonymousClass7TE.A1C();
        r3 = X.AnonymousClass05K.A15;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0096 A[LOOP:2: B:18:0x0090->B:20:0x0096, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.PyF A01() {
        /*
            r14 = this;
            java.lang.Integer r8 = r14.A04
            java.lang.Integer r3 = X.AnonymousClass05K.A1F
            if (r8 != r3) goto L_0x002d
            X.PyE r5 = new X.PyE
            r5.<init>()
            X.2K4 r4 = r14.A02
            X.2Jv r2 = r4.A04
            java.util.Set r0 = r14.A06
            X.8nC r1 = new X.8nC
            r1.<init>(r8, r0)
            X.PyE r0 = new X.PyE
            r0.<init>()
            X.PyF r3 = r2.Exj(r0, r1)
            java.util.concurrent.Executor r2 = r4.A09
            r1 = 1
            X.AVv r0 = new X.AVv
            r0.<init>(r1, r14, r5)
            r3.A05(r0, r2)
            X.PyF r4 = r5.A00
            return r4
        L_0x002d:
            java.util.Set r7 = r14.A06
            java.util.HashSet r6 = X.AnonymousClass7TE.A1F()
            java.util.HashSet r10 = X.AnonymousClass7TE.A1F()
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>(r7)
            X.0g7 r5 = X.0g7.A00()
        L_0x0040:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0066
            java.lang.Object r4 = r9.removeFirst()
            java.lang.String r4 = (java.lang.String) r4
            r6.add(r4)
            r2 = 0
            boolean r0 = r5.A08(r4)
            if (r0 == 0) goto L_0x0059
            r10.add(r4)
        L_0x0059:
            int r1 = r2 + 1
            java.lang.String r0 = X.0fy.A02(r4, r2)
            if (r0 == 0) goto L_0x0040
            r9.addLast(r0)
            r2 = r1
            goto L_0x0059
        L_0x0066:
            r6.removeAll(r10)
            X.2K8 r5 = r14.A01
            X.0g7 r0 = X.0g7.A00()
            android.content.Context r10 = r5.A01
            boolean r0 = r0.A06(r10)
            if (r0 != 0) goto L_0x00a0
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.lang.Integer r3 = X.AnonymousClass05K.A03
        L_0x007d:
            X.9NV r0 = new X.9NV
            r0.<init>(r3, r6)
            r2.add(r0)
        L_0x0085:
            X.9NU r3 = new X.9NU
            r3.<init>(r8, r2, r7, r6)
            java.util.Collection r0 = r14.A05
            java.util.Iterator r1 = r0.iterator()
        L_0x0090:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0257
            java.lang.Object r0 = r1.next()
            X.2K0 r0 = (X.2K0) r0
            r0.A07(r3)
            goto L_0x0090
        L_0x00a0:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r6)
            java.util.Iterator r9 = r6.iterator()
        L_0x00a9:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00d7
            java.lang.Object r2 = r9.next()
            java.lang.String r2 = (java.lang.String) r2
            int r1 = X.0gR.A00(r2)
            r0 = -3
            if (r1 != r0) goto L_0x00d4
            java.lang.Object[] r3 = new java.lang.Object[]{r2}
            java.lang.String r2 = "AppModuleIndexUtil"
            java.lang.String r1 = "Checking for valid module for %s"
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = java.lang.String.format(r0, r1, r3)
            X.0KC.A0E(r2, r0)
        L_0x00cd:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.lang.Integer r3 = X.AnonymousClass05K.A15
            goto L_0x007d
        L_0x00d4:
            if (r1 < 0) goto L_0x00cd
            goto L_0x00a9
        L_0x00d7:
            java.util.Iterator r2 = r4.iterator()
        L_0x00db:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            X.0g7 r0 = X.0g7.A00()
            boolean r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x00db
            r2.remove()
            goto L_0x00db
        L_0x00f5:
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            java.util.Iterator r13 = r4.iterator()     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
        L_0x00fd:
            boolean r0 = r13.hasNext()     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            if (r0 == 0) goto L_0x0177
            java.lang.Object r9 = r13.next()     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            X.0g7 r4 = X.0g7.A00()     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            boolean r0 = r4.A07(r9)     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            if (r0 != 0) goto L_0x0147
            int r1 = X.0gR.A00(r9)     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            java.lang.Integer r0 = r4.A01(r1)     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            java.lang.Integer r4 = X.AnonymousClass05K.A0C     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            if (r0 == r4) goto L_0x015f
            boolean r0 = X.C60310fu.A00(r10)     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            if (r0 == 0) goto L_0x015f
            java.lang.Integer r0 = X.0fy.A01(r9)     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            int r12 = r0.intValue()     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            r0 = 1
            if (r12 == r0) goto L_0x0147
            r0 = 2
            if (r12 == r0) goto L_0x015f
            r0 = 0
            java.lang.String r11 = "ActionQueryCalculator"
            if (r12 == r0) goto L_0x0168
            X.0g7 r0 = X.0g7.A00()     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            java.lang.Integer r1 = r0.A01(r1)     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            if (r1 == r0) goto L_0x0165
            if (r1 == r4) goto L_0x015f
            goto L_0x014a
        L_0x0147:
            X.9NT r0 = X.AnonymousClass9NT.LOADED     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            goto L_0x0161
        L_0x014a:
            X.0gM r0 = r5.A00     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            java.io.File r0 = r0.A01(r9)     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            if (r0 == 0) goto L_0x0165
            boolean r0 = r0.exists()     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            if (r0 == 0) goto L_0x0165
            X.0g7 r0 = X.0g7.A00()     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            r0.A05(r9, r4)     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
        L_0x015f:
            X.9NT r0 = X.AnonymousClass9NT.LOCAL     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
        L_0x0161:
            r2.put(r9, r0)     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            goto L_0x00fd
        L_0x0165:
            X.9NT r0 = X.AnonymousClass9NT.REMOTE     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            goto L_0x0161
        L_0x0168:
            java.lang.Object[] r1 = new java.lang.Object[]{r9}     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            java.lang.String r0 = "Failed to retrieve packaging for module %s"
            X.0KC.A0Q(r11, r0, r1)     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            X.9tW r0 = new X.9tW     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            r0.<init>()     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
            throw r0     // Catch:{ 9tW -> 0x0251, 9tU -> 0x0249 }
        L_0x0177:
            java.util.HashSet r9 = X.AnonymousClass7TE.A1F()
            java.util.Iterator r4 = X.AnonymousClass7TF.A0s(r2)
        L_0x017f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x019b
            java.lang.Object r3 = r4.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r1 = r3.getValue()
            X.9NT r0 = X.AnonymousClass9NT.REMOTE
            if (r1 != r0) goto L_0x017f
            java.lang.Object r0 = r3.getKey()
            r9.add(r0)
            goto L_0x017f
        L_0x019b:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r8 != r1) goto L_0x01ad
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x01ad
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.lang.Integer r3 = X.AnonymousClass05K.A02
            goto L_0x007d
        L_0x01ad:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x01c3
            android.net.ConnectivityManager r0 = r5.A02
            if (r0 == 0) goto L_0x0239
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L_0x0239
            boolean r0 = r0.isConnectedOrConnecting()
            if (r0 == 0) goto L_0x0239
        L_0x01c3:
            java.util.HashSet r5 = X.AnonymousClass7TE.A1F()
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            if (r8 == r4) goto L_0x01fb
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r8 == r0) goto L_0x01fb
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r8 == r0) goto L_0x01fb
            java.util.Iterator r3 = X.AnonymousClass7TF.A0s(r2)
        L_0x01d7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01fb
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r1 = r2.getValue()
            X.9NT r0 = X.AnonymousClass9NT.LOCAL
            if (r1 == r0) goto L_0x01f3
            java.lang.Object r1 = r2.getValue()
            X.9NT r0 = X.AnonymousClass9NT.REMOTE
            if (r1 != r0) goto L_0x01d7
        L_0x01f3:
            java.lang.Object r0 = r2.getKey()
            r5.add(r0)
            goto L_0x01d7
        L_0x01fb:
            r3 = 0
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0215
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            if (r8 != r0) goto L_0x0215
            java.lang.Integer r1 = X.AnonymousClass05K.A02
            X.9NV r0 = new X.9NV
            r0.<init>(r1, r6)
            r2.add(r0)
            r3 = 1
        L_0x0215:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0225
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.9NV r0 = new X.9NV
            r0.<init>(r1, r9)
            r2.add(r0)
        L_0x0225:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0233
            X.9NV r0 = new X.9NV
            r0.<init>(r4, r5)
            r2.add(r0)
        L_0x0233:
            if (r3 != 0) goto L_0x0085
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y
            goto L_0x007d
        L_0x0239:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            X.9NV r0 = new X.9NV
            r0.<init>(r1, r9)
            r2.add(r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A0u
            goto L_0x007d
        L_0x0249:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.lang.Integer r3 = X.AnonymousClass05K.A1I
            goto L_0x007d
        L_0x0251:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            goto L_0x007d
        L_0x0257:
            X.PyE r1 = new X.PyE
            r1.<init>()
            java.util.List r0 = r3.A03
            java.util.Iterator r0 = r0.iterator()
            A00(r3, r14, r1, r0)
            X.PyF r4 = r1.A00
            X.2K4 r0 = r14.A02
            java.util.concurrent.Executor r2 = r0.A09
            r1 = 0
            X.AVv r0 = new X.AVv
            r0.<init>(r1, r14, r3)
            r4.A05(r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9NS.A01():X.PyF");
    }

    public AnonymousClass9NS(AnonymousClass2K8 r2, 2K4 r3, AnonymousClass2K3 r4, Integer num, Collection collection) {
        this.A06 = AnonymousClass7TE.A1F();
        this.A00 = null;
        this.A02 = r3;
        this.A04 = num;
        this.A05 = collection;
        this.A01 = r2;
        this.A03 = r4;
    }

    public static void A00(AnonymousClass9NU r8, AnonymousClass9NS r9, PyE pyE, Iterator it) {
        C293175kI r0;
        if (!it.hasNext()) {
            0KC.A0Q("AppModuleActionQueryV2", "executeAction is called when no actions exist %s", new Object[]{r8.A03.toString()});
            if (pyE != null) {
                pyE.A00(AnonymousClass7TE.A0z("executeAction is called when no actions exist"));
                return;
            }
            return;
        }
        AnonymousClass9NV r7 = (AnonymousClass9NV) it.next();
        PyE pyE2 = new PyE();
        PyF pyF = pyE2.A00;
        2K4 r6 = r9.A02;
        Executor executor = r6.A09;
        pyF.A05(new AnonymousClass9NY(r8, r9, pyE, it), executor);
        switch (r7.A00.intValue()) {
            case 0:
                Set set = r7.A01;
                for (2K0 A052 : r9.A05) {
                    A052.A05(r8);
                }
                r6.A04.Ewu(new C365488nC(r9.A04, set)).A05(new C365638nR(r8, r9, pyE2), executor);
                return;
            case 1:
                executor.execute(new AnonymousClass9NZ(r8, r9, pyE2, r7.A01));
                return;
            case 2:
                r6.A04.AOK(new C365488nC(r9.A04, r7.A01));
                r0 = new C293175kI((C294495mY) null, (Exception) null, true);
                break;
            case 4:
            case 5:
                r0 = new C293175kI(new C294495mY((Throwable) null, -1, true, false), (Exception) null, true);
                break;
            case 6:
                r0 = new C293175kI(new C294495mY((Throwable) null, -2, false, true), (Exception) null, true);
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                r0 = new C293175kI(new C294495mY((Throwable) null, -1, false, false), (Exception) null, true);
                break;
            default:
                return;
        }
        pyE2.A01(r0);
    }

    public AnonymousClass9NS() {
    }
}
