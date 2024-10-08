package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

public final class QDV extends 2YL implements C66540MVu {
    public LDi A00;
    public LED A01;
    public C11260SHu A02;
    public C349307zv A03;
    public final 2Fk A04;
    public final AnonymousClass2Fj A05;
    public final AnonymousClass2Fj A06;
    public final UserSession A07;
    public final 2Fk A08;
    public final C3499582p A09;
    public final C13671Tef A0A = new C65008Lll(this);
    public final AnonymousClass8IU A0B;

    public final void AUS(Context context) {
        String str;
        AnonymousClass2Fj r2;
        Object obj;
        0qQ.A0B(context, 0);
        C349307zv A042 = this.A09.A02.A01.A04();
        if (A042 == null) {
            r2 = this.A06;
            obj = C61760KKz.A00;
        } else {
            Long l = null;
            String str2 = A042.A0k;
            C306576Mr r4 = C306576Mr.DISABLED;
            List list = 0sn.A00;
            this.A01 = new LED(r4, (Integer) null, (Integer) null, str2, AnonymousClass7TE.A1E(), list, list, 0, 0, -1);
            try {
                C11260SHu sHu = new C11260SHu(context, this.A07, AnonymousClass7TE.A0t(A042.A0k), (SortedSet) null);
                sHu.A01 = this;
                sHu.A00();
                this.A02 = sHu;
            } catch (IOException unused) {
                this.A06.A0A(C61760KKz.A00);
            }
            2Fk r3 = this.A04;
            Long l2 = null;
            if (!(r3.A02() instanceof C61760KKz)) {
                String A072 = A042.A07();
                C349307zv r0 = this.A03;
                if (r0 != null) {
                    str = r0.A07();
                } else {
                    str = null;
                }
                if (0qQ.A0K(A072, str)) {
                    if (r3.A02() instanceof C61758KKx) {
                        LED led = this.A01;
                        if (led != null) {
                            List list2 = led.A07;
                            r2 = this.A06;
                            obj = new C61758KKx(list2);
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    } else {
                        r2 = this.A06;
                        obj = C61759KKy.A00;
                    }
                }
            }
            this.A03 = A042;
            int i = A042.A0H;
            int i2 = A042.A06;
            AnonymousClass8IU r6 = this.A0B;
            String str3 = A042.A0k;
            C13671Tef tef = this.A0A;
            if (i > 0) {
                l = DbS.A0j(i);
            }
            if (i2 > 0) {
                l2 = DbS.A0j(i2);
            }
            r6.A01(this.A07, tef, l, l2, str3);
            return;
        }
        r2.A0A(obj);
    }

    public final int C8i(Context context) {
        String str;
        int i;
        AnonymousClass82Y r3 = this.A09.A02.A01;
        C349307zv A042 = r3.A04();
        if (A042 != null && (i = A042.A06 - A042.A0H) > 0) {
            return i;
        }
        C349307zv A043 = r3.A04();
        if (A043 != null) {
            str = AnonymousClass7TE.A0t(A043.A0k).getCanonicalPath();
        } else {
            str = null;
        }
        C7232Q0d A022 = SRj.A02(context, str, false);
        if (A022 != null) {
            return (int) A022.A07;
        }
        return 0;
    }

    public final /* synthetic */ void EUl(String str, String str2) {
        C63155KsO.A00(this, str, str2);
    }

    public final void reset() {
        this.A03 = null;
        this.A01 = null;
        C11260SHu sHu = this.A02;
        if (sHu != null) {
            sHu.A01 = null;
        }
        this.A02 = null;
    }

    private final SortedSet A00(List list, Map map) {
        int i;
        C349307zv A042 = this.A09.A02.A01.A04();
        int i2 = 0;
        if (A042 != null && (i = A042.A0H) > 0) {
            i2 = i;
        }
        AnonymousClass3T1 A0A2 = C242173Sx.A0A(new C73519Pe2(new JGL(i2, 34, (Object) list, (Object) map), 00k.A0o(list)));
        TreeSet treeSet = new TreeSet(new C13113TLw(11));
        0qQ.A0B(A0A2, 0);
        Iterator it = A0A2.iterator();
        while (it.hasNext()) {
            JTT.A1U(treeSet, it);
        }
        return treeSet;
    }

    public final void AHT() {
        LED led = this.A01;
        if (led != null) {
            this.A05.A0A(AnonymousClass7TE.A0t(led.A08));
        }
    }

    public final 2Fk Ag2() {
        return this.A08;
    }

    public final LED BJn() {
        return this.A01;
    }

    public final 2Fk C85() {
        return this.A04;
    }

    public final void Ead(LED led) {
        this.A01 = led;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.SHv, java.lang.Object] */
    public final void FHa(Context context) {
        LED led = this.A01;
        if (led != null) {
            C11260SHu sHu = this.A02;
            if (sHu == null) {
                File A0t = AnonymousClass7TE.A0t(led.A08);
                sHu = new C11260SHu(context, this.A07, A0t, A00(led.A07, led.A09));
                sHu.A01 = this;
                sHu.A00();
                this.A02 = sHu;
            }
            sHu.A01 = this;
            SortedSet A002 = A00(led.A07, led.A09);
            if (!0qQ.A0K(sHu.A03, A002)) {
                sHu.A03 = A002;
                if (sHu.A02 == null) {
                    sHu.A00();
                    0kD.A05("KaraokeBleepAudioConcatInteractor_setBleepInfo", "bleepFileIsNotInitialized", (Throwable) null);
                    return;
                }
                C266824aP r8 = new C266824aP();
                C266764aJ r1 = new C266764aJ(C266714aE.VIDEO);
                File file = sHu.A0A;
                Pxh.A1F(r8, r1, new C266744aH(file));
                C266764aJ r2 = new C266764aJ(C266714aE.AUDIO);
                long j = 0;
                for (0eP r12 : sHu.A03) {
                    long A0R = AnonymousClass7TE.A0R(r12.A00);
                    long A0R2 = AnonymousClass7TE.A0R(r12.A01);
                    if (A0R > j) {
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        Pxg.A1K(Pxe.A0V(timeUnit, j, A0R), r2, new C266744aH(file));
                    }
                    for (long j2 = 0; j2 < A0R2; j2 += sHu.A00) {
                        long j3 = A0R2 - j2;
                        if (j3 >= sHu.A00) {
                            j3 = -1;
                        }
                        File file2 = sHu.A02;
                        if (file2 == null) {
                            0qQ.A0F("bleepFile");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        Pxg.A1K(Pxe.A0V(TimeUnit.MILLISECONDS, 0, j3), r2, new C266744aH(file2));
                    }
                    j = A0R + A0R2;
                }
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                C266744aH r6 = new C266744aH(file);
                r6.A03 = Pxe.A0V(timeUnit2, j, -1);
                Pxh.A1F(r8, r2, r6);
                SQv sQv = new SQv();
                sQv.A08 = new MediaComposition(r8);
                sQv.A07 = sHu.A05;
                ? obj = new Object();
                obj.A0C = new C10862RzN(sQv);
                obj.A00 = sHu.A04;
                obj.A07 = sHu.A06;
                obj.A0E = sHu.A0B;
                obj.A0A = sHu.A09;
                obj.A08 = sHu.A07;
                obj.A09 = sHu.A08;
                SRj.A00(obj.A01());
            }
        }
    }

    public QDV(UserSession userSession, C3499582p r4) {
        this.A07 = userSession;
        this.A09 = r4;
        C61480nO A002 = 0nY.A00();
        0qQ.A07(A002);
        this.A0B = new AnonymousClass8IU(A002);
        AnonymousClass2Fj A0K = JTO.A0K();
        this.A06 = A0K;
        AnonymousClass2Fj A0K2 = JTO.A0K();
        this.A05 = A0K2;
        this.A04 = A0K;
        this.A08 = A0K2;
    }

    public final void AIS(Context context) {
        FHa(context);
    }
}
