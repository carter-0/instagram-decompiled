package X;

import android.graphics.Rect;
import android.view.View;

public final class IFT implements C301475zK {
    public final /* synthetic */ C267804cE A00;

    public IFT(C267804cE r1) {
        this.A00 = r1;
    }

    public final Object AE4(C268064ch r7, AnonymousClass4D7 r8, C62320sa r9) {
        View A002 = HRY.A00(this.A00);
        long CgY = r7.CgY(0);
        AnonymousClass5VN r0 = (AnonymousClass5VN) r9.invoke();
        if (r0 != null) {
            AnonymousClass5VN A03 = r0.A03(CgY);
            A002.requestRectangleOnScreen(new Rect((int) A03.A01, (int) A03.A03, (int) A03.A02, (int) A03.A00), false);
        }
        return C60340gF.A00;
    }
}
