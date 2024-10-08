package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NHf  reason: case insensitive filesystem */
public final class C68420NHf extends C272124k8 {
    public final /* synthetic */ C272124k8 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68420NHf(C272124k8 r1, UserSession userSession) {
        super(userSession);
        this.A00 = r1;
    }

    public final void onFail(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, -999892683);
        this.A00.onFail(r3);
        AnonymousClass0fD.A0A(-1161675478, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-240387475);
        int A0D = AnonymousClass7TG.A0D(obj, 379667996);
        this.A00.onSuccess(obj);
        AnonymousClass0fD.A0A(738356760, A0D);
        AnonymousClass0fD.A0A(-1608529788, A03);
    }
}
