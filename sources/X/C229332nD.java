package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.RIXUChainingSourceType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.rixu.RIXUChainingBehaviorDefinition;
import com.instagram.music.common.model.AudioType;
import com.instagram.search.common.analytics.SearchContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.2nD  reason: invalid class name and case insensitive filesystem */
public final class C229332nD implements C252243on {
    public C232692uG A00;
    public final Context A01;
    public final AnonymousClass9J0 A02;
    public final C229352nF A03;
    public final C229362nG A04;
    public final UserSession A05;

    public C229332nD(UserSession userSession, Context context) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(context, 2);
        this.A05 = userSession;
        this.A01 = context;
        AnonymousClass9J0 r2 = new AnonymousClass9J0();
        this.A02 = r2;
        C229352nF A002 = C229342nE.A00(userSession);
        0qQ.A07(A002);
        this.A03 = A002;
        this.A04 = new C229362nG(r2, A002);
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void onDestroy() {
        String str = this.A02.A01;
        if (str != null) {
            C229352nF r1 = this.A03;
            r1.A05(this.A04, str);
            r1.A07(str);
        }
    }

    public final void A00(AnonymousClass5OD r22, C276114sa r23, ClipsViewerSource clipsViewerSource, C2605946h r25, AnonymousClass2xS r26, C297595s1 r27, RIXUChainingBehaviorDefinition rIXUChainingBehaviorDefinition, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, boolean z, boolean z2, boolean z3) {
        String str6;
        String str7;
        AudioType audioType;
        String str8;
        RIXUChainingSourceType rIXUChainingSourceType;
        String str9;
        1Xj r0;
        ClipsViewerSource clipsViewerSource2 = clipsViewerSource;
        0qQ.A0B(clipsViewerSource2, 0);
        C276114sa r11 = r23;
        0qQ.A0B(r11, 4);
        String str10 = str3;
        0qQ.A0B(str10, 5);
        UserSession userSession = this.A05;
        C270634h3 r4 = new C270634h3(clipsViewerSource2, userSession);
        r4.A1C = str;
        String str11 = str2;
        r4.A1F = str11;
        r4.A0q = str10;
        r4.A0U = num;
        r4.A1c = true;
        0Tu r2 = 0Tu.A05;
        r4.A1N = 182.A06(r2, userSession, 36311040794886565L);
        r4.A1b = 182.A06(r2, userSession, 36311040796262822L);
        r4.A1e = 182.A06(r2, userSession, 36311040796393895L);
        r4.A1g = z;
        r4.A1s = z2;
        r4.A0k = null;
        r4.A08 = r22;
        C2605946h r8 = r25;
        if (r25 != null) {
            str6 = r8.getAssetId();
        } else {
            str6 = null;
        }
        r4.A1B = str6;
        if (r25 != null) {
            str7 = r8.getAssetId();
        } else {
            str7 = null;
        }
        r4.A0f = str7;
        if (r25 != null) {
            audioType = r8.A01;
        } else {
            audioType = null;
        }
        r4.A0M = audioType;
        if (r25 != null) {
            C295345o0 r1 = new C295345o0(C55317Hfk.A00);
            r1.A08 = r8.A00;
            str8 = r1.A00().A0W;
        } else {
            str8 = null;
        }
        r4.A0u = str8;
        r4.A03(new SearchContext((String) null, (String) null, str4, (String) null, (String) null, (String) null, (String) null, (String) null));
        r4.A0w = str5;
        RIXUChainingBehaviorDefinition rIXUChainingBehaviorDefinition2 = rIXUChainingBehaviorDefinition;
        r4.A0K = rIXUChainingBehaviorDefinition2;
        r4.A0W = num2;
        if (182.A06(r2, userSession, 36330496996688538L)) {
            r4.A1c = false;
            r4.A1u = true;
        }
        if (182.A06(r2, userSession, 36330496996819612L)) {
            r4.A1c = false;
            r4.A1u = false;
            r4.A1P = true;
            C297595s1 r02 = r27;
            if (r27 != null) {
                View view = r02.itemView;
                0qQ.A06(view);
                RectF rectF = 0nA.A01;
                RectF rectF2 = new RectF();
                0nA.A0L(rectF2, view);
                r4.A02 = rectF2.top - ((float) 0nA.A0A(this.A01));
                r4.A00 = rectF2.height();
                r4.A01 = rectF2.left;
                r4.A03 = rectF2.width();
            }
        }
        if (182.A06(r2, userSession, 36330496996754075L)) {
            r4.A1v = true;
        }
        if (182.A06(r2, userSession, 36330496996885149L)) {
            r4.A1Y = true;
            AnonymousClass2xS r5 = r26;
            if (r26 != null) {
                r5.onPause();
            }
            r4.A1L = new MP7(r5, 9);
        }
        List<C267324bN> list2 = list;
        if (clipsViewerSource2 == ClipsViewerSource.CLIPS_MUSIC_DROPS_NETEGO) {
            ArrayList arrayList = new ArrayList(0Yv.A1E(list2, 10));
            for (C267324bN r03 : list2) {
                if (r03 == null || (r0 = r03.A02) == null) {
                    str9 = null;
                } else {
                    str9 = r0.getId();
                }
                arrayList.add(str9);
            }
            r4.A0A = ImmutableList.copyOf((Collection) arrayList);
            Context context = this.A01;
            r4.A0n = context.getString(2131966519);
            r4.A0o = context.getString(2131966518);
        }
        if (!(!182.A06(r2, userSession, 36318196212176884L) || rIXUChainingBehaviorDefinition == null || (rIXUChainingSourceType = rIXUChainingBehaviorDefinition2.A00) == null || rIXUChainingSourceType == RIXUChainingSourceType.UNCONNECTED || rIXUChainingSourceType == RIXUChainingSourceType.UNRECOGNIZED)) {
            r4.A0p = 002.A0T(clipsViewerSource2.A00, rIXUChainingSourceType.A00, '_');
        }
        ClipsViewerConfig A002 = r4.A00();
        this.A03.A03(r11, C294895nD.DEFAULT, str11, list2, true, true);
        FragmentActivity fragmentActivity = this.A01;
        0qQ.A0C(fragmentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (z3) {
            C250563lf.A0Y(fragmentActivity2, A002, userSession);
        } else {
            C250563lf.A0X(fragmentActivity2, A002, userSession);
        }
    }
}
