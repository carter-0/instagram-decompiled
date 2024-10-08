package X;

import com.google.android.gms.common.Feature;

/* renamed from: X.Rn8  reason: case insensitive filesystem */
public abstract class C10131Rn8 {
    public static final Feature A00;
    public static final Feature A01;
    public static final Feature[] A02;
    public static final Feature A03;
    public static final Feature A04;

    static {
        Feature A0X = Pxe.A0X("name_ulr_private", 1);
        A03 = A0X;
        Feature A0X2 = Pxe.A0X("name_sleep_segment_request", 1);
        A04 = A0X2;
        Feature A0X3 = Pxe.A0X("support_context_feature_id", 1);
        A00 = A0X3;
        Feature A0X4 = Pxe.A0X("get_current_location", 1);
        A01 = A0X4;
        A02 = new Feature[]{A0X, A0X2, A0X3, A0X4};
    }
}
