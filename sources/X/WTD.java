package X;

import android.os.Bundle;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.modal.TransparentModalActivity;
import java.io.File;
import java.io.IOException;

public final class WTD implements MTS {
    public final /* synthetic */ ImageUrl A00;
    public final /* synthetic */ DirectShareSheetFragment A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public WTD(ImageUrl imageUrl, DirectShareSheetFragment directShareSheetFragment, String str, String str2, String str3) {
        this.A01 = directShareSheetFragment;
        this.A00 = imageUrl;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
    }

    public final void onFailure(Exception exc) {
        C59689JTv.A08(this.A01.requireActivity(), 2131975944, 0);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        File file = (File) obj;
        try {
            str = file.getCanonicalPath();
        } catch (IOException unused) {
            str = file.getAbsolutePath();
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("collection_profile_pic_url", this.A00);
        bundle.putString("bitmap_path", this.A02);
        DirectShareSheetFragment directShareSheetFragment = this.A01;
        bundle.putInt("collection_num_posts", AnonymousClass7TG.A0A(directShareSheetFragment.A0k.A0E));
        bundle.putInt("collection_num_posts", directShareSheetFragment.A07);
        bundle.putString("background_file", str);
        bundle.putString("collection_name", directShareSheetFragment.A0k.A0G);
        bundle.putString("collection_id", directShareSheetFragment.A0k.A0F);
        bundle.putString(AnonymousClass000.A00(1232), this.A03);
        bundle.putString("collection_username", this.A04);
        DbT.A1L(directShareSheetFragment, AnonymousClass6W8.A02(directShareSheetFragment.requireActivity(), bundle, directShareSheetFragment.A0G, TransparentModalActivity.class, AnonymousClass000.A00(357)));
    }
}
