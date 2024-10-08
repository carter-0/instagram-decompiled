package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.webrtc.CameraCapturer;

/* renamed from: X.56Q  reason: invalid class name */
public final class AnonymousClass56Q extends C251343mx {
    public static final AnonymousClass4Ew A04 = new AnonymousClass4Ex(CameraCapturer.OPEN_CAMERA_DELAY_MS);
    public final long A00;
    public final AnonymousClass9IE A01;
    public final UserSession A02;
    public final C243503Za A03;

    public final C251263mp A0X(AnonymousClass3Y5 r36) {
        AnonymousClass3Y5 r12 = r36;
        0qQ.A0B(r12, 0);
        2Wa A002 = C243643Zq.A00(r12, AnonymousClass56R.A00);
        C243673Zt A003 = C243633Zp.A00(r12, AnonymousClass56S.A00);
        Number number = (Number) A002.A03;
        String A0O = 002.A0O("subtitle_transition_key", number.intValue());
        long j = this.A03.A0B.A03.A00;
        C243673Zt A004 = C243633Zp.A00(r12, AnonymousClass56T.A00);
        List list = (List) this.A01.A00;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(002.A0O("subtitle_transition_key", i));
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        AnonymousClass4Ey A012 = 2Vi.A01(C243533Zd.GLOBAL, (String[]) Arrays.copyOf(strArr, strArr.length));
        A012.A03(C246033ds.A05);
        2V1 r5 = r12.A05;
        Context context = r5.A0C;
        A012.A04(AnonymousClass4F6.A00(context, -5));
        A012.A05(AnonymousClass4F6.A00(context, 5));
        AnonymousClass4Ew r1 = A04;
        A012.A02 = r1;
        A012.A03(C246033ds.A00);
        A012.A01(0.0f);
        A012.A02(0.0f);
        A012.A02 = r1;
        AnonymousClass4F7.A00(r12, A012);
        2WX r18 = 2WX.A02;
        2WX r13 = new 2WX((2WX) null, new AnonymousClass9JS(AnonymousClass05K.A02, AnonymousClass56U.A00, 4));
        C243573Zh r15 = C243573Zh.STRETCH;
        Integer num = AnonymousClass05K.A00;
        2WX r2 = new 2WX(r13, new AnonymousClass9JS(num, r15, 3));
        Integer num2 = AnonymousClass05K.A01;
        2WX r7 = new 2WX(new 2WX(new 2WX(new 2WX(r2, new AnonymousClass9JQ(num2, 1.0f, 1)), new AnonymousClass9JS(AnonymousClass05K.A1F, new C377259Ld(this, 31), 4)), new C244253at(num, new GAB(A003, A002, this, j), (String) null)), new C244253at(num2, new C377439Lv(15, A004, A003), (String) null));
        2Wb r6 = new 2Wb(r5, new ArrayList());
        int i2 = 0;
        for (Object next : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            C253163qJ r14 = (C253163qJ) next;
            if (i2 == number.intValue()) {
                String A0O2 = 002.A0O("subtitle_component_key_", i2);
                2WX r16 = r14.A03;
                0qQ.A0B(r16, 0);
                AnonymousClass9JS r0 = new AnonymousClass9JS(num, r15, 3);
                if (r16 == r18) {
                    r16 = null;
                }
                2WX r3 = new 2WX(r16, r0);
                CharSequence charSequence = r14.A04;
                int i4 = r14.A00;
                TextUtils.TruncateAt truncateAt = r14.A01;
                0sP r28 = r14.A07;
                C62320sa r26 = r14.A06;
                C62320sa r23 = r14.A05;
                C244063aa r142 = r14.A02;
                0qQ.A0B(charSequence, 0);
                0qQ.A0B(truncateAt, 2);
                C253193qM r27 = new C253193qM(A004, this.A02, new C253163qJ(truncateAt, r142, r3, charSequence, r26, r23, r28, r14.A08, i4), A0O, i2, this.A00);
                AnonymousClass56V.A01(r27, A0O2);
                r6.A00(r27);
            }
            i2 = i3;
        }
        return C243563Zg.A06(r6, r12, r7, (C243573Zh) null, (C243573Zh) null, (C243583Zi) null, false);
    }

    static {
        C243533Zd r0 = 2Vi.A04;
    }

    public AnonymousClass56Q(AnonymousClass9IE r1, UserSession userSession, C243503Za r3, long j) {
        this.A03 = r3;
        this.A01 = r1;
        this.A02 = userSession;
        this.A00 = j;
    }
}
