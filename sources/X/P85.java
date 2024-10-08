package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import java.util.List;
import java.util.Map;

public final class P85 implements AnonymousClass7DS {
    public final /* synthetic */ AnonymousClass7X0 A00;

    public P85(AnonymousClass7X0 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        C68821NYf nYf = (C68821NYf) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, nYf, obj2);
        C328667Fr r2 = nYf.A02;
        AnonymousClass9J6 r1 = r2.A08;
        String str = r1.A01;
        if (str.length() <= 0) {
            return false;
        }
        ((C332847Wp) this.A00).Cqp((View) null, (ImageUrl) null, (C68168N3i) null, r2.A0L, (GradientSpinner) null, Long.valueOf(r2.BSP()), (Long) null, str, r1.A00, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (Map) null, A1U ? 1 : 0, false);
        return true;
    }
}
