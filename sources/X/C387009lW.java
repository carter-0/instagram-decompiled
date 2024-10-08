package X;

import android.content.Context;
import com.facebook.odin.model.OdinContext;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.9lW  reason: invalid class name and case insensitive filesystem */
public final class C387009lW extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 02m A01;
    public final /* synthetic */ C228352lS A02;
    public final /* synthetic */ AnonymousClass2lP A03;
    public final /* synthetic */ AnonymousClass5K5 A04;
    public final /* synthetic */ C233632w4 A05;
    public final /* synthetic */ C238523Ce A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C387009lW(Context context, 02m r5, C228352lS r6, AnonymousClass2lP r7, AnonymousClass5K5 r8, C233632w4 r9, C238523Ce r10, String str, String str2, String str3) {
        super(169758665, 3, false, false);
        this.A01 = r5;
        this.A02 = r6;
        this.A04 = r8;
        this.A00 = context;
        this.A09 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A03 = r7;
        this.A06 = r10;
        this.A05 = r9;
    }

    public final void run() {
        So1 so1;
        Double valueOf;
        AnonymousClass2lP r12;
        C238523Ce r14;
        C233632w4 r13;
        String str;
        String str2;
        02m r8 = this.A01;
        r8.markerPoint(424097382, "runnable_begin");
        C228352lS r11 = this.A02;
        r8.markerAnnotate(424097382, "threshold", String.valueOf(C228352lS.A00(r11)));
        if (AnonymousClass7TE.A1a(AnonymousClass7TE.A14(r11.A07))) {
            so1 = new So1(this.A04);
        } else {
            so1 = null;
        }
        UserSession userSession = r11.A01;
        Context context = this.A00;
        boolean z = true;
        AnonymousClass408 r10 = ((C258723zX) userSession.A01(C258723zX.class, new TTP(15, context, userSession))).A00;
        r8.markerPoint(424097382, "ml_engine_initialization_end");
        OdinContext odinContext = new OdinContext(this.A09, (Map) null, (Map) null, 30);
        AnonymousClass40G E3W = r10.E3W(so1, odinContext);
        boolean z2 = E3W.A02;
        r8.markerPoint(424097382, Pxd.A00(259), String.valueOf(z2));
        if (z2) {
            double doubleValue = ((Number) E3W.A00).doubleValue();
            r8.markerAnnotate(424097382, "score", String.valueOf(doubleValue));
            z = false;
            if (doubleValue >= C228352lS.A00(r11)) {
                z = true;
            }
            String str3 = this.A07;
            String str4 = this.A08;
            valueOf = Double.valueOf(doubleValue);
            r12 = this.A03;
            r14 = this.A06;
            r13 = this.A05;
            str = str4;
            str2 = str3;
        } else {
            r8.markerAnnotate(424097382, TraceFieldType.FailureReason, E3W.A01);
            String str5 = this.A07;
            String str6 = this.A08;
            valueOf = Double.valueOf(1.0d);
            r12 = this.A03;
            r14 = this.A06;
            r13 = this.A05;
            str = str6;
            str2 = str5;
        }
        C228352lS.A01(r11, r12, r13, r14, valueOf, str2, str, z);
        if (AnonymousClass7TE.A0R(AnonymousClass7TE.A14(r11.A02)) > 0) {
            AnonymousClass1HI.A02.Eym(new C387109lg(context, so1, odinContext, userSession));
        }
    }
}
