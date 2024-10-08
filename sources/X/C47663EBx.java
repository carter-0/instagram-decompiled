package X;

import android.content.Context;
import com.instagram.user.model.User;

/* renamed from: X.EBx  reason: case insensitive filesystem */
public final class C47663EBx extends 1P0 {
    public final /* synthetic */ C2355930l A00;
    public final /* synthetic */ C49564Exz A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ boolean A03;

    public C47663EBx(C2355930l r1, C49564Exz exz, User user, boolean z) {
        this.A02 = user;
        this.A03 = z;
        this.A00 = r1;
        this.A01 = exz;
    }

    public final void onFail(C268654dm r7) {
        int A0D = AnonymousClass7TG.A0D(r7, 771074065);
        C47663EBx.super.onFail(r7);
        C48774Ejx.A00(this.A00.A00, r7, "update_feed_favorites_request_failure");
        C49564Exz exz = this.A01;
        if (exz != null) {
            boolean z = !this.A03;
            User user = exz.A02;
            F12 f12 = exz.A01;
            Context context = exz.A00;
            user.A11(z);
            C49789F6x.A01(context, f12, z);
        }
        AnonymousClass0fD.A0A(-208689636, A0D);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.1qK, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-595698771);
        int A0D = AnonymousClass7TG.A0D(obj, 96255158);
        C47663EBx.super.onSuccess(obj);
        User user = this.A02;
        boolean z = this.A03;
        user.A11(z);
        AnonymousClass1Nd.A00(this.A00.A01).A00(new Object());
        C49564Exz exz = this.A01;
        if (exz != null) {
            User user2 = exz.A02;
            F12 f12 = exz.A01;
            Context context = exz.A00;
            user2.A11(z);
            C49789F6x.A01(context, f12, z);
        }
        AnonymousClass0fD.A0A(1793377562, A0D);
        AnonymousClass0fD.A0A(804505704, A032);
    }
}
