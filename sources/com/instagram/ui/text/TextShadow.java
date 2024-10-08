package com.instagram.ui.text;

import X.002;
import X.0qQ;
import X.0wb;
import X.SN3;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.android.R;

public final class TextShadow implements Parcelable {
    public static final TextShadow A03;
    public static final TextShadow A04;
    public int A00;
    public int A01;
    public int A02;

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.ui.text.TextShadow, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.ui.text.TextShadow, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.A00 = 0;
        obj.A01 = R.dimen.group_mention_sticker_title_text_size_step;
        obj.A02 = R.dimen.group_mention_sticker_title_text_size_step;
        A03 = obj;
        ? obj2 = new Object();
        obj2.A00 = SN3.MAX_SIGNED_POWER_OF_TWO;
        obj2.A01 = R.dimen.group_mention_sticker_title_text_size_step;
        obj2.A02 = R.dimen.group_mention_sticker_title_text_size_step;
        A04 = obj2;
    }

    public final float A00(Context context) {
        0qQ.A0B(context, 0);
        try {
            return (float) context.getResources().getDimensionPixelSize(this.A01);
        } catch (Resources.NotFoundException e) {
            0wb.A03("TextShadow", 002.A0R("not able to find resources ", e.getMessage()));
            return 0.0f;
        }
    }

    public final float A01(Context context) {
        0qQ.A0B(context, 0);
        try {
            return (float) Math.min((double) ((float) context.getResources().getDimensionPixelSize(this.A02)), 25.0d);
        } catch (Resources.NotFoundException e) {
            0wb.A03("TextShadow", 002.A0R("not able to find resources ", e.getMessage()));
            return 0.0f;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
    }
}
