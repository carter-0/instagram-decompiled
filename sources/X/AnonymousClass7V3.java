package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7V3  reason: invalid class name */
public final class AnonymousClass7V3 extends 0Yg implements C62320sa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C332237Ue A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ C62320sa A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7V3(C332237Ue r2, String str, C62320sa r4, int i) {
        super(0);
        this.A01 = r2;
        this.A02 = str;
        this.A00 = i;
        this.A03 = r4;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C332237Ue r2 = this.A01;
        UserSession userSession = r2.A0G;
        AnonymousClass4DH r4 = r2.A0E;
        C332067Tn r1 = r2.A0H;
        AnonymousClass4DU r9 = r1.A08;
        0wc r6 = r1.A03;
        boolean A002 = r1.A07.A00();
        return new AnonymousClass7V4(r4, r4, r6, userSession, (C332247Uf) r2.A0Q.getValue(), r9, this.A02, r2.A0t, this.A03, r1.A0K, r1.A0L, this.A00, A002);
    }
}
