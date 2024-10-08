package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.Hwp  reason: case insensitive filesystem */
public abstract class C56338Hwp {
    public static final int A00(Context context, Integer num) {
        int i;
        int A03 = C51967G9n.A03(num, 0);
        if (A03 == 0) {
            i = R.attr.igds_color_text_on_white;
        } else if (A03 == 1 || A03 == 2) {
            i = R.attr.igds_color_controls;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return AnonymousClass7TF.A03(context, i);
    }

    public static final String A01(Context context, Integer num) {
        int i;
        int A03 = C51967G9n.A03(num, 0);
        if (A03 == 0) {
            i = 2131976021;
        } else if (A03 == 1) {
            i = 2131976020;
        } else if (A03 == 2) {
            i = 2131976028;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return AnonymousClass7TE.A16(context, i);
    }
}
