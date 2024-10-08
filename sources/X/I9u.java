package X;

import android.view.View;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import java.util.concurrent.CancellationException;

public final class I9u implements View.OnAttachStateChangeListener {
    public final int A00;
    public final Object A01;

    public I9u(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onViewAttachedToWindow(View view) {
        switch (this.A00) {
            case 3:
                C66819MdB mdB = ((DirectVisualMessageViewerController) this.A01).A0D;
                if (mdB != null) {
                    mdB.Dyu();
                    return;
                }
                return;
            case 4:
                AnonymousClass5F9.A00().A01((AnonymousClass3W1) this.A01, 3000);
                return;
            case 5:
                C65533Luw luw = (C65533Luw) this.A01;
                AnonymousClass3Q2 r0 = luw.A02;
                if (r0 != null) {
                    r0.A0Y(luw);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.A00) {
            case 0:
                GWO gwo = (GWO) this.A01;
                if (!C275604qc.A02(gwo)) {
                    gwo.A05();
                    return;
                }
                return;
            case 1:
                0qQ.A0B(view, 0);
                view.removeOnAttachStateChangeListener(this);
                ((C262204Co) this.A01).AG7((CancellationException) null);
                return;
            case 2:
                C66819MdB mdB = ((OIL) this.A01).A00;
                if (mdB != null) {
                    mdB.Dds();
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                AnonymousClass5FA A002 = AnonymousClass5F9.A00();
                AnonymousClass3W1 r1 = (AnonymousClass3W1) this.A01;
                A002.A00(r1);
                r1.A0m(false, false);
                return;
            default:
                C65533Luw luw = (C65533Luw) this.A01;
                AnonymousClass3Q2 r0 = luw.A02;
                if (r0 != null) {
                    r0.A0Z(luw);
                    return;
                }
                return;
        }
    }
}
