package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.3fU  reason: invalid class name and case insensitive filesystem */
public final class C246943fU {
    public final UserSession A00;
    public final C249763kK A01;

    public static final int A00(1Xj r9, AnonymousClass3W1 r10) {
        0qQ.A0B(r9, 0);
        0qQ.A0B(r10, 1);
        Integer num = null;
        int i = 0;
        List<C247733gp> list = r9.A1X().A00;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (C247733gp r0 : list) {
            arrayList.add(Integer.valueOf(Arrays.hashCode(new Object[]{Boolean.valueOf(r0.A0O)})));
        }
        Object obj = r10.A3b.A00;
        Integer valueOf = Integer.valueOf(r9.A0v());
        Integer valueOf2 = Integer.valueOf(r9.A0r());
        List BxO = r9.A0C.BxO();
        if (BxO != null) {
            num = Integer.valueOf(BxO.size());
        }
        List BxO2 = r9.A0C.BxO();
        if (BxO2 != null) {
            i = BxO2.hashCode();
        }
        return Arrays.hashCode(new Object[]{arrayList, obj, valueOf, valueOf2, num, Integer.valueOf(i), r9.BpP()});
    }

    public final C376459Ib A01(1Xj r12, AnonymousClass4DU r13, AnonymousClass3W1 r14) {
        0qQ.A0B(r12, 0);
        0qQ.A0B(r14, 1);
        boolean A0E = Systrace.A0E(1);
        if (A0E) {
            0fS.A01("SocialContextBubblesRowUseCase#getUiState", 1130721165);
        }
        AnonymousClass4DU r5 = r13;
        C376459Ib r1 = new C376459Ib(new AnonymousClass9IE((Object) new AnonymousClass9MT(4, this, r12, r13, r14), 15), C245973dm.A00.A00(r5, this.A00, new C245893de(r12, r14), AnonymousClass05K.A0N, r14.getPosition(), false), r14);
        if (A0E) {
            0fS.A00(-1532406958);
        }
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        r4 = X.C245973dm.A00;
        r7 = new X.C245893de(r12, r14);
        r9 = r14.getPosition();
        r8 = X.AnonymousClass05K.A0N;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(X.1Xj r12, X.AnonymousClass4DU r13, X.AnonymousClass3W1 r14) {
        /*
            r11 = this;
            r4 = 0
            X.0qQ.A0B(r12, r4)
            r10 = 1
            X.0qQ.A0B(r14, r10)
            r0 = 2
            r5 = r13
            X.0qQ.A0B(r13, r0)
            X.3DI r3 = X.AnonymousClass3DI.A00
            com.instagram.common.session.UserSession r6 = r11.A00
            java.lang.String r0 = r13.getModuleName()
            X.0qQ.A0B(r0, r10)
            boolean r0 = X.AnonymousClass3DI.A02(r0)
            if (r0 == 0) goto L_0x0053
            boolean r0 = r3.A05(r6)
            if (r0 == 0) goto L_0x0053
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327752512846509(0x810fe600043aad, double:3.037155197017687E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0053
            r1 = 0
            boolean r0 = r3.A04(r6)
            if (r0 == 0) goto L_0x0052
            X.3dm r4 = X.C245973dm.A00
            X.3de r7 = new X.3de
            r7.<init>(r12, r14)
            int r9 = r14.getPosition()
            java.lang.Integer r8 = X.AnonymousClass05K.A0N
            X.3ex r0 = r4.A00(r5, r6, r7, r8, r9, r10)
            if (r0 == 0) goto L_0x0052
            java.lang.Integer r0 = r0.A04
            if (r0 == 0) goto L_0x0052
            if (r0 == r8) goto L_0x0052
            r1 = 1
        L_0x0052:
            return r1
        L_0x0053:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C246943fU.A02(X.1Xj, X.4DU, X.3W1):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r1 = r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.1Xj r8, X.AnonymousClass4DU r9, X.AnonymousClass3W1 r10) {
        /*
            r7 = this;
            r6 = 1
            X.3DI r0 = X.AnonymousClass3DI.A00
            com.instagram.common.session.UserSession r2 = r7.A00
            boolean r0 = r0.A04(r2)
            if (r0 == 0) goto L_0x0028
            X.3dm r0 = X.C245973dm.A00
            X.3de r3 = new X.3de
            r3.<init>(r8, r10)
            int r5 = r10.getPosition()
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            r1 = r9
            X.3ex r0 = r0.A00(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0028
            java.lang.Integer r2 = r0.A04
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 0
            if (r2 != r1) goto L_0x0027
            r0 = 1
        L_0x0027:
            return r0
        L_0x0028:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C246943fU.A03(X.1Xj, X.4DU, X.3W1):boolean");
    }

    public C246943fU(UserSession userSession, C249763kK r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }
}
