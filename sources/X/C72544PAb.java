package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.PAb  reason: case insensitive filesystem */
public final class C72544PAb implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final AnonymousClass7DZ A01;

    public C72544PAb(AnonymousClass0iw r11, AnonymousClass7XR r12, AnonymousClass9HC r13) {
        this.A00 = r11;
        boolean z = r13.A1X;
        AnonymousClass74P r3 = new AnonymousClass74P((C332847Wp) r12, 0, 0, false);
        C3265977k r4 = new C3265977k(r12, z);
        AnonymousClass7DV r5 = new AnonymousClass7DV((AnonymousClass7XX) r12, z);
        AnonymousClass7DX r2 = new AnonymousClass7DX((AnonymousClass7XN) r12);
        this.A01 = new AnonymousClass7DZ(AnonymousClass7TE.A1I(new C3266077l(r2, r3, r4, r5, (C333107Xr) r12, r13, (C3266177m) null, true)));
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        C68073Mze mze = new C68073Mze(DbU.A09(layoutInflater, viewGroup, R.layout.direct_magic_media_remix_content, false));
        mze.A01.post(new C73220PYy(this, mze));
        return mze;
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        0qQ.A0B(r2, 0);
        this.A01.A01(r2);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r6, AnonymousClass7FW r7) {
        C68073Mze mze = (C68073Mze) r6;
        C328667Fr r72 = (C328667Fr) r7;
        AnonymousClass7TG.A1N(mze, r72);
        AnonymousClass777 r4 = r72.A0F;
        if (r4 instanceof AnonymousClass776) {
            IgProgressImageView igProgressImageView = mze.A02;
            AnonymousClass776 r42 = (AnonymousClass776) r4;
            igProgressImageView.getIgImageView().setUrl(r42.A00, this.A00);
            Float f = r42.A02;
            if (f != null) {
                float floatValue = f.floatValue();
                mze.A03.A00 = floatValue;
                igProgressImageView.setAspectRatio(floatValue);
            }
        }
        this.A01.A02(mze, r72);
    }
}
