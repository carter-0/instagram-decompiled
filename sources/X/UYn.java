package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.io.Serializable;

public final class UYn extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "TagSettingsUpsellsBottomSheetFragment";
    public C56154Hth A00;
    public I10 A01;
    public C54660HMr A02;
    public C56058Hs7 A03;
    public C16600Uxu A04 = C16600Uxu.GENERIC;
    public String A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass0eM A07;

    public final String getModuleName() {
        return "tag_settings_upsell_bottom_sheet";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public UYn() {
        C20610Wvr wvr = new C20610Wvr(this, 34);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20610Wvr(new C20610Wvr(this, 31), 32));
        this.A07 = new C227862kA(new C20610Wvr(A002, 33), wvr, new MJ6(35, (Object) null, A002), new 0Yh(C16397UuF.class));
    }

    public final void onCreate(Bundle bundle) {
        String str;
        Serializable serializable;
        C54660HMr hMr;
        C16600Uxu uxu;
        int A022 = AnonymousClass0fD.A02(-1872013089);
        UYn.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Serializable serializable2 = null;
        if (bundle2 != null) {
            str = bundle2.getString(AnonymousClass9NE.A00());
        } else {
            str = null;
        }
        this.A05 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            serializable = bundle3.getSerializable("entrypoint");
        } else {
            serializable = null;
        }
        if (serializable instanceof C54660HMr) {
            hMr = (C54660HMr) serializable;
        } else {
            hMr = null;
        }
        this.A02 = hMr;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            serializable2 = bundle4.getSerializable(AnonymousClass000.A00(92));
        }
        if (!(serializable2 instanceof C16600Uxu) || (uxu = (C16600Uxu) serializable2) == null) {
            uxu = C16600Uxu.GENERIC;
        }
        this.A04 = uxu;
        C56058Hs7 hs7 = new C56058Hs7(this, AnonymousClass7TE.A0l(this.A06));
        this.A03 = hs7;
        String str2 = this.A05;
        C54660HMr hMr2 = this.A02;
        C54658HMp hMp = C54658HMp.TAG_SETTINGS;
        this.A00 = new C56154Hth(hMr2, hs7, hMp, str2);
        String str3 = this.A05;
        C54660HMr hMr3 = this.A02;
        C56058Hs7 hs72 = this.A03;
        if (hs72 == null) {
            0qQ.A0F("upsellsLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = new I10(hMr3, hs72, hMp, str3);
        AnonymousClass0fD.A09(749505763, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-281263918);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.tag_settings_upsell_bottom_sheet, viewGroup, false);
        IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass7TF.A0F(inflate, R.id.everyone_radio);
        IgdsListCell igdsListCell2 = (IgdsListCell) AnonymousClass7TF.A0F(inflate, R.id.people_you_follow_radio);
        IgdsListCell igdsListCell3 = (IgdsListCell) AnonymousClass7TF.A0F(inflate, R.id.off_radio);
        C69349Njo njo = C69349Njo.TYPE_RADIO;
        igdsListCell.setTextCellType(njo);
        igdsListCell2.setTextCellType(njo);
        igdsListCell3.setTextCellType(njo);
        String A16 = AnonymousClass7TE.A16(requireContext(), this.A04.A01);
        String string = requireContext().getString(this.A04.A00);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TF.A0F(inflate, R.id.upsell_bottom_sheet_headline);
        0qQ.A0B(igdsHeadline, 0);
        igdsHeadline.A02 = true;
        igdsHeadline.setHeadline((CharSequence) A16);
        if (string != null) {
            igdsHeadline.setBody((CharSequence) string);
        }
        C55790HnP hnP = new C55790HnP(new WB0(this, 63), DbX.A0i(this), 2131972502, 2131968513);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass7TF.A0F(inflate, R.id.bottom_bar);
        C55179HdV.A00(igdsBottomButtonLayout, hnP);
        C60260JiH jiH = (C60260JiH) this.A07.getValue();
        C64321LZw.A00(getViewLifecycleOwner(), jiH.A00, new C58768IxF(26, igdsBottomButtonLayout, igdsListCell2, igdsListCell3, igdsListCell), 10);
        C51975G9x.A1E(jiH, this, DbV.A0J(this), 15);
        igdsListCell.A0D(new C18921WCy(this, 19));
        igdsListCell2.A0D(new C18921WCy(this, 20));
        igdsListCell3.A0D(new C18921WCy(this, 21));
        AnonymousClass0fD.A09(1285413762, A022);
        return inflate;
    }
}
