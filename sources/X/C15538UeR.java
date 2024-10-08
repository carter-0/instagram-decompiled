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
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.UeR  reason: case insensitive filesystem */
public final class C15538UeR extends C231632rz {
    public final Activity A00;
    public final Fragment A01;
    public final ArchiveReelFragment A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0fD.A03(536402829);
        C17621VbD vbD = (C17621VbD) DbT.A0o(view);
        Activity activity = this.A00;
        Fragment fragment = this.A01;
        Context context = view.getContext();
        UserSession userSession = this.A04;
        Collection collection = (Collection) obj;
        AnonymousClass0iw r10 = this.A03;
        ArchiveReelFragment archiveReelFragment = this.A02;
        AnonymousClass7TG.A1N(vbD, activity);
        C51974G9v.A1S(fragment, context, userSession, collection, r10);
        0qQ.A0B(archiveReelFragment, 7);
        28D r25 = 28D.A53;
        int i2 = 5;
        ArrayList arrayList = new ArrayList(collection);
        01V.A1D(arrayList, new C20381WqM((0sL) C20789Wz1.A00, 7));
        int i3 = 5;
        long j = Long.MAX_VALUE;
        int i4 = 0;
        int i5 = 0;
        while (i3 < arrayList.size()) {
            long A1A = ((1Xj) arrayList.get(i5)).A1A() / SandboxRepository.CACHE_TTL;
            long A1A2 = ((1Xj) arrayList.get(i3)).A1A() / SandboxRepository.CACHE_TTL;
            long j2 = A1A2 - A1A;
            if (j2 < j) {
                int i6 = i3 + 1;
                i2 = i3;
                while (i6 < arrayList.size() && i6 - i5 < 50 && (((1Xj) arrayList.get(i6)).A1A() / SandboxRepository.CACHE_TTL) - A1A2 < 1) {
                    i2 = i6;
                    i6++;
                }
                i4 = i5;
                j = j2;
            }
            i3++;
            i5++;
        }
        List subList = arrayList.subList(i4, i2 + 1);
        1Xj A0T = DbZ.A0T(subList, 0);
        IgImageView igImageView = vbD.A01;
        if (igImageView != null) {
            ExtendedImageUrl A1n = A0T.A1n(context);
            if (A1n != null) {
                igImageView.setUrl(A1n, r10);
            }
        } else {
            boolean A5v = A0T.A5v();
            ViewStub viewStub = vbD.A04;
            if (A5v) {
                IgImageView A0H = JTP.A0H(viewStub, R.layout.archive_suggestion_preview);
                vbD.A00 = A0H;
                vbD.A01 = A0H;
            } else {
                View A0H2 = JTP.A0H(viewStub, R.layout.archive_suggestion_feed_post_preview);
                vbD.A00 = A0H2;
                if (A0H2 != null) {
                    vbD.A01 = DbT.A0b(A0H2, R.id.on_this_day_preview_image_thumbnail);
                }
                IgImageView igImageView2 = vbD.A01;
                if (igImageView2 != null) {
                    igImageView2.A0E = vbD.A06;
                }
            }
        }
        vbD.A05.setText(2131976959);
        C64253LXf lXf = new C64253LXf(0, activity, fragment, r25, userSession, subList);
        AnonymousClass0fU.A00(lXf, vbD.A02);
        View view2 = vbD.A00;
        if (view2 != null) {
            AnonymousClass0fU.A00(lXf, view2);
        }
        C71403Ok2.A01(vbD.A03, 5, archiveReelFragment);
        AnonymousClass0fD.A0A(257988397, A032);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        if (!((VM4) obj2).A00) {
            r2.A7U(0);
        }
    }

    public C15538UeR(Activity activity, Fragment fragment, ArchiveReelFragment archiveReelFragment, AnonymousClass0iw r4, UserSession userSession) {
        this.A00 = activity;
        this.A01 = fragment;
        this.A04 = userSession;
        this.A03 = r4;
        this.A02 = archiveReelFragment;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(1606394725);
        View A0A = DbU.A0A(DbX.A0F(viewGroup, 0), viewGroup, R.layout.layout_archive_auto_create_clip, false);
        A0A.setTag(new C17621VbD(A0A));
        AnonymousClass0fD.A0A(-1629738989, A032);
        return A0A;
    }
}
