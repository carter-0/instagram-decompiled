package X;

import android.view.View;
import android.view.ViewStub;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class A6N {
    public ComposeView A00;
    public final UserSession A01;
    public final View A02;

    public A6N(View view, UserSession userSession) {
        ComposeView composeView;
        this.A02 = view;
        this.A01 = userSession;
        View inflate = ((ViewStub) AnonymousClass7TF.A0F(view, R.id.text2filter_prompt_stub)).inflate();
        if (inflate instanceof ComposeView) {
            composeView = (ComposeView) inflate;
        } else {
            composeView = null;
        }
        this.A00 = composeView;
        if (composeView != null) {
            composeView.setContent(AnonymousClass5PI.A03(new C59345JFx(this, 25), 283484163));
        }
    }
}
