package X;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.IFp  reason: case insensitive filesystem */
public final class C56868IFp implements C270284gU {
    public C287725af A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass5PZ A03 = new ParcelableSnapshotMutableFloatState(-1.0f);
    public final AnonymousClass6G2 A04;
    public final C284945Oz A05;
    public final C284945Oz A06;
    public final C284945Oz A07 = C51969G9p.A0S(AnonymousClass7TE.A0v());
    public final C284945Oz A08;
    public final C284945Oz A09;
    public final AnonymousClass5b8 A0A;
    public final C287965b7 A0B;
    public final C287805an A0C;
    public final /* synthetic */ C56606I4f A0D;

    public C56868IFp(C287725af r13, C56606I4f i4f, C287805an r15, Object obj) {
        C287805an r9 = r15;
        this.A0D = i4f;
        this.A0C = r15;
        Object obj2 = null;
        Object obj3 = obj;
        this.A08 = C51970G9q.A0S(obj3);
        C287965b7 A0F = C51965G9l.A0F((Object) null, 1.0f, 1500.0f);
        this.A0B = A0F;
        ParcelableSnapshotMutableState A0S = C51969G9p.A0S(A0F);
        this.A06 = A0S;
        this.A05 = C51969G9p.A0S(new C3025864f((AnonymousClass5b9) A0S.getValue(), r13, r9, obj3, this.A08.getValue()));
        this.A09 = C51969G9p.A0S(obj3);
        this.A00 = r13;
        this.A04 = new ParcelableSnapshotMutableLongState(((C3025864f) this.A05.getValue()).AzP());
        Number A14 = C51966G9m.A14(r15, C55369Hgb.A01);
        if (A14 != null) {
            float floatValue = A14.floatValue();
            C287725af r2 = (C287725af) ((C287795am) r9).A01.invoke(obj3);
            int A012 = r2.A01();
            for (int i = 0; i < A012; i++) {
                r2.A03(i, floatValue);
            }
            obj2 = ((C287795am) this.A0C).A00.invoke(r2);
        }
        this.A0A = C51965G9l.A0F(obj2, 1.0f, 1500.0f);
    }

    private final void A00(Object obj, boolean z) {
        IEP iep;
        C284945Oz r6 = this.A08;
        Object obj2 = obj;
        if (r6.getValue() == null) {
            C3025864f r3 = new C3025864f(this.A0A, AnonymousClass6GZ.A01(this.A00), this.A0C, obj2, obj);
            C284945Oz r1 = this.A05;
            r1.Epw(r3);
            this.A02 = true;
            this.A04.Ecf(((C3025864f) r1.getValue()).AzP());
            return;
        }
        if (!z || this.A01 || (this.A06.getValue() instanceof C287965b7)) {
            iep = (AnonymousClass5b9) this.A06.getValue();
        } else {
            iep = this.A0A;
        }
        C56606I4f i4f = this.A0D;
        if (i4f.A02() > 0) {
            iep = new IEP(iep, i4f.A02());
        }
        C3025864f r8 = new C3025864f(iep, this.A00, this.A0C, obj, r6.getValue());
        C284945Oz r0 = this.A05;
        r0.Epw(r8);
        this.A04.Ecf(((C3025864f) r0.getValue()).AzP());
        this.A02 = false;
        C284945Oz r7 = i4f.A08;
        C51967G9n.A16(r7, true);
        if (C51971G9r.A1W(i4f.A05)) {
            AnonymousClass6HD r62 = i4f.A09;
            int size = r62.size();
            for (int i = 0; i < size; i++) {
                C56868IFp iFp = (C56868IFp) r62.get(i);
                iFp.A04.BOX();
                iFp.A01(i4f.A00);
            }
            C51967G9n.A16(r7, false);
        }
    }

    public final void A01(long j) {
        if (this.A03.B6X() == -1.0f) {
            this.A01 = true;
            C284945Oz r2 = this.A05;
            boolean A0K = 0qQ.A0K(((C3025864f) r2.getValue()).A05, ((C3025864f) r2.getValue()).A04);
            C3025864f r0 = (C3025864f) r2.getValue();
            if (A0K) {
                this.A09.Epw(r0.A05);
                return;
            }
            this.A09.Epw(r0.CDQ(j));
            this.A00 = ((C3025864f) r2.getValue()).CDf(j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0086, code lost:
        if (r6.B6X() == -3.0f) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass5b8 r9, java.lang.Object r10) {
        /*
            r8 = this;
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x000c
            r0 = 0
            boolean r0 = X.0qQ.A0K(r10, r0)
            if (r0 == 0) goto L_0x000c
            return
        L_0x000c:
            X.5Oz r1 = r8.A08
            boolean r0 = X.C51969G9p.A1T(r1, r10)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0022
            X.5PZ r0 = r8.A03
            float r0 = r0.B6X()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0022
            return
        L_0x0022:
            r1.Epw(r10)
            X.5Oz r0 = r8.A06
            r0.Epw(r9)
            X.5PZ r6 = r8.A03
            float r0 = r6.B6X()
            r3 = -1069547520(0xffffffffc0400000, float:-3.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0089
            r0 = r10
        L_0x0037:
            X.5Oz r2 = r8.A07
            boolean r1 = X.C51971G9r.A1W(r2)
            r1 = r1 ^ 1
            r8.A00(r0, r1)
            float r0 = r6.B6X()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            X.C51967G9n.A16(r2, r0)
            float r1 = r6.B6X()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0080
            X.5Oz r1 = r8.A05
            java.lang.Object r0 = r1.getValue()
            X.64f r0 = (X.C3025864f) r0
            long r2 = r0.AzP()
            java.lang.Object r7 = r1.getValue()
            X.64f r7 = (X.C3025864f) r7
            float r1 = (float) r2
            float r0 = r6.B6X()
            float r1 = r1 * r0
            long r0 = (long) r1
            java.lang.Object r10 = r7.CDQ(r0)
        L_0x0075:
            X.5Oz r0 = r8.A09
            r0.Epw(r10)
        L_0x007a:
            r8.A02 = r4
            r6.EWt(r5)
            return
        L_0x0080:
            float r0 = r6.B6X()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x007a
            goto L_0x0075
        L_0x0089:
            X.5Oz r0 = r8.A09
            java.lang.Object r0 = r0.getValue()
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56868IFp.A02(X.5b8, java.lang.Object):void");
    }

    public final void A03(AnonymousClass5b8 r3, Object obj, Object obj2) {
        this.A08.Epw(obj2);
        this.A06.Epw(r3);
        C284945Oz r1 = this.A05;
        if (!0qQ.A0K(((C3025864f) r1.getValue()).A04, obj) || !0qQ.A0K(((C3025864f) r1.getValue()).A05, obj2)) {
            A00(obj, false);
        }
    }

    public final Object getValue() {
        return this.A09.getValue();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("current value: ");
        A1A.append(this.A09.getValue());
        A1A.append(", target: ");
        A1A.append(this.A08.getValue());
        A1A.append(", spec: ");
        return AnonymousClass7TF.A0i(this.A06.getValue(), A1A);
    }
}
