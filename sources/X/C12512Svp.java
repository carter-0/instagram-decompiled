package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.Svp  reason: case insensitive filesystem */
public final class C12512Svp implements C13884Tj7 {
    public final 0jh A00;
    public final UserSession A01;
    public final 1vn A02;

    public C12512Svp(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = 1vm.A01(userSession);
        this.A00 = 0jh.A04.A01(userSession);
    }

    private final C2818659w A00(2Mg r11, String str, String str2, String str3) {
        C2818659w r5 = new C2818659w();
        String A002 = r11.A00();
        String A0i = 002.A0i("proof.", A002, str2, '.');
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        A1H.put("cred_id", str);
        A1H.put("secret_and_key", A0i);
        A1H.put("device_key", A002);
        C7422QCn A012 = SQA.A01(C10448RsP.A00("secret_and_key", A1H));
        0qQ.A07(A012);
        SUj.A0H(A012, new C11640Sdi(r5, r11, this, str, str3));
        return r5;
    }

    public final 2Mg A01(String str) {
        2Mg r4 = new 2Mg(this.A01.A06);
        if (!0qQ.A0K(str, r4.A00())) {
            if (DbY.A1Z(0Tu.A05, C11431STx.A00(), 36310430913790052L)) {
                2Mg r1 = new 2Mg("autofill_key");
                if (0qQ.A0K(str, r1.A00())) {
                    return r1;
                }
            }
        }
        return r4;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.SEG, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v1, types: [X.59w, java.lang.Object, X.QnU] */
    public final C8288QnU ADV(String str, String str2, String str3) {
        C11010S5h[] s5hArr;
        boolean A1X = DbW.A1X(str2);
        C2818659w A002 = A00(new 2Mg(this.A01.A06), str, str2, str3);
        ? obj = new Object();
        if (DbY.A1Z(0Tu.A06, C11431STx.A00(), 36310430913790052L)) {
            s5hArr = new C11010S5h[]{new C11010S5h(A002, new J6H(obj, 4)), new C11010S5h(A00(new 2Mg("autofill_key"), str, str2, str3), new J6H(obj, 5))};
        } else {
            S21 A003 = C11097S9y.A00("");
            synchronized (obj) {
                0qQ.A0B(A003, A1X ? 1 : 0);
                obj.A01 = A003;
                SEG.A00(obj);
            }
            s5hArr = new C11010S5h[]{new C11010S5h(A002, new J6H(obj, 6))};
        }
        ? r6 = new C2818659w();
        int length = s5hArr.length;
        int i = 0;
        do {
            C11010S5h s5h = s5hArr[i];
            s5h.A00.A9U(new C12510Svg(A1X, s5h, r6));
            i++;
        } while (i < length);
        return r6;
    }
}
