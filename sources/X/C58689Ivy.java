package X;

/* renamed from: X.Ivy  reason: case insensitive filesystem */
public final class C58689Ivy extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58689Ivy(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public static C58689Ivy A00(C286575Wy r1, Object obj, Object obj2, int i) {
        C58689Ivy ivy = new C58689Ivy(i, obj, obj2);
        r1.FLL(ivy);
        return ivy;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x019c, code lost:
        X.C52369GPq.A02(r1, r2, r2.A00);
        X.DbS.A1U(r7.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01b1, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b6, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x005b;
                case 1: goto L_0x0063;
                case 2: goto L_0x006b;
                case 3: goto L_0x0063;
                case 4: goto L_0x007e;
                case 5: goto L_0x005b;
                case 6: goto L_0x005b;
                case 7: goto L_0x005b;
                case 8: goto L_0x005b;
                case 9: goto L_0x0089;
                case 10: goto L_0x009a;
                case 11: goto L_0x005b;
                case 12: goto L_0x0005;
                case 13: goto L_0x0005;
                case 14: goto L_0x0005;
                case 15: goto L_0x00a6;
                case 16: goto L_0x00ae;
                case 17: goto L_0x0005;
                case 18: goto L_0x0024;
                case 19: goto L_0x0005;
                case 20: goto L_0x00c8;
                case 21: goto L_0x0041;
                case 22: goto L_0x00d7;
                case 23: goto L_0x0041;
                case 24: goto L_0x00df;
                case 25: goto L_0x00e7;
                case 26: goto L_0x0041;
                case 27: goto L_0x005b;
                case 28: goto L_0x005b;
                case 29: goto L_0x00ef;
                case 30: goto L_0x0005;
                case 31: goto L_0x0005;
                case 32: goto L_0x0063;
                case 33: goto L_0x0063;
                case 34: goto L_0x0041;
                case 35: goto L_0x005b;
                case 36: goto L_0x00fb;
                case 37: goto L_0x0005;
                case 38: goto L_0x010e;
                case 39: goto L_0x0005;
                case 40: goto L_0x018f;
                case 41: goto L_0x0196;
                case 42: goto L_0x01a7;
                case 43: goto L_0x0063;
                case 44: goto L_0x0005;
                case 45: goto L_0x0041;
                case 46: goto L_0x0005;
                case 47: goto L_0x0041;
                case 48: goto L_0x005b;
                case 49: goto L_0x005b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = r0.invoke()
            if (r0 != 0) goto L_0x0023
        L_0x0011:
            java.lang.Object r0 = r7.A02
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0058
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0058
            X.2YQ r0 = r1.getDefaultViewModelCreationExtras()
        L_0x0023:
            return r0
        L_0x0024:
            java.lang.Object r0 = r7.A01
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0038
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0038
            X.2YM r0 = r1.getDefaultViewModelProviderFactory()
            if (r0 != 0) goto L_0x0023
        L_0x0038:
            java.lang.Object r0 = r7.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.2YM r0 = r0.getDefaultViewModelProviderFactory()
            return r0
        L_0x0041:
            java.lang.Object r0 = r7.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x004d
            java.lang.Object r0 = r0.invoke()
            if (r0 != 0) goto L_0x0023
        L_0x004d:
            java.lang.Object r0 = r7.A02
            androidx.fragment.app.FragmentActivity r0 = X.DbT.A0E(r0)
            X.2YQ r0 = r0.getDefaultViewModelCreationExtras()
            return r0
        L_0x0058:
            X.2YP r0 = X.AnonymousClass2YP.A00
            return r0
        L_0x005b:
            java.lang.Object r1 = r7.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r7.A01
            goto L_0x01b1
        L_0x0063:
            java.lang.Object r1 = r7.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r7.A02
            goto L_0x01b1
        L_0x006b:
            java.lang.Object r2 = r7.A01
            com.instagram.api.schemas.AchievementIntf r2 = (com.instagram.api.schemas.AchievementIntf) r2
            com.instagram.api.schemas.AchievementButtonInfo r1 = r2.BqT()
            if (r1 == 0) goto L_0x01b4
            java.lang.Object r0 = r7.A02
            X.0sL r0 = (X.0sL) r0
            r0.invoke(r2, r1)
            goto L_0x01b4
        L_0x007e:
            java.lang.Object r1 = r7.A02
            if (r1 == 0) goto L_0x01b4
            java.lang.Object r0 = r7.A01
            X.C51965G9l.A1W(r0, r1)
            goto L_0x01b4
        L_0x0089:
            java.lang.Object r1 = r7.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r7.A01
            com.instagram.api.schemas.CloseToEarningAchievementMediaIntf r0 = (com.instagram.api.schemas.CloseToEarningAchievementMediaIntf) r0
            java.lang.String r0 = r0.getMediaId()
            r1.invoke(r0)
            goto L_0x01b4
        L_0x009a:
            java.lang.Object r1 = r7.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r7.A01
            X.GnA r0 = (X.C53380GnA) r0
            java.lang.String r0 = r0.A02
            goto L_0x01b1
        L_0x00a6:
            java.lang.Object r2 = r7.A01
            X.GPq r2 = (X.C52369GPq) r2
            X.HOt r1 = X.C54688HOt.A0Y
            goto L_0x019c
        L_0x00ae:
            java.lang.Object r2 = r7.A02
            X.GPq r2 = (X.C52369GPq) r2
            X.HOt r1 = X.C54688HOt.A0b
            java.lang.String r0 = r2.A00
            X.C52369GPq.A02(r1, r2, r0)
            java.lang.String r0 = "https://help.instagram.com/1164300158112141"
            android.net.Uri r1 = X.0cp.A03(r0)
            java.lang.Object r0 = r7.A01
            android.content.Context r0 = (android.content.Context) r0
            X.0kR.A0F(r0, r1)
            goto L_0x01b4
        L_0x00c8:
            java.lang.Object r0 = r7.A02
            X.7Yq r0 = (X.C333357Yq) r0
            X.0xa r1 = r0.A01
            java.lang.Object r0 = r7.A01
            X.0xZ r0 = (X.0xZ) r0
            r1.FJ1(r0)
            goto L_0x01b4
        L_0x00d7:
            java.lang.Object r2 = r7.A01
            X.GPq r2 = (X.C52369GPq) r2
            X.HOt r1 = X.C54688HOt.A0K
            goto L_0x019c
        L_0x00df:
            java.lang.Object r2 = r7.A01
            X.GPq r2 = (X.C52369GPq) r2
            X.HOt r1 = X.C54688HOt.A02
            goto L_0x019c
        L_0x00e7:
            java.lang.Object r2 = r7.A01
            X.GPq r2 = (X.C52369GPq) r2
            X.HOt r1 = X.C54688HOt.A03
            goto L_0x019c
        L_0x00ef:
            java.lang.Object r1 = r7.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r7.A02
            java.lang.Object r0 = X.C51966G9m.A17(r0)
            goto L_0x01b1
        L_0x00fb:
            java.lang.Object r3 = r7.A02
            X.0sK r3 = (X.0sK) r3
            java.lang.Object r0 = r7.A01
            X.GlE r0 = (X.C53266GlE) r0
            java.lang.String r2 = r0.A00
            java.lang.String r1 = r0.A02
            java.lang.String r0 = r0.A01
            r3.invoke(r2, r1, r0)
            goto L_0x01b4
        L_0x010e:
            java.lang.Object r6 = r7.A02
            X.H0G r6 = (X.H0G) r6
            X.0eM r0 = r6.A00
            java.lang.Object r1 = r0.getValue()
            X.GPq r1 = (X.C52369GPq) r1
            X.HOi r0 = X.C54677HOi.DELETE_AI
            r1.A04(r0)
            java.lang.Object r0 = r7.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            X.GnI r0 = (X.C53386GnI) r0
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x0173
            r5 = 2
            X.0eM r0 = r6.A02
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "creator_ai_entry_point_extra"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            r4 = 0
            X.0eM r0 = r6.A01
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "creator_ai_creator_igid"
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r1)
            r3 = 1
            X.0eP[] r0 = new X.0eP[]{r2, r0}
            android.os.Bundle r0 = X.Q21.A00(r0)
            X.Gzs r2 = new X.Gzs
            r2.<init>()
            r2.A00 = r6
            r2.setArguments(r0)
            r2.setArguments(r0)
            X.0eM r0 = r6.A04
            X.7Pr r1 = X.DbX.A0f(r0)
            X.DbS.A1S(r1, r4)
            X.Wdh r0 = new X.Wdh
            r0.<init>(r5)
            r1.A0U = r0
            r1.A0v = r3
            r1.A0w = r3
            X.DbY.A13(r6, r2, r1)
            goto L_0x01b4
        L_0x0173:
            X.GhL r0 = X.G9w.A0Y(r6)
            X.05G r5 = r0.A0A
        L_0x0179:
            java.lang.Object r4 = r5.getValue()
            r3 = r4
            X.GnI r3 = (X.C53386GnI) r3
            r2 = 0
            r1 = 1
            r0 = 24575(0x5fff, float:3.4437E-41)
            X.GnI r0 = X.C53386GnI.A00((com.instagram.common.typedurl.ImageUrl) null, r2, r3, (X.C255943uy) null, (java.lang.String) null, (java.lang.String) null, r0, false, false, false, r1)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x0179
            goto L_0x01b4
        L_0x018f:
            java.lang.Object r2 = r7.A01
            X.GPq r2 = (X.C52369GPq) r2
            X.HOt r1 = X.C54688HOt.A0E
            goto L_0x019c
        L_0x0196:
            java.lang.Object r2 = r7.A01
            X.GPq r2 = (X.C52369GPq) r2
            X.HOt r1 = X.C54688HOt.A0D
        L_0x019c:
            java.lang.String r0 = r2.A00
            X.C52369GPq.A02(r1, r2, r0)
            java.lang.Object r0 = r7.A02
            X.DbS.A1U(r0)
            goto L_0x01b4
        L_0x01a7:
            java.lang.Object r1 = r7.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r7.A02
            X.GnI r0 = (X.C53386GnI) r0
            X.HNK r0 = r0.A03
        L_0x01b1:
            r1.invoke(r0)
        L_0x01b4:
            X.0gF r0 = X.C60340gF.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58689Ivy.invoke():java.lang.Object");
    }
}
