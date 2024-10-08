package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.33Q  reason: invalid class name */
public final class AnonymousClass33Q implements AnonymousClass0mA {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final boolean A02;
    public final Activity A03;
    public final Context A04;

    public AnonymousClass33Q(Activity activity, Context context, AnonymousClass0iw r4, UserSession userSession, boolean z) {
        0qQ.A0B(context, 2);
        0qQ.A0B(userSession, 3);
        this.A03 = activity;
        this.A04 = context;
        this.A01 = userSession;
        this.A00 = r4;
        this.A02 = z;
    }

    public final void A01(AnonymousClass9J0 r5, C241383Oz r6, AnonymousClass3W1 r7) {
        0qQ.A0B(r6, 0);
        0qQ.A0B(r7, 2);
        C376509Ig r3 = (C376509Ig) r5.A00;
        ((0sP) r3.A04).invoke(r6.A02);
        ((0sP) r3.A03).invoke(r6);
        r6.A01 = r5;
        r6.A02 = r7;
        View view = r6.A06;
        if (view.getLayoutParams() != null) {
            0nA.A0V(view, -2);
        }
        if (((Boolean) ((0sP) r3.A01).invoke(this.A00)).booleanValue() || !r5.A02) {
            ViewGroup viewGroup = r6.A00;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                return;
            }
            return;
        }
        if (r6.A00 == null) {
            ViewStub viewStub = r6.A07;
            if (viewStub != null) {
                viewStub.inflate();
            }
            r6.A00();
        }
        ViewGroup viewGroup2 = r6.A00;
        if (viewGroup2 != null) {
            AnonymousClass0fU.A00(new AnonymousClass9VU(r5), viewGroup2);
        }
        ViewGroup viewGroup3 = r6.A00;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(0);
        }
    }

    public final View A00(ViewGroup viewGroup) {
        View inflate;
        Activity activity = this.A03;
        ViewGroup viewGroup2 = viewGroup;
        if (activity != null) {
            LayoutInflater layoutInflater = activity.getLayoutInflater();
            0qQ.A07(layoutInflater);
            inflate = 2Su.A01(layoutInflater, new ViewGroup.LayoutParams(-1, -2), viewGroup2, R.layout.row_feed_inline_composer_button, false, true);
        } else {
            inflate = LayoutInflater.from(this.A04).inflate(R.layout.row_feed_inline_composer_button, viewGroup, false);
        }
        0qQ.A0A(inflate);
        inflate.setTag(new C241383Oz(inflate, this.A00, this.A01, this.A02));
        return inflate;
    }
}
