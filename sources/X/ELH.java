package X;

import android.graphics.RectF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.recentlydeleted.ReelRecentlyDeletedViewerController;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class ELH extends C324596za {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public ELH(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public final void onFail(C268654dm r4) {
        int A0D;
        int i;
        if (this.A00 != 0) {
            A0D = AnonymousClass0fD.A03(-242597266);
            C319126q5.A04(r4, ((ReelRecentlyDeletedViewerController) this.A01).A00.getString(2131972232));
            i = 1201687870;
        } else {
            A0D = AnonymousClass7TG.A0D(r4, 1316566101);
            0qQ.A07(C319126q5.A04(r4, ((EES) this.A03).A00.getString(2131972232)));
            i = 1519175410;
        }
        AnonymousClass0fD.A0A(i, A0D);
    }

    public final void onFinish() {
        int A032;
        int i;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(-871489471);
            i = 764810164;
        } else {
            A032 = AnonymousClass0fD.A03(-744185873);
            i = 1224597248;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onStart() {
        int A032;
        int i;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(-474955536);
            i = -1637434120;
        } else {
            A032 = AnonymousClass0fD.A03(1402458703);
            i = -1600813540;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        int i;
        Object obj2 = obj;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(946101362);
            int A033 = AnonymousClass0fD.A03(-2125579034);
            F08 f08 = (F08) this.A02;
            List list = ((1XO) obj2).A06;
            AnonymousClass3BQ r10 = (AnonymousClass3BQ) this.A03;
            if (!list.isEmpty()) {
                String id = DbZ.A0T(list, 0).getId();
                1Xj A0T = DbZ.A0T(list, 0);
                UserSession userSession = f08.A04;
                User A2A = A0T.A2A(userSession);
                A2A.getClass();
                Reel A0J = 1OP.A05(userSession).A0J(new 1Nr(A2A), id, list, true);
                C276544tV r1 = f08.A02;
                C307896Rx r7 = f08.A01;
                View A05 = r1.A05(r7.A03);
                int[] iArr = new int[2];
                if (A05 != null) {
                    A05.getLocationOnScreen(iArr);
                }
                AnonymousClass6SN.A00 = new C51083FoD(f08);
                ReelRecentlyDeletedViewerController reelRecentlyDeletedViewerController = f08.A05;
                float f = (float) iArr[0];
                float f2 = (float) iArr[1];
                RectF rectF = new RectF(f, f2, f, f2);
                FragmentActivity fragmentActivity = f08.A00;
                AnonymousClass0iw A07 = C308206Td.A07(C308206Td.A09(r7));
                A0J.A1b = true;
                AnonymousClass3K2 A072 = 1OP.A07(fragmentActivity, userSession);
                ArrayList A1C = AnonymousClass7TE.A1C();
                A1C.add(A0J.getId());
                A072.A0T((RectF) null, rectF, A07, A0J, r10, new FkU(1, r10, reelRecentlyDeletedViewerController, fragmentActivity, A1C, userSession, A072, A0J, rectF), 0);
            }
            AnonymousClass0fD.A0A(-416627106, A033);
            i = -1181754395;
        } else {
            A032 = AnonymousClass0fD.A03(-1516927735);
            1XO r12 = (1XO) obj2;
            int A0D = AnonymousClass7TG.A0D(r12, 1081460783);
            List list2 = r12.A06;
            0qQ.A07(list2);
            ((G5S) this.A01).Deu((AnonymousClass3BQ) this.A02, list2);
            AnonymousClass0fD.A0A(-1824598632, A0D);
            i = 1989560900;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032;
        int i;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(-1157795497);
            AnonymousClass0fD.A0A(-1526746364, AnonymousClass0fD.A03(521259693));
            i = 1904869412;
        } else {
            A032 = AnonymousClass0fD.A03(1706225203);
            AnonymousClass0fD.A0A(1211166798, AnonymousClass0fD.A03(591966559));
            i = 81937703;
        }
        AnonymousClass0fD.A0A(i, A032);
    }
}
