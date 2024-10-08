package X;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.MapBottomSheetController;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import java.util.List;

/* renamed from: X.WPk  reason: case insensitive filesystem */
public final class C19204WPk implements AnonymousClass0iw, C273424mY, C20996X8t {
    public static final String __redex_internal_original_name = "MapChromeController";
    public long A00;
    public ViewTreeObserver.OnPreDrawListener A01;
    public U1A A02;
    public AnonymousClass4O6 A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Activity A08;
    public final Handler A09 = AnonymousClass7TF.A0D();
    public final View A0A;
    public final View A0B;
    public final View A0C;
    public final FrameLayout A0D;
    public final FrameLayout A0E;
    public final ImageView A0F;
    public final ImageView A0G;
    public final UserSession A0H;
    public final WJk A0I;
    public final MapBottomSheetController A0J;
    public final MediaMapFragment A0K;
    public final C267874cM A0L = new C19424WYr(this, 1);
    public final C66494MTx A0M = new C19425WYu(this, 1);
    public final C18663VwL A0N;
    public final C18623VvG A0O;
    public final Runnable A0P = new C20016Wjc(this);
    public final boolean A0Q;
    public final 2cs A0R;
    public final T6B A0S;

    public final boolean A07() {
        boolean A072;
        int i;
        UserSession userSession = this.A0H;
        if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36318041593354025L)) {
            A072 = VFP.A00(userSession).A00(this.A08, AnonymousClass4OA.LOCATION_PRECISE, "DISCOVERY_MAP", AnonymousClass7TE.A1I(AnonymousClass4O8.UNKNOWN)).A01;
        } else {
            Activity activity = this.A08;
            A072 = 1DL.A07(activity, "android.permission.ACCESS_FINE_LOCATION");
            AnonymousClass4O6 A002 = A00(activity, userSession, this);
            Long A003 = AnonymousClass4O7.A00(userSession);
            if (A072) {
                i = 2617;
            } else {
                i = 2616;
            }
            A002.A00(new AnonymousClass9JF(AnonymousClass4O9.LOCATION_FOREGROUND, AnonymousClass4OA.LOCATION_PRECISE), A003, AnonymousClass000.A00(i), "DISCOVERY_MAP", (String) null, AnonymousClass7TE.A1I(AnonymousClass4O8.UNKNOWN));
        }
        if (!A072) {
            return false;
        }
        this.A04 = true;
        this.A07 = true;
        Location A004 = this.A0S.A00(__redex_internal_original_name);
        if (A004 == null) {
            return true;
        }
        A06(A004);
        return true;
    }

    public final void Cyk(MapBottomSheetController mapBottomSheetController) {
    }

    public final void Cym(MapBottomSheetController mapBottomSheetController) {
    }

    public final void Cyq(MapBottomSheetController mapBottomSheetController, float f) {
    }

    public final void Cyr(MapBottomSheetController mapBottomSheetController) {
    }

    public final boolean DAA(C317396nC r2, float f, float f2) {
        return true;
    }

    public final void DAS(C317396nC r1, float f, float f2, float f3, boolean z) {
    }

    public final void DAZ(C317396nC r2, float f, float f2, float f3, float f4, float f5) {
        if (f5 < 0.0f) {
            this.A0K.A0G();
        }
    }

    public final boolean DAg(C317396nC r2, float f, float f2, float f3, float f4, boolean z) {
        return true;
    }

    public final void DvA(C317396nC r1) {
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public static AnonymousClass4O6 A00(Activity activity, UserSession userSession, C19204WPk wPk) {
        AnonymousClass4O6 r0 = wPk.A03;
        if (r0 == null) {
            if (activity instanceof AnonymousClass0iw) {
                r0 = new AnonymousClass4O6((AnonymousClass0iw) activity, userSession);
            } else {
                r0 = new AnonymousClass4O6(wPk, userSession);
            }
            wPk.A03 = r0;
        }
        return r0;
    }

    public static void A02(C19204WPk wPk) {
        float translationY;
        if (wPk.A0C.getVisibility() == 0) {
            MapBottomSheetController mapBottomSheetController = wPk.A0J;
            View view = mapBottomSheetController.mBottomSheet;
            if (view == null) {
                translationY = 0.0f;
            } else {
                translationY = view.getTranslationY() + ((float) mapBottomSheetController.A00);
            }
            ImageView imageView = wPk.A0G;
            imageView.setTranslationY(0mi.A00(translationY - ((float) imageView.getHeight()), (float) 2db.A01(wPk.A08), ((float) (wPk.A0E.getHeight() / 2)) - C13988Tno.A01(imageView.getHeight())));
        }
    }

    public final void A03() {
        Activity activity = this.A08;
        Window window = activity.getWindow();
        window.getClass();
        window.addFlags(AnonymousClass972.MUTABLE_FLAG_MASK);
        window.setStatusBarColor(0);
        window.getDecorView().setSystemUiVisibility(1280);
        AnonymousClass2uJ.A06(activity, true);
        2db.A06(activity, true);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final void A04() {
        WJk wJk = this.A0I;
        wJk.A00.setVisibility(8);
        View view = wJk.A02;
        ? A0a = DbX.A0a(view, R.id.right_image);
        wJk.A00 = A0a;
        A0a.setVisibility(0);
        wJk.A00.setVisibility(0);
        DbU.A13(wJk.A03.getContext(), wJk.A00, R.drawable.instagram_chevron_right_pano_outline_12);
        wJk.A05.setText(2131956210);
        WB8.A00(view, 64, this);
        wJk.A04.A03();
    }

    public final void A05() {
        if (!this.A06 && 1DL.A07(this.A08, "android.permission.ACCESS_FINE_LOCATION")) {
            this.A0N.A08();
            this.A06 = true;
        }
    }

    public final void A06(Location location) {
        C18663VwL vwL = this.A0N;
        vwL.A04.invalidate();
        if (!this.A06) {
            A05();
        }
        if (this.A07) {
            vwL.A0B(location.getLatitude(), location.getLongitude(), 15.0f);
            if (this.A04) {
                this.A0K.A0F();
                this.A04 = false;
            }
            this.A07 = false;
        }
    }

    public final void Cyp(MapBottomSheetController mapBottomSheetController, float f, float f2, float f3, float f4) {
        double d;
        2cs r2 = this.A0R;
        if (f2 == 1.0f) {
            d = 1.0d;
        } else {
            d = 0.0d;
        }
        r2.A06(d);
        A02(this);
        U1A u1a = this.A02;
        if (u1a != null) {
            u1a.A09 = true;
            U1A.A05(u1a);
        }
    }

    public final boolean DlG(C317396nC r2, float f, float f2) {
        this.A0K.A0G();
        return true;
    }

    public C19204WPk(Activity activity, ViewGroup viewGroup, UserSession userSession, T6B t6b, MapBottomSheetController mapBottomSheetController, MediaMapFragment mediaMapFragment, C18663VwL vwL) {
        this.A08 = activity;
        this.A0H = userSession;
        this.A0E = (FrameLayout) viewGroup.requireViewById(R.id.map_container);
        this.A0J = mapBottomSheetController;
        this.A0S = t6b;
        this.A0N = vwL;
        FrameLayout frameLayout = (FrameLayout) viewGroup.requireViewById(R.id.controls_container);
        this.A0D = frameLayout;
        this.A0C = viewGroup.requireViewById(R.id.missing_location_chrome_container);
        this.A0G = DbU.A0F(viewGroup, R.id.map_missing_location_annotation);
        this.A0F = DbU.A0F(viewGroup, R.id.map_blur_overlay);
        viewGroup.requireViewById(R.id.swipe_region).setOnTouchListener(new C18899WBr(6, this, new C317396nC(activity, this)));
        this.A0A = viewGroup.requireViewById(R.id.dimming_layer);
        2cs A022 = 2cp.A00().A02();
        A022.A06 = true;
        this.A0R = A022;
        A022.A0A(new C15165UTq(this, 1));
        this.A0K = mediaMapFragment;
        this.A0Q = 1DL.A05(activity, "android.permission.ACCESS_FINE_LOCATION");
        this.A0O = new C18623VvG(new WB8((Object) this, 66), frameLayout, 48);
        ImageView A0F2 = DbU.A0F(frameLayout, R.id.current_location_button);
        A0F2.setImageDrawable(new C52794Gcl(activity, activity.getDrawable(R.drawable.instagram_location_arrow_pano_outline_24)));
        WB8.A00(A0F2, 67, this);
        ImageView A0F3 = DbU.A0F(frameLayout, R.id.modal_close_button);
        A0F3.setImageDrawable(new C52794Gcl(activity, activity.getDrawable(R.drawable.instagram_arrow_left_pano_outline_24)));
        WB8.A00(A0F3, 68, this);
        View requireViewById = viewGroup.requireViewById(R.id.info_button);
        this.A0B = requireViewById;
        WB8.A00(requireViewById, 69, this);
        this.A0I = new WJk((FrameLayout) viewGroup.requireViewById(R.id.overlay_controls_container));
        mapBottomSheetController.A05.add(this);
        A03();
    }

    public static void A01(Activity activity, UserSession userSession, C19204WPk wPk, String str) {
        Integer num;
        wPk.A03 = A00(activity, userSession, wPk);
        Context applicationContext = activity.getApplicationContext();
        0qQ.A0B(applicationContext, 0);
        if (C61970qY.A0E(applicationContext)) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        AnonymousClass4O6 r3 = wPk.A03;
        Long A002 = AnonymousClass4O7.A00(wPk.A0H);
        List A1I = AnonymousClass7TE.A1I(AnonymousClass4O8.UNKNOWN);
        AnonymousClass9JF r4 = new AnonymousClass9JF(AnonymousClass4O9.LOCATION_FOREGROUND, AnonymousClass4OA.LOCATION_PRECISE);
        r4.A00(num);
        r3.A00(r4, A002, str, "DISCOVERY_MAP", (String) null, A1I);
    }
}
