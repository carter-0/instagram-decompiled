package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.E2a  reason: case insensitive filesystem */
public final class C47430E2a extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BusinessEnableNativeCallingFragment";
    public BusinessFlowAnalyticsLogger A00;
    public IgdsSwitch A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public ActionButton A05;
    public final Handler A06 = AnonymousClass7TF.A0D();
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final String getModuleName() {
        return "Business enable native calling";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.enable_calling_text);
        View A0G = AnonymousClass7TF.A0G(view, R.id.enable_calling_toggle);
        String A16 = AnonymousClass7TE.A16(requireContext, 2131964884);
        SpannableStringBuilder A08 = DbW.A08(requireContext, 2131954384);
        AnonymousClass7AV.A04(A08, new C48053ESw(requireContext, this, requireContext.getColor(2Yu.A0D(requireContext))), A16);
        DbX.A1G(A0R, A08);
        Dba.A06(A0G).setText(2131954397);
        IgdsSwitch igdsSwitch = (IgdsSwitch) A0G.requireViewById(R.id.toggle);
        igdsSwitch.setChecked(this.A03);
        igdsSwitch.A07 = new FdS(this, 1);
        this.A01 = igdsSwitch;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public final void configureActionBar(2da r3) {
        C59922Jbl A002 = C59922Jbl.A00(r3);
        A002.A02 = "Instagram Calling";
        A002.A00 = R.drawable.instagram_arrow_back_24;
        ActionButton A003 = C59904JbT.A00(FPB.A00(this, 22), r3, A002);
        A003.setEnabled(true);
        this.A05 = A003;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2144852060);
        C47430E2a.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = requireArguments.getBoolean("is_profile_audio_call_enabled", false);
        this.A04 = requireArguments.getBoolean("maybe_show_confirmation_dialog", false);
        this.A02 = DbS.A0l(requireArguments);
        AnonymousClass0fD.A09(-686228201, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-524724417);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.business_enable_native_calling_layout, viewGroup, false);
        AnonymousClass0fD.A09(1488042307, A022);
        return inflate;
    }
}
