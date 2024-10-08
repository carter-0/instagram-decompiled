package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import java.util.List;

/* renamed from: X.7HH  reason: invalid class name */
public final class AnonymousClass7HH implements 1wn {
    public final /* synthetic */ AnonymousClass7H6 A00;

    public AnonymousClass7HH(AnonymousClass7H6 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        C254703su r4;
        String str;
        int A03 = AnonymousClass0fD.A03(1261744516);
        2Kb r10 = (2Kb) obj;
        int A032 = AnonymousClass0fD.A03(1954626645);
        0qQ.A0B(r10, 0);
        if (r10.A01 == AnonymousClass05K.A0M) {
            List list = r10.A04;
            String str2 = null;
            if (!(list == null || (r4 = (C254703su) 00k.A0J(list)) == null)) {
                String A0g = r4.A0g();
                AnonymousClass7H6 r7 = this.A00;
                AnonymousClass77B A05 = AnonymousClass7H6.A05(r7);
                if (A05 != null) {
                    str = A05.A0T;
                } else {
                    str = null;
                }
                if (0qQ.A0K(A0g, str)) {
                    UserSession userSession = r7.A0w;
                    AnonymousClass77B A052 = AnonymousClass7H6.A05(r7);
                    if (A052 != null) {
                        str2 = A052.A0S;
                    }
                    C3263676m r1 = new C3263676m(userSession, r4, str2);
                    Context context = AnonymousClass7H6.A01(r7).getContext();
                    0qQ.A07(context);
                    Resources resources = context.getResources();
                    0qQ.A07(resources);
                    PrivacyMediaOverlayViewModel A04 = r1.A04(resources, false);
                    AnonymousClass77B A053 = AnonymousClass7H6.A05(r7);
                    if (A053 != null) {
                        A053.A01 = A04;
                    }
                    ReboundViewPager reboundViewPager = r7.A0C;
                    if (reboundViewPager == null) {
                        0qQ.A0F("viewPager");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    AnonymousClass759 A08 = AnonymousClass7H6.A08(r7, reboundViewPager.getCurrentDataIndex());
                    if (A04 != null) {
                        if (A08 != null) {
                            A08.A04(A04, new C73915Plq(32, r7, A04), 1);
                        }
                    } else if (A08 != null) {
                        A08.A02();
                    }
                }
            }
        }
        AnonymousClass0fD.A0A(-2139280154, A032);
        AnonymousClass0fD.A0A(-992817561, A03);
    }
}
