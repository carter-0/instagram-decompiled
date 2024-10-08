package X;

import android.content.Context;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.7kd  reason: invalid class name and case insensitive filesystem */
public final class C340057kd {
    public A7M A00;
    public AnonymousClass3LT A01;
    public final C340067ke A02;
    public final 0lg A03;

    public C340057kd(0lg r37) {
        0lg r0 = r37;
        this.A03 = r0;
        C340067ke r11 = new C340067ke(r0);
        this.A02 = r11;
        Context context = (Context) AnonymousClass3GM.A00.get();
        if (AnonymousClass3GL.A02(r0) && context != null) {
            Context applicationContext = context.getApplicationContext();
            0qQ.A0B(applicationContext, 0);
            0qQ.A0B(r0, 1);
            0sn r17 = 0sn.A00;
            int i = 40;
            int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout();
            long scaledDoubleTapSlop = (long) ViewConfiguration.get(applicationContext).getScaledDoubleTapSlop();
            long j = scaledDoubleTapSlop * scaledDoubleTapSlop;
            0Yt.A0E();
            0Yt.A0E();
            0Tu r1 = 0Tu.A05;
            boolean A06 = 182.A06(r1, r0, 2342154655602967223L);
            boolean A062 = 182.A06(r1, r0, 2342154655599428239L);
            String A04 = 182.A04(r1, r0, 36874596342759470L);
            Pattern pattern = 0mp.A00;
            String[] strArr = (String[]) new 11S(",").A03(A04).toArray(new String[0]);
            List A1P = 0sr.A1P(Arrays.copyOf(strArr, strArr.length));
            boolean A063 = 182.A06(r1, r0, 2342154655600018069L);
            boolean A064 = 182.A06(r1, r0, 36311646385930898L);
            String A042 = 182.A04(r1, r0, 36874596339548203L);
            0Nb r8 = 0Nb.A00;
            0sm A08 = 0mp.A08(A042, r8);
            A08 = A08 == null ? 0Yt.A0E() : A08;
            0qQ.A0B(A08, 0);
            0sm A082 = 0mp.A08(182.A04(r1, r0, 36874596339810348L), r8);
            A082 = A082 == null ? 0Yt.A0E() : A082;
            0qQ.A0B(A082, 0);
            boolean A065 = 182.A06(r1, r0, 36311646387045023L);
            boolean A066 = 182.A06(r1, r0, 36311646388486832L);
            String[] strArr2 = (String[]) new 11S(",").A03(182.A04(r1, r0, 36874596341841965L)).toArray(new String[0]);
            List A1P2 = 0sr.A1P(Arrays.copyOf(strArr2, strArr2.length));
            boolean A067 = 182.A06(r1, r0, 36311646389666489L);
            String[] strArr3 = (String[]) new 11S(",").A03(182.A04(r1, r0, 36874596343152687L)).toArray(new String[0]);
            List A1P3 = 0sr.A1P(Arrays.copyOf(strArr3, strArr3.length));
            boolean A068 = 182.A06(r1, r0, 2342154655603622588L);
            boolean A069 = 182.A06(r1, r0, 36311646390059710L);
            long A012 = 182.A01(r1, r0, 36593121364476878L);
            i = A012 > 0 ? (int) A012 : i;
            long A013 = 182.A01(r1, r0, 36593121362904012L);
            A7M a7m = new A7M(new XnF(182.A00(r1, r0, 37156071315472402L), 182.A01(r1, r0, 36593121362248651L), 182.A06(r1, r0, 36311646385209993L), 182.A06(r1, r0, 36311646385406603L), 182.A06(r1, r0, 36311646389797562L)), new C39664A4e(182.A06(r1, r0, 36311646388552369L), 182.A01(r1, r0, 36593121365853139L)), new A8A(r17, A1P, A1P2, A1P3, A08, A082, A013 > 0 ? (int) A013 : doubleTapTimeout, i, j, A06, A064, A065, A062, A068, A063, A066, A067, A069), 182.A06(r1, r0, 36311646389994173L), 182.A06(r1, r0, 36311646389863099L), 182.A06(r1, r0, 36315602050092453L));
            this.A00 = a7m;
            this.A01 = new AnonymousClass3LT(applicationContext, a7m, this, r11, r0);
        }
    }

