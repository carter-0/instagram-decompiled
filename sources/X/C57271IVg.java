package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.List;

/* renamed from: X.IVg  reason: case insensitive filesystem */
public final class C57271IVg implements MVB {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ SavedCollection A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public C57271IVg(Context context, AnonymousClass0iw r2, UserSession userSession, SavedCollection savedCollection, String str, List list, int i) {
        this.A02 = r2;
        this.A01 = context;
        this.A03 = userSession;
        this.A04 = savedCollection;
        this.A05 = str;
        this.A06 = list;
        this.A00 = i;
    }

    public final void onButtonClick(View view) {
        C56669I6y.A04(this.A01, this.A02, this.A03, this.A04, this.A05, this.A06, this.A00);
    }
}
