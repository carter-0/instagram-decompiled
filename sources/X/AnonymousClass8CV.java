package X;

import android.animation.ValueAnimator;
import android.view.ViewStub;
import androidx.activity.ComponentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.8CV  reason: invalid class name */
public final class AnonymousClass8CV {
    public final ValueAnimator.AnimatorUpdateListener A00;
    public final ViewStub A01;
    public final ComponentActivity A02;
    public final UserSession A03;
    public final C252063oV A04;
    public final C357638Yz A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(new C377269Le(this, 48));
    public final ViewStub A08;

    public AnonymousClass8CV(ViewStub viewStub, ViewStub viewStub2, ComponentActivity componentActivity, UserSession userSession, C357638Yz r7) {
        0qQ.A0B(componentActivity, 1);
        0qQ.A0B(r7, 3);
        0qQ.A0B(viewStub, 4);
        0qQ.A0B(viewStub2, 5);
        this.A02 = componentActivity;
        this.A03 = userSession;
        this.A05 = r7;
        this.A01 = viewStub;
        this.A08 = viewStub2;
        this.A04 = 2b1.A01(viewStub2, false, false);
        this.A06 = AnonymousClass0eN.A01(new C377269Le(this, 47));
        this.A00 = new AnonymousClass8CW(this);
    }
}
