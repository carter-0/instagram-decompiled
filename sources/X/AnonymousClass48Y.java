package X;

/* renamed from: X.48Y  reason: invalid class name */
public final class AnonymousClass48Y implements AnonymousClass2hV {
    public static final AnonymousClass48Y A00 = new AnonymousClass48Y();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        String str;
        String str2;
        C254703su r5 = (C254703su) obj;
        if (r5 == null) {
            0wj.A01.AEf("Unexpected null DirectMesage when fetching keyFromElement", 20134884).report();
        }
        if (r5 == null || r5.A0g() == null) {
            0f9 AEf = 0wj.A01.AEf("Unexpected null message id when fetching keyFromElement", 20134884);
            if (r5 != null) {
                str = r5.A0g();
            } else {
                str = null;
            }
            AEf.ABQ("message_id", str);
            if (r5 != null) {
                str2 = r5.A0f();
            } else {
                str2 = null;
            }
            AEf.ABQ("message_clientContext", str2);
            AEf.report();
            if (r5 == null) {
                return null;
            }
        }
        return r5.A0g();
    }
}
