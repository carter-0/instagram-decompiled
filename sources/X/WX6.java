package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

public final class WX6 implements AnonymousClass32J {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;

    /* JADX WARNING: type inference failed for: r0v10, types: [X.WNI, java.lang.Object, X.4bz] */
    public final void DIH(View view, 1Xj r7, int i) {
        int i2;
        0qQ.A0B(r7, 0);
        IgFragmentFactoryImpl.A00();
        String id = r7.getId();
        if (id != null) {
            F3W f3w = new F3W();
            f3w.A0B = id;
            f3w.A03 = 1sw.A04;
            UserSession userSession = this.A01;
            0qQ.A0B(userSession, 0);
            f3w.A0F = userSession.A05;
            AnonymousClass32F A012 = f3w.A01();
            FragmentActivity fragmentActivity = this.A00;
            if (fragmentActivity != null) {
                C309516Yo A0M = DbV.A0M(A012, fragmentActivity, userSession);
                if (r7.CeS()) {
                    i2 = 823;
                } else {
                    i2 = 737;
                }
                A0M.A0B = AnonymousClass000.A00(i2);
                String str = userSession.A06;
                ? obj = new Object();
                obj.A00 = str;
                A0M.A07 = obj;
                A0M.A04();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean DII(MotionEvent motionEvent, View view, AnonymousClass1Xq r4, int i) {
        return false;
    }

    public WX6(UserSession userSession, FragmentActivity fragmentActivity) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public WX6() {
    }
}
