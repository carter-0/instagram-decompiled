package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import kotlin.Deprecated;

@Deprecated(message = "No longer supported by IGDS, please write in IGDS group for feedback: https://fb.workplace.com/groups/IGDSFeedback")
public final class PI1 implements AnonymousClass5Gs {
    public final CharSequence A00;
    public final CharSequence A01;

    public final /* bridge */ /* synthetic */ C284395Mi ANJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C69035NdR(DbT.A0D(layoutInflater, viewGroup, R.layout.tooltip_title_with_text, false));
    }

    public final /* bridge */ /* synthetic */ void ADq(C283255Gu r5, C284395Mi r6) {
        C69035NdR ndR = (C69035NdR) r6;
        AnonymousClass7TG.A1N(ndR, r5);
        TextView textView = ndR.A01;
        int color = textView.getContext().getColor(r5.A02);
        textView.setText(this.A01);
        textView.setTextColor(color);
        TextView textView2 = ndR.A00;
        textView2.setText(this.A00);
        textView2.setTextColor(color);
    }

    public PI1(CharSequence charSequence, CharSequence charSequence2) {
        AnonymousClass7TG.A1O(charSequence, charSequence2);
        this.A01 = charSequence;
        this.A00 = charSequence2;
    }

    public PI1() {
    }
}
