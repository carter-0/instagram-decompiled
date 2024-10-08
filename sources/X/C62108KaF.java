package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.text.TightTextView;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.tagging.model.Tag;

/* renamed from: X.KaF  reason: case insensitive filesystem */
public final class C62108KaF extends C60046JeE {
    public ViewGroup A00;
    public ImageView A01;
    public ImageView A02;
    public TextView A03;
    public C66470MSy A04;
    public final UserSession A05;
    public final 1Xj A06;
    public final boolean A07;
    public final 1Ng A08;

    /* JADX WARNING: type inference failed for: r2v1, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView, android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62108KaF(Context context, PointF pointF, UserSession userSession, 1Xj r17, boolean z) {
        super(context);
        PointF pointF2 = pointF;
        UserSession userSession2 = userSession;
        C51974G9v.A1L(context, userSession2, pointF);
        this.A05 = userSession2;
        1Xj r12 = r17;
        this.A06 = r12;
        this.A07 = z;
        this.A08 = AnonymousClass1Nd.A00(userSession2);
        Context context2 = getContext();
        FrameLayout frameLayout = new FrameLayout(context2);
        this.A00 = frameLayout;
        C64178LSg.A00(frameLayout, this.A05, this.A06, Boolean.valueOf(this.A07));
        ? tightTextView = new TightTextView(context2);
        this.A03 = tightTextView;
        tightTextView.setMinimumWidth(getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material));
        TextView textView = this.A03;
        String str = "bubbleText";
        if (textView != null) {
            C64178LSg.A02(textView);
            ImageView imageView = new ImageView(context2);
            this.A02 = imageView;
            C64178LSg.A01(imageView, true);
            ImageView imageView2 = new ImageView(context2);
            this.A01 = imageView2;
            C64178LSg.A01(imageView2, false);
            FrameLayout.LayoutParams A0Y = JTR.A0Y();
            ViewGroup viewGroup = this.A00;
            if (viewGroup == null) {
                str = "bubble";
            } else {
                TextView textView2 = this.A03;
                if (textView2 != null) {
                    viewGroup.addView(textView2, A0Y);
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
                    ViewGroup viewGroup2 = this.A00;
                    if (viewGroup2 != null) {
                        addView(viewGroup2, layoutParams);
                        ImageView imageView3 = this.A02;
                        if (imageView3 != null) {
                            addView(imageView3, layoutParams);
                            ImageView imageView4 = this.A01;
                            String str2 = "downArrow";
                            if (imageView4 != null) {
                                addView(imageView4, layoutParams);
                                ViewGroup viewGroup3 = this.A00;
                                if (viewGroup3 != null) {
                                    TextView textView3 = this.A03;
                                    if (textView3 == null) {
                                        str2 = str;
                                    } else {
                                        ImageView imageView5 = this.A02;
                                        if (imageView5 != null) {
                                            ImageView imageView6 = this.A01;
                                            if (imageView6 != null) {
                                                this.A02 = new LPG(pointF2, viewGroup3, imageView5, imageView6, textView3, userSession2, r12, this, 0, 0, false);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                            0qQ.A0F(str2);
                            throw AnonymousClass00P.createAndThrow();
                        }
                        0qQ.A0F("upArrow");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    0qQ.A0F("bubble");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public 0rN getTextLayoutParams() {
        return null;
    }

    public void setText(CharSequence charSequence) {
        Drawable drawable;
        0qQ.A0B(charSequence, 0);
        SpannableStringBuilder A0C = DbS.A0C(charSequence);
        Context context = getContext();
        if (!(context == null || (drawable = context.getDrawable(R.drawable.instagram_facebook_circle_pano_outline_24)) == null)) {
            int A032 = DbS.A03(context.getResources(), R.dimen.add_payment_bottom_sheet_row_subtitle_size);
            int i = 2;
            drawable.setBounds(0, 2, A032, A032 + 2);
            DbU.A10(context, drawable.mutate(), R.color.design_dark_default_color_on_background);
            if (Build.VERSION.SDK_INT < 29) {
                i = 1;
            }
            ImageSpan imageSpan = new ImageSpan(drawable, i);
            A0C = C51965G9l.A0E();
            A0C.append(AnonymousClass7TG.A0m(charSequence, "# ", AnonymousClass7TE.A1A()));
            A0C.setSpan(imageSpan, 0, "❏".length(), 33);
        }
        super.setText(A0C);
        TextView textView = this.A03;
        if (textView == null) {
            0qQ.A0F("bubbleText");
            throw AnonymousClass00P.createAndThrow();
        } else {
            textView.setContentDescription(AnonymousClass7TF.A0e(getResources(), charSequence, 2131974973));
        }
    }

    public final C66470MSy getListener() {
        return this.A04;
    }

    public CharSequence getText() {
        TextView textView = this.A03;
        if (textView == null) {
            0qQ.A0F("bubbleText");
            throw AnonymousClass00P.createAndThrow();
        }
        CharSequence text = textView.getText();
        0qQ.A07(text);
        return text;
    }

    public int getTextLineHeight() {
        TextView textView = this.A03;
        if (textView != null) {
            return textView.getLineHeight();
        }
        0qQ.A0F("bubbleText");
        throw AnonymousClass00P.createAndThrow();
    }

    private final String getTagName() {
        Object tag = getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.tagging.model.Tag<*>");
        String A042 = ((Tag) tag).A04();
        0qQ.A07(A042);
        return A042;
    }

    public String getTaggedId() {
        Object tag = getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.tagging.model.Tag<*>");
        String id = ((Tag) tag).getId();
        0qQ.A07(id);
        return id;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0fD.A05(-66262881);
        if (motionEvent != null && motionEvent.getAction() == 1) {
            AnonymousClass3W1 r4 = this.A01;
            if (r4 != null) {
                r4.A07(this.A00, -1).A04 = true;
            }
            1Xj r6 = this.A06;
            if (r6 != null && (getTag() instanceof FBUserTag)) {
                1Ng r1 = this.A08;
                String taggedId = getTaggedId();
                String tagName = getTagName();
                Object tag = getTag();
                0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.model.fbusertag.FBUserTag");
                r1.A00(new C240233Kc(new C61499KAe(14, r6, this), r6, (FBUserTag) tag, taggedId, tagName));
            }
        }
        AnonymousClass0fD.A0C(-1097572946, A052);
        return true;
    }

    public final void setListener(C66470MSy mSy) {
        this.A04 = mSy;
    }
}
