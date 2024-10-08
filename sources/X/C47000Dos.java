package X;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.Dos  reason: case insensitive filesystem */
public final class C47000Dos extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final UserSession A02;
    public final IgSimpleImageView A03;
    public final FragmentActivity A04;

    public C47000Dos(UserSession userSession, FragmentActivity fragmentActivity, View view) {
        super(view);
        this.A04 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = DbX.A0Y(view, R.id.icon);
        this.A00 = AnonymousClass7TG.A0R(view, R.id.primary_text);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.secondary_text);
    }
}
