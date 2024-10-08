package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.ChannelsContextLine;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.List;
import java.util.Locale;

/* renamed from: X.F5c  reason: case insensitive filesystem */
public abstract class C49751F5c {
    public static final SpannableStringBuilder A00(Context context, UserSession userSession, DirectShareTarget directShareTarget, String str, int i) {
        String str2;
        String str3;
        ChannelsContextLine channelsContextLine;
        0qQ.A0B(context, 0);
        AnonymousClass7TF.A1D(userSession, 1, str);
        if (directShareTarget.A0F()) {
            return null;
        }
        if (!directShareTarget.A0H() || (channelsContextLine = directShareTarget.A03) == null) {
            String A05 = directShareTarget.A05();
            if (A05 == null || A05.length() <= 0) {
                str2 = null;
            } else {
                str2 = directShareTarget.A05();
            }
        } else {
            str2 = channelsContextLine.A00;
        }
        if (directShareTarget.A04(userSession.A06, false) == AnonymousClass05K.A01 || str3 == null || (directShareTarget.A0L() && (i == 7 || i == 18 || i == 6))) {
            if (!directShareTarget.A0K() || directShareTarget.A0T) {
                List A0m = DbW.A0m(directShareTarget);
                if (A0m.size() == 1) {
                    if (i == 11 || i == 13) {
                        str3 = null;
                    } else {
                        str3 = AnonymousClass50n.A01(context, (AnonymousClass170) A0m.get(0));
                    }
                } else if (A0m.isEmpty()) {
                    str3 = AnonymousClass50n.A06(AnonymousClass7TF.A0Q(userSession));
                } else {
                    str3 = AnonymousClass50n.A00(context, userSession, A0m);
                }
                if (TextUtils.equals(str, str3)) {
                    str3 = null;
                }
                if (directShareTarget.A07 == 2EN.A04) {
                    String A16 = AnonymousClass7TE.A16(context, 2131959553);
                    if (str3 != null) {
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                            A1A.append(A16);
                            A1A.append(" · ");
                            A1A.append(str3);
                        } else {
                            A1A.append(str3);
                            A1A.append(" · ");
                            A1A.append(A16);
                        }
                        A16 = A1A.toString();
                    }
                    str3 = A16;
                }
                if (str3 == null || str3.length() == 0) {
                    return null;
                }
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Drawable drawable = context.getDrawable(R.drawable.instagram_lock_filled_12);
                DbX.A11(context, drawable.mutate(), 2Yu.A08(context));
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                spannableStringBuilder.append(" ");
                spannableStringBuilder.setSpan(new C2606346l(drawable), 0, 1, 33);
                spannableStringBuilder.append(" ");
                spannableStringBuilder.append(context.getString(2131953185));
                return spannableStringBuilder;
            }
        }
        return DbS.A0C(str3);
    }

    public static final SpannableStringBuilder A01(Context context, DirectShareTarget directShareTarget, int i) {
        String str;
        String str2;
        String str3;
        0qQ.A0B(context, 0);
        List A0m = DbW.A0m(directShareTarget);
        if (directShareTarget.A0H()) {
            str = directShareTarget.A0N;
            if (str == null) {
                ChannelsContextLine channelsContextLine = directShareTarget.A03;
                if (channelsContextLine == null || (str3 = channelsContextLine.A02) == null) {
                    return null;
                }
                return DbS.A0C(str3);
            }
        } else if (directShareTarget.A0F()) {
            if (DbY.A0W(directShareTarget, 0).A01 == 2 && i == 6) {
                str2 = context.getString(2131959562);
            } else {
                String A05 = directShareTarget.A05();
                if ((A05 == null || A05.length() <= 0 || (str2 = directShareTarget.A05()) == null) && (((PendingRecipient) A0m.get(0)).A09 == null || (str2 = ((PendingRecipient) A0m.get(0)).A09) == null)) {
                    return null;
                }
            }
            return DbS.A0C(str2);
        } else if (directShareTarget.A0I() || A0m.size() != 1 || directShareTarget.A05() == null) {
            return null;
        } else {
            if (directShareTarget.A0L() && (i == 7 || i == 18 || i == 6)) {
                return null;
            }
            str = directShareTarget.A05();
        }
        return DbS.A0C(str);
    }
}
