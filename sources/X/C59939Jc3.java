package X;

import android.graphics.drawable.Drawable;
import androidx.activity.ComponentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Jc3  reason: case insensitive filesystem */
public final class C59939Jc3 {
    public C262204Co A00;
    public final Drawable A01 = AnonymousClass7TE.A0S(this.A05).getDrawable(R.drawable.rollcall_timer_background);
    public final Drawable A02 = AnonymousClass7TE.A0S(this.A05).getDrawable(R.drawable.rollcall_timer_urgent_background);
    public final ComponentActivity A03;
    public final UserSession A04;
    public final IgTextView A05;
    public final AnonymousClass0eM A06;

    public final void A00() {
        this.A00 = C51966G9m.A1L(new C66183MGu(this, (AnonymousClass4D7) null, 26), AnonymousClass07a.A00(this.A03));
    }

    public C59939Jc3(ComponentActivity componentActivity, UserSession userSession, IgTextView igTextView) {
        AnonymousClass7TG.A1P(componentActivity, igTextView);
        this.A03 = componentActivity;
        this.A04 = userSession;
        this.A05 = igTextView;
        this.A06 = DbS.A0I(new C66295MMe(componentActivity, 49), new C41656Ay8(this, 0), new MJ9(43, (Object) null, componentActivity), DbS.A0z(JYE.class));
    }
}
