package X;

import android.location.Location;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ugy  reason: case insensitive filesystem */
public final class C15693Ugy extends C252233om implements C20898X3p {
    public Location A00;
    public GXC A01;
    public MediaMapPin A02;
    public C14227TsA A03;
    public C14074TpO A04;
    public HAI A05;
    public WW4 A06;
    public AnonymousClass2uE A07;
    public C55941Hq5 A08;
    public C18621VvE A09;
    public boolean A0A;
    public 2el A0B;
    public LocationDetailFragment A0C;
    public C19734Web A0D;
    public WUF A0E;
    public boolean A0F;
    public final FragmentActivity A0G;
    public final AnonymousClass4DH A0H;
    public final UserSession A0I;
    public final LocationDetailFragment A0J;
    public final String A0K;
    public final Map A0L;
    public final AnonymousClass07i A0M;
    public final C320326sC A0N = new WP0(this);
    public final C17772Vfj A0O;
    public final LocationDetailFragment A0P;
    public final AnonymousClass4DU A0Q;
    public final List A0R = new ArrayList();
    public final Map A0S = new HashMap();

    /* JADX WARNING: type inference failed for: r19v3, types: [X.2s5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v6, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v11, types: [X.2tF, java.lang.Object] */
    public static void A00(Location location, C15693Ugy ugy, boolean z) {
        C232232tF egg;
        C15693Ugy ugy2 = ugy;
        List list = ugy2.A0R;
        list.clear();
        Map map = ugy2.A0S;
        map.clear();
        ugy2.A0A = z;
        ugy2.A00 = location;
        C16672Uz8 uz8 = C16672Uz8.TOP;
        FragmentActivity fragmentActivity = ugy2.A0G;
        list.add(new C18479VsV(uz8, fragmentActivity.getString(2131975492), fragmentActivity.getString(2131963291)));
        C16672Uz8 uz82 = C16672Uz8.RECENT;
        list.add(new C18479VsV(uz82, fragmentActivity.getString(2131971353), fragmentActivity.getString(2131963292)));
        UserSession userSession = ugy2.A0I;
        0Tu r7 = 0Tu.A05;
        if (182.A06(r7, userSession, 36315056589245392L)) {
            list.add(new C18479VsV(C16672Uz8.CLIPS, fragmentActivity.getString(2131955518), fragmentActivity.getString(2131955518)));
        }
        LocationPageInformation locationPageInformation = ugy2.A02.A06;
        if (!(locationPageInformation == null || locationPageInformation.A00() == null || !182.A06(r7, userSession, 36315821093424696L))) {
            list.add(new C18479VsV(C16672Uz8.ACCOUNT, fragmentActivity.getString(2131952098), fragmentActivity.getString(2131952099)));
        }
        AnonymousClass4DU r9 = ugy2.A0Q;
        String str = ugy2.A0K;
        X9Q A002 = C16942VBu.A00(fragmentActivity, userSession, r9, str, -1, false, true);
        2el A0k = C51969G9p.A0k();
        ugy2.A0B = A0k;
        ugy2.A08 = new C55941Hq5(A0k, new C56524Hzv(r9, userSession, (JPM) null, (C17266VOt) null, str));
        ugy2.A0D = new C19734Web(ugy2);
        List A003 = VBO.A00(list);
        C19734Web web = ugy2.A0D;
        HAI A012 = HAI.A01(userSession, uz8, new C19358WVz(ugy2), new C3253572b(), web, A003);
        ugy2.A05 = A012;
        C15942UlC ulC = new C15942UlC(ugy2, 0);
        ugy2.A06 = ulC;
        AnonymousClass4DH r6 = ugy2.A0H;
        WW5 ww5 = new WW5(ugy2, 0);
        C14075TpP tpP = new C14075TpP();
        DbZ.A0t(1, r6, userSession, r9);
        UserSession userSession2 = userSession;
        AnonymousClass4DH r17 = r6;
        AnonymousClass2tC A004 = C14370Tuz.A00(DbT.A06(r6, str, 9), r17, userSession2, new Object(), tpP, ulC, A012, ww5, A002, r9, (C55972Hqd) null, str, false, false);
        A004.A01(new Object());
        if (ugy2.A0F) {
            egg = new EGH(r6, r9, userSession, ugy2.A0C);
        } else {
            egg = new EGG(r9, userSession, ugy2.A0P, ugy2.A0E);
        }
        A004.A01(egg);
        A004.A01(new C15771UiG(userSession, ugy2.A0O));
        A004.A01(new C15754Uhz(ugy2));
        A004.A01(new Object());
        WW5 ww52 = new WW5(ugy2, 0);
        A004.A01(new C68582NOe(ugy2.A0N, r6, userSession, ugy2.A05, ww52));
        C19734Web web2 = ugy2.A0D;
        HAI hai = ugy2.A05;
        AnonymousClass7TG.A1Q(web2, hai);
        ugy2.A03 = new C14227TsA(fragmentActivity, r9, A004, userSession, hai, (AnonymousClass2tR) null, (C14369Tuy) null, (GAC) null, (2bv) null, web2, false, false);
        C14385TvE tvE = new C14385TvE(userSession);
        tvE.A01(new C19355WVw(ugy2, 0));
        C14227TsA tsA = ugy2.A03;
        0qQ.A0B(tsA, 0);
        tvE.A06 = tsA;
        HAI hai2 = ugy2.A05;
        0qQ.A0B(hai2, 0);
        tvE.A08 = hai2;
        tvE.A0A = A002;
        tvE.A04 = r6;
        tvE.A02(AnonymousClass32Q.A00);
        tvE.A0N = false;
        tvE.A00(ugy2.A0B);
        tvE.A0I = true;
        ugy2.A04 = new C14074TpO(tvE);
        String A013 = C18231Vnv.A01(ugy2.A02);
        AnonymousClass07i r4 = ugy2.A0M;
        map.put(uz8, new C17658Vbo(userSession, uz8, new C324356z9(fragmentActivity, r4, userSession), (VW4) null, A013, AnonymousClass7TF.A0b(), (String) null, true));
        String A014 = C18231Vnv.A01(ugy2.A02);
        map.put(uz82, new C17658Vbo(userSession, uz82, new C324356z9(fragmentActivity, r4, userSession), (VW4) null, A014, AnonymousClass7TF.A0b(), (String) null, true));
        C16672Uz8 uz83 = C16672Uz8.CLIPS;
        String A015 = C18231Vnv.A01(ugy2.A02);
        UserSession userSession3 = userSession;
        map.put(uz83, new C17658Vbo(userSession3, uz83, new C324356z9(fragmentActivity, r4, userSession), (VW4) null, A015, AnonymousClass7TF.A0b(), (String) null, true));
        MediaMapPin mediaMapPin = ugy2.A02;
        LocationPageInformation locationPageInformation2 = mediaMapPin.A06;
        if (!(locationPageInformation2 == null || locationPageInformation2.A00() == null)) {
            C16672Uz8 uz84 = C16672Uz8.ACCOUNT;
            String A016 = C18231Vnv.A01(mediaMapPin);
            map.put(uz84, new C17658Vbo(userSession3, uz84, new C324356z9(fragmentActivity, r4, userSession), (VW4) null, A016, AnonymousClass7TF.A0b(), ugy2.A02.A06.A00().getId(), true));
        }
        ugy2.A09 = new C18621VvE(fragmentActivity, r4, userSession3, (C20956X6j) null, (DQw) null, new C19428WYx(ugy2), (C20957X6k) null, C18231Vnv.A01(ugy2.A02), map, true);
        ugy2.A04.A05(r6.requireView(), C51973G9u.A1X(C18621VvE.A00(ugy2.A09, ugy2.A05.A00).A04));
        C14074TpO.A00(ugy2.A04, false, true);
        ugy2.A04.A06(ugy2.A0D);
        ugy2.A05.A07(uz8, true);
        ugy2.A09.A01(ugy2.A05.A00, true, false);
        List A13 = C66580MXl.A13(uz8, ugy2.A0L);
        A01(uz8, ugy2, A13);
        if (A13 != null) {
            ugy2.A05.A06(uz8, A13);
        }
        AnonymousClass2uE r10 = new AnonymousClass2uE(fragmentActivity, r6, r6.getParentFragmentManager(), userSession3, r9, ugy2.A04.A0E, (C249763kK) null, false);
        ugy2.A07 = r10;
        r6.registerLifecycleListener(r10);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.5ts, java.lang.Object] */
    public static void A01(C16672Uz8 uz8, C15693Ugy ugy, List list) {
        boolean z;
        MediaMapPin mediaMapPin = ugy.A02;
        LocationPageInformation locationPageInformation = mediaMapPin.A06;
        User user = null;
        if (locationPageInformation == null) {
            z = false;
        } else {
            user = locationPageInformation.A00();
            z = locationPageInformation.A0C;
        }
        ArrayList arrayList = new ArrayList();
        boolean z2 = ugy.A0F;
        if (!z2) {
            arrayList.add(new C15814Uix(mediaMapPin));
        }
        if (user != null) {
            C18231Vnv.A00(mediaMapPin.A09);
            arrayList.add(new FYT(user, C18231Vnv.A00(ugy.A02.A09).A04(), z));
        }
        if (z2) {
            arrayList.add(new C15814Uix(ugy.A02));
        }
        List list2 = ugy.A0R;
        ? obj = new Object();
        obj.A02 = list2;
        obj.A00 = uz8;
        arrayList.add(obj);
        if (!C51973G9u.A1X(C18621VvE.A00(ugy.A09, ugy.A05.A00).A04) && (list == null || list.isEmpty())) {
            arrayList.add(new Object());
        }
        ugy.A05.A08(arrayList);
    }

