package X;

import android.content.Context;
import android.view.Choreographer;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3p5  reason: invalid class name and case insensitive filesystem */
public abstract class C252423p5 implements C61110lV {
    public int A00;
    public boolean A01;
    public C229552ne A02;
    public boolean A03;
    public boolean A04 = true;
    public final 02m A05 = 02m.A0p;
    public final Set A06 = new HashSet();
    public final Set A07 = new HashSet();
    public final Set A08 = new HashSet();
    public final 2Kq A09;

    public void A05() {
    }

    public final C2366634p A02(String str) {
        C2366634p r1 = new C2366634p(this, str);
        this.A07.add(r1);
        this.A06.add(r1);
        return r1;
    }

    public void A03() {
        if (this.A08.isEmpty()) {
            A0A(AwakeTimeSinceBootClock.INSTANCE.now(), 2);
        }
    }

    public void A04() {
        if (!this.A01) {
            for (C2366634p r1 : this.A07) {
                r1.A00 = AnonymousClass05K.A00;
            }
        }
    }

    public final void A06() {
        if (this.A01) {
            boolean z = this.A04;
            02m r2 = this.A05;
            int A0L = A0L();
            if (z) {
                r2.dropAllInstancesOfMarker(A0L);
            } else {
                r2.markerDrop(A0L, this.A00);
            }
            this.A01 = false;
        }
    }

    public final void A07() {
        if (this.A01) {
            this.A03 = true;
            long now = AwakeTimeSinceBootClock.INSTANCE.now();
            14i r0 = 14i.A08;
            0no.A00().A01(new C318676pL(this, now), 5500);
        }
    }

    public final void A08() {
        if (this.A01) {
            this.A03 = true;
            A0A(AwakeTimeSinceBootClock.INSTANCE.now(), 4);
        }
    }

    public void A0A(long j, short s) {
        short s2 = s;
        if (this.A01 && s != 2) {
            Set<C2366634p> set = this.A08;
            if (!set.isEmpty()) {
                String[] strArr = new String[set.size()];
                int i = 0;
                for (C2366634p r0 : set) {
                    strArr[i] = r0.A02;
                    i++;
                }
                if (this.A01) {
                    this.A05.markerAnnotate(A0L(), this.A00, "remaining_components", strArr);
                }
                C249813kP r4 = C249813kP.A00;
                int A0L = A0L();
                if (r4 instanceof C249823kQ) {
                    C249823kQ r42 = (C249823kQ) r4;
                    C249823kQ.A00(r42, new C377679Mt(r42, strArr, "remaining_components", 12), A0L);
                }
            }
        }
        if (!this.A01) {
            return;
        }
        if (!this.A03 || s != 2) {
            C229552ne r02 = this.A02;
            if (r02 != null) {
                C229502nY A012 = r02.A01();
                A0G("1_frame_drop_bucket", A012.A01);
                A0F("4_frame_drop_bucket", A012.A00);
            }
            2Kq r1 = this.A09;
            if (r1 != null && r1.A02 && r1.A01) {
                A0G("user_sample_rate", r1.A00);
            }
            A05();
            this.A01 = false;
            this.A03 = false;
            this.A05.markerEnd(A0L(), this.A00, s2, j, TimeUnit.MILLISECONDS);
            14i.A06(this);
        }
    }

    public final void A0B(Context context) {
        02z A012;
        if (this.A02 == null) {
            Context context2 = context;
            0qQ.A0B(context, 0);
            C229532nc r8 = (C229532nc) C229492nU.A01.getValue();
            0qQ.A0B(r8, 0);
            0qi r1 = C62000qj.A02;
            if (r1.A0Y) {
                boolean z = r1.A0X;
                float f = AnonymousClass2nW.A00;
                A012 = new 02z(Float.valueOf(60.0f));
                C262224Cq r12 = AnonymousClass2nW.A04;
                1Eo.A05(19B.A00, new C58101ImN(context2, (AnonymousClass4D7) null, (05G) A012, 80, z), r12);
            } else {
                A012 = 106.A01(Float.valueOf(AnonymousClass2nW.A03.A00(context, 80)));
            }
            05F A032 = 10b.A03(A012);
            Choreographer instance = Choreographer.getInstance();
            0qQ.A07(instance);
            this.A02 = new C229552ne((C229572ng) C229552ne.A0B.getValue(), r8, new C229542nd(instance), A032, true);
        }
    }

    public void A0C(C2366634p r11, String str, long j) {
        long j2 = j;
        if (this.A01) {
            this.A05.markerPoint(A0L(), this.A00, 002.A0R(r11.A02, "_start"), str, j2, TimeUnit.MILLISECONDS);
        }
        C249813kP r3 = C249813kP.A00;
        int A0L = A0L();
        String A0R = 002.A0R(r11.A02, "_start");
        if (r3 instanceof C249823kQ) {
            C249823kQ r32 = (C249823kQ) r3;
            0qQ.A0B(A0R, 1);
            C249823kQ.A00(r32, new AnonymousClass6UH(r32, A0R, j), A0L);
        }
    }

