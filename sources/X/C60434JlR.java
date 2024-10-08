package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.JlR  reason: case insensitive filesystem */
public final class C60434JlR extends 2Rw {
    public int A00;
    public KMT A01;
    public C66544MVy A02;
    public List A03 = AnonymousClass7TE.A1C();
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final AnonymousClass0eM A0C = AnonymousClass0eN.A01(MMB.A00(this, 35));
    public final C62320sa A0D;
    public final int A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final void A02(List list, boolean z) {
        List list2 = this.A03;
        this.A03 = list;
        if (!z) {
            JTP.A1C(new C60358Jk6(list2, list, false), this);
        } else {
            JTO.A0E(this.A0C).post(new C65981M6s(this, list2));
        }
    }

    public final void onBindViewHolder(C249703kE r5, int i) {
        KME kme;
        int i2;
        KME kme2;
        View view;
        int i3;
        View A0F2;
        int i4;
        0qQ.A0B(r5, 0);
        if (r5 instanceof C60590Jnz) {
            L40 l40 = (L40) 00k.A0O(this.A03, i);
            if (l40 instanceof KMC) {
                A0F2 = JTO.A0F(r5);
                i4 = ((KMC) l40).A00;
            } else {
                if (l40 instanceof KMD) {
                    A0F2 = JTO.A0F(r5);
                    i4 = ((KMD) l40).A00;
                }
                view = r5.itemView;
                i3 = 49;
            }
            0nA.A0f(A0F2, i4);
            view = r5.itemView;
            i3 = 49;
        } else if (r5 instanceof C61786KMa) {
            if (00k.A0O(this.A03, i) instanceof KMF) {
                C61194Jyn A002 = A00(i);
                if (A002 != null) {
                    C61786KMa kMa = (C61786KMa) r5;
                    kMa.A00(A002, this.A00);
                    int i5 = A002.A00;
                    TextView textView = kMa.A00;
                    DbX.A1C(textView, DbY.A01(kMa.A00) + i5, textView.getPaddingTop());
                }
            } else {
                Object A0O = 00k.A0O(this.A03, i);
                if ((A0O instanceof KME) && (kme = (KME) A0O) != null) {
                    C61193Jym jym = kme.A01;
                    C61786KMa kMa2 = (C61786KMa) r5;
                    Object A0O2 = 00k.A0O(this.A03, i);
                    if (!(A0O2 instanceof KME) || (kme2 = (KME) A0O2) == null) {
                        i2 = 0;
                    } else {
                        i2 = kme2.A00;
                    }
                    kMa2.A00(jym, i2);
                }
            }
            view = r5.itemView;
            i3 = 50;
        } else {
            return;
        }
        LY4.A01(view, i3, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (r13.A07 != false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C249703kE onCreateViewHolder(android.view.ViewGroup r14, int r15) {
        /*
            r13 = this;
            r4 = 0
            X.0qQ.A0B(r14, r4)
            if (r15 == 0) goto L_0x005a
            r0 = 1
            if (r15 == r0) goto L_0x0057
            r0 = 2
            if (r15 == r0) goto L_0x0054
            r0 = 3
            if (r15 != r0) goto L_0x00a3
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
        L_0x0011:
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0078
            r3 = 2
            if (r1 == r3) goto L_0x0078
            r0 = 3
            if (r1 == r0) goto L_0x0062
            if (r1 != r4) goto L_0x005d
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.content.Context r2 = r14.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r2)
            r0 = 2131627368(0x7f0e0d68, float:1.8881998E38)
            android.view.View r1 = X.DbT.A0D(r1, r14, r0, r4)
            X.0sa r0 = r13.A0D
            X.Jnz r3 = new X.Jnz
            r3.<init>(r1, r0, r4)
            boolean r0 = r13.A0G
            if (r0 == 0) goto L_0x004f
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131165304(0x7f070078, float:1.7944821E38)
            int r1 = X.DbS.A03(r1, r0)
        L_0x0047:
            android.view.View r0 = X.JTO.A0F(r3)
            X.0nA.A0V(r0, r1)
            return r3
        L_0x004f:
            int r1 = X.JTT.A02(r2)
            goto L_0x0047
        L_0x0054:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0011
        L_0x0057:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0011
        L_0x005a:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0011
        L_0x005d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0062:
            android.view.LayoutInflater r1 = X.JTP.A0G(r14)
            r0 = 2131627368(0x7f0e0d68, float:1.8881998E38)
            android.view.View r2 = X.DbT.A0D(r1, r14, r0, r4)
            int r1 = r13.A0E
            int r1 = r1 / r3
            X.0sa r0 = r13.A0D
            X.Jnz r3 = new X.Jnz
            r3.<init>(r2, r0, r1)
            return r3
        L_0x0078:
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.content.Context r4 = X.AnonymousClass7TE.A0S(r14)
            X.MVy r5 = r13.A02
            boolean r1 = r13.A08
            if (r1 != 0) goto L_0x0089
            boolean r0 = r13.A07
            r7 = 1
            if (r0 == 0) goto L_0x008a
        L_0x0089:
            r7 = 0
        L_0x008a:
            r8 = r1 ^ 1
            boolean r9 = r13.A05
            boolean r10 = r13.A06
            boolean r11 = r13.A04
            boolean r12 = r13.A0G
            boolean r0 = r13.A0F
            if (r0 == 0) goto L_0x00a0
            X.KiS r6 = X.C62595KiS.A09
        L_0x009a:
            X.KMa r3 = new X.KMa
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r3
        L_0x00a0:
            X.KiS r6 = X.C62595KiS.A0A
            goto L_0x009a
        L_0x00a3:
            java.lang.String r0 = "Not valid type: "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60434JlR.onCreateViewHolder(android.view.ViewGroup, int):X.3kE");
    }

    public final C61194Jyn A00(int i) {
        KMF kmf;
        Object A0O = 00k.A0O(this.A03, i);
        if (!(A0O instanceof KMF) || (kmf = (KMF) A0O) == null) {
            return null;
        }
        return kmf.A04;
    }

    public final void A01(int i, int i2, int i3) {
        KMF kmf;
        int i4 = (i * 2) + 2;
        if (i4 < this.A03.size()) {
            ArrayList A0U = 00k.A0U(this.A03);
            C61194Jyn A002 = A00(i4);
            if (A002 != null) {
                C61194Jyn A032 = A002.A03(i2, i3, i2, i3);
                Object A0O = 00k.A0O(this.A03, i4);
                if ((A0O instanceof KMF) && (kmf = (KMF) A0O) != null) {
                    A0U.set(i4, new KMF(A032, kmf.A00, kmf.A01, kmf.A02, kmf.A03));
                }
                this.A03 = A0U;
            }
        }
    }

    public C60434JlR(Context context, C62320sa r3, int i, boolean z, boolean z2) {
        this.A0B = context;
        this.A0E = i;
        this.A0D = r3;
        this.A0G = z;
        this.A0F = z2;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1989907495);
        int size = this.A03.size();
        AnonymousClass0fD.A0A(-502932744, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int i2;
        int A032 = AnonymousClass0fD.A03(1652837810);
        L40 l40 = (L40) 00k.A0O(this.A03, i);
        if (l40 != null) {
            i2 = l40.A00;
        } else {
            i2 = -1;
        }
        AnonymousClass0fD.A0A(652516717, A032);
        return i2;
    }
}
