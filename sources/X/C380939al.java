package X;

/* renamed from: X.9al  reason: invalid class name and case insensitive filesystem */
public final class C380939al extends C371618yh {
    public static final C371628yi A03 = new C371628yi(C312446eR.HairSegmentationDataProvider, "com.facebook.cameracore.mediapipeline.dataproviders.hairsegmentation.implementation.HairSegmentationDataProviderModule");
    public static final C371628yi A04 = new C371628yi(C312446eR.PersonSegmentationDataProvider, "com.facebook.cameracore.mediapipeline.dataproviders.segmentation.implementation.SegmentationDataProviderModule");
    public final String A00;
    public final String A01;
    public final boolean A02;

    public C380939al(String str, String str2, boolean z) {
        if (str.length() == 0) {
            throw AnonymousClass7TE.A0w(002.A0i("Invalid segmentation config, ", "initNetPath", str, '='));
        } else if (str2.length() == 0) {
            throw AnonymousClass7TE.A0w(002.A0i("Invalid segmentation config, ", "predictNetPath", str2, '='));
        } else {
            this.A00 = str;
            this.A01 = str2;
            this.A02 = z;
        }
    }
}
