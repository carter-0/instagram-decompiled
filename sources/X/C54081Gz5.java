package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Gz5  reason: case insensitive filesystem */
public final class C54081Gz5 extends C272124k8 {
    public final /* synthetic */ 02m A00;
    public final /* synthetic */ C72336P2b A01;
    public final /* synthetic */ AnonymousClass6ST A02;
    public final /* synthetic */ 0sP A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54081Gz5(02m r1, UserSession userSession, C72336P2b p2b, AnonymousClass6ST r4, 0sP r5) {
        super(userSession);
        this.A02 = r4;
        this.A00 = r1;
        this.A01 = p2b;
        this.A03 = r5;
    }

    public final void onFail(C268654dm r7) {
        StringBuilder A1A;
        int A032 = AnonymousClass0fD.A03(-777965491);
        0qQ.A0B(r7, 0);
        if (r7 instanceof C268674do) {
            A1A = AnonymousClass7TE.A1A();
            A1A.append("Eligibility check response: status code ");
            Object obj = ((C268674do) r7).A00;
            A1A.append(((1XR) obj).getStatusCode());
            A1A.append(", errorMessage ");
            A1A.append(((AnonymousClass1XT) obj).getErrorMessage());
        } else if (r7 instanceof C268664dn) {
            A1A = AnonymousClass7TE.A1A();
            A1A.append("Eligibility check ");
            A1A.append(r7);
        } else {
            C20561Wub A1K = AnonymousClass7TE.A1K();
            AnonymousClass0fD.A0A(-795756364, A032);
            throw A1K;
        }
        String obj2 = A1A.toString();
        02m r2 = this.A00;
        r2.markerAnnotate(478229610, "error", obj2);
        r2.markerEnd(478229610, 3);
        C51968G9o.A1O(this.A03, false);
        AnonymousClass0fD.A0A(185820523, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(1572990799);
        AnonymousClass0fN.A00(this.A02);
        AnonymousClass0fD.A0A(-911095053, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1238636834);
        C54061Gyk gyk = (C54061Gyk) obj;
        int A0D = AnonymousClass7TG.A0D(gyk, -1179502632);
        02m r3 = this.A00;
        r3.markerAnnotate(478229610, "eligible", gyk.A00);
        if (!gyk.A00) {
            r3.markerEnd(478229610, 2);
        }
        C51968G9o.A1O(this.A03, gyk.A00);
        AnonymousClass0fD.A0A(-526014699, A0D);
        AnonymousClass0fD.A0A(-1443593226, A032);
    }
}
