package X;

public final class MMD extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMD(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new MMD(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.K6H} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: X.K6i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: X.K76} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: X.K5B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: X.K5A} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: X.K6H} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: X.K6H} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: X.K6H} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v54, resolved type: X.K6H} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v55, resolved type: X.K6H} */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01c1, code lost:
        return new X.KDW(r1, X.AnonymousClass7TE.A0l(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01e1, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0214, code lost:
        return X.C63313Kuw.A00(X.AnonymousClass7TE.A0l(r0));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x0215;
                case 1: goto L_0x0206;
                case 2: goto L_0x0044;
                case 3: goto L_0x01f2;
                case 4: goto L_0x01e9;
                case 5: goto L_0x01e2;
                case 6: goto L_0x01c2;
                case 7: goto L_0x01b2;
                case 8: goto L_0x01aa;
                case 9: goto L_0x019d;
                case 10: goto L_0x01aa;
                case 11: goto L_0x0005;
                case 12: goto L_0x0192;
                case 13: goto L_0x0153;
                case 14: goto L_0x0225;
                case 15: goto L_0x014c;
                case 16: goto L_0x0145;
                case 17: goto L_0x013a;
                case 18: goto L_0x0132;
                case 19: goto L_0x0005;
                case 20: goto L_0x012a;
                case 21: goto L_0x0029;
                case 22: goto L_0x0122;
                case 23: goto L_0x0005;
                case 24: goto L_0x011a;
                case 25: goto L_0x00e8;
                case 26: goto L_0x0225;
                case 27: goto L_0x014c;
                case 28: goto L_0x0145;
                case 29: goto L_0x00aa;
                case 30: goto L_0x000c;
                case 31: goto L_0x00e0;
                case 32: goto L_0x00d8;
                case 33: goto L_0x0005;
                case 34: goto L_0x0225;
                case 35: goto L_0x014c;
                case 36: goto L_0x0145;
                case 37: goto L_0x00c0;
                case 38: goto L_0x00aa;
                case 39: goto L_0x00a2;
                case 40: goto L_0x0225;
                case 41: goto L_0x014c;
                case 42: goto L_0x0145;
                case 43: goto L_0x0092;
                case 44: goto L_0x0080;
                case 45: goto L_0x0071;
                case 46: goto L_0x0069;
                case 47: goto L_0x0061;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.A01
            X.07f r5 = X.C51971G9r.A0U(r0)
        L_0x000b:
            return r5
        L_0x000c:
            java.lang.Object r0 = r13.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "mk_select_entry_point"
            int r4 = r1.getInt(r0)
            X.KhP[] r3 = X.C62533KhP.values()
            int r2 = r3.length
            r1 = 0
        L_0x001e:
            if (r1 >= r2) goto L_0x0228
            r5 = r3[r1]
            int r0 = r5.A00
            if (r0 == r4) goto L_0x000b
            int r1 = r1 + 1
            goto L_0x001e
        L_0x0029:
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r1 = r0.mParentFragment
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.mediakit.ui.fragment.MediaKitFragment"
            X.0qQ.A0C(r1, r0)
            X.K6H r1 = (X.K6H) r1
            X.LDE r5 = r1.A0D
            if (r5 != 0) goto L_0x000b
            java.lang.String r0 = "mediaKitViewPointHelper"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0044:
            java.lang.Object r0 = r13.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "mk_select_tab_type"
            int r4 = r1.getInt(r0)
            X.KhX[] r3 = X.C62541KhX.values()
            int r2 = r3.length
            r1 = 0
        L_0x0056:
            if (r1 >= r2) goto L_0x022f
            r5 = r3[r1]
            int r0 = r5.A00
            if (r0 == r4) goto L_0x000b
            int r1 = r1 + 1
            goto L_0x0056
        L_0x0061:
            java.lang.Object r1 = r13.A01
            X.K5A r1 = (X.K5A) r1
            X.0eM r0 = r1.A04
            goto L_0x01b8
        L_0x0069:
            java.lang.Object r0 = r13.A01
            X.K5A r0 = (X.K5A) r0
            X.0eM r0 = r0.A04
            goto L_0x020c
        L_0x0071:
            java.lang.Object r1 = r13.A01
            X.K5A r1 = (X.K5A) r1
            X.JkJ r0 = new X.JkJ
            r0.<init>(r1)
            X.8Qm r5 = new X.8Qm
            r5.<init>(r0)
            return r5
        L_0x0080:
            java.lang.Object r0 = r13.A01
            X.K5A r0 = (X.K5A) r0
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.8Qm r0 = (X.C355568Qm) r0
            X.Jki r5 = new X.Jki
            r5.<init>(r0)
            return r5
        L_0x0092:
            java.lang.Object r1 = r13.A01
            X.KXh r1 = (X.KXh) r1
            X.0eM r0 = r1.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KCu r5 = new X.KCu
            r5.<init>(r0, r1)
            return r5
        L_0x00a2:
            java.lang.Object r0 = r13.A01
            X.KXh r0 = (X.KXh) r0
            X.0eM r0 = r0.A02
            goto L_0x020c
        L_0x00aa:
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.FragmentActivity r1 = X.DbT.A0E(r0)
            r0 = 50
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.3jo r1 = (X.C249453jo) r1
            X.2dZ r5 = r1.AYJ()
            return r5
        L_0x00c0:
            java.lang.Object r2 = r13.A01
            X.K5B r2 = (X.K5B) r2
            X.0eM r0 = r2.A0A
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r2.A08
            java.lang.Object r0 = r0.getValue()
            X.KhP r0 = (X.C62533KhP) r0
            X.KDV r5 = new X.KDV
            r5.<init>(r2, r1, r0)
            return r5
        L_0x00d8:
            java.lang.Object r1 = r13.A01
            X.K5B r1 = (X.K5B) r1
            X.0eM r0 = r1.A0A
            goto L_0x01b8
        L_0x00e0:
            java.lang.Object r0 = r13.A01
            X.K5B r0 = (X.K5B) r0
            X.0eM r0 = r0.A0A
            goto L_0x020c
        L_0x00e8:
            java.lang.Object r1 = r13.A01
            X.H1Q r1 = (X.H1Q) r1
            X.0eM r0 = r1.A06
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r1.A04
            java.lang.Object r3 = r0.getValue()
            X.KhX r3 = (X.C62541KhX) r3
            X.0eM r1 = r1.A05
            java.lang.Object r0 = r1.getValue()
            X.JjV r0 = (X.C60326JjV) r0
            X.0pa r2 = r0.A06
            java.lang.Object r1 = r1.getValue()
            X.JjV r1 = (X.C60326JjV) r1
            X.KhP r0 = r1.A02
            int r1 = X.C60326JjV.A00(r0, r1)
            r0 = 1
            if (r1 > r0) goto L_0x0114
            r0 = 0
        L_0x0114:
            X.EFO r5 = new X.EFO
            r5.<init>(r4, r3, r2, r0)
            return r5
        L_0x011a:
            java.lang.Object r1 = r13.A01
            X.K76 r1 = (X.K76) r1
            X.0eM r0 = r1.A06
            goto L_0x01b8
        L_0x0122:
            java.lang.Object r0 = r13.A01
            X.K76 r0 = (X.K76) r0
            X.0eM r0 = r0.A06
            goto L_0x020c
        L_0x012a:
            java.lang.Object r1 = r13.A01
            X.K6i r1 = (X.C61411K6i) r1
            X.0eM r0 = r1.A0D
            goto L_0x01b8
        L_0x0132:
            java.lang.Object r0 = r13.A01
            X.K6i r0 = (X.C61411K6i) r0
            X.0eM r0 = r0.A0D
            goto L_0x020c
        L_0x013a:
            java.lang.Object r1 = r13.A01
            X.K6i r1 = (X.C61411K6i) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            X.C64127LPb.A01(r1, r0)
            goto L_0x01df
        L_0x0145:
            java.lang.Object r0 = r13.A01
            X.07f r5 = X.DbY.A0I(r0)
            return r5
        L_0x014c:
            java.lang.Object r0 = r13.A01
            java.lang.Object r5 = X.DbT.A0r(r0)
            return r5
        L_0x0153:
            java.lang.Object r2 = r13.A01
            X.H1Q r2 = (X.H1Q) r2
            X.0eM r0 = r2.A06
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r2.A04
            java.lang.Object r10 = r0.getValue()
            X.KhX r10 = (X.C62541KhX) r10
            X.0eM r1 = r2.A05
            java.lang.Object r0 = r1.getValue()
            X.JjV r0 = (X.C60326JjV) r0
            X.0pa r11 = r0.A06
            android.content.Context r6 = r2.requireContext()
            X.0gy r8 = X.AnonymousClass07i.A00(r2)
            X.0h9 r7 = r2.mLifecycleRegistry
            X.0qQ.A07(r7)
            java.lang.Object r1 = r1.getValue()
            X.JjV r1 = (X.C60326JjV) r1
            X.KhP r0 = r1.A02
            int r0 = X.C60326JjV.A00(r0, r1)
            r12 = 1
            if (r0 > r12) goto L_0x018c
            r12 = 0
        L_0x018c:
            X.KEX r5 = new X.KEX
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        L_0x0192:
            java.lang.Object r0 = r13.A01
            X.K6H r0 = (X.K6H) r0
            X.0sa r0 = r0.A0F
            java.lang.Object r5 = r0.invoke()
            return r5
        L_0x019d:
            java.lang.Object r1 = r13.A01
            X.K6H r1 = (X.K6H) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A0X
            X.C64127LPb.A01(r1, r0)
            X.DbT.A1K(r1)
            goto L_0x01df
        L_0x01aa:
            java.lang.Object r1 = r13.A01
            X.K6H r1 = (X.K6H) r1
            r0 = 0
            r1.A08 = r0
            goto L_0x01df
        L_0x01b2:
            java.lang.Object r1 = r13.A01
            X.K6H r1 = (X.K6H) r1
            X.0eM r0 = r1.A0N
        L_0x01b8:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KDW r5 = new X.KDW
            r5.<init>(r1, r0)
            return r5
        L_0x01c2:
            java.lang.Object r3 = r13.A01
            X.K6H r3 = (X.K6H) r3
            X.7Pr r1 = X.K6H.A00(r3)
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            r1.A0B = r0
            X.7Pu r2 = r1.A00()
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.K42 r0 = new X.K42
            r0.<init>()
            r2.A02(r1, r0)
        L_0x01df:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x01e2:
            java.lang.Object r0 = r13.A01
            X.K6H r0 = (X.K6H) r0
            X.0eM r0 = r0.A0N
            goto L_0x020c
        L_0x01e9:
            java.lang.Object r1 = r13.A01
            r0 = 7
            X.LgJ r5 = new X.LgJ
            r5.<init>(r1, r0)
            return r5
        L_0x01f2:
            java.lang.Object r0 = r13.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r1 = r0.mParentFragment
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.mediakit.ui.fragment.MediaKitMediaPickerTabFragment"
            X.0qQ.A0C(r1, r0)
            X.K5B r1 = (X.K5B) r1
            X.0eM r0 = r1.A0B
            java.lang.Object r5 = r0.getValue()
            return r5
        L_0x0206:
            java.lang.Object r0 = r13.A01
            X.H1Q r0 = (X.H1Q) r0
            X.0eM r0 = r0.A06
        L_0x020c:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.LDW r5 = X.C63313Kuw.A00(r0)
            return r5
        L_0x0215:
            java.lang.Object r1 = r13.A01
            X.Joo r1 = (X.C60641Joo) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.view.View r1 = r1.A00
            r0 = 2131436466(0x7f0b23b2, float:1.8494803E38)
            android.view.View r5 = X.AnonymousClass7TF.A0G(r1, r0)
            return r5
        L_0x0225:
            java.lang.Object r5 = r13.A01
            return r5
        L_0x0228:
            java.lang.String r0 = "Invalid entrypoint for MediaKit Media selection"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x022f:
            java.lang.String r0 = "Invalid type for MediaKit tab"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MMD.invoke():java.lang.Object");
    }
}
