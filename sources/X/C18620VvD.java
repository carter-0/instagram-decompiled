package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.business.promote.model.AudiencePotentialReachRating;
import com.instagram.business.promote.model.PromoteAudiencePotentialReach;
import com.instagram.common.session.UserSession;

/* renamed from: X.VvD  reason: case insensitive filesystem */
public final class C18620VvD {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public FragmentActivity A03;
    public UserSession A04;
    public Drawable A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;

    public C18620VvD(UserSession userSession, FragmentActivity fragmentActivity, View view) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A03 = fragmentActivity;
        this.A06 = view;
        View findViewById = view.findViewById(R.id.audience_potential_reach_view);
        if (findViewById != null) {
            TextView A0d = AnonymousClass7TE.A0d(findViewById, R.id.potential_reach_number_view);
            ImageView imageView = null;
            if (A0d != null) {
                A0d.setText(2131970195);
            } else {
                A0d = null;
            }
            this.A02 = A0d;
            Context context = findViewById.getContext();
            Drawable drawable = context.getDrawable(R.drawable.instagram_info_pano_outline_24);
            this.A05 = drawable;
            if (drawable != null) {
                DbX.A11(context, drawable, 2Yu.A0B(context));
            }
            ImageView A0G = DbS.A0G(findViewById, R.id.audience_size_education_icon);
            if (A0G != null) {
                A0G.setImageDrawable(this.A05);
                C18887WAz.A00(A0G, 61, this);
                imageView = A0G;
            }
            this.A01 = imageView;
            this.A00 = findViewById.findViewById(R.id.potential_reach_progress_bar);
            this.A09 = findViewById.findViewById(R.id.rating_too_specific_bar_container);
            this.A07 = findViewById.findViewById(R.id.rating_great_bar_container);
            this.A08 = findViewById.findViewById(R.id.rating_too_broad_bar_container);
            TextView A0d2 = AnonymousClass7TE.A0d(findViewById, R.id.potential_reach_number_sub_title);
            if (A0d2 != null) {
                A0d2.setText(2131970197);
            }
        }
    }

    public final void A01() {
        this.A03 = null;
        this.A06 = null;
        this.A02 = null;
        this.A01 = null;
        this.A05 = null;
        this.A00 = null;
        this.A09 = null;
        this.A07 = null;
        this.A08 = null;
    }

    public final void A02(C61082JwK jwK) {
        AudiencePotentialReachRating audiencePotentialReachRating;
        0qQ.A0B(jwK, 0);
        if (jwK.A01) {
            A00((AudiencePotentialReachRating) null);
            int A022 = JTQ.A02(this.A02);
            ImageView imageView = this.A01;
            if (imageView != null) {
                imageView.setVisibility(A022);
            }
            View view = this.A00;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        PromoteAudiencePotentialReach promoteAudiencePotentialReach = (PromoteAudiencePotentialReach) jwK.A00;
        if (promoteAudiencePotentialReach != null) {
            int i = promoteAudiencePotentialReach.A01;
            int i2 = promoteAudiencePotentialReach.A02;
            boolean A0R = W3x.A0R(promoteAudiencePotentialReach);
            TextView textView = this.A02;
            if (textView != null) {
                textView.setVisibility(0);
            }
            ImageView imageView2 = this.A01;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            AnonymousClass7TH.A0R(this.A00);
            TextView textView2 = this.A02;
            if (textView2 != null) {
                if (A0R) {
                    textView2.setText(002.A0g(W3x.A04(i), " - ", W3x.A04(i2)));
                } else {
                    textView2.setText(2131970195);
                }
            }
            audiencePotentialReachRating = promoteAudiencePotentialReach.A03;
        } else {
            TextView textView3 = this.A02;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            ImageView imageView3 = this.A01;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            AnonymousClass7TH.A0R(this.A00);
            TextView textView4 = this.A02;
            if (textView4 != null) {
                textView4.setText(2131970195);
            }
            audiencePotentialReachRating = AudiencePotentialReachRating.A06;
        }
        A00(audiencePotentialReachRating);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(com.instagram.business.promote.model.AudiencePotentialReachRating r7) {
        /*
            r6 = this;
            android.view.View r3 = r6.A09
            r4 = 8
            if (r3 == 0) goto L_0x0023
            r0 = 2131439218(0x7f0b2e72, float:1.8500385E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L_0x001d
            android.content.Context r1 = r3.getContext()
            r0 = 2130970330(0x7f0406da, float:1.7549367E38)
            int r0 = X.2Yu.A0H(r1, r0)
            X.DbT.A16(r1, r2, r0)
        L_0x001d:
            r0 = 2131439219(0x7f0b2e73, float:1.8500387E38)
            X.DbX.A1D(r3, r0, r4)
        L_0x0023:
            android.view.View r3 = r6.A07
            if (r3 == 0) goto L_0x0044
            r0 = 2131439218(0x7f0b2e72, float:1.8500385E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L_0x003e
            android.content.Context r1 = r3.getContext()
            r0 = 2130970330(0x7f0406da, float:1.7549367E38)
            int r0 = X.2Yu.A0H(r1, r0)
            X.DbT.A16(r1, r2, r0)
        L_0x003e:
            r0 = 2131439219(0x7f0b2e73, float:1.8500387E38)
            X.DbX.A1D(r3, r0, r4)
        L_0x0044:
            android.view.View r3 = r6.A08
            if (r3 == 0) goto L_0x0065
            r0 = 2131439218(0x7f0b2e72, float:1.8500385E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L_0x005f
            android.content.Context r1 = r3.getContext()
            r0 = 2130970330(0x7f0406da, float:1.7549367E38)
            int r0 = X.2Yu.A0H(r1, r0)
            X.DbT.A16(r1, r2, r0)
        L_0x005f:
            r0 = 2131439219(0x7f0b2e73, float:1.8500387E38)
            X.DbX.A1D(r3, r0, r4)
        L_0x0065:
            if (r7 == 0) goto L_0x00a8
            int r4 = r7.A00
            int r1 = r7.ordinal()
            r0 = 4
            r5 = 0
            if (r1 == r0) goto L_0x00d3
            r0 = 2
            if (r1 == r0) goto L_0x00be
            r0 = 3
            if (r1 == r0) goto L_0x00a9
            r0 = 1
            if (r1 == r0) goto L_0x00a9
            if (r1 != r5) goto L_0x00a8
            android.view.View r3 = r6.A07
            if (r3 == 0) goto L_0x00a8
            r0 = 2131439218(0x7f0b2e72, float:1.8500385E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L_0x0097
            android.content.Context r1 = r3.getContext()
            r0 = 2130970330(0x7f0406da, float:1.7549367E38)
        L_0x0090:
            int r0 = X.2Yu.A0H(r1, r0)
            X.DbT.A16(r1, r2, r0)
        L_0x0097:
            r0 = 2131439219(0x7f0b2e73, float:1.8500387E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r3, r0)
            if (r0 == 0) goto L_0x00a8
            if (r4 == 0) goto L_0x00a8
            r0.setVisibility(r5)
            r0.setText(r4)
        L_0x00a8:
            return
        L_0x00a9:
            android.view.View r3 = r6.A08
            if (r3 == 0) goto L_0x00a8
            r0 = 2131439218(0x7f0b2e72, float:1.8500385E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L_0x0097
            android.content.Context r1 = r3.getContext()
            r0 = 2130970232(0x7f040678, float:1.7549168E38)
            goto L_0x0090
        L_0x00be:
            android.view.View r3 = r6.A09
            if (r3 == 0) goto L_0x00a8
            r0 = 2131439218(0x7f0b2e72, float:1.8500385E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L_0x0097
            android.content.Context r1 = r3.getContext()
            r0 = 2130970215(0x7f040667, float:1.7549134E38)
            goto L_0x0090
        L_0x00d3:
            android.view.View r3 = r6.A07
            if (r3 == 0) goto L_0x00a8
            r0 = 2131439218(0x7f0b2e72, float:1.8500385E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L_0x0097
            android.content.Context r1 = r3.getContext()
            r0 = 2130970331(0x7f0406db, float:1.754937E38)
            goto L_0x0090
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18620VvD.A00(com.instagram.business.promote.model.AudiencePotentialReachRating):void");
    }
}
