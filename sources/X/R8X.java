package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public final class R8X extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "EditAutofillEntryFragment";
    public Intent A00;
    public ScrollView A01;
    public S3P A02;
    public SpinnerImageView A03;
    public AutofillData A04;
    public boolean A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public static boolean A03(Map map) {
        if (Collections.unmodifiableMap(map).size() != 1 || !Collections.unmodifiableMap(map).containsKey(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
            return false;
        }
        return true;
    }

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        DbW.A1B(r3, 2131956575);
        r3.AA9(C11499SbM.A00(r3, this, 54), 2131972502);
    }

    public final String getModuleName() {
        return "autofill_entry_edit";
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r2.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        r2 = r1.A00;
        r1 = java.util.Collections.unmodifiableMap(r2).isEmpty();
        r0 = A03(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r1 != false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r0 != false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        r8.requireContext();
        r8.A06.getValue();
        r1 = X.23d.A04;
        r0 = r8.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        if (r0 == null) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        r1.A04(r0.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f4, code lost:
        A02(r8, r6);
        r1 = r8.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f9, code lost:
        if (r1 == null) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fb, code lost:
        X.0qQ.A0A(r1.putStringArrayListExtra("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS", X.23d.A02()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0107, code lost:
        A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0114, code lost:
        r7 = "userSession";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0117, code lost:
        X.0qQ.A0F(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.R8X r8) {
        /*
            X.S3P r0 = r8.A02
            java.lang.String r3 = "holder"
            if (r0 == 0) goto L_0x0110
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r1 = r0.A00()
            android.os.Bundle r2 = r8.requireArguments()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE"
            java.lang.String r2 = r2.getString(r0)
            if (r2 == 0) goto L_0x010b
            int r0 = r2.hashCode()
            java.lang.String r6 = "EDITED_AUTOFILL"
            java.lang.String r4 = "BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS"
            java.lang.String r7 = "resultIntent"
            r5 = 1
            switch(r0) {
                case -1312919206: goto L_0x0026;
                case -1213125907: goto L_0x0029;
                case -816846443: goto L_0x002c;
                case -314094605: goto L_0x005d;
                case -108875093: goto L_0x0098;
                case 165505526: goto L_0x00b7;
                default: goto L_0x0025;
            }
        L_0x0025:
            return
        L_0x0026:
            java.lang.String r0 = "account_settings_fragment"
            goto L_0x002e
        L_0x0029:
            java.lang.String r0 = "autofill_request_fragment"
            goto L_0x002e
        L_0x002c:
            java.lang.String r0 = "browser_settings_fragment"
        L_0x002e:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0025
            java.util.Map r2 = r1.A00
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r2)
            boolean r1 = r0.isEmpty()
            boolean r0 = A03(r2)
            if (r1 != 0) goto L_0x0107
            if (r0 != 0) goto L_0x0107
            r8.requireContext()
            X.0eM r0 = r8.A06
            r0.getValue()
            X.23d r1 = X.23d.A04
            X.S3P r0 = r8.A02
            if (r0 == 0) goto L_0x0110
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = r0.A00()
            r1.A04(r0)
            goto L_0x00f4
        L_0x005d:
            java.lang.String r0 = "multiple_contact_info_fragment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0025
            java.util.Map r2 = r1.A00
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r2)
            boolean r1 = r0.isEmpty()
            boolean r0 = A03(r2)
            if (r1 != 0) goto L_0x0107
            if (r0 != 0) goto L_0x0107
            r8.requireContext()
            X.0eM r0 = r8.A06
            r0.getValue()
            X.S3P r0 = r8.A02
            if (r0 == 0) goto L_0x0110
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r3 = r0.A00()
            android.content.Context r2 = r8.requireContext()
            X.23d.A03(r3)
            com.instagram.common.session.UserSession r1 = X.23d.A03
            if (r1 == 0) goto L_0x0114
            r0 = 0
            X.SQF.A01(r2, r3, r0, r1, r5)
            goto L_0x00f4
        L_0x0098:
            java.lang.String r0 = "save_autofill_request_fragment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0025
            android.content.Intent r2 = r8.A00
            if (r2 == 0) goto L_0x0117
            org.json.JSONObject r0 = r1.A01()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRING"
            android.content.Intent r0 = r2.putExtra(r0, r1)
            X.0qQ.A07(r0)
            return
        L_0x00b7:
            java.lang.String r0 = "multiple_contact_add_contact_info_fragment"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0025
            java.util.Map r2 = r1.A00
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r2)
            boolean r1 = r0.isEmpty()
            boolean r0 = A03(r2)
            if (r1 != 0) goto L_0x0107
            if (r0 != 0) goto L_0x0107
            r8.requireContext()
            X.0eM r0 = r8.A06
            r0.getValue()
            X.S3P r0 = r8.A02
            if (r0 == 0) goto L_0x0110
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r3 = r0.A00()
            X.Rpi r2 = new X.Rpi
            r2.<init>(r8)
            android.content.Context r1 = r8.requireContext()
            com.instagram.common.session.UserSession r0 = X.23d.A03
            if (r0 == 0) goto L_0x0114
            X.SQF.A01(r1, r3, r2, r0, r5)
            java.lang.String r6 = "START_ADD_CONTACT_AUTOFILL"
        L_0x00f4:
            A02(r8, r6)
            android.content.Intent r1 = r8.A00
            if (r1 == 0) goto L_0x0117
            java.util.ArrayList r0 = X.23d.A02()
            android.content.Intent r0 = r1.putStringArrayListExtra(r4, r0)
            X.0qQ.A0A(r0)
            return
        L_0x0107:
            A00(r8)
            return
        L_0x010b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0110:
            X.0qQ.A0F(r3)
            goto L_0x011a
        L_0x0114:
            java.lang.String r7 = "userSession"
        L_0x0117:
            X.0qQ.A0F(r7)
        L_0x011a:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R8X.A01(X.R8X):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public static final void A00(R8X r8x) {
        r8x.requireContext();
        r8x.A06.getValue();
        Bundle bundle = r8x.mArguments;
        String str = "initialAutofillData";
        if (bundle == null || !"multiple_contact_info_fragment".equals(bundle.getString("BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE"))) {
            if (r8x.A04 != null) {
                Pxg.A1C(23d.A00());
                UserSession userSession = 23d.A03;
                if (userSession != null) {
                    try {
                        AnonymousClass0K0 r3 = GraphQlCallInput.A02;
                        0Df A032 = C41845B3m.A03(r3, "", "sensitive_string_value");
                        0Df A022 = r3.A02();
                        A022.A0E(A032, "access_token");
                        2IS A042 = C41845B3m.A04();
                        DbW.A18(A022, A042, "request");
                        SQF.A02(SQF.A00(new C239113Fa(A042, QNW.class, "IABAutofillDeleteData", true), userSession));
                    } catch (IOException e) {
                        0wb.A06("AutofillGraphQLRequest", "Error creating delete autofill request", e);
                    }
                    A02(r8x, "DELETED_AUTOFILL");
                    Intent intent = r8x.A00;
                    if (intent == null) {
                        str = "resultIntent";
                    } else {
                        0qQ.A0A(intent.putStringArrayListExtra("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS", 23d.A02()));
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        AutofillData autofillData = r8x.A04;
        if (autofillData != null) {
            Map map = autofillData.A00;
            String A11 = DbT.A11(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Collections.unmodifiableMap(map));
            if (A11 != null) {
                23d.A00().edit().remove(A11).apply();
            }
            UserSession userSession2 = 23d.A03;
            if (userSession2 != null) {
                try {
                    Object obj = map.get(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    if (obj == null) {
                        0wb.A03("AutofillGraphQLRequest", "Error creating delete autofill request for multiple entries");
                        return;
                    }
                    0Df A033 = C41845B3m.A03(GraphQlCallInput.A02, obj, "ent_id");
                    2IS A043 = C41845B3m.A04();
                    DbW.A18(A033, A043, "request");
                    SQF.A02(SQF.A00(new C239113Fa(A043, QNV.class, "IABAutofillDeleteDataMultiEntries", true), userSession2));
                    return;
                } catch (IOException e2) {
                    0wb.A06("AutofillGraphQLRequest", "Error creating delete autofill request", e2);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
        str = "userSession";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(R8X r8x, String str) {
        if (r8x.requireArguments().getBoolean("Tracking.ENABLED", true)) {
            C254523sc r1 = new C254523sc(r8x, "iab_autofill_interaction");
            r1.A4J = str;
            r1.A7M = "CONTACT_AUTOFILL";
            DbU.A1R(r1.A00(), DbT.A0X(r8x.A06));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0048, code lost:
        if (r0 != null) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
        X.0qQ.A0F("resultIntent");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0054, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        if (r1.equals(r0) == false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        r3 = r4.getStringArrayList("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        if (r3 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        if (r3.isEmpty() != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0075, code lost:
        r0 = r3.get(r4.getInt("BrowserLiteIntent.InstagramExtras.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS_INDEX", -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r1.equals(r0) == false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008c, code lost:
        r0 = r4.getString("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRING");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
        if (r0 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r5.A04 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData(X.C66580MXl.A17(r0));
        r5.A05 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a3, code lost:
        r3.setResult(-1, r0);
        X.R8X.super.onCreate(r6);
        X.AnonymousClass0fD.A09(1980190961, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00af, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b0, code lost:
        r1 = X.AnonymousClass7TE.A0z("Illegal JSON for autofill save");
        X.AnonymousClass0fD.A09(-1015802979, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bc, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        r1 = X.DbS.A09();
        r5.A00 = r1;
        r1.putExtras(requireArguments());
        r3 = requireActivity();
        r0 = r5.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = -838690933(0xffffffffce02978b, float:-5.477424E8)
            int r2 = X.AnonymousClass0fD.A02(r0)
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L_0x00cb
            r0 = 16
            r1.setSoftInputMode(r0)
            android.os.Bundle r4 = r5.mArguments
            if (r4 == 0) goto L_0x00c4
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE"
            java.lang.String r1 = r4.getString(r0)
            if (r1 == 0) goto L_0x00bd
            int r0 = r1.hashCode()
            switch(r0) {
                case -1312919206: goto L_0x0055;
                case -1213125907: goto L_0x0058;
                case -816846443: goto L_0x005b;
                case -314094605: goto L_0x005e;
                case -108875093: goto L_0x0083;
                default: goto L_0x0029;
            }
        L_0x0029:
            X.0sm r1 = X.0Yt.A0E()
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData
            r0.<init>((java.util.Map) r1)
            r5.A04 = r0
        L_0x0034:
            android.content.Intent r1 = X.DbS.A09()
            r5.A00 = r1
            android.os.Bundle r0 = r5.requireArguments()
            r1.putExtras(r0)
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            r1 = -1
            android.content.Intent r0 = r5.A00
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "resultIntent"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0055:
            java.lang.String r0 = "account_settings_fragment"
            goto L_0x0086
        L_0x0058:
            java.lang.String r0 = "autofill_request_fragment"
            goto L_0x0061
        L_0x005b:
            java.lang.String r0 = "browser_settings_fragment"
            goto L_0x0061
        L_0x005e:
            java.lang.String r0 = "multiple_contact_info_fragment"
        L_0x0061:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS"
            java.util.ArrayList r3 = r4.getStringArrayList(r0)
            if (r3 == 0) goto L_0x0029
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0029
            r1 = -1
            java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS_INDEX"
            int r0 = r4.getInt(r0, r1)
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0092
        L_0x0083:
            java.lang.String r0 = "save_autofill_request_fragment"
        L_0x0086:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRING"
            java.lang.String r0 = r4.getString(r0)
        L_0x0092:
            if (r0 == 0) goto L_0x0029
            org.json.JSONObject r1 = X.C66580MXl.A17(r0)     // Catch:{ JSONException -> 0x00b0 }
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData     // Catch:{ JSONException -> 0x00b0 }
            r0.<init>((org.json.JSONObject) r1)     // Catch:{ JSONException -> 0x00b0 }
            r5.A04 = r0     // Catch:{ JSONException -> 0x00b0 }
            r0 = 1
            r5.A05 = r0     // Catch:{ JSONException -> 0x00b0 }
            goto L_0x0034
        L_0x00a3:
            r3.setResult(r1, r0)
            X.R8X.super.onCreate(r6)
            r0 = 1980190961(0x760750f1, float:6.861345E32)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x00b0:
            java.lang.String r0 = "Illegal JSON for autofill save"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            r0 = -1015802979(0xffffffffc374139d, float:-244.07661)
            X.AnonymousClass0fD.A09(r0, r2)
            throw r1
        L_0x00bd:
            java.lang.String r0 = "No source request fragment provided"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x00c4:
            java.lang.String r0 = "No arguments provided"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x00cb:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -607710999(0xffffffffdbc710e9, float:-1.12064227E17)
            X.AnonymousClass0fD.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R8X.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1565316010);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_edit_autofill_entry, viewGroup, false);
        this.A03 = (SpinnerImageView) inflate.requireViewById(R.id.loading_spinner);
        this.A01 = (ScrollView) inflate.requireViewById(R.id.scrollView);
        this.A02 = new S3P(requireContext(), inflate);
        String string = requireArguments().getString("BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE");
        if (string != null && !string.equals("save_autofill_request_fragment")) {
            View A0F = AnonymousClass7TF.A0F(inflate, R.id.delete_button);
            TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.autofill_fbpay_disclosure);
            DbT.A1H(A0R);
            if (this.A05) {
                AnonymousClass0eM r6 = this.A06;
                if (182.A06(0Tu.A06, DbT.A0X(r6), 36322860551776892L)) {
                    1Av A002 = 1Au.A00(AnonymousClass7TE.A0l(r6));
                    IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass7TF.A0F(inflate, R.id.automatic_autofill_consent);
                    igdsListCell.A0G(C69349Njo.TYPE_SWITCH, true);
                    igdsListCell.setTitleTextSize(45.0f);
                    0xa r1 = A002.A01;
                    if (r1.getBoolean("contact_autofill_eligible_for_automatic_autofill", false)) {
                        igdsListCell.setChecked(true);
                        long A062 = DbW.A06(r1, "contact_autofill_automatic_autofill_expiry_timestamp");
                        Locale locale = Locale.getDefault();
                        0qQ.A07(locale);
                        String format = new SimpleDateFormat("MM/dd/yyyy, hh:mm a", locale).format(new Date(A062));
                        0qQ.A07(format);
                        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(getString(2131956561), format);
                        0qQ.A07(formatStrLocaleSafe);
                        igdsListCell.A0H(formatStrLocaleSafe);
                    } else {
                        igdsListCell.setChecked(false);
                    }
                    igdsListCell.A0D(new FQ1(0, igdsListCell, this));
                    igdsListCell.setVisibility(0);
                }
                A0F.setVisibility(0);
                int i = 2131953390;
                if (182.A06(0Tu.A05, DbT.A0X(r6), 36310430911365197L)) {
                    i = 2131953391;
                }
                SpannableStringBuilder A0C = DbS.A0C(DbU.A0m(this, i));
                AnonymousClass7AV.A04(A0C, new RBY(this, requireContext().getColor(2Yu.A0D(requireContext())), 1), DbU.A0m(this, 2131953392));
                A0R.setText(A0C);
                A0R.setVisibility(0);
            }
            TextView A0R2 = AnonymousClass7TG.A0R(inflate, R.id.contact_info_management_disclosure);
            DbT.A1H(A0R2);
            SpannableStringBuilder A0C2 = DbS.A0C(DbU.A0m(this, 2131956576));
            AnonymousClass7AV.A04(A0C2, new RBY(this, requireContext().getColor(2Yu.A0D(requireContext())), 0), DbU.A0m(this, 2131969087));
            A0R2.setText(A0C2);
            C11495SbI.A00(inflate.requireViewById(R.id.delete_button), 2, this);
        }
        AnonymousClass0fD.A09(406844832, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1250906962);
        R8X.super.onPause();
        S3P s3p = this.A02;
        if (s3p == null) {
            0qQ.A0F("holder");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A04 = s3p.A00();
        AnonymousClass0fD.A09(-2046599562, A022);
    }

    public final void onResume() {
        String str;
        int A022 = AnonymousClass0fD.A02(-1910992425);
        super.onResume();
        S3P s3p = this.A02;
        if (s3p == null) {
            str = "holder";
        } else {
            AutofillData autofillData = this.A04;
            if (autofillData == null) {
                str = "initialAutofillData";
            } else {
                Map A0x = Pxf.A0x(autofillData.A00);
                s3p.A07.setText(Pxj.A0r("given-name", A0x));
                s3p.A06.setText(Pxj.A0r("family-name", A0x));
                s3p.A03.setText(Pxj.A0r("address-line1", A0x));
                s3p.A04.setText(Pxj.A0r("address-line2", A0x));
                s3p.A01.setText(Pxj.A0r("address-level1", A0x));
                s3p.A02.setText(Pxj.A0r("address-level2", A0x));
                s3p.A08.setText(Pxj.A0r("postal-code", A0x));
                s3p.A05.setText(Pxj.A0r("email", A0x));
                s3p.A09.setText(Pxj.A0r("tel", A0x));
                s3p.A00 = DbT.A11(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0x);
                AnonymousClass0fD.A09(890571022, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
