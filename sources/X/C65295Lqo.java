package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.channels.model.AddChannelsRowChannelInfo;

/* renamed from: X.Lqo  reason: case insensitive filesystem */
public final class C65295Lqo implements C74461PvG {
    public final /* synthetic */ KRP A00;

    public final void D6l() {
    }

    public final void DH9(int i) {
    }

    public final void DrG(ImageUrl imageUrl, String str, String str2, int i, int i2, int i3) {
        AnonymousClass7TF.A1H(str, str2);
        KRP krp = this.A00;
        if (0qQ.A0K(krp.A04, str)) {
            krp.A04 = null;
            ((C60304Jj3) krp.A02.getValue()).A00 = null;
        } else {
            krp.A04 = str;
            ((C60304Jj3) krp.A02.getValue()).A00 = new AddChannelsRowChannelInfo(str, str2, i);
        }
        ViewModelListUpdate A002 = krp.A00();
        AnonymousClass2t9 r0 = krp.A02;
        if (r0 != null) {
            r0.A05(A002);
        }
        AnonymousClass2t9 r1 = krp.A02;
        if (r1 != null) {
            r1.notifyItemRangeChanged(0, A002.A00.size());
        }
    }

    public C65295Lqo(KRP krp) {
        this.A00 = krp;
    }
}
