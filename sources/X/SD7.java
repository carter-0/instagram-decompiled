package X;

import java.util.ArrayList;
import java.util.regex.Pattern;

public abstract class SD7 {
    public static final Pattern A00;
    public static final Pattern A01;
    public static final Pattern A02;
    public static final Pattern A03;
    public static final Pattern A04;
    public static final Pattern A05;

    public static final C8921RFo A00(String str) {
        if (!(str == null || str.length() == 0)) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C8921RFo rFo : C8921RFo.values()) {
                if (rFo != C8921RFo.UNKNOWN) {
                    A1C.add(rFo);
                }
            }
            String A002 = new 11S("[^\\d+]").A00(str, "");
            if (A002.length() != 0) {
                String A0d = Pxf.A0d(A002, "[^\\d+]", "");
                C8921RFo rFo2 = C8921RFo.VISA;
                if (A1C.contains(rFo2)) {
                    Pattern pattern = A05;
                    0qQ.A08(pattern);
                    if (DbV.A1b(A0d, pattern)) {
                        return rFo2;
                    }
                }
                C8921RFo rFo3 = C8921RFo.MASTER_CARD;
                if (A1C.contains(rFo3)) {
                    Pattern pattern2 = A03;
                    0qQ.A08(pattern2);
                    if (DbV.A1b(A0d, pattern2)) {
                        return rFo3;
                    }
                }
                C8921RFo rFo4 = C8921RFo.AMEX;
                if (A1C.contains(rFo4)) {
                    Pattern pattern3 = A00;
                    0qQ.A08(pattern3);
                    if (DbV.A1b(A0d, pattern3)) {
                        return rFo4;
                    }
                }
                C8921RFo rFo5 = C8921RFo.JCB;
                if (A1C.contains(rFo5)) {
                    Pattern pattern4 = A02;
                    0qQ.A08(pattern4);
                    if (DbV.A1b(A0d, pattern4)) {
                        return rFo5;
                    }
                }
                C8921RFo rFo6 = C8921RFo.DISCOVER;
                if (A1C.contains(rFo6)) {
                    Pattern pattern5 = A01;
                    0qQ.A08(pattern5);
                    if (DbV.A1b(A0d, pattern5)) {
                        return rFo6;
                    }
                }
                C8921RFo rFo7 = C8921RFo.RUPAY;
                if (A1C.contains(rFo7)) {
                    Pattern pattern6 = A04;
                    0qQ.A08(pattern6);
                    if (DbV.A1b(A0d, pattern6)) {
                        return rFo7;
                    }
                }
            }
        }
        return C8921RFo.UNKNOWN;
    }

    static {
        String A0g = 002.A0g("3|", C8921RFo.AMEX.A02.pattern(), "[\\d]*");
        String A0g2 = 002.A0g("6|60|601|64|62|622|622[19]|62212|62292|65|652|6521|653|6531|", C8921RFo.DISCOVER.A02.pattern(), "[\\d]*");
        String A0g3 = 002.A0g("3|35|352|", C8921RFo.JCB.A02.pattern(), "[\\d]*");
        String A0g4 = 002.A0g("5|2|2[2-7]|22[2-9]|27[0-2]|", C8921RFo.MASTER_CARD.A02.pattern(), "[\\d]*");
        String A0g5 = 002.A0g("5|50|508|6|65|652|6521|653|6530|6531|60|", C8921RFo.RUPAY.A02.pattern(), "[\\d]*");
        String A0R = 002.A0R(C8921RFo.VISA.A02.pattern(), "[\\d]*");
        A00 = Pattern.compile(A0g);
        A01 = Pattern.compile(A0g2);
        A02 = Pattern.compile(A0g3);
        A03 = Pattern.compile(A0g4);
        A04 = Pattern.compile(A0g5);
        A05 = Pattern.compile(A0R);
    }
}
