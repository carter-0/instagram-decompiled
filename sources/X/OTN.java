package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;

public final class OTN {
    public final Context A00;
    public final 16V A01;
    public final C70331O2j A02;

    public static final C70966OTn A00(DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions, NMJ nmj, OTN otn, String str, int i, boolean z) {
        String str2;
        C70966OTn oTn = new C70966OTn((View.OnClickListener) new C71330Oib(str, nmj, 4), i);
        oTn.A05 = !z;
        if (directMessageInteropReachabilityOptions != null) {
            str2 = otn.A00.getString(directMessageInteropReachabilityOptions.A00);
        } else {
            str2 = "";
        }
        oTn.A03 = str2;
        oTn.A00 = TypedValue.applyDimension(1, 5.0f, AnonymousClass7TF.A0E(otn.A00));
        return oTn;
    }

    public OTN(Context context, C70331O2j o2j, 16V r3) {
        this.A00 = context;
        this.A01 = r3;
        this.A02 = o2j;
    }
}
