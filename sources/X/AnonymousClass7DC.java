package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.7DC  reason: invalid class name */
public final class AnonymousClass7DC implements AnonymousClass7D2 {
    public final C333107Xr A00;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.camera_reply_shortcut_stub, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        return new AnonymousClass7EL(2b1.A01(inflate, false, false), this.A00);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r2, AnonymousClass7FW r3) {
        AnonymousClass7EL r22 = (AnonymousClass7EL) r2;
        AnonymousClass7AD r32 = (AnonymousClass7AD) r3;
        0qQ.A0B(r22, 0);
        if (r32 != null) {
            r22.A02(r32);
        }
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r1) {
        AnonymousClass7EL r12 = (AnonymousClass7EL) r1;
        if (r12 != null) {
            r12.A00();
        }
    }

    public AnonymousClass7DC(C333107Xr r1) {
        this.A00 = r1;
    }
}
