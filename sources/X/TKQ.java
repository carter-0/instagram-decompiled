package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

public final class TKQ implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ ReadableMap A02;
    public final /* synthetic */ C13759TgV A03;
    public final /* synthetic */ IgReactNavigatorModule A04;

    public TKQ(FragmentActivity fragmentActivity, ReadableMap readableMap, C13759TgV tgV, IgReactNavigatorModule igReactNavigatorModule, double d) {
        this.A04 = igReactNavigatorModule;
        this.A01 = fragmentActivity;
        this.A02 = readableMap;
        this.A00 = d;
        this.A03 = tgV;
    }

    public final void run() {
        String str;
        FragmentActivity fragmentActivity = this.A01;
        AnonymousClass37D A0i = DbT.A0i(fragmentActivity);
        if (A0i == null || !((AnonymousClass37F) A0i).A0g) {
            C309516Yo F08 = this.A03.F08(fragmentActivity);
            F08.A0A = Integer.toString((int) this.A00);
            F08.A04();
            return;
        }
        C331157Pu r4 = A0i.A09().A02;
        C331127Pr r3 = new C331127Pr(this.A04.mSession);
        ReadableMap readableMap = this.A02;
        if (readableMap == null || !readableMap.hasKey(DialogModule.KEY_TITLE)) {
            str = null;
        } else {
            str = readableMap.getString(DialogModule.KEY_TITLE);
        }
        r3.A0d = str;
        r3.A03 = 0.66f;
        r3.A0a = AnonymousClass7TE.A0v();
        r3.A0f = Integer.toString((int) this.A00);
        1WM.getInstance().getFragmentFactory();
        Bundle AEV = this.A03.AEV();
        R8S r8s = new R8S();
        r8s.setArguments(AEV);
        r4.A0E(r8s, r3);
    }
}
