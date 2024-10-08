package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lqm  reason: case insensitive filesystem */
public final class C65293Lqm implements MXS {
    public final Context A00;
    public final UserSession A01;
    public final MSM A02;
    public final DirectShareTarget A03;
    public final String A04;
    public final ArrayList A05;
    public final ArrayList A06;
    public final boolean A07;
    public final AnonymousClass0iw A08;
    public final String A09;

    public C65293Lqm(Context context, AnonymousClass0iw r3, UserSession userSession, MSM msm, DirectShareTarget directShareTarget, String str, String str2, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A05 = arrayList;
        this.A06 = arrayList2;
        this.A03 = directShareTarget;
        this.A02 = msm;
        this.A07 = z;
        this.A04 = str;
        this.A08 = r3;
        this.A09 = str2;
    }

    public final int BtD() {
        return 3;
    }

    public final boolean CKn(DirectShareTarget directShareTarget) {
        0qQ.A0B(directShareTarget, 0);
        return 0qQ.A0K(this.A03, directShareTarget);
    }

    public static final void A00(C65293Lqm lqm) {
        Context context = lqm.A00;
        C59689JTv.A03(context, context.getResources().getString(2131960342), "direct_share_video_failure", 0);
    }

    public final List AxF() {
        return AnonymousClass7TE.A1I(this.A03);
    }

    public final void EM2() {
        0sn r1 = this.A06;
        0sn r10 = r1;
        if (r1 == null) {
            r1 = 0sn.A00;
        }
        0sn r0 = this.A05;
        0sn r9 = r0;
        if (r0 == null) {
            r0 = 0sn.A00;
        }
        if (00k.A0S(r0, r1).size() > 1 && "830547164036012".equals(this.A09)) {
            UserSession userSession = this.A01;
            if (182.A06(0Tu.A05, userSession, 36325149762400928L)) {
                1a8 r7 = new 1a8((C269794fh) null);
                DirectShareTarget directShareTarget = this.A03;
                C254743sy A062 = AnonymousClass6W3.A06(directShareTarget.A01());
                String valueOf = String.valueOf(AnonymousClass0HN.A00());
                if (AnonymousClass6W3.A08(directShareTarget.A01()) && A062 != null) {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    if (r9 != null) {
                        Iterator it = r9.iterator();
                        while (it.hasNext()) {
                            ((1GK) it.next()).A04(new C64841Lj3(this, A1C, 0), AnonymousClass6OG.A01);
                        }
                    }
                    if (r10 != null) {
                        Iterator it2 = r10.iterator();
                        while (it2.hasNext()) {
                            ((1GK) it2.next()).A04(new C64841Lj3(this, A1C, 1), AnonymousClass6OG.A01);
                        }
                    }
                    C333547Zj A002 = C70172NyQ.A00(userSession, directShareTarget.A01());
                    boolean z = this.A07;
                    r7.A02(A002.EM5((C53401GnY) null, (OCA) null, A062, "share_extension", valueOf, (String) null, A1C, z).A0P(C318146oT.A01), C73039PTw.A00);
                    String str = this.A04;
                    if (!(str == null || str.length() == 0)) {
                        JTS.A0O(userSession, directShareTarget).EMx(C69343Nji.MEDIA, directShareTarget, (Boolean) null, str, "share_extension", (String) null, z);
                    }
                    this.A02.DuY();
                }
                return;
            }
        }
        int i = 0;
        if (r9 != null) {
            Iterator it3 = r9.iterator();
            int i2 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    break;
                }
                ((1GK) next).A04(new C64840Lj2(this, i2, 0), AnonymousClass6OG.A01);
                i2 = i3;
            }
            0sr.A1T();
            throw AnonymousClass00P.createAndThrow();
        }
        if (r10 != null) {
            Iterator it4 = r10.iterator();
            while (it4.hasNext()) {
                Object next2 = it4.next();
                int i4 = i + 1;
                if (i >= 0) {
                    ((1GK) next2).A04(new C64840Lj2(this, i, 1), AnonymousClass6OG.A01);
                    i = i4;
                } else {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        this.A02.DuY();
    }
}
