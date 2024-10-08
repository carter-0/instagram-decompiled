package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;

public abstract class FCV {
    public static void A01(C46448DfA dfA, G6T g6t, C46896DnC dnC, G6U g6u) {
        String str;
        View.OnClickListener onClickListener;
        if (dnC != null) {
            int i = 0;
            A02(dfA, dnC, false, false);
            TextView textView = dnC.A04;
            textView.getClass();
            ImageView imageView = dnC.A03;
            imageView.getClass();
            Drawable drawable = dfA.A08;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                int i2 = dfA.A00;
                if (i2 != -1) {
                    imageView.setColorFilter(AnonymousClass37O.A00(i2));
                }
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            int i3 = dfA.A00;
            if (i3 == -1) {
                i3 = textView.getContext().getColor(1QE.A00(R.color.igds_primary_button));
            }
            textView.setTextColor(i3);
            textView.setText(dfA.A0G);
            if (!(g6t == null && dfA.A09 == null)) {
                2eS.A01(textView);
                if (g6t != null) {
                    onClickListener = new FP7(10, (Object) g6t, (Object) dfA);
                } else {
                    onClickListener = dfA.A09;
                }
                AnonymousClass0fU.A00(onClickListener, textView);
            }
            if (g6u != null && (str = dfA.A0H) != null) {
                g6u.EvR(textView, str);
            }
        }
    }

    public static void A02(C46448DfA dfA, C46896DnC dnC, boolean z, boolean z2) {
        TextView textView = dnC.A04;
        if (textView != null) {
            textView.setId(dfA.A01);
        }
        View view = dnC.A01;
        if (view.getLayoutParams() != null) {
            if (z2 || dfA.A0M) {
                view.setLayoutParams(new C71492dQ(-1, -2));
                FrameLayout frameLayout = dnC.A02;
                if (frameLayout != null) {
                    frameLayout.setMinimumHeight(0);
                    frameLayout.setLayoutParams(new C71492dQ(-1, -2));
                }
                if (z2) {
                    0nA.A0X(dnC.A06, 0);
                }
            } else {
                DbT.A1B(dnC.itemView.getResources(), view.getLayoutParams(), R.dimen.abc_alert_dialog_button_dimen);
                view.setMinimumHeight(dnC.itemView.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen));
            }
            if (dfA.A0M) {
                0nA.A0e(view, dnC.itemView.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material));
            }
        }
        if (z) {
            0nA.A0e(view, 0);
        }
        TextView textView2 = dnC.A06;
        textView2.setAlpha(1.0f);
        if (textView2.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams.gravity = 8388611;
            textView2.setGravity(0);
            textView2.setLayoutParams(layoutParams);
        }
        view.setFocusable(true);
        03v.A0B(view, new U7C(3));
        textView2.setSingleLine(dfA.A0K);
        TextView textView3 = dnC.A05;
        if (textView3 != null) {
            textView3.setSingleLine(dfA.A0L);
            textView3.setPaddingRelative(textView3.getPaddingStart(), dfA.A06, textView3.getPaddingEnd(), textView3.getPaddingBottom());
        }
        dnC.A00.setVisibility(DbW.A01(dfA.A0I ? 1 : 0));
        dfA.A04(textView2, textView3, (TextView) null);
        CharSequence charSequence = dfA.A0F;
        if (!(charSequence == null || charSequence.length() == 0)) {
            boolean z3 = dfA.A0M;
            int paddingStart = textView2.getPaddingStart();
            if (z3) {
                textView2.setPaddingRelative(paddingStart, textView2.getPaddingTop(), textView2.getPaddingEnd(), 0);
            } else {
                textView2.setPaddingRelative(paddingStart, 0, textView2.getPaddingEnd(), 0);
            }
        }
        dnC.itemView.setBackgroundColor(dfA.A02);
        if (!(dfA.A07 == 0 && dfA.A03 == 0)) {
            ViewGroup.LayoutParams layoutParams2 = dnC.itemView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -2;
                dnC.itemView.setLayoutParams(layoutParams2);
            }
            View view2 = dnC.itemView;
            view2.setPadding(view2.getPaddingLeft(), dfA.A07, dnC.itemView.getPaddingRight(), dfA.A03);
        }
        int i = dfA.A04;
        if (i != -1) {
            textView2.setTextAppearance(i);
        }
        dnC.itemView.setClickable(false);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.3kE, java.lang.Object, X.DnC] */
    public static C46896DnC A00(Context context, ViewGroup viewGroup, boolean z) {
        LayoutInflater from = LayoutInflater.from(context);
        int i = R.layout.row_header;
        if (z) {
            i = R.layout.row_header_with_action;
        }
        View A0C = DbT.A0C(from, viewGroup, i);
        ? r1 = new C249703kE(A0C);
        if (!z) {
            r1.A02 = (FrameLayout) A0C.requireViewById(R.id.row_title_textview);
            r1.A05 = DbU.A0G(A0C, R.id.row_header_subtitle_textview);
        }
        r1.A06 = DbU.A0G(A0C, R.id.row_header_textview);
        r1.A01 = A0C.requireViewById(R.id.frame_header);
        r1.A00 = A0C.requireViewById(R.id.row_divider);
        r1.A04 = AnonymousClass7TE.A0d(A0C, R.id.row_header_action);
        r1.A03 = DbS.A0G(A0C, R.id.row_header_action_icon);
        A0C.setTag(r1);
        return r1;
    }
}
