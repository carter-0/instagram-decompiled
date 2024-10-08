package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.TextView;
import com.facebook.common.dextricks.Constants;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.location.NearbyVenuesService;
import com.instagram.location.intf.LocationSignalPackage;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.List;

public final class K5H extends AnonymousClass4DH implements AnonymousClass0iw, AnonymousClass4DR, C273494mf {
    public static final String __redex_internal_original_name = "NearbyVenuesFragment";
    public long A00;
    public Dialog A01;
    public Location A02;
    public Handler A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public ViewStub A09;
    public ActionButton A0A;
    public UserSession A0B;
    public IgTextView A0C;
    public LET A0D;
    public K9J A0E;
    public LocationSignalPackage A0F;
    public C238133Ar A0G;
    public AnonymousClass4O6 A0H;
    public C14221Ts1 A0I;
    public SearchEditText A0J;
    public Integer A0K;
    public String A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public 1wn A0X;
    public AnonymousClass3E6 A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public final Handler A0c = new C60012JdL(this, 4);
    public final C13673Tei A0d = new C65345Lrl(this);
    public final C337287g2 A0e = new AnonymousClass7g1();
    public final C252213ok A0f = new C64871LjX(this, 6);
    public final C267874cM A0g = new C65423Lt3(this, 1);
    public final C66494MTx A0h = new C65424Lt4(this);
    public final MSX A0i = new Lt7(this);
    public final G9d A0j = new C19551Wbb(this, 0);
    public final G6X A0k = new C51012Fn3(this, 2);
    public final G6X A0l = new C51012Fn3(this, 1);
    public final G6X A0m = new C51012Fn3(this, 0);
    public volatile C8779R9f A0n;

