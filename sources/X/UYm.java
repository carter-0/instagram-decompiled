package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.io.Serializable;

public final class UYm extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "DismissNudgeUpsellsBottomSheetFragment";
    public C56154Hth A00;
    public I10 A01;
    public C54660HMr A02;
    public C56058Hs7 A03;
    public String A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final AnonymousClass0eM A06;

    public final String getModuleName() {
        return "dismiss_nudge_upsell_bottom_sheet";
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public UYm() {
        C20610Wvr wvr = new C20610Wvr(this, 12);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20610Wvr(new C20610Wvr(this, 9), 10));
        this.A06 = new C227862kA(new C20610Wvr(A002, 11), wvr, new MJ6(30, (Object) null, A002), new 0Yh(C16395UuD.class));
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-1560326127);
        UYm.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Serializable serializable = null;
        if (bundle2 != null) {
            str = bundle2.getString(AnonymousClass9NE.A00());
        } else {
            str = null;
        }
        this.A04 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            serializable = bundle3.getSerializable("entrypoint");
        }
        this.A02 = (C54660HMr) serializable;
        C56058Hs7 hs7 = new C56058Hs7(this, AnonymousClass7TE.A0l(this.A05));
        this.A03 = hs7;
        String str2 = this.A04;
        C54660HMr hMr = this.A02;
        C54658HMp hMp = C54658HMp.TAG_SETTINGS;
        this.A00 = new C56154Hth(hMr, hs7, hMp, str2);
        String str3 = this.A04;
        C54660HMr hMr2 = this.A02;
        C56058Hs7 hs72 = this.A03;
        if (hs72 == null) {
            0qQ.A0F("upsellsLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = new I10(hMr2, hs72, hMp, str3);
        AnonymousClass0fD.A09(-1091755303, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1412781121);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.dismiss_nudge_upsell_bottom_sheet, viewGroup, false);
        CompoundButton compoundButton = (CompoundButton) AnonymousClass7TF.A0F(inflate, R.id.reminders_on);
        CompoundButton compoundButton2 = (CompoundButton) AnonymousClass7TF.A0F(inflate, R.id.reminders_off);
        String A16 = AnonymousClass7TE.A16(requireContext(), 2131976163);
        String string = requireContext().getString(2131976162);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TF.A0F(inflate, R.id.upsell_bottom_sheet_headline);
        0qQ.A0B(igdsHeadline, 0);
        igdsHeadline.A02 = true;
        igdsHeadline.setHeadline((CharSequence) A16);
        if (string != null) {
            igdsHeadline.setBody((CharSequence) string);
        }
        C55790HnP hnP = new C55790HnP(new WB0(this, 50), DbX.A0i(this), 2131972502, 2131954722);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass7TF.A0F(inflate, R.id.bottom_bar);
        C55179HdV.A00(igdsBottomButtonLayout, hnP);
        igdsBottomButtonLayout.setPrimaryButtonEnabled(true);
        C64321LZw.A00(getViewLifecycleOwner(), ((C60260JiH) this.A06.getValue()).A00, new C59104J6m(40, (Object) compoundButton2, (Object) igdsBottomButtonLayout, (Object) compoundButton), 7);
        C18921WCy.A00(compoundButton, this, 10);
        C18921WCy.A00(compoundButton2, this, 11);
        AnonymousClass0fD.A09(-1620510082, A022);
        return inflate;
    }
}
