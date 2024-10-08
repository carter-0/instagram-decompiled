package com.instagram.debug.quickexperiment;

import X.002;
import X.0jh;
import X.183;
import X.19f;
import X.19i;
import X.19z;
import X.1AA;
import X.1AD;
import X.1AV;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass4DS;
import X.AnonymousClass5I0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C262244Cs;
import X.C267704c4;
import X.C273374mT;
import X.C51968G9o;
import X.C61170le;
import X.C66581MXm;
import X.C71098OcY;
import X.DbT;
import X.DbW;
import X.JTO;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreManager;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class MobileConfigRolloutDiagFragment extends C273374mT implements AnonymousClass4DS {
    public final HashMap mDeviceInfo = AnonymousClass7TE.A1E();
    public 1AA mDeviceMC;
    public 1AV mDeviceQEManager;
    public TextView mTextView;
    public final HashMap mUserInfo = AnonymousClass7TE.A1E();
    public 1AA mUserMC;
    public 1AV mUserQEManager;

    public String getModuleName() {
        return "mobile_config_rollout_diag";
    }

    public static void appendKeyValue(StringBuilder sb, String str, Object obj) {
        String str2;
        if (obj != null) {
            str2 = obj.toString();
        } else {
            str2 = "null";
        }
        sb.append(002.A11("<b>", str, "</b>: ", str2, "<br/>"));
    }

    private void setContent() {
        String str;
        String upperCase;
        fillInfo(this.mDeviceQEManager, this.mDeviceMC, this.mDeviceInfo);
        fillInfo(this.mUserQEManager, this.mUserMC, this.mUserInfo);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("<h2>User</h2>");
        Iterator A0s = AnonymousClass7TF.A0s(this.mUserInfo);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            appendKeyValue(A1A, DbT.A13(A1J), A1J.getValue());
        }
        A1A.append("<h2>Device</h2>");
        Iterator A0s2 = AnonymousClass7TF.A0s(this.mDeviceInfo);
        while (A0s2.hasNext()) {
            Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s2);
            appendKeyValue(A1A, DbT.A13(A1J2), A1J2.getValue());
        }
        A1A.append("<h2>Overrides</h2>");
        appendKeyValue(A1A, "Override store class", C51968G9o.A16(QuickExperimentDebugStoreManager.getOverrideStore(getSession())));
        appendKeyValue(A1A, "MC folder", this.mUserMC.A0C);
        File A0s3 = JTO.A0s(JTO.A0s(this.mUserMC.A0C, MobileConfigBisection.BISECT_DIR), "mc_overrides.json");
        appendKeyValue(A1A, "Has overrides file", Boolean.valueOf(A0s3.exists()));
        appendKeyValue(A1A, "MobileConfigJavaOverridesTable.hasOverridesFile", Boolean.valueOf(1AD.A01(A0s3).A00));
        if (A0s3.exists()) {
            appendKeyValue(A1A, "Content", C262244Cs.A01(A0s3));
        }
        A1A.append("<h2>FDID</h2>");
        MobileConfigManagerHolderImpl A00 = 19z.A00(this.mDeviceMC.A0A());
        if (A00 != null) {
            str = A00.getFamilyDeviceId();
        } else {
            str = "(null_manager)";
        }
        appendKeyValue(A1A, "From current MC manager", str);
        19i A01 = 0jh.A04.A01(C61170le.A00).A01(19f.A23);
        if (A01 == null) {
            upperCase = "";
        } else {
            upperCase = A01.A01.toUpperCase(Locale.ROOT);
        }
        appendKeyValue(A1A, "From current InstagramPhoneIdPublicStore", upperCase);
        TextView textView = this.mTextView;
        String obj = A1A.toString();
        if (obj == null) {
            obj = "";
        }
        textView.setText(Html.fromHtml(obj));
    }

    public void configureActionBar(2da r2) {
        DbW.A1C(r2, "MobileConfig Rollout Diagnose");
    }

    private void fillInfo(1AV r6, 1AA r7, HashMap hashMap) {
        C267704c4 A0B = r7.A0B();
        if (A0B != null) {
            hashMap.put("params map configs", Integer.valueOf(A0B.A02().size()));
            int i = 0;
            List<AnonymousClass5I0> list = A0B.A03;
            for (AnonymousClass5I0 r1 : list) {
                if (C71098OcY.A03(r1.A00) && C71098OcY.A03(r1.A01)) {
                    i++;
                }
            }
            hashMap.put("params map names", 002.A0P("/", i, list.size()));
        }
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-281987837);
        MobileConfigRolloutDiagFragment.super.onCreate(bundle);
        183 r1 = 183.A01;
        this.mDeviceQEManager = r1.A01();
        1AV A022 = r1.A02(getSession());
        this.mUserQEManager = A022;
        this.mDeviceMC = this.mDeviceQEManager.A01.A00;
        this.mUserMC = A022.A01.A00;
        AnonymousClass0fD.A09(-562861528, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(984163279);
        ScrollView scrollView = new ScrollView(getContext());
        C51968G9o.A1D(scrollView, -1);
        scrollView.setPadding(25, 10, 25, 10);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        C66581MXm.A1B(linearLayout, -1, -2);
        TextView textView = new TextView(getContext());
        this.mTextView = textView;
        C66581MXm.A1B(textView, -1, -2);
        setContent();
        linearLayout.addView(this.mTextView);
        scrollView.addView(linearLayout);
        AnonymousClass0fD.A09(1515200521, A02);
        return scrollView;
    }
}
