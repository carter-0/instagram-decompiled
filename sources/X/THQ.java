package X;

import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class THQ implements Runnable {
    public final /* synthetic */ R8X A00;
    public final /* synthetic */ String A01;

    public THQ(R8X r8x, String str) {
        this.A00 = r8x;
        this.A01 = str;
    }

    public final void run() {
        String str;
        R8X r8x = this.A00;
        SpinnerImageView spinnerImageView = r8x.A03;
        if (spinnerImageView == null) {
            str = "loadingSpinner";
        } else {
            spinnerImageView.setVisibility(8);
            C18080Vl9 vl9 = new C18080Vl9(r8x.requireContext());
            vl9.A02(2131954280);
            vl9.A01(2131954279);
            vl9.A06(SVC.A00, "dismiss");
            AnonymousClass0fN.A00(vl9.A00());
            2dZ.A0t.A03(r8x.requireActivity()).ARb(0, true);
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("FAILED_SAVE");
            A1A.append(this.A01);
            S3P s3p = r8x.A02;
            if (s3p == null) {
                str = "holder";
            } else {
                R8X.A02(r8x, AnonymousClass7TF.A0i(s3p.A00(), A1A));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
