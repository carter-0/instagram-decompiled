package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.genericsurvey.fragment.AdBakeOffFragment;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.HashMap;

/* renamed from: X.2p6  reason: invalid class name */
public final class AnonymousClass2p6 implements C230182p7 {
    public C2361132m A00;
    public final C227812jx A01;
    public final UserSession A02;
    public final AnonymousClass0iw A03;

    public final void Dkm() {
    }

    public final void Dko() {
    }

    public final void Dkn(C57250IUl iUl, C270054g7 r9) {
        String string;
        HashMap hashMap;
        int i;
        Fragment A022;
        UserSession userSession = this.A02;
        0wc A012 = AnonymousClass0kN.A01(this.A03, userSession);
        0Aj A002 = A012.A00(A012.A00, C273654mx.A00(3349));
        A002.AAJ("tracking_token", r9.C9L());
        A002.A8k("m_ix", Integer.valueOf(iUl.getPosition()));
        A002.AAJ("sa_action", r9.A00());
        A002.AAJ("sa_id", r9.getId());
        A002.Cgf();
        iUl.A00 = AnonymousClass05K.A00;
        C57214ITb iTb = new C57214ITb(r9, iUl);
        boolean z = false;
        if (this.A00 != null) {
            z = true;
        }
        17k.A0F(z);
        C227812jx r4 = this.A01;
        iTb.A00(this.A00, r4.getScrollingViewProxy());
        this.A00.DF7(r9);
        String A003 = r9.A00();
        String A013 = r9.A01();
        if (A003.equals("rating_and_review_composer") || A003.equals("browse_topics")) {
            Context applicationContext = r4.requireActivity().getApplicationContext();
            String A004 = r9.A00();
            if (A004.equals("browse_topics")) {
                string = applicationContext.getResources().getString(2131952419);
                hashMap = new HashMap();
                hashMap.put("event_source", "simple_action");
                i = 2888;
            } else if (A004.equals("rating_and_review_composer")) {
                hashMap = new HashMap();
                AnonymousClass3IK r5 = r9.A00;
                if (r5.getProductId() != null) {
                    hashMap.put("product_id", r5.getProductId());
                }
                if (r5.BRr() != null) {
                    hashMap.put("merchant_id", r5.BRr());
                }
                hashMap.put(AnonymousClass000.A00(359), r5.BjV());
                if (r5.BjT() != null) {
                    hashMap.put(AnonymousClass000.A00(752), r5.BjT());
                }
                if (r5.B3Q() != null) {
                    hashMap.put(AnonymousClass000.A00(4762), r5.B3Q());
                }
                string = applicationContext.getResources().getString(2131952347);
                i = 2822;
            } else {
                throw new IllegalStateException(002.A0R("Simple action type not supported as bloks screen: ", r9.A00()));
            }
            C46649DiU A04 = C46649DiU.A04(AnonymousClass000.A00(i), hashMap);
            FragmentActivity requireActivity = r4.requireActivity();
            IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
            igBloksScreenConfig.A0U = string;
            igBloksScreenConfig.A0l = false;
            A04.A0D(requireActivity, igBloksScreenConfig);
            return;
        }
        boolean equals = A003.equals("bake_off");
        IgFragmentFactoryImpl A005 = IgFragmentFactoryImpl.A00();
        if (equals) {
            A022 = new AdBakeOffFragment();
            Bundle bundle = new Bundle();
            bundle.putString(C273654mx.A00(104), A013);
            A022.setArguments(bundle);
        } else {
            A022 = A005.A02(A003, A013);
        }
        C309516Yo r0 = new C309516Yo(r4.requireActivity(), userSession);
        r0.A0E(A022);
        r0.A04();
    }

    public AnonymousClass2p6(C227812jx r1, AnonymousClass0iw r2, UserSession userSession) {
        this.A03 = r2;
        this.A01 = r1;
        this.A02 = userSession;
    }
}
