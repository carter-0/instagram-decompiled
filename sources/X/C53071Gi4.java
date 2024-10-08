package X;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

@Deprecated(message = "PagedListAdapter is deprecated and has been replaced by PagingDataAdapter", replaceWith = @ReplaceWith(expression = "PagingDataAdapter<T, VH>", imports = {"androidx.paging.PagingDataAdapter"}))
/* renamed from: X.Gi4  reason: case insensitive filesystem */
public final class C53071Gi4 extends 2Rw {
    public final Context A00;
    public final I0B A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final 0sL A04;

    public C53071Gi4(Context context, C252303ot r5, AnonymousClass0iw r6, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        C59344JFw jFw = new C59344JFw(this, 17);
        this.A04 = jFw;
        I0B i0b = new I0B(r5, this);
        this.A01 = i0b;
        i0b.A09.add(new IHP(jFw));
        this.A02 = r6;
        this.A03 = userSession;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        C53138GjA gjA = new C53138GjA(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.layout_clips_grid_item, false), this);
        Size A012 = C320546sY.A01(this.A00, 0.5625f);
        View view = gjA.itemView;
        0qQ.A06(view);
        0nA.A0f(view, A012.getWidth());
        View view2 = gjA.itemView;
        0qQ.A06(view2);
        0nA.A0V(view2, A012.getHeight());
        return gjA;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r7, int i) {
        Object obj;
        ImageUrl A1Q;
        C53138GjA gjA = (C53138GjA) r7;
        0qQ.A0B(gjA, 0);
        I0B i0b = this.A01;
        C66125MCx mCx = i0b.A02;
        C66125MCx mCx2 = i0b.A01;
        if (mCx != null) {
            obj = mCx.get(i);
        } else if (mCx2 != null) {
            mCx2.A01(i);
            obj = mCx2.get(i);
        } else {
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
        C267324bN r5 = (C267324bN) obj;
        if (r5 != null) {
            IgImageView igImageView = gjA.A02;
            igImageView.A00 = 0.5625f;
            1Xj r0 = r5.A02;
            if (!(r0 == null || (A1Q = r0.A1Q()) == null)) {
                igImageView.setUrl(A1Q, gjA.A03.A02);
            }
            igImageView.setContentDescription(AnonymousClass7TF.A0e(gjA.itemView.getResources(), r5.A08(gjA.A03.A03), 2131971901));
            gjA.A01.setText(C14066TpE.A00(gjA.itemView.getResources(), Integer.valueOf(r5.A0C), (Integer) null, false));
            gjA.A00.setVisibility(0);
        }
    }

    public final int getItemCount() {
        int size;
        int A032 = AnonymousClass0fD.A03(1087864108);
        I0B i0b = this.A01;
        C66125MCx mCx = i0b.A02;
        if (mCx == null && (mCx = i0b.A01) == null) {
            size = 0;
        } else {
            size = mCx.size();
        }
        AnonymousClass0fD.A0A(231148461, A032);
        return size;
    }
}
