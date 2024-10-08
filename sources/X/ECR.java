package X;

import android.content.Context;

public final class ECR extends 1P0 {
    public final Context A00;
    public final AnonymousClass6ST A01;

    public ECR(Context context, AnonymousClass6ST r3, String str) {
        0qQ.A0B(str, 1);
        this.A00 = context;
        this.A01 = r3;
        DbU.A18(context, r3, 2131972407);
    }

    public final void onFail(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, 1511474765);
        C49952FGh.A02(this.A00, r3);
        AnonymousClass0fD.A0A(-914136833, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-314105232);
        this.A01.hide();
        ECR.super.onFinish();
        AnonymousClass0fD.A0A(-1275840680, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-62375715);
        AnonymousClass0fN.A00(this.A01);
        ECR.super.onStart();
        AnonymousClass0fD.A0A(1305427561, A03);
    }
}
