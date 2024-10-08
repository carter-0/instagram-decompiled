package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.instagram.android.R;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.ui.widget.nestablescrollingview.NestableRecyclerView;
import java.io.Serializable;
import java.util.List;

/* renamed from: X.9iA  reason: invalid class name and case insensitive filesystem */
public final class C384959iA extends C273374mT {
    public static final String __redex_internal_original_name = "CanvasTemplatesBottomSheetFragment";
    public C387529mM A00;
    public GradientDrawable A01;
    public TextColorScheme A02;
    public NestableRecyclerView A03;
    public List A04;

    public final String getModuleName() {
        return "canvas_templates_bottom_sheet_fragment";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1071178860);
        C384959iA.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Serializable serializable = requireArguments.getSerializable("CanvasTemplatesBottomSheetFragment.TEMPLATES_LIST");
        serializable.getClass();
        this.A04 = (List) serializable;
        requireArguments.remove("CanvasTemplatesBottomSheetFragment.TEMPLATES_LIST");
        Parcelable parcelable = requireArguments.getParcelable("CanvasTemplatesBottomSheetFragment.ARG_TEXT_MODE_COLOR_SCHEME");
        parcelable.getClass();
        this.A02 = (TextColorScheme) parcelable;
        requireArguments.remove("CanvasTemplatesBottomSheetFragment.ARG_TEXT_MODE_COLOR_SCHEME");
        GradientDrawable.Orientation orientation = this.A02.A03;
        orientation.getClass();
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, this.A02.A01());
        this.A01 = gradientDrawable;
        gradientDrawable.setDither(true);
        this.A01.setCornerRadius(12.0f);
        AnonymousClass0fD.A09(924182792, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1799618911);
        View inflate = layoutInflater.inflate(R.layout.canvas_templates_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(-157503552, A022);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        NestableRecyclerView nestableRecyclerView = (NestableRecyclerView) view.requireViewById(R.id.canvas_templates_bottom_sheet_list);
        this.A03 = nestableRecyclerView;
        nestableRecyclerView.getClass();
        NestableRecyclerView nestableRecyclerView2 = this.A03;
        nestableRecyclerView2.A05 = true;
        nestableRecyclerView2.A01 = false;
        this.A03.setAdapter(new AnonymousClass9YN(this.A01, this, this, this.A04));
        this.A03.setLayoutManager(new GridLayoutManager(requireContext(), 2));
        Context context = getContext();
        context.getClass();
        Resources resources = context.getResources();
        this.A03.A11(new C14808UAe(this, AnonymousClass7TE.A0E(resources), AnonymousClass7TE.A0B(resources), 2));
        this.A03.setPassThroughEdge(1);
    }
}
