package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebookpay.form.fragment.model.FormParams;
import com.facebookpay.form.view.FormLayout;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.button.FBPayButton;
import com.facebookpay.widget.listcell.ListCell;
import com.instagram.android.R;

/* renamed from: X.QhL  reason: case insensitive filesystem */
public final class C8127QhL extends QCJ {
    public ContextThemeWrapper A00;
    public View A01;
    public View A02;
    public FrameLayout A03;
    public ImageView A04;
    public ProgressBar A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public QDN A09;
    public C8056Qg8 A0A;
    public FormParams A0B;
    public QDK A0C;
    public FormLayout A0D;
    public FBPayButton A0E;
    public ListCell A0F;
    public Boolean A0G;
    public String A0H;
    public 0sP A0I = TXO.A00;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final C62320sa A0M = new C13346TVt(this, 0);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: type inference failed for: r1v40, types: [X.Qg8, X.QgA] */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01dd, code lost:
        if (r4.A0L != false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r3 != true) goto L_0x0027;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r23, android.os.Bundle r24) {
        /*
            r22 = this;
            r2 = 0
            r8 = r23
            X.0qQ.A0B(r8, r2)
            r4 = r22
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "ECP_FORM_FRAGMENT_PARAMS"
            android.os.Parcelable r1 = r1.getParcelable(r0)
            if (r1 == 0) goto L_0x0623
            com.facebookpay.form.fragment.model.FormParams r1 = (com.facebookpay.form.fragment.model.FormParams) r1
            r4.A0B = r1
            java.lang.String r20 = "formParams"
            if (r1 == 0) goto L_0x060b
            com.facebookpay.form.fragment.model.FeatureConfiguration r1 = r1.A08
            r6 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0027
            boolean r3 = r1.A02
            r1 = 1
            if (r3 == r5) goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            r4.A0L = r1
            r1 = r24
            super.onViewCreated(r8, r1)
            r4.A0K = r5
            com.facebookpay.form.fragment.model.FormParams r1 = r4.A0B
            if (r1 == 0) goto L_0x060b
            com.facebookpay.form.fragment.model.FeatureConfiguration r1 = r1.A08
            if (r1 == 0) goto L_0x003e
            boolean r1 = r1.A00
            if (r1 != r5) goto L_0x003e
            r6 = 1
        L_0x003e:
            r4.A0J = r6
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r12 = "logging_context"
            android.os.Parcelable r1 = r1.getParcelable(r12)
            java.lang.String r11 = "null cannot be cast to non-null type com.facebookpay.logging.LoggingContext"
            X.0qQ.A0C(r1, r11)
            com.facebookpay.logging.LoggingContext r1 = (com.facebookpay.logging.LoggingContext) r1
            r7 = 0
            X.QDN r1 = X.C11086S9g.A01(r4, r7, r1)
            r4.A09 = r1
            X.2YN r3 = new X.2YN
            r3.<init>(r4)
            java.lang.Class<X.QD8> r1 = X.QD8.class
            X.2YL r10 = r3.A00(r1)
            X.QD8 r10 = (X.QD8) r10
            com.facebookpay.form.fragment.model.FormParams r1 = r4.A0B
            if (r1 == 0) goto L_0x05d3
            java.lang.Integer r6 = r1.A0D
            com.facebookpay.form.fragment.model.FeatureConfiguration r1 = r1.A08
            if (r1 == 0) goto L_0x05ce
            boolean r3 = r1.A02
        L_0x0072:
            X.Se9 r1 = new X.Se9
            r1.<init>(r6, r3)
            X.2YN r3 = X.JTO.A0L(r1, r4)
            java.lang.Class<X.QDK> r1 = X.QDK.class
            X.2YL r9 = r3.A00(r1)
            X.QDK r9 = (X.QDK) r9
            r4.A0C = r9
            java.lang.String r18 = "formFragmentViewModel"
            if (r9 == 0) goto L_0x05c9
            android.os.Bundle r6 = r4.requireArguments()
            X.QDN r3 = r4.A09
            java.lang.String r19 = "ecpViewModel"
            if (r3 != 0) goto L_0x009b
            X.0qQ.A0F(r19)
        L_0x0096:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x009b:
            X.QDH r1 = r3.A1Q
            X.SGq r3 = r3.A06
            if (r3 != 0) goto L_0x00a2
            r3 = r7
        L_0x00a2:
            X.0qQ.A0B(r10, r5)
            android.os.Parcelable r0 = r6.getParcelable(r0)
            java.lang.String r21 = "Required value was null."
            if (r0 == 0) goto L_0x05fb
            com.facebookpay.form.fragment.model.FormParams r0 = (com.facebookpay.form.fragment.model.FormParams) r0
            r9.A01 = r0
            java.lang.String r0 = "ECP_SESSION_ID"
            java.lang.String r0 = r6.getString(r0)
            if (r0 == 0) goto L_0x05f6
            r9.A07 = r0
            java.lang.String r0 = "ECP_PRODUCT_ID"
            java.lang.String r0 = r6.getString(r0)
            if (r0 == 0) goto L_0x05f1
            r9.A06 = r0
            java.lang.String r0 = "ECP_CLIENT_RECEIVER_ID"
            java.lang.String r0 = r6.getString(r0)
            if (r0 == 0) goto L_0x05ec
            r9.A05 = r0
            java.lang.Object r0 = r6.get(r12)
            X.0qQ.A0C(r0, r11)
            com.facebookpay.logging.LoggingContext r0 = (com.facebookpay.logging.LoggingContext) r0
            r9.A03 = r0
            r9.A02 = r10
            r9.A04 = r1
            X.QD8 r1 = r9.A05()
            com.facebookpay.form.fragment.model.FormParams r0 = r9.A01
            if (r0 == 0) goto L_0x05d3
            java.util.ArrayList r0 = r0.A0I
            com.google.common.collect.ImmutableList r0 = X.DbU.A0K(r0)
            r1.A03(r3, r0)
            X.QD8 r0 = r9.A05()
            X.2gB r10 = r0.A03
            X.TXA r3 = X.TXA.A00
            r1 = 7
            X.LZv r0 = new X.LZv
            r0.<init>(r3, r1)
            r10.A09(r0)
            X.QD8 r0 = r9.A05()
            X.2gB r0 = r0.A03
            X.0qQ.A0B(r0, r2)
            r9.A00 = r0
            java.lang.String r0 = "ECP_FORM_FRAGMENT_ERROR_MESSAGE"
            java.lang.Object r1 = r6.get(r0)
            boolean r0 = r1 instanceof com.facebookpay.common.models.ErrorDialogContent
            if (r0 == 0) goto L_0x011c
            if (r1 == 0) goto L_0x011c
            X.2Fj r0 = r9.A0A
            X.SR4.A01(r0, r1)
        L_0x011c:
            X.RLo r11 = r9.A0E
            java.lang.String r17 = "loggingContext"
            if (r11 == 0) goto L_0x02d9
            com.facebookpay.logging.LoggingContext r10 = r9.A03
            if (r10 == 0) goto L_0x05c4
            com.facebookpay.form.fragment.model.FormParams r0 = r9.A01
            if (r0 == 0) goto L_0x05d3
            java.lang.String r0 = r0.A0H
            if (r0 == 0) goto L_0x02d6
            java.lang.Long r6 = X.DbV.A0q(r0)
        L_0x0132:
            X.QDH r0 = r9.A06()
            java.util.LinkedHashMap r3 = X.SUU.A08(r0)
            boolean r0 = r11 instanceof X.C8059QgB
            if (r0 == 0) goto L_0x02c4
            X.Sto r1 = X.C51965G9l.A0g()
            java.lang.String r0 = "edit_shipping_address"
        L_0x0144:
            r1.A0J(r10, r6, r0, r3)
        L_0x0147:
            X.QDK r0 = r4.A0C
            if (r0 == 0) goto L_0x05c9
            X.2Fk r1 = r0.A00
            if (r1 == 0) goto L_0x05d1
            r0 = 26
            X.TY2 r0 = X.TY2.A00(r4, r0)
            r3 = 30
            X.Dba.A16(r4, r1, r0, r3)
            X.QDK r0 = r4.A0C
            if (r0 == 0) goto L_0x05c9
            X.2gB r1 = r0.A08
            r0 = 27
            X.TY2 r0 = X.TY2.A00(r4, r0)
            X.Dba.A16(r4, r1, r0, r3)
            com.facebookpay.form.fragment.model.FormParams r0 = r4.A0B
            if (r0 == 0) goto L_0x05d3
            com.facebookpay.form.cell.CellParams r1 = r0.A07
            if (r1 == 0) goto L_0x0177
            X.SRc r0 = r1.A01()
            r1.A00 = r0
        L_0x0177:
            r0 = 2131433104(0x7f0b1690, float:1.8487984E38)
            android.view.View r0 = r8.requireViewById(r0)
            com.facebookpay.form.view.FormLayout r0 = (com.facebookpay.form.view.FormLayout) r0
            r4.A0D = r0
            r0 = 2131430689(0x7f0b0d21, float:1.8483086E38)
            android.view.View r0 = r8.requireViewById(r0)
            r4.A01 = r0
            android.widget.TextView r0 = X.Dba.A06(r8)
            r4.A08 = r0
            android.widget.TextView r0 = X.Dba.A05(r8)
            r4.A07 = r0
            r0 = 2131442883(0x7f0b3cc3, float:1.8507818E38)
            android.widget.ImageView r0 = X.DbU.A0F(r8, r0)
            r4.A04 = r0
            r0 = 2131435532(0x7f0b200c, float:1.8492909E38)
            android.view.View r0 = r8.requireViewById(r0)
            com.facebookpay.widget.listcell.ListCell r0 = (com.facebookpay.widget.listcell.ListCell) r0
            r4.A0F = r0
            r0 = 2131439805(0x7f0b30bd, float:1.8501576E38)
            android.widget.TextView r0 = X.DbU.A0G(r8, r0)
            r4.A06 = r0
            r0 = 2131435632(0x7f0b2070, float:1.8493112E38)
            android.view.View r0 = r8.requireViewById(r0)
            r4.A02 = r0
            r0 = 2131432682(0x7f0b14ea, float:1.8487128E38)
            android.view.ViewGroup r6 = X.DbX.A0I(r8, r0)
            boolean r0 = r4.A0L
            if (r0 == 0) goto L_0x0299
            r6.setMinimumHeight(r2)
        L_0x01cb:
            android.view.View r9 = r4.A01
            java.lang.String r14 = "contentContainer"
            if (r9 == 0) goto L_0x05bf
            X.SPB r6 = X.AnonymousClass2E0.A0A()
            boolean r0 = r4.A0K
            if (r0 == 0) goto L_0x01df
            boolean r1 = r4.A0L
            r0 = 20
            if (r1 == 0) goto L_0x01e1
        L_0x01df:
            r0 = 19
        L_0x01e1:
            int r0 = r6.A02(r0)
            X.C11409SSh.A05(r9, r0, r2)
            com.facebookpay.form.fragment.model.FormParams r0 = r4.A0B
            if (r0 == 0) goto L_0x05d3
            int r1 = r0.A06
            java.lang.String r9 = "titleIcon"
            r6 = 8
            java.lang.String r13 = "title"
            android.widget.TextView r0 = r4.A08
            if (r1 != 0) goto L_0x024b
            if (r0 == 0) goto L_0x05ba
            r0.setVisibility(r6)
            android.widget.ImageView r0 = r4.A04
            if (r0 == 0) goto L_0x037c
            r0.setVisibility(r6)
        L_0x0206:
            com.facebookpay.form.fragment.model.FormParams r0 = r4.A0B
            if (r0 == 0) goto L_0x05d3
            java.util.List r11 = r0.A0J
            if (r11 == 0) goto L_0x0364
            int r9 = r11.size()
            r1 = 5
            r0 = 2131429656(0x7f0b0918, float:1.848099E38)
            if (r9 <= r1) goto L_0x021b
            r0 = 2131429657(0x7f0b0919, float:1.8480993E38)
        L_0x021b:
            android.view.ViewGroup r10 = X.DbX.A0I(r8, r0)
            r10.setVisibility(r2)
            java.util.Iterator r9 = r11.iterator()
        L_0x0226:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0364
            int r1 = X.AnonymousClass7TG.A0F(r9)
            android.content.Context r0 = r4.requireContext()
            android.graphics.drawable.Drawable r8 = r0.getDrawable(r1)
            android.content.Context r0 = r4.requireContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131625991(0x7f0e0807, float:1.8879206E38)
            android.view.View r0 = r1.inflate(r0, r10, r2)
            X.Pxj.A17(r8, r0, r10)
            goto L_0x0226
        L_0x024b:
            if (r0 == 0) goto L_0x05ba
            r0.setText(r1)
            android.widget.TextView r1 = r4.A08
            if (r1 == 0) goto L_0x05ba
            boolean r0 = r4.A0L
            if (r0 == 0) goto L_0x028f
            X.RH2 r0 = X.RH2.A0v
        L_0x025a:
            X.SRn.A02(r1, r0)
            android.widget.ImageView r1 = r4.A04
            if (r1 == 0) goto L_0x037c
            com.facebookpay.form.fragment.model.FormParams r0 = r4.A0B
            if (r0 == 0) goto L_0x05d3
            X.RH3 r0 = r0.A0B
            if (r0 == 0) goto L_0x0289
            X.C9659Red.A00(r7, r1, r0)
            r0 = 0
        L_0x026d:
            r1.setVisibility(r0)
            com.facebookpay.form.fragment.model.FormParams r0 = r4.A0B
            if (r0 == 0) goto L_0x05d3
            java.lang.Integer r0 = r0.A0G
            if (r0 == 0) goto L_0x0206
            int r0 = r0.intValue()
            android.widget.TextView r1 = r4.A08
            if (r1 == 0) goto L_0x05ba
            java.lang.Integer r0 = X.SSH.A01(r1, r0)
            X.SSH.A02(r1, r7, r7, r7, r0)
            goto L_0x0206
        L_0x0289:
            r1.setImageDrawable(r7)
            r0 = 8
            goto L_0x026d
        L_0x028f:
            boolean r0 = r4.A0K
            if (r0 == 0) goto L_0x0296
            X.RH2 r0 = X.RH2.A0z
            goto L_0x025a
        L_0x0296:
            X.RH2 r0 = X.RH2.A0x
            goto L_0x025a
        L_0x0299:
            X.0qQ.A0B(r6, r5)
            X.SQs r0 = new X.SQs
            r0.<init>(r4, r5)
            X.Suz r1 = new X.Suz
            r1.<init>(r7, r6)
            java.util.Set r0 = r0.A08
            r0.add(r1)
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "ECP_FORM_NAV_BAR_STYLE"
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x05e7
            X.RFs r0 = (X.C8924RFs) r0
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x01cb
            X.SSH r0 = X.C9961RkG.A00
            r0.A04(r6)
            goto L_0x01cb
        L_0x02c4:
            X.QgC r11 = (X.C8060QgC) r11
            X.Sto r1 = X.C51965G9l.A0g()
            boolean r0 = r11.A00
            if (r0 == 0) goto L_0x02d2
            java.lang.String r0 = "add_shipping_address_inline"
            goto L_0x0144
        L_0x02d2:
            java.lang.String r0 = "add_shipping_address"
            goto L_0x0144
        L_0x02d6:
            r6 = r7
            goto L_0x0132
        L_0x02d9:
            com.facebookpay.form.fragment.model.FormParams r0 = r9.A01
            if (r0 == 0) goto L_0x05d3
            com.facebookpay.form.fragment.model.FormLoggingEvents r0 = r0.A09
            if (r0 == 0) goto L_0x0147
            java.util.List r0 = r0.A05
            if (r0 == 0) goto L_0x0147
            java.util.Iterator r16 = r0.iterator()
        L_0x02e9:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0147
            java.lang.Object r6 = r16.next()
            com.facebookpay.form.fragment.model.FormDisplayEvent r6 = (com.facebookpay.form.fragment.model.FormDisplayEvent) r6
            X.Sto r11 = X.C11353SOm.A00()
            java.lang.String r10 = r6.A01
            com.facebookpay.logging.LoggingContext r0 = r9.A03
            if (r0 == 0) goto L_0x05c4
            java.lang.String r15 = r6.A02
            com.facebookpay.form.fragment.model.FormParams r1 = r9.A01
            if (r1 == 0) goto L_0x05d3
            java.lang.String r1 = r1.A0H
            if (r1 == 0) goto L_0x0362
            java.lang.Long r3 = X.DbV.A0q(r1)
        L_0x030d:
            X.QDH r1 = r9.A06()
            X.SEB r14 = r1.A03()
            com.facebookpay.form.fragment.model.FormParams r1 = r9.A01
            if (r1 == 0) goto L_0x05d3
            int r1 = r1.A04
            X.XRm r1 = X.QDK.A00(r1)
            java.lang.String r13 = r6.A00
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            r6.put(r12, r0)
            java.lang.String r0 = "VIEW_NAME"
            X.Pxj.A1K(r3, r0, r15, r6)
            X.Pxi.A1I(r1, r6)
            java.lang.String r3 = "extra_data"
            java.lang.Object r1 = r6.get(r3)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x0346
            boolean r0 = r1 instanceof X.C62650uo
            if (r0 == 0) goto L_0x0342
            boolean r0 = r1 instanceof X.AnonymousClass0s2
            if (r0 == 0) goto L_0x0346
        L_0x0342:
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L_0x034a
        L_0x0346:
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
        L_0x034a:
            X.SUU.A0A(r14, r1)
            r6.put(r3, r1)
            if (r13 == 0) goto L_0x0357
            java.lang.String r0 = "fields_to_verify"
            X.SUU.A0C(r13, r0, r6)
        L_0x0357:
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.copyOf(r6)
            X.0qQ.A07(r0)
            r11.Cgl(r10, r0)
            goto L_0x02e9
        L_0x0362:
            r3 = r7
            goto L_0x030d
        L_0x0364:
            X.Qg8 r1 = new X.Qg8
            r1.<init>()
            r4.A0A = r1
            com.facebookpay.form.view.FormLayout r0 = r4.A0D
            java.lang.String r13 = "formLayout"
            if (r0 == 0) goto L_0x05ba
            r1.A00 = r0
            r1.A03(r0)
            android.view.View r1 = r4.A02
            if (r1 != 0) goto L_0x0381
            java.lang.String r9 = "loadingOverlay"
        L_0x037c:
            X.0qQ.A0F(r9)
            goto L_0x0096
        L_0x0381:
            r8 = 2
            X.C11409SSh.A01(r1, r8)
            r0 = 1058642330(0x3f19999a, float:0.6)
            r1.setAlpha(r0)
            X.SbP r0 = X.C11502SbP.A00
            r1.setOnTouchListener(r0)
            com.facebookpay.form.fragment.model.FormParams r0 = r4.A0B
            if (r0 == 0) goto L_0x05d3
            int r1 = r0.A04
            if (r1 == 0) goto L_0x05b5
            if (r1 == r5) goto L_0x05b0
            if (r1 == r8) goto L_0x05ab
            r0 = 3
            if (r1 != r0) goto L_0x03ac
            r1 = 2131961405(0x7f13263d, float:1.9559506E38)
        L_0x03a2:
            X.Q6J r0 = r4.A00
            if (r0 == 0) goto L_0x05dd
            java.lang.String r0 = r0.getString(r1)
            r4.A0H = r0
        L_0x03ac:
            com.facebookpay.form.fragment.model.FormParams r0 = r4.A0B
            if (r0 == 0) goto L_0x05d3
            com.facebookpay.form.fragment.model.ListCellParams r8 = r0.A0A
            if (r8 == 0) goto L_0x03e1
            com.facebookpay.widget.listcell.ListCell r1 = r4.A0F
            java.lang.String r9 = "listCell"
            if (r1 == 0) goto L_0x037c
            java.lang.String r0 = r8.A02
            r1.setPrimaryText(r0)
            com.facebookpay.widget.listcell.ListCell r1 = r4.A0F
            if (r1 == 0) goto L_0x037c
            java.lang.String r0 = r8.A01
            r1.setSecondaryText(r0)
            com.facebookpay.widget.listcell.ListCell r1 = r4.A0F
            if (r1 == 0) goto L_0x037c
            java.lang.String r0 = r8.A00
            r1.setImageUrl(r0)
            com.facebookpay.widget.listcell.ListCell r1 = r4.A0F
            if (r1 == 0) goto L_0x037c
            X.RFq r0 = X.C8922RFq.A0G
            r1.setTextStyle(r0)
            com.facebookpay.widget.listcell.ListCell r0 = r4.A0F
            if (r0 == 0) goto L_0x037c
            r0.setVisibility(r2)
        L_0x03e1:
            com.facebookpay.form.view.FormLayout r8 = r4.A0D
            if (r8 == 0) goto L_0x05ba
            X.QDK r0 = r4.A0C
            if (r0 != 0) goto L_0x03f0
            r12 = r18
        L_0x03eb:
            X.0qQ.A0F(r12)
            goto L_0x0096
        L_0x03f0:
            X.QD8 r0 = r0.A05()
            r8.A01 = r0
            X.2Fj r1 = r0.A04
            X.Sdp r0 = r8.A04
            r1.A09(r0)
            boolean r0 = r4.A0K
            if (r0 == 0) goto L_0x055f
            boolean r0 = r4.A0L
            java.lang.String r12 = "viewContext"
            if (r0 != 0) goto L_0x0419
            X.SQz r10 = X.C9972RkR.A00
            android.view.ContextThemeWrapper r9 = r4.A00
            if (r9 == 0) goto L_0x03eb
            android.view.View r8 = r4.A01
            if (r8 == 0) goto L_0x05bf
            r1 = 20
            X.REP r0 = X.REP.ALL_BORDERED_ALL_ROUNDED
            r10.A03(r9, r8, r0, r1)
        L_0x0419:
            boolean r0 = A05(r4)
            if (r0 == 0) goto L_0x0500
            X.SOm r9 = X.AnonymousClass2E0.A01()
            android.view.ContextThemeWrapper r8 = r4.A00
            if (r8 == 0) goto L_0x03eb
            X.RH6 r1 = X.RH6.A0U
            com.facebookpay.form.view.FormLayout r0 = r4.A0D
            if (r0 == 0) goto L_0x05ba
            android.view.View r11 = r9.A02(r8, r0, r1)
            r0 = 2
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r11, r0)
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            r4.A03 = r11
            java.lang.String r12 = "saveButtonContainer"
            if (r11 == 0) goto L_0x03eb
            X.AnonymousClass2E0.A0A()
            r8 = 2132017719(0x7f140237, float:1.9673724E38)
            android.content.Context r1 = r11.getContext()
            int[] r0 = X.C71382cm.A0c
            android.content.res.TypedArray r10 = r1.obtainStyledAttributes(r8, r0)
            java.lang.String r0 = "layout_width"
            int r8 = r10.getLayoutDimension(r2, r0)
            java.lang.String r0 = "layout_height"
            int r5 = r10.getLayoutDimension(r5, r0)
            r1 = 4
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r10.getFloat(r1, r0)
            android.widget.TableRow$LayoutParams r9 = new android.widget.TableRow$LayoutParams
            r9.<init>(r8, r5, r0)
            r0 = 5
            int r8 = r10.getDimensionPixelSize(r0, r2)
            r0 = 2
            int r5 = r10.getDimensionPixelSize(r0, r2)
            r0 = 6
            int r1 = r10.getDimensionPixelSize(r0, r2)
            r0 = 3
            int r0 = r10.getDimensionPixelSize(r0, r2)
            r9.setMargins(r8, r5, r1, r0)
            r11.setLayoutParams(r9)
            r10.recycle()
            android.widget.FrameLayout r1 = r4.A03
            if (r1 == 0) goto L_0x03eb
            r0 = 2131429285(0x7f0b07a5, float:1.8480238E38)
            android.view.View r5 = r1.requireViewById(r0)
            com.facebookpay.widget.button.FBPayButton r5 = (com.facebookpay.widget.button.FBPayButton) r5
            r4.A0E = r5
            if (r5 == 0) goto L_0x04af
            com.facebookpay.form.fragment.model.FormParams r0 = r4.A0B
            if (r0 == 0) goto L_0x05d3
            java.lang.Integer r0 = r0.A0F
            if (r0 == 0) goto L_0x04ac
            int r1 = r0.intValue()
            X.Q6J r0 = r4.A00
            if (r0 == 0) goto L_0x05dd
            java.lang.String r7 = r0.getString(r1)
        L_0x04ac:
            r5.setText(r7)
        L_0x04af:
            com.facebookpay.widget.button.FBPayButton r1 = r4.A0E
            if (r1 == 0) goto L_0x04b8
            X.RFr r0 = X.C8923RFr.A09
            r1.setButtonStyle(r0)
        L_0x04b8:
            com.facebookpay.widget.button.FBPayButton r1 = r4.A0E
            if (r1 == 0) goto L_0x04c1
            r0 = 25
            X.C11496SbJ.A01(r1, r0, r4)
        L_0x04c1:
            android.widget.FrameLayout r1 = r4.A03
            if (r1 == 0) goto L_0x03eb
            r0 = 2131438594(0x7f0b2c02, float:1.849912E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r4.A05 = r0
            java.lang.String r14 = "progressIcon"
            if (r0 == 0) goto L_0x05bf
            android.graphics.drawable.Drawable r5 = r0.getIndeterminateDrawable()
            if (r5 == 0) goto L_0x04ee
            X.AnonymousClass2E0.A0A()
            android.content.Context r1 = r4.requireContext()
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r1 = r1.getColor(r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            r5.setColorFilter(r1, r0)
        L_0x04ee:
            android.widget.ProgressBar r0 = r4.A05
            if (r0 == 0) goto L_0x05bf
            r0.setVisibility(r6)
            com.facebookpay.form.view.FormLayout r1 = r4.A0D
            if (r1 == 0) goto L_0x05ba
            android.widget.FrameLayout r0 = r4.A03
            if (r0 == 0) goto L_0x03eb
            r1.addView(r0)
        L_0x0500:
            com.facebookpay.form.fragment.model.FormParams r0 = r4.A0B
            if (r0 == 0) goto L_0x05d3
            com.facebookpay.form.cell.CellParams r1 = r0.A07
            if (r1 == 0) goto L_0x051d
            com.facebookpay.form.view.FormLayout r5 = r4.A0D
            if (r5 == 0) goto L_0x05ba
            android.content.Context r0 = r5.getContext()
            X.TdT r1 = r1.A00(r0)
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x05d8
            android.view.View r1 = (android.view.View) r1
            r5.addView(r1)
        L_0x051d:
            com.facebookpay.form.fragment.model.FormParams r0 = r4.A0B
            if (r0 == 0) goto L_0x05d3
            int r0 = r0.A05
            if (r0 == 0) goto L_0x0545
            android.widget.TextView r0 = r4.A07
            java.lang.String r14 = "subtitle"
            if (r0 == 0) goto L_0x05bf
            r0.setVisibility(r2)
            android.widget.TextView r1 = r4.A07
            if (r1 == 0) goto L_0x05bf
            com.facebookpay.form.fragment.model.FormParams r0 = r4.A0B
            if (r0 == 0) goto L_0x05d3
            int r0 = r0.A05
            r1.setText(r0)
            android.widget.TextView r1 = r4.A07
            if (r1 == 0) goto L_0x05bf
            X.RH2 r0 = X.RH2.A14
            X.SRn.A02(r1, r0)
        L_0x0545:
            android.content.Context r2 = r4.requireContext()
            X.QDK r0 = r4.A0C
            if (r0 == 0) goto L_0x0557
            X.QD8 r1 = r0.A05()
            X.QDN r0 = r4.A09
            if (r0 != 0) goto L_0x0600
            r18 = r19
        L_0x0557:
            X.0qQ.A0F(r18)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x055f:
            com.facebookpay.form.fragment.model.FormParams r0 = r4.A0B
            if (r0 == 0) goto L_0x05d3
            java.lang.Integer r0 = r0.A0E
            if (r0 == 0) goto L_0x0500
            int r1 = r0.intValue()
            X.Q6J r0 = r4.A00
            if (r0 == 0) goto L_0x05dd
            java.lang.String r5 = r0.getString(r1)
            if (r5 == 0) goto L_0x0500
            int r0 = r5.length()
            if (r0 == 0) goto L_0x0500
            android.widget.TextView r1 = r4.A06
            java.lang.String r14 = "removeButton"
            if (r1 == 0) goto L_0x05bf
            X.RH2 r0 = X.RH2.A1H
            X.SRn.A02(r1, r0)
            android.widget.TextView r0 = r4.A06
            if (r0 == 0) goto L_0x05bf
            r0.setVisibility(r2)
            android.widget.TextView r0 = r4.A06
            if (r0 == 0) goto L_0x05bf
            r0.setText(r5)
            android.widget.TextView r1 = r4.A06
            if (r1 == 0) goto L_0x05bf
            r0 = 26
            X.C11496SbJ.A01(r1, r0, r4)
            android.widget.TextView r5 = r4.A06
            if (r5 == 0) goto L_0x05bf
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            java.lang.String r0 = r4.A0H
            X.C18674VwX.A01(r5, r1, r0)
            goto L_0x0500
        L_0x05ab:
            r1 = 2131961408(0x7f132640, float:1.9559512E38)
            goto L_0x03a2
        L_0x05b0:
            r1 = 2131961406(0x7f13263e, float:1.9559508E38)
            goto L_0x03a2
        L_0x05b5:
            r1 = 2131961407(0x7f13263f, float:1.955951E38)
            goto L_0x03a2
        L_0x05ba:
            X.0qQ.A0F(r13)
            goto L_0x0096
        L_0x05bf:
            X.0qQ.A0F(r14)
            goto L_0x0096
        L_0x05c4:
            X.0qQ.A0F(r17)
            goto L_0x0096
        L_0x05c9:
            X.0qQ.A0F(r18)
            goto L_0x0096
        L_0x05ce:
            r3 = 0
            goto L_0x0072
        L_0x05d1:
            java.lang.String r20 = "isFormValidLiveData"
        L_0x05d3:
            X.0qQ.A0F(r20)
            goto L_0x0096
        L_0x05d8:
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        L_0x05dd:
            java.lang.String r0 = "contextResourcesWrapper"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x05e7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r21)
            throw r0
        L_0x05ec:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r21)
            throw r0
        L_0x05f1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r21)
            throw r0
        L_0x05f6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r21)
            throw r0
        L_0x05fb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r21)
            throw r0
        L_0x0600:
            X.QDH r0 = r0.A1Q
            X.SQ4.A02(r2, r1, r0)
            X.QDK r0 = r4.A0C
            if (r0 != 0) goto L_0x0613
            r20 = r18
        L_0x060b:
            X.0qQ.A0F(r20)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0613:
            X.QD8 r0 = r0.A05()
            X.2gB r1 = r0.A02
            r0 = 23
            X.TY2 r0 = X.TY2.A00(r4, r0)
            X.Dba.A16(r4, r1, r0, r3)
            return
        L_0x0623:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8127QhL.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.07Z, X.QhL, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C8127QhL r2) {
        /*
            X.QDK r0 = r2.A0C
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "formFragmentViewModel"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            X.2Fj r1 = r0.A0B
            X.TXP r0 = X.TXP.A00
            X.2gB r1 = X.AnonymousClass72Y.A01(r1, r0)
            r0 = 43
            X.Sdp r0 = X.C11647Sdp.A00(r2, r0)
            X.SUj.A0G(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8127QhL.A02(X.QhL):void");
    }

    public static final boolean A05(C8127QhL qhL) {
        FormParams formParams = qhL.A0B;
        if (formParams == null) {
            0qQ.A0F("formParams");
            throw AnonymousClass00P.createAndThrow();
        }
        Integer num = formParams.A0F;
        if (num == null || num.intValue() == 0) {
            return false;
        }
        return true;
    }

    public static final void A03(C8127QhL qhL, boolean z) {
        if (!A05(qhL)) {
            return;
        }
        if (qhL.A0J) {
            FBPayButton fBPayButton = qhL.A0E;
            if (fBPayButton != null) {
                fBPayButton.setEnabled(true);
            }
        } else if (qhL.A0K || qhL.A0L) {
            FBPayButton fBPayButton2 = qhL.A0E;
            if (fBPayButton2 != null) {
                fBPayButton2.setEnabled(z);
            }
        } else {
            C8608Qxp A0K2 = Pxi.A0K(qhL);
            AnonymousClass7TF.A1J(A0K2, A0K2.A0O, C8608Qxp.A0X, 8, z);
        }
    }

    public static final void A04(C8127QhL qhL, boolean z) {
        ProgressBar progressBar;
        int i;
        if (!A05(qhL)) {
            return;
        }
        if (!qhL.A0K) {
            C8608Qxp A0K2 = Pxi.A0K(qhL);
            AnonymousClass7TF.A1J(A0K2, A0K2.A0W, C8608Qxp.A0X, 10, z);
            return;
        }
        String str = "progressIcon";
        String str2 = null;
        FBPayButton fBPayButton = qhL.A0E;
        if (z) {
            if (fBPayButton != null) {
                fBPayButton.setText((CharSequence) null);
            }
            progressBar = qhL.A05;
            if (progressBar != null) {
                i = 0;
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        if (fBPayButton != null) {
            FormParams formParams = qhL.A0B;
            if (formParams == null) {
                str = "formParams";
            } else {
                Integer num = formParams.A0F;
                if (num != null) {
                    int intValue = num.intValue();
                    Q6J q6j = qhL.A00;
                    if (q6j != null) {
                        str2 = q6j.getString(intValue);
                    } else {
                        str = "contextResourcesWrapper";
                    }
                }
                fBPayButton.setText(str2);
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        progressBar = qhL.A05;
        if (progressBar != null) {
            i = 8;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
        progressBar.setVisibility(i);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C8127QhL.super.onActivityResult(i, i2, intent);
        if (i == 10101) {
            String str = "formFragmentViewModel";
            if (-1 != i2 || intent == null) {
                QDK qdk = this.A0C;
                if (qdk != null) {
                    C12411Sto A0g = C51965G9l.A0g();
                    LoggingContext loggingContext = qdk.A03;
                    if (loggingContext == null) {
                        str = "loggingContext";
                    } else {
                        TY3.A00(C51965G9l.A0U(C51969G9p.A0d(A0g.A00, "user_click_cardscanner_exit"), 390), loggingContext, SUU.A08(qdk.A06()), "card_scanner", 7);
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            requireContext();
            AnonymousClass2E0.A0I();
            throw Pxi.A0p("An operation is not implemented: ", "add ig implementation");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1390330287);
        this.A00 = QCJ.A00(this, layoutInflater);
        Window window = requireActivity().getWindow();
        if (window != null) {
            window.setSoftInputMode(53);
        }
        ContextThemeWrapper contextThemeWrapper = this.A00;
        if (contextThemeWrapper == null) {
            0qQ.A0F("viewContext");
            throw AnonymousClass00P.createAndThrow();
        }
        View inflate = layoutInflater.cloneInContext(contextThemeWrapper).inflate(R.layout.fbpay_form_fragment, viewGroup, false);
        AnonymousClass0fD.A09(244903672, A022);
        return inflate;
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.07Z, X.QhL, androidx.fragment.app.Fragment, java.lang.Object, X.QCJ] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r13 = this;
            r0 = 1905483893(0x71936075, float:1.459549E30)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r5 = r13
            super.onResume()
            boolean r0 = r13.A0L
            if (r0 != 0) goto L_0x0070
            android.view.ContextThemeWrapper r4 = r13.A00
            r7 = 0
            if (r4 != 0) goto L_0x001f
            java.lang.String r0 = "viewContext"
        L_0x0017:
            X.0qQ.A0F(r0)
        L_0x001a:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x001f:
            android.os.Bundle r1 = r13.requireArguments()
            java.lang.String r0 = "ECP_FORM_NAV_BAR_STYLE"
            java.lang.Object r6 = r1.get(r0)
            if (r6 == 0) goto L_0x00a0
            X.RFs r6 = (X.C8924RFs) r6
            r0 = 49
            X.TVy r9 = new X.TVy
            r9.<init>(r13, r0)
            boolean r0 = r13.A0K
            if (r0 == 0) goto L_0x0042
            X.TV3 r10 = X.TV3.A00
        L_0x003a:
            r8 = r7
        L_0x003b:
            X.QDN r0 = r13.A09
            if (r0 != 0) goto L_0x005f
            java.lang.String r0 = "ecpViewModel"
            goto L_0x0017
        L_0x0042:
            X.0sa r10 = r13.A0M
            com.facebookpay.form.fragment.model.FormParams r0 = r13.A0B
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "formParams"
            goto L_0x0017
        L_0x004b:
            java.lang.Integer r0 = r0.A0F
            if (r0 == 0) goto L_0x003a
            int r1 = r0.intValue()
            X.Q6J r0 = r13.A00
            if (r0 == 0) goto L_0x005c
            java.lang.String r8 = r0.getString(r1)
            goto L_0x003b
        L_0x005c:
            java.lang.String r0 = "contextResourcesWrapper"
            goto L_0x0017
        L_0x005f:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.QDN.A02(r0)
            r12 = 1
            if (r0 == 0) goto L_0x0099
            boolean r0 = X.C11432SUd.A0N(r0)
            if (r0 != r12) goto L_0x0099
        L_0x006c:
            r11 = 0
            X.C9656Rea.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0070:
            X.QDK r0 = r13.A0C
            java.lang.String r4 = "formFragmentViewModel"
            if (r0 == 0) goto L_0x009b
            X.2Fj r1 = r0.A0A
            r0 = 24
            X.TY2 r0 = X.TY2.A00(r13, r0)
            r2 = 30
            X.Dba.A16(r13, r1, r0, r2)
            X.QDK r0 = r13.A0C
            if (r0 == 0) goto L_0x009b
            X.2Fj r1 = r0.A09
            r0 = 25
            X.TY2 r0 = X.TY2.A00(r13, r0)
            X.Dba.A16(r13, r1, r0, r2)
            r0 = -457716686(0xffffffffe4b7cc32, float:-2.7123744E22)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x0099:
            r12 = 0
            goto L_0x006c
        L_0x009b:
            X.0qQ.A0F(r4)
            goto L_0x001a
        L_0x00a0:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -764072099(0xffffffffd2752f5d, float:-2.63265403E11)
            X.AnonymousClass0fD.A09(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8127QhL.onResume():void");
    }
}
