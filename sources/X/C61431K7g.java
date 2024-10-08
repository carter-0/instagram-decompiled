package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.GalleryMediaGridView;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.K7g  reason: case insensitive filesystem */
public final class C61431K7g extends AnonymousClass4DH implements C273494mf, C229132mt, MUO {
    public static final String __redex_internal_original_name = "RemoteSharedMediaPickerFragment";
    public ShimmerFrameLayout A00;
    public AnonymousClass8QN A01;
    public C60392Jkl A02;
    public String A03;
    public boolean A04;
    public AnonymousClass87I A05;
    public C228602lw A06;
    public GalleryMediaGridView A07;
    public String A08;
    public final HashMap A09 = AnonymousClass7TE.A1E();
    public final AnonymousClass0eM A0A = C227642jf.A02(this);

    private final void A00() {
        String str;
        String str2;
        1NY r2;
        String str3;
        this.A04 = true;
        if (this.A03 == null) {
            ShimmerFrameLayout shimmerFrameLayout = this.A00;
            str = "shimmerView";
            if (shimmerFrameLayout != null) {
                shimmerFrameLayout.A02();
                ShimmerFrameLayout shimmerFrameLayout2 = this.A00;
                if (shimmerFrameLayout2 != null) {
                    shimmerFrameLayout2.setVisibility(0);
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass87I r0 = this.A05;
        if (r0 == null) {
            str3 = "Cannot create Media Picker task with a null create mode type";
        } else {
            int ordinal = r0.ordinal();
            if (ordinal == 8) {
                0lg A0X = DbT.A0X(this.A0A);
                String str4 = this.A08;
                str2 = this.A03;
                r2 = DbU.A0O(A0X);
                r2.A0K("creatives/create_mode/list_user_media/%s/", new Object[]{str4});
            } else if (ordinal != 31) {
                str3 = "Cannot create Media Picker task from this create mode type";
            } else {
                0lg A0X2 = DbT.A0X(this.A0A);
                str2 = this.A03;
                r2 = DbU.A0O(A0X2);
                r2.A0A("stories/end_of_year/get_end_of_year_media/");
            }
            r2.A0R(K1M.class, LI0.class);
            r2.A9m("page_size", "50");
            if (!TextUtils.isEmpty(str2)) {
                r2.A9m("max_id", str2);
            }
            1OC A0M = r2.A0M();
            C61500KAf.A00(A0M, this, 14);
            C228602lw r02 = this.A06;
            if (r02 == null) {
                str = "loaderScheduler";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            r02.schedule(A0M);
            return;
        }
        0kD.A07("RemoteSharedMediaPickerFragment::makeRequest", str3, (Throwable) null);
    }

    public final void DQg(GalleryItem galleryItem, boolean z) {
        0qQ.A0B(galleryItem, 0);
        AnonymousClass8QN r0 = this.A01;
        String str = "delegate";
        if (r0 != null) {
            if (r0.A0Y.A01.size() < 10) {
                Object obj = this.A09.get(galleryItem.A0A);
                if (obj != null) {
                    1Xj r1 = (1Xj) obj;
                    AnonymousClass8QN r02 = this.A01;
                    if (r02 != null) {
                        r02.A08((AnonymousClass8QZ) null, r1);
                        return;
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                C60392Jkl jkl = this.A02;
                if (jkl == null) {
                    str = "adapter";
                } else {
                    List list = jkl.A02;
                    int indexOf = list.indexOf(galleryItem.A0A);
                    if (indexOf != -1) {
                        list.remove(indexOf);
                        jkl.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "media_picker_fragment";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String string = requireArguments().getString(AnonymousClass000.A00(2998));
        if (string == null) {
            string = "";
        }
        0sn stringArrayList = requireArguments().getStringArrayList(AnonymousClass000.A00(3946));
        if (stringArrayList == null) {
            stringArrayList = 0sn.A00;
        }
        this.A00 = (ShimmerFrameLayout) view.requireViewById(R.id.media_picker_shimmer);
        this.A05 = C393699wr.A00(string);
        C60392Jkl jkl = new C60392Jkl(this);
        this.A02 = jkl;
        List list = jkl.A02;
        list.clear();
        list.addAll(stringArrayList);
        GalleryMediaGridView galleryMediaGridView = (GalleryMediaGridView) view.requireViewById(R.id.media_picker_grid_view);
        this.A07 = galleryMediaGridView;
        String str = "galleryMediaGridView";
        if (galleryMediaGridView != null) {
            C60392Jkl jkl2 = this.A02;
            if (jkl2 == null) {
                str = "adapter";
            } else {
                galleryMediaGridView.setAdapter(jkl2);
                GalleryMediaGridView galleryMediaGridView2 = this.A07;
                if (galleryMediaGridView2 != null) {
                    C3251771i r1 = C3251771i.A05;
                    C252553pI r0 = galleryMediaGridView2.A0D;
                    if (r0 != null) {
                        JTQ.A0y(r0, galleryMediaGridView2, this, r1);
                        A00();
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void ACw() {
        if (!this.A04 && this.A03 != null) {
            A00();
        }
    }

    public final void DQh(GalleryItem galleryItem, boolean z) {
        AnonymousClass8QN r1 = this.A01;
        if (r1 == null) {
            JTO.A1K();
            throw AnonymousClass00P.createAndThrow();
        } else {
            r1.A09(galleryItem.A0A);
        }
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final boolean isScrolledToTop() {
        GalleryMediaGridView galleryMediaGridView = this.A07;
        if (galleryMediaGridView != null) {
            return C2808154f.A03(galleryMediaGridView.A01);
        }
        0qQ.A0F("galleryMediaGridView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, androidx.fragment.app.Fragment, X.K7g] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1069867958);
        C61431K7g.super.onCreate(bundle);
        this.A08 = requireArguments().getString(C66579MXk.A00(164));
        this.A06 = new C228602lw(requireContext(), AnonymousClass07i.A00(this), (Integer) null);
        AnonymousClass0fD.A09(755742486, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1669045655);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_remote_shared_media, viewGroup, false);
        AnonymousClass0fD.A09(-1186101536, A022);
        return inflate;
    }
}
