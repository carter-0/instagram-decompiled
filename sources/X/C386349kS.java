package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;
import com.instagram.user.model.Product;
import java.util.ArrayList;

/* renamed from: X.9kS  reason: invalid class name and case insensitive filesystem */
public final class C386349kS extends AnonymousClass3NK {
    public final /* synthetic */ AYL A00;
    public final /* synthetic */ Product A01;
    public final /* synthetic */ ArrayList A02;

    public C386349kS(AYL ayl, Product product, ArrayList arrayList) {
        this.A00 = ayl;
        this.A02 = arrayList;
        this.A01 = product;
    }

    public final boolean Dqe(View view) {
        AYL ayl = this.A00;
        ArrayList arrayList = this.A02;
        Product product = this.A01;
        ImageView imageView = ayl.A04;
        if (imageView == null) {
            return true;
        }
        AD0 ad0 = ayl.A0W;
        ArrayList arrayList2 = AD0.A02;
        int size = (ad0.A01 + 1) % arrayList2.size();
        ad0.A01 = size;
        Object obj = arrayList2.get(size);
        0qQ.A07(obj);
        imageView.setImageResource(AnonymousClass7TE.A0M(obj));
        int size2 = (ad0.A00 + 1) % arrayList2.size();
        ad0.A00 = size2;
        C369528uu r0 = (C369528uu) arrayList.get(size2);
        ayl.A0B = r0;
        String A03 = r0.A03();
        if (A03.equals("product_item_list_cell_sticker_black_white") || A03.equals("product_item_tile_sticker_black_white")) {
            ayl.A0S.A02(false);
            EyedropperColorPickerTool eyedropperColorPickerTool = ayl.A0b;
            TextView textView = ayl.A06;
            textView.getClass();
            C315596kB.A08(new View[]{eyedropperColorPickerTool, textView}, false);
            ((C360778f8) ayl.A0Z.get()).A0A(false);
        } else {
            ayl.A0S.A03(false, false);
            EyedropperColorPickerTool eyedropperColorPickerTool2 = ayl.A0b;
            TextView textView2 = ayl.A06;
            textView2.getClass();
            View[] viewArr = {eyedropperColorPickerTool2, textView2};
            C71392co r02 = C315596kB.A02;
            C294975nL.A04((C295005nO) null, viewArr, false);
            if (AYL.A03(ayl)) {
                TextView textView3 = ayl.A06;
                textView3.getClass();
                C294975nL.A04((C295005nO) null, new View[]{textView3}, false);
            }
            ((C360778f8) ayl.A0Z.get()).A08();
        }
        ayl.A0B.A05(product, ayl.A0H, ayl.A00, AYL.A04(ayl));
        AYL.A01(ayl.A0B, ayl);
        ayl.A05.setImageDrawable(ayl.A0B);
        ayl.A0G = ayl.A0B.A03();
        return true;
    }
}
