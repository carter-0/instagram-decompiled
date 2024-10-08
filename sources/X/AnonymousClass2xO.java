package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.2xO  reason: invalid class name */
public abstract class AnonymousClass2xO {
    public static final View A00(View view, UserSession userSession, Integer num) {
        0Tu r2;
        long j;
        boolean A06;
        0qQ.A0B(userSession, 1);
        0qQ.A0B(num, 2);
        switch (num.intValue()) {
            case 2:
                r2 = 0Tu.A05;
                j = 36315318582512778L;
                break;
            case 4:
            case 5:
            case 6:
                r2 = 0Tu.A05;
                j = 36315318582316169L;
                break;
            default:
                A06 = false;
                break;
        }
        A06 = 182.A06(r2, userSession, j);
        if (A06) {
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.swiperefreshlayout_stub);
            if (viewStub != null) {
                view = viewStub.inflate();
            }
            RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) view.findViewById(R.id.refreshable_container);
            if (refreshableNestedScrollingParent != null) {
                refreshableNestedScrollingParent.A0A = true;
            }
        } else {
            ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.refreshable_container_stub);
            if (viewStub2 != null) {
                View inflate = viewStub2.inflate();
                0qQ.A07(inflate);
                return inflate;
            }
        }
        return view;
    }

    public static final boolean A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A05, userSession, 36315318582316169L);
    }
}
