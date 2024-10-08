package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: X.Gzu  reason: case insensitive filesystem */
public final class C54125Gzu extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "UnlikedYourActivityUpsellsBottomSheetFragment";
    public C56154Hth A00;
    public String A01;
    public String A02;
    public HashMap A03;
    public C54660HMr A04;
    public C56058Hs7 A05;
    public String A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final String getModuleName() {
        return AnonymousClass000.A00(4147);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        Serializable serializable;
        String str2;
        int A022 = AnonymousClass0fD.A02(2130420526);
        C54125Gzu.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str3 = null;
        if (bundle2 != null) {
            str = bundle2.getString(AnonymousClass9NE.A00());
        } else {
            str = null;
        }
        this.A06 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            serializable = bundle3.getSerializable("entrypoint");
        } else {
            serializable = null;
        }
        this.A04 = (C54660HMr) serializable;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str2 = bundle4.getString("author_id");
        } else {
            str2 = null;
        }
        this.A01 = str2;
        Bundle bundle5 = this.mArguments;
        if (bundle5 != null) {
            str3 = bundle5.getString("author_username");
        }
        this.A02 = str3;
        this.A03 = Dbb.A0e("entrypoint", "unliked_your_activity_cn", AnonymousClass7TE.A1L("initial_author_filters", str3));
        C56058Hs7 hs7 = new C56058Hs7(this, AnonymousClass7TE.A0l(this.A07));
        this.A05 = hs7;
        this.A00 = new C56154Hth(this.A04, hs7, C54658HMp.UNLIKED_YOUR_ACTIVITY, this.A06);
        AnonymousClass0fD.A09(-1849870516, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-630746358);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.your_activity_upsell_bottom_sheet, viewGroup, false);
        Context context = getContext();
        HashMap hashMap = this.A03;
        if (hashMap == null) {
            0qQ.A0F("bloksParams");
            throw AnonymousClass00P.createAndThrow();
        }
        C359638dF.A04(context, new C359618dD(DbT.A0X(this.A07)), "com.instagram.privacy.activity_center.liked_media_screen", hashMap, 60);
        String A16 = AnonymousClass7TE.A16(requireContext(), 2131976195);
        String A0c = DbY.A0c(requireContext(), A16, 2131976196);
        SpannableString spannableString = new SpannableString(A0c);
        spannableString.setSpan(new StyleSpan(1), 00l.A08(A0c, A16, 0, false), 00l.A08(A0c, A16, 0, false) + A16.length(), 33);
        String A0c2 = DbY.A0c(requireContext(), this.A02, 2131976197);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TF.A0F(inflate, R.id.upsell_bottom_sheet_headline);
        0qQ.A0B(igdsHeadline, 0);
        igdsHeadline.A02 = true;
        igdsHeadline.setHeadline((CharSequence) A0c2);
        igdsHeadline.setBody((CharSequence) spannableString);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_like_visibility_refresh);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass7TF.A0F(inflate, R.id.bottom_bar);
        C55179HdV.A00(igdsBottomButtonLayout, new C55790HnP(ID1.A00(this, 56), DbX.A0i(this), 2131976199, 2131968513));
        igdsBottomButtonLayout.setPrimaryButtonEnabled(true);
        AnonymousClass0fD.A09(-496333493, A022);
        return inflate;
    }
}
