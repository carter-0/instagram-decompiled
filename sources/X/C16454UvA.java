package X;

import android.graphics.RectF;
import android.os.Bundle;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UvA  reason: case insensitive filesystem */
public final class C16454UvA extends C15291UZw {
    public static final String __redex_internal_original_name = "ExploreShareGridFragment";
    public int A00;
    public RectF A01;
    public File A02;
    public File A03;
    public List A04;
    public final C41837B2s A05 = new WUP(this, 13);

    public final String getModuleName() {
        return "explore_grid_share";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1121494374);
        super.onCreate(bundle);
        this.A01 = AnonymousClass7TF.A0C((float) AnonymousClass0nB.A01(requireContext()), (float) AnonymousClass0nB.A00(requireContext()));
        Bundle requireArguments = requireArguments();
        ArrayList<String> stringArrayList = requireArguments.getStringArrayList("string_list");
        C320236s2.A03(requireArguments, stringArrayList, "string_list");
        this.A04 = stringArrayList;
        this.A03 = new File(C320236s2.A01(requireArguments(), "explore_grid_file"));
        this.A02 = new File(C320236s2.A01(requireArguments(), AnonymousClass000.A00(520)));
        this.A00 = requireArguments().getInt("entrypoint");
        AnonymousClass0fD.A09(-1362947172, A022);
    }
}
