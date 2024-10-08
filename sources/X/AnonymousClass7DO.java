package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.7DO  reason: invalid class name */
public final class AnonymousClass7DO implements AnonymousClass7D2 {
    public final C333027Xj A00;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.edit_response_shortcut_stub, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        return new AnonymousClass7EY(2b1.A01(inflate, false, false), this.A00);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r2, AnonymousClass7FW r3) {
        AnonymousClass7EY r22 = (AnonymousClass7EY) r2;
        N8I n8i = (N8I) r3;
        0qQ.A0B(r22, 0);
        if (n8i != null) {
            r22.A00(n8i);
        }
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r3) {
        AnonymousClass7EY r32 = (AnonymousClass7EY) r3;
        0qQ.A0B(r32, 0);
        C252063oV r1 = r32.A00;
        r1.setVisibility(8);
        if (r1.CVM()) {
            r1.getView().setOnClickListener((View.OnClickListener) null);
        }
    }

    public AnonymousClass7DO(C333027Xj r1) {
        this.A00 = r1;
    }
}
