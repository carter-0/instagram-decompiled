package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.inappbrowser.igbloks.IGBloksFooterController$fetchFromGraphQL$1;
import java.util.Map;

/* renamed from: X.T7x  reason: case insensitive filesystem */
public final class C12810T7x implements C13822Ths {
    public FrameLayout A00;
    public AnonymousClass6NS A01;
    public final Bundle A02;
    public final FragmentActivity A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final C10310Rq8 A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final Map A0B = AnonymousClass7TE.A1E();

    public final void DJ7() {
    }

    public final void EF2(View view) {
        ViewStub viewStub;
        if (182.A06(0Tu.A05, this.A05, 36324763215475051L) && (viewStub = (ViewStub) view.findViewById(R.id.ig_expandable_footer_stub)) != null) {
            this.A00 = (FrameLayout) JTP.A0H(viewStub, R.layout.ig_expandable_footer).requireViewById(R.id.ig_expandable_footer);
            this.A0B.put("current_url", this.A07);
            SRY A002 = SRY.A00();
            SRY.A02(new C7563QJr(this.A02, A002, new IGBloksFooterController$fetchFromGraphQL$1(this), this.A09, this.A08, this.A0A), A002, false);
        }
    }

    public final void onDestroyView() {
    }

    public final View B7F() {
        return this.A00;
    }

    public final void DvV(String str, Object obj) {
        Map map = this.A0B;
        map.put("current_url", obj);
        AnonymousClass6NS r0 = this.A01;
        if (r0 != null) {
            r0.A08(map);
        }
    }

    public C12810T7x(Bundle bundle, FragmentActivity fragmentActivity, AnonymousClass0iw r4, UserSession userSession, C10310Rq8 rq8, String str, String str2, String str3, String str4) {
        C51974G9v.A1P(userSession, str, str2, fragmentActivity);
        AnonymousClass7TF.A1E(r4, 5, str4);
        0qQ.A0B(rq8, 9);
        this.A05 = userSession;
        this.A09 = str;
        this.A07 = str2;
        this.A03 = fragmentActivity;
        this.A04 = r4;
        this.A0A = str3;
        this.A08 = str4;
        this.A02 = bundle;
        this.A06 = rq8;
    }
}
