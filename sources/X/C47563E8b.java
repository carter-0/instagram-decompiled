package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.E8b  reason: case insensitive filesystem */
public final class C47563E8b extends C47564E8c {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 2EG A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47563E8b(Context context, 04x r3, UserSession userSession, 2EG r5, Integer num, String str, int i) {
        super(r3, Integer.valueOf(i), num, str);
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = r5;
    }

    public final void onClick(View view) {
        Dbb.A0k(this.A00, this.A01, this.A02, C66579MXk.A00(15));
    }
}
