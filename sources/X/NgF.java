package X;

import android.view.View;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

public final class NgF extends C262934Go {
    public final /* synthetic */ C71427OkS A00;
    public final /* synthetic */ BottomSheetFragment A01;
    public final /* synthetic */ AnonymousClass37D A02;

    public NgF(C71427OkS okS, BottomSheetFragment bottomSheetFragment, AnonymousClass37D r3) {
        this.A01 = bottomSheetFragment;
        this.A00 = okS;
        this.A02 = r3;
    }

    public final void Cv6(float f) {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A01.contentView;
        if (touchInterceptorFrameLayout != null) {
            touchInterceptorFrameLayout.CNi(this.A00);
        }
    }

    public final void D4N() {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A01.contentView;
        if (touchInterceptorFrameLayout != null) {
            touchInterceptorFrameLayout.CNi(this.A00);
        }
    }

    public final void D9d() {
        this.A02.A0R(this);
    }

    public final void DHB(Integer num) {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A01.contentView;
        if (touchInterceptorFrameLayout != null) {
            touchInterceptorFrameLayout.CNi((View.OnTouchListener) null);
        }
    }
}
