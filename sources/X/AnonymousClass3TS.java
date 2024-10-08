package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.3TS  reason: invalid class name */
public final class AnonymousClass3TS {
    public final C71662eb A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new AnonymousClass9LM(this, 13));

    public final FrameLayout A00() {
        View A012 = this.A00.A01();
        0qQ.A0C(A012, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) A012;
    }

    public final SlideInAndOutIconView A01() {
        Object value = this.A01.getValue();
        0qQ.A07(value);
        return (SlideInAndOutIconView) value;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2eb, java.lang.Object] */
    public AnonymousClass3TS(View view) {
        ? obj = new Object();
        obj.A00 = view;
        this.A00 = obj;
    }

    public AnonymousClass3TS(ViewStub viewStub) {
        this.A00 = new C71662eb(viewStub);
    }
}
