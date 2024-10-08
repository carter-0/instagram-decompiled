package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6vD  reason: invalid class name and case insensitive filesystem */
public final class C322076vD implements C230842qN {
    public View A00;
    public final Integer A01 = AnonymousClass05K.A00;

    public final int CGx(Context context, UserSession userSession) {
        int i;
        int[] iArr = new int[2];
        View view = this.A00;
        if (view != null) {
            view.getLocationInWindow(iArr);
        }
        View view2 = this.A00;
        if (view2 != null) {
            i = view2.getWidth();
        } else {
            i = 0;
        }
        return iArr[0] + (i / 2);
    }

    public final int CHU(Context context) {
        int i;
        int[] iArr = new int[2];
        View view = this.A00;
        if (view != null) {
            view.getLocationInWindow(iArr);
        }
        View view2 = this.A00;
        if (view2 != null) {
            i = view2.getHeight();
        } else {
            i = 0;
        }
        return iArr[1] + i;
    }

    public final long EKO() {
        return 0;
    }

    public final Integer Aw1() {
        return this.A01;
    }

    public final boolean CTz() {
        return false;
    }
}
