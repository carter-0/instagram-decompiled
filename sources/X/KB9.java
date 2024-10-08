package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.List;
import java.util.Map;

public final class KB9 extends C252233om implements C361528gN, AnonymousClass8XQ, 1DN, AdapterView.OnItemSelectedListener {
    public RecyclerView A00;
    public C63851L9g A01;
    public final Context A02;
    public final C60051JeJ A03;
    public final C61371K4p A04;
    public final AnonymousClass8XW A05;
    public final C60444Jlc A06;

    public KB9(Fragment fragment, UserSession userSession, C61371K4p k4p) {
        0qQ.A0B(userSession, 1);
        this.A04 = k4p;
        Context requireContext = fragment.requireContext();
        this.A02 = requireContext;
        C60051JeJ jeJ = new C60051JeJ(this);
        jeJ.A01 = R.layout.layout_folder_picker_title;
        jeJ.A00 = R.layout.layout_folder_picker_item;
        this.A03 = jeJ;
        int A09 = (0nA.A09(requireContext) - (JTU.A02(requireContext, 3) * 2)) / 3;
        int A042 = JTO.A04((float) ((0nA.A09(requireContext) - (JTU.A02(requireContext, 3) * 2)) / 3), 0.5625f);
        C355608Qq r5 = new C355608Qq(requireContext, userSession, AnonymousClass05K.A00, A09, A042, true);
        C60444Jlc jlc = new C60444Jlc(r5, this, A09, A042);
        this.A06 = jlc;
        AnonymousClass8XN r2 = new AnonymousClass8XN(AnonymousClass07i.A00(fragment), r5);
        r2.A03 = AnonymousClass8XO.STATIC_PHOTO_ONLY;
        r2.A07 = this;
        this.A05 = new AnonymousClass8XW(requireContext, (2Cn) null, jlc, new AnonymousClass8XU(r2));
    }

    public final void DCx(Exception exc) {
    }

    public final void onDestroyView() {
        this.A01 = null;
        this.A00 = null;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        RecyclerView A0K = DbX.A0K(view);
        Context context = A0K.getContext();
        A0K.setLayoutManager(new GridLayoutManager(context, 3));
        A0K.setAdapter(this.A06);
        0qQ.A07(context);
        A0K.A11(new C320836t2(JTU.A02(context, 3), false, 0));
        this.A00 = A0K;
        this.A01 = new C63851L9g(this.A04.requireActivity(), DbX.A0I(view, R.id.root_container), this);
    }

    public final void DQY(AnonymousClass8XW r3, List list, List list2, int i) {
        C60051JeJ jeJ = this.A03;
        if (jeJ != null) {
            0fE.A00(jeJ, -899693561);
        }
    }

    public final void DWm(Map map) {
        C339797kB r0;
        boolean A032 = C2604245p.A03(this.A02);
        C63851L9g l9g = this.A01;
        if (A032) {
            if (!(l9g == null || (r0 = l9g.A00) == null)) {
                r0.A00();
                l9g.A00 = null;
            }
            this.A05.A07();
        } else if (l9g != null) {
            C339797kB r02 = l9g.A00;
            if (r02 != null) {
                r02.A00();
                l9g.A00 = null;
            }
            C339797kB A0O = JTQ.A0O(l9g.A01);
            l9g.A00 = A0O;
            A0O.A05(l9g.A04);
            A0O.A04(l9g.A03);
            A0O.A02(2131956808);
            A0O.A03(LYD.A01(l9g, 0));
        }
    }

    public final Folder getCurrentFolder() {
        return this.A05.A02;
    }

    public final List getFolders() {
        return C64078LLw.A00(C64455LcE.A00, this.A05);
    }

    public final void onPause() {
        this.A05.A08();
    }

    public final void onResume() {
        if (C2604245p.A03(this.A02)) {
            C63851L9g l9g = this.A01;
            if (l9g != null) {
                C339797kB r0 = l9g.A00;
                if (r0 != null) {
                    r0.A00();
                    l9g.A00 = null;
                }
                this.A05.A07();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        C2604245p.A01(this.A04.requireActivity(), this);
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        AnonymousClass8XW r2 = this.A05;
        int i2 = r2.A02.A02;
        int i3 = ((Folder) getFolders().get(i)).A02;
        if (i2 != i3) {
            r2.A0D(i3);
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                recyclerView.A0o(0);
            }
        }
    }
}
