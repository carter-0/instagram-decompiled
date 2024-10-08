package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;

/* renamed from: X.LyJ  reason: case insensitive filesystem */
public final class C65704LyJ implements C66572MXc {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C18078Vl7 A01;
    public final /* synthetic */ LGO A02;
    public final /* synthetic */ boolean A03;

    public C65704LyJ(View view, C18078Vl7 vl7, LGO lgo, boolean z) {
        this.A00 = view;
        this.A02 = lgo;
        this.A03 = z;
        this.A01 = vl7;
    }

    public final /* bridge */ /* synthetic */ void Dbb(Object obj) {
        C18078Vl7 vl7;
        C66532MVm mVm = (C66532MVm) obj;
        0qQ.A0B(mVm, 0);
        View view = this.A00;
        ViewStub A0X = JTR.A0X(view, R.id.iglive_sup_disconnected_overlay_stub);
        LGO lgo = this.A02;
        mVm.CrL(A0X, lgo.A04, new C20614Wvv(32, AnonymousClass7TE.A0S(view), lgo));
        if (this.A03 && (vl7 = this.A01) != null) {
            C20845X0w CrI = mVm.CrI(view, lgo.A06, R.id.iglive_capture_layout_sup_debug_stub);
            vl7.A07 = CrI;
            XBm xBm = vl7.A0B;
            xBm.FJG();
            xBm.Elu(CrI);
        }
    }
}
