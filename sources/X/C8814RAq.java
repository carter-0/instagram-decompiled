package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.inappbrowser.extensions.bloks.IgBloksIABExtension$fetchBloksFooterTemplate$1;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.RAq  reason: case insensitive filesystem */
public final class C8814RAq extends C9110RPh implements C13789Th4, C13497TbO {
    public FrameLayout A00;
    public C229382nI A01;
    public AnonymousClass6NS A02;
    public String A03;
    public AtomicReference A04 = new AtomicReference((Object) null);
    public AtomicReference A05 = new AtomicReference((Object) null);
    public AtomicReference A06 = new AtomicReference((Object) null);
    public final C307546Qn A07 = C307546Qn.A01;
    public final Map A08 = AnonymousClass7TE.A1E();

    public final View B7F() {
        return this.A00;
    }

    public final void DvV(String str, Object obj) {
        Map map = this.A08;
        map.put("current_url", obj);
        AnonymousClass6NS r0 = this.A02;
        if (r0 != null) {
            r0.A08(map);
        }
    }

    public final void EF3(View view, FragmentActivity fragmentActivity, C15047ULa uLa, AnonymousClass0iw r20, UserSession userSession, 1Xj r22, C62320sa r23) {
        ViewStub viewStub;
        C15047ULa uLa2 = uLa;
        String str = uLa2.A03;
        String str2 = uLa2.A05;
        String str3 = uLa2.A04;
        String str4 = uLa2.A08;
        Bundle bundle = (Bundle) uLa2.A00;
        UserSession userSession2 = userSession;
        if (182.A06(0Tu.A05, userSession2, 36324763215475051L) && (viewStub = (ViewStub) view.findViewById(R.id.ig_expandable_footer_stub)) != null) {
            this.A00 = (FrameLayout) JTP.A0H(viewStub, R.layout.ig_expandable_footer).requireViewById(R.id.ig_expandable_footer);
            this.A08.put("current_url", str);
            SRY A002 = SRY.A00();
            SRY.A02(new C7563QJr(bundle, A002, new IgBloksIABExtension$fetchBloksFooterTemplate$1(fragmentActivity, r20, userSession2, this, r23), str2, str3, str4), A002, false);
        }
    }
}
