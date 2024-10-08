package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6Nr  reason: invalid class name and case insensitive filesystem */
public abstract class C306826Nr {
    public static final void A00(View.OnClickListener onClickListener, C255773uh r13, C316246lL r14) {
        0qQ.A0B(r14, 0);
        r14.A01();
        View view = r14.A04;
        if (view != null) {
            Context context = view.getContext();
            TextView textView = r14.A07;
            if (textView != null) {
                0qQ.A0A(context);
                UserSession userSession = r14.A0D;
                C255773uh r8 = r13;
                textView.setText(AnonymousClass4EQ.A06(context, userSession, r8, false, (Integer) null, (String) null));
                ImageView imageView = r14.A05;
                if (imageView != null) {
                    imageView.setImageDrawable(r14.A09);
                    TextView textView2 = r14.A08;
                    if (textView2 != null) {
                        textView2.setText(AnonymousClass4EQ.A06(context, userSession, r8, false, (Integer) null, (String) null));
                    }
                    ImageView imageView2 = r14.A06;
                    if (imageView2 != null) {
                        imageView2.setImageDrawable(r14.A09);
                    }
                    r14.A0A = true;
                    AnonymousClass0fU.A00(new C306836Ns(onClickListener), view);
                    view.setVisibility(0);
                    Resources resources = view.getResources();
                    int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.action_button_settings_height);
                    int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                    0nA.A0d(view, dimensionPixelSize);
                    0nA.A0U(view, dimensionPixelSize);
                    0nA.A0h(view, dimensionPixelSize2, dimensionPixelSize2);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
