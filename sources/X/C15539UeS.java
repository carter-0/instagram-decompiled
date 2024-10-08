package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.archive.fragment.ArchiveReelFragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Calendar;

/* renamed from: X.UeS  reason: case insensitive filesystem */
public final class C15539UeS extends C231632rz {
    public final Activity A00;
    public final Fragment A01;
    public final ArchiveReelFragment A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        ExtendedImageUrl A1n;
        int A032 = AnonymousClass0fD.A03(281606571);
        C17622VbE vbE = (C17622VbE) DbT.A0o(view);
        Activity activity = this.A00;
        Fragment fragment = this.A01;
        Context context = view.getContext();
        UserSession userSession = this.A04;
        1Xj r12 = (1Xj) obj;
        AnonymousClass0iw r6 = this.A03;
        ArchiveReelFragment archiveReelFragment = this.A02;
        IgImageView igImageView = vbE.A01;
        if (igImageView == null) {
            boolean A5v = r12.A5v();
            ViewStub viewStub = vbE.A03;
            if (A5v) {
                View A0H = JTP.A0H(viewStub, R.layout.archive_suggestion_preview);
                vbE.A00 = A0H;
                igImageView = (IgImageView) A0H;
                vbE.A01 = igImageView;
            } else {
                View A0H2 = JTP.A0H(viewStub, R.layout.archive_suggestion_feed_post_preview);
                vbE.A00 = A0H2;
                igImageView = DbT.A0b(A0H2, R.id.on_this_day_preview_image_thumbnail);
                vbE.A01 = igImageView;
                igImageView.A0E = vbE.A06;
            }
        }
        if (!(igImageView == null || (A1n = r12.A1n(context)) == null)) {
            vbE.A01.setUrl(A1n, r6);
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(r12.A1A() * 1000);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(System.currentTimeMillis());
        vbE.A05.setText(DbY.A0d(context.getResources(), instance2.get(1) - instance.get(1), R.plurals.on_this_day_subtitle));
        WBF wbf = new WBF(0, (Object) activity, (Object) fragment, (Object) userSession, (Object) r12);
        AnonymousClass0fU.A00(wbf, vbE.A04);
        View view2 = vbE.A00;
        if (view2 != null) {
            AnonymousClass0fU.A00(wbf, view2);
        }
        WBH.A01(vbE.A02, 15, archiveReelFragment, r12);
        if (!archiveReelFragment.A0C) {
            archiveReelFragment.A0C = true;
            archiveReelFragment.A03.A05(r12, archiveReelFragment.A0G);
        }
        AnonymousClass0fD.A0A(-38474958, A032);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        if (!((VM4) obj2).A00) {
            r2.A7U(0);
        }
    }

    public C15539UeS(Activity activity, Fragment fragment, ArchiveReelFragment archiveReelFragment, AnonymousClass0iw r4, UserSession userSession) {
        this.A00 = activity;
        this.A01 = fragment;
        this.A04 = userSession;
        this.A03 = r4;
        this.A02 = archiveReelFragment;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(2013043675);
        View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.layout_archive_on_this_day);
        A0C.setTag(new C17622VbE(A0C));
        AnonymousClass0fD.A0A(-893489750, A032);
        return A0C;
    }
}
