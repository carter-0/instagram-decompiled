package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;

/* renamed from: X.7D8  reason: invalid class name */
public final class AnonymousClass7D8 implements AnonymousClass7D2 {
    public final C332807Wl A00;
    public final AnonymousClass0iw A01;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        return new AnonymousClass7EG(new C71662eb((ViewStub) layoutInflater.inflate(R.layout.message_comments_pill_stub, viewGroup, false)), this.A00);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r2, AnonymousClass7FW r3) {
        AnonymousClass7EG r22 = (AnonymousClass7EG) r2;
        AnonymousClass7AA r32 = (AnonymousClass7AA) r3;
        0qQ.A0B(r22, 0);
        0qQ.A0B(r32, 1);
        r22.A00(r32);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        AnonymousClass7EG r22 = (AnonymousClass7EG) r2;
        if (r22 != null) {
            r22.A06.A02();
            r22.A05 = null;
        }
    }

    public AnonymousClass7D8(AnonymousClass0iw r1, C332807Wl r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
