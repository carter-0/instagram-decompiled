package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.android.maps.model.LatLng;
import com.facebook.maps.delegate.common.interfaces.MapOptions;
import com.facebook.maps.ttrc.common.MapboxTTRC;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

public abstract class UZB extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "DirectLocationSharingMapBaseFragment";
    public VZ8 A00;
    public T6B A01;
    public U4T A02;
    public C14634Tzg A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0I = DbX.A0I(view, R.id.map_container);
        Context requireContext = requireContext();
        MapOptions mapOptions = new MapOptions();
        mapOptions.A05 = C16652Uyo.MAPBOX;
        if (this instanceof C15929Uku) {
            str = "igd_pinned_location_xma";
        } else if (this instanceof C15931Ukw) {
            str = "igd_composer";
        } else {
            str = "igd_live_location_xma";
        }
        mapOptions.A08 = str;
        AnonymousClass0eM r4 = this.A04;
        mapOptions.A07 = 182.A04(0Tu.A05, DbT.A0X(r4), 36875047310262334L);
        mapOptions.A03 = C69419Nl1.BOTTOM_LEFT;
        mapOptions.A0A = AnonymousClass1GD.A03();
        U4T u4t = new U4T(requireContext, mapOptions);
        this.A02 = u4t;
        A0I.addView(u4t);
        U4T u4t2 = this.A02;
        if (u4t2 != null) {
            u4t2.A05(AnonymousClass7TE.A0l(r4));
        }
        U4T u4t3 = this.A02;
        if (u4t3 != null) {
            u4t3.A03(bundle);
        }
        U4T u4t4 = this.A02;
        if (u4t4 != null) {
            u4t4.A04(new WIS((Object) this, 2));
        }
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C46570DhC(obj, i));
    }

    public final void A03() {
        VZ8 vz8;
        T6B t6b = this.A01;
        if (t6b != null) {
            Location A002 = t6b.A00(__redex_internal_original_name);
            if (A002 != null) {
                A04(A002.getLatitude(), A002.getLongitude());
                C14634Tzg tzg = this.A03;
                if (tzg != null && (vz8 = this.A00) != null) {
                    vz8.A01.A0A(tzg);
                    return;
                }
                return;
            }
            return;
        }
        0qQ.A0F("locationManager");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A04(double d, double d2) {
        LatLng latLng = new LatLng(d, d2);
        VZ8 vz8 = this.A00;
        if (vz8 != null) {
            C18580VuW.A00(vz8.A01, latLng, 17.0f);
        }
    }

    public final void A05(ImageUrl imageUrl, double d, double d2) {
        VZ8 vz8 = this.A00;
        if (vz8 != null) {
            WFU wfu = vz8.A01;
            0nA.A04(wfu.A0G, 64);
            vz8.A01.A0A(new C16076Uo3((Drawable) null, (C19879Wh8) null, wfu, imageUrl, (C20958X6l) null, "unused_media_id", (String) null, (String) null, d, d2, AnonymousClass1GB.A01(0nA.A04(requireActivity(), 50)), false, false, false));
        }
    }

    public void A06(VZ8 vz8) {
        this.A00 = vz8;
        C14634Tzg tzg = new C14634Tzg(requireContext(), vz8.A01, new WZ0(this));
        this.A03 = tzg;
        VZ8 vz82 = this.A00;
        if (vz82 != null) {
            vz82.A01.A0A(tzg);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1337670918);
        UZB.super.onCreate(bundle);
        this.A01 = new T6B(requireContext(), AnonymousClass7TE.A0l(this.A04));
        AnonymousClass0fD.A09(-1279239974, A022);
    }

    public void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1969338000);
        super.onDestroyView();
        U4T u4t = this.A02;
        if (u4t != null) {
            u4t.A00();
        }
        this.A02 = null;
        this.A03 = null;
        AnonymousClass0fD.A09(-1344481936, A022);
    }

    public void onPause() {
        int A022 = AnonymousClass0fD.A02(1499793401);
        UZB.super.onPause();
        U4T u4t = this.A02;
        if (!(u4t == null || u4t.A01 == null)) {
            MapboxTTRC.cancel(C66579MXk.A00(352));
        }
        AnonymousClass0fD.A09(222053406, A022);
    }

    public void onResume() {
        int A022 = AnonymousClass0fD.A02(-1946123857);
        super.onResume();
        U4T u4t = this.A02;
        if (u4t != null) {
            u4t.A01();
        }
        AnonymousClass0fD.A09(1776270509, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1204294490);
        UZB.super.onStart();
        U4T u4t = this.A02;
        if (u4t != null) {
            u4t.A02();
        }
        AnonymousClass0fD.A09(-738251718, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-916688495);
        UZB.super.onStop();
        AnonymousClass0fD.A09(928538707, A022);
    }
}
