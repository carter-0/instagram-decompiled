package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.io.Serializable;

/* renamed from: X.UYj  reason: case insensitive filesystem */
public final class C15269UYj extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "LikeVisibilityBottomSheetFragment";
    public C56154Hth A00;
    public I10 A01;
    public C56058Hs7 A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;

    public final String getModuleName() {
        return AnonymousClass000.A00(4147);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public C15269UYj() {
        C20610Wvr wvr = new C20610Wvr(this, 17);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20610Wvr(new C20610Wvr(this, 14), 15));
        this.A04 = new C227862kA(new C20610Wvr(A002, 16), wvr, new MJ6(31, (Object) null, A002), new 0Yh(C16398UuG.class));
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-1585352506);
        C15269UYj.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Serializable serializable = null;
        if (bundle2 != null) {
            str = bundle2.getString(AnonymousClass9NE.A00());
        } else {
            str = null;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            serializable = bundle3.getSerializable("entrypoint");
        }
        C54660HMr hMr = (C54660HMr) serializable;
        C56058Hs7 hs7 = new C56058Hs7(this, AnonymousClass7TE.A0l(this.A03));
        this.A02 = hs7;
        C54658HMp hMp = C54658HMp.LIKE_VISIBILITY_SETTING;
        this.A00 = new C56154Hth(hMr, hs7, hMp, str);
        C56058Hs7 hs72 = this.A02;
        if (hs72 == null) {
            0qQ.A0F("upsellsLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = new I10(hMr, hs72, hMp, str);
        AnonymousClass0fD.A09(1792994443, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1322793055);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.like_visibility_setting_bottom_sheet, viewGroup, false);
        CompoundButton compoundButton = (CompoundButton) AnonymousClass7TF.A0F(inflate, R.id.everyone_radio);
        IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass7TF.A0G(inflate, R.id.people_you_follow_radio);
        CompoundButton compoundButton2 = (CompoundButton) AnonymousClass7TF.A0G(inflate, R.id.off_radio);
        IgdsListCell igdsListCell2 = (IgdsListCell) AnonymousClass7TF.A0G(inflate, R.id.close_friends_radio);
        C69349Njo njo = C69349Njo.TYPE_RADIO;
        igdsListCell.setTextCellType(njo);
        igdsListCell2.setTextCellType(njo);
        String A16 = AnonymousClass7TE.A16(requireContext(), 2131976164);
        String A162 = AnonymousClass7TE.A16(requireContext(), 2131976169);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TF.A0F(inflate, R.id.upsell_bottom_sheet_headline);
        0qQ.A0B(igdsHeadline, 0);
        igdsHeadline.A02 = true;
        igdsHeadline.setHeadline((CharSequence) A162);
        igdsHeadline.setBody((CharSequence) A16);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass7TF.A0G(inflate, R.id.bottom_bar);
        C55179HdV.A00(igdsBottomButtonLayout, new C55790HnP(new WB0(this, 60), DbX.A0i(this), 2131972502, 2131968513));
        igdsBottomButtonLayout.setPrimaryButtonEnabled(true);
        C16398UuG uuG = (C16398UuG) this.A04.getValue();
        C64321LZw.A00(getViewLifecycleOwner(), uuG.A00, new C58790Ixb(23, compoundButton2, compoundButton, igdsBottomButtonLayout, igdsListCell2, igdsListCell), 8);
        C64321LZw.A00(getViewLifecycleOwner(), uuG.A00, new C59104J6m(41, (Object) igdsListCell, (Object) igdsListCell2, (Object) this), 8);
        C51975G9x.A1E(uuG, this, DbV.A0J(this), 13);
        C18921WCy.A00(compoundButton, this, 12);
        igdsListCell.A0D(new C18921WCy(this, 13));
        igdsListCell2.A0D(new C18921WCy(this, 14));
        C18921WCy.A00(compoundButton2, this, 15);
        AnonymousClass0fD.A09(108127416, A022);
        return inflate;
    }
}
