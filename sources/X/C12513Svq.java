package X;

import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.Svq  reason: case insensitive filesystem */
public final class C12513Svq implements C13623Tdp {
    public final /* synthetic */ R8N A00;
    public final /* synthetic */ SpinnerImageView A01;

    public C12513Svq(R8N r8n, SpinnerImageView spinnerImageView) {
        this.A00 = r8n;
        this.A01 = spinnerImageView;
    }

    public final void DLl(boolean z) {
        R8N r8n = this.A00;
        SpinnerImageView spinnerImageView = this.A01;
        if (r8n.getContext() != null && r8n.isAdded()) {
            R8N.A08(r8n, z);
            spinnerImageView.setLoadingStatus(C255943uy.SUCCESS);
            r8n.A02 = false;
            R8N.A05(r8n);
        }
    }
}
