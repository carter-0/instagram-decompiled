package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class TDV implements Runnable {
    public final /* synthetic */ R8X A00;

    public TDV(R8X r8x) {
        this.A00 = r8x;
    }

    public final void run() {
        String str;
        R8X r8x = this.A00;
        SpinnerImageView spinnerImageView = r8x.A03;
        if (spinnerImageView == null) {
            str = "loadingSpinner";
        } else {
            spinnerImageView.setVisibility(8);
            FragmentActivity requireActivity = r8x.requireActivity();
            Intent intent = r8x.A00;
            if (intent == null) {
                str = "resultIntent";
            } else {
                requireActivity.setResult(-1, intent);
                DbT.A1J(r8x);
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("SUCCEEDED_SAVE");
                S3P s3p = r8x.A02;
                if (s3p == null) {
                    str = "holder";
                } else {
                    R8X.A02(r8x, AnonymousClass7TF.A0i(s3p.A00(), A1A));
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
