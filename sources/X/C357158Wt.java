package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.android.R;

/* renamed from: X.8Wt  reason: invalid class name and case insensitive filesystem */
public final class C357158Wt {
    public ObjectAnimator A00;
    public ViewStub A01;
    public boolean A02;
    public ViewGroup A03;
    public ProgressBar A04;
    public TextView A05;
    public TextView A06;

    public final void A03(Context context, C337217fu r9, C357138Wr r10, String str, String str2) {
        0qQ.A0B(r9, 4);
        ViewStub viewStub = this.A01;
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.offensive_content_warning);
            ViewStub viewStub2 = this.A01;
            if (viewStub2 != null) {
                View inflate = viewStub2.inflate();
                0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                A00((ViewGroup) inflate, this);
                this.A01 = null;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        String string = context.getString(2131964884);
        0qQ.A07(string);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842907});
        0qQ.A07(obtainStyledAttributes);
        int resourceId = obtainStyledAttributes.getResourceId(0, R.color.badge_color);
        obtainStyledAttributes.recycle();
        spannableStringBuilder2.setSpan(new C385179iW(r10, AnonymousClass05K.A01, string, context.getColor(resourceId)), 0, spannableStringBuilder2.length(), 18);
        spannableStringBuilder.append(" ").append(spannableStringBuilder2);
        TextView textView = this.A06;
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(0);
            textView.setText(spannableStringBuilder);
        }
        TextView textView2 = this.A05;
        if (textView2 != null) {
            textView2.setText(str2);
            AnonymousClass0fU.A00(new ANB(r10), textView2);
            2eS.A01(textView2);
        }
        if (r9.A01 != -1) {
            A01(r9, this);
        }
        ViewGroup viewGroup = this.A03;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }

    public static final void A00(ViewGroup viewGroup, C357158Wt r3) {
        r3.A03 = viewGroup;
        if (viewGroup != null) {
            r3.A06 = (TextView) viewGroup.requireViewById(R.id.warning_text);
            r3.A05 = (TextView) viewGroup.requireViewById(R.id.warning_undo_button);
            boolean z = r3.A02;
            int i = R.id.progress_bar_top;
            if (z) {
                i = R.id.progress_bar_bottom;
            }
            ProgressBar progressBar = (ProgressBar) viewGroup.requireViewById(i);
            r3.A04 = progressBar;
            if (progressBar != null) {
                progressBar.setVisibility(0);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final void A01(C337217fu r5, C357158Wt r6) {
        int min;
        ObjectAnimator objectAnimator = r6.A00;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        r6.A00 = null;
        ProgressBar progressBar = r6.A04;
        if (progressBar != null) {
            int i = r5.A02;
            if (i == 0) {
                min = 100;
            } else {
                C337217fu.A00(r5);
                min = Math.min((r5.A00 * 100) / i, 100);
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, ReactProgressBarViewManager.PROP_PROGRESS, new int[]{min, 100});
            r6.A00 = ofInt;
            if (ofInt != null) {
                C337217fu.A00(r5);
                ofInt.setDuration((long) Math.max(i - r5.A00, 0));
                ofInt.setInterpolator(new LinearInterpolator());
                ofInt.start();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        long j = r5.A01;
        if (j == 0 || j == -1) {
            r5.A01 = System.currentTimeMillis();
        }
    }

    public final void A02() {
        if (this.A01 == null) {
            ViewGroup viewGroup = this.A03;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            ObjectAnimator objectAnimator = this.A00;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            this.A00 = null;
        }
    }

    public final void A04(C337217fu r7) {
        ObjectAnimator objectAnimator = this.A00;
        if (objectAnimator != null) {
            long j = r7.A01;
            if (!(j == 0 || j == -1)) {
                C337217fu.A00(r7);
                r7.A01 = -1;
            }
            objectAnimator.cancel();
            this.A00 = null;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
