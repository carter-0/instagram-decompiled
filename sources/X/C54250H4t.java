package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;

/* renamed from: X.H4t  reason: case insensitive filesystem */
public final class C54250H4t extends 1P0 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 1P0 A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ AnonymousClass6ST A04;
    public final /* synthetic */ C262224Cq A05;
    public final /* synthetic */ boolean A06;

    public C54250H4t(Context context, 1P0 r2, UserSession userSession, 1Xj r4, AnonymousClass6ST r5, C262224Cq r6, boolean z) {
        this.A05 = r6;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
        this.A06 = z;
        this.A02 = userSession;
        this.A00 = context;
    }

    public final void onFail(C268654dm r9) {
        String string;
        String errorMessage;
        int A032 = AnonymousClass0fD.A03(968253956);
        0qQ.A0B(r9, 0);
        AnonymousClass1XT r0 = (AnonymousClass1XT) r9.A00();
        if (r0 == null || (errorMessage = r0.getErrorMessage()) == null || errorMessage.hashCode() != 2083820669 || !errorMessage.equals("User has already pinned maximum amount of clips")) {
            boolean z = this.A06;
            Resources resources = this.A00.getResources();
            int i = 2131957123;
            if (z) {
                i = 2131957121;
            }
            string = resources.getString(i);
        } else {
            string = AnonymousClass7TF.A0e(this.A00.getResources(), AnonymousClass7TF.A0Y(0Tu.A05, this.A02, 36600397036654457L), 2131957122);
        }
        0qQ.A0A(string);
        0qQ.A0B(string, 0);
        C310336ap A0W = DbV.A0W();
        A0W.A0D = string;
        A0W.A0O = true;
        1xC.A01.A00(new AnonymousClass3GP(A0W.A00()));
        AnonymousClass0fD.A0A(1291023905, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(816766579);
        AnonymousClass7TE.A1Z(new C51648Fy7(this.A04, this.A01, (AnonymousClass4D7) null, 32), this.A05);
        AnonymousClass0fD.A0A(282779280, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(850505732);
        AnonymousClass7TE.A1Z(new C51646Fy5(this.A04, (AnonymousClass4D7) null, 44), this.A05);
        AnonymousClass0fD.A0A(230473125, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-637620406);
        int A0D = AnonymousClass7TG.A0D(obj, -479235306);
        C262224Cq r0 = this.A05;
        1Xj r6 = this.A03;
        boolean z = this.A06;
        UserSession userSession = this.A02;
        AnonymousClass7TE.A1Z(new C20590WvT(this.A01, obj, r6, userSession, (AnonymousClass4D7) null, 2, z), r0);
        AnonymousClass0fD.A0A(1854732366, A0D);
        AnonymousClass0fD.A0A(-1419373508, A032);
    }
}
