package X;

import android.widget.TextView;

/* renamed from: X.Woi  reason: case insensitive filesystem */
public final class C20293Woi implements Runnable {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ C15273UZb A01;
    public final /* synthetic */ 1Av A02;

    public C20293Woi(TextView textView, C15273UZb uZb, 1Av r3) {
        this.A01 = uZb;
        this.A00 = textView;
        this.A02 = r3;
    }

    public final void run() {
        C15273UZb uZb = this.A01;
        AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(uZb.requireActivity(), AnonymousClass7TE.A16(uZb.requireContext(), 2131970830));
        A0f.A03(this.A00);
        A0f.A0B = true;
        A0f.A02();
        DbU.A1T(A0f);
        1Av r3 = this.A02;
        AnonymousClass7TF.A1J(r3, r3.A40, 1Av.A8a, 113, true);
    }
}
