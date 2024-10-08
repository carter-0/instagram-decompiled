package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.3UI  reason: invalid class name */
public final class AnonymousClass3UI {
    public C266544Zk A00;
    public C266544Zk A01;
    public C266544Zk A02;
    public C266544Zk A03;
    public C266544Zk A04;
    public C250533lb A05;
    public AnonymousClass3UN A06;
    public AnonymousClass3UO A07;
    public AnonymousClass3UJ A08;
    public String A09;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r1.equals(r0) == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0038
            r2 = 0
            if (r5 == 0) goto L_0x001e
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x001e
            X.3UI r5 = (X.AnonymousClass3UI) r5
            java.lang.String r1 = r4.A09
            java.lang.String r0 = r5.A09
            if (r1 == 0) goto L_0x001f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0022
        L_0x001e:
            return r2
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            return r2
        L_0x0022:
            X.3UO r1 = r4.A07
            X.3UO r0 = r5.A07
            if (r1 != r0) goto L_0x001e
            X.3UN r1 = r4.A06
            X.3UN r0 = r5.A06
            if (r1 == 0) goto L_0x0035
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0038
            return r2
        L_0x0035:
            if (r0 == 0) goto L_0x0038
            return r2
        L_0x0038:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UI.equals(java.lang.Object):boolean");
    }

    public AnonymousClass3UI(C241303Or r41) {
        AnonymousClass3UJ r1;
        C250533lb F8M;
        C241263On r16;
        C241303Or r3 = r41;
        C241283Op r6 = r3.A06;
        if (r6 != null) {
            new 1E9(new 1hu((UserSession) null), 6, false);
            String str = r6.A09;
            String str2 = r6.A0A;
            String str3 = r6.A0B;
            C241273Oo r7 = r6.A01;
            Boolean bool = r6.A03;
            Boolean bool2 = r6.A04;
            String str4 = r6.A0C;
            Boolean bool3 = r6.A05;
            List list = r6.A0F;
            Integer num = r6.A08;
            List list2 = r6.A0G;
            List list3 = r6.A0H;
            C270814hL r13 = r6.A00;
            Float f = r6.A06;
            String str5 = r6.A0D;
            List list4 = r6.A0I;
            List list5 = r6.A0J;
            User user = r6.A02;
            String str6 = r6.A0E;
            Float f2 = r6.A07;
            new 1E9(new 1hu((UserSession) null), 6, false);
            if (r7 != null) {
                r16 = r7.F8o();
            } else {
                r16 = null;
            }
            r1 = new AnonymousClass3UJ((C266544Zk) null, r13 != null ? r13 : null, r16, (C270834hN) null, user, bool, bool2, bool3, f, f2, num, str, str2, str3, str4, (String) null, (String) null, str5, str6, list, list2, list3, list4, list5);
        } else {
            r1 = null;
        }
        this.A08 = r1;
        this.A02 = r3.A02;
        this.A00 = r3.A00;
        this.A03 = r3.A03;
        this.A04 = r3.A04;
        this.A01 = r3.A01;
        C67241sS r0 = r3.A05;
        if (r0 == null) {
            F8M = null;
        } else {
            F8M = r0.F8M();
        }
        this.A05 = F8M;
        A01();
    }

    public final AnonymousClass3UL A00() {
        AnonymousClass3UN r1 = this.A06;
        if (r1 instanceof AnonymousClass3UL) {
            return (AnonymousClass3UL) r1;
        }
        return null;
    }

    public final void A01() {
        String str;
        AnonymousClass3UO r0;
        AnonymousClass3UJ r02 = this.A08;
        if (r02 != null) {
            AnonymousClass3UL r1 = new AnonymousClass3UL(r02);
            this.A06 = r1;
            if (this.A08.A04 != null) {
                str = r1.A03.getId();
            }
            r0 = this.A06.C2m();
            this.A07 = r0;
        }
        C266544Zk r12 = this.A02;
        if (r12 == null && (r12 = this.A00) == null && (r12 = this.A03) == null && (r12 = this.A04) == null && (r12 = this.A01) == null) {
            0wb.A03("SuggestedItem", "Unknown SuggestedItem Type. PLEASE FIX ASAP BECAUSE YOU ARE SENDING UNKNOWN FEED ITEM JSON TO CLIENT.");
            r0 = AnonymousClass3UO.UNKNOWN;
            this.A07 = r0;
        }
        this.A06 = new C266904aX(r12);
        str = r12.A00;
        this.A09 = str;
        r0 = this.A06.C2m();
        this.A07 = r0;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.A09;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (527 + hashCode) * 31;
        AnonymousClass3UO r0 = this.A07;
        if (r0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r0.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        AnonymousClass3UN r02 = this.A06;
        if (r02 != null) {
            i = r02.hashCode();
        }
        return i3 + i;
    }

    public AnonymousClass3UI() {
    }
}
