package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.7UZ  reason: invalid class name */
public final class AnonymousClass7UZ implements AnonymousClass36P {
    public AnonymousClass36V A00;
    public final Fragment A01;
    public final UserSession A02;
    public final C62320sa A03;

    public AnonymousClass7UZ(Fragment fragment, UserSession userSession, C62320sa r4) {
        0qQ.A0B(fragment, 1);
        0qQ.A0B(r4, 3);
        this.A01 = fragment;
        this.A02 = userSession;
        this.A03 = r4;
    }

    public final void CJ6(Intent intent) {
        0qQ.A0B(intent, 0);
        ((AnonymousClass7XZ) this.A03.invoke()).FMT(intent);
    }

    public final void Ctk(int i, int i2) {
    }

    public final void Ctl(int i, int i2) {
    }

    public final void Ewk(File file, int i) {
        0qQ.A0B(file, 0);
        FFa.A03(this.A01, file, i);
    }

    public final void ExB(Intent intent, int i) {
        0qQ.A0B(intent, 0);
        0kR.A05(this.A01, intent, i);
    }
}
