package X;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8Za  reason: invalid class name and case insensitive filesystem */
public final class C357648Za implements AnonymousClass81E {
    public Integer A00;
    public Integer A01;
    public String A02;
    public final FragmentActivity A03;
    public final C357658Zb A04;
    public final AnonymousClass4DH A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final Context A08;
    public final Map A09 = new LinkedHashMap();

    public C357648Za(Context context, FragmentActivity fragmentActivity, AnonymousClass4DH r4, AnonymousClass0iw r5, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r5, 4);
        this.A07 = userSession;
        this.A05 = r4;
        this.A03 = fragmentActivity;
        this.A06 = r5;
        this.A08 = context;
        this.A04 = new C357658Zb(userSession);
    }

    public final void A01(C3503184e r4) {
        0qQ.A0B(r4, 0);
        C359558d7 r2 = new C359558d7(r4, this);
        this.A09.put(r4, r2);
        AnonymousClass1Nd.A00(this.A07).A01(r2, C359568d8.class);
    }

    public final void A02(C3503184e r5) {
        0qQ.A0B(r5, 0);
        Map map = this.A09;
        1wn r2 = (1wn) map.get(r5);
        if (r2 != null) {
            AnonymousClass1Nd.A00(this.A07).A02(r2, C359568d8.class);
        }
        map.remove(r5);
    }

    public final boolean A05(Integer num, String str) {
        String str2;
        if (!182.A06(0Tu.A05, this.A04.A02, 36315198323166291L)) {
            return false;
        }
        if (this.A02 == null) {
            AnonymousClass4DH r2 = this.A05;
            C229382nI r3 = null;
            if (r2 != null) {
                r3 = C229382nI.A02(r2, this.A06, this.A07, (2el) null);
            } else {
                FragmentActivity fragmentActivity = this.A03;
                if (fragmentActivity != null) {
                    r3 = C229382nI.A01((SparseArray) null, fragmentActivity, this.A06, this.A07);
                }
            }
            this.A02 = str;
            this.A00 = num;
            if (r3 != null) {
                UserSession userSession = this.A07;
                0eP r6 = new 0eP("flow_name", "flm_ar_effect");
                switch (num.intValue()) {
                    case 0:
                        str2 = "ig_camera_mini_gallery";
                        break;
                    case 1:
                        str2 = "ig_camera_effect_tray";
                        break;
                    case 2:
                        str2 = "ig_rtc_effect_tray";
                        break;
                    case 3:
                        str2 = "ig_rtc_mini_gallery";
                        break;
                    default:
                        str2 = "ig_shopping_camera";
                        break;
                }
                FHB.A0G(r3, userSession, AnonymousClass000.A00(553), "FlmConsentController", 0Yt.A06(new 0eP[]{r6, new 0eP("source", str2), new 0eP("surface", AnonymousClass000.A00(3364)), new 0eP(C66579MXk.A00(825), str)}));
            }
        }
        return true;
    }

    public final /* synthetic */ void A7M(Parcelable parcelable) {
    }

    public final void A00() {
        UserSession userSession = this.A07;
        Context context = this.A08;
        C372098zg r0 = C372098zg.A0F;
        C372098zg A002 = C372108zh.A00();
        synchronized (A002) {
            0xY AR4 = 0xn.A01("ig_mq_asset_prefs").AR4();
            AR4.ED3("prefs_asset_snapshot_key");
            AR4.apply();
            A002.A00 = 0;
            A002.A01 = null;
            A002.A02 = null;
            A002.A04 = null;
            A002.A03 = null;
            A002.A07 = Collections.emptyList();
        }
        C67391tE r2 = C67391tE.A00;
        1Eo.A05(19B.A00, new MHD((Object) context, (Object) userSession, (AnonymousClass4D7) null, 27), r2);
    }

    public final void A03(boolean z) {
        C312746f6 r0;
        C357658Zb r02 = this.A04;
        Boolean valueOf = Boolean.valueOf(z);
        C312716f1 r1 = r02.A00;
        if (r1 == null) {
            0qQ.A0F("sparkARFLMConsentManager");
            throw AnonymousClass00P.createAndThrow();
        }
        if (0qQ.A0K(valueOf, true)) {
            r0 = C312746f6.CONSENTED;
        } else if (valueOf == null) {
            r0 = C312746f6.DEFAULT_NOT_SEEN;
        } else if (valueOf.equals(false)) {
            r0 = C312746f6.WITHDRAWN;
        } else {
            throw new RuntimeException();
        }
        r1.A01(r0);
    }

    public final boolean A04() {
        C312716f1 r0 = this.A04.A00;
        if (r0 == null) {
            0qQ.A0F("sparkARFLMConsentManager");
            throw AnonymousClass00P.createAndThrow();
        }
        C312746f6 r02 = r0.A04;
        if (r02 == null) {
            r02 = C312746f6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        }
        int ordinal = r02.ordinal();
        boolean z = true;
        if (!(ordinal == 1 || ordinal == 3)) {
            if (ordinal == 2 || ordinal == 4) {
                return true;
            }
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return true;
    }

    public final /* synthetic */ Parcelable ANX() {
        return null;
    }
}
