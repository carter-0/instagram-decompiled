package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;

public final class H8L extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass6Q6 A02;
    public final /* synthetic */ IgShowreelNativeAnimationIntf A03;
    public final /* synthetic */ AnonymousClass6UO A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H8L(Context context, UserSession userSession, AnonymousClass6Q6 r6, IgShowreelNativeAnimationIntf igShowreelNativeAnimationIntf, AnonymousClass6UO r8) {
        super(584, 3, false, false);
        this.A01 = userSession;
        this.A00 = context;
        this.A03 = igShowreelNativeAnimationIntf;
        this.A02 = r6;
        this.A04 = r8;
    }

    public final void run() {
        UserSession userSession = this.A01;
        new C52511GVo(this.A00, userSession, this.A02, this.A03, new C308766Vn(), this.A04, 0, 1, -1, -1).run();
    }
}
