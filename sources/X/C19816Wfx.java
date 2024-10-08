package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wfx  reason: case insensitive filesystem */
public final class C19816Wfx implements XAF {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ V43 A02;
    public final /* synthetic */ 1WW A03;

    public C19816Wfx(Context context, UserSession userSession, V43 v43, 1WW r4) {
        this.A03 = r4;
        this.A02 = v43;
        this.A00 = context;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ Object DTf(C17678Vc9 vc9, Object obj, int i) {
        V43 v43 = this.A02;
        VT3 vt3 = v43.A02;
        Context context = this.A00;
        UserSession userSession = this.A01;
        Bitmap bitmap = vt3.A00;
        boolean z = vt3.A01;
        C48366EdN.A00(context, bitmap, new C15619Ufl(14, this, vc9), userSession, v43.A03, z);
        return null;
    }
}
