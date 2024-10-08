package X;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Mho  reason: case insensitive filesystem */
public abstract class C67073Mho {
    public static final void A00(Context context, ImageView imageView, TextView textView, UserSession userSession, C71662eb r10, C71662eb r11, C252063oV r12, C66693Mb0 mb0) {
        Typeface A02;
        AnonymousClass7TG.A1Q(textView, r10);
        0qQ.A0B(mb0, 7);
        boolean A08 = 0oh.A08();
        C61066Jw4 jw4 = null;
        int i = mb0.A00;
        if (A08) {
            Context context2 = textView.getContext();
            if (i == 1) {
                A02 = 0oh.A00(context2);
            } else {
                A02 = 0oh.A02(context2);
            }
            textView.setTypeface(A02, i);
        } else {
            textView.setTypeface((Typeface) null, i);
        }
        DbY.A12(textView, context);
        C69601Noj noj = mb0.A01;
        if (noj instanceof C66771McH) {
            String str = ((C66771McH) noj).A00;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        } else if (noj instanceof C66703MbA) {
            C66703MbA mbA = (C66703MbA) noj;
            List list = mbA.A00;
            0qQ.A0B(list, 1);
            int A04 = C66582MXn.A04(textView, textView.getRight() - textView.getLeft());
            int i2 = 0;
            while (i2 < list.size() && textView.getPaint().measureText((String) list.get(i2)) > ((float) A04)) {
                i2++;
            }
            if (i2 >= list.size()) {
                i2 = C51966G9m.A06(list);
            }
            String A19 = AnonymousClass7TE.A19(list, i2);
            boolean z = mbA.A03;
            if (mbA.A01 || mbA.A02) {
                jw4 = new C61066Jw4(AnonymousClass05K.A00);
            }
            C46334Dcc.A00(textView, jw4, A19, z);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        int i3 = 0;
        r10.A03(DbW.A01(mb0.A05 ? 1 : 0));
        if (r11 != null) {
            r11.A03(DbW.A01(mb0.A03 ? 1 : 0));
        }
        if (imageView != null) {
            imageView.setVisibility(DbW.A01(mb0.A03 ? 1 : 0));
        }
        if (r12 != null) {
            if (!mb0.A02 || !182.A06(0Tu.A05, userSession, 36330110449631703L)) {
                i3 = 8;
            }
            r12.setVisibility(i3);
        }
    }
}
