package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.refresh.RefreshableListView;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.72c  reason: invalid class name and case insensitive filesystem */
public abstract class C3253672c {
    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.6xx] */
    public static final AnonymousClass3AD A00(View view, UserSession userSession, AnonymousClass3AB r6) {
        C19763Wf4 wf4;
        0qQ.A0B(userSession, 0);
        if (AnonymousClass2xO.A01(userSession)) {
            wf4 = new C19763Wf4(view, r6);
        } else {
            ? obj = new Object();
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.refreshablelistview_stub);
            if (viewStub != null) {
                viewStub.inflate();
            }
            View findViewById = view.findViewById(16908298);
            17k.A07(findViewById, 002.A0R("RefreshableListView not found in view: ", view.getClass().getSimpleName()));
            RefreshableListView refreshableListView = (RefreshableListView) findViewById;
            obj.A00 = refreshableListView;
            refreshableListView.setupAndEnableRefresh(new C323706xy(obj, r6));
            wf4 = obj;
        }
        return wf4;
    }

    public static final AnonymousClass3AD A01(View view, UserSession userSession, AnonymousClass3AB r3) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(view, 1);
        return A02(view, userSession, r3, AnonymousClass05K.A0u);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.3AC, java.lang.Object] */
    public static final AnonymousClass3AD A02(View view, UserSession userSession, AnonymousClass3AB r6, Integer num) {
        boolean A06;
        C19763Wf4 wf4;
        0qQ.A0B(userSession, 0);
        if (2 - num.intValue() != 0) {
            A06 = AnonymousClass2xO.A01(userSession);
        } else {
            A06 = 182.A06(0Tu.A05, userSession, 36315318582512778L);
        }
        if (A06) {
            wf4 = new C19763Wf4(view, r6);
        } else {
            ? obj = new Object();
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.refreshable_container_stub);
            if (viewStub != null) {
                viewStub.inflate();
            }
            RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) view.findViewById(R.id.refreshable_container);
            obj.A00 = refreshableNestedScrollingParent;
            17k.A07(refreshableNestedScrollingParent, 002.A0R("RefreshableContainer not found in view: ", view.getClass().getSimpleName()));
            obj.A00.A07 = new C14258Tsg(obj, r6);
            wf4 = obj;
        }
        return wf4;
    }
}
