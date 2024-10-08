package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.faceeffectui.NestableSnapPickerRecyclerView;
import java.util.concurrent.Callable;

/* renamed from: X.AsZ  reason: case insensitive filesystem */
public final class C41352AsZ implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C387649mY A02;

    public C41352AsZ(UserSession userSession, C387649mY r2, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C387649mY r3 = this.A02;
        AnonymousClass8AL r1 = r3.A01;
        r1.A08(this.A00);
        UserSession userSession = this.A01;
        NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView = r1.A0P;
        0qQ.A07(nestableSnapPickerRecyclerView);
        nestableSnapPickerRecyclerView.post(new C41176Apa(nestableSnapPickerRecyclerView, userSession, r3));
        return AnonymousClass7TE.A0v();
    }
}
