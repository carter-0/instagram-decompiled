package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.EAj  reason: case insensitive filesystem */
public final class C47623EAj extends C231632rz {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final boolean A02;
    public final Context A03;
    public final G8F A04;
    public final C251033mS A05;
    public final C250993mO A06;
    public final boolean A07;

    public C47623EAj(Context context, AnonymousClass0iw r3, UserSession userSession, G8F g8f, boolean z) {
        0qQ.A0B(userSession, 2);
        this.A03 = context;
        this.A01 = userSession;
        this.A02 = z;
        this.A00 = r3;
        this.A04 = g8f;
        this.A07 = DbV.A1Y(userSession);
        this.A05 = C251033mS.A00(userSession);
        C250993mO A012 = C250993mO.A01(userSession);
        0qQ.A07(A012);
        this.A06 = A012;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void onViewRecycled(View view, int i, Object obj, Object obj2) {
        C47035DpR dpR;
        DbZ.A0t(0, view, obj, obj2);
        Object tag = view.getTag();
        if ((tag instanceof C47035DpR) && (dpR = (C47035DpR) tag) != null) {
            this.A04.Dbs(dpR.A06);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005f, code lost:
        if (r4.A06.A0A(r11, r4.A05) == false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r24, android.view.View r25, java.lang.Object r26, java.lang.Object r27) {
        /*
            r23 = this;
            r11 = r26
            r0 = -1443440725(0xffffffffa9f6d7ab, float:-1.0962007E-13)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r5 = r25
            r0 = r27
            X.AnonymousClass7TG.A1U(r5, r11, r0)
            com.instagram.model.direct.DirectShareTarget r11 = (com.instagram.model.direct.DirectShareTarget) r11
            int r13 = X.AnonymousClass7TE.A0M(r0)
            r4 = r23
            com.instagram.common.session.UserSession r8 = r4.A01
            X.2HN r0 = X.2HM.A00(r8)
            r18 = 0
            X.2HR r0 = r0.A0H
            java.lang.Object r0 = r0.A00()
            boolean r3 = X.AnonymousClass7TE.A1a(r0)
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0044
            X.0iw r0 = r4.A00
            java.lang.String r2 = r0.getModuleName()
            java.lang.String r0 = "direct_thread_add_member"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0044
            boolean r0 = r11.A0a(r3)
            if (r0 != 0) goto L_0x0044
            r18 = 1
        L_0x0044:
            android.content.Context r6 = r4.A03
            java.lang.Object r10 = r5.getTag()
            if (r10 == 0) goto L_0x008e
            X.DpR r10 = (X.C47035DpR) r10
            X.0iw r7 = r4.A00
            r12 = 6
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0061
            X.3mO r2 = r4.A06
            X.3mS r0 = r4.A05
            boolean r0 = r2.A0A(r11, r0)
            r16 = 1
            if (r0 != 0) goto L_0x0063
        L_0x0061:
            r16 = 0
        L_0x0063:
            r17 = 0
            X.3mO r3 = r4.A06
            X.3mS r2 = r4.A05
            r0 = 10
            int r15 = r3.A07(r11, r2, r0)
            X.G8F r9 = r4.A04
            r3 = 0
            r19 = r18 ^ 1
            r14 = r13
            r20 = r17
            r21 = r17
            r22 = r17
            X.C49759F5k.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2 = r9
            r4 = r11
            r5 = r17
            r6 = r13
            r7 = r13
            r2.Dbk(r3, r4, r5, r6, r7)
            r0 = 397154641(0x17ac1951, float:1.112163E-24)
            X.AnonymousClass0fD.A0A(r0, r1)
            return
        L_0x008e:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = 971634708(0x39e9f814, float:4.4626056E-4)
            X.AnonymousClass0fD.A0A(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47623EAj.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A042 = DbX.A04(viewGroup, 721485459);
        Context context = this.A03;
        FrameLayout frameLayout = (FrameLayout) DbT.A0C(LayoutInflater.from(context), viewGroup, R.layout.directshare_row_user);
        frameLayout.setTag(new C47035DpR(context, frameLayout));
        AnonymousClass0fD.A0A(226017586, A042);
        return frameLayout;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
