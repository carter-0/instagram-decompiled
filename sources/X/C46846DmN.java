package X;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.DmN  reason: case insensitive filesystem */
public final class C46846DmN extends 2Rw {
    public static final List A01 = AnonymousClass7TE.A1C();
    public final boolean A00;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C46988Dog(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.layout_message_setting, false));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r7, int i) {
        C46988Dog dog = (C46988Dog) r7;
        0qQ.A0B(dog, 0);
        C48239EbK ebK = (C48239EbK) A01.get(i);
        if (this.A00) {
            ConstraintLayout constraintLayout = dog.A02;
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            0qQ.A0C(layoutParams, C273654mx.A00(9));
            layoutParams.height = -2;
            constraintLayout.setLayoutParams(layoutParams);
            Resources resources = constraintLayout.getResources();
            constraintLayout.setPadding(0, resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), 0, resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap));
            TextView textView = dog.A01;
            0qQ.A0B(textView, 0);
            textView.setTextAppearance(R.style.control_option_title_text);
            IgImageView igImageView = dog.A03;
            ViewGroup.LayoutParams layoutParams2 = igImageView.getLayoutParams();
            0qQ.A0C(layoutParams2, C273654mx.A00(3));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams.topMargin = igImageView.getResources().getDimensionPixelSize(R.dimen.album_music_sticker_text_vertical_padding);
            igImageView.setLayoutParams(marginLayoutParams);
        }
        dog.A01.setText(ebK.A02);
        String str = ebK.A01;
        if (str != null) {
            TextView textView2 = dog.A00;
            textView2.setText(str);
            textView2.setVisibility(0);
        }
        FP8.A01(dog.A02, 40, ebK);
    }

    public C46846DmN(boolean z) {
        this.A00 = z;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-189856073);
        int size = A01.size();
        AnonymousClass0fD.A0A(2077081334, A03);
        return size;
    }
}
