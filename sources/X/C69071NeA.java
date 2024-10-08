package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.NeA  reason: case insensitive filesystem */
public final class C69071NeA extends C252733pa implements C337237fw, C66514MUs {
    public C290645fe A00 = null;
    public String A01 = "";
    public final Context A02;
    public final UserSession A03;
    public final Oy6 A04;
    public final C336267eL A05;
    public final C336267eL A06;
    public final 05G A07;
    public final 05G A08;
    public final AnonymousClass0Ud A09;
    public final AnonymousClass0Ud A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69071NeA(Context context, UserSession userSession, Oy6 oy6, C336267eL r8, C336267eL r9) {
        super("search_interop", AnonymousClass43D.A00(359266386));
        0qQ.A0B(oy6, 5);
        this.A02 = context;
        this.A03 = userSession;
        this.A06 = r8;
        this.A05 = r9;
        this.A04 = oy6;
        02z A1J = JTO.A1J();
        this.A08 = A1J;
        this.A0A = A1J;
        02z A10 = C51970G9q.A10(false);
        this.A07 = A10;
        this.A09 = A10;
        C66181MGs.A02(this, this.A01, 6);
    }

    public final AnonymousClass0Ud BqH() {
        return this.A0A;
    }

    public final AnonymousClass0Ud CWW() {
        return this.A09;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dam(X.C337257fy r13) {
        /*
            r12 = this;
            java.lang.String r1 = r12.A01
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x008f
            X.7eL r3 = r12.A06
            java.lang.String r0 = r3.BiY()
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x008f
            X.7eL r2 = r12.A05
            if (r2 == 0) goto L_0x0024
            java.lang.String r1 = r2.BiY()
            java.lang.String r0 = r12.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x008f
        L_0x0024:
            java.lang.Object r0 = r3.Bo1()
            java.util.List r0 = (java.util.List) r0
            if (r2 == 0) goto L_0x0092
            java.lang.Object r1 = r2.Bo1()
            java.util.List r1 = (java.util.List) r1
        L_0x0032:
            android.content.Context r6 = r12.A02
            com.instagram.common.session.UserSession r5 = r12.A03
            if (r0 != 0) goto L_0x003a
            X.0sn r0 = X.0sn.A00
        L_0x003a:
            java.util.ArrayList r3 = X.C46503Dg6.A01(r6, r5, r0)
            r8 = 1
            if (r1 == 0) goto L_0x004e
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x004e
            java.util.ArrayList r0 = X.O0E.A00(r5, r1)
            r3.addAll(r0)
        L_0x004e:
            java.lang.String r0 = r12.A01
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0090
            X.5fe r1 = r12.A00
            X.2Dm r0 = X.2L2.A00(r5)
            java.lang.String r4 = "direct_user_search_nullstate"
            r7 = 0
            X.FBo r2 = new X.FBo
            r2.<init>(r6, r1, r5, r0)
            java.lang.String r1 = r12.A01
            java.lang.String r0 = "direct_user_search_keypressed"
            r2.A02(r1, r0, r4)
            X.Oy6 r6 = r12.A04
            java.util.ArrayList r0 = r2.A00(r8)
            int r0 = r0.size()
            long r10 = (long) r0
            r9 = r7
            r6.A00(r7, r8, r9, r10)
        L_0x007a:
            X.05G r1 = r12.A08
            if (r2 == 0) goto L_0x0087
            java.lang.String r0 = r12.A01
            java.util.List r0 = r2.A01(r3, r0)
            if (r0 == 0) goto L_0x0087
            r3 = r0
        L_0x0087:
            r1.Epw(r3)
            X.05G r0 = r12.A07
            X.AnonymousClass7TF.A1O(r0, r8)
        L_0x008f:
            return
        L_0x0090:
            r2 = 0
            goto L_0x007a
        L_0x0092:
            r1 = 0
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69071NeA.Dam(X.7fy):void");
    }

    public final void FLH(String str) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.A01 = str2;
        AnonymousClass7TE.A1Z(new C66187MGy(this, str, (AnonymousClass4D7) null, 24), this.A01);
    }
}
