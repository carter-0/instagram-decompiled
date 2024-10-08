package X;

import android.view.MotionEvent;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.88L  reason: invalid class name */
public final class AnonymousClass88L extends C283285Gy {
    public final /* synthetic */ AnonymousClass88K A00;

    public final boolean onDown(MotionEvent motionEvent) {
        float f;
        float f2;
        0qQ.A0B(motionEvent, 0);
        AnonymousClass88K r7 = this.A00;
        r7.A05 = true;
        float x = motionEvent.getX();
        ImageView imageView = r7.A04;
        if (imageView != null) {
            float x2 = imageView.getX();
            AnonymousClass88M r2 = r7.A08;
            f = x2 + ((float) ((r2.A05 / 2) + r2.A04 + r2.A02));
        } else {
            f = 0.0f;
        }
        float f3 = x - f;
        float y = motionEvent.getY();
        ImageView imageView2 = r7.A04;
        if (imageView2 != null) {
            float y2 = imageView2.getY();
            AnonymousClass88M r22 = r7.A08;
            f2 = y2 + (((float) r22.A03) - r22.A01);
        } else {
            f2 = 0.0f;
        }
        r7.A00 = 0.0f;
        r7.A01 = 0.0f;
        AnonymousClass88K.A02(r7, f3);
        AnonymousClass88K.A03(r7, y - f2);
        AnonymousClass88K.A01(r7);
        List<AnonymousClass8LV> list = r7.A09;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (AnonymousClass8LV DDu : list) {
            DDu.DDu();
            arrayList.add(C60340gF.A00);
        }
        return true;
    }

    public AnonymousClass88L(AnonymousClass88K r1) {
        this.A00 = r1;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AnonymousClass88K r2 = this.A00;
        if (r2.A05) {
            r2.A05 = false;
            return true;
        }
        AnonymousClass88K.A02(r2, r2.A00 - f);
        AnonymousClass88K.A03(r2, r2.A01 - f2);
        AnonymousClass88K.A01(r2);
        return true;
    }
}
