package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;

public final class T8E implements B2G {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ 02m A02;
    public final /* synthetic */ 0lg A03;
    public final /* synthetic */ Runnable A04;

    public T8E(Activity activity, Intent intent, 02m r3, 0lg r4, Runnable runnable) {
        this.A04 = runnable;
        this.A03 = r4;
        this.A00 = activity;
        this.A01 = intent;
        this.A02 = r3;
    }

    public final void onFailure(Exception exc) {
        02m r3 = this.A02;
        if (r3.isMarkerOn(18951415)) {
            Pxf.A1I(r3, TraceFieldType.FailureReason, "asset_load_failure", 18951415);
        }
        this.A04.run();
    }

    public final void onSuccess() {
        this.A04.run();
        0lg r4 = this.A03;
        if (!(r4 instanceof UserSession) || !182.A06(0Tu.A05, r4, 36314420934085153L)) {
            AnonymousClass14B A002 = AnonymousClass14B.A03.A00();
            Activity activity = this.A00;
            Intent A012 = A002.A01(activity);
            A012.putExtra(AnonymousClass000.A00(1032), this.A01);
            0kR.A00.A07().A0G(activity, A012);
            return;
        }
        Bundle A0a = AnonymousClass7TE.A0a();
        Activity activity2 = this.A00;
        AnonymousClass6W8 A022 = AnonymousClass6W8.A02(activity2, A0a, r4, TransparentModalActivity.class, C273654mx.A00(3419));
        A022.A0J = ModalActivity.A08;
        A022.A0C(activity2);
    }
}
