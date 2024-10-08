package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2kp  reason: invalid class name and case insensitive filesystem */
public final class C228122kp implements C228132kq {
    public final UserSession A00;
    public final Object A01 = new Object();
    public final Set A02 = new HashSet();
    public final Set A03 = new HashSet();

    public final void Dcg(Integer num, int i, long j, boolean z) {
        Integer num2 = num;
        0qQ.A0B(num, 3);
        synchronized (this.A01) {
            for (C228132kq Dcg : A00()) {
                Dcg.Dcg(num2, i, j, z);
            }
        }
    }

    public final void Dch(1OE r12, String str, int i, long j, boolean z, boolean z2) {
        1OE r4 = r12;
        0qQ.A0B(r12, 0);
        String str2 = str;
        0qQ.A0B(str, 1);
        synchronized (this.A01) {
            for (C228132kq Dch : A00()) {
                Dch.Dch(r4, str2, i, j, z, z2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Collection A00() {
        /*
            r4 = this;
            com.instagram.common.session.UserSession r3 = r4.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325768238740701(0x810e18001034dd, double:3.0359003340831433E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0035
            java.util.Set r1 = r4.A03
            X.3BI r0 = X.AnonymousClass3BI.A00
            X.018.A17(r1, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x001f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r1.next()
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x001f
            r2.add(r0)
            goto L_0x001f
        L_0x0035:
            java.util.Set r2 = r4.A02
        L_0x0037:
            java.util.Collection r2 = (java.util.Collection) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228122kp.A00():java.util.Collection");
    }

    public final void DJL(boolean z) {
        synchronized (this.A01) {
            for (C228132kq DJL : A00()) {
                DJL.DJL(z);
            }
        }
    }

    public final void DWD(long j, int i) {
        synchronized (this.A01) {
            for (C228132kq DWD : A00()) {
                DWD.DWD(j, i);
            }
        }
    }

    public final void DWE(long j) {
        synchronized (this.A01) {
            for (C228132kq DWE : A00()) {
                DWE.DWE(j);
            }
        }
    }

    public final void DcX(boolean z, boolean z2) {
        synchronized (this.A01) {
            for (C228132kq DcX : A00()) {
                DcX.DcX(z, z2);
            }
        }
    }

    public final void Dcj() {
        synchronized (this.A01) {
            for (C228132kq Dcj : A00()) {
                Dcj.Dcj();
            }
        }
    }

    public C228122kp(UserSession userSession) {
        this.A00 = userSession;
    }
}
