package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;
import com.instagram.user.model.User;
import java.util.List;

public final class I4F {
    public static final I4F A00 = new Object();

    public final SpannableStringBuilder A01(Context context, C70802Vt r29, UserSession userSession, SocialContextBubbleUiState socialContextBubbleUiState, C246853fL r32, int i, int i2) {
        String str;
        String str2;
        C70802Vt r14 = r29;
        UserSession userSession2 = userSession;
        SocialContextBubbleUiState socialContextBubbleUiState2 = socialContextBubbleUiState;
        C246853fL r12 = r32;
        C51974G9v.A1P(userSession2, socialContextBubbleUiState2, r12, r14);
        Context context2 = context;
        boolean A02 = 0mk.A02(context2);
        String str3 = socialContextBubbleUiState2.A08;
        if (str3 == null) {
            return C51965G9l.A0E();
        }
        Integer num = socialContextBubbleUiState2.A05;
        boolean z = socialContextBubbleUiState2.A0D;
        StringBuilder A0n = AnonymousClass7TF.A0n(str3);
        if (num != null) {
            str = AnonymousClass9OQ.A00(num);
        } else {
            str = "null";
        }
        A0n.append(str);
        A0n.append(z);
        A0n.append(A02);
        int i3 = i;
        A0n.append(i3);
        int i4 = i2;
        A0n.append(i4);
        String obj = A0n.toString();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) 0MB.A05(userSession2).A03.get(obj);
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        if (z) {
            str2 = (String) 0MB.A05(userSession2).A05.get(str3);
        } else {
            str2 = socialContextBubbleUiState2.A07;
        }
        C336887fL r15 = C336887fL.A00;
        if (str2 == null) {
            str2 = "";
        }
        User user = socialContextBubbleUiState2.A04;
        List list = socialContextBubbleUiState2.A0A;
        C66312MMv mMv = new C66312MMv(18, r12, r14);
        List list2 = list;
        String str4 = str2;
        User user2 = user;
        UserSession userSession3 = userSession2;
        SpannableStringBuilder A022 = r15.A02(context2, userSession3, user2, str4, list2, mMv, new C66312MMv(19, r12, r14), new J7R(r12, r14, str3, 1), i3, i4, A02);
        0MB.A05(userSession2).A03.put(obj, A022);
        return A022;
    }

    public static final void A00(GestureDetector gestureDetector) {
        gestureDetector.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
    }
}
