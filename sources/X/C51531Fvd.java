package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.Fvd  reason: case insensitive filesystem */
public final class C51531Fvd implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C333357Yq A03;
    public final /* synthetic */ String A04;

    public C51531Fvd(Activity activity, View view, View view2, C333357Yq r4, String str) {
        this.A02 = view;
        this.A00 = activity;
        this.A04 = str;
        this.A01 = view2;
        this.A03 = r4;
    }

    public final void run() {
        AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(this.A00, this.A04);
        A0f.A01();
        A0f.A03(this.A01);
        DbU.A1T(A0f);
        C333357Yq r0 = this.A03;
        long currentTimeMillis = System.currentTimeMillis();
        0xa r2 = r0.A01;
        0xY AR4 = r2.AR4();
        AR4.E5c("ai_call_tooltip_last_seen_timestamp", currentTimeMillis);
        AR4.apply();
        String A002 = C273654mx.A00(534);
        AnonymousClass7TG.A1M(r2, A002, DbT.A00(r2, A002) + 1);
    }
}
