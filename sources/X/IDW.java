package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.user.model.User;

public final class IDW implements View.OnTouchListener {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ AnonymousClass4DU A01;
    public final /* synthetic */ C242813Wa A02;

    public IDW(1Xj r1, AnonymousClass4DU r2, C242813Wa r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View.OnTouchListener Dsk;
        1Xj r4 = this.A00;
        User user = (User) 00k.A0J(r4.A3Q());
        0qQ.A0A(motionEvent);
        if (!AnonymousClass7TF.A1Q(motionEvent.getAction()) || user == null || (Dsk = this.A02.Dsk(r4, user.getId(), this.A01.getModuleName())) == null) {
            return false;
        }
        return Dsk.onTouch(view, motionEvent);
    }
}
