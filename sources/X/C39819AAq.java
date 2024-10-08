package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.AAq  reason: case insensitive filesystem */
public abstract class C39819AAq {
    public static SpannableStringBuilder A00(Context context, String str, int i, int i2) {
        Resources resources = context.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        spannableStringBuilder.append(str.toUpperCase(AnonymousClass1Q2.A02()));
        int[] iArr = AnonymousClass6LW.A0A;
        Drawable A05 = AnonymousClass3JT.A05(context, R.drawable.instagram_wellbeing_illustrations_ballot_box, iArr[0]);
        AJB.A0A(resources, spannableStringBuilder, iArr, i);
        C263324Kh.A01(resources, A05, i2);
        0qQ.A0B(A05, 2);
        ImageSpan imageSpan = new ImageSpan(A05, 1);
        spannableStringBuilder.insert(0, " ");
        spannableStringBuilder.setSpan(imageSpan, 0, 1, 33);
        return spannableStringBuilder;
    }

    public static C347017w8 A01(Context context, UserSession userSession, List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (list == null || list.isEmpty()) {
            A1C.add(context.getResources().getString(2131976724));
        } else {
            A1C.addAll(list);
        }
        C369748vG r4 = new C369748vG(context, A1C);
        int A01 = AnonymousClass7TH.A01(context);
        float A0I = (float) AnonymousClass7TE.A0I(context.getResources());
        SpannableStringBuilder A00 = A00(context, (String) AnonymousClass7TE.A12(A1C), A01, R.dimen.asset_picker_static_sticker_last_row_padding);
        float f = (float) A01;
        AJB.A08(context, r4, A0I, f, f);
        r4.A0L(A00);
        return new C347017w8(context, userSession, Arrays.asList(new Drawable[]{r4}));
    }
}
