package X;

import android.content.Context;
import com.facebook.iabadscontext.IABAdsContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.QKc  reason: case insensitive filesystem */
public final class C7571QKc extends C7576QKr {
    public final Context A00;
    public final QKY A01;
    public final IABAdsContext A02;
    public final UserSession A03;

    public C7571QKc(Context context, QKY qky, IABAdsContext iABAdsContext, UserSession userSession, String str) {
        super(iABAdsContext, str);
        this.A00 = context;
        this.A03 = userSession;
        this.A02 = iABAdsContext;
        this.A01 = qky;
    }
}
