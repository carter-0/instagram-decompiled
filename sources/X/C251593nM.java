package X;

import android.content.Context;
import com.facebook.flexiblesampling.SamplingPolicyConfig;

/* renamed from: X.3nM  reason: invalid class name and case insensitive filesystem */
public final class C251593nM {
    public final C251613nO A00;
    public final C251603nN A01;
    public final AnonymousClass0K0 A02;

    public C251593nM(Context context, AnonymousClass0K0 r3, SamplingPolicyConfig samplingPolicyConfig, String str) {
        C251613nO r0;
        this.A02 = r3;
        this.A01 = new C251603nN(context, str);
        if (samplingPolicyConfig != null) {
            r0 = new C251613nO(samplingPolicyConfig);
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }
}
