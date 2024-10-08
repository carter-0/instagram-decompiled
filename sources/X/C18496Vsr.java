package X;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vsr  reason: case insensitive filesystem */
public final class C18496Vsr {
    public C17429VVi A00;
    public CharSequence[] A01;
    public final Fragment A02;
    public final UserSession A03;
    public final WWP A04;
    public final AnonymousClass4DU A05;

    public static final CharSequence[] A00(C18496Vsr vsr) {
        CharSequence[] charSequenceArr = vsr.A01;
        if (charSequenceArr != null) {
            return charSequenceArr;
        }
        Resources A0R = JTR.A0R(vsr.A02);
        CharSequence[] charSequenceArr2 = {A0R.getString(2131963393), A0R.getString(2131963367), A0R.getString(2131974138)};
        vsr.A01 = charSequenceArr2;
        return charSequenceArr2;
    }

    public C18496Vsr(Fragment fragment, UserSession userSession, WWP wwp, AnonymousClass4DU r4) {
        this.A03 = userSession;
        this.A02 = fragment;
        this.A05 = r4;
        this.A04 = wwp;
    }
}
