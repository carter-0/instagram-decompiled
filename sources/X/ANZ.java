package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;

public final class ANZ implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass7EL A00;
    public final /* synthetic */ AnonymousClass7AD A01;

    public ANZ(AnonymousClass7EL r1, AnonymousClass7AD r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        RectF rectF;
        int A05 = AnonymousClass0fD.A05(-1800274771);
        AnonymousClass7EL r1 = this.A00;
        C333107Xr r3 = r1.A02;
        if (!r3.CPk()) {
            C333077Xo r32 = (C333077Xo) r3;
            AnonymousClass7AD r0 = this.A01;
            String str = r0.A04;
            28D A012 = AnonymousClass3QU.A01(r0.A03);
            View view2 = r1.A01.getView();
            Rect A0W = AnonymousClass7TE.A0W();
            if (!view2.getGlobalVisibleRect(A0W)) {
                rectF = null;
            } else {
                rectF = new RectF(A0W);
            }
            r32.De1(rectF, A012, (CameraConfiguration) null, str, (String) null);
        }
        AnonymousClass0fD.A0C(-1887717681, A05);
    }
}
