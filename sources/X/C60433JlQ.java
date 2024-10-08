package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.JlQ  reason: case insensitive filesystem */
public final class C60433JlQ extends 2Rw {
    public C66544MVy A00;
    public List A01;
    public boolean A02;
    public final Context A03;
    public final Runnable A04 = new M35(this);
    public final AnonymousClass0eM A05 = MMR.A00(this, 1);
    public final int A06;
    public final UserSession A07;
    public final C62320sa A08;
    public final C62320sa A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public final void onBindViewHolder(C249703kE r5, int i) {
        KMF A002;
        View A0F;
        int i2;
        0qQ.A0B(r5, 0);
        if (r5 instanceof C60590Jnz) {
            L40 l40 = (L40) this.A01.get(i);
            if (l40 instanceof KMD) {
                A0F = JTO.A0F(r5);
                i2 = ((KMD) l40).A00;
            } else if (l40 instanceof KMC) {
                A0F = JTO.A0F(r5);
                i2 = ((KMC) l40).A00;
            } else {
                return;
            }
            0nA.A0f(A0F, i2);
        } else if ((r5 instanceof C66473MTb) && (A002 = A00(i)) != null) {
            C66473MTb mTb = (C66473MTb) r5;
            C61194Jyn jyn = A002.A04;
            mTb.FMP(jyn);
            if (jyn.A0A != AnonymousClass05K.A0Y) {
                JTO.A0E(this.A05).removeCallbacks(this.A04);
                this.A02 = false;
            } else if (!this.A02) {
                JTO.A0E(this.A05).post(this.A04);
                this.A02 = true;
            }
            C60997Jut jut = jyn.A08;
            if (jut != null) {
                mTb.FM0(jut.A00);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C249703kE onCreateViewHolder(android.view.ViewGroup r13, int r14) {
        /*
            r12 = this;
            r5 = 0
            X.0qQ.A0B(r13, r5)
            if (r14 == 0) goto L_0x001c
            r0 = 1
            if (r14 == r0) goto L_0x0019
            r0 = 2
            if (r14 == r0) goto L_0x001f
            r0 = 3
            if (r14 == r0) goto L_0x0019
            r0 = 4
            if (r14 == r0) goto L_0x001c
            java.lang.String r0 = "Not valid index: "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r14)
            throw r0
        L_0x0019:
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            goto L_0x0021
        L_0x001c:
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            goto L_0x0021
        L_0x001f:
            java.lang.Integer r4 = X.AnonymousClass05K.A01
        L_0x0021:
            int r1 = r4.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x005a
            boolean r1 = r12.A0D
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.content.Context r5 = X.AnonymousClass7TE.A0S(r13)
            if (r1 == 0) goto L_0x0048
            boolean r4 = r12.A0C
            boolean r3 = r12.A0A
            boolean r2 = r12.A0B
            r0 = 2
            X.JVq r1 = new X.JVq
            r1.<init>((boolean) r4, (boolean) r3, (boolean) r2, (int) r0)
            X.MVy r0 = r12.A00
            X.KMb r4 = new X.KMb
            r4.<init>(r5, r1, r0)
        L_0x0045:
            X.3kE r4 = (X.C249703kE) r4
            return r4
        L_0x0048:
            com.instagram.common.session.UserSession r6 = r12.A07
            boolean r8 = r12.A0C
            boolean r9 = r12.A0A
            boolean r10 = r12.A0B
            boolean r11 = r12.A0E
            X.MVy r7 = r12.A00
            X.KMc r4 = new X.KMc
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0045
        L_0x005a:
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.content.Context r3 = r13.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r3)
            r0 = 2131627368(0x7f0e0d68, float:1.8881998E38)
            r2 = 0
            android.view.View r1 = X.DbT.A0D(r1, r13, r0, r5)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r4 != r0) goto L_0x0074
            int r0 = r12.A06
            int r2 = r0 / 2
        L_0x0074:
            X.0sa r0 = r12.A08
            X.Jnz r4 = new X.Jnz
            r4.<init>(r1, r0, r2)
            boolean r0 = r12.A0E
            if (r0 == 0) goto L_0x0092
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165304(0x7f070078, float:1.7944821E38)
            int r1 = X.DbS.A03(r1, r0)
        L_0x008a:
            android.view.View r0 = X.JTO.A0F(r4)
            X.0nA.A0V(r0, r1)
            return r4
        L_0x0092:
            int r1 = X.JTT.A02(r3)
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60433JlQ.onCreateViewHolder(android.view.ViewGroup, int):X.3kE");
    }

    public final KMF A00(int i) {
        Object A0O = 00k.A0O(this.A01, i);
        if (A0O instanceof KMF) {
            return (KMF) A0O;
        }
        return null;
    }

    public final void A01(int i, int i2, int i3) {
        int i4 = (i * 2) + 2;
        KMF A002 = A00(i4);
        if (i4 < this.A01.size() && A002 != null) {
            this.A01.set(i4, new KMF(A002.A04.A03(i2, i3, i2, i3), A002.A00, A002.A01, A002.A02, A002.A03));
        }
    }

    public final void A02(List list, boolean z) {
        List list2 = this.A01;
        this.A01 = AnonymousClass7TE.A1D(list);
        if (!C51971G9r.A1b(this.A09)) {
            JTP.A1C(new C60358Jk6(list2, this.A01, z), this);
        } else {
            JTO.A0E(this.A05).post(new C66028M8n(this, list2, z));
        }
    }

    public C60433JlQ(Context context, UserSession userSession, List list, C62320sa r5, C62320sa r6, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A03 = context;
        this.A07 = userSession;
        this.A01 = list;
        this.A09 = r5;
        this.A0C = z;
        this.A0A = z2;
        this.A0B = z3;
        this.A0E = z4;
        this.A0D = z5;
        this.A06 = i;
        this.A08 = r6;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1523185975);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(-1106776409, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(1261473888);
        int i2 = ((L40) this.A01.get(i)).A00;
        AnonymousClass0fD.A0A(721996629, A032);
        return i2;
    }
}
