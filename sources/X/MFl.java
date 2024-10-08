package X;

import android.content.Context;
import android.util.SparseArray;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class MFl extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public final int A02 = 0;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFl(Context context, C279284yO r3, C59963JcW jcW, AnonymousClass3Q2 r5, String str, AnonymousClass4D7 r7, int i, int i2) {
        super(2, r7);
        this.A06 = jcW;
        this.A05 = r5;
        this.A04 = context;
        this.A01 = i;
        this.A00 = i2;
        this.A07 = str;
        this.A03 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MFl, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.MFl, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        AnonymousClass4D7 r6 = r11;
        if (this.A02 != 0) {
            C61013JvD jvD = (C61013JvD) this.A03;
            M0U m0u = (M0U) this.A04;
            return new MFl((Context) this.A05, m0u, jvD, (C62289KdN) this.A06, this.A07, r6);
        }
        Context context = (Context) this.A04;
        int i = this.A01;
        int i2 = this.A00;
        String str = this.A07;
        return new MFl(context, (C279284yO) this.A03, (C59963JcW) this.A06, (AnonymousClass3Q2) this.A05, str, r6, i, i2);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MFl, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.8vl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.8vj] */
    /* JADX WARNING: type inference failed for: r1v5, types: [X.8vp, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v0, types: [X.8vh, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        A6E a6e;
        AnonymousClass3Q2 r1;
        int i;
        if (this.A02 != 0) {
            Object obj2 = 1Hj.A02;
            int i2 = this.A01;
            boolean z = true;
            if (i2 == 0) {
                0eS.A00(obj);
                C62289KdN kdN = (C62289KdN) this.A06;
                FollowStatus A0N = kdN.A06.A0N(((C61013JvD) this.A03).A05);
                FollowStatus followStatus = FollowStatus.A06;
                C249513ju r7 = kdN.A0A;
                M0U m0u = (M0U) this.A04;
                if (A0N == followStatus) {
                    C62297KdV kdV = new C62297KdV(m0u, 2131965380);
                    this.A00 = 0;
                    this.A01 = 1;
                    if (r7.ELH(kdV, this) == obj2) {
                        return obj2;
                    }
                    i = 0;
                } else {
                    C62297KdV kdV2 = new C62297KdV(m0u, 2131965379);
                    this.A00 = 1;
                    this.A01 = 2;
                    if (r7.ELH(kdV2, this) == obj2) {
                        return obj2;
                    }
                    i = 1;
                }
            } else if (i2 == 1 || i2 == 2) {
                i = this.A00;
                0eS.A00(obj);
            } else {
                throw AnonymousClass7TE.A0x();
            }
            Context context = (Context) this.A05;
            C60262JiJ jiJ = (C60262JiJ) this.A06;
            UserSession userSession = jiJ.A04;
            C61013JvD jvD = (C61013JvD) this.A03;
            User user = jvD.A05;
            String str = this.A07;
            Object obj3 = this.A04;
            if (i == 0) {
                z = false;
            }
            C61497KAc kAc = new C61497KAc(3, obj3, jvD, jiJ, z);
            0qQ.A0B(context, 0);
            0qQ.A0B(user, 2);
            FH6.A08(context, (0xF) null, kAc, userSession, (1Xj) null, (AnonymousClass3W1) null, (UserDetailEntryInfo) null, (C243853aD) null, user, "live_viewer", (String) null, str, str, (JSONObject) null);
        } else {
            0eS.A00(obj);
            C59963JcW jcW = (C59963JcW) this.A06;
            PhotoSession A022 = JWE.A02(jcW.A0A);
            if (!((A022 == null || (a6e = A022.A06) == null) && ((r1 = (AnonymousClass3Q2) this.A05) == null || (a6e = r1.A18) == null))) {
                int i3 = this.A01;
                int i4 = this.A00;
                String str2 = this.A07;
                ? obj4 = new Object();
                obj4.A03 = a6e.A02;
                obj4.A02 = a6e.A01;
                obj4.A00 = a6e.A00;
                ? obj5 = new Object();
                obj5.A04 = obj4;
                obj5.A03 = new Object();
                ? obj6 = new Object();
                obj6.A02 = obj5;
                0eP A002 = ADR.A00.A00((Context) this.A04, jcW.A09, (C279284yO) this.A03, obj6, new C65015Lls(jcW, i3, i4), (AnonymousClass8BE) null, str2, (List) null, i3, i4, false);
                if (!AnonymousClass7TE.A1a(A002.A01)) {
                    C366648pR r12 = ((C366678pU) A002.A00).A01;
                    0qQ.A0B(r12, 0);
                    C366608pN r2 = r12.A04;
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    C366608pN r15 = new C366608pN(new SparseArray(), r2.A03, A1C, AnonymousClass7TE.A1E(), 0);
                    C366608pN.A02(r15, r2);
                    r15.A01 = false;
                    jcW.A0K.Epw(new C366648pR((AnonymousClass9IE) null, (C354988Od) null, (C366638pQ) null, (C366628pP) null, r15, (AnonymousClass802) null, (C2802550x) null));
                }
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MFl) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFl(Context context, M0U m0u, C61013JvD jvD, C62289KdN kdN, String str, AnonymousClass4D7 r7) {
        super(2, r7);
        this.A06 = kdN;
        this.A03 = jvD;
        this.A04 = m0u;
        this.A05 = context;
        this.A07 = str;
    }
}
