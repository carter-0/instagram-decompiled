package X;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.ui.widget.nestablescrollingview.NestableRecyclerView;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9iB  reason: invalid class name and case insensitive filesystem */
public final class C384969iB extends C273374mT {
    public static final String __redex_internal_original_name = "CanvasMemoriesBottomSheetFragment";
    public C387509mK A00;
    public GradientDrawable A01;
    public TextColorScheme A02;
    public NestableRecyclerView A03;
    public HashMap A04 = AnonymousClass7TE.A1E();
    public List A05;

    public final String getModuleName() {
        return "canvas_memories_bottom_sheet_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        UserSession session = getSession();
        List list = this.A05;
        HashMap hashMap = this.A04;
        AnonymousClass9YO r3 = new AnonymousClass9YO(this.A01, session, this, hashMap, list);
        View findViewById = view.findViewById(R.id.canvas_memories_bottom_sheet_list);
        findViewById.getClass();
        NestableRecyclerView nestableRecyclerView = (NestableRecyclerView) findViewById;
        this.A03 = nestableRecyclerView;
        nestableRecyclerView.A05 = true;
        nestableRecyclerView.A01 = false;
        nestableRecyclerView.setAdapter(r3);
        this.A03.setLayoutManager(new GridLayoutManager(requireContext(), 2));
        Resources resources = requireContext().getResources();
        this.A03.A11(new C14808UAe(this, AnonymousClass7TE.A0E(resources), AnonymousClass7TE.A0B(resources), 0));
        this.A03.setPassThroughEdge(1);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1654672798);
        C384969iB.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Serializable serializable = requireArguments.getSerializable("CanvasTemplatesBottomSheetFragment.MEMORIES_LIST");
        serializable.getClass();
        this.A05 = (List) serializable;
        Parcelable parcelable = requireArguments.getParcelable("CanvasMemoriesBottomSheetFragment.ARG_TEXT_MODE_COLOR_SCHEME");
        parcelable.getClass();
        this.A02 = (TextColorScheme) parcelable;
        Serializable serializable2 = requireArguments.getSerializable("CanvasMemoriesBottomSheetFragment.ARG_MEDIUM_MAP");
        serializable2.getClass();
        this.A04 = (HashMap) serializable2;
        GradientDrawable.Orientation orientation = this.A02.A03;
        orientation.getClass();
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, this.A02.A01());
        this.A01 = gradientDrawable;
        gradientDrawable.setDither(true);
        this.A01.setCornerRadius(12.0f);
        AnonymousClass0fD.A09(-1039209775, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1353846819);
        View inflate = layoutInflater.inflate(R.layout.canvas_memories_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(1034445715, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1254384265);
        C384969iB.super.onPause();
        AnonymousClass37D A023 = AnonymousClass37D.A00.A02(getContext());
        if (A023 != null) {
            A023.A0B();
        }
        AnonymousClass0fD.A09(-893066174, A022);
    }
}
