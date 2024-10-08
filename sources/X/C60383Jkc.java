package X;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.mediakit.ui.model.MediaKitInfoSheetItemModel;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Jkc  reason: case insensitive filesystem */
public final class C60383Jkc extends 2Rw {
    public final List A00;

    public C60383Jkc(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C60620JoT(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.media_kit_info_sheet_item, false));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r10, int i) {
        C60620JoT joT = (C60620JoT) r10;
        int i2 = 0;
        0qQ.A0B(joT, 0);
        MediaKitInfoSheetItemModel mediaKitInfoSheetItemModel = (MediaKitInfoSheetItemModel) this.A00.get(i);
        0qQ.A0B(mediaKitInfoSheetItemModel, 0);
        IgSimpleImageView igSimpleImageView = joT.A02;
        Integer num = mediaKitInfoSheetItemModel.A02;
        int i3 = 8;
        if (num != null) {
            i3 = 0;
        }
        igSimpleImageView.setVisibility(i3);
        TextView textView = joT.A01;
        Integer num2 = mediaKitInfoSheetItemModel.A03;
        int i4 = 8;
        if (num2 != null) {
            i4 = 0;
        }
        textView.setVisibility(i4);
        TextView textView2 = joT.A00;
        Integer num3 = mediaKitInfoSheetItemModel.A01;
        if (num3 == null) {
            i2 = 8;
        }
        textView2.setVisibility(i2);
        if (num != null) {
            DbU.A13(DbS.A07(joT), igSimpleImageView, num.intValue());
        }
        if (num2 != null) {
            textView.setText(num2.intValue());
        }
        if (num3 != null) {
            int intValue = num3.intValue();
            Context A07 = DbS.A07(joT);
            Object[] objArr = mediaKitInfoSheetItemModel.A00;
            String string = A07.getString(intValue, Arrays.copyOf(objArr, objArr.length));
            0qQ.A07(string);
            textView2.setText(string);
        }
        textView2.setMovementMethod(new LinkMovementMethod());
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-395508054);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-1899413950, A03);
        return size;
    }
}
