package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.ui.text.TitleTextView;

/* renamed from: X.Djx  reason: case insensitive filesystem */
public final class C46720Djx extends LinearLayout {
    public Drawable A00;
    public TitleTextView A01;
    public CharSequence A02;
    public CharSequence A03;
    public boolean A04;

    private final void setTabTextViewColor(int i) {
        TitleTextView titleTextView = this.A01;
        if (titleTextView == null) {
            0qQ.A0F("textView");
            throw AnonymousClass00P.createAndThrow();
        }
        Context context = getContext();
        if (context != null) {
            int color = context.getColor(i);
            titleTextView.setTextColor(color);
            for (Drawable drawable : titleTextView.getCompoundDrawables()) {
                if (drawable != null) {
                    AnonymousClass7TE.A1R(drawable, color);
                }
            }
        }
    }

    public C46720Djx(Context context, C49627Ezk ezk) {
        super(context);
        CharSequence charSequence;
        int i = ezk.A00;
        if (i != -1) {
            charSequence = context.getString(i);
            0qQ.A0A(charSequence);
        } else {
            charSequence = ezk.A03;
            if (charSequence == null) {
                charSequence = "";
            }
        }
        this.A03 = charSequence;
        this.A00 = ezk.A01;
        this.A04 = ezk.A04;
        this.A02 = ezk.A02;
        setOrientation(1);
        TitleTextView titleTextView = new TitleTextView(getContext());
        titleTextView.setMaxLines(1);
        titleTextView.setGravity(17);
        titleTextView.setEllipsize(TextUtils.TruncateAt.END);
        titleTextView.setTextAppearance(R.style.IgdsTabView);
        titleTextView.setIsCapitalized(this.A04);
        titleTextView.setIsBold(true);
        Resources resources = getResources();
        titleTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size)));
        addView(titleTextView);
        CharSequence charSequence2 = this.A03;
        if (charSequence2 != null) {
            titleTextView.setText(charSequence2);
            setContentDescription(charSequence2);
        }
        Drawable drawable = this.A00;
        if (drawable != null) {
            titleTextView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        CharSequence charSequence3 = this.A02;
        if (charSequence3 != null) {
            setContentDescription(charSequence3);
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        0nA.A0d(titleTextView, dimensionPixelSize);
        0nA.A0U(titleTextView, dimensionPixelSize);
        this.A01 = titleTextView;
        setGravity(17);
    }

    public final void A00() {
        Context context = getContext();
        if (context != null) {
            setTabTextViewColor(2Yu.A08(context));
            setSelected(false);
        }
    }

    public final void A01() {
        Context context = getContext();
        if (context != null) {
            setTabTextViewColor(2Yu.A07(context));
            setSelected(true);
        }
    }
}
