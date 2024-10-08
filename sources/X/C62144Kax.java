package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kax  reason: case insensitive filesystem */
public final class C62144Kax extends C2806552w {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62144Kax(AnonymousClass4DH r2, UserSession userSession, String str, String str2, int i) {
        super(Integer.valueOf(i));
        this.A00 = r2;
        this.A01 = userSession;
        this.A02 = str;
        this.A03 = str2;
    }

    public final void onClick(View view) {
        FH7.A08(this.A00.requireActivity(), this.A01, 2EG.A46, this.A02, this.A03);
    }
}
