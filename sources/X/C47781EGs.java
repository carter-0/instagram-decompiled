package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import java.util.List;

/* renamed from: X.EGs  reason: case insensitive filesystem */
public final class C47781EGs extends C232232tF {
    public final Context A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = DbX.A0F(viewGroup, 0).inflate(R.layout.channel_education_nux, viewGroup, false);
        List list = C47037DpU.A05;
        Context context = this.A00;
        0qQ.A0A(inflate);
        return new C47037DpU(context, inflate);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r11, C249703kE r12) {
        FYD fyd = (FYD) r11;
        C47037DpU dpU = (C47037DpU) r12;
        AnonymousClass7TG.A1N(fyd, dpU);
        IgImageView igImageView = dpU.A03;
        Context context = dpU.A00;
        DbU.A13(context, igImageView, R.drawable.instagram_illustrations_product_illustration_pi_plus_what_are_channels);
        IgTextView igTextView = dpU.A02;
        DbT.A18(02K.A01(context), igTextView, fyd.A00);
        igTextView.setVisibility(0);
        List list = fyd.A01;
        if (list != null) {
            int i = 0;
            for (Object next : 00k.A0d(C47037DpU.A05, list.size())) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                C252063oV A0Y = DbU.A0Y(dpU.A01, AnonymousClass7TE.A0M(next));
                DbU.A13(context, DbU.A0F(A0Y.getView(), R.id.icon), ((N4H) list.get(i)).A01);
                DbT.A18(02K.A01(context), Dba.A06(A0Y.getView()), ((N4H) list.get(i)).A02);
                TextView A0R = AnonymousClass7TG.A0R(A0Y.getView(), R.id.description);
                A0R.setVisibility(8);
                Number number = (Number) ((N4H) list.get(i)).A03;
                if (number != null) {
                    DbT.A18(02K.A01(context), A0R, number.intValue());
                    A0R.setVisibility(0);
                }
                i = i2;
            }
        }
        IgdsButton igdsButton = dpU.A04;
        igdsButton.setText(2131955035);
        igdsButton.setVisibility(0);
        FPI.A01(igdsButton, 32, fyd);
    }

    public final Class modelClass() {
        return FYD.class;
    }

    public C47781EGs(Context context) {
        this.A00 = context;
    }
}
