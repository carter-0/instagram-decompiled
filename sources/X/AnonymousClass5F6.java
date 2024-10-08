package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.5F6  reason: invalid class name */
public abstract class AnonymousClass5F6 {
    public static final void A00(UserSession userSession, AnonymousClass3W1 r3, Long l, boolean z) {
        AnonymousClass5FA A00;
        long j;
        if (r3 != null) {
            if (l != null) {
                if (z) {
                    C292885jg.A00(userSession).A02(r3, l.longValue());
                }
                A00 = AnonymousClass5F9.A00();
                j = l.longValue();
            } else {
                if (z) {
                    C292885jg.A00(userSession).A02(r3, 4000);
                }
                A00 = AnonymousClass5F9.A00();
                j = 4000;
            }
            A00.A01(r3, j);
        }
    }

    public static final void A01(C254073rt r5, boolean z, boolean z2, boolean z3) {
        Integer num;
        int i;
        IgTextView igTextView;
        int i2;
        r5.A0P.setSelected(z);
        AnonymousClass3W1 r1 = r5.A09;
        1Xj r0 = null;
        if (r1 != null) {
            num = Integer.valueOf(r1.A02);
        } else {
            num = null;
        }
        AnonymousClass3z3 r3 = r5.A0U;
        int i3 = r5.A0S.A00;
        C282815Ev r12 = r5.A08;
        if (r12 != null) {
            r0 = r12.A02;
        }
        int A00 = C258443z1.A00(r0, num, i3);
        if (z2) {
            float[] fArr = {0.0f, 1.0f};
            if (z) {
                // fill-array-data instruction
                fArr[0] = 1065353216;
                fArr[1] = 0;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            ofFloat.setDuration(200).addUpdateListener(new C56690I7w(r5, r3, A00, z3));
            ofFloat.start();
            return;
        }
        AnonymousClass3z2 r32 = r3.A00;
        if (z) {
            i = -1;
        } else {
            i = r32.A09;
        }
        if (z3) {
            r5.A02.setTextColor(i);
            igTextView = r5.A07;
        } else {
            r5.A01.setTextColor(i);
            igTextView = r5.A06;
        }
        igTextView.setTextColor(i);
        r5.A0L.setTextColor(i);
        ((TextView) r5.A0Q.A01()).setTextColor(i);
        TextSwitcher textSwitcher = r5.A0K;
        TextView textView = (TextView) textSwitcher.getCurrentView();
        if (textView != null) {
            textView.setTextColor(i);
        }
        TextView textView2 = (TextView) textSwitcher.getNextView();
        if (textView2 != null) {
            textView2.setTextColor(i);
        }
        ViewGroup viewGroup = r5.A0J;
        int i4 = A00;
        if (!z) {
            i4 = r32.A01;
        }
        viewGroup.setBackgroundColor(i4);
        View view = r5.A0H;
        if (!z) {
            A00 = r32.A04;
        }
        view.setBackgroundColor(A00);
        TextView textView3 = r5.A0M;
        if (textView3.getVisibility() == 0) {
            if (z) {
                i2 = r32.A05;
            } else {
                i2 = r32.A06;
            }
            textView3.setTextColor(i2);
        }
        r5.A05.setColorFilter(i);
        C282815Ev r02 = r5.A08;
        if (r02 != null && r02.A01 != null) {
            r5.A04.setColorFilter(i);
        }
    }
}
