package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.react.modules.base.IgNetworkingModule;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.Set;
import org.apache.http.client.ResponseHandler;

public abstract class SCY {
    public static final Set A00 = C66580MXl.A12(0sr.A1P(new String[]{"accept-charset", "accept-encoding", "access-control-request-headers", "access-control-request-method", "connection", IgNetworkingModule.CONTENT_LENGTH_HEADER_NAME, "cookie", "cookie2", DatePickerDialogModule.ARG_DATE, "dnt", "expect", "host", "keep-alive", "origin", "referer", "te", "trailer", "transfer-encoding", "upgrade", "via"}));
    public static final Set A01;

    public static final 1OC A00(2IR r18, String str, String str2, String str3, ResponseHandler responseHandler, String[] strArr, String[] strArr2) {
        Integer num;
        String str4;
        C297685sA r0 = null;
        1Pq r4 = new 1Pq((1HW) null);
        String str5 = str;
        URI create = URI.create(str5);
        if (!"https".equals(create.getScheme())) {
            throw AnonymousClass7TE.A0w("Protocol not supported");
        } else if (!Pxf.A1U(A01, create.getPort())) {
            String str6 = str2;
            String A0k = AnonymousClass7TF.A0k(str6);
            int i = 0;
            if (A0k.equals("GET")) {
                num = AnonymousClass05K.A0N;
            } else if (A0k.equals("POST")) {
                num = AnonymousClass05K.A01;
                String str7 = str3;
                if (!(str3 == null || str7.length() == 0)) {
                    if (!AnonymousClass000.A00(1423).equals(create.getHost()) || !"/graphql_www".equals(create.getPath())) {
                        str4 = "application/octet-stream";
                    } else {
                        str4 = AnonymousClass000.A00(252);
                    }
                    1Fn r2 = new 1Fn("Content-Type", str4);
                    Charset A17 = Pxe.A17();
                    0qQ.A07(A17);
                    r0 = new C297685sA(r2, Pxf.A1V(str7, A17));
                }
            } else {
                throw Pxg.A0c("Method '", str6, "' is not supported");
            }
            r4.A02 = str5;
            r4.A01(num);
            if (r0 != null) {
                r4.A00 = r0;
            }
            int length = strArr.length;
            while (i < length) {
                if (!A00.contains(strArr[i])) {
                    r4.A03(strArr[i], strArr2[i]);
                    i++;
                } else {
                    throw Pxg.A0c("Header '", strArr[i], "' is not supported");
                }
            }
            AnonymousClass1O8 r3 = new AnonymousClass1O8();
            return new 1OC(r3, AnonymousClass3Fk.A00(1GK.A06.A00(new TNH(r4, 4), -10, 2, false, true).A02(new 1QY(r3.A00), -11, 2, true, true).A02(new T7Y(r18, responseHandler), -15, 2, false, true)), AnonymousClass000.A00(2294), "path undefined");
        } else {
            throw AnonymousClass7TE.A0w("Port not supported");
        }
    }

    static {
        Integer[] numArr = new Integer[64];
        System.arraycopy(new Integer[]{1, Pxe.A0m(), 9, 11, 13, 15, 17, 19, 20, 21, 22, 23, 25, 37, 42, 43, 53, 77, 79, 87, 95, 101, 102, 103, 104, 109, 110}, 0, numArr, 0, 27);
        System.arraycopy(new Integer[]{111, 113, 115, 117, 119, 123, 135, 139, 143, 179, 389, 465, 512, 513, 514, 515, 526, 530, 531, 532, 540, 556, 563, 587, 601, 636, 993}, 0, numArr, 27, 27);
        System.arraycopy(new Integer[]{995, 2049, 3659, 4045, 6000, 6665, 6666, 6667, 6668, 6669}, 0, numArr, 54, 10);
        A01 = C66580MXl.A12(0sr.A1P(numArr));
    }
}
