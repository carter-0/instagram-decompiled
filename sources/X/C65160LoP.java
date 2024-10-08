package X;

import android.content.Context;
import android.util.Log;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedMultiListenerTextureView;
import java.util.List;
import java.util.Map;

/* renamed from: X.LoP  reason: case insensitive filesystem */
public final class C65160LoP implements MV7 {
    public final Context A00;
    public final UserSession A01;
    public final C273534mk A02;
    public final ConstrainedMultiListenerTextureView A03;
    public final AnonymousClass3Q2 A04;

    public final void Ddn() {
    }

    public final void Dgg(Map map) {
    }

    public final void Ddi() {
        this.A02.AGc();
        String stackTraceString = Log.getStackTraceString(new Throwable());
        0qQ.A0B(stackTraceString, 1);
        0kD.A0C("VideoCoverFrameRenderCompleteListener", stackTraceString, (Throwable) null);
    }

    public final void Ddl(List list) {
        ((C267834cI) 0mE.A01(this.A00, C267834cI.class)).EBv(new C65886M3b(this));
    }

    public C65160LoP(Context context, UserSession userSession, C273534mk r3, ConstrainedMultiListenerTextureView constrainedMultiListenerTextureView, AnonymousClass3Q2 r5) {
        this.A00 = context;
        this.A04 = r5;
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = constrainedMultiListenerTextureView;
    }
}
