package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Vaj  reason: case insensitive filesystem */
public final class C17591Vaj {
    public final View A00;
    public final TextView A01;
    public final VTH A02;
    public final Us7 A03;
    public final Us7 A04;
    public final Us7 A05;

    public C17591Vaj(View view) {
        this.A00 = view;
        this.A02 = new VTH(view);
        this.A01 = DbU.A0G(view, R.id.text_response);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        this.A04 = C13990Tnq.A0Y(view, R.id.message_button);
        this.A05 = C13990Tnq.A0Y(view, R.id.share_button);
        this.A03 = C13990Tnq.A0Y(view, R.id.delete_button);
    }
}
