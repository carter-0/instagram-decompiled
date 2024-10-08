package X;

import android.graphics.Bitmap;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.8OO  reason: invalid class name */
public final class AnonymousClass8OO implements AnonymousClass1MK, C3493580b, AnonymousClass8OB {
    public Bitmap A00;
    public C20565Wui A01;
    public C21006X9e A02;
    public C17872VhP A03;
    public final UserSession A04;
    public final AnonymousClass80W A05;
    public final AnonymousClass8OA A06;
    public final AnonymousClass8OD A07;
    public final AnonymousClass8OM A08;

    public final void DK4(C226952iF r1, int i) {
    }

    public final void CyF(C226952iF r3, AnonymousClass3LX r4) {
        this.A00 = r4.A01;
        this.A05.A04(new Object());
    }

    public final void DHL(C20565Wui wui, C17872VhP vhP) {
        this.A03 = vhP;
        this.A01 = wui;
        AnonymousClass80W r2 = this.A05;
        Object obj = r2.A00.first;
        if (obj == AnonymousClass8OP.THREAD_READY || obj == AnonymousClass8OP.READY_TO_INITIALIZE) {
            0wb.A03("BrushMaker", "Thread available called multiple times");
        }
        r2.A04(new Object());
    }

    public final void DJx(C226952iF r3, C254673sr r4) {
        this.A05.A04(new Object());
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        AnonymousClass8OA r5;
        int ordinal = ((AnonymousClass8OP) obj2).ordinal();
        if (ordinal != 3) {
            if (ordinal != 5) {
                if (ordinal == 4) {
                    r5 = this.A06;
                    C21006X9e x9e = this.A02;
                    AnonymousClass8O9 r2 = r5.A04;
                    11Z.A00();
                    r2.A01.put(x9e.AiK(), x9e);
                    AnonymousClass8O4 r4 = r2.A00;
                    Handler handler = r4.A0D;
                    Runnable runnable = r4.A0P;
                    handler.removeCallbacks(runnable);
                    if (r4.A0N.A01.size() == r4.A0T.size()) {
                        runnable.run();
                    } else {
                        handler.postDelayed(runnable, 500);
                    }
                } else {
                    return;
                }
            }
            r5 = this.A06;
        } else {
            C20565Wui wui = this.A01;
            if (wui == null) {
                0wb.A03("BrushMaker", "Illegal state in brushMaker: null thread");
                r5 = this.A06;
            } else {
                wui.A07(new C40899Al7(this));
                return;
            }
        }
        Set set = r5.A06;
        set.remove(this);
        A6A a6a = r5.A01;
        if (set.isEmpty() && a6a != null) {
            AnonymousClass8O4 r0 = a6a.A00;
            C354988Od r3 = a6a.A01;
            AnonymousClass8O4.A00(r0).A00.A04(a6a.A02, r3.A00);
        }
    }

    public AnonymousClass8OO(UserSession userSession, AnonymousClass8OA r11, AnonymousClass8OD r12, AnonymousClass8OM r13) {
        this.A08 = r13;
        this.A06 = r11;
        this.A07 = r12;
        this.A04 = userSession;
        AnonymousClass8OP r2 = AnonymousClass8OP.NEW;
        AnonymousClass80W r8 = new AnonymousClass80W(r2);
        this.A05 = r8;
        r8.A02(this);
        Class<AnonymousClass8OQ> cls = AnonymousClass8OQ.class;
        AnonymousClass8OP r6 = AnonymousClass8OP.BITS_READY;
        r8.A03(cls, r2, r6);
        Class<AnonymousClass8OR> cls2 = AnonymousClass8OR.class;
        r8.A03(cls2, r2, r6);
        Class<AnonymousClass8OS> cls3 = AnonymousClass8OS.class;
        AnonymousClass8OP r1 = AnonymousClass8OP.THREAD_READY;
        r8.A03(cls3, r2, r1);
        AnonymousClass8OP r3 = AnonymousClass8OP.BRUSH_MAKER_FAILED;
        r8.A03(AnonymousClass8OT.class, r2, r3);
        AnonymousClass8OP r22 = AnonymousClass8OP.READY_TO_INITIALIZE;
        r8.A03(cls, r1, r22);
        r8.A03(cls2, r1, r22);
        r8.A03(cls3, r6, r22);
        r8.A03(AnonymousClass8OU.class, r22, AnonymousClass8OP.BRUSH_READY);
        r8.A03(AnonymousClass8OV.class, r22, r3);
    }
}
