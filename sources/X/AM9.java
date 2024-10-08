package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.io.Serializable;
import java.util.List;

public final class AM9 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass87B A00;

    public AM9(AnonymousClass87B r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        Fragment r2;
        C331157Pu A002;
        Context context;
        int A05 = AnonymousClass0fD.A05(-329048552);
        C3509386y r1 = this.A00.A0A.A00;
        if (r1.A0A()) {
            AA8 A003 = C3509386y.A00(r1);
            if (A003 instanceof C387529mM) {
                C387529mM r5 = (C387529mM) A003;
                r2 = new C273374mT();
                r2.A00 = r5;
                Bundle A0a = AnonymousClass7TE.A0a();
                List list = r5.A04;
                0qQ.A0C(list, "null cannot be cast to non-null type java.io.Serializable");
                A0a.putSerializable("CanvasTemplatesBottomSheetFragment.TEMPLATES_LIST", (Serializable) list);
                AIY aiy = r5.A08.A00.A01.A07.A00().A0B;
                aiy.getClass();
                A0a.putParcelable("CanvasTemplatesBottomSheetFragment.ARG_TEXT_MODE_COLOR_SCHEME", aiy.A03());
                r2.setArguments(A0a);
                A002 = C394379xz.A00(r5.A06, r5.A07).A00();
                context = r5.A05;
            } else if (A003 instanceof C387499mJ) {
                C387499mJ r52 = (C387499mJ) A003;
                r2 = new AnonymousClass4DH();
                r2.A00 = new C39644A3k(r52);
                Bundle A0a2 = AnonymousClass7TE.A0a();
                A0a2.putSerializable("CanvasMentionBottomSheetFragment.MEDIA_LIST", (Serializable) r52.A04);
                r2.setArguments(A0a2);
                A002 = C394379xz.A00(r52.A06, r52.A07).A00();
                context = r52.A05;
            } else if (A003 instanceof C387509mK) {
                C387509mK r53 = (C387509mK) A003;
                r2 = new C384969iB();
                r2.A00 = r53;
                Bundle A0a3 = AnonymousClass7TE.A0a();
                A0a3.putSerializable("CanvasTemplatesBottomSheetFragment.MEMORIES_LIST", (Serializable) r53.A06);
                A0a3.putSerializable("CanvasMemoriesBottomSheetFragment.ARG_MEDIUM_MAP", r53.A0C);
                AIY aiy2 = r53.A0A.A00.A01.A07.A00().A0B;
                aiy2.getClass();
                A0a3.putParcelable("CanvasMemoriesBottomSheetFragment.ARG_TEXT_MODE_COLOR_SCHEME", aiy2.A03());
                r2.setArguments(A0a3);
                A002 = C394379xz.A00(r53.A02, r53.A08).A00();
                context = r53.A07;
            } else if (A003 instanceof C387559mP) {
                C387559mP r54 = (C387559mP) A003;
                Fragment r4 = new C273374mT();
                Bundle A0a4 = AnonymousClass7TE.A0a();
                UserSession userSession = r54.A05;
                A0a4.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
                r4.setArguments(A0a4);
                r4.A00 = new A3i(r54);
                C394379xz.A00(r54.A04, userSession).A00().A03(r54.A03, r4);
                AnonymousClass1Nd.A00(userSession).A01(r54, WQE.class);
            }
            A002.A03(context, r2);
        }
        AnonymousClass0fD.A0C(1223363782, A05);
    }
}
