package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class NQZ extends IgLinearLayout {
    public final ViewGroup A00 = DbU.A0C(this, R.id.pill);
    public final UserSession A01;
    public final IgTextView A02 = DbT.A0a(this, R.id.label);
    public final IgImageView A03 = DbT.A0b(this, R.id.icon);

    public NQZ(UserSession userSession, Context context) {
        super(context, (AttributeSet) null, 0, 0);
        this.A01 = userSession;
        View.inflate(context, R.layout.conversation_starter_pill, this);
    }
}
