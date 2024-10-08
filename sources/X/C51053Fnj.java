package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fnj  reason: case insensitive filesystem */
public final class C51053Fnj implements G7R {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ G8B A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C51053Fnj(Context context, UserSession userSession, User user, G8B g8b, String str, String str2) {
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = str;
        this.A02 = user;
        this.A03 = g8b;
        this.A05 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        if (r15 == 2) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D5T(int r15, boolean r16) {
        /*
            r14 = this;
            android.content.Context r6 = r14.A00
            com.instagram.common.session.UserSession r7 = r14.A01
            java.lang.String r10 = r14.A04
            com.instagram.user.model.User r8 = r14.A02
            X.G8B r9 = r14.A03
            r11 = 0
            int r0 = r8.BIW()
            r2 = 1
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r2)
            X.17k.A0E(r0)
            if (r15 == 0) goto L_0x0050
            java.lang.String r1 = X.C49192Eqx.A00(r10)
            java.lang.String r0 = "unable to unblock fb user from linked fb account"
            X.0wb.A03(r1, r0)
        L_0x0022:
            java.lang.String r3 = r14.A05
            X.8ab r2 = X.DbS.A0Y(r6)
            if (r15 == 0) goto L_0x0030
            r1 = 2
            r0 = 2131958506(0x7f131aea, float:1.9553626E38)
            if (r15 != r1) goto L_0x0033
        L_0x0030:
            r0 = 2131958504(0x7f131ae8, float:1.9553622E38)
        L_0x0033:
            java.lang.String r0 = X.DbW.A0h(r6, r3, r0)
            X.0qQ.A0A(r0)
            r2.A05 = r0
            r0 = 2131958474(0x7f131aca, float:1.9553561E38)
            X.DbY.A0w(r6, r2, r3, r0)
            r0 = 2131960862(0x7f13241e, float:1.9558405E38)
            r2.A0I(r11, r0)
            r0 = 4
            X.C50036FJv.A00(r2, r9, r0)
            X.DbT.A1V(r2)
            return
        L_0x0050:
            java.lang.String r4 = r8.getId()
            r9.D5S()
            X.C49194Eqz.A00(r7, r8, r2)
            X.8jT r0 = X.C363288jT.A00(r7)
            r0.A06()
            r12 = 0
            X.EDA r5 = new X.EDA
            r13 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            X.1NY r3 = X.AnonymousClass7TG.A0a(r7)
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.String r0 = "friendships/block_fb/%s/"
            r3.A0K(r0, r1)
            X.DbS.A1P(r3, r4)
            java.lang.String r0 = "surface"
            r3.A9m(r0, r10)
            java.lang.Class<X.6rp> r1 = X.C320136rp.class
            java.lang.Class<X.6rq> r0 = X.C320146rq.class
            r3.A0O(r11, r1, r0, r12)
            X.1OC r1 = X.DbT.A0U(r3, r2)
            r1.A00 = r5
            X.1ET r0 = X.1ES.A01()
            r0.schedule(r1)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51053Fnj.D5T(int, boolean):void");
    }

    public final void onCancel() {
        this.A03.onCancel();
    }
}
