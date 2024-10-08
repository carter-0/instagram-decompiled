package X;

import java.util.Map;

public abstract class SKS {
    public static final void A01(String str, Map map) {
        0qQ.A0B(str, 1);
        Pxe.A1U(RH0.A0S, str, map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(java.lang.String r4, java.util.Map r5, int r6) {
        /*
            r0 = -2
            if (r6 == r0) goto L_0x008c
            r0 = -1
            if (r6 == r0) goto L_0x0089
            r0 = 12
            if (r6 == r0) goto L_0x0089
            switch(r6) {
                case 1: goto L_0x007a;
                case 2: goto L_0x007d;
                case 3: goto L_0x008c;
                case 4: goto L_0x0080;
                case 5: goto L_0x007d;
                case 6: goto L_0x007d;
                case 7: goto L_0x0083;
                case 8: goto L_0x0086;
                default: goto L_0x000d;
            }
        L_0x000d:
            r3 = 0
        L_0x000e:
            r2 = 0
            if (r3 == 0) goto L_0x0077
            int r0 = r3.intValue()
            switch(r0) {
                case 1: goto L_0x0065;
                case 2: goto L_0x0068;
                case 3: goto L_0x006b;
                case 4: goto L_0x006e;
                case 5: goto L_0x0071;
                case 6: goto L_0x0074;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.String r0 = "The user has canceled the purchase to abort the transaction. Payment is not received and no entitlement will be granted."
        L_0x001a:
            java.lang.StringBuilder r1 = X.AnonymousClass7TF.A0n(r0)
            java.lang.String r0 = " Original Error Code: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " Debugging Message:"
            java.lang.String r1 = X.Pxg.A0s(r0, r4, r1)
            X.RH0 r0 = X.RH0.A0S
            X.Pxe.A1U(r0, r1, r5)
            X.RH0 r0 = X.RH0.A0R
            java.lang.String r1 = r0.A00
            if (r3 == 0) goto L_0x0049
            int r0 = r3.intValue()
            switch(r0) {
                case 1: goto L_0x004d;
                case 2: goto L_0x0051;
                case 3: goto L_0x0055;
                case 4: goto L_0x0059;
                case 5: goto L_0x005d;
                case 6: goto L_0x0061;
                default: goto L_0x003e;
            }
        L_0x003e:
            r0 = 4054001(0x3ddbf1, float:5.680865E-39)
        L_0x0041:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = r0.toString()
        L_0x0049:
            r5.put(r1, r2)
            return
        L_0x004d:
            r0 = 4054005(0x3ddbf5, float:5.680871E-39)
            goto L_0x0041
        L_0x0051:
            r0 = 4054006(0x3ddbf6, float:5.680872E-39)
            goto L_0x0041
        L_0x0055:
            r0 = 4054004(0x3ddbf4, float:5.68087E-39)
            goto L_0x0041
        L_0x0059:
            r0 = 4054009(0x3ddbf9, float:5.680877E-39)
            goto L_0x0041
        L_0x005d:
            r0 = 4054011(0x3ddbfb, float:5.68088E-39)
            goto L_0x0041
        L_0x0061:
            r0 = 4054008(0x3ddbf8, float:5.680875E-39)
            goto L_0x0041
        L_0x0065:
            java.lang.String r0 = "The product or subscription is not available for purchase."
            goto L_0x001a
        L_0x0068:
            java.lang.String r0 = "This error occurs when Google Billing experiences an error in their service."
            goto L_0x001a
        L_0x006b:
            java.lang.String r0 = "This error occurs when a network issue prevents the purchase from being processed by Google."
            goto L_0x001a
        L_0x006e:
            java.lang.String r0 = "This error occurs when a recent purchase action is likely pending fulfillment such that the server and local client are not in sync. A user is attempting to re-purchase a product they should already be granted."
            goto L_0x001a
        L_0x0071:
            java.lang.String r0 = "This error may occur when attempting to consume/update a purchase that is not owned by the user. "
            goto L_0x001a
        L_0x0074:
            java.lang.String r0 = "This error occurs when a billing error has occurred. This usually means the user need to update their Play Store/Google Service"
            goto L_0x001a
        L_0x0077:
            java.lang.String r0 = ""
            goto L_0x001a
        L_0x007a:
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            goto L_0x000e
        L_0x007d:
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            goto L_0x000e
        L_0x0080:
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            goto L_0x000e
        L_0x0083:
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y
            goto L_0x000e
        L_0x0086:
            java.lang.Integer r3 = X.AnonymousClass05K.A0j
            goto L_0x000e
        L_0x0089:
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            goto L_0x000e
        L_0x008c:
            java.lang.Integer r3 = X.AnonymousClass05K.A0u
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SKS.A02(java.lang.String, java.util.Map, int):void");
    }

    public static final void A00(C11230SGo sGo, Map map) {
        int i = sGo.A00;
        String str = sGo.A01;
        0qQ.A07(str);
        A02(str, map, i);
    }
}
