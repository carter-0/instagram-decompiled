package X;

import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

public final class OTJ {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final OGM A02;

    public static final void A00(OTJ otj, Integer num, String str, boolean z) {
        OGM ogm = otj.A02;
        IgTextView igTextView = ogm.A03;
        int i = 0;
        if (num != null) {
            str = DbW.A0h(otj.A00, str, num.intValue());
        }
        igTextView.setText(str);
        View A0b = AnonymousClass7TE.A0b(ogm.A01, R.id.footer_subtitle_verified_badge);
        if (!z) {
            i = 8;
        }
        A0b.setVisibility(i);
    }

    public OTJ(ViewStub viewStub, FragmentActivity fragmentActivity, AnonymousClass0iw r5) {
        AnonymousClass7TG.A1U(fragmentActivity, viewStub, r5);
        this.A00 = fragmentActivity;
        this.A01 = r5;
        View A0H = JTP.A0H(viewStub, R.layout.ig_basic_metadata_footer);
        0qQ.A0A(A0H);
        this.A02 = new OGM(A0H);
    }
}
