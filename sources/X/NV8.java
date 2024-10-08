package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityChecker;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

public abstract class NV8 extends C68495NKo implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "DirectMediaCardGalleryBaseFragment";
    public AnonymousClass7H6 A00;
    public MediaViewerReplyBarEligibilityChecker A01;
    public List A02 = AnonymousClass7TE.A1C();

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.NKo, X.NV8, androidx.fragment.app.Fragment, java.lang.Object] */
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        String str2 = null;
        if (bundle2 != null) {
            str = bundle2.getString("surface");
        } else {
            str = null;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str2 = bundle3.getString("message_id");
        }
        C254743sy A002 = C67002Mga.A00(requireArguments(), "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        if (A002 != null) {
            DirectThreadKey A03 = C66647MaG.A03(A002);
            0qQ.A0B(A03, 0);
            this.A0D = A03;
            Dba.A15(this, A0E().A03, new C73950PmU(this, str2, str, 8), 37);
            return;
        }
        throw C66580MXl.A0p();
    }

    public final boolean A0M() {
        AnonymousClass7H6 r0 = this.A00;
        if (r0 != null) {
            return r0.A0h();
        }
        0qQ.A0F("directAggregatedMediaViewerController");
        throw AnonymousClass00P.createAndThrow();
    }

    public void onCreate(Bundle bundle) {
        MediaViewerReplyBarEligibilityChecker mediaViewerReplyBarEligibilityChecker;
        int A022 = AnonymousClass0fD.A02(1801388991);
        super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable("DirectThreadSharedMediaFragment.DIRECT_MEDIA_REPLY_ELIGIBILITY_CHECKER");
        if (!(parcelable instanceof MediaViewerReplyBarEligibilityChecker) || (mediaViewerReplyBarEligibilityChecker = (MediaViewerReplyBarEligibilityChecker) parcelable) == null) {
            IllegalArgumentException A0w = AnonymousClass7TE.A0w("DIRECT_SHARED_MEDIA_REPLY_ELIGIBILITY_CHECKER arg is not specified");
            AnonymousClass0fD.A09(771425587, A022);
            throw A0w;
        }
        this.A01 = mediaViewerReplyBarEligibilityChecker;
        AnonymousClass7H6 r3 = new AnonymousClass7H6(requireActivity(), AnonymousClass7TE.A0l(this.A0S), (AnonymousClass3E6) null, 120, false, false);
        this.A00 = r3;
        registerLifecycleListener(r3);
        AnonymousClass7H6 r1 = this.A00;
        if (r1 != null) {
            r1.A0a = MYO.A01(this, 47);
            AnonymousClass0fD.A09(-1984193037, A022);
            return;
        }
        0qQ.A0F("directAggregatedMediaViewerController");
        throw AnonymousClass00P.createAndThrow();
    }

    public void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-763005889);
        super.onDestroyView();
        C69911NuD.A00(AnonymousClass7TE.A0l(this.A0S)).A0A();
        AnonymousClass0fD.A09(-109253875, A022);
    }
}
