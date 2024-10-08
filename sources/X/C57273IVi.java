package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.IVi  reason: case insensitive filesystem */
public final class C57273IVi implements MVB {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ AnonymousClass4DU A04;
    public final /* synthetic */ SavedCollection A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public final void onDismiss() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public C57273IVi(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r3, AnonymousClass4DU r4, SavedCollection savedCollection, String str, String str2, int i) {
        this.A02 = userSession;
        this.A04 = r4;
        this.A03 = r3;
        this.A00 = i;
        this.A07 = str;
        this.A05 = savedCollection;
        this.A01 = fragmentActivity;
        this.A06 = str2;
    }

    public final void onButtonClick(View view) {
        if (I7Q.A0C(this.A05)) {
            1Y8 A002 = C55115HcO.A00();
            FragmentActivity fragmentActivity = this.A01;
            UserSession userSession = this.A02;
            String str = this.A07;
            A002.A07(fragmentActivity, userSession, str, this.A06);
            I7Q.A05(userSession, this.A03, this.A04, str, this.A00);
        }
    }

    public final void onShow() {
        UserSession userSession = this.A02;
        AnonymousClass4DU r3 = this.A04;
        I7Q.A06(userSession, this.A03, r3, this.A07, this.A00);
    }
}
