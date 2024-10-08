package X;

/* renamed from: X.EMx  reason: case insensitive filesystem */
public final class C47920EMx extends E4Z {
    public static final String __redex_internal_original_name = "CreatorRevshareAdsPreviewIntroFragment";
    public final AnonymousClass0eM A00 = C51791G2a.A00(this, 24);
    public final AnonymousClass0eM A01 = C51791G2a.A00(this, 25);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r17, android.view.ViewGroup r18, android.os.Bundle r19) {
        /*
            r16 = this;
            r0 = 355812106(0x1535430a, float:3.6605543E-26)
            int r5 = X.AnonymousClass0fD.A02(r0)
            r4 = 0
            r2 = r17
            X.0qQ.A0B(r2, r4)
            r0 = 2131624722(0x7f0e0312, float:1.8876632E38)
            r1 = r18
            android.view.View r10 = r2.inflate(r0, r1, r4)
            r11 = r16
            X.0eM r3 = r11.A01
            int r0 = X.Dba.A00(r3)
            r2 = 2
            if (r0 != r2) goto L_0x0106
            r1 = 2131963619(0x7f132ee3, float:1.9563997E38)
        L_0x0024:
            java.lang.String r12 = r11.getString(r1)
            X.0qQ.A0A(r12)
            int r0 = X.Dba.A00(r3)
            if (r0 != r2) goto L_0x00f6
            r1 = 2131963618(0x7f132ee2, float:1.9563994E38)
        L_0x0034:
            java.lang.String r13 = r11.getString(r1)
            X.0qQ.A0A(r13)
            int r1 = X.Dba.A00(r3)
            X.0eM r0 = r11.A02
            X.0lg r7 = X.DbT.A0X(r0)
            if (r1 != r2) goto L_0x00eb
            X.0Tu r6 = X.0Tu.A05
            r0 = 36878083852599447(0x83046c00080097, double:3.3851869522838805E-306)
        L_0x004e:
            java.lang.String r6 = X.182.A04(r6, r7, r0)
            X.0qQ.A0A(r6)
            java.lang.String r7 = "CreatorRevshareAdsPreviewIntroFragment"
            r8 = 0
            java.lang.String r1 = "impression"
            java.lang.String r0 = "feature_preview"
            r11.A04(r1, r0, r7, r8)
            r0 = 2131969165(0x7f13448d, float:1.9575245E38)
            java.lang.String r14 = r11.getString(r0)
            r0 = 15
            X.FOr r9 = new X.FOr
            r9.<init>((java.lang.String) r6, (java.lang.Object) r11, (int) r0)
            X.0sn r15 = X.0sn.A00
            X.C49003Enf.A00(r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = 2131969157(0x7f134485, float:1.9575229E38)
            java.lang.String r6 = X.DbU.A0m(r11, r0)
            r0 = 16
            X.FOr r1 = new X.FOr
            r1.<init>((java.lang.String) r6, (java.lang.Object) r11, (int) r0)
            X.0qQ.A0B(r10, r4)
            r4 = 2131428901(0x7f0b0625, float:1.847946E38)
            android.view.View r0 = r10.requireViewById(r4)
            X.61u r0 = (X.C3021461u) r0
            r0.setPrimaryAction(r6, r1)
            X.DlI r0 = r11.A03()
            X.2Fj r0 = r0.A02
            java.lang.Object r0 = r0.A02()
            X.Dr0 r0 = (X.Dr0) r0
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x00a4
            X.E4Z.A00(r10, r0)
        L_0x00a4:
            int r0 = X.Dba.A00(r3)
            if (r0 != r2) goto L_0x00d5
            r0 = 2131963603(0x7f132ed3, float:1.9563964E38)
            java.lang.String r3 = X.DbU.A0m(r11, r0)
            r0 = 2131963602(0x7f132ed2, float:1.9563962E38)
            android.text.SpannableStringBuilder r2 = X.DbY.A0E(r11, r3, r0)
            int r1 = X.Dbb.A06(r11)
            X.ESx r0 = new X.ESx
            r0.<init>((X.C47920EMx) r11, (int) r1)
            X.AnonymousClass7AV.A05(r2, r0, r3)
        L_0x00c4:
            X.AnonymousClass7TF.A1H(r10, r2)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = X.DbT.A0c(r10, r4)
            r0.setFooterText(r2)
            r0 = 1378851705(0x522f9b79, float:1.88556919E11)
            X.AnonymousClass0fD.A09(r0, r5)
            return r10
        L_0x00d5:
            X.0eM r0 = r11.A00
            boolean r1 = X.AnonymousClass7TF.A1Z(r0)
            r0 = 2131969156(0x7f134484, float:1.9575227E38)
            if (r1 == 0) goto L_0x00e3
            r0 = 2131969160(0x7f134488, float:1.9575235E38)
        L_0x00e3:
            java.lang.String r2 = r11.getString(r0)
            X.0qQ.A0A(r2)
            goto L_0x00c4
        L_0x00eb:
            X.0Tu r6 = X.DbS.A0J(r7, r4)
            r0 = 36878779637432518(0x83050e000a00c6, double:3.385626969414015E-306)
            goto L_0x004e
        L_0x00f6:
            X.0eM r0 = r11.A00
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            r1 = 2131963651(0x7f132f03, float:1.9564061E38)
            if (r0 == 0) goto L_0x0034
            r1 = 2131963698(0x7f132f32, float:1.9564157E38)
            goto L_0x0034
        L_0x0106:
            X.0eM r0 = r11.A00
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            r1 = 2131963652(0x7f132f04, float:1.9564063E38)
            if (r0 == 0) goto L_0x0024
            r1 = 2131963699(0x7f132f33, float:1.9564159E38)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47920EMx.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
