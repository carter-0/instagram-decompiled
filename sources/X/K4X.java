package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.List;

public final class K4X extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "MagicMediaRemixTemplateFragment";
    public int A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public AnonymousClass2t9 A04;
    public IgLinearLayout A05;
    public IgSimpleImageView A06;
    public DirectThreadKey A07;
    public String A08 = "";
    public String A09 = "";
    public ArrayList A0A = AnonymousClass7TE.A1C();
    public C39757A7x A0B;
    public final List A0C = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A0D = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.2tF, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        Parcelable parcelable;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            parcelable = bundle2.getParcelable(C66579MXk.A00(948));
        } else {
            parcelable = null;
        }
        Parcelable.Creator creator = DirectThreadKey.CREATOR;
        0qQ.A08(creator);
        this.A07 = (DirectThreadKey) 0B0.A01(creator, parcelable, DirectThreadKey.class);
        this.A0B = C395099zD.A00(AnonymousClass7TE.A0l(this.A0D));
        this.A03 = DbT.A0I(view, R.id.magic_media_remix_template_item_recycler_view);
        this.A04 = DbU.A0U(AnonymousClass2t9.A00(view.getContext()), new Object());
        RecyclerView recyclerView = this.A03;
        int i = 0;
        if (recyclerView != null) {
            DbV.A1A(recyclerView.getContext(), recyclerView);
            AnonymousClass2t9 r0 = this.A04;
            if (r0 == null) {
                0qQ.A0F("magicMediaRemixTemplateAdapter");
                throw AnonymousClass00P.createAndThrow();
            }
            recyclerView.setAdapter(r0);
        }
        C349087zZ r1 = new C349087zZ();
        new C60377JkW();
        r1.A07(this.A03);
        RecyclerView recyclerView2 = this.A03;
        if (recyclerView2 != null) {
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                i = bundle3.getInt(C66579MXk.A00(950));
            }
            recyclerView2.A0o(i);
        }
        this.A08 = requireArguments().getString(C66579MXk.A00(949), "");
        this.A09 = requireArguments().getString(C66579MXk.A00(951), "");
        this.A00 = requireArguments().getInt(C66579MXk.A00(947));
        ArrayList<String> stringArrayList = requireArguments().getStringArrayList(C66579MXk.A00(946));
        0qQ.A0C(stringArrayList, AnonymousClass000.A00(52));
        this.A0A = stringArrayList;
        AnonymousClass7TE.A1Z(new MHI(this, view, (AnonymousClass4D7) null, 41), DbW.A0E(this));
    }

    public static final int A00(K4X k4x) {
        C252553pI r1;
        RecyclerView recyclerView = k4x.A03;
        C252553pI r0 = null;
        if (recyclerView != null) {
            r1 = recyclerView.A0D;
        } else {
            r1 = null;
        }
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int A1c = ((LinearLayoutManager) r1).A1c();
        if (A1c != -1) {
            return A1c;
        }
        RecyclerView recyclerView2 = k4x.A03;
        if (recyclerView2 != null) {
            r0 = recyclerView2.A0D;
        }
        0qQ.A0C(r0, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        return ((LinearLayoutManager) r0).A1a();
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0D);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.setResult(-1);
            }
            DbX.A1I(this);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1058515951);
        0qQ.A0B(layoutInflater, 0);
        DbV.A0G(this).getDecorView().setSystemUiVisibility(1028);
        View inflate = layoutInflater.inflate(R.layout.magic_media_remix_template_layout, viewGroup, false);
        AnonymousClass0fD.A09(-672457817, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1410020781);
        super.onDestroyView();
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
        this.A06 = null;
        this.A05 = null;
        AnonymousClass0fD.A09(-1433096011, A022);
    }
}
