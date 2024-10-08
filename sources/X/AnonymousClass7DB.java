package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;

/* renamed from: X.7DB  reason: invalid class name */
public final class AnonymousClass7DB implements AnonymousClass7D2 {
    public final AnonymousClass7XC A00;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewStub viewStub;
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.forwarding_shortcut_stub, viewGroup, false);
        if (inflate instanceof ViewStub) {
            viewStub = (ViewStub) inflate;
        } else {
            viewStub = null;
        }
        return new AnonymousClass7EK(new C71662eb(viewStub), this.A00);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r2, AnonymousClass7FW r3) {
        AnonymousClass7EK r22 = (AnonymousClass7EK) r2;
        C3265777i r32 = (C3265777i) r3;
        0qQ.A0B(r22, 0);
        if (r32 != null) {
            r22.A00(r32);
        }
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        AnonymousClass7EK r22 = (AnonymousClass7EK) r2;
        0qQ.A0B(r22, 0);
        r22.A00.A02();
    }

    public AnonymousClass7DB(AnonymousClass7XC r1) {
        this.A00 = r1;
    }
}
