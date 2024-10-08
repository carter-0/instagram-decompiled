package X;

import android.content.Context;
import android.media.MediaCodecInfo;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7kl  reason: invalid class name and case insensitive filesystem */
public final class C340137kl implements C340147km {
    public int A00 = 2200;
    public final Context A01;
    public final UserSession A02;

    public C340137kl(UserSession userSession, Context context) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(context, 2);
        this.A02 = userSession;
        Context applicationContext = context.getApplicationContext();
        0qQ.A07(applicationContext);
        this.A01 = applicationContext;
    }

    public final C343137pj Ap9(C340177kp r9, C340177kp r10, List list, List list2, List list3, List list4, int i, int i2, int i3) {
        C343047pa A002;
        C343047pa r3;
        C343047pa r1;
        int i4;
        0qQ.A0B(list, 0);
        0qQ.A0B(list2, 1);
        0qQ.A0B(list3, 2);
        List A003 = C343077pd.A00(C343077pd.A01, C343057pb.A01(list3, list2));
        0qQ.A07(A003);
        int i5 = i2;
        int min = Math.min(i5, i);
        float max = ((float) Math.max(i5, i)) / ((float) min);
        int i6 = 1080;
        int min2 = Math.min(1080, min);
        C343047pa A004 = C343057pb.A00(A003, Math.round(((float) min2) * max), min2);
        0qQ.A07(A004);
        if (A004.A01 == 1080 && A004.A02 == 1920 && C343127pi.A00(this.A01)) {
            A002 = new C343047pa(1920, 1080);
        } else {
            Context context = this.A01;
            UserSession userSession = this.A02;
            if (!C343127pi.A00(context) || min <= 720 || !182.A06(0Tu.A05, userSession, 36323788257766925L)) {
                i6 = 720;
            }
            int min3 = Math.min(i6, min);
            A002 = C343057pb.A00(A003, Math.round(((float) min3) * max), min3);
            0qQ.A07(A002);
        }
        if (A002.A01 == 1080) {
            MediaCodecInfo.CodecCapabilities A005 = C346447vB.A00();
            if (!(A005 == null || A005.getVideoCapabilities() == null)) {
                A005.getVideoCapabilities().getWidthAlignment();
            }
            MediaCodecInfo.CodecCapabilities A006 = C346447vB.A00();
            if (A006 == null || A006.getVideoCapabilities() == null) {
                i4 = 16;
            } else {
                i4 = A006.getVideoCapabilities().getHeightAlignment();
            }
            int i7 = 1080;
            if (1080 % i4 != 0) {
                i7 = 1088;
            }
            r3 = new C343047pa(1920, i7);
        } else {
            r3 = A002;
        }
        C343047pa A007 = A00(A002, list);
        if (list4 != null) {
            r1 = A00(A002, list4);
        } else {
            r1 = null;
        }
        return new C343137pj(A002, A007, r3, r1);
    }

    public final C343137pj Bc4(C340177kp r3, List list, List list2, int i, int i2, int i3) {
        return new C343137pj((C343047pa) null, (C343047pa) null, (C343047pa) null, (C343047pa) null);
    }

    public final C343137pj Bf6(List list, int i, int i2, int i3) {
        return new C343137pj((C343047pa) null, (C343047pa) null, (C343047pa) null, (C343047pa) null);
    }

    public final C343137pj CEC(C340177kp r3, List list, List list2, int i, int i2, int i3) {
        return new C343137pj((C343047pa) null, (C343047pa) null, (C343047pa) null, (C343047pa) null);
    }

    private final C343047pa A00(C343047pa r12, List list) {
        int i;
        List<C343047pa> A002 = C343077pd.A00(C343077pd.A00, list);
        0qQ.A07(A002);
        int i2 = this.A00;
        C343047pa r8 = (C343047pa) A002.get(0);
        int size = A002.size();
        for (int i3 = 1; i3 < size; i3++) {
            C343047pa r3 = (C343047pa) A002.get(i3);
            if (r3.A02 * r3.A01 > r8.A02 * r8.A01) {
                r8 = r3;
            }
        }
        float f = ((float) r8.A02) / ((float) r8.A01);
        float f2 = ((float) r12.A02) / ((float) r12.A01);
        ArrayList arrayList = new ArrayList();
        for (C343047pa r2 : A002) {
            float f3 = ((float) r2.A02) / ((float) r2.A01);
            if (f < f2) {
                if (f3 >= f) {
                    i = (f3 > f2 ? 1 : (f3 == f2 ? 0 : -1));
                }
            } else if (f3 >= f2) {
                i = (f3 > f ? 1 : (f3 == f ? 0 : -1));
            }
            if (i <= 0) {
                arrayList.add(r2);
            }
        }
        if (!arrayList.isEmpty()) {
            A002 = arrayList;
        }
        C343047pa r7 = null;
        C343047pa r82 = null;
        for (C343047pa r4 : A002) {
            if (!C343057pb.A02(r4)) {
                if (r82 == null) {
                    r82 = r4;
                }
                float f4 = (float) r4.A02;
                int i4 = r4.A01;
                if (Math.abs((f4 / f2) - ((float) i4)) < f4 * 0.1f) {
                    if (r7 == null) {
                        r7 = r4;
                    } else {
                        int i5 = r7.A01;
                        if ((i5 > i2 && i4 < i5) || (i5 < i4 && i4 < i2)) {
                            r7 = r4;
                        }
                    }
                }
            }
        }
        if (r7 == null) {
            r7 = null;
            if (r82 != null) {
                return r82;
            }
        }
        return r7;
    }
}
