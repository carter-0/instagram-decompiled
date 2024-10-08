package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.F2s  reason: case insensitive filesystem */
public final class C49707F2s {
    public String A00;
    public boolean A01;
    public final Context A02;
    public final UserSession A03;
    public final C49607EzQ A04;
    public final C49415EvH A05;
    public final C49698F2j A06;
    public final FAH A07;
    public final C47438E2k A08;

    public C49707F2s(Context context, FragmentActivity fragmentActivity, UserSession userSession, C47438E2k e2k) {
        0qQ.A0B(userSession, 3);
        C49698F2j f2j = new C49698F2j(context, fragmentActivity, userSession, new C49683F1s(context));
        FYq fYq = (FYq) userSession.A01(FYq.class, new C51586Fwa(userSession, 18));
        FAH fah = (FAH) fYq.A00.get();
        if (fah == null) {
            fah = new FAH();
            fYq.A00 = new WeakReference(fah);
        }
        0qQ.A07(fah);
        C49607EzQ ezQ = new C49607EzQ();
        this.A02 = context;
        this.A03 = userSession;
        this.A08 = e2k;
        this.A06 = f2j;
        this.A07 = fah;
        this.A04 = ezQ;
        this.A05 = new C49415EvH(this);
        f2j.A00 = FP4.A00(this, 42);
    }

    public final void A00() {
        C49607EzQ ezQ = this.A04;
        if (!ezQ.A02 && ezQ.A01) {
            ezQ.A03 = false;
            ezQ.A00 = null;
            ezQ.A02 = true;
            ezQ.A00 = null;
            1OC A002 = C49183Eqo.A00(this.A03, this.A00);
            A002.A00 = new ECQ(this);
            1ES.A03(A002);
            this.A08.A00(this.A06.A00(ezQ, DbU.A0K(this.A07.A00)));
        }
        UserSession userSession = this.A03;
        if (AnonymousClass3FV.A0B(userSession)) {
            1NY A0b = AnonymousClass7TG.A0b(userSession);
            A0b.A0A("supervision/guardians/");
            1OC A0S = DbU.A0S(A0b, C47306DuZ.class, F4L.class);
            A0S.A00 = new EB8(this);
            1ES.A03(A0S);
        }
    }
}
