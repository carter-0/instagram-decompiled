package X;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import java.util.ArrayList;

/* renamed from: X.EQs  reason: case insensitive filesystem */
public final class C48009EQs extends C47469E3t {
    public static final String __redex_internal_original_name = "DataDownloadRequestFragment";
    public EditText A00;
    public UserSession A01;
    public DataDownloadStatusCheckResponse A02;
    public InlineErrorMessageView A03;

    public final String getModuleName() {
        return "data_download_request";
    }

    public static void A00(C48009EQs eQs) {
        String str;
        DataDownloadStatusCheckResponse dataDownloadStatusCheckResponse = eQs.A02;
        if (dataDownloadStatusCheckResponse != null) {
            str = dataDownloadStatusCheckResponse.A01;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            ArrayList A012 = C49898FCb.A01(eQs.requireContext(), eQs.A00);
            if (!A012.isEmpty()) {
                str = (String) AnonymousClass7TE.A12(A012);
            }
        }
        EditText editText = eQs.A00;
        if (str != null && editText != null && TextUtils.isEmpty(AnonymousClass7TF.A0f(editText))) {
            editText.append(str);
        }
    }

    public static void A01(C48009EQs eQs) {
        boolean A0C = 0mp.A0C(AnonymousClass7TF.A0f(eQs.A00));
        InlineErrorMessageView inlineErrorMessageView = eQs.A03;
        if (A0C) {
            inlineErrorMessageView.A03();
            C309516Yo A0M = DbS.A0M(eQs.requireActivity(), eQs.A00);
            String A0f = AnonymousClass7TF.A0f(eQs.A00);
            AnonymousClass4DH r2 = new AnonymousClass4DH();
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString("email", A0f);
            DbX.A18(A0a, r2, A0M);
            return;
        }
        inlineErrorMessageView.A04(eQs.getString(2131964468));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(467452371);
        super.onCreate(bundle);
        UserSession A0U = DbX.A0U(this);
        this.A01 = A0U;
        1NY A0O = DbU.A0O(A0U);
        A0O.A0A("dyi/check_data_state/");
        C47696EDf.A00(this, DbT.A0S(A0O, DataDownloadStatusCheckResponse.class, C49795F7g.class), 37);
        AnonymousClass0fD.A09(586726786, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1475376005);
        View inflate = layoutInflater.inflate(R.layout.data_download_request_fragment, viewGroup, false);
        DbU.A0G(inflate, R.id.header_text).setText(2131957395);
        DbU.A0G(inflate, R.id.body_text).setText(2131957393);
        DbU.A0F(inflate, R.id.header_icon).setImageDrawable(DbV.A05(this).getDrawable(R.drawable.download_your_data_icon, (Resources.Theme) null));
        DbU.A0D(inflate, R.id.inline_error_stub).inflate();
        EditText A0E = DbU.A0E(inflate, R.id.text_field);
        this.A00 = A0E;
        A0E.setHint(2131961566);
        this.A00.setInputType(32);
        this.A00.setImeOptions(6);
        FQe.A00(this.A00, this, 17);
        this.A03 = (InlineErrorMessageView) inflate.requireViewById(R.id.inline_error);
        ((C3021461u) inflate.requireViewById(R.id.bottom_button_layout)).setPrimaryActionOnClickListener(FP4.A00(this, 3));
        View requireViewById = inflate.requireViewById(R.id.scroll_view);
        requireViewById.setVerticalScrollBarEnabled(false);
        inflate.addOnLayoutChangeListener(new FPP(requireViewById, 3));
        DataDownloadStatusCheckResponse dataDownloadStatusCheckResponse = this.A02;
        if (dataDownloadStatusCheckResponse == null || dataDownloadStatusCheckResponse.A00 == DataDownloadStatusCheckResponse.JobStatus.NO_VALID_DOWNLOADABLE) {
            A00(this);
        }
        AnonymousClass0fD.A09(-318296173, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(557122421);
        C48009EQs.super.onPause();
        Window A0G = DbV.A0G(this);
        A0G.getClass();
        A0G.setSoftInputMode(0);
        DbS.A1D(this);
        AnonymousClass0fD.A09(1781358446, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(224311025);
        super.onResume();
        Activity rootActivity = getRootActivity();
        rootActivity.getClass();
        Dbb.A0h(rootActivity);
        AnonymousClass0fD.A09(170450405, A022);
    }
}