    public static C340057kd A00(0lg r2) {
        return (C340057kd) r2.A01(C340057kd.class, new AnonymousClass9OR(r2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01c9, code lost:
        if (r1 == null) goto L_0x01cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.A7L r21) {
        /*
            r20 = this;
            r0 = r20
            X.3LT r3 = r0.A01
            if (r3 == 0) goto L_0x01bb
            X.A7M r0 = r0.A00
            if (r0 == 0) goto L_0x01bb
            X.A8A r0 = r0.A02
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x01bb
            X.5qA r13 = r3.A02
            if (r13 == 0) goto L_0x01bb
            X.7ke r2 = r3.A0B
            X.7kh r12 = r2.A03
            X.0eK r0 = r2.A05
            r0.get()
            X.A7M r0 = r3.A08
            X.A8A r0 = r0.A02
            X.A4d r1 = X.C392379ui.A00(r13, r0)
            X.7kf r0 = r2.A01
            X.5qL r11 = r0.A00()
            java.lang.Boolean r10 = r3.A04
            r19 = 0
            X.7kg r3 = r12.A00
            boolean r2 = r13.A02
            if (r11 == 0) goto L_0x01d9
            java.lang.String r0 = r11.A01
        L_0x0037:
            X.0wc r3 = X.C340087kg.A00(r3, r0, r2)
            if (r3 == 0) goto L_0x01bb
            java.lang.String r2 = "gnv_gesture_with_mutation"
            X.0kJ r0 = r3.A00
            X.0Aj r2 = r3.A00(r0, r2)
            r0 = 163(0xa3, float:2.28E-43)
            X.1Ln r9 = new X.1Ln
            r9.<init>(r2, r0)
            X.0Aj r0 = r9.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x01bb
            X.57r r2 = r13.A00
            r17 = 0
            if (r2 == 0) goto L_0x01d0
            long r17 = r2.BEV()
            long r14 = r2.BZx()
            if (r10 != 0) goto L_0x0068
            java.lang.Boolean r10 = r2.CWF()
        L_0x0068:
            java.lang.Boolean r16 = r2.CbB()
            boolean r0 = r2.AkU()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r2.Ak4()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r2.Ake()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
        L_0x0084:
            if (r1 == 0) goto L_0x01c7
            java.lang.String r5 = r1.A01
            X.5qF r0 = r1.A00
            if (r0 == 0) goto L_0x01c8
            java.lang.Boolean r4 = r0.A05
        L_0x008e:
            X.5qF r0 = r1.A00
            if (r0 == 0) goto L_0x01cd
            java.lang.Boolean r3 = r0.A06
        L_0x0094:
            java.util.List r0 = r13.A0G
            java.util.ArrayList r1 = X.C52314GNg.A01(r0)
            java.lang.String r0 = "gesture_tracking_nodes"
            r9.A0S(r0, r1)
            java.util.List r0 = r13.A0F
            java.util.ArrayList r1 = X.C52314GNg.A00(r0)
            java.lang.String r0 = "gesture_tracking_models"
            r9.A0S(r0, r1)
            java.util.ArrayList r1 = r13.A00()
            java.lang.String r0 = "gesture_class_names"
            r9.A0S(r0, r1)
            boolean r0 = r13.A02
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "gesture_is_ad"
            r9.A0O(r0, r1)
            if (r11 == 0) goto L_0x01c4
            java.lang.String r2 = r11.A01
        L_0x00c2:
            java.lang.String r0 = ""
            if (r2 != 0) goto L_0x00c7
            r2 = r0
        L_0x00c7:
            java.lang.String r1 = "gesture_module"
            r9.A0R(r1, r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r17)
            java.lang.String r1 = "gesture_content_id"
            r9.A0Q(r1, r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r14)
            java.lang.String r1 = "gesture_content_owner_id"
            r9.A0Q(r1, r2)
            X.5q9 r2 = r13.A0B
            java.lang.String r1 = "gesture_type"
            r9.A0M(r2, r1)
            r14 = r21
            java.lang.Integer r1 = r14.A03
            int r1 = r1.intValue()
            switch(r1) {
                case 0: goto L_0x01bc;
                case 1: goto L_0x01c0;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            java.lang.String r2 = "comment_send"
        L_0x00f2:
            r1 = 974(0x3ce, float:1.365E-42)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r9.A0R(r1, r2)
            long r1 = r14.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "mutation_content_id"
            r9.A0Q(r1, r2)
            long r1 = r14.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "mutation_content_owner_id"
            r9.A0Q(r1, r2)
            X.5qL r2 = r14.A02
            java.lang.String r1 = r2.A01
            java.lang.String r15 = "mutation_module"
            r9.A0R(r15, r1)
            boolean r1 = r14.A05
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r15 = "mutation_is_set"
            r9.A0O(r15, r1)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r19)
            java.lang.String r1 = "mutation_is_failed"
            r9.A0O(r1, r15)
            java.lang.String r1 = "mutation_fail_is_spam"
            r9.A0O(r1, r15)
            if (r11 == 0) goto L_0x0137
            java.lang.String r0 = r11.A00
        L_0x0137:
            java.lang.String r1 = "gesture_module_class"
            r9.A0R(r1, r0)
            java.lang.String r0 = "gesture_clicked_target_description"
            r9.A0R(r0, r5)
            java.lang.String r0 = "gesture_clicked_target_is_enabled"
            r9.A0O(r0, r4)
            java.lang.String r0 = "gesture_clicked_target_is_selected"
            r9.A0O(r0, r3)
            java.lang.String r0 = "gesture_content_is_liked"
            r9.A0O(r0, r10)
            java.lang.String r1 = "gesture_content_is_saved"
            r0 = r16
            r9.A0O(r1, r0)
            java.lang.String r0 = "gesture_content_can_save"
            r9.A0O(r0, r8)
            java.lang.String r0 = "gesture_content_can_comment"
            r9.A0O(r0, r7)
            java.lang.String r0 = "gesture_content_can_share"
            r9.A0O(r0, r6)
            long r0 = r13.A07
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "gesture_timestamp"
            r9.A0Q(r0, r1)
            long r0 = r13.A06
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "gesture_duration"
            r9.A0Q(r0, r1)
            float r0 = r13.A03
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "gesture_coordinate_x"
            r9.A0P(r0, r1)
            float r0 = r13.A04
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "gesture_coordinate_y"
            r9.A0P(r0, r1)
            java.lang.Long r1 = r13.A01
            java.lang.String r0 = "gesture_tap_index"
            r9.A0Q(r0, r1)
            java.lang.String r1 = r2.A00
            java.lang.String r0 = "mutation_module_class"
            r9.A0R(r0, r1)
            java.lang.String r1 = r14.A04
            java.lang.String r0 = "mutation_source"
            r9.A0R(r0, r1)
            boolean r0 = r12.A02
            if (r0 != 0) goto L_0x01b8
            X.0eK r0 = r12.A01
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r9.A0u(r0)
        L_0x01b8:
            r9.Cgf()
        L_0x01bb:
            return
        L_0x01bc:
            java.lang.String r2 = "like"
            goto L_0x00f2
        L_0x01c0:
            java.lang.String r2 = "save"
            goto L_0x00f2
        L_0x01c4:
            r2 = 0
            goto L_0x00c2
        L_0x01c7:
            r5 = 0
        L_0x01c8:
            r4 = 0
            if (r1 == 0) goto L_0x01cd
            goto L_0x008e
        L_0x01cd:
            r3 = 0
            goto L_0x0094
        L_0x01d0:
            r14 = 0
            r6 = 0
            r16 = 0
            r8 = 0
            r7 = 0
            goto L_0x0084
        L_0x01d9:
            r0 = 0
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340057kd.A01(X.A7L):void");
    }

    public final void A02(C238833Dp r4) {
        AnonymousClass3LT r2 = this.A01;
        if (r2 != null) {
            r4.A05 = new WeakReference(r2);
            AnonymousClass3GX.A00(r4.A08).A05 = new WeakReference(r2);
        }
    }

    public final void A03(C238833Dp r3) {
        AnonymousClass3LT r1 = this.A01;
        if (r1 != null) {
            r1.A03 = r3;
            r3.A04 = new WeakReference(r1);
        }
        this.A02.A02.A00 = r3;
    }

    public final void A04(1Xj r9, Integer num) {
        A7M a7m;
        String str;
        int i;
        AnonymousClass3LT r2 = this.A01;
        if (r2 != null && (a7m = this.A00) != null && a7m.A02.A05) {
            0lg r1 = this.A03;
            0qQ.A0B(r9, 0);
            C297075r8 r4 = new C297075r8(r1, r9);
            C296505qA r6 = r2.A02;
            if (r6 != null) {
                C340067ke r12 = r2.A0B;
                C340097kh r22 = r12.A03;
                switch (num.intValue()) {
                    case 0:
                        i = 3914;
                        break;
                    case 1:
                        i = 3916;
                        break;
                    case 2:
                        str = "adhoc_peek_media";
                        break;
                    default:
                        str = "comment_send_via_ime";
                        break;
                }
                str = AnonymousClass000.A00(i);
                r22.A00(r12.A01.A00(), r4, new C39663A4d((C296545qF) null, str), r6, (Boolean) null);
            }
        }
    }
}
