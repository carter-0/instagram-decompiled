package X;

import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

public final class WUX implements B3Y {
    public C15680Ugl A00;
    public final FrameLayout A01;
    public final C387399m9 A02;
    public final C3504784u A03;
    public final 1wn A04 = new C19221WQb(this, 17);
    public final UserSession A05;

    private void A00() {
        int i;
        C387399m9 r2 = this.A02;
        if (r2 != null) {
            Integer A06 = C323426xT.A00(this.A05).A06();
            if (A06 != null) {
                r2.A01(A06.intValue());
                i = 0;
            } else {
                i = 4;
            }
            r2.A00.setVisibility(i);
            r2.Eql(true, false);
        }
    }

    public final void DCN() {
        int i;
        float f;
        int i2;
        FrameLayout frameLayout = this.A01;
        if (frameLayout != null) {
            C3504784u r2 = this.A03;
            if (28D.A0U != r2.A00) {
                Product A042 = r2.A04();
                if (A042 != null) {
                    if (!A042.A04()) {
                        i = 2131976650;
                    } else if (A042.A0P) {
                        i = 2131957178;
                        if (r2.A06()) {
                            i = 2131952356;
                        }
                    } else {
                        i2 = 2131973842;
                        f = 0.4f;
                    }
                    f = 1.0f;
                } else {
                    i2 = 2131975842;
                    f = 0.4f;
                }
                this.A00 = new C15680Ugl(frameLayout.getContext(), new WB8((Object) this, 30), frameLayout, f, i);
            }
        }
        A00();
    }

    public final void DCW() {
        C15680Ugl ugl = this.A00;
        if (ugl != null) {
            ugl.A00.A04((Animation) null);
        }
        C387399m9 r1 = this.A02;
        if (r1 != null) {
            r1.Eql(false, false);
        }
    }

    public final void DDR() {
        C15680Ugl ugl = this.A00;
        if (ugl != null) {
            ugl.A00.A04((Animation) null);
        }
        C387399m9 r1 = this.A02;
        if (r1 != null) {
            r1.Eql(false, false);
        }
    }

    public final void FL8() {
        C15680Ugl ugl = this.A00;
        if (ugl != null) {
            C3504784u r2 = this.A03;
            Product A042 = r2.A04();
            int i = 2131976650;
            float f = 1.0f;
            if (A042 == null) {
                i = 2131975842;
                f = 0.4f;
            } else if (A042.A04()) {
                if (A042.A0P) {
                    i = 2131957178;
                    if (r2.A06()) {
                        i = 2131952356;
                    }
                } else {
                    i = 2131973842;
                    f = 0.4f;
                }
            }
            String A11 = DbT.A11(r2.A05, r2.A0K);
            boolean z = true;
            if (A11 == null || A11.length() == 0) {
                z = false;
            }
            AnonymousClass357 r22 = ugl.A00;
            if (z) {
                r22.A05((Animation) null);
            } else {
                r22.A04((Animation) null);
            }
            FrameLayout frameLayout = this.A01;
            frameLayout.getClass();
            String string = frameLayout.getContext().getString(i);
            TextView textView = r22.A07;
            if (textView != null) {
                textView.setText(string);
            }
            View view = r22.A02;
            if (view != null) {
                view.setAlpha(f);
            }
        }
    }

    public final void onPause() {
        AnonymousClass1Nd.A00(this.A05).A02(this.A04, C323956yN.class);
    }

    public WUX(FrameLayout frameLayout, UserSession userSession, C387399m9 r6, C3504784u r7) {
        this.A03 = r7;
        this.A05 = userSession;
        this.A01 = frameLayout;
        this.A02 = r6;
        if (r6 != null) {
            AnonymousClass8GF CrP = r6.CrP();
            CrP.A00 = new C40302AZr(this, 2);
            CrP.A00();
        }
    }

    public final void onResume() {
        A00();
        AnonymousClass1Nd.A00(this.A05).A01(this.A04, C323956yN.class);
    }
}
