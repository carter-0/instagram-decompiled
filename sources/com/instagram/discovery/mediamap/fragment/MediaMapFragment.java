package com.instagram.discovery.mediamap.fragment;

import X.002;
import X.0Tu;
import X.0hq;
import X.0mi;
import X.0qQ;
import X.0s1;
import X.182;
import X.1Ln;
import X.1wn;
import X.2PP;
import X.2db;
import X.2el;
import X.Af2;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass1GD;
import X.AnonymousClass1Nd;
import X.AnonymousClass32A;
import X.AnonymousClass3BQ;
import X.AnonymousClass3DZ;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass4M3;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7g1;
import X.C13988Tno;
import X.C13990Tnq;
import X.C13991Tnr;
import X.C14290TtO;
import X.C14633Tzf;
import X.C14955UGt;
import X.C14956UGu;
import X.C15293UZz;
import X.C15681Ugm;
import X.C15939Ul6;
import X.C16076Uo3;
import X.C16077Uo4;
import X.C16079Uo6;
import X.C16157Upi;
import X.C16614UyA;
import X.C17146VJy;
import X.C17367VSu;
import X.C17368VSv;
import X.C17523VZc;
import X.C17626VbI;
import X.C17669Vc0;
import X.C17855Vh8;
import X.C17896Vhn;
import X.C18016Vjs;
import X.C18062Vko;
import X.C18072Vl0;
import X.C18231Vnv;
import X.C18623VvG;
import X.C18642Vvi;
import X.C18657VwC;
import X.C18663VwL;
import X.C18682Vwg;
import X.C18747Vzh;
import X.C18780W1f;
import X.C19204WPk;
import X.C19221WQb;
import X.C19305WTn;
import X.C19843WgO;
import X.C19879Wh8;
import X.C20017Wjd;
import X.C20901X3s;
import X.C20902X3t;
import X.C20903X3u;
import X.C20944X5n;
import X.C20958X6l;
import X.C20975X7o;
import X.C20996X8t;
import X.C228602lw;
import X.C250563lf;
import X.C2593341h;
import X.C267324bN;
import X.C270634h3;
import X.C276014sL;
import X.C295325ny;
import X.C46498Dg1;
import X.C49945FFy;
import X.C66579MXk;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbY;
import X.F3W;
import X.FPF;
import X.FPH;
import X.IVD;
import X.T6B;
import X.U0Z;
import X.U1A;
import X.VN6;
import X.VN8;
import X.W3Q;
import X.WB4;
import X.WB8;
import X.WBX;
import X.WCG;
import X.WGR;
import X.WQB;
import X.WUF;
import X.X8V;
import X.X8W;
import X.X8X;
import X.XCL;
import android.app.Activity;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.android.maps.model.LatLng;
import com.facebook.maps.ttrc.common.MapboxTTRC;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.bottomsheetbehavior.MapBottomSheetBehavior;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.discovery.mediamap.model.MediaMapPinPreview;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MediaMapFragment extends AnonymousClass4DH implements AnonymousClass4DR, C20996X8t, C20975X7o, X8V, X8W, X8X, C20903X3u, C20958X6l, C20902X3t {
    public static final float[] A0i = {0.0f, 0.0f};
    public int A00;
    public int A01;
    public UserSession A02;
    public T6B A03;
    public C19305WTn A04;
    public C17896Vhn A05;
    public C18657VwC A06;
    public C17626VbI A07;
    public C20903X3u A08;
    public C18062Vko A09;
    public MapBottomSheetController A0A;
    public C18780W1f A0B;
    public C18642Vvi A0C;
    public WGR A0D;
    public MediaMapQuery A0E;
    public W3Q A0F;
    public WUF A0G;
    public MediaMapPin A0H;
    public MediaMapPinPreview A0I;
    public AnonymousClass32A A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public long A0O;
    public LatLng A0P;
    public LatLng A0Q;
    public LatLng A0R;
    public LatLng A0S;
    public C228602lw A0T;
    public 2el A0U;
    public MapEntryPoint A0V;
    public MediaMapPin A0W;
    public C17368VSv A0X;
    public String A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public final Rect A0d = new Rect();
    public final VN8 A0e = new Object();
    public final AnonymousClass7g1 A0f = new AnonymousClass7g1();
    public final String A0g = AnonymousClass7TF.A0b();
    public final 1wn A0h = new C19221WQb(this, 20);
    public C19843WgO mClipsVideoPlayerManager;
    public C19204WPk mMapChromeController;
    public ViewGroup mMapContainer;
    public C18663VwL mMapViewController;

    public final void Cyr(MapBottomSheetController mapBottomSheetController) {
        this.A0K = false;
    }

    public final void D0D(LatLng latLng, boolean z) {
    }

    public final String getModuleName() {
        return "discovery_map";
    }

    public static ArrayList A01(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            MediaMapPin mediaMapPin = (MediaMapPin) it.next();
            arrayList.add(new C17367VSu(mediaMapPin.A0A.doubleValue(), mediaMapPin.A0B.doubleValue()));
        }
        return arrayList;
    }

    public static LinkedHashSet A02(MediaMapFragment mediaMapFragment) {
        ArrayList A002 = mediaMapFragment.A06.A02(mediaMapFragment.A0E).A00(mediaMapFragment.A09);
        ArrayList A003 = mediaMapFragment.A06.A02(MediaMapQuery.A09).A00(mediaMapFragment.A09);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(A002);
        linkedHashSet.addAll(A003);
        return linkedHashSet;
    }

    private void A03() {
        C16614UyA uyA = C16614UyA.PLACE;
        MediaMapQuery mediaMapQuery = this.A0E;
        MediaMapQuery mediaMapQuery2 = new MediaMapQuery(uyA, mediaMapQuery.A07, mediaMapQuery.A01);
        C18657VwC vwC = this.A06;
        vwC.A05(mediaMapQuery2, C13991Tnr.A0R(this), 0, new ArrayList(vwC.A02(mediaMapQuery).A00(this.A09)), (List) null);
        this.A0E = mediaMapQuery2;
        A07(this);
        A0A(this, false);
    }

    private void A04() {
        C17523VZc A032;
        C18663VwL vwL = this.mMapViewController;
        if (vwL != null && (A032 = vwL.A03()) != null && this.A0E.A06 == C16614UyA.POPULAR) {
            this.A04.A06.A01(A032);
        }
    }

    public static void A05(RectF rectF, MediaMapFragment mediaMapFragment, MediaMapPin mediaMapPin, U0Z u0z) {
        Reel reel;
        C267324bN r0;
        GradientSpinner gradientSpinner = null;
        if (AnonymousClass7TF.A1V(mediaMapPin.A08)) {
            C17896Vhn vhn = mediaMapFragment.A05;
            String A012 = C18231Vnv.A01(mediaMapPin);
            0qQ.A0B(A012, 0);
            reel = (Reel) vhn.A03.get(A012);
        } else {
            reel = null;
        }
        if (u0z != null && (u0z instanceof C16079Uo6)) {
            gradientSpinner = ((C16079Uo6) u0z).A0R;
        }
        C276014sL r02 = mediaMapPin.A03;
        if (r02 != null) {
            C295325ny.A02(r02);
            if (mediaMapFragment.mClipsVideoPlayerManager != null) {
                UserSession userSession = mediaMapFragment.A02;
                FragmentActivity requireActivity = mediaMapFragment.requireActivity();
                C270634h3 r2 = new C270634h3(ClipsViewerSource.LOCATION, mediaMapFragment.A02);
                r2.A1B = C18231Vnv.A01(mediaMapPin);
                C276014sL r03 = mediaMapPin.A03;
                if (r03 != null) {
                    r0 = C295325ny.A02(r03);
                } else {
                    r0 = null;
                }
                r0.getClass();
                r2.A1C = r0.getId();
                r2.A1c = false;
                r2.A05 = mediaMapFragment.mClipsVideoPlayerManager.A00(C18231Vnv.A01(mediaMapPin));
                C250563lf.A0Y(requireActivity, r2.A00(), userSession);
            }
        } else if (reel == null || u0z == null || gradientSpinner == null) {
            String str = mediaMapPin.A0D;
            if (str != null) {
                IgFragmentFactoryImpl.A00();
                F3W f3w = new F3W();
                f3w.A0B = str;
                f3w.A0E = 002.A0R("discovery_map", "_single_media");
                f3w.A0N = true;
                DbT.A1L(mediaMapFragment, DbV.A0Y(mediaMapFragment.requireActivity(), f3w.A00(), mediaMapFragment.A02, ModalActivity.class, AnonymousClass000.A00(192)));
            }
        } else {
            RectF rectF2 = new RectF(rectF.centerX(), rectF.centerY(), rectF.centerX(), rectF.centerY());
            mediaMapFragment.A0F.A09(mediaMapFragment.A0E, mediaMapPin, "discovery_map", false);
            AnonymousClass32A r22 = mediaMapFragment.A0J;
            r22.A05 = new C16157Upi(rectF2, mediaMapFragment, gradientSpinner);
            r22.A0C = mediaMapFragment.A0g;
            r22.A03(reel, AnonymousClass3BQ.MAP, new Af2(rectF2, mediaMapFragment, gradientSpinner));
        }
    }

    public static void A06(MediaMapFragment mediaMapFragment) {
        LatLng latLng;
        MediaMapFragment mediaMapFragment2 = mediaMapFragment;
        C18623VvG vvG = mediaMapFragment2.mMapChromeController.A0O;
        vvG.A00 = vvG.A05.getResources().getString(2131972865);
        int intValue = mediaMapFragment2.A00().intValue();
        if (intValue == 3 || intValue == 1) {
            mediaMapFragment2.mMapContainer.setVisibility(0);
        } else if (intValue == 0) {
            mediaMapFragment2.mMapContainer.setVisibility(4);
        } else if (intValue == 2) {
            mediaMapFragment2.mMapContainer.setVisibility(0);
            C19204WPk wPk = mediaMapFragment2.mMapChromeController;
            MediaMapPin mediaMapPin = mediaMapFragment2.A0H;
            mediaMapPin.getClass();
            Location A002 = mediaMapFragment2.A03.A00("MediaMapFragment");
            wPk.A0C.setVisibility(0);
            FrameLayout frameLayout = wPk.A0E;
            frameLayout.setVisibility(0);
            if (A002 != null) {
                latLng = new LatLng(A002.getLatitude(), A002.getLongitude());
            } else {
                latLng = C17146VJy.A00;
            }
            C18663VwL vwL = wPk.A0N;
            vwL.A0B(latLng.A00, latLng.A01, 15.0f);
            C18663VwL.A00(wPk.A0J, vwL);
            Rect rect = new Rect();
            ImageView imageView = wPk.A0F;
            imageView.getWindowVisibleDisplayFrame(rect);
            rect.top = 0;
            C17669Vc0 vc0 = new C17669Vc0(imageView, C19204WPk.__redex_internal_original_name, frameLayout);
            vc0.A00 = 6;
            vc0.A02 = 6;
            vc0.A05 = rect;
            U1A u1a = new U1A(vc0);
            wPk.A02 = u1a;
            imageView.setImageDrawable(u1a);
            WB8.A00(imageView, 65, wPk);
            long currentTimeMillis = System.currentTimeMillis();
            wPk.A00 = System.currentTimeMillis();
            if (wPk.A01 == null) {
                wPk.A01 = new WCG(wPk, currentTimeMillis);
            }
            frameLayout.getViewTreeObserver().addOnPreDrawListener(wPk.A01);
            Activity activity = wPk.A08;
            C16079Uo6 uo6 = new C16079Uo6(activity, (Drawable) null, mediaMapPin.A00(), "media_map", 1.0f, C13988Tno.A09(activity, 104), AnonymousClass7TF.A1V(mediaMapPin.A08), AnonymousClass7TF.A1V(mediaMapPin.A03), C18231Vnv.A00(mediaMapPin.A09).CbC());
            uo6.A0F = false;
            C16079Uo6.A01(uo6);
            ImageView imageView2 = wPk.A0G;
            imageView2.setImageDrawable(uo6);
            WBX.A00(imageView2, 8, wPk);
            WB4.A00(imageView2, wPk, uo6, mediaMapPin, 25);
            C18623VvG vvG2 = mediaMapFragment2.mMapChromeController.A0O;
            vvG2.A00 = vvG2.A05.getResources().getString(2131961879);
            return;
        } else {
            return;
        }
        C19204WPk wPk2 = mediaMapFragment2.mMapChromeController;
        wPk2.A0C.setVisibility(8);
        wPk2.A02 = null;
    }

    public static void A07(MediaMapFragment mediaMapFragment) {
        MediaMapPin mediaMapPin;
        if (mediaMapFragment.A0E != null && mediaMapFragment.mMapViewController != null) {
            mediaMapFragment.A04();
            mediaMapFragment.mMapViewController.A0G(new HashSet(A02(mediaMapFragment)));
            mediaMapFragment.mMapViewController.A09();
            ArrayList A012 = A01(mediaMapFragment.A06.A02(mediaMapFragment.A0E).A00(mediaMapFragment.A09));
            MediaMapQuery mediaMapQuery = mediaMapFragment.A0E;
            if (mediaMapQuery.A06 == C16614UyA.PLACE && mediaMapQuery.A05 && !mediaMapQuery.A04) {
                C17855Vh8 A022 = mediaMapFragment.A06.A02(mediaMapQuery);
                ArrayList A002 = A022.A00(mediaMapFragment.A09);
                C18062Vko vko = mediaMapFragment.A09;
                0qQ.A0B(vko, 0);
                String str = A022.A01;
                if (str == null || (mediaMapPin = (MediaMapPin) vko.A02.get(str)) == null) {
                    if (mediaMapFragment.A0R == null) {
                        int i = mediaMapFragment.A01;
                        mediaMapFragment.mMapViewController.A0F(A012, (float) mediaMapFragment.A00, i, i, 300, false);
                    }
                    mediaMapFragment.A0B.A06((Bundle) null, mediaMapFragment.A0E, false);
                } else {
                    if (new ArrayList(A022.A03).isEmpty()) {
                        A022 = mediaMapFragment.A06.A02(MediaMapQuery.A08);
                    }
                    ArrayList arrayList = new ArrayList(A022.A03);
                    C18657VwC vwC = mediaMapFragment.A06;
                    MediaMapQuery mediaMapQuery2 = MediaMapQuery.A08;
                    vwC.A05(mediaMapQuery2, C13991Tnr.A0R(mediaMapFragment), (Integer) null, A002, arrayList);
                    mediaMapFragment.A0E = mediaMapQuery2;
                    mediaMapFragment.A0B.A05();
                    mediaMapFragment.A06.A04(mediaMapFragment.A0E);
                    mediaMapFragment.mMapViewController.A0B(mediaMapPin.A0A.doubleValue(), mediaMapPin.A0B.doubleValue(), 16.0f);
                    if (mediaMapFragment.A0A.A03()) {
                        C18663VwL.A00(mediaMapFragment.A0A, mediaMapFragment.mMapViewController);
                    }
                    if (mediaMapFragment.A0c) {
                        mediaMapFragment.A0C.A03(C18231Vnv.A01(mediaMapPin));
                    }
                }
                mediaMapFragment.A0R = null;
            }
            MediaMapQuery mediaMapQuery3 = mediaMapFragment.A0E;
            if (mediaMapQuery3.A05) {
                mediaMapQuery3.A04 = true;
            }
        }
    }

    public static void A08(MediaMapFragment mediaMapFragment, C16614UyA uyA, String str, String str2) {
        MediaMapQuery mediaMapQuery = MediaMapQuery.A08;
        if (!2PP.A00(str, "17843767138059124")) {
            if (uyA == C16614UyA.SAVED) {
                mediaMapQuery = MediaMapQuery.A09;
                mediaMapQuery.A01 = str2;
            } else {
                mediaMapQuery = new MediaMapQuery(uyA, str, str2);
            }
        }
        mediaMapFragment.A0E = mediaMapQuery;
        A07(mediaMapFragment);
    }

    public static void A09(MediaMapFragment mediaMapFragment, MediaMapPin mediaMapPin) {
        C18062Vko vko = mediaMapFragment.A09;
        vko.A04.add(C18231Vnv.A01(mediaMapPin));
        mediaMapFragment.A09.A01(mediaMapFragment.A02, mediaMapFragment.A0T, mediaMapFragment.A05, (VN6) null, DbV.A14(C18231Vnv.A01(mediaMapPin)));
    }

    public static void A0A(MediaMapFragment mediaMapFragment, boolean z) {
        Location location;
        C17523VZc A032;
        String str;
        C18657VwC vwC = mediaMapFragment.A06;
        if (vwC.A01 && !vwC.A00) {
            vwC.A03((Location) null, MediaMapQuery.A09, (C17523VZc) null);
        }
        MediaMapQuery mediaMapQuery = mediaMapFragment.A0E;
        if (mediaMapQuery != null) {
            if (mediaMapQuery.A04 && mediaMapQuery.A06 == C16614UyA.PLACE) {
                mediaMapFragment.A0E = MediaMapQuery.A08;
                A07(mediaMapFragment);
                mediaMapFragment.A0B.A05();
            }
            if (DbY.A1Y(0Tu.A05, mediaMapFragment.A02, 36321499040458183L)) {
                location = mediaMapFragment.A03.A00("MediaMapFragment");
            } else {
                location = null;
            }
            C18663VwL vwL = mediaMapFragment.mMapViewController;
            if (vwL != null && (A032 = vwL.A03()) != null) {
                W3Q w3q = mediaMapFragment.A0F;
                MediaMapQuery mediaMapQuery2 = mediaMapFragment.A0E;
                if (z) {
                    str = "instagram_map_query_request_from_user_interaction";
                } else {
                    str = "instagram_map_query_request_automatic";
                }
                1Ln A012 = W3Q.A01(w3q, str);
                C13990Tnq.A12(A012, mediaMapQuery2);
                W3Q.A04(A012, w3q);
                A012.Cgf();
                mediaMapFragment.A06.A03(location, mediaMapFragment.A0E, A032);
            }
        }
    }

    private boolean A0B() {
        MediaMapQuery mediaMapQuery = this.A0E;
        if (mediaMapQuery == null || mediaMapQuery.A06 != C16614UyA.LOCATION_PAGE_TAKEOVER) {
            return false;
        }
        return true;
    }

    public final void A0D() {
        TreeSet A022 = this.A0C.A02();
        WGR wgr = this.A0D;
        MediaMapPin mediaMapPin = (MediaMapPin) A022.iterator().next();
        LocationPageInformation locationPageInformation = mediaMapPin.A06;
        Venue A002 = C18231Vnv.A00(mediaMapPin.A09);
        MediaMapFragment mediaMapFragment = wgr.A02;
        FragmentActivity activity = mediaMapFragment.getActivity();
        if (locationPageInformation != null && mediaMapFragment.isAdded() && activity != null) {
            C46498Dg1 dg1 = new C46498Dg1(activity, wgr.A01.A00);
            dg1.A03 = new IVD(0);
            if (!locationPageInformation.A05.isEmpty()) {
                if (182.A06(0Tu.A05, wgr.A00, 36315713719242228L)) {
                    dg1.A09(C18747Vzh.A00(locationPageInformation, false));
                }
            }
            dg1.A02(new WB4(26, wgr, activity, A002), 2131972171);
            if (!((mediaMapPin.A0A == null || mediaMapPin.A0B == null) && locationPageInformation.A05 == null && locationPageInformation.A07 == null && locationPageInformation.A0B == null)) {
                dg1.A04(new WB4(27, wgr, activity, mediaMapPin), 2131969038);
            }
            dg1.A04(new WB4(28, wgr, activity, locationPageInformation), 2131956744);
            if (C14290TtO.A00(wgr.A00)) {
                dg1.A04(new FPF(1, (Object) wgr, (Object) A002), 2131971010);
            }
            dg1.A04(new FPH(27, (Object) wgr, (Object) locationPageInformation, (Object) A002), 2131973529);
            new C49945FFy(dg1).A05(mediaMapFragment.getContext());
        }
    }

    public final void A0E() {
        String str;
        C18780W1f w1f = this.A0B;
        MediaMapQuery mediaMapQuery = this.A0E;
        if (mediaMapQuery.A06 == C16614UyA.HASHTAG) {
            str = mediaMapQuery.A01;
        } else {
            str = null;
        }
        C15293UZz uZz = new C15293UZz();
        Bundle bundle = new Bundle();
        DbU.A1D(bundle, w1f.A05);
        if (str != null) {
            bundle.putString("arg_hashtag_name", str);
        }
        uZz.setArguments(bundle);
        C18780W1f.A02(w1f);
        0s1 A002 = C18780W1f.A00(uZz, w1f);
        A002.A0I("SEARCH");
        A002.A0J(false);
    }

    public final void A0G() {
        float f;
        C18657VwC vwC = this.A06;
        if (!vwC.A05.contains(this.A0E) || this.A0E.A06 != C16614UyA.PLACE) {
            MapBottomSheetController mapBottomSheetController = this.A0A;
            C15293UZz A032 = this.A0B.A03();
            if (A032 == null || !(A032 instanceof C20901X3s)) {
                f = 0.5f;
            } else {
                f = ((C20901X3s) A032).BbN();
            }
            mapBottomSheetController.mBottomSheetBehavior.A0R(true, f);
        }
    }

    public final void A0H(C15293UZz uZz) {
        Integer num;
        MapBottomSheetBehavior mapBottomSheetBehavior;
        float max;
        String str;
        if (this.A0N) {
            this.A0N = false;
            MapBottomSheetController mapBottomSheetController = this.A0A;
            mapBottomSheetBehavior = mapBottomSheetController.mBottomSheetBehavior;
            max = mapBottomSheetController.A01();
        } else {
            if (uZz instanceof C15939Ul6) {
                num = AnonymousClass05K.A0j;
            } else if (uZz instanceof LocationSearchFragment) {
                num = AnonymousClass05K.A0Y;
            } else if (uZz instanceof LocationListFragment) {
                LocationListFragment locationListFragment = (LocationListFragment) uZz;
                if (locationListFragment.A00 == LocationListFragmentMode.PIN_LIST) {
                    num = AnonymousClass05K.A01;
                } else if (LocationListFragment.A06(locationListFragment)) {
                    num = AnonymousClass05K.A00;
                } else {
                    num = AnonymousClass05K.A0C;
                }
            } else {
                num = AnonymousClass05K.A0N;
            }
            int intValue = num.intValue();
            if (intValue == 0 || intValue == 1 || intValue == 2) {
                MapBottomSheetController mapBottomSheetController2 = this.A0A;
                mapBottomSheetBehavior = mapBottomSheetController2.mBottomSheetBehavior;
                max = Math.max((float) mapBottomSheetBehavior.A0F.A01, mapBottomSheetController2.A02());
            } else if (intValue == 4) {
                mapBottomSheetBehavior = this.A0A.mBottomSheetBehavior;
                max = 1.0f;
            } else if (intValue == 3) {
                String A012 = C18231Vnv.A01(((LocationDetailFragment) uZz).A03);
                MediaMapPin mediaMapPin = this.A0H;
                if (mediaMapPin != null) {
                    str = C18231Vnv.A01(mediaMapPin);
                } else {
                    str = null;
                }
                if (!2PP.A00(A012, str) && !A0B()) {
                    MapBottomSheetController mapBottomSheetController3 = this.A0A;
                    mapBottomSheetBehavior = mapBottomSheetController3.mBottomSheetBehavior;
                    max = mapBottomSheetController3.A02();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        mapBottomSheetBehavior.A0R(true, max);
    }

    public final void A0J(C18072Vl0 vl0) {
        C16614UyA uyA = C16614UyA.PLACE;
        String A052 = vl0.A00().A05();
        0qQ.A07(A052);
        A08(this, uyA, A052, vl0.A01());
        A0A(this, true);
        DbS.A1D(this);
        this.A0A.mBottomSheetBehavior.A0R(true, 0.0f);
    }

    public final void A0K(Map map) {
        String str;
        C18663VwL vwL = this.mMapViewController;
        if (vwL.A00 != null && vwL.A01 != null) {
            Set<MediaMapPin> A072 = vwL.A07();
            HashMap hashMap = new HashMap();
            for (MediaMapPin mediaMapPin : A072) {
                Venue A002 = C18231Vnv.A00(mediaMapPin.A09);
                if (A002.A05() != null) {
                    hashMap.put(A002.A05(), mediaMapPin);
                }
            }
            W3Q w3q = this.A0F;
            MediaMapQuery mediaMapQuery = this.A0E;
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                String A13 = DbT.A13(A1J);
                MediaMapPin mediaMapPin2 = (MediaMapPin) hashMap.get(A13);
                Long l = (Long) A1J.getValue();
                HashSet hashSet = w3q.A06;
                if (hashSet.contains(A13)) {
                    str = "instagram_map_location_pin_sub_impression";
                } else {
                    hashSet.add(A13);
                    str = "instagram_map_location_pin_impression";
                }
                1Ln A012 = W3Q.A01(w3q, str);
                A012.A0R("location_id", A13);
                A012.A0Q("session_duration", l);
                A012.A0R("query_token", mediaMapQuery.A02);
                if (mediaMapPin2 != null) {
                    W3Q.A05(A012, mediaMapPin2);
                    W3Q.A06(A012, mediaMapPin2, false);
                }
                A012.Cgf();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.C14955UGt ALU(X.C19879Wh8 r20, X.XCL r21, X.WFU r22) {
        /*
            r19 = this;
            r0 = r21
            com.instagram.discovery.mediamap.model.MediaMapPin r0 = (com.instagram.discovery.mediamap.model.MediaMapPin) r0
            com.instagram.model.venue.LocationDict r1 = r0.A09
            com.instagram.model.venue.Venue r2 = X.C18231Vnv.A00(r1)
            com.instagram.model.venue.LocationDictIntf r1 = r2.A00
            java.lang.String r1 = r1.getShortName()
            if (r1 == 0) goto L_0x00bc
            com.instagram.model.venue.LocationDictIntf r1 = r2.A00
            java.lang.String r10 = r1.getShortName()
        L_0x0018:
            r7 = r19
            X.Vko r1 = r7.A09
            java.lang.String r2 = X.C18231Vnv.A01(r0)
            java.util.Set r1 = r1.A04
            boolean r4 = r1.contains(r2)
            boolean r1 = r7.A0M
            if (r1 == 0) goto L_0x007a
            r1 = r4 ^ 1
        L_0x002c:
            r6 = 0
            if (r1 == 0) goto L_0x00b4
            r8 = r6
        L_0x0030:
            r3 = 0
            java.lang.String r9 = X.C18231Vnv.A01(r0)
            r4 = r20
            com.facebook.android.maps.model.LatLng r1 = r4.A03()
            double r11 = r1.A00
            com.facebook.android.maps.model.LatLng r1 = r4.A03()
            double r13 = r1.A01
            r5 = r22
            android.content.Context r2 = r5.A0G
            r1 = 64
            X.0nA.A04(r2, r1)
            int r15 = r7.A01
            X.3HX r1 = r0.A08
            boolean r16 = X.AnonymousClass7TF.A1V(r1)
            X.4sL r1 = r0.A03
            boolean r17 = X.AnonymousClass7TF.A1V(r1)
            com.instagram.model.venue.LocationDict r1 = r0.A09
            com.instagram.model.venue.Venue r1 = X.C18231Vnv.A00(r1)
            boolean r18 = r1.CbC()
            X.Uo3 r2 = new X.Uo3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r15, r16, r17, r18)
            X.Vvi r1 = r7.A0C
            com.instagram.discovery.mediamap.model.MediaMapPin r1 = r1.A01()
            boolean r0 = X.2PP.A00(r1, r0)
            if (r0 == 0) goto L_0x0079
            X.VN8 r0 = r7.A0e
            r0.A00 = r2
        L_0x0079:
            return r2
        L_0x007a:
            X.VwC r2 = r7.A06
            com.instagram.discovery.mediamap.intf.MediaMapQuery r1 = r7.A0E
            X.Vh8 r2 = r2.A02(r1)
            X.Vko r1 = r7.A09
            java.util.ArrayList r1 = r2.A00(r1)
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.Iterator r2 = r1.iterator()
        L_0x0091:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x00a5
            java.lang.Object r1 = r2.next()
            com.instagram.discovery.mediamap.model.MediaMapPin r1 = (com.instagram.discovery.mediamap.model.MediaMapPin) r1
            java.lang.String r1 = X.C18231Vnv.A01(r1)
            r3.add(r1)
            goto L_0x0091
        L_0x00a5:
            java.lang.String r1 = X.C18231Vnv.A01(r0)
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L_0x00b4
            if (r4 != 0) goto L_0x00b4
            r1 = 1
            goto L_0x002c
        L_0x00b4:
            java.lang.String r8 = r0.A0D
            com.instagram.common.typedurl.ImageUrl r6 = r0.A00()
            goto L_0x0030
        L_0x00bc:
            com.instagram.model.venue.LocationDictIntf r1 = r2.A00
            java.lang.String r10 = r1.getName()
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.discovery.mediamap.fragment.MediaMapFragment.ALU(X.Wh8, X.XCL, X.WFU):X.UGt");
    }

    public final Map AoR() {
        String str;
        if (this.mMapViewController == null) {
            return Collections.emptyMap();
        }
        TreeSet A022 = this.A0C.A02();
        Set<MediaMapPin> A072 = this.mMapViewController.A07();
        HashMap hashMap = new HashMap();
        for (MediaMapPin mediaMapPin : A072) {
            if (C18231Vnv.A00(mediaMapPin.A09).CbC() && mediaMapPin.A00() == null) {
                str = "saved-cluster";
            } else if (A022.contains(mediaMapPin)) {
                str = "selected-cluster";
            } else {
                str = "default-cluster";
            }
            hashMap.put(mediaMapPin, str);
        }
        return hashMap;
    }

    public final Location Au9(C18016Vjs vjs, String str) {
        return this.A03.A00(002.A0R("MediaMapFragment:", "CurrentLocationDrawable"));
    }

    public final int BOy(C14633Tzf tzf) {
        U0Z u0z;
        if (!(tzf instanceof C16076Uo3) || (u0z = ((C16076Uo3) tzf).A05) == null || !(u0z instanceof C16077Uo4)) {
            return 0;
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ XCL BfZ() {
        return this.A0C.A01();
    }

    public final void Cyk(MapBottomSheetController mapBottomSheetController) {
        MapBottomSheetController mapBottomSheetController2 = this.A0A;
        if (mapBottomSheetController2 != null) {
            this.A0K = mapBottomSheetController2.A03();
        }
    }

    public final void Cym(MapBottomSheetController mapBottomSheetController) {
        MapBottomSheetBehavior mapBottomSheetBehavior;
        float A022;
        C15293UZz A032 = this.A0B.A03();
        if (A0B()) {
            mapBottomSheetBehavior = mapBottomSheetController.mBottomSheetBehavior;
            A022 = mapBottomSheetController.A00();
        } else if (A032 == null) {
            mapBottomSheetBehavior = mapBottomSheetController.mBottomSheetBehavior;
            A022 = mapBottomSheetController.A01();
        } else {
            boolean z = this.A0N;
            MapBottomSheetController mapBottomSheetController2 = this.A0A;
            if (z) {
                mapBottomSheetController2.mBottomSheetBehavior.A0R(true, mapBottomSheetController2.A01());
                this.A0N = false;
                return;
            }
            mapBottomSheetBehavior = mapBottomSheetController2.mBottomSheetBehavior;
            A022 = mapBottomSheetController2.A02();
        }
        mapBottomSheetBehavior.A0R(false, A022);
    }

    public final void Cyp(MapBottomSheetController mapBottomSheetController, float f, float f2, float f3, float f4) {
        boolean z;
        TreeSet A022 = this.A0C.A02();
        float f5 = f4 - f3;
        if (!this.A0K || f > mapBottomSheetController.A00() || ((double) f) < 0.5d) {
            z = false;
        } else {
            this.mMapViewController.A0D(f5);
            z = true;
        }
        C18663VwL vwL = this.mMapViewController;
        if (vwL.A00 != null && vwL.A01 != null && getActivity() != null && !A022.isEmpty()) {
            float A023 = 0mi.A02(f, mapBottomSheetController.A01(), mapBottomSheetController.A02(), 0.0f, 1.0f);
            if (A022.size() != 0 && A022.size() > 1) {
                this.mMapChromeController.A0I.A04.A08((double) A023, true);
            }
            if (!z && ((double) f) <= 0.5d) {
                Iterator it = this.mMapViewController.A06(this.A0C.A02()).iterator();
                while (it.hasNext()) {
                    LatLng Bdm = ((C14633Tzf) it.next()).Bdm();
                    C18663VwL vwL2 = this.mMapViewController;
                    double d = Bdm.A00;
                    double d2 = Bdm.A01;
                    float[] fArr = A0i;
                    vwL2.A0H(fArr, d, d2);
                    if (((fArr[1] - ((float) 2db.A01(requireActivity()))) + C13988Tno.A01(this.A00)) - f3 > 0.0f) {
                        this.mMapViewController.A0D(f5);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        r6 = (com.instagram.discovery.mediamap.fragment.LocationListFragment) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cyq(com.instagram.discovery.mediamap.fragment.MapBottomSheetController r8, float r9) {
        /*
            r7 = this;
            X.VwL r1 = r7.mMapViewController
            if (r1 == 0) goto L_0x007e
            X.VZ8 r0 = r1.A00
            if (r0 == 0) goto L_0x007e
            X.Vjs r0 = r1.A01
            if (r0 == 0) goto L_0x007e
            r0 = 1065353216(0x3f800000, float:1.0)
            r4 = 1
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00b1
            X.W1f r0 = r7.A0B
            X.UZz r6 = r0.A03()
            X.Vvi r0 = r7.A0C
            java.util.TreeSet r5 = r0.A02()
            int r0 = r5.size()
            if (r0 != r4) goto L_0x0091
            java.util.Iterator r0 = r5.iterator()
            java.lang.Object r1 = r0.next()
            com.instagram.discovery.mediamap.model.MediaMapPin r1 = (com.instagram.discovery.mediamap.model.MediaMapPin) r1
            if (r1 == 0) goto L_0x0091
            X.W3Q r3 = r7.A0F
            com.instagram.discovery.mediamap.intf.MediaMapQuery r2 = r7.A0E
            X.VwC r0 = r7.A06
            int r0 = r0.A01(r2, r1)
            long r0 = (long) r0
            r3.A0B(r2, r5, r0)
        L_0x003f:
            X.WgO r2 = r7.mClipsVideoPlayerManager
            if (r2 == 0) goto L_0x0054
            X.4M3 r1 = r2.A05
            if (r1 == 0) goto L_0x0054
            boolean r0 = r1.isPlaying()
            if (r0 == 0) goto L_0x0054
            r2.A02 = r4
            java.lang.String r0 = ""
            r1.EyP(r0, r4)
        L_0x0054:
            float r0 = r8.A01()
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x007f
            X.WPk r0 = r7.mMapChromeController
            X.WJk r0 = r0.A0I
            X.2cs r0 = r0.A04
            r0.A04()
        L_0x0065:
            java.lang.Integer r0 = r7.A00()
            int r1 = r0.intValue()
            if (r1 == r4) goto L_0x00b9
            r0 = 2
            if (r1 != r0) goto L_0x007e
            X.WPk r0 = r7.mMapChromeController
            android.os.Handler r1 = r0.A09
            java.lang.Runnable r0 = r0.A0P
            r1.removeCallbacks(r0)
            r0.run()
        L_0x007e:
            return
        L_0x007f:
            X.Vvi r0 = r7.A0C
            java.util.TreeSet r0 = r0.A02()
            int r0 = r0.size()
            if (r0 <= r4) goto L_0x0065
            X.WPk r0 = r7.mMapChromeController
            r0.A04()
            goto L_0x0065
        L_0x0091:
            boolean r0 = r6 instanceof com.instagram.discovery.mediamap.fragment.LocationListFragment
            r2 = -1
            if (r0 == 0) goto L_0x00a9
            com.instagram.discovery.mediamap.fragment.LocationListFragment r6 = (com.instagram.discovery.mediamap.fragment.LocationListFragment) r6
            java.util.ArrayList r5 = r6.A05
            if (r5 != 0) goto L_0x00a9
            android.os.Bundle r1 = r6.mArguments
            if (r1 == 0) goto L_0x003f
            java.lang.String r0 = "arg_map_pins"
            java.util.ArrayList r5 = r1.getParcelableArrayList(r0)
            if (r5 == 0) goto L_0x003f
        L_0x00a9:
            X.W3Q r1 = r7.A0F
            com.instagram.discovery.mediamap.intf.MediaMapQuery r0 = r7.A0E
            r1.A0B(r0, r5, r2)
            goto L_0x003f
        L_0x00b1:
            X.WgO r0 = r7.mClipsVideoPlayerManager
            if (r0 == 0) goto L_0x0054
            r0.A01()
            goto L_0x0054
        L_0x00b9:
            r7.A0c = r4
            r7.A03()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.discovery.mediamap.fragment.MediaMapFragment.Cyq(com.instagram.discovery.mediamap.fragment.MapBottomSheetController, float):void");
    }

    public final void DFn(C18657VwC vwC, MediaMapQuery mediaMapQuery) {
        C17523VZc A032;
        if (mediaMapQuery != MediaMapQuery.A09) {
            C19204WPk wPk = this.mMapChromeController;
            wPk.A05 = false;
            C18623VvG vvG = wPk.A0O;
            if (vvG != null) {
                vvG.A01();
            }
            if (!this.A0a) {
                this.A0c = true;
                this.A0a = true;
            }
            A06(this);
            MediaMapQuery mediaMapQuery2 = this.A0E;
            C16614UyA uyA = mediaMapQuery2.A06;
            if (uyA != C16614UyA.PLACE && uyA != C16614UyA.LOCATION_PAGE_TAKEOVER) {
                ArrayList A002 = this.A06.A02(mediaMapQuery2).A00(this.A09);
                ArrayList A012 = A01(A002);
                C18663VwL vwL = this.mMapViewController;
                if (vwL != null && (A032 = vwL.A03()) != null && C18682Vwg.A00(A032, A002).size() < A002.size()) {
                    int i = this.A01;
                    this.mMapViewController.A0F(A012, (float) this.A00, i, i, 300, false);
                }
            }
        }
    }

    public final void DOp(C17896Vhn vhn) {
        this.A06.A04(this.A0E);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DPb(X.C18663VwL r20) {
        /*
            r19 = this;
            r0 = r19
            boolean r1 = r0.isResumed()
            if (r1 == 0) goto L_0x011f
            X.VwC r2 = r0.A06
            com.instagram.discovery.mediamap.intf.MediaMapQuery r1 = r0.A0E
            X.Vh8 r6 = r2.A02(r1)
            java.util.LinkedHashSet r1 = A02(r0)
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>(r1)
            java.util.ArrayList r12 = A01(r7)
            r11 = r20
            r11.A0G(r7)
            X.U4T r2 = r11.A04
            X.X5x r1 = r2.A00
            r1.getClass()
            X.X5x r1 = r2.A00
            com.instagram.maps.raster.IgRasterMapView r1 = (com.instagram.maps.raster.IgRasterMapView) r1
            r5 = 0
            r1.A03 = r5
            X.UGx r1 = r1.A00
            if (r1 == 0) goto L_0x0037
            r1.A09(r5)
        L_0x0037:
            com.facebook.android.maps.model.LatLng r1 = r0.A0Q
            if (r1 == 0) goto L_0x0048
            double r3 = r1.A00
            double r1 = r1.A01
            r18 = 1097859072(0x41700000, float:15.0)
            r13 = r11
            r14 = r3
            r16 = r1
            r13.A0B(r14, r16, r18)
        L_0x0048:
            X.VSv r2 = r0.A0X
            r8 = 1
            if (r2 == 0) goto L_0x012b
            X.VSu r1 = r2.A01
            double r12 = r1.A00
            double r14 = r1.A01
            float r1 = r2.A00
        L_0x0055:
            r16 = r1
            r11.A0B(r12, r14, r16)
        L_0x005a:
            java.util.LinkedHashSet r1 = A02(r0)
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0073
            X.W3Q r4 = r0.A0F
            java.util.LinkedHashSet r3 = A02(r0)
            com.instagram.discovery.mediamap.intf.MediaMapQuery r2 = r0.A0E
            X.VZc r1 = X.C13991Tnr.A0R(r0)
            r4.A0A(r2, r1, r3)
        L_0x0073:
            r9 = 0
        L_0x0074:
            X.WPk r1 = r0.mMapChromeController
            r1.A05()
            com.instagram.discovery.mediamap.model.MediaMapPin r1 = r0.A0H
            if (r1 == 0) goto L_0x0086
            X.Vvi r2 = r0.A0C
            java.lang.String r1 = X.C18231Vnv.A01(r1)
            r2.A03(r1)
        L_0x0086:
            boolean r1 = r0.A0B()
            if (r1 == 0) goto L_0x00e7
            com.instagram.discovery.mediamap.model.MediaMapPin r1 = r0.A0H
            r1.getClass()
            java.lang.String r1 = X.C18231Vnv.A01(r1)
            com.instagram.discovery.mediamap.intf.MediaMapQuery r11 = r0.A0E
            X.WVr r2 = new X.WVr
            r2.<init>(r0, r1)
            r0.A08 = r2
            X.VwL r4 = r0.mMapViewController
            com.instagram.discovery.mediamap.model.MediaMapPin r2 = r0.A0H
            com.instagram.discovery.mediamap.model.MediaMapPin[] r3 = new com.instagram.discovery.mediamap.model.MediaMapPin[]{r2}
            java.util.HashSet r2 = X.C281945Ae.A01(r8)
            java.util.Collections.addAll(r2, r3)
            r4.A0G(r2)
            X.VwL r2 = r0.mMapViewController
            r2.A09()
            X.VwC r10 = r0.A06
            com.instagram.discovery.mediamap.model.MediaMapPin r2 = r0.A0H
            java.util.List r14 = java.util.Collections.singletonList(r2)
            r15 = 0
            X.VZc r12 = X.C13991Tnr.A0R(r0)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            r10.A05(r11, r12, r13, r14, r15)
            X.Vko r4 = r0.A09
            com.instagram.discovery.mediamap.model.MediaMapPin r2 = r0.A0H
            java.lang.String r3 = X.C18231Vnv.A01(r2)
            X.X3u r2 = r0.A08
            r4.A03(r2, r3)
            X.Vko r11 = r0.A09
            com.instagram.common.session.UserSession r12 = r0.A02
            X.2lw r13 = r0.A0T
            X.Vhn r14 = r0.A05
            java.util.ArrayList r16 = X.DbV.A14(r1)
            r11.A01(r12, r13, r14, r15, r16)
            r0.A0L = r8
        L_0x00e7:
            boolean r1 = r0.A0B()
            if (r1 != 0) goto L_0x0102
            if (r9 != 0) goto L_0x0102
            java.util.List r1 = r6.A03
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0120
            java.util.List r1 = r6.A02
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0120
        L_0x00ff:
            A0A(r0, r5)
        L_0x0102:
            r0.A04()
            X.T6B r4 = r0.A03
            X.WPk r3 = r0.mMapChromeController
            java.lang.String r2 = "MediaMapFragment"
            X.0qQ.A0B(r3, r5)
            java.util.Set r1 = r4.A05
            r1.add(r3)
            android.location.Location r1 = r4.A00(r2)
            if (r1 == 0) goto L_0x011c
            r3.A06(r1)
        L_0x011c:
            A06(r0)
        L_0x011f:
            return
        L_0x0120:
            boolean r1 = r0.A0b
            if (r1 != 0) goto L_0x00ff
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x0102
            goto L_0x00ff
        L_0x012b:
            java.util.List r1 = r6.A03
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0183
            java.util.List r1 = r6.A02
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0183
            com.facebook.android.maps.model.LatLng r1 = r0.A0R
            if (r1 == 0) goto L_0x0147
            double r12 = r1.A00
            double r14 = r1.A01
            r1 = 1098907648(0x41800000, float:16.0)
            goto L_0x0055
        L_0x0147:
            com.facebook.android.maps.model.LatLng r1 = r0.A0S
            if (r1 == 0) goto L_0x017b
            com.facebook.android.maps.model.LatLng r10 = r0.A0P
            if (r10 == 0) goto L_0x017b
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            double r3 = r1.A00
            double r1 = r1.A01
            X.VSu r9 = new X.VSu
            r9.<init>(r3, r1)
            r12.add(r9)
            double r3 = r10.A00
            double r1 = r10.A01
            X.VSu r9 = new X.VSu
            r9.<init>(r3, r1)
            r12.add(r9)
            int r1 = r0.A00
            float r13 = (float) r1
            int r14 = r0.A01
            r16 = 300(0x12c, float:4.2E-43)
            r15 = r14
            r17 = r5
            r11.A0F(r12, r13, r14, r15, r16, r17)
            goto L_0x005a
        L_0x017b:
            X.WPk r1 = r0.mMapChromeController
            boolean r9 = r1.A07()
            goto L_0x0074
        L_0x0183:
            com.instagram.discovery.mediamap.model.MediaMapPin r1 = r0.A0W
            if (r1 == 0) goto L_0x01a1
            java.lang.Double r2 = r1.A0A
            if (r2 == 0) goto L_0x01a1
            java.lang.Double r1 = r1.A0B
            if (r1 == 0) goto L_0x01a1
            double r12 = r2.doubleValue()
            double r14 = r1.doubleValue()
            r16 = 1098907648(0x41800000, float:16.0)
            r11.A0B(r12, r14, r16)
            r1 = 0
            r0.A0W = r1
            goto L_0x005a
        L_0x01a1:
            int r1 = r0.A00
            float r13 = (float) r1
            int r14 = r0.A01
            r16 = 300(0x12c, float:4.2E-43)
            r15 = r14
            r17 = r5
            r11.A0F(r12, r13, r14, r15, r16, r17)
            X.VwC r2 = r0.A06
            com.instagram.discovery.mediamap.intf.MediaMapQuery r1 = r0.A0E
            X.Vh8 r2 = r2.A02(r1)
            X.VZc r1 = X.C13991Tnr.A0R(r0)
            r2.A00 = r1
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.discovery.mediamap.fragment.MediaMapFragment.DPb(X.VwL):void");
    }

    public final boolean DXK(C16076Uo3 uo3, String str, String str2) {
        C20944X5n x5n;
        C19879Wh8 wh8 = uo3.A0F;
        wh8.getClass();
        C19879Wh8.A02(wh8);
        if (0 < wh8.A03) {
            x5n = wh8.A07[0].A04;
        } else {
            x5n = null;
        }
        MediaMapPin mediaMapPin = (MediaMapPin) x5n;
        if (mediaMapPin != null) {
            W3Q w3q = this.A0F;
            Integer num = AnonymousClass05K.A00;
            MediaMapQuery mediaMapQuery = this.A0E;
            w3q.A08(mediaMapQuery, mediaMapPin, num, "discovery_map", (long) this.A06.A01(mediaMapQuery, mediaMapPin));
            A09(this, mediaMapPin);
            MediaMapPin A012 = this.A0C.A01();
            if (A012 == null || !2PP.A00(C18231Vnv.A01(A012), C18231Vnv.A01(mediaMapPin))) {
                this.A0C.A03(C18231Vnv.A01(mediaMapPin));
                return true;
            }
            A05(new RectF(uo3.A0D), this, mediaMapPin, uo3.A05);
        }
        return true;
    }

    public final void DYH(C18663VwL vwL, C17368VSv vSv) {
        MediaMapQuery mediaMapQuery = this.A0E;
        if (mediaMapQuery != null && mediaMapQuery.A06.ordinal() != 4) {
            C17368VSv vSv2 = this.A0X;
            if (vSv2 != null) {
                float[] fArr = new float[3];
                C17367VSu vSu = vSv2.A01;
                double d = vSu.A00;
                double d2 = vSu.A01;
                C17367VSu vSu2 = vSv.A01;
                Location.distanceBetween(d, d2, vSu2.A00, vSu2.A01, fArr);
                if (fArr[0] < 300.0f && this.A0X.A00 == vSv.A00) {
                    return;
                }
            }
            if (!this.A0A.A03()) {
                this.A0X = vSv;
                C19204WPk wPk = this.mMapChromeController;
                Handler handler = wPk.A09;
                Runnable runnable = wPk.A0P;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 300);
                A04();
            }
        }
    }

    public final void DmZ(C18657VwC vwC, MediaMapQuery mediaMapQuery) {
        C18642Vvi vvi;
        LinkedHashSet linkedHashSet;
        if (mediaMapQuery != MediaMapQuery.A09) {
            Set A072 = this.mMapViewController.A07();
            LinkedHashSet<MediaMapPin> linkedHashSet2 = new LinkedHashSet<>();
            if (this.A0E.A06 == C16614UyA.PLACE) {
                Iterator it = A072.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MediaMapPin mediaMapPin = (MediaMapPin) it.next();
                    if (2PP.A00(C18231Vnv.A01(mediaMapPin), this.A0E.A07)) {
                        linkedHashSet2.add(mediaMapPin);
                        break;
                    }
                }
            }
            if (this.A0a || !this.A0c || linkedHashSet2.size() != 1) {
                vvi = this.A0C;
                linkedHashSet = new LinkedHashSet();
            } else {
                vvi = this.A0C;
                linkedHashSet = new LinkedHashSet();
                for (MediaMapPin A012 : linkedHashSet2) {
                    linkedHashSet.add(C18231Vnv.A01(A012));
                }
            }
            C18642Vvi.A00(vvi, linkedHashSet);
            this.mMapViewController.A0G(linkedHashSet2);
            this.mMapViewController.A09();
            C19204WPk wPk = this.mMapChromeController;
            wPk.A05 = true;
            C18623VvG vvG = wPk.A0O;
            if (vvG != null) {
                if (false != vvG.A01) {
                    vvG.A01 = false;
                    C18623VvG.A00(vvG);
                }
                vvG.A02();
            }
        }
    }

    public final void EEz(C18016Vjs vjs, C14955UGt uGt) {
        uGt.A0L(AnonymousClass05K.A01, false);
    }

    public final void EF0(C18016Vjs vjs, C14955UGt uGt) {
        uGt.A0L(AnonymousClass05K.A00, false);
    }

    public final AnonymousClass0wW getSession() {
        return this.A02;
    }

    public final boolean onBackPressed() {
        C15293UZz A032 = this.A0B.A03();
        if (!(A032 instanceof LocationSearchFragment)) {
            boolean z = A032 instanceof LocationDetailFragment;
            if (z) {
                ((LocationDetailFragment) A032).onBackPressed();
            }
            if (!this.A0Z && (A032 instanceof LocationListFragment)) {
                LocationListFragmentMode locationListFragmentMode = ((LocationListFragment) A032).A00;
                if (!(locationListFragmentMode == LocationListFragmentMode.QUERY_LIST && this.A0E == MediaMapQuery.A08)) {
                    A0I(locationListFragmentMode);
                    return true;
                }
            } else if (z) {
                if (!A0B() || !this.A0A.A03()) {
                    A0C();
                    return true;
                }
                DbT.A1K(this);
                return true;
            }
            if (!(A032 instanceof C15939Ul6)) {
                return false;
            }
        }
        0hq r1 = this.A0B.A03;
        if (r1.A0M() > 1) {
            r1.A0c();
            return true;
        }
        return true;
    }

    private Integer A00() {
        if (!A0B()) {
            return AnonymousClass05K.A0N;
        }
        MediaMapPin mediaMapPin = this.A0H;
        if (mediaMapPin != null) {
            if (this.A0L) {
                return AnonymousClass05K.A00;
            }
            LocationDict locationDict = mediaMapPin.A09;
            if (locationDict == null || locationDict.A02 == null || locationDict.A03 == null) {
                return AnonymousClass05K.A0C;
            }
        }
        return AnonymousClass05K.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002e, code lost:
        if (r5.A0A.A03() != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C() {
        /*
            r5 = this;
            java.lang.Integer r2 = r5.A00()
            X.Vvi r1 = r5.A0C
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            X.C18642Vvi.A00(r1, r0)
            int r1 = r2.intValue()
            r4 = 1
            r3 = 0
            if (r1 == r4) goto L_0x003b
            r0 = 2
            if (r1 != r0) goto L_0x0037
            X.W1f r0 = r5.A0B
            r0.A05()
            com.instagram.discovery.mediamap.intf.MediaMapQuery r0 = com.instagram.discovery.mediamap.intf.MediaMapQuery.A08
            r5.A0E = r0
            A07(r5)
            A0A(r5, r3)
            com.instagram.discovery.mediamap.fragment.MapBottomSheetController r0 = r5.A0A
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0037
        L_0x0030:
            r5.A0K = r4
            com.instagram.discovery.mediamap.fragment.MapBottomSheetController r0 = r5.A0A
            X.C13990Tnq.A1K(r0)
        L_0x0037:
            A06(r5)
            return
        L_0x003b:
            r5.A0c = r3
            r5.A03()
            X.W1f r0 = r5.A0B
            r0.A05()
            X.W1f r2 = r5.A0B
            com.instagram.discovery.mediamap.intf.MediaMapQuery r1 = r5.A0E
            r0 = 0
            r2.A06(r0, r1, r3)
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.discovery.mediamap.fragment.MediaMapFragment.A0C():void");
    }

    public final void A0F() {
        if (A00() == AnonymousClass05K.A0C) {
            this.A0B.A05();
            this.A0E = MediaMapQuery.A08;
            A07(this);
            A0A(this, false);
            A06(this);
            return;
        }
        A0A(this, true);
    }

    public final void A0I(LocationListFragmentMode locationListFragmentMode) {
        C18663VwL vwL;
        int ordinal = locationListFragmentMode.ordinal();
        if (ordinal == 0) {
            this.A0B.A05();
            this.A0E = MediaMapQuery.A08;
            A07(this);
            if (this.A0E != null && (vwL = this.mMapViewController) != null && vwL.A03() != null) {
                C18657VwC vwC = this.A06;
                if (!DbT.A1b(C18682Vwg.A00(this.mMapViewController.A03(), vwC.A02(this.A0E).A00(vwC.A03)))) {
                    A0A(this, false);
                }
            }
        } else if (ordinal != 1) {
        } else {
            if (this.A0C.A02().isEmpty()) {
                0hq r1 = this.A0B.A03;
                if (r1.A0M() > 1) {
                    r1.A0c();
                    return;
                }
                return;
            }
            C18642Vvi.A00(this.A0C, new LinkedHashSet());
        }
    }

    public final int AoQ() {
        return Math.round(C16079Uo6.A00(requireContext(), (float) this.A01));
    }

    public final void DPX(C18663VwL vwL) {
        if (!isResumed()) {
            return;
        }
        if (A0B()) {
            this.A0K = true;
            C13990Tnq.A1K(this.A0A);
            return;
        }
        C18642Vvi.A00(this.A0C, new LinkedHashSet());
    }

    public final void DXG(MediaMapPin mediaMapPin) {
        this.mMapViewController.A0G(new HashSet(A02(this)));
        this.mMapViewController.A09();
    }

    public final boolean DXJ(C19879Wh8 wh8, C16076Uo3 uo3, String str) {
        LinkedHashSet<MediaMapPin> linkedHashSet = new LinkedHashSet<>(wh8.A04());
        C18642Vvi vvi = this.A0C;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (MediaMapPin A012 : linkedHashSet) {
            linkedHashSet2.add(C18231Vnv.A01(A012));
        }
        boolean A002 = C18642Vvi.A00(vvi, linkedHashSet2);
        MediaMapPin mediaMapPin = (MediaMapPin) linkedHashSet.iterator().next();
        A09(this, mediaMapPin);
        if (!A002) {
            U0Z u0z = uo3.A05;
            A05(new RectF(uo3.A0D), this, (MediaMapPin) linkedHashSet.iterator().next(), u0z);
            return true;
        }
        W3Q w3q = this.A0F;
        Integer num = AnonymousClass05K.A00;
        MediaMapQuery mediaMapQuery = this.A0E;
        w3q.A08(mediaMapQuery, mediaMapPin, num, "discovery_map", (long) this.A06.A01(mediaMapQuery, mediaMapPin));
        return true;
    }

    public final void onActivityCreated(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(522188302);
        MediaMapFragment.super.onActivityCreated(bundle);
        IgFragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof BaseFragmentActivity) {
            requireActivity.registerOnActivityResultListener(new C15681Ugm(this, 2));
        }
        AnonymousClass0fD.A09(1817546682, A022);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.07Z, com.instagram.discovery.mediamap.fragment.MediaMapFragment, X.0iw, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0147, code lost:
        if (r5 == r4) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x015c, code lost:
        if (X.DbY.A1Y(X.0Tu.A05, r12.A02, 36313682199709888L) != false) goto L_0x015e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            r0 = 10527367(0xa0a287, float:1.4751983E-38)
            int r1 = X.AnonymousClass0fD.A02(r0)
            com.instagram.discovery.mediamap.fragment.MediaMapFragment.super.onCreate(r13)
            android.content.Context r0 = r12.requireContext()
            X.2lw r0 = X.DbW.A0Q(r0, r12)
            r12.A0T = r0
            long r2 = java.lang.System.currentTimeMillis()
            r12.A0O = r2
            android.os.Bundle r2 = r12.requireArguments()
            com.instagram.common.session.UserSession r0 = X.DbX.A0U(r12)
            r12.A02 = r0
            r0 = 1100(0x44c, float:1.541E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r0 = r2.getParcelable(r0)
            r0.getClass()
            com.instagram.discovery.mediamap.intf.MapEntryPoint r0 = (com.instagram.discovery.mediamap.intf.MapEntryPoint) r0
            r12.A0V = r0
            java.lang.String r0 = "arg_session_id"
            java.lang.String r5 = X.DbU.A0l(r2, r0)
            r12.A0Y = r5
            com.instagram.common.session.UserSession r4 = r12.A02
            com.instagram.discovery.mediamap.intf.MapEntryPoint r3 = r12.A0V
            X.W3Q r0 = new X.W3Q
            r0.<init>(r12, r4, r3, r5)
            r12.A0F = r0
            android.content.Context r3 = r12.requireContext()
            r0 = 1109393408(0x42200000, float:40.0)
            float r0 = X.0nA.A00(r3, r0)
            int r0 = java.lang.Math.round(r0)
            r12.A00 = r0
            android.content.Context r3 = r12.requireContext()
            r0 = 50
            int r0 = X.C13988Tno.A09(r3, r0)
            r12.A01 = r0
            android.content.Context r4 = r12.requireContext()
            com.instagram.common.session.UserSession r3 = r12.A02
            X.T6B r0 = new X.T6B
            r0.<init>(r4, r3)
            r12.A03 = r0
            com.instagram.common.session.UserSession r3 = r12.A02
            X.Vko r0 = new X.Vko
            r0.<init>(r3)
            r12.A09 = r0
            android.content.Context r6 = r12.requireContext()
            com.instagram.common.session.UserSession r5 = r12.A02
            X.Vko r4 = r12.A09
            X.0gy r3 = X.AnonymousClass07i.A00(r12)
            X.Vhn r0 = new X.Vhn
            r0.<init>(r6, r3, r5, r4)
            r12.A05 = r0
            java.util.Set r0 = r0.A04
            r0.add(r12)
            X.Vko r3 = r12.A09
            X.Vvi r0 = new X.Vvi
            r0.<init>(r3)
            r12.A0C = r0
            android.content.Context r4 = r12.requireContext()
            com.instagram.common.session.UserSession r6 = r12.A02
            X.0gy r5 = X.AnonymousClass07i.A00(r12)
            X.Vko r8 = r12.A09
            X.Vhn r7 = r12.A05
            X.W3Q r9 = r12.A0F
            X.VwC r3 = new X.VwC
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r12.A06 = r3
            android.content.Context r6 = r12.requireContext()
            com.instagram.common.session.UserSession r5 = r12.A02
            X.0gy r4 = X.AnonymousClass07i.A00(r12)
            X.Vhn r3 = r12.A05
            X.WTn r0 = new X.WTn
            r0.<init>(r6, r4, r5, r3)
            r12.A04 = r0
            com.instagram.common.session.UserSession r6 = r12.A02
            X.2lw r5 = r12.A0T
            X.Vhn r4 = r12.A05
            X.Vko r3 = r12.A09
            X.VbI r0 = new X.VbI
            r0.<init>(r6, r5, r4, r3)
            r12.A07 = r0
            java.lang.String r0 = "arg_fallback_lat"
            java.lang.String r4 = r2.getString(r0)
            java.lang.String r0 = "arg_fallback_lng"
            java.lang.String r3 = r2.getString(r0)
            if (r4 == 0) goto L_0x00fb
            if (r3 == 0) goto L_0x00fb
            java.lang.Double r0 = java.lang.Double.valueOf(r4)     // Catch:{ NullPointerException -> 0x00fb }
            double r5 = r0.doubleValue()     // Catch:{ NullPointerException -> 0x00fb }
            java.lang.Double r0 = java.lang.Double.valueOf(r3)     // Catch:{ NullPointerException -> 0x00fb }
            double r3 = r0.doubleValue()     // Catch:{ NullPointerException -> 0x00fb }
            com.facebook.android.maps.model.LatLng r0 = new com.facebook.android.maps.model.LatLng     // Catch:{ NullPointerException -> 0x00fb }
            r0.<init>(r5, r3)     // Catch:{ NullPointerException -> 0x00fb }
            r12.A0Q = r0     // Catch:{ NullPointerException -> 0x00fb }
        L_0x00fb:
            java.lang.String r0 = "arg_hashtag_id"
            java.lang.String r5 = X.DbU.A0l(r2, r0)
            java.lang.String r0 = "arg_hashtag_name"
            java.lang.String r4 = X.DbU.A0l(r2, r0)
            java.lang.String r0 = "arg_starting_lat_lng"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.facebook.android.maps.model.LatLng r0 = (com.facebook.android.maps.model.LatLng) r0
            r12.A0R = r0
            java.lang.String r0 = "arg_boundary_top_left_lat_lng"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.facebook.android.maps.model.LatLng r0 = (com.facebook.android.maps.model.LatLng) r0
            r12.A0S = r0
            java.lang.String r0 = "arg_boundary_bottom_right_lat_lng"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.facebook.android.maps.model.LatLng r0 = (com.facebook.android.maps.model.LatLng) r0
            r12.A0P = r0
            java.lang.String r0 = "arg_query_type"
            int r3 = r2.getInt(r0)
            X.UyA[] r0 = X.C16614UyA.values()
            r0 = r0[r3]
            A08(r12, r0, r5, r4)
            com.instagram.discovery.mediamap.intf.MediaMapQuery r0 = r12.A0E
            X.UyA r5 = r0.A06
            X.UyA r4 = X.C16614UyA.SAVED
            r7 = 1
            if (r5 != r4) goto L_0x013f
            r12.A0Z = r7
        L_0x013f:
            com.instagram.discovery.mediamap.intf.MapEntryPoint r3 = r12.A0V
            com.instagram.discovery.mediamap.intf.MapEntryPoint r0 = com.instagram.discovery.mediamap.intf.MapEntryPoint.SAVE_HOME
            r6 = 0
            if (r3 == r0) goto L_0x0149
            r0 = 0
            if (r5 != r4) goto L_0x014a
        L_0x0149:
            r0 = 1
        L_0x014a:
            r12.A0M = r0
            if (r0 != 0) goto L_0x015e
            com.instagram.common.session.UserSession r5 = r12.A02
            X.0Tu r0 = X.0Tu.A05
            r3 = 36313682199709888(0x81031a000008c0, double:3.028257074333484E-306)
            boolean r0 = X.DbY.A1Y(r0, r5, r3)
            r3 = 0
            if (r0 == 0) goto L_0x015f
        L_0x015e:
            r3 = 1
        L_0x015f:
            X.VwC r0 = r12.A06
            r0.A01 = r3
            com.instagram.common.session.UserSession r3 = r12.A02
            X.WGR r0 = new X.WGR
            r0.<init>(r3, r12)
            r12.A0D = r0
            com.instagram.common.session.UserSession r4 = r12.A02
            java.lang.String r3 = r12.A0Y
            X.W1f r0 = new X.W1f
            r0.<init>(r12, r12, r4, r3)
            r12.A0B = r0
            androidx.fragment.app.FragmentActivity r4 = r12.requireActivity()
            X.W1f r3 = r12.A0B
            com.instagram.discovery.mediamap.fragment.MapBottomSheetController r0 = new com.instagram.discovery.mediamap.fragment.MapBottomSheetController
            r0.<init>(r4, r3)
            r12.A0A = r0
            r12.registerLifecycleListener(r0)
            java.lang.String r0 = "arg_map_pins"
            java.util.ArrayList r10 = r2.getParcelableArrayList(r0)
            if (r10 != 0) goto L_0x0194
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x0194:
            java.lang.String r0 = "arg_request_nearby_places"
            boolean r0 = r2.getBoolean(r0, r6)
            r0 = r0 ^ 1
            r12.A0c = r0
            com.instagram.discovery.mediamap.intf.MediaMapQuery r0 = r12.A0E
            X.UyA r3 = r0.A06
            X.UyA r5 = X.C16614UyA.PLACE
            if (r3 == r5) goto L_0x01aa
            X.UyA r0 = X.C16614UyA.LOCATION_PAGE_TAKEOVER
            if (r3 != r0) goto L_0x025b
        L_0x01aa:
            int r0 = r10.size()
            if (r0 != r7) goto L_0x025b
            java.lang.Object r0 = r10.get(r6)
            com.instagram.discovery.mediamap.model.MediaMapPin r0 = (com.instagram.discovery.mediamap.model.MediaMapPin) r0
            java.lang.String r3 = X.C18231Vnv.A01(r0)
            com.instagram.discovery.mediamap.intf.MediaMapQuery r0 = r12.A0E
            java.lang.String r0 = r0.A07
            boolean r0 = X.2PP.A00(r3, r0)
            if (r0 == 0) goto L_0x025b
        L_0x01c4:
            r12.A0b = r7
            r4 = 0
            if (r7 == 0) goto L_0x0258
            java.lang.Object r3 = r10.get(r6)
            com.instagram.discovery.mediamap.model.MediaMapPin r3 = (com.instagram.discovery.mediamap.model.MediaMapPin) r3
        L_0x01cf:
            r12.A0W = r3
            boolean r0 = r12.A0c
            if (r0 == 0) goto L_0x01d6
            r4 = r3
        L_0x01d6:
            r12.A0H = r4
            X.VwC r6 = r12.A06
            com.instagram.discovery.mediamap.intf.MediaMapQuery r7 = r12.A0E
            r9 = 0
            X.VZc r8 = X.C13991Tnr.A0R(r12)
            r11 = r9
            r6.A05(r7, r8, r9, r10, r11)
            java.lang.String r0 = "arg_place_thumbnail_override"
            android.os.Parcelable r3 = r2.getParcelable(r0)
            com.instagram.discovery.mediamap.intf.MediaMapQuery r2 = r12.A0E
            X.UyA r0 = r2.A06
            if (r0 != r5) goto L_0x01fc
            if (r3 == 0) goto L_0x01fc
            X.Vko r0 = r12.A09
            java.lang.String r2 = r2.A07
            java.util.HashMap r0 = r0.A00
            r0.put(r2, r3)
        L_0x01fc:
            X.VwC r0 = r12.A06
            java.util.Set r0 = r0.A06
            r0.add(r12)
            X.W3Q r3 = r12.A0F
            com.instagram.discovery.mediamap.intf.MediaMapQuery r2 = r12.A0E
            java.lang.String r0 = "instagram_map_enter"
            X.1Ln r0 = X.W3Q.A01(r3, r0)
            X.C13990Tnq.A12(r0, r2)
            X.W3Q.A04(r0, r3)
            r0.Cgf()
            X.2el r3 = X.2el.A00()
            r12.A0U = r3
            com.instagram.common.session.UserSession r2 = r12.A02
            X.WUF r0 = new X.WUF
            r0.<init>(r2, r3, r12, r12)
            r12.A0G = r0
            com.instagram.common.session.UserSession r3 = r12.A02
            X.328 r2 = new X.328
            r2.<init>(r12)
            X.32A r0 = new X.32A
            r0.<init>(r12, r3, r2)
            r12.A0J = r0
            com.instagram.common.session.UserSession r0 = r12.A02
            X.41i r0 = X.C2593341h.A00(r0)
            X.0xa r0 = r0.A00
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "is_eligible_for_maps_shortcut"
            X.DbW.A1L(r2, r0)
            X.1pR r0 = X.1pR.A00
            if (r0 == 0) goto L_0x0251
            X.1pR r2 = X.C14398TvR.A00()
            com.instagram.common.session.UserSession r0 = r12.A02
            r2.A00(r0)
        L_0x0251:
            r0 = 1345523572(0x50330f74, float:1.20165376E10)
            X.AnonymousClass0fD.A09(r0, r1)
            return
        L_0x0258:
            r3 = r4
            goto L_0x01cf
        L_0x025b:
            r7 = 0
            goto L_0x01c4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.discovery.mediamap.fragment.MediaMapFragment.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-915211685);
        ViewGroup viewGroup2 = (ViewGroup) DbT.A0C(layoutInflater, viewGroup, R.layout.layout_media_map);
        this.mMapContainer = DbU.A0C(viewGroup2, R.id.map_container);
        C18663VwL vwL = new C18663VwL(requireContext(), this.mMapContainer, this.A02, this, this, this, "ig_mediamap", AnonymousClass1GD.A03());
        vwL.A0E(bundle);
        this.mMapViewController = vwL;
        this.mMapChromeController = new C19204WPk(requireActivity(), viewGroup2, this.A02, this.A03, this.A0A, this, this.mMapViewController);
        this.A0A.A05.add(this);
        AnonymousClass0fD.A09(579044248, A022);
        return viewGroup2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-674227802);
        super.onDestroy();
        1Ln A012 = W3Q.A01(this.A0F, "instagram_map_exit");
        A012.A0Q("session_duration", Long.valueOf(System.currentTimeMillis() - this.A0O));
        A012.Cgf();
        C19305WTn wTn = this.A04;
        wTn.A02 = true;
        wTn.A06.A00();
        AnonymousClass0fD.A09(-1954115993, A022);
    }

    public final void onDestroyView() {
        C14956UGu uGu;
        int A022 = AnonymousClass0fD.A02(1104532377);
        super.onDestroyView();
        C19204WPk wPk = this.mMapChromeController;
        wPk.A0J.A05.remove(wPk);
        if (wPk.A01 != null) {
            wPk.A0E.getViewTreeObserver().removeOnPreDrawListener(wPk.A01);
            wPk.A01 = null;
        }
        C18663VwL vwL = this.mMapViewController;
        vwL.A04.A00();
        C18016Vjs vjs = vwL.A01;
        if (!(vjs == null || (uGu = vjs.A04) == null)) {
            uGu.A08();
        }
        MapBottomSheetController mapBottomSheetController = this.A0A;
        mapBottomSheetController.A05.remove(this.mMapChromeController);
        this.A0A.A05.remove(this);
        this.A0C.A00.remove(this);
        WUF wuf = this.A0G;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = wuf.A07;
        map.clear();
        wuf.A08.clear();
        Set set = wuf.A09;
        set.clear();
        Map map2 = wuf.A06;
        Iterator A0u = AnonymousClass7TF.A0u(map2);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object key = A1J.getKey();
            long A0R2 = AnonymousClass7TE.A0R(A1J.getValue());
            if (!set.contains(key)) {
                map.put(key, Long.valueOf(currentTimeMillis - A0R2));
            }
        }
        map2.clear();
        wuf.A02.A0K(map);
        this.A05.A04.remove(this);
        C19843WgO wgO = this.mClipsVideoPlayerManager;
        if (wgO != null) {
            wgO.A06.remove(this.A0e);
        }
        MediaMapFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass1Nd.A00(this.A02).A02(this.A0h, WQB.class);
        this.A09.A03.remove(this);
        AnonymousClass0fD.A09(-1408054944, A022);
    }

    public final void onPause() {
        AnonymousClass4M3 r2;
        int A022 = AnonymousClass0fD.A02(-292363645);
        MediaMapFragment.super.onPause();
        if (this.mMapViewController.A04.A01 != null) {
            MapboxTTRC.cancel(C66579MXk.A00(352));
        }
        T6B t6b = this.A03;
        if (t6b.A01) {
            t6b.A01 = false;
            t6b.A03.A06();
        }
        C19843WgO wgO = this.mClipsVideoPlayerManager;
        if (!(wgO == null || (r2 = wgO.A05) == null || !r2.isPlaying())) {
            wgO.A02 = true;
            r2.EyP("", true);
        }
        AnonymousClass0fD.A09(821873597, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1113225439);
        super.onResume();
        this.mMapViewController.A04.A01();
        this.A03.A01();
        float f = (float) this.A0A.mBottomSheetBehavior.A0F.A01;
        C19843WgO wgO = this.mClipsVideoPlayerManager;
        if (wgO != null && f < 1.0f) {
            wgO.A01();
        }
        AnonymousClass0fD.A09(582761150, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1065954733);
        MediaMapFragment.super.onStart();
        this.mMapViewController.A04.A02();
        AnonymousClass0fD.A09(-156426779, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1949176084);
        MediaMapFragment.super.onStop();
        AnonymousClass0fD.A09(987901369, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0C.A00.add(this);
        this.A09.A03.add(this);
        C19843WgO wgO = new C19843WgO(requireContext(), this, this.A02, DbY.A0S(view, R.id.stub_map_video_player_container));
        this.mClipsVideoPlayerManager = wgO;
        VN8 vn8 = this.A0e;
        List list = wgO.A06;
        if (!list.contains(vn8)) {
            list.add(vn8);
        }
        if (this.A0H == null) {
            this.A0B.A04();
        }
        if (!2PP.A00(this.A0E, MediaMapQuery.A08) && this.A0H == null) {
            Bundle bundle2 = new Bundle();
            if (this.A0Z) {
                bundle2.putBoolean("arg_disallow_navigation_and_search", true);
            }
            this.A0B.A06(bundle2, this.A0E, false);
        }
        this.A0U.A06(view, AnonymousClass3DZ.A00(this));
        if (!C2593341h.A00(this.A02).A00.getBoolean("has_seen_main_nux", false)) {
            view.postDelayed(new C20017Wjd(this), 500);
        }
        AnonymousClass1Nd.A00(this.A02).A01(this.A0h, WQB.class);
    }

    public final void Dvc(C18657VwC vwC, C17855Vh8 vh8, MediaMapQuery mediaMapQuery) {
        A07(this);
    }
}
