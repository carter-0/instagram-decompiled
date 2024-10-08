package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.instagram.user.model.User;

/* renamed from: X.4G6  reason: invalid class name */
public abstract class AnonymousClass4G6 {
    public static final void A00(AnonymousClass9IE r6, C246893fP r7, AnonymousClass3TX r8, User user) {
        0qQ.A0B(r8, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(r7, 2);
        C376509Ig r5 = (C376509Ig) r6.A00;
        if (((Boolean) ((0sP) r5.A04).invoke(user)).booleanValue()) {
            View A00 = r8.A00();
            String string = A00.getResources().getString(((Number) ((C62320sa) r5.A01).invoke()).intValue());
            0qQ.A07(string);
            String string2 = r8.A00().getResources().getString(((Number) ((C62320sa) r5.A03).invoke()).intValue(), new Object[]{string});
            0qQ.A07(string2);
            Context context = A00.getContext();
            0qQ.A07(context);
            AnonymousClass0eM r2 = r8.A01;
            Object value = r2.getValue();
            0qQ.A07(value);
            ((TextView) value).setMovementMethod(LinkMovementMethod.getInstance());
            Object value2 = r2.getValue();
            0qQ.A07(value2);
            ((TextView) value2).setText((SpannableStringBuilder) ((0sJ) r5.A02).invoke(r7, string, string2, context));
            r8.A00().setVisibility(0);
            return;
        }
        0nA.A0O(r8.A00());
    }
}
