package com.instagram.archive.fragment;

import X.0mM;
import X.0nA;
import X.0qQ;
import X.1NY;
import X.1Nr;
import X.1OC;
import X.1Wr;
import X.1Xj;
import X.1wn;
import X.2PP;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass1GD;
import X.AnonymousClass1Nd;
import X.AnonymousClass2R4;
import X.AnonymousClass328;
import X.AnonymousClass32A;
import X.AnonymousClass32D;
import X.AnonymousClass3BQ;
import X.AnonymousClass4DR;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13988Tno;
import X.C13990Tnq;
import X.C14634Tzg;
import X.C14635Tzh;
import X.C14723U4m;
import X.C14958UGw;
import X.C15619Ufl;
import X.C15621Ufn;
import X.C16076Uo3;
import X.C16079Uo6;
import X.C16158Upj;
import X.C17369VSw;
import X.C18195VnD;
import X.C18580VuW;
import X.C18623VvG;
import X.C19221WQb;
import X.C19303WTl;
import X.C19512Way;
import X.C19873Wh0;
import X.C19879Wh8;
import X.C20381WqM;
import X.C20958X6l;
import X.C273374mT;
import X.DbT;
import X.DbU;
import X.DbV;
import X.K1I;
import X.LHH;
import X.UH0;
import X.UXW;
import X.W2R;
import X.WFB;
import X.WFP;
import X.WFU;
import X.WJj;
import X.WQ8;
import X.WT0;
import X.WZ2;
import X.X7f;
import android.app.Activity;
import android.graphics.RectF;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.model.reels.ReelViewerContextButtonType;
import com.instagram.model.venue.Venue;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ArchiveReelMapFragment extends C273374mT implements AnonymousClass4DR, X7f, C20958X6l {
    public LatLng A00;
    public WT0 A01;
    public 0mM A02;
    public WFB A03;
    public AnonymousClass32A A04;
    public boolean A05;
    public final C17369VSw A06 = new C17369VSw();
    public final List A07 = new ArrayList();
    public final List A08 = new ArrayList();
    public final Set A09 = new HashSet();
    public final AnonymousClass2R4 A0A = new Object();
    public final 1wn A0B = new C19221WQb(this, 2);
    public final float[] A0C = {0.0f};
    public UH0 mClusterOverlay;
    public WFU mFacebookMap;
    public C18623VvG mLoadingPillController;
    public WJj mMapPrivacyMessageController;
    public C14723U4m mMapView;

    public final String getModuleName() {
        return "location_map_archive";
    }

    public final boolean onBackPressed() {
        return false;
    }

    public static void A00(CameraPosition cameraPosition, ArchiveReelMapFragment archiveReelMapFragment) {
        LatLng latLng = cameraPosition.A03;
        double d = latLng.A00;
        double d2 = latLng.A01;
        ArchiveReelMapFragment archiveReelMapFragment2 = archiveReelMapFragment;
        WFU wfu = archiveReelMapFragment2.mFacebookMap;
        wfu.getClass();
        W2R w2r = wfu.A0J;
        AnonymousClass2R4 r3 = archiveReelMapFragment2.A0A;
        w2r.A05(r3);
        double A002 = C13990Tnq.A00(r3.A03);
        double A022 = W2R.A02(r3.A01);
        double A003 = C13990Tnq.A00(r3.A00);
        double A023 = W2R.A02(r3.A02);
        float[] fArr = archiveReelMapFragment2.A0C;
        Location.distanceBetween(d, d2, A002, A022, fArr);
        double d3 = d;
        double d4 = d2;
        Location.distanceBetween(d3, d4, A003, A023, fArr);
        double max = Math.max((double) fArr[0], (double) fArr[0]);
        UserSession session = archiveReelMapFragment2.getSession();
        0qQ.A0B(session, 0);
        1NY A0b = AnonymousClass7TG.A0b(session);
        A0b.A0A("archive/reel/location_media/");
        A0b.A9m("lat", String.valueOf(d));
        A0b.A9m("lng", String.valueOf(d2));
        A0b.A9m("radius", String.valueOf(max));
        1OC A0S = DbU.A0S(A0b, K1I.class, LHH.class);
        C19873Wh0 wh0 = new C19873Wh0(d3, d4, max);
        int i = 0;
        while (true) {
            List list = archiveReelMapFragment2.A07;
            if (i >= list.size()) {
                break;
            }
            C19873Wh0 wh02 = (C19873Wh0) list.get(i);
            double d5 = wh0.A02;
            if (d5 > wh02.A02) {
                break;
            }
            double d6 = wh02.A02;
            if (d5 <= d6) {
                double d7 = wh02.A00;
                double d8 = wh02.A01;
                double d9 = wh0.A00;
                double d10 = wh0.A01;
                float[] fArr2 = wh02.A03;
                double d11 = d9;
                double d12 = d8;
                double d13 = d7;
                Location.distanceBetween(d13, d12, d11, d10, fArr2);
                if (((double) fArr2[0]) + d5 <= d6) {
                    return;
                }
            }
            i++;
        }
        C15619Ufl.A00(A0S, archiveReelMapFragment2, wh0, 0);
        archiveReelMapFragment2.schedule(A0S);
    }

    private void A02(C16076Uo3 uo3, String str, List list) {
        if (this.A04 == null) {
            this.A04 = new AnonymousClass32A(this, getSession(), new AnonymousClass328(this));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(DbV.A0U(getSession(), AnonymousClass7TE.A18(it)));
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new C20381WqM((Object) this, 9));
            int i = 0;
            while (true) {
                if (i < arrayList.size()) {
                    if (2PP.A00(str, ((1Xj) arrayList.get(i)).getId())) {
                        break;
                    }
                    i++;
                } else {
                    i = 0;
                    break;
                }
            }
            String A0b = AnonymousClass7TF.A0b();
            1Nr r2 = new 1Nr(DbT.A0j(getSession()));
            ReelType reelType = ReelType.A08;
            Reel reel = new Reel(r2, A0b, true);
            reel.A1W = false;
            reel.A0P = reelType;
            reel.A0X(arrayList);
            ReelStore.A03(getSession()).A0X(reel);
            RectF A0F = 0nA.A0F(this.mMapView);
            RectF rectF = new RectF(uo3.A0D);
            rectF.set(rectF.centerX(), rectF.centerY(), rectF.centerX(), rectF.centerY());
            rectF.offset(A0F.left, A0F.top);
            AnonymousClass32A r6 = this.A04;
            AnonymousClass32D r22 = new AnonymousClass32D();
            r22.A00 = ReelViewerContextButtonType.VIEW_DAY;
            r22.A06 = false;
            r22.A04 = WT0.A00(getSession()).A01;
            r6.A03 = new ReelViewerConfig(r22);
            r6.A0C = AnonymousClass7TF.A0b();
            r6.A05 = new C16158Upj(rectF, this, uo3);
            r6.A0D = getSession().A06;
            r6.A06(reel, AnonymousClass3BQ.ARCHIVE_MAP, new C19512Way(rectF, this, uo3), Collections.singletonList(reel), Collections.singletonList(reel), i);
        }
    }

    public final void DYr(String str, Integer num) {
        1Xj A0U;
        if (num == AnonymousClass05K.A01 && (A0U = DbV.A0U(getSession(), str)) != null) {
            Venue A24 = A0U.A24();
            this.A06.A00 = System.currentTimeMillis();
            WFU wfu = this.mFacebookMap;
            wfu.getClass();
            A24.getClass();
            Double A002 = A24.A00();
            A002.getClass();
            double doubleValue = A002.doubleValue();
            Double A012 = A24.A01();
            A012.getClass();
            C18580VuW.A00(wfu, new LatLng(doubleValue, A012.doubleValue()), 17.0f);
        }
    }

    public static void A01(ArchiveReelMapFragment archiveReelMapFragment) {
        Location location;
        LatLng latLng;
        FragmentActivity activity = archiveReelMapFragment.getActivity();
        if (archiveReelMapFragment.mFacebookMap != null && activity != null && !archiveReelMapFragment.A05) {
            WZ2 wz2 = new WZ2(activity, archiveReelMapFragment.mFacebookMap, archiveReelMapFragment.getSession());
            WFU wfu = wz2.A02;
            Activity activity2 = wz2.A01;
            C14634Tzg tzg = new C14634Tzg(activity2, wfu, wz2);
            wfu.A0A(tzg);
            C14635Tzh tzh = tzg.A04;
            if (!tzh.A0G) {
                tzh.A05();
            }
            wfu.A0A(new C14958UGw(wfu, wz2, C13988Tno.A09(activity2, 17)));
            1Wr r1 = 1Wr.A00;
            if (r1 != null) {
                location = r1.getLastLocation(archiveReelMapFragment.getSession(), "ArchiveReelMapFragment");
            } else {
                location = null;
            }
            Location AuA = wz2.AuA("ArchiveReelMapFragment");
            if (AuA != null) {
                location = AuA;
            } else if (location == null) {
                latLng = archiveReelMapFragment.A00;
                if (latLng == null) {
                    return;
                }
                archiveReelMapFragment.A06.A00 = System.currentTimeMillis();
                C18580VuW.A00(archiveReelMapFragment.mFacebookMap, latLng, 11.0f);
                archiveReelMapFragment.A05 = true;
            }
            latLng = new LatLng(location.getLatitude(), location.getLongitude());
            archiveReelMapFragment.A06.A00 = System.currentTimeMillis();
            C18580VuW.A00(archiveReelMapFragment.mFacebookMap, latLng, 11.0f);
            archiveReelMapFragment.A05 = true;
        }
    }

    public final void Cxx(String str, Integer num) {
    }

    public final void DFd(String str, Integer num) {
    }

    public final boolean DXJ(C19879Wh8 wh8, C16076Uo3 uo3, String str) {
        LinkedList<MediaMapPin> A042 = wh8.A04();
        ArrayList arrayList = new ArrayList();
        for (MediaMapPin mediaMapPin : A042) {
            arrayList.add(mediaMapPin.A0D);
        }
        A02(uo3, str, arrayList);
        return true;
    }

    public final boolean DXK(C16076Uo3 uo3, String str, String str2) {
        A02(uo3, str, Collections.singletonList(str));
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(179356874);
        ArchiveReelMapFragment.super.onCreate(bundle);
        WT0 A002 = WT0.A00(getSession());
        this.A01 = A002;
        A002.A01.clear();
        1NY A0O = DbU.A0O(getSession());
        A0O.A0A("map/map_center_fallback/");
        1OC A0S = DbT.A0S(A0O, UXW.class, C18195VnD.class);
        C15621Ufn.A00(A0S, this, 0);
        schedule(A0S);
        AnonymousClass0fD.A09(747585617, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1653794952);
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.layout_map, viewGroup, false);
        C14723U4m u4m = (C14723U4m) frameLayout.requireViewById(R.id.map);
        this.mMapView = u4m;
        boolean A032 = AnonymousClass1GD.A03();
        u4m.A0N.A08 = A032;
        int i = -987675;
        if (A032) {
            i = -15789542;
        }
        u4m.A0D = i;
        this.mMapView.D6V(bundle);
        this.A02 = new 0mM(AnonymousClass7TF.A0D(), new C19303WTl(this, 0), 300);
        this.mLoadingPillController = new C18623VvG((View.OnClickListener) null, frameLayout, 80);
        this.mMapPrivacyMessageController = new WJj(frameLayout.requireViewById(R.id.privacy_message), getSession());
        AnonymousClass0fD.A09(1066125167, A022);
        return frameLayout;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1270688320);
        super.onDestroyView();
        AnonymousClass1Nd.A00(getSession()).A02(this.A0B, WQ8.class);
        this.A01.A04.remove(this);
        this.A09.clear();
        this.A08.clear();
        this.A07.clear();
        UH0 uh0 = this.mClusterOverlay;
        if (uh0 != null) {
            uh0.A08();
        }
        0mM r0 = this.A02;
        if (r0 != null) {
            r0.A00();
        }
        ArchiveReelMapFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(2079229125, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        int A092 = C13988Tno.A09(requireContext(), 55);
        this.mMapView.A0G(new WFP(this, A092, Math.round(C16079Uo6.A00(requireContext(), C13988Tno.A01(A092)))));
        AnonymousClass1Nd.A00(getSession()).A01(this.A0B, WQ8.class);
        this.A01.A04.add(this);
    }
}
