package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class IDH implements View.OnLongClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ C62320sa A04;

    public IDH(Activity activity, UserSession userSession, String str, List list, C62320sa r5) {
        this.A00 = activity;
        this.A01 = userSession;
        this.A03 = list;
        this.A02 = str;
        this.A04 = r5;
    }

    public final boolean onLongClick(View view) {
        0nA.A0N(view);
        C327927Ct.A01(this.A00, this.A01, this.A02, (String) null, this.A03, this.A04);
        return true;
    }
}
