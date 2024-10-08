package X;

import android.view.View;
import android.view.ViewStub;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Hrl  reason: case insensitive filesystem */
public final class C56038Hrl {
    public final ViewStub A00;
    public final AnonymousClass4DH A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(new MMR(this, 18));
    public final 0sP A05;

    public C56038Hrl(ViewStub viewStub, AnonymousClass4DH r9, 0sP r10) {
        0qQ.A0B(viewStub, 1);
        this.A00 = viewStub;
        this.A01 = r9;
        this.A05 = r10;
        this.A02 = DbS.A0I(new MMR(r9, 19), C58340IqL.A00, new C66291MMa(23, (Object) null, r9), DbS.A0z(C52978GgV.class));
        AnonymousClass0eM A002 = AnonymousClass1YB.A00(new MMR(this, 17));
        this.A03 = A002;
        ComposeView composeView = (ComposeView) A002.getValue();
        composeView.setViewCompositionStrategy(GTZ.A00);
        composeView.setContent(AnonymousClass5PI.A04(new C59112J6u(this, 33), -1012546335, true));
    }

    public final void A01(C390759rn r4) {
        C390759rn r1 = C390759rn.None;
        View A0c = AnonymousClass7TE.A0c(this.A04);
        if (r4 == r1) {
            A0c.setVisibility(8);
            DbW.A1R(this.A03, 8);
        } else {
            A0c.setVisibility(0);
            DbW.A1R(this.A03, 0);
        }
        ((C52978GgV) this.A02.getValue()).A00.Epw(r4);
    }

    public final C390759rn A00() {
        return (C390759rn) ((C52978GgV) this.A02.getValue()).A01.getValue();
    }
}
