package X;

import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class EHO extends 2Cn {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public EHO(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onFail(Exception exc) {
        switch (this.A00) {
            case 2:
                return;
            case 3:
                C19200WPg wPg = (C19200WPg) this.A02;
                C19200WPg.A02(wPg);
                C59689JTv.A0A(wPg.A01, AnonymousClass000.A00(1807));
                return;
            case 4:
                0qQ.A0B(exc, 0);
                I75.A05(exc);
                ((1IX) this.A01).EJ1((0sP) null, new C297815sO(exc));
                return;
            default:
                EHO.super.onFail(exc);
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean z;
        F2P f2p;
        DirectShareSheetFragment directShareSheetFragment;
        C290645fe r0;
        Object A08;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                r0 = (C290645fe) obj2;
                directShareSheetFragment = (DirectShareSheetFragment) this.A01;
                f2p = (F2P) this.A02;
                z = false;
                break;
            case 1:
                r0 = (C290645fe) obj2;
                directShareSheetFragment = (DirectShareSheetFragment) this.A01;
                f2p = (F2P) this.A02;
                z = true;
                break;
            case 2:
                1WP r02 = (1WP) obj2;
                0qQ.A0B(r02, 0);
                Fragment fragment = (Fragment) this.A01;
                FragmentActivity activity = fragment.getActivity();
                if (activity != null) {
                    r02.getSmartLockBroker(activity, new C50520Fdg(fragment, 3), (0lg) this.A02);
                    return;
                }
                return;
            case 3:
                File file = (File) obj2;
                0qQ.A0B(file, 0);
                AnonymousClass36V r13 = (AnonymousClass36V) this.A01;
                C19200WPg wPg = (C19200WPg) this.A02;
                C19200WPg.A02(wPg);
                Uri fromFile = Uri.fromFile(file);
                1Xj r3 = wPg.A08;
                if (r3 == null) {
                    throw AnonymousClass7TE.A0y();
                } else if (r3.CeS()) {
                    UserSession userSession = wPg.A07;
                    if (182.A06(0Tu.A05, userSession, 36324007301099173L)) {
                        C250563lf.A0L(wPg.A01, 28D.A4H, userSession, (MusicAttributionConfig) null, (PendingRecipient) null, (String) null, r3.getId(), AnonymousClass7TE.A1I(C282665Eg.A03(file, 3, 0)), false);
                        return;
                    }
                    0qQ.A0A(fromFile);
                    r13.Exl(fromFile, 28D.A4H, r3.getId(), (String) null, 3, false);
                    return;
                } else {
                    0qQ.A0A(fromFile);
                    r13.Ewp(fromFile, 28D.A4H, r3.getId(), 3, 10004);
                    return;
                }
            default:
                0qQ.A0B(obj2, 0);
                ((1IX) this.A01).EJ1((0sP) null, C41845B3m.A0d(obj2));
                return;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (String str : f2p.A02) {
            HashMap hashMap = directShareSheetFragment.A16;
            if (hashMap.containsKey(str)) {
                A08 = hashMap.get(str);
            } else if (C290645fe.A00(r0)) {
                synchronized (r0) {
                    A08 = r0.A00.A08(str);
                }
            } else {
                A08 = r0.A00.A08(str);
            }
            if (A08 != null || str == null) {
                A1C.add(A08);
            } else {
                UserSession userSession2 = directShareSheetFragment.A0G;
                0qQ.A0B(userSession2, 0);
                C66716MbN A0H = DirectThreadApi.A0H(userSession2, (AnonymousClass7BV) null, (Integer) null, (Integer) null, (Long) null, str, (String) null, (String) null, "shortcuts_fetch");
                A0H.A00(new EC8(directShareSheetFragment, A1C, f2p, str, 0, z));
                directShareSheetFragment.A09++;
                if (z) {
                    DirectShareSheetFragment.A0N(directShareSheetFragment, A1C);
                }
                1ES.A03(A0H);
            }
        }
        Iterator it = f2p.A03.iterator();
        while (it.hasNext()) {
            User A0k = DbT.A0k(it);
            if (A0k != null) {
                A1C.add(new DirectShareTarget(A0k));
            }
        }
        if (directShareSheetFragment.A09 != 0) {
            return;
        }
        if (z) {
            DirectShareSheetFragment.A0N(directShareSheetFragment, A1C);
        } else {
            DirectShareSheetFragment.A0J(directShareSheetFragment, f2p, A1C);
        }
    }
}
