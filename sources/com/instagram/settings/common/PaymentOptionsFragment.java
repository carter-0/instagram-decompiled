package com.instagram.settings.common;

import X.0S7;
import X.0lg;
import X.0qQ;
import X.1Ln;
import X.2da;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass32G;
import X.AnonymousClass4DS;
import X.AnonymousClass57Z;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C227642jf;
import X.C320156rr;
import X.C322776wO;
import X.C46361Ddd;
import X.C66579MXk;
import X.C68504NKx;
import X.DbS;
import X.DbT;
import X.DbX;
import X.Dba;
import X.Dbb;
import X.Dd6;
import X.SQU;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.ui.emptystaterow.EmptyStateView;

public final class PaymentOptionsFragment extends AnonymousClass32G implements AnonymousClass4DS, C322776wO {
    public C68504NKx A00;
    public String A01;
    public boolean A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public EmptyStateView emptyStateView;

    public final void DBx() {
    }

    public final /* synthetic */ void DBz(C320156rr r1) {
    }

    public final void configureActionBar(2da r20) {
        2da r2 = r20;
        0qQ.A0B(r2, 0);
        r2.Eom(2131969234);
        r2.Eu4(true);
        Context context = getContext();
        if (context != null) {
            r2.ErJ(new AnonymousClass57Z((Resources.Theme) null, Dbb.A0A(context, this), (ColorFilter) null, (Drawable) null, (Drawable) null, (View.OnClickListener) null, AnonymousClass05K.A00, -2, -2, -2, -2, -2, -2, -2, true));
        }
    }

    public final String getModuleName() {
        return "settings_payments_options";
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        String str = this.A01;
        if (str == null) {
            0qQ.A0F("sessionId");
            throw AnonymousClass00P.createAndThrow();
        } else {
            bundle.putString(Dd6.A01(), str);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        0S7.A00(this);
        View emptyView = this.A04.getEmptyView();
        0qQ.A0C(emptyView, C66579MXk.A00(24));
        EmptyStateView emptyStateView2 = (EmptyStateView) emptyView;
        this.emptyStateView = emptyStateView2;
        if (emptyStateView2 != null) {
            emptyStateView2.A0P(C320156rr.LOADING);
        }
        A02(this, "payment_settings_loading");
        AnonymousClass0eM r1 = this.A03;
        C46361Ddd.A00(AnonymousClass7TE.A0l(r1)).A0G.add(this);
        if (C46361Ddd.A00(AnonymousClass7TE.A0l(r1)).A0A == null || !this.A02) {
            C46361Ddd.A00(AnonymousClass7TE.A0l(r1)).A04();
            return;
        }
        C46361Ddd A002 = C46361Ddd.A00(AnonymousClass7TE.A0l(r1));
        A002.A04.A02 = false;
        A002.A01.A01(A002);
    }

    public static final void A02(PaymentOptionsFragment paymentOptionsFragment, String str) {
        1Ln r2 = new 1Ln(AnonymousClass7TE.A0e(DbX.A0P(paymentOptionsFragment, paymentOptionsFragment.A03), AnonymousClass000.A00(3722)), 352);
        r2.A0R("product", "ig_payment_settings");
        r2.A0R("flow_name", AnonymousClass000.A00(1671));
        r2.A0R("flow_step", str);
        r2.A0R(TraceFieldType.AdhocEventName, "init");
        String str2 = paymentOptionsFragment.A01;
        if (str2 == null) {
            0qQ.A0F("sessionId");
            throw AnonymousClass00P.createAndThrow();
        }
        r2.A0v(str2);
        r2.Cgf();
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return DbT.A0X(this.A03);
    }

    public static final void A01(PaymentOptionsFragment paymentOptionsFragment, int i, int i2) {
        EmptyStateView emptyStateView2 = paymentOptionsFragment.emptyStateView;
        if (emptyStateView2 != null) {
            emptyStateView2.A0T(C320156rr.ERROR, i);
        }
        EmptyStateView emptyStateView3 = paymentOptionsFragment.emptyStateView;
        if (emptyStateView3 != null) {
            emptyStateView3.A0S(C320156rr.ERROR, i2);
        }
        EmptyStateView emptyStateView4 = paymentOptionsFragment.emptyStateView;
        if (emptyStateView4 != null) {
            emptyStateView4.A0R(C320156rr.ERROR, R.drawable.instagram_lock_outline_96);
        }
    }

    public final void DBy() {
        Context context = getContext();
        if (context != null) {
            SimpleWebViewActivity.A02.A02(context, DbT.A0X(this.A03), Dba.A0N(SQU.A01(context, "https://help.instagram.com/contact/502692143473097?ref=igapp")));
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.widget.ListAdapter, X.NKx] */
    public final void onCreate(Bundle bundle) {
        String string;
        int A022 = AnonymousClass0fD.A02(-1538088349);
        PaymentOptionsFragment.super.onCreate(bundle);
        this.A00 = new C68504NKx(requireContext(), DbT.A0X(this.A03), this);
        Bundle bundle2 = this.mArguments;
        boolean z = false;
        if (bundle2 != null) {
            z = bundle2.getBoolean("com.instagram.settings.intf.ARGUMENT_FORCE_RISK_FETCH", false);
        }
        this.A02 = z;
        ? r0 = this.A00;
        if (r0 == 0) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        A0V(r0);
        if (bundle == null || (string = bundle.getString(Dd6.A01())) == null) {
            this.A01 = AnonymousClass7TF.A0b();
            A02(this, AnonymousClass000.A00(1671));
        } else {
            this.A01 = string;
        }
        AnonymousClass0fD.A09(1837796785, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1502328838);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_listview_with_empty_state, viewGroup, false);
        AnonymousClass0fD.A09(1849910987, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1492004075);
        super.onDestroyView();
        C46361Ddd.A00(AnonymousClass7TE.A0l(this.A03)).A0G.remove(this);
        this.emptyStateView = null;
        AnonymousClass0fD.A09(667903179, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-289081184);
        super.onResume();
        C46361Ddd A002 = C46361Ddd.A00(AnonymousClass7TE.A0l(this.A03));
        if (C46361Ddd.A02(A002) && A002.A03() != AnonymousClass05K.A00) {
            A002.A04.A02 = false;
            A002.A01.A01(A002);
            EmptyStateView emptyStateView2 = this.emptyStateView;
            if (emptyStateView2 != null) {
                emptyStateView2.A0P(C320156rr.LOADING);
            }
        }
        AnonymousClass0fD.A09(1123217473, A022);
    }
}
