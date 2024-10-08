package X;

/* renamed from: X.Kvx  reason: case insensitive filesystem */
public abstract class C63376Kvx {
    public static final void A00(0wc r2, Integer num, Integer num2, String str, String str2, String str3) {
        String str4;
        String str5;
        0qQ.A0B(str, 1);
        0Aj A0e = AnonymousClass7TE.A0e(r2, "ig_original_pdq");
        if (A0e.isSampled()) {
            A0e.A9F("media_id", DbV.A0q(str));
            A0e.A9F("owner_id", DbV.A0q(str2));
            switch (num.intValue()) {
                case 0:
                    str4 = "original_hash_entrypoint";
                    break;
                case 1:
                    str4 = "original_hash_start";
                    break;
                case 2:
                    str4 = "original_hash_cancelled";
                    break;
                case 3:
                    str4 = "original_hash_pdq_cancelled";
                    break;
                case 4:
                    str4 = "original_hash_md5_cancelled";
                    break;
                case 5:
                    str4 = "original_hash_skipped";
                    break;
                case 6:
                    str4 = "original_hash_pdq_scheduled";
                    break;
                case 7:
                    str4 = "original_hash_md5_scheduled";
                    break;
                case 8:
                    str4 = "original_hash_pdq_generated";
                    break;
                case 9:
                    str4 = "original_hash_md5_generated";
                    break;
                case 10:
                    str4 = "original_hash_md5_partial_generated";
                    break;
                default:
                    str4 = "original_hash_sent";
                    break;
            }
            DbS.A1H(A0e, str4);
            if (num2.intValue() != 0) {
                str5 = "ig_android_video";
            } else {
                str5 = "ig_android_image";
            }
            A0e.AAJ("upload_location", str5);
            A0e.AAJ("error_message", str3);
            A0e.Cgf();
        }
    }
}
