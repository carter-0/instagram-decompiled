package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.facebook.locationsharing.core.models.Location;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Sl1  reason: case insensitive filesystem */
public final class C12040Sl1 implements C13550TcM, C13920TlM {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C12040Sl1(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onError(Throwable th) {
        if (1 - this.A00 != 0) {
            throw AnonymousClass00P.createAndThrow();
        }
        ((C13550TcM) this.A02).onError(th);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                C13920TlM tlM = (C13920TlM) this.A02;
                ImmutableList.Builder builder = ImmutableList.builder();
                C249803kO it = ((ImmutableCollection) obj2).iterator();
                while (it.hasNext()) {
                    builder.add(it.next());
                }
                tlM.onSuccess(builder.build());
                return;
            case 1:
                LiveLocationSession liveLocationSession = (LiveLocationSession) obj2;
                ((VZ7) this.A01).A01.FMb(new C12038Skz(liveLocationSession, this), liveLocationSession);
                return;
            default:
                ImmutableCollection immutableCollection = (ImmutableCollection) obj2;
                if (immutableCollection.isEmpty()) {
                    ((C13919TlL) this.A02).onSuccess();
                    return;
                }
                C10547Ru1 ru1 = (C10547Ru1) this.A01;
                C327307Ag r8 = ru1.A02;
                Location location = ru1.A01;
                C13919TlL tlL = (C13919TlL) this.A02;
                0qQ.A0B(location, 1);
                UserSession userSession = r8.A00;
                if (182.A06(0Tu.A05, userSession, 36321125378434180L)) {
                    0wj.A01.AEf("DirectLiveLocationSendingRepository - uploading location while pdp manager is enabled", 20134884).report();
                    return;
                }
                C249803kO A0J = C66580MXl.A0J(immutableCollection);
                while (A0J.hasNext()) {
                    LiveLocationSession liveLocationSession2 = (LiveLocationSession) A0J.next();
                    String str = liveLocationSession2.A04;
                    0qQ.A07(str);
                    Long A10 = AnonymousClass7TE.A10(str);
                    if (A10 == null) {
                        tlL.onError(new Throwable(C273654mx.A00(1254)));
                    } else {
                        String str2 = liveLocationSession2.A02;
                        0qQ.A07(str2);
                        long longValue = A10.longValue();
                        float f = (float) location.A00;
                        float f2 = (float) location.A01;
                        long currentTimeMillis = System.currentTimeMillis();
                        1NY A0a = AnonymousClass7TG.A0a(userSession);
                        A0a.A0A("direct_v2/threads/broadcast/update_live_location_session/");
                        A0a.A0Q(C8744R7i.class, SAO.class);
                        A0a.A9m(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
                        A0a.A0D(C273654mx.A00(2985), longValue);
                        A0a.A0B(com.facebook.location.platform.api.Location.LATITUDE, f);
                        A0a.A0B("longitude", f2);
                        A0a.A0D("geo_timestamp_s", TimeUnit.SECONDS.toMillis(currentTimeMillis));
                        1OC A0M = A0a.A0M();
                        A0M.A00 = new C8750R7o(tlL, liveLocationSession2, userSession, r8);
                        1ES.A03(A0M);
                    }
                }
                return;
        }
    }
}
