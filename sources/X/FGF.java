package X;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import java.util.AbstractCollection;

public final class FGF {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public View.OnClickListener A04;
    public CharSequence A05;
    public boolean A06;
    public SpannableStringBuilder A07;
    public final int A08;

    public final void A02(TextView textView) {
        0qQ.A0B(textView, 0);
        CharSequence charSequence = this.A05;
        if (charSequence == null && (charSequence = this.A07) == null) {
            textView.setText(this.A08);
        } else {
            textView.setText(charSequence);
        }
        int i = this.A01;
        if (i != 0) {
            textView.setTextAppearance(textView.getContext(), i);
        }
        int i2 = this.A02;
        if (i2 != 0) {
            int dimensionPixelSize = textView.getResources().getDimensionPixelSize(i2);
            textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        }
        int i3 = this.A03;
        if (i3 != 0) {
            0nA.A0e(textView, textView.getResources().getDimensionPixelSize(i3));
        }
        int i4 = this.A00;
        if (i4 != 0) {
            textView.setBackgroundResource(i4);
        }
    }

    public static void A01(AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new FGF(i));
    }

    public FGF(SpannableStringBuilder spannableStringBuilder) {
        this.A05 = null;
        this.A07 = spannableStringBuilder;
        this.A08 = 0;
    }

    public static void A00(Fragment fragment, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new FGF((CharSequence) fragment.getString(i)));
    }

    public FGF(CharSequence charSequence) {
        this.A05 = charSequence;
        this.A07 = null;
        this.A08 = 0;
    }

    public FGF(int i) {
        this.A05 = null;
        this.A07 = null;
        this.A08 = i;
    }
}
