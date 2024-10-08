package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import java.util.List;

public final class E3Y extends AnonymousClass4DH implements C61110lV, AnonymousClass4DR, G8C, G69, G68, AnonymousClass25J, G6B {
    public static final String __redex_internal_original_name = "ContactPointTriageFragment";
    public AutoCompleteTextView A00;
    public AutoCompleteTextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public AnonymousClass0aP A05;
    public IgFrameLayout A06;
    public FxSsoViewModel A07;
    public Ez8 A08;
    public EEB A09;
    public F0L A0A;
    public EEM A0B;
    public C49634Ezr A0C;
    public C49634Ezr A0D;
    public C49709F2u A0E;
    public C49691F2b A0F;
    public C49691F2b A0G;
    public EEG A0H;
    public CountryCodeData A0I;
    public RegFlowExtras A0J;
    public RegFlowExtras A0K;
    public EEK A0L;
    public EEK A0M;
    public InlineErrorMessageView A0N;
    public InlineErrorMessageView A0O;
    public Integer A0P = AnonymousClass05K.A00;
    public String A0Q;
    public String A0R;
    public List A0S;
    public boolean A0T;
    public boolean A0U = false;
    public boolean A0V;
    public boolean A0W = false;
    public C249883kW A0X;
    public C71662eb A0Y;
    public NotificationBar A0Z;
    public final W7f A0a = new C48054ESy(this, 9);
    public final W7f A0b = new C48054ESy(this, 8);
    public final 1wn A0c = FXZ.A00(this, 34);
    public final 1wn A0d = FXZ.A00(this, 35);

    /* JADX WARNING: type inference failed for: r8v0, types: [X.07Z, androidx.fragment.app.Fragment, X.E3Y] */
    private void A00(View view, AutoCompleteTextView autoCompleteTextView, C46634DiE diE) {
        if (!this.A0T) {
            View view2 = view;
            Ez8 ez8 = new Ez8(view2, autoCompleteTextView, this, this.A05, new C50602FfI(autoCompleteTextView, new C50515Fdb(getActivity()), this, diE), diE);
            this.A08 = ez8;
            ez8.A02.A00(requireContext(), this, this.A05, DbW.A0Q(requireContext(), this), new C50599FfE(ez8, 1));
        }
    }

    public static void A03(E3Y e3y) {
        E3Y e3y2 = e3y;
        C49709F2u f2u = e3y.A0E;
        if (f2u != null) {
            FGJ.A03.A03(e3y.getActivity(), e3y.A05, e3y2, e3y.BzS(), f2u.A00());
            1OC A002 = FCI.A00(e3y.getRootActivity().getApplicationContext(), e3y.A05, e3y.A0E.A00(), e3y.A0Q, e3y.A0R);
            AnonymousClass0aP r6 = e3y.A05;
            String A0I2 = 0nA.A0I(e3y.A01);
            EEK eek = e3y2.A0M;
            C49702F2n f2n = e3y2.A0E.A00;
            f2n.getClass();
            E3Y e3y3 = e3y2;
            EDV.A00(A002, new C47700EDj(e3y2, r6, e3y3, f2n.A04, e3y2.A0J, eek, e3y2.BzS(), A0I2), e3y2, 23);
            e3y2.schedule(A002);
        }
    }

    public static void A05(E3Y e3y, String str) {
        String str2;
        E3Y e3y2 = e3y;
        RegFlowExtras regFlowExtras = e3y.A0J;
        Parcel obtain = Parcel.obtain();
        regFlowExtras.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        RegFlowExtras regFlowExtras2 = (RegFlowExtras) RegFlowExtras.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        FCQ.A01(e3y2.A0J, regFlowExtras2);
        if (e3y2.A0T) {
            str2 = e3y2.A0J.A0J;
        } else {
            str2 = null;
        }
        FragmentActivity activity = e3y2.getActivity();
        1NY A0O2 = DbU.A0O(e3y2.A05);
        A0O2.A0A("consent/get_signup_config/");
        A0O2.A9m("guid", DbT.A0s(activity));
        A0O2.A9m("main_account_selected", "false");
        A0O2.A0G("logged_in_user_id", str2);
        1OC A0S2 = DbT.A0S(A0O2, Dw3.class, C49770F6d.class);
        A0S2.A00 = new EDU(regFlowExtras2, regFlowExtras2, e3y2, str, 0);
        e3y2.schedule(A0S2);
    }

