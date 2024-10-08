package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.3pO  reason: invalid class name and case insensitive filesystem */
public final class C252613pO {
    public int A00 = A00();
    public boolean A01;
    public final Activity A02;
    public final C249453jo A03;
    public final UserSession A04;

    public C252613pO(Activity activity, C249453jo r3, UserSession userSession) {
        0qQ.A0B(activity, 1);
        0qQ.A0B(userSession, 3);
        this.A02 = activity;
        this.A03 = r3;
        this.A04 = userSession;
    }

    public final int A02(Context context, AnonymousClass4WV r7, float f, int i, boolean z, boolean z2) {
        int A012;
        0qQ.A0B(r7, 1);
        int ordinal = r7.ordinal();
        if (ordinal == 0) {
            A012 = A01(context, z2);
        } else if (ordinal == 1) {
            A012 = A01(context, z2) - context.getResources().getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height);
        } else if (ordinal == 2) {
            A012 = (int) (((float) AnonymousClass0nB.A01(context)) / f);
        } else if (ordinal == 3) {
            A012 = ((int) (((float) AnonymousClass0nB.A01(context)) / 0.8f)) + context.getResources().getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height);
        } else if (ordinal == 4) {
            A012 = (A01(context, z2) + (((int) (((float) AnonymousClass0nB.A01(context)) / 0.8f)) + context.getResources().getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height))) / 2;
        } else {
            throw new RuntimeException();
        }
        if (z) {
            return A012;
        }
        if (182.A06(0Tu.A05, this.A04, 36328761830293071L)) {
            return Math.min(i, A012);
        }
        return A012;
    }

    private final int A00() {
        int A0A;
        int A07;
        AnonymousClass2ZP r0;
        int intValue;
        Activity activity = this.A02;
        View findViewById = activity.findViewById(R.id.layout_container_main);
        Integer num = null;
        if (findViewById != null) {
            num = Integer.valueOf(findViewById.getHeight());
        }
        int i = 0;
        if (num == null || (intValue = num.intValue()) <= 0) {
            this.A01 = true;
            int A002 = AnonymousClass0nB.A00(activity);
            if ((activity instanceof AnonymousClass2ZP) && (r0 = (AnonymousClass2ZP) activity) != null && r0.C3p() == 0) {
                i = activity.getResources().getDimensionPixelOffset(2Yu.A0H(activity, 0Pn.A01(this.A04)));
            }
            if (C226122ff.A03()) {
                A0A = A002 - C226122ff.A01();
                A07 = C226122ff.A00();
            } else {
                A0A = A002 - 0nA.A0A(activity);
                A07 = 0nA.A07(activity);
            }
            return (A0A - A07) - i;
        }
        this.A01 = false;
        return intValue;
    }

    private final int A01(Context context, boolean z) {
        int A002;
        2dZ AYJ;
        if (this.A01) {
            this.A00 = A00();
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.audience_selector_pill_layout_height);
        C249453jo r0 = this.A03;
        if (r0 == null || (AYJ = r0.AYJ()) == null) {
            A002 = AnonymousClass3D4.A00(this.A02);
        } else {
            A002 = AYJ.A0S.getMeasuredHeight();
        }
        int i = dimensionPixelSize + A002;
        if (z) {
            i += context.getResources().getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding);
        }
        return this.A00 - i;
    }
}
