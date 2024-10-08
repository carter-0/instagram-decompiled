package com.instagram.remindme.common.data;

import X.05G;
import X.0eP;
import X.0eS;
import X.0qQ;
import X.0sL;
import X.1Hj;
import X.1Xj;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass4KD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C16177Uq2;
import X.C17260VOn;
import X.C17838Vgr;
import X.C19528WbE;
import X.C19529WbF;
import X.C19530WbG;
import X.C19531WbH;
import X.C19532WbI;
import X.C19533WbJ;
import X.C231122qu;
import X.C41847B3o;
import X.C53268GlG;
import X.C56037Hrk;
import X.C60340gF;
import X.DHW;
import X.DHX;
import X.DQU;
import X.JMC;
import X.JTQ;
import X.VWM;
import X.X1X;
import X.X1Y;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoMediaReminder;
import com.instagram.api.schemas.MediaReminder;
import com.instagram.api.schemas.MediaReminderImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.remindme.common.data.MediaReminderRepository$toggleReminderState$1", f = "MediaReminderRepository.kt", i = {0}, l = {42}, m = "invokeSuspend", n = {"setReminder"}, s = {"I$0"})
public final class MediaReminderRepository$toggleReminderState$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final /* synthetic */ 1Xj A05;
    public final /* synthetic */ C16177Uq2 A06;
    public final /* synthetic */ VWM A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaReminderRepository$toggleReminderState$1(1Xj r2, C16177Uq2 uq2, VWM vwm, AnonymousClass4D7 r5) {
        super(2, r5);
        this.A05 = r2;
        this.A06 = uq2;
        this.A07 = vwm;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.remindme.common.data.MediaReminderRepository$toggleReminderState$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r6) {
        return new MediaReminderRepository$toggleReminderState$1(this.A05, this.A06, this.A07, r6);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.remindme.common.data.MediaReminderRepository$toggleReminderState$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Xj r4;
        String A30;
        C16177Uq2 uq2;
        VWM vwm;
        int i;
        X1X wbF;
        Object mediaReminderImpl;
        C17838Vgr vgr;
        1Xj r2;
        X1Y x1y;
        Integer num;
        05G r7;
        Object value;
        boolean z;
        JMC jmc;
        1Hj r8 = 1Hj.A02;
        boolean z2 = true;
        if (this.A01 != 0) {
            i = this.A00;
            vwm = (VWM) this.A04;
            r4 = (1Xj) this.A03;
            uq2 = (C16177Uq2) this.A02;
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            r4 = this.A05;
            if (r4.A5L() && (A30 = r4.A30()) != null) {
                uq2 = this.A06;
                vwm = this.A07;
                String A072 = C231122qu.A07(uq2.A00, r4);
                i = !r4.A5w();
                MediaReminderApi mediaReminderApi = uq2.A02;
                this.A02 = uq2;
                this.A03 = r4;
                this.A04 = vwm;
                this.A00 = i;
                this.A01 = 1;
                if (i != 0) {
                    obj = MediaReminderApi.A00(mediaReminderApi, A30, A072, this);
                } else {
                    obj = MediaReminderApi.A01(mediaReminderApi, A30, A072, this);
                }
                if (obj == r8) {
                    return r8;
                }
            }
            return C60340gF.A00;
        }
        DQU dqu = (DQU) obj;
        if (dqu instanceof DHX) {
            if (i == 0) {
                z2 = false;
            }
            wbF = new C19528WbE(z2);
        } else if (dqu instanceof DHW) {
            boolean z3 = ((DHW) dqu).A01;
            wbF = new C19529WbF(z3);
            MediaReminder BlU = r4.A0C.BlU();
            if (BlU != null) {
                Integer B2f = BlU.B2f();
                BlU.Cac();
                Boolean valueOf = Boolean.valueOf(z3);
                if (BlU instanceof ImmutablePandoMediaReminder) {
                    TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
                    mediaReminderImpl = C41847B3o.A0o(BlU, JTQ.A1b(AnonymousClass000.A00(4966), valueOf, new 0eP(AnonymousClass000.A00(4753), B2f)));
                } else {
                    mediaReminderImpl = new MediaReminderImpl(valueOf, B2f);
                }
                r4.A0C.EiO((MediaReminder) mediaReminderImpl);
                uq2.A01.A03(r4);
                r4.AE7(uq2.A00);
            }
        } else {
            throw new RuntimeException();
        }
        X1X x1x = wbF;
        if (x1x instanceof C19528WbE) {
            boolean z4 = ((C19528WbE) x1x).A00;
            vgr = vwm.A01;
            C56037Hrk hrk = vgr.A01;
            r2 = vwm.A00;
            if (z4) {
                hrk.A00(r2, "reminder_set_failure");
                x1y = C19530WbG.A00;
            } else {
                hrk.A00(r2, "reminder_unset_failure");
                x1y = C19532WbI.A00;
            }
        } else if (x1x instanceof C19529WbF) {
            boolean z5 = ((C19529WbF) x1x).A00;
            vgr = vwm.A01;
            C56037Hrk hrk2 = vgr.A01;
            r2 = vwm.A00;
            if (z5) {
                hrk2.A00(r2, "reminder_set_success");
                x1y = C19531WbH.A00;
            } else {
                hrk2.A00(r2, "reminder_unset_success");
                x1y = C19533WbJ.A00;
            }
        } else {
            throw new RuntimeException();
        }
        X1Y x1y2 = x1y;
        C17260VOn vOn = vwm.A02;
        if (vOn != null) {
            0qQ.A0B(x1y2, 0);
            if (!x1y2.equals(C19530WbG.A00)) {
                if (x1y2.equals(C19531WbH.A00) || x1y2.equals(C19532WbI.A00)) {
                    num = AnonymousClass05K.A00;
                    r7 = vOn.A00.A06;
                    do {
                        value = r7.getValue();
                        C53268GlG glG = (C53268GlG) value;
                        z = glG.A02;
                        jmc = glG.A00;
                        AnonymousClass7TG.A1O(num, jmc);
                    } while (!r7.AIY(value, new C53268GlG(jmc, num, z)));
                } else if (!x1y2.equals(C19533WbJ.A00)) {
                    throw new RuntimeException();
                }
            }
            num = AnonymousClass05K.A01;
            r7 = vOn.A00.A06;
            do {
                value = r7.getValue();
                C53268GlG glG2 = (C53268GlG) value;
                z = glG2.A02;
                jmc = glG2.A00;
                AnonymousClass7TG.A1O(num, jmc);
            } while (!r7.AIY(value, new C53268GlG(jmc, num, z)));
        }
        vgr.A00.A00(new AnonymousClass4KD(r2, x1y2));
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaReminderRepository$toggleReminderState$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
