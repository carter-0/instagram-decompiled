package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Hqg  reason: case insensitive filesystem */
public final class C55975Hqg {
    public Animator A00;
    public final long A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ UserSession A03;

    public C55975Hqg(View view, UserSession userSession) {
        this.A03 = userSession;
        this.A02 = view;
        this.A01 = ((long) 182.A00(C51968G9o.A0b(userSession), userSession, 37163664818241831L)) * 1000;
    }

    public final List A00(float f, long j) {
        View view = this.A02;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{f});
        ofFloat.setDuration(j);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{f});
        ofFloat2.setDuration(j);
        return 0sr.A1P(new ObjectAnimator[]{ofFloat, ofFloat2});
    }
}
