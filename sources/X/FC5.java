package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class FC5 {
    /* JADX WARNING: type inference failed for: r6v1, types: [X.F1j, java.lang.Object] */
    public static final void A00(Context context, Fragment fragment, UserSession userSession, FC5 fc5, Integer num, String str, String str2, int i, int i2, int i3) {
        int i4;
        boolean z;
        Integer[] numArr = new Integer[2];
        int i5 = i;
        if (i5 == 3) {
            numArr[0] = 2131956164;
            i4 = 2131974112;
        } else {
            numArr[0] = 2131963356;
            i4 = 2131963357;
        }
        numArr[1] = Integer.valueOf(i4);
        List A1P = 0sr.A1P(numArr);
        int A0M = AnonymousClass7TE.A0M(A1P.get(0));
        int A0M2 = AnonymousClass7TE.A0M(A1P.get(1));
        ? obj = new Object();
        Context context2 = context;
        String A16 = AnonymousClass7TE.A16(context2, i2);
        String str3 = str;
        String A0c = DbY.A0c(context2, str3, i3);
        String A162 = AnonymousClass7TE.A16(context2, A0M);
        String A163 = AnonymousClass7TE.A16(context2, A0M2);
        UserSession userSession2 = userSession;
        if (i5 == 3) {
            z = !182.A06(0Tu.A06, userSession2, 36315404481858730L);
        } else {
            z = true;
        }
        Integer num2 = num;
        obj.A00(context2, new C50424FbX(context2, fragment, userSession2, obj, fc5, num2, str2, i5), A16, A0c, str3, A162, A163, R.drawable.ig_illustrations_qp_messages_refresh, z);
        C49762F5o.A01(userSession2, AnonymousClass05K.A0Y, num2, (String) null);
        02m.A0p.markerEnd(190451210, 2);
    }

    public static final void A01(UserSession userSession) {
        1Av A00 = 1Au.A00(userSession);
        while (true) {
            0xa r3 = A00.A01;
            if (r3.getInt("hidden_word_spam_scam_consent", 0) < 2) {
                AnonymousClass7TG.A1L(r3.AR4(), r3, "hidden_word_spam_scam_consent", 0);
            } else {
                F5l.A00(userSession);
                return;
            }
        }
    }
}
