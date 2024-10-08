package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.CompoundButton;
import com.instagram.android.R;
import java.util.ArrayList;

/* renamed from: X.Nga  reason: case insensitive filesystem */
public final class C69184Nga extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "EncryptedBackupsSettingsFragment";
    public C62320sa A00 = new C73926Pm6(this, 21);
    public C62320sa A01;
    public final C46448DfA A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
        if (0 <= r6) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        r2 = java.lang.String.valueOf(r7);
        r1 = X.002.A03(r7, " days");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        if (r7 != 0) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        r1 = X.AnonymousClass7TF.A0n(r1);
        r0 = " (cutover)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        r1 = X.AnonymousClass7TF.A0l(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0064, code lost:
        X.DbV.A1V(r2, r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0067, code lost:
        if (r7 == r6) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        r0 = r8.A03;
        r11 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
        if (r0.contains(r11) == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0078, code lost:
        r1 = X.AnonymousClass7TF.A0n(r1);
        r0 = " (introduce)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0085, code lost:
        if (r8.A07.contains(r11) == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0087, code lost:
        r1 = X.AnonymousClass7TF.A0n(r1);
        r0 = " (sell)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0094, code lost:
        if (r8.A08.contains(r11) == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0096, code lost:
        r1 = X.AnonymousClass7TF.A0n(r1);
        r0 = " (warn)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009f, code lost:
        if (r7 != r8.A00) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a1, code lost:
        r1 = X.AnonymousClass7TF.A0n(r1);
        r0 = " (block)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        X.DbU.A1F(new X.C71473OlH(3, r12, r5), java.lang.String.valueOf(r9.A06()), r3, r5);
        r5 = new X.C70971OTs(X.AnonymousClass7TE.A0l(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d1, code lost:
        if (X.AnonymousClass65A.A02(X.C66581MXm.A0S(r12.A04), 36315949951487803L) == false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d3, code lost:
        if (r13 == null) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00db, code lost:
        if (r13.intValue() < r5.A00) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dd, code lost:
        r1 = new X.FGF((java.lang.CharSequence) "Override Days After Block");
        r1.A01 = com.instagram.android.R.style.igds_emphasized_body_1;
        r1.A03 = com.instagram.android.R.dimen.action_bar_item_spacing_right;
        r0 = new X.C70971OTs(X.C66581MXm.A0R(r1, r3, r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f7, code lost:
        if (r15 != false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f9, code lost:
        r6 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fb, code lost:
        r5 = X.AnonymousClass7TE.A1C();
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0103, code lost:
        if (0 > r6) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0105, code lost:
        r9 = java.lang.String.valueOf(r0);
        r8 = X.002.A0A(r0, " days");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0111, code lost:
        if (r0 != r6) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0113, code lost:
        r8 = X.002.A0R(r8, " (release block UI)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0119, code lost:
        X.DbV.A1V(r9, r8, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011e, code lost:
        if (r0 == r6) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0120, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0124, code lost:
        r6 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0127, code lost:
        X.DbU.A1F(new X.C71473OlH(2, r12, r5), java.lang.String.valueOf(X.C66583MXo.A0c(new X.C67458MoD(X.AnonymousClass7TE.A0l(r10)).A00.getInt("EB_BlOCK_FIRST_SHOWN_TIMESTAMP_OVERRIDE_MS", 99999), 99999)), r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0043, code lost:
        if (r1 != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0048, code lost:
        if (r1 == false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A0B(X.C69184Nga r12, java.lang.Integer r13, boolean r14, boolean r15) {
        /*
            r4 = 2
            X.0eM r0 = r12.A05
            java.lang.Object r3 = r0.getValue()
            java.lang.String r2 = "Override Cutover Timestamp"
            r0 = 4
            X.OlD r1 = new X.OlD
            r1.<init>(r12, r0)
            X.PR9 r0 = new X.PR9
            r0.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r1, (java.lang.CharSequence) r2, (boolean) r14)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            java.util.ArrayList r3 = X.0sr.A1M(r0)
            if (r14 == 0) goto L_0x014b
            X.0eM r10 = r12.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r10)
            X.MoD r9 = new X.MoD
            r9.<init>(r0)
            X.0xa r1 = r9.A00
            java.lang.String r0 = "EB_BLOCKSTORE_SETUP_FAILED"
            r2 = 0
            boolean r1 = r1.getBoolean(r0, r2)
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r10)
            X.OTs r8 = new X.OTs
            r8.<init>(r0)
            r6 = 0
            if (r15 != 0) goto L_0x0045
            r7 = -7
            if (r1 == 0) goto L_0x004e
        L_0x0045:
            r7 = 0
            if (r15 != 0) goto L_0x004a
            if (r1 == 0) goto L_0x004e
        L_0x004a:
            int r6 = r8.A00
            if (r2 > r6) goto L_0x00a8
        L_0x004e:
            java.lang.String r2 = java.lang.String.valueOf(r7)
            java.lang.String r0 = " days"
            java.lang.String r1 = X.002.A03(r7, r0)
            if (r7 != 0) goto L_0x006c
            java.lang.StringBuilder r1 = X.AnonymousClass7TF.A0n(r1)
            java.lang.String r0 = " (cutover)"
        L_0x0060:
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r0, r1)
        L_0x0064:
            X.DbV.A1V(r2, r1, r5)
            if (r7 == r6) goto L_0x00a8
            int r7 = r7 + 1
            goto L_0x004e
        L_0x006c:
            java.util.List r0 = r8.A03
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r0 = r0.contains(r11)
            if (r0 == 0) goto L_0x007f
            java.lang.StringBuilder r1 = X.AnonymousClass7TF.A0n(r1)
            java.lang.String r0 = " (introduce)"
            goto L_0x0060
        L_0x007f:
            java.util.List r0 = r8.A07
            boolean r0 = r0.contains(r11)
            if (r0 == 0) goto L_0x008e
            java.lang.StringBuilder r1 = X.AnonymousClass7TF.A0n(r1)
            java.lang.String r0 = " (sell)"
            goto L_0x0060
        L_0x008e:
            java.util.List r0 = r8.A08
            boolean r0 = r0.contains(r11)
            if (r0 == 0) goto L_0x009d
            java.lang.StringBuilder r1 = X.AnonymousClass7TF.A0n(r1)
            java.lang.String r0 = " (warn)"
            goto L_0x0060
        L_0x009d:
            int r0 = r8.A00
            if (r7 != r0) goto L_0x0064
            java.lang.StringBuilder r1 = X.AnonymousClass7TF.A0n(r1)
            java.lang.String r0 = " (block)"
            goto L_0x0060
        L_0x00a8:
            java.lang.Integer r0 = r9.A06()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            r1 = 3
            X.OlH r0 = new X.OlH
            r0.<init>(r1, r12, r5)
            X.DbU.A1F(r0, r2, r3, r5)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r10)
            X.OTs r5 = new X.OTs
            r5.<init>(r0)
            X.0eM r0 = r12.A04
            com.instagram.common.session.UserSession r2 = X.C66581MXm.A0S(r0)
            r0 = 36315949951487803(0x81052a008a0f3b, double:3.029691209689341E-306)
            boolean r0 = X.AnonymousClass65A.A02(r2, r0)
            if (r0 == 0) goto L_0x014b
            if (r13 == 0) goto L_0x014b
            int r1 = r13.intValue()
            int r0 = r5.A00
            if (r1 < r0) goto L_0x014b
            java.lang.String r0 = "Override Days After Block"
            X.FGF r1 = new X.FGF
            r1.<init>((java.lang.CharSequence) r0)
            r0 = 2132018629(0x7f1405c5, float:1.967557E38)
            r1.A01 = r0
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            r1.A03 = r0
            com.instagram.common.session.UserSession r1 = X.C66581MXm.A0R(r1, r3, r10)
            X.OTs r0 = new X.OTs
            r0.<init>(r1)
            if (r15 != 0) goto L_0x0124
            long r6 = r0.A01
        L_0x00fb:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            r0 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0127
        L_0x0105:
            java.lang.String r9 = java.lang.String.valueOf(r0)
            java.lang.String r2 = " days"
            java.lang.String r8 = X.002.A0A(r0, r2)
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0119
            java.lang.String r2 = " (release block UI)"
            java.lang.String r8 = X.002.A0R(r8, r2)
        L_0x0119:
            X.DbV.A1V(r9, r8, r5)
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0127
            r8 = 1
            long r0 = r0 + r8
            goto L_0x0105
        L_0x0124:
            long r6 = r0.A02
            goto L_0x00fb
        L_0x0127:
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r10)
            X.MoD r0 = new X.MoD
            r0.<init>(r1)
            X.0xa r2 = r0.A00
            java.lang.String r0 = "EB_BlOCK_FIRST_SHOWN_TIMESTAMP_OVERRIDE_MS"
            r1 = 99999(0x1869f, float:1.40128E-40)
            int r0 = r2.getInt(r0, r1)
            java.lang.Integer r0 = X.C66583MXo.A0c(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.OlH r0 = new X.OlH
            r0.<init>(r4, r12, r5)
            X.DbU.A1F(r0, r1, r3, r5)
        L_0x014b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69184Nga.A0B(X.Nga, java.lang.Integer, boolean, boolean):java.util.ArrayList");
    }

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131973415);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C67758MuD.A01(A07(this));
        Dba.A15(getViewLifecycleOwner(), A07(this).A00, new C74193PqZ(this, 49), 31);
        DbZ.A1C(this, new C73566Pfn(this, (AnonymousClass4D7) null, 0), A07(this).A0H);
        DbZ.A1C(this, new C73566Pfn(this, (AnonymousClass4D7) null, 1), A07(this).A0G);
    }

    public static final C67758MuD A07(C69184Nga nga) {
        return (C67758MuD) nga.A0B.getValue();
    }

    public static final PR9 A08(C69184Nga nga) {
        PR9 pr9 = new PR9((CompoundButton.OnCheckedChangeListener) null, 2131966503, DbT.A1a(((AnonymousClass3HH) C73926Pm6.A00(nga, 33).getValue()).A00, "MEX_EB_LOW_STORAGE_MODE_TOGGLE_SHOWN"));
        pr9.A08 = new C71459Ol0(1, nga, pr9);
        return pr9;
    }

    private final String A09(C69582NoQ noQ) {
        int i;
        if (0qQ.A0K(noQ, C68722NUi.A00)) {
            i = 2131961705;
        } else if (noQ instanceof C68721NUh) {
            return C14240TsN.A00(requireContext(), ((C68721NUh) noQ).A00);
        } else {
            if (0qQ.A0K(noQ, C68723NUj.A00)) {
                i = 2131961706;
            } else if (0qQ.A0K(noQ, C68724NUk.A00)) {
                return "";
            } else {
                throw AnonymousClass7TE.A1K();
            }
        }
        return DbU.A0m(this, i);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public C69184Nga() {
        C73926Pm6 pm6 = new C73926Pm6(this, 20);
        C73926Pm6 pm62 = new C73926Pm6(this, 40);
        0eO r3 = 0eO.A02;
        AnonymousClass0eM A012 = C73926Pm6.A01(pm62, r3, 41);
        this.A03 = DbS.A0I(new C73926Pm6(A012, 42), pm6, C73915Plq.A00(A012, (Object) null, 10), DbS.A0z(C60096Jfc.class));
        this.A01 = new C73926Pm6(this, 47);
        C73926Pm6 pm63 = new C73926Pm6(this, 46);
        AnonymousClass0eM A013 = C73926Pm6.A01(new C73926Pm6(this, 43), r3, 44);
        this.A0B = DbS.A0I(new C73926Pm6(A013, 45), pm63, C73915Plq.A00(A013, (Object) null, 11), DbS.A0z(C67758MuD.class));
        this.A09 = C73926Pm6.A00(this, 37);
        this.A04 = C73926Pm6.A00(this, 22);
        this.A08 = C73926Pm6.A00(this, 30);
        this.A0A = C227642jf.A02(this);
        this.A02 = new C46448DfA((CharSequence) "[FB-Only]");
        this.A06 = C73926Pm6.A00(this, 28);
        this.A07 = C73926Pm6.A00(this, 29);
        this.A05 = C73926Pm6.A00(this, 27);
    }

    public static final SpannableStringBuilder A06(C69184Nga nga, C62320sa r5, int i) {
        String A16 = AnonymousClass7TE.A16(nga.requireContext(), 2131961636);
        SpannableStringBuilder A0C = DbS.A0C(DbY.A0c(nga.requireContext(), A16, i));
        AnonymousClass7AV.A03(A0C, new C46679Dj8(r5, 6), A16);
        return A0C;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.OTn] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.OTn] */
    public static final ArrayList A0A(N4R n4r, C69184Nga nga) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (AnonymousClass65A.A02(C66581MXm.A0S(nga.A04), 2342158959156399828L)) {
            FGF fgf = new FGF(2131961635);
            fgf.A01 = R.style.igds_emphasized_body_1;
            fgf.A03 = R.dimen.action_bar_item_spacing_right;
            A1C.add(fgf);
            C69582NoQ noQ = (C69582NoQ) n4r.A02;
            String string = nga.getString(2131961704);
            ? obj = new Object();
            obj.A04 = string;
            obj.A07 = false;
            obj.A03 = nga.A09(noQ);
            A1C.add(obj);
            C69582NoQ noQ2 = (C69582NoQ) n4r.A00;
            String string2 = nga.getString(2131961703);
            ? obj2 = new Object();
            obj2.A04 = string2;
            obj2.A07 = false;
            obj2.A03 = nga.A09(noQ2);
            A1C.add(obj2);
            if ((noQ instanceof C68721NUh) && (noQ2 instanceof C68721NUh)) {
                C67758MuD.A00(nga).A0B("EB_DETAILS_IMPRESSION");
            }
        }
        return A1C;
    }

    public final void afterOnPause() {
        super.afterOnPause();
        NUQ A002 = C67758MuD.A00(this);
        if (A002.A0G()) {
            A002.A0D("ACTION", "NAVIGATE_AWAY");
            A002.A08();
        }
    }

    public final void afterOnResume() {
        super.afterOnResume();
        NUQ A002 = C67758MuD.A00(this);
        A002.A09();
        A002.A0B("SETTING_PAGE_IMPRESSION");
    }
}
