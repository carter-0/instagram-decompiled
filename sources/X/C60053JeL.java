package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.JeL  reason: case insensitive filesystem */
public final class C60053JeL extends BaseAdapter {
    public C62630Kj1 A00;
    public boolean A01;
    public boolean A02;
    public boolean A03 = false;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final MRC A06;
    public final MUJ A07;
    public final MVH A08;
    public final ArrayList A09;
    public final Map A0A;

    public final int getViewTypeCount() {
        return 2;
    }

    public final int getCount() {
        return this.A09.size();
    }

    public final Object getItem(int i) {
        return this.A09.get(i);
    }

    public final long getItemId(int i) {
        return Long.parseLong(JTO.A0p(this.A09, i).A06);
    }

    public final int getItemViewType(int i) {
        return AnonymousClass7TF.A1W(JTO.A0p(this.A09, i).A03, 1iA.A0a) ? 1 : 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        Object ka8;
        if (view == null) {
            if (getItemViewType(i) != 0) {
                view = DbU.A0A(DbX.A0F(viewGroup, 0), viewGroup, R.layout.layout_tag_video, false);
                ka8 = new C62102Ka7(view);
            } else {
                view = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.layout_tagging_photo);
                ka8 = new C62103Ka8(view);
            }
            view.setTag(ka8);
        }
        if (getItemViewType(i) != 0) {
            C62102Ka7 ka7 = (C62102Ka7) DbT.A0o(view);
            MediaTaggingInfo A0p = JTO.A0p(this.A09, i);
            AnonymousClass0iw r4 = this.A04;
            MRC mrc = this.A06;
            C51974G9v.A1K(ka7, A0p, mrc);
            IgImageView igImageView = ka7.A00;
            ImageUrl imageUrl = A0p.A02;
            if (imageUrl == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (r4 != null) {
                igImageView.setUrl(imageUrl, r4);
                MediaFrameLayout mediaFrameLayout = ka7.A01;
                mediaFrameLayout.A00 = LTZ.A00(A0p);
                C64273LXz.A00(mediaFrameLayout, 66, mrc);
                return view;
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            C62630Kj1 kj1 = this.A00;
            UserSession userSession = this.A05;
            AnonymousClass0iw r0 = this.A04;
            MVH mvh = this.A08;
            mvh.getClass();
            C63456KxL.A00(r0, userSession, (C62103Ka8) DbT.A0o(view), (MediaTaggingInfo) this.A09.get(i), kj1, this.A07, mvh, this.A0A, this.A03, this.A02, this.A01);
            return view;
        }
    }

    public C60053JeL(AnonymousClass0iw r2, UserSession userSession, MRC mrc, MUJ muj, MVH mvh, ArrayList arrayList, Map map, boolean z, boolean z2) {
        this.A09 = arrayList;
        this.A05 = userSession;
        this.A04 = r2;
        this.A08 = mvh;
        this.A07 = muj;
        this.A06 = mrc;
        this.A0A = map;
        this.A02 = z;
        this.A01 = z2;
    }
}
