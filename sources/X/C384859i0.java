package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.nestablescrollingview.NestableRecyclerView;
import java.io.Serializable;
import java.util.List;

/* renamed from: X.9i0  reason: invalid class name and case insensitive filesystem */
public final class C384859i0 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "CanvasMentionBottomSheetFragment";
    public C39644A3k A00;
    public UserSession A01;
    public NestableRecyclerView A02;
    public List A03;

    public final String getModuleName() {
        return "canvas_mention_bottom_sheet_fragment";
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-391688140);
        C384859i0.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = AnonymousClass7TE.A0l(C227642jf.A02(this));
        Serializable serializable = requireArguments.getSerializable("CanvasMentionBottomSheetFragment.MEDIA_LIST");
        serializable.getClass();
        this.A03 = (List) serializable;
        requireArguments.remove("CanvasMentionBottomSheetFragment.MEDIA_LIST");
        AnonymousClass0fD.A09(1011958528, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1409201825);
        View inflate = layoutInflater.inflate(R.layout.canvas_mention_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(438707976, A022);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Resources resources = requireContext().getResources();
        int A0E = AnonymousClass7TE.A0E(resources);
        int A0B = AnonymousClass7TE.A0B(resources);
        this.A02 = (NestableRecyclerView) view.requireViewById(R.id.canvas_mention_bottom_sheet_list);
        this.A02.setAdapter(new UA7(this.A01, this, this.A03));
        this.A02.setLayoutManager(new GridLayoutManager(requireContext(), 2));
        this.A02.A11(new C14808UAe(this, A0E, A0B, 1));
        this.A02.setPassThroughEdge(1);
    }
}
