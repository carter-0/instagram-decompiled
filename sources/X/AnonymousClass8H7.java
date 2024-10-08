package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.io.File;

/* renamed from: X.8H7  reason: invalid class name */
public final class AnonymousClass8H7 {
    public Drawable A00;
    public C356758Vc A01;
    public File A02;
    public final float A03;
    public final Activity A04;
    public final UserSession A05;
    public final AnonymousClass8BA A06;
    public final AnonymousClass8H8 A07 = new AnonymousClass8H8(this);
    public final InteractiveDrawableContainer A08;
    public final boolean A09;

    public AnonymousClass8H7(AnonymousClass8BA r3, AnonymousClass80D r4, InteractiveDrawableContainer interactiveDrawableContainer) {
        0qQ.A0B(interactiveDrawableContainer, 3);
        this.A06 = r3;
        this.A08 = interactiveDrawableContainer;
        this.A05 = r4.A0S;
        Activity activity = r4.A05;
        this.A04 = activity;
        this.A09 = r4.A3E;
        0qQ.A07(activity);
        this.A03 = 0nA.A00(activity, 234.0f);
    }

    public static final int A00(Context context, int i) {
        try {
            return context.getResources().getDimensionPixelSize(i);
        } catch (Resources.NotFoundException unused) {
            0kD.A0I(002.A0O("BirthdaySelfieCaptureController failed to find string resource for resource id ", i), (Throwable) null, 0Yt.A0E());
            return 0;
        }
    }
}
