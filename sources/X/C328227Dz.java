package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.HashSet;

/* renamed from: X.7Dz  reason: invalid class name and case insensitive filesystem */
public final class C328227Dz implements C328007Db {
    public MessageIdentifier A00;
    public boolean A01;
    public AnonymousClass7A9 A02;
    public HashSet A03 = new HashSet();
    public final View A04;
    public final RecyclerView A05;
    public final AnonymousClass2t9 A06;
    public final IgLinearLayout A07;
    public final IgTextView A08;
    public final C332807Wl A09;
    public final AnonymousClass9HC A0A;

    public C328227Dz(View view, AnonymousClass0iw r5, AnonymousClass7D5 r6, C332807Wl r7, AnonymousClass9HC r8) {
        0qQ.A0B(view, 1);
        0qQ.A0B(r6, 5);
        this.A04 = view;
        this.A0A = r8;
        this.A09 = r7;
        View requireViewById = view.requireViewById(R.id.pills_view_container);
        0qQ.A07(requireViewById);
        this.A07 = (IgLinearLayout) requireViewById;
        IgTextView requireViewById2 = view.requireViewById(R.id.message_pills_hidden_reaction_nux);
        0qQ.A07(requireViewById2);
        this.A08 = requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.message_multiple_reaction_pills_recycler_view);
        0qQ.A07(requireViewById3);
        this.A05 = (RecyclerView) requireViewById3;
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(view.getContext());
        A002.A01(new AnonymousClass7E0(r5, r6, r7, r8));
        A002.A01(new AnonymousClass7E1(r6, r7));
        A002.A01(new AnonymousClass7E2(r6, r7));
        A002.A01(new AnonymousClass7E3(r6, r7));
        A002.A01(new AnonymousClass7E4(r7));
        AnonymousClass2t9 A003 = A002.A00();
        A003.setHasStableIds(true);
        this.A06 = A003;
    }

    public final void A00() {
        this.A03.clear();
        this.A01 = false;
        this.A02 = null;
        this.A00 = null;
        this.A05.setVisibility(8);
        this.A08.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009f, code lost:
        if (r0.contains(r6) != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
        if (r0.contains(r6) != true) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass7A9 r11) {
        /*
            r10 = this;
            X.7A9 r0 = r10.A02
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0113
            boolean r0 = r11.A08
            if (r0 != 0) goto L_0x0113
            java.lang.Integer r4 = r11.A05
            boolean r0 = r10.A01
            if (r0 != 0) goto L_0x005a
            com.instagram.common.ui.base.IgLinearLayout r2 = r10.A07
            r3 = 0
            X.0qQ.A0B(r2, r3)
            if (r4 == 0) goto L_0x002e
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            if (r1 == 0) goto L_0x010b
            android.view.ViewParent r0 = r2.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r0 == 0) goto L_0x00cd
            r0 = 0
        L_0x0029:
            r1.width = r0
            r2.setLayoutParams(r1)
        L_0x002e:
            androidx.recyclerview.widget.RecyclerView r2 = r10.A05
            r0 = 0
            r2.setItemAnimator(r0)
            android.view.View r0 = r10.A04
            android.content.Context r1 = r0.getContext()
            com.google.android.flexbox.FlexboxLayoutManager r0 = new com.google.android.flexbox.FlexboxLayoutManager
            r0.<init>(r1)
            r2.setLayoutManager(r0)
            X.2t9 r0 = r10.A06
            r2.setAdapter(r0)
            r2.setVisibility(r3)
            r2.setNestedScrollingEnabled(r3)
            com.instagram.common.ui.base.IgTextView r1 = r10.A08
            X.AMs r0 = new X.AMs
            r0.<init>(r10)
            X.AnonymousClass0fU.A00(r0, r1)
            r0 = 1
            r10.A01 = r0
        L_0x005a:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            com.instagram.model.direct.messageid.MessageIdentifier r1 = r10.A00
            r8 = 1
            if (r1 == 0) goto L_0x00cb
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r11.A04
            boolean r0 = r1.equals(r0)
            if (r0 != r8) goto L_0x00cb
        L_0x006c:
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r11.A04
            r10.A00 = r0
            com.instagram.common.recyclerview.ViewModelListUpdate r3 = new com.instagram.common.recyclerview.ViewModelListUpdate
            r3.<init>()
            X.7E9 r0 = r11.A02
            if (r0 == 0) goto L_0x007c
            r3.A00(r0)
        L_0x007c:
            java.util.List r0 = r11.A07
            java.util.Iterator r9 = r0.iterator()
        L_0x0082:
            boolean r0 = r9.hasNext()
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r7 = r9.next()
            X.7E5 r7 = (X.AnonymousClass7E5) r7
            java.lang.String r6 = r7.A0B
            X.7A9 r0 = r10.A02
            if (r0 == 0) goto L_0x00a1
            java.util.HashSet r0 = r0.A06
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r0.contains(r6)
            r2 = 1
            if (r0 == 0) goto L_0x00a2
        L_0x00a1:
            r2 = 0
        L_0x00a2:
            X.7A9 r0 = r10.A02
            if (r0 == 0) goto L_0x00b1
            java.util.HashSet r0 = r0.A06
            if (r0 == 0) goto L_0x00b1
            boolean r0 = r0.contains(r6)
            r1 = 1
            if (r0 == r5) goto L_0x00b2
        L_0x00b1:
            r1 = 0
        L_0x00b2:
            java.util.HashSet r0 = r10.A03
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x00c9
            if (r1 == 0) goto L_0x00c9
        L_0x00bc:
            if (r2 != 0) goto L_0x00c0
            if (r5 == 0) goto L_0x00c2
        L_0x00c0:
            r7.A00 = r8
        L_0x00c2:
            r4.add(r6)
            r3.A00(r7)
            goto L_0x0082
        L_0x00c9:
            r5 = 0
            goto L_0x00bc
        L_0x00cb:
            r8 = 0
            goto L_0x006c
        L_0x00cd:
            int r0 = r4.intValue()
            goto L_0x0029
        L_0x00d3:
            X.7E7 r0 = r11.A03
            if (r0 == 0) goto L_0x00da
            r3.A00(r0)
        L_0x00da:
            X.7E6 r0 = r11.A01
            if (r0 == 0) goto L_0x00e1
            r3.A00(r0)
        L_0x00e1:
            X.7E8 r0 = r11.A00
            if (r0 == 0) goto L_0x00e8
            r3.A00(r0)
        L_0x00e8:
            com.instagram.common.ui.base.IgTextView r2 = r10.A08
            boolean r0 = r11.A09
            if (r0 == 0) goto L_0x0108
            X.7Wl r1 = r10.A09
            if (r1 == 0) goto L_0x0108
            boolean r0 = r1.AFs()
            if (r0 != r5) goto L_0x0108
            r1.DJ4()
        L_0x00fb:
            r2.setVisibility(r6)
            X.2t9 r0 = r10.A06
            r0.A05(r3)
            r10.A02 = r11
            r10.A03 = r4
            return
        L_0x0108:
            r6 = 8
            goto L_0x00fb
        L_0x010b:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C328227Dz.A01(X.7A9):void");
    }

    public final View BJd() {
        return this.A04;
    }
}
