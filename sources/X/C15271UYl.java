package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.io.Serializable;

/* renamed from: X.UYl  reason: case insensitive filesystem */
public final class C15271UYl extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "RemixSettingsUpsellsBottomSheetFragment";
    public C54660HMr A00;
    public C56058Hs7 A01;
    public I10 A02;
    public String A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05;

    public final String getModuleName() {
        return "remix_settings_upsell_bottom_sheet";
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public C15271UYl() {
        C20610Wvr wvr = new C20610Wvr(this, 22);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20610Wvr(new C20610Wvr(this, 19), 20));
        this.A05 = new C227862kA(new C20610Wvr(A002, 21), wvr, new MJ6(32, (Object) null, A002), new 0Yh(C16396UuE.class));
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(1143949258);
        C15271UYl.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Serializable serializable = null;
        if (bundle2 != null) {
            str = bundle2.getString(AnonymousClass9NE.A00());
        } else {
            str = null;
        }
        this.A03 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            serializable = bundle3.getSerializable("entrypoint");
        }
        this.A00 = (C54660HMr) serializable;
        C56058Hs7 hs7 = new C56058Hs7(this, AnonymousClass7TE.A0l(this.A04));
        this.A01 = hs7;
        this.A02 = new I10(this.A00, hs7, C54658HMp.REMIX_SETTINGS, this.A03);
        AnonymousClass0fD.A09(114605898, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1900082170);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.remix_settings_upsell_bottom_sheet, viewGroup, false);
        CompoundButton compoundButton = (CompoundButton) AnonymousClass7TF.A0F(inflate, R.id.everyone_radio);
        CompoundButton compoundButton2 = (CompoundButton) AnonymousClass7TF.A0F(inflate, R.id.people_you_follow_radio);
        CompoundButton compoundButton3 = (CompoundButton) AnonymousClass7TF.A0F(inflate, R.id.off_radio);
        TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.upsell_remix_settings_body2);
        String A0m = DbU.A0m(this, 2131976176);
        String A0d = C13991Tnr.A0d(this, A0m, 2131976175);
        ESx eSx = new ESx(this, Dbb.A04(this));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0d);
        AnonymousClass7AV.A02(spannableStringBuilder, eSx, A0m);
        DbX.A1G(A0R, spannableStringBuilder);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TF.A0F(inflate, R.id.upsell_bottom_sheet_headline);
        String A16 = AnonymousClass7TE.A16(requireContext(), 2131976180);
        0qQ.A0B(igdsHeadline, 0);
        igdsHeadline.A02 = true;
        igdsHeadline.setHeadline((CharSequence) A16);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass7TF.A0F(inflate, R.id.bottom_bar);
        C55179HdV.A00(igdsBottomButtonLayout, new C55790HnP(new WB0(this, 61), DbX.A0i(this), 2131972502, 2131968513));
        C60260JiH jiH = (C60260JiH) this.A05.getValue();
        C64321LZw.A00(getViewLifecycleOwner(), jiH.A00, new C58768IxF(25, igdsBottomButtonLayout, compoundButton2, compoundButton3, compoundButton), 9);
        C51975G9x.A1E(jiH, this, DbV.A0J(this), 14);
        C18921WCy.A00(compoundButton, this, 16);
        C18921WCy.A00(compoundButton2, this, 17);
        C18921WCy.A00(compoundButton3, this, 18);
        AnonymousClass0fD.A09(-1165880708, A022);
        return inflate;
    }
}
