package X;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.Iterator;

public class QA0 extends LinearLayout implements C13601TdT {
    public ImageView A00;
    public TextView A01;
    public C8039Qfj A02;
    public final AnonymousClass2gO A03 = C11649Sdr.A00(this, 58);

    public void setViewModel(C8039Qfj qfj) {
        int paddingTop;
        int paddingBottom;
        Integer num;
        this.A02 = qfj;
        TextView textView = this.A01;
        Context context = getContext();
        String str = qfj.A07;
        int i = qfj.A03;
        if (i != 0) {
            str = context.getString(i);
        }
        str.getClass();
        int i2 = 0;
        C11232SGr.A00(textView, new C12469Sv1(1, context, qfj), C9671Rep.A00(context, qfj.A06, str, false));
        textView.setMovementMethod(new LinkMovementMethod());
        boolean z = this instanceof C8045Qfq;
        if (z) {
            TextView textView2 = this.A01;
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            0qQ.A0C(layoutParams, AnonymousClass000.A00(6));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            SSH.A02(textView2, (Integer) null, (Integer) null, 0, 0);
            int i3 = this.A02.A04;
            if (i3 != 0) {
                num = SSH.A01(this, i3);
            } else {
                num = null;
            }
            int i4 = this.A02.A00;
            if (i4 == 0) {
                i4 = R.attr.fbpay_payment_method_header_cell_item_margin_bottom;
            }
            SSH.A03(this, (Integer) null, (Integer) null, num, SSH.A01(this, i4));
        } else {
            int i5 = this.A02.A04;
            if (i5 != 0) {
                SSH.A03(this, (Integer) null, (Integer) null, SSH.A01(this, i5), (Integer) null);
            }
            int i6 = this.A02.A00;
            if (i6 != 0) {
                SSH.A03(this.A01, (Integer) null, (Integer) null, (Integer) null, SSH.A01(this, i6));
            }
        }
        C8039Qfj qfj2 = this.A02;
        int i7 = qfj2.A05;
        int i8 = qfj2.A01;
        if (i7 != 0) {
            0qQ.A07(context);
            paddingTop = SSH.A00(context, i7);
        } else {
            paddingTop = textView.getPaddingTop();
        }
        if (i8 != 0) {
            0qQ.A07(context);
            paddingBottom = SSH.A00(context, i8);
        } else {
            paddingBottom = textView.getPaddingBottom();
        }
        textView.setPadding(0, paddingTop, 0, paddingBottom);
        int i9 = this.A02.A02;
        ImageView imageView = this.A00;
        if (i9 != 0) {
            imageView.setImageDrawable(AnonymousClass2E0.A0A().A05(context, this.A02.A02, 0));
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        if (z) {
            C8039Qfj qfj3 = this.A02;
            0qQ.A0C(qfj3, "null cannot be cast to non-null type com.facebookpay.form.cell.label.paymentmethod.PaymentMethodLabelCellViewModel");
            View requireViewById = View.inflate(context, R.layout.hub_cell_header_card_icons, this).requireViewById(R.id.card_icon_list);
            0qQ.A0C(requireViewById, C273654mx.A00(1));
            ViewGroup viewGroup = (ViewGroup) requireViewById;
            Iterator it = ((C8038Qfi) qfj3).A00.iterator();
            while (it.hasNext()) {
                Pxj.A17(context.getDrawable(AnonymousClass7TG.A0F(it)), DbT.A0C(LayoutInflater.from(context), viewGroup, R.layout.hub_cell_header_card_icon), viewGroup);
            }
        }
    }

    public QA0(Context context, int i) {
        super(context);
        setOrientation(0);
        Context context2 = getContext();
        View inflate = View.inflate(context2, i, this);
        inflate.getClass();
        TextView A0G = DbU.A0G(inflate, R.id.label);
        this.A01 = A0G;
        A0G.setLinkTextColor(AnonymousClass2E0.A0A().A03(context2, 5));
        if (03v.A00(this.A01) == null) {
            C18674VwX.A00(this.A01, AnonymousClass7TE.A0v(), AnonymousClass05K.A00, (String) null, (String) null);
        }
        View inflate2 = View.inflate(context2, R.layout.hub_cell_label_icon, this);
        inflate2.getClass();
        this.A00 = DbU.A0F(inflate2, R.id.icon);
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(248368016);
        super.onAttachedToWindow();
        this.A02.A07.A09(this.A03);
        AnonymousClass0fD.A0D(-774681924, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(-13871934);
        super.onDetachedFromWindow();
        this.A02.A07.A08(this.A03);
        AnonymousClass0fD.A0D(1673500309, A06);
    }
}
