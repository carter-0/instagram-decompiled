package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.UYk  reason: case insensitive filesystem */
public final class C15270UYk extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "DirectMessageSettingsUpsellsBottomSheetFragment";
    public C56154Hth A00;
    public I10 A01;
    public C54660HMr A02;
    public String A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05;

    public final String getModuleName() {
        return "direct_message_settings_upsell_bottom_sheet";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public C15270UYk() {
        C20610Wvr wvr = new C20610Wvr(this, 8);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20610Wvr(new C20610Wvr(this, 5), 6));
        this.A05 = new C227862kA(new C20610Wvr(A002, 7), wvr, new MJ6(29, (Object) null, A002), new 0Yh(C16394UuC.class));
    }

    public final void onCreate(Bundle bundle) {
        String str;
        Object obj;
        int A022 = AnonymousClass0fD.A02(225091265);
        C15270UYk.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        C54660HMr hMr = null;
        if (bundle2 != null) {
            str = bundle2.getString(AnonymousClass9NE.A00());
        } else {
            str = null;
        }
        this.A03 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            obj = bundle3.getSerializable("entrypoint");
        } else {
            obj = null;
        }
        if (obj instanceof C54660HMr) {
            hMr = (C54660HMr) obj;
        }
        this.A02 = hMr;
        C56058Hs7 hs7 = new C56058Hs7(this, AnonymousClass7TE.A0l(this.A04));
        String str2 = this.A03;
        C54660HMr hMr2 = this.A02;
        C54658HMp hMp = C54658HMp.DIRECT_MESSAGE_SETTINGS;
        this.A00 = new C56154Hth(hMr2, hs7, hMp, str2);
        this.A01 = new I10(this.A02, hs7, hMp, this.A03);
        AnonymousClass0fD.A09(469636385, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String A16;
        Context requireContext;
        int i;
        int A022 = AnonymousClass0fD.A02(1788897909);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_message_settings_upsell_bottom_sheet, viewGroup, false);
        CompoundButton compoundButton = (CompoundButton) AnonymousClass7TF.A0F(inflate, R.id.anyone_radio);
        CompoundButton compoundButton2 = (CompoundButton) AnonymousClass7TF.A0F(inflate, R.id.your_followers_radio);
        CompoundButton compoundButton3 = (CompoundButton) AnonymousClass7TF.A0F(inflate, R.id.no_one_radio);
        boolean equals = 182.A04(0Tu.A05, DbT.A0X(this.A04), 36879419587166475L).equals(AnonymousClass000.A00(3533));
        Context requireContext2 = requireContext();
        if (equals) {
            A16 = AnonymousClass7TE.A16(requireContext2, 2131976157);
            requireContext = requireContext();
            i = 2131976152;
        } else {
            A16 = AnonymousClass7TE.A16(requireContext2, 2131976158);
            requireContext = requireContext();
            i = 2131976153;
        }
        String string = requireContext.getString(i);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TF.A0F(inflate, R.id.upsell_bottom_sheet_headline);
        0qQ.A0B(igdsHeadline, 0);
        igdsHeadline.A02 = true;
        igdsHeadline.setHeadline((CharSequence) A16);
        if (string != null) {
            igdsHeadline.setBody((CharSequence) string);
        }
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_qp_messages_refresh);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass7TF.A0F(inflate, R.id.bottom_bar);
        C55179HdV.A00(igdsBottomButtonLayout, new C55790HnP(new WB0(this, 49), DbX.A0i(this), 2131972502, 2131968513));
        C60260JiH jiH = (C60260JiH) this.A05.getValue();
        C64321LZw.A00(getViewLifecycleOwner(), jiH.A00, new C58768IxF(24, igdsBottomButtonLayout, compoundButton2, compoundButton3, compoundButton), 6);
        C51975G9x.A1E(jiH, this, DbV.A0J(this), 12);
        C18921WCy.A00(compoundButton, this, 7);
        C18921WCy.A00(compoundButton2, this, 8);
        C18921WCy.A00(compoundButton3, this, 9);
        AnonymousClass0fD.A09(235274947, A022);
        return inflate;
    }
}
