package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.util.startup.appwarmer.KeepWarmReceiver;

/* renamed from: X.OtR  reason: case insensitive filesystem */
public final class C71941OtR implements C61110lV {
    public final int A00;
    public final Object A01;

    public C71941OtR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onAppBackgrounded() {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(-603587920);
                OTV.A00((OTV) this.A01, 630);
                i2 = -634783806;
                break;
            case 1:
                i = AnonymousClass0fD.A03(-1422228601);
                OE0 oe0 = (OE0) this.A01;
                oe0.A00.markerEnd(20128591, 630);
                14i.A06(oe0.A01);
                i2 = -464350292;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-702009467);
                2Lk r1 = (2Lk) this.A01;
                CallerContext callerContext = 2Lk.A08;
                Context context = r1.A01;
                Intent A0A = C66580MXl.A0A(context, KeepWarmReceiver.class);
                A0A.putExtra("EXTRAS_SHOULD_WARM_AGAIN", 182.A06(0Tu.A05, r1.A04, 36324325128876029L));
                context.sendBroadcast(A0A);
                i2 = -1985798280;
                break;
            case 3:
                i = AnonymousClass0fD.A03(1654981421);
                C70969OTq oTq = (C70969OTq) this.A01;
                if (oTq.A07) {
                    C71004OWb.A00.A00("ForegroundEligibilityStatus", 002.A0R("Application backgrounded.", ""));
                    oTq.A08 = false;
                    oTq.A02.run();
                }
                i2 = -92253730;
                break;
            case 4:
                i = AnonymousClass0fD.A03(1659507907);
                i2 = -1466567905;
                break;
            default:
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onAppForegrounded() {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(-1414445857);
                i2 = -1073750373;
                break;
            case 1:
                i = AnonymousClass0fD.A03(2048003753);
                i2 = -417650669;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-1529905153);
                i2 = -400501763;
                break;
            case 3:
                i = AnonymousClass0fD.A03(1861258239);
                C70969OTq oTq = (C70969OTq) this.A01;
                if (oTq.A07) {
                    C71004OWb.A00.A00("ForegroundEligibilityStatus", "Application foregrounded. Safe to start foreground service.");
                    AnonymousClass0eM r2 = oTq.A05;
                    JTO.A0E(r2).removeCallbacks(oTq.A02);
                    oTq.A08 = true;
                    oTq.A00 = true;
                    if (C70969OTq.A00(oTq)) {
                        oTq.A01.run();
                    } else {
                        JTO.A0E(r2).post(oTq.A01);
                    }
                }
                i2 = -125716089;
                break;
            case 4:
                i = AnonymousClass0fD.A03(-1345210407);
                Object obj = this.A01;
                AnonymousClass19S A02 = AnonymousClass1HX.A02(240488536, 3);
                C58106ImS imS = new C58106ImS(obj, (AnonymousClass4D7) null, 26);
                19B r4 = 19B.A00;
                1Eo.A05(r4, imS, A02);
                String A002 = AnonymousClass000.A00(2613);
                1Eo.A05(r4, new MFV(obj, A002, (AnonymousClass4D7) null, 48), AnonymousClass1HX.A02(197189788, 3));
                i2 = -1169984744;
                break;
            default:
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }
}
