package X;

import android.os.Build;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.mediakit.config.MediaKitGalleryFoldersSheetConfig;
import com.instagram.mediakit.ui.model.MediaKitFolderSheetItemModel;

/* renamed from: X.Jkj  reason: case insensitive filesystem */
public final class C60390Jkj extends 2Rw {
    public final C355608Qq A00;
    public final MediaKitGalleryFoldersSheetConfig A01;

    public C60390Jkj(C355608Qq r2, MediaKitGalleryFoldersSheetConfig mediaKitGalleryFoldersSheetConfig) {
        0qQ.A0B(mediaKitGalleryFoldersSheetConfig, 1);
        this.A01 = mediaKitGalleryFoldersSheetConfig;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C60698Jpj(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.media_kit_folders_sheet_item, false));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r7, int i) {
        C60698Jpj jpj = (C60698Jpj) r7;
        0qQ.A0B(jpj, 0);
        MediaKitFolderSheetItemModel mediaKitFolderSheetItemModel = (MediaKitFolderSheetItemModel) this.A01.A00.get(i);
        0qQ.A0B(mediaKitFolderSheetItemModel, 0);
        LY6.A01(jpj.A01, 44, mediaKitFolderSheetItemModel);
        jpj.A02.setText(mediaKitFolderSheetItemModel.A02);
        Medium medium = mediaKitFolderSheetItemModel.A01;
        jpj.A00 = medium;
        if (!medium.CeS() || !medium.isValid() || !medium.A06() || AnonymousClass7TE.A0t(medium.A0X).length() <= 0 || Build.VERSION.SDK_INT < 30) {
            this.A00.A04(medium, jpj);
        } else {
            C355608Qq.A00((C348297yD) null, this.A00, medium, jpj, true);
        }
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1144524501);
        int size = this.A01.A00.size();
        AnonymousClass0fD.A0A(1514566536, A03);
        return size;
    }
}
