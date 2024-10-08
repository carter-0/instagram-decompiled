package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.concurrent.CancellationException;

/* renamed from: X.Kch  reason: case insensitive filesystem */
public abstract class C62247Kch extends C65809M0b implements MVX {
    public M0V A00;
    public AnonymousClass52T A01 = new AnonymousClass52S(this.A03.getContext());
    public C262204Co A02;
    public final C62283KdH A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new MMN(this, 4));

    public C62247Kch(View view, AnonymousClass4DH r4, UserSession userSession, C313666go r6, C62283KdH kdH) {
        super(view, r4, userSession, r6, kdH);
        this.A03 = kdH;
        this.A04 = MMN.A00(view, 3);
    }

    public void A05() {
        2Fk r3 = this.A09.A02;
        AnonymousClass4DH r4 = this.A04;
        DbV.A1F(r4.getViewLifecycleOwner(), r3, new MP8(this, 40), 56);
        DbV.A1F(r4.getViewLifecycleOwner(), this.A03.A04, new MP8(this, 41), 57);
    }

    public void A06() {
        C262204Co r0 = this.A00;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        this.A00 = null;
        this.A06.onStop();
        C262204Co r02 = this.A02;
        if (r02 != null) {
            r02.AG7((CancellationException) null);
        }
        this.A02 = null;
    }

    public void A07() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass11O.A03(DbV.A0J(this.A04), C66186MGx.A01(this, this.A09.A0C, 43));
        }
        AnonymousClass3E6 r0 = this.A06;
        AnonymousClass4DH r4 = this.A04;
        JTP.A18(r4, r0);
        if (this.A02 == null) {
            this.A02 = JTS.A0t(r4, new C66186MGx(this, (AnonymousClass4D7) null, 44), this.A03.A0C);
        }
    }
}
