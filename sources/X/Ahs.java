package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;

public final class Ahs implements 1aV {
    public final /* synthetic */ AnonymousClass7YZ A00;
    public final /* synthetic */ C332517Vi A01;
    public final /* synthetic */ String A02;

    public Ahs(AnonymousClass7YZ r1, C332517Vi r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        MsysThreadId msysThreadId = (MsysThreadId) obj;
        C332527Vj r5 = (C332527Vj) this.A00.A0R.invoke();
        if (msysThreadId != null) {
            C332517Vi r4 = this.A01;
            String str = this.A02;
            C330707Nw r2 = r5.A00;
            if (r2 != null) {
                r2.A00(r4, new C254763t0(str), msysThreadId);
                r5.A01 = null;
                return;
            }
            0qQ.A0F("statusLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }
}
