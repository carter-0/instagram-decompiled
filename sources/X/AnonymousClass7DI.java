package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;

/* renamed from: X.7DI  reason: invalid class name */
public final class AnonymousClass7DI implements AnonymousClass7D2 {
    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.debug_indicator_stub, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        ViewStub viewStub = (ViewStub) inflate;
        if (viewStub == null) {
            viewStub = null;
        }
        return new AnonymousClass7ER(new C71662eb(viewStub));
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r2, AnonymousClass7FW r3) {
        AnonymousClass7ER r22 = (AnonymousClass7ER) r2;
        AnonymousClass7AB r32 = (AnonymousClass7AB) r3;
        0qQ.A0B(r22, 0);
        if (r32 != null) {
            r22.A00(r32);
        }
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        AnonymousClass7ER r22 = (AnonymousClass7ER) r2;
        if (r22 != null) {
            r22.A00.A02();
        }
    }
}
