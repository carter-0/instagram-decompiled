package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class EDA extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ G8B A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public EDA(Context context, UserSession userSession, User user, G8B g8b, String str, String str2, int i, boolean z) {
        this.A02 = userSession;
        this.A03 = user;
        this.A00 = i;
        this.A04 = g8b;
        this.A07 = z;
        this.A06 = str;
        this.A05 = str2;
        this.A01 = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r4 == 2) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r19) {
        /*
            r18 = this;
            r0 = -891757958(0xffffffffcad8da7a, float:-7105853.0)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r8 = r18
            android.content.Context r7 = r8.A01
            com.instagram.user.model.User r6 = r8.A03
            java.lang.String r5 = r6.getFullName()
            java.lang.String r2 = r6.getUsername()
            int r4 = r8.A00
            if (r4 == 0) goto L_0x001d
            r1 = 2
            r0 = 0
            if (r4 != r1) goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            X.FEQ.A00(r7, r5, r2, r0)
            X.G8B r0 = r8.A04
            if (r0 == 0) goto L_0x0028
            r0.DED()
        L_0x0028:
            com.instagram.common.session.UserSession r2 = r8.A02
            java.lang.String r1 = r6.getId()
            java.lang.String r10 = r8.A06
            java.lang.String r11 = r8.A05
            if (r11 != 0) goto L_0x0038
            java.lang.String r11 = X.C49192Eqx.A00(r10)
        L_0x0038:
            int r17 = r6.BIW()
            com.instagram.user.model.FollowStatus r0 = r6.B6o()
            r6 = 0
            java.lang.String r12 = r0.name()
            java.lang.String r14 = "DEFAULT"
            java.lang.String r16 = X.AnonymousClass7TF.A0b()
            X.FFp r5 = new X.FFp
            r7 = r6
            r8 = r6
            r9 = r6
            r13 = r6
            r15 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.C49962FGu.A02(r2, r5, r1, r4)
            r0 = 1772231386(0x69a21ada, float:2.4496598E25)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EDA.onFail(X.4dm):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r2 == 2) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFailInBackground(X.C268654dm r6) {
        /*
            r5 = this;
            r0 = -963906313(0xffffffffc68bf4f7, float:-17914.482)
            int r4 = X.AnonymousClass0fD.A03(r0)
            int r2 = r5.A00
            if (r2 == 0) goto L_0x000f
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            r0 = r0 ^ 1
            com.instagram.user.model.User r3 = r5.A03
            r3.A0y(r0)
            com.instagram.common.session.UserSession r2 = r5.A02
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r2)
            X.27U r0 = new X.27U
            r0.<init>(r3)
            r1.A00(r0)
            r3.A0d(r2)
            X.5mt r0 = X.C294695ms.A00(r2)
            r0.A0E(r3)
            r0 = -571461951(0xffffffffddf02ec1, float:-2.16337283E18)
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EDA.onFailInBackground(X.4dm):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(116545859);
        int A033 = AnonymousClass0fD.A03(1099778703);
        G8B g8b = this.A04;
        if (g8b != null) {
            g8b.onSuccess();
            if (this.A07) {
                g8b.CyN();
            }
        }
        UserSession userSession = this.A02;
        int i = this.A00;
        User user = this.A03;
        String id = user.getId();
        String str = this.A06;
        String str2 = this.A05;
        if (str2 == null) {
            str2 = C49192Eqx.A00(str);
        }
        String str3 = "DEFAULT";
        C49962FGu.A03(userSession, new C49936FFp((C3263576k) null, (C69445Nlp) null, (Boolean) null, (Boolean) null, str, str2, user.B6o().name(), (String) null, "DEFAULT", str3, AnonymousClass7TF.A0b(), user.BIW()), id, i);
        AnonymousClass0fD.A0A(1374201934, A033);
        AnonymousClass0fD.A0A(798478769, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1841330002);
        int A033 = AnonymousClass0fD.A03(1544810066);
        UserSession userSession = this.A02;
        C294695ms.A00(userSession).A0C((C320136rp) obj, this.A03, (String) null);
        C46354Dcy.A02(userSession).A00 = true;
        AnonymousClass0fD.A0A(1016233653, A033);
        AnonymousClass0fD.A0A(1842172503, A032);
    }
}
