package X;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.4Fz  reason: invalid class name and case insensitive filesystem */
public final class C262784Fz {
    public static final C262784Fz A00 = new Object();

    public final void A00(AnonymousClass9IQ r7, AnonymousClass3TS r8, AnonymousClass3W1 r9) {
        AnonymousClass4Ki r3;
        String str;
        ViewGroup.LayoutParams layoutParams;
        0qQ.A0B(r9, 2);
        SlideInAndOutIconView A01 = r8.A01();
        AnonymousClass4UR r0 = r9.A0s;
        if (r0 != null) {
            r3 = r0.A05;
            0qQ.A0A(r3);
        } else {
            r3 = AnonymousClass4Ki.STOPPED;
        }
        int i = r9.A0O;
        C266444Yx r1 = r9.A0h;
        if (r1 != null) {
            Resources resources = r8.A01().getResources();
            0qQ.A07(resources);
            str = r1.A00(resources).toString();
        } else {
            str = null;
        }
        if (r3 != AnonymousClass4Ki.STOPPED) {
            A01.setVisibility(0);
            A01.setText(str);
            A01.setIcon(A01.getContext().getDrawable(i));
            A01.setBackgroundAlpha(1.0f);
        }
        if (r3 == AnonymousClass4Ki.FULLTEXT && !TextUtils.isEmpty(str)) {
            A01.A0C.setVisibility(0);
        } else if (r3 == AnonymousClass4Ki.ICON) {
            A01.A0C.setVisibility(8);
        }
        r9.A0R(r8.A01());
        if (r7 != null && (layoutParams = r8.A01().getLayoutParams()) != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int marginEnd = marginLayoutParams.getMarginEnd();
            Number number = (Number) r7.A00;
            Number number2 = number;
            int i2 = 0;
            if (number == null) {
                number2 = 0;
            }
            if (marginEnd != number2.intValue()) {
                if (number != null) {
                    i2 = number.intValue();
                }
                marginLayoutParams.setMarginEnd(i2);
                r8.A01().setLayoutParams(layoutParams);
            }
        }
    }
}
