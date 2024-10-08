package X;

import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.ARDRemoteModelVersionFetcher;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class P3N implements C51902G6w {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C313756gx A02;
    public final /* synthetic */ AnonymousClass7S7 A03;
    public final /* synthetic */ C254793t3 A04;
    public final /* synthetic */ boolean A05;

    public P3N(AnonymousClass0iw r1, UserSession userSession, C313756gx r3, AnonymousClass7S7 r4, C254793t3 r5, boolean z) {
        this.A05 = z;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final void DBE(int i) {
        if (this.A05) {
            C313756gx r6 = this.A02;
            String A0x = C66580MXl.A0x(this.A04);
            String C6k = this.A03.C6k();
            int i2 = i;
            if (i != -1) {
                i2 = i / ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS;
            }
            String valueOf = String.valueOf(i2);
            1Ln A0J = DbT.A0J(r6);
            if (DbT.A1Y(A0J)) {
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put(TraceFieldType.Duration, valueOf);
                DbW.A17(A0J, r6);
                DbV.A1M(A0J, "mute_messages_enabled");
                A0J.A0p("mute_message_option_text");
                A0J.A0q("mute_messages_options_dialog");
                JTQ.A1C(A0J, C66583MXo.A0e(A0J, "instagram", A0x, C6k), A1E);
            }
        }
        C66671Mae.A02(this.A00, this.A01, C66580MXl.A0x(this.A04), i);
    }

    public final void onCancel() {
        if (this.A05) {
            C313756gx r4 = this.A02;
            String A0x = C66580MXl.A0x(this.A04);
            String C6k = this.A03.C6k();
            1Ln A0J = DbT.A0J(r4);
            if (DbT.A1Y(A0J)) {
                DbW.A17(A0J, r4);
                DbV.A1M(A0J, "mute_messages_cancelled");
                A0J.A0p("mute_message_option_text");
                A0J.A0q("mute_messages_options_dialog");
                A0J.A0i(C66583MXo.A0e(A0J, "instagram", A0x, C6k));
                A0J.Cgf();
            }
        }
    }
}
