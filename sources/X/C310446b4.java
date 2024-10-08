package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;

/* renamed from: X.6b4  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C310446b4 implements AnonymousClass0eK {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass3E6 A01;
    public final /* synthetic */ C314636ib A02;
    public final /* synthetic */ C310236ae A03;

    public /* synthetic */ C310446b4(View view, AnonymousClass3E6 r2, C314636ib r3, C310236ae r4) {
        this.A03 = r4;
        this.A00 = view;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final Object get() {
        C310236ae r2 = this.A03;
        View view = this.A00;
        return new C14061Tp9((ViewStub) view.requireViewById(R.id.reel_question_text_response_composer_stub), r2.A09, this.A01, this.A02, new C14209Tro(r2), r2.A08.getModuleName(), r2.A0H);
    }
}
