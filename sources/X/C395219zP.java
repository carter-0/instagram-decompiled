package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.instagram.android.R;
import java.util.regex.Pattern;

/* renamed from: X.9zP  reason: invalid class name and case insensitive filesystem */
public abstract class C395219zP {
    public static final AnonymousClass7O8 A00(Context context, C327637Bp r16, int i, int i2, long j, boolean z, boolean z2) {
        C327637Bp r7 = r16;
        0qQ.A0B(r7, 7);
        int i3 = i;
        long j2 = j;
        boolean z3 = z;
        if (z) {
            String A16 = AnonymousClass7TE.A16(context, 2131964884);
            int i4 = 2131973718;
            if (z2) {
                i4 = 2131973720;
            }
            String A0e = AnonymousClass7TF.A0e(context.getResources(), A16, i4);
            0qQ.A07(A0e);
            SpannableString spannableString = new SpannableString(A0e);
            int A08 = 00l.A08(A0e, A16, 0, false);
            Pattern pattern = 0mp.A00;
            int A082 = 00l.A08(A0e, A16, 0, false) + A16.length();
            spannableString.setSpan(new StyleSpan(1), A08, A082, 17);
            spannableString.setSpan(new ForegroundColorSpan(i2), A08, A082, 17);
            String A0d = AnonymousClass7TF.A0d(context.getResources(), 2131973721);
            0qQ.A07(context.getString(2131973722));
            return new AnonymousClass7O8(r7, spannableString, A0d, context.getResources().getDimensionPixelSize(R.dimen.direct_standard_xma_grid_view_height), i3, j2, z3);
        }
        int i5 = 2131973716;
        if (z2) {
            i5 = 2131973719;
        }
        String A0d2 = AnonymousClass7TF.A0d(context.getResources(), 2131973721);
        String A0d3 = AnonymousClass7TF.A0d(context.getResources(), i5);
        0qQ.A07(context.getString(2131973722));
        return new AnonymousClass7O8(r7, A0d3, A0d2, context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width), i3, j2, false);
    }
}