    public final void DaH(boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r1.containsKey("caa_registration_redirection_to_native") == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r12 = this;
            r6 = r12
            androidx.fragment.app.FragmentActivity r0 = r12.requireActivity()
            android.os.Bundle r1 = X.DbU.A06(r0)
            if (r1 == 0) goto L_0x0014
            java.lang.String r0 = "caa_registration_redirection_to_native"
            boolean r1 = r1.containsKey(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r5 = 1
            if (r0 == 0) goto L_0x001c
            X.DbT.A1K(r12)
            return r5
        L_0x001c:
            androidx.fragment.app.FragmentActivity r1 = r12.getActivity()
            boolean r0 = r1 instanceof X.G8D
            if (r0 == 0) goto L_0x002a
            X.G8D r1 = (X.G8D) r1
            X.Dba.A1R(r1)
            return r5
        L_0x002a:
            boolean r0 = A07(r12)
            if (r0 == 0) goto L_0x0065
            android.widget.AutoCompleteTextView r0 = r12.A01
        L_0x0032:
            boolean r0 = X.0nA.A0z(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0068
            X.0xa r2 = X.DbV.A0d()
            java.lang.String r0 = "has_user_confirmed_dialog"
            r1 = 0
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 != 0) goto L_0x0068
            X.0aP r7 = r12.A05
            X.DiE r10 = r12.BzS()
            X.EXD r9 = r12.B6Y()
            X.Ffk r8 = new X.Ffk
            r8.<init>(r12, r1)
            boolean r0 = A07(r12)
            if (r0 == 0) goto L_0x0062
            java.lang.Integer r11 = X.AnonymousClass05K.A01
        L_0x005e:
            X.C49038EoI.A00(r6, r7, r8, r9, r10, r11)
            return r5
        L_0x0062:
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            goto L_0x005e
        L_0x0065:
            android.widget.AutoCompleteTextView r0 = r12.A00
            goto L_0x0032
        L_0x0068:
            r4 = 0
            X.C49843F9i.A00 = r4
            android.content.Context r0 = r12.getContext()
            X.C49913FEl.A02(r0)
            X.0aP r3 = r12.A05
            X.DiE r0 = r12.BzS()
            java.lang.String r2 = r0.A01
            X.EXD r1 = r12.B6Y()
            boolean r0 = A07(r12)
            if (r0 == 0) goto L_0x0097
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0086:
            X.Dba.A0j(r5, r3, r2)
            X.C49920FEv.A00(r3, r1, r4, r0, r2)
            X.FGJ r1 = X.FGJ.A03
            android.content.Context r0 = r12.getContext()
            r1.A05(r0)
            r5 = 0
            return r5
        L_0x0097:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3Y.onBackPressed():boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: X.E3Y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: X.G69} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(X.C48070EUo r30) {
        /*
            r29 = this;
            X.EUo r3 = X.C48070EUo.A01
            r0 = r29
            r8 = r30
            if (r8 != r3) goto L_0x0153
            android.widget.AutoCompleteTextView r1 = r0.A00
        L_0x000a:
            java.lang.String r13 = X.0nA.A0I(r1)
            boolean r1 = r0.A0T
            if (r1 != 0) goto L_0x00e5
            X.Ez8 r1 = r0.A08
            if (r1 == 0) goto L_0x00e5
            X.F3P r1 = r1.A02
            java.util.List r1 = r1.A02
            java.util.Iterator r2 = r1.iterator()
        L_0x001e:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x00e5
            java.lang.Object r4 = r2.next()
            X.G8G r4 = (X.G8G) r4
            boolean r1 = r8 instanceof X.ENS
            if (r1 == 0) goto L_0x00db
            java.lang.String r1 = r4.B0m()
            boolean r1 = r13.equalsIgnoreCase(r1)
        L_0x0036:
            if (r1 == 0) goto L_0x001e
            if (r8 != r3) goto L_0x0166
            X.0aP r11 = r0.A05
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            X.Fdb r10 = new X.Fdb
            r10.<init>(r1)
            X.FfK r9 = new X.FfK
            r9.<init>(r4, r0)
            r3 = 2131956583(0x7f131367, float:1.9549726E38)
            boolean r1 = r4 instanceof X.ENO
            if (r1 == 0) goto L_0x00d2
            r3 = 2131956582(0x7f131366, float:1.9549724E38)
        L_0x0054:
            X.DiE r21 = X.C46634DiE.A0d
            r12 = 2131973616(0x7f1355f0, float:1.9584273E38)
            android.content.res.Resources r8 = X.DbV.A05(r0)
            X.8ab r7 = X.Dba.A0I(r0)
            r6 = 1
            r7.A0r(r6)
            r7.A0s(r6)
            r2 = 2131956585(0x7f131369, float:1.954973E38)
            java.lang.String r1 = r4.getUsername()
            java.lang.String r5 = X.DbV.A0z(r0, r1, r2)
            java.lang.String r3 = r8.getString(r3)
            com.instagram.common.typedurl.ImageUrl r1 = r4.BGJ()
            if (r1 == 0) goto L_0x0161
            r7.A0n(r1, r0)
            r2 = 2131956584(0x7f131368, float:1.9549728E38)
            java.lang.String r1 = r4.getUsername()
            java.lang.String r2 = X.DbV.A0z(r0, r1, r2)
            X.OgD r1 = new X.OgD
            r13 = r1
            r14 = r6
            r15 = r0
            r16 = r11
            r17 = r10
            r18 = r4
            r19 = r9
            r20 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            if (r2 == 0) goto L_0x015c
            r7.A0c(r1, r2)
            java.lang.String r2 = r8.getString(r12)
            r1 = 47
            X.FJf r1 = X.C50020FJf.A00(r9, r1)
            if (r2 == 0) goto L_0x0157
            r7.A0b(r1, r2)
            r7.A05 = r5
            r7.A0q(r3)
            X.DbT.A1V(r7)
            X.1Q0 r1 = X.1Q0.A1b
            X.0xI r3 = X.FGI.A00(r0, r1)
            java.lang.String r2 = r4.AXz()
            r1 = 262(0x106, float:3.67E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r3.A0C(r1, r2)
            X.0aP r0 = r0.A05
            X.DbU.A1R(r3, r0)
        L_0x00d1:
            return
        L_0x00d2:
            boolean r1 = r4 instanceof X.ENP
            if (r1 == 0) goto L_0x0054
            r3 = 2131956581(0x7f131365, float:1.9549722E38)
            goto L_0x0054
        L_0x00db:
            java.lang.String r1 = r4.Bby()
            boolean r1 = android.telephony.PhoneNumberUtils.compare(r13, r1)
            goto L_0x0036
        L_0x00e5:
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            boolean r2 = r0.A0T
            java.lang.String r1 = "ContactPointTriageFragment"
            if (r2 != 0) goto L_0x0141
            X.Ez8 r2 = r0.A08
            if (r2 == 0) goto L_0x0134
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            X.F3P r2 = r2.A02
            java.util.List r2 = r2.A02
            java.util.Iterator r4 = r2.iterator()
        L_0x0103:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0115
            java.lang.Object r3 = r4.next()
            boolean r2 = r3 instanceof X.ENN
            if (r2 == 0) goto L_0x0103
            r7.add(r3)
            goto L_0x0103
        L_0x0115:
            java.util.Iterator r7 = r7.iterator()
        L_0x0119:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0134
            java.lang.Object r3 = r7.next()
            X.ENN r3 = (X.ENN) r3
            X.6qx r4 = r3.A00
            java.lang.String r2 = r4.A05
            r6.put(r2, r3)
            java.lang.String r3 = r4.A06
            java.lang.String r2 = r4.A05
            r5.put(r3, r2)
            goto L_0x0119
        L_0x0134:
            X.FV8 r4 = X.FV8.A00()
            X.0aP r3 = r0.A05
            java.lang.String r2 = "ig_android_growth_FX_access_fbig_verify_email"
            java.lang.String r15 = r4.A02(r3, r2, r1)
            goto L_0x0142
        L_0x0141:
            r15 = 0
        L_0x0142:
            int[] r3 = X.C49286EsV.A00
            int r2 = r8.ordinal()
            r4 = r3[r2]
            r3 = 1
            java.lang.String r2 = "Error creating the uid:nonce map"
            if (r4 == r3) goto L_0x0197
            r3 = 2
            if (r4 != r3) goto L_0x00d1
            goto L_0x016a
        L_0x0153:
            android.widget.AutoCompleteTextView r1 = r0.A01
            goto L_0x000a
        L_0x0157:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x015c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0161:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0166:
            A03(r0)
            return
        L_0x016a:
            android.content.Context r9 = r0.getContext()     // Catch:{ JSONException -> 0x01ce }
            X.0gy r10 = X.AnonymousClass07i.A00(r0)     // Catch:{ JSONException -> 0x01ce }
            X.F2u r3 = r0.A0E     // Catch:{ JSONException -> 0x01ce }
            if (r3 != 0) goto L_0x018d
            java.lang.String r13 = ""
        L_0x0178:
            r18 = 0
            java.util.HashMap r17 = X.AnonymousClass7TE.A1E()     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r14 = r0.A0Q     // Catch:{ JSONException -> 0x01ce }
            X.0aP r12 = r0.A05     // Catch:{ JSONException -> 0x01ce }
            boolean r5 = r0.A0V     // Catch:{ JSONException -> 0x01ce }
            java.util.List r4 = r0.A0S     // Catch:{ JSONException -> 0x01ce }
            r3 = 6
            X.EDa r11 = new X.EDa     // Catch:{ JSONException -> 0x01ce }
            r11.<init>(r0, r3)     // Catch:{ JSONException -> 0x01ce }
            goto L_0x0192
        L_0x018d:
            java.lang.String r13 = r3.A00()     // Catch:{ JSONException -> 0x01ce }
            goto L_0x0178
        L_0x0192:
            r19 = r5
            r16 = r4
            goto L_0x01ca
        L_0x0197:
            android.content.Context r9 = r0.getContext()     // Catch:{ JSONException -> 0x01ce }
            X.0gy r10 = X.AnonymousClass07i.A00(r0)     // Catch:{ JSONException -> 0x01ce }
            java.util.Set r18 = r6.keySet()     // Catch:{ JSONException -> 0x01ce }
            java.lang.String r14 = r0.A0Q     // Catch:{ JSONException -> 0x01ce }
            X.0aP r12 = r0.A05     // Catch:{ JSONException -> 0x01ce }
            r19 = 0
            java.util.List r6 = r0.A0S     // Catch:{ JSONException -> 0x01ce }
            X.EEK r4 = r0.A0L     // Catch:{ JSONException -> 0x01ce }
            com.instagram.registration.model.RegFlowExtras r3 = r0.A0J     // Catch:{ JSONException -> 0x01ce }
            X.EDY r11 = new X.EDY     // Catch:{ JSONException -> 0x01ce }
            r20 = r11
            r21 = r0
            r22 = r12
            r23 = r0
            r24 = r0
            r25 = r3
            r26 = r4
            r27 = r13
            r28 = r13
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ JSONException -> 0x01ce }
            r17 = r5
            r16 = r6
        L_0x01ca:
            r8.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ JSONException -> 0x01ce }
            return
        L_0x01ce:
            X.0wb.A03(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3Y.A01(X.EUo):void");
    }

    public static void A02(E3Y e3y) {
        1R7 C82 = e3y.A0X.C82();
        if (C82.A0C.contains("ig_sign_up_screen_banner")) {
            String str = C82.A06;
            if (str == null) {
                str = e3y.getString(2131976988);
            }
            e3y.A0Y.A03(0);
            DbY.A0y(DbV.A05(e3y), (TextView) e3y.A0Y.A01(), str, 2131976998);
            return;
        }
        e3y.A0Y.A02();
    }

    private boolean A06() {
        if (this.A0T || (Dba.A0W(this.A07.A04) != null && AnonymousClass7TE.A1a(Dba.A0W(this.A07.A04)))) {
            return false;
        }
        if (Dba.A0W(this.A07.A02) != null && DbS.A05(Dba.A0W(this.A07.A02)) > 0) {
            return false;
        }
        if (!0mp.A0B((CharSequence) Dba.A0W(this.A07.A01)) || !0mp.A0B((CharSequence) Dba.A0W(this.A07.A00))) {
            return true;
        }
        return false;
    }

    public static boolean A07(E3Y e3y) {
        EEG eeg = e3y.A0H;
        if (eeg == null || eeg.A01 != AnonymousClass05K.A00) {
            return false;
        }
        return true;
    }

    public final void APF() {
        ImageView imageView;
        EEG eeg = this.A0H;
        eeg.A03.setEnabled(false);
        eeg.A04.setEnabled(false);
        if (A07(this)) {
            C49709F2u f2u = this.A0E;
            f2u.A07.setEnabled(false);
            f2u.A05.setEnabled(false);
            imageView = f2u.A06;
        } else {
            F0L f0l = this.A0A;
            f0l.A04.setEnabled(false);
            imageView = f0l.A05;
            imageView.setEnabled(false);
        }
        imageView.setVisibility(4);
    }

    public final void ARL() {
        AutoCompleteTextView autoCompleteTextView;
        ImageView imageView;
        EEG eeg = this.A0H;
        eeg.A03.setEnabled(true);
        eeg.A04.setEnabled(true);
        if (A07(this)) {
            C49709F2u f2u = this.A0E;
            f2u.A07.setEnabled(true);
            autoCompleteTextView = f2u.A05;
            autoCompleteTextView.setEnabled(true);
            imageView = f2u.A06;
        } else {
            F0L f0l = this.A0A;
            autoCompleteTextView = f0l.A04;
            autoCompleteTextView.setEnabled(true);
            imageView = f0l.A05;
            imageView.setEnabled(true);
        }
        int i = 0;
        if (0nA.A0z(autoCompleteTextView)) {
            i = 4;
        }
        imageView.setVisibility(i);
    }

    public final EXD B6Y() {
        if (this.A0T) {
            return EXD.SAC;
        }
        if (A07(this)) {
            return EXD.PHONE;
        }
        return EXD.A03;
    }

    public final C46634DiE BzS() {
        if (this.A0T) {
            return C46634DiE.A1M;
        }
        if (A07(this)) {
            return C46634DiE.A1F;
        }
        return C46634DiE.A0d;
    }

    public final void DUM() {
        EXD exd;
        Integer num;
        String str;
        FGJ fgj = FGJ.A03;
        boolean A072 = A07(this);
        boolean z = !A072;
        if (A072) {
            exd = EXD.PHONE;
            num = AnonymousClass05K.A01;
        } else if (z) {
            exd = EXD.A03;
            num = AnonymousClass05K.A00;
        } else {
            exd = EXD.A05;
            num = AnonymousClass05K.A0u;
        }
        if (this.A0T) {
            this.A0J.A0V = C49109EpY.A00(num);
        } else {
            this.A0J.A03(exd);
        }
        if (A072) {
            this.A0O.A03();
            C48070EUo eUo = C48070EUo.A02;
            if (this.A0E.A03 && !0nA.A0z(this.A01)) {
                0wc A022 = AnonymousClass0kN.A02(this.A05);
                double A012 = DbS.A01();
                double A002 = DbS.A00();
                String str2 = B6Y().A00;
                0Aj A0e = AnonymousClass7TE.A0e(A022, "phone_prefill_accepted");
                if (A0e.isSampled()) {
                    A0e.A7p("accepted", Boolean.valueOf(AnonymousClass7TF.A0f(this.A01).equals(this.A0E.A02)));
                    DbY.A1D(A0e, A012, A002);
                    DbS.A1G(A0e, str2);
                    DbZ.A1J(A0e, BzS().A01);
                    DbT.A1O(A0e);
                    DbW.A13(A0e, A012);
                    DbW.A12(A0e, A002);
                    DbY.A1A(A0e);
                    if (DbV.A04(this.A05) > 1) {
                        str = "mas";
                    } else {
                        str = null;
                    }
                    DbV.A1H(A0e, str);
                }
            }
            A01(eUo);
            return;
        }
        this.A0N.A03();
        C48070EUo eUo2 = C48070EUo.A01;
        if (this.A0A.A02 && !0nA.A0z(this.A00)) {
            0wc A023 = AnonymousClass0kN.A02(this.A05);
            long currentTimeMillis = System.currentTimeMillis();
            double A003 = DbS.A00();
            0Aj A0e2 = AnonymousClass7TE.A0e(A023, "email_prefill_accepted");
            A0e2.A7p("accepted", Boolean.valueOf(this.A0A.A01.equals(AnonymousClass7TF.A0f(this.A00))));
            DbW.A14(A0e2, currentTimeMillis);
            DbY.A1D(A0e2, (double) currentTimeMillis, A003);
            DbY.A1I(A0e2, "flow", B6Y().A00, A003);
            DbZ.A1J(A0e2, BzS().A01);
            DbS.A1K(A0e2, "email_or_phone");
            DbY.A1A(A0e2);
            A0e2.Cgf();
        }
        A01(eUo2);
        fgj.A05(getContext());
    }

    public final void DgP(Context context, String str, String str2) {
        FGJ.A01(context, this.A05, str2, str, false);
    }

    public final void ESy(CountryCodeData countryCodeData) {
        this.A0I = countryCodeData;
        C49709F2u f2u = this.A0E;
        C49702F2n f2n = f2u.A00;
        f2n.getClass();
        CountryCodeData countryCodeData2 = f2n.A04;
        if (countryCodeData2 != null) {
            String str = countryCodeData2.A00;
            String str2 = countryCodeData2.A01;
            String str3 = countryCodeData.A00;
            String str4 = countryCodeData.A01;
            0lg r7 = f2u.A09;
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r7), "country_code_change");
            if (A0e.isSampled()) {
                double A012 = DbS.A01();
                double A002 = DbS.A00();
                Dbc.A0Y(A0e, A012, A002);
                Dbc.A0c(A0e, "step", f2u.A0A.A01, A002);
                A0e.AAJ("to_code", str4);
                DbS.A1G(A0e, "phone");
                A0e.AAJ("from_country", str);
                A0e.AAJ("from_code", str2);
                A0e.AAJ("to_country", str3);
                DbW.A13(A0e, A012);
                FH8.A08(A0e, r7);
            }
        }
        f2u.A00.A04 = countryCodeData;
        TextView textView = f2u.A07;
        textView.setText(countryCodeData.A02());
        textView.setContentDescription(countryCodeData.A02);
        f2u.A00.A01();
    }

    public final void EuV(String str, Integer num) {
        InlineErrorMessageView inlineErrorMessageView;
        if (this.A0W) {
            this.A0W = false;
            FCQ.A00(this, this.A05, this.A0K, str);
            return;
        }
        if (num == AnonymousClass05K.A0N) {
            inlineErrorMessageView = this.A0N;
        } else if (num == AnonymousClass05K.A0Y) {
            inlineErrorMessageView = this.A0O;
        } else {
            C49958FGq.A08(this.A0Z, str);
            return;
        }
        inlineErrorMessageView.A04(str);
        this.A0Z.A02();
    }

    public final String getModuleName() {
        return "email_or_phone";
    }

    public final AnonymousClass0wW getSession() {
        return this.A05;
    }

    public final void onTokenChange() {
        11Z.A02(new C51233Fqo(this));
    }

    public static void A04(E3Y e3y, RegFlowExtras regFlowExtras, String str) {
        1OC A012 = FCI.A01(e3y.getContext(), e3y.A05, str, FV8.A00().A02(e3y.A05, "ig_android_growth_FX_access_fbig_verify_email", __redex_internal_original_name), DbT.A0P(e3y.A05).A02(19f.A1X), e3y.A0S);
        A012.A00 = new EDL(e3y, regFlowExtras, str, 8);
        e3y.schedule(A012);
    }

    public final boolean Ca3() {
        AutoCompleteTextView autoCompleteTextView;
        if (A07(this)) {
            autoCompleteTextView = this.A01;
        } else {
            autoCompleteTextView = this.A00;
        }
        return !Dba.A1V(autoCompleteTextView);
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(2114860104);
        RegFlowExtras regFlowExtras = this.A0J;
        regFlowExtras.A08 = 0nA.A0I(this.A00);
        regFlowExtras.A0R = 0nA.A0I(this.A01);
        C49702F2n f2n = this.A0E.A00;
        f2n.getClass();
        regFlowExtras.A01 = f2n.A04;
        regFlowExtras.A03(B6Y());
        regFlowExtras.A0N = BzS().name();
        C49913FEl.A00(getContext()).A03(this.A05, this.A0J);
        AnonymousClass0fD.A0A(2055517912, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(1465114895, AnonymousClass0fD.A03(-1438490763));
    }

    /* JADX WARNING: type inference failed for: r0v33, types: [X.R9k, X.11X] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r0 = -1510966846(0xffffffffa5f079c2, float:-4.171587E-16)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r7 = r13
            X.E3Y.super.onCreate(r14)
            android.os.Bundle r4 = r13.mArguments
            X.08y r0 = X.09i.A0A
            X.0aP r0 = r0.A02(r4)
            r13.A05 = r0
            if (r4 == 0) goto L_0x0114
            java.lang.String r1 = "RegFlowExtras.EXTRA_KEY"
            android.os.Parcelable r0 = r4.getParcelable(r1)
            if (r0 == 0) goto L_0x0114
            android.os.Parcelable r2 = r4.getParcelable(r1)
            com.instagram.registration.model.RegFlowExtras r2 = (com.instagram.registration.model.RegFlowExtras) r2
        L_0x0025:
            r13.A0J = r2
            androidx.fragment.app.FragmentActivity r1 = r13.getActivity()
            r12 = 0
            boolean r0 = r1 instanceof com.instagram.nux.activity.SignedOutFragmentActivity
            if (r0 == 0) goto L_0x0037
            r0 = r1
            com.instagram.nux.activity.SignedOutFragmentActivity r0 = (com.instagram.nux.activity.SignedOutFragmentActivity) r0
            java.lang.String r12 = r0.A06
            r2.A04 = r12
        L_0x0037:
            com.instagram.fx.access.sso.FxSsoViewModel r0 = X.DbY.A0V(r1)
            r13.A07 = r0
            com.facebook.common.callercontext.CallerContext r0 = X.EEM.A0B
            X.0aP r9 = r13.A05
            X.DiE r11 = r13.BzS()
            r10 = 0
            X.EEM r6 = new X.EEM
            r8 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.A0B = r6
            X.EXD r2 = X.EXD.SAC
            com.instagram.registration.model.RegFlowExtras r1 = r13.A0J
            X.EXD r0 = r1.A01()
            r5 = 0
            boolean r0 = X.AnonymousClass7TF.A1W(r2, r0)
            r13.A0T = r0
            if (r14 != 0) goto L_0x00f9
            com.instagram.phonenumber.model.CountryCodeData r6 = r1.A01
            if (r6 != 0) goto L_0x006b
            android.content.Context r0 = r13.getContext()
            com.instagram.phonenumber.model.CountryCodeData r6 = X.C3270479e.A00(r0)
        L_0x006b:
            r13.A0I = r6
        L_0x006d:
            com.instagram.registration.model.RegFlowExtras r0 = r13.A0J
            X.EXD r1 = r0.A01()
            X.EXD r0 = X.EXD.A03
            if (r1 != r0) goto L_0x007b
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r13.A0P = r0
        L_0x007b:
            X.0xa r0 = X.DbV.A0d()
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "has_user_confirmed_dialog"
            r1.E5T(r0, r5)
            r1.apply()
            X.0aP r0 = r13.A05
            X.3kW r0 = X.AnonymousClass1Qz.A00(r0)
            r13.A0X = r0
            java.lang.String r0 = X.DbZ.A0i(r13)
            r13.A0Q = r0
            java.lang.String r0 = X.Dba.A0X(r13)
            r13.A0R = r0
            boolean r0 = r13.A0T
            if (r0 != 0) goto L_0x00ac
            r1 = 1
            X.R9k r0 = new X.R9k
            r0.<init>(r13, r1)
            r13.schedule(r0)
        L_0x00ac:
            if (r4 == 0) goto L_0x00b6
            java.lang.String r0 = "is_current_user_fb_connected"
            boolean r0 = r4.getBoolean(r0, r5)
            r13.A0U = r0
        L_0x00b6:
            X.0Tu r0 = X.0Tu.A05
            java.lang.String r1 = X.Dba.A0Z(r0)
            java.lang.String r0 = "ContactPointTriageFragment"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x00f2
            java.lang.Boolean r0 = X.C49035EoF.A00()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00db
            X.1pg r2 = X.C49130Ept.A00()
            android.content.Context r1 = r13.requireContext()
            X.0aP r0 = r13.A05
            r2.A00(r1, r0, r10)
        L_0x00db:
            java.lang.Boolean r0 = X.C49036EoG.A00()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00f2
            X.1pg r2 = X.C49130Ept.A00()
            android.content.Context r1 = r13.requireContext()
            X.0aP r0 = r13.A05
            r2.A01(r1, r0, r10)
        L_0x00f2:
            r0 = -1876308194(0xffffffff9029cf1e, float:-3.348893E-29)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x00f9:
            java.lang.String r0 = "SAVED_STATE_COUNTRY_CODE"
            java.lang.String r2 = r14.getString(r0)
            java.lang.String r0 = "SAVED_STATE_COUNTRY_DISPLAY_STRING"
            java.lang.String r1 = r14.getString(r0)
            java.lang.String r0 = "SAVED_STATE_COUNTRY"
            java.lang.String r0 = r14.getString(r0)
            if (r2 == 0) goto L_0x006d
            com.instagram.phonenumber.model.CountryCodeData r6 = new com.instagram.phonenumber.model.CountryCodeData
            r6.<init>(r2, r1, r0)
            goto L_0x006b
        L_0x0114:
            com.instagram.registration.model.RegFlowExtras r2 = new com.instagram.registration.model.RegFlowExtras
            r2.<init>()
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3Y.onCreate(android.os.Bundle):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: X.E3Y} */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0416, code lost:
        if (r1.containsKey("caa_registration_redirection_to_native") == false) goto L_0x0418;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x044e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r41, android.view.ViewGroup r42, android.os.Bundle r43) {
        /*
            r40 = this;
            r0 = -1539541072(0xffffffffa43c77b0, float:-4.086738E-17)
            int r19 = X.AnonymousClass0fD.A02(r0)
            r0 = 2131628937(0x7f0e1389, float:1.888518E38)
            r3 = r41
            r1 = r42
            android.view.View r5 = X.DbT.A0C(r3, r1, r0)
            com.instagram.registration.ui.NotificationBar r0 = X.Dba.A0M(r5)
            r6 = r40
            r6.A0Z = r0
            r2 = 2131624635(0x7f0e02bb, float:1.8876455E38)
            r0 = 2131430689(0x7f0b0d21, float:1.8483086E38)
            android.view.ViewGroup r1 = X.DbU.A0C(r5, r0)
            r0 = 1
            r3.inflate(r2, r1, r0)
            r0 = 2131430653(0x7f0b0cfd, float:1.8483013E38)
            android.view.ViewStub r8 = X.DbU.A0D(r5, r0)
            r0 = 2131624636(0x7f0e02bc, float:1.8876457E38)
            r8.setLayoutResource(r0)
            android.view.ViewGroup$MarginLayoutParams r7 = X.DbS.A0D(r8)
            boolean r0 = r6.A06()
            if (r0 == 0) goto L_0x0488
            android.content.res.Resources r1 = X.DbU.A05(r8)
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            int r0 = r1.getDimensionPixelSize(r0)
        L_0x004a:
            int r3 = r7.leftMargin
            int r2 = r7.topMargin
            int r1 = r7.rightMargin
            r7.setMargins(r3, r2, r1, r0)
            r8.setLayoutParams(r7)
            r8.inflate()
            r0 = 2131435394(0x7f0b1f82, float:1.8492629E38)
            android.view.View r9 = r5.requireViewById(r0)
            r0 = 2131440027(0x7f0b319b, float:1.8502026E38)
            android.view.View r8 = r5.requireViewById(r0)
            r0 = 2131440028(0x7f0b319c, float:1.8502028E38)
            android.view.View r15 = X.DbY.A0F(r5, r0)
            r0 = 2131432281(0x7f0b1359, float:1.8486315E38)
            android.view.View r0 = r15.findViewById(r0)
            android.widget.AutoCompleteTextView r0 = (android.widget.AutoCompleteTextView) r0
            r6.A00 = r0
            r2 = 2131442424(0x7f0b3af8, float:1.8506887E38)
            android.widget.TextView r14 = X.DbU.A0G(r8, r2)
            r0 = 2131974890(0x7f135aea, float:1.9586857E38)
            r14.setText(r0)
            r0 = 2131442422(0x7f0b3af6, float:1.8506883E38)
            r1 = 2131442422(0x7f0b3af6, float:1.8506883E38)
            android.view.View r28 = r8.findViewById(r0)
            r0 = 2131432279(0x7f0b1357, float:1.848631E38)
            android.widget.ImageView r22 = X.DbS.A0G(r5, r0)
            r0 = 2131440029(0x7f0b319d, float:1.850203E38)
            android.view.View r7 = r5.findViewById(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r7 = (com.instagram.ui.widget.progressbutton.ProgressButton) r7
            android.widget.AutoCompleteTextView r3 = r6.A00
            boolean r0 = X.0nA.A0z(r3)
            if (r0 == 0) goto L_0x046c
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0J
            java.lang.String r0 = r0.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x046c
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0J
            java.lang.String r0 = r0.A08
        L_0x00b6:
            r3.setText(r0)
        L_0x00b9:
            X.0aP r10 = r6.A05
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            X.EEK r0 = new X.EEK
            r0.<init>(r3, r10, r6, r7)
            r0.A03 = r4
            r6.A0L = r0
            X.0aP r10 = r6.A05
            X.DiE r18 = X.C46634DiE.A0d
            X.F0L r0 = new X.F0L
            r20 = r0
            r21 = r3
            r23 = r6
            r24 = r10
            r25 = r18
            r20.<init>(r21, r22, r23, r24, r25)
            r6.A0A = r0
            X.EEK r0 = r6.A0L
            r6.registerLifecycleListener(r0)
            r0 = 2131435395(0x7f0b1f83, float:1.849263E38)
            android.view.View r17 = X.DbY.A0F(r5, r0)
            r3 = 2131437618(0x7f0b2832, float:1.849714E38)
            r0 = r17
            android.view.View r0 = r0.requireViewById(r3)
            android.widget.AutoCompleteTextView r0 = (android.widget.AutoCompleteTextView) r0
            r6.A01 = r0
            r10 = 2131437619(0x7f0b2833, float:1.8497142E38)
            r5.requireViewById(r10)
            android.widget.AutoCompleteTextView r0 = r6.A01
            r0.setDropDownAnchor(r10)
            r3 = 2131437617(0x7f0b2831, float:1.8497138E38)
            android.widget.ImageView r22 = X.DbS.A0G(r5, r3)
            android.widget.TextView r16 = X.DbU.A0G(r9, r2)
            r2 = 2131974898(0x7f135af2, float:1.9586873E38)
            r0 = r16
            r0.setText(r2)
            android.view.View r34 = r9.findViewById(r1)
            r0 = 2131435396(0x7f0b1f84, float:1.8492633E38)
            android.view.View r2 = r5.findViewById(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r2 = (com.instagram.ui.widget.progressbutton.ProgressButton) r2
            r0 = 2131430872(0x7f0b0dd8, float:1.8483457E38)
            android.widget.TextView r11 = X.DbU.A0G(r5, r0)
            r6.A02 = r11
            android.widget.AutoCompleteTextView r1 = r6.A01
            android.content.Context r0 = r6.getContext()
            boolean r0 = X.0mk.A02(r0)
            if (r0 == 0) goto L_0x013a
            r0 = 8388629(0x800015, float:1.1754973E-38)
            r1.setGravity(r0)
        L_0x013a:
            boolean r0 = X.0nA.A0z(r1)
            if (r0 == 0) goto L_0x044e
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0J
            java.lang.String r0 = r0.A0R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x044e
            android.widget.AutoCompleteTextView r1 = r6.A01
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0J
            java.lang.String r0 = r0.A0R
        L_0x0150:
            r1.setText(r0)
            com.instagram.phonenumber.model.CountryCodeData r0 = r6.A0I
            java.lang.String r0 = r0.A02()
            r11.setText(r0)
            com.instagram.phonenumber.model.CountryCodeData r0 = r6.A0I
            java.lang.String r0 = r0.A02
            if (r0 != 0) goto L_0x0164
            java.lang.String r0 = ""
        L_0x0164:
            r11.setContentDescription(r0)
        L_0x0167:
            X.0aP r13 = r6.A05
            android.widget.AutoCompleteTextView r12 = r6.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.EEK r0 = new X.EEK
            r0.<init>(r12, r13, r6, r2)
            r0.A03 = r1
            r6.A0M = r0
            X.0aP r0 = r6.A05
            r20 = r0
            X.DiE r0 = X.C46634DiE.A1F
            android.widget.AutoCompleteTextView r12 = r6.A01
            r21 = r12
            com.instagram.phonenumber.model.CountryCodeData r13 = r6.A0I
            X.F2u r12 = new X.F2u
            r23 = r11
            r24 = r6
            r25 = r20
            r26 = r13
            r27 = r0
            r20 = r12
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r6.A0E = r12
            X.EEK r11 = r6.A0M
            r6.registerLifecycleListener(r11)
            r11 = 2131442388(0x7f0b3ad4, float:1.8506814E38)
            android.view.View r11 = r5.findViewById(r11)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            X.0aP r12 = r6.A05
            r24 = r12
            android.widget.AutoCompleteTextView r13 = r6.A00
            X.EEK r12 = r6.A0L
            X.F2m r26 = new X.F2m
            r27 = r15
            r29 = r7
            r30 = r8
            r31 = r13
            r32 = r14
            r33 = r12
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            android.widget.AutoCompleteTextView r13 = r6.A01
            X.EEK r12 = r6.A0M
            X.F2m r27 = new X.F2m
            r32 = r27
            r33 = r17
            r35 = r2
            r36 = r9
            r37 = r13
            r38 = r16
            r39 = r12
            r32.<init>(r33, r34, r35, r36, r37, r38, r39)
            X.F0L r14 = r6.A0A
            X.F2u r13 = r6.A0E
            java.lang.Integer r12 = r6.A0P
            X.EEG r2 = new X.EEG
            r29 = r13
            r30 = r12
            r31 = r4
            r20 = r2
            r21 = r8
            r22 = r9
            r23 = r11
            r25 = r6
            r28 = r14
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r6.A0H = r2
            r6.registerLifecycleListener(r2)
            android.widget.AutoCompleteTextView r9 = r6.A00
            r2 = 2131432282(0x7f0b135a, float:1.8486317E38)
            android.view.View r8 = r5.findViewById(r2)
            r2 = r18
            r6.A00(r8, r9, r2)
            android.widget.AutoCompleteTextView r8 = r6.A01
            android.view.View r2 = r5.findViewById(r10)
            r6.A00(r2, r8, r0)
            r0 = 2131432283(0x7f0b135b, float:1.848632E38)
            android.view.View r0 = r5.findViewById(r0)
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = (com.instagram.ui.widget.inlineerror.InlineErrorMessageView) r0
            r6.A0N = r0
            r0 = 2131437623(0x7f0b2837, float:1.849715E38)
            android.view.View r0 = r5.findViewById(r0)
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = (com.instagram.ui.widget.inlineerror.InlineErrorMessageView) r0
            r6.A0O = r0
            android.animation.TimeInterpolator r0 = com.instagram.ui.widget.inlineerror.InlineErrorMessageView.A09
            X.C49165EqW.A00(r11)
            android.widget.AutoCompleteTextView r2 = r6.A01
            X.W7f r0 = r6.A0b
            r2.addTextChangedListener(r0)
            android.widget.AutoCompleteTextView r2 = r6.A00
            X.W7f r0 = r6.A0a
            r2.addTextChangedListener(r0)
            r0 = 2131441498(0x7f0b375a, float:1.850501E38)
            android.widget.TextView r10 = X.AnonymousClass7TE.A0d(r5, r0)
            r6.A04 = r10
            r9 = 2131440747(0x7f0b346b, float:1.8503486E38)
            android.view.View r2 = r5.findViewById(r9)
            android.widget.ScrollView r2 = (android.widget.ScrollView) r2
            r8 = 0
            X.Ezr r0 = new X.Ezr
            r0.<init>(r10, r2, r8)
            r6.A0D = r0
            android.view.View r10 = r5.findViewById(r9)
            android.widget.ScrollView r10 = (android.widget.ScrollView) r10
            android.content.Context r11 = r6.getContext()
            X.0qQ.A0B(r11, r8)
            android.content.res.Resources$Theme r2 = r11.getTheme()
            r0 = 2130971024(0x7f040990, float:1.7550775E38)
            int[] r0 = new int[]{r0}
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r0)
            X.0qQ.A07(r9)
            android.content.res.Resources r2 = r11.getResources()
            r0 = 2131165209(0x7f070019, float:1.7944629E38)
            int r0 = r2.getDimensionPixelSize(r0)
            int r0 = r9.getDimensionPixelSize(r8, r0)
            r9.recycle()
            int r2 = r0 * 2
            X.Ezr r0 = new X.Ezr
            r0.<init>(r7, r10, r2)
            r6.A0C = r0
            X.0aP r7 = r6.A05
            android.widget.AutoCompleteTextView r2 = r6.A01
            X.F2b r0 = new X.F2b
            r0.<init>(r2, r7, r6, r4)
            r6.A0G = r0
            X.0aP r7 = r6.A05
            android.widget.AutoCompleteTextView r2 = r6.A00
            X.F2b r0 = new X.F2b
            r0.<init>(r2, r7, r6, r1)
            r6.A0F = r0
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0J
            boolean r0 = r0.A0t
            if (r0 == 0) goto L_0x02bc
            android.widget.AutoCompleteTextView r0 = r6.A01
            boolean r0 = X.0nA.A0z(r0)
            if (r0 == 0) goto L_0x02bc
            android.widget.AutoCompleteTextView r0 = r6.A00
            boolean r0 = X.0nA.A0z(r0)
            if (r0 != 0) goto L_0x02bc
            X.EEG r2 = r6.A0H
            X.0aP r0 = r6.A05
            r2.A00(r0, r4, r1)
        L_0x02bc:
            boolean r0 = r6.A06()
            if (r0 == 0) goto L_0x039c
            r0 = 2131432579(0x7f0b1483, float:1.848692E38)
            android.view.View r9 = X.DbY.A0F(r5, r0)
            r0 = 2131435716(0x7f0b20c4, float:1.8493282E38)
            android.view.View r1 = r9.requireViewById(r0)
            com.instagram.common.ui.base.IgFrameLayout r1 = (com.instagram.common.ui.base.IgFrameLayout) r1
            r6.A06 = r1
            r0 = 45
            X.FP0.A00(r1, r0, r6)
            com.instagram.common.ui.base.IgFrameLayout r0 = r6.A06
            android.view.ViewGroup$MarginLayoutParams r7 = X.DbS.A0D(r0)
            int r4 = r7.leftMargin
            android.content.Context r0 = r5.getContext()
            int r2 = X.AnonymousClass7TG.A02(r0)
            int r1 = r7.rightMargin
            int r0 = r7.bottomMargin
            r7.setMargins(r4, r2, r1, r0)
            com.instagram.common.ui.base.IgFrameLayout r0 = r6.A06
            r0.setLayoutParams(r7)
            r0 = 2131435715(0x7f0b20c3, float:1.849328E38)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r9, r0)
            r6.A03 = r1
            if (r1 == 0) goto L_0x0331
            r0 = 2131238290(0x7f081d92, float:1.8092855E38)
            r1.setCompoundDrawablesWithIntrinsicBounds(r0, r8, r8, r8)
            android.widget.TextView r1 = r6.A03
            android.content.Context r0 = r6.getContext()
            int r0 = X.2Yu.A0D(r0)
            X.C49948FGd.A02(r1, r0)
            android.widget.TextView r2 = r6.A03
            android.content.Context r1 = r6.getContext()
            android.content.Context r0 = r6.requireContext()
            int r0 = X.2Yu.A07(r0)
            X.DbT.A17(r1, r2, r0)
            android.widget.TextView r1 = r6.A03
            android.content.Context r0 = r6.getContext()
            int r0 = X.2Yu.A0B(r0)
            X.C49948FGd.A02(r1, r0)
        L_0x0331:
            com.instagram.common.ui.base.IgFrameLayout r1 = r6.A06
            r0 = 2131231235(0x7f080203, float:1.8078545E38)
            r1.setBackgroundResource(r0)
            android.widget.TextView r0 = r6.A03
            if (r0 == 0) goto L_0x042e
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r6.A07
            boolean r0 = com.instagram.fx.access.sso.FxSsoViewModel.A01(r0)
            if (r0 != 0) goto L_0x042e
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r6.A07
            X.0eM r0 = r0.A00
            java.lang.Object r1 = X.Dba.A0W(r0)
            java.lang.String r1 = (java.lang.String) r1
            android.widget.TextView r0 = r6.A03
            if (r0 == 0) goto L_0x0358
            if (r1 == 0) goto L_0x0358
            r0.setText(r1)
        L_0x0358:
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r6.A07
            X.0eM r0 = r0.A00
            X.2Fk r1 = X.DbT.A0H(r0)
            r0 = 25
            X.C50139FQw.A00(r6, r1, r0)
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r6.A07
            X.0eM r0 = r0.A02
            X.2Fk r1 = X.DbT.A0H(r0)
            r0 = 26
            X.C50139FQw.A00(r6, r1, r0)
            X.0aP r4 = r6.A05
            X.DiE r2 = r6.BzS()
            r1 = 0
            X.EEB r0 = new X.EEB
            r0.<init>(r4, r1, r2)
            r6.A09 = r0
            r6.registerLifecycleListener(r0)
            X.1Q0 r1 = X.1Q0.A0Z
            X.0aP r0 = r6.A05
            X.FGI r2 = r1.A02(r0)
            X.DiE r1 = r6.BzS()
            X.EXD r0 = r6.B6Y()
            X.FBm r1 = r2.A06(r0, r1)
            boolean r0 = r6.A0U
            X.C49886FBm.A01(r1, r0)
        L_0x039c:
            android.widget.ImageView r0 = X.DbS.A0G(r5, r3)
            X.0qQ.A0B(r0, r8)
            r1 = 2131100272(0x7f060270, float:1.781292E38)
            X.C49948FGd.A01(r0, r1)
            r0 = 2131432279(0x7f0b1357, float:1.848631E38)
            android.widget.ImageView r0 = X.DbS.A0G(r5, r0)
            X.0qQ.A0B(r0, r8)
            X.C49948FGd.A01(r0, r1)
            boolean r0 = r6.A0T
            if (r0 == 0) goto L_0x03ed
            r0 = 2131443078(0x7f0b3d86, float:1.8508214E38)
            int r1 = X.Dbb.A03(r5, r0)
            r0 = 2131434552(0x7f0b1c38, float:1.8490921E38)
            X.DbT.A1F(r5, r0, r1)
            r0 = 2131439771(0x7f0b309b, float:1.8501507E38)
            X.DbT.A1F(r5, r0, r1)
            r0 = 2131442898(0x7f0b3cd2, float:1.8507849E38)
            X.DbT.A1F(r5, r0, r8)
        L_0x03d3:
            X.14i r0 = X.14i.A08
            r0.A0A(r6)
            r0 = 2131444107(0x7f0b418b, float:1.85103E38)
            X.2eb r0 = X.DbY.A0T(r5, r0)
            r6.A0Y = r0
            A02(r6)
            r1 = -741232825(0xffffffffd3d1af47, float:-1.80117766E12)
            r0 = r19
            X.AnonymousClass0fD.A09(r1, r0)
            return r5
        L_0x03ed:
            r0 = 2131434552(0x7f0b1c38, float:1.8490921E38)
            android.widget.ImageView r1 = X.DbS.A0G(r5, r0)
            android.content.Context r0 = r6.getContext()
            X.Dba.A0p(r0, r1)
            X.0aP r2 = r6.A05
            X.DiE r9 = r6.BzS()
            X.EXD r8 = r6.B6Y()
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()
            android.os.Bundle r1 = X.DbU.A06(r0)
            if (r1 == 0) goto L_0x0418
            java.lang.String r0 = "caa_registration_redirection_to_native"
            boolean r0 = r1.containsKey(r0)
            r10 = 1
            if (r0 != 0) goto L_0x0419
        L_0x0418:
            r10 = 0
        L_0x0419:
            r7 = r2
            X.C49958FGq.A05(r5, r6, r7, r8, r9, r10)
            r0 = 2131435701(0x7f0b20b5, float:1.8493252E38)
            android.view.View r1 = r5.findViewById(r0)
            android.content.Context r0 = r6.requireContext()
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.FCK.A00(r1, r0)
            goto L_0x03d3
        L_0x042e:
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r6.A07
            X.0eM r0 = r0.A01
            java.lang.Object r1 = X.Dba.A0W(r0)
            java.lang.String r1 = (java.lang.String) r1
            android.widget.TextView r0 = r6.A03
            if (r0 == 0) goto L_0x0441
            if (r1 == 0) goto L_0x0441
            r0.setText(r1)
        L_0x0441:
            X.EEM r2 = r6.A0B
            X.DiE r1 = r6.BzS()
            android.widget.TextView r0 = r6.A03
            r2.A09(r0, r6, r1)
            goto L_0x0358
        L_0x044e:
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0J
            boolean r0 = r0.A0t
            if (r0 == 0) goto L_0x0167
            boolean r0 = X.0nA.A0z(r1)
            if (r0 == 0) goto L_0x0167
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0J
            java.lang.String r0 = r0.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0167
            android.widget.AutoCompleteTextView r1 = r6.A01
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0J
            java.lang.String r0 = r0.A0L
            goto L_0x0150
        L_0x046c:
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0J
            boolean r0 = r0.A0t
            if (r0 == 0) goto L_0x00b9
            boolean r0 = X.0nA.A0z(r3)
            if (r0 == 0) goto L_0x00b9
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0J
            java.lang.String r0 = r0.A0I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00b9
            com.instagram.registration.model.RegFlowExtras r0 = r6.A0J
            java.lang.String r0 = r0.A0I
            goto L_0x00b6
        L_0x0488:
            android.content.Context r4 = r6.getContext()
            r3 = 0
            X.0qQ.A0B(r4, r3)
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r0 = 2130971024(0x7f040990, float:1.7550775E38)
            int[] r0 = new int[]{r0}
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r0)
            X.0qQ.A07(r2)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165209(0x7f070019, float:1.7944629E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r0 = r2.getDimensionPixelSize(r3, r0)
            r2.recycle()
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3Y.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(30449988);
        super.onDestroy();
        this.A0I = null;
        AnonymousClass0fD.A09(1622570584, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1720614173);
        super.onDestroyView();
        this.A01.removeTextChangedListener(this.A0b);
        this.A00.removeTextChangedListener(this.A0a);
        this.A00 = null;
        this.A01 = null;
        this.A04 = null;
        this.A0Z = null;
        this.A0N = null;
        this.A0O = null;
        this.A0Y = null;
        this.A02 = null;
        this.A0P = this.A0H.A01;
        C49702F2n f2n = this.A0E.A00;
        f2n.getClass();
        this.A0I = f2n.A04;
        unregisterLifecycleListener(this.A0L);
        unregisterLifecycleListener(this.A0M);
        unregisterLifecycleListener(this.A0H);
        14i.A06(this);
        this.A08 = null;
        this.A0L = null;
        this.A0M = null;
        this.A0A = null;
        this.A0E = null;
        this.A0H = null;
        this.A0D = null;
        this.A0C = null;
        EEB eeb = this.A09;
        if (eeb != null) {
            unregisterLifecycleListener(eeb);
            this.A09 = null;
        }
        if (A06()) {
            1xC r2 = 1xC.A01;
            r2.A03(this.A0c, C50249FVg.class);
            r2.A03(this.A0d, C50250FVh.class);
        }
        AnonymousClass0fD.A09(760239670, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(87679452);
        E3Y.super.onPause();
        DbV.A0G(this).setSoftInputMode(0);
        AnonymousClass0fD.A09(17256810, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1334507447);
        super.onResume();
        Dbb.A10(this);
        AnonymousClass0fD.A09(-2007473635, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        CountryCodeData countryCodeData = this.A0I;
        if (countryCodeData != null) {
            bundle.putString("SAVED_STATE_COUNTRY_CODE", countryCodeData.A01);
            bundle.putString("SAVED_STATE_COUNTRY_DISPLAY_STRING", this.A0I.A02);
            bundle.putString("SAVED_STATE_COUNTRY", this.A0I.A00);
        }
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(349025558);
        E3Y.super.onStart();
        FGJ.A03.A05(getActivity());
        C49634Ezr ezr = this.A0D;
        if (ezr != null) {
            ezr.A00.DmJ(getActivity());
        }
        C49634Ezr ezr2 = this.A0C;
        if (ezr2 != null) {
            ezr2.A00.DmJ(getActivity());
        }
        this.A0X.AAX(this);
        AnonymousClass0fD.A09(-1098225434, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-878396686);
        E3Y.super.onStop();
        C49634Ezr ezr = this.A0D;
        if (ezr != null) {
            ezr.A00.onStop();
        }
        C49634Ezr ezr2 = this.A0C;
        if (ezr2 != null) {
            ezr2.A00.onStop();
        }
        this.A0X.EEn(this);
        AnonymousClass0fD.A09(1284081149, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        super.onViewCreated(view, bundle);
        AnonymousClass0aP r1 = this.A05;
        String str = BzS().A01;
        EXD B6Y = B6Y();
        if (A07(this)) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        AnonymousClass7TG.A1N(r1, str);
        C49938FFr.A00(r1, (C49922FEx) null, B6Y, num, str, (String) null);
        if (A06()) {
            1xC.A01.A02(this.A0c, C50249FVg.class);
        }
        1xC.A01.A02(this.A0d, C50250FVh.class);
    }
}
