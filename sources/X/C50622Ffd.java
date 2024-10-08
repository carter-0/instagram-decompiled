package X;

import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.Status;
import com.instagram.nux.aymh.viewmodel.AymhViewModel;

/* renamed from: X.Ffd  reason: case insensitive filesystem */
public final class C50622Ffd implements G64 {
    public final /* synthetic */ AnonymousClass0aP A00;
    public final /* synthetic */ C62691Kkr A01;
    public final /* synthetic */ AymhViewModel A02;

    public final void CHr(FragmentActivity fragmentActivity) {
        0qQ.A0B(fragmentActivity, 0);
        Throwable cause = this.A01.getCause();
        0qQ.A0C(cause, "null cannot be cast to non-null type com.google.android.gms.common.api.ResolvableApiException");
        Status status = ((RKT) cause).A00;
        status.A00(fragmentActivity, 64206);
        AnonymousClass0aP r3 = this.A00;
        C49956FGl.A00(status, r3, "aymh", DbY.A02(r3), true);
    }

    public C50622Ffd(AnonymousClass0aP r1, C62691Kkr kkr, AymhViewModel aymhViewModel) {
        this.A01 = kkr;
        this.A02 = aymhViewModel;
        this.A00 = r1;
    }
}
