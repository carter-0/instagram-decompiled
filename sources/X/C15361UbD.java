package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.model.venue.Venue;
import java.util.List;

/* renamed from: X.UbD  reason: case insensitive filesystem */
public final class C15361UbD extends AnonymousClass4DH implements G9c {
    public static final String __redex_internal_original_name = "LocationSheetFragment";
    public UserSession A00;
    public Venue A01;
    public AnonymousClass6UX A02;
    public VXM A03;
    public C17604Vaw A04;
    public String A05;
    public List A06;
    public View A07;
    public VY9 A08;
    public VOV A09;
    public C17675Vc6 A0A;
    public VWA A0B;
    public String A0C;
    public final 1P0 A0D = new C15622Ufo(this, 24);
    public final C20956X6j A0E = new C19420WYn(this);
    public final DQw A0F = new C19423WYq(this);
    public final X4O A0G = new C19443WZr(this);
    public final X1V A0H = new C19445WZt(this);

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.V3l, java.lang.Object] */
    public static void A00(C15361UbD ubD) {
        C15361UbD ubD2 = ubD;
        Context requireContext = ubD2.requireContext();
        UserSession userSession = ubD2.A00;
        C17675Vc6 vc6 = ubD2.A0A;
        C17604Vaw vaw = ubD2.A04;
        ImageUrl imageUrl = vaw.A00;
        Integer num = AnonymousClass05K.A0C;
        ? obj = new Object();
        obj.A02 = num;
        obj.A01 = imageUrl;
        obj.A00 = null;
        C19441WZp wZp = new C19441WZp(ubD2, 1);
        String str = vaw.A05;
        Reel reel = vaw.A01;
        X4O x4o = ubD2.A0G;
        String str2 = vaw.A03;
        String str3 = vaw.A04;
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            str3 = TextUtils.concat(new CharSequence[]{str2, " · ", str3}).toString();
        } else if (!TextUtils.isEmpty(str2)) {
            str3 = str2;
        } else if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        C17028VFc.A00(requireContext, ubD2, userSession, new C17699VcU(reel, wZp, obj, x4o, str3, ubD2.A04.A02, str, (CharSequence) null, false, false, false), vc6);
        C18378Vqe.A00((VOP) null, ubD2.A09, ubD2.A01);
    }

    public final Integer BkZ() {
        return AnonymousClass05K.A04;
    }

    public final String getModuleName() {
        return C49092EpH.A00(this, this.A0C);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.07Z, androidx.fragment.app.Fragment, X.UbD] */
    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(1217543919);
        C15361UbD.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = DbX.A0U(this);
        Parcelable parcelable = requireArguments.getParcelable("args_venue");
        parcelable.getClass();
        this.A01 = (Venue) parcelable;
        this.A0C = DbU.A0l(requireArguments, "args_previous_module_name");
        this.A05 = AnonymousClass7TF.A0b();
        String str2 = "";
        if (this.A01.A00.getName() != null) {
            str = this.A01.A00.getName();
        } else {
            str = str2;
        }
        if (this.A01.A00.getAddress() != null) {
            str2 = this.A01.A00.getAddress();
        }
        this.A04 = new C17604Vaw((ImageUrl) null, (Reel) null, str, str2, this.A01.A00.getCategory(), C18792W1y.A02(requireContext(), this.A00, this.A01, "REELS_LOCATION_SHEET"));
        this.A08 = new VY9(DbW.A0Q(requireContext(), this));
        AnonymousClass0fD.A09(1206487879, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1272038233);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.location_sheet_fragment);
        AnonymousClass0fD.A09(1935033008, A022);
        return A0C2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1826603930);
        super.onDestroyView();
        this.A02 = null;
        AnonymousClass0fD.A09(485561215, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1442387439);
        super.onResume();
        VY9 vy9 = this.A08;
        UserSession userSession = this.A00;
        String A052 = this.A01.A05();
        DQw dQw = this.A0F;
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, A052);
        if (vy9.A02.add(A052)) {
            1NY A0O = DbU.A0O(userSession);
            A0O.A0K("locations/%s/story/", new Object[]{A052});
            1OC A0S = DbT.A0S(A0O, C43852CFs.class, D1S.class);
            A0S.A00 = new CHB(3, userSession, dQw);
            vy9.A00.schedule(A0S);
        }
        VY9 vy92 = this.A08;
        UserSession userSession2 = this.A00;
        String A053 = this.A01.A05();
        C20956X6j x6j = this.A0E;
        Dba.A0j(A1Z ? 1 : 0, userSession2, A053);
        if (vy92.A01.add(A053)) {
            if (182.A06(0Tu.A05, userSession2, 36319635024387628L)) {
                1vn A012 = 1vm.A01(userSession2);
                PandoGraphQLRequest A002 = C18216Vng.A00(A053);
                A012.ATL(new C19028WHf(x6j, 5), new C45927DFh(A053, (Object) x6j, 5), A002);
            } else {
                vy92.A00.schedule(C18216Vng.A01(userSession2, x6j, A053));
            }
        }
        AnonymousClass0fD.A09(1355040350, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0A = new C17675Vc6(DbU.A0C(view, R.id.header_container));
        this.A09 = new VOV(view);
        this.A07 = view.requireViewById(R.id.horizontal_divider);
        this.A0B = new VWA(DbU.A0C(view, R.id.media_preview_grid));
        A00(this);
    }
}
