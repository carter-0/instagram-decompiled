package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class EGN extends C232222tE {
    public String A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C294875nB A03;
    public final boolean A04;

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r3) {
        0qQ.A0B(r3, 0);
        C294875nB r1 = this.A03;
        0qQ.A0B(r1, 1);
        r1.DpD(r3.itemView);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
        if (r16 != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (r2.A05() == null) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r37, X.C249703kE r38) {
        /*
            r36 = this;
            r11 = r38
            r12 = r37
            X.FYR r12 = (X.FYR) r12
            X.DpO r11 = (X.C47032DpO) r11
            r10 = 0
            boolean r31 = X.AnonymousClass7TF.A1U(r10, r12, r11)
            r13 = r36
            boolean r0 = r13.A04
            if (r0 == 0) goto L_0x002f
            com.instagram.model.direct.DirectShareTarget r2 = r12.A05
            boolean r0 = r2.A0S()
            if (r0 == 0) goto L_0x002f
            com.instagram.common.session.UserSession r0 = r13.A02
            java.lang.String r0 = r0.A06
            java.lang.Integer r1 = r2.A04(r0, r10)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x002f
            java.lang.String r0 = r2.A05()
            r18 = 1
            if (r0 != 0) goto L_0x0031
        L_0x002f:
            r18 = 0
        L_0x0031:
            com.instagram.model.direct.DirectShareTarget r9 = r12.A05
            boolean r0 = r9.A0H()
            if (r0 == 0) goto L_0x00d6
            com.instagram.common.session.UserSession r3 = r13.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317521902638360(0x81069800211518, double:3.0306853179266927E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = r9.A0N
            if (r0 != 0) goto L_0x0054
        L_0x004c:
            com.instagram.direct.model.thread.ChannelsContextLine r0 = r9.A03
            if (r0 == 0) goto L_0x00d6
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x00d6
        L_0x0054:
            r17 = 1
        L_0x0056:
            boolean r16 = r9.A0F()
            boolean r0 = r12.A09
            r20 = r0
            boolean r0 = r9.A0Q()
            if (r0 == 0) goto L_0x00d3
            r0 = 1445(0x5a5, float:2.025E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x006a:
            r13.A00 = r0
            int r15 = r12.A02
            boolean r0 = r9.A0F()
            if (r0 == 0) goto L_0x00d0
            r8 = -1
        L_0x0075:
            int r7 = r12.A01
            int r6 = r12.A04
            int r5 = r12.A03
            com.instagram.common.session.UserSession r4 = r13.A02
            X.0iw r3 = r13.A01
            X.5nB r2 = r13.A03
            java.lang.String r1 = r13.A00
            boolean r0 = r12.A08
            if (r0 == 0) goto L_0x00cd
            java.lang.String r14 = r4.A06
            java.lang.Integer r13 = r9.A04(r14, r10)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r13 == r0) goto L_0x0099
            java.lang.Integer r13 = r9.A04(r14, r10)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r13 != r0) goto L_0x00cd
        L_0x0099:
            r29 = 1
        L_0x009b:
            boolean r0 = r12.A07
            r19 = 0
            if (r18 != 0) goto L_0x00a7
            if (r17 != 0) goto L_0x00a7
            r32 = 0
            if (r16 == 0) goto L_0x00a9
        L_0x00a7:
            r32 = 1
        L_0x00a9:
            r23 = r19
            r26 = r7
            r27 = r6
            r28 = r5
            r30 = r0
            r33 = r20
            r34 = r10
            r35 = r10
            r20 = r2
            r21 = r9
            r22 = r1
            r24 = r15
            r25 = r8
            r16 = r3
            r17 = r4
            r18 = r11
            X.C48842El4.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            return
        L_0x00cd:
            r29 = 0
            goto L_0x009b
        L_0x00d0:
            int r8 = r12.A00
            goto L_0x0075
        L_0x00d3:
            java.lang.String r0 = r13.A00
            goto L_0x006a
        L_0x00d6:
            r17 = 0
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EGN.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return FYR.class;
    }

    public EGN(AnonymousClass0iw r1, UserSession userSession, C294875nB r3, String str, boolean z) {
        AnonymousClass7TG.A1O(r3, userSession);
        this.A03 = r3;
        this.A02 = userSession;
        this.A00 = str;
        this.A01 = r1;
        this.A04 = z;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C47032DpO(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_inbox_search_row_layout, false));
    }
}
