package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.cameracore.mediapipeline.services.uicontrol.SliderConfiguration;

/* renamed from: X.8yj  reason: invalid class name and case insensitive filesystem */
public final class C371638yj implements C371648yk {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final C312366eJ A01;
    public final C312346eH A02;
    public final C312396eM A03;
    public final C312336eF A04;
    public final String A05;

    public final void onTextEditComplete(String str) {
    }

    public C371638yj(C312366eJ r4, C312346eH r5, C312396eM r6, C312336eF r7, String str) {
        this.A05 = str;
        this.A01 = r4;
        this.A04 = r7;
        this.A02 = r5;
        this.A03 = r6;
        r6.DlR(new SliderConfiguration(0, 0, (float[]) null, (byte[]) null), str);
    }
}
