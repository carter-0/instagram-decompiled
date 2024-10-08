package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.aistudio.model.UtmMetadata;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.K5q  reason: case insensitive filesystem */
public final class C61396K5q extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AiCreationTopicPickerFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06 = DbS.A0I(new MMM(this, 10), new MMM(this, 11), MMV.A00((Object) null, this, 23), JTT.A0w());

    public final String getModuleName() {
        return "ai_creation_topic_picker_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LTH A0T = JTO.A0T(this.A03);
        Object value = this.A01.getValue();
        AnonymousClass0eM r0 = this.A06;
        String A012 = C60316JjJ.A01(r0);
        UtmMetadata A002 = C60316JjJ.A00(r0);
        1Ln A013 = LTH.A01(A0T, value, 0);
        if (DbT.A1Y(A013)) {
            A013.A0l("creation_inspiration_screen_shown");
            0eP A1L = AnonymousClass7TE.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, value);
            String str4 = null;
            if (A002 != null) {
                str = A002.A03;
            } else {
                str = null;
            }
            0eP A1L2 = AnonymousClass7TE.A1L("utm_source", str);
            if (A002 != null) {
                str2 = A002.A02;
            } else {
                str2 = null;
            }
            0eP A1L3 = AnonymousClass7TE.A1L("utm_medium", str2);
            if (A002 != null) {
                str3 = A002.A00;
            } else {
                str3 = null;
            }
            0eP A1L4 = AnonymousClass7TE.A1L("utm_campaign", str3);
            if (A002 != null) {
                str4 = A002.A01;
            }
            JTT.A1I(A013, A012, JTU.A0Z(str4, A1L, A1L2, A1L3, A1L4));
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final boolean onBackPressed() {
        AnonymousClass0eM r2 = this.A00;
        JTO.A0U(r2).A06("template_dismissed");
        AnonymousClass7I6 A0U = JTO.A0U(r2);
        A0U.A06.markerEnd(673065299, JVT.A00(AnonymousClass05K.A0C));
        return false;
    }

    public C61396K5q() {
        0eO r2 = 0eO.A02;
        this.A02 = AnonymousClass0eN.A00(r2, new C51659FyL(this));
        this.A01 = C51975G9x.A0r(this, "AiStudioArgumentKeys.creation_entry_point", r2, 4);
        this.A05 = AnonymousClass1YB.A00(new C66212MIt(this));
        this.A03 = MMM.A00(this, 9);
        this.A04 = C227642jf.A02(this);
        this.A00 = AnonymousClass1YB.A00(new MMM(this, 8));
    }

    public final void configureActionBar(2da r3) {
        Dbb.A1I(r3);
        int i = 2131952740;
        if (((C61060Jvy) JTO.A0R(this.A06).A0L.getValue()).A04) {
            i = 2131952705;
        }
        r3.Eom(i);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-7810762);
        C61396K5q.super.onCreate(bundle);
        AnonymousClass0eM r2 = this.A00;
        JTO.A0U(r2).A06.markerStart(673065299);
        JTO.A0U(r2).A06("template_request_sent");
        if (!DbX.A1a(this.A02.getValue())) {
            C60316JjJ A0R = JTO.A0R(this.A06);
            boolean A062 = 182.A06(0Tu.A05, A0R.A01, 36324076024049425L);
            KX0 kx0 = A0R.A00;
            if (A062) {
                C63977LGr.A00(kx0.A03, kx0.A01);
            } else {
                C63977LGr.A01(kx0.A03, kx0.A01);
            }
        }
        AnonymousClass0eM r3 = this.A06;
        C60316JjJ A0R2 = JTO.A0R(r3);
        Object value = this.A01.getValue();
        0qQ.A0B(value, 0);
        A0R2.A09.Epw(value);
        Object value2 = this.A05.getValue();
        if (value2 != null) {
            JTO.A0R(r3).A0C.Epw(value2);
        }
        AnonymousClass0fD.A09(-1548427637, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1449518204);
        ComposeView A0H = DbV.A0H(this, new MPO(this, 39), -2090239648);
        AnonymousClass0fD.A09(1338715059, A022);
        return A0H;
    }
}
