package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.DpV  reason: case insensitive filesystem */
public final class C47038DpV extends C249703kE {
    public static final List A0A = 0sr.A1P(new Integer[]{Integer.valueOf(R.id.item_1), Integer.valueOf(R.id.item_2), Integer.valueOf(R.id.item_3)});
    public final Context A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final UserSession A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final IgImageView A08;
    public final IgImageView A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47038DpV(Context context, View view, UserSession userSession) {
        super(view);
        AnonymousClass7TG.A1U(userSession, context, view);
        this.A04 = userSession;
        this.A00 = context;
        this.A03 = view;
        this.A09 = DbX.A0b(view, R.id.image);
        this.A07 = DbX.A0Z(view, R.id.title);
        this.A05 = DbX.A0Z(view, R.id.description);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.dropdown_container);
        this.A06 = DbX.A0Z(view, R.id.dropdown_text);
        this.A08 = DbX.A0b(view, R.id.dropdown_image);
        this.A02 = AnonymousClass7TF.A0G(view, R.id.item_container);
    }
}
