package X;

import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.FvU  reason: case insensitive filesystem */
public final class C51522FvU implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ E71 A03;

    public C51522FvU(TextView textView, FragmentActivity fragmentActivity, E71 e71, int i) {
        this.A02 = fragmentActivity;
        this.A00 = i;
        this.A01 = textView;
        this.A03 = e71;
    }

    public final void run() {
        FragmentActivity fragmentActivity = this.A02;
        AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(fragmentActivity, AnonymousClass7TF.A0d(fragmentActivity.getResources(), 2131961432));
        A0f.A04(this.A01, 0, -this.A00, true);
        A0f.A02();
        A0f.A0B = false;
        A0f.A0A = true;
        E71 e71 = this.A03;
        C47898ELs.A00(A0f, e71, 12).A07(e71.getSession());
    }
}
