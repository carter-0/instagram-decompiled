package X;

import android.content.Context;
import com.facebook.odin.model.OdinContext;
import com.instagram.common.session.UserSession;
import java.util.concurrent.Callable;

/* renamed from: X.AsO  reason: case insensitive filesystem */
public final class C41341AsO implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;

    public C41341AsO(Context context, UserSession userSession, long j) {
        this.A02 = userSession;
        this.A01 = context;
        this.A00 = j;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        try {
            UserSession userSession = this.A02;
            C2604745u r4 = (C2604745u) C2604645t.A00(userSession).A02.getValue();
            C258843zj A002 = AnonymousClass4Iw.A00(this.A01, userSession);
            if (AnonymousClass463.A00(A002.A00(), r4, this.A00)) {
                ((AnonymousClass400) A002.A04.getValue()).A00((OdinContext) null);
                r4.A05("last_warm_up_ts", A002.A00().now());
            }
        } catch (Exception e) {
            AnonymousClass7TG.A1I(0wj.A01, AnonymousClass000.A00(937), e, 1011495295);
        }
        return C60340gF.A00;
    }
}