    public static K5H A00(Location location, String str, String str2, long j, boolean z, boolean z2) {
        K5H k5h = new K5H();
        Bundle A0a2 = AnonymousClass7TE.A0a();
        A0a2.putString(AnonymousClass000.A00(450), str);
        if (location != null) {
            A0a2.putParcelable("INTENT_EXTRA_PHOTO_LOCATION", location);
        }
        A0a2.putLong("INTENT_EXTRA_TIMESTAMP", j);
        A0a2.putBoolean(AnonymousClass000.A00(958), z);
        A0a2.putBoolean("INTENT_EXTRA_ALLOW_CUSTOM_LOCATION", false);
        A0a2.putBoolean("INTENT_EXTRA_IS_BOTTOM_SHEET_VARIANT", z2);
        if (str2 != null) {
            A0a2.putString("INTENT_EXTRA_CLIPS_SESSION_ID_TO_UPDATE_PUBLISH_SCREEN", str2);
        }
        k5h.setArguments(A0a2);
        return k5h;
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return C273654mx.A00(164);
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public static C16530Uwa A01(K5H k5h) {
        int intValue = k5h.A0K.intValue();
        if (intValue == 1) {
            return C16530Uwa.POST;
        }
        if (intValue == 3) {
            return C16530Uwa.EDIT_POST;
        }
        if (intValue == 0) {
            return C16530Uwa.STORY;
        }
        if (intValue != 4) {
            return C16530Uwa.UNKNOWN;
        }
        return C16530Uwa.CLIPS;
    }

    private void A02() {
        int A022 = JTQ.A02(this.A06);
        SearchEditText searchEditText = this.A0J;
        if (searchEditText != null) {
            searchEditText.post(new M3P(this));
            this.A0J.setVisibility(0);
            if (this.A0C == null) {
                return;
            }
            if (!this.A0N || TextUtils.isEmpty(this.A0J.getSearchString())) {
                this.A0C.setVisibility(A022);
            } else {
                this.A0C.setVisibility(0);
            }
        }
    }

    public static void A05(K5H k5h) {
        Handler handler = k5h.A0c;
        handler.sendEmptyMessageDelayed(1, 15000);
        handler.sendEmptyMessageDelayed(0, 3000);
        ActionButton actionButton = k5h.A0A;
        if (actionButton != null) {
            actionButton.setDisplayedChild(1);
        }
        k5h.A0R = true;
        1Wr r0 = 1Wr.A00;
        if (r0 != null) {
            UserSession userSession = k5h.A0B;
            Activity rootActivity = k5h.getRootActivity();
            rootActivity.getClass();
            r0.requestLocationUpdates(userSession, rootActivity, k5h.A0g, k5h.A0h, __redex_internal_original_name, false, A01(k5h));
        }
    }

    public static void A06(K5H k5h) {
        Location lastLocation;
        if (k5h.A02 == null) {
            if (k5h.requireArguments().getParcelable("INTENT_EXTRA_PHOTO_LOCATION") != null) {
                lastLocation = (Location) k5h.requireArguments().getParcelable("INTENT_EXTRA_PHOTO_LOCATION");
            } else {
                1Wr r2 = 1Wr.A00;
                r2.getClass();
                lastLocation = r2.getLastLocation(k5h.A0B, __redex_internal_original_name);
            }
            k5h.A02 = lastLocation;
        }
    }

    public static void A07(K5H k5h) {
        if (k5h.A02 != null) {
            k5h.A02();
            K9J k9j = k5h.A0E;
            k9j.A03.clear();
            k9j.A04.clear();
            C22328Xzd A002 = NearbyVenuesService.A00(k5h.A02);
            if (A002 == null) {
                k5h.A0E.notifyDataSetChanged();
                ActionButton actionButton = k5h.A0A;
                if (actionButton != null) {
                    actionButton.setDisplayedChild(1);
                }
                NearbyVenuesService.A01(k5h.requireContext(), k5h.A02, k5h.A0B, k5h.A0F, Long.valueOf(k5h.A00));
                return;
            }
            k5h.A0D.A01("", A002.BjE(), A002.getItems());
            if (!A002.getItems().isEmpty()) {
                k5h.A0E.A02(false);
            }
            K9J k9j2 = k5h.A0E;
            k9j2.A01(A002.getItems());
            k9j2.notifyDataSetChanged();
        }
    }

    public static void A08(K5H k5h) {
        if (!k5h.A0R || 1DL.A07(k5h.requireContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
            A05(k5h);
            return;
        }
        k5h.A0c.sendEmptyMessage(1);
        k5h.A0a = true;
    }

    public static void A09(K5H k5h) {
        ActionButton actionButton = k5h.A0A;
        if (actionButton != null) {
            actionButton.setDisplayedChild(0);
        }
        Handler handler = k5h.A0c;
        handler.removeMessages(1);
        handler.removeMessages(0);
        1Wr r2 = 1Wr.A00;
        if (r2 != null) {
            r2.removeLocationUpdates(k5h.A0B, k5h.A0g);
            r2.cancelSignalPackageRequest(k5h.A0B, k5h.A0i);
        }
        k5h.A0a = false;
    }

    public static void A0A(K5H k5h, List list, boolean z) {
        K9J k9j = k5h.A0E;
        k9j.A03.clear();
        k9j.A04.clear();
        k9j.A01(list);
        if (!list.isEmpty()) {
            k5h.A0E.A02(false);
        }
        if (C51966G9m.A1J(k5h.A0E.A03).isEmpty() && z) {
            K9J k9j2 = k5h.A0E;
            k9j2.A04.add(C62460KgA.NO_RESULTS);
            K9J.A00(k9j2);
        }
        k5h.A0E.notifyDataSetChanged();
    }

    public final void A0C(String str) {
        String str2;
        C22328Xzd A002;
        this.A0M = str;
        A0B(this, TextUtils.isEmpty(str));
        if (TextUtils.isEmpty(this.A0M)) {
            A07(this);
            return;
        }
        String str3 = this.A0M;
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (TextUtils.isEmpty(str3) && (A002 = NearbyVenuesService.A00(this.A02)) != null) {
            A1C.addAll(A002.getItems());
        }
        AnonymousClass9P5 BiX = this.A0I.A06.BiX(str3);
        List list = BiX.A06;
        if (list != null) {
            A1C.addAll(list);
        }
        Integer num = BiX.A01;
        Integer num2 = AnonymousClass05K.A0C;
        if (num != num2 && !TextUtils.isEmpty(this.A0M)) {
            this.A0I.A06(str3);
        }
        if (!A1C.isEmpty()) {
            LET let = this.A0D;
            if (num == num2) {
                str2 = BiX.A04;
            } else {
                str2 = null;
            }
            let.A01(str3, str2, A1C);
            A0A(this, A1C, AnonymousClass7TF.A1W(num, num2));
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

    public final AnonymousClass0wW getSession() {
        return this.A0B;
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
        C238133Ar r0 = this.A0G;
        if (r0 == null) {
            return false;
        }
        return r0.COw();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.1qK, java.lang.Object] */
    public final boolean onBackPressed() {
        if (this.A0S) {
            return false;
        }
        AnonymousClass1Nd.A00(this.A0B).A00(new Object());
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static void A03(K5H k5h) {
        Context context = k5h.getContext();
        if (context == null) {
            return;
        }
        if (new 1Cn(context).A05()) {
            k5h.A0E.A02(true);
        } else if (A0B(k5h, true)) {
            k5h.A02();
        } else if (!1Wr.isLocationEnabled(context)) {
            Handler handler = k5h.A03;
            if (handler != null) {
                handler.removeMessages(2);
                k5h.A03.sendEmptyMessage(2);
            }
        } else {
            A08(k5h);
        }
    }

    public static void A04(K5H k5h) {
        A09(k5h);
        k5h.A02();
        if (k5h.A02 != null) {
            A0B(k5h, false);
            k5h.A0E.A02(false);
            ActionButton actionButton = k5h.A0A;
            if (actionButton != null) {
                actionButton.setDisplayedChild(1);
            }
            Context context = k5h.getContext();
            if (context != null) {
                NearbyVenuesService.A01(context, k5h.A02, k5h.A0B, k5h.A0F, Long.valueOf(k5h.A00));
            }
        }
    }

    public static boolean A0B(K5H k5h, boolean z) {
        boolean z2;
        Context context = k5h.getContext();
        if (!z || context == null || (1Wr.isLocationEnabled(context) && 1DL.A07(context, "android.permission.ACCESS_COARSE_LOCATION"))) {
            z2 = false;
        } else {
            z2 = true;
        }
        K9J k9j = k5h.A0E;
        if (!(z2 == k9j.A01 || k9j.A02 == null)) {
            k9j.A01 = z2;
            if (z2) {
                k9j.A00 = false;
            }
            K9J.A00(k9j);
        }
        return z2;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARNING: type inference failed for: r12v1, types: [java.lang.Object, X.0JR] */
    public final void onCreate(Bundle bundle) {
        Integer num;
        boolean A072;
        int i;
        int A022 = AnonymousClass0fD.A02(-1803419564);
        Bundle bundle2 = bundle;
        K5H.super.onCreate(bundle2);
        this.A0B = DbX.A0U(this);
        setModuleNameV2(C273654mx.A00(164));
        this.A0V = requireArguments().getBoolean("showTitleBar", true);
        this.A0Z = requireArguments().getBoolean("hideActionBar", false);
        this.A0O = requireArguments().getBoolean("auto_focus_search_field", true);
        this.A0U = requireArguments().getBoolean("show_place_icons", false);
        this.A0T = requireArguments().getBoolean("showCollapsedLocationBar", false);
        if (bundle != null) {
            this.A0M = bundle2.getString("currentSearch");
            this.A0R = bundle2.getBoolean("locationPermissionRequested");
            this.A02 = (Location) bundle2.getParcelable("currentLocation");
            this.A0a = bundle2.getBoolean("locationUpdatesRequested", false);
        }
        this.A0H = new AnonymousClass4O6(this, this.A0B);
        String string = requireArguments().getString(AnonymousClass000.A00(450));
        string.getClass();
        if (string.equals("STORY")) {
            num = AnonymousClass05K.A00;
        } else if (string.equals("POST")) {
            num = AnonymousClass05K.A01;
        } else if (string.equals("POST_SKITTLES")) {
            num = AnonymousClass05K.A0C;
        } else if (string.equals("EDIT_POST")) {
            num = AnonymousClass05K.A0N;
        } else if (string.equals("CLIPS")) {
            num = AnonymousClass05K.A0Y;
        } else if (string.equals("EVENT")) {
            num = AnonymousClass05K.A0j;
        } else if (string.equals("NOTES")) {
            num = AnonymousClass05K.A0u;
        } else if (string.equals(AnonymousClass000.A00(2348))) {
            num = AnonymousClass05K.A15;
        } else {
            throw AnonymousClass7TE.A0w(string);
        }
        this.A0K = num;
        this.A0b = requireArguments().getBoolean(AnonymousClass000.A00(2310));
        this.A0N = requireArguments().getBoolean("INTENT_EXTRA_ALLOW_CUSTOM_LOCATION", false);
        if (requireArguments().getBoolean("INTENT_EXTRA_IS_BOTTOM_SHEET_VARIANT", false)) {
            this.A0Z = true;
        }
        this.A0L = requireArguments().getString("INTENT_EXTRA_CLIPS_SESSION_ID_TO_UPDATE_PUBLISH_SCREEN");
        UserSession userSession = this.A0B;
        if (182.A06(DbS.A0J(userSession, 0), userSession, 36318041593354025L)) {
            AnonymousClass4OA r7 = AnonymousClass4OA.LOCATION_IMPRECISE;
            List A1I = AnonymousClass7TE.A1I(AnonymousClass4O8.UNKNOWN);
            A072 = AnonymousClass7TF.A1W(VFP.A00(this.A0B).A00(requireActivity(), r7, A01(this).name(), A1I), AnonymousClass4OB.GRANTED);
        } else {
            A072 = 1DL.A07(requireContext(), "android.permission.ACCESS_COARSE_LOCATION");
            UserSession userSession2 = this.A0B;
            if (A072) {
                i = 2617;
            } else {
                i = 2616;
            }
            String A002 = AnonymousClass000.A00(i);
            AnonymousClass4O6 r6 = this.A0H;
            Long A003 = AnonymousClass4O7.A00(userSession2);
            List A1I2 = AnonymousClass7TE.A1I(AnonymousClass4O8.UNKNOWN);
            r6.A00(new AnonymousClass9JF(AnonymousClass4O9.LOCATION_FOREGROUND, AnonymousClass4OA.LOCATION_IMPRECISE), A003, A002, A01(this).name(), (String) null, A1I2);
        }
        UserSession userSession3 = this.A0B;
        Integer num2 = this.A0K;
        AnonymousClass7TF.A1B(userSession3, 0, num2);
        KNN knn = new KNN(new Object(), this, userSession3, num2, C51969G9p.A1a(num2, AnonymousClass05K.A15));
        knn.A00 = Boolean.valueOf(A072);
        this.A0D = knn;
        knn.A03();
        this.A00 = requireArguments().getLong("INTENT_EXTRA_TIMESTAMP");
        this.A0S = requireArguments().getBoolean(AnonymousClass000.A00(2311), false);
        this.A0P = requireArguments().getBoolean(AnonymousClass000.A00(958), false);
        this.A0X = C64698LgT.A00(this, 42);
        AnonymousClass1Nd.A00(this.A0B).A01(this.A0X, C64677Lg3.class);
        HandlerThread handlerThread = new HandlerThread(AnonymousClass000.A00(2284));
        AnonymousClass0fe.A00(handlerThread);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        looper.getClass();
        C60011JdK jdK = new C60011JdK(looper, this);
        this.A03 = jdK;
        jdK.sendEmptyMessage(1);
        this.A03.sendEmptyMessage(1);
        AnonymousClass0fD.A09(-1600087873, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        View requireViewById;
        G6X g6x;
        G6X g6x2;
        String str;
        int A022 = AnonymousClass0fD.A02(-1406295816);
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (this.A0V) {
            inflate = layoutInflater2.inflate(R.layout.fragment_nearby_venues, viewGroup2, false);
            requireViewById = DbY.A0F(inflate, R.id.list_view_stub);
        } else {
            inflate = layoutInflater2.inflate(R.layout.layout_listview, viewGroup2, false);
            requireViewById = inflate.requireViewById(16908298);
        }
        this.A0G = C238103Ao.A00((ViewGroup) requireViewById);
        int A023 = DbZ.A02(this);
        this.A0G.CEd().setPadding(0, A023, 0, A023);
        this.A0G.CEd().setClipToPadding(false);
        this.A0G.CEd().setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        this.A0G.AHq();
        this.A0G.AAD(new C47918EMo(this, 0));
        UserSession userSession = this.A0B;
        G6X g6x3 = null;
        Integer num = AnonymousClass05K.A0C;
        AnonymousClass7g1 r13 = new AnonymousClass7g1();
        G9d g9d = this.A0j;
        0qQ.A0B(g9d, 0);
        this.A0I = C14225Ts5.A01(userSession, this, (C337247fx) null, g9d, r13, num, false);
        if (this.A0V) {
            g6x = this.A0m;
            long j = AnonymousClass7TE.A0q(this.A0B).getLong("ls_upell_return_time_in_sec", -1);
            if (requireArguments().getParcelable("INTENT_EXTRA_PHOTO_LOCATION") == null && AnonymousClass7TG.A0I() > j) {
                g6x2 = this.A0l;
            }
            g6x2 = null;
        } else {
            g6x = null;
            g6x2 = null;
        }
        if (this.A0V) {
            g6x3 = this.A0k;
        }
        K9J k9j = new K9J(this, g6x, g6x2, g6x3, this.A0T);
        this.A0E = k9j;
        k9j.setHasStableIds(true);
        this.A0G.ENw(this.A0E);
        if (this.A0V || this.A0T) {
            View inflate2 = layoutInflater2.inflate(R.layout.row_search_venue_edit, this.A0G.CEd(), false);
            this.A08 = inflate2;
            inflate2.getClass();
            SearchEditText searchEditText = (SearchEditText) inflate2.requireViewById(R.id.row_search_edit_text);
            this.A0J = searchEditText;
            boolean z = this.A0T;
            Resources A052 = DbV.A05(this);
            if (z) {
                searchEditText.setHint(A052.getString(2131972825));
                if (AnonymousClass1GD.A03()) {
                    this.A0J.setBackgroundResource(R.drawable.searchbar_on_media_background);
                }
            } else {
                searchEditText.setHint(A052.getString(2131962454));
            }
            SearchEditText searchEditText2 = this.A0J;
            searchEditText2.A0C = new C51004Fmr(this, 1);
            searchEditText2.A0B = new C65797Lzp(this, 1);
            ColorFilter A002 = AnonymousClass37O.A00(requireContext().getColor(R.color.grey_5));
            this.A0J.setClearButtonColorFilter(A002);
            this.A0J.getCompoundDrawablesRelative()[0].mutate().setColorFilter(A002);
            this.A0J.addTextChangedListener(AnonymousClass4v0.A00(this.A0B));
            this.A09 = DbU.A0D(this.A08, R.id.placeholder_stub);
            View view = this.A08;
            view.getClass();
            IgTextView A0a2 = DbT.A0a(view, R.id.custom_location_label);
            this.A0C = A0a2;
            if (this.A0N && A0a2 != null) {
                AnonymousClass0fU.A00(new LYF(this, 1), A0a2);
            }
            View inflate3 = layoutInflater2.inflate(R.layout.location_upsell, this.A0G.CEd(), false);
            this.A05 = inflate3;
            if (inflate3 != null) {
                Context context = getContext();
                if (context != null) {
                    if (DbY.A1Y(0Tu.A05, this.A0B, 36318041593812784L)) {
                        String string = requireActivity().getString(2131965651);
                        String string2 = requireActivity().getString(2131965650);
                        String A0u = DbV.A0u(requireActivity(), string, string2, 2131965652);
                        C46678Dj7 dj7 = new C46678Dj7(0cp.A03("https://www.facebook.com/privacy/guide/location/"));
                        SpannableStringBuilder A0C2 = DbS.A0C(A0u);
                        AnonymousClass7AV.A05(A0C2, dj7, string2);
                        A0C2.setSpan(new ForegroundColorSpan(AnonymousClass7TF.A03(context, R.attr.igds_color_link)), A0C2.getSpanStart(dj7), A0C2.getSpanEnd(dj7), 0);
                        DbX.A1G(DbU.A0G(this.A05, R.id.ls_upsell_subtitle), A0C2);
                    }
                }
                LYG.A02(this.A05.requireViewById(R.id.ls_action_button), 35, context, this);
                AnonymousClass0fU.A00(new LYF(this, 2), this.A05.requireViewById(R.id.ls_upsell_close_button));
            }
            View inflate4 = layoutInflater2.inflate(R.layout.fetch_location_failure, this.A0G.CEd(), false);
            this.A04 = inflate4;
            if (inflate4 != null) {
                DbU.A1A(DbV.A05(this), DbU.A0G(inflate4, R.id.ls_error_title), 2131965647);
                DbU.A1A(DbV.A05(this), DbU.A0G(this.A04, R.id.ls_error_body), 2131965645);
                TextView A0G2 = DbU.A0G(this.A04, R.id.ls_error_retry);
                DbU.A1A(DbV.A05(this), A0G2, 2131965646);
                LYB.A00(A0G2, 69, this);
            }
            if (this.A0Z) {
                DbT.A1F(inflate, R.id.nearby_venues_action_bar, 8);
                DbT.A1F(inflate, R.id.action_bar_shadow, 8);
                0nA.A0e(this.A0G.CEd(), 0);
                if (this.A0T) {
                    DbT.A1F(this.A08, R.id.collapsed_bar_action_button, 0);
                    DbT.A1F(this.A08, R.id.cancel_button, 0);
                    ActionButton requireViewById2 = this.A08.requireViewById(R.id.collapsed_bar_action_button);
                    this.A0A = requireViewById2;
                    requireViewById2.setButtonDrawable(requireContext().getDrawable(R.drawable.instagram_location_arrow_pano_filled_24));
                    this.A0A.setColorFilter(AnonymousClass37O.A00(1QE.A04(requireContext())));
                    View requireViewById3 = this.A08.requireViewById(R.id.cancel_button);
                    requireViewById3.setVisibility(0);
                    AnonymousClass0fU.A00(new LYF(this, 3), requireViewById3);
                }
            } else {
                View requireViewById4 = inflate.requireViewById(R.id.action_bar_button_back);
                requireViewById4.setBackground(new AnonymousClass37N(requireActivity().getTheme(), AnonymousClass05K.A00));
                AnonymousClass0fU.A00(new LYF(this, 4), requireViewById4);
                ActionButton requireViewById5 = inflate.requireViewById(R.id.action_bar_button_action);
                this.A0A = requireViewById5;
                requireViewById5.setBackgroundResource(2Yu.A0H(requireContext(), R.attr.actionBarBackground));
                this.A0A.setColorFilter(AnonymousClass37O.A00(1QE.A04(requireContext())));
            }
            SearchEditText searchEditText3 = this.A0J;
            if (!(searchEditText3 == null || (str = this.A0M) == null)) {
                searchEditText3.setText(str);
            }
        }
        View requireViewById6 = inflate.requireViewById(R.id.remove_location);
        this.A07 = requireViewById6;
        if (this.A0b) {
            requireViewById6.setVisibility(0);
            LYB.A00(this.A07, 70, this);
        } else {
            requireViewById6.setVisibility(8);
        }
        this.A0Y = AnonymousClass3E4.A01(this, false, false);
        02m.A0p.markerEnd(31789744, 2);
        AnonymousClass0fD.A09(935057087, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(247733685);
        super.onDestroy();
        AnonymousClass1Nd.A00(this.A0B).A02(this.A0X, C64677Lg3.class);
        C14221Ts1 ts1 = this.A0I;
        if (ts1 != null) {
            ts1.onDestroy();
        }
        A09(this);
        if (this.A0n != null) {
            unregisterLifecycleListener(this.A0n);
        }
        Handler handler = this.A03;
        if (handler != null) {
            ((HandlerThread) handler.getLooper().getThread()).quit();
        }
        AnonymousClass0fD.A09(1323687091, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-783611411);
        super.onDestroyView();
        this.A0I.onDestroyView();
        if (this.A0J != null) {
            this.A0J.removeTextChangedListener(AnonymousClass4v0.A00(this.A0B));
        }
        this.A0G = null;
        this.A0A = null;
        this.A0J = null;
        this.A09 = null;
        this.A06 = null;
        this.A05 = null;
        this.A04 = null;
        this.A07 = null;
        this.A0C = null;
        AnonymousClass0fD.A09(770666638, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1485329869);
        K5H.super.onPause();
        Dialog dialog = this.A01;
        if (dialog != null && dialog.isShowing()) {
            this.A01.dismiss();
        }
        A09(this);
        View view = this.mView;
        if (view != null) {
            0nA.A0N(view);
        }
        Window A0G2 = DbV.A0G(this);
        A0G2.getClass();
        A0G2.setSoftInputMode(3);
        ActionButton actionButton = this.A0A;
        if (actionButton != null) {
            actionButton.setOnClickListener((View.OnClickListener) null);
        }
        this.A0c.removeCallbacksAndMessages((Object) null);
        AnonymousClass0fD.A09(-475167020, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1173944237);
        super.onResume();
        Location location = (Location) requireArguments().getParcelable("INTENT_EXTRA_PHOTO_LOCATION");
        this.A02 = location;
        if (location == null) {
            if (this.A0V && !this.A0T) {
                View view = this.A06;
                if (view == null) {
                    ViewStub viewStub = this.A09;
                    viewStub.getClass();
                    view = viewStub.inflate();
                    this.A06 = view;
                }
                AnonymousClass0fU.A00(new LYF(this, 0), view);
                int A023 = JTQ.A02(this.A0J);
                IgTextView igTextView = this.A0C;
                if (igTextView != null) {
                    igTextView.setVisibility(A023);
                }
                DbU.A0G(this.A06, R.id.placeholder_text).getCompoundDrawablesRelative()[0].mutate().setColorFilter(AnonymousClass37O.A00(requireContext().getColor(R.color.grey_5)));
                this.A06.setVisibility(0);
            }
            A03(this);
        } else {
            A02();
            SearchEditText searchEditText = this.A0J;
            if (searchEditText != null) {
                String A0f2 = AnonymousClass7TF.A0f(searchEditText);
                String str = this.A0M;
                if (!A0f2.equals(str) && str != null) {
                    this.A0J.setText(str);
                    this.A0J.setSelection(this.A0M.length());
                }
            }
        }
        ActionButton actionButton = this.A0A;
        if (actionButton != null) {
            AnonymousClass0fU.A00(new LYF(this, 5), actionButton);
        }
        if ((getActivity() instanceof C249453jo) && !2db.A09()) {
            this.A0c.post(new M3O(this));
        }
        if (this.A0a) {
            A08(this);
        } else {
            SearchEditText searchEditText2 = this.A0J;
            if (searchEditText2 != null) {
                A0C(searchEditText2.getSearchString());
            }
        }
        AnonymousClass0fD.A09(-394353951, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("currentSearch", this.A0M);
        bundle.putBoolean("locationPermissionRequested", this.A0R);
        bundle.putParcelable("currentLocation", this.A02);
        bundle.putBoolean("locationUpdatesRequested", this.A0a);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(32510075);
        K5H.super.onStart();
        this.A0Y.DmJ(getRootActivity());
        this.A0Y.A9Y(this.A0f);
        AnonymousClass0fD.A09(1951015446, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1959372310);
        K5H.super.onStop();
        this.A0Y.EEH(this.A0f);
        this.A0Y.onStop();
        AnonymousClass0fD.A09(97831324, A022);
    }
}
