package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ViewGroup;
import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;
import com.facebook.android.maps.model.LatLngBounds;
import com.facebook.maps.delegate.common.interfaces.MapOptions;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.MapBottomSheetController;
import java.lang.ref.Reference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.VwL  reason: case insensitive filesystem */
public final class C18663VwL {
    public VZ8 A00;
    public C18016Vjs A01;
    public final Context A02;
    public final X8V A03;
    public final U4T A04;
    public final X8W A05;
    public final X8X A06;
    public final ViewGroup A07;
    public final UserSession A08;

    public final C14955UGt A05(XCL xcl) {
        0qQ.A0B(xcl, 0);
        C18016Vjs vjs = this.A01;
        if (vjs != null) {
            WFA wfa = vjs.A08;
            Reference reference = (Reference) wfa.A01.get(xcl.getId());
            if (reference == null) {
                return null;
            }
            return (C14955UGt) reference.get();
        }
        throw AnonymousClass7TE.A0y();
    }

    public final HashSet A06(Set set) {
        Object obj;
        0qQ.A0B(set, 0);
        C18016Vjs vjs = this.A01;
        if (vjs != null) {
            WFA wfa = vjs.A08;
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) wfa.A01.get(((C20944X5n) it.next()).getId());
                if (!(reference == null || (obj = reference.get()) == null)) {
                    hashSet.add(obj);
                }
            }
            return hashSet;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A0B(double d, double d2, float f) {
        A0C(d, d2, f, 300, false);
    }

    public final void A0D(float f) {
        VZ8 vz8 = this.A00;
        if (vz8 != null) {
            CameraPosition A022 = vz8.A01.A02();
            if (f != 0.0f) {
                LatLng latLng = A022.A03;
                0qQ.A06(latLng);
                WFU wfu = vz8.A01;
                double sin = Math.sin((latLng.A00 * 3.141592653589793d) / 180.0d);
                double log = 0.5d - (Math.log((sin + 1.0d) / (1.0d - sin)) / 12.566370614359172d);
                C14723U4m u4m = wfu.A0I;
                float f2 = ((float) u4m.A0K) * u4m.A0C;
                LatLng latLng2 = new LatLng(C13990Tnq.A00(log + ((double) (f / f2))), ((((latLng.A01 + 180.0d) / 360.0d) + ((double) (0.0f / f2))) * 360.0d) - 180.0d);
                C18580VuW vuW = new C18580VuW();
                vuW.A08 = latLng2;
                wfu.A09(vuW, (X29) null, 0);
            }
        }
    }

