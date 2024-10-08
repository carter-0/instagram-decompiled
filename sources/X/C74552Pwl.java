package X;

import com.instagram.direct.model.messaginguser.MessagingUser;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Pwl  reason: case insensitive filesystem */
public interface C74552Pwl {
    String Acp(int i);

    OG9 Acq(int i);

    String Acr(int i);

    Long Acs(int i);

    String Act(int i);

    Integer Acu(int i);

    int Azt(int i);

    String BCe(int i);

    int BIa(int i);

    Long BNc(int i);

    int BS2(int i);

    int BS3(int i);

    Integer BS8(int i);

    Long BS9(int i);

    String BSF(int i);

    int BSR(int i);

    List BWn(int i);

    String BXo(int i);

    Long Bd2(int i);

    Long BdW(int i);

    String BdZ(int i);

    String BeV(int i);

    Integer Bf0(int i);

    Integer BfB(int i);

    C70464O7p Bjo(int i);

    C74554Pwu Bjx(int i);

    Long Bm9(int i);

    Integer BmA(int i);

    Integer BmB(int i);

    Integer BmC(int i);

    String BmE(int i);

    String BmK(int i);

    Integer BmN(int i);

    Integer BmO(int i);

    Long BmP(int i);

    String BmQ(int i);

    Long BmS(int i);

    String BmT(int i);

    Long BmV(int i);

    String BmW(int i);

    Integer Bma(int i);

    String Bmb(int i);

    Integer Bmc(int i);

    C74555Pww Bmd(int i);

    String Bme(int i);

    String Bmf(int i);

    String Bmg(int i);

    Integer Bmh(int i);

    String Bmi(int i);

    boolean Bmj(int i);

    Integer Bmk(int i);

    Integer Bml(int i);

    Integer Bmm(int i);

    String Bmn(int i);

    String Bmo(int i);

    String Bmp(int i);

    String Bmq(int i);

    int BsF(int i);

    long BsH(int i);

    String BsK(int i);

    String BsM(int i);

    String BsO(int i);

    String C4n(int i);

    long C6J(int i);

    long C7b(int i);

    boolean CFj(int i);

    Integer CFk(int i);

    Integer CFl(int i);

    Integer CH2(int i);

    String CH3(int i);

    Integer CH5(int i);

    String CH6(int i);

    String CH7(int i);

    C74555Pww CH8(int i);

    String CH9(int i);

    String CHA(int i);

    String CHB(int i);

    Integer CHC(int i);

    String CHD(int i);

    boolean CHE(int i);

    Integer CHF(int i);

    Integer CHG(int i);

    Integer CHH(int i);

    String CHI(int i);

    String CHJ(int i);

    String CHK(int i);

    String CHL(int i);

    String CHM(int i);

    boolean CTx(int i);

    boolean CYc(int i);

    boolean Cbf(int i);

    boolean Cf0(int i);

    boolean Cf1(int i);

    int getCount();

    static long A00(C74552Pwl pwl, int i) {
        return TimeUnit.MILLISECONDS.toMicros(pwl.C7b(i));
    }

    static String A01(C74541Pwa pwa, C74552Pwl pwl, int i) {
        String C4n = pwl.C4n(i);
        if (C4n == null) {
            return "";
        }
        if (pwa == null) {
            return C4n;
        }
        String ANc = pwa.ANc(C4n);
        0qQ.A0A(ANc);
        return ANc;
    }

    static boolean A02(MessagingUser messagingUser, C74552Pwl pwl, int i) {
        return messagingUser.A01(pwl.BsH(i));
    }
}
