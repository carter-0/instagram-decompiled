package X;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.watchandbrowse.ui.WatchAndBrowseMainView;

/* renamed from: X.3Uy  reason: invalid class name */
public final class AnonymousClass3Uy implements AnonymousClass3Uz {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final Activity A03;

    public final C55865Hom AiE(ViewGroup viewGroup, C246993fb r8, C54512HGy hGy, WatchAndBrowseMainView watchAndBrowseMainView) {
        return new C55865Hom(viewGroup, r8, this, hGy, watchAndBrowseMainView);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        if (r8 != null) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CNI(android.view.ViewGroup r5, X.C246993fb r6, X.C54512HGy r7, com.instagram.watchandbrowse.ui.WatchAndBrowseMainView r8) {
        /*
            r4 = this;
            if (r8 == 0) goto L_0x0029
            r1 = 0
            r8.setShadowViewVisibility(r1)
            int r0 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A03 = r0
            r8.setGradientVisibility(r1)
            android.content.Context r3 = r4.A01
            r0 = 4604029899060858061(0x3fe4cccccccccccd, double:0.65)
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            android.graphics.drawable.GradientDrawable r2 = X.GIZ.A00(r3, r2, r0)
            com.instagram.common.ui.base.IgFrameLayout r1 = r8.A00
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0029
            r1.setBackground(r2)
        L_0x0029:
            if (r7 == 0) goto L_0x007c
            java.lang.String r1 = r7.A06
        L_0x002d:
            java.lang.String r0 = "back_arrow"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0079
            if (r8 == 0) goto L_0x0063
            r0 = 2131237915(0x7f081c1b, float:1.8092094E38)
            r3 = 2131099843(0x7f0600c3, float:1.781205E38)
            android.content.Context r2 = r8.getContext()
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            if (r0 == 0) goto L_0x0057
            com.instagram.common.ui.base.IgSimpleImageView r1 = r8.A06
            r1.setImageDrawable(r0)
            int r0 = r2.getColor(r3)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r1.setColorFilter(r0)
        L_0x0057:
            com.instagram.common.ui.base.IgSimpleImageView r1 = r8.A06
            if (r1 == 0) goto L_0x0063
            X.IAN r0 = new X.IAN
            r0.<init>(r6)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x0063:
            r1 = 1
            if (r7 == 0) goto L_0x0078
            boolean r0 = r7.A0F
            if (r0 != r1) goto L_0x0078
            if (r5 == 0) goto L_0x0078
            android.content.Context r1 = r4.A01
            r0 = 2131099936(0x7f060120, float:1.781224E38)
            int r0 = r1.getColor(r0)
            r5.setBackgroundColor(r0)
        L_0x0078:
            return
        L_0x0079:
            if (r8 == 0) goto L_0x0063
            goto L_0x0057
        L_0x007c:
            r1 = 0
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Uy.CNI(android.view.ViewGroup, X.3fb, X.HGy, com.instagram.watchandbrowse.ui.WatchAndBrowseMainView):void");
    }

    public final void CnH(C54512HGy hGy, WatchAndBrowseMainView watchAndBrowseMainView) {
        Activity activity;
        UserSession userSession = this.A02;
        if (userSession != null && (activity = this.A03) != null) {
            boolean z = false;
            if (hGy != null && hGy.A0F) {
                z = true;
                Context A012 = 2Yn.A01(activity);
                2db.A04(activity, (Fragment) null, A012.getColor(2Yu.A0H(A012, R.attr.status_bar_background)), true);
            }
            if (182.A06(0Tu.A05, userSession, 36317560555443537L)) {
                if (watchAndBrowseMainView != null) {
                    0qQ.A0B(activity, 0);
                    C226112fe.A0B.A04(activity, new C19778WfL(watchAndBrowseMainView), true);
                }
                if (!z) {
                    Context context = this.A01;
                    2db.A02(activity, context.getColor(2Yu.A0C(context)));
                    2db.A06(activity, true);
                }
            }
        }
    }

    public final void EII() {
        Activity activity = this.A03;
        Context context = this.A01;
        2db.A02(activity, context.getColor(2Yu.A0C(context)));
        2db.A06(activity, true);
    }

    public AnonymousClass3Uy(Activity activity, Context context, UserSession userSession) {
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = activity;
        this.A00 = 2Yu.A0G(context, R.attr.bottomSheetTopCornerRadius);
    }
}
