package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Ko  reason: invalid class name and case insensitive filesystem */
public final class C329877Ko {
    public int A00;
    public AnonymousClass7L0 A01;
    public boolean A02;
    public final Activity A03;
    public final Context A04;
    public final View.OnClickListener A05 = new C329887Kp(this);
    public final ViewStub A06;
    public final UserSession A07;
    public final C329147Ht A08;
    public final AnonymousClass0eM A09 = AnonymousClass1YB.A00(new C377229La(this, 40));
    public final AnonymousClass0eM A0A = AnonymousClass1YB.A00(new C377229La(this, 41));
    public final AnonymousClass0eM A0B = AnonymousClass1YB.A00(new C377229La(this, 42));
    public final AnonymousClass0eM A0C = AnonymousClass1YB.A00(new C377229La(this, 43));
    public final C62320sa A0D;
    public final ViewGroup A0E;

    public C329877Ko(Activity activity, Context context, ViewGroup viewGroup, ViewStub viewStub, UserSession userSession, C329147Ht r8, C62320sa r9) {
        0qQ.A0B(viewStub, 1);
        0qQ.A0B(r9, 5);
        0qQ.A0B(viewGroup, 7);
        this.A06 = viewStub;
        this.A03 = activity;
        this.A04 = context;
        this.A07 = userSession;
        this.A0D = r9;
        this.A08 = r8;
        this.A0E = viewGroup;
    }

    private final boolean A00() {
        0kx r2 = new 0kx(this.A0E);
        while (r2.hasNext()) {
            View view = (View) r2.next();
            if (view.getVisibility() == 0 && !view.equals(this.A0A.getValue())) {
                return true;
            }
        }
        return false;
    }

    public final void A01() {
        View view;
        if (this.A00 <= 0 || this.A02 || A00()) {
            AnonymousClass0eM r2 = this.A0A;
            if (r2.CVQ() && ((View) r2.getValue()).getVisibility() == 0) {
                if (!A00()) {
                    C329067Hl.A0e(this.A08.A00, 0);
                }
                ((View) r2.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        int i = this.A00;
        AnonymousClass0eM r6 = this.A0C;
        ((TextView) r6.getValue()).setText(this.A04.getResources().getQuantityString(R.plurals.direct_scheduled_message_bar_header, i, new Object[]{Integer.valueOf(i)}));
        AnonymousClass0eM r4 = this.A0A;
        Context context = ((View) r4.getValue()).getContext();
        0qQ.A07(context);
        ((View) r4.getValue()).measure(View.MeasureSpec.makeMeasureSpec(0nA.A09(context), SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (((View) r4.getValue()).getVisibility() == 0) {
            view = (TextView) r6.getValue();
        } else {
            view = (ViewGroup) r4.getValue();
        }
        View view2 = view;
        C294975nL A012 = C294975nL.A01(view2, 0);
        A012.A0G();
        C294975nL A0F = A012.A0F(true);
        A0F.A0T((float) view2.getMeasuredHeight(), 0.0f);
        A0F.A04 = 0;
        A0F.A0H();
        AnonymousClass7L0 r0 = this.A01;
        if (r0 != null) {
            A02(r0);
        }
    }

    public final void A02(AnonymousClass7L0 r3) {
        int i;
        AnonymousClass0eM r1 = this.A0A;
        if (r1.CVQ() && ((View) r1.getValue()).getVisibility() == 0) {
            ((View) r1.getValue()).setBackgroundColor(r3.A02);
            ((View) this.A0B.getValue()).setBackgroundColor(r3.A08);
            int i2 = r3.A0D;
            ((TextView) this.A0C.getValue()).setTextColor(i2);
            ((ImageView) this.A09.getValue()).setColorFilter(i2);
            C329067Hl r12 = this.A08.A00;
            AnonymousClass7L0 r0 = r12.A0U;
            if (r0 != null) {
                i = r0.A02;
            } else {
                i = 0;
            }
            C329067Hl.A0e(r12, i);
        }
        this.A01 = r3;
    }
}
