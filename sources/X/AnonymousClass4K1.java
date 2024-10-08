package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.4K1  reason: invalid class name */
public final class AnonymousClass4K1 implements C263244Jw {
    public final UserSession A00;
    public final C258303yn A01;
    public final AnonymousClass4K0 A02;
    public final AnonymousClass3W1 A03;
    public final Runnable A04 = new AnonymousClass4K2(this);

    public AnonymousClass4K1(UserSession userSession, C258303yn r3, AnonymousClass4K0 r4, AnonymousClass3W1 r5) {
        0qQ.A0B(r3, 2);
        0qQ.A0B(r4, 3);
        this.A00 = userSession;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }

    public static final void A00(View view) {
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setStartDelay(200).setDuration(400);
    }

    public final void ABH() {
    }

    public final void Eua() {
        C258303yn r6 = this.A01;
        C252063oV r11 = r6.A05;
        if (r11 != null) {
            AnonymousClass3W1 r3 = this.A03;
            r3.A0L(r6, (Integer) null, false);
            r3.A0f(true);
            r3.A0K(AnonymousClass3WB.ONSCREEN);
            Runnable runnable = this.A04;
            0qQ.A0B(runnable, 0);
            r6.A03 = runnable;
            View view = r11.getView();
            View findViewById = view.findViewById(R.id.feed_end_scene_backdrop);
            findViewById.setAlpha(0.0f);
            findViewById.animate().alpha(1.0f).setDuration(300);
            View findViewById2 = view.findViewById(R.id.feed_end_scene_content_group);
            findViewById2.setAlpha(0.0f);
            ViewPropertyAnimator alpha = findViewById2.animate().alpha(1.0f);
            0qQ.A07(alpha);
            alpha.setStartDelay(300);
            alpha.setDuration(300);
            r11.setVisibility(0);
            TextView textView = r6.A02;
            if (textView != null) {
                A00(textView);
            }
            ViewGroup viewGroup = r6.A00;
            TextView textView2 = r6.A01;
            if (textView2 != null) {
                textView2.setText(this.A02.A02);
            }
            if (viewGroup != null) {
                A00(viewGroup);
            }
            AnonymousClass4K0 r2 = this.A02;
            if (!r2.A03) {
                AnonymousClass0fU.A00(new IAG(this), findViewById);
            } else {
                findViewById.setOnTouchListener(new IDJ(this));
            }
            if (viewGroup != null) {
                AnonymousClass0fU.A00(new C244023aW(this.A00, (String) null, C58423Irg.A00, new J6K(this, 29), true), viewGroup);
            }
            ((C62320sa) r2.A01.A01).invoke();
            view.invalidate();
            if (r2.A04 && r3.A23) {
                r6.A04.postDelayed(runnable, (long) (r2.A00 * 1000.0d));
            }
        }
    }

    public final void hide() {
        AnonymousClass3W1 r3 = this.A03;
        if (false != r3.A26) {
            r3.A26 = false;
        }
        C252063oV r1 = this.A01.A05;
        if (r1 != null) {
            r3.A0f(false);
            r1.setVisibility(8);
        }
    }

    public static final void A01(AnonymousClass4K1 r2) {
        r2.hide();
        r2.A03.A0K(AnonymousClass3WB.HIDDEN);
        ((C62320sa) r2.A02.A01.A02).invoke();
    }
}
