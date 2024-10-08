package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.ui.widget.mediapicker.Folder;

public final class LXA implements View.OnClickListener {
    public final /* synthetic */ C61424K6y A00;
    public final /* synthetic */ Folder A01;

    public LXA(C61424K6y k6y, Folder folder) {
        this.A00 = k6y;
        this.A01 = folder;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1635115219);
        C61424K6y k6y = this.A00;
        int i = k6y.getCurrentFolder().A02;
        Folder folder = this.A01;
        if (i != folder.A02) {
            C61424K6y.A00(k6y, folder);
            TextView textView = ((C60051JeJ) k6y.A0E.getValue()).A02;
            if (textView != null) {
                textView.setText(folder.A03);
            }
        }
        AnonymousClass0fD.A0C(-1903282933, A05);
    }
}
