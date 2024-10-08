package X;

import android.util.LruCache;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.7QL  reason: invalid class name */
public final class AnonymousClass7QL {
    public C376539Ij A00;
    public C53400GnX A01;
    public boolean A02;
    public AnonymousClass7QP A03;
    public final LruCache A04;
    public final AnonymousClass7QI A05;
    public final Set A06;
    public final Timer A07 = new Timer();
    public final ConcurrentLinkedQueue A08 = new ConcurrentLinkedQueue();

    public static final C61081JwJ A00(AnonymousClass7QL r10, C376539Ij r11) {
        Long l;
        C61063Jw1 jw1;
        String str;
        long j;
        C61072JwA jwA;
        long j2;
        int i;
        Object next;
        C61065Jw3 jw3;
        C53400GnX gnX = r10.A01;
        if (gnX == null) {
            return null;
        }
        Object obj = r11.A04;
        C61063Jw1 jw12 = (C61063Jw1) ((AbstractMap) gnX.A04).get(obj);
        if (jw12 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("State data doesn't exist for ");
            sb.append(obj);
            r10.A01(sb.toString());
            return null;
        }
        Object obj2 = r11.A01;
        if (obj2 != null) {
            AbstractMap abstractMap = (AbstractMap) jw12.A02;
            jw1 = (C61063Jw1) abstractMap.get(obj2);
            if (jw1 == null) {
                Collection values = abstractMap.values();
                0qQ.A07(values);
                jw1 = (C61063Jw1) 00k.A0A(values);
            }
            l = null;
            str = null;
        } else {
            l = 28003L;
            Collection values2 = ((AbstractMap) jw12.A02).values();
            0qQ.A07(values2);
            jw1 = (C61063Jw1) 00k.A0A(values2);
            str = "triggering_action_not_present";
        }
        if (jw1 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Action data doesn't exist for ");
            sb2.append(obj2);
            r10.A01(sb2.toString());
            return null;
        }
        AbstractMap abstractMap2 = (AbstractMap) jw1.A03;
        Object obj3 = r11.A03;
        if (abstractMap2.get(obj3) != null) {
            jwA = (C61072JwA) abstractMap2.get(obj3);
        } else {
            if (str == null) {
                str = "sentiment_not_present";
            }
            if (l != null) {
                j = l.longValue();
            } else {
                j = 28004;
            }
            l = Long.valueOf(j);
            Object obj4 = gnX.A00;
            if (abstractMap2.get(obj4) != null) {
                jwA = (C61072JwA) abstractMap2.get(obj4);
            } else {
                l = 28006L;
                Collection values3 = abstractMap2.values();
                0qQ.A07(values3);
                jwA = (C61072JwA) 00k.A0A(values3);
                if (jwA == null) {
                    jwA = (C61072JwA) jw1.A02;
                }
                str = "sentiment_global_not_present";
            }
        }
        if (jwA == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Sentiment data doesn't exist for ");
            sb3.append(obj3);
            r10.A01(sb3.toString());
            return null;
        }
        AbstractMap abstractMap3 = (AbstractMap) jwA.A02;
        Number number = (Number) r11.A02;
        if (abstractMap3.get(number) != null) {
            jw3 = (C61065Jw3) abstractMap3.get(number);
        } else {
            if (str == null) {
                str = "intensity_not_carried";
            }
            if (l != null) {
                j2 = l.longValue();
            } else {
                j2 = 28005;
            }
            l = Long.valueOf(j2);
            if (number != null) {
                i = number.intValue();
            } else {
                i = 0;
            }
            Collection values4 = abstractMap3.values();
            0qQ.A07(values4);
            Iterator it = 00k.A0g(values4, new C57994Ijn()).iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int abs = Math.abs(i - ((C61065Jw3) next).A00);
                    do {
                        Object next2 = it.next();
                        int abs2 = Math.abs(i - ((C61065Jw3) next2).A00);
                        if (abs > abs2) {
                            next = next2;
                            abs = abs2;
                        }
                    } while (it.hasNext());
                }
            }
            jw3 = (C61065Jw3) next;
        }
        if (jw3 == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Intensity data doesn't exist for ");
            sb4.append(number);
            r10.A01(sb4.toString());
            return null;
        }
        if (l != null) {
            long longValue = l.longValue();
            for (AnonymousClass7QV r0 : r10.A06) {
                C333637Zs r2 = r0.A00;
                AnonymousClass7I3 r1 = r2.A02;
                String str2 = (String) r2.A04.invoke();
                String A002 = r2.A00();
                0qQ.A0B(A002, 1);
                0wc r22 = r1.A01;
                0Aj A003 = r22.A00(r22.A00, "ai_agent_embodiment_failures");
                if (A003.isSampled()) {
                    A003.AAJ("thread_session_id", A002);
                    A003.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
                    A003.A9F(TraceFieldType.ErrorCode, Long.valueOf(longValue));
                    A003.Cgf();
                }
            }
        }
        List list = (List) jw3.A02;
        Object A0H = 00k.A0H(list, 2SP.A00);
        if (r10.A02) {
            if (jw3.A01 >= list.size()) {
                jw3.A01 = 0;
            }
            A0H = 00k.A0O(list, jw3.A01);
            jw3.A01++;
        }
        return new C61081JwJ(str, A0H, 0);
    }

    private final void A01(String str) {
        0KC.A0D("ClientOrchestrator", str);
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A02() {
        for (AnonymousClass7QV r0 : this.A06) {
            C333617Zq r4 = r0.A00.A01;
            02m r3 = r4.A01;
            r3.markerPoint(814286340, r4.A00, "player_ready");
            r3.markerEnd(814286340, r4.A00, 2);
        }
    }

    public final void A03(AnonymousClass7QM r4) {
        C376539Ij r0 = this.A00;
        Number number = (Number) r0.A03;
        Number number2 = (Number) r0.A02;
        if (number == null || number2 == null) {
            A01(002.A0R("Sentiment and Intensity are null for ", r4.name()));
        } else {
            A04(r4, (Integer) null, number.intValue(), number2.intValue());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r15 == X.AnonymousClass7QM.A04) goto L_0x0010;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.AnonymousClass7QM r15, java.lang.Integer r16, int r17, int r18) {
        /*
            r14 = this;
            r11 = r16
            X.GnX r3 = r14.A01
            if (r3 == 0) goto L_0x016a
            X.7QM r0 = X.AnonymousClass7QM.LLM_STREAMING
            r9 = r15
            if (r15 == r0) goto L_0x0010
            X.7QM r0 = X.AnonymousClass7QM.LLM_STREAMING_FINISHED
            r2 = 0
            if (r15 != r0) goto L_0x0011
        L_0x0010:
            r2 = 1
        L_0x0011:
            X.9Ij r0 = r14.A00
            java.lang.Object r1 = r0.A04
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r0 = r3.A04
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.Object r0 = r0.get(r1)
            X.Jw1 r0 = (X.C61063Jw1) r0
            r5 = 0
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r0 = r0.A03
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r8 = r0.get(r15)
            X.7QO r8 = (X.AnonymousClass7QO) r8
            if (r8 == 0) goto L_0x00f6
            int r6 = r8.A00
            if (r2 != 0) goto L_0x0060
            java.lang.Object r1 = r3.A04
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r1.get(r0)
            X.Jw1 r0 = (X.C61063Jw1) r0
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r0 = r0.A02
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            if (r0 == 0) goto L_0x00f3
            java.util.Collection r0 = r0.values()
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r0 = X.00k.A0A(r0)
            X.Jw1 r0 = (X.C61063Jw1) r0
            if (r0 == 0) goto L_0x00f3
            int r0 = r0.A01
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
        L_0x0060:
            X.7QI r4 = r14.A05
            X.JtY r0 = r4.BGx()
            long r2 = r0.A02
            java.lang.Integer r0 = r8.A02
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x00f0
            r0 = 2
            if (r1 == r0) goto L_0x00e7
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x0076:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r18)
            X.9Ij r7 = new X.9Ij
            r7.<init>((X.AnonymousClass7QO) r8, (X.AnonymousClass7QM) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (java.lang.Integer) r12, (java.lang.Integer) r13)
            r14.A00 = r7
            X.JwJ r7 = A00(r14, r7)
            if (r7 == 0) goto L_0x0145
            java.lang.Object r6 = r7.A00
            X.Jtx r6 = (X.C60939Jtx) r6
            if (r6 == 0) goto L_0x0145
            X.9Ij r5 = r14.A00
            java.lang.String r10 = r6.A04
            int r1 = r0.intValue()
            switch(r1) {
                case 0: goto L_0x00e4;
                case 1: goto L_0x00e1;
                default: goto L_0x00a0;
            }
        L_0x00a0:
            java.lang.String r3 = "STOP_CURRENT_AND_REMOVE_ALL_AND_APPEND_TO_BACK"
        L_0x00a2:
            long r1 = r6.A00
            X.7QP r9 = X.AnonymousClass7QN.A00(r5, r10, r3, r1)
            X.7QP r8 = r14.A03
            r14.A03 = r9
            java.util.UUID r1 = X.AnonymousClass0HM.A00()
            java.lang.String r11 = r1.toString()
            X.0qQ.A07(r11)
            java.lang.String r12 = r7.A01
            X.Jw0 r7 = new X.Jw0
            r7.<init>((X.AnonymousClass7QP) r8, (X.AnonymousClass7QP) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12)
            android.util.LruCache r1 = r14.A04
            r1.put(r11, r7)
            java.lang.String r5 = r6.A04
            java.lang.String r3 = r6.A03
            java.lang.String r2 = r6.A02
            X.VUu r1 = new X.VUu
            r1.<init>(r5, r3, r2)
            r4.ABi(r1, r0, r11)
            java.util.Set r0 = r14.A06
            java.util.Iterator r1 = r0.iterator()
        L_0x00d7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x016a
            r1.next()
            goto L_0x00d7
        L_0x00e1:
            java.lang.String r3 = "CONTINUE_CURRENT_AND_REMOVE_QUEUED_AND_APPEND_TO_BACK"
            goto L_0x00a2
        L_0x00e4:
            java.lang.String r3 = "APPEND_TO_BACK"
            goto L_0x00a2
        L_0x00e7:
            long r0 = r8.A01
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 < 0) goto L_0x00f0
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0076
        L_0x00f0:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0076
        L_0x00f3:
            r11 = r5
            goto L_0x0060
        L_0x00f6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Error: Transition for Trigger : "
            r4.append(r0)
            java.lang.String r0 = r15.name()
            r4.append(r0)
            java.lang.String r0 = ", State : "
            r4.append(r0)
            java.lang.String r0 = X.AnonymousClass7QN.A04(r1)
            r4.append(r0)
            java.lang.String r0 = ", Bot Action : "
            r4.append(r0)
            java.lang.String r0 = X.AnonymousClass7QN.A01(r11)
            r4.append(r0)
            java.lang.String r0 = ", Sentiment : "
            r4.append(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r0 = X.AnonymousClass7QN.A03(r0)
            r4.append(r0)
            java.lang.String r0 = ", Intensity : "
            r4.append(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            java.lang.String r0 = X.AnonymousClass7QN.A02(r0)
            r4.append(r0)
            java.lang.String r0 = " doesn't exist"
            r4.append(r0)
            goto L_0x0163
        L_0x0145:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Video doesn't exist! "
            r4.append(r1)
            X.9Ij r3 = r14.A00
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x016e;
                case 1: goto L_0x016b;
                default: goto L_0x0158;
            }
        L_0x0158:
            java.lang.String r2 = "STOP_CURRENT_AND_REMOVE_ALL_AND_APPEND_TO_BACK"
        L_0x015a:
            r0 = 0
            X.7QP r0 = X.AnonymousClass7QN.A00(r3, r5, r2, r0)
            r4.append(r0)
        L_0x0163:
            java.lang.String r0 = r4.toString()
            r14.A01(r0)
        L_0x016a:
            return
        L_0x016b:
            java.lang.String r2 = "CONTINUE_CURRENT_AND_REMOVE_QUEUED_AND_APPEND_TO_BACK"
            goto L_0x015a
        L_0x016e:
            java.lang.String r2 = "APPEND_TO_BACK"
            goto L_0x015a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7QL.A04(X.7QM, java.lang.Integer, int, int):void");
    }

    public AnonymousClass7QL(AnonymousClass7QI r9) {
        this.A05 = r9;
        ((AnonymousClass7QH) r9).A00 = this;
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        0qQ.A07(newSetFromMap);
        this.A06 = newSetFromMap;
        C376539Ij r2 = new C376539Ij((Integer) null, (Integer) null, (Integer) null, (Integer) null, 63);
        this.A00 = r2;
        this.A03 = AnonymousClass7QN.A00(r2, (String) null, (String) null, 0);
        this.A04 = new LruCache(20);
    }
}
