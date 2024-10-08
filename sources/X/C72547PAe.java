package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;

/* renamed from: X.PAe  reason: case insensitive filesystem */
public final class C72547PAe implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final AnonymousClass7H7 A01;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C68957Nbg(new C71662eb((ViewStub) layoutInflater.inflate(R.layout.direct_card_reactions_pill_stub, viewGroup, false)), this.A01);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r2, AnonymousClass7FW r3) {
        AnonymousClass7EB r22 = (AnonymousClass7EB) r2;
        AnonymousClass79H r32 = (AnonymousClass79H) r3;
        AnonymousClass7TG.A1N(r22, r32);
        r22.A03(this.A00, r32);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        AnonymousClass7EB r22 = (AnonymousClass7EB) r2;
        0qQ.A0B(r22, 0);
        r22.A02();
    }

    public C72547PAe(AnonymousClass0iw r1, AnonymousClass7H7 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
