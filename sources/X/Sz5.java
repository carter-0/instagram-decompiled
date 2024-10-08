package X;

import android.util.Log;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.acp.igacpsecuritykey.IGACPSecurityKeySignInActivity;
import java.util.LinkedHashMap;

public final class Sz5 implements C3736596k {
    public final int A00;
    public final Object A01;

    public Sz5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFailure(Exception exc) {
        String str;
        switch (this.A00) {
            case 0:
                AnonymousClass7TG.A1N(this.A01, exc);
                if ((exc instanceof RKT) || (exc instanceof IllegalStateException)) {
                    Log.e("PlayServicesDevicePerformance", "Error saving mediaPerformanceClass", exc);
                    return;
                }
                return;
            case 1:
                0qQ.A0B(exc, 0);
                IGACPSecurityKeySignInActivity.A01((IGACPSecurityKeySignInActivity) this.A01, (Integer) null, exc.getLocalizedMessage());
                return;
            case 2:
                0qQ.A0B(exc, 0);
                02m A0l = C51965G9l.A0l();
                LinkedHashMap A06 = 0Yt.A06(new 0eP[]{AnonymousClass7TE.A1L("blocks", 0), AnonymousClass7TE.A1L("lines", 0), AnonymousClass7TE.A1L("elements", 0)});
                0qQ.A0B(A06, 2);
                if (exc instanceof C8992RKk) {
                    C67571Mq5.A00(A0l, AnonymousClass7TF.A0w(TraceFieldType.ErrorCode, Integer.valueOf(((C8992RKk) exc).A00)), 391259957);
                }
                C67571Mq5.A00(A0l, A06, 391259957);
                A0l.markerAnnotate(391259957, 0, "error", exc.getMessage());
                A0l.markerEnd(391259957, 0, 3);
                ((0sP) this.A01).invoke((Object) null);
                return;
            default:
                C46663Dir dir = (C46663Dir) this.A01;
                if (exc instanceof RKT) {
                    str = "unsupported";
                } else {
                    str = "unknown";
                }
                C46663Dir.A01(dir, str);
                return;
        }
    }
}
