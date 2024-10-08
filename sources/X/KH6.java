package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.archive.fragment.SelectHighlightsCoverFragment;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import java.io.File;
import java.math.BigInteger;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class KH6 extends 2Cl {
    public final int A00;
    public final Object A01;

    public KH6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        if (this.A00 != 0) {
            DirectPrivateStoryRecipientController directPrivateStoryRecipientController = (DirectPrivateStoryRecipientController) this.A01;
            Context context = directPrivateStoryRecipientController.A0w.getContext();
            if (context == null) {
                return new L4O((List) null, (List) null);
            }
            1bJ.A00(directPrivateStoryRecipientController.A0B).CnE("RecipientsLoader");
            C46502Dg5 dg5 = directPrivateStoryRecipientController.A0G;
            if (dg5 == null) {
                dg5 = new C46502Dg5(context, directPrivateStoryRecipientController.A0B, "coefficient_ios_section_test_bootstrap_ranking", new MBH(this, 9), true, false, false);
                directPrivateStoryRecipientController.A0G = dg5;
            }
            dg5.A04("");
            ArrayList A03 = directPrivateStoryRecipientController.A0G.A03(Collections.emptyList());
            UserSession userSession = directPrivateStoryRecipientController.A0B;
            List<AnonymousClass2Ep> A0G = 1bJ.A00(userSession).A0C.A0G(AnonymousClass43A.A00, 2Eo.A04, C2611948q.NO_INTEROP);
            BigInteger bigInteger = C46503Dg6.A00;
            ArrayList A0m = C51970G9q.A0m(A0G);
            for (AnonymousClass2Ep r1 : A0G) {
                if (r1.BHS() == 0 && !r1.COb()) {
                    A0m.add(C46503Dg6.A00(context, userSession, r1));
                }
            }
            ArrayList A0v = DbS.A0v(150);
            Iterator it = A03.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (A0v.size() >= 150) {
                    break;
                }
                A0v.add(next);
            }
            Collections.sort(A0v, new MAZ((0sL) new JGK(Collator.getInstance(), 23), 3));
            return new L4O(A0m, A0v);
        }
        SelectHighlightsCoverFragment selectHighlightsCoverFragment = (SelectHighlightsCoverFragment) this.A01;
        FragmentActivity activity = selectHighlightsCoverFragment.getActivity();
        C63830L8l l8l = selectHighlightsCoverFragment.A03;
        if (activity == null || l8l == null) {
            return null;
        }
        selectHighlightsCoverFragment.A00.getClass();
        Rect A06 = JW0.A06(l8l.A01, selectHighlightsCoverFragment.A00.getWidth(), selectHighlightsCoverFragment.A00.getHeight(), 1, 1);
        Bitmap A0C = 1MF.A0C(selectHighlightsCoverFragment.A00, JW0.A07(A06), A06.width(), A06.height());
        Activity rootActivity = selectHighlightsCoverFragment.getRootActivity();
        rootActivity.getClass();
        File A04 = 0mb.A04(rootActivity);
        1MF.A0M(A0C, A04);
        Intent A09 = DbS.A09();
        A09.putExtra("extraBitmapFile", A04);
        return A09;
    }

    public final int getRunnableId() {
        if (this.A00 != 0) {
            return 435;
        }
        return 294;
    }

    public final void onFinish() {
        if (this.A00 != 0) {
            KH6.super.onFinish();
            return;
        }
        KH6.super.onFinish();
        DbX.A1I((Fragment) this.A01);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (this.A00 != 0) {
            L4O l4o = (L4O) obj;
            DirectPrivateStoryRecipientController directPrivateStoryRecipientController = (DirectPrivateStoryRecipientController) this.A01;
            List list = l4o.A01;
            List list2 = l4o.A00;
            if (list != null) {
                DirectPrivateStoryRecipientController.A0B(directPrivateStoryRecipientController, list);
                DirectPrivateStoryRecipientController.A0C(directPrivateStoryRecipientController, list);
                K9I k9i = directPrivateStoryRecipientController.A0H;
                Set set = k9i.A0e;
                set.clear();
                K9I.A01(k9i);
                set.addAll(list);
            }
            if (list2 != null) {
                DirectPrivateStoryRecipientController.A0B(directPrivateStoryRecipientController, list2);
                DirectPrivateStoryRecipientController.A0C(directPrivateStoryRecipientController, list2);
                directPrivateStoryRecipientController.A0H.A05 = list2;
            }
            directPrivateStoryRecipientController.A0H.A06();
            return;
        }
        Intent intent = (Intent) obj;
        FragmentActivity A0E = DbZ.A0E(this.A01);
        if (A0E != null) {
            int i = 0;
            if (intent != null) {
                i = -1;
            }
            A0E.setResult(i, intent);
        }
    }
}
