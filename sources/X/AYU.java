package X;

import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;
import java.util.LinkedHashMap;

public final class AYU implements C3495480u {
    public final /* synthetic */ C358088aL A00;
    public final /* synthetic */ AnonymousClass8EP A01;
    public final /* synthetic */ LinkedHashMap A02;

    public AYU(C358088aL r1, AnonymousClass8EP r2, LinkedHashMap linkedHashMap) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = linkedHashMap;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        CameraToolMenuItem cameraToolMenuItem;
        C39637A3b a3b = (C39637A3b) obj;
        0qQ.A0B(a3b, 0);
        float f = (float) a3b.A00;
        float f2 = (f - (f % 10.0f)) / 100.0f;
        AnonymousClass8EP r4 = this.A01;
        C358088aL r3 = this.A00;
        boolean z = true;
        if (!C352618Eb.A06(r3) || f2 == (255.0f - (255.0f % 10.0f)) / 100.0f) {
            z = false;
        }
        LinkedHashMap linkedHashMap = this.A02;
        if (linkedHashMap.containsKey(r3) && (cameraToolMenuItem = (CameraToolMenuItem) linkedHashMap.get(r3)) != null) {
            cameraToolMenuItem.setSelected(z);
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append(f2);
            cameraToolMenuItem.setDrawableWithLabel(AnonymousClass7TF.A0l(AnonymousClass7TE.A0S(r4.A05).getString(2131963552), A1A));
            cameraToolMenuItem.postInvalidate();
        }
    }
}
