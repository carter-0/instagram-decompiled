package X;

import android.content.Context;
import android.widget.TextView;

/* renamed from: X.61x  reason: invalid class name and case insensitive filesystem */
public abstract class C3021761x {
    public static final void A00(TextView textView) {
        0qQ.A0B(textView, 0);
        if (!AnonymousClass3UA.A00.contains(AnonymousClass11c.A00().A01().A00.getConfiguration().locale.getLanguage())) {
            Integer num = AnonymousClass05K.A01;
            Context context = textView.getContext();
            0qQ.A07(context);
            0oh.A07(context, AnonymousClass0qo.A00(context).A02(0qm.A13), textView, num);
            return;
        }
        textView.getPaint().setFakeBoldText(true);
    }
}
