package X;

import android.content.Context;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.6YG  reason: invalid class name */
public abstract class AnonymousClass6YG {
    public static final int A01(Context context, int i) {
        0qQ.A0B(context, 0);
        if (i != context.getColor(2Yu.A0H(context, R.attr.igds_color_sticker_background))) {
            return context.getColor(2Yu.A0H(context, R.attr.igds_color_secondary_button_disabled_panavision));
        }
        return 0nH.A05(i);
    }

    public static final C255783ui A02(C249693kD r3) {
        List Bkd;
        if (!r3.CWu() || (Bkd = r3.Bkd(AnonymousClass3WT.QUESTION)) == null) {
            return null;
        }
        return (C255783ui) 00k.A0O(Bkd, 0);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.WaP] */
    public static final C19477WaP A03(C249693kD r1) {
        UNR unr;
        0qQ.A0B(r1, 0);
        C255783ui A02 = A02(r1);
        if (A02 == null || (unr = A02.A0O) == null) {
            return null;
        }
        ? obj = new Object();
        obj.A00 = unr;
        return obj;
    }

    public static final int A00(Context context, int i) {
        int i2;
        if (i != context.getColor(2Yu.A0H(context, R.attr.igds_color_sticker_background))) {
            i2 = 2Yu.A0H(context, R.attr.igds_color_primary_text_on_media);
        } else if (!C61670oa.A0H()) {
            return -6710887;
        } else {
            i2 = R.color.igds_secondary_text;
        }
        return context.getColor(i2);
    }
}
