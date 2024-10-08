package X;

import android.content.Context;
import com.facebook.rsys.photobooth.gen.PhotoboothModel;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Nf4  reason: case insensitive filesystem */
public final class C69123Nf4 extends OTZ {
    public PhotoboothModel A00;
    public Integer A01 = AnonymousClass05K.A0C;
    public Map A02 = 0Yt.A0E();
    public final int A03 = 5000;
    public final Context A04;
    public final C72187Oxw A05;
    public final UserSession A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69123Nf4(Context context, UserSession userSession, C72187Oxw oxw, O9R o9r) {
        super(o9r);
        0qQ.A0B(oxw, 4);
        this.A04 = context;
        this.A06 = userSession;
        this.A05 = oxw;
    }
}
