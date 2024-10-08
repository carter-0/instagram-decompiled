package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.KAb  reason: case insensitive filesystem */
public final class C61496KAb extends 1P0 {
    public final DialogInterface.OnDismissListener A00;
    public final ERQ A01;
    public final AnonymousClass6Z6 A02;
    public final /* synthetic */ LEI A03;

    public C61496KAb(DialogInterface.OnDismissListener onDismissListener, LEI lei, AnonymousClass6Z6 r7) {
        this.A03 = lei;
        this.A00 = onDismissListener;
        ERQ erq = new ERQ();
        this.A01 = erq;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("isUpdating", true);
        erq.setArguments(A0a);
        this.A02 = r7;
    }

    public final void onFail(C268654dm r6) {
        int A032 = AnonymousClass0fD.A03(1023681070);
        0qQ.A0B(r6, 0);
        String A012 = C347037wA.A01(r6);
        Context context = this.A03.A05;
        if (A012 == null || A012.length() == 0) {
            A012 = AnonymousClass7TF.A0d(context.getResources(), 2131972232);
        }
        C59689JTv.A03(context, A012, "EditMediaCallback_request_error", 0);
        AnonymousClass0fD.A0A(1757829618, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-29263405);
        this.A03.A06.post(new C65925M4o(this));
        AnonymousClass0fD.A0A(2125980321, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-227190585);
        0hq r3 = this.A03.A07;
        if (r3.A0R("ProgressDialog") == null) {
            ERQ erq = this.A01;
            if (!erq.isAdded()) {
                erq.A0B(r3, "ProgressDialog");
            }
        }
        AnonymousClass0fD.A0A(-454710188, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1329061200);
        C61290K1b k1b = (C61290K1b) obj;
        int A0D = AnonymousClass7TG.A0D(k1b, -717652973);
        LEI lei = this.A03;
        UserSession userSession = lei.A08;
        1E7.A00(userSession).A03(k1b.A00());
        lei.A09.AE7(userSession);
        AnonymousClass0fD.A0A(-1799793236, A0D);
        AnonymousClass0fD.A0A(-12607110, A032);
    }
}
