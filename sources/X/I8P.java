package X;

import android.content.Context;
import android.content.DialogInterface;

public final class I8P implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C55974Hqf A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public I8P(Context context, C55974Hqf hqf, String str, String str2, int i) {
        this.A01 = context;
        this.A02 = hqf;
        this.A03 = str;
        this.A00 = i;
        this.A04 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FH7.A03(this.A01, "https://help.instagram.com/1052265019655889");
        C56516Hzn hzn = this.A02.A02;
        String str = this.A03;
        int i2 = this.A00;
        String str2 = this.A04;
        0Aj A0e = AnonymousClass7TE.A0e(hzn.A00, "instagram_clips_viewer_link_tap");
        Long A002 = C56516Hzn.A00(str);
        if (A0e.isSampled() && A002 != null) {
            C51968G9o.A1I(A0e, A002, "containermodule", "add_spin_nux");
            C51969G9p.A16(A0e, i2);
            C51965G9l.A1O(A0e, str2);
            C51965G9l.A19(C52236GKd.A1F, A0e);
            C51965G9l.A1C(AnonymousClass5OC.CLIPS_SPINS, A0e);
            AnonymousClass7TH.A0V(A0e);
        }
    }
}
