package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.mediakit.model.MediaKitSectionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class K42 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "MediaKitAddSectionSheetFragment";
    public RecyclerView A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02 = DbS.A0I(MML.A00(this, 28), MML.A00(this, 29), MMW.A00((Object) null, this, 1), DbS.A0z(C60327JjW.class));

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.2tF, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = DbT.A0I(view, R.id.mk_add_section_types_list);
        AnonymousClass2t9 A0U = DbU.A0U(DbV.A0S(this), new Object());
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setAdapter(A0U);
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 != null) {
                recyclerView2.A11(new C60465Jlx(requireContext().getColor(R.color.igds_quick_send_divider_background), AnonymousClass7TG.A02(requireContext())));
                ViewModelListUpdate A0R = DbS.A0R();
                ArrayList A1M = 0sr.A1M(new C64799LiJ[]{new C64799LiJ(MediaKitSectionType.TEXT, this, AnonymousClass7TF.A0d(DbV.A05(this), 2131966573), AnonymousClass7TF.A0d(DbV.A05(this), 2131966572)), new C64799LiJ(MediaKitSectionType.MEDIA_POSTS, this, AnonymousClass7TF.A0d(DbV.A05(this), 2131966569), AnonymousClass7TF.A0d(DbV.A05(this), 2131966568)), new C64799LiJ(MediaKitSectionType.ACCOUNTS, this, AnonymousClass7TF.A0d(DbV.A05(this), 2131966571), AnonymousClass7TF.A0d(DbV.A05(this), 2131966570))});
                C60327JjW A0a = JTT.A0a(this.A02);
                if (A0a.A08.A04) {
                    ArrayList arrayList = A0a.A07.A02.A04;
                    if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C61220JzD) it.next()).A01 == MediaKitSectionType.INSIGHTS) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    A1M.add(new C64799LiJ(MediaKitSectionType.INSIGHTS, this, AnonymousClass7TF.A0d(DbV.A05(this), 2131966567), AnonymousClass7TF.A0d(DbV.A05(this), 2131966566)));
                }
                A0R.A01(A1M);
                A0U.A05(A0R);
                return;
            }
        }
        0qQ.A0F("recyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1330430032);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.media_kit_add_section_bottom_sheet_fragment, false);
        AnonymousClass0fD.A09(1359127020, A022);
        return A0D;
    }
}
