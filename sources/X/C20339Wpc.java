package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.react.modules.product.IgReactBoostPostModule;

/* renamed from: X.Wpc  reason: case insensitive filesystem */
public final class C20339Wpc implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ IgReactBoostPostModule A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C20339Wpc(FragmentActivity fragmentActivity, IgReactBoostPostModule igReactBoostPostModule, String str, String str2, String str3) {
        this.A01 = igReactBoostPostModule;
        this.A00 = fragmentActivity;
        this.A04 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final void run() {
        C309516Yo r4 = new C309516Yo(this.A00, this.A01.mUserSession);
        r4.A0E(C55280Hf9.A00((AudioOverlayTrack) null, this.A04, this.A02, this.A03, (String) null));
        r4.A04();
    }
}
