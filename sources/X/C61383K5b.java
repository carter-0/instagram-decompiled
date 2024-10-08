package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController;

/* renamed from: X.K5b  reason: case insensitive filesystem */
public abstract class C61383K5b extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BaseCoverPhotoPickerFragment";
    public View A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Eu5(new LYF((Object) this, 64), true);
        r4.Eom(2131956801);
        this.A00 = r4.AA9(new LYF((Object) this, 65), 2131960992);
    }

    public final boolean onBackPressed() {
        if (this instanceof C61813KNc) {
            return false;
        }
        C61814KNd kNd = (C61814KNd) this;
        AnonymousClass3Q2 r1 = kNd.A03;
        if (r1 == null) {
            0qQ.A0F("pendingMedia");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.A33 = kNd.A06;
        r1.A5M = kNd.A07;
        ((C60228Jhl) kNd.A0B.getValue()).A00(kNd.A00);
        return false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        2eS.A01(AnonymousClass7TF.A0G(view, R.id.add_from_gallery));
    }

    public final ClipsCoverPhotoPickerController A01() {
        ClipsCoverPhotoPickerController clipsCoverPhotoPickerController;
        if (this instanceof C61813KNc) {
            clipsCoverPhotoPickerController = ((C61813KNc) this).A00;
        } else {
            clipsCoverPhotoPickerController = ((C61814KNd) this).A01;
        }
        if (clipsCoverPhotoPickerController != null) {
            return clipsCoverPhotoPickerController;
        }
        0qQ.A0F("clipsCoverPhotoPickerController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A02(String str) {
        if (this instanceof C61814KNd) {
            C61814KNd kNd = (C61814KNd) this;
            String str2 = kNd.A05;
            if (str2 != null) {
                FragmentActivity requireActivity = kNd.requireActivity();
                FragmentActivity requireActivity2 = kNd.requireActivity();
                UserSession A0l = AnonymousClass7TE.A0l(kNd.A0C);
                C59765JXe jXe = new C59765JXe();
                jXe.A0C = C59764JXc.A00(str);
                JTO.A0L(new C60087JfT(kNd.requireActivity(), requireActivity2, A0l, str2), requireActivity).A00(ClipsSharingDraftViewModel.class).A06(jXe);
                return;
            }
            return;
        }
        C61813KNc kNc = (C61813KNc) this;
        0qQ.A0B(str, 0);
        if (!str.equals(kNc.A04)) {
            kNc.A04 = str;
            C60128Jg9 jg9 = kNc.A03;
            if (jg9 == null) {
                0qQ.A0F("reselectCoverPhotoViewModel");
                throw AnonymousClass00P.createAndThrow();
            } else if (str.length() != 0) {
                jg9.A01.A0B(str);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(731961248);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_cover_photo_picker_fragment, false);
        AnonymousClass0fD.A09(-2107024800, A02);
        return A0D;
    }
}
