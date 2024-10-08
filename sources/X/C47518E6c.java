package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;

/* renamed from: X.E6c  reason: case insensitive filesystem */
public abstract class C47518E6c extends C227812jx {
    public static final String __redex_internal_original_name = "IgMenuFragment";
    public AnonymousClass0wW mSession;

    public boolean isElevated() {
        return false;
    }

    public static void A01(Context context, Object obj, AbstractCollection abstractCollection, int i, int i2) {
        abstractCollection.add(new C50989Fmc(context, (View.OnClickListener) new FP2(obj, i), i2));
    }

    public static void A02(Context context, Object obj, AbstractCollection abstractCollection, int i, int i2) {
        abstractCollection.add(new C50989Fmc(context, (View.OnClickListener) new FP9(obj, i), i2));
    }

    public static void A04(Fragment fragment, 2da r18, int i) {
        2da r3 = r18;
        r3.Eom(i);
        r3.Eu4(true);
        r3.ErJ(new AnonymousClass57Z((Resources.Theme) null, AnonymousClass37O.A00(fragment.requireContext().getColor(2Yu.A0B(fragment.requireContext()))), (ColorFilter) null, (Drawable) null, (Drawable) null, (View.OnClickListener) null, AnonymousClass05K.A00, -2, -2, -2, -2, -2, -2, -2, true));
    }

    public static void A05(Object obj, AbstractCollection abstractCollection, int i, int i2, boolean z) {
        abstractCollection.add(new PR9((CompoundButton.OnCheckedChangeListener) new FQO(obj, i), i2, z));
    }

    public static List A00(UserSession userSession, 0eE r1) {
        return r1.A01(userSession).A03.B0k();
    }

    public static void A03(Uri uri, Fragment fragment, String str, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new FGF(AnonymousClass7AV.A00(uri, str, fragment.getString(i, new Object[]{str}))));
    }

    public int getBottomPadding() {
        return DbZ.A02(this);
    }

    public int getItemPosition(Object obj) {
        return ((C68504NKx) getAdapter()).getPosition(obj);
    }

    public int getTopPadding() {
        return DbZ.A02(this);
    }

    public Boolean getUseRecyclerViewFromQE() {
        return AnonymousClass7TE.A0v();
    }

    public void notifyItemChanged(int i) {
        getAdapter().notifyItemChanged(i);
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-160817365);
        super.onCreate(bundle);
        this.mSession = DbX.A0T(this);
        setAdapter(new C68504NKx(requireContext(), this.mSession, this));
        AnonymousClass0fD.A09(-221509986, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(902052602);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_recyclerview);
        if (isElevated()) {
            A0C.setBackgroundResource(2Yu.A02(requireContext()));
        }
        AnonymousClass0fD.A09(-74569936, A02);
        return A0C;
    }

    public void onRecyclerViewCreated(RecyclerView recyclerView) {
        DbV.A1B(recyclerView.getContext(), recyclerView);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        DbV.A0F(this).setPadding(0, getTopPadding(), 0, getBottomPadding());
        DbV.A0F(this).setClipToPadding(false);
        C249453jo activity = getActivity();
        if (activity instanceof C249453jo) {
            C238133Ar scrollingViewProxy = getScrollingViewProxy();
            C249453jo r2 = activity;
            int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            0qQ.A0B(r2, 1);
            scrollingViewProxy.AAD(new C238893Dv(r2, 0));
        }
    }

    public void scrollToPosition(int i) {
        getScrollingViewProxy().Evq(i);
    }

    public void setBottomSheetMenuItems(Collection collection) {
        ((C68504NKx) getAdapter()).setBottomSheetMenuItems(collection);
    }

    public void setItems(Collection collection) {
        ((C68504NKx) getAdapter()).setItems(collection);
    }
}
