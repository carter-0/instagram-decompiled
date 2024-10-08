package X;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;

/* renamed from: X.E1x  reason: case insensitive filesystem */
public final class C47428E1x extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "CelebrateBirthdayBottomSheetFragment";
    public View A00;
    public IgdsListCell A01;
    public IgdsListCell A02;
    public IgdsListCell A03;
    public User A04;
    public C3726091o A05;
    public String A06;
    public boolean A07;
    public final AnonymousClass0eM A08 = C227642jf.A02(this);
    public final View.OnClickListener A09 = new FP9((Object) this, 55);
    public final View.OnClickListener A0A = new FP9((Object) this, 56);
    public final View.OnClickListener A0B = new FP9((Object) this, 57);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final void onViewCreated(View view, Bundle bundle) {
        Object parcelable;
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String string = requireArguments().getString("DISPLAY_NAME_ARGUMENT");
        DbX.A13(requireContext(), AnonymousClass7TG.A0R(view, R.id.title), string, 2131954816);
        IgdsListCell igdsListCell = this.A01;
        if (igdsListCell != null) {
            igdsListCell.A0G(C69349Njo.TYPE_CHEVRON, true);
        }
        IgdsListCell igdsListCell2 = this.A01;
        if (igdsListCell2 != null) {
            igdsListCell2.A0I(DbY.A0c(requireContext(), string, 2131954818));
        }
        IgdsListCell igdsListCell3 = this.A01;
        if (igdsListCell3 != null) {
            AnonymousClass0fU.A00(this.A0A, igdsListCell3);
        }
        IgdsListCell igdsListCell4 = this.A02;
        if (igdsListCell4 != null) {
            igdsListCell4.A0G(C69349Njo.TYPE_CHEVRON, true);
        }
        IgdsListCell igdsListCell5 = this.A02;
        if (igdsListCell5 != null) {
            AnonymousClass0fU.A00(this.A0B, igdsListCell5);
        }
        IgdsListCell igdsListCell6 = this.A03;
        if (igdsListCell6 != null) {
            igdsListCell6.A0G(C69349Njo.TYPE_CHEVRON, true);
        }
        IgdsListCell igdsListCell7 = this.A03;
        if (igdsListCell7 != null) {
            AnonymousClass0fU.A00(this.A09, igdsListCell7);
        }
        IgImageView A0b = DbX.A0b(view, R.id.celebrate_birthday_profile_pic);
        Bundle requireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = requireArguments.getParcelable("PROFILE_PIC_URL_ARGUMENT", ImageUrl.class);
        } else {
            parcelable = requireArguments.getParcelable("PROFILE_PIC_URL_ARGUMENT");
        }
        ImageUrl imageUrl = (ImageUrl) parcelable;
        if (imageUrl != null) {
            A0b.setUrl(imageUrl, this);
        }
        User user = this.A04;
        if (user != null) {
            AnonymousClass0eM r1 = this.A08;
            if (C240943Ng.A02(AnonymousClass7TE.A0l(r1), user)) {
                if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(r1, 1), 36319510470467017L)) {
                    ? A0a = DbX.A0a(view, R.id.birthday_confetti_circular_imageview);
                    C240943Ng.A00(requireContext(), A0a);
                    C240943Ng.A01(A0a.getDrawable());
                }
            }
        }
        String string2 = requireArguments.getString("USER_ID_ARGUMENT");
        if (string2 != null && !this.A07 && (str = this.A06) != null) {
            C3726091o r4 = this.A05;
            if (r4 == null) {
                0qQ.A0F("birthdayLogger");
                throw AnonymousClass00P.createAndThrow();
            }
            long parseLong = Long.parseLong(string2);
            long A082 = Dbb.A08(this.A08);
            String str2 = "story";
            if (!str.equals(str2)) {
                str2 = "profile";
            }
            r4.A01(parseLong, str2, A082, "bottomsheet");
            this.A07 = true;
        }
    }

    public static final void A00(C47428E1x e1x, String str, String str2) {
        String str3 = e1x.A06;
        if (str3 != null) {
            C3726091o r2 = e1x.A05;
            if (r2 == null) {
                0qQ.A0F("birthdayLogger");
                throw AnonymousClass00P.createAndThrow();
            }
            long parseLong = Long.parseLong(str);
            long A082 = Dbb.A08(e1x.A08);
            String str4 = "story";
            if (!str3.equals(str4)) {
                str4 = "profile";
            }
            r2.A02(str4, "bottomsheet", str2, parseLong, A082);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(731374743);
        C47428E1x.super.onCreate(bundle);
        this.A05 = new C3726091o(this, AnonymousClass7TE.A0l(this.A08));
        this.A06 = requireArguments().getString("ENTRY_POINT");
        AnonymousClass0fD.A09(-729994909, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-184944767);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.celebrate_birthday_bottomsheet_fragment, viewGroup, false);
        this.A00 = inflate.requireViewById(R.id.loading_spinner);
        this.A01 = (IgdsListCell) inflate.requireViewById(R.id.see_shared_stories);
        this.A02 = (IgdsListCell) inflate.requireViewById(R.id.send_confetti);
        this.A03 = (IgdsListCell) inflate.requireViewById(R.id.manage_settings);
        AnonymousClass0eM r4 = this.A08;
        this.A04 = 17h.A00(AnonymousClass7TE.A0l(r4)).A02(requireArguments().getString("USER_ID_ARGUMENT"));
        View view = this.A00;
        if (view != null) {
            view.setVisibility(0);
        }
        IgdsListCell igdsListCell = this.A02;
        if (igdsListCell != null) {
            igdsListCell.setVisibility(4);
        }
        IgdsListCell igdsListCell2 = this.A03;
        if (igdsListCell2 != null) {
            igdsListCell2.setVisibility(4);
        }
        User user = this.A04;
        if (user != null) {
            0lg A0X = DbT.A0X(r4);
            String id = user.getId();
            0qQ.A0B(A0X, 0);
            1NY A0M = DbU.A0M(A0X);
            A0M.A05();
            A0M.A02();
            A0M.A0A("api/v1/stories/follow_versaries/get_shared_memories/");
            A0M.A0Q(CDP.class, C45626Czc.class);
            1OC A0T = DbT.A0T(A0M, "follower_id", id);
            0qQ.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.SharedMemoriesResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.SharedMemoriesResponse>>");
            EDV.A00(A0T, user, this, 35);
            schedule(A0T);
        }
        AnonymousClass0fD.A09(-2147380250, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1385711226);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        AnonymousClass0fD.A09(-826992853, A022);
    }
}
