package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.util.List;

/* renamed from: X.Ly3  reason: case insensitive filesystem */
public final class C65688Ly3 implements MUF {
    public MVG A00;
    public C66467MSv A01;
    public final C65681Lxw A02 = new C65681Lxw(this, 3);
    public final AnonymousClass0eM A03;

    public C65688Ly3(Context context, AnonymousClass07i r8, UserSession userSession) {
        this.A03 = AnonymousClass0eN.A01(new C58699Iw8(23, context, userSession, this, r8));
    }

    public static final void A00(C65688Ly3 ly3, boolean z) {
        MVG mvg = ly3.A00;
        if (mvg != null) {
            int i = 0;
            mvg.AnA().setVisibility(DbW.A01(z ? 1 : 0));
            MVG mvg2 = ly3.A00;
            if (mvg2 != null) {
                View BGz = mvg2.BGz();
                if (z) {
                    i = 8;
                }
                BGz.setVisibility(i);
                MVG mvg3 = ly3.A00;
                if (mvg3 != null) {
                    View AqN = mvg3.AqN();
                    float f = 0.3f;
                    if (z) {
                        f = 1.0f;
                    }
                    AqN.setAlpha(f);
                    return;
                }
            }
        }
        0qQ.A0F("viewHolder");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void ADR(Integer num, Integer num2, List list) {
        int intValue;
        Context context;
        int i;
        String quantityString;
        int intValue2;
        MVG mvg = this.A00;
        if (mvg != null) {
            C64273LXz.A00(mvg.AqN(), 58, this);
            MVG mvg2 = this.A00;
            if (mvg2 != null) {
                TextView Bql = mvg2.Bql();
                if (num != null && (intValue2 = num.intValue()) > 0) {
                    Bql.setVisibility(0);
                    quantityString = DbV.A0v(Bql.getResources(), num, R.plurals.num_collections_formatted, intValue2);
                } else if (list != null && !list.isEmpty()) {
                    Bql.setVisibility(0);
                    if (list.size() != 1 || ((BBU) list.get(0)).A05 == null) {
                        quantityString = Bql.getResources().getQuantityString(R.plurals.num_products_formatted, list.size(), AnonymousClass7TF.A1b(list.size()));
                    } else {
                        quantityString = ((BBU) list.get(0)).A05;
                    }
                } else if (num2 == null || (intValue = num2.intValue()) <= 0) {
                    Bql.setVisibility(8);
                    return;
                } else {
                    Bql.setVisibility(0);
                    Bql.setText(Bql.getResources().getQuantityString(R.plurals.product_tagging_suggested_products, intValue));
                    context = Bql.getContext();
                    i = R.attr.igds_color_primary_button;
                    JTS.A0u(context, Bql, i);
                    return;
                }
                Bql.setText(quantityString);
                context = Bql.getContext();
                i = R.attr.igds_color_secondary_text;
                JTS.A0u(context, Bql, i);
                return;
            }
        }
        0qQ.A0F("viewHolder");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Enm(BrandedContentTag brandedContentTag) {
        String str;
        AnonymousClass0eM r2 = this.A03;
        LPD lpd = (LPD) r2.getValue();
        if (brandedContentTag != null) {
            str = brandedContentTag.A01;
        } else {
            str = null;
        }
        lpd.A04(str);
        A00(this, !((LPD) r2.getValue()).A05());
        ((LPD) r2.getValue()).A02();
    }
}
