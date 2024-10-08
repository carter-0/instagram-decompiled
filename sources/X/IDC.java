package X;

import android.view.View;
import com.instagram.common.session.UserSession;

public final class IDC implements View.OnLayoutChangeListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ GIF A01;
    public final /* synthetic */ C255783ui A02;
    public final /* synthetic */ C249693kD A03;

    public IDC(UserSession userSession, GIF gif, C255783ui r3, C249693kD r4) {
        this.A01 = gif;
        this.A00 = userSession;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.A01.A00(this.A00, this.A02, this.A03);
    }
}
