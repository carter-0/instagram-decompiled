package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class ESj extends C2806552w {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ESj(Context context, UserSession userSession, int i) {
        super(Integer.valueOf(i));
        this.A00 = context;
        this.A01 = userSession;
    }

    public final void onClick(View view) {
        Dbb.A0k(this.A00, this.A01, 2EG.A2A, "https://help.instagram.com/477434105621119");
    }
}
