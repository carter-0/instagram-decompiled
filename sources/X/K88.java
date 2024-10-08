package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class K88 extends MYR implements AnonymousClass4DR, C74380Ptv {
    public static final String __redex_internal_original_name = "BrandedContentAddBrandPartnersSeeAllFragment";
    public C66424MRe A00;
    public String A01 = "feed";
    public List A02 = 0sn.A00;
    public List A03 = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final void DWd(User user) {
        0qQ.A0B(user, 0);
        C66424MRe mRe = this.A00;
        if (mRe == null) {
            JTO.A1K();
            throw AnonymousClass00P.createAndThrow();
        }
        this.A02 = mRe.DDn(new C63597Kzk(this), user);
        A00();
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0049, code lost:
        X.DbX.A1G(r5, X.C49946FGa.A02(r4, r3, __redex_internal_original_name, r1));
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0053, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0071, code lost:
        if (r0 == false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            r3 = 0
            X.0qQ.A0B(r7, r3)
            super.onViewCreated(r7, r8)
            r0 = 2131427505(0x7f0b00b1, float:1.8476628E38)
            android.view.View r2 = X.JTS.A0C(r7, r0)
            r0 = 2131427512(0x7f0b00b8, float:1.8476642E38)
            android.view.View r1 = r2.requireViewById(r0)
            r0 = 67
            X.LYC.A00(r1, r0, r6)
            r0 = 2131427515(0x7f0b00bb, float:1.8476648E38)
            int r1 = X.Dbb.A03(r2, r0)
            r0 = 2131440786(0x7f0b3492, float:1.8503565E38)
            X.DbT.A1F(r7, r0, r1)
            r0 = 2131431430(0x7f0b1006, float:1.8484589E38)
            android.widget.TextView r5 = X.DbU.A0G(r7, r0)
            r5.setVisibility(r3)
            androidx.fragment.app.FragmentActivity r4 = r6.requireActivity()
            X.0eM r0 = r6.A04
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r2 = "BrandedContentAddBrandPartnersSeeAllFragment"
            java.lang.String r1 = r6.A01
            int r0 = r1.hashCode()
            switch(r0) {
                case 3230752: goto L_0x005e;
                case 3496474: goto L_0x0068;
                case 109770997: goto L_0x0054;
                default: goto L_0x0046;
            }
        L_0x0046:
            r1 = 2131954133(0x7f1309d5, float:1.9544757E38)
        L_0x0049:
            android.text.SpannableStringBuilder r0 = X.C49946FGa.A02(r4, r3, r2, r1)
            X.DbX.A1G(r5, r0)
            r6.A00()
            return
        L_0x0054:
            java.lang.String r0 = "story"
            boolean r0 = r1.equals(r0)
            r1 = 2131954137(0x7f1309d9, float:1.9544765E38)
            goto L_0x0071
        L_0x005e:
            java.lang.String r0 = "igtv"
            boolean r0 = r1.equals(r0)
            r1 = 2131954134(0x7f1309d6, float:1.9544759E38)
            goto L_0x0071
        L_0x0068:
            java.lang.String r0 = "reel"
            boolean r0 = r1.equals(r0)
            r1 = 2131954136(0x7f1309d8, float:1.9544763E38)
        L_0x0071:
            if (r0 != 0) goto L_0x0049
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K88.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00() {
        C273014lo r7;
        C68210N5z n5z;
        List list = this.A03;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User A0d = JTP.A0d(it);
            if (AnonymousClass430.A02(AnonymousClass7TE.A0l(this.A04))) {
                n5z = new C68210N5z((C266444Yx) null, (C266444Yx) null, (C273014lo) null, A0d, AnonymousClass05K.A0Y, 1788, false, true);
            } else {
                Integer num = AnonymousClass05K.A0N;
                int i = 2131952258;
                if (this.A02.contains(A0d)) {
                    i = 2131969279;
                }
                GKO A0Q = JTP.A0Q(i);
                if (this.A02.contains(A0d)) {
                    r7 = C273014lo.SECONDARY;
                } else {
                    r7 = C273014lo.PRIMARY;
                }
                n5z = new C68210N5z(A0Q, (C266444Yx) null, r7, A0d, num, 2032, false, false);
            }
            A0r.add(n5z);
        }
        A0B(A0r);
    }

    public final Collection getDefinitions() {
        return AnonymousClass7TE.A1I(new NOT(this, this, this, AnonymousClass7TE.A0l(this.A04)));
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(C66320MNd.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void Cqk(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        C51974G9v.A1O(user, userSession, fragmentActivity, str);
        if (AnonymousClass430.A02(userSession)) {
            C66424MRe mRe = this.A00;
            if (mRe == null) {
                JTO.A1K();
                throw AnonymousClass00P.createAndThrow();
            }
            this.A02 = mRe.DDn(new C63597Kzk(this), user);
            A00();
            return;
        }
        C63092KrL.A00(fragmentActivity, userSession, user, str);
    }

    public final boolean onBackPressed() {
        DbX.A0N(requireActivity(), this.A04).A06();
        return true;
    }
}
