package X;

import android.view.View;
import android.view.ViewParent;
import com.instagram.android.R;

/* renamed from: X.Mnp  reason: case insensitive filesystem */
public abstract class C67434Mnp {
    public static final void A01(View view) {
        0qQ.A0B(view, 0);
        view.setMinimumHeight(DbU.A05(view).getDimensionPixelSize(R.dimen.challenge_sticker_v2_4_winner2_submission_offsetX));
        view.getLayoutParams().height = -2;
    }

    public static final void A02(View view) {
        0qQ.A0B(view, 0);
        view.setMinimumHeight(DbU.A05(view).getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size));
        view.getLayoutParams().height = -2;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.instagram.common.ui.widget.imageview.CircularImageView r5) {
        /*
            r4 = 0
            android.content.Context r2 = r5.getContext()
            r1 = 2132017222(0x7f140046, float:1.9672716E38)
            int[] r0 = X.C71382cm.A0F
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r1, r0)
            X.0qQ.A07(r3)
            r1 = 2
            r0 = 2130968697(0x7f040079, float:1.7546055E38)
            int r0 = X.2Yu.A0H(r2, r0)
            int r0 = r2.getColor(r0)
            int r2 = r3.getColor(r1, r0)
            r0 = 5
            int r0 = r3.getDimensionPixelSize(r0, r4)
            r3.recycle()
            if (r0 <= 0) goto L_0x0035
            X.2hK r1 = new X.2hK
            r1.<init>(r0, r2)
            android.graphics.RectF r0 = X.0nA.A01
            r5.setBackground(r1)
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67434Mnp.A03(com.instagram.common.ui.widget.imageview.CircularImageView):void");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(com.instagram.common.ui.widget.imageview.CircularImageView r5) {
        /*
            r4 = 0
            android.content.Context r2 = X.JTP.A0C(r5, r4)
            int r1 = X.C66582MXn.A01(r2)
            int r0 = X.C51972G9s.A08(r2)
            X.C66580MXl.A1B(r5, r1)
            X.C66580MXl.A1C(r5, r1)
            r5.setPadding(r0, r0, r0, r0)
            r1 = 2132017221(0x7f140045, float:1.9672714E38)
            int[] r0 = X.C71382cm.A0F
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r1, r0)
            X.0qQ.A07(r3)
            r1 = 2
            r0 = 2130968697(0x7f040079, float:1.7546055E38)
            int r0 = X.AnonymousClass7TF.A03(r2, r0)
            int r2 = r3.getColor(r1, r0)
            r0 = 5
            int r0 = r3.getDimensionPixelSize(r0, r4)
            r3.recycle()
            if (r0 <= 0) goto L_0x0042
            X.2hK r1 = new X.2hK
            r1.<init>(r0, r2)
            android.graphics.RectF r0 = X.0nA.A01
            r5.setBackground(r1)
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67434Mnp.A04(com.instagram.common.ui.widget.imageview.CircularImageView):void");
    }

    public static final void A00(View view) {
        0qQ.A0B(view, 0);
        ViewParent parent = view.getParent();
        if (parent != null) {
            View view2 = (View) parent;
            view2.post(new C67447Mo2(view, AnonymousClass7TF.A02(view2.getContext(), R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), view2));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
