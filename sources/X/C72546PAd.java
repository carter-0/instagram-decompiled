package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.PAd  reason: case insensitive filesystem */
public final class C72546PAd implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final AnonymousClass7DZ A01;

    public C72546PAd(AnonymousClass0iw r10, UserSession userSession, AnonymousClass7XR r12, AnonymousClass9HC r13) {
        0qQ.A0B(r10, 3);
        this.A00 = r10;
        this.A01 = new AnonymousClass7DZ(AnonymousClass7TE.A1I(new C3266077l((AnonymousClass7DX) null, new P8H(r10, userSession, (AnonymousClass7X4) r12), new P8S(r10, userSession, r12), new AnonymousClass7DV((AnonymousClass7XX) r12, r13.A1X), (C333107Xr) r12, r13, (C3266177m) null, false)));
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        PBS pbs = new PBS(DbU.A0A(layoutInflater, viewGroup, R.layout.direct_selfie_reply_message, false));
        this.A01.A00(pbs);
        return pbs;
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        0qQ.A0B(r2, 0);
        this.A01.A01(r2);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r8, AnonymousClass7FW r9) {
        PBS pbs = (PBS) r8;
        NYS nys = (NYS) r9;
        boolean A1U = AnonymousClass7TF.A1U(0, pbs, nys);
        1a8 r4 = pbs.A02;
        r4.A01();
        AnonymousClass77B r0 = nys.A00;
        1aU r2 = null;
        if (r0 != null) {
            r2 = r0.A09;
        }
        boolean z = nys.A01;
        if (r0 != null) {
            String str = r0.A0a;
            if (r0.A0s == A1U && str != null) {
                SimpleImageUrl A0G = JTQ.A0G(str);
                IgProgressImageView igProgressImageView = pbs.A03;
                igProgressImageView.setUrl(A0G, this.A00);
                pbs.A01.setVisibility(0);
                igProgressImageView.setVisibility(0);
                float f = 1.0f;
                if (z) {
                    f = 0.5f;
                }
                igProgressImageView.setAlpha(f);
                this.A01.A02(pbs, nys);
            }
        }
        if (r2 != null) {
            r4.A02(C66789Mca.A00(r2, C74067PoW.A00, 10).A0H(), new PSV(A1U ? 1 : 0, this, pbs, z));
        } else {
            pbs.A01.setVisibility(8);
            pbs.A03.setVisibility(8);
        }
        this.A01.A02(pbs, nys);
    }
}
