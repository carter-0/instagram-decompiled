package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

public final class K83 extends MYR implements AnonymousClass4DS, C74380Ptv {
    public static final String __redex_internal_original_name = "BrandedContentSeeAllListFragment";
    public String A00 = "unknown";
    public List A01 = 0sn.A00;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final /* synthetic */ void Cqk(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        C63092KrL.A00(fragmentActivity, userSession, user, str);
    }

    public final void DWd(User user) {
        C358248ab A0U;
        int i;
        int i2;
        0qQ.A0B(user, 0);
        if (user.A03.Afa() == BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_ONCE_GRANTED) {
            A0U = DbW.A0U(this);
            A0U.A09(2131971987);
            A0U.A08(2131971986);
            i = 2131972005;
            i2 = 7;
        } else if (user.A03.AcG() == BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_PENDING) {
            A0U = DbW.A0U(this);
            A0U.A09(2131954149);
            A0U.A08(2131954148);
            i = 2131954147;
            i2 = 8;
        } else {
            return;
        }
        A0U.A0K(LV0.A00(user, this, i2), i);
        A0U.A0P((DialogInterface.OnClickListener) null, C358278ae.DEFAULT, 2131954150);
        DbT.A1V(A0U);
    }

    public final void configureActionBar(2da r3) {
        int i;
        0qQ.A0B(r3, 0);
        String str = this.A00;
        if (0qQ.A0K(str, "approve_creators")) {
            i = 2131953101;
        } else {
            if (0qQ.A0K(str, "request_approvals")) {
                i = 2131954164;
            }
            r3.Eu4(true);
        }
        r3.Eom(i);
        r3.Eu4(true);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x003e A[LOOP:0: B:5:0x0038->B:7:0x003e, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            r13 = this;
            r11 = 0
            X.0qQ.A0B(r14, r11)
            super.onViewCreated(r14, r15)
            r0 = 2131440786(0x7f0b3492, float:1.8503565E38)
            X.DbX.A1B(r14, r0)
            r0 = 2131431430(0x7f0b1006, float:1.8484589E38)
            android.widget.TextView r2 = X.DbU.A0G(r14, r0)
            r2.setVisibility(r11)
            java.lang.String r1 = r13.A00
            java.lang.String r0 = "approve_creators"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0056
            r0 = 2131953100(0x7f1305cc, float:1.9542661E38)
            X.DbU.A1G(r2, r13, r0)
            r0 = 2131953089(0x7f1305c1, float:1.954264E38)
        L_0x002a:
            java.lang.String r3 = r13.getString(r0)
        L_0x002e:
            java.util.List r0 = r13.A01
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0038:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006b
            com.instagram.user.model.User r8 = X.JTP.A0d(r1)
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
            X.GKw r5 = X.JUH.A00(r3)
            r6 = 0
            r12 = 1
            r10 = 1784(0x6f8, float:2.5E-42)
            X.N5z r4 = new X.N5z
            r7 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r2.add(r4)
            goto L_0x0038
        L_0x0056:
            java.lang.String r0 = "request_approvals"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0068
            r0 = 2131954163(0x7f1309f3, float:1.9544817E38)
            X.DbU.A1G(r2, r13, r0)
            r0 = 2131969279(0x7f1344ff, float:1.9575476E38)
            goto L_0x002a
        L_0x0068:
            java.lang.String r3 = ""
            goto L_0x002e
        L_0x006b:
            r13.A0B(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K83.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(K83 k83, Integer num, String str) {
        Long l;
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0O(k83, DbT.A0X(k83.A02)), "ig_branded_content_allowlisted_accounts_action_complete");
        A0e.A9F("creator_ig_id", DbV.A0q(str));
        DbS.A1J(A0e, "remove");
        if (num != null) {
            l = C51969G9p.A0r(num);
        } else {
            l = null;
        }
        A0e.A9F(TraceFieldType.ErrorCode, l);
        A0e.Cgf();
    }

    public final Collection getDefinitions() {
        return AnonymousClass7TE.A1I(new NOT(this, this, this, AnonymousClass7TE.A0l(this.A02)));
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(C66325MNi.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }
}
