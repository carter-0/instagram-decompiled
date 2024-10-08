package X;

import android.content.Context;
import android.view.View;
import com.instagram.simplewebview.SimpleWebViewActivity;

/* renamed from: X.Ngq  reason: case insensitive filesystem */
public final class C69192Ngq extends AnonymousClass7AK {
    public final Context A00;
    public final 0lg A01;
    public final OAJ A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69192Ngq(Context context, 0lg r3, OAJ oaj, String str, int i) {
        super(Integer.valueOf(i));
        0qQ.A0B(r3, 2);
        this.A00 = context;
        this.A01 = r3;
        this.A03 = str;
        this.A02 = oaj;
    }

    public final void onClick(View view) {
        OAJ oaj = this.A02;
        if (oaj != null) {
            OVB ovb = oaj.A00.A08;
            0Aj A0e = AnonymousClass7TE.A0e(ovb.A00, "instagram_waverly_ig_event");
            DbS.A1I(A0e, "tap_component");
            DbS.A1N(A0e, ovb.A01);
            A0e.AAJ("component", "learn_more");
            A0e.AAJ("step", "ig_message_settings");
            A0e.AAJ("message_controls_settings_version", "v2");
            A0e.Cgf();
        }
        Context context = this.A00;
        String A16 = AnonymousClass7TE.A16(context, 2131964884);
        C49906FEe.A01(context, this.A01, SimpleWebViewActivity.A02, new C11225SFz(this.A03), A16);
    }
}
