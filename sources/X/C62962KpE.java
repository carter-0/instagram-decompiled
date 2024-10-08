package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.Locale;

/* renamed from: X.KpE  reason: case insensitive filesystem */
public abstract class C62962KpE {
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, X.5n1] */
    public static final void A00(Context context, C276544tV r5, IgdsMediaButton igdsMediaButton) {
        C62567Khx khx;
        String A0F;
        Drawable A02;
        C276544tV A07 = r5.A07(46);
        C276544tV A072 = r5.A07(45);
        if (!(A07 == null || (A0F = A07.A0F()) == null || (A02 = C14091Tpi.A02(context, A0F)) == null)) {
            ? obj = new Object();
            obj.A01 = A02;
            igdsMediaButton.setStartAddOn(obj, (CharSequence) null);
        }
        if (A072 == null) {
            return;
        }
        if (r5.A0J() != null) {
            String A0F2 = A072.A0F();
            if (A0F2 != null) {
                String A19 = AnonymousClass7TE.A19(00l.A0R(A0F2, new String[]{"_"}, 3), 0);
                Locale locale = Locale.ROOT;
                0qQ.A08(locale);
                String upperCase = A19.toUpperCase(locale);
                0qQ.A07(upperCase);
                if (upperCase.equals("CHEVRON")) {
                    khx = C62567Khx.CHEVRON;
                } else if (upperCase.equals("CREATION-ARROW")) {
                    khx = C62567Khx.CREATION_ARROW;
                } else {
                    return;
                }
                igdsMediaButton.setEndAddOn(khx);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A15("Cannot pass in only end icon when button has no text");
    }
}
