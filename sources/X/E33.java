package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.user.model.User;

public final class E33 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "EditUsernameFragment";
    public View A00;
    public 2dZ A01;
    public ActionButton A02;
    public IgFormField A03;
    public C46671Dj0 A04;
    public C322326ve A05;
    public User A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public IgTextView A0A;
    public C50679Fge A0B;
    public String A0C;
    public final AnonymousClass0eM A0D = C227642jf.A02(this);
    public final TextWatcher A0E = new FKk(this, 18);
    public final View.OnFocusChangeListener A0F = new FPM(this, 20);

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        ? obj = new Object();
        C59922Jbl.A02(DbV.A05(this), obj, 2131976355);
        ActionButton A002 = C59904JbT.A00(FPC.A00(this, 28), r5, obj);
        this.A02 = A002;
        if (this.A08) {
            A002.setEnabled(false);
            IgFormField igFormField = this.A03;
            if (igFormField != null) {
                igFormField.setFocusable(false);
            }
            IgFormField igFormField2 = this.A03;
            if (igFormField2 != null) {
                igFormField2.setEnabled(false);
            }
        }
        DbX.A1A(FPC.A00(this, 29), DbX.A0M(), r5);
    }

    public final String getModuleName() {
        return "profile_edit_username";
    }

    /* JADX WARNING: type inference failed for: r0v61, types: [X.U22, android.text.method.LinkMovementMethod] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            r20 = this;
            r7 = 0
            r8 = r21
            X.0qQ.A0B(r8, r7)
            r9 = r20
            r0 = r22
            super.onViewCreated(r8, r0)
            X.2dY r0 = X.2dZ.A0t
            X.2dZ r0 = X.DbU.A0L(r9, r0)
            r9.A01 = r0
            android.os.Bundle r1 = r9.requireArguments()
            java.lang.String r0 = "is_pending_review"
            boolean r0 = r1.getBoolean(r0)
            r9.A08 = r0
            android.os.Bundle r1 = r9.requireArguments()
            r0 = 784(0x310, float:1.099E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0)
            r9.A09 = r0
            android.os.Bundle r1 = r9.requireArguments()
            r0 = 565(0x235, float:7.92E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r1.getString(r0)
            r9.A07 = r0
            androidx.fragment.app.FragmentActivity r2 = r9.requireActivity()
            X.0eM r12 = r9.A0D
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r12)
            X.Fge r1 = new X.Fge
            r1.<init>(r2, r0, r9)
            r9.A0B = r1
            X.Dj0 r0 = new X.Dj0
            r0.<init>(r1)
            r9.A04 = r0
            X.0lg r0 = X.DbT.A0X(r12)
            X.0Tu r13 = X.0Tu.A05
            boolean r0 = X.DbW.A1U(r13, r0)
            if (r0 != 0) goto L_0x006f
            X.0lg r0 = X.DbT.A0X(r12)
            boolean r0 = X.DbW.A1V(r13, r0)
            if (r0 == 0) goto L_0x0087
        L_0x006f:
            r0 = 2131443604(0x7f0b3f94, float:1.850928E38)
            com.instagram.common.ui.base.IgTextView r1 = X.DbT.A0a(r8, r0)
            r9.A0A = r1
            if (r1 == 0) goto L_0x0080
            r0 = 2131957418(0x7f1316aa, float:1.955142E38)
            X.DbU.A1G(r1, r9, r0)
        L_0x0080:
            com.instagram.common.ui.base.IgTextView r0 = r9.A0A
            if (r0 == 0) goto L_0x0087
            r0.setVisibility(r7)
        L_0x0087:
            android.os.Bundle r1 = r9.requireArguments()
            java.lang.String r0 = "displayed_user"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r9.A06 = r0
            r0 = 2131443611(0x7f0b3f9b, float:1.8509295E38)
            android.view.View r0 = r8.findViewById(r0)
            r9.A00 = r0
            r0 = 2131443595(0x7f0b3f8b, float:1.8509263E38)
            com.instagram.igds.components.form.IgFormField r3 = X.DbT.A0d(r8, r0)
            r9.A03 = r3
            r6 = 2
            r10 = 1
            if (r3 == 0) goto L_0x00f7
            android.os.Bundle r1 = r9.requireArguments()
            java.lang.String r0 = X.Dbm.A01()
            java.lang.String r0 = r1.getString(r0)
            r9.A0C = r0
            if (r0 == 0) goto L_0x00be
            r3.setText(r0)
        L_0x00be:
            android.content.res.Resources r1 = X.DbV.A05(r9)
            r0 = 2131976355(0x7f1360a3, float:1.9589828E38)
            java.lang.String r0 = r1.getString(r0)
            r3.setLabelText(r0)
            android.content.Context r0 = r8.getContext()
            X.ERS r2 = new X.ERS
            r2.<init>(r0)
            r1 = 30
            android.text.InputFilter$LengthFilter r0 = new android.text.InputFilter$LengthFilter
            r0.<init>(r1)
            android.text.InputFilter[] r0 = new android.text.InputFilter[]{r2, r0}
            r3.setFilters(r0)
            r0 = 144(0x90, float:2.02E-43)
            r3.setInputType(r0)
            X.0lg r0 = X.DbT.A0X(r12)
            X.4v0 r1 = X.AnonymousClass4v0.A00(r0)
            android.widget.EditText r0 = r3.getMEditText()
            r0.addTextChangedListener(r1)
        L_0x00f7:
            r0 = 2131443609(0x7f0b3f99, float:1.850929E38)
            android.widget.TextView r4 = X.AnonymousClass7TG.A0R(r8, r0)
            r0 = 2131443610(0x7f0b3f9a, float:1.8509293E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r8, r0)
            android.os.Bundle r1 = r9.requireArguments()
            java.lang.String r0 = "trusted_days"
            int r11 = r1.getInt(r0)
            android.os.Bundle r1 = r9.requireArguments()
            java.lang.String r0 = "trusted_username"
            java.lang.String r2 = r1.getString(r0)
            r5 = 8
            if (r2 != 0) goto L_0x0288
            r4.setVisibility(r5)
            r3.setVisibility(r5)
        L_0x0123:
            r0 = 2131433342(0x7f0b177e, float:1.8488467E38)
            android.widget.TextView r11 = X.AnonymousClass7TG.A0R(r8, r0)
            X.C7v r10 = X.F9X.A00()
            if (r10 == 0) goto L_0x019d
            java.lang.Class<X.BpS> r4 = X.BpS.class
            r3 = 4
            r0 = 4178(0x1052, float:5.855E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r1 = -366324875(0xffffffffea2a5375, float:-5.1477876E25)
            X.3lr r0 = r10.getOptionalTreeField(r3, r2, r4, r1)
            if (r0 == 0) goto L_0x019d
            X.3lr r1 = r10.getOptionalTreeField(r3, r2, r4, r1)
            java.lang.String r0 = "subtext"
            java.lang.String r0 = r1.getOptionalStringField(r7, r0)
            if (r0 == 0) goto L_0x019d
            r11.setVisibility(r7)
            r11.setText(r0)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r12)
            X.EZm r1 = X.C48144EZm.BIZ_EDIT_USERNAME
            X.0qQ.A0B(r2, r7)
            java.lang.String r0 = "reminder_shown"
            X.FGS.A01(r1, r2, r0)
        L_0x0162:
            android.os.Bundle r1 = r9.requireArguments()
            java.lang.String r0 = "disclaimer_text"
            java.lang.String r2 = r1.getString(r0)
            r0 = 2131433934(0x7f0b19ce, float:1.8489668E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r8, r0)
            boolean r0 = r9.A09
            if (r0 == 0) goto L_0x0199
            if (r2 == 0) goto L_0x0199
            r1.setVisibility(r7)
            r1.setText(r2)
        L_0x017f:
            boolean r0 = r9.A08
            if (r0 == 0) goto L_0x0198
            com.instagram.actionbar.ActionButton r0 = r9.A02
            if (r0 == 0) goto L_0x018a
            r0.setEnabled(r7)
        L_0x018a:
            com.instagram.igds.components.form.IgFormField r0 = r9.A03
            if (r0 == 0) goto L_0x0191
            r0.setFocusable(r7)
        L_0x0191:
            com.instagram.igds.components.form.IgFormField r0 = r9.A03
            if (r0 == 0) goto L_0x0198
            r0.setEnabled(r7)
        L_0x0198:
            return
        L_0x0199:
            r1.setVisibility(r5)
            goto L_0x017f
        L_0x019d:
            X.3JC r1 = X.DE2.A00
            if (r1 == 0) goto L_0x0162
            java.lang.Object r0 = r1.A01
            if (r0 == 0) goto L_0x0162
            X.DZP r0 = (X.DZP) r0
            X.DaJ r0 = r0.B8k()
            if (r0 == 0) goto L_0x0162
            java.lang.Object r1 = r1.A01
            X.DZP r1 = (X.DZP) r1
            X.DaJ r0 = r1.B8k()
            X.G9E r0 = r0.CD4()
            if (r0 == 0) goto L_0x0162
            X.DaJ r0 = r1.B8k()
            X.G9E r0 = r0.CD4()
            boolean r0 = r0.BuR()
            if (r0 == 0) goto L_0x0162
            android.content.Context r10 = r9.requireContext()
            X.0lg r4 = X.DbT.A0X(r12)
            X.DYI r1 = X.DE2.A08()
            X.G9U r0 = r1.Agc()
            if (r0 == 0) goto L_0x02cc
            X.G9U r0 = r1.Agc()
            java.lang.String r0 = r0.getText()
            boolean r0 = X.C296675qS.A03(r0)
            if (r0 != 0) goto L_0x02cc
            X.G9U r0 = r1.Agc()
            java.lang.String r3 = r0.getText()
            X.DYI r1 = X.DE2.A08()
            X.G9U r0 = r1.Agc()
            if (r0 == 0) goto L_0x02c7
            X.G9U r0 = r1.Agc()
            com.google.common.collect.ImmutableList r0 = r0.BjC()
            java.lang.Object r0 = r0.get(r7)
            X.G9N r0 = (X.G9N) r0
            int r2 = r0.getOffset()
            r0 = 36325768237823183(0x810e18000234cf, double:3.035900333502901E-306)
            boolean r0 = X.182.A06(r13, r4, r0)
            if (r0 == 0) goto L_0x021d
            java.util.ArrayList r18 = X.DE2.A0D()     // Catch:{ IllegalStateException -> 0x0222 }
            goto L_0x022e
        L_0x021d:
            java.util.ArrayList r18 = X.DE2.A0D()
            goto L_0x022e
        L_0x0222:
            X.0wj r13 = X.0wj.A01
            r1 = 817890849(0x30c00621, float:1.3971581E-9)
            java.lang.String r0 = "crash_getting_username_reminder_style"
            X.DbT.A1Q(r13, r0, r1)
            r18 = 0
        L_0x022e:
            java.lang.String r16 = r3.substring(r7, r2)
            r14 = 0
            com.instagram.common.textwithentities.model.TextWithEntities r13 = new com.instagram.common.textwithentities.model.TextWithEntities
            r15 = r14
            r17 = r14
            r19 = r14
            r13.<init>(r14, r15, r16, r17, r18, r19)
            android.text.SpannableString r13 = X.C18186Vn0.A00(r10, r13)
            java.lang.String r1 = r3.substring(r2)
            int r0 = X.DbU.A01(r10)
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r1)
            X.DjJ r2 = new X.DjJ
            r2.<init>(r0, r6, r9, r4)
            int r1 = r1.length()
            r0 = 33
            r3.setSpan(r2, r7, r1, r0)
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[]{r13, r3}
            java.lang.CharSequence r0 = android.text.TextUtils.concat(r0)
            X.0qQ.A07(r0)
            r11.setVisibility(r7)
            r11.setText(r0)
            X.U22 r0 = X.U22.A00
            if (r0 != 0) goto L_0x0278
            X.U22 r0 = new X.U22
            r0.<init>()
            X.U22.A00 = r0
        L_0x0278:
            r11.setMovementMethod(r0)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r12)
            X.EZm r1 = X.C48144EZm.EDIT_USERNAME
            java.lang.String r0 = "reminder_shown"
            X.FGS.A02(r1, r2, r0)
            goto L_0x0162
        L_0x0288:
            if (r11 >= r6) goto L_0x02a1
            r0 = 2131976362(0x7f1360aa, float:1.9589842E38)
            java.lang.String r1 = X.DbV.A0z(r9, r2, r0)
        L_0x0291:
            X.DbZ.A14(r4, r1)
            r4.setVisibility(r7)
            r0 = 30
            X.FPC.A01(r3, r0, r9)
            r3.setVisibility(r7)
            goto L_0x0123
        L_0x02a1:
            X.0lg r14 = X.AnonymousClass7TF.A0L(r12, r7)
            r0 = 36326622936184712(0x810edf00003788, double:3.036440848188326E-306)
            boolean r0 = X.182.A06(r13, r14, r0)
            r1 = 2131976360(0x7f1360a8, float:1.9589838E38)
            if (r0 == 0) goto L_0x02b6
            r1 = 2131976361(0x7f1360a9, float:1.958984E38)
        L_0x02b6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            android.text.SpannableStringBuilder r1 = X.Dbb.A0C(r9, r2, r0, r1)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r10)
            X.AnonymousClass7AV.A03(r1, r0, r2)
            goto L_0x0291
        L_0x02c7:
            java.lang.IllegalStateException r0 = X.DbZ.A0a()
            throw r0
        L_0x02cc:
            java.lang.IllegalStateException r0 = X.DbZ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E33.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(E33 e33) {
        C322326ve r1 = e33.A05;
        if (r1 != null) {
            long j = r1.A02;
            if (j != 0) {
                r1.A06 = false;
                r1.A0A.flowMarkPoint(j, "username_change_confirmed");
            }
        }
        IgFormField igFormField = e33.A03;
        if (igFormField != null) {
            String A0o = DbU.A0o(igFormField);
            2dZ r0 = e33.A01;
            if (r0 != null) {
                r0.setIsLoading(true);
            }
            0lg A0X = DbT.A0X(e33.A0D);
            0qQ.A0B(A0X, 0);
            String A012 = Dbm.A01();
            0qQ.A0B(A0o, 1);
            1NY A0a = AnonymousClass7TG.A0a(A0X);
            A0a.A0A("accounts/update_profile_username/");
            A0a.A9m(A012, A0o);
            C47696EDf.A00(e33, DbU.A0S(A0a, C43840CFg.class, C45714D2n.class), 0);
        }
    }

    public static final void A01(E33 e33) {
        AnonymousClass0eM r5 = e33.A0D;
        0lg A0X = DbT.A0X(r5);
        if (182.A06(DbS.A0J(A0X, 0), A0X, 36326622936184712L)) {
            IgFormField igFormField = e33.A03;
            String str = null;
            if (igFormField != null) {
                str = DbU.A0o(igFormField);
            }
            if (00p.A0j(str, e33.A0C, false)) {
                DbT.A1J(e33);
                return;
            }
            2dZ r0 = e33.A01;
            if (r0 != null) {
                r0.setIsLoading(true);
            }
            IgFormField igFormField2 = e33.A03;
            if (igFormField2 != null) {
                String A0o = DbU.A0o(igFormField2);
                1OC A002 = C318486p2.A00(e33.requireContext(), DbT.A0X(r5), A0o);
                C47696EDf.A01(A002, e33, 1);
                1ET A012 = 1ES.A01();
                0qQ.A0B(A012, 0);
                A012.schedule(A002);
                return;
            }
            return;
        }
        A00(e33);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0D);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(239884680);
        E33.super.onCreate(bundle);
        C322326ve A002 = C322316vd.A00(AnonymousClass7TE.A0l(this.A0D));
        this.A05 = A002;
        if (A002 != null) {
            A002.A06("edit_user_name");
        }
        Dbc.A0p(this);
        AnonymousClass0fD.A09(1120330192, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1642427281);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_edit_username, viewGroup, false);
        AnonymousClass0fD.A09(-1937166820, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1912112627);
        super.onDestroyView();
        C46671Dj0 dj0 = this.A04;
        if (dj0 != null) {
            dj0.removeMessages(1);
        }
        this.A04 = null;
        C50679Fge fge = this.A0B;
        if (fge != null) {
            fge.A00 = true;
        }
        this.A0B = null;
        IgFormField igFormField = this.A03;
        if (igFormField != null) {
            DbU.A1E(AnonymousClass4v0.A00(DbT.A0X(this.A0D)), igFormField);
        }
        this.A03 = null;
        this.A0A = null;
        this.A00 = null;
        this.A02 = null;
        AnonymousClass0fD.A09(-2127838207, A022);
    }

    public final void onPause() {
        Window window;
        int A022 = AnonymousClass0fD.A02(-1242678394);
        E33.super.onPause();
        IgFormField igFormField = this.A03;
        if (igFormField != null) {
            DbU.A1E(this.A0E, igFormField);
        }
        IgFormField igFormField2 = this.A03;
        if (igFormField2 != null) {
            igFormField2.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        }
        0nA.A0N(DbV.A0G(this).getDecorView());
        Activity rootActivity = getRootActivity();
        if (!(rootActivity == null || (window = rootActivity.getWindow()) == null)) {
            window.setSoftInputMode(48);
        }
        AnonymousClass0fD.A09(1397975174, A022);
    }

    public final void onResume() {
        Window window;
        int A022 = AnonymousClass0fD.A02(-2034192610);
        super.onResume();
        if (!182.A06(0Tu.A05, DbY.A0R(this.A0D), 36326622936184712L)) {
            IgFormField igFormField = this.A03;
            if (igFormField != null) {
                igFormField.A0G(this.A0E);
            }
            IgFormField igFormField2 = this.A03;
            if (igFormField2 != null) {
                igFormField2.setOnFocusChangeListener(this.A0F);
            }
        }
        Activity rootActivity = getRootActivity();
        if (!(rootActivity == null || (window = rootActivity.getWindow()) == null)) {
            window.setSoftInputMode(16);
        }
        if (!this.A08) {
            IgFormField igFormField3 = this.A03;
            if (igFormField3 != null) {
                igFormField3.requestFocus();
            }
            IgFormField igFormField4 = this.A03;
            if (igFormField4 != null) {
                0nA.A0Q(igFormField4);
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A09(-1478121148, A022);
                throw A0y;
            }
        }
        AnonymousClass0fD.A09(1406160347, A022);
    }
}
