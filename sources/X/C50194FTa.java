package X;

import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.FTa  reason: case insensitive filesystem */
public final class C50194FTa implements AnonymousClass57Y {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C307896Rx A01;
    public final /* synthetic */ AnonymousClass6Tm A02;
    public final /* synthetic */ UserSession A03;

    public C50194FTa(Fragment fragment, C307896Rx r2, AnonymousClass6Tm r3, UserSession userSession) {
        this.A03 = userSession;
        this.A00 = fragment;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void FJw(Uri uri) {
        if (AnonymousClass36X.IG_EDIT_PROFILE.equals(AnonymousClass36O.A0B)) {
            C46354Dcy.A02(this.A03).A00 = true;
            DbT.A1J(this.A00);
        }
        Object A0e = DbW.A0e(this.A02);
        if (A0e instanceof C280064zw) {
            C277014uI r2 = ((C280064zw) A0e).A00;
            C307896Rx r1 = this.A01;
            SCZ.A00 = r1;
            C299275ur.A00(r1, DbS.A0P().A00(), r2);
        }
    }
}
