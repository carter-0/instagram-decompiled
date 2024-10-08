package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.List;

/* renamed from: X.Lgl  reason: case insensitive filesystem */
public final class C64712Lgl implements C252243on, C361528gN, AnonymousClass8XQ, AdapterView.OnItemSelectedListener {
    public RecyclerView A00;
    public IgTextView A01;
    public final K7A A02;
    public final AnonymousClass8XW A03;
    public final Context A04;
    public final Fragment A05;
    public final UserSession A06;
    public final C60051JeJ A07 = new C60051JeJ(this);
    public final C60443Jlb A08;

    public C64712Lgl(Fragment fragment, UserSession userSession, K7A k7a) {
        0qQ.A0B(userSession, 1);
        this.A06 = userSession;
        this.A05 = fragment;
        this.A02 = k7a;
        Context requireContext = fragment.requireContext();
        this.A04 = requireContext;
        int A09 = (0nA.A09(requireContext) - (JTU.A02(requireContext, 3) * 2)) / 3;
        int A042 = JTO.A04((float) ((0nA.A09(requireContext) - (JTU.A02(requireContext, 3) * 2)) / 3), 0.5625f);
        C355608Qq r5 = new C355608Qq(requireContext, userSession, AnonymousClass05K.A00, A09, A042, true);
        C60443Jlb jlb = new C60443Jlb(r5, this, A09, A042);
        this.A08 = jlb;
        AnonymousClass8XN r2 = new AnonymousClass8XN(AnonymousClass07i.A00(fragment), r5);
        r2.A03 = AnonymousClass8XO.VIDEO_ONLY;
        r2.A07 = this;
        this.A03 = new AnonymousClass8XW(requireContext, (2Cn) null, jlb, new AnonymousClass8XU(r2));
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final void DCx(Exception exc) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final void onDestroyView() {
        this.A00 = null;
        this.A01 = null;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        DbT.A1F(view, R.id.gallery_container, 0);
        DbT.A1F(view, R.id.gallery_container_coordinator, 0);
        RecyclerView A0I = DbT.A0I(view, R.id.gallery_recycler_view);
        Context context = A0I.getContext();
        A0I.setLayoutManager(new GridLayoutManager(context, 3));
        A0I.setAdapter(this.A08);
        0qQ.A07(context);
        A0I.A11(new C320836t2(JTU.A02(context, 3), false, 0));
        A0I.setVisibility(0);
        this.A00 = A0I;
        this.A01 = DbT.A0a(view, R.id.gallery_empty);
        DbT.A1F(view, R.id.gallery_header, 0);
        DbT.A1F(view, R.id.gallery_cancel_button, Dbb.A03(view, R.id.gallery_title));
        view.requireViewById(R.id.gallery_settings_gear).setVisibility(4);
        DbT.A1F(view, R.id.import_oa_instructions, 0);
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void DQY(AnonymousClass8XW r3, List list, List list2, int i) {
        C60051JeJ jeJ = this.A07;
        if (jeJ != null) {
            0fE.A00(jeJ, -741721130);
        }
    }

    public final Folder getCurrentFolder() {
        return this.A03.A02;
    }

    public final List getFolders() {
        return C64078LLw.A00(C64454LcD.A00, this.A03);
    }

    public final void onPause() {
        this.A03.A08();
    }

    public final void onResume() {
        IgTextView igTextView;
        int i;
        if (C2604245p.A03(this.A04)) {
            this.A03.A07();
            igTextView = this.A01;
            if (igTextView != null) {
                i = 4;
            } else {
                return;
            }
        } else {
            igTextView = this.A01;
            if (igTextView != null) {
                i = 0;
            } else {
                return;
            }
        }
        igTextView.setVisibility(i);
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        AnonymousClass8XW r2 = this.A03;
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
