package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.bridge.ReadableMap;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.TKb  reason: case insensitive filesystem */
public final class C13071TKb implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ReadableMap A02;
    public final /* synthetic */ IgReactNavigatorModule A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C13071TKb(ReadableMap readableMap, IgReactNavigatorModule igReactNavigatorModule, String str, String str2, double d, int i) {
        this.A03 = igReactNavigatorModule;
        this.A00 = d;
        this.A05 = str;
        this.A04 = str2;
        this.A02 = readableMap;
        this.A01 = i;
    }

    public final void run() {
        boolean z;
        FragmentActivity A012 = SQI.A01(this.A03);
        if (A012 != null && SQI.A03(A012, (int) this.A00) && (A012 instanceof C249453jo)) {
            2dZ A032 = 2dZ.A0t.A03(A012);
            C11495SbI sbI = new C11495SbI(this, 20);
            A032.Eiy(this.A05, sbI);
            String str = this.A04;
            if (str != null) {
                z = true;
                if (str.equals("loading")) {
                    A032.setIsLoading(true);
                    return;
                } else if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
                    A032.Ett((View.OnClickListener) null, false);
                    return;
                } else {
                    ReadableMap readableMap = this.A02;
                    if (readableMap.hasKey("enabled")) {
                        z = readableMap.getBoolean("enabled");
                    }
                    int i = this.A01;
                    int A0B = 2Yu.A0B(A012);
                    int contentDescriptionForIconType = IgReactNavigatorModule.contentDescriptionForIconType(str);
                    ActionButton view = A032.A0T.getView();
                    view.setVisibility(0);
                    view.setButtonResource(i);
                    AnonymousClass0fU.A00(sbI, view);
                    view.setBackgroundResource(2Yu.A0H(2dZ.A00(A032), R.attr.actionBarBackground));
                    view.setColorFilter(AnonymousClass37O.A00(2dZ.A00(A032).getColor(A0B)));
                    DbT.A1A(A032.A0O.getResources(), view, contentDescriptionForIconType);
                    A032.setIsLoading(false);
                }
            } else {
                ReadableMap readableMap2 = this.A02;
                if (readableMap2.hasKey("enabled")) {
                    z = readableMap2.getBoolean("enabled");
                } else {
                    return;
                }
            }
            A032.ARJ(z);
        }
    }
}
