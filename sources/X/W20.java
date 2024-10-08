package X;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.user.model.Product;
import java.text.SimpleDateFormat;
import java.util.List;

public final class W20 {
    public static final W20 A00 = new Object();
    public static final SimpleDateFormat A01 = new SimpleDateFormat(DateFormat.getBestDateTimePattern(AnonymousClass1Q2.A02(), "MMM d"), AnonymousClass1Q2.A02());

    public static final void A01(UES ues, C19560Wbk wbk, W0O w0o, boolean z) {
        ViewGroup viewGroup = ues.A04;
        Context context = viewGroup.getContext();
        viewGroup.setVisibility(0);
        viewGroup.setEnabled(z);
        TextView textView = ues.A09;
        textView.setEnabled(z);
        IgSimpleImageView igSimpleImageView = ues.A0E;
        igSimpleImageView.setEnabled(z);
        igSimpleImageView.setSelected(z);
        textView.setText(0mp.A06("%d", AnonymousClass7TF.A1b(w0o.A02())));
        viewGroup.setContentDescription(AnonymousClass7TF.A0e(context.getResources(), Integer.valueOf(w0o.A02()), 2131971026));
        WBD.A00(viewGroup, 50, wbk, w0o);
    }

    public static final void A00(UES ues, C19560Wbk wbk, W0O w0o) {
        Product A03 = w0o.A03();
        if (A03 != null) {
            List list = A03.A0O;
            if (list == null || list.isEmpty()) {
                ues.A07.setVisibility(8);
                ues.A01.setVisibility(8);
                return;
            }
            TextView textView = ues.A07;
            textView.setVisibility(0);
            ues.A01.setVisibility(0);
            WBD.A00(textView, 47, wbk, w0o);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A02(UES ues, W0O w0o, StringBuilder sb) {
        Product A03 = w0o.A03();
        if (A03 != null) {
            List<ProductVariantPossibleValueDictIntf> list = A03.A0O;
            if (list == null || list.isEmpty()) {
                ues.A0C.setVisibility(8);
                return;
            }
            TextView textView = ues.A0C;
            textView.setVisibility(0);
            if (!list.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    sb2.append(((ProductVariantPossibleValueDictIntf) list.get(i)).getValue());
                    if (i < size - 1) {
                        sb2.append(" · ");
                    }
                }
                textView.setText(DbT.A10(sb2));
                sb.append(" ");
                if (!list.isEmpty()) {
                    StringBuilder sb3 = new StringBuilder();
                    for (ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf : list) {
                        sb3.append(productVariantPossibleValueDictIntf.getName());
                        sb3.append(" ");
                        sb3.append(productVariantPossibleValueDictIntf.getValue());
                        sb3.append(" ");
                    }
                    sb.append(DbT.A10(sb3));
                    return;
                }
                throw DbT.A0m();
            }
            throw DbT.A0m();
        }
        throw AnonymousClass7TE.A0y();
    }
}
