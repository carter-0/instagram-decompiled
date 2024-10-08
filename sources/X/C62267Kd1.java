package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.concurrent.CancellationException;

/* renamed from: X.Kd1  reason: case insensitive filesystem */
public final class C62267Kd1 extends C64856LjI implements C61110lV {
    public C262204Co A00;
    public final ViewGroup A01;
    public final C339317jP A02 = new Object();

    public final void A04(Fragment fragment) {
        C62415KfQ kfQ;
        super.A04(fragment);
        14i.A04(15Y.A02, this, false, false);
        C60255JiC jiC = (C60255JiC) this.A0I.getValue();
        C262204Co r0 = null;
        if ((jiC instanceof C62415KfQ) && (kfQ = (C62415KfQ) jiC) != null) {
            r0 = JTS.A0t(fragment, MHB.A01(this, (AnonymousClass4D7) null, 17), kfQ.A06);
        }
        this.A00 = r0;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.7jP] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62267Kd1(View view, AnonymousClass4DH r9, UserSession userSession, C313666go r11) {
        super(view, r9, userSession, r11, R.layout.iglive_viewer_buttons_container);
        0qQ.A0B(userSession, 2);
        this.A01 = DbX.A0I(view, R.id.iglive_reactions_layout);
    }

    public final void A05(Fragment fragment) {
        2Fk r1;
        14i.A07(this);
        C262204Co r0 = this.A00;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        this.A00 = null;
        AnonymousClass0eM r3 = this.A0I;
        C60255JiC jiC = (C60255JiC) r3.getValue();
        if (jiC instanceof C62415KfQ) {
            C62415KfQ kfQ = (C62415KfQ) jiC;
            kfQ.A01();
            kfQ.A00 = 0;
        } else {
            jiC.A01();
        }
        C262204Co r02 = this.A00;
        if (r02 != null) {
            r02.AG7((CancellationException) null);
        }
        this.A00 = null;
        C60255JiC jiC2 = (C60255JiC) r3.getValue();
        if (jiC2 instanceof C62415KfQ) {
            r1 = ((C62415KfQ) jiC2).A01;
        } else if (jiC2 instanceof C62414KfP) {
            r1 = ((C62414KfP) jiC2).A01;
        } else {
            r1 = ((C62413KfO) jiC2).A00;
        }
        r1.A05(fragment.getViewLifecycleOwner());
    }

    public final void onAppBackgrounded() {
        AnonymousClass0fD.A0A(162423597, AnonymousClass0fD.A03(-1177526477));
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(563473111);
        this.A0I.getValue();
        AnonymousClass0fD.A0A(533200079, A03);
    }
}
