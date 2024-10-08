package com.instagram.inappbrowser.extensions.bloks;

import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass6NR;
import X.AnonymousClass6NS;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C11519Sbg;
import X.C229382nI;
import X.C273694n2;
import X.C3034368u;
import X.C360998fV;
import X.C62320sa;
import X.C8814RAq;
import android.util.SparseArray;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.ipc.IABBloksGraphQLCallback;
import com.instagram.common.session.UserSession;

public final class IgBloksIABExtension$fetchBloksFooterTemplate$1 extends IABBloksGraphQLCallback.Stub {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C8814RAq A03;
    public final /* synthetic */ C62320sa A04;

    public IgBloksIABExtension$fetchBloksFooterTemplate$1(FragmentActivity fragmentActivity, AnonymousClass0iw r4, UserSession userSession, C8814RAq rAq, C62320sa r7) {
        this.A03 = rAq;
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = r4;
        this.A04 = r7;
        AnonymousClass0fD.A0A(-242512065, AnonymousClass0fD.A03(-765568085));
    }

    public final void Czq(String str) {
        int A0D = AnonymousClass7TG.A0D(str, 1230418616);
        C8814RAq rAq = this.A03;
        C3034368u A002 = C360998fV.A00(rAq.A07, str, (String) null);
        UserSession userSession = this.A02;
        FragmentActivity fragmentActivity = this.A00;
        C229382nI A012 = C229382nI.A01((SparseArray) null, fragmentActivity, this.A01, userSession);
        FrameLayout frameLayout = rAq.A00;
        if (frameLayout != null) {
            C62320sa r3 = this.A04;
            C273694n2 r2 = new C273694n2(AnonymousClass7TE.A0S(frameLayout));
            frameLayout.addView(r2);
            if (A002 != null) {
                AnonymousClass6NR A003 = AnonymousClass6NS.A00(fragmentActivity, A002, A012);
                A003.A01 = rAq.A08;
                AnonymousClass6NS A004 = A003.A00();
                rAq.A02 = A004;
                A004.A07(r2);
                frameLayout.getViewTreeObserver().addOnPreDrawListener(new C11519Sbg(1, r3, frameLayout));
            }
        }
        AnonymousClass0fD.A0A(-1211549265, A0D);
    }
}
