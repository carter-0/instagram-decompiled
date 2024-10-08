package X;

import android.content.Intent;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import java.util.ArrayList;

/* renamed from: X.AaU  reason: case insensitive filesystem */
public final class C40335AaU implements MTT {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass8X3 A01;
    public final /* synthetic */ ArrayList A02;

    public final void onBottomSheetPositionChanged(int i, int i2) {
        C378369Pn r1;
        float f = (float) i;
        float f2 = (float) this.A00;
        float min = Math.min(1.0f, Math.max(f / f2, 0.0f));
        if (f == 0.0f && (r1 = this.A01.A0G.A0B) != null) {
            r1.A09(false);
        }
        AnonymousClass8X3 r2 = this.A01;
        if (!r2.A0I.CTv()) {
            min = Math.min(1.0f, Math.max((f - ((1.0f - min) * ((float) r2.A00))) / f2, 0.0f));
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = r2.A07;
        touchInterceptorFrameLayout.setScaleX(min);
        touchInterceptorFrameLayout.setScaleY(min);
    }

    public C40335AaU(AnonymousClass8X3 r1, ArrayList arrayList, int i) {
        this.A01 = r1;
        this.A02 = arrayList;
        this.A00 = i;
    }

    public final void DkH(Intent intent, boolean z) {
        C351948Bb r0;
        AnonymousClass8X3 r3 = this.A01;
        boolean z2 = r3.A08.A08.A00 instanceof AnonymousClass80M;
        if (z && !z2) {
            AnonymousClass8X3.A02(intent, (ShareMediaLoggingInfo) AnonymousClass7TE.A12(this.A02), r3);
        }
        if (!(r3.A0L.A18 == null || (r0 = r3.A0E.A1k) == null)) {
            r0.Ejs(true);
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = r3.A07;
        touchInterceptorFrameLayout.setScaleX(1.0f);
        touchInterceptorFrameLayout.setScaleY(1.0f);
        ((AnonymousClass80T) r3.A0Y).A01.A04(new C356458Ty(intent, z));
        C356798Vg.A00(r3.A0P);
        r3.A0E.D19(true);
        Integer num = r3.A0K.A02.A01.A0B;
        0qQ.A07(num);
        if (num == AnonymousClass05K.A0C) {
            r3.A0B.A0c.A0C(true, false);
        }
    }
}
