package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class UEN extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final IgLinearLayout A03;
    public final IgSimpleImageView A04;
    public final CircularImageView A05;
    public final IgImageView A06;
    public final C311496cm A07;
    public final VNK A08;
    public final View A09;
    public final UserSession A0A;

    public UEN(View view, UserSession userSession, C311496cm r5, VNK vnk) {
        super(view);
        this.A09 = view;
        this.A0A = userSession;
        this.A07 = r5;
        this.A08 = vnk;
        this.A03 = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.contact_import_card_container);
        this.A05 = DbX.A0a(view, R.id.contact_import_card_circular_icon);
        this.A06 = DbX.A0b(view, R.id.contact_import_card_square_icon);
        this.A04 = DbX.A0Y(view, R.id.contact_import_dismiss_button);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.contact_import_card_title);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.contact_import_card_subtitle);
        View requireViewById = view.requireViewById(R.id.contact_import_card_cta);
        TextView textView = (TextView) requireViewById;
        0qQ.A0A(textView);
        1QE.A0G(textView, textView);
        0qQ.A07(requireViewById);
        this.A00 = textView;
    }
}
