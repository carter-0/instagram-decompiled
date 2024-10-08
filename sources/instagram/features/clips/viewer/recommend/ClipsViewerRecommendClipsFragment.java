package instagram.features.clips.viewer.recommend;

import X.0qQ;
import X.1NY;
import X.1OC;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DH;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C14798U9s;
import X.C15622Ufo;
import X.C18180Vmu;
import X.C227642jf;
import X.DbS;
import X.DbT;
import X.DbU;
import X.UXE;
import X.WB0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;

public final class ClipsViewerRecommendClipsFragment extends AnonymousClass4DH {
    public C14798U9s A00;
    public String A01;
    public String A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public RecyclerView recyclerView;
    public SpinnerImageView spinnerImageView;
    public IgdsButton submitButton;

    public final String getModuleName() {
        return "clips_viewer_recommend_clips";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = new C14798U9s(new ArrayList());
        RecyclerView A0I = DbT.A0I(view, R.id.clips_viewer_recommend_clips_recycler_view);
        0qQ.A0B(A0I, 0);
        this.recyclerView = A0I;
        SpinnerImageView spinnerImageView2 = (SpinnerImageView) view.requireViewById(R.id.clips_viewer_recommend_clips_spinner);
        0qQ.A0B(spinnerImageView2, 0);
        this.spinnerImageView = spinnerImageView2;
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            DbU.A15(getContext(), recyclerView2, 1, false);
            RecyclerView recyclerView3 = this.recyclerView;
            if (recyclerView3 != null) {
                recyclerView3.A0S = true;
                C14798U9s u9s = this.A00;
                if (u9s == null) {
                    str = "recommendClipsAdapter";
                } else {
                    recyclerView3.setAdapter(u9s);
                    IgdsButton igdsButton = (IgdsButton) view.requireViewById(R.id.clips_viewer_recommend_clips_button);
                    0qQ.A0B(igdsButton, 0);
                    this.submitButton = igdsButton;
                    WB0.A00(igdsButton, 64, this);
                    RecyclerView recyclerView4 = this.recyclerView;
                    if (recyclerView4 != null) {
                        recyclerView4.setVisibility(8);
                        SpinnerImageView spinnerImageView3 = this.spinnerImageView;
                        if (spinnerImageView3 != null) {
                            spinnerImageView3.setVisibility(0);
                            1NY A0a = AnonymousClass7TG.A0a(AnonymousClass7TF.A0L(this.A03, 0));
                            A0a.A0A("clips/labeling_categories/");
                            1OC A0S = DbU.A0S(A0a, UXE.class, C18180Vmu.class);
                            C15622Ufo.A00(A0S, this, 18);
                            schedule(A0S);
                            return;
                        }
                        str = "spinnerImageView";
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        str = "recyclerView";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-925469681);
        ClipsViewerRecommendClipsFragment.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = requireArguments.getString(AnonymousClass000.A00(2160));
        this.A01 = requireArguments.getString(AnonymousClass000.A00(2159));
        AnonymousClass0fD.A09(650591515, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(89693784);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_clips_viewer_recommend_clips_fragment, false);
        AnonymousClass0fD.A09(-1956115909, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-652742816);
        super.onDestroyView();
        ClipsViewerRecommendClipsFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(755485928, A022);
    }
}
