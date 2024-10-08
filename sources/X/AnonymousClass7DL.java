package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;

/* renamed from: X.7DL  reason: invalid class name */
public final class AnonymousClass7DL implements AnonymousClass7D2 {
    public final C333137Xu A00;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.receiver_fetch_debug_stub, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        return new AnonymousClass7EV(new C71662eb((ViewStub) inflate), this.A00);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r2, AnonymousClass7FW r3) {
        AnonymousClass7EV r22 = (AnonymousClass7EV) r2;
        AnonymousClass7AF r32 = (AnonymousClass7AF) r3;
        0qQ.A0B(r22, 0);
        if (r32 != null) {
            r22.A01(r32);
        }
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        AnonymousClass7EV r22 = (AnonymousClass7EV) r2;
        if (r22 != null) {
            r22.A00.A02();
        }
    }

    public AnonymousClass7DL(C333137Xu r1) {
        this.A00 = r1;
    }
}
