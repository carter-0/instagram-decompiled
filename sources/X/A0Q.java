package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;

public abstract class A0Q {
    public static final void A00(Context context, TextView textView, String str, String str2) {
        int i;
        Object[] objArr;
        AnonymousClass7TG.A1O(textView, str);
        Resources resources = context.getResources();
        if (str2 != null) {
            i = 2131970057;
            objArr = new Object[]{str2, str};
        } else {
            i = 2131970058;
            objArr = new Object[]{str};
        }
        String string = resources.getString(i, objArr);
        0qQ.A0A(string);
        textView.setText(C70572Rz.A00().Cmk(-1, string));
    }
}
