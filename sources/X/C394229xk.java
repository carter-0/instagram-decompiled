package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import com.instagram.android.R;

/* renamed from: X.9xk  reason: invalid class name and case insensitive filesystem */
public abstract class C394229xk {
    public static void A00(Context context, Resources resources, Spannable spannable, AnonymousClass6MW r14, int i, int i2, int i3) {
        Object obj;
        int i4;
        int[] iArr;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        C394219xj r0 = C394219xj.$redex_init_class;
        AnonymousClass6MW r3 = r14;
        Spannable spannable2 = spannable;
        int i5 = i;
        int i6 = i2;
        switch (r14.ordinal()) {
            case 0:
                i4 = r3.A00;
                iArr = new int[]{i, i, i, i, i};
                break;
            case 1:
            case 5:
                int i7 = r3.A00;
                AnonymousClass7TG.A18(spannable2, new C379489Uc(i7, dimensionPixelSize, i6, false, i6, i2), r3.A03[0]);
                return;
            case 2:
                int[] iArr2 = r3.A03;
                0qQ.A0B(iArr2, 4);
                obj = new C389919qR(iArr2, dimensionPixelSize, i6, i6, i6);
                break;
            case 3:
                i4 = r3.A00;
                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                iArr = ABP.A01(context);
                break;
            case 4:
                AnonymousClass7TG.A18(spannable2, new C379489Uc(r3.A00, dimensionPixelSize, i6, false, i6, i2), i5);
                return;
            case 6:
                int A08 = AnonymousClass7TE.A08(context);
                int color = context.getColor(R.color.action_bar_semi_transparent_white);
                int i8 = i3;
                C379489Uc r6 = new C379489Uc(A08, dimensionPixelSize, i6, true, i8, i8);
                r6.A02 = color;
                r6.A00 = 8.0f;
                r6.A01 = 4.0f;
                spannable.setSpan(r6, 0, spannable.length(), 18);
                obj = new ForegroundColorSpan(-1);
                break;
            default:
                throw AnonymousClass7TE.A1K();
        }
        obj = new C389929qS(ABP.A00(), iArr, r3.A03, i4, dimensionPixelSize, i6);
        spannable.setSpan(obj, 0, spannable.length(), 18);
    }
}
