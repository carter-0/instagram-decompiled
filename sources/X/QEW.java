package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebookpay.expresscheckout.logging.ComponentLoggingData;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.listcell.ListCell;
import java.util.Arrays;
import java.util.Locale;

public abstract class QEW extends C252303ot {
    public View.OnClickListener A00 = C11492SbF.A00;
    public boolean A01;
    public final RH6 A02;
    public final LoggingContext A03;

    public static View A01(ViewGroup viewGroup, QEW qew) {
        0qQ.A0B(viewGroup, 0);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        C11353SOm A012 = AnonymousClass2E0.A01();
        Context context = viewGroup.getContext();
        0qQ.A07(context);
        return A012.A02(context, viewGroup, qew.A02);
    }

    public static String A03(Context context, Locale locale, int i) {
        String string = context.getString(i);
        0qQ.A07(string);
        String format = String.format(locale, string, Arrays.copyOf(new Object[0], 0));
        0qQ.A07(format);
        return format;
    }

    public static void A06(ListCell listCell) {
        listCell.setPrimaryText(listCell.getContext().getString(2131961232));
        listCell.setPrimaryTextStyle(RH2.A0Y);
        listCell.setOnClickListener((View.OnClickListener) null);
    }

    public static String A04(QEW qew, ListCell listCell) {
        listCell.A0N = qew.A03;
        ComponentLoggingData componentLoggingData = listCell.A0M;
        if (componentLoggingData != null) {
            return componentLoggingData.A00;
        }
        return "checkout_screen";
    }

    public static 0eP A05(QEW qew) {
        return new 0eP(qew.A02, qew);
    }

