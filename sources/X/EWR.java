package X;

import com.instagram.android.R;

public enum EWR {
    DEFAULT(R.attr.igds_color_primary_icon, R.attr.igds_color_primary_text, R.attr.igds_color_secondary_text),
    ON_MEDIA(R.attr.igds_color_icon_on_media, R.attr.igds_color_primary_text_on_media, R.attr.igds_color_primary_text_on_media);
    
    public final int A00;
    public final int A01;
    public final int A02;

    /* access modifiers changed from: public */
    static {
        EWR[] ewrArr;
        A03 = 0oU.A00(ewrArr);
    }

    /* access modifiers changed from: public */
    EWR(int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }
}
