package com.instagram.discovery.mediamap.fragment;

import X.002;
import X.02V;
import X.0qQ;
import X.2PP;
import X.2Yu;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0fU;
import X.AnonymousClass2t9;
import X.AnonymousClass2tC;
import X.AnonymousClass32A;
import X.AnonymousClass3BQ;
import X.AnonymousClass3N3;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13988Tno;
import X.C13990Tnq;
import X.C14908UEn;
import X.C15244UXe;
import X.C15293UZz;
import X.C15797Uig;
import X.C16165Upq;
import X.C16614UyA;
import X.C16929VBg;
import X.C17523VZc;
import X.C17626VbI;
import X.C17855Vh8;
import X.C17896Vhn;
import X.C18062Vko;
import X.C18066Vks;
import X.C18231Vnv;
import X.C18657VwC;
import X.C18663VwL;
import X.C18792W1y;
import X.C19261WRu;
import X.C19265WRy;
import X.C19305WTn;
import X.C19352WVt;
import X.C19490Wac;
import X.C20901X3s;
import X.C20905X3w;
import X.C20975X7o;
import X.C230222pE;
import X.C249703kE;
import X.C263324Kh;
import X.C51974G9v;
import X.C61078JwG;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbX;
import X.Dba;
import X.JTQ;
import X.UA6;
import X.VS6;
import X.WB8;
import X.WBX;
import X.WUF;
import X.WWT;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.discovery.refinement.model.QueryInformation;
import com.instagram.discovery.refinement.model.Refinement;
import com.instagram.discovery.refinement.model.RefinementAttributes;
import com.instagram.model.reels.Reel;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.webrtc.EglBase14Impl;

public class LocationListFragment extends C15293UZz implements C20975X7o, C20901X3s, C20905X3w {
    public LocationListFragmentMode A00;
    public MediaMapQuery A01;
    public VS6 A02;
    public Reel A03;
    public Venue A04;
    public ArrayList A05;
    public boolean A06;
    public boolean A07;
    public LinearLayoutManager A08;
    public AnonymousClass32A A09;
    public String A0A;
    public C18066Vks mActionBarHelper;
    public AnonymousClass2t9 mAdapter;
    public View mEmptyStateView;
    public View mExploreAllLink;
    public RecyclerView mRecyclerView;
    public WWT mRefinementsController;

    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    public final void A08(C15244UXe uXe) {
        Venue venue;
        Reel reel;
        VS6 vs6 = null;
        if (uXe == null) {
            venue = null;
        } else {
            LocationDict locationDict = uXe.A02;
            if (locationDict != null) {
                ? obj = new Object();
                obj.A00 = locationDict;
                venue = obj;
            } else {
                venue = null;
            }
        }
        if (A06(this) && !2PP.A00(this.A04, venue)) {
            this.A04 = venue;
            if (uXe != null) {
                vs6 = uXe.A00;
            }
            this.A02 = vs6;
            if (A06(this)) {
                if (this.A04 != null) {
                    C17896Vhn vhn = C13990Tnq.A0P(this).A05;
                    String A052 = this.A04.A05();
                    0qQ.A0B(A052, 0);
                    reel = (Reel) vhn.A03.get(A052);
                } else {
                    reel = null;
                }
                this.A03 = reel;
                A05(this, A02(this));
            }
        }
    }

    public final float BbN() {
        return 0.5f;
    }

    public final String getModuleName() {
        return "discovery_map_location_list";
    }

