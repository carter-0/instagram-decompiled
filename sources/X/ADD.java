package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

public final class ADD {
    public static final A8G A08 = new Object();
    public C391229sY A00;
    public final View A01;
    public final UserSession A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final C328907Gs A05;
    public final IgdsButton A06;
    public final IgdsButton A07;

    public ADD(ViewStub viewStub, UserSession userSession, C328907Gs r5) {
        AnonymousClass7TG.A1P(viewStub, r5);
        this.A02 = userSession;
        this.A05 = r5;
        View inflate = viewStub.inflate();
        this.A01 = inflate;
        this.A04 = AnonymousClass7TF.A0F(inflate, R.id.dmm_composer_block_title);
        this.A03 = AnonymousClass7TF.A0F(inflate, R.id.dmm_composer_block_message);
        this.A06 = (IgdsButton) AnonymousClass7TF.A0F(inflate, R.id.dmm_composer_block_first_button);
        this.A07 = (IgdsButton) AnonymousClass7TF.A0F(inflate, R.id.dmm_composer_block_second_button);
    }
}
