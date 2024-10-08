package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

public class LFZ {
    public ImageUrl A00;
    public ImageUrl A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public Boolean A07;
    public Integer A08;
    public List A09;
    public final AnonymousClass16l A0A;

    public final AnonymousClass16l A00() {
        TreeJNI A012;
        String str;
        AnonymousClass16l r2 = this.A0A;
        if (r2 instanceof C62003KVa) {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            0eP A1L = AnonymousClass7TE.A1L("available_theme_colors", this.A09);
            ImageUrl imageUrl = this.A00;
            String str2 = null;
            if (imageUrl != null) {
                str = imageUrl.getUrl();
            } else {
                str = null;
            }
            0eP A1L2 = AnonymousClass7TE.A1L("background_image_url", str);
            0eP A1L3 = AnonymousClass7TE.A1L("emoji", this.A06);
            0eP A1L4 = AnonymousClass7TE.A1L("emoji_color", this.A02);
            0eP A1L5 = AnonymousClass7TE.A1L("gradient", this.A03);
            0eP A1L6 = AnonymousClass7TE.A1L("is_background_image_blurred", this.A07);
            0eP A1L7 = AnonymousClass7TE.A1L(DatePickerDialogModule.ARG_MODE, this.A04);
            0eP A1L8 = AnonymousClass7TE.A1L("selected_theme_color", this.A08);
            0eP A1L9 = AnonymousClass7TE.A1L("selfie_sticker", this.A05);
            ImageUrl imageUrl2 = this.A01;
            if (imageUrl2 != null) {
                str2 = imageUrl2.getUrl();
            }
            TreeJNI treeJNI = (TreeJNI) r2;
            A012 = new TreeUpdaterJNI(0Yt.A06(new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, AnonymousClass7TE.A1L("selfie_url", str2)}), treeJNI).applyToTree(treeJNI);
            0qQ.A07(A012);
        } else {
            A012 = A01();
        }
        return (AnonymousClass16l) A012;
    }

    public final 16k A01() {
        List list = this.A09;
        ImageUrl imageUrl = this.A00;
        String str = this.A06;
        Integer num = this.A02;
        Integer num2 = this.A03;
        return new 16k(imageUrl, this.A01, this.A07, num, num2, this.A04, this.A08, this.A05, str, list);
    }

    public LFZ(AnonymousClass16l r2) {
        this.A0A = r2;
        this.A09 = r2.AeD();
        this.A00 = r2.Aen();
        this.A06 = r2.getEmoji();
        this.A02 = r2.B0q();
        this.A03 = r2.B9f();
        this.A07 = r2.CPI();
        this.A04 = r2.BTW();
        this.A08 = r2.Brt();
        this.A05 = r2.Bs5();
        this.A01 = r2.Bs6();
    }
}
