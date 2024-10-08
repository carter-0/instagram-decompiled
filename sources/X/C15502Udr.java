package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Udr  reason: case insensitive filesystem */
public final class C15502Udr extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return AnonymousClass05K.A00(7).length;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        C17569VaN vaN = (C17569VaN) obj;
        AnonymousClass7TG.A1N(r2, vaN);
        r2.A7U(vaN.A00.intValue());
    }

    public C15502Udr(Context context) {
        this.A00 = context;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b1, code lost:
        r1.setVisibility(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r11, android.view.View r12, java.lang.Object r13, java.lang.Object r14) {
        /*
            r10 = this;
            r0 = -983867889(0xffffffffc55b5e0f, float:-3509.8787)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r6 = 1
            int r9 = X.DbW.A02(r6, r12, r13)
            r0 = 7
            int r0 = X.C13989Tnp.A08(r0, r11)
            switch(r0) {
                case 0: goto L_0x0020;
                case 1: goto L_0x0020;
                case 2: goto L_0x0020;
                case 3: goto L_0x0020;
                case 4: goto L_0x00b5;
                case 5: goto L_0x0083;
                case 6: goto L_0x0083;
                default: goto L_0x0014;
            }
        L_0x0014:
            X.Wub r1 = new X.Wub
            r1.<init>()
            r0 = 911917168(0x365ac070, float:3.2596545E-6)
            X.AnonymousClass0fD.A0A(r0, r3)
            throw r1
        L_0x0020:
            android.content.Context r8 = r10.A00
            java.lang.Object r4 = r12.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.business.promote.binder.PromotePaymentRowViewBinder.Holder"
            X.0qQ.A0C(r4, r0)
            X.UDe r4 = (X.C14876UDe) r4
            X.VaN r13 = (X.C17569VaN) r13
            r7 = 0
            X.0qQ.A0B(r8, r7)
            r2 = 3
            X.0qQ.A0B(r4, r6)
            X.0qQ.A0B(r13, r9)
            android.widget.TextView r1 = r4.A02
            java.lang.CharSequence r0 = r13.A04
            r1.setText(r0)
            r1.setVisibility(r7)
            java.lang.Integer r0 = r13.A00
            int r0 = r0.intValue()
            r5 = 8
            if (r0 == r2) goto L_0x0074
            if (r0 != r9) goto L_0x00cc
            java.lang.CharSequence r1 = r13.A05
            if (r1 == 0) goto L_0x005c
            android.widget.TextView r0 = r4.A03
            r0.setText(r1)
            r0.setVisibility(r7)
        L_0x005c:
            X.0iw r2 = r13.A02
            if (r2 == 0) goto L_0x0069
            com.instagram.common.typedurl.ImageUrl r1 = r13.A03
            if (r1 == 0) goto L_0x0069
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r4.A04
            r0.setUrl(r1, r2)
        L_0x0069:
            android.widget.ImageView r0 = r4.A01
            r0.setVisibility(r5)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r4.A04
            r0.setVisibility(r7)
            goto L_0x00cc
        L_0x0074:
            int r0 = X.2Yu.A0D(r8)
            X.DbT.A17(r8, r1, r0)
            android.view.View$OnClickListener r0 = r13.A01
            X.AnonymousClass0fU.A00(r0, r1)
            android.widget.ImageView r1 = r4.A01
            goto L_0x00b1
        L_0x0083:
            java.lang.Object r4 = r12.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteTaxRowViewBinder.Holder"
            X.0qQ.A0C(r4, r0)
            X.UD2 r4 = (X.UD2) r4
            X.VaN r13 = (X.C17569VaN) r13
            boolean r5 = X.DbW.A1S(r6, r4, r13)
            android.widget.TextView r2 = r4.A00
            java.lang.CharSequence r0 = r13.A04
            r2.setText(r0)
            r2.setVisibility(r5)
            java.lang.Integer r1 = r13.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 != r0) goto L_0x00a8
            r0 = 0
            r2.setTypeface(r0, r6)
        L_0x00a8:
            java.lang.CharSequence r0 = r13.A05
            if (r0 == 0) goto L_0x00cc
            android.widget.TextView r1 = r4.A01
            r1.setText(r0)
        L_0x00b1:
            r1.setVisibility(r5)
            goto L_0x00cc
        L_0x00b5:
            java.lang.Object r1 = r12.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.business.promote.binder.PromotePaymentInlineFooterRowViewBinder.Holder"
            X.0qQ.A0C(r1, r0)
            X.UBg r1 = (X.C14827UBg) r1
            X.VaN r13 = (X.C17569VaN) r13
            X.Dba.A0j(r6, r1, r13)
            com.instagram.common.ui.base.IgTextView r1 = r1.A00
            java.lang.CharSequence r0 = r13.A04
            X.DbX.A1G(r1, r0)
        L_0x00cc:
            r0 = 1892198957(0x70c8aa2d, float:4.9682185E29)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15502Udr.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final View createView(int i, ViewGroup viewGroup) {
        IgTextView igTextView;
        Object obj;
        int A04 = DbX.A04(viewGroup, 818330304);
        switch (C13989Tnp.A08(7, i)) {
            case 0:
            case 1:
            case 2:
            case 3:
                igTextView = (ViewGroup) DbW.A09(DbT.A0B(this.A00), viewGroup, R.layout.promote_row_with_chevron, false);
                obj = new C14876UDe(igTextView);
                break;
            case 4:
                igTextView = C13989Tnp.A0V(DbT.A0B(this.A00), viewGroup, R.layout.promote_payment_inline_footer);
                obj = new C14827UBg(igTextView);
                break;
            case 5:
            case 6:
                igTextView = (ViewGroup) DbW.A09(DbT.A0B(this.A00), viewGroup, R.layout.promote_row_with_subtitle_text, false);
                obj = new UD2(igTextView);
                break;
            default:
                RuntimeException runtimeException = new RuntimeException();
                AnonymousClass0fD.A0A(1171396499, A04);
                throw runtimeException;
        }
        igTextView.setTag(obj);
        AnonymousClass0fD.A0A(1318008119, A04);
        return igTextView;
    }
}
