package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;

public final class PAZ implements AnonymousClass7D2 {
    public final P15 A00;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewStub viewStub;
        0qQ.A0B(viewGroup, 0);
        View findViewById = viewGroup.findViewById(R.id.direct_card_add_reaction_pill_stub);
        if (findViewById instanceof ViewStub) {
            viewStub = (ViewStub) findViewById;
        } else {
            viewStub = null;
        }
        return new PBO(new C71662eb(viewStub), this.A00);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r1, AnonymousClass7FW r2) {
        PBO pbo = (PBO) r1;
        C72581PBm pBm = (C72581PBm) r2;
        AnonymousClass7TG.A1N(pbo, pBm);
        pbo.A01(pBm);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        PBO pbo = (PBO) r2;
        0qQ.A0B(pbo, 0);
        pbo.A00();
    }

    public PAZ(P15 p15) {
        this.A00 = p15;
    }
}
