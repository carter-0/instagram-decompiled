package com.instagram.mediakit.config;

import X.018;
import X.0qQ;
import X.AnonymousClass7TE;
import X.C41847B3o;
import X.C62320sa;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.mediakit.ui.model.MediaKitInfoSheetItemModel;
import java.util.ArrayList;

public final class MediaKitInfoSheetConfig implements Parcelable {
    public static final MediaKitInfoSheetConfig A0D;
    public static final MediaKitInfoSheetConfig A0E;
    public static final Parcelable.Creator CREATOR = new C71269Ogb(15);
    public View.OnClickListener A00;
    public Float A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public C62320sa A09;
    public boolean A0A;
    public final Integer A0B;
    public final ArrayList A0C;

    static {
        MediaKitInfoSheetConfig mediaKitInfoSheetConfig = new MediaKitInfoSheetConfig(2131966603);
        mediaKitInfoSheetConfig.A06 = 2131966600;
        Integer valueOf = Integer.valueOf(R.drawable.ig_illustrations_illo_add_photos_videos_refresh);
        mediaKitInfoSheetConfig.A04 = valueOf;
        mediaKitInfoSheetConfig.A0A = true;
        mediaKitInfoSheetConfig.A07 = 2131968772;
        018.A18(mediaKitInfoSheetConfig.A0C, new MediaKitInfoSheetItemModel[]{new MediaKitInfoSheetItemModel(2131966599, 2131966598, Integer.valueOf(R.drawable.instagram_media_account_pano_outline_24)), new MediaKitInfoSheetItemModel(2131966602, 2131966601, Integer.valueOf(R.drawable.instagram_media_pano_outline_24)), new MediaKitInfoSheetItemModel(2131966595, 2131966594, Integer.valueOf(R.drawable.instagram_search_pano_outline_24)), new MediaKitInfoSheetItemModel(2131966597, 2131966596, Integer.valueOf(R.drawable.instagram_comment_pano_outline_24))});
        A0E = mediaKitInfoSheetConfig;
        MediaKitInfoSheetConfig mediaKitInfoSheetConfig2 = new MediaKitInfoSheetConfig((Integer) null);
        mediaKitInfoSheetConfig2.A07 = 2131966656;
        mediaKitInfoSheetConfig2.A08 = 2131968513;
        mediaKitInfoSheetConfig2.A04 = valueOf;
        mediaKitInfoSheetConfig2.A05 = 2131966577;
        mediaKitInfoSheetConfig2.A06 = 2131966578;
        mediaKitInfoSheetConfig2.A03 = 2131966576;
        A0D = mediaKitInfoSheetConfig2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(C41847B3o.A00(parcel, this.A0B));
    }

    public MediaKitInfoSheetConfig(Integer num) {
        this.A0B = num;
        this.A0C = AnonymousClass7TE.A1C();
    }

    public MediaKitInfoSheetConfig() {
        this((Integer) null);
    }
}
