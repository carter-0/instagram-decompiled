package X;

import android.view.View;
import com.instagram.api.schemas.OriginalAudioSubtype;

public final class I9w implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C52864Gdx A01;

    public final void onViewAttachedToWindow(View view) {
        0qQ.A0B(view, 0);
        this.A01.A00.A04(OriginalAudioSubtype.A06, this.A00, true);
        view.removeOnAttachStateChangeListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public I9w(C52864Gdx gdx, int i) {
        this.A01 = gdx;
        this.A00 = i;
    }
}
