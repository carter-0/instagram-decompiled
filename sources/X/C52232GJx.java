package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.GJx  reason: case insensitive filesystem */
public final class C52232GJx extends C52050GCw implements C270674h7 {
    public int A00 = 2;
    public final ArrayList A01 = AnonymousClass7TE.A1C();
    public final Map A02;
    public final C62320sa A03;
    public final UserSession A04;

    public C52232GJx(UserSession userSession, C62320sa r5) {
        this.A03 = r5;
        this.A04 = userSession;
        182.A06(0Tu.A05, userSession, 36315748078980603L);
        this.A02 = AnonymousClass7TE.A1H();
    }

    public final void D3r(H3D h3d) {
    }

    public final void D3s() {
    }

    public final void D3t(C52228GJt gJt) {
    }

    public final void D3u(C52263GLe gLe) {
        Integer valueOf;
        int i;
        0qQ.A0B(gLe, 0);
        if (gLe.A0G) {
            A00();
        }
        C62320sa r5 = this.A03;
        if (!AnonymousClass7TE.A1b(((GD6) r5.invoke()).A0A.A0K(C295365o2.QPMIDCARD))) {
            ArrayList arrayList = this.A01;
            if (DbT.A1b(arrayList) && GD6.A01(r5).A0A() - 2 >= this.A00) {
                Object A13 = 018.A13(arrayList);
                if (A13 != null) {
                    AnonymousClass4UE r4 = (AnonymousClass4UE) A13;
                    0qQ.A0B(r4, 0);
                    while (((GD6) r5.invoke()).A0A.A0A() - 2 >= this.A00) {
                        C52012GBj gBj = this.A02;
                        if (!(gBj == null || (valueOf = Integer.valueOf(gBj.A06())) == null || valueOf.intValue() >= (i = this.A00))) {
                            C52009GBg gBg = ((GD6) r5.invoke()).A0A;
                            C267324bN A0E = gBg.A0E(i - 1);
                            C267324bN A0E2 = gBg.A0E(i);
                            C295365o2 r0 = A0E.A01;
                            C295365o2 r1 = C295365o2.ORGANIC;
                            if (r0 == r1 && A0E2.A01 == r1) {
                                AnonymousClass4UC r12 = (AnonymousClass4UC) r4;
                                0qQ.A0B(r12, 0);
                                C267324bN r2 = new C267324bN((C267334bO) new C57029ILv(r12));
                                ((GD6) r5.invoke()).A0A.A0b(r2, this.A00);
                                this.A02.put(r4, r2);
                                A00();
                                return;
                            }
                        }
                        C267324bN A0E3 = ((GD6) r5.invoke()).A0A.A0E(this.A00);
                        int i2 = this.A00;
                        C295365o2 r22 = A0E3.A01;
                        int i3 = 2;
                        if (r22 == C295365o2.ORGANIC) {
                            i3 = 1;
                        }
                        this.A00 = i2 + i3;
                    }
                    if (arrayList.isEmpty()) {
                        arrayList.add(r4);
                        return;
                    }
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r1 >= 1) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r3 = this;
            java.util.ArrayList r1 = r3.A01
            boolean r0 = X.DbT.A1b(r1)
            if (r0 == 0) goto L_0x003d
            java.lang.Object r2 = X.00k.A0I(r1)
            X.4UE r2 = (X.AnonymousClass4UE) r2
            r1 = 0
            r0 = 3668(0xe54, float:5.14E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ NumberFormatException -> 0x0032 }
            X.0qQ.A0C(r2, r0)     // Catch:{ NumberFormatException -> 0x0032 }
            X.4UC r2 = (X.AnonymousClass4UC) r2     // Catch:{ NumberFormatException -> 0x0032 }
            X.4VA r2 = r2.A09     // Catch:{ NumberFormatException -> 0x0032 }
            java.lang.String r0 = "ig_qp_reels_midcard_placement"
            X.4VP r0 = r2.A00(r0)     // Catch:{ NumberFormatException -> 0x0032 }
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r0.A03     // Catch:{ NumberFormatException -> 0x0032 }
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = X.DbV.A12(r0)     // Catch:{ NumberFormatException -> 0x0032 }
            if (r0 == 0) goto L_0x003d
            java.lang.Integer r1 = X.00y.A0l(r0)     // Catch:{ NumberFormatException -> 0x0032 }
        L_0x0032:
            if (r1 == 0) goto L_0x003d
            int r1 = r1.intValue()
            r0 = 1
            int r1 = r1 - r0
            if (r1 < r0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r1 = 2
        L_0x003e:
            r3.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52232GJx.A00():void");
    }
}
