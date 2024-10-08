package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.webrtc.CameraCapturer;

/* renamed from: X.GwF  reason: case insensitive filesystem */
public final class C53909GwF extends C251343mx {
    public static final AnonymousClass4Ew A09 = new AnonymousClass4Ex(CameraCapturer.OPEN_CAMERA_DELAY_MS);
    public final int A00;
    public final int A01;
    public final C267324bN A02;
    public final C52058GDe A03;
    public final 1Xj A04;
    public final JTB A05;
    public final JP4 A06;
    public final List A07;
    public final UserSession A08;

    public final C251263mp A0X(AnonymousClass3Y5 r25) {
        Object A032;
        AnonymousClass3Y5 r8 = r25;
        0qQ.A0B(r8, 0);
        2Wa A002 = C243643Zq.A00(r8, C58629Iv0.A00);
        C243673Zt A003 = C243633Zp.A00(r8, C58630Iv1.A00);
        Number number = (Number) A002.A03;
        String A0O = 002.A0O("subtitle_transition_key", number.intValue());
        List list = this.A07;
        int size = list.size();
        ArrayList A0v = DbS.A0v(size);
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            A0v.add(002.A0O("subtitle_transition_key", i2));
        }
        String[] strArr = (String[]) A0v.toArray(new String[0]);
        C243533Zd r4 = C243533Zd.GLOBAL;
        AnonymousClass4Ey A012 = 2Vi.A01(r4, (String[]) Arrays.copyOf(strArr, strArr.length));
        A012.A03(C246033ds.A05);
        2V1 r3 = r8.A05;
        Context context = r3.A0C;
        A012.A04(AnonymousClass4F6.A00(context, 5));
        A012.A05(AnonymousClass4F6.A00(context, -5));
        AnonymousClass4Ew r1 = A09;
        A012.A02 = r1;
        A012.A02(C51970G9q.A03(A012, C246033ds.A00));
        A012.A02 = r1;
        AnonymousClass4F7.A00(r8, A012);
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            A032 = list.get(0);
        } else {
            Context A004 = C243803a8.A00(r8);
            int A062 = (int) (((double) (0nA.A06(A004) - (AnonymousClass7TG.A03(A004) * 2))) * 0.5d);
            boolean A063 = 182.A06(0Tu.A05, this.A08, 36328860614475405L);
            AnonymousClass3XV r0 = 2WX.A02;
            long A0G = C51969G9p.A0G(A062);
            Integer num = AnonymousClass05K.A00;
            2WX A005 = AnonymousClass9JR.A00((2WX) null, num, 0, A0G);
            GL4 gl4 = new GL4(A063, 48);
            Integer num2 = AnonymousClass05K.A02;
            if (!A063) {
                gl4 = null;
            }
            2WX A0Y = C51971G9r.A0Y(C51971G9r.A0Y(A005, num2, gl4, 4), num, C243573Zh.STRETCH, 3);
            Integer num3 = AnonymousClass05K.A01;
            2WX A0Z = C51971G9r.A0Z(C51971G9r.A0Z(C51972G9s.A0V(C51971G9r.A0X(A0Y, num3, 1.0f, 1), J6F.A00(this, 30)), num, new C58765IxC(4000, A002, A003, this, 3), (String) null), num3, J6F.A00(A003, 32), (String) null);
            2Wb A0S = AnonymousClass7TG.A0S(r3);
            for (Object next : list) {
                int i3 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                C251263mp r11 = (C251263mp) next;
                if (i == number.intValue()) {
                    String A0O2 = 002.A0O("subtitle_component_key_", i);
                    2V1 r02 = A0S.A00;
                    2Tl A033 = C243563Zg.A03(G9t.A0v(r11, r02), A0S, C51971G9r.A0V(r02, (2WX) null, r4, A0O));
                    AnonymousClass56V.A01(A033, A0O2);
                    A0S.A00(A033);
                }
                i = i3;
            }
            A032 = C243563Zg.A03(A0S, r8, A0Z);
        }
        return (C251263mp) A032;
    }

    static {
        C243533Zd r0 = 2Vi.A04;
    }

    public C53909GwF(C267324bN r2, C52058GDe gDe, UserSession userSession, 1Xj r5, JTB jtb, JP4 jp4, List list, int i, int i2) {
        AnonymousClass7TF.A1G(jtb, 8, userSession);
        this.A07 = list;
        this.A06 = jp4;
        this.A04 = r5;
        this.A02 = r2;
        this.A03 = gDe;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = jtb;
        this.A08 = userSession;
    }
}
