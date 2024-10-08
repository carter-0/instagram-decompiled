package X;

import android.app.Dialog;

/* renamed from: X.8J4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8J4 implements C61910qF, AnonymousClass2gO {
    public final /* synthetic */ C353498Hw A00;

    public AnonymousClass8J4(C353498Hw r1) {
        this.A00 = r1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass2gO) || !(obj instanceof C61910qF)) {
            return false;
        }
        return 0qQ.A0K(getFunctionDelegate(), ((C61910qF) obj).getFunctionDelegate());
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(1, this.A00, C353498Hw.class, "showFailedToSaveDraftDialog", "showFailedToSaveDraftDialog(Lcom/instagram/creation/capture/quickcapture/sundial/viewmodel/drafts/models/ClipsDraft;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C293505kq r7 = (C293505kq) obj;
        0qQ.A0B(r7, 0);
        C353498Hw r5 = this.A00;
        C353498Hw.A0c(r5);
        boolean z = false;
        if (r7.A0F.A01 != -1) {
            z = true;
        }
        C39958AKy aKy = new C39958AKy(r5);
        r5.A0d = true;
        AnonymousClass4DH r2 = r5.A1B;
        C358248ab A002 = C63284KuT.A00(r2.requireActivity(), C63104KrX.A00(z));
        A002.A0f(aKy);
        Dialog A02 = A002.A02();
        r5.A04 = A02;
        if (A02 != null) {
            AnonymousClass0fN.A00(A02);
        }
        r5.A1s.A0D(r2.requireActivity(), r5.A16, new C41656Ay8(r5, 37));
    }
}
