package X;

import android.util.SparseArray;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;

public final class QEb extends 2Rw {
    public ImmutableList A00;
    public final SparseArray A01;

    public QEb(SparseArray sparseArray) {
        0qQ.A0B(sparseArray, 1);
        this.A01 = sparseArray;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.QEm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.QEs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: X.QEm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: X.QEm} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r13, int r14) {
        /*
            r12 = this;
            r5 = 0
            X.0qQ.A0B(r13, r5)
            com.google.common.collect.ImmutableList r0 = r12.A00
            X.0qQ.A0A(r0)
            java.lang.Object r6 = r0.get(r14)
            X.SEo r6 = (X.C11188SEo) r6
            X.SEE r3 = r6.A02
            if (r3 == 0) goto L_0x0025
            android.view.View r2 = r13.itemView
            java.lang.Integer r1 = r3.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x001e
            X.2eS.A04(r2, r1)
        L_0x001e:
            java.lang.String r0 = r3.A01
            if (r0 == 0) goto L_0x0025
            r2.setContentDescription(r0)
        L_0x0025:
            android.view.View r1 = r13.itemView
            int r0 = r6.A01
            r1.setId(r0)
            boolean r0 = r6 instanceof X.Qmt
            if (r0 == 0) goto L_0x00a0
            X.Qmt r6 = (X.Qmt) r6
            boolean r0 = r13 instanceof X.QEq
            if (r0 == 0) goto L_0x045d
            r4 = r13
            X.QEq r4 = (X.QEq) r4
            int r2 = r6.A01
            if (r2 == 0) goto L_0x004f
            android.widget.TextView r1 = r4.A03
            android.content.Context r0 = X.DbS.A07(r13)
            X.0qQ.A0B(r0, r5)
            android.util.TypedValue r0 = X.Pxj.A0J(r0, r2)
            int r0 = r0.data
            r1.setTextColor(r0)
        L_0x004f:
            android.widget.TextView r3 = r4.A03
            java.lang.String r2 = r6.A05
            int r1 = r6.A02
            r3.setVisibility(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x009c
            if (r1 == 0) goto L_0x009a
            r3.setText(r1)
        L_0x0063:
            android.widget.TextView r3 = r4.A02
            java.lang.String r0 = r6.A04
            X.C11094S9v.A01(r3, r0, r5)
            android.widget.TextView r2 = r4.A01
            r1 = 0
            int r0 = r6.A00
            X.C11094S9v.A01(r2, r1, r0)
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x007a
            r0 = 4
            r2.setVisibility(r0)
        L_0x007a:
            boolean r1 = r6.A08
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == 0) goto L_0x0082
            r0 = 1
        L_0x0082:
            r3.setMaxLines(r0)
            android.view.View$OnClickListener r1 = r6.A03
            if (r1 == 0) goto L_0x008e
            android.view.View r0 = r4.itemView
            X.AnonymousClass0fU.A00(r1, r0)
        L_0x008e:
            android.widget.ImageView r1 = r4.A00
            boolean r0 = r6.A07
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
        L_0x0099:
            return
        L_0x009a:
            java.lang.String r2 = ""
        L_0x009c:
            r3.setText(r2)
            goto L_0x0063
        L_0x00a0:
            boolean r0 = r6 instanceof X.Qmo
            if (r0 == 0) goto L_0x00ee
            X.Qmo r6 = (X.Qmo) r6
            boolean r0 = r13 instanceof X.QEp
            if (r0 == 0) goto L_0x0462
            r1 = r13
            X.QEp r1 = (X.QEp) r1
            android.widget.TextView r9 = r1.A02
            java.lang.String r8 = r6.A02
            r7 = 8
            r0 = 0
            if (r8 != 0) goto L_0x00b8
            r0 = 8
        L_0x00b8:
            r9.setVisibility(r0)
            android.widget.TextView r4 = r1.A01
            java.lang.String r3 = r6.A01
            r0 = 0
            if (r3 != 0) goto L_0x00c4
            r0 = 8
        L_0x00c4:
            r4.setVisibility(r0)
            android.widget.ImageView r2 = r1.A00
            int r1 = r6.A00
            if (r1 == 0) goto L_0x00ce
            r7 = 0
        L_0x00ce:
            r2.setVisibility(r7)
            if (r8 == 0) goto L_0x00d6
            r9.setText(r8)
        L_0x00d6:
            if (r3 == 0) goto L_0x00db
            r4.setText(r3)
        L_0x00db:
            if (r1 == 0) goto L_0x0099
            android.content.Context r0 = X.DbS.A07(r13)
            X.0qQ.A0B(r0, r5)
            android.util.TypedValue r0 = X.Pxj.A0J(r0, r1)
            int r0 = r0.resourceId
            r2.setImageResource(r0)
            return
        L_0x00ee:
            boolean r0 = r6 instanceof X.Qmq
            if (r0 == 0) goto L_0x03ac
            X.Qmq r6 = (X.Qmq) r6
            boolean r0 = r13 instanceof X.QEs
            if (r0 == 0) goto L_0x0471
            r2 = r13
            X.QEs r2 = (X.QEs) r2
            java.lang.String r7 = r6.A0E
            r3 = 0
            if (r7 == 0) goto L_0x0388
            X.S0m r0 = X.AnonymousClass2E0.A0G()
            java.lang.String r1 = "HubMediaItemViewController"
            android.content.Context r0 = r0.A00
            X.QnT r4 = new X.QnT
            r4.<init>(r0, r7, r1)
            boolean r0 = r6.A0H
            if (r0 == 0) goto L_0x0379
            r0 = 1
            r4.A06 = r0
        L_0x0114:
            android.widget.ImageView r7 = r2.A01
            r4.A02(r7)
        L_0x0119:
            android.widget.TextView r8 = r2.A04
            int r0 = r6.A04
            r8.setMaxLines(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L_0x0375
            r0 = 0
        L_0x0126:
            r8.setEllipsize(r0)
            android.widget.TextView r4 = r2.A03
            int r0 = r6.A03
            r4.setMaxLines(r0)
            if (r0 != r1) goto L_0x0371
            r0 = 0
        L_0x0133:
            r4.setEllipsize(r0)
            int r0 = r6.A01
            if (r0 == 0) goto L_0x036c
            r7.setBackgroundResource(r0)
        L_0x013d:
            java.lang.String r1 = r6.A0G
            int r0 = r6.A07
            X.C11094S9v.A01(r8, r1, r0)
            java.lang.String r3 = r6.A0F
            int r1 = r6.A06
            X.QUQ r0 = r6.A0A
            X.C11094S9v.A00(r4, r0, r3, r1)
            android.widget.TextView r3 = r2.A02
            java.lang.String r1 = r6.A0D
            X.QUQ r0 = r6.A09
            X.C11094S9v.A00(r3, r0, r1, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0167
            java.lang.Integer r0 = r6.A0C
            if (r0 == 0) goto L_0x0167
            int r0 = r0.intValue()
            r3.setTextColor(r0)
        L_0x0167:
            int r1 = r6.A05
            if (r1 == 0) goto L_0x017b
            android.content.Context r0 = X.DbS.A07(r13)
            X.0qQ.A0B(r0, r5)
            android.util.TypedValue r0 = X.Pxj.A0J(r0, r1)
            int r0 = r0.data
            r4.setTextColor(r0)
        L_0x017b:
            X.Reo r7 = r6.A0B
            if (r7 == 0) goto L_0x01e0
            X.RQV r4 = r2.A05
            if (r4 == 0) goto L_0x01e0
            android.view.ViewStub r1 = r4.A01
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x01ae
            android.view.View r0 = r1.inflate()
            r4.A00 = r0
            boolean r0 = r4 instanceof X.C8261Qmy
            if (r0 == 0) goto L_0x0311
            r3 = r4
            X.Qmy r3 = (X.C8261Qmy) r3
            android.view.View r1 = r3.A00
            r0 = 2131440001(0x7f0b3181, float:1.8501973E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            r3.A01 = r0
            android.view.View r1 = r3.A00
            r0 = 2131440000(0x7f0b3180, float:1.850197E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            r3.A00 = r0
        L_0x01ae:
            boolean r0 = r7 instanceof X.Qmu
            if (r0 == 0) goto L_0x01ee
            X.Qmu r7 = (X.Qmu) r7
            boolean r0 = r4 instanceof X.C8261Qmy
            if (r0 == 0) goto L_0x0467
            X.Qmy r4 = (X.C8261Qmy) r4
            java.lang.String r8 = r7.A01
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            r3 = 8
            android.widget.TextView r0 = r4.A01
            if (r1 != 0) goto L_0x01ea
            r0.setText(r8)
            android.widget.TextView r0 = r4.A01
            r0.setVisibility(r5)
        L_0x01ce:
            java.lang.String r1 = r7.A00
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x030a
            android.widget.TextView r0 = r4.A00
            r0.setText(r1)
            android.widget.TextView r0 = r4.A00
            r0.setVisibility(r5)
        L_0x01e0:
            android.view.View$OnClickListener r1 = r6.A08
        L_0x01e2:
            if (r1 == 0) goto L_0x0099
            android.view.View r0 = r2.itemView
            X.AnonymousClass0fU.A00(r1, r0)
            return
        L_0x01ea:
            r0.setVisibility(r3)
            goto L_0x01ce
        L_0x01ee:
            boolean r0 = r7 instanceof X.C8259Qmw
            if (r0 == 0) goto L_0x01e0
            X.Qmw r7 = (X.C8259Qmw) r7
            boolean r0 = r4 instanceof X.C8262Qmz
            if (r0 == 0) goto L_0x046c
            X.Qmz r4 = (X.C8262Qmz) r4
            com.google.common.collect.ImmutableList r1 = r7.A00
            int r11 = r1.size()
            r3 = 8
            if (r11 == 0) goto L_0x0307
            r7 = 1
            if (r11 == r7) goto L_0x02dc
            r8 = 2
            if (r11 == r8) goto L_0x02b1
            r9 = 3
            if (r11 == r9) goto L_0x0287
            r10 = 4
            android.view.View r0 = r4.A00
            if (r11 == r10) goto L_0x026a
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r4.A03
            X.C9670Reo.A00(r0, r1, r5)
            android.widget.ImageView r0 = r4.A04
            X.C9670Reo.A00(r0, r1, r7)
            android.widget.ImageView r0 = r4.A01
            X.C9670Reo.A00(r0, r1, r8)
            android.widget.ImageView r0 = r4.A02
            X.C9670Reo.A00(r0, r1, r9)
            android.view.View r0 = r4.A00
            android.content.res.Resources r8 = r0.getResources()
            android.widget.TextView r7 = r4.A05
            int r3 = r1.size()
            int r3 = r3 - r9
            r7.setVisibility(r5)
            r0 = 10
            if (r3 < r0) goto L_0x025b
            r0 = 2131975504(0x7f135d50, float:1.9588102E38)
            r7.setText(r0)
        L_0x0243:
            android.view.View r3 = r4.A00
            android.view.View r0 = r4.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2130969433(0x7f040359, float:1.7547548E38)
        L_0x024e:
            X.0qQ.A0B(r1, r5)
            android.util.TypedValue r0 = X.Pxj.A0J(r1, r0)
            int r0 = r0.resourceId
            r3.setBackgroundResource(r0)
            goto L_0x01e0
        L_0x025b:
            r1 = 2131975503(0x7f135d4f, float:1.95881E38)
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r3)
            java.lang.String r0 = r8.getString(r1, r0)
            r7.setText(r0)
            goto L_0x0243
        L_0x026a:
            r0.setVisibility(r5)
            android.widget.TextView r0 = r4.A05
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r4.A03
            X.C9670Reo.A00(r0, r1, r5)
            android.widget.ImageView r0 = r4.A04
            X.C9670Reo.A00(r0, r1, r7)
            android.widget.ImageView r0 = r4.A01
            X.C9670Reo.A00(r0, r1, r8)
            android.widget.ImageView r0 = r4.A02
            X.C9670Reo.A00(r0, r1, r9)
            goto L_0x0243
        L_0x0287:
            android.view.View r0 = r4.A00
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r4.A04
            r0.setVisibility(r3)
            android.widget.TextView r0 = r4.A05
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r4.A03
            X.C9670Reo.A00(r0, r1, r5)
            android.widget.ImageView r0 = r4.A01
            X.C9670Reo.A00(r0, r1, r7)
            android.widget.ImageView r0 = r4.A02
            X.C9670Reo.A00(r0, r1, r8)
            android.view.View r3 = r4.A00
            android.view.View r0 = r4.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2130969435(0x7f04035b, float:1.7547552E38)
            goto L_0x024e
        L_0x02b1:
            android.view.View r0 = r4.A00
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r4.A04
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r4.A02
            r0.setVisibility(r3)
            android.widget.TextView r0 = r4.A05
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r4.A03
            X.C9670Reo.A00(r0, r1, r5)
            android.widget.ImageView r0 = r4.A01
            X.C9670Reo.A00(r0, r1, r7)
            android.view.View r3 = r4.A00
            android.view.View r0 = r4.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2130969436(0x7f04035c, float:1.7547554E38)
            goto L_0x024e
        L_0x02dc:
            android.view.View r0 = r4.A00
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r4.A04
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r4.A01
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r4.A02
            r0.setVisibility(r3)
            android.widget.TextView r0 = r4.A05
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r4.A03
            X.C9670Reo.A00(r0, r1, r5)
            android.view.View r3 = r4.A00
            android.view.View r0 = r4.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2130969434(0x7f04035a, float:1.754755E38)
            goto L_0x024e
        L_0x0307:
            android.view.View r0 = r4.A00
            goto L_0x030c
        L_0x030a:
            android.widget.TextView r0 = r4.A00
        L_0x030c:
            r0.setVisibility(r3)
            goto L_0x01e0
        L_0x0311:
            boolean r0 = r4 instanceof X.C8262Qmz
            if (r0 == 0) goto L_0x035c
            r3 = r4
            X.Qmz r3 = (X.C8262Qmz) r3
            android.view.View r1 = r3.A00
            r0 = 2131443076(0x7f0b3d84, float:1.850821E38)
            android.widget.ImageView r0 = X.DbU.A0F(r1, r0)
            r3.A03 = r0
            android.view.View r1 = r3.A00
            r0 = 2131443082(0x7f0b3d8a, float:1.8508222E38)
            android.widget.ImageView r0 = X.DbU.A0F(r1, r0)
            r3.A04 = r0
            android.view.View r1 = r3.A00
            r0 = 2131428928(0x7f0b0640, float:1.8479514E38)
            android.widget.ImageView r0 = X.DbU.A0F(r1, r0)
            r3.A01 = r0
            android.view.View r1 = r3.A00
            r0 = 2131428941(0x7f0b064d, float:1.847954E38)
            android.widget.ImageView r0 = X.DbU.A0F(r1, r0)
            r3.A02 = r0
            android.view.View r1 = r3.A00
            r0 = 2131432107(0x7f0b12ab, float:1.8485962E38)
            android.view.View r0 = r1.requireViewById(r0)
            r3.A00 = r0
            android.view.View r1 = r3.A00
            r0 = 2131432561(0x7f0b1471, float:1.8486883E38)
            android.widget.TextView r0 = X.DbU.A0G(r1, r0)
            r3.A05 = r0
            goto L_0x01ae
        L_0x035c:
            r3 = r4
            X.Qmx r3 = (X.C8260Qmx) r3
            android.view.View r1 = r3.A00
            r0 = 2131429892(0x7f0b0a04, float:1.848147E38)
            android.widget.ImageView r0 = X.DbU.A0F(r1, r0)
            r3.A00 = r0
            goto L_0x01ae
        L_0x036c:
            r7.setBackground(r3)
            goto L_0x013d
        L_0x0371:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            goto L_0x0133
        L_0x0375:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            goto L_0x0126
        L_0x0379:
            android.content.Context r1 = X.DbS.A07(r13)
            r0 = 2130969479(0x7f040387, float:1.7547641E38)
            float r0 = X.C9676Reu.A00(r1, r0)
            r4.A00 = r0
            goto L_0x0114
        L_0x0388:
            int r0 = r6.A02
            if (r0 == 0) goto L_0x0393
            android.widget.ImageView r7 = r2.A01
        L_0x038e:
            r7.setImageResource(r0)
            goto L_0x0119
        L_0x0393:
            int r1 = r6.A00
            android.widget.ImageView r7 = r2.A01
            if (r1 == 0) goto L_0x03a7
            android.content.Context r0 = X.DbS.A07(r13)
            X.0qQ.A0B(r0, r5)
            android.util.TypedValue r0 = X.Pxj.A0J(r0, r1)
            int r0 = r0.resourceId
            goto L_0x038e
        L_0x03a7:
            r7.setImageDrawable(r3)
            goto L_0x0119
        L_0x03ac:
            boolean r0 = r6 instanceof X.Qmn
            if (r0 != 0) goto L_0x0099
            boolean r0 = r6 instanceof X.Qmr
            if (r0 == 0) goto L_0x03d0
            X.Qmr r6 = (X.Qmr) r6
            boolean r0 = r13 instanceof X.C7463QEm
            if (r0 == 0) goto L_0x0476
            r2 = r13
            X.QEm r2 = (X.C7463QEm) r2
            java.lang.String r0 = r6.A02
            android.widget.TextView r1 = r2.A00
            if (r0 == 0) goto L_0x03ca
            r1.setText(r0)
        L_0x03c6:
            android.view.View$OnClickListener r1 = r6.A01
            goto L_0x01e2
        L_0x03ca:
            int r0 = r6.A00
            r1.setText(r0)
            goto L_0x03c6
        L_0x03d0:
            boolean r0 = r6 instanceof X.Qms
            if (r0 == 0) goto L_0x041d
            X.Qms r6 = (X.Qms) r6
            boolean r0 = r13 instanceof X.QEo
            if (r0 == 0) goto L_0x047b
            X.QEo r13 = (X.QEo) r13
            android.widget.TextView r7 = r13.A01
            java.lang.String r1 = r6.A04
            int r0 = r6.A02
            X.C11094S9v.A01(r7, r1, r0)
            android.widget.TextView r2 = r13.A00
            r1 = 0
            int r0 = r6.A00
            X.C11094S9v.A01(r2, r1, r0)
            android.view.View$OnClickListener r0 = r6.A03
            if (r0 == 0) goto L_0x03f4
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x03f4:
            int r2 = r6.A01
            if (r2 == 0) goto L_0x0415
            r0 = 1
            if (r2 == r0) goto L_0x040d
            r0 = 2
            android.content.Context r1 = X.DbS.A07(r13)
            if (r2 != r0) goto L_0x0459
            r0 = 2130969477(0x7f040385, float:1.7547637E38)
        L_0x0405:
            float r0 = X.C9676Reu.A00(r1, r0)
            r7.setTextSize(r5, r0)
            return
        L_0x040d:
            android.content.Context r1 = X.DbS.A07(r13)
            r0 = 2130969475(0x7f040383, float:1.7547633E38)
            goto L_0x0405
        L_0x0415:
            android.content.Context r1 = X.DbS.A07(r13)
            r0 = 2130969474(0x7f040382, float:1.754763E38)
            goto L_0x0405
        L_0x041d:
            boolean r0 = r6 instanceof X.Qmm
            if (r0 != 0) goto L_0x0099
            X.Qmp r6 = (X.Qmp) r6
            boolean r0 = r13 instanceof X.C7462QEl
            if (r0 == 0) goto L_0x0480
            X.QEl r13 = (X.C7462QEl) r13
            android.widget.TextView r7 = r13.A00
            android.content.Context r4 = X.DbS.A07(r13)
            java.lang.String r0 = r6.A03
            r0.getClass()
            com.google.common.collect.ImmutableList r3 = r6.A00
            X.QmZ r2 = X.C9671Rep.A00(r4, r3, r0, r5)
            r1 = 2
            X.Sv1 r0 = new X.Sv1
            r0.<init>(r1, r4, r6)
            X.C11232SGr.A00(r7, r0, r2)
            int r0 = r3.size()
            r2 = 1
            if (r0 != r2) goto L_0x0451
            android.view.View r1 = r13.itemView
            android.view.View$OnClickListener r0 = r6.A02
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x0451:
            int r0 = r6.A01
            if (r0 != r2) goto L_0x0099
            android.content.Context r1 = X.DbS.A07(r13)
        L_0x0459:
            r0 = 2130969476(0x7f040384, float:1.7547635E38)
            goto L_0x0405
        L_0x045d:
            java.lang.UnsupportedOperationException r0 = X.Pxk.A0K(r6)
            throw r0
        L_0x0462:
            java.lang.UnsupportedOperationException r0 = X.Pxk.A0K(r6)
            throw r0
        L_0x0467:
            java.lang.UnsupportedOperationException r0 = X.Pxk.A0K(r7)
            throw r0
        L_0x046c:
            java.lang.UnsupportedOperationException r0 = X.Pxk.A0K(r7)
            throw r0
        L_0x0471:
            java.lang.UnsupportedOperationException r0 = X.Pxk.A0K(r6)
            throw r0
        L_0x0476:
            java.lang.UnsupportedOperationException r0 = X.Pxk.A0K(r6)
            throw r0
        L_0x047b:
            java.lang.UnsupportedOperationException r0 = X.Pxk.A0K(r6)
            throw r0
        L_0x0480:
            java.lang.UnsupportedOperationException r0 = X.Pxk.A0K(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QEb.onBindViewHolder(X.3kE, int):void");
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        Object obj = this.A01.get(i);
        if (obj != null) {
            C249703kE D72 = ((C13614Tdg) obj).D72(viewGroup);
            0qQ.A07(D72);
            return D72;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final int getItemCount() {
        int size;
        int A03 = AnonymousClass0fD.A03(1347653007);
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            size = 0;
        } else {
            size = immutableList.size();
        }
        AnonymousClass0fD.A0A(146871296, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        int A03 = AnonymousClass0fD.A03(-1622172813);
        ImmutableList immutableList = this.A00;
        0qQ.A0A(immutableList);
        int i2 = ((C11188SEo) immutableList.get(i)).A00;
        AnonymousClass0fD.A0A(249712601, A03);
        return i2;
    }
}
