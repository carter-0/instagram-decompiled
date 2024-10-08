package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.model.venue.Venue;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.Vks  reason: case insensitive filesystem */
public final class C18066Vks {
    public Venue A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final CircularImageView A04;
    public final C19507Wat A05;
    public final GradientSpinner A06;
    public final Context A07;
    public final View A08;
    public final View A09;
    public final LinearLayout A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final UserSession A0D;

    public final void A00(Spannable spannable, View.OnClickListener onClickListener, String str) {
        A02(false);
        TextView textView = this.A0C;
        textView.setText(str);
        LinearLayout linearLayout = this.A0A;
        AnonymousClass0fU.A00(onClickListener, linearLayout);
        textView.setVisibility(0);
        TextView textView2 = this.A0B;
        if (spannable == null) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(spannable);
            textView2.setVisibility(0);
        }
        textView.setGravity(8388611);
        linearLayout.setGravity(8388627);
        ImageView imageView = this.A02;
        if (imageView.getVisibility() == 4) {
            imageView.setVisibility(8);
        }
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        if (r6 == null) goto L_0x0005;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass0iw r4, X.C20904X3v r5, com.instagram.model.reels.Reel r6, com.instagram.model.venue.Venue r7) {
        /*
            r3 = this;
            if (r7 == 0) goto L_0x0005
            r2 = 1
            if (r6 != 0) goto L_0x0006
        L_0x0005:
            r2 = 0
        L_0x0006:
            r3.A03(r2)
            com.instagram.model.venue.Venue r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 != 0) goto L_0x001e
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r3.A04
            r1 = 4
            r0.setVisibility(r1)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r3.A06
            r0.setVisibility(r1)
            r3.A00 = r7
        L_0x001e:
            if (r2 == 0) goto L_0x0052
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r3.A04
            r1 = 3
            X.WTJ r0 = new X.WTJ
            r0.<init>(r3, r1)
            r2.A0E = r0
            X.0qQ.A0A(r6)
            com.instagram.common.typedurl.ImageUrl r0 = r6.A07()
            if (r0 == 0) goto L_0x0039
            X.0qQ.A0A(r4)
            r2.setUrl(r0, r4)
        L_0x0039:
            android.widget.LinearLayout r1 = r3.A0A
            r0 = 19
            X.WB4.A00(r1, r6, r5, r3, r0)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r1 = r3.A06
            r0 = 20
            X.WB4.A00(r1, r6, r5, r3, r0)
            com.instagram.common.session.UserSession r0 = r3.A0D
            boolean r0 = r6.A16(r0)
            if (r0 == 0) goto L_0x0053
            r1.A04()
        L_0x0052:
            return
        L_0x0053:
            r1.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18066Vks.A01(X.0iw, X.X3v, com.instagram.model.reels.Reel, com.instagram.model.venue.Venue):void");
    }

    public final void A02(boolean z) {
        TextView textView = this.A03;
        textView.setVisibility(DbW.A01(z ? 1 : 0));
        this.A0A.setVisibility(DbW.A00(z));
        if (z) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            0qQ.A07(compoundDrawables);
            Drawable drawable = compoundDrawables[0];
            if (drawable != null) {
                Context context = this.A07;
                DbX.A11(context, drawable, 2Yu.A0B(context));
            }
            this.A02.setVisibility(8);
            this.A01.setVisibility(8);
            this.A08.setVisibility(8);
            this.A09.setVisibility(8);
        }
    }

    public final void A03(boolean z) {
        int i = 0;
        this.A08.setVisibility(DbW.A01(z ? 1 : 0));
        View view = this.A09;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
        if (!z) {
            this.A0A.setOnClickListener((View.OnClickListener) null);
        }
    }

    public C18066Vks(View view, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, view);
        this.A07 = AnonymousClass7TE.A0S(view);
        this.A0D = userSession;
        this.A0A = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.action_bar_title_layout);
        this.A0C = AnonymousClass7TG.A0R(view, R.id.action_bar_title);
        this.A0B = AnonymousClass7TG.A0R(view, R.id.action_bar_sub_title);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.search_field_affordance);
        this.A03 = A0R;
        this.A01 = DbX.A0J(view, R.id.accessory_button);
        this.A02 = DbX.A0J(view, R.id.x_button);
        CircularImageView A0a = DbX.A0a(view, R.id.story_image);
        this.A04 = A0a;
        GradientSpinner gradientSpinner = (GradientSpinner) AnonymousClass7TF.A0F(view, R.id.gradient_spinner);
        this.A06 = gradientSpinner;
        this.A05 = new C19507Wat(A0a, gradientSpinner);
        this.A08 = AnonymousClass7TF.A0G(view, R.id.story_container);
        this.A09 = AnonymousClass7TF.A0G(view, R.id.story_separator);
        A0R.setHint(2131972797);
    }
}
