package com.instagram.debug.devoptions.section.videodebug;

import X.0qQ;
import X.0s0;
import X.0sr;
import X.0tS;
import X.2da;
import X.AnonymousClass0YZ;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DS;
import X.AnonymousClass7TG;
import X.C227642jf;
import X.C46448DfA;
import X.C47518E6c;
import X.C50989Fmc;
import X.C63040xi;
import X.DbS;
import X.DbW;
import X.PR9;
import android.os.Bundle;
import android.view.View;

public final class VideoDebugSettingsFragment extends C47518E6c implements AnonymousClass4DS {
    public final AnonymousClass0eM session$delegate = C227642jf.A01(this);

    public void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131958351);
    }

    public String getModuleName() {
        return "video_debug_settings";
    }

    public void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        C63040xi r6 = 0tS.A4E;
        PR9 A0f = DbS.A0f(new VideoDebugSettingsFragment$onViewCreated$items$1(this), 2131958150, r6.A00().A0Y());
        0tS A00 = r6.A00();
        0s0 r1 = A00.A2t;
        AnonymousClass0YZ[] r5 = 0tS.A4G;
        PR9 A0f2 = DbS.A0f(VideoDebugSettingsFragment$onViewCreated$items$2.INSTANCE, 2131958151, AnonymousClass7TG.A1a(A00, r1, r5, 90));
        PR9 A0f3 = DbS.A0f(new VideoDebugSettingsFragment$onViewCreated$items$3(this), 2131958148, r6.A00().A0X());
        0tS A002 = r6.A00();
        PR9 A0f4 = DbS.A0f(new VideoDebugSettingsFragment$onViewCreated$items$4(this), 2131958312, AnonymousClass7TG.A1a(A002, A002.A2y, r5, 91));
        0tS A003 = r6.A00();
        PR9 A0f5 = DbS.A0f(VideoDebugSettingsFragment$onViewCreated$items$5.INSTANCE, 2131958354, AnonymousClass7TG.A1a(A003, A003.A30, r5, 92));
        PR9 A0f6 = DbS.A0f(VideoDebugSettingsFragment$onViewCreated$items$6.INSTANCE, 2131957899, r6.A00().A0M());
        0tS A004 = r6.A00();
        PR9 A0f7 = DbS.A0f(VideoDebugSettingsFragment$onViewCreated$items$7.INSTANCE, 2131958353, AnonymousClass7TG.A1a(A004, A004.A12, r5, 12));
        C46448DfA A005 = C46448DfA.A00(2131958079);
        0tS A006 = r6.A00();
        setItems(0sr.A1P(new Object[]{A0f, A0f2, A0f3, A0f4, A0f5, A0f6, A0f7, A005, DbS.A0f(VideoDebugSettingsFragment$onViewCreated$items$8.INSTANCE, 2131957901, AnonymousClass7TG.A1a(A006, A006.A19, r5, 11)), C50989Fmc.A00(requireContext(), new VideoDebugSettingsFragment$onViewCreated$items$9(this), 2131958352)}));
    }

    public AnonymousClass0wW getSession() {
        return DbS.A0T(this.session$delegate);
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1592498825);
        super.onCreate(bundle);
        AnonymousClass0fD.A09(-1172533848, A02);
    }
}
