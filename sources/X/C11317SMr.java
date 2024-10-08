package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.react.modules.base.IgNetworkingModule;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.SMr  reason: case insensitive filesystem */
public abstract class C11317SMr {
    public static final Map A00;
    public static final Xs6[] A01;

    static {
        Xs6[] xs6Arr = new Xs6[61];
        Xs6 xs6 = new Xs6("", Xs6.A05);
        TAH tah = Xs6.A06;
        Xs6 xs62 = new Xs6("GET", tah);
        Xs6 xs63 = new Xs6("POST", tah);
        TAH tah2 = Xs6.A07;
        Xs6 xs64 = new Xs6("/", tah2);
        Xs6 xs65 = new Xs6("/index.html", tah2);
        TAH tah3 = Xs6.A08;
        Xs6 xs66 = new Xs6("http", tah3);
        Xs6 xs67 = new Xs6("https", tah3);
        TAH tah4 = Xs6.A04;
        Xs6 xs68 = new Xs6("200", tah4);
        Xs6 xs69 = new Xs6("204", tah4);
        Xs6 xs610 = new Xs6("206", tah4);
        Xs6 xs611 = new Xs6("304", tah4);
        Xs6 xs612 = new Xs6("400", tah4);
        Xs6 xs613 = new Xs6("404", tah4);
        Xs6 xs614 = new Xs6("500", tah4);
        Xs6 xs615 = xs68;
        Xs6 xs616 = xs69;
        Xs6 xs617 = xs610;
        Xs6 xs618 = xs65;
        Xs6 xs619 = xs66;
        Xs6 xs620 = xs67;
        Xs6 xs621 = xs62;
        Xs6 xs622 = xs63;
        Xs6 xs623 = xs64;
        Xs6 xs624 = xs6;
        int i = 0;
        System.arraycopy(new Xs6[]{xs624, xs621, xs622, xs623, xs618, xs619, xs620, xs615, xs616, xs617, xs611, xs612, xs613, xs614, A00("accept-charset", ""), A00("accept-encoding", "gzip, deflate"), A00("accept-language", ""), A00("accept-ranges", ""), A00("accept", ""), A00("access-control-allow-origin", ""), A00("age", ""), A00("allow", ""), A00("authorization", ""), A00("cache-control", ""), A00("content-disposition", ""), A00("content-encoding", ""), A00("content-language", "")}, 0, xs6Arr, 0, 27);
        System.arraycopy(new Xs6[]{A00(IgNetworkingModule.CONTENT_LENGTH_HEADER_NAME, ""), A00("content-location", ""), A00("content-range", ""), A00(IgNetworkingModule.CONTENT_TYPE_HEADER_NAME, ""), A00("cookie", ""), A00(DatePickerDialogModule.ARG_DATE, ""), A00("etag", ""), A00("expect", ""), A00("expires", ""), A00("from", ""), A00("host", ""), A00("if-match", ""), A00("if-modified-since", ""), A00("if-none-match", ""), A00("if-range", ""), A00("if-unmodified-since", ""), A00("last-modified", ""), A00("link", ""), A00("location", ""), A00("max-forwards", ""), A00("proxy-authenticate", ""), A00("proxy-authorization", ""), A00("range", ""), A00("referer", ""), A00("refresh", ""), A00("retry-after", ""), A00("server", "")}, 0, xs6Arr, 27, 27);
        System.arraycopy(new Xs6[]{A00("set-cookie", ""), A00("strict-transport-security", ""), A00("transfer-encoding", ""), A00("user-agent", ""), A00("vary", ""), A00("via", ""), A00("www-authenticate", "")}, 0, xs6Arr, 54, 7);
        A01 = xs6Arr;
        LinkedHashMap A0x = DbS.A0x(61);
        do {
            if (!A0x.containsKey(xs6Arr[i].A01)) {
                C66580MXl.A1T(xs6Arr[i].A01, A0x, i);
            }
            i++;
        } while (i < 61);
        A00 = Collections.unmodifiableMap(A0x);
    }

    public static Xs6 A00(String str, String str2) {
        return new Xs6(str, str2);
    }

    public static void A01(TAH tah) {
        int A05 = tah.A05();
        int i = 0;
        while (i < A05) {
            byte A04 = tah.A04(i);
            if (A04 < 65 || A04 > 90) {
                i++;
            } else {
                throw Pxg.A0Z("PROTOCOL_ERROR response malformed: mixed case name: ", tah.A08());
            }
        }
    }
}
