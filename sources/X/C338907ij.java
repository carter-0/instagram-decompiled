package X;

import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;
import java.util.LinkedHashMap;

/* renamed from: X.7ij  reason: invalid class name and case insensitive filesystem */
public final class C338907ij implements C3495480u {
    public final /* synthetic */ C358088aL A00;
    public final /* synthetic */ AnonymousClass8EP A01;
    public final /* synthetic */ LinkedHashMap A02;
    public final /* synthetic */ 0rl A03;

    public C338907ij(C358088aL r1, AnonymousClass8EP r2, LinkedHashMap linkedHashMap, 0rl r4) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = linkedHashMap;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        CameraToolMenuItem cameraToolMenuItem;
        long longValue = ((Number) obj).longValue();
        0rl r6 = this.A03;
        if (r6.A00 != longValue) {
            C358088aL r5 = this.A00;
            if (!(C352618Eb.A02(r5) == longValue || !this.A01.A09 || (cameraToolMenuItem = (CameraToolMenuItem) this.A02.get(r5)) == null)) {
                cameraToolMenuItem.setSelected(true);
                cameraToolMenuItem.A06 = null;
                cameraToolMenuItem.A0B = true;
                cameraToolMenuItem.postInvalidate();
                C40797AjT ajT = new C40797AjT(cameraToolMenuItem);
                11Z.A01(ajT);
                11Z.A04(ajT, 1000);
            }
        }
        r6.A00 = longValue;
    }
}
