package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.accordion.AccordionView;
import java.util.Map;

/* renamed from: X.Qez  reason: case insensitive filesystem */
public final class C8012Qez extends QEW {
    public final C10255RpF A00;
    public final Map A01;
    public final 0sL A02;
    public final boolean A03;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.RpF] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8012Qez(RH6 rh6, LoggingContext loggingContext, Map map, 0sL r6, boolean z) {
        super(rh6, loggingContext, false);
        0qQ.A0B(map, 3);
        this.A01 = map;
        this.A03 = z;
        this.A02 = r6;
        ? obj = new Object();
        obj.A00 = null;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d0, code lost:
        if (r11.A01.isPartialView() == false) goto L_0x00d2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.C8014Qf1 r14, X.SUj r15) {
        /*
            r5 = 0
            boolean r10 = X.AnonymousClass7TF.A1U(r5, r15, r14)
            java.lang.Object r4 = r15.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxAccordionItem r4 = (com.facebookpay.common.recyclerview.adapteritems.PuxAccordionItem) r4
            if (r4 == 0) goto L_0x01a3
            com.facebookpay.widget.accordion.AccordionView r3 = r14.A00
            X.Ry2 r0 = r4.A00
            r3.A05 = r0
            X.SUj r6 = r4.A01
            java.util.Map r2 = r3.A07
            r1 = 0
            if (r2 == 0) goto L_0x014f
            java.lang.Object r0 = r6.A01
            com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem r0 = (com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem) r0
            if (r0 == 0) goto L_0x00be
            X.RH6 r0 = r0.BJZ()
        L_0x0022:
            java.lang.Object r2 = r2.get(r0)
            X.QEW r2 = (X.QEW) r2
            if (r2 == 0) goto L_0x0032
            r0 = 17
            X.SbJ r0 = X.C11496SbJ.A00(r3, r0)
            r2.A00 = r0
        L_0x0032:
            X.3kE r0 = r3.A03
            if (r0 != 0) goto L_0x0052
            java.lang.String r9 = "summaryContainer"
            if (r2 == 0) goto L_0x0043
            android.widget.FrameLayout r0 = r3.A00
            if (r0 == 0) goto L_0x0152
            X.3kE r1 = r2.A09(r0)
        L_0x0043:
            r3.A03 = r1
            if (r1 == 0) goto L_0x0052
            android.view.View r1 = r1.itemView
            if (r1 == 0) goto L_0x0052
            android.widget.FrameLayout r0 = r3.A00
            if (r0 == 0) goto L_0x0152
            r0.addView(r1)
        L_0x0052:
            X.3kE r0 = r3.A03
            if (r0 == 0) goto L_0x005b
            if (r2 == 0) goto L_0x005b
            r2.A0A(r0, r6)
        L_0x005b:
            java.util.List r8 = r4.A02
            java.util.Map r14 = r3.A0C
            r14.clear()
            android.widget.LinearLayout r7 = r3.A01
            java.lang.String r9 = "expandedContainer"
            r6 = 0
            if (r7 == 0) goto L_0x0152
            r7.removeAllViews()
            com.google.common.collect.HashMultimap r9 = new com.google.common.collect.HashMultimap
            r9.<init>()
            java.util.Iterator r15 = r8.iterator()
        L_0x0075:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r13 = r15.next()
            X.SUj r13 = (X.SUj) r13
            java.lang.Object r0 = X.SUj.A0D(r13)
            com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem r0 = (com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem) r0
            X.RH6 r12 = r0.BJZ()
            java.util.Map r0 = r3.A07
            if (r0 == 0) goto L_0x014f
            java.lang.Object r11 = r0.get(r12)
            X.QEW r11 = (X.QEW) r11
            if (r11 == 0) goto L_0x0075
            X.3xW r2 = r3.A0B
            java.util.Collection r0 = r2.AXL(r12)
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r1 = X.00k.A0F(r0, r5)
            X.3kE r1 = (X.C249703kE) r1
            if (r1 == 0) goto L_0x00b9
            r2.remove(r12, r1)
        L_0x00aa:
            android.view.View r0 = r1.itemView
            r7.addView(r0)
            r9.E5L(r12, r1)
            r14.put(r1, r13)
            r11.A0A(r1, r13)
            goto L_0x0075
        L_0x00b9:
            X.3kE r1 = r11.A09(r7)
            goto L_0x00aa
        L_0x00be:
            r0 = r1
            goto L_0x0022
        L_0x00c1:
            X.3xW r2 = r3.A0B
            boolean r0 = r2 instanceof com.google.common.collect.ImmutableMultimap
            if (r0 == 0) goto L_0x014a
            r11 = r2
            com.google.common.collect.ImmutableMultimap r11 = (com.google.common.collect.ImmutableMultimap) r11
            com.google.common.collect.ImmutableMap r0 = r11.A01
            boolean r0 = r0.isPartialView()
            if (r0 != 0) goto L_0x014a
        L_0x00d2:
            X.AWR r1 = new X.AWR
            r1.<init>(r9, r10)
            boolean r0 = r11 instanceof X.AnonymousClass42M
            if (r0 == 0) goto L_0x0129
            X.42M r11 = (X.AnonymousClass42M) r11
            boolean r0 = r11 instanceof X.Qzf
            if (r0 == 0) goto L_0x0120
            X.QzM r11 = (X.QzM) r11
            X.1UV r0 = r11.A00
            X.Szz r1 = X.C9734Rfs.A00(r0, r1)
            X.3xW r0 = r11.A01
            X.Qzf r10 = new X.Qzf
            r10.<init>(r1, r0)
        L_0x00f0:
            java.util.Collection r0 = r10.ASn()
            X.0qQ.A07(r0)
            java.util.Iterator r11 = r0.iterator()
        L_0x00fb:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x015a
            java.util.Map$Entry r10 = X.AnonymousClass7TE.A1J(r11)
            java.lang.Object r1 = r10.getValue()
            boolean r0 = r1 instanceof X.C7464QEt
            if (r0 == 0) goto L_0x0114
            X.QEt r1 = (X.C7464QEt) r1
            if (r1 == 0) goto L_0x0114
            r1.A00()
        L_0x0114:
            java.lang.Object r1 = r10.getKey()
            java.lang.Object r0 = r10.getValue()
            r2.remove(r1, r0)
            goto L_0x00fb
        L_0x0120:
            r11.getClass()
            X.Qzf r10 = new X.Qzf
            r10.<init>(r1, r11)
            goto L_0x00f0
        L_0x0129:
            boolean r0 = r11 instanceof X.C13958TmL
            if (r0 == 0) goto L_0x013f
            X.TmL r11 = (X.C13958TmL) r11
            X.QzM r11 = (X.QzM) r11
            X.1UV r0 = r11.A00
            X.Szz r1 = X.C9734Rfs.A00(r0, r1)
            X.3xW r0 = r11.A01
            X.QzM r10 = new X.QzM
            r10.<init>(r1, r0)
            goto L_0x00f0
        L_0x013f:
            r11.getClass()
            X.3xW r11 = (X.C257513xW) r11
            X.QzM r10 = new X.QzM
            r10.<init>(r1, r11)
            goto L_0x00f0
        L_0x014a:
            com.google.common.collect.ImmutableListMultimap r11 = com.google.common.collect.ImmutableListMultimap.A01(r2)
            goto L_0x00d2
        L_0x014f:
            java.lang.String r9 = "viewBinders"
        L_0x0152:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x015a:
            r2.E5Q(r9)
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L_0x019e
            boolean r0 = r8.isEmpty()
            r2 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x018f
            java.lang.Object r0 = r8.get(r5)
            X.SUj r0 = (X.SUj) r0
            java.lang.Object r0 = r0.A01
            boolean r0 = r0 instanceof com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem
            if (r0 == 0) goto L_0x018f
            java.lang.Object r0 = r8.get(r5)
            X.SUj r0 = (X.SUj) r0
            java.lang.Object r1 = r0.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem"
            X.0qQ.A0C(r1, r0)
            com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem r1 = (com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem) r1
            java.lang.Integer r1 = r1.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x018f
            r2 = 0
        L_0x018f:
            android.view.View r1 = r7.getChildAt(r5)
            if (r2 == 0) goto L_0x01a4
            r0 = 16
            X.SbJ r0 = X.C11496SbJ.A00(r3, r0)
            r1.setOnClickListener(r0)
        L_0x019e:
            boolean r0 = r4.A03
            r3.setExpansionState(r0)
        L_0x01a3:
            return
        L_0x01a4:
            r1.setOnClickListener(r6)
            goto L_0x019e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8012Qez.A07(X.Qf1, X.SUj):void");
    }

    public final C8014Qf1 A0B(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        C11353SOm A012 = AnonymousClass2E0.A01();
        Context A0S = AnonymousClass7TE.A0S(viewGroup);
        RH6 rh6 = this.A02;
        View A022 = A012.A02(A0S, viewGroup, rh6);
        0qQ.A0C(A022, "null cannot be cast to non-null type com.facebookpay.widget.accordion.AccordionView");
        AccordionView accordionView = (AccordionView) A022;
        Map map = this.A01;
        boolean z = this.A03;
        0sL r2 = this.A02;
        C10255RpF rpF = this.A00;
        0qQ.A0B(rh6, 0);
        AnonymousClass7TG.A0w(1, map, r2, rpF);
        accordionView.A04 = rh6;
        accordionView.A07 = map;
        accordionView.A09 = z;
        accordionView.A08 = r2;
        accordionView.A06 = rpF;
        return new C8014Qf1(this, accordionView);
    }
}
