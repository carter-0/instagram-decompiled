package X;

import android.app.Activity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.react.modules.product.IgReactBloksNavigationModule;
import java.util.HashMap;

public final class TKR implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ IgReactBloksNavigationModule A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ HashMap A04;

    public TKR(Activity activity, IgReactBloksNavigationModule igReactBloksNavigationModule, String str, String str2, HashMap hashMap) {
        this.A01 = igReactBloksNavigationModule;
        this.A02 = str;
        this.A04 = hashMap;
        this.A00 = activity;
        this.A03 = str2;
    }

    public final void run() {
        C46649DiU A042 = C46649DiU.A04(this.A02, this.A04);
        Activity activity = this.A00;
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(this.A01.mSession);
        igBloksScreenConfig.A0U = this.A03;
        igBloksScreenConfig.A0P = AnonymousClass05K.A01;
        A042.A0D(activity, igBloksScreenConfig);
    }
}
