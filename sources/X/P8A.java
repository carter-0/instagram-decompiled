package X;

import android.text.TextUtils;
import android.view.MotionEvent;

public final class P8A implements AnonymousClass7DS {
    public final /* synthetic */ AnonymousClass7XR A00;
    public final /* synthetic */ PAX A01;

    public P8A(AnonymousClass7XR r1, PAX pax) {
        this.A01 = pax;
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.7XR, X.7X9] */
    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        NYY nyy = (NYY) obj;
        ? r3 = this.A00;
        if (nyy.BCL()) {
            ((C332927Wz) r3).EuX(nyy.BSG());
            return true;
        }
        String str = nyy.A03;
        if (!TextUtils.isEmpty(str)) {
            r3.Cql(str, false, (String) null);
            return true;
        }
        Boolean bool = nyy.A01;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        ((C333057Xm) r3).Cq7();
        return true;
    }
}
