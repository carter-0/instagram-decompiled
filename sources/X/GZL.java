package X;

import android.app.Activity;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;

public final class GZL implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ComposeView A01;
    public final /* synthetic */ 0xG A02;
    public final /* synthetic */ C53950Gwu A03;

    public final void onViewDetachedFromWindow(View view) {
    }

    public GZL(View view, ComposeView composeView, 0xG r3, C53950Gwu gwu) {
        this.A00 = view;
        this.A03 = gwu;
        this.A02 = r3;
        this.A01 = composeView;
    }

    public final void onViewAttachedToWindow(View view) {
        this.A00.removeOnAttachStateChangeListener(this);
        if (Systrace.A0E(1)) {
            0fS.A01("ThreadsComposePrimitiveComponent.bind(uiState)", 513012778);
        }
        try {
            C53950Gwu gwu = this.A03;
            Activity activity = gwu.A00;
            UserSession userSession = gwu.A01;
            C53604GrJ grJ = gwu.A03;
            C55679Hlc hlc = gwu.A02;
            GZM.A00(activity, this.A01, this.A02, userSession, hlc, grJ);
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1829731391);
            }
        }
    }
}
