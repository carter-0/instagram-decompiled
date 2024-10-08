package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.K9y  reason: case insensitive filesystem */
public final class C61493K9y extends C231632rz {
    public final Context A00;
    public final ReelDashboardFragment A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C61493K9y(Context context, ReelDashboardFragment reelDashboardFragment) {
        this.A00 = context;
        this.A01 = reelDashboardFragment;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(602510744);
        C62929Koh koh = (C62929Koh) DbT.A0o(view);
        Context context = this.A00;
        ReelDashboardFragment reelDashboardFragment = this.A01;
        AnonymousClass7TF.A1B(koh, 0, reelDashboardFragment);
        0qQ.A0A(context);
        C363208jL r0 = new C363208jL(context, 1.0f, R.color.grey_2, 48);
        r0.A00(0, 0, 0, 0);
        TextView textView = koh.A01;
        textView.setBackground(r0);
        AnonymousClass0fU.A00(new FP2((Object) reelDashboardFragment, 24), textView);
        AnonymousClass0fD.A0A(1742947442, A03);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Koh, java.lang.Object] */
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1832418022);
        View A0A = DbU.A0A(DbX.A0F(viewGroup, 0), viewGroup, R.layout.reel_dashboard_group_message_row, false);
        0qQ.A0B(A0A, 1);
        ? obj = new Object();
        obj.A00 = A0A;
        TextView A0R = AnonymousClass7TG.A0R(A0A, R.id.group_message_title);
        obj.A01 = A0R;
        Context context = A0R.getContext();
        Drawable drawable = context.getDrawable(R.drawable.instagram_chevron_right_pano_outline_16);
        0qQ.A0A(drawable);
        drawable.setColorFilter(C51968G9o.A04(context), PorterDuff.Mode.SRC_IN);
        obj.A01.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.instagram_chevron_right_pano_outline_16, 0);
        A0A.setTag(obj);
        AnonymousClass0fD.A0A(-1855156102, A03);
        return A0A;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1649625492);
        if (view == null) {
            view = createView(i, viewGroup);
        }
        bindView(i, view, obj, obj2);
        AnonymousClass0fD.A0A(562909250, A03);
        return view;
    }
}
