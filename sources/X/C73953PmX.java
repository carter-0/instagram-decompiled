package X;

import android.os.Handler;
import com.facebook.proxygen.TraceFieldType;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.PmX  reason: case insensitive filesystem */
public final class C73953PmX extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass9JN A01;
    public final /* synthetic */ PB4 A02;
    public final /* synthetic */ N8J A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73953PmX(AnonymousClass9JN r2, PB4 pb4, N8J n8j, int i, boolean z) {
        super(1);
        this.A01 = r2;
        this.A02 = pb4;
        this.A03 = n8j;
        this.A00 = i;
        this.A04 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        String str2 = this.A01.A06;
        String str3 = null;
        boolean z = true;
        if (str2 != null && C66580MXl.A1a("instagram://gen_ai_accounts", 1, str2)) {
            C70671OFs oFs = (C70671OFs) this.A02.A01.A01(C70671OFs.class, C73710PiX.A00);
            List list = this.A03.A03;
            0qQ.A0B(list, 0);
            synchronized (oFs.A03) {
                oFs.A01 = null;
                oFs.A00 = null;
                Handler handler = oFs.A02;
                Runnable runnable = oFs.A04;
                handler.removeCallbacks(runnable);
                oFs.A01 = list;
                handler.postDelayed(runnable, 1000);
            }
        }
        PB4 pb4 = this.A02;
        AnonymousClass7Ws r3 = pb4.A02;
        N8J n8j = this.A03;
        C70018Nvw.A00(r3, n8j.A01, this.A00);
        if (this.A04) {
            C254703su r1 = n8j.A02.A0e;
            0qQ.A07(r1);
            AnonymousClass7I3 r2 = (AnonymousClass7I3) pb4.A04.getValue();
            String A0g = r1.A0g();
            String str4 = r1.A1u;
            0qQ.A07(str4);
            Long A10 = AnonymousClass7TE.A10(str4);
            AnonymousClass7AG r0 = r1.A0Q;
            if (r0 != null) {
                str3 = r0.A05;
            }
            String C6X = ((C332877Wu) r3).C6X();
            String A002 = PB4.A00(n8j);
            0Aj A0e = AnonymousClass7TE.A0e(r2.A01, "direct_thread_link_tap");
            if (A0e.isSampled()) {
                if (0qQ.A0K(A002, "GENAI_SUBSCRIPTION")) {
                    str = "ai_bot_subscriptions";
                } else if (0qQ.A0K(A002, "GENAI_REMINDER")) {
                    str = "ai_bot_reminders";
                } else {
                    str = null;
                }
                LinkedHashMap A1H = AnonymousClass7TE.A1H();
                if (str != null) {
                    A1H.put(TraceFieldType.ContentType, str);
                }
                C66584MXp.A0t(A0e, A10, A0g, str3, C6X);
                A0e.AAJ("tap_surface", "see_all");
                C66583MXo.A18(A0e, A1H);
            }
        }
        if (str2 == null || !C66580MXl.A1a("instagram://gen_ai_accounts", 1, str2)) {
            z = false;
        }
        PB4.A01(pb4, n8j, z);
        return C60340gF.A00;
    }
}
