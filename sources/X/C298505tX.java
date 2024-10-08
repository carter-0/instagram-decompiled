package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;

/* renamed from: X.5tX  reason: invalid class name and case insensitive filesystem */
public final class C298505tX extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AiAgentsSeeAllFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final String A08 = "home_see_all_fragment";

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        r2.Eu4(true);
        r2.setTitle((String) this.A04.getValue());
    }

    public final String getModuleName() {
        return this.A08;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) this.A05.getValue();
    }

    public C298505tX() {
        0eO r3 = 0eO.A02;
        this.A03 = AnonymousClass0eN.A00(r3, new C51803G2m((Object) this, "home_see_all_section_id", "home_see_all_section_id", 10));
        this.A04 = AnonymousClass0eN.A00(r3, new C51803G2m((Object) this, "home_see_all_section_name", "home_see_all_section_name", 11));
        this.A02 = AnonymousClass0eN.A00(r3, new C51803G2m((Object) this, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, 12));
        this.A06 = AnonymousClass0eN.A00(r3, new C51660FyM(this));
        this.A00 = AnonymousClass1YB.A00(new MM7(this, 21));
        this.A01 = AnonymousClass1YB.A00(new MM7(this, 22));
        MM7 mm7 = new MM7(this, 27);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r3, new MM7(new MM7(this, 24), 25));
        this.A07 = new C227862kA(new MM7(A002, 26), mm7, new MMZ(8, (Object) null, (Object) A002), new 0Yh(C60267JiO.class));
    }

    public final void onCreate(Bundle bundle) {
        Object value;
        boolean z;
        List list;
        boolean z2;
        int A022 = AnonymousClass0fD.A02(1784283123);
        C298505tX.super.onCreate(bundle);
        AnonymousClass0eM r6 = this.A04;
        String str = (String) r6.getValue();
        0qQ.A0B(str, 0);
        02m r1 = ((AnonymousClass7I6) this.A01.getValue()).A06;
        r1.markerStart(895692010);
        r1.markerAnnotate(895692010, AnonymousClass000.A00(3713), str);
        C60267JiO jiO = (C60267JiO) this.A07.getValue();
        String str2 = (String) this.A03.getValue();
        String str3 = (String) r6.getValue();
        0qQ.A0B(str2, 0);
        0qQ.A0B(str3, 1);
        05G r3 = jiO.A03;
        do {
            value = r3.getValue();
            C61060Jvy jvy = (C61060Jvy) value;
            z = jvy.A03;
            list = (List) jvy.A01;
            z2 = jvy.A02;
            0qQ.A0B(list, 2);
        } while (!r3.AIY(value, new C61060Jvy(list, 1, z, true, z2)));
        C318136oS A002 = C318116oQ.A00(jiO);
        1Eo.A05(19B.A00, new MFe((Object) jiO, str2, str3, (AnonymousClass4D7) null, 1), A002);
        AnonymousClass0fD.A09(250675787, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1578590691);
        ComposeView A002 = GTX.A00(this, AnonymousClass5PI.A03(new C59111J6t(this, 8), 1920766069));
        AnonymousClass0fD.A09(831055932, A022);
        return A002;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1173636210);
        ((AnonymousClass7I6) this.A01.getValue()).A06.markerEnd(895692010, JVT.A00(AnonymousClass05K.A0C));
        super.onDestroy();
        AnonymousClass0fD.A09(-141352644, A022);
    }
}
