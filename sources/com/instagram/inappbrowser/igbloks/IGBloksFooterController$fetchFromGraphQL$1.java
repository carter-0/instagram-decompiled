package com.instagram.inappbrowser.igbloks;

import X.AnonymousClass0fD;
import X.AnonymousClass6NR;
import X.AnonymousClass6NS;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C11519Sbg;
import X.C12810T7x;
import X.C229382nI;
import X.C273694n2;
import X.C3034368u;
import X.C307546Qn;
import X.C360998fV;
import android.util.SparseArray;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.ipc.IABBloksGraphQLCallback;
import com.instagram.common.session.UserSession;

public final class IGBloksFooterController$fetchFromGraphQL$1 extends IABBloksGraphQLCallback.Stub {
    public final /* synthetic */ C12810T7x A00;

    public IGBloksFooterController$fetchFromGraphQL$1(C12810T7x t7x) {
        this.A00 = t7x;
        AnonymousClass0fD.A0A(-1357821988, AnonymousClass0fD.A03(548460781));
    }

    public final void Czq(String str) {
        int A0D = AnonymousClass7TG.A0D(str, -1189836801);
        C3034368u A002 = C360998fV.A00(C307546Qn.A01, str, (String) null);
        C12810T7x t7x = this.A00;
        UserSession userSession = t7x.A05;
        FragmentActivity fragmentActivity = t7x.A03;
        C229382nI A01 = C229382nI.A01((SparseArray) null, fragmentActivity, t7x.A04, userSession);
        FrameLayout frameLayout = t7x.A00;
        if (frameLayout != null) {
            C273694n2 r2 = new C273694n2(AnonymousClass7TE.A0S(frameLayout));
            frameLayout.addView(r2);
            if (A002 != null) {
                AnonymousClass6NR A003 = AnonymousClass6NS.A00(fragmentActivity, A002, A01);
                A003.A01 = t7x.A0B;
                AnonymousClass6NS A004 = A003.A00();
                t7x.A01 = A004;
                A004.A07(r2);
                frameLayout.getViewTreeObserver().addOnPreDrawListener(new C11519Sbg(2, frameLayout, t7x));
            }
        }
        AnonymousClass0fD.A0A(-279241935, A0D);
    }
}
