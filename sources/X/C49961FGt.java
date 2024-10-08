package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.text.NumberFormat;
import java.util.List;

/* renamed from: X.FGt  reason: case insensitive filesystem */
public final class C49961FGt {
    public static final C49961FGt A00 = new Object();

    public static final String A00(TextView textView, String str, float f) {
        CharSequence charSequence = str;
        float f2 = f;
        if (textView.getPaint().measureText(str) >= f) {
            charSequence = TextUtils.ellipsize(charSequence, textView.getPaint(), f2, TextUtils.TruncateAt.END, false, (TextUtils.EllipsizeCallback) null);
        }
        return charSequence.toString();
    }

    public static final void A04(Context context, UserSession userSession, C49622Ezf ezf, DcN dcN, DirectShareTarget directShareTarget) {
        String str;
        int i;
        C61066Jw4 jw4;
        TextView textView = ezf.A02;
        boolean A1Q = AnonymousClass7TF.A1Q(textView.getVisibility());
        TextView textView2 = ezf.A01;
        String A0y = DbV.A0y(textView);
        String A0y2 = DbV.A0y(textView2);
        if (A1Q) {
            textView2 = textView;
        } else {
            A0y = A0y2;
        }
        float dimension = context.getResources().getDimension(R.dimen.account_discovery_bottom_gap);
        SpannableStringBuilder A0C = DbS.A0C(A0y);
        if (directShareTarget.A0K() && !directShareTarget.A0T) {
            str = " ";
            A0C.append(str);
            i = R.drawable.instagram_lock_pano_filled_16;
        } else if (directShareTarget.A0V()) {
            boolean A0V = directShareTarget.A0V();
            if (C66651MaK.A00(userSession, directShareTarget)) {
                jw4 = new C61066Jw4(AnonymousClass05K.A00);
            } else {
                jw4 = null;
            }
            C46334Dcc.A00(textView2, jw4, A0y, A0V);
            return;
        } else if (dcN != null) {
            str = " ";
            A0C.append(str);
            i = R.drawable.instagram_clock_dotted_pano_outline_24;
        } else {
            return;
        }
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            int length = A0C.length();
            DbU.A10(context, drawable.mutate(), R.color.grey_6);
            int i2 = (int) dimension;
            drawable.setBounds(0, 0, i2, i2);
            C2606346l r2 = new C2606346l(drawable);
            A0C.append(str);
            A0C.setSpan(r2, length, length + 1, 33);
        }
        textView2.setText(A0C);
    }

    public static final boolean A06(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36327670908205671L) || !182.A06(r2, userSession, 36327670908271208L)) {
            return false;
        }
        return true;
    }

    public static final String A01(DirectShareTarget directShareTarget) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        int i = 0;
        for (PendingRecipient pendingRecipient : DbT.A14(directShareTarget)) {
            A1A.append(pendingRecipient.A0f);
            DbY.A1V(A1A, DbT.A14(directShareTarget), i);
            i++;
        }
        return DbT.A10(A1A);
    }

    public static final String A02(DirectShareTarget directShareTarget) {
        String obj;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (directShareTarget.A0Q.size() == 1 && directShareTarget.A01 == 47) {
            obj = DbT.A0y(directShareTarget);
        } else {
            int i = 0;
            for (PendingRecipient pendingRecipient : DbT.A14(directShareTarget)) {
                int i2 = i + 1;
                A1A.append(pendingRecipient.A0f);
                if (i < DbT.A02(directShareTarget.A0Q, 1)) {
                    A1A.append(", ");
                }
                i = i2;
            }
            obj = A1A.toString();
        }
        0qQ.A07(obj);
        return obj;
    }

    public static String A03(List list, int i) {
        return ((PendingRecipient) list.get(i)).A0f;
    }

    public static final boolean A05(Context context, DirectShareTarget directShareTarget) {
        Resources resources;
        int i;
        Object[] objArr;
        String string;
        if (!directShareTarget.A0M()) {
            return false;
        }
        if (directShareTarget.A0Q.size() >= 5) {
            int size = directShareTarget.A0Q.size() - 3;
            string = context.getResources().getQuantityString(R.plurals.thread_title_x_y_z_and_n_others, size, new Object[]{DbY.A0W(directShareTarget, 0).A0f, DbY.A0W(directShareTarget, 1).A0f, A03(DbT.A14(directShareTarget), 2), NumberFormat.getInstance(AnonymousClass1Q2.A02()).format((long) size)});
        } else {
            List A0m = DbW.A0m(directShareTarget);
            int size2 = A0m.size();
            if (size2 == 2) {
                resources = context.getResources();
                i = 2131975304;
                objArr = new Object[]{A03(A0m, 0), A03(A0m, 1)};
            } else if (size2 == 3) {
                resources = context.getResources();
                i = 2131975306;
                objArr = new Object[]{A03(A0m, 0), A03(A0m, 1), A03(A0m, 2)};
            } else if (size2 != 4) {
                string = null;
            } else {
                resources = context.getResources();
                i = 2131975307;
                objArr = new Object[]{A03(A0m, 0), A03(A0m, 1), A03(A0m, 2), A03(A0m, 3)};
            }
            string = resources.getString(i, objArr);
        }
        return !DbT.A0y(directShareTarget).equals(string);
    }
}
