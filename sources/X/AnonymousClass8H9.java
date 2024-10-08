package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.io.File;

/* renamed from: X.8H9  reason: invalid class name */
public final class AnonymousClass8H9 {
    public Drawable A00;
    public C356768Vd A01;
    public File A02;
    public final float A03;
    public final Activity A04;
    public final UserSession A05;
    public final AnonymousClass8BA A06;
    public final AnonymousClass8HA A07 = new AnonymousClass8HA(this);
    public final InteractiveDrawableContainer A08;

    public AnonymousClass8H9(AnonymousClass8BA r3, AnonymousClass80D r4, InteractiveDrawableContainer interactiveDrawableContainer) {
        0qQ.A0B(interactiveDrawableContainer, 3);
        this.A06 = r3;
        this.A08 = interactiveDrawableContainer;
        this.A05 = r4.A0S;
        Activity activity = r4.A05;
        this.A04 = activity;
        0qQ.A07(activity);
        this.A03 = 0nA.A00(activity, 144.0f);
    }
}
