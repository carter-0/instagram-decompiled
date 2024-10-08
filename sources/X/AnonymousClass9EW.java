package X;

/* renamed from: X.9EW  reason: invalid class name */
public final class AnonymousClass9EW implements 0Un {
    public 0fA A00;

    public final void EGK(String str, String str2, int i, String str3) {
        0f9 AEf = this.A00.AEf("content_resolver", 817892585);
        if (AEf.isSampled()) {
            AEf.ABQ("operation", str);
            AEf.ABQ("authority", str2);
            AEf.ABO("callsite_id", i);
            AEf.ERJ(new Exception(str3));
            AEf.report();
        }
    }
}
