package X;

import android.content.Context;
import com.instagram.android.R;

public final class FBU {
    public final int A01(Context context, long j, long j2) {
        int i;
        0qQ.A0B(context, 0);
        int intValue = A00(j, j2).intValue();
        if (intValue != 0) {
            i = R.attr.igds_color_gradient_yellow;
            if (intValue != 1) {
                i = R.attr.igds_color_error_or_destructive;
            }
        } else {
            i = R.attr.igds_color_success;
        }
        return 2Yu.A0H(context, i);
    }

    public final String A02(Context context, long j, long j2) {
        int i;
        0qQ.A0B(context, 0);
        int intValue = A00(j, j2).intValue();
        if (intValue != 0) {
            i = 2131957714;
            if (intValue != 1) {
                i = 2131957713;
            }
        } else {
            i = 2131957712;
        }
        return DbY.A0c(context, Integer.valueOf((int) ((j2 - j) / 86400000)), i);
    }

    public static final Integer A00(long j, long j2) {
        long j3 = j2 - 86400000;
        long j4 = j2 - 259200000;
        if (j >= j3) {
            return AnonymousClass05K.A00;
        }
        if (j >= j4) {
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A0C;
    }
}
