package X;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.Map;

public final class NJ5 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DirectEditIceBreakerFragment";
    public Intent A00;
    public View A01;
    public View A02;
    public EditText A03;
    public EditText A04;
    public TextView A05;
    public TextView A06;
    public C70932OSf A07;
    public C70814OMj A08;
    public OyN A09;
    public View A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public UserSession A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public final TextWatcher A0J = new C71273OhE(this, 7);
    public final C74442Pux A0K = new P0b(this);

    public final String getModuleName() {
        return "direct_edit_icebreaker_fragment";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a7, code lost:
        if (A01(r7) == false) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.NJ5 r7) {
        /*
            android.widget.EditText r0 = r7.A03
            java.lang.String r2 = X.AnonymousClass7TF.A0f(r0)
            java.util.regex.Pattern r0 = X.0mp.A06
            if (r2 == 0) goto L_0x00f1
            int r1 = r2.length()
            r0 = 80
            if (r1 <= r0) goto L_0x00f1
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
        L_0x0014:
            int r2 = r4.intValue()
            r1 = 1
            r0 = 2
            if (r2 == r0) goto L_0x00e2
            if (r2 == r1) goto L_0x00d9
            r0 = 0
            if (r2 != r0) goto L_0x00c2
            android.content.res.Resources r1 = X.DbV.A05(r7)
            r0 = 2131959187(0x7f131d93, float:1.9555007E38)
        L_0x0028:
            java.lang.String r1 = r1.getString(r0)
        L_0x002c:
            if (r1 == 0) goto L_0x00c2
            android.widget.TextView r0 = r7.A05
            r0.setText(r1)
            android.widget.TextView r3 = r7.A05
            android.content.Context r2 = r7.requireContext()
            android.content.Context r1 = r7.requireContext()
            r0 = 2130970215(0x7f040667, float:1.7549134E38)
        L_0x0040:
            int r0 = X.2Yu.A0H(r1, r0)
            X.DbT.A17(r2, r3, r0)
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            r6 = r5
            android.widget.EditText r0 = r7.A04
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            if (r0 == 0) goto L_0x005e
            int r1 = r0.length()
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 <= r0) goto L_0x005e
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
        L_0x005e:
            android.widget.TextView r3 = r7.A06
            if (r3 == 0) goto L_0x008a
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r5 != r0) goto L_0x00ae
            android.content.res.Resources r2 = X.DbV.A05(r7)
            r1 = 2131820653(0x7f11006d, float:1.9274027E38)
            r0 = 500(0x1f4, float:7.0E-43)
            java.lang.String r0 = X.DbY.A0d(r2, r0, r1)
            r3.setText(r0)
            android.widget.TextView r3 = r7.A06
            android.content.Context r2 = r7.requireContext()
            android.content.Context r1 = r7.requireContext()
            r0 = 2130970215(0x7f040667, float:1.7549134E38)
        L_0x0083:
            int r0 = X.2Yu.A0H(r1, r0)
            X.DbT.A17(r2, r3, r0)
        L_0x008a:
            android.view.View r2 = r7.A02
            if (r2 == 0) goto L_0x00ad
            if (r4 != r6) goto L_0x00a9
            if (r5 != r6) goto L_0x00a9
            android.widget.EditText r0 = r7.A03
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            java.lang.String r0 = r0.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a9
            boolean r1 = A01(r7)
            r0 = 1
            if (r1 != 0) goto L_0x00aa
        L_0x00a9:
            r0 = 0
        L_0x00aa:
            r2.setEnabled(r0)
        L_0x00ad:
            return
        L_0x00ae:
            r0 = 2131959196(0x7f131d9c, float:1.9555026E38)
            r3.setText(r0)
            android.widget.TextView r3 = r7.A06
            android.content.Context r2 = r7.requireContext()
            android.content.Context r1 = r7.requireContext()
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
            goto L_0x0083
        L_0x00c2:
            android.widget.TextView r1 = r7.A05
            r0 = 2131959193(0x7f131d99, float:1.955502E38)
            r1.setText(r0)
            android.widget.TextView r3 = r7.A05
            android.content.Context r2 = r7.requireContext()
            android.content.Context r1 = r7.requireContext()
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
            goto L_0x0040
        L_0x00d9:
            android.content.res.Resources r1 = X.DbV.A05(r7)
            r0 = 2131959190(0x7f131d96, float:1.9555013E38)
            goto L_0x0028
        L_0x00e2:
            android.content.res.Resources r2 = X.DbV.A05(r7)
            r1 = 2131959180(0x7f131d8c, float:1.9554993E38)
            r0 = 80
            java.lang.String r1 = X.JTS.A0i(r2, r0, r1)
            goto L_0x002c
        L_0x00f1:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0103
            java.lang.String r0 = "\n"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0103
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            goto L_0x0014
        L_0x0103:
            X.OyN r4 = r7.A09
            java.lang.String r3 = r2.trim()
            monitor-enter(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0144 }
            if (r0 != 0) goto L_0x013f
            java.util.Map r0 = r4.A05     // Catch:{ all -> 0x0144 }
            if (r0 == 0) goto L_0x013f
            java.util.Iterator r1 = X.AnonymousClass7TF.A0v(r0)     // Catch:{ all -> 0x0144 }
        L_0x0118:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0144 }
            if (r0 == 0) goto L_0x013f
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0144 }
            X.OMj r2 = (X.C70814OMj) r2     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = r2.A02     // Catch:{ all -> 0x0144 }
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch:{ all -> 0x0144 }
            if (r0 == 0) goto L_0x0118
            monitor-exit(r4)
            X.OMj r0 = r7.A08
            if (r0 == 0) goto L_0x013b
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r2.A01
            boolean r0 = X.0mp.A0G(r1, r0)
            if (r0 != 0) goto L_0x0140
        L_0x013b:
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            goto L_0x0014
        L_0x013f:
            monitor-exit(r4)
        L_0x0140:
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            goto L_0x0014
        L_0x0144:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJ5.A00(X.NJ5):void");
    }

    public static boolean A01(NJ5 nj5) {
        boolean equals;
        String trim = AnonymousClass7TF.A0f(nj5.A03).trim();
        C70814OMj oMj = nj5.A08;
        if (oMj == null) {
            equals = TextUtils.isEmpty(trim);
        } else {
            equals = trim.equals(oMj.A02);
        }
        if (!equals || A02(nj5)) {
            return true;
        }
        return false;
    }

    public static boolean A02(NJ5 nj5) {
        String trim;
        EditText editText = nj5.A04;
        if (editText == null) {
            trim = null;
        } else {
            trim = AnonymousClass7TF.A0f(editText).trim();
        }
        if (nj5.A08 == null) {
            return !TextUtils.isEmpty(trim);
        }
        if ((!TextUtils.isEmpty(trim) || !TextUtils.isEmpty(nj5.A08.A03)) && !2PP.A00(trim, nj5.A08.A03)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r4) {
        String str;
        ? obj = new Object();
        if (this.A08 != null) {
            str = getString(2131959188);
        } else {
            str = null;
        }
        obj.A02 = str;
        obj.A01 = new C71407Ok6(this, 61);
        this.A02 = r4.ErM(new C59904JbT(obj));
        AnonymousClass3JR A0K2 = DbS.A0K();
        A0K2.A00();
        DbX.A1A(new C71407Ok6(this, 62), A0K2, r4);
        A00(this);
    }

    public final AnonymousClass0wW getSession() {
        return this.A0E;
    }

    public final void onCreate(Bundle bundle) {
        C70814OMj oMj;
        int A022 = AnonymousClass0fD.A02(-1289604720);
        NJ5.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        UserSession A0U = DbS.A0U(requireArguments);
        this.A0E = A0U;
        this.A0I = !C69903Nu5.A00(A0U);
        this.A09 = OyN.A00(this.A0E);
        String string = requireArguments.getString("DirectEditIceBreakerFragment.icebreaker_id");
        this.A0F = requireArguments.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "business_settings");
        this.A0G = requireArguments.getString("DirectEditIceBreakerFragment.prefill_answer", "");
        if (string != null) {
            OyN oyN = this.A09;
            synchronized (oyN) {
                Map map = oyN.A05;
                if (map == null) {
                    oMj = null;
                } else {
                    oMj = (C70814OMj) map.get(string);
                }
            }
            this.A08 = oMj;
            oMj.getClass();
        }
        UserSession userSession = this.A0E;
        0qQ.A0B(userSession, 0);
        this.A07 = new C70932OSf(this, userSession);
        this.A00 = DbS.A09();
        AnonymousClass0fD.A09(-1623711885, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Resources resources;
        String str;
        int A022 = AnonymousClass0fD.A02(1619264597);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_edit_icebreaker, viewGroup, false);
        EditText A0E2 = DbU.A0E(inflate, R.id.question);
        this.A03 = A0E2;
        TextWatcher textWatcher = this.A0J;
        A0E2.addTextChangedListener(textWatcher);
        this.A05 = DbU.A0G(inflate, R.id.question_title);
        this.A0B = DbU.A0G(inflate, R.id.direct_edit_faq_add_question_header_title);
        this.A0A = inflate.requireViewById(R.id.direct_icebreaker_response_section);
        this.A0C = DbU.A0G(inflate, R.id.question_description);
        this.A0D = DbU.A0G(inflate, R.id.auto_response_description);
        if (getContext() != null) {
            resources = getContext().getResources();
        } else {
            resources = null;
        }
        C70814OMj oMj = this.A08;
        if (oMj != null) {
            this.A03.setText(oMj.A02);
            View requireViewById = inflate.requireViewById(R.id.delete);
            this.A01 = requireViewById;
            requireViewById.setVisibility(0);
            C71407Ok6.A00(this.A01, 60, this);
            C70932OSf.A00(this.A07, "icebreaker_settings_edit_question_screen_impression", (String) null, (Map) null);
        } else {
            View requireViewById2 = inflate.requireViewById(R.id.direct_add_icebreaker_header);
            TextView A0G2 = DbU.A0G(inflate, R.id.direct_edit_faq_add_question_header_description);
            int i = 2131959178;
            if (resources != null) {
                i = 2131959189;
                int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.abc_dropdownitem_icon_width);
                0nA.A0Y(requireViewById2, dimensionPixelOffset);
                0nA.A0a(requireViewById2, dimensionPixelOffset);
                this.A0B.setTypeface((Typeface) null, 1);
            }
            Resources A052 = DbV.A05(this);
            if (!this.A0I) {
                i = 2131959177;
            }
            DbU.A1A(A052, A0G2, i);
            requireViewById2.setVisibility(0);
            C70932OSf oSf = this.A07;
            boolean z = !this.A0F.equals("business_settings");
            HashMap A1E = AnonymousClass7TE.A1E();
            if (z) {
                str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str = "0";
            }
            A1E.put("from_qp", str);
            C70932OSf.A00(oSf, "icebreaker_settings_add_question_screen_impression", (String) null, A1E);
        }
        if (this.A0I) {
            this.A03.setSingleLine(true);
            this.A03.setImeOptions(5);
            View requireViewById3 = inflate.requireViewById(R.id.direct_icebreaker_response_section);
            requireViewById3.setVisibility(0);
            C70932OSf.A00(this.A07, "icebreaker_settings_auto_response_section_impression", (String) null, (Map) null);
            this.A04 = DbU.A0E(requireViewById3, R.id.auto_response_content);
            this.A06 = DbU.A0G(inflate, R.id.auto_response_title);
            this.A04.addTextChangedListener(textWatcher);
            C70814OMj oMj2 = this.A08;
            if (oMj2 != null) {
                EditText editText = this.A04;
                String str2 = oMj2.A03;
                if (str2 == null) {
                    str2 = "";
                }
                editText.setText(str2);
            }
            String str3 = this.A0G;
            if (!str3.isEmpty()) {
                this.A04.setText(str3);
            }
        }
        if (resources != null) {
            0nA.A0c(this.A0A, resources.getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material));
            this.A03.setMinimumHeight(resources.getDimensionPixelOffset(R.dimen.add_account_icon_circle_radius));
            this.A0C.setVisibility(8);
            TextView textView = this.A0D;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        AnonymousClass0fD.A09(-985816866, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1463390008);
        NJ5.super.onPause();
        this.A09.A02 = null;
        AnonymousClass0fD.A09(-807242883, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-578313496);
        super.onResume();
        if (!(getRootActivity() == null || getRootActivity().getWindow() == null)) {
            getRootActivity().getWindow().setSoftInputMode(16);
        }
        EditText editText = this.A03;
        editText.setSelection(DbX.A05(AnonymousClass7TF.A0f(editText)));
        this.A09.A02 = this.A0K;
        if (!this.A0H) {
            this.A0H = true;
            this.A03.requestFocus();
            0nA.A0Q(this.A03);
        }
        AnonymousClass0fD.A09(2119748687, A022);
    }
}
