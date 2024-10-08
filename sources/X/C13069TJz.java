package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.android.R;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.TJz  reason: case insensitive filesystem */
public final class C13069TJz implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ IgReactNavigatorModule A02;
    public final /* synthetic */ String A03;

    public C13069TJz(IgReactNavigatorModule igReactNavigatorModule, String str, double d, int i) {
        this.A02 = igReactNavigatorModule;
        this.A00 = d;
        this.A03 = str;
        this.A01 = i;
    }

    public final void run() {
        FragmentActivity A012 = SQI.A01(this.A02);
        if (A012 != null && SQI.A03(A012, (int) this.A00) && (A012 instanceof C249453jo)) {
            2dZ A032 = 2dZ.A0t.A03(A012);
            String str = this.A03;
            if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
                A032.Eu4(false);
                return;
            }
            AnonymousClass3JR r2 = new AnonymousClass3JR();
            r2.A01(this.A01);
            r2.A05 = IgReactNavigatorModule.contentDescriptionForIconType(str);
            r2.A0G = new C11495SbI(this, 19);
            A032.ErG(new AnonymousClass3Jb(r2));
            A032.A0U(R.attr.glyphColorPrimary);
        }
    }
}
