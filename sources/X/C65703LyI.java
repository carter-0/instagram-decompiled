package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LyI  reason: case insensitive filesystem */
public final class C65703LyI implements C66572MXc {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewStub A01;
    public final /* synthetic */ LGO A02;

    public final /* bridge */ /* synthetic */ void Dbb(Object obj) {
        C66532MVm mVm = (C66532MVm) obj;
        0qQ.A0B(mVm, 0);
        LGO lgo = this.A02;
        UserSession userSession = lgo.A06;
        AnonymousClass4DH r8 = lgo.A04;
        ViewStub viewStub = this.A01;
        View view = this.A00;
        Context A0S = AnonymousClass7TE.A0S(view);
        lgo.A01 = mVm.CrO(viewStub, r8, userSession, AnonymousClass7TE.A0v(), new C20614Wvv(32, A0S, lgo));
        lgo.A02(false);
        C41832B2n b2n = lgo.A01;
        if (b2n != null) {
            b2n.EcK(lgo.A07);
        }
        View requireViewById = view.requireViewById(R.id.iglive_sup_toggle_container);
        lgo.A00 = requireViewById;
        mVm.CrM(requireViewById, r8, userSession, new C20614Wvv(32, A0S, lgo));
        lgo.A02 = mVm.CrV(r8, userSession);
        mVm.CrJ(r8, userSession, new C20614Wvv(32, A0S, lgo));
        mVm.CrN(r8, userSession, (C357638Yz) null, new C20614Wvv(32, A0S, lgo));
        1pd.A00(C362988ir.A00()).A00(lgo.A03, userSession, new C19667WdV(lgo, 2), AnonymousClass000.A00(5306));
    }

    public C65703LyI(View view, ViewStub viewStub, LGO lgo) {
        this.A02 = lgo;
        this.A01 = viewStub;
        this.A00 = view;
    }
}
