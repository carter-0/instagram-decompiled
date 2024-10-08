package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;

/* renamed from: X.FZe  reason: case insensitive filesystem */
public final class C50347FZe implements AnonymousClass36P {
    public final /* synthetic */ C50349FZg A00;
    public final /* synthetic */ C47490E4u A01;

    public final void CJ6(Intent intent) {
        0qQ.A0B(intent, 0);
        String action = intent.getAction();
        if (action != null) {
            Uri A09 = DbT.A09(action);
            if (A09.getScheme() == null) {
                A09 = DbT.A09(002.A0R("file://", action));
            }
            new C46669Diy(A09, this.A00, 1).execute(new Void[0]);
        }
    }

    public final /* synthetic */ void Ctk(int i, int i2) {
    }

    public final /* synthetic */ void Ctl(int i, int i2) {
    }

    public final void ExB(Intent intent, int i) {
        0qQ.A0B(intent, 0);
        C47490E4u e4u = this.A01;
        Context context = e4u.getContext();
        if (context != null && C250563lf.A0o(context, intent)) {
            0kR.A05(e4u, intent, i);
        }
    }

    public C50347FZe(C50349FZg fZg, C47490E4u e4u) {
        this.A01 = e4u;
        this.A00 = fZg;
    }

    public final void Ewk(File file, int i) {
        C50349FZg fZg = this.A00;
        Context requireContext = this.A01.requireContext();
        C47490E4u e4u = fZg.A02;
        if (e4u != null) {
            File A04 = 0mb.A04(requireContext);
            fZg.A03 = A04;
            FFa.A03(e4u, A04, 2);
        }
    }
}
