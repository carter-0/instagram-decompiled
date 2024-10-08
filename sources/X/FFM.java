package X;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.Calendar;

public abstract class FFM {
    public static final void A01(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C358248ab A0Y = DbS.A0Y(context);
        DbT.A19(context, A0Y, 2131956491);
        DbU.A17(context, A0Y, 2131956488);
        A0Y.A0I(onClickListener, 2131956489);
        A0Y.A0H(onClickListener2, 2131956490);
        A0Y.A0s(false);
        DbT.A1V(A0Y);
    }

    public static final void A02(Context context, AnonymousClass0iw r17, 0lg r18, C51874G5l g5l, String str, String str2) {
        Context context2 = context;
        0lg r1 = r18;
        boolean A1U = AnonymousClass7TF.A1U(0, context2, r1);
        C49943FFw A00 = C49943FFw.A04.A00();
        Integer num = AnonymousClass05K.A0C;
        Integer B8m = g5l.B8m();
        String str3 = str;
        A00.A02(r17, r1, num, B8m, str3);
        SimpleWebViewActivity.A02.A02(context2, r1, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, A1U, false, false, A1U, false, false, false, str2, str3));
    }

    public static final int A00(int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.set(i, i2, i3);
        int i4 = instance2.get(1) - instance.get(1);
        if (instance.get(2) > instance2.get(2) || (instance.get(2) == instance2.get(2) && instance.get(5) > instance2.get(5))) {
            return i4 - 1;
        }
        return i4;
    }

    public static final void A03(TextView textView, Context context) {
        boolean A1X = DbW.A1X(textView);
        if (C49917FEr.A00().A04 == AnonymousClass05K.A00) {
            textView.setTextSize(A1X ? 1 : 0, (float) context.getResources().getDimensionPixelSize(R.dimen.avatar_search_sticker_tray_text_size));
            textView.setGravity(17);
        }
    }
}