    /* JADX WARNING: type inference failed for: r10v6, types: [X.3kE] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C249703kE A09(android.view.ViewGroup r14) {
        /*
            r13 = this;
            boolean r0 = r13 instanceof X.C8007Qeu
            if (r0 == 0) goto L_0x0021
            r2 = r13
            X.Qeu r2 = (X.C8007Qeu) r2
            X.DbS.A1W(r14)
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r14)
            androidx.fragment.app.FragmentContainerView r1 = new androidx.fragment.app.FragmentContainerView
            r1.<init>(r0)
            int r0 = r2.A00
            r1.setId(r0)
            X.JTS.A0x(r1)
            X.QFA r7 = new X.QFA
            r7.<init>(r1, r2)
            return r7
        L_0x0021:
            boolean r0 = r13 instanceof X.C8013Qf0
            if (r0 == 0) goto L_0x006c
            r9 = r13
            X.Qf0 r9 = (X.C8013Qf0) r9
            android.content.Context r2 = X.Pxj.A0E(r14)
            X.Q9K r12 = new X.Q9K
            r12.<init>(r2)
            android.view.View r8 = A00(r2, r14)
            com.facebookpay.widget.actionmenu.InlineActionMenu r8 = (com.facebookpay.widget.actionmenu.InlineActionMenu) r8
            X.SOm r1 = X.AnonymousClass2E0.A01()
            X.RH6 r0 = X.RH6.A07
            android.view.View r11 = r1.A02(r2, r14, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.widget.listcell.ListCell"
            X.0qQ.A0C(r11, r0)
            com.facebookpay.widget.listcell.ListCell r11 = (com.facebookpay.widget.listcell.ListCell) r11
            X.RFp r0 = X.RFp.ACCORDION_CELL
            r11.setBackgroundStyle(r0)
            r11.setLeftAddOnView(r12)
            boolean r0 = r9.A09
            r10 = 0
            if (r0 == 0) goto L_0x0066
            X.Qeu r0 = r9.A03
            if (r0 == 0) goto L_0x005e
            X.3kE r10 = r0.A09(r14)
        L_0x005e:
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.ecp.InlineFormViewBinder.InlineFormViewHolder"
            X.0qQ.A0C(r10, r0)
            X.QFA r10 = (X.QFA) r10
        L_0x0066:
            X.Qf5 r7 = new X.Qf5
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
        L_0x006c:
            boolean r0 = r13 instanceof X.C7978QeR
            if (r0 == 0) goto L_0x008e
            r2 = r13
            X.QeR r2 = (X.C7978QeR) r2
            android.view.View r1 = A01(r14, r2)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.widget.listcell.ListCell"
            X.0qQ.A0C(r1, r0)
            com.facebookpay.widget.listcell.ListCell r1 = (com.facebookpay.widget.listcell.ListCell) r1
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0088
            X.RFp r0 = X.RFp.ACCORDION_HEADER_CELL
            r1.setBackgroundStyle(r0)
        L_0x0088:
            X.QF9 r7 = new X.QF9
            r7.<init>(r2, r1)
            return r7
        L_0x008e:
            boolean r0 = r13 instanceof X.C7998Qel
            if (r0 == 0) goto L_0x00b1
            r3 = r13
            X.Qel r3 = (X.C7998Qel) r3
            X.SOm r2 = X.Pxi.A0I(r14)
            android.view.ContextThemeWrapper r1 = r3.A00
            X.RH6 r0 = r3.A02
            android.view.View r1 = r2.A02(r1, r14, r0)
            r0 = 5
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            X.QFL r7 = new X.QFL
            r7.<init>(r1, r3)
            return r7
        L_0x00b1:
            boolean r0 = r13 instanceof X.C7977QeQ
            if (r0 == 0) goto L_0x00d3
            r2 = r13
            X.QeQ r2 = (X.C7977QeQ) r2
            android.view.View r1 = A01(r14, r2)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.widget.listcell.ListCell"
            X.0qQ.A0C(r1, r0)
            com.facebookpay.widget.listcell.ListCell r1 = (com.facebookpay.widget.listcell.ListCell) r1
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x00cd
            X.RFp r0 = X.RFp.ACCORDION_HEADER_CELL
            r1.setBackgroundStyle(r0)
        L_0x00cd:
            X.QF8 r7 = new X.QF8
            r7.<init>(r2, r1)
            return r7
        L_0x00d3:
            boolean r0 = r13 instanceof X.C7997Qek
            if (r0 == 0) goto L_0x010a
            r4 = r13
            X.Qek r4 = (X.C7997Qek) r4
            r3 = 0
            android.view.View r2 = A01(r14, r4)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.widget.listcell.ListCell"
            X.0qQ.A0C(r2, r0)
            com.facebookpay.widget.listcell.ListCell r2 = (com.facebookpay.widget.listcell.ListCell) r2
            boolean r1 = r4.A01
            if (r1 == 0) goto L_0x0107
            X.RFq r0 = X.C8922RFq.A0N
        L_0x00ed:
            r2.setTextStyle(r0)
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x00f7
            r2.A0B(r3, r1)
        L_0x00f7:
            if (r1 == 0) goto L_0x0101
            X.RFp r0 = X.RFp.ACCORDION_CELL
            r2.setBackgroundStyle(r0)
            r2.A03()
        L_0x0101:
            X.QF7 r7 = new X.QF7
            r7.<init>(r4, r2)
            return r7
        L_0x0107:
            X.RFq r0 = X.C8922RFq.A07
            goto L_0x00ed
        L_0x010a:
            boolean r0 = r13 instanceof X.C7996Qej
            if (r0 == 0) goto L_0x0173
            r5 = r13
            X.Qej r5 = (X.C7996Qej) r5
            r0 = 0
            X.0qQ.A0B(r14, r0)
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.SOm r2 = X.AnonymousClass2E0.A01()
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r14)
            X.RH6 r0 = X.RH6.A0l
            com.facebookpay.widget.listcell.ListCell r6 = A02(r1, r14, r0, r2)
            X.Q9Q r3 = new X.Q9Q
            r3.<init>(r1)
            java.util.Locale r2 = java.util.Locale.getDefault()
            android.content.Context r1 = r3.getContext()
            r0 = 2131961257(0x7f1325a9, float:1.9559206E38)
            java.lang.String r0 = A03(r1, r2, r0)
            r3.setText(r0)
            boolean r1 = r5.A01
            if (r1 == 0) goto L_0x0145
            X.RH2 r0 = X.RH2.A14
            r3.setTextStyle(r0)
        L_0x0145:
            r6.setLeftAddOnText(r3)
            if (r1 == 0) goto L_0x014f
            X.RFp r0 = X.RFp.ACCORDION_PUX_CELL
            r6.setBackgroundStyle(r0)
        L_0x014f:
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0168
            r0 = 1
            r5.A00 = r0
            com.facebookpay.logging.LoggingContext r4 = r5.A03
            if (r4 == 0) goto L_0x016e
            r3 = 0
            java.lang.String r2 = "checkout_screen"
            java.lang.String r1 = "shipping_address"
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r0 = new com.facebookpay.expresscheckout.logging.ComponentLoggingData
            r0.<init>(r3, r2, r1)
            r6.A07(r0, r4)
        L_0x0168:
            X.QF6 r7 = new X.QF6
            r7.<init>(r5, r6)
            return r7
        L_0x016e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0173:
            boolean r0 = r13 instanceof X.C7976QeP
            if (r0 == 0) goto L_0x01a1
            r3 = r13
            X.QeP r3 = (X.C7976QeP) r3
            X.SOm r2 = X.Pxi.A0I(r14)
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r14)
            X.RH6 r0 = X.RH6.A0g
            com.facebookpay.widget.listcell.ListCell r2 = A02(r1, r14, r0, r2)
            X.RFq r0 = X.C8922RFq.A0J
            r2.setTextStyle(r0)
            X.RFp r0 = X.RFp.ACCORDION_PUX_CELL
            r2.setBackgroundStyle(r0)
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r2)
            X.Q9a r0 = new X.Q9a
            r0.<init>(r1)
            X.Qf4 r7 = new X.Qf4
            r7.<init>(r3, r2, r0)
            return r7
        L_0x01a1:
            boolean r0 = r13 instanceof X.C7980QeT
            if (r0 == 0) goto L_0x0240
            r5 = r13
            X.QeT r5 = (X.C7980QeT) r5
            X.DbS.A1W(r14)
            X.SOm r1 = X.AnonymousClass2E0.A01()
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r14)
            X.RH6 r0 = r5.A02
            android.view.View r6 = r1.A02(r3, r14, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.widget.listcell.EntityListCell"
            X.0qQ.A0C(r6, r0)
            com.facebookpay.widget.listcell.EntityListCell r6 = (com.facebookpay.widget.listcell.EntityListCell) r6
            X.Q9S r2 = new X.Q9S
            r2.<init>(r3)
            X.AnonymousClass2E0.A0A()
            r1 = 2132017579(0x7f1401ab, float:1.967344E38)
            int[] r0 = X.C71382cm.A0e
            android.content.res.TypedArray r1 = r3.obtainStyledAttributes(r1, r0)
            X.0qQ.A07(r1)
            r7 = 4
            r0 = 2132017576(0x7f1401a8, float:1.9673434E38)
            int r0 = r1.getResourceId(r7, r0)
            r2.setImageViewStyle(r0)
            r0 = 2131237262(0x7f08198e, float:1.809077E38)
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r2.setImageViewBackground(r0)
            r1.recycle()
            r6.setLeftAddOnIcon(r2)
            X.Q9R r0 = new X.Q9R
            r0.<init>(r3)
            r6.setRightAddOnText(r0)
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0210
            r0 = 1
            r5.A00 = r0
            com.facebookpay.logging.LoggingContext r4 = r5.A03
            if (r4 == 0) goto L_0x023b
            r3 = 0
            java.lang.String r2 = "checkout_screen"
            java.lang.String r1 = "entity"
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r0 = new com.facebookpay.expresscheckout.logging.ComponentLoggingData
            r0.<init>(r3, r2, r1)
            r6.A07(r0, r4)
        L_0x0210:
            r2 = 2131440006(0x7f0b3186, float:1.8501983E38)
            android.view.View r1 = r6.A01
            if (r1 != 0) goto L_0x0221
            java.lang.String r0 = "containerView"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0221:
            boolean r0 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r0 == 0) goto L_0x0235
            X.4gb r0 = new X.4gb
            r0.<init>()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r0.A0I(r1)
            r0.A09(r2, r7)
            r0.A0G(r1)
        L_0x0235:
            X.Qf3 r7 = new X.Qf3
            r7.<init>(r5, r6)
            return r7
        L_0x023b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0240:
            boolean r0 = r13 instanceof X.C7995Qei
            if (r0 == 0) goto L_0x02ba
            r5 = r13
            X.Qei r5 = (X.C7995Qei) r5
            r0 = 0
            X.0qQ.A0B(r14, r0)
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.SOm r2 = X.AnonymousClass2E0.A01()
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r14)
            X.RH6 r0 = X.RH6.A0c
            com.facebookpay.widget.listcell.ListCell r6 = A02(r1, r14, r0, r2)
            X.Q9Q r4 = new X.Q9Q
            r4.<init>(r1)
            java.util.Locale r3 = java.util.Locale.getDefault()
            android.content.Context r2 = r4.getContext()
            boolean r1 = r5.A01
            r0 = 2131961235(0x7f132593, float:1.9559161E38)
            if (r1 == 0) goto L_0x0272
            r0 = 2131961227(0x7f13258b, float:1.9559145E38)
        L_0x0272:
            java.lang.String r0 = A03(r2, r3, r0)
            r4.setText(r0)
            boolean r1 = r5.A01
            if (r1 == 0) goto L_0x0282
            X.RH2 r0 = X.RH2.A14
            r4.setTextStyle(r0)
        L_0x0282:
            r6.setLeftAddOnText(r4)
            if (r1 == 0) goto L_0x02af
            X.RFq r0 = X.C8922RFq.A0I
            r6.setTextStyle(r0)
            X.RFp r0 = X.RFp.ACCORDION_PUX_CELL
            r6.setBackgroundStyle(r0)
        L_0x0291:
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x02a9
            r0 = 1
            r5.A00 = r0
            com.facebookpay.logging.LoggingContext r4 = r5.A03
            if (r4 == 0) goto L_0x02b5
            r3 = 0
            java.lang.String r2 = "checkout_screen"
            java.lang.String r1 = "contact_info"
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r0 = new com.facebookpay.expresscheckout.logging.ComponentLoggingData
            r0.<init>(r3, r2, r1)
            r6.A07(r0, r4)
        L_0x02a9:
            X.QF5 r7 = new X.QF5
            r7.<init>(r5, r6)
            return r7
        L_0x02af:
            X.RFq r0 = X.C8922RFq.A0B
            r6.setTextStyle(r0)
            goto L_0x0291
        L_0x02b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02ba:
            boolean r0 = r13 instanceof X.C8011Qey
            if (r0 == 0) goto L_0x02e2
            r3 = r13
            X.Qey r3 = (X.C8011Qey) r3
            X.DbS.A1W(r14)
            X.SOm r2 = X.AnonymousClass2E0.A01()
            android.view.ContextThemeWrapper r1 = r3.A00
            X.RH6 r0 = X.RH6.A0T
            android.view.View r1 = r2.A02(r1, r14, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.widget.paybutton.FBPayAnimationButton"
            X.0qQ.A0C(r1, r0)
            com.facebookpay.widget.paybutton.FBPayAnimationButton r1 = (com.facebookpay.widget.paybutton.FBPayAnimationButton) r1
            X.0sa r0 = r3.A01
            r1.A07 = r0
            X.QF4 r7 = new X.QF4
            r7.<init>(r3, r1)
            return r7
        L_0x02e2:
            boolean r0 = r13 instanceof X.C8004Qer
            if (r0 == 0) goto L_0x0313
            r3 = r13
            X.Qer r3 = (X.C8004Qer) r3
            X.DbS.A1W(r14)
            X.SOm r2 = X.AnonymousClass2E0.A01()
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r14)
            X.RH6 r0 = X.RH6.A0m
            android.view.View r1 = r2.A02(r1, r14, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.widget.disclaimer.DisclaimerLayout"
            X.0qQ.A0C(r1, r0)
            com.facebookpay.widget.disclaimer.DisclaimerLayout r1 = (com.facebookpay.widget.disclaimer.DisclaimerLayout) r1
            X.RDl r0 = X.C8869RDl.DISCLAIMER_PUX
            r1.setDisclaimerType(r0)
            r0 = 2131432697(0x7f0b14f9, float:1.8487159E38)
            r1.setAccessibilityTraversalBefore(r0)
            X.QF3 r7 = new X.QF3
            r7.<init>(r3, r1)
            return r7
        L_0x0313:
            boolean r0 = r13 instanceof X.C7981QeU
            if (r0 == 0) goto L_0x033a
            r3 = r13
            X.QeU r3 = (X.C7981QeU) r3
            r2 = 0
            android.view.View r1 = A01(r14, r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.widget.pricetable.PriceTable"
            X.0qQ.A0C(r1, r0)
            com.facebookpay.widget.pricetable.PriceTable r1 = (com.facebookpay.widget.pricetable.PriceTable) r1
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0334
            r1.A01 = r2
            r0 = 1
            r1.A00 = r0
            r0 = 4
            X.C11409SSh.A01(r1, r0)
        L_0x0334:
            X.QF2 r7 = new X.QF2
            r7.<init>(r3, r1)
            return r7
        L_0x033a:
            boolean r0 = r13 instanceof X.C7999Qem
            if (r0 == 0) goto L_0x03a2
            r5 = r13
            X.Qem r5 = (X.C7999Qem) r5
            android.view.View r6 = A01(r14, r5)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.widget.listcell.ListCell"
            X.0qQ.A0C(r6, r0)
            com.facebookpay.widget.listcell.ListCell r6 = (com.facebookpay.widget.listcell.ListCell) r6
            X.RFq r0 = X.C8922RFq.A08
            r6.setTextStyle(r0)
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r6)
            X.Q9Q r3 = new X.Q9Q
            r3.<init>(r0)
            java.util.Locale r2 = java.util.Locale.getDefault()
            android.content.Context r1 = r3.getContext()
            r0 = 2131961226(0x7f13258a, float:1.9559143E38)
            java.lang.String r0 = A03(r1, r2, r0)
            r3.setText(r0)
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x037b
            X.RH2 r0 = X.RH2.A14
            r3.setTextStyle(r0)
            X.RFp r0 = X.RFp.ACCORDION_PUX_CELL
            r6.setBackgroundStyle(r0)
        L_0x037b:
            r6.setLeftAddOnText(r3)
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0397
            r0 = 1
            r5.A00 = r0
            com.facebookpay.logging.LoggingContext r4 = r5.A03
            if (r4 == 0) goto L_0x039d
            r3 = 0
            java.lang.String r2 = "checkout_screen"
            java.lang.String r1 = "payment_method"
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r0 = new com.facebookpay.expresscheckout.logging.ComponentLoggingData
            r0.<init>(r3, r2, r1)
            r6.A07(r0, r4)
        L_0x0397:
            X.Qf2 r7 = new X.Qf2
            r7.<init>(r5, r6)
            return r7
        L_0x039d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x03a2:
            boolean r0 = r13 instanceof X.C7979QeS
            if (r0 == 0) goto L_0x03fd
            r5 = r13
            X.QeS r5 = (X.C7979QeS) r5
            X.DbS.A1W(r14)
            X.SOm r2 = X.AnonymousClass2E0.A01()
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r14)
            X.RH6 r0 = X.RH6.A0e
            com.facebookpay.widget.listcell.ListCell r6 = A02(r1, r14, r0, r2)
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x03f2
            X.RFq r0 = X.C8922RFq.A0I
            r6.setTextStyle(r0)
            X.RFp r0 = X.RFp.ACCORDION_PUX_CELL
            r6.setBackgroundStyle(r0)
        L_0x03c8:
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x03e1
            r0 = 1
            r5.A00 = r0
            com.facebookpay.logging.LoggingContext r4 = r5.A03
            if (r4 == 0) goto L_0x03f8
            r3 = 0
            java.lang.String r2 = "checkout_screen"
            java.lang.String r1 = "shipping_option"
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r0 = new com.facebookpay.expresscheckout.logging.ComponentLoggingData
            r0.<init>(r3, r2, r1)
            r6.A07(r0, r4)
        L_0x03e1:
            android.view.View$OnClickListener r0 = r5.A00
            X.AnonymousClass0fU.A00(r0, r6)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 0
            X.C18674VwX.A01(r6, r1, r0)
            X.QF1 r7 = new X.QF1
            r7.<init>(r5, r6)
            return r7
        L_0x03f2:
            X.RFq r0 = X.C8922RFq.A0B
            r6.setTextStyle(r0)
            goto L_0x03c8
        L_0x03f8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x03fd:
            boolean r0 = r13 instanceof X.C7975QeO
            if (r0 == 0) goto L_0x0423
            r3 = r13
            X.QeO r3 = (X.C7975QeO) r3
            X.DbS.A1W(r14)
            X.SOm r2 = X.AnonymousClass2E0.A01()
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r14)
            X.RH6 r0 = X.RH6.A0b
            android.view.View r1 = r2.A02(r1, r14, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.widget.banner.FBPayBanner"
            X.0qQ.A0C(r1, r0)
            com.facebookpay.widget.banner.FBPayBanner r1 = (com.facebookpay.widget.banner.FBPayBanner) r1
            X.QF0 r7 = new X.QF0
            r7.<init>(r3, r1)
            return r7
        L_0x0423:
            boolean r0 = r13 instanceof X.C7991Qee
            if (r0 == 0) goto L_0x044d
            r4 = r13
            X.Qee r4 = (X.C7991Qee) r4
            android.content.Context r3 = X.Pxj.A0E(r14)
            X.Q9O r2 = new X.Q9O
            r2.<init>(r3)
            X.RH3 r0 = X.RH3.A0J
            r2.setIcon(r0)
            X.SOm r1 = X.AnonymousClass2E0.A01()
            X.RH6 r0 = X.RH6.A0q
            com.facebookpay.widget.listcell.ListCell r1 = A02(r3, r14, r0, r1)
            X.RFq r0 = X.C8922RFq.A0C
            r1.setTextStyle(r0)
            X.QFK r7 = new X.QFK
            r7.<init>(r4, r1, r2)
            return r7
        L_0x044d:
            boolean r0 = r13 instanceof X.C7994Qeh
            if (r0 == 0) goto L_0x048a
            r6 = r13
            X.Qeh r6 = (X.C7994Qeh) r6
            r5 = 0
            X.0qQ.A0B(r14, r5)
            android.content.Context r4 = X.AnonymousClass7TE.A0S(r14)
            X.Q9K r3 = new X.Q9K
            r3.<init>(r4)
            X.Q9O r2 = new X.Q9O
            r2.<init>(r4)
            X.RH3 r0 = X.RH3.A0J
            r2.setIcon(r0)
            X.SOm r1 = X.AnonymousClass2E0.A01()
            X.RH6 r0 = X.RH6.A0l
            com.facebookpay.widget.listcell.ListCell r1 = A02(r4, r14, r0, r1)
            X.RFq r0 = X.C8922RFq.A0G
            r1.setTextStyle(r0)
            r1.setRightAddOnView(r3)
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x0484
            r1.A0B(r5, r5)
        L_0x0484:
            X.QFU r7 = new X.QFU
            r7.<init>(r6, r1, r2, r3)
            return r7
        L_0x048a:
            boolean r0 = r13 instanceof X.C7990Qed
            if (r0 == 0) goto L_0x04bc
            r5 = r13
            X.Qed r5 = (X.C7990Qed) r5
            android.content.Context r4 = X.Pxj.A0E(r14)
            X.Q9K r3 = new X.Q9K
            r3.<init>(r4)
            X.Q9O r2 = new X.Q9O
            r2.<init>(r4)
            X.RH3 r0 = X.RH3.A0J
            r2.setIcon(r0)
            X.SOm r1 = X.AnonymousClass2E0.A01()
            X.RH6 r0 = X.RH6.A0s
            com.facebookpay.widget.listcell.ListCell r1 = A02(r4, r14, r0, r1)
            X.RFq r0 = X.C8922RFq.A0C
            r1.setTextStyle(r0)
            r1.setRightAddOnView(r3)
            X.QFT r7 = new X.QFT
            r7.<init>(r5, r1, r2, r3)
            return r7
        L_0x04bc:
            boolean r0 = r13 instanceof X.C7989Qec
            if (r0 == 0) goto L_0x0519
            r9 = r13
            X.Qec r9 = (X.C7989Qec) r9
            android.content.Context r2 = X.Pxj.A0E(r14)
            X.Q9K r12 = new X.Q9K
            r12.<init>(r2)
            X.Q9O r11 = new X.Q9O
            r11.<init>(r2)
            X.RH3 r0 = X.RH3.A0J
            r11.setIcon(r0)
            X.SOm r1 = X.AnonymousClass2E0.A01()
            X.RH6 r0 = X.RH6.A0h
            android.view.View r10 = r1.A02(r2, r14, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.widget.listcell.ListCell"
            X.0qQ.A0C(r10, r0)
            com.facebookpay.widget.listcell.ListCell r10 = (com.facebookpay.widget.listcell.ListCell) r10
            com.facebook.shimmer.ShimmerFrameLayout r8 = new com.facebook.shimmer.ShimmerFrameLayout
            r8.<init>(r2)
            X.AnonymousClass2E0.A0A()
            r0 = 2131237263(0x7f08198f, float:1.8090772E38)
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r0)
            if (r1 == 0) goto L_0x0514
            X.AnonymousClass2E0.A0A()
            r0 = 2131100377(0x7f0602d9, float:1.7813134E38)
            X.Pxi.A0u(r2, r1, r8, r0)
            r0 = 0
            X.C54770HSc.A00(r8, r0)
            X.RFq r0 = X.C8922RFq.A0G
            r10.setTextStyle(r0)
            r10.setRightAddOnView(r12)
            X.QFV r7 = new X.QFV
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
        L_0x0514:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0519:
            boolean r0 = r13 instanceof X.C7988Qeb
            if (r0 == 0) goto L_0x0558
            r5 = r13
            X.Qeb r5 = (X.C7988Qeb) r5
            r1 = 0
            X.0qQ.A0B(r14, r1)
            X.AnonymousClass2E0.A0A()
            r0 = 2132017691(0x7f14021b, float:1.9673668E38)
            X.C11409SSh.A05(r14, r0, r1)
            android.content.Context r4 = X.AnonymousClass7TE.A0S(r14)
            X.Q9K r3 = new X.Q9K
            r3.<init>(r4)
            X.Q9O r2 = new X.Q9O
            r2.<init>(r4)
            X.RH3 r0 = X.RH3.A0J
            r2.setIcon(r0)
            X.SOm r1 = X.AnonymousClass2E0.A01()
            X.RH6 r0 = X.RH6.A0e
            com.facebookpay.widget.listcell.ListCell r1 = A02(r4, r14, r0, r1)
            X.RFq r0 = X.C8922RFq.A0O
            r1.setTextStyle(r0)
            r1.setRightAddOnView(r3)
            X.QFS r7 = new X.QFS
            r7.<init>(r5, r1, r2, r3)
            return r7
        L_0x0558:
            boolean r0 = r13 instanceof X.C7987Qea
            if (r0 == 0) goto L_0x058a
            r5 = r13
            X.Qea r5 = (X.C7987Qea) r5
            android.content.Context r4 = X.Pxj.A0E(r14)
            X.Q9K r3 = new X.Q9K
            r3.<init>(r4)
            X.Q9O r2 = new X.Q9O
            r2.<init>(r4)
            X.RH3 r0 = X.RH3.A0J
            r2.setIcon(r0)
            X.SOm r1 = X.AnonymousClass2E0.A01()
            X.RH6 r0 = X.RH6.A0o
            com.facebookpay.widget.listcell.ListCell r1 = A02(r4, r14, r0, r1)
            X.RFq r0 = X.C8922RFq.A0C
            r1.setTextStyle(r0)
            r1.setRightAddOnView(r3)
            X.QFR r7 = new X.QFR
            r7.<init>(r5, r1, r2, r3)
            return r7
        L_0x058a:
            boolean r0 = r13 instanceof X.C7974QeN
            if (r0 == 0) goto L_0x059b
            r1 = r13
            X.QeN r1 = (X.C7974QeN) r1
            android.view.View r0 = A01(r14, r1)
            X.QEv r7 = new X.QEv
            r7.<init>(r0, r1)
            return r7
        L_0x059b:
            boolean r0 = r13 instanceof X.C8002Qep
            if (r0 == 0) goto L_0x05be
            r3 = r13
            X.Qep r3 = (X.C8002Qep) r3
            X.SOm r2 = X.Pxi.A0I(r14)
            android.content.Context r1 = r3.A00
            X.RH6 r0 = r3.A02
            android.view.View r1 = r2.A02(r1, r14, r0)
            r0 = 1
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            X.QFQ r7 = new X.QFQ
            r7.<init>(r1, r3)
            return r7
        L_0x05be:
            boolean r0 = r13 instanceof X.C7986QeZ
            if (r0 == 0) goto L_0x05fd
            r4 = r13
            X.QeZ r4 = (X.C7986QeZ) r4
            X.DbS.A1W(r14)
            X.SOm r1 = X.AnonymousClass2E0.A01()
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r14)
            X.RH6 r0 = X.RH6.A0f
            com.facebookpay.widget.listcell.ListCell r2 = A02(r3, r14, r0, r1)
            boolean r1 = r4.A01
            if (r1 == 0) goto L_0x05fa
            X.RFq r0 = X.C8922RFq.A0N
        L_0x05dc:
            r2.setTextStyle(r0)
            if (r1 != 0) goto L_0x05e9
            X.Q9Q r0 = new X.Q9Q
            r0.<init>(r3)
            r2.setLeftAddOnText(r0)
        L_0x05e9:
            android.view.View$OnClickListener r0 = r4.A00
            X.AnonymousClass0fU.A00(r0, r2)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 0
            X.C18674VwX.A01(r2, r1, r0)
            X.QEz r7 = new X.QEz
            r7.<init>(r4, r2)
            return r7
        L_0x05fa:
            X.RFq r0 = X.C8922RFq.A07
            goto L_0x05dc
        L_0x05fd:
            boolean r0 = r13 instanceof X.C7985QeY
            if (r0 == 0) goto L_0x063a
            r5 = r13
            X.QeY r5 = (X.C7985QeY) r5
            android.content.Context r4 = X.Pxj.A0E(r14)
            X.Q9S r3 = new X.Q9S
            r3.<init>(r4)
            X.RH3 r0 = X.RH3.A0c
            r3.setIcon(r0)
            X.AnonymousClass2E0.A0A()
            r0 = 2132017693(0x7f14021d, float:1.9673672E38)
            r3.setImageViewStyle(r0)
            X.Q9O r2 = new X.Q9O
            r2.<init>(r4)
            X.RH3 r0 = X.RH3.A0V
            r2.setIcon(r0)
            X.SOm r1 = X.AnonymousClass2E0.A01()
            X.RH6 r0 = r5.A02
            com.facebookpay.widget.listcell.ListCell r1 = A02(r4, r14, r0, r1)
            X.RFp r0 = X.RFp.ACCORDION_PUX_CELL
            r1.setBackgroundStyle(r0)
            X.QFP r7 = new X.QFP
            r7.<init>(r5, r1, r3, r2)
            return r7
        L_0x063a:
            boolean r0 = r13 instanceof X.C8000Qen
            if (r0 == 0) goto L_0x065b
            r3 = r13
            X.Qen r3 = (X.C8000Qen) r3
            X.SOm r2 = X.Pxi.A0I(r14)
            android.view.ContextThemeWrapper r1 = r3.A02
            X.RH6 r0 = X.RH6.A0H
            android.view.View r1 = r2.A02(r1, r14, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout"
            X.0qQ.A0C(r1, r0)
            com.facebook.shimmer.ShimmerFrameLayout r1 = (com.facebook.shimmer.ShimmerFrameLayout) r1
            X.QFJ r7 = new X.QFJ
            r7.<init>(r1, r3)
            return r7
        L_0x065b:
            boolean r0 = r13 instanceof X.C7984QeX
            if (r0 == 0) goto L_0x066c
            r1 = r13
            X.QeX r1 = (X.C7984QeX) r1
            android.view.View r0 = A01(r14, r1)
            X.QFI r7 = new X.QFI
            r7.<init>(r0, r1)
            return r7
        L_0x066c:
            boolean r0 = r13 instanceof X.C7973QeM
            if (r0 == 0) goto L_0x067d
            r1 = r13
            X.QeM r1 = (X.C7973QeM) r1
            android.view.View r0 = A01(r14, r1)
            X.QFH r7 = new X.QFH
            r7.<init>(r0, r1)
            return r7
        L_0x067d:
            boolean r0 = r13 instanceof X.C7993Qeg
            if (r0 == 0) goto L_0x068e
            r1 = r13
            X.Qeg r1 = (X.C7993Qeg) r1
            android.view.View r0 = A01(r14, r1)
            X.QFW r7 = new X.QFW
            r7.<init>(r0, r1)
            return r7
        L_0x068e:
            boolean r0 = r13 instanceof X.C8001Qeo
            if (r0 == 0) goto L_0x06b1
            r3 = r13
            X.Qeo r3 = (X.C8001Qeo) r3
            X.SOm r2 = X.Pxi.A0I(r14)
            android.view.ContextThemeWrapper r1 = r3.A00
            X.RH6 r0 = r3.A02
            android.view.View r1 = r2.A02(r1, r14, r0)
            r0 = 1
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            X.QFG r7 = new X.QFG
            r7.<init>(r1, r3)
            return r7
        L_0x06b1:
            boolean r0 = r13 instanceof X.C7983QeW
            if (r0 == 0) goto L_0x06d7
            r3 = r13
            X.QeW r3 = (X.C7983QeW) r3
            X.DbS.A1W(r14)
            X.SOm r2 = X.AnonymousClass2E0.A01()
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r14)
            X.RH6 r0 = X.RH6.A0C
            android.view.View r1 = r2.A02(r1, r14, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.widget.button.FBPayButton"
            X.0qQ.A0C(r1, r0)
            com.facebookpay.widget.button.FBPayButton r1 = (com.facebookpay.widget.button.FBPayButton) r1
            X.QEy r7 = new X.QEy
            r7.<init>(r3, r1)
            return r7
        L_0x06d7:
            boolean r0 = r13 instanceof X.C8006Qet
            if (r0 == 0) goto L_0x06f8
            r3 = r13
            X.Qet r3 = (X.C8006Qet) r3
            X.SOm r2 = X.Pxi.A0I(r14)
            android.view.ContextThemeWrapper r1 = r3.A00
            X.RH6 r0 = X.RH6.A0A
            android.view.View r1 = r2.A02(r1, r14, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout"
            X.0qQ.A0C(r1, r0)
            com.facebook.shimmer.ShimmerFrameLayout r1 = (com.facebook.shimmer.ShimmerFrameLayout) r1
            X.QFF r7 = new X.QFF
            r7.<init>(r1, r3)
            return r7
        L_0x06f8:
            boolean r0 = r13 instanceof X.C8003Qeq
            if (r0 == 0) goto L_0x0742
            r5 = r13
            X.Qeq r5 = (X.C8003Qeq) r5
            r4 = 0
            X.0qQ.A0B(r14, r4)
            X.SOm r2 = X.AnonymousClass2E0.A01()
            android.view.ContextThemeWrapper r1 = r5.A00
            X.RH6 r0 = X.RH6.A09
            android.view.View r3 = r2.A02(r1, r14, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout"
            X.0qQ.A0C(r3, r0)
            com.facebook.shimmer.ShimmerFrameLayout r3 = (com.facebook.shimmer.ShimmerFrameLayout) r3
            X.0qQ.A0B(r3, r4)
            X.AnonymousClass2E0.A0A()
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r3)
            r0 = 2131237260(0x7f08198c, float:1.8090765E38)
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r0)
            if (r1 == 0) goto L_0x073d
            X.AnonymousClass2E0.A0A()
            r0 = 2131100377(0x7f0602d9, float:1.7813134E38)
            X.Pxi.A0u(r2, r1, r3, r0)
            r0 = 0
            X.C54770HSc.A00(r3, r0)
            X.QFE r7 = new X.QFE
            r7.<init>(r3, r5)
            return r7
        L_0x073d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0742:
            boolean r0 = r13 instanceof X.C8012Qez
            if (r0 == 0) goto L_0x074e
            r0 = r13
            X.Qez r0 = (X.C8012Qez) r0
            X.Qf1 r7 = r0.A0B(r14)
            return r7
        L_0x074e:
            boolean r0 = r13 instanceof X.C7982QeV
            if (r0 == 0) goto L_0x078b
            r5 = r13
            X.QeV r5 = (X.C7982QeV) r5
            android.content.Context r4 = X.Pxj.A0E(r14)
            X.Q9K r3 = new X.Q9K
            r3.<init>(r4)
            android.view.View r2 = A00(r4, r14)
            com.facebookpay.widget.actionmenu.InlineActionMenu r2 = (com.facebookpay.widget.actionmenu.InlineActionMenu) r2
            r2.A01()
            X.SOm r1 = X.AnonymousClass2E0.A01()
            X.RH6 r0 = X.RH6.A0q
            com.facebookpay.widget.listcell.ListCell r1 = A02(r4, r14, r0, r1)
            X.RFq r0 = X.C8922RFq.A0C
            r1.setTextStyle(r0)
            X.RFp r0 = X.RFp.ACCORDION_CELL
            r1.setBackgroundStyle(r0)
            r0 = 1
            r3.setChecked(r0)
            r1.setLeftAddOnView(r3)
            r1.A03()
            X.QFD r7 = new X.QFD
            r7.<init>(r5, r2, r1)
            return r7
        L_0x078b:
            boolean r0 = r13 instanceof X.C8010Qex
            if (r0 == 0) goto L_0x07ca
            r6 = r13
            X.Qex r6 = (X.C8010Qex) r6
            r5 = 0
            X.0qQ.A0B(r14, r5)
            android.content.Context r4 = X.AnonymousClass7TE.A0S(r14)
            X.Q9K r3 = new X.Q9K
            r3.<init>(r4)
            android.view.View r2 = A00(r4, r14)
            com.facebookpay.widget.actionmenu.InlineActionMenu r2 = (com.facebookpay.widget.actionmenu.InlineActionMenu) r2
            X.SOm r1 = X.AnonymousClass2E0.A01()
            X.RH6 r0 = X.RH6.A08
            com.facebookpay.widget.listcell.ListCell r1 = A02(r4, r14, r0, r1)
            X.RFq r0 = X.C8922RFq.A0G
            r1.setTextStyle(r0)
            X.RFp r0 = X.RFp.ACCORDION_CELL
            r1.setBackgroundStyle(r0)
            r1.setLeftAddOnView(r3)
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x07c4
            r0 = 1
            r1.A0B(r5, r0)
        L_0x07c4:
            X.QFO r7 = new X.QFO
            r7.<init>(r6, r2, r1, r3)
            return r7
        L_0x07ca:
            boolean r0 = r13 instanceof X.C8009Qew
            if (r0 == 0) goto L_0x0803
            r5 = r13
            X.Qew r5 = (X.C8009Qew) r5
            android.content.Context r4 = X.Pxj.A0E(r14)
            X.Q9K r3 = new X.Q9K
            r3.<init>(r4)
            android.view.View r2 = A00(r4, r14)
            com.facebookpay.widget.actionmenu.InlineActionMenu r2 = (com.facebookpay.widget.actionmenu.InlineActionMenu) r2
            X.SOm r1 = X.AnonymousClass2E0.A01()
            X.RH6 r0 = X.RH6.A0s
            com.facebookpay.widget.listcell.ListCell r1 = A02(r4, r14, r0, r1)
            X.RFq r0 = X.C8922RFq.A0C
            r1.setTextStyle(r0)
            X.RFp r0 = X.RFp.ACCORDION_CELL
            r1.setBackgroundStyle(r0)
            r1.setLeftAddOnView(r3)
            r1.setActionMenu(r2)
            r1.A03()
            X.QFN r7 = new X.QFN
            r7.<init>(r5, r2, r1, r3)
            return r7
        L_0x0803:
            boolean r0 = r13 instanceof X.C7992Qef
            if (r0 == 0) goto L_0x083d
            r4 = r13
            X.Qef r4 = (X.C7992Qef) r4
            r1 = 0
            X.0qQ.A0B(r14, r1)
            X.AnonymousClass2E0.A0A()
            r0 = 2132017691(0x7f14021b, float:1.9673668E38)
            X.C11409SSh.A05(r14, r0, r1)
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r14)
            X.Q9K r2 = new X.Q9K
            r2.<init>(r3)
            X.SOm r1 = X.AnonymousClass2E0.A01()
            X.RH6 r0 = X.RH6.A06
            com.facebookpay.widget.listcell.ListCell r1 = A02(r3, r14, r0, r1)
            X.RFq r0 = X.C8922RFq.A0O
            r1.setTextStyle(r0)
            X.RFp r0 = X.RFp.ACCORDION_CELL
            r1.setBackgroundStyle(r0)
            r1.setLeftAddOnView(r2)
            X.QFC r7 = new X.QFC
            r7.<init>(r4, r1, r2)
            return r7
        L_0x083d:
            boolean r0 = r13 instanceof X.C8008Qev
            if (r0 == 0) goto L_0x0876
            r5 = r13
            X.Qev r5 = (X.C8008Qev) r5
            android.content.Context r4 = X.Pxj.A0E(r14)
            X.Q9K r3 = new X.Q9K
            r3.<init>(r4)
            android.view.View r2 = A00(r4, r14)
            com.facebookpay.widget.actionmenu.InlineActionMenu r2 = (com.facebookpay.widget.actionmenu.InlineActionMenu) r2
            X.SOm r1 = X.AnonymousClass2E0.A01()
            X.RH6 r0 = X.RH6.A0o
            com.facebookpay.widget.listcell.ListCell r1 = A02(r4, r14, r0, r1)
            X.RFq r0 = X.C8922RFq.A0C
            r1.setTextStyle(r0)
            X.RFp r0 = X.RFp.ACCORDION_CELL
            r1.setBackgroundStyle(r0)
            r1.setLeftAddOnView(r3)
            r1.setActionMenu(r2)
            r1.A03()
            X.QFM r7 = new X.QFM
            r7.<init>(r5, r2, r1, r3)
            return r7
        L_0x0876:
            r0 = r13
            X.Qes r0 = (X.C8005Qes) r0
            X.SOm r2 = X.Pxi.A0I(r14)
            android.view.ContextThemeWrapper r1 = r0.A00
            X.RH6 r0 = r0.A02
            android.view.View r1 = r2.A02(r1, r14, r0)
            r0 = 5
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            X.QEx r7 = new X.QEx
            r7.<init>(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QEW.A09(android.view.ViewGroup):X.3kE");
    }

    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        Object obj3;
        SUj sUj = (SUj) obj;
        SUj sUj2 = (SUj) obj2;
        AnonymousClass7TG.A1N(sUj, sUj2);
        if (sUj.A00 != sUj2.A00 || (obj3 = sUj.A01) == null) {
            return false;
        }
        return Pxi.A1W(obj3, sUj2.A01);
    }

    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        SUj sUj = (SUj) obj;
        SUj sUj2 = (SUj) obj2;
        AnonymousClass7TG.A1N(sUj, sUj2);
        if (sUj.A00 != sUj2.A00 || !0qQ.A0K(sUj.A01, sUj2.A01)) {
            return false;
        }
        return true;
    }

    public QEW(RH6 rh6, LoggingContext loggingContext, boolean z) {
        this.A02 = rh6;
        this.A03 = loggingContext;
        this.A01 = z;
    }

    public static View A00(Context context, ViewGroup viewGroup) {
        View A022 = AnonymousClass2E0.A01().A02(context, viewGroup, RH6.A0K);
        0qQ.A0C(A022, "null cannot be cast to non-null type com.facebookpay.widget.actionmenu.InlineActionMenu");
        return A022;
    }

    public static ListCell A02(Context context, ViewGroup viewGroup, RH6 rh6, C11353SOm sOm) {
        View A022 = sOm.A02(context, viewGroup, rh6);
        0qQ.A0C(A022, "null cannot be cast to non-null type com.facebookpay.widget.listcell.ListCell");
        return (ListCell) A022;
    }

    /* JADX WARNING: type inference failed for: r8v12, types: [X.Q9H, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:1059:0x182f, code lost:
        if (r6.A08 != r9) goto L_0x1831;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04db, code lost:
        if (r2 != false) goto L_0x04dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x057e, code lost:
        if (r4 == X.AnonymousClass05K.A0C) goto L_0x0580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0cec, code lost:
        if (r0 != null) goto L_0x0ca2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:816:0x1390, code lost:
        if (X.00l.A0W(r4) != false) goto L_0x1392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:905:0x152a, code lost:
        if (r5 != null) goto L_0x152c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:964:0x1632, code lost:
        if (r0 != null) goto L_0x15e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:1133:0x04ef A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1153:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1154:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1170:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1171:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1174:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0596  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x05a0  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x05c4  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x068f  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x06b9  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x06c6  */
    /* JADX WARNING: Removed duplicated region for block: B:534:0x0cb9  */
    /* JADX WARNING: Removed duplicated region for block: B:537:0x0cc7  */
    /* JADX WARNING: Removed duplicated region for block: B:539:0x0cd2  */
    /* JADX WARNING: Removed duplicated region for block: B:555:0x0d1b  */
    /* JADX WARNING: Removed duplicated region for block: B:558:0x0d29  */
    /* JADX WARNING: Removed duplicated region for block: B:560:0x0d34  */
    /* JADX WARNING: Removed duplicated region for block: B:565:0x0d40  */
    /* JADX WARNING: Removed duplicated region for block: B:873:0x1487  */
    /* JADX WARNING: Removed duplicated region for block: B:952:0x15ff  */
    /* JADX WARNING: Removed duplicated region for block: B:955:0x160d  */
    /* JADX WARNING: Removed duplicated region for block: B:957:0x1618  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.C249703kE r23, X.SUj r24) {
        /*
            r22 = this;
            r3 = r22
            r0 = r23
            boolean r1 = r3 instanceof X.C8007Qeu
            if (r1 != 0) goto L_0x004e
            boolean r2 = r3 instanceof X.C8013Qf0
            r1 = r24
            if (r2 == 0) goto L_0x0071
            r5 = r3
            X.Qf0 r5 = (X.C8013Qf0) r5
            X.Qf5 r0 = (X.C8018Qf5) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            boolean r2 = X.SUj.A0V(r1)
            if (r2 == 0) goto L_0x1755
            X.C8013Qf0.A08(r0, r5, r1)
            java.lang.Object r9 = r1.A01
            if (r9 == 0) goto L_0x1786
            com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r9 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem) r9
            com.facebookpay.widget.listcell.ListCell r4 = r0.A02
            android.content.Context r8 = r4.getContext()
            X.XRm r3 = r9.A09
            X.XRm r2 = X.C21267XRm.A08
            boolean r13 = X.AnonymousClass7TF.A1W(r3, r2)
            com.facebookpay.widget.actionmenu.InlineActionMenu r3 = r0.A00
            r2 = 38
            X.SbM r2 = X.C11499SbM.A00(r1, r5, r2)
            r3.setEditComponentListener(r2)
            boolean r2 = r9.A0K
            if (r2 == 0) goto L_0x0064
            r3.A01()
        L_0x0045:
            boolean r1 = r9.A06
            if (r1 == 0) goto L_0x004f
            X.RFq r0 = X.C8922RFq.A0G
        L_0x004b:
            r4.setTextStyle(r0)
        L_0x004e:
            return
        L_0x004f:
            X.Q9K r1 = r0.A03
            r0 = 8
            r1.setVisibility(r0)
            r3.setVisibility(r0)
            r0 = 0
            r4.setCustomView(r0)
            r0 = 0
            r4.setClickable(r0)
            X.RFq r0 = X.C8922RFq.A09
            goto L_0x004b
        L_0x0064:
            r7 = 0
            X.FOP r6 = new X.FOP
            r11 = r5
            r12 = r1
            r10 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r3.setRemoveComponentListener(r6)
            goto L_0x0045
        L_0x0071:
            boolean r2 = r3 instanceof X.C7978QeR
            if (r2 == 0) goto L_0x00e4
            X.QF9 r0 = (X.QF9) r0
            r3 = 0
            boolean r6 = X.AnonymousClass7TF.A1U(r3, r1, r0)
            java.lang.Object r5 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionTextViewItem r5 = (com.facebookpay.common.recyclerview.adapteritems.SelectionTextViewItem) r5
            if (r5 == 0) goto L_0x004e
            java.lang.String r2 = r5.A01
            if (r2 == 0) goto L_0x008c
            boolean r1 = X.00l.A0W(r2)
            if (r1 == 0) goto L_0x0090
        L_0x008c:
            java.lang.Integer r1 = r5.A00
            if (r1 == 0) goto L_0x004e
        L_0x0090:
            com.facebookpay.widget.listcell.ListCell r4 = r0.A00
            r1 = 0
            r4.A0B(r3, r6)
            if (r2 != 0) goto L_0x00e2
            java.lang.Integer r0 = r5.A00
            if (r0 == 0) goto L_0x00a8
            int r1 = r0.intValue()
            android.content.Context r0 = r4.getContext()
            java.lang.String r1 = r0.getString(r1)
        L_0x00a8:
            r4.setPrimaryText(r1)
            r0 = 2131438192(0x7f0b2a70, float:1.8498304E38)
            android.view.View r2 = X.AnonymousClass7TE.A0b(r4, r0)
            r0 = 25
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2132017599(0x7f1401bf, float:1.967348E38)
            r4.A06(r2, r1, r0)
            X.RH2 r0 = X.RH2.A14
            r4.setPrimaryTextStyle(r0)
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x004e
            android.view.View r2 = r4.A02
            java.lang.String r9 = "dividerView"
            if (r2 == 0) goto L_0x1932
            r2.setVisibility(r3)
            X.AnonymousClass2E0.A0A()
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r4)
            r0 = 2131100476(0x7f06033c, float:1.7813335E38)
            int r0 = r1.getColor(r0)
            X.Pxf.A1B(r2, r0)
            return
        L_0x00e2:
            r1 = r2
            goto L_0x00a8
        L_0x00e4:
            boolean r2 = r3 instanceof X.C7998Qel
            if (r2 == 0) goto L_0x0157
            r5 = r3
            X.Qel r5 = (X.C7998Qel) r5
            X.QFL r0 = (X.QFL) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            boolean r2 = X.SUj.A0V(r1)
            if (r2 == 0) goto L_0x004e
            java.lang.Object r8 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionIncentiveEmbeddedBloksItem r8 = (com.facebookpay.common.recyclerview.adapteritems.SelectionIncentiveEmbeddedBloksItem) r8
            if (r8 == 0) goto L_0x004e
            X.TlT r10 = r8.A00
            if (r10 == 0) goto L_0x004e
            r2 = 45
            X.PqL r1 = new X.PqL
            r1.<init>(r8, r2)
            X.Q3B r4 = new X.Q3B
            r4.<init>(r1)
            r2 = 46
            X.PqL r1 = new X.PqL
            r1.<init>(r8, r2)
            X.Q3B r3 = new X.Q3B
            r3.<init>(r1)
            java.util.List r2 = r8.A01
            java.lang.String r1 = "applied_offer_ids"
            X.0eP r7 = X.AnonymousClass7TE.A1L(r1, r2)
            java.util.List r2 = r8.A02
            java.lang.String r1 = "available_offers"
            X.0eP r6 = X.AnonymousClass7TE.A1L(r1, r2)
            java.lang.String r1 = "apply_incentive"
            X.0eP r4 = X.AnonymousClass7TE.A1L(r1, r4)
            java.lang.String r1 = "remove_incentive"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r1, r3)
            boolean r1 = r8.A05
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = "show_promocode_input"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r1, r2)
            java.util.LinkedHashMap r11 = X.Pxh.A0v(r7, r6, r4, r3, r1)
            android.widget.FrameLayout r8 = r0.A00
            r8.removeAllViews()
            X.SIG r6 = X.AnonymousClass2E0.A0H()
            android.view.ContextThemeWrapper r7 = r5.A00
            androidx.fragment.app.FragmentActivity r9 = r5.A01
            r6.A02(r7, r8, r9, r10, r11)
            return
        L_0x0157:
            boolean r2 = r3 instanceof X.C7977QeQ
            if (r2 == 0) goto L_0x023a
            X.QF8 r0 = (X.QF8) r0
            X.AnonymousClass7TF.A1H(r1, r0)
            java.lang.Object r6 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem r6 = (com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem) r6
            if (r6 == 0) goto L_0x004e
            com.facebookpay.widget.listcell.ListCell r4 = r0.A00
            java.lang.String r0 = r6.A01
            r5 = 0
            if (r0 != 0) goto L_0x017d
            java.lang.Integer r0 = r6.A00
            if (r0 == 0) goto L_0x0225
            int r1 = r0.intValue()
            android.content.Context r0 = r4.getContext()
            java.lang.String r0 = r0.getString(r1)
        L_0x017d:
            r4.setPrimaryText(r0)
            java.lang.String r8 = r6.A02
            if (r8 == 0) goto L_0x01c9
            android.widget.FrameLayout r0 = r4.A09
            if (r0 == 0) goto L_0x19c5
            X.2dQ r1 = X.Pxj.A0N(r0)
            r0 = 2131438192(0x7f0b2a70, float:1.8498304E38)
            r1.A0u = r0
            r1.A0F = r0
            java.lang.Integer r1 = r6.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 != r0) goto L_0x020a
            java.util.Locale r7 = X.Pxh.A0w()
            r2 = 2
            android.content.Context r1 = r4.getContext()
            r0 = 2131961252(0x7f1325a4, float:1.9559196E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.Object[] r1 = X.Pxf.A1X(r0, r8, r2)
            java.lang.String r0 = "%1s %2s"
            java.lang.String r0 = X.Pxe.A12(r7, r0, r1)
            r4.setSecondaryText(r0)
            r0 = 2131440874(0x7f0b34ea, float:1.8503744E38)
            android.view.View r2 = X.AnonymousClass7TE.A0b(r4, r0)
            r0 = 24
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2132017597(0x7f1401bd, float:1.9673477E38)
            r4.A06(r2, r1, r0)
        L_0x01c9:
            java.lang.Integer r0 = r6.A03
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0228;
                case 1: goto L_0x01ec;
                case 2: goto L_0x01d2;
                case 3: goto L_0x0206;
                default: goto L_0x01d2;
            }
        L_0x01d2:
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r4)
            X.Q9O r1 = new X.Q9O
            r1.<init>(r0)
            X.RH3 r0 = X.RH3.A0Y
            r1.setIcon(r0)
            r4.setRightAddOnIcon(r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.C18674VwX.A01(r4, r0, r5)
        L_0x01e8:
            X.RFq r0 = X.C8922RFq.A0E
            goto L_0x004b
        L_0x01ec:
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x01e8
            android.content.Context r0 = r4.getContext()
            android.content.res.TypedArray r3 = X.SPB.A01(r0, r4)
            android.view.View r2 = r4.A01
            if (r2 != 0) goto L_0x022c
            java.lang.String r0 = "containerView"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0206:
            r4.setRightAddOnIcon(r5)
            goto L_0x01e8
        L_0x020a:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x01c9
            r4.setSecondaryText(r8)
            r0 = 2131440874(0x7f0b34ea, float:1.8503744E38)
            android.view.View r2 = X.AnonymousClass7TE.A0b(r4, r0)
            r0 = 23
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2132017596(0x7f1401bc, float:1.9673475E38)
            r4.A06(r2, r1, r0)
            goto L_0x01c9
        L_0x0225:
            r0 = r5
            goto L_0x017d
        L_0x0228:
            X.RFq r0 = X.C8922RFq.A0B
            goto L_0x004b
        L_0x022c:
            r1 = 6
            r0 = 2132017581(0x7f1401ad, float:1.9673444E38)
            X.C11409SSh.A00(r3, r2, r1, r0)
            r3.recycle()
            X.RFq r0 = X.C8922RFq.A0O
            goto L_0x004b
        L_0x023a:
            boolean r2 = r3 instanceof X.C7997Qek
            if (r2 == 0) goto L_0x0278
            X.QF7 r0 = (X.QF7) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            java.lang.Object r4 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem r4 = (com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem) r4
            r6 = 0
            if (r4 == 0) goto L_0x0263
            com.facebookpay.widget.listcell.ListCell r5 = r0.A00
            java.lang.String r2 = r4.A01
            if (r2 != 0) goto L_0x0260
            java.lang.Integer r2 = r4.A00
            if (r2 == 0) goto L_0x0276
            int r4 = r2.intValue()
            android.content.Context r2 = r5.getContext()
            java.lang.String r2 = r2.getString(r4)
        L_0x0260:
            r5.setPrimaryText(r2)
        L_0x0263:
            boolean r2 = X.SUj.A0V(r1)
            if (r2 == 0) goto L_0x004e
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
            r0 = 28
            X.C11499SbM.A01(r2, r0, r1, r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.C18674VwX.A01(r2, r0, r6)
            return
        L_0x0276:
            r2 = r6
            goto L_0x0260
        L_0x0278:
            boolean r2 = r3 instanceof X.C7996Qej
            if (r2 == 0) goto L_0x02b6
            r4 = r3
            X.Qej r4 = (X.C7996Qej) r4
            X.QF6 r0 = (X.QF6) r0
            r2 = 0
            boolean r7 = X.AnonymousClass7TF.A1U(r2, r1, r0)
            com.facebookpay.widget.listcell.ListCell r6 = r0.A00
            r0 = 68
            X.C11497SbK.A01(r6, r0, r4)
            boolean r0 = X.SUj.A0T(r1)
            r5 = 0
            if (r0 == 0) goto L_0x0c18
            r6.setOnClickListener(r5)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r6.A08(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r6.A09(r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r6.A0A(r0)
            X.C18674VwX.A00(r6, r5, r1, r5, r5)
            android.view.ContextThemeWrapper r1 = r4.A01
            r0 = 2131961241(0x7f132599, float:1.9559173E38)
            java.lang.String r0 = r1.getString(r0)
            r6.setShimmerAccessibilityLabel(r0)
            return
        L_0x02b6:
            boolean r2 = r3 instanceof X.C7976QeP
            if (r2 == 0) goto L_0x02ef
            X.Qf4 r0 = (X.C8017Qf4) r0
            r4 = 0
            boolean r9 = X.AnonymousClass7TF.A1U(r4, r1, r0)
            boolean r2 = X.SUj.A0T(r1)
            r7 = 0
            if (r2 == 0) goto L_0x1825
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
            r2.setOnClickListener(r7)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r2.A08(r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r2.A09(r0)
            r2.A0A(r1)
            r2.A04()
            X.C18674VwX.A00(r2, r7, r1, r7, r7)
            android.content.Context r1 = r2.getContext()
            r0 = 2131961239(0x7f132597, float:1.955917E38)
        L_0x02e7:
            java.lang.String r0 = r1.getString(r0)
            r2.setShimmerAccessibilityLabel(r0)
            return
        L_0x02ef:
            boolean r2 = r3 instanceof X.C7980QeT
            if (r2 == 0) goto L_0x0426
            X.Qf3 r0 = (X.C8016Qf3) r0
            r6 = 0
            boolean r8 = X.AnonymousClass7TF.A1U(r6, r1, r0)
            boolean r2 = X.SUj.A0V(r1)
            if (r2 == 0) goto L_0x004e
            com.facebookpay.widget.listcell.EntityListCell r4 = r0.A00
            java.lang.String r7 = A04(r3, r4)
            r5 = 0
            java.lang.String r2 = "entity"
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r0 = new com.facebookpay.expresscheckout.logging.ComponentLoggingData
            r0.<init>(r5, r7, r2)
            r4.A0M = r0
            java.lang.Object r5 = r1.A01
            if (r5 == 0) goto L_0x178b
            com.facebookpay.common.recyclerview.adapteritems.PuxEntityItem r5 = (com.facebookpay.common.recyclerview.adapteritems.PuxEntityItem) r5
            android.content.Context r7 = X.AnonymousClass7TE.A0S(r4)
            com.facebookpay.expresscheckout.models.ItemDetails r9 = r5.A01
            java.lang.Integer r0 = r9.A01
            int r0 = r0.intValue()
            boolean r3 = r3.A01
            if (r0 == r8) goto L_0x037c
            if (r3 == 0) goto L_0x0376
            X.RFq r0 = X.C8922RFq.A0I
            r4.setTextStyle(r0)
            r4.A0B(r8, r6)
        L_0x0330:
            java.lang.String r3 = r5.A05
            if (r3 == 0) goto L_0x034a
            java.util.Locale r2 = java.util.Locale.getDefault()
            r0 = 2131961237(0x7f132595, float:1.9559165E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r7, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r3}
            java.lang.String r0 = X.Pxg.A0v(r1, r2, r0, r8)
            r4.setTertiaryText(r0)
        L_0x034a:
            X.Q9S r1 = r4.A0O
            if (r1 == 0) goto L_0x0353
            java.lang.String r0 = r5.A03
            r1.setImageThumbnailUrl(r0)
        L_0x0353:
            java.lang.String r0 = r5.A04
            r4.setPrimaryText(r0)
            java.lang.String r0 = r5.A02
            r4.setSecondaryText(r0)
            X.Q9R r4 = r4.A0Q
            if (r4 == 0) goto L_0x004e
            X.SGX r3 = X.SGX.A00
            com.facebookpay.common.models.CurrencyAmount r0 = r5.A00
            java.lang.String r2 = r0.A00
            java.lang.String r1 = r0.A01
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            java.lang.String r0 = r3.A00(r2, r0)
            r4.setText(r0)
            return
        L_0x0376:
            X.RFq r0 = X.C8922RFq.A0F
            r4.setTextStyle(r0)
            goto L_0x0330
        L_0x037c:
            if (r3 == 0) goto L_0x040c
            X.RFq r0 = X.C8922RFq.A0M
            r4.setTextStyle(r0)
            r4.A0B(r8, r6)
        L_0x0386:
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131165306(0x7f07007a, float:1.7944825E38)
            r8 = 2131165306(0x7f07007a, float:1.7944825E38)
            float r0 = r1.getDimension(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r4.setSecondaryTextSizePx(r0)
            if (r3 != 0) goto L_0x03e7
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131165249(0x7f070041, float:1.794471E38)
            float r0 = r1.getDimension(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r4.setTertiaryTextSizePx(r0)
            r0 = 2131961354(0x7f13260a, float:1.9559403E38)
            java.lang.String r10 = r7.getString(r0)
            java.util.ArrayList r2 = X.DbV.A15(r10)
            X.SR9 r1 = new X.SR9
            r1.<init>()
            java.lang.String r0 = "https://www.facebook.com/help/208622391741310?ref=learn_more"
            r1.A03(r0)
            r0 = 2131961398(0x7f132636, float:1.9559492E38)
            r1.A01 = r0
            java.lang.String r0 = "[[learn_more_token]]"
            X.SR9.A02(r1, r0, r2)
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r2)
            X.QmZ r2 = X.C9671Rep.A00(r7, r0, r10, r6)
            r1 = 11
            X.Sv0 r0 = new X.Sv0
            r0.<init>(r7, r1)
            X.0qQ.A0B(r0, r6)
            android.text.SpannableString r0 = r2.A01(r0, r6)
            r4.setTertiaryLinkableText(r0)
        L_0x03e7:
            java.lang.String r1 = r9.A00
            if (r1 == 0) goto L_0x034a
            r0 = 2131961353(0x7f132609, float:1.95594E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r7, r0)
            java.lang.CharSequence r2 = X.C9657Reb.A00(r7, r0, r1, r6)
            android.content.res.Resources r1 = r7.getResources()
            if (r3 == 0) goto L_0x0413
            float r0 = r1.getDimension(r8)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r4.setTertiaryTextSizePx(r0)
            r4.setTertiaryLinkableText(r2)
            goto L_0x034a
        L_0x040c:
            X.RFq r0 = X.C8922RFq.A0L
            r4.setTextStyle(r0)
            goto L_0x0386
        L_0x0413:
            r0 = 2131165249(0x7f070041, float:1.794471E38)
            float r0 = r1.getDimension(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r4.setQuaternaryTextSizePx(r0)
            r4.setQuaternaryLinkableText(r2)
            goto L_0x034a
        L_0x0426:
            boolean r2 = r3 instanceof X.C7995Qei
            if (r2 == 0) goto L_0x0458
            X.QF5 r0 = (X.QF5) r0
            r5 = 0
            boolean r4 = X.AnonymousClass7TF.A1U(r5, r1, r0)
            boolean r2 = X.SUj.A0T(r1)
            r7 = 0
            if (r2 == 0) goto L_0x0bae
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r2.A08(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r2.A09(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A0A(r0)
            r2.setOnClickListener(r7)
            X.C18674VwX.A00(r2, r7, r0, r7, r7)
            android.content.Context r1 = r2.getContext()
            r0 = 2131961238(0x7f132596, float:1.9559167E38)
            goto L_0x02e7
        L_0x0458:
            boolean r2 = r3 instanceof X.C8011Qey
            if (r2 == 0) goto L_0x0465
            r2 = r3
            X.Qey r2 = (X.C8011Qey) r2
            X.QF4 r0 = (X.QF4) r0
            r2.A0B(r0, r1)
            return
        L_0x0465:
            boolean r2 = r3 instanceof X.C8004Qer
            if (r2 == 0) goto L_0x0472
            r2 = r3
            X.Qer r2 = (X.C8004Qer) r2
            X.QF3 r0 = (X.QF3) r0
            r2.A0B(r0, r1)
            return
        L_0x0472:
            boolean r2 = r3 instanceof X.C7981QeU
            if (r2 == 0) goto L_0x0516
            r4 = r3
            X.QeU r4 = (X.C7981QeU) r4
            X.QF2 r0 = (X.QF2) r0
            r3 = 0
            boolean r15 = X.AnonymousClass7TF.A1U(r3, r1, r0)
            boolean r2 = X.SUj.A0V(r1)
            r6 = 0
            if (r2 == 0) goto L_0x179e
            com.facebookpay.widget.pricetable.PriceTable r8 = r0.A00
            java.lang.Object r9 = r1.A01
            if (r9 == 0) goto L_0x1799
            com.facebookpay.common.recyclerview.adapteritems.PuxPriceTableItem r9 = (com.facebookpay.common.recyclerview.adapteritems.PuxPriceTableItem) r9
            java.util.ArrayList r1 = r9.A02
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r12 = r1.iterator()
        L_0x0499:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x1795
            java.lang.Object r10 = r12.next()
            com.facebookpay.expresscheckout.models.PriceInfo r10 = (com.facebookpay.expresscheckout.models.PriceInfo) r10
            X.RFW r11 = r10.A01
            X.RFW r1 = X.RFW.SHIPPING
            if (r11 == r1) goto L_0x04af
            X.RFW r1 = X.RFW.FULFILLMENT
            if (r11 != r1) goto L_0x0503
        L_0x04af:
            com.facebookpay.common.models.CurrencyAmount r1 = r10.A00
            java.lang.String r2 = r1.A01
            java.lang.Float r1 = X.012.A0q(r2)
            if (r1 == 0) goto L_0x0503
            float r2 = java.lang.Float.parseFloat(r2)
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0503
            android.content.Context r2 = r8.getContext()
            r1 = 2131961402(0x7f13263a, float:1.95595E38)
            java.lang.String r15 = r2.getString(r1)
            r2 = 1
        L_0x04ce:
            X.0qQ.A0A(r15)
            X.RFW r1 = X.RFW.TOTAL
            r16 = 1
            if (r11 == r1) goto L_0x04dd
            r16 = 0
            r17 = 0
            if (r2 == 0) goto L_0x04df
        L_0x04dd:
            r17 = 1
        L_0x04df:
            X.RFW r1 = X.RFW.DISCOUNT
            if (r11 == r1) goto L_0x04e7
            X.RFW r1 = X.RFW.PRE_TAX_DISCOUNT
            if (r11 != r1) goto L_0x04ed
        L_0x04e7:
            boolean r1 = r4.A01
            r19 = 1
            if (r1 != 0) goto L_0x04ef
        L_0x04ed:
            r19 = 0
        L_0x04ef:
            java.lang.Integer r2 = r9.A01
            java.lang.Integer r1 = r9.A00
            java.lang.String r14 = X.C7981QeU.A07(r0, r4, r10, r2, r1)
            X.S6W r1 = new X.S6W
            r13 = r1
            r18 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r7.add(r1)
            goto L_0x0499
        L_0x0503:
            X.SGX r6 = X.SGX.A00
            com.facebookpay.common.models.CurrencyAmount r1 = r10.A00
            java.lang.String r5 = r1.A00
            java.lang.String r2 = r1.A01
            java.math.BigDecimal r1 = new java.math.BigDecimal
            r1.<init>(r2)
            java.lang.String r15 = r6.A00(r5, r1)
            r2 = 0
            goto L_0x04ce
        L_0x0516:
            boolean r2 = r3 instanceof X.C7999Qem
            if (r2 == 0) goto L_0x0544
            r4 = r3
            X.Qem r4 = (X.C7999Qem) r4
            X.Qf2 r0 = (X.C8015Qf2) r0
            r8 = 0
            boolean r7 = X.AnonymousClass7TF.A1U(r8, r1, r0)
            boolean r2 = X.SUj.A0T(r1)
            r6 = 0
            if (r2 == 0) goto L_0x13b2
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r2.A08(r0)
            r1 = 0
            r2.setOnClickListener(r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.C18674VwX.A00(r2, r1, r0, r1, r1)
            android.content.Context r1 = r2.getContext()
            r0 = 2131961240(0x7f132598, float:1.9559171E38)
            goto L_0x02e7
        L_0x0544:
            boolean r2 = r3 instanceof X.C7979QeS
            if (r2 == 0) goto L_0x06ed
            X.QF1 r0 = (X.QF1) r0
            r10 = 0
            boolean r7 = X.AnonymousClass7TF.A1U(r10, r1, r0)
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
            r0 = 2131432700(0x7f0b14fc, float:1.8487165E38)
            r2.setId(r0)
            android.content.Context r14 = X.AnonymousClass7TE.A0S(r2)
            X.Q9Q r11 = new X.Q9Q
            r11.<init>(r14)
            java.lang.Object r9 = r1.A01
            r8 = r9
            com.facebookpay.common.recyclerview.adapteritems.PuxFulfillmentOptionItem r8 = (com.facebookpay.common.recyclerview.adapteritems.PuxFulfillmentOptionItem) r8
            r5 = 0
            if (r8 == 0) goto L_0x06ea
            java.lang.Integer r4 = r8.A02
        L_0x056a:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r4 == r0) goto L_0x0580
            boolean r0 = X.C11431STx.A01()
            if (r0 == 0) goto L_0x06cc
            if (r8 == 0) goto L_0x06c9
            java.lang.Integer r0 = r8.A02
            if (r0 != 0) goto L_0x06cc
            java.lang.Integer r4 = r8.A03
        L_0x057c:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r4 != r0) goto L_0x06cc
        L_0x0580:
            java.util.Locale r6 = X.Pxh.A0w()
            android.content.Context r4 = r11.getContext()
            r0 = 2131961252(0x7f1325a4, float:1.9559196E38)
            java.lang.String r0 = A03(r4, r6, r0)
        L_0x058f:
            r11.setText(r0)
            boolean r6 = r3.A01
            if (r6 == 0) goto L_0x059b
            X.RH2 r0 = X.RH2.A14
            r11.setTextStyle(r0)
        L_0x059b:
            r2.setLeftAddOnText(r11)
            if (r8 == 0) goto L_0x06b2
            boolean r0 = r8.A05
            if (r0 != r7) goto L_0x0694
            r2.setRightAddOnIcon(r5)
            r2.setEnabled(r10)
        L_0x05aa:
            boolean r13 = X.SUj.A0V(r1)
            java.lang.String r12 = A04(r3, r2)
            java.lang.Throwable r4 = r1.A02
            boolean r11 = r4 instanceof X.C13216TQh
            if (r11 == 0) goto L_0x068f
            java.lang.String r10 = "shipping_option_inline_error"
        L_0x05bb:
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r0 = new com.facebookpay.expresscheckout.logging.ComponentLoggingData
            r0.<init>(r5, r12, r10)
            r2.A0M = r0
            if (r13 == 0) goto L_0x0d40
            if (r9 == 0) goto L_0x17e4
            com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent r4 = r8.A01
            boolean r0 = r4 instanceof com.facebookpay.fulfillmentoption.model.ShippingFulfillmentOptionComponent
            if (r0 == 0) goto L_0x0605
            X.RFq r0 = X.C8922RFq.A0I
            r2.setTextStyle(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.fulfillmentoption.model.ShippingFulfillmentOptionComponent"
            X.0qQ.A0C(r4, r0)
            com.facebookpay.fulfillmentoption.model.ShippingFulfillmentOptionComponent r4 = (com.facebookpay.fulfillmentoption.model.ShippingFulfillmentOptionComponent) r4
            X.SRD r13 = X.C9959RkE.A00
            java.util.Locale r19 = X.Pxh.A0w()
            java.util.Date r6 = r4.A05
            java.util.Date r5 = r4.A04
            com.facebookpay.common.models.CurrencyAmount r15 = r4.A00
            java.lang.String r1 = r4.A03
            r16 = r1
            r17 = r6
            r18 = r5
            java.lang.String r0 = r13.A04(r14, r15, r16, r17, r18, r19)
            r2.setPrimaryText(r0)
            if (r6 != 0) goto L_0x05f9
            if (r5 != 0) goto L_0x05f9
            r1 = 0
        L_0x05f9:
            r2.setSecondaryText(r1)
        L_0x05fc:
            r2.A02()
            android.view.View$OnClickListener r0 = r3.A00
            X.AnonymousClass0fU.A00(r0, r2)
            return
        L_0x0605:
            boolean r0 = r4 instanceof com.facebookpay.fulfillmentoption.model.PickupFulfillmentOptionComponent
            if (r0 == 0) goto L_0x0654
            X.RFq r0 = X.C8922RFq.A0I
            r2.setTextStyle(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.fulfillmentoption.model.PickupFulfillmentOptionComponent"
            X.0qQ.A0C(r4, r0)
            com.facebookpay.fulfillmentoption.model.PickupFulfillmentOptionComponent r4 = (com.facebookpay.fulfillmentoption.model.PickupFulfillmentOptionComponent) r4
            X.SRD r9 = X.C9959RkE.A00
            java.util.Locale r8 = X.Pxh.A0w()
            boolean r0 = r4.A09
            java.lang.String r6 = r4.A06
            com.facebookpay.common.models.CurrencyAmount r5 = r4.A00
            if (r0 == 0) goto L_0x063d
            if (r5 == 0) goto L_0x063d
            java.lang.String r0 = r5.A01
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x063d
            r1 = 2
            java.lang.String r0 = X.SRD.A00(r14, r5)
            java.lang.Object[] r1 = X.Pxf.A1X(r6, r0, r1)
            java.lang.String r0 = "%1s • %2s"
            java.lang.String r6 = X.Pxe.A12(r8, r0, r1)
        L_0x063d:
            r2.setPrimaryText(r6)
            java.util.Locale r13 = X.Pxh.A0w()
            java.util.Date r1 = r4.A08
            java.util.Date r0 = r4.A07
            r10 = r14
            r11 = r1
            r12 = r0
            r14 = r7
            android.text.SpannableStringBuilder r0 = r9.A03(r10, r11, r12, r13, r14)
            r2.setSecondarySpannableText(r0)
            goto L_0x05fc
        L_0x0654:
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent"
            X.0qQ.A0C(r4, r0)
            if (r6 == 0) goto L_0x0685
            X.RFq r0 = X.C8922RFq.A0I
            r2.setTextStyle(r0)
            java.util.Locale r7 = X.Pxh.A0w()
            java.lang.String r6 = r4.A03()
            com.facebookpay.common.models.CurrencyAmount r0 = r4.A00()
            java.lang.String r5 = "%1s • %2s"
            r1 = 2
            java.lang.String r0 = X.SRD.A00(r14, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r0}
            java.lang.String r0 = X.Pxg.A0v(r5, r7, r0, r1)
        L_0x067c:
            r2.setPrimaryText(r0)
            java.lang.String r1 = r4.A01()
            goto L_0x05f9
        L_0x0685:
            X.RFq r0 = X.C8922RFq.A0B
            r2.setTextStyle(r0)
            java.lang.String r0 = r4.A03()
            goto L_0x067c
        L_0x068f:
            java.lang.String r10 = "shipping_option"
            goto L_0x05bb
        L_0x0694:
            boolean r0 = r8.A04
            if (r0 != r7) goto L_0x06b2
            X.Q9O r4 = new X.Q9O
            r4.<init>(r14)
            if (r6 == 0) goto L_0x06af
            X.RH3 r0 = X.RH3.A0W
        L_0x06a1:
            r4.setIcon(r0)
            r4.setEnabled(r10)
            r2.setRightAddOnIcon(r4)
            r2.setEnabled(r10)
            goto L_0x05aa
        L_0x06af:
            X.RH3 r0 = X.RH3.PRIMARY_CHEVRON_RIGHT_OUTLINE_LARGE_DISABLED
            goto L_0x06a1
        L_0x06b2:
            X.Q9O r4 = new X.Q9O
            r4.<init>(r14)
            if (r6 == 0) goto L_0x06c6
            X.RH3 r0 = X.RH3.A0V
        L_0x06bb:
            r4.setIcon(r0)
            r2.setRightAddOnIcon(r4)
            r2.setEnabled(r7)
            goto L_0x05aa
        L_0x06c6:
            X.RH3 r0 = X.RH3.A0J
            goto L_0x06bb
        L_0x06c9:
            r4 = r5
            goto L_0x057c
        L_0x06cc:
            boolean r0 = r3.A01
            java.util.Locale r6 = X.Pxh.A0w()
            android.content.Context r4 = r11.getContext()
            if (r0 == 0) goto L_0x06e1
            r0 = 2131961236(0x7f132594, float:1.9559163E38)
            java.lang.String r0 = A03(r4, r6, r0)
            goto L_0x058f
        L_0x06e1:
            r0 = 2131961261(0x7f1325ad, float:1.9559214E38)
            java.lang.String r0 = A03(r4, r6, r0)
            goto L_0x058f
        L_0x06ea:
            r4 = r5
            goto L_0x056a
        L_0x06ed:
            boolean r2 = r3 instanceof X.C7975QeO
            if (r2 == 0) goto L_0x0736
            X.QF0 r0 = (X.QF0) r0
            r5 = 0
            X.0qQ.A0B(r1, r5)
            r2 = 1
            r4 = 4
            X.0qQ.A0B(r0, r2)
            boolean r2 = X.SUj.A0V(r1)
            if (r2 == 0) goto L_0x004e
            java.lang.Object r3 = r1.A01
            if (r3 == 0) goto L_0x004e
            com.facebookpay.common.recyclerview.adapteritems.PuxBannerItem r3 = (com.facebookpay.common.recyclerview.adapteritems.PuxBannerItem) r3
            X.RGk r1 = r3.A02
            if (r1 != 0) goto L_0x0731
            r1 = -1
        L_0x070d:
            r2 = 8
            if (r1 != r4) goto L_0x17e9
            X.C7X r1 = r3.A00
            if (r1 == 0) goto L_0x17e9
            java.lang.String r1 = X.C41845B3m.A0l(r1, r5)
            if (r1 == 0) goto L_0x17e9
            com.facebookpay.widget.banner.FBPayBanner r0 = r0.A00
            X.SPB r3 = X.AnonymousClass2E0.A0A()
            r2 = 54
            r1 = 46
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            r3.A05(r0, r2, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0731:
            int r1 = r1.ordinal()
            goto L_0x070d
        L_0x0736:
            boolean r2 = r3 instanceof X.C7991Qee
            if (r2 == 0) goto L_0x078f
            X.QFK r0 = (X.QFK) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            java.lang.Object r9 = r1.A01
            r8 = r9
            com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem r8 = (com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem) r8
            r6 = 0
            if (r8 == 0) goto L_0x0767
            com.facebookpay.widget.listcell.ListCell r7 = r0.A00
            java.lang.String r2 = r8.A01
            r7.setPrimaryText(r2)
            java.lang.Integer r2 = r8.A00
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            if (r2 != r5) goto L_0x0788
            android.content.Context r4 = r7.getContext()
            r2 = 2131961277(0x7f1325bd, float:1.9559246E38)
            java.lang.String r2 = r4.getString(r2)
            X.C18674VwX.A01(r7, r5, r2)
            X.Q9O r2 = r0.A01
        L_0x0764:
            r7.setRightAddOnIcon(r2)
        L_0x0767:
            boolean r2 = X.SUj.A0V(r1)
            if (r2 == 0) goto L_0x077d
            if (r9 == 0) goto L_0x17f5
            java.lang.Integer r4 = r8.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            if (r4 != r2) goto L_0x17ef
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
            r0 = 25
        L_0x0779:
            X.C11499SbM.A01(r2, r0, r1, r3)
            return
        L_0x077d:
            boolean r2 = X.SUj.A0S(r1)
            if (r2 == 0) goto L_0x17fa
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
            r0 = 26
            goto L_0x0779
        L_0x0788:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.C18674VwX.A01(r7, r2, r6)
            r2 = r6
            goto L_0x0764
        L_0x078f:
            boolean r2 = r3 instanceof X.C7994Qeh
            if (r2 == 0) goto L_0x0826
            X.QFU r0 = (X.QFU) r0
            r2 = 0
            X.0qQ.A0B(r1, r2)
            r2 = 1
            r11 = 3
            X.0qQ.A0B(r0, r2)
            boolean r2 = X.SUj.A0V(r1)
            r9 = 0
            if (r2 == 0) goto L_0x0d99
            java.lang.Object r8 = r1.A01
            if (r8 == 0) goto L_0x1800
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r8 = (com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem) r8
            com.facebookpay.widget.listcell.ListCell r7 = r0.A00
            android.content.Context r6 = r7.getContext()
            java.lang.String r2 = r8.A03
            r7.setPrimaryText(r2)
            java.lang.String r2 = r8.A02
            r7.setSecondaryText(r2)
            java.lang.String r2 = r8.A04
            r7.setTertiaryText(r2)
            java.lang.String r5 = r8.A05
            if (r5 != 0) goto L_0x0816
            java.lang.Integer r2 = r8.A00
            if (r2 == 0) goto L_0x0813
            int r5 = r2.intValue()
            r2 = 2131951849(0x7f1300e9, float:1.9540124E38)
            java.lang.String r4 = r6.getString(r2)
            r2 = 2131961302(0x7f1325d6, float:1.9559297E38)
            java.lang.String r10 = r6.getString(r2)
            java.lang.String r9 = r6.getString(r5)
        L_0x07de:
            r7.setErrorText(r9)
            java.lang.Integer r9 = r8.A01
            int r5 = r9.intValue()
            r6 = 1
            if (r5 == r11) goto L_0x0805
            r2 = 2
            if (r5 == r2) goto L_0x0805
            X.Q9O r2 = r0.A01
            r7.setRightAddOnIcon(r2)
        L_0x07f2:
            r12 = 2
            X.SbB r2 = new X.SbB
            r11 = r2
            r13 = r8
            r14 = r0
            r15 = r3
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            X.AnonymousClass0fU.A00(r2, r7)
            X.SRD.A02(r8, r7, r4, r10)
            return
        L_0x0805:
            X.Q9K r5 = r0.A02
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r9 == r2) goto L_0x080c
            r6 = 0
        L_0x080c:
            r5.setChecked(r6)
            r7.setRightAddOnView(r5)
            goto L_0x07f2
        L_0x0813:
            r10 = r9
            r4 = r9
            goto L_0x07de
        L_0x0816:
            r2 = 2131951849(0x7f1300e9, float:1.9540124E38)
            java.lang.String r4 = r6.getString(r2)
            r2 = 2131961302(0x7f1325d6, float:1.9559297E38)
            java.lang.String r10 = r6.getString(r2)
            r9 = r5
            goto L_0x07de
        L_0x0826:
            boolean r2 = r3 instanceof X.C7990Qed
            if (r2 == 0) goto L_0x0887
            X.QFT r0 = (X.QFT) r0
            r2 = 0
            X.0qQ.A0B(r1, r2)
            r2 = 1
            r9 = 3
            X.0qQ.A0B(r0, r2)
            java.lang.Object r8 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem r8 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem) r8
            if (r8 == 0) goto L_0x0857
            com.facebookpay.widget.listcell.ListCell r7 = r0.A00
            java.lang.String r2 = r8.A01
            r7.setPrimaryText(r2)
            java.lang.Integer r6 = r8.A00
            int r4 = r6.intValue()
            r5 = 1
            if (r4 == r9) goto L_0x0879
            r2 = 2
            if (r4 == r2) goto L_0x0879
            X.Q9O r2 = r0.A01
            r7.setRightAddOnIcon(r2)
        L_0x0853:
            r2 = 0
            X.SRD.A02(r8, r7, r2, r2)
        L_0x0857:
            boolean r2 = X.SUj.A0V(r1)
            if (r2 == 0) goto L_0x086a
            com.facebookpay.widget.listcell.ListCell r5 = r0.A00
            r4 = 10
            X.SbL r2 = new X.SbL
            r2.<init>((int) r4, (java.lang.Object) r1, (java.lang.Object) r0, (java.lang.Object) r3)
        L_0x0866:
            X.AnonymousClass0fU.A00(r2, r5)
            return
        L_0x086a:
            boolean r2 = X.SUj.A0S(r1)
            if (r2 == 0) goto L_0x0db2
            com.facebookpay.widget.listcell.ListCell r5 = r0.A00
            r0 = 24
            X.SbM r2 = X.C11499SbM.A00(r1, r3, r0)
            goto L_0x0866
        L_0x0879:
            X.Q9K r4 = r0.A02
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r6 == r2) goto L_0x0880
            r5 = 0
        L_0x0880:
            r4.setChecked(r5)
            r7.setRightAddOnView(r4)
            goto L_0x0853
        L_0x0887:
            boolean r2 = r3 instanceof X.C7989Qec
            if (r2 == 0) goto L_0x09ea
            X.QFV r0 = (X.QFV) r0
            r10 = 0
            X.0qQ.A0B(r1, r10)
            r16 = 1
            r9 = 3
            r2 = r16
            X.0qQ.A0B(r0, r2)
            boolean r2 = X.SUj.A0V(r1)
            if (r2 == 0) goto L_0x0db5
            com.facebookpay.widget.listcell.ListCell r11 = r0.A01
            r11.A02()
            java.lang.Object r8 = r1.A01
            if (r8 == 0) goto L_0x1805
            com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r8 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem) r8
            android.content.Context r7 = r11.getContext()
            boolean r6 = r8.A0J
            r5 = 2
            r4 = 0
            if (r6 == 0) goto L_0x09b2
            X.STx r2 = X.AnonymousClass2E0.A0D()
            boolean r2 = r2.A07()
            if (r2 == 0) goto L_0x09b2
            java.lang.String r13 = r8.A0G
            if (r13 == 0) goto L_0x09b2
            boolean r2 = X.00l.A0W(r13)
            if (r2 != 0) goto L_0x09b2
            java.lang.String r12 = r8.A0H
            if (r12 == 0) goto L_0x09b2
            boolean r2 = X.00l.A0W(r12)
            if (r2 != 0) goto L_0x09b2
            r2 = 2131165563(0x7f07017b, float:1.7945347E38)
            r11.A05(r2, r13)
            r11.setPrimaryText(r12)
            X.RGd r2 = r8.A01
            java.lang.String r15 = "•••• "
            if (r2 == 0) goto L_0x09aa
            X.0qQ.A0A(r7)
            java.lang.String r14 = X.C11091S9q.A01(r7, r2)
            boolean r2 = X.C51966G9m.A1X(r14)
            if (r2 == 0) goto L_0x09aa
            java.util.Locale r13 = X.Pxh.A0w()
            r2 = 2131961189(0x7f132565, float:1.9559068E38)
            java.lang.String r12 = X.AnonymousClass7TE.A16(r7, r2)
            java.lang.String r2 = r8.A0I
            java.lang.String r2 = X.002.A0R(r15, r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r14}
            java.lang.String r2 = X.Pxg.A0v(r12, r13, r2, r5)
        L_0x0908:
            r11.setSecondaryText(r2)
            X.RH2 r2 = X.RH2.A0S
            r11.setSecondaryTextStyle(r2)
            java.lang.String r2 = r8.A04
            r11.setTertiaryText(r2)
        L_0x0915:
            X.QRJ r12 = r8.A00
            if (r12 == 0) goto L_0x0921
            java.lang.String r2 = "error_msg"
            java.lang.String r2 = r12.getOptionalStringField(r10, r2)
            if (r2 != 0) goto L_0x092d
        L_0x0921:
            java.lang.Integer r2 = r8.A02
            if (r2 == 0) goto L_0x09a8
            int r2 = r2.intValue()
            java.lang.String r2 = r7.getString(r2)
        L_0x092d:
            r11.setErrorText(r2)
            if (r6 == 0) goto L_0x094f
            X.STx r2 = X.AnonymousClass2E0.A0D()
            boolean r2 = r2.A07()
            if (r2 == 0) goto L_0x094f
            r2 = 2131434520(0x7f0b1c18, float:1.8490856E38)
            android.view.View r7 = X.AnonymousClass7TE.A0b(r11, r2)
            r2 = 14
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r2 = 2132017593(0x7f1401b9, float:1.9673469E38)
            r11.A06(r7, r6, r2)
        L_0x094f:
            java.lang.Integer r7 = r8.A03
            int r6 = r7.intValue()
            if (r6 == r9) goto L_0x0999
            if (r6 == r5) goto L_0x0999
            r2 = 4
            if (r6 == r2) goto L_0x0994
            X.Q9O r2 = r0.A02
        L_0x095e:
            r11.setRightAddOnIcon(r2)
        L_0x0961:
            X.SbB r2 = new X.SbB
            r12 = r2
            r13 = r16
            r14 = r8
            r15 = r0
            r16 = r3
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            X.AnonymousClass0fU.A00(r2, r11)
            java.lang.Integer r2 = r8.A03
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            if (r2 == r1) goto L_0x0979
            r4 = 1
        L_0x0979:
            r11.setClickable(r4)
            r1 = 0
            X.SRD.A02(r8, r11, r1, r1)
            boolean r1 = r8.A06
            if (r1 != 0) goto L_0x004e
            X.Q9K r1 = r0.A03
            r0 = 8
            r1.setVisibility(r0)
            r11.setClickable(r10)
            X.RFq r0 = X.C8922RFq.A09
            r11.setTextStyle(r0)
            return
        L_0x0994:
            r2 = 0
            r11.setRightAddOnView(r2)
            goto L_0x095e
        L_0x0999:
            X.Q9K r5 = r0.A03
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            boolean r2 = X.AnonymousClass7TF.A1W(r7, r2)
            r5.setChecked(r2)
            r11.setRightAddOnView(r5)
            goto L_0x0961
        L_0x09a8:
            r2 = 0
            goto L_0x092d
        L_0x09aa:
            java.lang.String r2 = r8.A0I
            java.lang.String r2 = X.002.A0R(r15, r2)
            goto L_0x0908
        L_0x09b2:
            java.lang.String r2 = r8.A0D
            r11.setImageUrl(r2)
            X.RGd r2 = r8.A01
            if (r2 == 0) goto L_0x09e7
            X.0qQ.A0A(r7)
            java.lang.String r14 = X.C11091S9q.A01(r7, r2)
            boolean r2 = X.C51966G9m.A1X(r14)
            if (r2 == 0) goto L_0x09e7
            java.util.Locale r13 = X.Pxh.A0w()
            r2 = 2131961189(0x7f132565, float:1.9559068E38)
            java.lang.String r12 = X.AnonymousClass7TE.A16(r7, r2)
            java.lang.String r2 = r8.A05
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r14}
            java.lang.String r2 = X.Pxg.A0v(r12, r13, r2, r5)
        L_0x09dd:
            r11.setPrimaryText(r2)
            java.lang.String r2 = r8.A04
            r11.setSecondaryText(r2)
            goto L_0x0915
        L_0x09e7:
            java.lang.String r2 = r8.A05
            goto L_0x09dd
        L_0x09ea:
            boolean r2 = r3 instanceof X.C7988Qeb
            if (r2 == 0) goto L_0x0a68
            X.QFS r0 = (X.QFS) r0
            r9 = 0
            X.0qQ.A0B(r1, r9)
            r2 = 1
            r10 = 3
            X.0qQ.A0B(r0, r2)
            boolean r2 = X.SUj.A0V(r1)
            if (r2 == 0) goto L_0x0dd7
            java.lang.Object r8 = r1.A01
            if (r8 == 0) goto L_0x180a
            com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem r8 = (com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem) r8
            com.facebookpay.widget.listcell.ListCell r7 = r0.A00
            android.content.Context r12 = X.AnonymousClass7TE.A0S(r7)
            java.util.Locale r11 = X.Pxh.A0w()
            java.lang.String r6 = r8.A02()
            com.facebookpay.common.models.CurrencyAmount r2 = r8.A00()
            java.lang.String r5 = "%1s - %2s"
            r4 = 2
            java.lang.String r2 = X.SRD.A00(r12, r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r6, r2}
            java.lang.String r2 = X.Pxg.A0v(r5, r11, r2, r4)
            r7.setPrimaryText(r2)
            java.lang.String r2 = r8.A01()
            r7.setSecondaryText(r2)
            X.RFq r2 = X.C8922RFq.A0O
            r7.setTextStyle(r2)
            java.lang.Integer r6 = r8.Bs1()
            int r2 = r6.intValue()
            r5 = 1
            if (r2 == r10) goto L_0x0a5a
            if (r2 == r4) goto L_0x0a5a
            X.Q9O r2 = r0.A01
            r7.setRightAddOnIcon(r2)
        L_0x0a47:
            X.SbB r2 = new X.SbB
            r10 = r2
            r11 = r9
            r12 = r8
            r13 = r0
            r14 = r3
            r15 = r1
            r10.<init>(r11, r12, r13, r14, r15)
            X.AnonymousClass0fU.A00(r2, r7)
            r0 = 0
            X.SRD.A02(r8, r7, r0, r0)
            return
        L_0x0a5a:
            X.Q9K r4 = r0.A02
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r6 == r2) goto L_0x0a61
            r5 = 0
        L_0x0a61:
            r4.setChecked(r5)
            r7.setRightAddOnView(r4)
            goto L_0x0a47
        L_0x0a68:
            boolean r2 = r3 instanceof X.C7987Qea
            if (r2 == 0) goto L_0x0ac9
            X.QFR r0 = (X.QFR) r0
            r2 = 0
            X.0qQ.A0B(r1, r2)
            r2 = 1
            r9 = 3
            X.0qQ.A0B(r0, r2)
            java.lang.Object r8 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem r8 = (com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem) r8
            if (r8 == 0) goto L_0x0a99
            com.facebookpay.widget.listcell.ListCell r7 = r0.A00
            java.lang.String r2 = r8.A01
            r7.setPrimaryText(r2)
            java.lang.Integer r6 = r8.A00
            int r4 = r6.intValue()
            r5 = 1
            if (r4 == r9) goto L_0x0abb
            r2 = 2
            if (r4 == r2) goto L_0x0abb
            X.Q9O r2 = r0.A01
            r7.setRightAddOnIcon(r2)
        L_0x0a95:
            r2 = 0
            X.SRD.A02(r8, r7, r2, r2)
        L_0x0a99:
            boolean r2 = X.SUj.A0V(r1)
            if (r2 == 0) goto L_0x0aac
            com.facebookpay.widget.listcell.ListCell r5 = r0.A00
            r4 = 9
            X.SbL r2 = new X.SbL
            r2.<init>((int) r4, (java.lang.Object) r1, (java.lang.Object) r0, (java.lang.Object) r3)
        L_0x0aa8:
            X.AnonymousClass0fU.A00(r2, r5)
            return
        L_0x0aac:
            boolean r2 = X.SUj.A0S(r1)
            if (r2 == 0) goto L_0x0df1
            com.facebookpay.widget.listcell.ListCell r5 = r0.A00
            r0 = 23
            X.SbM r2 = X.C11499SbM.A00(r1, r3, r0)
            goto L_0x0aa8
        L_0x0abb:
            X.Q9K r4 = r0.A02
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r6 == r2) goto L_0x0ac2
            r5 = 0
        L_0x0ac2:
            r4.setChecked(r5)
            r7.setRightAddOnView(r4)
            goto L_0x0a95
        L_0x0ac9:
            boolean r2 = r3 instanceof X.C7974QeN
            if (r2 != 0) goto L_0x004e
            boolean r2 = r3 instanceof X.C8002Qep
            if (r2 == 0) goto L_0x0ada
            r2 = r3
            X.Qep r2 = (X.C8002Qep) r2
            X.QFQ r0 = (X.QFQ) r0
            r2.A0B(r0, r1)
            return
        L_0x0ada:
            boolean r2 = r3 instanceof X.C7986QeZ
            if (r2 == 0) goto L_0x0e05
            r8 = r3
            X.QeZ r8 = (X.C7986QeZ) r8
            X.QEz r0 = (X.C7470QEz) r0
            r6 = 0
            boolean r9 = X.AnonymousClass7TF.A1U(r6, r1, r0)
            boolean r2 = X.SUj.A0V(r1)
            if (r2 == 0) goto L_0x0b9a
            com.facebookpay.widget.listcell.ListCell r5 = r0.A00
            r5.A02()
            java.lang.Object r1 = r1.A01
            if (r1 == 0) goto L_0x181b
            com.facebookpay.common.recyclerview.adapteritems.IncentiveItem r1 = (com.facebookpay.common.recyclerview.adapteritems.IncentiveItem) r1
            r5.setVisibility(r6)
            java.util.List r7 = r1.A01
            boolean r0 = X.AnonymousClass7TE.A1b(r7)
            if (r0 == 0) goto L_0x0b56
            java.util.Locale r4 = X.Pxh.A0w()
            boolean r3 = r1.A02
            android.view.ContextThemeWrapper r2 = r8.A00
            r0 = 2131961218(0x7f132582, float:1.9559127E38)
            if (r3 == 0) goto L_0x0b14
            r0 = 2131961217(0x7f132581, float:1.9559125E38)
        L_0x0b14:
            java.lang.String r1 = r2.getString(r0)
            X.0qQ.A0A(r1)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r0 = X.Pxg.A0v(r1, r4, r0, r6)
            r5.setPrimaryText(r0)
            int r0 = r7.size()
            if (r0 <= r9) goto L_0x0b4f
            java.util.Locale r4 = X.Pxh.A0w()
            r1 = 2131961214(0x7f13257e, float:1.9559119E38)
            if (r3 == 0) goto L_0x0b36
            r1 = 2131961215(0x7f13257f, float:1.955912E38)
        L_0x0b36:
            int r0 = r7.size()
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r0)
            java.lang.String r1 = r2.getString(r1, r0)
            X.0qQ.A0A(r1)
        L_0x0b45:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r0 = X.Pxg.A0v(r1, r4, r0, r6)
        L_0x0b4b:
            r5.setSecondaryText(r0)
            return
        L_0x0b4f:
            java.lang.Object r0 = X.00k.A0I(r7)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0b4b
        L_0x0b56:
            boolean r0 = r1.A02
            r4 = 0
            if (r0 == 0) goto L_0x0b6f
            java.util.Locale r2 = X.Pxh.A0w()
            android.view.ContextThemeWrapper r1 = r8.A00
            r0 = 2131961216(0x7f132580, float:1.9559123E38)
            java.lang.String r0 = A03(r1, r2, r0)
            r5.setPrimaryText(r0)
            r5.setSecondaryText(r4)
            return
        L_0x0b6f:
            int r3 = r1.A00
            if (r3 <= 0) goto L_0x180f
            java.util.Locale r2 = X.Pxh.A0w()
            android.view.ContextThemeWrapper r1 = r8.A00
            r0 = 2131961221(0x7f132585, float:1.9559133E38)
            java.lang.String r0 = A03(r1, r2, r0)
            r5.setPrimaryText(r0)
            java.util.Locale r4 = X.Pxh.A0w()
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131820698(0x7f11009a, float:1.9274118E38)
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r3)
            java.lang.String r1 = r2.getQuantityString(r1, r3, r0)
            X.0qQ.A07(r1)
            goto L_0x0b45
        L_0x0b9a:
            boolean r2 = X.SUj.A0T(r1)
            if (r2 == 0) goto L_0x0df9
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A08(r0)
            android.view.ContextThemeWrapper r1 = r8.A00
            r0 = 2131961223(0x7f132587, float:1.9559137E38)
            goto L_0x02e7
        L_0x0bae:
            java.lang.Object r9 = r1.A01
            r8 = r9
            com.facebookpay.common.recyclerview.adapteritems.PuxContactItem r8 = (com.facebookpay.common.recyclerview.adapteritems.PuxContactItem) r8
            if (r8 == 0) goto L_0x0bfa
            boolean r2 = r8.A07
            if (r2 != r4) goto L_0x0bfa
            com.facebookpay.widget.listcell.ListCell r6 = r0.A00
            r6.setRightAddOnIcon(r7)
            r6.setEnabled(r5)
        L_0x0bc1:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.C18674VwX.A01(r6, r0, r7)
            r6.A02()
            android.view.View$OnClickListener r0 = r3.A00
            X.AnonymousClass0fU.A00(r0, r6)
            boolean r5 = X.SUj.A0V(r1)
            java.lang.String r4 = A04(r3, r6)
            if (r5 == 0) goto L_0x0bf7
            java.lang.String r2 = "contact_info"
        L_0x0bda:
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r0 = new com.facebookpay.expresscheckout.logging.ComponentLoggingData
            r0.<init>(r7, r4, r2)
            r6.A0M = r0
            if (r5 == 0) goto L_0x0cf1
            if (r9 == 0) goto L_0x1790
            java.lang.String r0 = r8.A04
            r6.setPrimaryText(r0)
            java.lang.String r0 = r8.A05
            r6.setSecondaryText(r0)
            java.lang.String r0 = r8.A06
            r6.setTertiaryText(r0)
            boolean r0 = r3.A01
            goto L_0x0c5e
        L_0x0bf7:
            java.lang.String r2 = "add_contact_info"
            goto L_0x0bda
        L_0x0bfa:
            com.facebookpay.widget.listcell.ListCell r6 = r0.A00
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r6)
            X.Q9O r2 = new X.Q9O
            r2.<init>(r0)
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0c15
            X.RH3 r0 = X.RH3.A0V
        L_0x0c0b:
            r2.setIcon(r0)
            r6.setRightAddOnIcon(r2)
            r6.setEnabled(r4)
            goto L_0x0bc1
        L_0x0c15:
            X.RH3 r0 = X.RH3.A0J
            goto L_0x0c0b
        L_0x0c18:
            java.lang.Object r8 = r1.A01
            r3 = r8
            com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem r3 = (com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem) r3
            if (r3 == 0) goto L_0x0c76
            boolean r0 = r3.A05
            if (r0 != r7) goto L_0x0c76
            r6.setRightAddOnIcon(r5)
            r6.setEnabled(r2)
        L_0x0c29:
            r6.A02()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.C18674VwX.A01(r6, r0, r5)
            boolean r9 = X.SUj.A0V(r1)
            java.lang.String r7 = A04(r4, r6)
            if (r9 == 0) goto L_0x0c69
            java.lang.String r2 = "shipping_address"
        L_0x0c3e:
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r0 = new com.facebookpay.expresscheckout.logging.ComponentLoggingData
            r0.<init>(r5, r7, r2)
            r6.A0M = r0
            if (r9 == 0) goto L_0x0c92
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem"
            X.0qQ.A0C(r8, r0)
            java.lang.String r0 = r3.A03
            r6.setPrimaryText(r0)
            java.lang.String r0 = r3.A02
            r6.setSecondaryText(r0)
            java.lang.String r0 = r3.A04
            r6.setTertiaryText(r0)
            boolean r0 = r4.A01
        L_0x0c5e:
            if (r0 == 0) goto L_0x0c66
            X.RFq r0 = X.C8922RFq.A0I
        L_0x0c62:
            r6.setTextStyle(r0)
            return
        L_0x0c66:
            X.RFq r0 = X.C8922RFq.A0B
            goto L_0x0c62
        L_0x0c69:
            java.lang.Throwable r0 = r1.A02
            boolean r0 = r0 instanceof X.TQq
            if (r0 == 0) goto L_0x0c73
            java.lang.String r2 = "shipping_address_inline_error"
            goto L_0x0c3e
        L_0x0c73:
            java.lang.String r2 = "add_shipping_address"
            goto L_0x0c3e
        L_0x0c76:
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r6)
            X.Q9O r2 = new X.Q9O
            r2.<init>(r0)
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0c8f
            X.RH3 r0 = X.RH3.A0V
        L_0x0c85:
            r2.setIcon(r0)
            r6.setRightAddOnIcon(r2)
            r6.setEnabled(r7)
            goto L_0x0c29
        L_0x0c8f:
            X.RH3 r0 = X.RH3.A0J
            goto L_0x0c85
        L_0x0c92:
            java.lang.Throwable r3 = r1.A02
            boolean r0 = r3 instanceof X.TQq
            java.lang.String r2 = "null cannot be cast to non-null type com.facebookpay.common.exceptions.PuxComponentException"
            if (r0 == 0) goto L_0x0cdc
            r0 = 2131961263(0x7f1325af, float:1.9559218E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0ca2:
            int r1 = r0.intValue()
            android.view.ContextThemeWrapper r0 = r4.A01
            java.lang.String r0 = r0.getString(r1)
        L_0x0cac:
            r6.setPrimaryText(r0)
            r6.setSecondaryText(r5)
            r6.setTertiaryText(r5)
            boolean r0 = r3 instanceof X.C13216TQh
            if (r0 == 0) goto L_0x0cd2
            X.0qQ.A0C(r3, r2)
            X.TQh r3 = (X.C13216TQh) r3
            X.RH2 r0 = r3.A01
        L_0x0cc0:
            r6.setPrimaryTextStyle(r0)
            X.Q9Q r2 = r6.A0P
            if (r2 == 0) goto L_0x004e
            android.content.Context r1 = r6.getContext()
            r0 = 2131961302(0x7f1325d6, float:1.9559297E38)
            X.DbU.A12(r1, r2, r0)
            return
        L_0x0cd2:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0cd9
            X.RH2 r0 = X.RH2.A1C
            goto L_0x0cc0
        L_0x0cd9:
            X.RH2 r0 = X.RH2.A0Y
            goto L_0x0cc0
        L_0x0cdc:
            boolean r0 = r3 instanceof X.C13216TQh
            if (r0 == 0) goto L_0x0cef
            X.0qQ.A0C(r3, r2)
            r0 = r3
            X.TQh r0 = (X.C13216TQh) r0
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0cef
            goto L_0x0ca2
        L_0x0cef:
            r0 = r5
            goto L_0x0cac
        L_0x0cf1:
            java.lang.Throwable r5 = r1.A02
            boolean r4 = r5 instanceof X.C13216TQh
            java.lang.String r2 = "null cannot be cast to non-null type com.facebookpay.common.exceptions.PuxComponentException"
            if (r4 == 0) goto L_0x0d3e
            X.0qQ.A0C(r5, r2)
            r0 = r5
            X.TQh r0 = (X.C13216TQh) r0
            int r1 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0d3e
            android.content.Context r0 = r6.getContext()
            java.lang.String r0 = r0.getString(r1)
        L_0x0d10:
            r6.setPrimaryText(r0)
            r6.setSecondaryText(r7)
            r6.setTertiaryText(r7)
            if (r4 == 0) goto L_0x0d34
            X.0qQ.A0C(r5, r2)
            X.TQh r5 = (X.C13216TQh) r5
            X.RH2 r0 = r5.A01
        L_0x0d22:
            r6.setPrimaryTextStyle(r0)
            X.Q9Q r2 = r6.A0P
            if (r2 == 0) goto L_0x004e
            android.content.Context r1 = r6.getContext()
            r0 = 2131961302(0x7f1325d6, float:1.9559297E38)
            X.DbU.A12(r1, r2, r0)
            return
        L_0x0d34:
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0d3b
            X.RH2 r0 = X.RH2.A1C
            goto L_0x0d22
        L_0x0d3b:
            X.RH2 r0 = X.RH2.A0Y
            goto L_0x0d22
        L_0x0d3e:
            r0 = r7
            goto L_0x0d10
        L_0x0d40:
            boolean r0 = X.SUj.A0T(r1)
            if (r0 == 0) goto L_0x0d61
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r2.A08(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A09(r0)
            r2.setOnClickListener(r5)
            X.C18674VwX.A00(r2, r5, r0, r5, r5)
            r0 = 2131961242(0x7f13259a, float:1.9559175E38)
            java.lang.String r0 = r14.getString(r0)
            r2.setShimmerAccessibilityLabel(r0)
            return
        L_0x0d61:
            r2.A02()
            if (r11 == 0) goto L_0x0d82
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.common.exceptions.PuxComponentException"
            X.0qQ.A0C(r4, r0)
            r1 = r4
            X.TQh r1 = (X.C13216TQh) r1
            int r0 = r1.A00
            X.Pxh.A13(r14, r2, r0)
            X.RH2 r0 = r1.A01
            r2.setPrimaryTextStyle(r0)
            r2.setSecondaryText(r5)
            r2.setRightAddOnIcon(r5)
            r2.setOnClickListener(r5)
        L_0x0d82:
            boolean r0 = r4 instanceof X.C7972QeL
            if (r0 == 0) goto L_0x004e
            android.view.View$OnClickListener r0 = r3.A00
            X.AnonymousClass0fU.A00(r0, r2)
            X.Q9O r1 = new X.Q9O
            r1.<init>(r14)
            X.RH3 r0 = X.RH3.A0V
            r1.setIcon(r0)
            r2.setRightAddOnIcon(r1)
            return
        L_0x0d99:
            boolean r2 = X.SUj.A0T(r1)
            if (r2 == 0) goto L_0x0da6
            com.facebookpay.widget.listcell.ListCell r3 = r0.A00
            r3.setOnClickListener(r9)
            goto L_0x1769
        L_0x0da6:
            boolean r1 = X.SUj.A0S(r1)
            if (r1 == 0) goto L_0x004e
            com.facebookpay.widget.listcell.ListCell r0 = r0.A00
            A06(r0)
            return
        L_0x0db2:
            com.facebookpay.widget.listcell.ListCell r3 = r0.A00
            goto L_0x0df3
        L_0x0db5:
            boolean r1 = X.SUj.A0T(r1)
            if (r1 == 0) goto L_0x004e
            com.facebookpay.widget.listcell.ListCell r2 = r0.A01
            r1 = 0
            r2.setOnClickListener(r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.2eS.A04(r2, r1)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r0.A00
            r2.setRightAddOnView(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r2.A08(r0)
            r2.A09(r1)
            r2.A04()
            return
        L_0x0dd7:
            boolean r3 = X.SUj.A0T(r1)
            r2 = 0
            if (r3 == 0) goto L_0x0de5
            com.facebookpay.widget.listcell.ListCell r3 = r0.A00
            r3.setOnClickListener(r2)
            goto L_0x1769
        L_0x0de5:
            boolean r1 = X.SUj.A0S(r1)
            if (r1 == 0) goto L_0x004e
            com.facebookpay.widget.listcell.ListCell r0 = r0.A00
            A06(r0)
            return
        L_0x0df1:
            com.facebookpay.widget.listcell.ListCell r3 = r0.A00
        L_0x0df3:
            r0 = 0
            r3.setOnClickListener(r0)
            goto L_0x1769
        L_0x0df9:
            boolean r1 = X.SUj.A0S(r1)
            if (r1 == 0) goto L_0x004e
            com.facebookpay.widget.listcell.ListCell r0 = r0.A00
            r0.A02()
            return
        L_0x0e05:
            boolean r2 = r3 instanceof X.C7985QeY
            if (r2 == 0) goto L_0x0efe
            r6 = r3
            X.QeY r6 = (X.C7985QeY) r6
            X.QFP r0 = (X.QFP) r0
            r9 = 0
            boolean r8 = X.AnonymousClass7TF.A1U(r9, r1, r0)
            boolean r2 = X.SUj.A0V(r1)
            if (r2 == 0) goto L_0x004e
            java.lang.Object r1 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.IncentiveSummaryItem r1 = (com.facebookpay.common.recyclerview.adapteritems.IncentiveSummaryItem) r1
            r4 = 0
            if (r1 == 0) goto L_0x0e2c
            java.util.List r3 = r1.A01
            int r1 = r1.A00
            if (r1 != 0) goto L_0x0e51
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x0e51
        L_0x0e2c:
            com.facebookpay.widget.listcell.ListCell r7 = r0.A00
            X.Q9S r1 = r0.A01
            r7.setLeftAddOnView(r1)
            android.view.ContextThemeWrapper r2 = r6.A00
            r1 = 2131961219(0x7f132583, float:1.9559129E38)
            X.Pxh.A13(r2, r7, r1)
            X.RH2 r1 = X.RH2.A14
            r7.setPrimaryTextStyle(r1)
            r7.setPrimaryTextAddOnView(r4)
        L_0x0e43:
            r7.A03()
            X.Q9O r0 = r0.A02
            r7.setRightAddOnIcon(r0)
            android.view.View$OnClickListener r0 = r6.A00
            X.AnonymousClass0fU.A00(r0, r7)
            return
        L_0x0e51:
            android.view.ContextThemeWrapper r10 = r6.A00
            X.Q9Q r5 = new X.Q9Q
            r5.<init>(r10)
            java.util.Locale r7 = java.util.Locale.getDefault()
            android.content.Context r2 = r5.getContext()
            r1 = 2131961219(0x7f132583, float:1.9559129E38)
            java.lang.String r1 = A03(r2, r7, r1)
            r5.setText(r1)
            X.RH2 r1 = X.RH2.A14
            r5.setTextStyle(r1)
            com.facebookpay.widget.listcell.ListCell r7 = r0.A00
            r7.setLeftAddOnText(r5)
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x0e89
            r7.setPrimaryTextAddOnView(r4)
            r1 = 2131961220(0x7f132584, float:1.955913E38)
            X.Pxh.A13(r10, r7, r1)
            X.RH2 r1 = X.RH2.A0M
            r7.setPrimaryTextStyle(r1)
            goto L_0x0e43
        L_0x0e89:
            X.0qQ.A0B(r10, r8)
            X.Q9H r8 = new X.Q9H
            r8.<init>(r10, r4, r9)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r10)
            r1 = 2131625255(0x7f0e0527, float:1.8877713E38)
            android.view.View r1 = r2.inflate(r1, r8, r9)
            r8.addView(r1)
            r1 = 2131434656(0x7f0b1ca0, float:1.8491132E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r8.A00 = r1
            r7.setPrimaryText(r4)
            r7.setPrimaryTextAddOnView(r8)
            android.widget.TextView r2 = r7.A0E
            if (r2 == 0) goto L_0x1820
            r1 = 8
            r2.setVisibility(r1)
            android.widget.FrameLayout r1 = r8.A00
            java.lang.String r9 = "container"
            if (r1 == 0) goto L_0x1932
            r1.removeAllViews()
            java.util.Iterator r4 = r3.iterator()
        L_0x0ec6:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0ee1
            java.lang.String r3 = X.AnonymousClass7TE.A18(r4)
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r8)
            X.Q9J r2 = new X.Q9J
            r2.<init>(r1, r3)
            android.widget.FrameLayout r1 = r8.A00
            if (r1 == 0) goto L_0x1932
            r1.addView(r2)
            goto L_0x0ec6
        L_0x0ee1:
            int r4 = r5.getPaddingLeft()
            android.content.res.Resources r2 = X.DbU.A05(r7)
            r1 = 2131165190(0x7f070006, float:1.794459E38)
            float r1 = r2.getDimension(r1)
            int r3 = (int) r1
            int r2 = r5.getPaddingRight()
            int r1 = r5.getPaddingBottom()
            r5.setPadding(r4, r3, r2, r1)
            goto L_0x0e43
        L_0x0efe:
            boolean r2 = r3 instanceof X.C8000Qen
            if (r2 == 0) goto L_0x0ff3
            r6 = r3
            X.Qen r6 = (X.C8000Qen) r6
            X.QFJ r0 = (X.QFJ) r0
            r4 = 0
            boolean r7 = X.AnonymousClass7TF.A1U(r4, r1, r0)
            boolean r3 = X.SUj.A0V(r1)
            r2 = 8
            if (r3 == 0) goto L_0x0fe2
            com.facebook.shimmer.ShimmerFrameLayout r3 = r0.A01
            r3.A05()
            java.lang.Object r11 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.EmailOptInItem r11 = (com.facebookpay.common.recyclerview.adapteritems.EmailOptInItem) r11
            if (r11 == 0) goto L_0x1987
            X.C7X r10 = r11.A01
            if (r10 == 0) goto L_0x1987
            java.lang.String r8 = "text"
            java.lang.String r1 = r10.getOptionalStringField(r4, r8)
            if (r1 == 0) goto L_0x1987
            boolean r1 = X.00l.A0W(r1)
            if (r1 != 0) goto L_0x1987
            android.widget.CheckBox r5 = r0.A00
            boolean r1 = r11.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            java.lang.String r9 = "Required value was null."
            if (r0 == 0) goto L_0x1982
            r5.setChecked(r1)
            boolean r2 = r11.A04
            boolean r0 = X.AnonymousClass7TF.A1S(r2, r7)
            r0 = r0 ^ 1
            r5.setEnabled(r0)
            r1 = 4
            X.Sbs r0 = new X.Sbs
            r0.<init>(r6, r1)
            r5.setOnCheckedChangeListener(r0)
            java.lang.String r8 = r10.getOptionalStringField(r4, r8)
            if (r8 == 0) goto L_0x197d
            java.lang.String r9 = r11.A03
            if (r9 == 0) goto L_0x0fa8
            com.google.common.collect.ImmutableList r0 = r10.A0E()
            if (r0 == 0) goto L_0x0fa5
            java.lang.Object r1 = X.00k.A0J(r0)
            X.3lr r1 = (X.C250663lr) r1
            if (r1 == 0) goto L_0x0fa5
            if (r2 != r7) goto L_0x0fc9
            X.0sn r10 = X.0sn.A00
            java.lang.String r0 = "length"
            int r11 = r1.getCoercedIntField(r7, r0)
            java.lang.String r0 = "offset"
            int r9 = r1.A00(r0)
            X.SPB r2 = X.AnonymousClass2E0.A0A()
            r1 = 17
            android.view.ContextThemeWrapper r0 = r6.A02
            int r0 = r2.A03(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.Ruh r0 = new X.Ruh
            r0.<init>(r1, r11, r9)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
        L_0x0f97:
            X.AnonymousClass7TF.A1B(r10, r7, r0)
            X.QmZ r1 = new X.QmZ
            r1.<init>(r8, r10, r0)
            X.Tde r0 = r6.A03
            android.text.SpannableString r8 = r1.A01(r0, r7)
        L_0x0fa5:
            X.DbT.A1H(r5)
        L_0x0fa8:
            r5.setText(r8)
            X.RH2 r0 = X.RH2.A0R
            X.SRn.A02(r5, r0)
            android.widget.FrameLayout$LayoutParams r2 = X.JTS.A0D()
            int r1 = r6.A00
            int r0 = r6.A01
            r2.setMargins(r1, r0, r1, r4)
            android.view.ContextThemeWrapper r1 = r6.A02
            X.REP r0 = X.REP.ALL_BORDERED_ALL_ROUNDED
            X.C11386SQz.A01(r1, r3, r0)
            r3.setLayoutParams(r2)
            r5.setVisibility(r4)
            return
        L_0x0fc9:
            java.lang.String r0 = "length"
            int r2 = r1.getCoercedIntField(r7, r0)
            java.lang.String r0 = "offset"
            int r1 = r1.A00(r0)
            X.SF9 r0 = new X.SF9
            r0.<init>(r2, r1, r9)
            java.util.List r10 = X.AnonymousClass7TE.A1I(r0)
            X.0sn r0 = X.0sn.A00
            goto L_0x0f97
        L_0x0fe2:
            boolean r1 = X.SUj.A0T(r1)
            if (r1 == 0) goto L_0x004e
            android.widget.CheckBox r1 = r0.A00
            r1.setVisibility(r2)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r0.A01
            r0.A06(r7)
            return
        L_0x0ff3:
            boolean r2 = r3 instanceof X.C7984QeX
            if (r2 == 0) goto L_0x1030
            X.QFI r0 = (X.QFI) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            boolean r2 = X.SUj.A0V(r1)
            if (r2 == 0) goto L_0x004e
            java.lang.Object r5 = r1.A01
            if (r5 == 0) goto L_0x198d
            com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellItem r5 = (com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellItem) r5
            r1 = 0
            X.0qQ.A0B(r5, r1)
            android.widget.TextView r2 = r0.A01
            java.lang.String r1 = r5.A03
            r2.setText(r1)
            java.lang.String r2 = r5.A01
            java.util.Map r1 = X.RH3.A03
            java.lang.Object r4 = r1.get(r2)
            X.RH3 r4 = (X.RH3) r4
            if (r4 == 0) goto L_0x1028
            android.widget.ImageView r2 = r0.A00
            X.0qQ.A06(r2)
            r1 = 0
            X.C9659Red.A00(r1, r2, r4)
        L_0x1028:
            android.view.View r1 = r0.itemView
            r0 = 22
            X.C11499SbM.A01(r1, r0, r5, r3)
            return
        L_0x1030:
            boolean r2 = r3 instanceof X.C7973QeM
            if (r2 == 0) goto L_0x1051
            X.QFH r0 = (X.QFH) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            boolean r2 = X.SUj.A0V(r1)
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r1.A01
            if (r2 == 0) goto L_0x1992
            com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellSectionHeaderItem r2 = (com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellSectionHeaderItem) r2
            r1 = 0
            X.0qQ.A0B(r2, r1)
            android.widget.TextView r1 = r0.A00
            java.lang.String r0 = r2.A00
            r1.setText(r0)
            return
        L_0x1051:
            boolean r2 = r3 instanceof X.C7993Qeg
            if (r2 == 0) goto L_0x10ac
            X.QFW r0 = (X.QFW) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            boolean r2 = X.SUj.A0V(r1)
            if (r2 == 0) goto L_0x004e
            java.lang.Object r5 = r1.A01
            if (r5 == 0) goto L_0x1997
            com.facebookpay.common.recyclerview.adapteritems.ConfirmationPaymentSectionItem r5 = (com.facebookpay.common.recyclerview.adapteritems.ConfirmationPaymentSectionItem) r5
            r4 = 0
            X.0qQ.A0B(r5, r4)
            android.widget.TextView r2 = r0.A03
            java.lang.String r1 = r5.A03
            r2.setText(r1)
            android.widget.TextView r3 = r0.A01
            java.lang.String r1 = r5.A01
            r3.setText(r1)
            X.Qeg r2 = r0.A05
            r1 = 21
            X.C11499SbM.A01(r3, r1, r5, r2)
            java.lang.String r2 = r5.A04
            if (r2 == 0) goto L_0x10a4
            int r1 = r2.length()
            if (r1 == 0) goto L_0x10a4
            android.widget.TextView r1 = r0.A00
            r1.setVisibility(r4)
            r1.setText(r2)
        L_0x1091:
            java.lang.String r2 = r5.A02
            if (r2 == 0) goto L_0x004e
            int r1 = r2.length()
            if (r1 == 0) goto L_0x004e
            android.widget.TextView r0 = r0.A02
            r0.setText(r2)
            r0.setVisibility(r4)
            return
        L_0x10a4:
            android.widget.TextView r2 = r0.A00
            r1 = 8
            r2.setVisibility(r1)
            goto L_0x1091
        L_0x10ac:
            boolean r2 = r3 instanceof X.C8001Qeo
            if (r2 == 0) goto L_0x10b9
            r2 = r3
            X.Qeo r2 = (X.C8001Qeo) r2
            X.QFG r0 = (X.QFG) r0
            r2.A0B(r0, r1)
            return
        L_0x10b9:
            boolean r2 = r3 instanceof X.C7983QeW
            if (r2 == 0) goto L_0x10e4
            X.QEy r0 = (X.C7469QEy) r0
            r5 = 0
            X.AnonymousClass7TF.A1H(r1, r0)
            java.lang.Object r4 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.AutoAdvanceButtonItem r4 = (com.facebookpay.common.recyclerview.adapteritems.AutoAdvanceButtonItem) r4
            if (r4 == 0) goto L_0x004e
            com.facebookpay.widget.button.FBPayButton r2 = r0.A00
            android.content.Context r1 = r2.getContext()
            int r0 = r4.A00
            X.DbT.A18(r1, r2, r0)
            r0 = 64
            X.C11497SbK.A01(r2, r0, r3)
            X.RFr r0 = X.C8923RFr.A09
            r2.setButtonStyle(r0)
            r0 = 31
            X.C11409SSh.A04(r2, r0, r5)
            return
        L_0x10e4:
            boolean r2 = r3 instanceof X.C8006Qet
            if (r2 == 0) goto L_0x10f1
            r2 = r3
            X.Qet r2 = (X.C8006Qet) r2
            X.QFF r0 = (X.QFF) r0
            r2.A0B(r0, r1)
            return
        L_0x10f1:
            boolean r2 = r3 instanceof X.C8003Qeq
            if (r2 == 0) goto L_0x10fe
            r2 = r3
            X.Qeq r2 = (X.C8003Qeq) r2
            X.QFE r0 = (X.QFE) r0
            r2.A0B(r0, r1)
            return
        L_0x10fe:
            boolean r2 = r3 instanceof X.C8012Qez
            if (r2 == 0) goto L_0x1108
            X.Qf1 r0 = (X.C8014Qf1) r0
            X.C8012Qez.A07(r0, r1)
            return
        L_0x1108:
            boolean r2 = r3 instanceof X.C7982QeV
            if (r2 == 0) goto L_0x1158
            X.QFD r0 = (X.QFD) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            java.lang.Object r2 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem r2 = (com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem) r2
            r6 = 0
            if (r2 == 0) goto L_0x113a
            com.facebookpay.widget.listcell.ListCell r4 = r0.A01
            java.lang.String r2 = r2.A01
            r4.setPrimaryText(r2)
            com.facebookpay.widget.actionmenu.InlineActionMenu r5 = r0.A00
            r4.setActionMenu(r5)
            r4.A01()
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.C18674VwX.A01(r4, r2, r6)
            android.content.Context r4 = r4.getContext()
            r2 = 2131961278(0x7f1325be, float:1.9559248E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r4, r2)
            r5.setEditAccessibility(r2)
        L_0x113a:
            boolean r2 = X.SUj.A0V(r1)
            if (r2 == 0) goto L_0x114c
            com.facebookpay.widget.actionmenu.InlineActionMenu r2 = r0.A00
            r0 = 20
            X.SbM r0 = X.C11499SbM.A00(r1, r3, r0)
            r2.setEditComponentListener(r0)
            return
        L_0x114c:
            com.facebookpay.widget.listcell.ListCell r3 = r0.A01
            r3.setOnClickListener(r6)
            com.facebookpay.widget.actionmenu.InlineActionMenu r0 = r0.A00
            r0.setEditComponentListener(r6)
            goto L_0x1769
        L_0x1158:
            boolean r2 = r3 instanceof X.C8010Qex
            if (r2 == 0) goto L_0x1230
            r6 = r3
            X.Qex r6 = (X.C8010Qex) r6
            X.QFO r0 = (X.QFO) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            boolean r2 = X.SUj.A0V(r1)
            r7 = 0
            if (r2 == 0) goto L_0x1204
            java.lang.Object r5 = r1.A01
            if (r5 == 0) goto L_0x199c
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem r5 = (com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem) r5
            com.facebookpay.widget.listcell.ListCell r9 = r0.A01
            android.content.Context r4 = r9.getContext()
            X.C8010Qex.A07(r0, r6, r1)
            java.lang.String r2 = r5.A09
            if (r2 == 0) goto L_0x11a5
            r9.setQuaternaryText(r2)
            android.content.res.Resources r3 = r4.getResources()
            r2 = 2131165190(0x7f070006, float:1.794459E38)
            int r2 = r3.getDimensionPixelSize(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9.setQuaternaryTextVerticalSpacing(r2)
            android.content.res.Resources r3 = r4.getResources()
            r2 = 2131165249(0x7f070041, float:1.794471E38)
            float r2 = r3.getDimension(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r9.setQuaternaryTextSizePx(r2)
        L_0x11a5:
            X.Q9K r8 = r0.A02
            java.lang.Integer r3 = r5.A01
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            boolean r2 = X.AnonymousClass7TF.A1W(r3, r2)
            r8.setChecked(r2)
            r9.setLeftAddOnView(r8)
            r9.A01()
            java.lang.String r2 = r9.getErrorText()
            if (r2 == 0) goto L_0x1202
            r2 = 2131951849(0x7f1300e9, float:1.9540124E38)
            java.lang.String r7 = r4.getString(r2)
            r2 = 2131961302(0x7f1325d6, float:1.9559297E38)
            java.lang.String r2 = r4.getString(r2)
        L_0x11cc:
            X.SRD.A02(r5, r9, r7, r2)
            com.facebookpay.widget.actionmenu.InlineActionMenu r3 = r0.A00
            r2 = 2131961281(0x7f1325c1, float:1.9559254E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r4, r2)
            r3.setEditAccessibility(r2)
            r2 = 2131961408(0x7f132640, float:1.9559512E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r4, r2)
            r3.setRemoveAccessibility(r2)
            boolean r2 = r5.A0H
            if (r2 == 0) goto L_0x004e
            r2 = 19
            X.SbM r2 = X.C11499SbM.A00(r1, r6, r2)
            r3.setEditComponentListener(r2)
            r8 = 0
            X.ICR r2 = new X.ICR
            r7 = r2
            r9 = r4
            r10 = r5
            r11 = r6
            r12 = r1
            r13 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r3.setRemoveComponentListener(r2)
            return
        L_0x1202:
            r2 = r7
            goto L_0x11cc
        L_0x1204:
            boolean r2 = X.SUj.A0T(r1)
            if (r2 == 0) goto L_0x1219
            com.facebookpay.widget.listcell.ListCell r3 = r0.A01
            r3.setOnClickListener(r7)
            com.facebookpay.widget.actionmenu.InlineActionMenu r0 = r0.A00
            r0.setEditComponentListener(r7)
            r0.setRemoveComponentListener(r7)
            goto L_0x1769
        L_0x1219:
            boolean r1 = X.SUj.A0S(r1)
            if (r1 == 0) goto L_0x004e
            com.facebookpay.widget.listcell.ListCell r1 = r0.A01
            r1.A02()
            A06(r1)
            com.facebookpay.widget.actionmenu.InlineActionMenu r0 = r0.A00
            r0.setEditComponentListener(r7)
            r0.setRemoveComponentListener(r7)
            return
        L_0x1230:
            boolean r2 = r3 instanceof X.C8009Qew
            if (r2 == 0) goto L_0x12a4
            r5 = r3
            X.Qew r5 = (X.C8009Qew) r5
            X.QFN r0 = (X.QFN) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            java.lang.Object r7 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem r7 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem) r7
            if (r7 == 0) goto L_0x127e
            com.facebookpay.widget.listcell.ListCell r6 = r0.A01
            X.Q9K r4 = r0.A02
            java.lang.Integer r3 = r7.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            boolean r2 = X.AnonymousClass7TF.A1W(r3, r2)
            r4.setChecked(r2)
            r6.setLeftAddOnView(r4)
            boolean r2 = r7.A05
            if (r2 != 0) goto L_0x129a
            com.facebookpay.widget.actionmenu.InlineActionMenu r2 = r0.A00
            r2.A00()
        L_0x125d:
            r6.A01()
            r2 = 0
            X.SRD.A02(r7, r6, r2, r2)
            com.facebookpay.widget.actionmenu.InlineActionMenu r4 = r0.A00
            android.content.Context r3 = r6.getContext()
            r2 = 2131961280(0x7f1325c0, float:1.9559252E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r3, r2)
            r4.setEditAccessibility(r2)
            r2 = 2131961407(0x7f13263f, float:1.955951E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r3, r2)
            r4.setRemoveAccessibility(r2)
        L_0x127e:
            boolean r2 = X.SUj.A0V(r1)
            if (r2 != 0) goto L_0x19a1
            boolean r2 = X.SUj.A0S(r1)
            if (r2 != 0) goto L_0x19a1
            com.facebookpay.widget.listcell.ListCell r3 = r0.A01
            r1 = 0
            r3.setOnClickListener(r1)
            com.facebookpay.widget.actionmenu.InlineActionMenu r0 = r0.A00
            r0.setEditComponentListener(r1)
            r0.setRemoveComponentListener(r1)
            goto L_0x1769
        L_0x129a:
            boolean r2 = r7.A06
            if (r2 != 0) goto L_0x125d
            com.facebookpay.widget.actionmenu.InlineActionMenu r2 = r0.A00
            r2.A01()
            goto L_0x125d
        L_0x12a4:
            boolean r2 = r3 instanceof X.C7992Qef
            if (r2 == 0) goto L_0x16df
            r7 = r3
            X.Qef r7 = (X.C7992Qef) r7
            X.QFC r0 = (X.QFC) r0
            r11 = 0
            boolean r9 = X.AnonymousClass7TF.A1U(r11, r1, r0)
            boolean r2 = X.SUj.A0V(r1)
            r6 = 0
            if (r2 == 0) goto L_0x16c6
            java.lang.Object r5 = r1.A01
            if (r5 == 0) goto L_0x1a48
            com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem r5 = (com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem) r5
            boolean r2 = r5 instanceof com.facebookpay.common.recyclerview.adapteritems.SelectionPickupFulfillmentOptionItem
            if (r2 == 0) goto L_0x19d0
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
            X.SRD r16 = X.C9959RkE.A00
            android.content.Context r8 = X.AnonymousClass7TE.A0S(r2)
            java.util.Locale r12 = X.Pxh.A0w()
            r10 = r5
            com.facebookpay.common.recyclerview.adapteritems.SelectionPickupFulfillmentOptionItem r10 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPickupFulfillmentOptionItem) r10
            boolean r3 = r10.A0B
            java.lang.String r13 = r10.A08
            com.facebookpay.common.models.CurrencyAmount r14 = r10.A01
            if (r3 == 0) goto L_0x12f3
            if (r14 == 0) goto L_0x12f3
            java.lang.String r3 = r14.A01
            boolean r3 = X.00l.A0W(r3)
            if (r3 != 0) goto L_0x12f3
            r4 = 2
            java.lang.String r3 = X.SRD.A00(r8, r14)
            java.lang.Object[] r4 = X.Pxf.A1X(r13, r3, r4)
            java.lang.String r3 = "%1s • %2s"
            java.lang.String r13 = X.Pxe.A12(r12, r3, r4)
        L_0x12f3:
            r2.setPrimaryText(r13)
            com.facebookpay.shippingaddress.model.ShippingAddress r14 = r10.A04
            if (r14 == 0) goto L_0x13b0
            java.lang.String r4 = r14.A08
            if (r4 == 0) goto L_0x13ae
            boolean r3 = X.00l.A0W(r4)
            if (r3 != 0) goto L_0x13ae
            java.lang.String r12 = r14.A01
            if (r12 == 0) goto L_0x13ae
            boolean r3 = X.00l.A0W(r12)
            if (r3 != 0) goto L_0x13ae
            java.lang.StringBuilder r13 = X.AnonymousClass7TF.A0n(r4)
            java.lang.String r4 = ", "
            r13.append(r4)
            java.lang.String r3 = r14.A09
            if (r3 == 0) goto L_0x1327
            boolean r15 = X.00l.A0W(r3)
            if (r15 != 0) goto L_0x1327
            r13.append(r3)
            r13.append(r4)
        L_0x1327:
            r13.append(r12)
            java.lang.String r4 = r14.A07
            if (r4 == 0) goto L_0x1334
            boolean r3 = X.00l.A0W(r4)
            if (r3 == 0) goto L_0x1384
        L_0x1334:
            java.lang.String r3 = r14.A06
            if (r3 == 0) goto L_0x133e
            boolean r3 = X.00l.A0W(r3)
            if (r3 == 0) goto L_0x1384
        L_0x133e:
            java.lang.String r3 = r13.toString()
        L_0x1342:
            r2.setSecondaryText(r3)
            boolean r3 = r7.A01
            if (r3 == 0) goto L_0x1637
            X.Q9K r1 = r0.A01
            r0 = 8
            r1.setVisibility(r0)
            java.util.Locale r20 = X.Pxh.A0w()
            java.util.Date r1 = r10.A0A
            java.util.Date r0 = r10.A09
            r17 = r8
            r18 = r1
            r19 = r0
            r21 = r11
            android.text.SpannableStringBuilder r0 = r16.A03(r17, r18, r19, r20, r21)
            r2.setTertiarySpannableText(r0)
            X.RFq r0 = X.C8922RFq.A0O
            r2.setTextStyle(r0)
            X.RH2 r0 = X.RH2.A19
            r2.setTertiaryTextStyle(r0)
            r2.A0B(r9, r11)
            android.content.res.TypedArray r3 = X.SPB.A01(r8, r2)
            X.0qQ.A07(r3)
            android.widget.TextView r2 = r2.A0H
            if (r2 != 0) goto L_0x19b9
            java.lang.String r0 = "tertiaryTextView"
            goto L_0x14df
        L_0x1384:
            java.lang.String r3 = ","
            r13.append(r3)
            if (r4 == 0) goto L_0x1392
            boolean r12 = X.00l.A0W(r4)
            r3 = 0
            if (r12 == 0) goto L_0x1393
        L_0x1392:
            r3 = 1
        L_0x1393:
            java.lang.String r12 = " "
            if (r3 != 0) goto L_0x139d
            r13.append(r12)
            r13.append(r4)
        L_0x139d:
            java.lang.String r4 = r14.A06
            if (r4 == 0) goto L_0x133e
            boolean r3 = X.00l.A0W(r4)
            if (r3 != 0) goto L_0x133e
            r13.append(r12)
            r13.append(r4)
            goto L_0x133e
        L_0x13ae:
            r3 = 0
            goto L_0x1342
        L_0x13b0:
            r3 = r6
            goto L_0x1342
        L_0x13b2:
            java.lang.Object r5 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem r5 = (com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem) r5
            if (r5 == 0) goto L_0x155c
            boolean r2 = r5.A03
            if (r2 != r7) goto L_0x155c
            com.facebookpay.widget.listcell.ListCell r3 = r0.A00
            r3.setRightAddOnIcon(r6)
            r3.setEnabled(r8)
        L_0x13c4:
            r3.A02()
            android.view.View$OnClickListener r0 = r4.A00
            X.AnonymousClass0fU.A00(r0, r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.C18674VwX.A01(r3, r0, r6)
            boolean r11 = X.SUj.A0V(r1)
            java.lang.String r10 = A04(r4, r3)
            if (r11 == 0) goto L_0x154d
            java.lang.String r9 = "payment_method"
        L_0x13de:
            r2 = 0
            com.facebookpay.expresscheckout.logging.ComponentLoggingData r0 = new com.facebookpay.expresscheckout.logging.ComponentLoggingData
            r0.<init>(r2, r10, r9)
            r3.A0M = r0
            if (r11 == 0) goto L_0x15b8
            X.RFq r0 = X.C8922RFq.A08
            r3.setTextStyle(r0)
            if (r5 == 0) goto L_0x154a
            com.facebookpay.paymentmethod.model.PaymentMethod r1 = r5.A01
        L_0x13f1:
            boolean r0 = r1 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r0 == 0) goto L_0x152a
            com.facebookpay.paymentmethod.model.CreditCard r1 = (com.facebookpay.paymentmethod.model.CreditCard) r1
            if (r1 == 0) goto L_0x152a
            boolean r0 = r1 instanceof com.facebookpay.paymentmethod.model.TokenizedCard
            if (r0 == 0) goto L_0x1526
            com.facebookpay.paymentmethod.model.TokenizedCard r1 = (com.facebookpay.paymentmethod.model.TokenizedCard) r1
            boolean r0 = r1.A04
        L_0x1401:
            if (r0 == 0) goto L_0x152a
            com.instagram.common.session.UserSession r9 = X.C11431STx.A00()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314498246249106(0x8103d8002a0a92, double:3.0287731454508414E-306)
            X.182.A06(r2, r9, r0)
            X.STx r0 = X.AnonymousClass2E0.A0D()
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x1435
            boolean r1 = r4.A01
            r0 = 2131434520(0x7f0b1c18, float:1.8490856E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r1 == 0) goto L_0x1515
            X.0qQ.A07(r2)
            r0 = 15
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2132017594(0x7f1401ba, float:1.967347E38)
            r3.A06(r2, r1, r0)
        L_0x1435:
            X.STx r0 = X.AnonymousClass2E0.A0D()
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x152a
            if (r5 == 0) goto L_0x1512
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = r5.A01
        L_0x1443:
            boolean r0 = r0 instanceof com.facebookpay.paymentmethod.model.TokenizedCard
            if (r0 == 0) goto L_0x152a
            com.facebookpay.paymentmethod.model.PaymentMethod r11 = r5.A01
            java.lang.String r10 = "null cannot be cast to non-null type com.facebookpay.paymentmethod.model.TokenizedCard"
            X.0qQ.A0C(r11, r10)
            r9 = r11
            com.facebookpay.paymentmethod.model.TokenizedCard r9 = (com.facebookpay.paymentmethod.model.TokenizedCard) r9
            java.lang.String r2 = r9.A03
            if (r2 == 0) goto L_0x152c
            boolean r0 = X.00l.A0W(r2)
            if (r0 != 0) goto L_0x152c
            X.0qQ.A0C(r11, r10)
            java.lang.String r1 = r9.A02
            if (r1 == 0) goto L_0x152c
            boolean r0 = X.00l.A0W(r1)
            if (r0 != 0) goto L_0x152c
            X.0qQ.A0C(r11, r10)
            r0 = 2131165563(0x7f07017b, float:1.7945347E38)
            r3.A05(r0, r1)
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x14fa
            java.lang.String r1 = " •••• "
            java.lang.String r0 = X.Pxj.A0q(r9)
            java.lang.String r0 = X.002.A0g(r2, r1, r0)
            r3.setPrimaryText(r0)
        L_0x1483:
            com.facebookpay.paymentmethod.model.PaymentMethod r2 = r5.A01
            if (r2 == 0) goto L_0x004e
            X.XRm r1 = r2.Asn()
            X.XRm r0 = X.C21267XRm.A08
            if (r1 == r0) goto L_0x14ef
            boolean r0 = r2 instanceof com.facebookpay.paymentmethod.model.APMCredential
            if (r0 != 0) goto L_0x14ef
            boolean r0 = r2 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r0 == 0) goto L_0x14ae
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x14e9
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x14e9
            r3.setSecondaryTextLineBreaks(r7)
            r0 = r2
            com.facebookpay.paymentmethod.model.CreditCard r0 = (com.facebookpay.paymentmethod.model.CreditCard) r0
            X.TlY r0 = r0.A00
            java.lang.String r0 = X.SRD.A01(r0)
        L_0x14ab:
            r3.setSecondaryText(r0)
        L_0x14ae:
            java.lang.String r0 = r3.getSecondaryText()
            if (r0 == 0) goto L_0x14e7
            r0 = 2131440874(0x7f0b34ea, float:1.8503744E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L_0x14bb:
            r6 = 2131438192(0x7f0b2a70, float:1.8498304E38)
            android.widget.TextView r5 = X.AnonymousClass7TE.A0d(r3, r6)
            if (r5 == 0) goto L_0x14d5
            r0 = 16
            r5.setGravity(r0)
            android.view.ViewTreeObserver r1 = r5.getViewTreeObserver()
            X.IDy r0 = new X.IDy
            r0.<init>(r8, r5, r7, r3)
            r1.addOnGlobalLayoutListener(r0)
        L_0x14d5:
            X.Q9Q r0 = r3.A0P
            if (r0 == 0) goto L_0x1589
            android.widget.FrameLayout r0 = r3.A06
            if (r0 != 0) goto L_0x1583
            java.lang.String r0 = "leftAddOnContainer"
        L_0x14df:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x14e7:
            r7 = 0
            goto L_0x14bb
        L_0x14e9:
            java.lang.String r0 = new java.lang.String
            r0.<init>()
            goto L_0x14ab
        L_0x14ef:
            java.lang.String r0 = r2.getSubtitle()
            r3.setSecondaryText(r0)
            r3.setSecondaryTextLineBreaks(r7)
            goto L_0x14ae
        L_0x14fa:
            r3.setPrimaryText(r2)
            java.lang.String r1 = "•••• "
            java.lang.String r0 = X.Pxj.A0q(r9)
            java.lang.String r0 = X.002.A0R(r1, r0)
            r3.setSecondaryText(r0)
            X.RH2 r0 = X.RH2.A0Q
            r3.setSecondaryTextStyle(r0)
            goto L_0x1483
        L_0x1512:
            r0 = r6
            goto L_0x1443
        L_0x1515:
            X.0qQ.A07(r2)
            r0 = 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2132017593(0x7f1401b9, float:1.9673469E38)
            r3.A06(r2, r1, r0)
            goto L_0x1435
        L_0x1526:
            boolean r0 = r1.A04
            goto L_0x1401
        L_0x152a:
            if (r5 == 0) goto L_0x1548
        L_0x152c:
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = r5.A01
            if (r0 == 0) goto L_0x1548
            java.lang.String r0 = r0.BEP()
        L_0x1534:
            r3.setImageUrl(r0)
            if (r5 == 0) goto L_0x1541
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = r5.A01
            if (r0 == 0) goto L_0x1541
            java.lang.String r6 = r0.getTitle()
        L_0x1541:
            r3.setPrimaryText(r6)
            if (r5 == 0) goto L_0x004e
            goto L_0x1483
        L_0x1548:
            r0 = r6
            goto L_0x1534
        L_0x154a:
            r1 = r6
            goto L_0x13f1
        L_0x154d:
            java.lang.Throwable r0 = r1.A02
            boolean r0 = r0 instanceof X.TQq
            if (r0 == 0) goto L_0x1558
            java.lang.String r9 = "payment_method_inline_error"
            goto L_0x13de
        L_0x1558:
            java.lang.String r9 = "add_payment_info"
            goto L_0x13de
        L_0x155c:
            com.facebookpay.widget.listcell.ListCell r3 = r0.A00
            if (r5 == 0) goto L_0x156d
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x156d
            r2 = r6
        L_0x1565:
            r3.setRightAddOnIcon(r2)
            r3.setEnabled(r7)
            goto L_0x13c4
        L_0x156d:
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r3)
            X.Q9O r2 = new X.Q9O
            r2.<init>(r0)
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x1580
            X.RH3 r0 = X.RH3.A0V
        L_0x157c:
            r2.setIcon(r0)
            goto L_0x1565
        L_0x1580:
            X.RH3 r0 = X.RH3.A0J
            goto L_0x157c
        L_0x1583:
            X.2dQ r0 = X.Pxj.A0N(r0)
            r0.A0u = r6
        L_0x1589:
            boolean r0 = r2 instanceof com.facebookpay.paymentmethod.model.APMCredential
            if (r0 == 0) goto L_0x004e
            android.content.Context r1 = r3.getContext()
            r0 = 2131961225(0x7f132589, float:1.955914E38)
            java.lang.String r0 = r1.getString(r0)
            r3.setTertiaryText(r0)
            X.0sa r0 = r4.A01
            if (r0 == 0) goto L_0x004e
            r1 = 66
            X.SbK r0 = new X.SbK
            r0.<init>(r4, r1)
            r3.setTertiaryTextOnClickListener(r0)
            X.RH2 r0 = X.RH2.A0O
            r3.setTertiaryTextStyle(r0)
            X.AnonymousClass2E0.A0A()
            r0 = 2132017601(0x7f1401c1, float:1.9673485E38)
            r3.setTertiaryTextViewStyleRes(r0)
            return
        L_0x15b8:
            r3.setImageUrl(r6)
            java.lang.Throwable r5 = r1.A02
            boolean r0 = r5 instanceof X.TQq
            java.lang.String r2 = "null cannot be cast to non-null type com.facebookpay.common.exceptions.PuxComponentException"
            if (r0 == 0) goto L_0x15d6
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.expresscheckout.exceptions.EcpComponentInlineException"
            X.0qQ.A0C(r5, r0)
            r0 = r5
            X.TQq r0 = (X.TQq) r0
            java.lang.Integer r0 = r0.A01
            if (r0 != 0) goto L_0x15e1
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x15d6:
            boolean r0 = r5 instanceof X.TQU
            if (r0 == 0) goto L_0x1622
            r0 = 2131961256(0x7f1325a8, float:1.9559204E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x15e1:
            int r1 = r0.intValue()
            android.content.Context r0 = r3.getContext()
            java.lang.String r0 = r0.getString(r1)
        L_0x15ed:
            r3.setPrimaryText(r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>()
            r3.setSecondaryText(r0)
            r3.setTertiaryText(r6)
            boolean r0 = r5 instanceof X.C13216TQh
            if (r0 == 0) goto L_0x1618
            X.0qQ.A0C(r5, r2)
            X.TQh r5 = (X.C13216TQh) r5
            X.RH2 r0 = r5.A01
        L_0x1606:
            r3.setPrimaryTextStyle(r0)
            X.Q9Q r2 = r3.A0P
            if (r2 == 0) goto L_0x004e
            android.content.Context r1 = r3.getContext()
            r0 = 2131961302(0x7f1325d6, float:1.9559297E38)
            X.DbU.A12(r1, r2, r0)
            return
        L_0x1618:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x161f
            X.RH2 r0 = X.RH2.A1C
            goto L_0x1606
        L_0x161f:
            X.RH2 r0 = X.RH2.A0Y
            goto L_0x1606
        L_0x1622:
            boolean r0 = r5 instanceof X.C13216TQh
            if (r0 == 0) goto L_0x1635
            X.0qQ.A0C(r5, r2)
            r0 = r5
            X.TQh r0 = (X.C13216TQh) r0
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x1635
            goto L_0x15e1
        L_0x1635:
            r0 = r6
            goto L_0x15ed
        L_0x1637:
            r2.A01()
            com.facebookpay.common.models.Distance r15 = r10.A02
            if (r15 == 0) goto L_0x1686
            X.Q9R r11 = new X.Q9R
            r11.<init>(r8)
            android.content.Context r13 = X.AnonymousClass7TE.A0S(r11)
            java.util.Locale r12 = X.Pxh.A0w()
            r14 = 2
            java.lang.Integer r3 = r15.A01
            int r4 = r3.intValue()
            r3 = 2131961211(0x7f13257b, float:1.9559113E38)
            if (r4 != r9) goto L_0x165a
            r3 = 2131961210(0x7f13257a, float:1.955911E38)
        L_0x165a:
            java.lang.String r13 = r13.getString(r3)
            X.0qQ.A0A(r13)
            double r3 = r15.A00
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object[] r4 = X.Pxf.A1X(r3, r13, r14)
            java.lang.String r3 = "%1s %2s"
            java.lang.String r3 = X.Pxe.A12(r12, r3, r4)
            r11.setText(r3)
            r2.setRightAddOnText(r11)
            android.widget.FrameLayout r3 = r2.A09
            if (r3 == 0) goto L_0x19c5
            X.2dQ r4 = X.Pxj.A0N(r3)
            r3 = 2131438192(0x7f0b2a70, float:1.8498304E38)
            r4.A0u = r3
            r4.A0F = r3
        L_0x1686:
            java.lang.Boolean r3 = r10.A05
            boolean r3 = X.AnonymousClass7TF.A1Y(r3, r9)
            if (r3 == 0) goto L_0x16ad
            r3 = 2131961251(0x7f1325a3, float:1.9559194E38)
            java.lang.String r3 = r8.getString(r3)
            r2.setTertiaryText(r3)
            X.RFq r3 = X.C8922RFq.A0O
            r2.setTextStyle(r3)
            X.RH2 r3 = X.RH2.A1D
            r2.setTertiaryTextStyle(r3)
            X.Q9R r4 = r2.A0Q
            if (r4 == 0) goto L_0x1a02
            X.RH2 r3 = X.RH2.A14
            r4.setTextStyle(r3)
            goto L_0x1a02
        L_0x16ad:
            X.RFq r0 = X.C8922RFq.A0K
            r2.setTextStyle(r0)
            r0 = 2131961253(0x7f1325a5, float:1.9559198E38)
            java.lang.String r0 = r8.getString(r0)
            r2.setTertiaryText(r0)
            X.Q9R r1 = r2.A0Q
            if (r1 == 0) goto L_0x004e
            X.RH2 r0 = X.RH2.A15
            r1.setTextStyle(r0)
            return
        L_0x16c6:
            boolean r2 = X.SUj.A0T(r1)
            if (r2 == 0) goto L_0x16d3
            com.facebookpay.widget.listcell.ListCell r3 = r0.A00
            r3.setOnClickListener(r6)
            goto L_0x1769
        L_0x16d3:
            boolean r1 = X.SUj.A0S(r1)
            if (r1 == 0) goto L_0x004e
            com.facebookpay.widget.listcell.ListCell r0 = r0.A00
            A06(r0)
            return
        L_0x16df:
            boolean r2 = r3 instanceof X.C8008Qev
            if (r2 == 0) goto L_0x1a65
            r5 = r3
            X.Qev r5 = (X.C8008Qev) r5
            X.QFM r0 = (X.QFM) r0
            X.AnonymousClass7TG.A1N(r1, r0)
            java.lang.Object r7 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem r7 = (com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem) r7
            if (r7 == 0) goto L_0x1730
            com.facebookpay.widget.listcell.ListCell r6 = r0.A01
            X.Q9K r4 = r0.A02
            java.lang.Integer r3 = r7.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            boolean r2 = X.AnonymousClass7TF.A1W(r3, r2)
            r4.setChecked(r2)
            r6.setLeftAddOnView(r4)
            boolean r2 = r7.A05
            if (r2 != 0) goto L_0x174b
            com.facebookpay.widget.actionmenu.InlineActionMenu r2 = r0.A00
            r2.A00()
        L_0x170c:
            com.facebookpay.widget.actionmenu.InlineActionMenu r4 = r0.A00
            r6.setActionMenu(r4)
            r6.A01()
            r2 = 0
            X.SRD.A02(r7, r6, r2, r2)
            android.content.Context r3 = r6.getContext()
            r2 = 2131961276(0x7f1325bc, float:1.9559244E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r3, r2)
            r4.setEditAccessibility(r2)
            r2 = 2131961406(0x7f13263e, float:1.9559508E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r3, r2)
            r4.setRemoveAccessibility(r2)
        L_0x1730:
            boolean r2 = X.SUj.A0V(r1)
            if (r2 != 0) goto L_0x1a4d
            boolean r2 = X.SUj.A0S(r1)
            if (r2 != 0) goto L_0x1a4d
            com.facebookpay.widget.listcell.ListCell r3 = r0.A01
            r1 = 0
            r3.setOnClickListener(r1)
            com.facebookpay.widget.actionmenu.InlineActionMenu r0 = r0.A00
            r0.setEditComponentListener(r1)
            r0.setRemoveComponentListener(r1)
            goto L_0x1769
        L_0x174b:
            boolean r2 = r7.A06
            if (r2 != 0) goto L_0x170c
            com.facebookpay.widget.actionmenu.InlineActionMenu r2 = r0.A00
            r2.A01()
            goto L_0x170c
        L_0x1755:
            boolean r3 = X.SUj.A0T(r1)
            r2 = 0
            if (r3 == 0) goto L_0x176f
            X.C8013Qf0.A07(r0)
            com.facebookpay.widget.actionmenu.InlineActionMenu r1 = r0.A00
            r1.setEditComponentListener(r2)
            r1.setRemoveComponentListener(r2)
            com.facebookpay.widget.listcell.ListCell r3 = r0.A02
        L_0x1769:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.2eS.A04(r3, r0)
            return
        L_0x176f:
            boolean r1 = X.SUj.A0S(r1)
            if (r1 == 0) goto L_0x004e
            com.facebookpay.widget.listcell.ListCell r1 = r0.A02
            r1.A02()
            r1.setOnClickListener(r2)
            com.facebookpay.widget.actionmenu.InlineActionMenu r0 = r0.A00
            r0.setEditComponentListener(r2)
            r0.setRemoveComponentListener(r2)
            return
        L_0x1786:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x178b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x1790:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x1795:
            r8.setPriceTableRowDataList(r7)
            return
        L_0x1799:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x179e:
            boolean r2 = X.SUj.A0T(r1)
            com.facebookpay.widget.pricetable.PriceTable r7 = r0.A00
            if (r2 == 0) goto L_0x17e0
            java.lang.Object r8 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxPriceTableItem r8 = (com.facebookpay.common.recyclerview.adapteritems.PuxPriceTableItem) r8
            if (r8 == 0) goto L_0x17e0
            java.util.ArrayList r1 = r8.A02
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r1)
            java.util.Iterator r9 = r1.iterator()
        L_0x17b6:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x17e0
            java.lang.Object r5 = r9.next()
            com.facebookpay.expresscheckout.models.PriceInfo r5 = (com.facebookpay.expresscheckout.models.PriceInfo) r5
            java.lang.Integer r2 = r8.A01
            java.lang.Integer r1 = r8.A00
            java.lang.String r11 = X.C7981QeU.A07(r0, r4, r5, r2, r1)
            X.RFW r2 = r5.A01
            X.RFW r1 = X.RFW.TOTAL
            boolean r13 = X.AnonymousClass7TF.A1W(r2, r1)
            java.lang.String r12 = "-"
            X.S6W r10 = new X.S6W
            r14 = r13
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r6.add(r10)
            goto L_0x17b6
        L_0x17e0:
            r7.setPriceTableRowDataList(r6)
            return
        L_0x17e4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x17e9:
            com.facebookpay.widget.banner.FBPayBanner r0 = r0.A00
            r0.setVisibility(r2)
            return
        L_0x17ef:
            com.facebookpay.widget.listcell.ListCell r0 = r0.A00
            r0.setOnClickListener(r6)
            return
        L_0x17f5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x17fa:
            com.facebookpay.widget.listcell.ListCell r0 = r0.A00
            r0.setOnClickListener(r6)
            return
        L_0x1800:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x1805:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x180a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x180f:
            r5.setPrimaryText(r4)
            r5.setSecondaryText(r4)
            r0 = 8
            r5.setVisibility(r0)
            return
        L_0x181b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x1820:
            java.lang.String r9 = "primaryTextView"
            goto L_0x1932
        L_0x1825:
            java.lang.Object r8 = r1.A01
            r6 = r8
            com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem r6 = (com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem) r6
            if (r6 == 0) goto L_0x1831
            boolean r2 = r6.A08
            r1 = 1
            if (r2 == r9) goto L_0x1832
        L_0x1831:
            r1 = 0
        L_0x1832:
            com.facebookpay.widget.listcell.ListCell r5 = r0.A00
            if (r1 == 0) goto L_0x195e
            r5.setRightAddOnIcon(r7)
            r5.setEnabled(r4)
        L_0x183c:
            r5.A02()
            r1 = 67
            X.C11497SbK.A01(r5, r1, r3)
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            X.C18674VwX.A01(r5, r3, r7)
            java.lang.String r1 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem"
            X.0qQ.A0C(r8, r1)
            com.facebookpay.common.models.CurrencyAmount r8 = r6.A02
            android.widget.TextView r2 = r5.A0E
            if (r2 == 0) goto L_0x1820
            r1 = 8
            r2.setVisibility(r1)
            X.SGX r10 = X.SGX.A00
            java.lang.String r2 = r8.A00
            java.lang.String r8 = r8.A01
            java.math.BigDecimal r1 = new java.math.BigDecimal
            r1.<init>(r8)
            java.lang.String r1 = r10.A00(r2, r1)
            r5.setPrimaryText(r1)
            boolean r1 = r6.A09
            if (r1 == 0) goto L_0x1954
            com.facebookpay.common.models.CurrencyAmount r1 = r6.A01
            java.lang.String r9 = r1.A00
            java.lang.String r7 = r1.A01
            java.math.BigDecimal r1 = new java.math.BigDecimal
            r1.<init>(r7)
            java.lang.String r1 = r10.A00(r9, r1)
            android.text.SpannableString r11 = new android.text.SpannableString
            r11.<init>(r1)
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r2.<init>(r7)
            java.math.BigDecimal r1 = new java.math.BigDecimal
            r1.<init>(r8)
            java.math.BigDecimal r8 = r2.subtract(r1)
            X.0qQ.A07(r8)
            android.text.style.StrikethroughSpan r7 = new android.text.style.StrikethroughSpan
            r7.<init>()
            int r2 = r11.length()
            r1 = 33
            r11.setSpan(r7, r4, r2, r1)
            android.content.Context r7 = X.AnonymousClass7TE.A0S(r5)
            X.Q9R r2 = new X.Q9R
            r2.<init>(r7)
            X.RH2 r1 = X.RH2.A0f
            r2.setTextStyle(r1)
            r2.setSpannableString(r11)
            r5.setPrimaryTextAddOnView(r2)
            r2 = 2131961254(0x7f1325a6, float:1.95592E38)
            java.lang.String r1 = r10.A00(r9, r8)
            java.lang.String r1 = X.DbW.A0h(r7, r1, r2)
        L_0x18c2:
            r5.setSecondaryText(r1)
            boolean r1 = r6.A0A
            if (r1 == 0) goto L_0x1946
            java.lang.String r9 = r6.A06
            if (r9 == 0) goto L_0x193a
            java.util.Locale r8 = X.Pxh.A0w()
            r7 = 2
            android.content.Context r2 = r5.getContext()
            r1 = 2131961212(0x7f13257c, float:1.9559115E38)
            java.lang.String r1 = r2.getString(r1)
            java.lang.Object[] r2 = X.Pxf.A1X(r1, r9, r7)
            java.lang.String r1 = "%1s\n%2s"
            java.lang.String r1 = java.lang.String.format(r8, r1, r2)
        L_0x18e7:
            X.0qQ.A07(r1)
        L_0x18ea:
            r5.setTertiaryText(r1)
            com.facebookpay.expresscheckout.models.ItemDetails r2 = r6.A04
            java.lang.Integer r1 = r2.A01
            if (r1 != r3) goto L_0x191d
            java.lang.String r7 = r2.A00
            if (r7 == 0) goto L_0x191d
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r5)
            r1 = 2131961353(0x7f132609, float:1.95594E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r3, r1)
            boolean r1 = r6.A08
            java.lang.CharSequence r1 = X.C9657Reb.A00(r3, r2, r7, r1)
            r5.setQuaternaryLinkableText(r1)
            android.content.res.Resources r2 = r3.getResources()
            r1 = 2131165306(0x7f07007a, float:1.7944825E38)
            float r1 = r2.getDimension(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r5.setQuaternaryTextSizePx(r1)
        L_0x191d:
            X.Q9a r1 = r0.A01
            java.util.List r0 = r6.A07
            r1.setImageThumbnailUrls(r0)
            int r0 = r6.A00
            r1.setNumItems(r0)
            r5.setLeftAddOnView(r1)
            android.widget.FrameLayout r0 = r5.A06
            if (r0 != 0) goto L_0x1974
            java.lang.String r9 = "leftAddOnContainer"
        L_0x1932:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x193a:
            android.content.Context r2 = r5.getContext()
            r1 = 2131961212(0x7f13257c, float:1.9559115E38)
            java.lang.String r1 = r2.getString(r1)
            goto L_0x18e7
        L_0x1946:
            com.facebookpay.expresscheckout.models.ItemDetails r1 = r6.A04
            java.lang.Integer r1 = r1.A01
            if (r1 != r3) goto L_0x1951
            java.lang.String r1 = r6.A05
            if (r1 == 0) goto L_0x1951
            goto L_0x18ea
        L_0x1951:
            java.lang.String r1 = r6.A06
            goto L_0x18ea
        L_0x1954:
            r5.setPrimaryTextAddOnView(r7)
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            goto L_0x18c2
        L_0x195e:
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r5)
            X.Q9O r2 = new X.Q9O
            r2.<init>(r1)
            X.RH3 r1 = X.RH3.A0V
            r2.setIcon(r1)
            r5.setRightAddOnIcon(r2)
            r5.setEnabled(r9)
            goto L_0x183c
        L_0x1974:
            X.2dQ r0 = X.Pxj.A0N(r0)
            r0.A0u = r4
            r0.A0F = r4
            return
        L_0x197d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x1982:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x1987:
            android.widget.CheckBox r0 = r0.A00
            r0.setVisibility(r2)
            return
        L_0x198d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x1992:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x1997:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x199c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x19a1:
            X.C8009Qew.A07(r0, r5, r1)
            com.facebookpay.widget.actionmenu.InlineActionMenu r4 = r0.A00
            r2 = 18
            X.SbM r2 = X.C11499SbM.A00(r1, r5, r2)
            r4.setEditComponentListener(r2)
            r3 = 6
            X.SbL r2 = new X.SbL
            r2.<init>((X.QFN) r0, (X.C8009Qew) r5, (X.SUj) r1, (int) r3)
            r4.setRemoveComponentListener(r2)
            return
        L_0x19b9:
            r1 = 31
            r0 = 2132017598(0x7f1401be, float:1.9673479E38)
            X.C11409SSh.A00(r3, r2, r1, r0)
            r3.recycle()
            return
        L_0x19c5:
            java.lang.String r0 = "rightAddOnContainer"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x19d0:
            boolean r3 = r5 instanceof com.facebookpay.common.recyclerview.adapteritems.SelectionShippingFulfillmentOptionItem
            com.facebookpay.widget.listcell.ListCell r2 = r0.A00
            r2.A01()
            X.SRD r8 = X.C9959RkE.A00
            if (r3 == 0) goto L_0x1a21
            android.content.Context r9 = X.AnonymousClass7TE.A0S(r2)
            java.util.Locale r14 = X.Pxh.A0w()
            r3 = r5
            com.facebookpay.common.recyclerview.adapteritems.SelectionShippingFulfillmentOptionItem r3 = (com.facebookpay.common.recyclerview.adapteritems.SelectionShippingFulfillmentOptionItem) r3
            java.util.Date r12 = r3.A07
            java.util.Date r13 = r3.A06
            com.facebookpay.common.models.CurrencyAmount r10 = r3.A01
            java.lang.String r11 = r3.A05
            java.lang.String r3 = r8.A04(r9, r10, r11, r12, r13, r14)
            r2.setPrimaryText(r3)
            if (r12 != 0) goto L_0x19fa
            if (r13 != 0) goto L_0x19fa
            r11 = 0
        L_0x19fa:
            r2.setSecondaryText(r11)
            X.RFq r3 = X.C8922RFq.A0O
            r2.setTextStyle(r3)
        L_0x1a02:
            X.Q9K r8 = r0.A01
            java.lang.Integer r4 = r5.Bs1()
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            boolean r3 = X.AnonymousClass7TF.A1W(r4, r3)
            r8.setChecked(r3)
            r2.setLeftAddOnView(r8)
            r4 = 5
            X.SbL r3 = new X.SbL
            r3.<init>((int) r4, (java.lang.Object) r1, (java.lang.Object) r0, (java.lang.Object) r7)
            X.AnonymousClass0fU.A00(r3, r2)
            X.SRD.A02(r5, r2, r6, r6)
            return
        L_0x1a21:
            android.content.Context r11 = X.AnonymousClass7TE.A0S(r2)
            java.util.Locale r10 = X.Pxh.A0w()
            java.lang.String r9 = r5.A02()
            com.facebookpay.common.models.CurrencyAmount r3 = r5.A00()
            java.lang.String r8 = "%1s - %2s"
            r4 = 2
            java.lang.String r3 = X.SRD.A00(r11, r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r9, r3}
            java.lang.String r3 = X.Pxg.A0v(r8, r10, r3, r4)
            r2.setPrimaryText(r3)
            java.lang.String r11 = r5.A01()
            goto L_0x19fa
        L_0x1a48:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x1a4d:
            X.C8008Qev.A07(r0, r5, r1)
            com.facebookpay.widget.actionmenu.InlineActionMenu r4 = r0.A00
            r2 = 17
            X.SbM r2 = X.C11499SbM.A00(r1, r5, r2)
            r4.setEditComponentListener(r2)
            r3 = 3
            X.SbL r2 = new X.SbL
            r2.<init>((X.QFM) r0, (X.C8008Qev) r5, (X.SUj) r1, (int) r3)
            r4.setRemoveComponentListener(r2)
            return
        L_0x1a65:
            r2 = r3
            X.Qes r2 = (X.C8005Qes) r2
            X.QEx r0 = (X.C7468QEx) r0
            r2.A0B(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QEW.A0A(X.3kE, X.SUj):void");
    }
}
