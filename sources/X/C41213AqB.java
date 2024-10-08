package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* renamed from: X.AqB  reason: case insensitive filesystem */
public final class C41213AqB implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C358408ar A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ boolean A03;

    public C41213AqB(View view, C358408ar r2, Integer num, boolean z) {
        this.A02 = num;
        this.A01 = r2;
        this.A03 = z;
        this.A00 = view;
    }

    public final void run() {
        int i;
        Integer num = this.A02;
        int intValue = num.intValue();
        C358408ar r5 = this.A01;
        Context context = r5.A02;
        if (intValue != 0) {
            i = 2131969770;
        } else {
            if (182.A06(0Tu.A05, r5.A03, 36320983644251135L)) {
                i = 2131966129;
            } else {
                i = 2131966130;
                if (this.A03) {
                    i = 2131966128;
                }
            }
        }
        AnonymousClass5Gt A0f = AnonymousClass7TG.A0f((Activity) context, AnonymousClass7TE.A16(context, i));
        A0f.A0F = false;
        A0f.A03(this.A00);
        A0f.A02();
        A0f.A04 = new C389339pH(0, num, r5);
        AnonymousClass5Gv A002 = A0f.A00();
        A002.A06();
        r5.A00 = A002;
    }
}
