package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.QQe  reason: case insensitive filesystem */
public final class C7614QQe extends C8607Qxo {
    public C58840Ae A00;
    public 0fA A01;
    public final GMQ A02;
    public final C10217RoY A03 = new C10217RoY(this);
    public final RRG A04 = new C7615QQf(6);
    public final C13712Tfa A05 = new C12169SoK(this);
    public final 0sP A06 = new TY5(this, 33);

    public C7614QQe() {
        int i;
        ULT ult = new ULT(R.layout.barcelona_install_host_layout, R.style.AppBottomSheetDialogTheme, R.id.fragment_container, 0);
        C15048ULb uLb = new C15048ULb(R.layout.barcelona_install_screen_layout, R.id.mobile_data_check_box, R.id.install_button, R.id.details_text_button, 3);
        QOm qOm = new QOm();
        C15048ULb uLb2 = new C15048ULb(R.layout.barcelona_install_details_screen_layout, R.id.version_value, R.id.apk_size_value, R.id.back_image_button, 2);
        C53290Glc glc = new C53290Glc(R.layout.barcelona_install_dialog_layout, 2132018370, R.id.title, R.id.description, R.id.primary_button, R.id.secondary_button, 0);
        Context context = getContext();
        if (context != null) {
            i = context.getColor(R.color.igds_error_or_destructive);
        } else {
            i = 0;
        }
        this.A02 = new GMQ(0, glc, ult, new C15048ULb(2131954729, 2131954728, 2131954727, 2131954726, 1), uLb2, new UKQ(2131952984, 2131952981, 2131952982, 2131952983, i, 0), uLb, qOm);
    }
}
