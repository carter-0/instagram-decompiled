package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public final class NQJ extends C232232tF {
    public List A00 = AnonymousClass7TE.A1C();
    public List A01 = AnonymousClass7TE.A1C();
    public final int A02;
    public final C14140Tqa A03;
    public final XAH A04;
    public final boolean A05;
    public final boolean A06;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(layoutInflater, 1);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        float f = RecyclerView.A1E;
        Context context = layoutInflater.getContext();
        0qQ.A07(context);
        return new C67925MxB(layoutInflater, new C68082Mzn(context, 0sn.A00, 0, 2000, 45, true), this.A03, this.A04);
    }

    public static final List A00(C21020X9y x9y) {
        List list = ((N5H) x9y).A00;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            C69157Nfg nfg = new C69157Nfg((C21019X9x) next);
            C66966Mfz mfz = new C66966Mfz();
            mfz.A09 = "meta_ai_cloud_pill";
            mfz.A08 = "AI_CLOUD";
            mfz.A01 = i;
            mfz.A05 = C66582MXn.A0w("AI_CLOUD");
            A0r.add(new C69171Nfu(nfg, new C66967Mg0(mfz)));
            i = i2;
        }
        return A0r;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0013: MOVE  (r5v1 X.2t9) = (r5v0 X.2t9)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r13, X.C249703kE r14) {
        /*
            r12 = this;
            X.UqH r13 = (X.C16192UqH) r13
            X.MxB r14 = (X.C67925MxB) r14
            r10 = 0
            boolean r8 = X.AnonymousClass7TF.A1U(r10, r13, r14)
            X.Mzn r6 = r14.A00
            if (r6 == 0) goto L_0x00f4
            X.2Rw r5 = r6.A0A
            boolean r0 = r5 instanceof X.AnonymousClass2t9
            if (r0 == 0) goto L_0x00f4
            X.2t9 r5 = (X.AnonymousClass2t9) r5
            if (r5 == 0) goto L_0x00f4
            int r7 = r12.A02
            com.instagram.common.recyclerview.ViewModelListUpdate r4 = X.DbS.A0R()
            X.X9y r11 = r13.A00
            java.util.List r1 = A00(r11)
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x009c
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x009c
            java.util.List r0 = r12.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x003b
            java.util.List r0 = X.0jo.A1G(r1)
            r12.A01 = r0
        L_0x003b:
            java.util.List r0 = r12.A01
        L_0x003d:
            r4.A01(r0)
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r6)
            r2 = 0
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r3)
            r0 = 2131627850(0x7f0e0f4a, float:1.8882976E38)
            android.view.View r2 = X.DbT.A0D(r1, r2, r0, r10)
            X.OEY r0 = new X.OEY
            r0.<init>(r2)
            r2.setTag(r0)
            int r1 = r6.getWidth()
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            r9 = 0
            r2.measure(r0, r10)
            r1 = 1069547520(0x3fc00000, float:1.5)
            if (r7 != r8) goto L_0x006c
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x006c:
            int r0 = r2.getMeasuredHeight()
            int r0 = r0 * r7
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            if (r0 <= 0) goto L_0x0077
            r9 = r0
        L_0x0077:
            X.N5H r11 = (X.N5H) r11
            boolean r1 = r11.A01
            boolean r0 = r12.A05
            if (r0 != 0) goto L_0x0080
            r1 = 0
        L_0x0080:
            int r0 = r6.A00
            if (r0 != r7) goto L_0x0088
            boolean r0 = r6.A01
            if (r0 == r1) goto L_0x00f1
        L_0x0088:
            r6.setIsScrollAnimationEnabled(r1)
            java.util.ArrayList r10 = X.DbS.A0v(r7)
            r1 = 0
        L_0x0090:
            if (r1 >= r7) goto L_0x00cf
            int r0 = X.AnonymousClass7TG.A02(r3)
            X.AnonymousClass7TF.A1M(r10, r0)
            int r1 = r1 + 1
            goto L_0x0090
        L_0x009c:
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x00a7
            java.util.List r0 = A00(r11)
            goto L_0x003d
        L_0x00a7:
            java.util.List r0 = r12.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00cb
            int r9 = r7 * 6
            java.util.ArrayList r3 = X.DbS.A0v(r9)
            r2 = 0
        L_0x00b6:
            if (r2 >= r9) goto L_0x00c9
            int r0 = r2 % 4
            boolean r1 = X.AnonymousClass7TF.A1Q(r0)
            X.Otn r0 = new X.Otn
            r0.<init>(r1)
            r3.add(r0)
            int r2 = r2 + 1
            goto L_0x00b6
        L_0x00c9:
            r12.A00 = r3
        L_0x00cb:
            java.util.List r0 = r12.A00
            goto L_0x003d
        L_0x00cf:
            r6.A00 = r7
            android.content.Context r3 = r6.A05
            int r2 = X.AnonymousClass7TG.A05(r3)
            int r0 = X.DbY.A01(r3)
            X.Jw3 r1 = new X.Jw3
            r1.<init>((java.util.List) r10, (int) r2, (int) r0, (int) r8)
            com.facebook.common.staggeredgrid.HorizontalStaggeredLayoutManager r0 = new com.facebook.common.staggeredgrid.HorizontalStaggeredLayoutManager
            r0.<init>(r3, r1, r7)
            r6.setLayoutManager(r0)
            r1 = -1
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r1, r9)
            r6.setLayoutParams(r0)
        L_0x00f1:
            r5.A05(r4)
        L_0x00f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NQJ.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C16192UqH.class;
    }

    public NQJ(C14140Tqa tqa, XAH xah, int i, boolean z, boolean z2) {
        this.A03 = tqa;
        this.A04 = xah;
        this.A06 = z;
        this.A05 = z2;
        this.A02 = i;
    }
}
