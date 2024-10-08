package X;

import android.graphics.RectF;
import android.os.Bundle;
import com.instagram.common.typedurl.ImageUrl;
import java.io.File;

/* renamed from: X.UvE  reason: case insensitive filesystem */
public final class C16458UvE extends C15291UZw {
    public static final String __redex_internal_original_name = "PublicCollectionsShareFragment";
    public int A00;
    public RectF A01;
    public ImageUrl A02;
    public File A03;
    public File A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public final C41837B2s A09 = new WUP(this, 16);

    public final String getModuleName() {
        return AnonymousClass000.A00(357);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1432009348);
        super.onCreate(bundle);
        this.A01 = AnonymousClass7TF.A0C((float) AnonymousClass0nB.A01(requireContext()), (float) AnonymousClass0nB.A00(requireContext()));
        this.A06 = C320236s2.A01(requireArguments(), "collection_name");
        this.A00 = requireArguments().getInt("collection_num_posts");
        this.A04 = new File(C320236s2.A01(requireArguments(), "bitmap_path"));
        this.A03 = new File(C320236s2.A01(requireArguments(), "background_file"));
        this.A07 = C320236s2.A01(requireArguments(), "collection_username");
        this.A02 = (ImageUrl) C320236s2.A00(requireArguments(), ImageUrl.class, "collection_profile_pic_url");
        this.A05 = C320236s2.A01(requireArguments(), "collection_id");
        this.A08 = requireArguments().getString(AnonymousClass000.A00(1232));
        AnonymousClass0fD.A09(1382147526, A022);
    }
}
