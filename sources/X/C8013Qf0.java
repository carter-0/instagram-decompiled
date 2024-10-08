package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.listcell.ListCell;
import java.util.Map;

/* renamed from: X.Qf0  reason: case insensitive filesystem */
public final class C8013Qf0 extends QEW {
    public final Context A00;
    public final AnonymousClass07Z A01;
    public final QDN A02;
    public final C8007Qeu A03;
    public final Map A04 = AnonymousClass7TE.A1H();
    public final 0sP A05;
    public final 0sP A06;
    public final 0sL A07;
    public final 0sJ A08;
    public final boolean A09;
    public final boolean A0A;

    public C8013Qf0(Context context, AnonymousClass07Z r4, QDN qdn, LoggingContext loggingContext, C8007Qeu qeu, 0sP r8, 0sP r9, 0sL r10, 0sJ r11, boolean z, boolean z2) {
        super(RH6.A07, loggingContext, false);
        this.A06 = r8;
        this.A05 = r9;
        this.A07 = r10;
        this.A08 = r11;
        this.A00 = context;
        this.A01 = r4;
        this.A0A = z;
        this.A09 = z2;
        this.A03 = qeu;
        this.A02 = qdn;
    }

    public static final void A07(C8018Qf5 qf5) {
        ListCell listCell = qf5.A02;
        listCell.setOnClickListener((View.OnClickListener) null);
        listCell.setPrimaryText((String) null);
        listCell.setSecondaryText((String) null);
        listCell.setTertiaryText((String) null);
        listCell.setErrorText((String) null);
        AnonymousClass7TH.A0R(listCell.A07);
        listCell.setCustomView((FrameLayout) null);
        listCell.setActionMenu((FrameLayout) null);
        listCell.setImageUrl((String) null);
        listCell.A08(AnonymousClass05K.A0Y);
        Integer num = AnonymousClass05K.A00;
        listCell.A09(num);
        listCell.A0A(num);
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0194  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(X.C8018Qf5 r13, X.C8013Qf0 r14, X.SUj r15) {
        /*
            com.facebookpay.widget.listcell.ListCell r2 = r13.A02
            r2.A02()
            java.lang.Object r6 = r15.A01
            java.lang.String r0 = "Required value was null."
            if (r6 == 0) goto L_0x01c4
            com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r6 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem) r6
            android.content.Context r3 = r2.getContext()
            X.XRm r1 = r6.A09
            X.XRm r0 = X.C21267XRm.A08
            r7 = 0
            boolean r12 = X.AnonymousClass7TF.A1W(r1, r0)
            boolean r8 = r6.A0J
            r10 = 2
            if (r8 == 0) goto L_0x016c
            X.STx r0 = X.AnonymousClass2E0.A0D()
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x016c
            java.lang.String r1 = r6.A0G
            if (r1 == 0) goto L_0x016c
            boolean r0 = X.00l.A0W(r1)
            if (r0 != 0) goto L_0x016c
            java.lang.String r5 = r6.A0H
            if (r5 == 0) goto L_0x016c
            boolean r0 = X.00l.A0W(r5)
            if (r0 != 0) goto L_0x016c
            r0 = 2131165563(0x7f07017b, float:1.7945347E38)
            r2.A05(r0, r1)
            X.RGd r0 = r6.A01
            java.lang.String r11 = " •••• "
            if (r0 == 0) goto L_0x0164
            X.0qQ.A0A(r3)
            java.lang.String r9 = X.C11091S9q.A01(r3, r0)
            boolean r0 = X.C51966G9m.A1X(r9)
            if (r0 == 0) goto L_0x0164
            java.util.Locale r4 = X.Pxh.A0w()
            r0 = 2131961189(0x7f132565, float:1.9559068E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r3, r0)
            java.lang.String r0 = r6.A0I
            java.lang.String r0 = X.002.A0R(r11, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r9}
            java.lang.String r0 = X.Pxg.A0v(r1, r4, r0, r10)
        L_0x006f:
            java.lang.String r0 = X.002.A0R(r5, r0)
        L_0x0073:
            r2.setPrimaryText(r0)
            X.STx r0 = X.AnonymousClass2E0.A0D()
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0095
            if (r8 == 0) goto L_0x0095
            r0 = 2131434520(0x7f0b1c18, float:1.8490856E38)
            android.view.View r4 = X.AnonymousClass7TE.A0b(r2, r0)
            r0 = 15
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2132017594(0x7f1401ba, float:1.967347E38)
            r2.A06(r4, r1, r0)
        L_0x0095:
            boolean r0 = r14.A09
            if (r0 == 0) goto L_0x013c
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x013c
            java.lang.Integer r1 = r6.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x013c
            X.QFA r1 = r13.A01
            if (r1 == 0) goto L_0x0139
            androidx.fragment.app.FragmentContainerView r0 = r1.A00
        L_0x00a9:
            r2.setCustomView(r0)
            android.widget.FrameLayout r0 = r2.A04
            X.AnonymousClass7TH.A0R(r0)
            if (r1 == 0) goto L_0x00b8
            java.util.Map r0 = r14.A04
            r0.put(r13, r1)
        L_0x00b8:
            r5 = 0
            r2.setErrorText(r5)
        L_0x00bc:
            if (r12 == 0) goto L_0x00e5
            com.facebookpay.widget.actionmenu.InlineActionMenu r4 = r13.A00
            android.widget.TextView r0 = r4.A02
            if (r0 != 0) goto L_0x00cf
            java.lang.String r0 = "removeView"
        L_0x00c7:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00cf:
            r0.setVisibility(r7)
            android.widget.TextView r0 = r4.A01
            if (r0 != 0) goto L_0x00d9
            java.lang.String r0 = "editView"
            goto L_0x00c7
        L_0x00d9:
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r4.A00
            if (r0 != 0) goto L_0x0126
            java.lang.String r0 = "dividerView"
            goto L_0x00c7
        L_0x00e5:
            java.lang.Integer r1 = r6.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x012f
            r0 = 1
            r2.setSecondaryTextLineBreaks(r0)
            X.TlY r1 = r6.A08
            if (r1 == 0) goto L_0x0129
            boolean r0 = r14.A0A
            if (r0 == 0) goto L_0x0129
            java.lang.String r0 = X.SRD.A01(r1)
            r2.setSecondaryText(r0)
            java.lang.String r0 = r6.A04
            r2.setTertiaryText(r0)
        L_0x0103:
            X.Q9K r4 = r13.A03
            java.lang.Integer r1 = r6.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            r4.setChecked(r0)
            r2.setLeftAddOnView(r4)
            android.widget.FrameLayout r0 = r2.A07
            if (r0 == 0) goto L_0x011a
            r0.setVisibility(r7)
        L_0x011a:
            com.facebookpay.widget.actionmenu.InlineActionMenu r4 = r13.A00
            r2.setActionMenu(r4)
            android.widget.ImageView r0 = r2.A0B
            if (r0 != 0) goto L_0x0194
            java.lang.String r0 = "imageView"
            goto L_0x00c7
        L_0x0126:
            r0.setVisibility(r1)
        L_0x0129:
            java.lang.String r0 = r6.A04
            r2.setSecondaryText(r0)
            goto L_0x0103
        L_0x012f:
            r2.setSecondaryTextLineBreaks(r7)
            r2.setSecondaryText(r5)
            r2.setTertiaryText(r5)
            goto L_0x0103
        L_0x0139:
            r0 = 0
            goto L_0x00a9
        L_0x013c:
            X.QRJ r1 = r6.A00
            if (r1 == 0) goto L_0x0148
            java.lang.String r0 = "error_msg"
            java.lang.String r0 = r1.getOptionalStringField(r7, r0)
            if (r0 != 0) goto L_0x0154
        L_0x0148:
            java.lang.Integer r0 = r6.A02
            if (r0 == 0) goto L_0x0162
            int r0 = r0.intValue()
            java.lang.String r0 = r3.getString(r0)
        L_0x0154:
            r2.setErrorText(r0)
            r5 = 0
            r2.setCustomView(r5)
            java.util.Map r0 = r14.A04
            r0.remove(r13)
            goto L_0x00bc
        L_0x0162:
            r0 = 0
            goto L_0x0154
        L_0x0164:
            java.lang.String r0 = r6.A0I
            java.lang.String r0 = X.002.A0R(r11, r0)
            goto L_0x006f
        L_0x016c:
            java.lang.String r0 = r6.A0D
            r2.setImageUrl(r0)
            X.RGd r9 = r6.A01
            if (r9 == 0) goto L_0x0190
            java.util.Locale r5 = X.Pxh.A0w()
            r0 = 2131961189(0x7f132565, float:1.9559068E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r3, r0)
            java.lang.String r1 = r6.A05
            java.lang.String r0 = X.C11091S9q.A01(r3, r9)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = X.Pxg.A0v(r4, r5, r0, r10)
            goto L_0x0073
        L_0x0190:
            java.lang.String r0 = r6.A05
            goto L_0x0073
        L_0x0194:
            X.2dQ r1 = X.Pxj.A0N(r0)
            r1.A0u = r7
            r0 = 2131432465(0x7f0b1411, float:1.8486688E38)
            r1.A0F = r0
            r2.A01()
            X.SRD.A02(r6, r2, r5, r5)
            r0 = 2131961279(0x7f1325bf, float:1.955925E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r3, r0)
            r4.setEditAccessibility(r0)
            r0 = 2131961405(0x7f13263d, float:1.9559506E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r3, r0)
            r4.setRemoveAccessibility(r0)
            r1 = 11
            X.SbL r0 = new X.SbL
            r0.<init>((int) r1, (java.lang.Object) r15, (java.lang.Object) r13, (java.lang.Object) r14)
            X.AnonymousClass0fU.A00(r0, r2)
            return
        L_0x01c4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8013Qf0.A08(X.Qf5, X.Qf0, X.SUj):void");
    }
}
