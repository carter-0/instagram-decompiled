package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.facebook.locationsharing.core.models.Location;
import com.facebook.locationsharing.core.models.LocationSharingPresenterState;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.igds.components.button.IgdsButton;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class UHR extends UHS {
    public static final UHL A0M = new Object();
    public final Handler A00;
    public final C327287Ae A01;
    public final C17908Vhz A02;
    public final C17421VVa A03;
    public final C327307Ag A04;
    public final SIV A05;
    public final C71014OYm A06;
    public final Runnable A07;
    public final Runnable A08;
    public final Runnable A09;
    public final Runnable A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final C18983WFk A0F;
    public final C13920TlM A0G;
    public final C13920TlM A0H;
    public final C15931Ukw A0I;
    public final C15093UOm A0J;
    public final C15094UOn A0K;
    public final boolean A0L;

    public final void A0A(Bundle bundle) {
        C18047VkV vkV;
        Parcelable parcelable;
        this.A00 = true;
        UHS.A05(this, "attach", new Object[0]);
        if (bundle == null || (parcelable = bundle.getParcelable("location_sharing_presenter_state")) == null) {
            vkV = null;
        } else {
            vkV = new C18047VkV(A0M, parcelable, (Throwable) null, false);
        }
        UHS.A05(this, "restored_state=%s", vkV);
        if (vkV == null) {
            C18520VtK vtK = new C18520VtK();
            vtK.A01 = System.currentTimeMillis();
            vtK.A0D = false;
            String str = this.A0E;
            vtK.A0C = str;
            C11367SPk.A03(str, "userId");
            vtK.A04 = this.A02.A00();
            vkV = new C18047VkV(A0M, new LocationSharingPresenterState(vtK), (Throwable) null, false);
        }
        this.A00 = vkV;
        VQY vqy = this.A02;
        Calendar.getInstance().getTimeInMillis();
        UHS.A04(this, (Object) null, "LOADING");
        this.A00.postDelayed(this.A08, 10000);
        C15094UOn uOn = this.A0K;
        C13920TlM tlM = this.A0G;
        uOn.A00.add(tlM);
        uOn.A00.BtW(tlM, uOn.A00);
        C15093UOm uOm = this.A0J;
        C18983WFk wFk = this.A0F;
        uOm.A00.add(wFk);
        uOm.A00.AYi(wFk, uOm.A00);
        if (!vqy.A00) {
            vqy.A00 = true;
        }
    }

    public final void A0B(ImmutableList immutableList) {
        if (this.A00) {
            UHS.A04(this, immutableList, "POINTS_OF_INTEREST_UPDATED");
            if (this.A00 && 0 < A00(this).A07.size()) {
                UHS.A04(this, 0, "POINTS_OF_INTEREST_SELECTED");
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UHR(android.content.Context r15, X.XBQ r16, com.instagram.common.session.UserSession r17, X.VN1 r18, X.C15931Ukw r19, X.C17421VVa r20, X.AnonymousClass7AZ r21, com.instagram.model.direct.DirectShareTarget r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, boolean r28) {
        /*
            r14 = this;
            X.Vz0 r11 = new X.Vz0
            r4 = r27
            r11.<init>(r4)
            X.UHK r9 = new X.UHK
            r9.<init>()
            r2 = r22
            if (r22 == 0) goto L_0x00da
            java.lang.String r0 = r2.A08()
        L_0x0014:
            X.WPd r12 = new X.WPd
            r3 = r17
            r12.<init>(r3, r0)
            r1 = r26
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r13 = "LocationSharingPresenter"
            if (r0 != 0) goto L_0x002b
            r0 = 46
            java.lang.String r13 = X.002.A0T(r1, r13, r0)
        L_0x002b:
            r8 = r14
            r10 = r16
            r8.<init>(r9, r10, r11, r12, r13)
            X.Wi7 r0 = new X.Wi7
            r0.<init>(r14)
            r14.A08 = r0
            X.Wi8 r0 = new X.Wi8
            r0.<init>(r14)
            r14.A07 = r0
            X.Wi9 r0 = new X.Wi9
            r0.<init>(r14)
            r14.A0A = r0
            X.WiA r0 = new X.WiA
            r0.<init>(r14)
            r14.A09 = r0
            r1 = 1
            X.WFj r0 = new X.WFj
            r0.<init>(r14, r1)
            r14.A0G = r0
            X.UHN r0 = new X.UHN
            r0.<init>(r14)
            r14.A0F = r0
            r1 = 2
            X.WFj r0 = new X.WFj
            r0.<init>(r14, r1)
            r14.A0H = r0
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r14.A00 = r0
            r6 = r23
            r14.A0B = r6
            r14.A0E = r4
            r0 = r24
            r14.A0C = r0
            r0 = r25
            r14.A0D = r0
            X.Vhz r0 = new X.Vhz
            r0.<init>(r15, r3)
            r14.A02 = r0
            X.SIV r0 = new X.SIV
            r0.<init>(r15, r3, r2)
            r14.A05 = r0
            r5 = r20
            r14.A03 = r5
            r0 = 7
            X.Ply r1 = new X.Ply
            r1.<init>(r3, r0)
            java.lang.Class<X.7Ag> r0 = X.C327307Ag.class
            java.lang.Object r0 = r3.A01(r0, r1)
            X.7Ag r0 = (X.C327307Ag) r0
            r14.A04 = r0
            r7 = r21
            X.7Af r0 = r7.A00()
            r14.A01 = r0
            X.7Ab r4 = r7.A00
            java.util.concurrent.Executor r2 = r7.A01
            java.util.concurrent.Executor r0 = r7.A02
            X.WIM r1 = new X.WIM
            r1.<init>(r4, r2, r0)
            X.UOn r0 = new X.UOn
            r0.<init>(r1, r3, r6)
            r14.A0K = r0
            X.7Af r1 = r7.A00()
            X.UOm r0 = new X.UOm
            r0.<init>(r1, r6)
            r14.A0J = r0
            boolean r0 = r15 instanceof android.app.Activity
            if (r0 == 0) goto L_0x00d8
            android.app.Activity r15 = (android.app.Activity) r15
        L_0x00c6:
            X.OYm r0 = new X.OYm
            r1 = r18
            r0.<init>(r15, r3, r1, r5)
            r14.A06 = r0
            r0 = r28
            r14.A0L = r0
            r0 = r19
            r14.A0I = r0
            return
        L_0x00d8:
            r15 = 0
            goto L_0x00c6
        L_0x00da:
            r0 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UHR.<init>(android.content.Context, X.XBQ, com.instagram.common.session.UserSession, X.VN1, X.Ukw, X.VVa, X.7AZ, com.instagram.model.direct.DirectShareTarget, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public static LocationSharingPresenterState A00(UHR uhr) {
        C18047VkV vkV = uhr.A00;
        if (vkV != null) {
            return (LocationSharingPresenterState) vkV.A01.A00(vkV.A02);
        }
        throw new IllegalStateException("Presenter is not attached.");
    }

    public static void A01(UHR uhr) {
        C15931Ukw ukw = uhr.A0I;
        if (ukw != null) {
            IgdsButton igdsButton = ukw.A04;
            if (igdsButton != null) {
                igdsButton.setLoading(false);
            }
            IgdsButton igdsButton2 = ukw.A05;
            if (igdsButton2 != null) {
                igdsButton2.setLoading(false);
            }
            Context context = ukw.getContext();
            if (context != null) {
                DbX.A14(context, AnonymousClass37D.A00);
            }
        }
    }

    public static void A02(UHR uhr) {
        C15093UOm uOm = uhr.A0J;
        C18983WFk[] wFkArr = {uhr.A0F};
        HashSet hashSet = new HashSet(uOm.A00);
        hashSet.removeAll(Arrays.asList(wFkArr));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            uOm.A00((C13550TcM) it.next());
        }
    }

    public final void A06() {
        Handler handler = this.A00;
        handler.removeCallbacks(this.A08);
        handler.removeCallbacks(this.A07);
        this.A0K.A01(this.A0G);
        this.A0J.A01(this.A0F);
        C71014OYm oYm = this.A06;
        1wn r2 = oYm.A00;
        if (r2 != null) {
            AnonymousClass1Nd.A00(oYm.A02).A02(r2, C64648Lfa.class);
        }
        super.A06();
    }

    public final void A08() {
        if (this.A0L) {
            C17908Vhz vhz = this.A02;
            C13920TlM tlM = this.A0H;
            Set set = vhz.A05;
            set.remove(tlM);
            if (vhz.A01 && set.isEmpty()) {
                vhz.A01 = false;
            }
            Handler handler = this.A00;
            handler.removeCallbacks(this.A0A);
            handler.removeCallbacks(this.A09);
        }
        super.A08();
    }

    public final void A09(long j) {
        if (j > 0) {
            long currentTimeMillis = System.currentTimeMillis() + j;
            if (A00(this).A03 == null) {
                Location location = A00(this).A04;
                if (location == null) {
                    C71014OYm oYm = this.A06;
                    Activity activity = oYm.A01;
                    if (activity != null && !1DL.A08(activity, new String[]{"android.permission.ACCESS_FINE_LOCATION"})) {
                        C71014OYm.A00(this, oYm);
                        return;
                    }
                    return;
                }
                UHS.A04(this, (Object) null, "LOADING");
                VZ7 vz7 = new VZ7(this.A01, location, this.A04, this.A0B, currentTimeMillis);
                C18982WFj wFj = new C18982WFj(this, 3);
                C327307Ag r10 = vz7.A03;
                String str = vz7.A04;
                long j2 = vz7.A00;
                Location location2 = vz7.A02;
                C12040Sl1 sl1 = new C12040Sl1(1, wFj, vz7);
                0qQ.A0B(str, 0);
                UserSession userSession = r10.A00;
                float f = (float) location2.A00;
                float f2 = (float) location2.A01;
                long currentTimeMillis2 = System.currentTimeMillis();
                1NY A0a = AnonymousClass7TG.A0a(userSession);
                A0a.A0A("direct_v2/threads/broadcast/create_live_location_session/");
                A0a.A0Q(C54060Gyj.class, C56294Hw7.class);
                A0a.A9m(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                if (!182.A06(0Tu.A05, userSession, 36321125378434180L)) {
                    A0a.A0B(com.facebook.location.platform.api.Location.LATITUDE, f);
                    A0a.A0B("longitude", f2);
                    A0a.A0D(Pxd.A00(748), TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis2));
                }
                A0a.A0D("expiration_timestamp_s", TimeUnit.MILLISECONDS.toSeconds(j2));
                1OC A0M2 = A0a.A0M();
                A0M2.A00 = new C8751R7p(sl1, userSession, r10, str, j2);
                1ES.A03(A0M2);
            }
        }
    }

    public static void A03(UHR uhr, LiveLocationSession liveLocationSession, boolean z) {
        UHS.A05(uhr, "Calling stopLiveLocation(). session=%s userInitiatedStop=%b", liveLocationSession, Boolean.valueOf(z));
        UHS.A04(uhr, (Object) null, "LOADING");
        new SHK(uhr.A01, liveLocationSession, uhr.A04).A00(new C18979WFg(uhr, liveLocationSession, z));
    }

    public final void A07() {
        C16490Uvl uvl;
        Activity activity;
        super.A07();
        if (this.A0L) {
            C17421VVa vVa = this.A03;
            1Av r4 = vVa.A01;
            if (AnonymousClass7TG.A1a(r4, r4.A3n, 1Av.A8a, 206)) {
                uvl = C16490Uvl.ACCEPTED;
            } else if (vVa.A00) {
                uvl = C16490Uvl.SEEN;
            } else {
                uvl = C16490Uvl.NOT_SEEN;
            }
            int ordinal = uvl.ordinal();
            if (ordinal == 1) {
                C71014OYm.A00(this, this.A06);
            } else if (ordinal == 2 && (activity = this.A06.A01) != null) {
                1DL.A08(activity, new String[]{"android.permission.ACCESS_FINE_LOCATION"});
            }
            vVa.A00 = true;
            C17908Vhz vhz = this.A02;
            vhz.A05.add(this.A0H);
            if (!vhz.A01) {
                vhz.A01 = true;
            }
            Handler handler = this.A00;
            Runnable runnable = this.A0A;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
            Runnable runnable2 = this.A09;
            handler.removeCallbacks(runnable2);
            handler.postDelayed(runnable2, 10000);
        }
    }
}
