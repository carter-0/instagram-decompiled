package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5ju  reason: invalid class name and case insensitive filesystem */
public final class C293025ju {
    public C331037Pg A00;
    public C67442Mnx A01;
    public String A02;
    public WeakReference A03 = new WeakReference((Object) null);
    public final 1Ng A04;
    public final 1wn A05 = new C293035jv(this);
    public final UserSession A06;
    public final List A07 = new ArrayList();
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LI(this, 16));

    public final void A02(boolean z) {
        if (z) {
            A00(this, "context_switch");
            this.A03.clear();
        } else {
            C67442Mnx mnx = this.A01;
            if (mnx != null) {
                mnx.A02(false);
            }
        }
        List<C67442Mnx> list = this.A07;
        for (C67442Mnx A022 : list) {
            A022.A02(false);
        }
        list.clear();
    }

    public static final void A00(C293025ju r3, String str) {
        C331037Pg r0;
        r3.A04.A02(r3.A05, 2Kb.class);
        C331037Pg r02 = r3.A00;
        if (!(r02 == null || !r02.A0D() || (r0 = r3.A00) == null)) {
            r0.A0A(str);
        }
        r3.A00 = null;
        C67442Mnx mnx = r3.A01;
        if (mnx != null) {
            mnx.A02(false);
        }
    }

    public static final boolean A01(C293025ju r6) {
        OFQ ofq;
        DirectMessageIdentifier directMessageIdentifier;
        C67442Mnx mnx;
        C331037Pg r5 = r6.A00;
        if (r5 == null || (ofq = r5.A02) == null || (directMessageIdentifier = ofq.A01) == null || (mnx = r6.A01) == null) {
            return false;
        }
        r5.A09(new PAU(r6, mnx), directMessageIdentifier);
        View findViewById = C67442Mnx.A00(mnx).findViewById(R.id.voice_message_bar_title);
        0qQ.A07(findViewById);
        TextView textView = (TextView) findViewById;
        String str = r6.A02;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        mnx.A01(((long) r5.A02()) - ((long) r5.A01()));
        mnx.A03(!r5.A0D());
        Object value = mnx.A04.getValue();
        0qQ.A07(value);
        AnonymousClass0fU.A00(new C71299Ohv(r5), (View) value);
        Object value2 = mnx.A05.getValue();
        0qQ.A07(value2);
        AnonymousClass0fU.A00(new C71300Ohw(r6), (View) value2);
        r6.A04.A01(r6.A05, 2Kb.class);
        return true;
    }

    public C293025ju(UserSession userSession) {
        this.A06 = userSession;
        this.A04 = AnonymousClass1Nd.A00(userSession);
        C2813557c.A00 = new C293045jw(this);
    }
}