    public static void A02(C15693Ugy ugy, boolean z) {
        if (C51973G9u.A1X(C18621VvE.A00(ugy.A09, ugy.A05.A00).A04)) {
            return;
        }
        if (ugy.A09.A02(ugy.A05.A00) || z) {
            ugy.A09.A01(ugy.A05.A00, false, false);
        }
    }

    public final void DqC(C16672Uz8 uz8) {
        W3Q A0F2;
        MediaMapPin mediaMapPin;
        MediaMapQuery mediaMapQuery;
        String str;
        if (uz8 == C16672Uz8.TOP) {
            LocationDetailFragment locationDetailFragment = this.A0J;
            A0F2 = Dba.A0F(locationDetailFragment);
            mediaMapPin = locationDetailFragment.A03;
            mediaMapQuery = locationDetailFragment.A02;
            str = "instagram_map_location_detail_tap_top";
        } else if (uz8 == C16672Uz8.RECENT) {
            LocationDetailFragment locationDetailFragment2 = this.A0J;
            A0F2 = Dba.A0F(locationDetailFragment2);
            mediaMapPin = locationDetailFragment2.A03;
            mediaMapQuery = locationDetailFragment2.A02;
            str = "instagram_map_location_detail_tap_recent";
        } else {
            if (uz8 == C16672Uz8.ACCOUNT) {
                LocationDetailFragment locationDetailFragment3 = this.A0J;
                A0F2 = Dba.A0F(locationDetailFragment3);
                mediaMapPin = locationDetailFragment3.A03;
                mediaMapQuery = locationDetailFragment3.A02;
                str = "instagram_map_location_detail_tap_account";
            }
            this.A05.A07(uz8, true);
            A01(uz8, this, C66580MXl.A13(uz8, this.A0L));
        }
        DbZ.A1a(mediaMapQuery, A0F2, mediaMapPin, str);
        this.A05.A07(uz8, true);
        A01(uz8, this, C66580MXl.A13(uz8, this.A0L));
    }

    public C15693Ugy(Location location, FragmentActivity fragmentActivity, AnonymousClass07i r4, AnonymousClass4DH r5, UserSession userSession, C17772Vfj vfj, LocationDetailFragment locationDetailFragment, LocationDetailFragment locationDetailFragment2, LocationDetailFragment locationDetailFragment3, WUF wuf, MediaMapPin mediaMapPin, AnonymousClass4DU r13, boolean z, boolean z2) {
        this.A0G = fragmentActivity;
        this.A0I = userSession;
        this.A0F = z2;
        this.A0H = r5;
        this.A0Q = r13;
        this.A0M = r4;
        this.A02 = mediaMapPin;
        this.A0K = AnonymousClass7TF.A0b();
        this.A0L = new HashMap();
        this.A0P = locationDetailFragment;
        this.A0J = locationDetailFragment2;
        this.A0O = vfj;
        this.A0E = wuf;
        this.A0C = locationDetailFragment3;
        A00(location, this, z);
    }
}
