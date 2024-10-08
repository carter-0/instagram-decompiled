package com.instagram.debug.sandbox;

import X.002;
import X.00l;
import X.0lg;
import X.0qQ;
import X.0s0;
import X.0tS;
import X.1Ma;
import X.AnonymousClass000;
import X.AnonymousClass0YZ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C17742VdB;
import X.C18080Vl9;
import X.C249473jq;
import X.C60670iy;
import X.C66997MgV;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbW;
import X.DbY;
import X.Dba;
import X.JTO;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.instagram.android.R;
import com.instagram.debug.sandbox.L;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.Iterator;
import java.util.List;

public final class SandboxUtil {
    public static final SandboxUtil INSTANCE = new Object();

    public static final Dialog getSandboxDialog(Context context, 0lg r7, List list, DialogInterface.OnDismissListener onDismissListener) {
        AnonymousClass7TF.A1H(context, r7);
        0tS A0h = DbT.A0h();
        ViewGroup viewGroup = (ViewGroup) DbW.A09(LayoutInflater.from(context), (ViewGroup) null, R.layout.layout_dev_host_options, false);
        SandboxUtil sandboxUtil = INSTANCE;
        SearchEditText searchEditText = (SearchEditText) AnonymousClass7TE.A0b(viewGroup, R.id.dev_server);
        sandboxUtil.setup(searchEditText);
        if (A0h.A0f()) {
            searchEditText.setText(A0h.A05());
        }
        SearchEditText searchEditText2 = (SearchEditText) AnonymousClass7TE.A0b(viewGroup, R.id.dev_mqtt_server);
        sandboxUtil.setup(searchEditText2);
        0s0 r1 = A0h.A1v;
        AnonymousClass0YZ[] r2 = 0tS.A4G;
        if (AnonymousClass7TG.A1a(A0h, r1, r2, 53)) {
            searchEditText2.setText(DbV.A13(A0h, A0h.A2A, r2, 54));
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                viewGroup.addView(JTO.A0H(it));
            }
        }
        C18080Vl9 vl9 = new C18080Vl9(context);
        vl9.A02(2131957638);
        vl9.A07(viewGroup);
        C17742VdB vdB = vl9.A01;
        vl9.A04(new SandboxUtil$getSandboxDialog$builder$1(viewGroup, A0h, r7, context), 2131960992);
        if (onDismissListener != null) {
            vdB.A05 = onDismissListener;
        }
        return vl9.A00();
    }

    private final SearchEditText setup(SearchEditText searchEditText) {
        searchEditText.setSearchIconEnabled(false);
        searchEditText.setClearButtonEnabled(true);
        C66997MgV.A01(searchEditText);
        return searchEditText;
    }

    public static /* synthetic */ Dialog getSandboxDialog$default(Context context, 0lg r3, List list, DialogInterface.OnDismissListener onDismissListener, int i, Object obj) {
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            onDismissListener = null;
        }
        return getSandboxDialog(context, r3, list, onDismissListener);
    }

    private final String getFormattedText(EditText editText) {
        Editable text = editText.getText();
        0qQ.A07(text);
        int length = text.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A1U = Dba.A1U(0qQ.A00(text.charAt(i2), 32));
            if (z) {
                if (!A1U) {
                    break;
                }
                length--;
            } else if (!A1U) {
                z = true;
            } else {
                i++;
            }
        }
        return DbY.A0j(text.subSequence(i, length + 1).toString());
    }

    /* access modifiers changed from: private */
    public final void processDevServerChange(View view, 0tS r6, 0lg r7) {
        C249473jq r1;
        String formattedText = getFormattedText((EditText) AnonymousClass7TE.A0b(view, R.id.dev_server));
        int length = formattedText.length();
        r6.A0I(AnonymousClass7TF.A1R(length));
        if (length > 0) {
            r6.A0E(1Ma.A05(formattedText));
            0qQ.A0C(r7, AnonymousClass000.A00(2));
            if (L.ig_android_other_category_sandbox_and_gql_endpoint_selectors_unified_experience_variants.is_enabled.getAndExpose(r7).booleanValue()) {
                r6.A0F(formattedText);
                r6.A0J(true);
                String A04 = 1Ma.A04(formattedText);
                0qQ.A07(A04);
                C60670iy.A00().A01(A04);
            }
        }
        1Ma.A07();
        Context context = view.getContext();
        if ((context instanceof C249473jq) && (r1 = (C249473jq) context) != null) {
            r1.D8a(r6);
        }
    }

    /* access modifiers changed from: private */
    public final void processMqttChange(View view, 0tS r8) {
        String formattedText = getFormattedText((EditText) AnonymousClass7TE.A0b(view, R.id.dev_mqtt_server));
        int length = formattedText.length();
        boolean A1R = AnonymousClass7TF.A1R(length);
        0s0 r1 = r8.A1v;
        AnonymousClass0YZ[] r2 = 0tS.A4G;
        AnonymousClass7TF.A1J(r8, r1, r2, 53, A1R);
        if (length > 0) {
            if (!00l.A0X(formattedText, '.')) {
                formattedText = 002.A0R(formattedText, ".sb.facebook.com:8883");
            }
            0qQ.A0B(formattedText, 0);
            DbS.A1a(r8, formattedText, r8.A2A, r2, 54);
        }
    }
}
