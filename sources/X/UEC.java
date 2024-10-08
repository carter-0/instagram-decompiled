package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

public final class UEC extends C249703kE {
    public final Context A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgImageView A04;
    public final C313756gx A05;
    public final IgdsButton A06;
    public final View A07;
    public final UserSession A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UEC(Context context, View view, UserSession userSession) {
        super(view);
        AnonymousClass7TG.A1U(userSession, context, view);
        this.A08 = userSession;
        this.A00 = context;
        this.A07 = view;
        this.A04 = JTR.A0i(view, R.id.image);
        this.A03 = Dba.A0E(view, R.id.title);
        this.A01 = Dba.A0E(view, R.id.description);
        this.A02 = Dba.A0E(view, R.id.footer);
        this.A06 = C13989Tnp.A0X(view, R.id.cta_button);
        this.A05 = C313746gw.A00(userSession);
    }
}
