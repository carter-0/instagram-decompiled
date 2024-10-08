package X;

import android.app.ActivityManager;
import android.graphics.Rect;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.9l4  reason: invalid class name and case insensitive filesystem */
public final class C386729l4 extends 0ng {
    public final /* synthetic */ C59761JWz A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386729l4(C59761JWz jWz, String str) {
        super(495, 3, false, false);
        this.A00 = jWz;
        this.A01 = str;
    }

    public final void run() {
        FragmentActivity fragmentActivity;
        ActivityManager activityManager;
        C59761JWz jWz = this.A00;
        JX0 jx0 = jWz.A03;
        if (jx0 != null) {
            fragmentActivity = jx0.A03;
        } else {
            fragmentActivity = null;
        }
        if (fragmentActivity != null) {
            UserSession userSession = jWz.A0B;
            C59953JcJ.A00(userSession).A01(fragmentActivity, jWz.A00, (byte[]) null);
            try {
                C365128mZ.A02(fragmentActivity, userSession);
            } catch (C345117sx e) {
                0kD.A0I("crop_image_controller", e, 0Yt.A0E());
            }
        }
        try {
            C365098mW.A00.A00((Rect) null, jWz.A0B, (C364968mJ) null, this.A01);
        } catch (IOException unused) {
        } catch (NullPointerException e2) {
            0f9 AEf = 0wj.A01.AEf("CropImageController", 817893068);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            Object systemService = jWz.A09.getSystemService("activity");
            if ((systemService instanceof ActivityManager) && (activityManager = (ActivityManager) systemService) != null) {
                activityManager.getMemoryInfo(memoryInfo);
            }
            AEf.ABP("availableMemory", memoryInfo.availMem);
            AEf.ERJ(e2);
            AEf.report();
            throw e2;
        }
    }
}
