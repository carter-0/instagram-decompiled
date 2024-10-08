package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.UCf  reason: case insensitive filesystem */
public final class C14851UCf extends C249703kE {
    public final C17692VcN A00;
    public final W17 A01;

    public C14851UCf(View view, UserSession userSession) {
        super(view);
        this.A00 = new C17692VcN(view.requireViewById(R.id.location_info));
        this.A01 = new W17(userSession);
    }
}
