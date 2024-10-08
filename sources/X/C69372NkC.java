package X;

import com.instagram.android.R;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.NkC  reason: case insensitive filesystem */
public enum C69372NkC {
    A06(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, new int[]{R.attr.igds_color_secondary_text_on_media, R.attr.igds_color_secondary_text_on_media}, 0, 155),
    A07("pride", new int[]{R.attr.igds_color_gradient_purple, R.attr.igds_color_gradient_blue, R.attr.igds_color_gradient_green, R.attr.igds_color_gradient_yellow, R.attr.igds_color_gradient_orange, R.attr.igds_color_gradient_red}, 1, 225);
    
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final int[] A03;

    /* access modifiers changed from: public */
    static {
        C69372NkC[] nkCArr;
        A04 = 0oU.A00(nkCArr);
    }

    /* access modifiers changed from: public */
    C69372NkC(String str, int[] iArr, int i, int i2) {
        this.A02 = str;
        this.A03 = iArr;
        this.A01 = r1;
        this.A00 = i2;
    }
}
