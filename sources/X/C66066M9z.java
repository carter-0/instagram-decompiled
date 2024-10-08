package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* renamed from: X.M9z  reason: case insensitive filesystem */
public final class C66066M9z implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ KB3 A03;
    public final /* synthetic */ Integer A04;

    public C66066M9z(Activity activity, View view, View view2, KB3 kb3, Integer num) {
        this.A03 = kb3;
        this.A00 = activity;
        this.A02 = view;
        this.A04 = num;
        this.A01 = view2;
    }

    public final void run() {
        C226262fy r0;
        int i;
        int i2;
        KB3 kb3 = this.A03;
        AnonymousClass5Gv r02 = kb3.A00;
        if (r02 == null) {
            Activity activity = this.A00;
            View view = this.A02;
            Integer num = this.A04;
            String str = kb3.A01;
            if (str == null) {
                int intValue = num.intValue();
                Context context = view.getContext();
                switch (intValue) {
                    case 0:
                        i2 = 2131974949;
                        break;
                    case 1:
                    case 4:
                        i2 = 2131974939;
                        break;
                    case 2:
                        i2 = 2131974947;
                        break;
                    case 3:
                        i2 = 2131969852;
                        break;
                    case 5:
                        i2 = 2131974946;
                        break;
                    case 6:
                        i2 = 2131974944;
                        break;
                    default:
                        i2 = 2131974938;
                        break;
                }
                str = AnonymousClass7TE.A16(context, i2);
            }
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(activity, str);
            View view2 = this.A01;
            A0f.A03(view2);
            int intValue2 = num.intValue();
            if (intValue2 == 2 || (intValue2 != 7 && intValue2 == 8)) {
                r0 = C226262fy.BELOW_ANCHOR;
            } else {
                r0 = C226262fy.ABOVE_ANCHOR;
            }
            A0f.A06(r0);
            int width = view2.getWidth();
            if (intValue2 == 3 || intValue2 == 5 || intValue2 == 7 || intValue2 == 8) {
                i = width / 2;
            } else {
                i = 120;
            }
            int height = view2.getHeight();
            int i3 = 16;
            if (intValue2 == 2) {
                i3 = height - 16;
            } else if (intValue2 != 7 && intValue2 == 8) {
                i3 = (int) (((float) height) * 0.85f);
            }
            A0f.A04(view2, i, i3, false);
            A0f.A0F = true;
            A0f.A0A = true;
            A0f.A04 = new KSN(2, num, kb3);
            r02 = A0f.A00();
            kb3.A00 = r02;
        }
        if (r02 != null) {
            r02.A06();
        }
    }
}
