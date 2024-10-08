package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.AbstractCollection;

/* renamed from: X.DfA  reason: case insensitive filesystem */
public final class C46448DfA {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = -1;
    public int A06;
    public int A07;
    public Drawable A08;
    public View.OnClickListener A09;
    public ImageUrl A0A;
    public ImageUrl A0B;
    public C67350MmR A0C;
    public CharSequence A0D;
    public CharSequence A0E;
    public CharSequence A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;

    public static void A01(C46448DfA dfA) {
        dfA.A0K = true;
        dfA.A00 = -1;
        dfA.A0C = C67350MmR.DEFAULT;
        dfA.A04 = -1;
        dfA.A0L = true;
        dfA.A01 = R.id.row_header_action;
    }

    public final void A03(TextView textView) {
        0qQ.A0B(textView, 0);
        CharSequence charSequence = this.A0E;
        if (charSequence == null || String.valueOf(charSequence).length() == 0) {
            int i = this.A05;
            if (i != 0) {
                textView.setText(i);
            }
        } else {
            textView.setText(this.A0E);
        }
        03v.A0B(textView, new U7M(textView, 11));
    }

    public final void A04(TextView textView, TextView textView2, TextView textView3) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3 = this.A0E;
        if (!((charSequence3 == null || charSequence3.length() == 0) && this.A05 == -1)) {
            A03(textView);
            textView.setVisibility(0);
            textView.setFocusable(true);
            03v.A0B(textView, new U7M(textView, 12));
            int i = this.A04;
            if (i != -1) {
                textView.setTextAppearance(i);
            }
        }
        if (!(textView2 == null || (charSequence2 = this.A0F) == null || charSequence2.length() == 0)) {
            textView2.setText(this.A0F);
            textView2.setVisibility(0);
            if (textView.getVisibility() == 8) {
                0nA.A0e(textView2, 0);
            }
        }
        if (textView3 != null && (charSequence = this.A0D) != null && charSequence.length() != 0) {
            textView3.setText(charSequence);
            textView3.setVisibility(0);
        }
    }

    public static C46448DfA A00(int i) {
        return new C46448DfA(i);
    }

    public static void A02(AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C46448DfA(i));
    }

    public C46448DfA(int i) {
        A01(this);
        this.A05 = i;
    }

    public C46448DfA(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        A01(this);
        this.A0E = charSequence;
        this.A0F = charSequence2;
        this.A0D = charSequence3;
    }

    public C46448DfA(CharSequence charSequence) {
        A01(this);
        this.A0E = charSequence;
    }
}
