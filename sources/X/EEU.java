package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class EEU extends C252233om implements AnonymousClass7Q7 {
    public C320106rm A00;
    public AnonymousClass3AD A01;
    public boolean A02 = true;
    public boolean A03;
    public boolean A04;
    public AnonymousClass7Q8 A05;
    public final AnonymousClass4DH A06;
    public final C51929G7x A07;
    public final UserSession A08;

    public EEU(AnonymousClass4DH r2, UserSession userSession, C51929G7x g7x) {
        0qQ.A0B(userSession, 1);
        this.A08 = userSession;
        this.A06 = r2;
        this.A07 = g7x;
        r2.registerLifecycleListener(this);
    }

    public final View A01(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout_refreshable_recyclerview_with_progress, viewGroup, false);
        UserSession userSession = this.A08;
        0qQ.A0A(inflate);
        this.A01 = C3253672c.A01(inflate, userSession, new C51001Fmo(this, 0));
        AnonymousClass7Q8 r0 = this.A05;
        if (r0 == null) {
            0qQ.A0F("followStatusUpdatedEventListener");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A00();
        return inflate;
    }

    public final boolean AJe(String str) {
        0qQ.A0B(str, 0);
        return this.A07.AJe(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r5.A02 != false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            r4 = 0
            X.0qQ.A0B(r6, r4)
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x000d
            boolean r1 = r5.A02
            r0 = 0
            if (r1 == 0) goto L_0x000e
        L_0x000d:
            r0 = 1
        L_0x000e:
            X.4DH r1 = r5.A06
            X.C46445Df7.A01(r1, r0)
            boolean r0 = r1 instanceof X.AnonymousClass4DV
            if (r0 == 0) goto L_0x003b
            X.3AD r0 = r5.A01
            java.lang.String r3 = "pullToRefresh"
            if (r0 == 0) goto L_0x003c
            boolean r0 = r0 instanceof X.C19763Wf4
            if (r0 == 0) goto L_0x003b
            X.4DV r1 = (X.AnonymousClass4DV) r1
            X.3Ar r2 = r1.getScrollingViewProxy()
            boolean r0 = r2 instanceof X.C238143As
            if (r0 == 0) goto L_0x003b
            X.3As r2 = (X.C238143As) r2
            X.3AD r1 = r5.A01
            if (r1 == 0) goto L_0x003c
            X.Wf4 r1 = (X.C19763Wf4) r1
            X.WEb r0 = new X.WEb
            r0.<init>(r5, r4)
            r2.Epc(r0, r1)
        L_0x003b:
            return
        L_0x003c:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EEU.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(EEU eeu) {
        C320106rm r0 = eeu.A00;
        if (r0 != null) {
            r0.A00.A04();
            C320106rm r1 = eeu.A00;
            if (r1 != null) {
                r1.A0E("fetch_request_start");
                AnonymousClass4DH r2 = eeu.A06;
                1OC BDo = eeu.A07.BDo();
                BDo.A00 = new C47675ECj(eeu);
                r2.schedule(BDo);
                return;
            }
        }
        0qQ.A0F("perfLogger");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void FK4() {
        this.A07.FK4();
    }

    public final void onCreate() {
        AnonymousClass4DH r4 = this.A06;
        Context requireContext = r4.requireContext();
        UserSession userSession = this.A08;
        this.A05 = new AnonymousClass7Q8(requireContext, userSession, this);
        C320106rm r2 = new C320106rm(userSession, "dp_page_2", 31793336);
        this.A00 = r2;
        r2.A0R(r4.requireContext(), C71342cb.A00(userSession), r4);
    }

    public final void onDestroyView() {
        AnonymousClass7Q8 r0 = this.A05;
        if (r0 == null) {
            0qQ.A0F("followStatusUpdatedEventListener");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A01();
        }
    }

    public final void onResume() {
        if (this.A02) {
            A00(this);
        }
    }
}
