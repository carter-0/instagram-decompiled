package X;

import android.content.Context;
import com.facebook.rsys.tslog.gen.TslogApi;
import com.facebook.rsys.tslog.gen.TslogProxy;
import com.instagram.common.session.UserSession;

public final class NDl extends TslogProxy {
    public TslogApi A00;
    public OET A01;
    public final Context A02;
    public final UserSession A03;

    public final void setApi(TslogApi tslogApi) {
        0qQ.A0B(tslogApi, 0);
        tslogApi.getEngine(new C68371NDi(this));
        this.A00 = tslogApi;
    }

    public NDl(Context context, UserSession userSession) {
        this.A02 = context;
        this.A03 = userSession;
    }
}
