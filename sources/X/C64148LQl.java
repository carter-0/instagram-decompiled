package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.arlink.ui.CoachMarkOverlay;

/* renamed from: X.LQl  reason: case insensitive filesystem */
public final class C64148LQl {
    public static final C71392co A0C = C71392co.A01();
    public View A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public TextView A04;
    public TextView A05;
    public CoachMarkOverlay A06;
    public Integer A07;
    public final ViewGroup A08;
    public final ViewStub A09;
    public final 2cs A0A;
    public final 2cs A0B;

    public static void A00(C64148LQl lQl, Integer num) {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        int i4;
        PorterDuffColorFilter porterDuffColorFilter;
        if (lQl.A07 != num) {
            lQl.A07 = num;
            ViewGroup viewGroup = lQl.A08;
            int intValue = num.intValue();
            switch (intValue) {
                case 0:
                    i = R.id.card_view;
                    break;
                case 1:
                    i = R.id.background_mode_button;
                    break;
                default:
                    i = R.id.profile_share_card;
                    break;
            }
            View requireViewById = viewGroup.requireViewById(i);
            CoachMarkOverlay coachMarkOverlay = lQl.A06;
            coachMarkOverlay.getClass();
            if (1 != intValue) {
                z = false;
            } else {
                z = true;
            }
            requireViewById.setDrawingCacheEnabled(true);
            requireViewById.buildDrawingCache();
            Bitmap drawingCache = requireViewById.getDrawingCache();
            if (drawingCache != null) {
                0fO.A03(drawingCache);
                coachMarkOverlay.A01 = Bitmap.createBitmap(drawingCache);
                Paint paint = coachMarkOverlay.A02;
                if (z) {
                    porterDuffColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                } else {
                    porterDuffColorFilter = null;
                }
                paint.setColorFilter(porterDuffColorFilter);
            }
            requireViewById.destroyDrawingCache();
            requireViewById.setDrawingCacheEnabled(false);
            0nA.A0L(coachMarkOverlay.A03, requireViewById);
            coachMarkOverlay.invalidate();
            TextView textView = lQl.A05;
            textView.getClass();
            switch (intValue) {
                case 0:
                    i2 = 2131971022;
                    break;
                case 1:
                    i2 = 2131971023;
                    break;
                default:
                    i2 = 2131971024;
                    break;
            }
            textView.setText(i2);
            TextView textView2 = lQl.A04;
            textView2.getClass();
            Resources resources = viewGroup.getResources();
            switch (intValue) {
                case 0:
                    i3 = 1;
                    break;
                case 1:
                    i3 = 2;
                    break;
                default:
                    i3 = 3;
                    break;
            }
            int i5 = 0;
            textView2.setText(resources.getString(2131975603, C51968G9o.A1Z(Integer.valueOf(i3), AnonymousClass05K.A00(3).length)));
            View view = lQl.A01;
            view.getClass();
            if (intValue != 0) {
                z2 = true;
                i4 = 0;
            } else {
                z2 = false;
                i4 = 8;
            }
            view.setVisibility(i4);
            View view2 = lQl.A00;
            view2.getClass();
            if (z2) {
                i5 = 8;
            }
            view2.setVisibility(i5);
            View view3 = lQl.A02;
            view3.getClass();
            view3.post(new M8Q(requireViewById, lQl, num));
        }
    }

    public C64148LQl(ViewGroup viewGroup) {
        this.A08 = viewGroup;
        this.A09 = DbU.A0D(viewGroup, R.id.coach_mark_stub);
        2cp A002 = C61340me.A00();
        2cs A022 = A002.A02();
        C71392co r2 = A0C;
        A022.A09(r2);
        A022.A06 = true;
        K0E.A00(A022, this, 0);
        this.A0A = A022;
        2cs A023 = A002.A02();
        A023.A09(r2);
        A023.A06 = true;
        K0E.A00(A023, this, 1);
        this.A0B = A023;
    }
}
