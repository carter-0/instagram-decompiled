package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "This is slated to be merged with GenericXmaMessageItemDefinition.")
/* renamed from: X.NOm  reason: case insensitive filesystem */
public final class C68590NOm extends C232222tE {
    public final UserSession A00;
    public final C3256673q A01;
    public final AnonymousClass7Y0 A02;
    public final C72565PAw A03;
    public final AnonymousClass7DY A04;

    public C68590NOm(UserSession userSession, C3256673q r3, AnonymousClass7Y0 r4, C72565PAw pAw, AnonymousClass7DY r6) {
        0qQ.A0B(r4, 5);
        this.A00 = userSession;
        this.A01 = r3;
        this.A03 = pAw;
        this.A04 = r6;
        this.A02 = r4;
    }

    /* renamed from: A00 */
    public final C68025Myr createViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        C68025Myr myr = new C68025Myr(DbU.A09(layoutInflater, viewGroup, R.layout.direct_poll_message, false));
        this.A04.D77(myr.A05);
        myr.A04.EeU(new C72248OzG(0, this, myr));
        return myr;
    }

    /* renamed from: A01 */
    public final void bind(C68025Myr myr, N6K n6k) {
        AnonymousClass7TF.A1H(n6k, myr);
        C328667Fr r3 = n6k.A01;
        C3259574v r2 = r3.A0A;
        if (r2 != null) {
            AnonymousClass7DY r0 = this.A04;
            C68802NXm nXm = myr.A05;
            r0.Cy2(nXm, r3);
            C3256673q r02 = this.A01;
            if (r02 != null) {
                r02.bind(nXm, r2);
            }
        }
        if (r3.A0H != null) {
            myr.A04.setVisibility(0);
            C72565PAw pAw = this.A03;
            C68067MzY mzY = myr.A01;
            if (mzY != null) {
                pAw.ADp(r3, mzY);
                myr.A02.setVisibility(DbW.A01(r3.BCL() ? 1 : 0));
            } else {
                0qQ.A0F("pollViewHolder");
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            myr.A02.setVisibility(8);
            myr.A04.setVisibility(8);
        }
        C3262275x r4 = n6k.A00.A0C;
        if (r4 != null && myr.A00 == null) {
            myr.A00 = new AnonymousClass7EJ(this.A00, myr.A03, this.A02);
        }
        AnonymousClass7EJ r03 = myr.A00;
        if (r03 != null) {
            r03.A00(r4);
        }
    }

    public final Class modelClass() {
        return N6K.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r3) {
        C68025Myr myr = (C68025Myr) r3;
        0qQ.A0B(myr, 0);
        C3256673q r1 = this.A01;
        if (r1 != null) {
            r1.unbind(myr.A05);
        }
    }
}
