package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.text.TightTextView;
import com.instagram.tagging.model.Tag;

/* renamed from: X.KaD  reason: case insensitive filesystem */
public final class C62106KaD extends C60046JeE {
    public ViewGroup A00;
    public ImageView A01;
    public ImageView A02;
    public UserSession A03;
    public IgTextView A04;
    public TightTextView A05;
    public 1Xj A06;
    public final PointF A07;
    public final boolean A08;

    public final boolean performClick() {
        return false;
    }

    public final void A06(CharSequence charSequence, int i) {
        if (this.A08) {
            super.A06(charSequence, i);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    public CharSequence getText() {
        return this.A05.getText();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    public 0rN getTextLayoutParams() {
        return C60046JeE.A00(Layout.Alignment.ALIGN_NORMAL, this.A05);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    public int getTextLineHeight() {
        return this.A05.getLineHeight();
    }

    public void setText(CharSequence charSequence) {
        if (this.A08) {
            super.setText(charSequence);
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [com.instagram.common.ui.text.TightTextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    /* JADX WARNING: type inference failed for: r1v7, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    /* JADX WARNING: type inference failed for: r0v35, types: [com.instagram.common.ui.text.TightTextView, android.view.View] */
    public C62106KaD(Context context, PointF pointF, UserSession userSession, 1Xj r16, boolean z) {
        super(context);
        this.A07 = pointF;
        this.A08 = z;
        this.A03 = userSession;
        this.A06 = r16;
        Context context2 = getContext();
        LinearLayout linearLayout = new LinearLayout(context2);
        this.A00 = linearLayout;
        linearLayout.setOrientation(1);
        this.A05 = new TightTextView(context2);
        this.A02 = new ImageView(context2);
        this.A01 = new ImageView(context2);
        boolean z2 = this.A08;
        if (z2) {
            ViewGroup viewGroup = this.A00;
            boolean z3 = C64178LSg.A00;
            Context context3 = viewGroup.getContext();
            Drawable mutate = context3.getDrawable(R.drawable.tag_bubble_new).mutate();
            DbX.A11(context3, mutate, R.color.design_dark_default_color_on_background);
            viewGroup.setBackground(mutate);
            IgTextView igTextView = new IgTextView(context2);
            this.A04 = igTextView;
            igTextView.setText(context2.getResources().getText(2131953361));
            this.A04.setTextSize(2, (float) context2.getResources().getInteger(R.integer.tag_text_size));
            DbT.A17(context2, this.A04, 2Yu.A0D(context2));
            this.A04.setGravity(16);
            C64178LSg.A03(this.A05, this.A00.getPaddingLeft(), false);
            ImageView imageView = this.A02;
            Context context4 = imageView.getContext();
            Drawable mutate2 = context4.getDrawable(R.drawable.tag_carrot).mutate();
            DbX.A11(context4, mutate2, R.color.design_dark_default_color_on_background);
            imageView.setBackground(mutate2);
            imageView.setPadding(0, 0, 0, 0);
            ImageView imageView2 = this.A01;
            Context context5 = imageView2.getContext();
            Drawable mutate3 = context5.getDrawable(R.drawable.tag_carrot).mutate();
            DbX.A11(context5, mutate3, R.color.design_dark_default_color_on_background);
            imageView2.setBackground(mutate3);
            imageView2.setPadding(0, 0, 0, 0);
            imageView2.setRotation(180.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            this.A00.addView(this.A04, layoutParams);
            this.A00.addView(this.A05, layoutParams);
        } else {
            ImageView imageView3 = new ImageView(context2);
            DbU.A13(context2, imageView3, R.drawable.tag_hint_with_shadow);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 16;
            this.A00.addView(this.A05, layoutParams2);
            this.A00.addView(imageView3, layoutParams2);
        }
        ViewGroup.LayoutParams layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
        addView(this.A00, layoutParams3);
        addView(this.A02, layoutParams3);
        addView(this.A01, layoutParams3);
        ViewGroup viewGroup2 = this.A00;
        ? r9 = this.A05;
        ImageView imageView4 = this.A02;
        ImageView imageView5 = this.A01;
        LPG lpg = new LPG(this.A07, viewGroup2, imageView4, imageView5, r9, this.A03, this.A06, this, 0, 0, false);
        this.A02 = lpg;
        if (!z2) {
            lpg.A02();
        }
    }

    public String getTaggedId() {
        return ((Tag) DbT.A0o(this)).getId();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int A052 = AnonymousClass0fD.A05(387851292);
        if (this.A08) {
            z = C60046JeE.A01(this).A06(motionEvent);
            i = 1090000207;
        } else {
            z = false;
            i = -1455276053;
        }
        AnonymousClass0fD.A0C(i, A052);
        return z;
    }
}
