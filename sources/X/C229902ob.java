package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.2ob  reason: invalid class name and case insensitive filesystem */
public abstract class C229902ob extends C229912oc {
    public Integer A00;
    public boolean A01;
    public final long A02;
    public final 1Bk A03;
    public final UserSession A04;
    public final C229312nB A05;
    public final C229222n2 A06;
    public final AnonymousClass4DU A07;
    public final C229842oQ A08;
    public final Map A09;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.2n2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: X.2n2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: X.2n2} */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C229902ob(X.1Bk r6, com.instagram.common.session.UserSession r7, X.C229222n2 r8, X.AnonymousClass4DU r9, X.C229842oQ r10, int r11, long r12, boolean r14) {
        /*
            r5 = this;
            r2 = 0
            r3 = 0
            r0 = r11 & 8
            if (r0 == 0) goto L_0x0013
            X.1Bl r4 = X.1Bk.A03
            java.lang.String r1 = "merlin_impression"
            X.2z0 r0 = new X.2z0
            r0.<init>(r7, r1)
            X.1Bk r6 = r4.A01(r0)
        L_0x0013:
            r0 = r11 & 16
            if (r0 == 0) goto L_0x001e
            X.0nE r0 = X.C61410nE.A00
            X.2nB r2 = new X.2nB
            r2.<init>(r6, r0)
        L_0x001e:
            r0 = r11 & 32
            if (r0 == 0) goto L_0x002a
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MINUTES
            r0 = 1
            long r12 = r4.toMillis(r0)
        L_0x002a:
            r0 = r11 & 64
            if (r0 == 0) goto L_0x0033
            X.2r5 r8 = new X.2r5
            r8.<init>()
        L_0x0033:
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0079
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
        L_0x0039:
            r0 = r11 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0042
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
        L_0x0042:
            r0 = r11 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0047
            r14 = 0
        L_0x0047:
            r0 = 3
            X.0qQ.A0B(r10, r0)
            r0 = 4
            X.0qQ.A0B(r6, r0)
            r0 = 5
            X.0qQ.A0B(r2, r0)
            r0 = 7
            X.0qQ.A0B(r8, r0)
            r0 = 8
            X.0qQ.A0B(r1, r0)
            r0 = 9
            X.0qQ.A0B(r3, r0)
            r5.<init>(r7, r9, r10, r3)
            r5.A07 = r9
            r5.A04 = r7
            r5.A08 = r10
            r5.A03 = r6
            r5.A05 = r2
            r5.A02 = r12
            r5.A06 = r8
            r5.A00 = r1
            r5.A09 = r3
            r5.A01 = r14
            return
        L_0x0079:
            r1 = r3
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229902ob.<init>(X.1Bk, com.instagram.common.session.UserSession, X.2n2, X.4DU, X.2oQ, int, long, boolean):void");
    }

    public void A05(Context context, C254363sM r8, Object obj, String str) {
        0qQ.A0B(str, 3);
        if (r8 != null && context != null && (!00l.A0W(str))) {
            1Ua A002 = 1UX.A00(context, this.A04);
            0qQ.A07(A002);
            List<C254303sG> list = ((C254353sL) r8).A06;
            ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
            for (C254303sG r0 : list) {
                arrayList.add(r0.A01);
            }
            C254323sI r02 = (C254323sI) 00k.A0J(arrayList);
            if (r02 != null && C292955jn.A00(r02) >= 250) {
                A002.A02(002.A0R("NETEGO_VPV_KEY_PREFIX", str));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006f, code lost:
        r4.A03 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C254523sc A01(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.C230082ot
            if (r0 == 0) goto L_0x0084
            r3 = r12
            X.2ot r3 = (X.C230082ot) r3
            X.3O9 r13 = (X.AnonymousClass3O9) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
            boolean r0 = r3.A01
            r5 = 0
            if (r0 == 0) goto L_0x0082
            android.content.Context r1 = r3.A00
            com.instagram.common.session.UserSession r0 = r3.A04
            X.1Ua r2 = X.1UX.A00(r1, r0)
            java.lang.String r1 = "NETEGO_VPV_KEY_PREFIX"
            java.lang.String r0 = r13.getId()
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = ""
        L_0x0024:
            java.lang.String r0 = X.002.A0R(r1, r0)
            boolean r0 = r2.A03(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x0030:
            X.4DU r3 = r3.A07
            java.lang.String r2 = "impression"
            X.3sc r0 = new X.3sc
            r0.<init>(r3, r2)
            java.lang.String r6 = r13.getId()
            if (r6 == 0) goto L_0x0118
            java.lang.String r10 = r3.getModuleName()
            java.lang.Integer r2 = r13.BVp()
            if (r2 == 0) goto L_0x0052
            int r2 = r2.intValue()
            long r2 = (long) r2
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
        L_0x0052:
            java.lang.String r8 = r13.C9L()
            r7 = 0
            r11 = 64486(0xfbe6, float:9.0364E-41)
            X.5jj r4 = new X.5jj
            r9 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            X.1UQ r2 = r13.B5J()
            int r3 = r2.ordinal()
            java.lang.String r2 = "SUGGESTED_BUSINESSES"
            switch(r3) {
                case 2: goto L_0x006f;
                case 7: goto L_0x006f;
                case 8: goto L_0x006f;
                case 16: goto L_0x0076;
                case 18: goto L_0x007c;
                case 21: goto L_0x0071;
                case 33: goto L_0x0071;
                case 34: goto L_0x007f;
                case 38: goto L_0x0079;
                default: goto L_0x006d;
            }
        L_0x006d:
            java.lang.String r2 = "GENERIC_NETEGO"
        L_0x006f:
            r4.A03 = r2
        L_0x0071:
            r0.A0w = r4
            r0.A14 = r1
        L_0x0075:
            return r0
        L_0x0076:
            java.lang.String r2 = "GENERIC_SURVEY"
            goto L_0x006f
        L_0x0079:
            java.lang.String r2 = "RIFU_NETEGO"
            goto L_0x006f
        L_0x007c:
            java.lang.String r2 = "SIFU_NETEGO"
            goto L_0x006f
        L_0x007f:
            java.lang.String r2 = "BLOKS_NETEGO"
            goto L_0x006f
        L_0x0082:
            r1 = r5
            goto L_0x0030
        L_0x0084:
            boolean r0 = r12 instanceof X.C229892oa
            if (r0 == 0) goto L_0x00f2
            r5 = r12
            X.2oa r5 = (X.C229892oa) r5
            X.3UH r13 = (X.AnonymousClass3UH) r13
            r0 = 0
            X.0qQ.A0B(r13, r0)
            boolean r0 = r5.A02
            java.lang.String r4 = ""
            if (r0 == 0) goto L_0x00f0
            android.content.Context r1 = r5.A01
            com.instagram.common.session.UserSession r0 = r5.A04
            X.1Ua r2 = X.1UX.A00(r1, r0)
            java.lang.String r1 = "NETEGO_VPV_KEY_PREFIX"
            X.3O9 r0 = r5.A00
            if (r0 == 0) goto L_0x0120
            java.lang.String r0 = r0.getId()
            if (r0 != 0) goto L_0x00ac
            r0 = r4
        L_0x00ac:
            java.lang.String r0 = X.002.A0R(r1, r0)
            boolean r0 = r2.A03(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x00b8:
            X.4DU r3 = r5.A07
            java.lang.String r2 = "impression"
            X.3sc r0 = new X.3sc
            r0.<init>(r3, r2)
            X.3O9 r2 = r5.A00
            if (r2 == 0) goto L_0x0120
            java.lang.String r6 = r2.getId()
            if (r6 != 0) goto L_0x00cc
            r6 = r4
        L_0x00cc:
            X.1UQ r2 = r13.A05
            if (r2 != 0) goto L_0x00d2
            X.1UQ r2 = X.1UQ.A0v
        L_0x00d2:
            java.lang.String r7 = r2.name()
            r5 = 0
            java.lang.String r10 = r3.getModuleName()
            r11 = 64508(0xfbfc, float:9.0395E-41)
            X.5jj r4 = new X.5jj
            r8 = r5
            r9 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r2 = r13.A0I
            r4.A04 = r2
            java.lang.String r2 = r13.A0G
            r4.A02 = r2
            r4.A00 = r5
            goto L_0x0071
        L_0x00f0:
            r1 = 0
            goto L_0x00b8
        L_0x00f2:
            boolean r0 = r12 instanceof X.C235052zC
            if (r0 == 0) goto L_0x012a
            r4 = r12
            X.2zC r4 = (X.C235052zC) r4
            X.3dY r14 = (X.C245833dY) r14
            r0 = 0
            if (r14 == 0) goto L_0x0075
            X.3gp r3 = r14.A01
            boolean r1 = r3.A03()
            if (r1 != 0) goto L_0x0075
            X.3pr r2 = r3.A06
            X.3pr r1 = X.C252883pr.Success
            if (r2 != r1) goto L_0x0075
            X.2ww r1 = r4.A00
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.3sc r0 = r1.A01(r3, r0)
            return r0
        L_0x0118:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0120:
            java.lang.String r0 = "netegoItem"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x012a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229902ob.A01(java.lang.Object, java.lang.Object):X.3sc");
    }

    public String A02() {
        if ((this instanceof C235052zC) || (this instanceof C230082ot) || !(this instanceof C229892oa)) {
            return null;
        }
        AnonymousClass3O9 r0 = ((C229892oa) this).A00;
        if (r0 != null) {
            String id = r0.getId();
            if (id == null) {
                return "";
            }
            return id;
        }
        0qQ.A0F("netegoItem");
        throw AnonymousClass00P.createAndThrow();
    }

    public String A03() {
        if ((this instanceof C229892oa) || (this instanceof C230082ot)) {
            return "";
        }
        return "merlin_";
    }

    public String A04() {
        if (this instanceof C235052zC) {
            return AnonymousClass000.A00(4771);
        }
        return "feed_netego";
    }

    public final void ATF(AnonymousClass30Y r21, C252093oY r22) {
        float f;
        boolean z;
        C254353sL r3;
        C254523sc A012;
        Integer num;
        Integer num2;
        C229842oQ r4;
        String id;
        float CFe;
        long BlK;
        Integer num3;
        C254243sA r6;
        AnonymousClass30Y r0 = r21;
        C252093oY r1 = r22;
        if (this instanceof C234982yy) {
            C234982yy r2 = (C234982yy) this;
            0qQ.A0B(r0, 0);
            0qQ.A0B(r1, 1);
            if (r2.A00) {
                Integer CEk = r1.CEk(r0);
                0qQ.A07(CEk);
                int intValue = CEk.intValue();
                if (intValue == 0) {
                    num2 = AnonymousClass05K.A00;
                } else if (intValue != 1) {
                    num2 = AnonymousClass05K.A01;
                } else {
                    num2 = AnonymousClass05K.A0C;
                }
                int intValue2 = r1.CEk(r0).intValue();
                if (intValue2 == 0 || intValue2 == 1) {
                    r4 = r2.A08;
                    id = ((1Xj) r0.A03).getId();
                    if (id != null) {
                        CFe = r1.CFe(r0);
                        BlK = r1.BlK();
                        num3 = r2.A00;
                        r6 = null;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    r4 = r2.A08;
                    id = ((1Xj) r0.A03).getId();
                    if (id != null) {
                        BlK = r1.BlK();
                        num3 = r2.A00;
                        r6 = null;
                        CFe = 0.5f;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                r4.CoC(new C254263sC(r6, num2, num3, id, 0sn.A00, CFe, BlK, false, false));
                r2.A00(r0, r1);
                return;
            }
            return;
        }
        0qQ.A0B(r0, 0);
        0qQ.A0B(r1, 1);
        Integer CEk2 = r1.CEk(r0);
        Integer num4 = AnonymousClass05K.A00;
        if (CEk2 == num4) {
            String A0R = 002.A0R(A03(), this.A06.BK2(r0));
            C229312nB r7 = this.A05;
            if (!r7.A00.A0F(A0R)) {
                num = num4;
            } else if (r7.A03(A0R, this.A02)) {
                num = AnonymousClass05K.A01;
            } else {
                this.A00 = AnonymousClass05K.A0N;
            }
            this.A00 = num;
            r7.A02(A0R);
        }
        int intValue3 = r1.CEk(r0).intValue();
        if (intValue3 != 0) {
            if (intValue3 != 1) {
                num4 = AnonymousClass05K.A01;
            } else {
                num4 = AnonymousClass05K.A0C;
            }
        }
        float CFe2 = r1.CFe(r0);
        Map map = this.A09;
        String str = r0.A05;
        Number number = (Number) map.get(str);
        if (number != null) {
            f = number.floatValue();
        } else {
            f = -1.0f;
        }
        boolean z2 = false;
        if (r1.CEk(r0) == AnonymousClass05K.A01) {
            z2 = true;
        }
        if ((f >= 0.5f || CFe2 < 0.5f) && (f < 0.5f || CFe2 >= 0.5f)) {
            z = false;
        } else {
            z = true;
        }
        if ((!z2 || z) && (A012 = A01(r0.A03, r0.A04)) != null) {
            C229842oQ r72 = this.A08;
            AnonymousClass4DU r32 = this.A07;
            String A042 = A04();
            String A022 = A02();
            if (A022 == null) {
                A022 = str;
            }
            0qQ.A0A(A022);
            float CFe3 = r1.CFe(r0);
            long BlK2 = r1.BlK();
            r3 = r72.EAj(r32, new C254263sC(new C254563sg(A012), num4, this.A00, A022, 0sn.A00, CFe3, BlK2, false, false), A042, true);
        } else {
            r3 = null;
        }
        A00(r0, r1);
        if (this.A01 && r1.CEk(r0) == AnonymousClass05K.A0C) {
            A05((Context) null, r3, r0.A03, "");
        }
    }
}
