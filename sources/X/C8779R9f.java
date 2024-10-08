package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.proxygen.LigerSamplePolicy;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzay;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.R9f  reason: case insensitive filesystem */
public final class C8779R9f extends C252233om implements C252243on, AnonymousClass63y, AnonymousClass640 {
    public AnonymousClass63S A00;
    public boolean A01 = false;
    public C10545Rtz A02;
    public final Activity A03;
    public final S0M A04;
    public final C10399Rrb A05;
    public final C13673Tei A06;
    public final String A07;
    public final String A08;

    public final void D5e(Bundle bundle) {
    }

    public final void D5q(int i) {
    }

    public C8779R9f(Activity activity, UserSession userSession, C13673Tei tei, String str, String str2) {
        Activity activity2 = activity;
        this.A03 = activity2;
        this.A06 = tei;
        this.A08 = str;
        this.A07 = str2;
        AnonymousClass63K r8 = null;
        HashSet A1F = AnonymousClass7TE.A1F();
        HashSet A1F2 = AnonymousClass7TE.A1F();
        0yf A0N = Pxe.A0N(0);
        01r r3 = new 01r(0);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
        AnonymousClass63I r20 = C10134RnB.A00;
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Looper mainLooper = activity2.getMainLooper();
        String packageName = activity2.getPackageName();
        String A0y = C66581MXm.A0y(activity2);
        A1C.add(this);
        A1C2.add(this);
        AnonymousClass63K r1 = LocationServices.A00;
        AnonymousClass3Qk.A03(r1, "Api must not be null");
        r3.put(r1, (Object) null);
        AnonymousClass3Qk.A03(r1.A00, "Base client builder must not be null");
        List emptyList = Collections.emptyList();
        A1F2.addAll(emptyList);
        A1F.addAll(emptyList);
        AnonymousClass3Qk.A08(!r3.isEmpty(), "must call addApi() to add at least one API");
        AnonymousClass642 r0 = AnonymousClass642.A00;
        AnonymousClass63K r12 = C10134RnB.A04;
        AnonymousClass643 r21 = new AnonymousClass643(r3.containsKey(r12) ? (AnonymousClass642) r3.get(r12) : r0, packageName, A0y, A0N, A1F);
        Map map = r21.A04;
        Map A0N2 = Pxe.A0N(0);
        Map A0N3 = Pxe.A0N(0);
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        for (AnonymousClass63K r10 : r3.keySet()) {
            Object obj = r3.get(r10);
            boolean A1V = AnonymousClass7TF.A1V(map.get(r10));
            JTP.A1R(r10, A0N2, A1V);
            Sx8 sx8 = new Sx8(r10, A1V);
            A1C3.add(sx8);
            AnonymousClass63I r9 = r10.A00;
            AnonymousClass3Qk.A02(r9);
            AnonymousClass647 A002 = r9.A00(activity2, mainLooper, sx8, sx8, r21, obj);
            A0N3.put(r10.A01, A002);
            if (A002.E57()) {
                if (r8 == null) {
                    r8 = r10;
                } else {
                    throw Pxg.A0e(r10.A02, " cannot be used with ", r8.A02);
                }
            }
        }
        if (r8 != null) {
            Object[] objArr = {r8.A02};
            if (!A1F.equals(A1F2)) {
                throw Pxf.A0Y("Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", objArr);
            }
        }
        Activity activity3 = activity2;
        AnonymousClass643 r212 = r21;
        ArrayList arrayList = A1C3;
        QpU qpU = new QpU(activity3, mainLooper, googleApiAvailability, r20, r212, arrayList, A1C, A1C2, A0N2, A0N3, new ReentrantLock(), -1, QpU.A00(A0N3.values(), true));
        Set set = AnonymousClass63S.A00;
        synchronized (set) {
            set.add(qpU);
        }
        this.A00 = qpU;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        this.A05 = ((C10307Rq5) userSession2.A01(C10307Rq5.class, new C73662Phb(userSession2, 43))).A00;
        this.A04 = ((C10306Rq4) userSession2.A01(C10306Rq4.class, new C73662Phb(userSession2, 42))).A00;
    }

    public final C10545Rtz A01() {
        C10545Rtz rtz = this.A02;
        if (rtz != null) {
            return rtz;
        }
        C10545Rtz rtz2 = new C10545Rtz(this.A07, AnonymousClass7TF.A0c(), this.A08);
        this.A02 = rtz2;
        return rtz2;
    }

    public final void A02() {
        if (!this.A01) {
            C10399Rrb rrb = this.A05;
            C10545Rtz A012 = A01();
            Map map = rrb.A01;
            map.put(Dbq.A01(), A012.A01);
            map.put("source", A012.A02);
            map.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A012.A00);
            map.put("location_service_always", "unset");
            S0M s0m = this.A04;
            s0m.A00.A00("gms_ls_upsell_requested", new TSU(s0m, A00(this)), "gms_ls_upsell");
            AnonymousClass63S r4 = this.A00;
            r4.A08();
            LocationRequest locationRequest = new LocationRequest();
            locationRequest.A00(10000);
            locationRequest.A07 = true;
            locationRequest.A04 = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
            locationRequest.A01 = 100;
            ArrayList A1C = AnonymousClass7TE.A1C();
            A1C.add(locationRequest);
            C8369QpY qpY = new C8369QpY(r4, new LocationSettingsRequest((zzay) null, A1C, true, false));
            r4.A06(qpY);
            SxF sxF = new SxF(this);
            synchronized (qpY.A07) {
                AnonymousClass3Qk.A09(!qpY.A0C, "Result has already been consumed.");
                if (!qpY.A02) {
                    if (AnonymousClass7TF.A1Q((qpY.A0A.getCount() > 0 ? 1 : (qpY.A0A.getCount() == 0 ? 0 : -1)))) {
                        AnonymousClass7TE.A1S(qpY.A06, Pxe.A0K(sxF, BasePendingResult.A00(qpY)), 1);
                    } else {
                        qpY.A00 = sxF;
                    }
                }
            }
        }
    }

    public final void D5m(ConnectionResult connectionResult) {
        this.A06.D1W(AnonymousClass05K.A0Y);
        this.A04.A00(A00(this), "UNKNOWN_FAILURE");
        this.A05.A01.clear();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Integer num;
        C10399Rrb rrb;
        String str;
        String str2;
        if (this.A01 && i == 5005) {
            this.A01 = false;
            if (i2 == -1) {
                num = AnonymousClass05K.A00;
                rrb = this.A05;
                str = "ls_dialog_click";
            } else {
                num = AnonymousClass05K.A01;
                rrb = this.A05;
                str = "ls_dialog_dismiss";
            }
            Map map = rrb.A01;
            if ("local_search".equals(map.get("source"))) {
                rrb.A00.A00(str, new TSU(rrb, map), "browse");
            }
            this.A06.D1W(num);
            S0M s0m = this.A04;
            String A002 = A00(this);
            if (num.intValue() != 0) {
                str2 = "DIALOG_CANCEL";
            } else {
                str2 = "DIALOG_SUCCESS";
            }
            s0m.A00(A002, str2);
            map.clear();
        }
    }

    public static String A00(C8779R9f r9f) {
        if (TextUtils.isEmpty(r9f.A01().A02)) {
            return "surface_location_upsell_fragment";
        }
        return r9f.A01().A02;
    }
}
