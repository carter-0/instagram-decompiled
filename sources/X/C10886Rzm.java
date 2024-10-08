package X;

import com.facebookpay.form.cell.label.LabelCellParams;
import com.facebookpay.logging.LoggingContext;
import com.fbpay.hub.common.link.LinkParams;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;

/* renamed from: X.Rzm  reason: case insensitive filesystem */
public final class C10886Rzm {
    public final LabelCellParams A00(LoggingContext loggingContext, int i, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        TY3.A00(C51965G9l.A0U(C51969G9p.A0d(C51965G9l.A0g().A00, "client_load_terms_init"), 105), loggingContext, (Object) null, "nux_checkout", 49);
        if (z3) {
            C8028QfI qfI = new C8028QfI(16);
            qfI.A03 = 2131961374;
            SR9 sr9 = new SR9();
            sr9.A03("https://www.facebook.com/terms.php");
            sr9.A01 = 2131961419;
            sr9.A03 = "[[terms_token]]";
            LinkParams linkParams = new LinkParams(sr9);
            ImmutableList.Builder builder = qfI.A08;
            builder.add(linkParams);
            SR9 sr92 = new SR9();
            sr92.A03("https://www.facebook.com/privacy/explanation/");
            sr92.A01 = 2131961368;
            sr92.A03 = "[[data_terms_token]]";
            builder.add(new LinkParams(sr92));
            SR9 sr93 = new SR9();
            sr93.A03("https://www.facebook.com/help/208622391741310?ref=learn_more");
            sr93.A01 = 2131961273;
            sr93.A03 = "[[learn_more_token]]";
            builder.add(new LinkParams(sr93));
            qfI.A04 = R.attr.fbpay_hub_header_item_margin_top;
            qfI.A05 = i;
            qfI.A01 = i2;
            return qfI.A00();
        }
        if (C11431STx.A04()) {
            i3 = 2131961197;
        } else if (z) {
            i3 = 2131961376;
            if (z2) {
                i3 = 2131961375;
            }
        } else {
            i3 = 2131961373;
            if (z2) {
                i3 = 2131961371;
            }
        }
        return C11089S9k.A01(i3, R.attr.fbpay_hub_header_item_margin_top, i, i2);
    }
}
