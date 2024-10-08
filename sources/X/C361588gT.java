package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.8gT  reason: invalid class name and case insensitive filesystem */
public final class C361588gT implements AnonymousClass0iw, AnonymousClass0lh {
    public static final String __redex_internal_original_name = "MetaGalleryRepository";
    public final 2Fk A00;
    public final UserSession A01;
    public final 05G A02;
    public final 05G A03;
    public final 05G A04;
    public final AnonymousClass0Ud A05;
    public final AnonymousClass0Ud A06;
    public final AnonymousClass0Ud A07;
    public final C361598gU A08 = new Object();
    public final C361598gU A09 = new Object();

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.8gU] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.8gU] */
    public C361588gT(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        02z A012 = 106.A01(0sn.A00);
        this.A03 = A012;
        this.A06 = 10b.A03(A012);
        02z A013 = 106.A01(0Yt.A0E());
        this.A02 = A013;
        this.A05 = 10b.A03(A013);
        02z A014 = 106.A01(A00(this));
        this.A04 = A014;
        05F A032 = 10b.A03(A014);
        this.A07 = A032;
        this.A00 = C226292g8.A00(19B.A00, new C361638gY(A032));
    }

    public final void A03(String str) {
        UserSession userSession = this.A01;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36316662907343417L)) {
            this.A08.A00(new C377689Mu(this, (Object) null, str, 12), 182.A01(r2, userSession, 36598137884118119L));
            return;
        }
        A01(this, str, (0sP) null);
    }

    public final void A04(String str) {
        UserSession userSession = this.A01;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36316662907867710L)) {
            this.A09.A00(new C377689Mu(this, (Object) null, str, 13), 182.A01(r2, userSession, 36598137884642410L));
            return;
        }
        A02(this, str, (0sP) null);
    }

    public final void A05(String str, String str2, 0sP r23) {
        String str3;
        String str4;
        Iterator it = ((Iterable) this.A03.getValue()).iterator();
        while (true) {
            String str5 = null;
            str3 = str;
            str4 = str2;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (0qQ.A0K(((AnonymousClass9JL) next).A04, str3)) {
                if (next != null) {
                    C361628gX r8 = (C361628gX) ((Map) this.A02.getValue()).get(str3);
                    if (r8 == null || r8.A03) {
                        UserSession userSession = this.A01;
                        int A012 = (int) 182.A01(0Tu.A05, userSession, 36601208785473659L);
                        if (r8 != null) {
                            str5 = r8.A00;
                        }
                        1vn A013 = 1vm.A01(userSession);
                        2IS r82 = new 2IS();
                        2IS r7 = new 2IS();
                        r82.A04("albumType", str3);
                        Integer valueOf = Integer.valueOf(A012);
                        r82.A03("first", valueOf);
                        boolean z = false;
                        if (valueOf != null) {
                            z = true;
                        }
                        r82.A04("after", str5);
                        17k.A0E(z);
                        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
                        1Ef maxToleratedCacheAgeMs = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "MetaGalleryAlbumMedia", r82.getParamsCopy(), r7.getParamsCopy(), C43732C7c.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "meta_gallery", new ArrayList()).setFreshCacheAgeMs(0).setMaxToleratedCacheAgeMs(0);
                        A013.ATL(new C40119ASk(this, str4, str3, r23), new DFC(this), maxToleratedCacheAgeMs);
                        return;
                    }
                    return;
                }
            }
        }
        AnonymousClass9PQ.A08(this, this.A01, "error_logging", str4, 0Yt.A06(new 0eP[]{new 0eP("album_type", str3), new 0eP("error_message", "Media fetch called for unknown album"), new 0eP("error_type", "album_not_found"), new 0eP("is_network", "non_network")}));
    }

    public final String getModuleName() {
        return "meta_gallery_repository";
    }

    public static final C361628gX A00(C361588gT r13) {
        ArrayList arrayList;
        C361618gW r6 = C361608gV.A00;
        UserSession userSession = r13.A01;
        1Av A002 = 1Au.A00(userSession);
        String str = (String) A002.A6V.CDM(A002, 1Av.A8a[475]);
        0Tu r9 = 0Tu.A05;
        if (182.A06(r9, userSession, 36316662907540027L) && str != null) {
            Type type = new R1b().A00;
            0qQ.A07(type);
            try {
                Object A092 = new Gson().A09(str, type);
                0qQ.A07(A092);
                ArrayList arrayList2 = new ArrayList();
                for (Object next : (Iterable) A092) {
                    if (((C381769cI) next).A04 != null) {
                        arrayList2.add(next);
                    }
                }
                arrayList = new ArrayList();
                for (Object next2 : arrayList2) {
                    C381769cI r10 = (C381769cI) next2;
                    long A012 = 182.A01(r9, userSession, 36598137885822061L);
                    if (A012 == -1 || (System.currentTimeMillis() / 1000) - ((long) r10.A00) < A012) {
                        arrayList.add(next2);
                    }
                }
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                AnonymousClass9PQ.A08(r6, userSession, "error_logging", (String) null, 0Yt.A06(new 0eP[]{new 0eP("error_message", message), new 0eP("error_type", "recents_cache_read"), new 0eP("is_network", "non_network")}));
            }
            return new C361628gX((String) null, (String) null, 00k.A0k(arrayList), false);
        }
        arrayList = 0sn.A00;
        return new C361628gX((String) null, (String) null, 00k.A0k(arrayList), false);
    }

    public static final void A01(C361588gT r17, String str, 0sP r19) {
        C361588gT r4 = r17;
        UserSession userSession = r4.A01;
        1vn A012 = 1vm.A01(userSession);
        0Tu r5 = 0Tu.A05;
        int A013 = (int) 182.A01(r5, userSession, 36601208785408122L);
        int A014 = (int) 182.A01(r5, userSession, 36601208785539196L);
        2IS r6 = new 2IS();
        2IS r52 = new 2IS();
        Integer valueOf = Integer.valueOf(A013);
        r6.A03("first", valueOf);
        boolean z = false;
        if (valueOf != null) {
            z = true;
        }
        Integer valueOf2 = Integer.valueOf(A014);
        r6.A03("assets_first", valueOf2);
        boolean z2 = false;
        if (valueOf2 != null) {
            z2 = true;
        }
        17k.A0E(z);
        17k.A0E(z2);
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        1Ef maxToleratedCacheAgeMs = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "MetaGalleryAlbums", r6.getParamsCopy(), r52.getParamsCopy(), C382799eX.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "meta_gallery", new ArrayList()).setFreshCacheAgeMs(0).setMaxToleratedCacheAgeMs(0);
        A012.ATL(new C40117ASi(r4, str, r19), new C40127ASs(r4), maxToleratedCacheAgeMs);
    }

    public static final void A02(C361588gT r16, String str, 0sP r18) {
        C361588gT r4 = r16;
        UserSession userSession = r4.A01;
        1vn A012 = 1vm.A01(userSession);
        2IS r5 = new 2IS();
        2IS r2 = new 2IS();
        Integer valueOf = Integer.valueOf((int) 182.A01(0Tu.A05, userSession, 36601208785604733L));
        r5.A03("first", valueOf);
        boolean z = false;
        if (valueOf != null) {
            z = true;
        }
        17k.A0E(z);
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        1Ef maxToleratedCacheAgeMs = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "MetaGalleryRecentsQuery", r5.getParamsCopy(), r2.getParamsCopy(), C42515Bdw.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "meta_gallery", new ArrayList()).setFreshCacheAgeMs(0).setMaxToleratedCacheAgeMs(0);
        A012.ATL(new C40118ASj(r4, str, r18), new DFD(r4), maxToleratedCacheAgeMs);
    }

    public final void onSessionWillEnd() {
        this.A03.Epw(0sn.A00);
        this.A02.Epw(0Yt.A0E());
        this.A04.Epw(new C361628gX((String) null, (String) null, 0sl.A00, false));
    }
}
