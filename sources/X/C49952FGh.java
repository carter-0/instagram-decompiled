package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;

/* renamed from: X.FGh  reason: case insensitive filesystem */
public abstract class C49952FGh {
    public static final C358248ab A00(Context context) {
        0qQ.A0B(context, 0);
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131961740);
        A0Y.A0I(FJX.A00, 2131960862);
        return A0Y;
    }

    public static final void A03(Context context, C268654dm r5) {
        0qQ.A0B(context, 0);
        if (r5.A01() != null) {
            A01(context);
        }
        AnonymousClass9JA r0 = (AnonymousClass9JA) r5.A00();
        if (r0 != null) {
            A04(context, new C268674do(new C49566Eyb(r0.A03, r0.A02, r0.A04)));
        }
    }

    public static final void A01(Context context) {
        11Z.A02(new C51308Fs1(context));
    }

    public static final void A04(Context context, C268654dm r4) {
        C49566Eyb eyb = (C49566Eyb) ((C268674do) r4).A00;
        if (eyb.A02) {
            return;
        }
        if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
            String str = eyb.A01;
            if (str == null) {
                str = AnonymousClass7TE.A16(context, 2131961740);
            }
            A06(context, eyb.A00, str);
        }
    }

    public static final void A02(Context context, C268654dm r5) {
        AnonymousClass7TG.A1N(context, r5);
        if (r5.A01() != null) {
            A01(context);
            return;
        }
        AnonymousClass1XT A0L = DbT.A0L(r5);
        if (A0L != null) {
            A04(context, new C268674do(new C49566Eyb(A0L.getErrorTitle(), A0L.getErrorMessage(), A0L.isFeedbackRequired())));
        }
    }

    public static final void A05(Context context, CharSequence charSequence, String str) {
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A0q(charSequence);
        A0Y.A06();
        if (str != null) {
            A0Y.A05 = str;
        }
        11Z.A02(new C51309Fs2(A0Y));
    }

    public static final void A06(Context context, CharSequence charSequence, String str) {
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A0q(charSequence);
        A0Y.A0I((DialogInterface.OnClickListener) null, 2131960862);
        if (str != null) {
            A0Y.A05 = str;
        }
        11Z.A02(new C51309Fs2(A0Y));
    }

    public static void A07(Fragment fragment, C268654dm r1) {
        A02(fragment.requireContext(), r1);
    }
}