    public final void A0G(Set set) {
        0qQ.A0B(set, 0);
        C18016Vjs vjs = this.A01;
        if (vjs != null) {
            vjs.A01 = set;
            vjs.A08.A00.A01(set);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A0H(float[] fArr, double d, double d2) {
        float[] fArr2 = fArr;
        0qQ.A0B(fArr, 2);
        VZ8 vz8 = this.A00;
        if (vz8 != null) {
            vz8.A01.A0J.A06(fArr2, W2R.A01(d2), W2R.A00(d));
        }
    }

    public static void A00(MapBottomSheetController mapBottomSheetController, C18663VwL vwL) {
        vwL.A0D((((float) mapBottomSheetController.mContainer.getHeight()) / 2.0f) - (((float) mapBottomSheetController.A00) + mapBottomSheetController.A03));
    }

    public final float A01() {
        VZ8 vz8 = this.A00;
        if (vz8 == null) {
            return 0.0f;
        }
        return vz8.A01.A02().A02;
    }

    public final C17367VSu A02() {
        VZ8 vz8 = this.A00;
        if (vz8 == null) {
            return null;
        }
        C14723U4m u4m = vz8.A01.A0I;
        PointF pointF = new PointF(((float) u4m.A0G) / 2.0f, ((float) u4m.A0E) / 2.0f);
        LatLng A002 = new C18541Vtt(vz8.A01).A00(pointF.x, pointF.y);
        return new C17367VSu(A002.A00, A002.A01);
    }

    public final C17523VZc A03() {
        VZ8 vz8 = this.A00;
        if (vz8 == null) {
            return null;
        }
        WFU wfu = vz8.A01;
        C18541Vtt vtt = new C18541Vtt(wfu);
        C14723U4m u4m = wfu.A0I;
        int i = u4m.A0G;
        int i2 = u4m.A0E;
        return C17005VEf.A00(new PointF(((float) i) / 2.0f, ((float) i2) / 2.0f), vtt, i, i2);
    }

    public final C17523VZc A04(Rect rect) {
        VZ8 vz8 = this.A00;
        if (vz8 == null) {
            return null;
        }
        return C17005VEf.A00(new PointF(rect.exactCenterX(), rect.exactCenterY()), new C18541Vtt(vz8.A01), rect.width(), rect.height());
    }

    public final Set A07() {
        C18016Vjs vjs = this.A01;
        if (vjs != null) {
            Set set = vjs.A01;
            if (set == null) {
                set = Collections.emptySet();
            }
            0qQ.A07(set);
            return set;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A08() {
        C18016Vjs vjs = this.A01;
        if (vjs != null) {
            vjs.A05.A01.A0A(new C14634Tzg(vjs.A02, vjs.A03, new WZ1(vjs)));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A09() {
        C18016Vjs vjs = this.A01;
        if (vjs != null) {
            vjs.A04.A0H();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A0A(double d, double d2) {
        VZ8 vz8 = this.A00;
        if (vz8 != null) {
            LatLng latLng = new LatLng(d, d2);
            WFU wfu = vz8.A01;
            C18580VuW vuW = new C18580VuW();
            vuW.A08 = latLng;
            wfu.A09(vuW, (X29) null, 300);
        }
    }

    public final void A0C(double d, double d2, float f, int i, boolean z) {
        VZ8 vz8 = this.A00;
        if (vz8 != null) {
            LatLng latLng = new LatLng(d, d2);
            if (z) {
                WFU wfu = vz8.A01;
                C18580VuW vuW = new C18580VuW();
                vuW.A08 = latLng;
                vuW.A03 = f;
                wfu.A09(vuW, (X29) null, i);
                return;
            }
            C18580VuW.A00(vz8.A01, latLng, f);
        }
    }

    public final void A0E(Bundle bundle) {
        ViewGroup viewGroup = this.A07;
        U4T u4t = this.A04;
        viewGroup.addView(u4t);
        u4t.A05(this.A08);
        u4t.A03(bundle);
        u4t.A04(new WIS((Object) this, 3));
    }

    public final void A0F(Collection collection, float f, int i, int i2, int i3, boolean z) {
        VZ8 vz8 = this.A00;
        VZ8 vz82 = vz8;
        if (vz8 != null) {
            U4T u4t = this.A04;
            int width = u4t.getWidth();
            int height = u4t.getHeight();
            if (!collection.isEmpty()) {
                double d = 0.0d;
                double d2 = 0.0d;
                double d3 = 0.0d;
                double d4 = 0.0d;
                boolean z2 = false;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C17367VSu vSu = (C17367VSu) it.next();
                    double d5 = vSu.A00;
                    double d6 = vSu.A01;
                    if (!z2) {
                        d3 = d5;
                        d2 = d5;
                        d = d6;
                        d4 = d6;
                        z2 = true;
                    }
                    if (d5 > d2) {
                        d2 = d5;
                    } else if (d5 < d3) {
                        d3 = d5;
                    }
                    double A002 = LatLngBounds.A00(d, d4);
                    double A003 = LatLngBounds.A00(d6, d4);
                    double A004 = LatLngBounds.A00(d, d6);
                    if (Double.compare(A003, A002) > 0 || Double.compare(A004, A002) > 0) {
                        if (A003 <= A004) {
                            d = d6;
                        } else {
                            d4 = d6;
                        }
                    }
                }
                LatLngBounds A005 = C18606Vuz.A00(d, d2, d3, d4);
                LatLng latLng = A005.A01;
                double d7 = latLng.A00;
                LatLng latLng2 = A005.A00;
                double d8 = latLng2.A00;
                double d9 = latLng.A01;
                double d10 = latLng2.A01;
                double d11 = ((((double) i2) * (d8 - d7)) / ((double) height)) + d8;
                double d12 = (((double) (i / 2)) * (d10 - d9)) / ((double) width);
                double d13 = d10 + d12;
                double d14 = d9 - d12;
                if (!z2) {
                    d3 = d11;
                    d2 = d11;
                    d = d13;
                    d4 = d13;
                }
                if (d11 > d2) {
                    d2 = d11;
                } else if (d11 < d3) {
                    d3 = d11;
                }
                double A006 = LatLngBounds.A00(d, d4);
                double A007 = LatLngBounds.A00(d13, d4);
                double A008 = LatLngBounds.A00(d, d13);
                if (Double.compare(A007, A006) > 0 || Double.compare(A008, A006) > 0) {
                    if (A007 <= A008) {
                        d = d13;
                    } else {
                        d4 = d13;
                    }
                }
                if (d11 > d2) {
                    d2 = d11;
                } else if (d11 < d3) {
                    d3 = d11;
                }
                double A009 = LatLngBounds.A00(d, d4);
                double A0010 = LatLngBounds.A00(d14, d4);
                double A0011 = LatLngBounds.A00(d, d14);
                if (Double.compare(A0010, A009) > 0 || Double.compare(A0011, A009) > 0) {
                    if (A0010 <= A0011) {
                        d = d14;
                    } else {
                        d4 = d14;
                    }
                }
                LatLngBounds A0012 = C18606Vuz.A00(d, d2, d3, d4);
                int A012 = AnonymousClass1GB.A01(f);
                VZ8 vz83 = vz82;
                if (z) {
                    WFU wfu = vz83.A01;
                    C18580VuW vuW = new C18580VuW();
                    vuW.A09 = A0012;
                    vuW.A07 = A012;
                    wfu.A09(vuW, (X29) null, i3);
                    return;
                }
                WFU wfu2 = vz83.A01;
                C18580VuW vuW2 = new C18580VuW();
                vuW2.A09 = A0012;
                vuW2.A07 = A012;
                wfu2.A09(vuW2, (X29) null, 0);
            }
        }
    }

    public C18663VwL(Context context, ViewGroup viewGroup, UserSession userSession, X8V x8v, X8W x8w, X8X x8x, String str, boolean z) {
        AnonymousClass7TG.A1Q(userSession, viewGroup);
        this.A02 = context;
        this.A08 = userSession;
        this.A07 = viewGroup;
        this.A03 = x8v;
        this.A05 = x8w;
        this.A06 = x8x;
        MapOptions mapOptions = new MapOptions();
        mapOptions.A05 = C16652Uyo.MAPBOX;
        mapOptions.A08 = str;
        mapOptions.A06 = "MapViewController.java";
        mapOptions.A07 = 182.A04(0Tu.A05, userSession, 36875047310262334L);
        mapOptions.A03 = C69419Nl1.BOTTOM_LEFT;
        mapOptions.A0A = z;
        this.A04 = new U4T(context, mapOptions);
    }
}
