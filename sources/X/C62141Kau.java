package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kau  reason: case insensitive filesystem */
public final class C62141Kau extends C2806552w {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62141Kau(Context context, UserSession userSession, int i) {
        super(Integer.valueOf(i));
        this.A00 = context;
        this.A01 = userSession;
    }

    public final void onClick(View view) {
        AnonymousClass4A2.A04(this.A00, this.A01);
    }
}
