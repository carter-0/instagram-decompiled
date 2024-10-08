package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.File;
import java.util.List;

public final class EHU extends 2Cn {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public EHU(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i;
        this.A03 = obj5;
        this.A02 = obj3;
        this.A05 = obj2;
        this.A04 = obj6;
        this.A06 = obj4;
        this.A01 = obj;
    }

    public final void onFail(Exception exc) {
        if (this.A00 != 0) {
            C59689JTv.A0B((Context) this.A01, AnonymousClass000.A00(1805));
            return;
        }
        W2A.A02((DialogInterface.OnDismissListener) this.A05, (0hq) this.A02);
        C59689JTv.A0A((Context) this.A01, AnonymousClass000.A00(1807));
    }

    public final void onFinish() {
        if (1 - this.A00 != 0) {
            EHU.super.onFinish();
        } else if (!((Activity) this.A01).isDestroyed()) {
            DbS.A1V(this.A02);
        }
    }

    public final void onStart() {
        if (1 - this.A00 != 0) {
            EHU.super.onStart();
        } else {
            AnonymousClass0fN.A00((Dialog) this.A02);
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2 = obj;
        if (this.A00 != 0) {
            File A0T = Dba.A0T(obj2);
            0lg r4 = (0lg) this.A06;
            Activity activity = (Activity) this.A01;
            Fragment fragment = (Fragment) this.A04;
            1Xj r7 = (1Xj) this.A05;
            28D r1 = (28D) this.A03;
            if (fragment.getContext() != null) {
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putSerializable(AnonymousClass000.A00(3320), r1);
                A0a.putString(AnonymousClass000.A00(3322), r7.getId());
                A0a.putString(AnonymousClass000.A00(3321), A0T.getAbsolutePath());
                A0a.putParcelable(AnonymousClass000.A00(3323), (Parcelable) null);
                AnonymousClass6W8.A02(activity, A0a, r4, TransparentModalActivity.class, C273654mx.A00(3223)).A0C(fragment.getContext());
                return;
            }
            return;
        }
        File file = (File) obj2;
        0qQ.A0B(file, 0);
        AnonymousClass36V r14 = (AnonymousClass36V) this.A03;
        W2A.A02((DialogInterface.OnDismissListener) this.A05, (0hq) this.A02);
        Uri fromFile = Uri.fromFile(file);
        1Xj r2 = ((C255773uh) this.A04).A0b;
        if (r2 == null) {
            throw AnonymousClass7TE.A0y();
        } else if (r2.CeS()) {
            UserSession userSession = (UserSession) this.A06;
            if (182.A06(0Tu.A05, userSession, 36324007301099173L)) {
                List A1I = AnonymousClass7TE.A1I(C282665Eg.A03(file, 3, 0));
                C250563lf.A0L((Activity) this.A01, 28D.A4H, userSession, (MusicAttributionConfig) null, (PendingRecipient) null, (String) null, r2.getId(), A1I, false);
                return;
            }
            0qQ.A0A(fromFile);
            r14.Exl(fromFile, 28D.A4H, r2.getId(), (String) null, 3, false);
        } else {
            0qQ.A0A(fromFile);
            r14.Ewp(fromFile, 28D.A4H, r2.getId(), 3, 10004);
        }
    }
}
