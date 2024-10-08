package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.6P6  reason: invalid class name */
public final class AnonymousClass6P6 {
    public Context A00;
    public AnonymousClass9JO A01;
    public AnonymousClass9JO A02;
    public IgLinearLayout A03;
    public C309766Zn A04;
    public final C252063oV A05;

    public static final void A00(Context context, AnonymousClass9JO r11, IgLinearLayout igLinearLayout, AnonymousClass6P6 r13, Integer num) {
        String str = r11.A03;
        if (str.length() > 0) {
            String str2 = r11.A02;
            if (str2.length() > 0) {
                H7X h7x = new H7X(context, new C53308Glu((Integer) null, str, str2, 2Yu.A0H(context, R.attr.igds_color_icon_on_media), R.drawable.story_afi_pill_background, R.style.afi_dwell_story_pill_text, 6, 18, 0mk.A02(context)));
                AnonymousClass0fU.A00(new IC8(context, r11, r13, num), h7x);
                if (igLinearLayout.getChildCount() < 2) {
                    igLinearLayout.addView(h7x);
                }
            }
        }
    }

    public AnonymousClass6P6(C252063oV r2) {
        this.A05 = r2;
        r2.EeU(new AnonymousClass6P7(this));
    }
}
