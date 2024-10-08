package X;

import android.app.Activity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Iiu  reason: case insensitive filesystem */
public final class C57939Iiu implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ PromoteData A01;
    public final /* synthetic */ IgTextView A02;
    public final /* synthetic */ String A03;

    public C57939Iiu(Activity activity, PromoteData promoteData, IgTextView igTextView, String str) {
        this.A00 = activity;
        this.A03 = str;
        this.A02 = igTextView;
        this.A01 = promoteData;
    }

    public final void run() {
        AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(this.A00, this.A03);
        A0f.A02();
        A0f.A00 = 5000;
        A0f.A03(this.A02);
        A0f.A0A = true;
        A0f.A04 = new C54392HBj(0);
        A0f.A00().A07(this.A01.A0y);
    }
}
