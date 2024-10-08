package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.Fnl  reason: case insensitive filesystem */
public final class C51055Fnl implements G7R {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ C49936FFp A04;
    public final /* synthetic */ G8B A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ JSONObject A09;

    public C51055Fnl(Context context, FragmentActivity fragmentActivity, UserSession userSession, User user, C49936FFp fFp, G8B g8b, String str, String str2, String str3, JSONObject jSONObject) {
        this.A02 = userSession;
        this.A03 = user;
        this.A04 = fFp;
        this.A00 = context;
        this.A01 = fragmentActivity;
        this.A07 = str;
        this.A06 = str2;
        this.A09 = jSONObject;
        this.A05 = g8b;
        this.A08 = str3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D5T(int r20, boolean r21) {
        /*
            r19 = this;
            r2 = r19
            com.instagram.common.session.UserSession r9 = r2.A02
            com.instagram.user.model.User r0 = r2.A03
            java.lang.String r3 = r0.getId()
            X.FFp r5 = r2.A04
            r1 = 3
            X.0qQ.A0B(r5, r1)
            r1 = r20
            X.C49962FGu.A01(r9, r5, r3, r1)
            r18 = r21
            if (r21 == 0) goto L_0x0044
            java.lang.String r13 = r0.getId()
            java.lang.String r11 = r5.A09
            X.0qQ.A07(r11)
            java.lang.String r3 = r5.A08
            com.instagram.user.model.FollowStatus r3 = com.instagram.user.model.FollowStatus.valueOf(r3)
            X.0qQ.A07(r3)
            X.6rY r10 = X.C319976rX.A01(r3)
            java.lang.String r14 = r5.A07
            java.lang.String r15 = r5.A0B
            int r4 = r5.A00
            java.lang.String r3 = r5.A0A
            X.76k r7 = r5.A01
            X.Nlp r8 = r5.A02
            java.lang.String r12 = "block_report"
            r17 = r4
            r16 = r3
            X.C319976rX.A03(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x0044:
            android.content.Context r10 = r2.A00
            androidx.fragment.app.FragmentActivity r3 = r2.A01
            java.lang.String r6 = r2.A07
            java.lang.String r5 = r2.A06
            if (r5 != 0) goto L_0x0052
            java.lang.String r5 = X.C49192Eqx.A00(r6)
        L_0x0052:
            org.json.JSONObject r4 = r2.A09
            X.G8B r7 = r2.A05
            java.lang.String r8 = r2.A08
            r11 = r9
            r13 = r7
            r14 = r6
            r15 = r5
            r16 = r4
            r17 = r1
            r12 = r0
            X.C49193Eqy.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = 1
            if (r1 == r0) goto L_0x00c0
            boolean r0 = X.0oI.A09(r10)
            if (r0 == 0) goto L_0x00bc
            X.0Tu r0 = X.0Tu.A05
            r4 = 36321438910653822(0x810a280000257e, double:3.033162449568196E-306)
            boolean r0 = X.182.A06(r0, r9, r4)
            if (r0 == 0) goto L_0x00bc
            X.8ab r2 = X.DbS.A0Y(r10)
            r0 = 2131958504(0x7f131ae8, float:1.9553622E38)
            java.lang.String r0 = X.DbW.A0h(r10, r8, r0)
            r2.A05 = r0
            r0 = 2131975315(0x7f135c93, float:1.9587719E38)
            r2.A08(r0)
            r2.A06()
            r0 = 5
        L_0x0091:
            X.C50036FJv.A00(r2, r7, r0)
            X.DbT.A1V(r2)
        L_0x0097:
            r2 = 2
            java.lang.String r0 = "profile"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00b5
            if (r20 == 0) goto L_0x00a4
            if (r1 != r2) goto L_0x00b5
        L_0x00a4:
            X.1Wj r2 = X.1Wj.A00
            if (r2 == 0) goto L_0x00b5
            boolean r0 = r10 instanceof android.app.Activity
            if (r0 == 0) goto L_0x00b5
            android.app.Activity r10 = (android.app.Activity) r10
            if (r20 != 0) goto L_0x00b9
            java.lang.String r0 = "276988983850056"
        L_0x00b2:
            r2.A03(r9, r10, r0)
        L_0x00b5:
            X.1Z5.A01(r3, r9, r1)
            return
        L_0x00b9:
            java.lang.String r0 = "2811804699078398"
            goto L_0x00b2
        L_0x00bc:
            X.FCZ.A02(r10, r7, r8, r1)
            goto L_0x0097
        L_0x00c0:
            X.8ab r2 = X.DbS.A0Y(r10)
            r0 = 2131958506(0x7f131aea, float:1.9553626E38)
            java.lang.String r0 = X.DbW.A0h(r10, r8, r0)
            X.0qQ.A0A(r0)
            r2.A05 = r0
            r0 = 2131958505(0x7f131ae9, float:1.9553624E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r10, r0)
            r2.A0q(r0)
            r2.A06()
            r0 = 6
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51055Fnl.D5T(int, boolean):void");
    }

    public final void onCancel() {
        1Wj r1;
        Context context = this.A00;
        UserSession userSession = this.A02;
        User user = this.A03;
        String str = this.A07;
        G8B g8b = this.A05;
        C49936FFp fFp = this.A04;
        if (g8b != null) {
            g8b.onCancel();
        }
        C49962FGu.A05(userSession, fFp, user.getId(), !user.CPV());
        if (str.equals("profile") && !user.CPV() && (r1 = 1Wj.A00) != null && (context instanceof Activity)) {
            r1.A03(userSession, (Activity) context, "754144705306599");
        }
    }
}
