package X;

import android.content.Context;
import android.widget.TextView;
import com.instagram.android.R;

public final class ADl {
    public int A00;
    public final TextView A01;
    public final C252063oV A02;
    public final int A03;
    public final int A04;
    public final Context A05;
    public final A4H A06;

    public ADl(Context context, TextView textView, C252063oV r4, A4H a4h) {
        0qQ.A0B(textView, 2);
        this.A05 = context;
        this.A01 = textView;
        this.A02 = r4;
        this.A06 = a4h;
        this.A03 = AnonymousClass7TF.A03(context, R.attr.musicCreationTimeIndicatorTextColor);
        this.A04 = context.getColor(R.color.music_sticker_tray_color_2);
        textView.setText(C347917xa.A01(0));
    }

    public final void A01(int i, boolean z) {
        int i2;
        if (Math.round(((float) i) / 1000.0f) != Math.round(((float) this.A00) / 1000.0f)) {
            this.A00 = i;
            TextView textView = this.A01;
            textView.setText(C347917xa.A01(i));
            if (z) {
                i2 = this.A04;
            } else {
                i2 = this.A03;
            }
            if (textView.getCurrentTextColor() != i2) {
                textView.setTextColor(i2);
            }
        }
    }

    public static final void A00(ADl aDl, boolean z) {
        C357888a1 r1 = aDl.A06.A00.A0y;
        if (!r1.CcY()) {
            String BXe = r1.BXe(z);
            if (BXe == null || BXe.length() == 0) {
                aDl.A02.setVisibility(8);
                return;
            }
            C252063oV r0 = aDl.A02;
            r0.setVisibility(0);
            ((TextView) r0.getView()).setText(BXe);
        }
    }
}
