package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LBs  reason: case insensitive filesystem */
public final class C63909LBs {
    public final Context A00;

    public final C321016tR A00(UserSession userSession, int i) {
        int i2;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        Context context = this.A00;
        int i3 = i;
        String A01 = AnonymousClass2dd.A01(context.getResources(), i3);
        if (A01 == null) {
            A01 = "";
        }
        String valueOf = String.valueOf(i3);
        Resources resources = context.getResources();
        int i4 = 0;
        if (resources != null) {
            i2 = resources.getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height);
        } else {
            i2 = 0;
        }
        int A012 = JTU.A01(context);
        Resources resources2 = context.getResources();
        if (resources2 != null) {
            i4 = resources2.getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height);
        }
        return new C321016tR(context, userSession2, new C321076tX(i2, A012, i4), AnonymousClass05K.A00, A01, valueOf, (String) null, 1.0f, context.getColor(R.color.fds_transparent), context.getColor(R.color.fds_transparent), false);
    }

    public C63909LBs(Context context) {
        this.A00 = context;
    }
}
