package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2oL  reason: invalid class name and case insensitive filesystem */
public final class C229812oL {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new C377209Ky(this, 36));

    public C229812oL(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A02(Integer num, String str) {
        Integer A012;
        0qQ.A0B(num, 1);
        if (C2817159d.A00(this.A00).booleanValue() && C266914aY.A02(num) && (A012 = AnonymousClass2oK.A01(str)) != null) {
            int intValue = A012.intValue();
            Integer num2 = AnonymousClass05K.A0C;
            02m A002 = A00();
            int i = 976033934;
            if (num == num2) {
                i = 976039145;
            }
            A002.markerEnd(i, intValue, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r3 = r16;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.lang.Integer r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            r14 = this;
            r7 = 1
            com.instagram.common.session.UserSession r0 = r14.A00
            java.lang.Boolean r0 = X.C2817159d.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0066
            boolean r0 = X.C266914aY.A02(r15)
            if (r0 == 0) goto L_0x0066
            r3 = r16
            java.lang.Integer r0 = X.AnonymousClass2oK.A01(r3)
            if (r0 == 0) goto L_0x0066
            int r6 = r0.intValue()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            java.lang.String r2 = "CONTAINER_MODULE"
            X.02m r4 = r14.A00()
            if (r0 != r15) goto L_0x0067
            r5 = 976039145(0x3a2d2ce9, float:6.6061184E-4)
            r8 = 600000(0x927c0, double:2.964394E-318)
            r4.markerStartForUserFlow(r5, r6, r7, r8)
            X.02m r1 = r14.A00()
            r9 = 976039145(0x3a2d2ce9, float:6.6061184E-4)
            java.lang.String r0 = "AD_DELIVERY"
            r1.markerPoint(r5, r6, r0)
            X.02m r1 = r14.A00()
            java.lang.String r0 = "AD_ID"
            r1.markerAnnotate(r5, r6, r0, r3)
            X.02m r1 = r14.A00()
            java.lang.String r0 = "MEDIA_ID"
            r3 = r17
            r1.markerAnnotate(r5, r6, r0, r3)
            X.02m r1 = r14.A00()
            java.lang.String r0 = "TRACKING_TOKEN"
            r3 = r18
            r1.markerAnnotate(r5, r6, r0, r3)
        L_0x005d:
            X.02m r0 = r14.A00()
            r1 = r19
            r0.markerAnnotate(r9, r6, r2, r1)
        L_0x0066:
            return
        L_0x0067:
            r9 = 976033934(0x3a2d188e, float:6.603085E-4)
            r12 = 600000(0x927c0, double:2.964394E-318)
            r8 = r4
            r10 = r6
            r11 = r7
            r8.markerStartForUserFlow(r9, r10, r11, r12)
            X.02m r1 = r14.A00()
            java.lang.String r0 = "NETEGO_DELIVERY"
            r1.markerPoint(r9, r6, r0)
            X.02m r1 = r14.A00()
            java.lang.String r0 = "NETEGO_ID"
            r1.markerAnnotate(r9, r6, r0, r3)
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229812oL.A04(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void A05(String str, Integer num, String str2) {
        Integer A012;
        0qQ.A0B(str2, 2);
        if (C2817159d.A00(this.A00).booleanValue() && C266914aY.A02(num) && (A012 = AnonymousClass2oK.A01(str)) != null) {
            int intValue = A012.intValue();
            Integer num2 = AnonymousClass05K.A0C;
            02m A002 = A00();
            int i = 976033934;
            if (num == num2) {
                i = 976039145;
            }
            A002.markerAnnotate(i, intValue, "FAILURE_REASON", str2);
            A00().markerEnd(i, intValue, 7952);
        }
    }

    private final 02m A00() {
        Object value = this.A01.getValue();
        0qQ.A07(value);
        return (02m) value;
    }

    public final void A01(Integer num, Integer num2, String str) {
        Integer A012;
        if (C2817159d.A00(this.A00).booleanValue() && C266914aY.A02(num) && (A012 = AnonymousClass2oK.A01(str)) != null) {
            int intValue = A012.intValue();
            Integer num3 = AnonymousClass05K.A0C;
            02m A002 = A00();
            String A003 = C55160HdC.A00(num2);
            int i = 976033934;
            if (num == num3) {
                i = 976039145;
            }
            A002.markerAnnotate(i, intValue, "FAILURE_REASON", A003);
            A00().markerEnd(i, intValue, 3);
        }
    }

    public final void A03(Integer num, String str) {
        Integer A012;
        int i;
        String str2;
        if (C2817159d.A00(this.A00).booleanValue() && C266914aY.A02(num) && (A012 = AnonymousClass2oK.A01(str)) != null) {
            int intValue = A012.intValue();
            Integer num2 = AnonymousClass05K.A0C;
            02m A002 = A00();
            if (num == num2) {
                i = 976039145;
                str2 = "AD_INSERTION_SUCCESS";
            } else {
                i = 976033934;
                str2 = "NETEGO_INSERTION_SUCCESS";
            }
            A002.markerPoint(i, intValue, str2);
        }
    }
}
