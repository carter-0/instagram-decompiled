package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.IVh  reason: case insensitive filesystem */
public final class C57272IVh implements MVB {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Uri A01;
    public final /* synthetic */ 0hq A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ 1Xj A04;
    public final /* synthetic */ AnonymousClass4DU A05;
    public final /* synthetic */ AnonymousClass3W1 A06;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public C57272IVh(Context context, Uri uri, 0hq r3, UserSession userSession, 1Xj r5, AnonymousClass4DU r6, AnonymousClass3W1 r7) {
        this.A00 = context;
        this.A02 = r3;
        this.A04 = r5;
        this.A06 = r7;
        this.A05 = r6;
        this.A03 = userSession;
        this.A01 = uri;
    }

    public final void onButtonClick(View view) {
        Context A052 = DbT.A05(this.A00);
        0hq r2 = this.A02;
        1Xj r4 = this.A04;
        AnonymousClass3W1 r6 = this.A06;
        AnonymousClass4DU r5 = this.A05;
        LTW.A00(A052, this.A01, r2, this.A03, r4, r5, r6);
    }
}
