package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.direct.ui.countdowntimer.CountdownTimerPill;

/* renamed from: X.OMw  reason: case insensitive filesystem */
public final class C70824OMw {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public CountdownTimerPill A04;
    public AnonymousClass7L0 A05;
    public final Activity A06;
    public final UserSession A07;
    public final C252063oV A08;
    public final Context A09;

    public C70824OMw(Activity activity, View view, UserSession userSession) {
        0qQ.A0B(view, 1);
        this.A07 = userSession;
        this.A06 = activity;
        this.A09 = view.getContext();
        C252063oV A002 = 2b1.A00(view);
        this.A08 = A002;
        A002.EeU(new C72245OzD(this, 3));
    }

    public final void A00(AnonymousClass7L0 r3) {
        if (r3 != null) {
            this.A05 = r3;
            View view = this.A00;
            if (view != null) {
                view.setBackgroundColor(r3.A02);
            }
            TextView textView = this.A03;
            if (textView != null) {
                textView.setTextColor(r3.A0C);
            }
            TextView textView2 = this.A02;
            if (textView2 != null) {
                textView2.setTextColor(r3.A0D);
            }
            ImageView imageView = this.A01;
            if (imageView != null) {
                C66581MXm.A1C(imageView, r3.A0D);
            }
            CountdownTimerPill countdownTimerPill = this.A04;
            if (countdownTimerPill != null) {
                countdownTimerPill.setPillColor(r3.A0A);
            }
        }
    }

    public final void A01(2Er r13) {
        AnonymousClass914 Amp;
        if (r13 != null && (Amp = r13.Amp()) != null) {
            C252063oV r5 = this.A08;
            if (!r5.CVM() || r5.CFV() != 0) {
                Long l = Amp.A00;
                if (l != null) {
                    long longValue = (l.longValue() * 1000) - System.currentTimeMillis();
                    if (Amp.A00() && longValue > 1000) {
                        r5.getView().setVisibility(0);
                        TextView textView = this.A03;
                        if (textView != null) {
                            textView.setText(Amp.A04);
                        }
                        TextView textView2 = this.A03;
                        if (textView2 != null) {
                            textView2.setSelected(true);
                        }
                        TextView textView3 = this.A02;
                        if (textView3 != null) {
                            Context context = this.A09;
                            int i = 2131958877;
                            if (C51966G9m.A1W(this.A07, r13.AsX())) {
                                i = 2131958878;
                            }
                            DbT.A18(context, textView3, i);
                        }
                        CountdownTimerPill countdownTimerPill = this.A04;
                        if (countdownTimerPill != null) {
                            countdownTimerPill.A02(C73921Pm1.A00(this, 25), longValue, false, false);
                        }
                        C71399Ojy.A00(r5.getView(), r13, this, Amp, 24);
                        A00(this.A05);
                        return;
                    }
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
    }
}
