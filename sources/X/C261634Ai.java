package X;

import android.content.Context;
import com.facebook.odin.model.OdinContext;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: X.4Ai  reason: invalid class name and case insensitive filesystem */
public final class C261634Ai implements Callable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 02m A01;
    public final /* synthetic */ C228352lS A02;
    public final /* synthetic */ AnonymousClass5K5 A03;
    public final /* synthetic */ String A04;

    public C261634Ai(Context context, 02m r2, C228352lS r3, AnonymousClass5K5 r4, String str) {
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = str;
        this.A03 = r4;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        So1 so1;
        02m r9 = this.A01;
        r9.markerPoint(424097382, "future_begin");
        C228352lS r7 = this.A02;
        r9.markerAnnotate(424097382, "threshold", String.valueOf(C228352lS.A00(r7)));
        OdinContext odinContext = new OdinContext(this.A04, (Map) null, (Map) null, 30);
        Object value = r7.A07.getValue();
        0qQ.A07(value);
        if (((Boolean) value).booleanValue()) {
            so1 = new So1(this.A03);
        } else {
            so1 = null;
        }
        UserSession userSession = r7.A01;
        Context context = this.A00;
        AnonymousClass408 r1 = ((C258723zX) userSession.A01(C258723zX.class, new TTP(15, context, userSession))).A00;
        r9.markerPoint(424097382, "ml_engine_initialization_end");
        AnonymousClass40G E3W = r1.E3W(so1, odinContext);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36317779602052646L)) {
            0wc A022 = AnonymousClass0kN.A02(userSession);
            0Aj A002 = A022.A00(A022.A00, "dcp_prediction_score");
            if (A002.isSampled()) {
                A002.A8D("prediction_score", (Double) E3W.A00);
                A002.A7p("is_success", Boolean.valueOf(E3W.A02));
                A002.AAJ(TraceFieldType.FailureReason, E3W.A01);
                A002.AAJ("model_version", String.valueOf(182.A01(r2, userSession, 36599254575484373L)));
                A002.AAJ("model_name", 182.A04(r2, userSession, 36880729552060764L));
                A002.AAJ("model_asset", 182.A04(r2, userSession, 36880729552585056L));
                A002.Cgf();
            }
        }
        boolean z = E3W.A02;
        r9.markerPoint(424097382, "prediction_end", String.valueOf(z));
        Object value2 = r7.A02.getValue();
        0qQ.A07(value2);
        if (((Number) value2).longValue() > 0) {
            AnonymousClass1HI.A02.Eym(new C387109lg(context, so1, odinContext, userSession));
        }
        if (z) {
            r9.markerAnnotate(424097382, "score", String.valueOf(((Number) E3W.A00).doubleValue()));
        }
        return E3W;
    }
}
