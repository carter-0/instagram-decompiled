package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Jkv  reason: case insensitive filesystem */
public final class C60402Jkv extends 2Rw {
    public C355608Qq A00;
    public final AnonymousClass9I9 A01 = new AnonymousClass9I9((DefaultConstructorMarker) null, 0, 0, 15, 3, false, false);
    public final List A02;
    public final 0sL A03;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C60626JoZ(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.media_picker_gallery_folder_item, false));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r14, int i) {
        Medium medium;
        C60626JoZ joZ = (C60626JoZ) r14;
        0qQ.A0B(joZ, 0);
        LR6 lr6 = (LR6) this.A02.get(i);
        String str = lr6.A01;
        joZ.A01.setText(str);
        TextView textView = joZ.A00;
        List list = lr6.A02;
        textView.setText(String.valueOf(list.size()));
        if (list.isEmpty() || (medium = ((GalleryItem) list.get(0)).A00) == null) {
            joZ.A02.setVisibility(4);
        } else {
            MediaPickerItemView mediaPickerItemView = joZ.A02;
            mediaPickerItemView.setVisibility(0);
            mediaPickerItemView.A03(this.A01, this.A00, JTR.A0f(medium), false, false, false, false);
        }
        AnonymousClass0fU.A00(new LXV(lr6, this, str, 5), joZ.itemView);
    }

    public C60402Jkv(Context context, UserSession userSession, List list, 0sL r14) {
        this.A02 = list;
        this.A03 = r14;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A00 = new C355608Qq(context, userSession, AnonymousClass05K.A00, dimensionPixelSize, dimensionPixelSize, false);
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(2092151773);
        int size = this.A02.size();
        AnonymousClass0fD.A0A(656736987, A032);
        return size;
    }
}
