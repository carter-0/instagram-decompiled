package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;
import java.lang.ref.WeakReference;

public abstract class LSX {
    public static final void A01(Activity activity, int i) {
        0qQ.A0B(activity, 0);
        A03(activity, AnonymousClass7TE.A16(activity, 2131957315), (String) null, i);
    }

    public static final boolean A04(HPK hpk, WeakReference weakReference, int i) {
        C8917RFk rFk;
        Context context;
        Integer num;
        0qQ.A0B(weakReference, 0);
        if (hpk instanceof XPU) {
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                A03(context2, AnonymousClass7TE.A16(context2, 2131957329), (String) null, i);
                return true;
            }
        } else if ((hpk instanceof KK5) && (((rFk = ((KK5) hpk).A00) == C8917RFk.IGMLSegmentAnythingVideoStatusRequestingSaveEdit || rFk == C8917RFk.IGMLSegmentAnythingVideoStatusConfigureSticker) && (context = (Context) weakReference.get()) != null)) {
            Resources A0A = AnonymousClass7TF.A0A(context);
            S5A s5a = rFk.A00;
            if (s5a != null) {
                num = s5a.A00;
            } else {
                num = null;
            }
            A02(context, A0A, num, i);
            return true;
        }
        return false;
    }

    public static final void A02(Context context, Resources resources, Integer num, int i) {
        String A16;
        String str;
        int intValue;
        if (num == null || (intValue = num.intValue()) <= 0) {
            A16 = AnonymousClass7TE.A16(context, 2131957325);
            str = null;
        } else {
            String A03 = C253673rC.A03(resources, num);
            A16 = AnonymousClass7TE.A16(context, 2131957326);
            str = resources.getQuantityString(R.plurals.cutout_anything_sticker_not_saved_due_to_max_saved_limit_description, intValue, new Object[]{num, A03});
        }
        A03(context, A16, str, i);
    }

    public static final void A03(Context context, String str, String str2, int i) {
        1xC r2 = 1xC.A01;
        C310336ap A0W = DbV.A0W();
        A0W.A0D = str;
        A0W.A0I = str2;
        A0W.A02();
        A0W.A04 = context.getDrawable(R.drawable.instagram_info_pano_outline_24);
        A0W.A0R = true;
        A0W.A02 = i;
        DbY.A1K(r2, A0W);
    }

    public static final void A00(Activity activity, int i) {
        A03(activity, AnonymousClass7TE.A16(activity, 2131957287), (String) null, i);
    }
}
