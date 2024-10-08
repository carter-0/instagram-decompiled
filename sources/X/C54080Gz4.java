package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Gz4  reason: case insensitive filesystem */
public final class C54080Gz4 extends C272124k8 {
    public final /* synthetic */ 02m A00;
    public final /* synthetic */ C72336P2b A01;
    public final /* synthetic */ AnonymousClass6ST A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54080Gz4(02m r1, UserSession userSession, C72336P2b p2b, AnonymousClass6ST r4, boolean z) {
        super(userSession);
        this.A02 = r4;
        this.A00 = r1;
        this.A01 = p2b;
        this.A03 = z;
    }

    public final void onFail(C268654dm r8) {
        StringBuilder A1A;
        int A0D = AnonymousClass7TG.A0D(r8, 1199316582);
        this.A02.dismiss();
        if (r8 instanceof C268674do) {
            A1A = AnonymousClass7TE.A1A();
            A1A.append("Create thread response: status code ");
            Object obj = ((C268674do) r8).A00;
            A1A.append(((1XQ) obj).mStatusCode);
            A1A.append(", errorMessage ");
            A1A.append(((1XP) obj).getErrorMessage());
        } else if (r8 instanceof C268664dn) {
            A1A = AnonymousClass7TE.A1A();
            A1A.append("Create thread ");
            A1A.append(r8);
        } else {
            C20561Wub A1K = AnonymousClass7TE.A1K();
            AnonymousClass0fD.A0A(1123902629, A0D);
            throw A1K;
        }
        String obj2 = A1A.toString();
        02m r2 = this.A00;
        C72336P2b p2b = this.A01;
        r2.markerAnnotate(478229610, "error", obj2);
        r2.markerEnd(478229610, 3);
        OPN.A00(p2b.A01, p2b.A02, p2b.A03, p2b.A04, this.A03);
        AnonymousClass0fD.A0A(532513270, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(450585627);
        C300585xS r8 = (C300585xS) obj;
        int A0D = AnonymousClass7TG.A0D(r8, -2080766585);
        this.A02.dismiss();
        02m r2 = this.A00;
        C72336P2b p2b = this.A01;
        r2.markerEnd(478229610, 2);
        1pE A012 = 1pE.A01(p2b.A01, p2b.A02, p2b.A03, "thread_details");
        String str = r8.A1D;
        0qQ.A07(str);
        A012.A0B = new C254763t0(str);
        A012.A0v = true;
        A012.A06 = new P4D(p2b, 1);
        A012.A06();
        AnonymousClass0fD.A0A(-1971048799, A0D);
        AnonymousClass0fD.A0A(2104323956, A032);
    }
}
