package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.instagram.android.R;
import java.util.Iterator;

public final class Q9f extends FrameLayout implements C13601TdT {
    public C8031Qfb A00;

    public void setViewModel(C8031Qfb qfb) {
        0qQ.A0B(qfb, 0);
        this.A00 = qfb;
        Context context = getContext();
        View inflate = View.inflate(context, R.layout.hub_cell_header_card_icons, this);
        View requireViewById = inflate.requireViewById(R.id.card_icon_list);
        0qQ.A0C(requireViewById, C273654mx.A00(1));
        LinearLayout linearLayout = (LinearLayout) requireViewById;
        linearLayout.setGravity(8388611);
        C8031Qfb qfb2 = this.A00;
        if (qfb2 == null) {
            0qQ.A0F("supportedLogosViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        Iterator it = qfb2.A00.iterator();
        while (it.hasNext()) {
            Pxj.A17(context.getDrawable(AnonymousClass7TG.A0F(it)), LayoutInflater.from(context).inflate(R.layout.hub_cell_header_card_icon, linearLayout, false), linearLayout);
        }
        0qQ.A07(context);
        SSH.A02(inflate, (Integer) null, (Integer) null, Integer.valueOf(SSH.A00(context, R.attr.fbpay_card_form_card_logos_top_padding)), Integer.valueOf(SSH.A00(context, R.attr.fbpay_card_form_card_logos_bottom_padding)));
    }
}
