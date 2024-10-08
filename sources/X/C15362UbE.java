package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UbE  reason: case insensitive filesystem */
public final class C15362UbE extends AnonymousClass4DH implements G9c {
    public static final String __redex_internal_original_name = "HashtagSheetFragment";
    public View A00;
    public UserSession A01;
    public C230132oy A02;
    public HashtagFollowButton A03;
    public Hashtag A04;
    public AnonymousClass6UX A05;
    public C17548Va1 A06;
    public VXN A07;
    public String A08;
    public String A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public C17675Vc6 A0D;
    public VWA A0E;
    public final C20953X6g A0F = new C19388WXf(this, 3);
    public final 1P0 A0G = new C15622Ufo(this, 20);
    public final 1P0 A0H = new C15622Ufo(this, 22);
    public final 1P0 A0I = new C15622Ufo(this, 21);
    public final X4O A0J = new C19442WZq(this);
    public final X1V A0K = new C19444WZs(this);

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.V3l, java.lang.Object] */
    public static void A00(C15362UbE ubE) {
        Drawable drawable;
        Integer num;
        String A0e;
        C17548Va1 va1 = ubE.A06;
        ImageUrl imageUrl = va1.A01;
        if (imageUrl != null) {
            num = AnonymousClass05K.A0C;
            drawable = null;
        } else {
            drawable = va1.A00;
            num = AnonymousClass05K.A01;
            imageUrl = null;
        }
        ? obj = new Object();
        obj.A02 = num;
        obj.A01 = imageUrl;
        obj.A00 = drawable;
        C19441WZp wZp = new C19441WZp(ubE, 0);
        String str = va1.A04;
        0qQ.A0B(str, 0);
        String A0D2 = 002.A0D(str, '#');
        C17548Va1 va12 = ubE.A06;
        Reel reel = va12.A02;
        X4O x4o = ubE.A0J;
        if (va12.A03 == null) {
            A0e = null;
        } else {
            A0e = AnonymousClass7TF.A0e(DbV.A05(ubE), ubE.A06.A03, 2131963295);
        }
        C17028VFc.A00(ubE.requireContext(), ubE, ubE.A01, new C17699VcU(reel, wZp, obj, x4o, A0e, (CharSequence) null, A0D2, (CharSequence) null, false, false, false), ubE.A0D);
        VWA vwa = ubE.A0E;
        VWB vwb = new VWB(ubE.A0K, ubE.A0A);
        ArrayList arrayList = vwb.A01;
        if (arrayList != null) {
            int min = Math.min(3, arrayList.size());
            for (int i = 0; i < min; i++) {
                WB1.A00(vwa.A02[i], vwb, i, 9);
            }
        }
        vwa.A00.setVisibility(0);
        if (arrayList != null) {
            int min2 = Math.min(3, arrayList.size());
            if (min2 > 0) {
                vwa.A01.A03(8);
                IgImageView[] igImageViewArr = vwa.A02;
                int i2 = 0;
                do {
                    igImageViewArr[i2].setVisibility(4);
                    i2++;
                } while (i2 < 3);
                int i3 = 0;
                do {
                    ArrayList arrayList2 = vwb.A00;
                    if (arrayList2 != null) {
                        igImageViewArr[i3].A05 = AnonymousClass7TE.A0R(arrayList2.get(i3));
                    }
                    igImageViewArr[i3].setUrl((ImageUrl) arrayList.get(i3), ubE);
                    igImageViewArr[i3].setVisibility(0);
                    i3++;
                } while (i3 < min2);
            } else {
                View[] viewArr = vwa.A02;
                int i4 = 0;
                do {
                    viewArr[i4].setVisibility(8);
                    i4++;
                } while (i4 < 3);
                C71662eb r0 = vwa.A01;
                r0.A03(0);
                View A012 = r0.A01();
                TextView A0G2 = DbU.A0G(A012, R.id.empty_state_view_title);
                A0G2.setText(2131965965);
                A0G2.setVisibility(0);
                ImageView A0F2 = DbU.A0F(A012, R.id.empty_state_view_image);
                A0F2.setImageResource(R.drawable.empty_state_camera);
                A0F2.setVisibility(0);
            }
        }
        ubE.A00.setVisibility(8);
        if (ubE.A0B && ubE.A0C) {
            ubE.A00.setVisibility(0);
            ubE.A03.setTextSize(2, 14.0f);
            HashtagFollowButton hashtagFollowButton = ubE.A03;
            hashtagFollowButton.A00 = 0;
            hashtagFollowButton.setTypeface((Typeface) null, 1);
            HashtagFollowButton hashtagFollowButton2 = ubE.A03;
            hashtagFollowButton2.setIsBlueButton(false);
            0nA.A0Z(hashtagFollowButton2, 0);
            ubE.A03.A01(ubE, ubE.A0F, ubE.A04);
        }
    }

    public final Integer BkZ() {
        return AnonymousClass05K.A03;
    }

    public final String getModuleName() {
        return C49092EpH.A00(this, this.A08);
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.07Z, X.0iw, androidx.fragment.app.Fragment, X.UbE] */
    public final void onCreate(Bundle bundle) {
        String encode;
        int A022 = AnonymousClass0fD.A02(-1589643806);
        C15362UbE.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = DbX.A0U(this);
        Parcelable parcelable = requireArguments.getParcelable(C273654mx.A00(1487));
        parcelable.getClass();
        this.A04 = (Hashtag) parcelable;
        this.A08 = DbU.A0l(requireArguments, "args_previous_module_name");
        this.A09 = AnonymousClass7TF.A0b();
        Context requireContext = requireContext();
        0gy A002 = AnonymousClass07i.A00(this);
        UserSession userSession = this.A01;
        C230132oy r5 = new C230132oy(requireContext, A002, this, userSession);
        this.A02 = r5;
        String name = this.A04.getName();
        1P0 r4 = this.A0H;
        1NY A0O = DbU.A0O(userSession);
        if (name == null) {
            encode = "";
        } else {
            encode = Uri.encode(name.trim());
        }
        DbU.A1P(A0O, "tags/%s/story_tags_info/", new Object[]{encode});
        1OC A0S = DbT.A0S(A0O, UXI.class, C18199VnM.class);
        A0S.A00 = r4;
        1ES.A00(r5.A00, r5.A01, A0S);
        this.A06 = new C17548Va1((Drawable) null, (ImageUrl) null, (Reel) null, this.A04.getName(), this.A04.B7j());
        AnonymousClass0fD.A09(2086299478, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-152804331);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.hashtag_sheet_fragment);
        AnonymousClass0fD.A09(-1079938840, A022);
        return A0C2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-730235223);
        super.onDestroyView();
        this.A05 = null;
        AnonymousClass0fD.A09(1404554557, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1559046766);
        super.onResume();
        this.A02.A04(this.A0G, this.A01, this.A04.getName());
        AnonymousClass0fD.A09(1087946898, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0D = new C17675Vc6(DbU.A0C(view, R.id.header_container));
        this.A00 = view.requireViewById(R.id.follow_button_container);
        HashtagFollowButton hashtagFollowButton = (HashtagFollowButton) view.requireViewById(R.id.hashtag_follow_button);
        this.A03 = hashtagFollowButton;
        hashtagFollowButton.setVisibility(0);
        this.A0E = new VWA(DbU.A0C(view, R.id.media_preview_grid));
        A00(this);
    }
}
