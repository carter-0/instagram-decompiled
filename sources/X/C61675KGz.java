package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.gallery.Medium;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KGz  reason: case insensitive filesystem */
public final class C61675KGz extends 2Cn {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C61675KGz(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj4;
        this.A02 = obj3;
        this.A04 = obj;
        this.A03 = obj2;
    }

    public final void onFail(Exception exc) {
        if (this.A00 != 0) {
            C59689JTv.A0B(DbT.A07(this.A01), "MediaSaver_something_went_wrong");
        } else {
            C59689JTv.A0A(DbZ.A0E(this.A04), AnonymousClass000.A00(1807));
        }
    }

    public final void onFinish() {
        if (this.A00 != 0) {
            ((Dialog) this.A02).dismiss();
        } else {
            SQH.A01(((Fragment) this.A04).getParentFragmentManager());
        }
    }

    public final void onStart() {
        if (this.A00 != 0) {
            AnonymousClass0fN.A00((Dialog) this.A02);
        } else {
            SQH.A02(((Fragment) this.A04).getParentFragmentManager());
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass36V r8;
        Object obj2 = obj;
        if (this.A00 != 0) {
            ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A01;
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putSerializable(AnonymousClass000.A00(2460), 28D.A3m);
            A0a.putParcelable(AnonymousClass000.A00(2461), (RectF) this.A04);
            A0a.putString(AnonymousClass000.A00(2463), ((C255773uh) this.A03).A0j);
            A0a.putString(AnonymousClass000.A00(2462), ((File) obj2).getAbsolutePath());
            DbU.A1K(reelDashboardFragment, AnonymousClass6W8.A02(reelDashboardFragment.requireActivity(), A0a, reelDashboardFragment.A06, TransparentModalActivity.class, C273654mx.A00(3233)));
            return;
        }
        List list = (List) obj2;
        0qQ.A0B(list, 0);
        28D r10 = 28D.A37;
        E5G e5g = (E5G) this.A04;
        AnonymousClass9PJ.A00(AnonymousClass7TE.A0l(e5g.A05)).A07(r10, true);
        List list2 = (List) this.A03;
        if (list2.size() == 1) {
            1Xj A0T = DbZ.A0T(list2, 0);
            Medium medium = (Medium) list.get(0);
            if (A0T.CeS()) {
                AnonymousClass36V r5 = (AnonymousClass36V) this.A01;
                if (r5 != null) {
                    String id = A0T.getId();
                    String A0t = DbS.A0t(e5g.A03);
                    AnonymousClass36U r52 = (AnonymousClass36U) r5;
                    0qQ.A0B(medium, 0);
                    Context context = r52.A03;
                    JTO.A1Z(context);
                    Activity activity = (Activity) context;
                    if (ABQ.A01(C59796JYp.A00(medium, 0), new AnonymousClass7IH(context), true, true)) {
                        C250563lf.A0L(activity, r10, r52.A04, (MusicAttributionConfig) null, (PendingRecipient) null, A0t, id, AnonymousClass7TE.A1I(medium), false);
                    }
                }
            } else if (A0T.A5p() && (r8 = (AnonymousClass36V) this.A01) != null) {
                r8.Ewq(medium.A02(), r10, (EXF) null, AnonymousClass514.FOUR_BY_FIVE, A0T.getId(), (String) null, (String) null, (String) null, DbS.A0t(e5g.A03), (String) null, AnonymousClass7TE.A1I(A0T.getId()), 108, 10005, false);
            }
        } else {
            AnonymousClass36V r82 = (AnonymousClass36V) this.A01;
            if (r82 != null) {
                String A0t2 = DbS.A0t(e5g.A03);
                ArrayList A0r = AnonymousClass7TG.A0r(list2);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    A0r.add(C51971G9r.A0v(it));
                }
                r82.E0k((AnonymousClass07i) this.A02, r10, A0t2, list2, list, 00k.A0X(A0r), 108, 10005);
            }
        }
    }
}
