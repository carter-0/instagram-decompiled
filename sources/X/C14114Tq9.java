package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.Tq9  reason: case insensitive filesystem */
public final class C14114Tq9 extends Tq8 {
    public C276544tV A00;
    public final Handler A01 = new C14697U1x(Looper.getMainLooper(), this, 1);
    public final C307786Rm A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14114Tq9(X.C307786Rm r4, X.C276544tV r5, int r6) {
        /*
            r3 = this;
            X.Ty6 r2 = new X.Ty6
            r2.<init>(r6)
            r1 = 2131428756(0x7f0b0594, float:1.8479165E38)
            android.util.SparseArray r0 = r4.A01
            r0.get(r1)
            r3.<init>(r2)
            r3.A02 = r4
            r3.A00 = r5
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1 = 1
            X.U1x r0 = new X.U1x
            r0.<init>(r2, r3, r1)
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14114Tq9.<init>(X.6Rm, X.4tV, int):void");
    }

    public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(C249703kE r4) {
        C277014uI A0A;
        C276544tV A07 = ((C14538Txy) ((C299215ul) r4).A00).A01.A07(132);
        if (A07 != null && A07.A04 == 13366 && (A0A = A07.A0A(38)) != null) {
            C64361Kj.A00();
            AnonymousClass7TE.A1S(this.A01, A0A, 0);
        }
    }

    public final /* bridge */ /* synthetic */ void onViewDetachedFromWindow(C249703kE r4) {
        C277014uI A0A;
        C276544tV A07 = ((C14538Txy) ((C299215ul) r4).A00).A01.A07(132);
        if (A07 != null && A07.A04 == 13366 && (A0A = A07.A0A(40)) != null) {
            C64361Kj.A00();
            AnonymousClass7TE.A1S(this.A01, A0A, 0);
        }
    }

    public final void A01(C299215ul r10, int i) {
        StringBuilder sb;
        String str;
        String A0l;
        C307786Rm r3;
        super.onBindViewHolder(r10, i);
        if (!AnonymousClass2SY.A02) {
            C307996Sh A012 = ((C14538Txy) this.A03.get(i)).A00.A01();
            if (A012 == null) {
                r3 = this.A02;
                A0l = "RenderResult is null after Binding item in the collection";
            } else {
                C245663dH r2 = A012.A01;
                C276544tV r32 = this.A00;
                if (C14506TxS.A00(r32) == 0 && r2.A01() > this.A01 * 3) {
                    sb = new StringBuilder();
                    sb.append("Item in the collection is too wide item width: ");
                    sb.append(r2.A01());
                    sb.append(" collection width: ");
                    sb.append(this.A01);
                    str = " This will lead to OOMs and poor performance. Use Flipper's UI Debugger to debug.See https://www.internalfb.com/intern/staticdocs/bloks/docs/bloks_standard_library/components/collection_v2#performance-considerations";
                } else if (C14506TxS.A00(r32) == 1 && r2.A00() > this.A00 * 3) {
                    sb = new StringBuilder();
                    sb.append("Item in the collection is too high item height: ");
                    sb.append(r2.A00());
                    sb.append(" collection height: ");
                    sb.append(this.A00);
                    str = " This will lead to OOMs and poor performance. Use Flipper's UI Debugger to debug.See https://www.internalfb.com/intern/staticdocs/bloks/docs/bloks_standard_library/components/collection_v2#performance-considerations.";
                } else {
                    return;
                }
                A0l = AnonymousClass7TF.A0l(str, sb);
                r3 = this.A02;
            }
            1Kn.A01(r3, "BloksCollection", A0l, (Throwable) null, 0, true);
        }
    }
}
