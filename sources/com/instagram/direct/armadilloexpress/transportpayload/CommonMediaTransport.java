package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C68405NFm;
import X.C74232PrL;
import X.R4O;
import X.R5b;
import X.SQg;
import X.T5L;

public final class CommonMediaTransport extends R5b implements C13662TeT {
    public static final CommonMediaTransport DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 5;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 4;
    public static final int FILE_LENGTH_FIELD_NUMBER = 8;
    public static final int FILE_SHA256_FIELD_NUMBER = 2;
    public static final int MEDIA_ID_FIELD_NUMBER = 1;
    public static final int MEDIA_KEY_FIELD_NUMBER = 3;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 6;
    public static final int MIMETYPE_FIELD_NUMBER = 9;
    public static final int OBJECT_ID_FIELD_NUMBER = 10;
    public static volatile C74232PrL PARSER = null;
    public static final int SIDECAR_FIELD_NUMBER = 7;
    public int bitField0_;
    public String directPath_ = "";
    public String fileEncSha256_ = "";
    public int fileLength_;
    public String fileSha256_ = "";
    public String mediaId_ = "";
    public String mediaKeyTimestamp_ = "";
    public String mediaKey_ = "";
    public String mimetype_ = "";
    public String objectId_ = "";
    public String sidecar_ = "";

    static {
        CommonMediaTransport commonMediaTransport = new CommonMediaTransport();
        DEFAULT_INSTANCE = commonMediaTransport;
        R5b.A0B(commonMediaTransport, CommonMediaTransport.class);
    }

    public static C68405NFm A00(CommonMediaTransport commonMediaTransport) {
        R4O A0I = DEFAULT_INSTANCE.A0I();
        A0I.A05(commonMediaTransport);
        return (C68405NFm) A0I;
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bင\u0007\tဈ\b\nဈ\t", new Object[]{"bitField0_", "mediaId_", "fileSha256_", "mediaKey_", "fileEncSha256_", "directPath_", "mediaKeyTimestamp_", "sidecar_", "fileLength_", "mimetype_", "objectId_"});
            case 3:
                return new CommonMediaTransport();
            case 4:
                return new C68405NFm();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (CommonMediaTransport.class) {
                    prL = PARSER;
                    if (prL == null) {
                        SQg sQg = T5L.A01;
                        prL = C66580MXl.A0K(DEFAULT_INSTANCE);
                        PARSER = prL;
                    }
                }
                return prL;
            default:
                throw C66580MXl.A11();
        }
    }
}