    private ArrayList A01() {
        MediaMapQuery mediaMapQuery;
        LocationListFragmentMode locationListFragmentMode = this.A00;
        LocationListFragmentMode locationListFragmentMode2 = LocationListFragmentMode.QUERY_LIST;
        C18657VwC vwC = C13990Tnq.A0P(this).A06;
        if (locationListFragmentMode == locationListFragmentMode2 && (mediaMapQuery = this.A01) != null) {
            ArrayList arrayList = new ArrayList(vwC.A02(mediaMapQuery).A03);
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return new ArrayList(vwC.A02(MediaMapQuery.A08).A03);
    }

    public static List A02(LocationListFragment locationListFragment) {
        ArrayList arrayList;
        if (locationListFragment.A00 == LocationListFragmentMode.QUERY_LIST) {
            C18657VwC vwC = C13990Tnq.A0P(locationListFragment).A06;
            MediaMapQuery mediaMapQuery = locationListFragment.A01;
            02V.A03(mediaMapQuery, "Query cannot be null when in QUERY_LIST mode");
            arrayList = vwC.A02(mediaMapQuery).A00(C13990Tnq.A0P(locationListFragment).A09);
        } else {
            arrayList = locationListFragment.A05;
        }
        if (arrayList == null) {
            return Collections.emptyList();
        }
        return arrayList;
    }

    public static void A05(LocationListFragment locationListFragment, Collection collection) {
        String string;
        int i;
        Integer num;
        int i2;
        Integer num2;
        String str;
        locationListFragment.mEmptyStateView.setVisibility(8);
        locationListFragment.mRecyclerView.setVisibility(0);
        locationListFragment.mActionBarHelper.A02.setVisibility(8);
        boolean A062 = A06(locationListFragment);
        C18066Vks vks = locationListFragment.mActionBarHelper;
        if (A062) {
            vks.A02(false);
            Drawable drawable = locationListFragment.requireContext().getDrawable(R.drawable.instagram_search_pano_outline_24);
            DbX.A11(locationListFragment.requireContext(), drawable, 2Yu.A0B(locationListFragment.requireContext()));
            C18066Vks vks2 = locationListFragment.mActionBarHelper;
            WB8 wb8 = new WB8((Object) locationListFragment, 55);
            ImageView imageView = vks2.A01;
            imageView.setImageDrawable(drawable);
            AnonymousClass0fU.A00(wb8, imageView);
            imageView.setVisibility(0);
            C18066Vks vks3 = locationListFragment.mActionBarHelper;
            Venue venue = locationListFragment.A04;
            if (venue == null || venue.A00.getName() == null) {
                string = locationListFragment.getString(2131969574);
            } else {
                string = locationListFragment.A04.A00.getName();
            }
            SpannableStringBuilder spannableStringBuilder = null;
            if (locationListFragment.A02 != null && C13990Tnq.A0P(locationListFragment).mMapViewController.A01() >= 9.0f) {
                VS6 vs6 = locationListFragment.A02;
                float floatValue = vs6.A01.floatValue();
                if (floatValue < 38.0f) {
                    if (floatValue > -12.0f) {
                        C16929VBg vBg = C16929VBg.$redex_init_class;
                        switch (vs6.A00.ordinal()) {
                            case 0:
                            case 19:
                                i = 2131976799;
                                break;
                            case 1:
                            case 20:
                                i = 2131976800;
                                break;
                            case 2:
                            case 21:
                                i = 2131976801;
                                break;
                            case 3:
                            case 22:
                                i = 2131976802;
                                break;
                            case 4:
                            case 23:
                                i = 2131976803;
                                break;
                            case 5:
                            case 24:
                            case 36:
                                i = 2131976804;
                                break;
                            case 6:
                            case 25:
                                i = 2131976805;
                                break;
                            case 7:
                            case 26:
                                i = 2131976808;
                                break;
                            case 8:
                            case 27:
                                i = 2131976809;
                                break;
                            case 9:
                            case 28:
                                i = 2131976810;
                                break;
                            case 10:
                            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                                i = 2131976811;
                                break;
                            case 11:
                            case 30:
                                i = 2131976812;
                                break;
                            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                            case 31:
                                i = 2131976813;
                                break;
                            case 13:
                            case 32:
                                i = 2131976814;
                                break;
                            case 14:
                            case 33:
                                i = 2131976815;
                                break;
                            case 15:
                            case 34:
                                i = 2131976816;
                                break;
                            case 16:
                            case 35:
                                i = 2131976817;
                                break;
                            case 17:
                                i = 2131976818;
                                break;
                            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                            case 37:
                                i = 2131976819;
                                break;
                            default:
                                num = null;
                                break;
                        }
                    } else {
                        i = 2131976806;
                    }
                } else {
                    i = 2131976807;
                }
                num = Integer.valueOf(i);
                if (floatValue < 38.0f) {
                    if (floatValue > -12.0f) {
                        C16929VBg vBg2 = C16929VBg.$redex_init_class;
                        switch (vs6.A00.ordinal()) {
                            case 0:
                            case 3:
                            case 7:
                            case 16:
                            case 19:
                            case 22:
                            case 26:
                            case 35:
                                i2 = R.drawable.weather_snow_16;
                                break;
                            case 1:
                            case 2:
                            case 4:
                            case 14:
                            case 15:
                            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                            case 20:
                            case 21:
                            case 23:
                            case 33:
                            case 34:
                            case 37:
                                i2 = R.drawable.weather_rain_16;
                                break;
                            case 5:
                            case 11:
                            case 17:
                            case 24:
                            case 30:
                            case 36:
                                i2 = R.drawable.weather_sunny_16;
                                break;
                            case 6:
                            case 10:
                            case 25:
                            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                                i2 = R.drawable.weather_cloudy_16;
                                break;
                            case 8:
                            case 9:
                            case 27:
                            case 28:
                                i2 = R.drawable.weather_fog_16;
                                break;
                            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                            case 13:
                            case 31:
                            case 32:
                                i2 = R.drawable.weather_partly_cloudy_16;
                                break;
                            default:
                                num2 = null;
                                break;
                        }
                    } else {
                        i2 = R.drawable.weather_extreme_cold_16;
                    }
                } else {
                    i2 = R.drawable.weather_extreme_heat_16;
                }
                num2 = Integer.valueOf(i2);
                Locale locale = Locale.getDefault();
                if (vs6.A01 != null) {
                    String country = locale.getCountry();
                    String[] strArr = C18792W1y.A00;
                    boolean z = false;
                    int i3 = 0;
                    while (true) {
                        if (strArr[i3].equals(country)) {
                            z = true;
                        } else {
                            i3++;
                            if (i3 >= 3) {
                            }
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    float floatValue2 = vs6.A01.floatValue();
                    if (z) {
                        sb.append(Math.round(((floatValue2 * 9.0f) / 5.0f) + 32.0f));
                        str = "℉";
                    } else {
                        sb.append(Math.round(floatValue2));
                        str = "℃";
                    }
                    String A0l = AnonymousClass7TF.A0l(str, sb);
                    if (!(A0l == null || num == null || num2 == null)) {
                        Resources A052 = DbV.A05(locationListFragment);
                        String string2 = A052.getString(num.intValue());
                        spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append(002.A0g(A0l, " · ", string2));
                        Drawable drawable2 = A052.getDrawable(num2.intValue());
                        drawable2.getClass();
                        AnonymousClass7TG.A13(drawable2);
                        drawable2.setTint(locationListFragment.requireContext().getColor(2Yu.A08(locationListFragment.requireContext())));
                        C263324Kh.A02(drawable2, spannableStringBuilder, 0, 0, C13988Tno.A09(locationListFragment.requireContext(), 2));
                    }
                }
            }
            vks3.A00(spannableStringBuilder, (View.OnClickListener) null, string);
            C18066Vks vks4 = locationListFragment.mActionBarHelper;
            Venue venue2 = locationListFragment.A04;
            vks4.A01(locationListFragment, new C19352WVt(locationListFragment), locationListFragment.A03, venue2);
        } else {
            vks.A02(true);
            C18066Vks vks5 = locationListFragment.mActionBarHelper;
            AnonymousClass0fU.A00(new WB8((Object) locationListFragment, 56), vks5.A03);
            vks5.A02(true);
            locationListFragment.mActionBarHelper.A03(false);
        }
        locationListFragment.mRefinementsController.A00();
        boolean z2 = locationListFragment.A07;
        WWT wwt = locationListFragment.mRefinementsController;
        if (z2) {
            wwt.A00.setVisibility(8);
        } else {
            wwt.A00();
        }
        MediaMapQuery mediaMapQuery = locationListFragment.A01;
        if (mediaMapQuery != null && mediaMapQuery.A05 && !locationListFragment.A07 && collection.isEmpty()) {
            locationListFragment.mEmptyStateView.setVisibility(0);
            locationListFragment.mRecyclerView.setVisibility(8);
            locationListFragment.mRefinementsController.A00.setVisibility(8);
        }
    }

    public static boolean A06(LocationListFragment locationListFragment) {
        if (2PP.A00(locationListFragment.A01, MediaMapQuery.A08)) {
            return true;
        }
        MediaMapQuery mediaMapQuery = locationListFragment.A01;
        if (mediaMapQuery == null || mediaMapQuery.A06 != C16614UyA.PLACE) {
            return false;
        }
        return true;
    }

    public final void DFn(C18657VwC vwC, MediaMapQuery mediaMapQuery) {
        if (2PP.A00(mediaMapQuery, this.A01)) {
            this.A07 = false;
            A04();
            A03();
        }
    }

    public final void Dco(Refinement refinement) {
        if (!this.A07) {
            QueryInformation queryInformation = refinement.A00.A00;
            queryInformation.getClass();
            String str = queryInformation.A00;
            for (C16614UyA uyA : C16614UyA.values()) {
                if (uyA.toString().equals(str)) {
                    MediaMapFragment A0P = C13990Tnq.A0P(this);
                    RefinementAttributes refinementAttributes = refinement.A00;
                    String str2 = refinementAttributes.A04;
                    if (str2 == null && (str2 = refinementAttributes.A03) == null) {
                        str2 = null;
                    }
                    MediaMapFragment.A08(A0P, uyA, str2, refinement.A01);
                    MediaMapFragment.A0A(A0P, true);
                    A0P.A0B.A06((Bundle) null, A0P.A0E, true);
                    return;
                }
            }
        }
    }

    public final void DmZ(C18657VwC vwC, MediaMapQuery mediaMapQuery) {
        if (2PP.A00(mediaMapQuery, this.A01)) {
            this.A07 = true;
            A04();
            A03();
        }
    }

    public final void Dvc(C18657VwC vwC, C17855Vh8 vh8, MediaMapQuery mediaMapQuery) {
        if (2PP.A00(mediaMapQuery, this.A01)) {
            A04();
            WWT wwt = this.mRefinementsController;
            ArrayList A012 = A01();
            UA6 ua6 = wwt.A01;
            ua6.A00 = new C61078JwG((List) A012, 14);
            ua6.notifyDataSetChanged();
            wwt.A00.setVisibility(JTQ.A01(ua6.getItemCount()));
            A03();
        }
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [X.2tF, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        C17523VZc A032;
        MediaMapQuery mediaMapQuery;
        View view2 = view;
        super.onViewCreated(view2, bundle);
        C18657VwC vwC = C13990Tnq.A0P(this).A06;
        C19305WTn wTn = C13990Tnq.A0P(this).A04;
        AnonymousClass2tC A0S = DbV.A0S(this);
        AnonymousClass0eM r5 = this.A00;
        UserSession A0l = AnonymousClass7TE.A0l(r5);
        WUF wuf = C13990Tnq.A0P(this).A0G;
        A0S.A01(new C15797Uig(this, A0l, C13990Tnq.A0P(this).A05, C13990Tnq.A0P(this).A07, C13990Tnq.A0P(this).A09, this, wuf));
        this.mAdapter = DbU.A0U(A0S, new Object());
        A04();
        RecyclerView A0K = DbX.A0K(view2);
        this.mRecyclerView = A0K;
        boolean z = true;
        A0K.setNestedScrollingEnabled(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        this.A08 = linearLayoutManager;
        this.mRecyclerView.setLayoutManager(linearLayoutManager);
        this.mRecyclerView.setAdapter(this.mAdapter);
        RecyclerView A0I = DbT.A0I(view2, R.id.refinements_list);
        A0I.setNestedScrollingEnabled(false);
        UserSession A0l2 = AnonymousClass7TE.A0l(r5);
        ArrayList A012 = A01();
        boolean z2 = true;
        if (!A06(this)) {
            z2 = false;
        }
        this.mRefinementsController = new WWT(A0I, this, A0l2, this, A012, z2);
        RecyclerView recyclerView = this.mRecyclerView;
        UserSession A0l3 = AnonymousClass7TE.A0l(r5);
        C18062Vko vko = C13990Tnq.A0P(this).A09;
        C17896Vhn vhn = C13990Tnq.A0P(this).A05;
        C17626VbI vbI = C13990Tnq.A0P(this).A07;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0B(recyclerView, 0);
        C51974G9v.A1P(A0l3, this, vko, vhn);
        0qQ.A0B(vbI, 5);
        new C14908UEn((ViewGroup) DbW.A09(DbV.A0D(recyclerView), recyclerView, R.layout.layout_location_list_item, false), this, A0l3, vhn, vbI, vko, (LocationListFragment) null).itemView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.mActionBarHelper = new C18066Vks(view2.requireViewById(R.id.action_bar), AnonymousClass7TE.A0l(r5));
        this.mEmptyStateView = view2.requireViewById(R.id.location_empty_state_view);
        View requireViewById = view2.requireViewById(R.id.location_explore_all_link);
        this.mExploreAllLink = requireViewById;
        WB8.A00(requireViewById, 54, this);
        A03();
        vwC.A06.add(this);
        wTn.A09.add(this);
        if (this.A00 != LocationListFragmentMode.QUERY_LIST || (mediaMapQuery = this.A01) == null || !vwC.A05.contains(mediaMapQuery)) {
            z = false;
        }
        this.A07 = z;
        A04();
        A03();
        WBX.A00(view2, 6, this);
        C18663VwL vwL = C13990Tnq.A0P(this).mMapViewController;
        if (vwL != null && (A032 = vwL.A03()) != null) {
            C13990Tnq.A0P(this).A04.A06.A01(A032);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03() {
        /*
            r5 = this;
            java.util.List r2 = A02(r5)
            com.instagram.discovery.mediamap.fragment.LocationListFragmentMode r0 = r5.A00
            int r1 = r0.ordinal()
            r4 = 0
            if (r1 == r4) goto L_0x005a
            r0 = 1
            if (r1 != r0) goto L_0x0059
            android.view.View r1 = r5.mEmptyStateView
            r0 = 8
            r1.setVisibility(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r5.mRecyclerView
            r0.setVisibility(r4)
            int r2 = r2.size()
            android.content.res.Resources r1 = X.DbV.A05(r5)
            r0 = 2131820786(0x7f1100f2, float:1.9274297E38)
            java.lang.String r2 = X.DbY.A0d(r1, r2, r0)
            X.Vks r1 = r5.mActionBarHelper
            r0 = 0
            r1.A00(r0, r0, r2)
            X.Vks r0 = r5.mActionBarHelper
            r0.A03(r4)
            X.Vks r0 = r5.mActionBarHelper
            android.widget.ImageView r1 = r0.A01
            r0 = 8
            r1.setVisibility(r0)
            X.Vks r2 = r5.mActionBarHelper
            r0 = 59
            X.WB8 r1 = new X.WB8
            r1.<init>((java.lang.Object) r5, (int) r0)
            android.widget.ImageView r0 = r2.A02
            X.AnonymousClass0fU.A00(r1, r0)
            r0.setVisibility(r4)
            X.WWT r0 = r5.mRefinementsController
            androidx.recyclerview.widget.RecyclerView r1 = r0.A00
            r0 = 8
            r1.setVisibility(r0)
        L_0x0059:
            return
        L_0x005a:
            boolean r0 = A06(r5)
            if (r0 == 0) goto L_0x0064
            A05(r5, r2)
            return
        L_0x0064:
            boolean r0 = r5.A07
            r3 = 8
            if (r0 == 0) goto L_0x00ac
            android.view.View r0 = r5.mEmptyStateView
            r0.setVisibility(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r5.mRecyclerView
            r0.setVisibility(r4)
            X.WWT r0 = r5.mRefinementsController
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
        L_0x0078:
            r0.setVisibility(r3)
        L_0x007b:
            com.instagram.discovery.mediamap.intf.MediaMapQuery r0 = r5.A01
            if (r0 == 0) goto L_0x0094
            java.lang.String r2 = r0.A00
            if (r2 != 0) goto L_0x0087
            java.lang.String r2 = r0.A00()
        L_0x0087:
            X.Vks r1 = r5.mActionBarHelper
            r0 = 0
            r1.A00(r0, r0, r2)
            com.instagram.discovery.mediamap.intf.MediaMapQuery r0 = r5.A01
            java.util.List r0 = r0.A03
            X.JTR.A1T(r5, r0)
        L_0x0094:
            X.Vks r0 = r5.mActionBarHelper
            r0.A03(r4)
            boolean r0 = r5.A06
            X.Vks r2 = r5.mActionBarHelper
            if (r0 == 0) goto L_0x00c8
            android.widget.ImageView r0 = r2.A02
            r0.setVisibility(r3)
            X.Vks r0 = r5.mActionBarHelper
            android.widget.ImageView r0 = r0.A01
            r0.setVisibility(r3)
            return
        L_0x00ac:
            boolean r1 = r2.isEmpty()
            android.view.View r0 = r5.mEmptyStateView
            if (r1 == 0) goto L_0x00ba
            r0.setVisibility(r4)
            androidx.recyclerview.widget.RecyclerView r0 = r5.mRecyclerView
            goto L_0x0078
        L_0x00ba:
            r0.setVisibility(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r5.mRecyclerView
            r0.setVisibility(r4)
            X.WWT r0 = r5.mRefinementsController
            r0.A00()
            goto L_0x007b
        L_0x00c8:
            r0 = 57
            X.WB8 r1 = new X.WB8
            r1.<init>((java.lang.Object) r5, (int) r0)
            android.widget.ImageView r0 = r2.A02
            X.AnonymousClass0fU.A00(r1, r0)
            r0.setVisibility(r4)
            android.content.Context r1 = r5.requireContext()
            r0 = 2131238766(0x7f081f6e, float:1.809382E38)
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)
            android.content.Context r1 = r5.requireContext()
            android.content.Context r0 = r5.requireContext()
            int r0 = X.2Yu.A0B(r0)
            X.DbX.A11(r1, r3, r0)
            X.Vks r2 = r5.mActionBarHelper
            r0 = 58
            X.WB8 r1 = new X.WB8
            r1.<init>((java.lang.Object) r5, (int) r0)
            android.widget.ImageView r0 = r2.A01
            r0.setImageDrawable(r3)
            X.AnonymousClass0fU.A00(r1, r0)
            r0.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.discovery.mediamap.fragment.LocationListFragment.A03():void");
    }

    private void A04() {
        ArrayList arrayList;
        List A022 = A02(this);
        if (A022 != null) {
            arrayList = new ArrayList(A022);
        }
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        int i = 0;
        if (this.A07) {
            do {
                viewModelListUpdate.A00(new C19261WRu());
                i++;
            } while (i < 10);
        } else {
            while (i < arrayList.size()) {
                viewModelListUpdate.A00(new C19265WRy(i, C18231Vnv.A01((MediaMapPin) arrayList.get(i))));
                i++;
            }
        }
        this.mAdapter.A05(viewModelListUpdate);
    }

    public final void A09(MediaMapPin mediaMapPin, Reel reel, AnonymousClass3N3 r8, boolean z) {
        AnonymousClass3BQ r0;
        Dba.A0F(this).A09(C13990Tnq.A0P(this).A0E, mediaMapPin, "discovery_map_location_list", true);
        AnonymousClass32A r4 = this.A09;
        r4.A05 = new C16165Upq((Activity) requireActivity(), r8.AeG(), (C230222pE) new C19490Wac(this, z));
        r4.A0C = this.A0A;
        if (z) {
            r0 = AnonymousClass3BQ.MAP_NEIGHBORHOOD;
        } else {
            r0 = AnonymousClass3BQ.MAP_BOTTOM_SHEET;
        }
        r4.A03(reel, r0, r8);
    }

    public final boolean onBackPressed() {
        C13990Tnq.A0P(this).A0I(this.A00);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.instagram.discovery.mediamap.intf.MediaMapQuery} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: com.instagram.discovery.mediamap.intf.MediaMapQuery} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: com.instagram.discovery.mediamap.intf.MediaMapQuery} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = -2130605310(0xffffffff81018b02, float:-2.379329E-38)
            int r3 = X.AnonymousClass0fD.A02(r0)
            com.instagram.discovery.mediamap.fragment.LocationListFragment.super.onCreate(r6)
            android.os.Bundle r4 = r5.requireArguments()
            java.lang.String r0 = "arg_list_mode"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            com.instagram.discovery.mediamap.fragment.LocationListFragmentMode r0 = (com.instagram.discovery.mediamap.fragment.LocationListFragmentMode) r0
            r5.A00 = r0
            java.lang.String r0 = "arg_disallow_navigation_and_search"
            boolean r0 = r4.getBoolean(r0)
            r5.A06 = r0
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            r5.A0A = r0
            X.0eM r0 = r5.A00
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.328 r1 = new X.328
            r1.<init>(r5)
            X.32A r0 = new X.32A
            r0.<init>(r5, r2, r1)
            r5.A09 = r0
            com.instagram.discovery.mediamap.fragment.LocationListFragmentMode r0 = r5.A00
            r0.getClass()
            com.instagram.discovery.mediamap.fragment.LocationListFragmentMode r0 = r5.A00
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x005b
            r0 = 1
            if (r1 != r0) goto L_0x0054
            java.lang.String r0 = "arg_map_pins"
            java.util.ArrayList r0 = r4.getParcelableArrayList(r0)
            r5.A05 = r0
        L_0x0051:
            r0.getClass()
        L_0x0054:
            r0 = 541415708(0x2045591c, float:1.6716033E-19)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x005b:
            java.lang.String r0 = "arg_query"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            com.instagram.discovery.mediamap.intf.MediaMapQuery r0 = (com.instagram.discovery.mediamap.intf.MediaMapQuery) r0
            r5.A01 = r0
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.discovery.mediamap.fragment.LocationListFragment.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1306612777);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_location_list);
        AnonymousClass0fD.A09(-1536268001, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(292312443);
        super.onDestroyView();
        C13990Tnq.A0P(this).A06.A06.remove(this);
        C13990Tnq.A0P(this).A04.A09.remove(this);
        LocationListFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(1719371519, A022);
    }
}
