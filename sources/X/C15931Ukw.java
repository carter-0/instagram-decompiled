package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.model.direct.DirectShareTarget;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ukw  reason: case insensitive filesystem */
public final class C15931Ukw extends UZB implements C273494mf, XBQ {
    public static final long A0C = JTR.A0N(TimeUnit.HOURS);
    public static final String __redex_internal_original_name = "DirectLocationSharingBottomSheetFragment";
    public ImageView A00;
    public TextView A01;
    public UHR A02;
    public ImageUrl A03;
    public IgdsButton A04;
    public IgdsButton A05;
    public IgdsMediaButton A06;
    public IgdsMediaButton A07;
    public boolean A08;
    public IgdsMediaButton A09;
    public IgdsInlineSearchBox A0A;
    public final AnonymousClass9HB A0B = new AnonymousClass9HB();

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        UHR uhr = this.A02;
        if (uhr == null) {
            0qQ.A0F("locationSharingPresenter");
            throw AnonymousClass00P.createAndThrow();
        } else if (uhr.A00) {
            UHS.A05(uhr, "onSaveInstanceState", new Object[0]);
            bundle.putParcelable("location_sharing_presenter_state", UHR.A00(uhr));
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view.requireViewById(R.id.drop_pin_button);
        this.A06 = igdsMediaButton;
        if (igdsMediaButton != null) {
            WB8.A00(igdsMediaButton, 36, this);
        }
        IgdsMediaButton igdsMediaButton2 = (IgdsMediaButton) view.requireViewById(R.id.exit_pin_button);
        this.A07 = igdsMediaButton2;
        if (igdsMediaButton2 != null) {
            WB8.A00(igdsMediaButton2, 37, this);
        }
        IgdsMediaButton igdsMediaButton3 = (IgdsMediaButton) view.requireViewById(R.id.center_location_button);
        this.A09 = igdsMediaButton3;
        if (igdsMediaButton3 != null) {
            WB8.A00(igdsMediaButton3, 38, this);
        }
        this.A04 = (IgdsButton) view.requireViewById(R.id.share_location_button);
        IgdsButton igdsButton = (IgdsButton) view.requireViewById(R.id.stop_live_sharing_button);
        this.A05 = igdsButton;
        if (igdsButton != null) {
            WB8.A00(igdsButton, 39, this);
        }
        this.A01 = DbU.A0G(view, R.id.location_sharing_bottom_button_footer_text);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view.requireViewById(R.id.search_box);
        this.A0A = igdsInlineSearchBox;
        if (igdsInlineSearchBox != null) {
            WB8.A00(igdsInlineSearchBox, 40, this);
        }
        IgdsInlineSearchBox igdsInlineSearchBox2 = this.A0A;
        if (igdsInlineSearchBox2 != null) {
            igdsInlineSearchBox2.A02();
        }
        this.A00 = DbU.A0F(view, R.id.map_pin_annotation);
        int A012 = AnonymousClass1GB.A01(0nA.A04(requireActivity(), 50));
        C16079Uo6 uo6 = new C16079Uo6(requireContext(), requireContext().getDrawable(R.drawable.direct_location_sharing_map_pin), (ImageUrl) null, C273654mx.A00(803), 1.0f, A012, false, false, false);
        ImageView imageView = this.A00;
        String str = "mapPinAnnotation";
        if (imageView != null) {
            imageView.setImageDrawable(uo6);
            ImageView imageView2 = this.A00;
            if (imageView2 != null) {
                imageView2.setY(imageView2.getY() - ((float) (A012 / 2)));
                UHR uhr = this.A02;
                if (uhr == null) {
                    str = "locationSharingPresenter";
                } else {
                    uhr.A0A(bundle);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0075, code lost:
        if (r8 != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r9.A06.size() <= r7) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009c, code lost:
        if (r8 != false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00aa, code lost:
        if (r8 != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b5, code lost:
        if (r8 != false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00f1, code lost:
        if (r8 != false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r6 == -1) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void EEv(X.C18042VkQ r17) {
        /*
            r16 = this;
            r0 = r17
            X.V4A r1 = r0.A00
            java.lang.Object r0 = r0.A01
            java.lang.Object r9 = r1.A00(r0)
            X.0qQ.A07(r9)
            X.Vjv r9 = (X.C18019Vjv) r9
            int r7 = r9.A05
            if (r7 < 0) goto L_0x001c
            com.google.common.collect.ImmutableList r0 = r9.A06
            int r0 = r0.size()
            r8 = 1
            if (r0 > r7) goto L_0x001d
        L_0x001c:
            r8 = 0
        L_0x001d:
            boolean r5 = r9.A0B
            int r6 = r9.A04
            if (r6 > 0) goto L_0x0027
            r0 = -1
            r2 = 0
            if (r6 != r0) goto L_0x0028
        L_0x0027:
            r2 = 1
        L_0x0028:
            r10 = r16
            boolean r0 = r10.A08
            if (r0 == r2) goto L_0x0051
            X.VZ8 r1 = r10.A00
            if (r1 == 0) goto L_0x0051
            if (r2 == 0) goto L_0x008d
            com.instagram.common.typedurl.ImageUrl r11 = r10.A03
            if (r11 == 0) goto L_0x0051
            X.T6B r1 = r10.A01
            if (r1 == 0) goto L_0x008a
            java.lang.String r0 = "DirectLocationSharingBottomSheetFragment"
            android.location.Location r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0051
            double r12 = r0.getLatitude()
            double r14 = r0.getLongitude()
            r10.A05(r11, r12, r14)
        L_0x004f:
            r10.A08 = r2
        L_0x0051:
            if (r8 == 0) goto L_0x006c
            if (r7 < 0) goto L_0x006c
            com.google.common.collect.ImmutableList r1 = r9.A06
            int r0 = r1.size()
            if (r0 <= r7) goto L_0x006c
            java.lang.Object r0 = r1.get(r7)
            com.facebook.locationsharing.core.models.PointOfInterestViewModel r0 = (com.facebook.locationsharing.core.models.PointOfInterestViewModel) r0
            if (r0 == 0) goto L_0x006c
            double r3 = r0.A00
            double r0 = r0.A01
            r10.A04(r3, r0)
        L_0x006c:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r1 = r10.A06
            r4 = 8
            if (r1 == 0) goto L_0x007c
            if (r5 != 0) goto L_0x0077
            r0 = 0
            if (r8 == 0) goto L_0x0079
        L_0x0077:
            r0 = 8
        L_0x0079:
            r1.setVisibility(r0)
        L_0x007c:
            android.widget.ImageView r1 = r10.A00
            if (r1 != 0) goto L_0x0098
            java.lang.String r0 = "mapPinAnnotation"
        L_0x0082:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x008a:
            java.lang.String r0 = "locationManager"
            goto L_0x0082
        L_0x008d:
            X.WFU r0 = r1.A01
            r0.A03()
            java.util.Map r0 = r1.A03
            r0.clear()
            goto L_0x004f
        L_0x0098:
            if (r5 != 0) goto L_0x009e
            r0 = 8
            if (r8 == 0) goto L_0x009f
        L_0x009e:
            r0 = 0
        L_0x009f:
            r1.setVisibility(r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r1 = r10.A07
            if (r1 == 0) goto L_0x00b0
            if (r5 != 0) goto L_0x00ac
            r0 = 8
            if (r8 == 0) goto L_0x00ad
        L_0x00ac:
            r0 = 0
        L_0x00ad:
            r1.setVisibility(r0)
        L_0x00b0:
            if (r2 == 0) goto L_0x00b7
            if (r5 != 0) goto L_0x00b7
            r3 = 0
            if (r8 == 0) goto L_0x00b8
        L_0x00b7:
            r3 = 1
        L_0x00b8:
            com.instagram.igds.components.button.IgdsButton r1 = r10.A04
            if (r1 == 0) goto L_0x00c3
            int r0 = X.C13988Tno.A0E(r3)
            r1.setVisibility(r0)
        L_0x00c3:
            com.instagram.igds.components.button.IgdsButton r0 = r10.A05
            if (r0 == 0) goto L_0x00cd
            if (r3 != 0) goto L_0x00ca
            r4 = 0
        L_0x00ca:
            r0.setVisibility(r4)
        L_0x00cd:
            com.instagram.igds.components.button.IgdsButton r3 = r10.A04
            if (r3 == 0) goto L_0x00da
            r1 = 1
            X.FNk r0 = new X.FNk
            r0.<init>(r10, r1, r5, r8)
            X.AnonymousClass0fU.A00(r0, r3)
        L_0x00da:
            if (r5 == 0) goto L_0x0171
            r3 = 2131959653(0x7f131f65, float:1.9555953E38)
        L_0x00df:
            com.instagram.igds.components.button.IgdsButton r1 = r10.A04
            if (r1 == 0) goto L_0x00ee
            android.content.Context r0 = r10.requireContext()
            java.lang.String r0 = r0.getString(r3)
            r1.setText((java.lang.String) r0)
        L_0x00ee:
            if (r5 != 0) goto L_0x00f3
            r3 = 0
            if (r8 == 0) goto L_0x00f4
        L_0x00f3:
            r3 = 1
        L_0x00f4:
            java.lang.String r4 = ""
            if (r5 == 0) goto L_0x0151
            java.lang.String r4 = r9.A08
        L_0x00fa:
            X.0qQ.A0A(r4)
            if (r3 == 0) goto L_0x0112
            boolean r0 = X.00l.A0W(r4)
            android.widget.TextView r3 = r10.A01
            if (r0 == 0) goto L_0x010f
            if (r3 == 0) goto L_0x010e
            java.lang.String r4 = "\n"
        L_0x010b:
            r3.setText(r4)
        L_0x010e:
            return
        L_0x010f:
            if (r3 == 0) goto L_0x010e
            goto L_0x010b
        L_0x0112:
            android.widget.TextView r3 = r10.A01
            if (r2 == 0) goto L_0x0143
            if (r3 == 0) goto L_0x0126
            android.content.Context r2 = r10.requireContext()
            r1 = 2131959657(0x7f131f69, float:1.955596E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            X.DbX.A13(r2, r3, r0, r1)
        L_0x0126:
            android.widget.TextView r7 = r10.A01
            if (r7 == 0) goto L_0x010e
            android.content.res.Resources r5 = X.JTR.A0R(r10)
            long r3 = X.JTR.A0L()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            long r0 = (long) r6
            long r0 = r2.toSeconds(r0)
            long r3 = r3 + r0
            double r0 = (double) r3
            java.lang.String r0 = X.1G0.A0A(r5, r0)
            r7.setContentDescription(r0)
            return
        L_0x0143:
            if (r3 == 0) goto L_0x010e
            android.content.Context r1 = r10.requireContext()
            r0 = 2131959652(0x7f131f64, float:1.955595E38)
            java.lang.String r4 = r1.getString(r0)
            goto L_0x010b
        L_0x0151:
            if (r8 == 0) goto L_0x00fa
            if (r7 < 0) goto L_0x00fa
            com.google.common.collect.ImmutableList r1 = r9.A06
            int r0 = r1.size()
            if (r0 <= r7) goto L_0x00fa
            java.lang.Object r0 = r1.get(r7)
            com.facebook.locationsharing.core.models.PointOfInterestViewModel r0 = (com.facebook.locationsharing.core.models.PointOfInterestViewModel) r0
            if (r0 == 0) goto L_0x00fa
            java.lang.String r1 = r0.A02
            X.0qQ.A07(r1)
            r0 = 183(0xb7, float:2.56E-43)
            java.lang.String r4 = X.00l.A0I(r1, r1, r0)
            goto L_0x00fa
        L_0x0171:
            if (r8 == 0) goto L_0x0178
            r3 = 2131959654(0x7f131f66, float:1.9555955E38)
            goto L_0x00df
        L_0x0178:
            r3 = 2131959655(0x7f131f67, float:1.9555957E38)
            if (r2 == 0) goto L_0x00df
            r3 = 2131959656(0x7f131f68, float:1.9555959E38)
            goto L_0x00df
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15931Ukw.EEv(X.VkQ):void");
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
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final void A06(VZ8 vz8) {
        super.A06(vz8);
        WIN win = new WIN(this);
        WFU wfu = vz8.A01;
        wfu.A0N.add(new WFF(vz8, win, 1));
        A03();
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        String string;
        int A022 = AnonymousClass0fD.A02(2058204106);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Parcelable parcelable = null;
        if (bundle2 == null || (string = bundle2.getString(C273654mx.A00(547))) == null) {
            IllegalStateException A0y = AnonymousClass7TE.A0y();
            AnonymousClass0fD.A09(287636948, A022);
            throw A0y;
        }
        0eE r0 = AnonymousClass0t1.A01;
        AnonymousClass0eM r3 = this.A04;
        this.A03 = DbX.A0l(r0, r3).Bh3();
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            parcelable = bundle3.getParcelable(AnonymousClass000.A00(530));
        }
        0qQ.A0C(parcelable, C66579MXk.A00(372));
        DirectShareTarget directShareTarget = (DirectShareTarget) parcelable;
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        VN1 vn1 = new VN1(this);
        0qQ.A0B(A0l, 2);
        AnonymousClass7AZ r10 = new AnonymousClass7AZ(requireContext, A0l);
        C17421VVa vVa = new C17421VVa(A0l);
        String A0u = DbU.A0u(r3);
        if (TextUtils.isEmpty(string)) {
            throw new IllegalArgumentException("\"groupishId\" must not be null or empty");
        } else if (!TextUtils.isEmpty(A0u)) {
            this.A02 = new UHR(requireContext, this, A0l, vn1, this, vVa, r10, directShareTarget, string, __redex_internal_original_name, "igd_composer", "igd_composer", A0u, true);
            AnonymousClass0fD.A09(167813589, A022);
        } else {
            throw new IllegalArgumentException("\"userId\" must not be null or empty");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1185792846);
        0qQ.A0B(layoutInflater, 0);
        this.A0B.A02(viewGroup);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_location_sharing_bottomsheet, viewGroup, false);
        AnonymousClass0fD.A09(-1012072530, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-317738486);
        super.onDestroyView();
        UHR uhr = this.A02;
        if (uhr == null) {
            0qQ.A0F("locationSharingPresenter");
            throw AnonymousClass00P.createAndThrow();
        }
        uhr.A06();
        this.A06 = null;
        this.A07 = null;
        this.A09 = null;
        this.A04 = null;
        this.A05 = null;
        this.A01 = null;
        this.A0A = null;
        AnonymousClass0fD.A09(-190492006, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1028676707);
        super.onPause();
        UHR uhr = this.A02;
        if (uhr == null) {
            0qQ.A0F("locationSharingPresenter");
            throw AnonymousClass00P.createAndThrow();
        }
        uhr.A08();
        AnonymousClass0fD.A09(-1183861497, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(135574572);
        super.onResume();
        UHR uhr = this.A02;
        if (uhr == null) {
            0qQ.A0F("locationSharingPresenter");
            throw AnonymousClass00P.createAndThrow();
        }
        uhr.A07();
        AnonymousClass0fD.A09(-293883885, A022);
    }
}