    public final void A0D(C2366634p r7, String str, boolean z) {
        boolean z2 = this.A01;
        String A002 = AnonymousClass000.A00(1064);
        if (z2) {
            02m r5 = this.A05;
            int A0L = A0L();
            r5.markerPoint(A0L, this.A00, 002.A0R(r7.A02, A002));
            if (str != null) {
                r5.markerAnnotate(A0L, this.A00, "error_message", str);
            }
            if (z) {
                A0A(AwakeTimeSinceBootClock.INSTANCE.now(), 3);
            }
        }
        C249813kP r2 = C249813kP.A00;
        int A0L2 = A0L();
        r2.A01(A0L2, 002.A0R(r7.A02, A002));
        if (str != null) {
            C249813kP.A00.A03(A0L2, "error_message", str);
        }
    }

    public final void A0E(String str) {
        if (this.A01) {
            this.A05.markerPoint(A0L(), this.A00, str);
        }
        C249813kP.A00.A01(A0L(), str);
    }

    public final void A0F(String str, float f) {
        String str2 = str;
        if (this.A01) {
            this.A05.markerAnnotate(A0L(), this.A00, str2, (double) f);
        }
        C249813kP r4 = C249813kP.A00;
        int A0L = A0L();
        double d = (double) f;
        if (r4 instanceof C249823kQ) {
            C249823kQ r42 = (C249823kQ) r4;
            C249823kQ.A00(r42, new C305746Jj(r42, str, d), A0L);
        }
    }

    public final void A0G(String str, int i) {
        if (this.A01) {
            this.A05.markerAnnotate(A0L(), this.A00, str, i);
        }
        C249813kP.A00.A02(A0L(), str, i);
    }

    public final void A0H(String str, long j) {
        String str2 = str;
        long j2 = j;
        if (this.A01) {
            this.A05.markerPoint(A0L(), this.A00, str2, j2, TimeUnit.MILLISECONDS);
        }
        C249813kP r7 = C249813kP.A00;
        int A0L = A0L();
        if (r7 instanceof C249823kQ) {
            C249823kQ r72 = (C249823kQ) r7;
            0qQ.A0B(str, 1);
            C249823kQ.A00(r72, new C377629Mo(r72, str, 2, j), A0L);
        }
    }

    public final void A0I(String str, Long l) {
        String str2 = str;
        if (this.A01) {
            this.A05.markerAnnotate(A0L(), this.A00, str2, l.longValue());
        }
        C249813kP r5 = C249813kP.A00;
        int A0L = A0L();
        long longValue = l.longValue();
        if (r5 instanceof C249823kQ) {
            C249823kQ r52 = (C249823kQ) r5;
            C249823kQ.A00(r52, new C377629Mo(r52, str, 1, longValue), A0L);
        }
    }

    public final void A0J(String str, String str2) {
        if (this.A01) {
            this.A05.markerAnnotate(A0L(), this.A00, str, str2);
        }
        C249813kP.A00.A03(A0L(), str, str2);
    }

    public final void A0K(String str, boolean z) {
        if (this.A01) {
            this.A05.markerAnnotate(A0L(), this.A00, str, z);
        }
        C249813kP r3 = C249813kP.A00;
        int A0L = A0L();
        if (r3 instanceof C249823kQ) {
            C249823kQ r32 = (C249823kQ) r3;
            0qQ.A0B(str, 1);
            C249823kQ.A00(r32, new C377649Mq(r32, str, 1, z), A0L);
        }
    }

    public C252423p5(0lg r2) {
        this.A09 = (2Kq) r2.A00(2Kq.class);
    }

    public final void A09(long j) {
        int A0L = A0L();
        if (this.A01) {
            0wb.A03("BaseNavigationPerfLogger", "Starting navigation logging while logging in progress!!");
            A06();
        }
        14i.A03(15Y.A03, this);
        Set set = this.A08;
        set.clear();
        set.addAll(this.A07);
        A04();
        int hashCode = AnonymousClass0HM.A00().hashCode();
        this.A00 = hashCode;
        02m r3 = this.A05;
        r3.markerStart(A0L, hashCode, j, TimeUnit.MILLISECONDS);
        r3.markerAnnotate(A0L, this.A00, "APP_STARTUP_TIME_BUCKET", C64031Cc.A00());
        C249813kP.A00.A02(A0L, "APP_STARTUP_TIME_BUCKET", C64031Cc.A00());
        C229552ne r1 = this.A02;
        if ((r3.isMarkerOn(A0L, this.A00) || r3.isMarkerOn(A0L)) && r1 != null) {
            r1.A01();
            r1.A02();
        }
        this.A01 = true;
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(1739856572);
        14i r0 = 14i.A08;
        A0A(AwakeTimeSinceBootClock.INSTANCE.now() - LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, 630);
        AnonymousClass0fD.A0A(1087518353, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(132611307, AnonymousClass0fD.A03(1786099256));
    }

    public int A0L() {
        return 31784991;
    }
}
