package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: X.Gzt  reason: case insensitive filesystem */
public final class C54124Gzt extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "BulkDeleteYourActivityBottomSheetFragment";
    public C56154Hth A00;
    public HashMap A01;
    public boolean A02;
    public 1iA A03;
    public C54660HMr A04;
    public C56058Hs7 A05;
    public String A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final String getModuleName() {
        return "bulk_delete_your_activity_upsell_bottom_sheet";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        1iA r2;
        int A022 = AnonymousClass0fD.A02(-1035091597);
        C54124Gzt.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Serializable serializable = null;
        if (bundle2 != null) {
            str = bundle2.getString(AnonymousClass9NE.A00());
        } else {
            str = null;
        }
        this.A06 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            r2 = bundle3.getSerializable("media_type");
        } else {
            r2 = null;
        }
        0qQ.A0C(r2, AnonymousClass000.A00(1635));
        this.A03 = r2;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            serializable = bundle4.getSerializable("entrypoint");
        }
        this.A04 = (C54660HMr) serializable;
        this.A01 = DbY.A0m("entrypoint", "bulk_delete_your_activity_cn");
        C56058Hs7 hs7 = new C56058Hs7(this, AnonymousClass7TE.A0l(this.A07));
        this.A05 = hs7;
        this.A00 = new C56154Hth(this.A04, hs7, C54658HMp.BULK_DELETE_YOUR_ACTIVITY, this.A06);
        AnonymousClass0fD.A09(1936468947, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-1447693213);
        0qQ.A0B(layoutInflater, 0);
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.your_activity_upsell_bottom_sheet, viewGroup, false);
        if (this.A03 == 1iA.A0a) {
            z = true;
        }
        this.A02 = z;
        Context context = getContext();
        if (this.A02) {
            str = "com.instagram.privacy.activity_center.reels_media_screen";
        } else {
            str = "com.instagram.privacy.activity_center.feed_media_screen";
        }
        HashMap hashMap = this.A01;
        if (hashMap == null) {
            0qQ.A0F("bloksParams");
            throw AnonymousClass00P.createAndThrow();
        }
        C359638dF.A04(context, new C359618dD(DbT.A0X(this.A07)), str, hashMap, 60);
        Context requireContext = requireContext();
        int i = 2131976133;
        if (this.A02) {
            i = 2131976134;
        }
        String A16 = AnonymousClass7TE.A16(requireContext, i);
        Context requireContext2 = requireContext();
        int i2 = 2131976127;
        if (this.A02) {
            i2 = 2131976128;
        }
        String string = requireContext2.getString(i2);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TF.A0F(inflate, R.id.upsell_bottom_sheet_headline);
        0qQ.A0B(igdsHeadline, 0);
        igdsHeadline.A02 = true;
        igdsHeadline.setHeadline((CharSequence) A16);
        if (string != null) {
            igdsHeadline.setBody((CharSequence) string);
        }
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_delete_confirm_refresh);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass7TF.A0F(inflate, R.id.bottom_bar);
        ID1 A002 = ID1.A00(this, 54);
        AnonymousClass37D A0i = DbX.A0i(this);
        int i3 = 2131976129;
        if (this.A02) {
            i3 = 2131976130;
        }
        C55179HdV.A00(igdsBottomButtonLayout, new C55790HnP(A002, A0i, i3, 2131968513));
        igdsBottomButtonLayout.setPrimaryButtonEnabled(true);
        AnonymousClass0fD.A09(1625273121, A022);
        return inflate;
    }
}
