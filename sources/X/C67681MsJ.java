package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.MsJ  reason: case insensitive filesystem */
public final class C67681MsJ extends ViewGroup {
    public boolean A00;
    public int A01;
    public String A02 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
    public final CircularImageView A03;
    public final GradientSpinner A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final int A08;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public C67681MsJ(Context context) {
        super(context, (AttributeSet) null, 0);
        ? circularImageView = new CircularImageView(context, (AttributeSet) null, 0);
        this.A03 = circularImageView;
        this.A05 = AnonymousClass0eN.A01(new C58707IwG((Object) context, 46));
        this.A06 = AnonymousClass0eN.A01(new C58707IwG((Object) context, 47));
        this.A07 = AnonymousClass0eN.A01(new C58707IwG((Object) context, 48));
        GradientSpinner gradientSpinner = new GradientSpinner(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        this.A04 = gradientSpinner;
        int A022 = DbS.A02(context, 4);
        this.A08 = A022;
        this.A01 = A022;
        addView(circularImageView);
        addView(gradientSpinner);
    }

    public static /* synthetic */ void getRenderType$annotations() {
    }

    public final void setRenderType(String str) {
        0qQ.A0B(str, 0);
        this.A02 = str;
        boolean equals = str.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        if (!equals && !this.A00) {
            this.A00 = true;
            addView(C66580MXl.A0R(this.A06), 0);
            AnonymousClass0eM r2 = this.A05;
            View A0c = AnonymousClass7TE.A0c(r2);
            Context context = getContext();
            DbU.A11(context, A0c, R.drawable.reel_background_content_gradient);
            addView(AnonymousClass7TE.A0c(r2), 1);
            AnonymousClass0eM r3 = this.A07;
            TextView A0I = JTO.A0I(r3);
            A0I.setTextSize(2, 14.0f);
            A0I.setEllipsize(TextUtils.TruncateAt.END);
            A0I.setMaxLines(1);
            int A042 = AnonymousClass7TG.A04(context);
            0nA.A0h(JTO.A0I(r3), A042, A042);
            addView(JTO.A0I(r3), 2);
        }
        boolean z = !equals;
        C69767Nrq.A00(AnonymousClass7TE.A0c(this.A05), z);
        C69767Nrq.A00(C66580MXl.A0R(this.A06), z);
        C69767Nrq.A00(JTO.A0I(this.A07), z);
    }

    private final View getGradient() {
        return AnonymousClass7TE.A0c(this.A05);
    }

    public final CircularImageView getAvatarView() {
        return this.A03;
    }

    public final IgImageView getPreviewCard() {
        return C66580MXl.A0R(this.A06);
    }

    public final GradientSpinner getRing() {
        return this.A04;
    }

    public final TextView getUsernameLabel() {
        return JTO.A0I(this.A07);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r3v3, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (0qQ.A0K(this.A02, "with_preview_card")) {
            AnonymousClass0eM r4 = this.A06;
            C66580MXl.A0R(r4).layout(0, 0, C66580MXl.A0R(r4).getMeasuredWidth(), C66580MXl.A0R(r4).getMeasuredHeight());
            AnonymousClass0eM r3 = this.A05;
            AnonymousClass7TE.A0c(r3).layout(0, 0, AnonymousClass7TE.A0c(r3).getMeasuredWidth(), AnonymousClass7TE.A0c(r3).getMeasuredHeight());
            int measuredWidth = C66580MXl.A0R(r4).getMeasuredWidth() / 2;
            int measuredHeight = C66580MXl.A0R(r4).getMeasuredHeight();
            Context A0S = AnonymousClass7TE.A0S(this);
            GradientSpinner gradientSpinner = this.A04;
            int A002 = (measuredHeight - ((int) 0nA.A00(A0S, A0S.getResources().getDimension(R.dimen.account_discovery_bottom_gap)))) - (gradientSpinner.getMeasuredHeight() / 2);
            gradientSpinner.layout(measuredWidth - (gradientSpinner.getMeasuredWidth() / 2), A002 - (gradientSpinner.getMeasuredHeight() / 2), (gradientSpinner.getMeasuredWidth() / 2) + measuredWidth, (gradientSpinner.getMeasuredHeight() / 2) + A002);
            AnonymousClass0eM r9 = this.A07;
            int i5 = this.A08;
            JTO.A0I(r9).layout((measuredWidth - JTO.A0I(r9).getPaddingLeft()) - (JTO.A0I(r9).getMeasuredWidth() / 2), (gradientSpinner.getMeasuredHeight() / 2) + A002 + i5, JTO.A0I(r9).getPaddingRight() + measuredWidth + (JTO.A0I(r9).getMeasuredWidth() / 2), gradientSpinner.getMeasuredHeight() + A002 + i5 + JTO.A0I(r9).getMeasuredHeight());
            ? r32 = this.A03;
            r32.layout(measuredWidth - (r32.getMeasuredWidth() / 2), A002 - (r32.getMeasuredHeight() / 2), measuredWidth + (r32.getMeasuredWidth() / 2), A002 + (r32.getMeasuredHeight() / 2));
            return;
        }
        C66582MXn.A13(this.A04, 0);
        C66582MXn.A13(this.A03, this.A01);
    }

    public final void setRingActive(boolean z) {
        GradientSpinner gradientSpinner = this.A04;
        if (z) {
            gradientSpinner.A02();
        } else {
            gradientSpinner.A04();
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void setRingSpacing(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = this.A08;
        }
        this.A01 = i;
        this.A03.invalidate();
    }

    public final void setShowRing(boolean z) {
        C69767Nrq.A00(this.A04, z);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int min = Math.min(size, size2);
        int i4 = min - this.A01;
        if (0qQ.A0K(this.A02, "with_preview_card")) {
            Context context = getContext();
            i3 = context.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_material);
            i4 = context.getResources().getDimensionPixelSize(R.dimen.action_button_settings_height);
        } else {
            i3 = min;
        }
        this.A03.measure(View.MeasureSpec.makeMeasureSpec(i4, SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(i4, SN3.MAX_SIGNED_POWER_OF_TWO));
        this.A04.measure(View.MeasureSpec.makeMeasureSpec(i3, SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(i3, SN3.MAX_SIGNED_POWER_OF_TWO));
        if (0qQ.A0K(this.A02, "with_preview_card")) {
            C66580MXl.A0R(this.A06).measure(View.MeasureSpec.makeMeasureSpec(size, SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(size2, SN3.MAX_SIGNED_POWER_OF_TWO));
            AnonymousClass7TE.A0c(this.A05).measure(View.MeasureSpec.makeMeasureSpec(size, SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(size2, SN3.MAX_SIGNED_POWER_OF_TWO));
            AnonymousClass0eM r4 = this.A07;
            JTO.A0I(r4).measure(View.MeasureSpec.makeMeasureSpec(size - (this.A08 * 2), AnonymousClass972.MUTABLE_FLAG_MASK), View.MeasureSpec.makeMeasureSpec((int) 0nA.A03(AnonymousClass7TE.A0S(this), JTO.A0I(r4).getTextSize()), SN3.MAX_SIGNED_POWER_OF_TWO));
            setMeasuredDimension(size, size2);
            return;
        }
        setMeasuredDimension(min, min);
    }

    public final void setProfilePicUrl(ImageUrl imageUrl, AnonymousClass0iw r3) {
        AnonymousClass7TG.A1N(imageUrl, r3);
        this.A03.setUrl(imageUrl, r3);
    }
}
