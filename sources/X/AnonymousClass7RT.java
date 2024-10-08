package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.7RT  reason: invalid class name */
public final class AnonymousClass7RT extends C232232tF {
    public final Context A00;

    /* renamed from: A00 */
    public final C67909Mwr createViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.thread_message_action_log, viewGroup, false);
        int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        C67909Mwr mwr = new C67909Mwr(inflate);
        TextView textView = mwr.A00;
        textView.setTypeface(textView.getTypeface(), 0);
        Context context = textView.getContext();
        Drawable drawable = context.getDrawable(R.drawable.rounded_background_secondary);
        if (drawable != null) {
            int A06 = 2eL.A06(context.getColor(2Yu.A04(context)), 199);
            Drawable mutate = drawable.mutate();
            0qQ.A07(mutate);
            mutate.setTint(A06);
            textView.setBackground(drawable);
        }
        Resources resources = textView.getResources();
        0qQ.A07(resources);
        try {
            i = resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        } catch (Resources.NotFoundException unused) {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            int i5 = marginLayoutParams.topMargin;
            int i6 = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.topMargin = i5;
            marginLayoutParams.setMarginEnd(i);
            marginLayoutParams.bottomMargin = i6;
        }
        try {
            i2 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        } catch (Resources.NotFoundException unused2) {
            i2 = 0;
        }
        try {
            i3 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        } catch (Resources.NotFoundException unused3) {
            i3 = 0;
        }
        textView.setPadding(i3, i2, i3, i2);
        return mwr;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C381929co r52 = (C381929co) r5;
        C67909Mwr mwr = (C67909Mwr) r6;
        0qQ.A0B(r52, 0);
        0qQ.A0B(mwr, 1);
        TextView textView = mwr.A00;
        textView.setTextColor(r52.A00);
        CharSequence charSequence = r52.A01;
        int i = 0;
        if (charSequence.length() <= 0) {
            i = 8;
        }
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    public final Class modelClass() {
        return C381929co.class;
    }

    public AnonymousClass7RT(Context context) {
        this.A00 = context;
    }
}
